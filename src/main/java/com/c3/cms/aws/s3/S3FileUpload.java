package com.c3.cms.aws.s3;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.math.BigInteger;
import java.security.SecureRandom;

import com.amazonaws.auth.BasicAWSCredentials;
import com.amazonaws.services.s3.AmazonS3;
import com.amazonaws.services.s3.AmazonS3Client;
import com.amazonaws.services.s3.model.AccessControlList;
import com.amazonaws.services.s3.model.GroupGrantee;
import com.amazonaws.services.s3.model.ObjectMetadata;
import com.amazonaws.services.s3.model.Permission;
import com.amazonaws.services.s3.model.PutObjectRequest;

public class S3FileUpload {

	public static String uploadImage(InputStream is) throws IOException,
			FileNotFoundException {

		String bucket = "ps-form-generator";

		InputStream fIn = null;
		String convertedFileName = getRandomNumber() + ".png";
		ByteArrayOutputStream baos = null;
		long streamLength = 0;

		fIn = is;
		baos = new ByteArrayOutputStream();

		byte[] buf = new byte[1024];
		int len;

		while ((len = fIn.read(buf)) > 0) {
			streamLength = streamLength + len;
			baos.write(buf, 0, len);
		}

		baos.flush();

		uploadFileToAmazonS3(new ByteArrayInputStream(baos.toByteArray()),
				bucket, streamLength, convertedFileName);

		fIn.close();
		baos.close();

		return convertedFileName;
	}

	private static void uploadFileToAmazonS3(InputStream file, String bucket,
			long length, String fileName) {

		AmazonS3 s3Client = new AmazonS3Client(AWSS3Credentials.getAWSCredentials());

		ObjectMetadata om = new ObjectMetadata();
		om.setContentLength(length);

		PutObjectRequest putObjectRequest = new PutObjectRequest(bucket,
				fileName, file, om);

		AccessControlList acl = new AccessControlList();
		acl.grantPermission(GroupGrantee.AuthenticatedUsers, Permission.Read);
		putObjectRequest.setAccessControlList(acl);

		s3Client.putObject(putObjectRequest);
	}

	private static String getRandomNumber() {
		SecureRandom random = new SecureRandom();
		return new BigInteger(130, random).toString(32);
	}
}

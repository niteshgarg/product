package com.c3.cms.aws.s3;

import java.io.IOException;
import java.io.InputStream;

import com.amazonaws.services.s3.AmazonS3;
import com.amazonaws.services.s3.AmazonS3Client;
import com.amazonaws.services.s3.model.GetObjectRequest;
import com.amazonaws.services.s3.model.S3Object;

public class S3FileGet {

	public static InputStream getFile(String bucketName, String filename)
			throws IOException {
		AmazonS3 s3Client = new AmazonS3Client(
				AWSS3Credentials.getAWSCredentials());
		S3Object object = s3Client.getObject(new GetObjectRequest(bucketName,
				filename));
		InputStream objectData = object.getObjectContent();
		// Process the objectData stream.
		return objectData;
	}

}

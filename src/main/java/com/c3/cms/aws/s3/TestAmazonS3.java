package com.c3.cms.aws.s3;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

import com.amazonaws.auth.BasicAWSCredentials;
import com.amazonaws.services.s3.AmazonS3Client;
import com.amazonaws.services.s3.model.AccessControlList;
import com.amazonaws.services.s3.model.GroupGrantee;
import com.amazonaws.services.s3.model.ObjectMetadata;
import com.amazonaws.services.s3.model.Permission;
import com.amazonaws.services.s3.model.PutObjectRequest;

public class TestAmazonS3 {

	static String Access_Key_ID = "AKIAJV4WZJRGJGZABRNQ";
	static String Secret_Access_Key = "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";
			
	static String bucket_name = "genzo-notes";

	public static void main(String s[]) {
		uploadImage();
	}

	public static void uploadImage() {
		try {
			BasicAWSCredentials awsCreds = new BasicAWSCredentials(
					Access_Key_ID, Secret_Access_Key);
			/*File file = new File(
					"D:\\Personal\\Projects\\ANPRLibrary_Demo_V1_Android_new\\ANPRSample\\res\\drawable-hdpi\\car8.png");
		
			AmazonS3 s3Client = new AmazonS3Client(awsCreds);

			InputStream fis = new FileInputStream(file);
			byte[] buf = new byte[1024];
			int len;
			long streamLength = 0;

			while ((len = fis.read(buf)) > 0) {
				// fOut.write(buf, 0, len);
				streamLength = streamLength + len;
			}
			fis.close();
			fis = new FileInputStream(file);
			
			ObjectMetadata om = new ObjectMetadata();
			om.setContentLength(streamLength);
			PutObjectRequest putObjectRequest = new PutObjectRequest(
					bucket_name, "image15.png", fis, om);
			AccessControlList acl = new AccessControlList();
			acl.grantPermission(GroupGrantee.AllUsers, Permission.Read);
			putObjectRequest.setAccessControlList(acl);
			s3Client.putObject(putObjectRequest);*/
			
			
AmazonS3Client s3Client = new AmazonS3Client(awsCreds);
File file = new File(
		"D:\\Personal\\Projects\\ANPRLibrary_Demo_V1_Android_new\\ANPRSample\\res\\drawable-hdpi\\car8.png");
InputStream fis = new FileInputStream(file);
byte[] buf = new byte[1024];
int len;
long streamLength = 0;

while ((len = fis.read(buf)) > 0) {
	// fOut.write(buf, 0, len);
	streamLength = streamLength + len;
}
fis.close();
fis = new FileInputStream(file);

ObjectMetadata om = new ObjectMetadata();
om.setContentLength(streamLength);
PutObjectRequest putObjectRequest = new PutObjectRequest(
		bucket_name, "image15.png", fis, om);
AccessControlList acl = new AccessControlList();
acl.grantPermission(GroupGrantee.AllUsers, Permission.Read);
putObjectRequest.setAccessControlList(acl);
s3Client.putObject(putObjectRequest);

// Test. For example, get object keys for a given bucket. 



		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}

package com.c3.cms.main;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

import com.amazonaws.services.sqs.model.Message;
import com.amazonaws.services.sqs.model.ReceiveMessageResult;
import com.c3.cms.aws.s3.S3FileGet;
import com.c3.cms.aws.s3.S3FileUpload;
import com.c3.cms.aws.sqs.DeleteMessage;
import com.c3.cms.aws.sqs.ReceiveMessage;
import com.c3.cms.aws.sqs.SendMessage;

public class Main {

	public static void main(String[] a) {

		/*
		 * String accessKey = "AKIAJHDYYZRHXNQ25UFQ";
		 * 
		 * String secretKey = "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";
		 * 
		 * BasicAWSCredentials awsCreds = new BasicAWSCredentials(accessKey,
		 * secretKey);
		 * 
		 * // Create the basic Amazon SQS async client AmazonSQSAsync sqsAsync =
		 * new AmazonSQSAsyncClient(awsCreds);
		 * 
		 * // Create the buffered client AmazonSQSAsync bufferedSqs = new
		 * AmazonSQSBufferedAsyncClient(sqsAsync);
		 * 
		 * CreateQueueRequest createRequest = new
		 * CreateQueueRequest().withQueueName("ps-queue");
		 * 
		 * CreateQueueResult res = bufferedSqs.createQueue(createRequest);
		 * 
		 * SendMessageRequest request = new SendMessageRequest(); String body =
		 * "New message After redifining" + System.currentTimeMillis();
		 * request.setMessageBody( body );
		 * request.setQueueUrl(res.getQueueUrl());
		 * 
		 * SendMessageResult sendResult = bufferedSqs.sendMessage(request);
		 * 
		 * System.out.println("sendResult = "+sendResult.toString());
		 * 
		 * 
		 * ReceiveMessageRequest receiveRq = new ReceiveMessageRequest()
		 * .withMaxNumberOfMessages(4) .withQueueUrl(res.getQueueUrl());
		 * ReceiveMessageResult rx = bufferedSqs.receiveMessage(receiveRq);
		 * 
		 * for (Message msg : rx.getMessages()) {
		 * System.out.println("recieveResult = "+msg.getBody());
		 * 
		 * 
		 * DeleteMessageRequest dx = new
		 * DeleteMessageRequest().withQueueUrl(res.
		 * getQueueUrl()).withReceiptHandle(msg.getReceiptHandle());
		 * bufferedSqs.deleteMessage(dx);
		 * 
		 * }
		 */

		//testS3Upload();
		//testS3FileGet();
		testQueue();
	}

	private static void testS3Upload() {

		InputStream is;

		try {
			is = new FileInputStream(
					"D:\\Personal\\Projects\\ANPRLibrary_Demo_V1_Android_new\\ANPRSample\\res\\drawable-hdpi\\car8.png");
			S3FileUpload.uploadImage(is);

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	private static void testS3FileGet() {

		OutputStream outputStream = null;
		InputStream inputStream = null;

		try {
			inputStream = S3FileGet.getFile("ps-form-generator",
					"kbp21of1hf7j2aml49nvbm9aq8.png");

			outputStream = new FileOutputStream(new File(
					"D:\\adbc.png"));

			int read = 0;
			byte[] bytes = new byte[1024];

			while ((read = inputStream.read(bytes)) != -1) {
				outputStream.write(bytes, 0, read);
			}

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			if (inputStream != null) {
				try {
					inputStream.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			if (outputStream != null) {
				try {
					// outputStream.flush();
					outputStream.close();
				} catch (IOException e) {
					e.printStackTrace();
				}

			}
		}

	}

	private static void testQueue() {
		// Send a new message
		//SendMessage.sendMessage("ps-queue", "Form-generator Message 1");
		//SendMessage.sendMessage("ps-queue", "Form-generator Message 2");
		//SendMessage.sendMessage("ps-queue", "Form-generator Message 3");
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		ReceiveMessageResult rx = ReceiveMessage.receiveMessage("ps-queue");

		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		for (Message msg : rx.getMessages()) {
			System.out.println("recieveResult = " + msg.getBody());

			DeleteMessage.deleteMessage(msg.getReceiptHandle(), "ps-queue");

		}
	}

}

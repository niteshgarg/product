package com.c3.cms.aws.sqs;

import com.amazonaws.services.sqs.AmazonSQSAsync;
import com.amazonaws.services.sqs.AmazonSQSAsyncClient;
import com.amazonaws.services.sqs.buffered.AmazonSQSBufferedAsyncClient;
import com.amazonaws.services.sqs.model.CreateQueueRequest;
import com.amazonaws.services.sqs.model.CreateQueueResult;
import com.amazonaws.services.sqs.model.DeleteMessageRequest;

public class DeleteMessage {

	public static void deleteMessage(String receiptHandler, String queueName) {
		// Create the basic Amazon SQS async client
		AmazonSQSAsync sqsAsync = new AmazonSQSAsyncClient(
				AWSSQSCredentials.getAWSCredentials());

		// Create the buffered client
		AmazonSQSAsync bufferedSqs = new AmazonSQSBufferedAsyncClient(sqsAsync);

		CreateQueueRequest createRequest = new CreateQueueRequest()
				.withQueueName(queueName);

		CreateQueueResult res = bufferedSqs.createQueue(createRequest);

		DeleteMessageRequest dx = new DeleteMessageRequest().withQueueUrl(
				res.getQueueUrl()).withReceiptHandle(receiptHandler);
		bufferedSqs.deleteMessage(dx);
	}

}

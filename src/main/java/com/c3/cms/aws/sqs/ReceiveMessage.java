package com.c3.cms.aws.sqs;

import com.amazonaws.services.sqs.AmazonSQSAsync;
import com.amazonaws.services.sqs.AmazonSQSAsyncClient;
import com.amazonaws.services.sqs.buffered.AmazonSQSBufferedAsyncClient;
import com.amazonaws.services.sqs.model.CreateQueueRequest;
import com.amazonaws.services.sqs.model.CreateQueueResult;
import com.amazonaws.services.sqs.model.ReceiveMessageRequest;
import com.amazonaws.services.sqs.model.ReceiveMessageResult;

public class ReceiveMessage {

	public static ReceiveMessageResult receiveMessage(String queueName) {
		// Create the basic Amazon SQS async client
		AmazonSQSAsync sqsAsync = new AmazonSQSAsyncClient(
				AWSSQSCredentials.getAWSCredentials());

		// Create the buffered client
		AmazonSQSAsync bufferedSqs = new AmazonSQSBufferedAsyncClient(sqsAsync);

		CreateQueueRequest createRequest = new CreateQueueRequest()
				.withQueueName(queueName);

		CreateQueueResult res = bufferedSqs.createQueue(createRequest);
		ReceiveMessageRequest receiveRq = new ReceiveMessageRequest()
				.withMaxNumberOfMessages(4).withQueueUrl(res.getQueueUrl());
		ReceiveMessageResult rx = bufferedSqs.receiveMessage(receiveRq);
		return rx;
	}

}

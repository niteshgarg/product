package com.c3.cms.aws.sqs;

import com.amazonaws.services.sqs.AmazonSQSAsync;
import com.amazonaws.services.sqs.AmazonSQSAsyncClient;
import com.amazonaws.services.sqs.buffered.AmazonSQSBufferedAsyncClient;
import com.amazonaws.services.sqs.model.CreateQueueRequest;
import com.amazonaws.services.sqs.model.CreateQueueResult;
import com.amazonaws.services.sqs.model.SendMessageRequest;
import com.amazonaws.services.sqs.model.SendMessageResult;

public class SendMessage {

	public static SendMessageResult sendMessage(String queueName, String body) {

		AmazonSQSAsync sqsAsync = new AmazonSQSAsyncClient(
				AWSSQSCredentials.getAWSCredentials());

		// Create the buffered client
		AmazonSQSAsync bufferedSqs = new AmazonSQSBufferedAsyncClient(sqsAsync);

		CreateQueueRequest createRequest = new CreateQueueRequest()
				.withQueueName(queueName);

		CreateQueueResult res = bufferedSqs.createQueue(createRequest);

		SendMessageRequest request = new SendMessageRequest();

		request.setMessageBody(body);
		request.setQueueUrl(res.getQueueUrl());

		SendMessageResult sendResult = bufferedSqs.sendMessage(request);

		return sendResult;
	}

}

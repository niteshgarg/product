package com.c3.cms.aws.sqs;

import com.amazonaws.auth.BasicAWSCredentials;

public class AWSSQSCredentials {

	private final static String accessKey = "AKIAJHDYYZRHXNQ25UFQ";

	private final static String secretKey = "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";

	protected static BasicAWSCredentials getAWSCredentials() {
		return new BasicAWSCredentials(accessKey, secretKey);
	}

}

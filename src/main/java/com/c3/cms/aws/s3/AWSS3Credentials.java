package com.c3.cms.aws.s3;

import com.amazonaws.auth.BasicAWSCredentials;

public class AWSS3Credentials {

	private final static String accessKey = "AKIAI424TXJK6XQMCYCA";

	private final static String secretKey = "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";

	protected static BasicAWSCredentials getAWSCredentials() {
		return new BasicAWSCredentials(accessKey, secretKey);
	}

}

package com.example.poc.camel;

import org.apache.camel.builder.RouteBuilder;
import org.springframework.stereotype.Component;

@Component
public class CamelProducer extends RouteBuilder {

	@Override
	public void configure() throws Exception {

		// timer
		//from("timer:active-mq-timer?period=10000")
		from("aws-s3://arn:aws:s3:::336583-camel-bucket?prefix=file.txt")
		//.transform().constant("My message for Gourishankar through Amazon SQS")
		.transform().body(String.class)
		.log("${body}")
		.to("aws-sqs://arn:aws:sqs:us-east-2:399531338150:myQueue");
		

	}
}
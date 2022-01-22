package com.springboot.batch;

import org.springframework.batch.core.JobExecution;
import org.springframework.batch.core.JobExecutionListener;

public class MyJobListener implements JobExecutionListener {

	@Override
	public void beforeJob(JobExecution jobExecution) {
		System.out.println("before job started " + jobExecution.getStatus().toString());
		
	}

	@Override
	public void afterJob(JobExecution jobExecution) {
		System.out.println("Job Ended " + jobExecution.getStatus().toString());
	}

}

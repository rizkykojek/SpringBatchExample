package com.mkyong.listener;

import java.util.Collection;
import java.util.List;

import org.springframework.batch.core.BatchStatus;
import org.springframework.batch.core.JobExecution;
import org.springframework.batch.core.JobExecutionListener;
import org.springframework.batch.core.StepExecution;

public class ReportJobListener implements JobExecutionListener {

	@Override
	public void beforeJob(JobExecution jobExecution) {
		// called when job starts

	}

	@Override
	public void afterJob(JobExecution jobExecution) {
		if(jobExecution.getStatus() == BatchStatus.COMPLETED){
			System.out.println("LISTENER executed with status = Jobs succesfully");
		} else if(jobExecution.getStatus() == BatchStatus.FAILED){
			System.out.println("LISTENER executed with status = Jobs Failed");
			Collection<StepExecution> executions = jobExecution.getStepExecutions();
			for (StepExecution stepExecution : executions) {
				System.out.println("status " + stepExecution.getStatus());
				System.out.println("row " + stepExecution.getExitStatus().getExitDescription());
			}
		}

	}

}

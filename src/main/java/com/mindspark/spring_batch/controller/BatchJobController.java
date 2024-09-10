package com.mindspark.spring_batch.controller;

import org.springframework.batch.core.Job;
import org.springframework.batch.core.JobParameters;
import org.springframework.batch.core.JobParametersBuilder;
import org.springframework.batch.core.launch.JobLauncher;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BatchJobController {

        @Autowired
        JobLauncher jobLauncher;

        @Autowired
        Job importCustomerJob;

        @GetMapping("/run-batch-job")
        public String runBatchJob() {
            try {
                JobParameters jobParameters = new JobParametersBuilder()
                        .addLong("startAt", System.currentTimeMillis())
                        .toJobParameters();
                jobLauncher.run(importCustomerJob, jobParameters);
                return "Batch job has been invoked";

            } catch (Exception e) {
                e.printStackTrace();
                return "Job failed!";
            }
        }
}

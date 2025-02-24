package com.karan.bean;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component(value = "jb")
public class Job {
    @Value("J1")
    private String jobid;
    @Value("Manager")
    private String jobnm;
    @Value("TCS")
    private String companynm;

    public Job() {
        super();
        // TODO Auto-generated constructor stub
    }

    public Job(String jobid, String jobnm, String companynm) {
        super();
        this.jobid = jobid;
        this.jobnm = jobnm;
        this.companynm = companynm;
    }

    public String getJobid() {
        return jobid;
    }

    public void setJobid(String jobid) {
        this.jobid = jobid;
    }

    public String getJobnm() {
        return jobnm;
    }

    public void setJobnm(String jobnm) {
        this.jobnm = jobnm;
    }

    public String getCompanynm() {
        return companynm;
    }

    public void setCompanynm(String companynm) {
        this.companynm = companynm;
    }

    @Override
    public String toString() {
        return "Job [jobid=" + jobid + ", jobnm=" + jobnm + ", companynm=" + companynm + "]";
    }

}

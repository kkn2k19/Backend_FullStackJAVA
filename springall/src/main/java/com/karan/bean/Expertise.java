package com.karan.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component(value = "ex")
public class Expertise {
    @Value("Spring")
    private String technology;
    @Value(value = "2")
    private Integer yrsofexp;
    @Autowired
    private Job job;

    public Expertise() {
        super();
        // TODO Auto-generated constructor stub
    }

    public Expertise(String technology, Integer yrsofexp, Job job) {
        super();
        this.technology = technology;
        this.yrsofexp = yrsofexp;
        this.job = job;
    }

    public String getTechnology() {
        return technology;
    }

    public void setTechnology(String technology) {
        this.technology = technology;
    }

    public Integer getYrsofexp() {
        return yrsofexp;
    }

    public void setYrsofexp(Integer yrsofexp) {
        this.yrsofexp = yrsofexp;
    }

    public Job getJob() {
        return job;
    }

    public void setJob(Job job) {
        this.job = job;
    }

    @Override
    public String toString() {
        return "Expertise [technology=" + technology + ", yrsofexp=" + yrsofexp + ", job=" + job + "]";
    }

}

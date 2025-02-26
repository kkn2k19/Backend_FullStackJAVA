package com.karan.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.karan.model.Job;
import com.karan.repository.JobRepository;

@Service
public class JobService {
    @Autowired
    private JobRepository jrepo;

    public void addData(Job j) {
        jrepo.save(j);
    }

    public List<Job> getData() {
        return jrepo.findAll();
    }

    public Job getDataById(String jobid) {
        return jrepo.findById(jobid).orElse(null);
    }

    public void deleteData(String jobid) {
        Job j = jrepo.findById(jobid).orElse(null);
        if (j != null) {
            jrepo.delete(j);
        }
    }

    public Job updateData(String jobid) {
        Job j = jrepo.findById(jobid).orElse(null);
        if (j != null) {
            j.setJobnm("SPRINGBOOT");
            j.setCompnm("CAPGEMINI");
            jrepo.save(j);
        }
        return j;
    }
}

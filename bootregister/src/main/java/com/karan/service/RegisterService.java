package com.karan.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.karan.model.Register;
import com.karan.repository.RegisterRepository;

@Service
public class RegisterService {
    @Autowired
    private RegisterRepository rrepo;

    // ADD DATA
    public void addData(Register r) {
        rrepo.save(r);
    }

    // GET DATA
    public List<Register> getData() {
        return rrepo.findAll();
    }

    // GET DATA BY ID
    public Register getDataById(String uname) {
        return rrepo.findById(uname).orElse(null);
    }

    // DELETE DATA
    public void deleteData(String uname) {
        Register r = rrepo.findById(uname).orElse(null);
        if (r != null) {
            rrepo.delete(r);
        }
    }

    // UPDATE DATA
    public Register updateData(String uname) {
        Register r = rrepo.findById(uname).orElse(null);
        if (r != null) {
            r.setPass("2001");
            r.setNm("Chandan");
            r.setEmail("kkn2k19@gmail.com");
            r.setPhno("789789");
            rrepo.save(r);
        }
        return r;
    }
}

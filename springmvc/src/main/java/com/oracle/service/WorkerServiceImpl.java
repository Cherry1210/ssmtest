package com.oracle.service;

import com.oracle.mapper.WorkerMapper;
import com.oracle.pojo.Worker;
import com.oracle.util.workerlogin;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class WorkerServiceImpl implements WorkerService{
    @Autowired
    WorkerMapper workerMapper;

    public Worker singin(workerlogin login) {
        Worker worker = this.workerMapper.singin(login);
        if (worker!=null){
            return worker;
        }else {
            return null;
        }
    }
}

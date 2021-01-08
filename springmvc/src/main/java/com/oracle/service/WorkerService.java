package com.oracle.service;

import com.oracle.pojo.Worker;
import com.oracle.util.workerlogin;

public interface WorkerService {
    Worker singin(workerlogin login);
}

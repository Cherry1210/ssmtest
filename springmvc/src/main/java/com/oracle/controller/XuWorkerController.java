package com.oracle.controller;

import com.oracle.pojo.Worker;
import com.oracle.service.WorkerService;
import com.oracle.util.workerlogin;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;

import javax.servlet.http.HttpServletRequest;

@SessionAttributes(value = { "worker_id","name","worker"})
@Controller
@RequestMapping("/XuWorker")
public class XuWorkerController {
    @Autowired
    private WorkerService workerService;

    @RequestMapping("/xusignin")
    public String signin(HttpServletRequest request, workerlogin l) {
        Worker pt = this.workerService.singin(l);
        System.out.println("-----2222222222222222222");
        /*System.out.println("user"+pt.getId());*/
        if (pt != null) {
            request.getSession().setAttribute("worker", pt);
            return "houtai";
        } else {
            return "fail";
        }

    }
}


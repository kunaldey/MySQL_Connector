package com.aafes.mysql.resource;

import com.aafes.mysql.model.Execution;
import com.aafes.mysql.repository.ExecutionRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.Query;
import org.springframework.web.bind.annotation.*;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@RestController
@RequestMapping(value = "/execution")
public class ExecutionResource {

    private static final DateFormat sdf = new SimpleDateFormat("MM-dd-YYYY");
    private static final DateFormat stf = new SimpleDateFormat("HH:mm:ss");

    @Autowired
    ExecutionRepo ExecutionRepo;

    @GetMapping(value = "/all")
    public List<Execution> getAll(){
        return ExecutionRepo.findAll();
    }

    @PostMapping(value = "/addExecution")
    public void addBooks (@RequestBody final Execution execRepo){
        execRepo.setDate(getCurrentDate());
        execRepo.setTime(getCurrentTime());
        ExecutionRepo.save(execRepo);
//        return ExecutionRepo.findAll();
    }

    @GetMapping(value = "/getbycycle")
    public List<Object[]> getByCycle(@RequestParam String cycleID){
        List<Object[]> cycleList = ExecutionRepo.findByCycle(cycleID);
        return cycleList;
    }

    @GetMapping(value = "/findtestsbycycle")
    public List<Execution> getByCycle(@RequestParam String cycleID, @RequestParam String endOfTest){
        return ExecutionRepo.findTestByCycle(cycleID, endOfTest);
    }

    public static String getCurrentDate(){
        Date date = new Date();
        String formattedDate = sdf.format(date).toString();
        System.out.println(sdf.format(date));
        return formattedDate;
    }

    public static String getCurrentTime(){
        Date date = new Date();
        String formattedDate = stf.format(date).toString();
        System.out.println(stf.format(date));
        return formattedDate;
    }
}

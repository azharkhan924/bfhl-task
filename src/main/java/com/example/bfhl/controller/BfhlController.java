package com.example.bfhl.controller;

import com.example.bfhl.dto.RequestDto;
import com.example.bfhl.dto.ResponseDto;
import com.example.bfhl.service.BfhlService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class BfhlController {

    @Autowired
    private BfhlService service;

    @GetMapping("/health")
    public String check() {
        return "API Running";
    }

    @PostMapping("/bfhl")
    public ResponseDto getData(@RequestBody RequestDto req){

        try{
            return service.processData(req);
        }
        catch(Exception e){

            ResponseDto res = new ResponseDto();
            res.setIs_success(false);

            return res;
        }
    }
}
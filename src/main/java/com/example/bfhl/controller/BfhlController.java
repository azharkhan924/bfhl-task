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

    @PostMapping("/bfhl")
    public ResponseDto getData(@RequestBody RequestDto req){

        return service.processData(req);

    }
}
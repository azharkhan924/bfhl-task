package com.example.bfhl;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Arrays;

import org.junit.jupiter.api.Test;

import com.example.bfhl.dto.RequestDto;
import com.example.bfhl.dto.ResponseDto;
import com.example.bfhl.service.BfhlServiceImpl;

class BfhlApplicationTests {

    @Test
    void testCase1() {

        BfhlServiceImpl s = new BfhlServiceImpl();

        RequestDto req = new RequestDto();

        req.setData(Arrays.asList(
                "a","1","334","4","R","$"
        ));

        ResponseDto res = s.processData(req);

        assertEquals("339",res.getSum());
        assertEquals("Ra",res.getConcat_string());

    }

    @Test
    void testCase2() {

        BfhlServiceImpl s = new BfhlServiceImpl();

        RequestDto req = new RequestDto();

        req.setData(Arrays.asList(
                "a","b","c"
        ));

        ResponseDto res = s.processData(req);

        assertEquals("0",res.getSum());
        assertEquals("CbA",res.getConcat_string());

    }

}
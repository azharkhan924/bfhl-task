package com.example.bfhl.service;

import com.example.bfhl.dto.RequestDto;
import com.example.bfhl.dto.ResponseDto;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class BfhlServiceImpl implements BfhlService {

    @Override
    public ResponseDto processData(RequestDto req) {

        List<String> odd = new ArrayList<>();
        List<String> even = new ArrayList<>();
        List<String> alpha = new ArrayList<>();
        List<String> special = new ArrayList<>();

        long sum = 0;

        StringBuilder allChar = new StringBuilder();

        for (String s : req.getData()) {

            if (s.matches("\\d+")) {

                int num = Integer.parseInt(s);

                sum += num;

                if (num % 2 == 0)
                    even.add(s);
                else
                    odd.add(s);

            }

            else if (s.matches("[a-zA-Z]+")) {

                alpha.add(s.toUpperCase());

                for(char c : s.toCharArray()){
                    allChar.append(c);
                }
            }

            else {

                special.add(s);
            }
        }

        String rev = allChar.reverse().toString();

        StringBuilder ans = new StringBuilder();

        for(int i=0;i<rev.length();i++){

            if(i%2==0)
                ans.append(Character.toUpperCase(rev.charAt(i)));
            else
                ans.append(Character.toLowerCase(rev.charAt(i)));
        }

        ResponseDto res = new ResponseDto();

        res.setIs_success(true);

        res.setUser_id("azharkhan_26052026");
        res.setEmail("azharkhan230826@acropolis.in");
        res.setRoll_number("0827CS231059");
        res.setOdd_numbers(odd);
        res.setEven_numbers(even);
        res.setAlphabets(alpha);
        res.setSpecial_characters(special);
        res.setSum(String.valueOf(sum));
        res.setConcat_string(ans.toString());

        return res;
    }
}

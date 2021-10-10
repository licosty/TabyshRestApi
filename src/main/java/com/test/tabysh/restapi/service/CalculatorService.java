package com.test.tabysh.restapi.service;

import com.test.tabysh.restapi.exception.BadRequestArgumentException;
import com.test.tabysh.restapi.model.ResponseModel;
import org.apache.commons.lang3.math.NumberUtils;
import org.springframework.stereotype.Service;

import java.math.BigInteger;
import java.util.Arrays;
import java.util.List;

@Service
public class CalculatorService {
    public ResponseModel calculateSumAndMultiply(String a, String b, String c) {
        List<String> parameters = Arrays.asList(a, b, c);
        for (String param : parameters) {
            if (!NumberUtils.isCreatable(param))
                throw new BadRequestArgumentException(param + " не является числом");
        }

        BigInteger paramA = NumberUtils.createBigInteger(a);
        BigInteger paramB = NumberUtils.createBigInteger(b);
        BigInteger paramC = NumberUtils.createBigInteger(c);

        BigInteger sumOfParam = paramA.add(paramB).add(paramC);
        BigInteger multiOfParam = paramA.multiply(paramB).multiply(paramC);

        return new ResponseModel(paramA, paramB, paramC, sumOfParam, multiOfParam);

    }
}

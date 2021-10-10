package com.test.tabysh.restapi.model;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigInteger;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ResponseModel {
    private BigInteger a;
    private BigInteger b;
    private BigInteger c;
    private BigInteger sum;
    private BigInteger pp;

}

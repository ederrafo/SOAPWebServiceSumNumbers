package com.bharath.trainings.ws.service;


import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;

@WebService(name = "SumWs")
public interface SumWS {

    @WebResult(name = "response")
    SumResponse calculateSum(@WebParam SumRequest request);
}

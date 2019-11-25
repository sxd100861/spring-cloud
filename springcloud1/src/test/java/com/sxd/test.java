package com.sxd;


import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.BasicResponseHandler;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;

public class test {

    private CloseableHttpClient httpClient;
    @Before
    public void init(){
        httpClient= HttpClients.createDefault();
    }
    @Test
    public void testGet() throws IOException {
        HttpGet request=new HttpGet("http://localhost:8080/user/list");
        String response =this.httpClient.execute(request,new BasicResponseHandler());
        System.out.println(response);
    }
}

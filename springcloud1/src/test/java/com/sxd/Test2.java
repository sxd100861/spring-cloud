package com.sxd;

import com.sxd.pojo.TbUser;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class Test2 {
    @Autowired
    private RestTemplate restTemplate;

    @Test
    public void test(){
        List<TbUser> users=restTemplate.getForObject("http://localhost:8080/user/list",List.class);
        System.out.println(users);
    }
}

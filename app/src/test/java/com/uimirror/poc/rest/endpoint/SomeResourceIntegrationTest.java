package com.uimirror.poc.rest.endpoint;

import com.uimirror.poc.rest.StartApp;
import com.uimirror.poc.rest.bean.Hello;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.IntegrationTest;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.boot.test.TestRestTemplate;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.web.client.RestTemplate;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = StartApp.class)
@WebAppConfiguration
@IntegrationTest("server.port=9000")
public class SomeResourceIntegrationTest {

    private RestTemplate restTemplate = new TestRestTemplate();

    @Test
    public void health() {
        ResponseEntity<Hello> entity =
                restTemplate.getForEntity("http://localhost:8181/sample/api", Hello.class);

        System.out.println(entity);
    }
}
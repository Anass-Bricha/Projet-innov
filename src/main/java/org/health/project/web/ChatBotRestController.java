package org.health.project.web;

import org.health.project.services.chatbotService.Message;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class ChatBotRestController {



    @PostMapping(path = "/talk" , produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseBody
    public Object response(@RequestBody Message message){
        String url = "http://127.0.0.1:8086/talk";

        RestTemplate restTemplate = new RestTemplate();

        HttpEntity<Message> request = new HttpEntity<>(message);

        ResponseEntity<Object> response = restTemplate.exchange(url, HttpMethod.POST,request,Object.class);

        return response.getBody();
    }
}

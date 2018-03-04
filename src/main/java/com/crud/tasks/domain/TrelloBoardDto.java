package com.crud.tasks.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Value;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@AllArgsConstructor
@Getter
public class TrelloBoardDto {
    private String name;
    private String id;

//    @Value("${trello.api.endpoint.prod}")
//    private String trelloApiEndpoint;

//    @Autowired
//    private RestTemplate restTemplate;
//    public List<TrelloBoardDto> getTrelloBoards() {
//        TrelloBoardDto[] boardsResponse = restTemplate.getForObject("http://api.trello.com/1/members/kodillauser/boards", TrelloBoardDto[].class);

//    }
}

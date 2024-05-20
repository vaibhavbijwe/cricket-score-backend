package com.score.Backend.controllers;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.score.Backend.entities.Match;
import com.score.Backend.services.MatchService;

@RestController
@RequestMapping("/match")
@CrossOrigin("*")
public class MatchController {

    private MatchService matchservice;



    public MatchController(MatchService matchservice) {
        this.matchservice = matchservice;
    }


    @GetMapping("/live")
    public ResponseEntity<List<Match>>getLiveMatches()
    {
        return new ResponseEntity<>(this.matchservice.getLiveMatches(),HttpStatus.OK);
    }

    @GetMapping
    public ResponseEntity<List<Match>>getAllMatches()

    {
        return new ResponseEntity<>(matchservice.getAllMatches(),HttpStatus.OK);
    }

    @GetMapping("/point-table")
    public ResponseEntity<?>getPointTable()
    {
        return new ResponseEntity<>(this.matchservice.getPointTable(),HttpStatus.OK);
    }

}

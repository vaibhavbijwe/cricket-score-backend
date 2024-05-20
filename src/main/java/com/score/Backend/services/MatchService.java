package com.score.Backend.services;

import java.util.List;
import java.util.Map;

import com.score.Backend.entities.Match;

public interface MatchService {

    List<Match>getAllMatches();

    List<Match>getLiveMatches();

    List<List<String>>getPointTable();

}

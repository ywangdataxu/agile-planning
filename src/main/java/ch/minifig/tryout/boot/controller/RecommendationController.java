package ch.minifig.tryout.boot.controller;

import ch.minifig.tryout.boot.model.RecommendationRepository;
import ch.minifig.tryout.boot.model.Recommendation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("/api/recommandations")
class RecommendationController {

    @Autowired
    private RecommendationRepository recommendationRepository;

    @RequestMapping(method = RequestMethod.GET)
    @ResponseBody
    List<Recommendation> getClients() {
        return recommendationRepository.findAll();
    }
}

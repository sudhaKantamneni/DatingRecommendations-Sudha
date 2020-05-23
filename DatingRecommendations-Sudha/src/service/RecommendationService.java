package service;

import model.User;

import java.util.ArrayList;
import java.util.List;

public class RecommendationService {
    private Recommendation recommendation;

    public RecommendationService(UserService userService) {
        this.recommendation = new DatingRecommendation(userService);
    }

    public List<User> getAllRecommendationForUser(User user) {
        return getRecommendations(user);
    }

    public List<User> getTopRecommendations(User user, int top) {
        return getRecommendations(user, top);
    }

    private List<User> getRecommendations(User user, int top) {
        List<User> allRecommendations = getRecommendations(user);
        List<User> topRecommendations = new ArrayList<>();
        List<String> finalRecommend=new ArrayList<>();
       for(int i = 0; i < top; i++) {
            topRecommendations.add(allRecommendations.get(i));
            finalRecommend.add(topRecommendations.get(i).getName());
        }
           
        	System.out.println("Output: "+finalRecommend.toString());
        	
       
        return topRecommendations;
    }

    private List<User> getRecommendations(User user) {
        return recommendation.makeRecommendation(user);
    }
}

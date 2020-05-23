package service

import model.User;

import java.util.List;

public interface Recommendation {
    List<User> makeRecommendation(User user);

}

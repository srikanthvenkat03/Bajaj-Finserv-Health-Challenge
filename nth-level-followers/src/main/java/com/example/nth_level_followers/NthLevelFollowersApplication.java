package com.example.nthlevelfollowers;

import com.example.nthlevelfollowers.model.User;
import com.example.nthlevelfollowers.util.NthLevelFollowerSolver;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Arrays;
import java.util.List;

@SpringBootApplication
public class NthLevelFollowersApplication {

    public static void main(String[] args) {
        SpringApplication.run(NthLevelFollowersApplication.class, args);

        // Sample Input
        List<User> users = Arrays.asList(
                new User(1, "Alice", Arrays.asList(2, 3)),
                new User(2, "Bob", List.of(4)),
                new User(3, "Charlie", Arrays.asList(4, 5)),
                new User(4, "David", List.of(6)),
                new User(5, "Eva", List.of(6)),
                new User(6, "Frank", List.of())
        );

        int findId = 1;
        int level = 2;

        List<Integer> result = NthLevelFollowerSolver.getNthLevelFollowers(users, findId, level);
        System.out.println("🎯 Nth Level Followers: " + result);
    }
}

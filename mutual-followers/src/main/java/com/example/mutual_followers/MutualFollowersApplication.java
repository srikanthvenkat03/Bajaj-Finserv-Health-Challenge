package com.example.mutualfollowers;

import com.example.mutualfollowers.model.User;
import com.example.mutualfollowers.util.MutualFollowerSolver;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.*;

@SpringBootApplication
public class MutualFollowersApplication {

    public static void main(String[] args) {
        SpringApplication.run(MutualFollowersApplication.class, args);

        // Sample Input
        List<User> users = new ArrayList<>();
        users.add(new User(1, "Alice", Arrays.asList(2, 3)));
        users.add(new User(2, "Bob", List.of(1)));
        users.add(new User(3, "Charlie", List.of(4)));
        users.add(new User(4, "David", List.of(3)));

        List<List<Integer>> result = MutualFollowerSolver.findMutualFollowers(users);

        System.out.println("✅ Mutual Follower Pairs: " + result); // Output: [[1,2], [3,4]]
    }
}

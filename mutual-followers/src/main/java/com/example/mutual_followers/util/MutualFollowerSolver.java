package com.example.mutualfollowers.util;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import com.example.mutualfollowers.model.User;

public class MutualFollowerSolver {

    public static List<List<Integer>> findMutualFollowers(List<User> users) {
        List<List<Integer>> result = new ArrayList<>();
        Map<Integer, Set<Integer>> followsMap = new HashMap<>();
        Set<String> seenPairs = new HashSet<>();

        for (User user : users) {
            followsMap.put(user.getId(), new HashSet<>(user.getFollows()));
        }

        for (User user : users) {
            int userId = user.getId();
            for (int followedId : user.getFollows()) {
                if (followsMap.containsKey(followedId)
                        && followsMap.get(followedId).contains(userId)) {
                    int min = Math.min(userId, followedId);
                    int max = Math.max(userId, followedId);
                    String key = min + "-" + max;
                    if (!seenPairs.contains(key)) {
                        result.add(Arrays.asList(min, max));
                        seenPairs.add(key);
                    }
                }
            }
        }

        return result;
    }
}

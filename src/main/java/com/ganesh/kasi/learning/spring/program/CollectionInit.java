package com.ganesh.kasi.learning.spring.program;

import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * Created by ganeshkasi on 26/09/15.
 */
public class CollectionInit {
    private List<String> usersList;

    private Set<String> usersSet;

    private Map<String, String> usersMap;

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("CollectionInit{");
        sb.append("usersList=").append(usersList);
        sb.append(", usersSet=").append(usersSet);
        sb.append(", usersMap=").append(usersMap);
        sb.append('}');
        return sb.toString();
    }

    @Autowired
    public CollectionInit setUsersMap(Map<String, String> usersMap) {
        this.usersMap = usersMap;
        return this;
    }

    public CollectionInit setUsersSet(Set<String> usersSet) {
        this.usersSet = usersSet;
        return this;
    }

    public CollectionInit setUsersList(List<String> usersList) {
        this.usersList = usersList;
        return this;
    }
}

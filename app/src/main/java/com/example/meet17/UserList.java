package com.example.meet17;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Игорь on 29.07.2018.
 */

public class UserList {

    private List<User> dataList = new ArrayList<User>();

    private static final UserList ourInstance = new UserList();

    static UserList getInstance() {
        return ourInstance;
    }

    private UserList() {
    }

    public void addUser(User user) {
        dataList.add(user);
    }

    public User getUser(int position) {
        return dataList.get(position);
    }

    public int getSize() {
        return dataList.size();
    }

    public List<User> getAll() {
        return dataList;
    }

}

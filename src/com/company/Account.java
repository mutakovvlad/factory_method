package com.company;

import java.util.ArrayList;
import java.util.List;

abstract class Account {
    String status;
    List<String> opportunities = new ArrayList();

    public String toString() {
        return "Account status: " + status + "\n" + opportunities;
    }
}
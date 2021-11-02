package com.company;

class RegularAccountFactory extends AccountFactory {
    public Account createAccount() {
        return new RegularAccount();
    }
}
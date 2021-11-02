package com.company;

class VipAccountFactory extends AccountFactory {
    public Account createAccount() {
        return new VipAccount();
    }
}
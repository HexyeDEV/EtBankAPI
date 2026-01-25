package me.hexye.etbank.api;

import java.util.UUID;

public interface EtBankAPI {
    void deposit(UUID playerId, double amount);
    void withdraw(UUID playerId, double amount);
    void setBalance(UUID playerId, double amount);
    double getBalance(UUID playerId);
}

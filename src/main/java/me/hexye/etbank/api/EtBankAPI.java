package me.hexye.etbank.api;

import java.util.UUID;

public interface EtBankAPI {
    void deposit(UUID playerId, int amount);
    void withdraw(UUID playerId, int amount);
    int getBalance(UUID playerId);
}

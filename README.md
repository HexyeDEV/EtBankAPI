# EtBankAPI
API for the [EtBank Hytale plugin](https://builtbybit.com/resources/etbank-hytale-advanced-economy.90711)

# How To Use:
Download the [latest release](https://github.com/HexyeDEV/EtBankAPI/releases/) of the API and put it inside your libs folder.
Compile against the API in your build.gradle file:

```compileOnly files('libs/EtBankAPI-0.1.jar')```

Add EtPlugins:EtBank as a dependency in your plugin.

Get the EtBankAPI Instance from ```me.hexye.etbank.api.EtBank.get()``` which returns an instance of the interface ```me.hexye.etbank.api.EtBankAPI```

Available Methods:

```java
void EtBankAPI.deposit(UUID target, int amount)
```
Deposits amount money to target player

```java
void EtBankAPI.withdraw(UUID target, int amount)
```
Withdraw amount money from target player

```java
int EtBankAPI.getBalance(UUID target)
```
Returns the balance of target player
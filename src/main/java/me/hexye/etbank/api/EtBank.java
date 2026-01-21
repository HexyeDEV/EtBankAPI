package me.hexye.etbank.api;

public final class EtBank {
    private static EtBankAPI api;

    private EtBank() {

    }

    public static EtBankAPI get() {
        if (api == null) {
            throw new IllegalStateException("EtBankAPI has not been initialized yet.");
        }
        return api;
    }

    public static void set(EtBankAPI implementation) {
        if (api != null) {
            throw new IllegalStateException("EtBankAPI already set");
        }
        api = implementation;
    }
}

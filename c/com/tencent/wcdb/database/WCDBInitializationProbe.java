package com.tencent.wcdb.database;

final class WCDBInitializationProbe {
    public static volatile long apiEnv;
    public static boolean libLoaded;

    private WCDBInitializationProbe() {
    }
}

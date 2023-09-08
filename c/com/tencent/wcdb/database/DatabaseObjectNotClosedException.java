package com.tencent.wcdb.database;

public class DatabaseObjectNotClosedException extends RuntimeException {

    /* renamed from: s */
    private static final String f25004s = "Application did not close the cursor or database object that was opened here";

    public DatabaseObjectNotClosedException() {
        super(f25004s);
    }
}

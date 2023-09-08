package com.tencent.wcdb.database;

import android.os.Environment;
import android.os.StatFs;
import j20.C117292a;
import k20.C9556a;

public final class SQLiteGlobal {
    private static final String TAG = "WCDB.SQLiteGlobal";
    public static final String defaultJournalMode = "PERSIST";
    public static final int defaultPageSize;
    public static final String defaultSyncMode = "FULL";
    public static final int journalSizeLimit = 524288;
    public static final int walAutoCheckpoint = 100;
    public static final int walConnectionPoolSize = 4;
    public static final String walSyncMode = "FULL";
    private byte _hellAccFlag_;

    public static class Initializer {
        static {
            SQLiteGlobal.nativeInitialize(SQLiteGlobal.defaultPageSize);
        }

        private Initializer() {
        }

        public static void init() {
        }
    }

    static {
        int i;
        if (!WCDBInitializationProbe.libLoaded) {
            C9556a aVar = new C9556a();
            aVar.mo10233c("wcdb");
            Object obj = new Object();
            C117292a.m165358d(obj, aVar.mo10232b(), "com/tencent/wcdb/database/SQLiteGlobal", "<clinit>", "()V", "java/lang/System_EXEC_", "loadLibrary", "(Ljava/lang/String;)V");
            System.loadLibrary((String) aVar.mo10231a(0));
            C117292a.m165359e(obj, "com/tencent/wcdb/database/SQLiteGlobal", "<clinit>", "()V", "java/lang/System_EXEC_", "loadLibrary", "(Ljava/lang/String;)V");
        }
        try {
            i = new StatFs(Environment.getDataDirectory().getAbsolutePath()).getBlockSize();
        } catch (RuntimeException unused) {
            i = 4096;
        }
        defaultPageSize = i;
    }

    private SQLiteGlobal() {
    }

    public static void initialize() {
        Initializer.init();
    }

    public static void loadLib() {
    }

    /* access modifiers changed from: private */
    public static native void nativeInitialize(int i);

    private static native int nativeReleaseMemory();

    public static int releaseMemory() {
        return nativeReleaseMemory();
    }
}

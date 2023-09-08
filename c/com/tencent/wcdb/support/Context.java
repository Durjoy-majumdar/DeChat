package com.tencent.wcdb.support;

import com.tencent.wcdb.DatabaseErrorHandler;
import com.tencent.wcdb.FileUtils;
import com.tencent.wcdb.database.SQLiteCipherSpec;
import com.tencent.wcdb.database.SQLiteDatabase;
import com.tencent.wcdb.database.SQLiteGlobal;
import com.tencent.wxmm.v2helper;
import java.io.File;

public final class Context {
    public static final int MODE_ENABLE_WRITE_AHEAD_LOGGING = 8;

    static {
        SQLiteGlobal.initialize();
    }

    private static File getDataDirFile(android.content.Context context) {
        if (context != null) {
            String str = context.getApplicationInfo().dataDir;
            if (str != null) {
                return new File(str);
            }
            return null;
        }
        throw new RuntimeException("Not supported in system context");
    }

    private static File getDatabasesDir(android.content.Context context) {
        File file = new File(getDataDirFile(context), "databases");
        return file.getPath().equals("databases") ? new File("/data/system") : file;
    }

    private static File makeFilename(File file, String str) {
        if (str.indexOf(File.separatorChar) < 0) {
            return new File(file, str);
        }
        throw new IllegalArgumentException("File " + str + " contains a path separator");
    }

    public static SQLiteDatabase openOrCreateDatabase(android.content.Context context, String str, int i, SQLiteDatabase.CursorFactory cursorFactory) {
        return openOrCreateDatabase(context, str, (byte[]) null, (SQLiteCipherSpec) null, i, cursorFactory, (DatabaseErrorHandler) null, 0);
    }

    private static void setFilePermissionsFromMode(String str, int i, int i2) {
        int i3 = i2 | v2helper.EMethodSetSendToNetworkOn;
        if ((i & 1) != 0) {
            i3 |= 4;
        }
        if ((i & 2) != 0) {
            i3 |= 2;
        }
        FileUtils.setPermissions(str, i3, -1, -1);
    }

    private static File validateFilePath(android.content.Context context, String str, boolean z) {
        File file;
        File file2;
        char charAt = str.charAt(0);
        char c = File.separatorChar;
        if (charAt == c) {
            file2 = new File(str.substring(0, str.lastIndexOf(c)));
            file = new File(file2, str.substring(str.lastIndexOf(File.separatorChar)));
        } else {
            file2 = getDatabasesDir(context);
            file = makeFilename(file2, str);
        }
        if (z && !file2.isDirectory() && file2.mkdir()) {
            FileUtils.setPermissions(file2.getPath(), 505, -1, -1);
        }
        return file;
    }

    public static SQLiteDatabase openOrCreateDatabase(android.content.Context context, String str, int i, SQLiteDatabase.CursorFactory cursorFactory, DatabaseErrorHandler databaseErrorHandler) {
        return openOrCreateDatabase(context, str, (byte[]) null, (SQLiteCipherSpec) null, i, cursorFactory, databaseErrorHandler, 0);
    }

    public static SQLiteDatabase openOrCreateDatabase(android.content.Context context, String str, byte[] bArr, SQLiteCipherSpec sQLiteCipherSpec, int i, SQLiteDatabase.CursorFactory cursorFactory) {
        return openOrCreateDatabase(context, str, bArr, sQLiteCipherSpec, i, cursorFactory, (DatabaseErrorHandler) null, 0);
    }

    public static SQLiteDatabase openOrCreateDatabase(android.content.Context context, String str, byte[] bArr, SQLiteCipherSpec sQLiteCipherSpec, int i, SQLiteDatabase.CursorFactory cursorFactory, DatabaseErrorHandler databaseErrorHandler) {
        return openOrCreateDatabase(context, str, bArr, sQLiteCipherSpec, i, cursorFactory, databaseErrorHandler, 0);
    }

    public static SQLiteDatabase openOrCreateDatabase(android.content.Context context, String str, byte[] bArr, SQLiteCipherSpec sQLiteCipherSpec, int i, SQLiteDatabase.CursorFactory cursorFactory, DatabaseErrorHandler databaseErrorHandler, int i2) {
        File validateFilePath = validateFilePath(context, str, true);
        SQLiteDatabase openDatabase = SQLiteDatabase.openDatabase(validateFilePath.getPath(), bArr, sQLiteCipherSpec, cursorFactory, (i & 8) != 0 ? 805306368 : 268435456, databaseErrorHandler, i2);
        setFilePermissionsFromMode(validateFilePath.getPath(), i, 0);
        return openDatabase;
    }
}

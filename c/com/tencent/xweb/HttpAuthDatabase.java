package com.tencent.xweb;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import com.tencent.xweb.util.XWebLog;

public class HttpAuthDatabase {
    private static final int DATABASE_VERSION = 1;
    private static final String HTTPAUTH_HOST_COL = "host";
    private static final String HTTPAUTH_PASSWORD_COL = "password";
    private static final String HTTPAUTH_REALM_COL = "realm";
    private static final String HTTPAUTH_TABLE_NAME = "httpauth";
    private static final String HTTPAUTH_USERNAME_COL = "username";
    private static final String ID_COL = "_id";
    private static final String[] ID_PROJECTION = {ID_COL};
    private static final String TAG = "HttpAuthDatabase";
    private SQLiteDatabase mDatabase;
    private boolean mInitialized;
    private final Object mInitializedLock = new Object();

    private HttpAuthDatabase() {
    }

    private void createTable() {
        this.mDatabase.execSQL("CREATE TABLE httpauth (_id INTEGER PRIMARY KEY, host TEXT, realm TEXT, username TEXT, password TEXT, UNIQUE (host, realm) ON CONFLICT REPLACE);");
        this.mDatabase.setVersion(1);
    }

    private void initDatabase(Context context, String str) {
        try {
            this.mDatabase = context.openOrCreateDatabase(str, 0, (SQLiteDatabase.CursorFactory) null);
        } catch (SQLiteException unused) {
            if (context.deleteDatabase(str)) {
                this.mDatabase = context.openOrCreateDatabase(str, 0, (SQLiteDatabase.CursorFactory) null);
            }
        }
        SQLiteDatabase sQLiteDatabase = this.mDatabase;
        if (sQLiteDatabase == null) {
            XWebLog.m21909e(TAG, "Unable to open or create " + str);
        } else if (sQLiteDatabase.getVersion() != 1) {
            this.mDatabase.beginTransactionNonExclusive();
            try {
                createTable();
                this.mDatabase.setTransactionSuccessful();
            } finally {
                this.mDatabase.endTransaction();
            }
        }
    }

    /* access modifiers changed from: private */
    public void initOnBackgroundThread(Context context, String str) {
        synchronized (this.mInitializedLock) {
            if (!this.mInitialized) {
                initDatabase(context, str);
                this.mInitialized = true;
                this.mInitializedLock.notifyAll();
            }
        }
    }

    public static HttpAuthDatabase newInstance(final Context context, final String str) {
        HttpAuthDatabase httpAuthDatabase = new HttpAuthDatabase();
        new Thread() {
            public void run() {
                HttpAuthDatabase.this.initOnBackgroundThread(context, str);
            }
        }.start();
        return httpAuthDatabase;
    }

    private boolean waitForInit() {
        synchronized (this.mInitializedLock) {
            while (!this.mInitialized) {
                try {
                    this.mInitializedLock.wait();
                } catch (InterruptedException e) {
                    XWebLog.m21910e(TAG, "Caught exception while checking initialization", e);
                }
            }
        }
        return this.mDatabase != null;
    }

    public void clearHttpAuthUsernamePassword() {
        if (waitForInit()) {
            this.mDatabase.delete(HTTPAUTH_TABLE_NAME, (String) null, (String[]) null);
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v2, resolved type: java.lang.String[]} */
    /* JADX WARNING: type inference failed for: r0v0 */
    /* JADX WARNING: type inference failed for: r0v1, types: [android.database.Cursor] */
    /* JADX WARNING: type inference failed for: r0v3 */
    /* JADX WARNING: type inference failed for: r0v4 */
    /* JADX WARNING: type inference failed for: r0v5 */
    /* JADX WARNING: type inference failed for: r0v6 */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0058, code lost:
        if (r15 != null) goto L_0x0047;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0060  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.String[] getHttpAuthUsernamePassword(java.lang.String r14, java.lang.String r15) {
        /*
            r13 = this;
            r0 = 0
            if (r14 == 0) goto L_0x0064
            if (r15 == 0) goto L_0x0064
            boolean r1 = r13.waitForInit()
            if (r1 != 0) goto L_0x000c
            goto L_0x0064
        L_0x000c:
            java.lang.String r1 = "username"
            java.lang.String r2 = "password"
            java.lang.String[] r5 = new java.lang.String[]{r1, r2}
            android.database.sqlite.SQLiteDatabase r3 = r13.mDatabase     // Catch:{ IllegalStateException -> 0x004f, all -> 0x004d }
            java.lang.String r4 = "httpauth"
            java.lang.String r6 = "(host == ?) AND (realm == ?)"
            r11 = 2
            java.lang.String[] r7 = new java.lang.String[r11]     // Catch:{ IllegalStateException -> 0x004f, all -> 0x004d }
            r12 = 0
            r7[r12] = r14     // Catch:{ IllegalStateException -> 0x004f, all -> 0x004d }
            r14 = 1
            r7[r14] = r15     // Catch:{ IllegalStateException -> 0x004f, all -> 0x004d }
            r8 = 0
            r9 = 0
            r10 = 0
            android.database.Cursor r15 = r3.query(r4, r5, r6, r7, r8, r9, r10)     // Catch:{ IllegalStateException -> 0x004f, all -> 0x004d }
            boolean r3 = r15.moveToFirst()     // Catch:{ IllegalStateException -> 0x004b }
            if (r3 == 0) goto L_0x0047
            java.lang.String[] r3 = new java.lang.String[r11]     // Catch:{ IllegalStateException -> 0x004b }
            int r1 = r15.getColumnIndex(r1)     // Catch:{ IllegalStateException -> 0x004b }
            java.lang.String r1 = r15.getString(r1)     // Catch:{ IllegalStateException -> 0x004b }
            r3[r12] = r1     // Catch:{ IllegalStateException -> 0x004b }
            int r1 = r15.getColumnIndex(r2)     // Catch:{ IllegalStateException -> 0x004b }
            java.lang.String r1 = r15.getString(r1)     // Catch:{ IllegalStateException -> 0x004b }
            r3[r14] = r1     // Catch:{ IllegalStateException -> 0x004b }
            r0 = r3
        L_0x0047:
            r15.close()
            goto L_0x005b
        L_0x004b:
            r14 = move-exception
            goto L_0x0051
        L_0x004d:
            r14 = move-exception
            goto L_0x005e
        L_0x004f:
            r14 = move-exception
            r15 = r0
        L_0x0051:
            java.lang.String r1 = "HttpAuthDatabase"
            java.lang.String r2 = "getHttpAuthUsernamePassword"
            com.tencent.xweb.util.XWebLog.m21910e(r1, r2, r14)     // Catch:{ all -> 0x005c }
            if (r15 == 0) goto L_0x005b
            goto L_0x0047
        L_0x005b:
            return r0
        L_0x005c:
            r14 = move-exception
            r0 = r15
        L_0x005e:
            if (r0 == 0) goto L_0x0063
            r0.close()
        L_0x0063:
            throw r14
        L_0x0064:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.xweb.HttpAuthDatabase.getHttpAuthUsernamePassword(java.lang.String, java.lang.String):java.lang.String[]");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x002a, code lost:
        if (r0 == null) goto L_0x002d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean hasHttpAuthUsernamePassword() {
        /*
            r10 = this;
            boolean r0 = r10.waitForInit()
            r1 = 0
            if (r0 != 0) goto L_0x0008
            return r1
        L_0x0008:
            r0 = 0
            android.database.sqlite.SQLiteDatabase r2 = r10.mDatabase     // Catch:{ IllegalStateException -> 0x0022 }
            java.lang.String r3 = "httpauth"
            java.lang.String[] r4 = ID_PROJECTION     // Catch:{ IllegalStateException -> 0x0022 }
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            android.database.Cursor r0 = r2.query(r3, r4, r5, r6, r7, r8, r9)     // Catch:{ IllegalStateException -> 0x0022 }
            boolean r1 = r0.moveToFirst()     // Catch:{ IllegalStateException -> 0x0022 }
        L_0x001c:
            r0.close()
            goto L_0x002d
        L_0x0020:
            r1 = move-exception
            goto L_0x002e
        L_0x0022:
            r2 = move-exception
            java.lang.String r3 = "HttpAuthDatabase"
            java.lang.String r4 = "hasEntries"
            com.tencent.xweb.util.XWebLog.m21910e(r3, r4, r2)     // Catch:{ all -> 0x0020 }
            if (r0 == 0) goto L_0x002d
            goto L_0x001c
        L_0x002d:
            return r1
        L_0x002e:
            if (r0 == 0) goto L_0x0033
            r0.close()
        L_0x0033:
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.xweb.HttpAuthDatabase.hasHttpAuthUsernamePassword():boolean");
    }

    public void setHttpAuthUsernamePassword(String str, String str2, String str3, String str4) {
        if (str != null && str2 != null && waitForInit()) {
            ContentValues contentValues = new ContentValues();
            contentValues.put("host", str);
            contentValues.put(HTTPAUTH_REALM_COL, str2);
            contentValues.put("username", str3);
            contentValues.put(HTTPAUTH_PASSWORD_COL, str4);
            this.mDatabase.insert(HTTPAUTH_TABLE_NAME, "host", contentValues);
        }
    }
}

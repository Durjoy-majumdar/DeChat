package com.tencent.tmassistantsdk.storage.table;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.text.TextUtils;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.tmassistantsdk.storage.helper.AstSDKDBHelper_V2;
import com.tencent.tmassistantsdk.storage.helper.SqliteHelper;
import com.tencent.tmassistantsdk.storage.model.ClientInfo;

public class ClientInfoTable implements ITableBase {
    public static final String CREATE_TABLE_SQL = "CREATE TABLE if not exists clientinfo( _id INTEGER PRIMARY KEY AUTOINCREMENT, clientId TEXT , taskId INTEGER, taskUrl TEXT);";
    public static final String QUERY_CLIENTINFO = "select * from clientinfo where clientId = ?";
    public static final String QUERY_CLIENTINFO_ALL = "select * from clientinfo";
    public static final String TABLE_NAME = "clientinfo";
    private static final String TAG = "ClientInfoTable";

    public class Columns {
        public static final String CLIENTID = "clientId";
        public static final String TASKID = "taskId";
        public static final String TASKURL = "taskUrl";

        public Columns() {
        }
    }

    private static ClientInfo cursor2object(Cursor cursor) {
        ClientInfo clientInfo = new ClientInfo();
        clientInfo.clientId = cursor.getString(cursor.getColumnIndex(Columns.CLIENTID));
        clientInfo.taskId = cursor.getInt(cursor.getColumnIndex("taskId"));
        clientInfo.taskUrl = cursor.getString(cursor.getColumnIndex("taskUrl"));
        return clientInfo;
    }

    public static void delete(String str, String str2) {
        if (str != null && str2 != null) {
            try {
                AstSDKDBHelper_V2.getInstance().getWritableDatabase().delete(TABLE_NAME, "clientId = ? and taskUrl = ?", new String[]{str, str2});
            } catch (Exception e) {
                Log.printErrStackTrace(TAG, e, "", new Object[0]);
            }
        }
    }

    public static void deleteItemsByURL(String str) {
        if (!TextUtils.isEmpty(str)) {
            try {
                AstSDKDBHelper_V2.getInstance().getWritableDatabase().delete(TABLE_NAME, "taskUrl = ?", new String[]{str});
            } catch (Exception e) {
                Log.printErrStackTrace(TAG, e, "", new Object[0]);
            }
        }
    }

    private static void fillValues(ContentValues contentValues, ClientInfo clientInfo) {
        if (clientInfo != null) {
            contentValues.put(Columns.CLIENTID, clientInfo.clientId);
            contentValues.put("taskId", Integer.valueOf(clientInfo.taskId));
            contentValues.put("taskUrl", clientInfo.taskUrl);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:23:0x004c  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0053  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.util.ArrayList<com.tencent.tmassistantsdk.storage.model.ClientInfo> query(java.lang.String r7) {
        /*
            r0 = 0
            if (r7 == 0) goto L_0x0057
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            com.tencent.tmassistantsdk.storage.helper.SqliteHelper r2 = com.tencent.tmassistantsdk.storage.helper.AstSDKDBHelper_V2.getInstance()
            android.database.sqlite.SQLiteDatabase r2 = r2.getReadableDatabase()
            r3 = 0
            java.lang.String r4 = "select * from clientinfo where clientId = ?"
            r5 = 1
            java.lang.String[] r5 = new java.lang.String[r5]     // Catch:{ Exception -> 0x003f, all -> 0x003a }
            r5[r3] = r7     // Catch:{ Exception -> 0x003f, all -> 0x003a }
            android.database.Cursor r7 = r2.rawQuery(r4, r5)     // Catch:{ Exception -> 0x003f, all -> 0x003a }
            if (r7 == 0) goto L_0x0034
            boolean r2 = r7.moveToFirst()     // Catch:{ Exception -> 0x0032 }
            if (r2 == 0) goto L_0x0034
        L_0x0024:
            com.tencent.tmassistantsdk.storage.model.ClientInfo r2 = cursor2object(r7)     // Catch:{ Exception -> 0x0032 }
            r1.add(r2)     // Catch:{ Exception -> 0x0032 }
            boolean r2 = r7.moveToNext()     // Catch:{ Exception -> 0x0032 }
            if (r2 != 0) goto L_0x0024
            goto L_0x0034
        L_0x0032:
            r1 = move-exception
            goto L_0x0041
        L_0x0034:
            if (r7 == 0) goto L_0x0039
            r7.close()
        L_0x0039:
            return r1
        L_0x003a:
            r7 = move-exception
            r6 = r0
            r0 = r7
            r7 = r6
            goto L_0x0051
        L_0x003f:
            r1 = move-exception
            r7 = r0
        L_0x0041:
            java.lang.String r2 = "ClientInfoTable"
            java.lang.String r4 = ""
            java.lang.Object[] r3 = new java.lang.Object[r3]     // Catch:{ all -> 0x0050 }
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r2, r1, r4, r3)     // Catch:{ all -> 0x0050 }
            if (r7 == 0) goto L_0x0057
            r7.close()
            goto L_0x0057
        L_0x0050:
            r0 = move-exception
        L_0x0051:
            if (r7 == 0) goto L_0x0056
            r7.close()
        L_0x0056:
            throw r0
        L_0x0057:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.tmassistantsdk.storage.table.ClientInfoTable.query(java.lang.String):java.util.ArrayList");
    }

    public static void save(ClientInfo clientInfo) {
        if (clientInfo != null) {
            try {
                SQLiteDatabase writableDatabase = AstSDKDBHelper_V2.getInstance().getWritableDatabase();
                if (update(clientInfo, writableDatabase) <= 0) {
                    ContentValues contentValues = new ContentValues();
                    fillValues(contentValues, clientInfo);
                    writableDatabase.insert(TABLE_NAME, (String) null, contentValues);
                }
            } catch (Exception e) {
                Log.printErrStackTrace(TAG, e, "", new Object[0]);
            }
        }
    }

    private static int update(ClientInfo clientInfo, SQLiteDatabase sQLiteDatabase) {
        if (clientInfo == null) {
            return -1;
        }
        try {
            ContentValues contentValues = new ContentValues();
            fillValues(contentValues, clientInfo);
            int update = sQLiteDatabase.update(TABLE_NAME, contentValues, "clientId = ? and taskUrl = ?", new String[]{clientInfo.clientId, clientInfo.taskUrl});
            if (update > 0) {
                return update;
            }
            return 0;
        } catch (Exception e) {
            Log.printErrStackTrace(TAG, e, "", new Object[0]);
            return -2;
        }
    }

    public String createTableSQL() {
        return CREATE_TABLE_SQL;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0030, code lost:
        if (r6 != null) goto L_0x0032;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0032, code lost:
        r6.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0046, code lost:
        if (r6 != null) goto L_0x0032;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0049, code lost:
        r7.setTransactionSuccessful();
        r7.endTransaction();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:?, code lost:
        return;
     */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0054  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void dataMovement(android.database.sqlite.SQLiteDatabase r6, android.database.sqlite.SQLiteDatabase r7) {
        /*
            r5 = this;
            if (r7 == 0) goto L_0x0058
            if (r6 == 0) goto L_0x0058
            r7.beginTransaction()
            r0 = 0
            java.lang.String r1 = "select * from clientinfo"
            android.database.Cursor r6 = r6.rawQuery(r1, r0)     // Catch:{ Exception -> 0x0038, all -> 0x0036 }
            if (r6 == 0) goto L_0x0030
            boolean r1 = r6.moveToFirst()     // Catch:{ Exception -> 0x002e }
            if (r1 == 0) goto L_0x0030
        L_0x0016:
            android.content.ContentValues r1 = new android.content.ContentValues     // Catch:{ Exception -> 0x002e }
            r1.<init>()     // Catch:{ Exception -> 0x002e }
            com.tencent.tmassistantsdk.storage.model.ClientInfo r2 = cursor2object(r6)     // Catch:{ Exception -> 0x002e }
            fillValues(r1, r2)     // Catch:{ Exception -> 0x002e }
            java.lang.String r2 = "clientinfo"
            r7.insert(r2, r0, r1)     // Catch:{ Exception -> 0x002e }
            boolean r1 = r6.moveToNext()     // Catch:{ Exception -> 0x002e }
            if (r1 != 0) goto L_0x0016
            goto L_0x0030
        L_0x002e:
            r0 = move-exception
            goto L_0x003c
        L_0x0030:
            if (r6 == 0) goto L_0x0049
        L_0x0032:
            r6.close()
            goto L_0x0049
        L_0x0036:
            r7 = move-exception
            goto L_0x0052
        L_0x0038:
            r6 = move-exception
            r4 = r0
            r0 = r6
            r6 = r4
        L_0x003c:
            java.lang.String r1 = "ClientInfoTable"
            java.lang.String r2 = ""
            r3 = 0
            java.lang.Object[] r3 = new java.lang.Object[r3]     // Catch:{ all -> 0x0050 }
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r1, r0, r2, r3)     // Catch:{ all -> 0x0050 }
            if (r6 == 0) goto L_0x0049
            goto L_0x0032
        L_0x0049:
            r7.setTransactionSuccessful()
            r7.endTransaction()
            goto L_0x0058
        L_0x0050:
            r7 = move-exception
            r0 = r6
        L_0x0052:
            if (r0 == 0) goto L_0x0057
            r0.close()
        L_0x0057:
            throw r7
        L_0x0058:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.tmassistantsdk.storage.table.ClientInfoTable.dataMovement(android.database.sqlite.SQLiteDatabase, android.database.sqlite.SQLiteDatabase):void");
    }

    public String[] getAlterSQL(int i, int i2) {
        return null;
    }

    public SqliteHelper getHelper() {
        return AstSDKDBHelper_V2.getInstance();
    }

    public String tableName() {
        return TABLE_NAME;
    }

    public static void save(String str, String str2) {
        ClientInfo clientInfo = new ClientInfo();
        clientInfo.clientId = str;
        clientInfo.taskUrl = str2;
        save(clientInfo);
    }
}

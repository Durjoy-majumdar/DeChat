package com.tencent.tmassistantsdk.storage.table;

import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.tmassistantsdk.downloadservice.DownloadInfo;
import com.tencent.tmassistantsdk.storage.helper.AstSDKDBHelper_V2;
import com.tencent.tmassistantsdk.storage.helper.SqliteHelper;
import java.util.ArrayList;
import java.util.Iterator;

public class DownloadInfoTable implements ITableBase {
    public static final String CREATE_TABLE_SQL = "CREATE TABLE if not exists downloadInfo( _id INTEGER PRIMARY KEY AUTOINCREMENT, taskId INTEGER , uId TEXT, taskUrl TEXT, secondaryUrl TEXT, finalUrl TEXT, requestFileSize INTEGER, fileName TEXT, contentType TEXT, redirectCnt INTEGER, retryCnt INTEGER, totalBytes INTEGER,status INTEGER,receivedBytes INTEGER,priority INTEGER,netType TEXT,downloadFailedErrCode INTEGER,downloadFailedTime INTEGER,headerParams TEXT);";
    public static final String QUERY_ALL = "select * from downloadInfo";
    public static final String QUERY_DOWNLOADINFO_URL = "select * from downloadInfo where taskUrl = ?";
    public static final String QUERY_UNFINISHED_TASK = "select a.taskUrl,a.status,b.clientId from downloadInfo as a left outer join clientinfo as b on a.taskUrl = b.taskUrl where b.clientId is not null and (a.status = 2 or a.status = 1)";
    public static final String TABLE_NAME = "downloadInfo";
    private static final String TAG = "DownloadInfoTable";

    public static void add(DownloadInfo downloadInfo) {
        if (downloadInfo != null) {
            try {
                SQLiteDatabase writableDatabase = AstSDKDBHelper_V2.getInstance().getWritableDatabase();
                if (update(downloadInfo, writableDatabase) <= 0) {
                    ContentValues contentValues = new ContentValues();
                    DownloadInfo.writeToContentValues(contentValues, downloadInfo);
                    writableDatabase.insert(TABLE_NAME, (String) null, contentValues);
                }
            } catch (Exception e) {
                Log.printErrStackTrace(TAG, e, "", new Object[0]);
            }
        }
    }

    public static void del(String str) {
        if (str != null && str.length() > 0) {
            try {
                AstSDKDBHelper_V2.getInstance().getWritableDatabase().delete(TABLE_NAME, "taskUrl = ?", new String[]{str});
            } catch (Exception e) {
                Log.printErrStackTrace(TAG, e, "", new Object[0]);
            }
        }
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [java.lang.String[], android.database.Cursor] */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x002b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.util.ArrayList<com.tencent.tmassistantsdk.downloadservice.DownloadInfo> load() {
        /*
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            com.tencent.tmassistantsdk.storage.helper.SqliteHelper r1 = com.tencent.tmassistantsdk.storage.helper.AstSDKDBHelper_V2.getInstance()
            android.database.sqlite.SQLiteDatabase r1 = r1.getReadableDatabase()
            r2 = 0
            java.lang.String r3 = "select * from downloadInfo"
            android.database.Cursor r2 = r1.rawQuery(r3, r2)     // Catch:{ Exception -> 0x0031 }
            if (r2 == 0) goto L_0x0029
            boolean r1 = r2.moveToFirst()     // Catch:{ Exception -> 0x0031 }
            if (r1 == 0) goto L_0x0029
        L_0x001c:
            com.tencent.tmassistantsdk.downloadservice.DownloadInfo r1 = com.tencent.tmassistantsdk.downloadservice.DownloadInfo.readFromCursor(r2)     // Catch:{ Exception -> 0x0031 }
            r0.add(r1)     // Catch:{ Exception -> 0x0031 }
            boolean r1 = r2.moveToNext()     // Catch:{ Exception -> 0x0031 }
            if (r1 != 0) goto L_0x001c
        L_0x0029:
            if (r2 == 0) goto L_0x002e
            r2.close()
        L_0x002e:
            return r0
        L_0x002f:
            r0 = move-exception
            goto L_0x0042
        L_0x0031:
            r1 = move-exception
            java.lang.String r3 = "DownloadInfoTable"
            java.lang.String r4 = ""
            r5 = 0
            java.lang.Object[] r5 = new java.lang.Object[r5]     // Catch:{ all -> 0x002f }
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r3, r1, r4, r5)     // Catch:{ all -> 0x002f }
            if (r2 == 0) goto L_0x0041
            r2.close()
        L_0x0041:
            return r0
        L_0x0042:
            if (r2 == 0) goto L_0x0047
            r2.close()
        L_0x0047:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.tmassistantsdk.storage.table.DownloadInfoTable.load():java.util.ArrayList");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x002f, code lost:
        if (r6 != null) goto L_0x0044;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0042, code lost:
        if (r6 != null) goto L_0x0044;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0044, code lost:
        r6.close();
     */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x004b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.tencent.tmassistantsdk.downloadservice.DownloadInfo query(java.lang.String r6) {
        /*
            r0 = 0
            if (r6 == 0) goto L_0x004f
            int r1 = r6.length()
            if (r1 <= 0) goto L_0x004f
            r1 = 0
            com.tencent.tmassistantsdk.storage.helper.SqliteHelper r2 = com.tencent.tmassistantsdk.storage.helper.AstSDKDBHelper_V2.getInstance()     // Catch:{ Exception -> 0x0037, all -> 0x0032 }
            android.database.sqlite.SQLiteDatabase r2 = r2.getReadableDatabase()     // Catch:{ Exception -> 0x0037, all -> 0x0032 }
            java.lang.String r3 = "select * from downloadInfo where taskUrl = ?"
            r4 = 1
            java.lang.String[] r4 = new java.lang.String[r4]     // Catch:{ Exception -> 0x0037, all -> 0x0032 }
            r4[r1] = r6     // Catch:{ Exception -> 0x0037, all -> 0x0032 }
            android.database.Cursor r6 = r2.rawQuery(r3, r4)     // Catch:{ Exception -> 0x0037, all -> 0x0032 }
            if (r6 == 0) goto L_0x002f
            boolean r2 = r6.moveToFirst()     // Catch:{ Exception -> 0x002d }
            if (r2 == 0) goto L_0x002f
            com.tencent.tmassistantsdk.downloadservice.DownloadInfo r0 = com.tencent.tmassistantsdk.downloadservice.DownloadInfo.readFromCursor(r6)     // Catch:{ Exception -> 0x002d }
            r6.close()
            return r0
        L_0x002d:
            r2 = move-exception
            goto L_0x0039
        L_0x002f:
            if (r6 == 0) goto L_0x004f
            goto L_0x0044
        L_0x0032:
            r6 = move-exception
            r5 = r0
            r0 = r6
            r6 = r5
            goto L_0x0049
        L_0x0037:
            r2 = move-exception
            r6 = r0
        L_0x0039:
            java.lang.String r3 = "DownloadInfoTable"
            java.lang.String r4 = ""
            java.lang.Object[] r1 = new java.lang.Object[r1]     // Catch:{ all -> 0x0048 }
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r3, r2, r4, r1)     // Catch:{ all -> 0x0048 }
            if (r6 == 0) goto L_0x004f
        L_0x0044:
            r6.close()
            goto L_0x004f
        L_0x0048:
            r0 = move-exception
        L_0x0049:
            if (r6 == 0) goto L_0x004e
            r6.close()
        L_0x004e:
            throw r0
        L_0x004f:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.tmassistantsdk.storage.table.DownloadInfoTable.query(java.lang.String):com.tencent.tmassistantsdk.downloadservice.DownloadInfo");
    }

    public static void save(ArrayList<DownloadInfo> arrayList) {
        if (arrayList != null) {
            SQLiteDatabase writableDatabase = AstSDKDBHelper_V2.getInstance().getWritableDatabase();
            try {
                writableDatabase.beginTransaction();
                Iterator<DownloadInfo> it = arrayList.iterator();
                while (it.hasNext()) {
                    DownloadInfo next = it.next();
                    if (update(next, writableDatabase) <= 0) {
                        ContentValues contentValues = new ContentValues();
                        DownloadInfo.writeToContentValues(contentValues, next);
                        writableDatabase.insert(TABLE_NAME, (String) null, contentValues);
                    }
                }
                writableDatabase.setTransactionSuccessful();
            } catch (Exception e) {
                Log.printErrStackTrace(TAG, e, "", new Object[0]);
            } catch (Throwable th) {
                writableDatabase.endTransaction();
                throw th;
            }
            writableDatabase.endTransaction();
        }
    }

    private static int update(DownloadInfo downloadInfo, SQLiteDatabase sQLiteDatabase) {
        if (downloadInfo == null) {
            return -1;
        }
        try {
            ContentValues contentValues = new ContentValues();
            DownloadInfo.writeToContentValues(contentValues, downloadInfo);
            int update = sQLiteDatabase.update(TABLE_NAME, contentValues, "taskUrl = ?", new String[]{downloadInfo.mURL});
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

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0035, code lost:
        if (r7 != null) goto L_0x0037;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0037, code lost:
        r7.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0050, code lost:
        if (r7 != null) goto L_0x0037;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0053, code lost:
        r8.setTransactionSuccessful();
        r8.endTransaction();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:?, code lost:
        return;
     */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x005e  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void dataMovement(android.database.sqlite.SQLiteDatabase r7, android.database.sqlite.SQLiteDatabase r8) {
        /*
            r6 = this;
            java.lang.String r0 = "downloadInfo"
            if (r8 == 0) goto L_0x0062
            if (r7 == 0) goto L_0x0062
            r8.beginTransaction()
            r1 = 0
            java.lang.String r2 = "select * from downloadInfo"
            android.database.Cursor r7 = r7.rawQuery(r2, r1)     // Catch:{ Exception -> 0x003d, all -> 0x003b }
            if (r7 == 0) goto L_0x0035
            boolean r2 = r7.moveToFirst()     // Catch:{ Exception -> 0x0033 }
            if (r2 == 0) goto L_0x0035
            java.lang.String r2 = "start move data!"
            com.tencent.tmassistantsdk.util.TMLog.m164114i(r0, r2)     // Catch:{ Exception -> 0x0033 }
        L_0x001d:
            android.content.ContentValues r2 = new android.content.ContentValues     // Catch:{ Exception -> 0x0033 }
            r2.<init>()     // Catch:{ Exception -> 0x0033 }
            com.tencent.tmassistantsdk.downloadservice.DownloadInfo r3 = com.tencent.tmassistantsdk.downloadservice.DownloadInfo.readFromSimpleCursor(r7)     // Catch:{ Exception -> 0x0033 }
            com.tencent.tmassistantsdk.downloadservice.DownloadInfo.writeToContentValues(r2, r3)     // Catch:{ Exception -> 0x0033 }
            r8.insert(r0, r1, r2)     // Catch:{ Exception -> 0x0033 }
            boolean r2 = r7.moveToNext()     // Catch:{ Exception -> 0x0033 }
            if (r2 != 0) goto L_0x001d
            goto L_0x0035
        L_0x0033:
            r1 = move-exception
            goto L_0x0041
        L_0x0035:
            if (r7 == 0) goto L_0x0053
        L_0x0037:
            r7.close()
            goto L_0x0053
        L_0x003b:
            r8 = move-exception
            goto L_0x005c
        L_0x003d:
            r7 = move-exception
            r5 = r1
            r1 = r7
            r7 = r5
        L_0x0041:
            java.lang.String r2 = "DownloadInfoTable"
            java.lang.String r3 = ""
            r4 = 0
            java.lang.Object[] r4 = new java.lang.Object[r4]     // Catch:{ all -> 0x005a }
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r2, r1, r3, r4)     // Catch:{ all -> 0x005a }
            java.lang.String r1 = "move data exception!"
            com.tencent.tmassistantsdk.util.TMLog.m164114i(r0, r1)     // Catch:{ all -> 0x005a }
            if (r7 == 0) goto L_0x0053
            goto L_0x0037
        L_0x0053:
            r8.setTransactionSuccessful()
            r8.endTransaction()
            goto L_0x0062
        L_0x005a:
            r8 = move-exception
            r1 = r7
        L_0x005c:
            if (r1 == 0) goto L_0x0061
            r1.close()
        L_0x0061:
            throw r8
        L_0x0062:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.tmassistantsdk.storage.table.DownloadInfoTable.dataMovement(android.database.sqlite.SQLiteDatabase, android.database.sqlite.SQLiteDatabase):void");
    }

    public String[] getAlterSQL(int i, int i2) {
        return (i == 1 && i2 == 2) ? new String[]{"alter table downloadInfo add column headerParams TEXT;"} : new String[]{"alter table downloadInfo add column netType TEXT;", "alter table downloadInfo add column downloadFailedErrCode INTEGER;", "alter table downloadInfo add column downloadFailedTime INTEGER;"};
    }

    public SqliteHelper getHelper() {
        return AstSDKDBHelper_V2.getInstance();
    }

    public String tableName() {
        return TABLE_NAME;
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [java.lang.String[], android.database.Cursor] */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x004c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.util.ArrayList<com.tencent.tmassistantsdk.downloadservice.taskmanager.ServiceDownloadTask> query() {
        /*
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            com.tencent.tmassistantsdk.storage.helper.SqliteHelper r1 = com.tencent.tmassistantsdk.storage.helper.AstSDKDBHelper_V2.getInstance()
            android.database.sqlite.SQLiteDatabase r1 = r1.getReadableDatabase()
            r2 = 0
            java.lang.String r3 = "select a.taskUrl,a.status,b.clientId from downloadInfo as a left outer join clientinfo as b on a.taskUrl = b.taskUrl where b.clientId is not null and (a.status = 2 or a.status = 1)"
            android.database.Cursor r2 = r1.rawQuery(r3, r2)     // Catch:{ Exception -> 0x0052 }
            if (r2 == 0) goto L_0x004a
            boolean r1 = r2.moveToFirst()     // Catch:{ Exception -> 0x0052 }
            if (r1 == 0) goto L_0x004a
        L_0x001c:
            java.lang.String r1 = "clientId"
            int r1 = r2.getColumnIndex(r1)     // Catch:{ Exception -> 0x0052 }
            java.lang.String r1 = r2.getString(r1)     // Catch:{ Exception -> 0x0052 }
            java.lang.String r3 = "taskUrl"
            int r3 = r2.getColumnIndex(r3)     // Catch:{ Exception -> 0x0052 }
            java.lang.String r3 = r2.getString(r3)     // Catch:{ Exception -> 0x0052 }
            java.lang.String r4 = "status"
            int r4 = r2.getColumnIndex(r4)     // Catch:{ Exception -> 0x0052 }
            int r4 = r2.getInt(r4)     // Catch:{ Exception -> 0x0052 }
            com.tencent.tmassistantsdk.downloadservice.taskmanager.ServiceDownloadTask r5 = new com.tencent.tmassistantsdk.downloadservice.taskmanager.ServiceDownloadTask     // Catch:{ Exception -> 0x0052 }
            r5.<init>(r1, r3)     // Catch:{ Exception -> 0x0052 }
            r5.mState = r4     // Catch:{ Exception -> 0x0052 }
            r0.add(r5)     // Catch:{ Exception -> 0x0052 }
            boolean r1 = r2.moveToNext()     // Catch:{ Exception -> 0x0052 }
            if (r1 != 0) goto L_0x001c
        L_0x004a:
            if (r2 == 0) goto L_0x004f
            r2.close()
        L_0x004f:
            return r0
        L_0x0050:
            r0 = move-exception
            goto L_0x0063
        L_0x0052:
            r1 = move-exception
            java.lang.String r3 = "DownloadInfoTable"
            java.lang.String r4 = ""
            r5 = 0
            java.lang.Object[] r5 = new java.lang.Object[r5]     // Catch:{ all -> 0x0050 }
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r3, r1, r4, r5)     // Catch:{ all -> 0x0050 }
            if (r2 == 0) goto L_0x0062
            r2.close()
        L_0x0062:
            return r0
        L_0x0063:
            if (r2 == 0) goto L_0x0068
            r2.close()
        L_0x0068:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.tmassistantsdk.storage.table.DownloadInfoTable.query():java.util.ArrayList");
    }
}

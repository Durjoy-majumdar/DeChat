package com.tencent.tmassistantsdk.storage.table;

import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.tmassistantsdk.storage.helper.AstSDKDBHelper_V2;
import com.tencent.tmassistantsdk.storage.helper.SqliteHelper;

public class DownloadSettingTable implements ITableBase {
    public static final String CREATE_TABLE_SQL = "CREATE TABLE if not exists settingInfo( _id INTEGER PRIMARY KEY AUTOINCREMENT, settingField TEXT , value TEXT,type TEXT);";
    public static final String QUERY_SQL = "select * from settingInfo";
    public static final String TABLE_NAME = "settingInfo";
    private static final String TAG = "DownloadSettingTable";

    public class Columns {
        public static final String SETTINGFIELD = "settingField";
        public static final String TYPE = "type";
        public static final String VALUE = "value";

        public Columns() {
        }
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [java.lang.String[], android.database.Cursor] */
    /* JADX WARNING: type inference failed for: r1v1, types: [android.database.Cursor] */
    /* JADX WARNING: type inference failed for: r1v2, types: [android.database.Cursor] */
    /* JADX WARNING: Code restructure failed: missing block: B:10:0x003d, code lost:
        if (r1 != 0) goto L_0x003f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x003f, code lost:
        r1.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0050, code lost:
        if (r1 == 0) goto L_0x0053;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0053, code lost:
        return r0;
     */
    /* JADX WARNING: Failed to insert additional move for type inference */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.util.HashMap<java.lang.String, java.lang.String> query() {
        /*
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            r1 = 0
            com.tencent.tmassistantsdk.storage.helper.SqliteHelper r2 = com.tencent.tmassistantsdk.storage.helper.AstSDKDBHelper_V2.getInstance()     // Catch:{ Exception -> 0x0045 }
            android.database.sqlite.SQLiteDatabase r2 = r2.getReadableDatabase()     // Catch:{ Exception -> 0x0045 }
            java.lang.String r3 = "select * from settingInfo"
            android.database.Cursor r1 = r2.rawQuery(r3, r1)     // Catch:{ Exception -> 0x0045 }
            if (r1 == 0) goto L_0x003d
            boolean r2 = r1.moveToFirst()     // Catch:{ Exception -> 0x0045 }
            if (r2 == 0) goto L_0x003d
        L_0x001c:
            java.lang.String r2 = "settingField"
            int r2 = r1.getColumnIndex(r2)     // Catch:{ Exception -> 0x0045 }
            java.lang.String r2 = r1.getString(r2)     // Catch:{ Exception -> 0x0045 }
            java.lang.String r3 = "value"
            int r3 = r1.getColumnIndex(r3)     // Catch:{ Exception -> 0x0045 }
            java.lang.String r3 = r1.getString(r3)     // Catch:{ Exception -> 0x0045 }
            r0.put(r2, r3)     // Catch:{ Exception -> 0x0045 }
            boolean r2 = r1.moveToNext()     // Catch:{ Exception -> 0x0045 }
            if (r2 != 0) goto L_0x001c
            r1.close()
            return r0
        L_0x003d:
            if (r1 == 0) goto L_0x0053
        L_0x003f:
            r1.close()
            goto L_0x0053
        L_0x0043:
            r0 = move-exception
            goto L_0x0054
        L_0x0045:
            r2 = move-exception
            java.lang.String r3 = "DownloadSettingTable"
            java.lang.String r4 = ""
            r5 = 0
            java.lang.Object[] r5 = new java.lang.Object[r5]     // Catch:{ all -> 0x0043 }
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r3, r2, r4, r5)     // Catch:{ all -> 0x0043 }
            if (r1 == 0) goto L_0x0053
            goto L_0x003f
        L_0x0053:
            return r0
        L_0x0054:
            if (r1 == 0) goto L_0x0059
            r1.close()
        L_0x0059:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.tmassistantsdk.storage.table.DownloadSettingTable.query():java.util.HashMap");
    }

    public static void save(String str, String str2, String str3) {
        if (str != null && str2 != null) {
            try {
                SQLiteDatabase writableDatabase = AstSDKDBHelper_V2.getInstance().getWritableDatabase();
                if (update(str, str2, str3, writableDatabase) <= 0) {
                    ContentValues contentValues = new ContentValues();
                    contentValues.put(Columns.SETTINGFIELD, str);
                    contentValues.put("value", str2);
                    contentValues.put("type", str3);
                    writableDatabase.insert(TABLE_NAME, (String) null, contentValues);
                }
            } catch (Exception e) {
                Log.printErrStackTrace(TAG, e, "", new Object[0]);
            }
        }
    }

    private static int update(String str, String str2, String str3, SQLiteDatabase sQLiteDatabase) {
        if (str == null || str2 == null) {
            return -1;
        }
        try {
            ContentValues contentValues = new ContentValues();
            contentValues.put(Columns.SETTINGFIELD, str);
            contentValues.put("value", str2);
            contentValues.put("type", str3);
            int update = sQLiteDatabase.update(TABLE_NAME, contentValues, "settingField = ?", new String[]{str});
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

    public void dataMovement(SQLiteDatabase sQLiteDatabase, SQLiteDatabase sQLiteDatabase2) {
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
}

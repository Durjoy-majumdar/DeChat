package com.tencent.tmassistantsdk.storage.table;

import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteStatement;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.tmassistantsdk.storage.helper.AstSDKDBHelper_V2;
import com.tencent.tmassistantsdk.storage.helper.SqliteHelper;
import java.util.List;

public abstract class BaseLogTable implements ITableBase {
    private static final String TAG = "BaseLogTable";

    public static class DataWrapper {
        public List<byte[]> dataList;
        public List<Long> idList;
    }

    public String createTableSQL() {
        return getCreateTableSQL();
    }

    public void dataMovement(SQLiteDatabase sQLiteDatabase, SQLiteDatabase sQLiteDatabase2) {
    }

    public boolean delete(List<Long> list) {
        if (list == null || list.size() <= 0) {
            return false;
        }
        StringBuffer stringBuffer = new StringBuffer("(");
        for (Long append : list) {
            stringBuffer.append(append);
            stringBuffer.append(",");
        }
        if (stringBuffer.length() > 0) {
            stringBuffer.deleteCharAt(stringBuffer.length() - 1);
        }
        stringBuffer.append(")");
        SQLiteDatabase writableDatabase = getHelper().getWritableDatabase();
        String tableName = getTableName();
        writableDatabase.delete(tableName, "_id in " + stringBuffer, (String[]) null);
        return true;
    }

    public abstract String[] getAlterSQL(int i);

    public String[] getAlterSQL(int i, int i2) {
        return getAlterSQL(i2);
    }

    public abstract String getCreateTableSQL();

    /* JADX WARNING: Removed duplicated region for block: B:24:0x008a  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x0092  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.tencent.tmassistantsdk.storage.table.BaseLogTable.DataWrapper getDatas(int r12) {
        /*
            r11 = this;
            com.tencent.tmassistantsdk.storage.table.BaseLogTable$DataWrapper r0 = new com.tencent.tmassistantsdk.storage.table.BaseLogTable$DataWrapper
            r0.<init>()
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            r0.idList = r1
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            r0.dataList = r1
            r1 = 0
            if (r12 <= 0) goto L_0x0029
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "0,"
            r2.append(r3)
            r2.append(r12)
            java.lang.String r12 = r2.toString()
            r10 = r12
            goto L_0x002a
        L_0x0029:
            r10 = r1
        L_0x002a:
            com.tencent.tmassistantsdk.storage.helper.SqliteHelper r12 = r11.getHelper()
            android.database.sqlite.SQLiteDatabase r2 = r12.getReadableDatabase()
            java.lang.String r3 = r11.getTableName()     // Catch:{ Exception -> 0x007c, all -> 0x007a }
            r4 = 0
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            java.lang.String r9 = "_id asc"
            android.database.Cursor r12 = r2.query(r3, r4, r5, r6, r7, r8, r9, r10)     // Catch:{ Exception -> 0x007c, all -> 0x007a }
            if (r12 == 0) goto L_0x0074
            boolean r2 = r12.moveToFirst()     // Catch:{ Exception -> 0x0072 }
            if (r2 == 0) goto L_0x0074
        L_0x0049:
            java.lang.String r2 = "_id"
            int r2 = r12.getColumnIndex(r2)     // Catch:{ Exception -> 0x0072 }
            long r2 = r12.getLong(r2)     // Catch:{ Exception -> 0x0072 }
            java.util.List<java.lang.Long> r4 = r0.idList     // Catch:{ Exception -> 0x0072 }
            java.lang.Long r2 = java.lang.Long.valueOf(r2)     // Catch:{ Exception -> 0x0072 }
            r4.add(r2)     // Catch:{ Exception -> 0x0072 }
            java.lang.String r2 = "logData"
            int r2 = r12.getColumnIndex(r2)     // Catch:{ Exception -> 0x0072 }
            byte[] r2 = r12.getBlob(r2)     // Catch:{ Exception -> 0x0072 }
            java.util.List<byte[]> r3 = r0.dataList     // Catch:{ Exception -> 0x0072 }
            r3.add(r2)     // Catch:{ Exception -> 0x0072 }
            boolean r2 = r12.moveToNext()     // Catch:{ Exception -> 0x0072 }
            if (r2 != 0) goto L_0x0049
            goto L_0x0074
        L_0x0072:
            r0 = move-exception
            goto L_0x007e
        L_0x0074:
            if (r12 == 0) goto L_0x0079
            r12.close()
        L_0x0079:
            return r0
        L_0x007a:
            r0 = move-exception
            goto L_0x0090
        L_0x007c:
            r0 = move-exception
            r12 = r1
        L_0x007e:
            java.lang.String r2 = "BaseLogTable"
            java.lang.String r3 = ""
            r4 = 0
            java.lang.Object[] r4 = new java.lang.Object[r4]     // Catch:{ all -> 0x008e }
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r2, r0, r3, r4)     // Catch:{ all -> 0x008e }
            if (r12 == 0) goto L_0x008d
            r12.close()
        L_0x008d:
            return r1
        L_0x008e:
            r0 = move-exception
            r1 = r12
        L_0x0090:
            if (r1 == 0) goto L_0x0095
            r1.close()
        L_0x0095:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.tmassistantsdk.storage.table.BaseLogTable.getDatas(int):com.tencent.tmassistantsdk.storage.table.BaseLogTable$DataWrapper");
    }

    public SqliteHelper getHelper() {
        return AstSDKDBHelper_V2.getInstance();
    }

    public abstract String getInsertSQL();

    public abstract String getTableName();

    public boolean save(byte[] bArr) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("logData", bArr);
        return getHelper().getWritableDatabase().insert(getTableName(), (String) null, contentValues) > 0;
    }

    public String tableName() {
        return getTableName();
    }

    public boolean save(List<byte[]> list) {
        SQLiteDatabase writableDatabase = getHelper().getWritableDatabase();
        try {
            writableDatabase.beginTransaction();
            SQLiteStatement compileStatement = writableDatabase.compileStatement(getInsertSQL());
            for (byte[] bindBlob : list) {
                compileStatement.bindBlob(1, bindBlob);
                compileStatement.executeInsert();
            }
            writableDatabase.setTransactionSuccessful();
            return true;
        } catch (Exception e) {
            Log.printErrStackTrace(TAG, e, "", new Object[0]);
            return false;
        } finally {
            writableDatabase.endTransaction();
        }
    }
}

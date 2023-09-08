package com.tencent.tmassistantsdk.channel;

import a70.C112760b;
import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.net.Uri;
import android.os.SystemClock;
import com.tencent.p014mm.vfs.C116281f0;
import com.tencent.p014mm.vfs.C116299g2;
import com.tencent.p014mm.vfs.C86013q1;
import java.util.ArrayList;

public class DBOption {
    public static final String CREATE_TABLE_SQL = "CREATE TABLE if not exists channeldata( itemId INTEGER PRIMARY KEY AUTOINCREMENT, itemData BLOB);";
    public static final int DATEBASE_VERSION = 1;
    public static final String DB_NAME = ".SystemConfig.db";
    public static final String QUERY_ALL_SQL = "select * from channeldata";
    public static final String TABLE_NAME = "channeldata";
    public String DB_PATH = "";

    public DBOption() {
        String str = C112760b.m154195C() + "/assistant/";
        this.DB_PATH = str;
        Uri n = C116299g2.m163858n(str);
        String path = n.getPath();
        if (path != null) {
            String k = C116299g2.m163855k(path, false, false);
            if (!n.getPath().equals(k)) {
                n = n.buildUpon().path(k).build();
            }
        }
        C116281f0.C116288h l = C116281f0.C116289i.f348994a.mo177799l(n, (C116281f0.C116288h) null);
        if (l.mo177810a()) {
            l.f348991a.mo119937g(l.f348992b);
        }
        this.DB_PATH += DB_NAME;
    }

    private void checkAndCreateTable(SQLiteDatabase sQLiteDatabase) {
        int version = sQLiteDatabase.getVersion();
        if (version != 1) {
            sQLiteDatabase.beginTransaction();
            if (version == 0) {
                try {
                    sQLiteDatabase.execSQL(CREATE_TABLE_SQL);
                } catch (Throwable th) {
                    sQLiteDatabase.endTransaction();
                    throw th;
                }
            }
            sQLiteDatabase.setVersion(1);
            sQLiteDatabase.setTransactionSuccessful();
            sQLiteDatabase.endTransaction();
        }
    }

    private void closeDB(SQLiteDatabase sQLiteDatabase) {
        if (sQLiteDatabase != null && sQLiteDatabase.isOpen()) {
            try {
                sQLiteDatabase.close();
            } catch (Exception unused) {
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0060, code lost:
        return r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private synchronized android.database.sqlite.SQLiteDatabase getReadableDatabase() {
        /*
            r6 = this;
            monitor-enter(r6)
            java.lang.String r0 = r6.DB_PATH     // Catch:{ all -> 0x0061 }
            android.net.Uri r0 = com.tencent.p014mm.vfs.C116299g2.m163858n(r0)     // Catch:{ all -> 0x0061 }
            java.lang.String r1 = r0.getPath()     // Catch:{ all -> 0x0061 }
            r2 = 0
            if (r1 == 0) goto L_0x0028
            java.lang.String r1 = com.tencent.p014mm.vfs.C116299g2.m163855k(r1, r2, r2)     // Catch:{ all -> 0x0061 }
            java.lang.String r3 = r0.getPath()     // Catch:{ all -> 0x0061 }
            boolean r3 = r3.equals(r1)     // Catch:{ all -> 0x0061 }
            if (r3 != 0) goto L_0x0028
            android.net.Uri$Builder r0 = r0.buildUpon()     // Catch:{ all -> 0x0061 }
            android.net.Uri$Builder r0 = r0.path(r1)     // Catch:{ all -> 0x0061 }
            android.net.Uri r0 = r0.build()     // Catch:{ all -> 0x0061 }
        L_0x0028:
            com.tencent.mm.vfs.f0 r1 = com.tencent.p014mm.vfs.C116281f0.C116289i.f348994a     // Catch:{ all -> 0x0061 }
            r3 = 0
            com.tencent.mm.vfs.f0$h r0 = r1.mo177799l(r0, r3)     // Catch:{ all -> 0x0061 }
            boolean r1 = r0.mo177810a()     // Catch:{ all -> 0x0061 }
            if (r1 != 0) goto L_0x0037
            r0 = 0
            goto L_0x003f
        L_0x0037:
            com.tencent.mm.vfs.FileSystem$c r1 = r0.f348991a     // Catch:{ all -> 0x0061 }
            java.lang.String r0 = r0.f348992b     // Catch:{ all -> 0x0061 }
            boolean r0 = r1.mo119948x(r0)     // Catch:{ all -> 0x0061 }
        L_0x003f:
            if (r0 != 0) goto L_0x0043
            monitor-exit(r6)
            return r3
        L_0x0043:
            r0 = r3
        L_0x0044:
            r1 = 20
            if (r2 >= r1) goto L_0x005f
            java.lang.String r1 = r6.DB_PATH     // Catch:{ SQLiteException -> 0x0054 }
            r4 = 1
            java.lang.String r1 = com.tencent.p014mm.vfs.C86013q1.m106448i(r1, r4)     // Catch:{ SQLiteException -> 0x0054 }
            android.database.sqlite.SQLiteDatabase r0 = android.database.sqlite.SQLiteDatabase.openDatabase(r1, r3, r4)     // Catch:{ SQLiteException -> 0x0054 }
            goto L_0x0055
        L_0x0054:
        L_0x0055:
            if (r0 != 0) goto L_0x005f
            r4 = 50
            android.os.SystemClock.sleep(r4)     // Catch:{ all -> 0x0061 }
            int r2 = r2 + 1
            goto L_0x0044
        L_0x005f:
            monitor-exit(r6)
            return r0
        L_0x0061:
            r0 = move-exception
            monitor-exit(r6)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.tmassistantsdk.channel.DBOption.getReadableDatabase():android.database.sqlite.SQLiteDatabase");
    }

    private SQLiteDatabase getWritableDatabase() {
        int i = 0;
        SQLiteDatabase sQLiteDatabase = null;
        while (true) {
            if (i >= 20) {
                break;
            }
            try {
                sQLiteDatabase = SQLiteDatabase.openOrCreateDatabase(C86013q1.m106448i(this.DB_PATH, true), (SQLiteDatabase.CursorFactory) null);
            } catch (SQLiteException unused) {
            }
            if (sQLiteDatabase != null) {
                checkAndCreateTable(sQLiteDatabase);
                break;
            }
            SystemClock.sleep(50);
            i++;
        }
        return sQLiteDatabase;
    }

    public boolean delete(long j) {
        SQLiteDatabase writableDatabase = getWritableDatabase();
        if (writableDatabase == null) {
            return false;
        }
        writableDatabase.delete(TABLE_NAME, "itemId=?", new String[]{j + ""});
        closeDB(writableDatabase);
        return true;
    }

    public long insert(TMAssistantSDKChannelDataItem tMAssistantSDKChannelDataItem) {
        byte[] buffer;
        SQLiteDatabase writableDatabase;
        if (tMAssistantSDKChannelDataItem == null || (buffer = tMAssistantSDKChannelDataItem.getBuffer()) == null || (writableDatabase = getWritableDatabase()) == null) {
            return -1;
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put("itemData", buffer);
        long insert = writableDatabase.insert(TABLE_NAME, "", contentValues);
        closeDB(writableDatabase);
        return insert;
    }

    public ArrayList<TMAssistantSDKChannelDataItem> queryAll() {
        SQLiteDatabase readableDatabase = getReadableDatabase();
        ArrayList<TMAssistantSDKChannelDataItem> arrayList = null;
        if (readableDatabase != null) {
            Cursor rawQuery = readableDatabase.rawQuery(QUERY_ALL_SQL, (String[]) null);
            if (rawQuery != null && rawQuery.moveToFirst()) {
                int columnIndex = rawQuery.getColumnIndex("itemId");
                int columnIndex2 = rawQuery.getColumnIndex("itemData");
                ArrayList<TMAssistantSDKChannelDataItem> arrayList2 = new ArrayList<>();
                do {
                    int i = rawQuery.getInt(columnIndex);
                    TMAssistantSDKChannelDataItem dataItemFromByte = TMAssistantSDKChannelDataItem.getDataItemFromByte(rawQuery.getBlob(columnIndex2));
                    if (dataItemFromByte != null) {
                        dataItemFromByte.mDBIdentity = i;
                        arrayList2.add(dataItemFromByte);
                    }
                } while (rawQuery.moveToNext());
                closeDB(readableDatabase);
                arrayList = arrayList2;
            }
            rawQuery.close();
            closeDB(readableDatabase);
        }
        return arrayList;
    }
}

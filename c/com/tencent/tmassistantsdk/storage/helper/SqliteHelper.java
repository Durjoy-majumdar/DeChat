package com.tencent.tmassistantsdk.storage.helper;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.os.SystemClock;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.tmassistantsdk.storage.table.ITableBase;
import com.tencent.tmassistantsdk.util.GlobalUtil;
import com.tencent.tmassistantsdk.util.TMLog;

public abstract class SqliteHelper extends SQLiteOpenHelper {
    private static final String TAG = "MicroMsg.SqliteHelper";

    public SqliteHelper(Context context, String str, SQLiteDatabase.CursorFactory cursorFactory, int i) {
        super(context, str, cursorFactory, i);
    }

    private void createTable(SQLiteDatabase sQLiteDatabase) {
        TMLog.m164114i("sqliteHelper", "tables count:" + getTables().length);
        for (Class newInstance : getTables()) {
            try {
                ITableBase iTableBase = (ITableBase) newInstance.newInstance();
                String createTableSQL = iTableBase.createTableSQL();
                if (createTableSQL != null && createTableSQL.length() > 0) {
                    sQLiteDatabase.execSQL(createTableSQL);
                }
                TMLog.m164114i("sqliteHelper", "sql=" + createTableSQL);
                if (GlobalUtil.isDBExist(AstSDKDBHelper.DB_NAME)) {
                    TMLog.m164114i("sqliteHelper", "dataMovement");
                    iTableBase.dataMovement(AstSDKDBHelper.getInstance().getReadableDatabase(), sQLiteDatabase);
                }
            } catch (InstantiationException e) {
                Log.printErrStackTrace(TAG, e, "", new Object[0]);
            } catch (IllegalAccessException e2) {
                Log.printErrStackTrace(TAG, e2, "", new Object[0]);
            }
        }
        GlobalUtil.deleteOldDB(AstSDKDBHelper.DB_NAME);
    }

    private void deleteTable(SQLiteDatabase sQLiteDatabase) {
        for (Class newInstance : getTables()) {
            try {
                sQLiteDatabase.delete(((ITableBase) newInstance.newInstance()).tableName(), (String) null, (String[]) null);
            } catch (InstantiationException e) {
                Log.printErrStackTrace(TAG, e, "", new Object[0]);
            } catch (IllegalAccessException e2) {
                Log.printErrStackTrace(TAG, e2, "", new Object[0]);
            }
        }
    }

    public abstract int getDBVersion();

    public synchronized SQLiteDatabase getReadableDatabase() {
        SQLiteDatabase sQLiteDatabase;
        try {
            sQLiteDatabase = super.getReadableDatabase();
        } catch (Exception e) {
            Log.printErrStackTrace(TAG, e, "", new Object[0]);
            sQLiteDatabase = null;
        }
        while (true) {
            if (sQLiteDatabase.isDbLockedByCurrentThread() || sQLiteDatabase.isDbLockedByOtherThreads()) {
                SystemClock.sleep(10);
            }
        }
        return sQLiteDatabase;
    }

    public abstract Class<?>[] getTables();

    public synchronized SQLiteDatabase getWritableDatabase() {
        SQLiteDatabase sQLiteDatabase;
        try {
            sQLiteDatabase = super.getWritableDatabase();
        } catch (Exception e) {
            Log.printErrStackTrace(TAG, e, "", new Object[0]);
            sQLiteDatabase = null;
        }
        while (true) {
            if (sQLiteDatabase.isDbLockedByCurrentThread() || sQLiteDatabase.isDbLockedByOtherThreads()) {
                SystemClock.sleep(10);
            }
        }
        return sQLiteDatabase;
    }

    public void onCreate(SQLiteDatabase sQLiteDatabase) {
        createTable(sQLiteDatabase);
    }

    public void onDowngrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        deleteTable(sQLiteDatabase);
        createTable(sQLiteDatabase);
    }

    public void onOpen(SQLiteDatabase sQLiteDatabase) {
        super.onOpen(sQLiteDatabase);
        int version = sQLiteDatabase.getVersion();
        TMLog.m164114i("sqliteHelper", " dbversion:" + version + " newVersion:" + getDBVersion());
        if (version != 0) {
            if (version < getDBVersion()) {
                onUpgrade(sQLiteDatabase, version, getDBVersion());
            } else if (version > getDBVersion()) {
                onDowngrade(sQLiteDatabase, version, getDBVersion());
            }
        }
    }

    public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        while (i < i2) {
            for (Class newInstance : getTables()) {
                try {
                    String[] alterSQL = ((ITableBase) newInstance.newInstance()).getAlterSQL(i, i + 1);
                    TMLog.m164114i("sqliteHelper", " upgrade:" + alterSQL);
                    if (alterSQL != null) {
                        for (String execSQL : alterSQL) {
                            sQLiteDatabase.execSQL(execSQL);
                        }
                    }
                } catch (Exception e) {
                    Log.printErrStackTrace(TAG, e, "", new Object[0]);
                }
            }
            i++;
        }
    }
}

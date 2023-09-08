package com.tencent.tmassistantsdk.storage.helper;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import com.tencent.tmassistantsdk.storage.table.ClientInfoTable;
import com.tencent.tmassistantsdk.storage.table.DownloadInfoTable;
import com.tencent.tmassistantsdk.storage.table.DownloadLogTable;
import com.tencent.tmassistantsdk.storage.table.DownloadSettingTable;
import com.tencent.tmassistantsdk.storage.table.TipsInfoLogTable;
import com.tencent.tmassistantsdk.util.GlobalUtil;

public class AstSDKDBHelper extends SqliteHelper {
    public static final String DB_NAME = "tmassistant_sdk.db";
    public static final int DB_VERSION = 2;
    private static final Class<?>[] TABLESS = {DownloadInfoTable.class, DownloadSettingTable.class, ClientInfoTable.class, TipsInfoLogTable.class, DownloadLogTable.class};
    public static SqliteHelper mInstance;

    public AstSDKDBHelper(Context context, String str, SQLiteDatabase.CursorFactory cursorFactory, int i) {
        super(context, DB_NAME, cursorFactory, i);
    }

    public static synchronized SqliteHelper getInstance() {
        SqliteHelper sqliteHelper;
        Context context;
        synchronized (AstSDKDBHelper.class) {
            if (mInstance == null && (context = GlobalUtil.getInstance().getContext()) != null) {
                mInstance = new AstSDKDBHelper(context, DB_NAME, (SQLiteDatabase.CursorFactory) null, 2);
            }
            sqliteHelper = mInstance;
        }
        return sqliteHelper;
    }

    public int getDBVersion() {
        return 2;
    }

    public Class<?>[] getTables() {
        return TABLESS;
    }
}

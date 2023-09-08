package com.tencent.tmassistantsdk.storage.helper;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import com.tencent.tmassistantsdk.storage.table.ClientInfoTable;
import com.tencent.tmassistantsdk.storage.table.DownloadInfoTable;
import com.tencent.tmassistantsdk.storage.table.DownloadLogTable;
import com.tencent.tmassistantsdk.storage.table.DownloadSettingTable;
import com.tencent.tmassistantsdk.storage.table.TipsInfoLogTable;
import com.tencent.tmassistantsdk.storage.table.UpdateInfoLogTable;
import com.tencent.tmassistantsdk.util.GlobalUtil;

public class AstSDKDBHelper_V2 extends SqliteHelper {
    public static final String DB_NAME = "tmassistant_sdk_v2.db";
    public static final int DB_VERSION = 3;
    private static final Class<?>[] TABLESS = {DownloadInfoTable.class, DownloadSettingTable.class, ClientInfoTable.class, TipsInfoLogTable.class, DownloadLogTable.class, UpdateInfoLogTable.class};
    public static SqliteHelper mInstance;

    public AstSDKDBHelper_V2(Context context, String str, SQLiteDatabase.CursorFactory cursorFactory, int i) {
        super(context, str, cursorFactory, i);
    }

    public static synchronized SqliteHelper getInstance() {
        SqliteHelper sqliteHelper;
        Context context;
        synchronized (AstSDKDBHelper_V2.class) {
            if (mInstance == null && (context = GlobalUtil.getInstance().getContext()) != null) {
                mInstance = new AstSDKDBHelper_V2(context, DB_NAME, (SQLiteDatabase.CursorFactory) null, 3);
            }
            sqliteHelper = mInstance;
        }
        return sqliteHelper;
    }

    public int getDBVersion() {
        return 3;
    }

    public Class<?>[] getTables() {
        return TABLESS;
    }
}

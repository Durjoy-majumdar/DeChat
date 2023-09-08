package com.tencent.kinda.framework.app;

import android.database.Cursor;
import com.tencent.p014mm.sdk.storage.ISQLiteDatabase;
import com.tencent.p014mm.sdk.storage.MAutoStorage;

public class KindaCacheStg extends MAutoStorage<KindaCacheItem> {
    public static final String[] SQL_CREATE = {MAutoStorage.getCreateSQLs(KindaCacheItem.info, "KindaCacheTable")};
    public static final String TABLE_NAME = "KindaCacheTable";
    public static final String TAG = "MicroMsg.KindaCacheStg";

    /* renamed from: db */
    private ISQLiteDatabase f78564db;

    public KindaCacheStg(ISQLiteDatabase iSQLiteDatabase) {
        super(iSQLiteDatabase, KindaCacheItem.info, "KindaCacheTable", (String[]) null);
        this.f78564db = iSQLiteDatabase;
    }

    public KindaCacheItem get(String str) {
        Cursor rawQuery = this.f78564db.rawQuery("select * from KindaCacheTable where key=?", new String[]{str});
        if (rawQuery == null) {
            return null;
        }
        if (rawQuery.getCount() == 0) {
            rawQuery.close();
            return null;
        }
        rawQuery.moveToFirst();
        KindaCacheItem kindaCacheItem = new KindaCacheItem();
        kindaCacheItem.convertFrom(rawQuery);
        rawQuery.close();
        return kindaCacheItem;
    }

    public void save(KindaCacheItem kindaCacheItem) {
        super.replace(kindaCacheItem);
    }
}

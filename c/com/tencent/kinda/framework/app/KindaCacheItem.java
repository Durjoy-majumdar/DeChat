package com.tencent.kinda.framework.app;

import android.content.ContentValues;
import android.database.Cursor;
import com.tencent.p014mm.sdk.storage.IAutoDBItem;
import p749xh.C66268o5;

public class KindaCacheItem extends C66268o5 {
    private static final String TAG = "MicroMsg.KindaCacheItem";
    public static IAutoDBItem.MAutoDBInfo info = C66268o5.initAutoDBInfo(C66268o5.class);

    public void convertFrom(Cursor cursor) {
        super.convertFrom(cursor);
    }

    public ContentValues convertTo() {
        return super.convertTo();
    }

    public IAutoDBItem.MAutoDBInfo getDBInfo() {
        return info;
    }
}

package com.tencent.kinda.framework.app;

import android.content.ContentValues;
import android.database.Cursor;
import com.tencent.p014mm.sdk.storage.IAutoDBItem;
import p749xh.C66271p5;

public class KindaConfigCacheItem extends C66271p5 {
    private static final String TAG = "MicroMsg.KindaConfigCacheItem";
    public static final int TYPE_BOOLEAN = 4;
    public static final int TYPE_BYTE = 7;
    public static final int TYPE_DOUBLE = 6;
    public static final int TYPE_FLOAT = 5;
    public static final int TYPE_INT = 1;
    public static final int TYPE_LONG = 2;
    public static final int TYPE_STRING = 3;
    public static IAutoDBItem.MAutoDBInfo info = C66271p5.initAutoDBInfo(C66271p5.class);

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

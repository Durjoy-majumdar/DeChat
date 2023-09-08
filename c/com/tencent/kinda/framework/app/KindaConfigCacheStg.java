package com.tencent.kinda.framework.app;

import android.database.Cursor;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.sdk.storage.ISQLiteDatabase;
import com.tencent.p014mm.sdk.storage.MAutoStorage;
import java.nio.charset.Charset;

public class KindaConfigCacheStg extends MAutoStorage<KindaConfigCacheItem> {
    public static final String SAVE_CHARSET = "ISO-8859-1";
    public static final String[] SQL_CREATE = {MAutoStorage.getCreateSQLs(KindaConfigCacheItem.info, "KindaConfigCache")};
    public static final String TABLE_NAME = "KindaConfigCache";
    public static final String TAG = "MicroMsg.KindaConfigCacheStg";

    /* renamed from: db */
    private ISQLiteDatabase f78565db;

    public KindaConfigCacheStg(ISQLiteDatabase iSQLiteDatabase) {
        super(iSQLiteDatabase, KindaConfigCacheItem.info, "KindaConfigCache", (String[]) null);
        this.f78565db = iSQLiteDatabase;
    }

    private KindaConfigCacheItem getImpl(String str) {
        Cursor rawQuery = this.f78565db.rawQuery("select * from KindaConfigCache where key=?", new String[]{str});
        if (rawQuery == null) {
            return null;
        }
        if (rawQuery.getCount() == 0) {
            rawQuery.close();
            return null;
        }
        rawQuery.moveToFirst();
        KindaConfigCacheItem kindaConfigCacheItem = new KindaConfigCacheItem();
        kindaConfigCacheItem.convertFrom(rawQuery);
        rawQuery.close();
        return kindaConfigCacheItem;
    }

    public static Object resolveObj(int i, String str) {
        switch (i) {
            case 1:
                return Integer.valueOf(Util.getInt(str, 0));
            case 2:
                return Long.valueOf(Util.getLong(str, 0));
            case 3:
                return str;
            case 4:
                return Boolean.valueOf(str);
            case 5:
                return Float.valueOf(Util.getFloat(str, 0.0f));
            case 6:
                return Double.valueOf(Util.getDouble(str, 0.0d));
            case 7:
                try {
                    return str.getBytes();
                } catch (Exception unused) {
                    Log.m105921e(TAG, "exception:%s", "");
                    return null;
                }
            default:
                return null;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0007, code lost:
        r2 = resolveObj(r2.field_type, r2.field_value);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object get(java.lang.String r2, java.lang.Object r3) {
        /*
            r1 = this;
            com.tencent.kinda.framework.app.KindaConfigCacheItem r2 = r1.getImpl(r2)
            if (r2 != 0) goto L_0x0007
            return r3
        L_0x0007:
            int r0 = r2.field_type
            java.lang.String r2 = r2.field_value
            java.lang.Object r2 = resolveObj(r0, r2)
            if (r2 == 0) goto L_0x0012
            return r2
        L_0x0012:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.kinda.framework.app.KindaConfigCacheStg.get(java.lang.String, java.lang.Object):java.lang.Object");
    }

    public byte[] getBinary(String str) {
        return (byte[]) get(str, new byte[0]);
    }

    public int getInt(String str) {
        return ((Integer) get(str, 0)).intValue();
    }

    public long getLong(String str) {
        return ((Long) get(str, 0L)).longValue();
    }

    public String getString(String str) {
        return (String) get(str, "");
    }

    public void put(String str, Object obj, int i) {
        put(str, obj, i, 0);
    }

    public void putBinary(String str, byte[] bArr) {
        put(str, bArr, 7);
    }

    public void putInt(String str, int i) {
        put(str, Integer.valueOf(i), 1);
    }

    public void putLong(String str, long j) {
        put(str, Long.valueOf(j), 2);
    }

    public void putString(String str, String str2) {
        put(str, str2, 3);
    }

    public void put(String str, Object obj, int i, long j) {
        KindaConfigCacheItem kindaConfigCacheItem = new KindaConfigCacheItem();
        kindaConfigCacheItem.field_type = i;
        kindaConfigCacheItem.field_key = str;
        kindaConfigCacheItem.field_expire_at = j;
        if (i == 1 && (obj instanceof Integer)) {
            kindaConfigCacheItem.field_value = obj.toString();
        } else if (i == 4 && (obj instanceof Integer)) {
            kindaConfigCacheItem.field_value = obj.toString();
        } else if (i == 6 && (obj instanceof Double)) {
            kindaConfigCacheItem.field_value = obj.toString();
        } else if (i == 5 && (obj instanceof Float)) {
            kindaConfigCacheItem.field_value = obj.toString();
        } else if (i == 2 && (obj instanceof Long)) {
            kindaConfigCacheItem.field_value = obj.toString();
        } else if (i == 3 && (obj instanceof String)) {
            kindaConfigCacheItem.field_value = obj.toString();
        } else if (i == 7 && (obj instanceof byte[])) {
            kindaConfigCacheItem.field_value = new String((byte[]) obj, Charset.forName(SAVE_CHARSET));
        } else {
            return;
        }
        replace(kindaConfigCacheItem);
    }

    public void putBinary(String str, byte[] bArr, long j) {
        put(str, bArr, 7, j);
    }

    public void putInt(String str, int i, long j) {
        put(str, Integer.valueOf(i), 1, j);
    }

    public void putLong(String str, long j, long j2) {
        put(str, Long.valueOf(j), 2, j2);
    }

    public void putString(String str, String str2, long j) {
        put(str, str2, 3, j);
    }
}

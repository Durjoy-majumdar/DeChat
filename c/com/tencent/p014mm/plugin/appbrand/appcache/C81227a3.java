package com.tencent.p014mm.plugin.appbrand.appcache;

import android.content.ContentValues;
import android.database.Cursor;
import com.tencent.p014mm.sdk.storage.IAutoDBItem;
import java.lang.reflect.Array;
import java.util.Locale;
import p749xh.C38537c0;
import tr0.C37240b;

/* renamed from: com.tencent.mm.plugin.appbrand.appcache.a3 */
public final class C81227a3 extends C29222i implements C37240b {

    /* renamed from: H */
    public static final String[] f238597H = {String.format(Locale.ENGLISH, "CREATE INDEX IF NOT EXISTS %sPkgPathIndex ON %s(%s)", new Object[]{"AppBrandWxaPkgManifestRecordWithDesc", "AppBrandWxaPkgManifestRecordWithDesc", "pkgPath"})};

    /* renamed from: I */
    public static final String[] f238598I;

    /* renamed from: J */
    public static final IAutoDBItem.MAutoDBInfo f238599J;
    public String field_versionDesc;

    static {
        Object obj;
        String[] strArr = {"appId", "debugType", "versionDesc"};
        f238598I = strArr;
        IAutoDBItem.MAutoDBInfo initAutoDBInfo = C38537c0.initAutoDBInfo(C81227a3.class);
        f238599J = initAutoDBInfo;
        String[] strArr2 = initAutoDBInfo.columns;
        Class<?> cls = strArr2 != null ? strArr2.getClass() : "versionDesc".getClass();
        if (strArr2 != null) {
            int length = Array.getLength(strArr2);
            obj = Array.newInstance(strArr2.getClass().getComponentType(), length + 1);
            System.arraycopy(strArr2, 0, obj, 0, length);
        } else {
            obj = Array.newInstance(cls, 1);
        }
        Object[] objArr = (Object[]) obj;
        objArr[objArr.length - 1] = "versionDesc";
        initAutoDBInfo.columns = (String[]) objArr;
        initAutoDBInfo.colsMap.put("versionDesc", "TEXT");
        initAutoDBInfo.sql += ", versionDesc TEXT ";
        initAutoDBInfo.sql += C37240b.C37241a.m41249a(strArr);
    }

    public void convertFrom(Cursor cursor) {
        super.convertFrom(cursor);
        int columnIndex = cursor.getColumnIndex("versionDesc");
        if (columnIndex >= 0) {
            this.field_versionDesc = cursor.getString(columnIndex);
        }
    }

    public ContentValues convertTo() {
        ContentValues convertTo = super.convertTo();
        convertTo.put("versionDesc", this.field_versionDesc);
        return convertTo;
    }

    public IAutoDBItem.MAutoDBInfo getDBInfo() {
        return f238599J;
    }

    public String[] getKeys() {
        return f238598I;
    }
}

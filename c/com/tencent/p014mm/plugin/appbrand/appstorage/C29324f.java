package com.tencent.p014mm.plugin.appbrand.appstorage;

import android.database.Cursor;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.sdk.storage.ISQLiteDatabase;
import com.tencent.p014mm.sdk.storage.MAutoStorage;

/* renamed from: com.tencent.mm.plugin.appbrand.appstorage.f */
public class C29324f extends MAutoStorage<C29323e> {

    /* renamed from: e */
    public static final String[] f80064e = {MAutoStorage.getCreateSQLs(C29323e.f80063p, "AppBrandIdentifierInfo")};

    /* renamed from: d */
    public ISQLiteDatabase f80065d;

    public C29324f(ISQLiteDatabase iSQLiteDatabase) {
        super(iSQLiteDatabase, C29323e.f80063p, "AppBrandIdentifierInfo", (String[]) null);
        this.f80065d = iSQLiteDatabase;
    }

    /* renamed from: Lo */
    public String mo56601Lo(String str) {
        Cursor query = this.f80065d.query("AppBrandIdentifierInfo", new String[]{"appId"}, "username=?", new String[]{str}, (String) null, (String) null, (String) null);
        String string = (query == null || !query.moveToFirst()) ? "" : query.getString(0);
        if (query != null) {
            query.close();
        }
        Log.m105925i("MicroMsg.AppBrand.AppBrandIdentifierInfoStorage", "queryAppId: appId = [%s], userName = [%s]", string, str);
        return string;
    }

    /* renamed from: jo */
    public boolean mo56602jo(String str, String str2) {
        if (Util.isNullOrNil(str) || Util.isNullOrNil(str2)) {
            return false;
        }
        long currentTicks = Util.currentTicks();
        try {
            C29323e eVar = new C29323e();
            eVar.field_appId = str;
            eVar.field_username = str2;
            return insert(eVar);
        } finally {
            Log.m105925i("MicroMsg.AppBrand.AppBrandIdentifierInfoStorage", "addIdentifierInfo: appId = [%s], userName = [%s], cost:%d", str, str2, Long.valueOf(Util.currentTicks() - currentTicks));
        }
    }

    /* renamed from: qq */
    public String mo56603qq(String str) {
        Cursor query = this.f80065d.query("AppBrandIdentifierInfo", new String[]{"username"}, "appId=?", new String[]{str}, (String) null, (String) null, (String) null);
        String string = (query == null || !query.moveToFirst()) ? "" : query.getString(0);
        if (query != null) {
            query.close();
        }
        Log.m105925i("MicroMsg.AppBrand.AppBrandIdentifierInfoStorage", "queryAppId: appId = [%s], userName = [%s]", str, string);
        return string;
    }
}

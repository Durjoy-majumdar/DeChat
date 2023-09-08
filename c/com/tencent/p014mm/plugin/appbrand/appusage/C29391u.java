package com.tencent.p014mm.plugin.appbrand.appusage;

import com.tencent.p014mm.plugin.appbrand.config.AppBrandGlobalSystemConfig;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.sdk.storage.ISQLiteDatabase;
import com.tencent.p014mm.sdk.storage.MAutoStorage;
import com.tencent.p014mm.sdk.storage.MStorageEventData;
import p749xh.C38680v;

@Deprecated
/* renamed from: com.tencent.mm.plugin.appbrand.appusage.u */
public final class C29391u extends MAutoStorage<C29389t> {

    /* renamed from: e */
    public static final String[] f80181e = {MAutoStorage.getCreateSQLs(C29389t.f80180s, "AppBrandLocalUsageRecord")};

    /* renamed from: d */
    public final ISQLiteDatabase f80182d;

    /* renamed from: com.tencent.mm.plugin.appbrand.appusage.u$a */
    public enum C29392a {
        USAGE_LIST
    }

    public C29391u(ISQLiteDatabase iSQLiteDatabase) {
        super(iSQLiteDatabase, C29389t.f80180s, "AppBrandLocalUsageRecord", C38680v.f103912h);
        this.f80182d = iSQLiteDatabase;
    }

    /* renamed from: Lo */
    public boolean delete(C29389t tVar, boolean z, String... strArr) {
        if (z) {
            return super.delete(tVar, z, strArr);
        }
        if (!get(tVar, strArr)) {
            return false;
        }
        super.delete(tVar, z, strArr);
        return !get(tVar, strArr);
    }

    /* renamed from: jo */
    public boolean mo56657jo(String str, int i, C29392a aVar) {
        Log.m105925i("MicroMsg.AppBrandLocalUsageStorage", "addUsage, username %s, type %d, scene %s", str, Integer.valueOf(i), aVar);
        if (Util.isNullOrNil(str)) {
            return false;
        }
        C29389t tVar = new C29389t();
        tVar.field_username = str;
        tVar.field_versionType = i;
        String[] strArr = C29389t.f80179r;
        if (super.get(tVar, strArr)) {
            tVar.field_updateTime = Util.nowSecond();
            boolean update = super.update(tVar.systemRowid, tVar, false);
            if (update) {
                doNotify(MStorageEventData.EventType.SINGLE, 3, (Object) null);
            }
            return update;
        }
        tVar.field_updateTime = Util.nowSecond();
        super.insertNotify(tVar, false);
        boolean z = super.get(tVar, strArr);
        if (z) {
            int i2 = AppBrandGlobalSystemConfig.m100099b().f239318v;
            this.f80182d.execSQL("AppBrandLocalUsageRecord", "delete from AppBrandLocalUsageRecord where rowid not in ( select rowid from AppBrandLocalUsageRecord order by updateTime desc  limit " + i2 + " offset 0" + ')');
            doNotify(MStorageEventData.EventType.SINGLE, 2, (Object) null);
        }
        return z;
    }
}

package com.tencent.p014mm.plugin.appbrand.launching;

import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.sdk.storage.ISQLiteDatabase;
import com.tencent.p014mm.sdk.storage.MAutoStorage;
import p749xh.C38618n7;

/* renamed from: com.tencent.mm.plugin.appbrand.launching.l3 */
public final class C29583l3 extends MAutoStorage<C29582k3> {

    /* renamed from: d */
    public static final String[] f80511d = {MAutoStorage.getCreateSQLs(C29582k3.f80510s, "PluginDevLaunchInfo")};

    public C29583l3(ISQLiteDatabase iSQLiteDatabase) {
        super(iSQLiteDatabase, C29582k3.f80510s, "PluginDevLaunchInfo", C38618n7.f103123h);
    }

    /* renamed from: Lo */
    public long mo56823Lo(String str, String str2) {
        if (Util.isNullOrNil(str)) {
            Log.m105920e("PluginDevLaunchInfoStorage", "getDevKey appId null");
            return 0;
        }
        C29582k3 k3Var = new C29582k3();
        k3Var.field_appId = str;
        k3Var.field_versionDesc = str2;
        if (super.get(k3Var, C29582k3.f80509r)) {
            Log.m105925i("PluginDevLaunchInfoStorage", "getDevKey appId:%s,versionDesc:%s success devKey:%d", str, str2, Long.valueOf(k3Var.field_devKey));
            return k3Var.field_devKey;
        }
        Log.m105925i("PluginDevLaunchInfoStorage", "getDevKey appId:%s,versionDesc:%s fail", str, str2);
        return 0;
    }

    /* renamed from: jo */
    public boolean mo56824jo(String str, String str2) {
        if (Util.isNullOrNil(str)) {
            return false;
        }
        C29582k3 k3Var = new C29582k3();
        k3Var.field_appId = str;
        k3Var.field_versionDesc = str2;
        return super.delete(k3Var, C29582k3.f80509r);
    }

    /* renamed from: qq */
    public boolean mo56825qq(String str, String str2, long j) {
        if (Util.isNullOrNil(str)) {
            return false;
        }
        C29582k3 k3Var = new C29582k3();
        k3Var.field_appId = str;
        k3Var.field_versionDesc = str2;
        k3Var.field_devKey = j;
        if (super.get(k3Var, C29582k3.f80509r)) {
            k3Var.field_devKey = j;
            boolean update = super.update(k3Var, new String[0]);
            Log.m105925i("PluginDevLaunchInfoStorage", "setPluginInfo update appId:%s,versionDesc:%s,devUin:%d ret:%b", str, str2, Long.valueOf(j), Boolean.valueOf(update));
            return update;
        }
        boolean insert = super.insert(k3Var);
        Log.m105925i("PluginDevLaunchInfoStorage", "setPluginInfo insert appId:%s,versionDesc:%s,devUin:%d ret:%b", str, str2, Long.valueOf(j), Boolean.valueOf(insert));
        return insert;
    }
}

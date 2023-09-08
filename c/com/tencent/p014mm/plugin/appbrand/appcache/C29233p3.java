package com.tencent.p014mm.plugin.appbrand.appcache;

import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.storage.ISQLiteDatabase;
import gy3.C87412m;
import p749xh.C38621na;
import tr0.C37242c;

/* renamed from: com.tencent.mm.plugin.appbrand.appcache.p3 */
public final class C29233p3 extends C37242c<C29228n3> {

    /* renamed from: e */
    public final ISQLiteDatabase f79893e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C29233p3(ISQLiteDatabase iSQLiteDatabase) {
        super(iSQLiteDatabase, C29228n3.f79882s, "WxaPluginCodeVersionInfo", C38621na.f103170h);
        C87412m.m108594g(iSQLiteDatabase, "db");
        this.f79893e = iSQLiteDatabase;
    }

    /* renamed from: jo */
    public final String mo56530jo(String str, int i) {
        C87412m.m108594g(str, "id");
        C29228n3 n3Var = new C29228n3();
        n3Var.field_pluginAppID = str;
        n3Var.field_pluginAppVersion = i;
        String str2 = get(n3Var, new String[0]) ? n3Var.field_pluginStringVersion : null;
        Log.m105924i("Luggage.WxaPluginCodeVersionInfoStorage", "getPluginStringVersion with id:" + str + " version:" + i + ", returns:" + str2);
        return str2;
    }
}

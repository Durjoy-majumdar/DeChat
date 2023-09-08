package com.tencent.p014mm.plugin.appbrand.appcache;

import com.tencent.p014mm.sdk.storage.ISQLiteDatabase;
import com.tencent.p014mm.sdk.storage.MAutoStorage;
import p749xh.C38613m7;

/* renamed from: com.tencent.mm.plugin.appbrand.appcache.p1 */
public final class C29232p1 extends MAutoStorage<C29297r1> {

    /* renamed from: e */
    public static final String[] f79891e = {MAutoStorage.getCreateSQLs(C29297r1.f80004u, "PluginCodeUsageLRURecord")};

    /* renamed from: d */
    public final ISQLiteDatabase f79892d;

    public C29232p1(ISQLiteDatabase iSQLiteDatabase) {
        super(iSQLiteDatabase, C29297r1.f80004u, "PluginCodeUsageLRURecord", C38613m7.f103032i);
        this.f79892d = iSQLiteDatabase;
    }

    /* renamed from: W0 */
    public void mo56529W0(String str, int i) {
        C29297r1 r1Var = new C29297r1();
        r1Var.field_appId = str;
        r1Var.field_version = i;
        super.delete(r1Var, C29297r1.f80003t);
    }
}

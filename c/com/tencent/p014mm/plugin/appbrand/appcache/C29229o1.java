package com.tencent.p014mm.plugin.appbrand.appcache;

import com.tencent.p014mm.sdk.storage.ISQLiteDatabase;
import com.tencent.p014mm.sdk.storage.MAutoStorage;
import p749xh.C38608l7;

/* renamed from: com.tencent.mm.plugin.appbrand.appcache.o1 */
public final class C29229o1 extends MAutoStorage<C29227n1> {

    /* renamed from: e */
    public static final String[] f79884e = {MAutoStorage.getCreateSQLs(C29227n1.f79880u, "PkgUsageLRURecord")};

    /* renamed from: d */
    public final ISQLiteDatabase f79885d;

    public C29229o1(ISQLiteDatabase iSQLiteDatabase) {
        super(iSQLiteDatabase, C29227n1.f79880u, "PkgUsageLRURecord", C38608l7.f102971i);
        this.f79885d = iSQLiteDatabase;
    }

    /* renamed from: W0 */
    public void mo56528W0(String str, int i) {
        C29227n1 n1Var = new C29227n1();
        n1Var.field_appId = str;
        n1Var.field_type = i;
        super.delete(n1Var, C29227n1.f79879t);
    }
}

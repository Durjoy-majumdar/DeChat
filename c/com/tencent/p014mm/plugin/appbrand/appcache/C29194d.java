package com.tencent.p014mm.plugin.appbrand.appcache;

import com.tencent.p014mm.sdk.storage.ISQLiteDatabase;
import gy3.C87412m;
import p749xh.C38709z;
import tr0.C37242c;

/* renamed from: com.tencent.mm.plugin.appbrand.appcache.d */
public final class C29194d extends C37242c<C29188c> {

    /* renamed from: e */
    public final ISQLiteDatabase f79834e;

    /* renamed from: com.tencent.mm.plugin.appbrand.appcache.d$a */
    public enum C29195a {
        NONE(-1);
        

        /* renamed from: d */
        public final int f79837d;

        /* access modifiers changed from: public */
        C29195a(int i) {
            this.f79837d = i;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C29194d(ISQLiteDatabase iSQLiteDatabase) {
        super(iSQLiteDatabase, C29188c.f79824t, "AppBrandSeparatedPluginsCompatMarkTable", C38709z.f104372h);
        C87412m.m108594g(iSQLiteDatabase, "db");
        this.f79834e = iSQLiteDatabase;
    }
}

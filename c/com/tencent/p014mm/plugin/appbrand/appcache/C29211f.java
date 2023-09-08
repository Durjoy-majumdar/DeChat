package com.tencent.p014mm.plugin.appbrand.appcache;

import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.storage.ISQLiteDatabase;
import fy3.C32226l;
import gy3.C87412m;
import gy3.C87413o;
import p749xh.C38527b0;
import rx3.C13598b0;
import tr0.C37242c;

/* renamed from: com.tencent.mm.plugin.appbrand.appcache.f */
public final class C29211f extends C37242c<C29207e> {

    /* renamed from: e */
    public final ISQLiteDatabase f79859e;

    /* renamed from: com.tencent.mm.plugin.appbrand.appcache.f$a */
    public static final class C29212a extends C87413o implements C32226l<C29207e, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C29207e f79860d;

        /* renamed from: e */
        public final /* synthetic */ String f79861e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C29212a(C29207e eVar, String str) {
            super(1);
            this.f79860d = eVar;
            this.f79861e = str;
        }

        public Object invoke(Object obj) {
            C87412m.m108594g((C29207e) obj, LocaleUtil.ITALIAN);
            this.f79860d.field_versionMd5 = this.f79861e;
            return C13598b0.f38549a;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C29211f(ISQLiteDatabase iSQLiteDatabase) {
        super(iSQLiteDatabase, C29207e.f79852t, "AppBrandTestCodeVersionMarkTable", C38527b0.f101715h);
        C87412m.m108594g(iSQLiteDatabase, "db");
        this.f79859e = iSQLiteDatabase;
    }

    /* renamed from: Lo */
    public final String mo56519Lo(String str, int i) {
        C87412m.m108594g(str, "appId");
        C29207e eVar = new C29207e();
        eVar.field_appId = str;
        eVar.field_versionType = i;
        if (get(eVar, new String[0])) {
            return eVar.field_versionMd5;
        }
        return null;
    }

    /* renamed from: jo */
    public final void mo56520jo(String str, int i) {
        C87412m.m108594g(str, "appId");
        Log.m105924i("MicroMsg.AppBrandTestCodeVersionMarkStorage", "clearVersion appId:" + str + " versionType:" + i);
        C29207e eVar = new C29207e();
        eVar.field_appId = str;
        eVar.field_versionType = i;
        super.delete(eVar, new String[0]);
    }

    /* renamed from: qq */
    public final void mo56521qq(String str, int i, String str2) {
        C87412m.m108594g(str, "appId");
        C87412m.m108594g(str2, "versionMd5");
        Log.m105924i("MicroMsg.AppBrandTestCodeVersionMarkStorage", "setVersion appId:" + str + " versionType:" + i + " versionMd5:" + str2);
        C29207e eVar = new C29207e();
        eVar.field_appId = str;
        eVar.field_versionType = i;
        C29212a aVar = new C29212a(eVar, str2);
        ISQLiteDatabase iSQLiteDatabase = this.f79859e;
        long beginTransaction = iSQLiteDatabase.beginTransaction(Thread.currentThread().getId());
        if (get(eVar, new String[0])) {
            aVar.invoke(eVar);
            super.update(eVar, new String[0]);
        } else {
            aVar.invoke(eVar);
            super.insert(eVar);
        }
        iSQLiteDatabase.endTransaction(beginTransaction);
    }
}

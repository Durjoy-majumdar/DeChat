package com.tencent.p014mm.plugin.appbrand.page;

import com.tencent.p014mm.plugin.appbrand.page.C83897r;
import com.tencent.p014mm.plugin.appbrand.report.C84240s;
import com.tencent.p014mm.protocal.protobuf.AppCommentModule;
import com.tencent.p014mm.sdk.platformtools.Util;

/* renamed from: com.tencent.mm.plugin.appbrand.page.t */
public class C83926t implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ C83897r.C40516e f245012d;

    /* renamed from: e */
    public final /* synthetic */ C83897r f245013e;

    public C83926t(C83897r rVar, C83897r.C40516e eVar) {
        this.f245013e = rVar;
        this.f245012d = eVar;
    }

    public void run() {
        C83897r rVar = this.f245013e;
        AppCommentModule appCommentModule = rVar.f244958c;
        if (appCommentModule != null) {
            C83860o oVar = (C83860o) this.f245012d;
            AppBrandMenuHeader.m102779a(oVar.f244844b, oVar.f244843a.f244956a.f238147j, appCommentModule);
            C84240s.m103845k(oVar.f244843a.f244956a.f238147j, 1, 1);
        } else if (!Util.isNullOrNil(rVar.f244957b)) {
            ((C83860o) this.f245012d).mo116419a(this.f245013e.f244957b);
        }
    }
}

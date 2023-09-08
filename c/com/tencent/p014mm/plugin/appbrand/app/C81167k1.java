package com.tencent.p014mm.plugin.appbrand.app;

import com.tencent.p014mm.ipcinvoker.C1256g;
import com.tencent.p014mm.plugin.appbrand.app.ServiceForWebViewAnyProcess;
import lp3.C46888b;

/* renamed from: com.tencent.mm.plugin.appbrand.app.k1 */
public final class C81167k1<T> implements C1256g {

    /* renamed from: d */
    public final /* synthetic */ C46888b f238491d;

    public C81167k1(C46888b bVar) {
        this.f238491d = bVar;
    }

    /* renamed from: a */
    public void mo894a(Object obj) {
        ServiceForWebViewAnyProcess.IPCReportMiniProgramPageDataResult iPCReportMiniProgramPageDataResult = (ServiceForWebViewAnyProcess.IPCReportMiniProgramPageDataResult) obj;
        int i = iPCReportMiniProgramPageDataResult.f238450d;
        boolean z = iPCReportMiniProgramPageDataResult.f238451e;
        String str = iPCReportMiniProgramPageDataResult.f238452f;
        if (z) {
            this.f238491d.mo72093c(Integer.valueOf(i));
            return;
        }
        this.f238491d.mo72091a(str);
    }
}

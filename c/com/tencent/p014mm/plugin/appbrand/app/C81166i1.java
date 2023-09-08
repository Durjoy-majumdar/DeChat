package com.tencent.p014mm.plugin.appbrand.app;

import com.tencent.p014mm.ipcinvoker.C1256g;
import com.tencent.p014mm.plugin.appbrand.app.ServiceForWebViewAnyProcess;
import gy3.C87412m;
import lp3.C88631d;

/* renamed from: com.tencent.mm.plugin.appbrand.app.i1 */
public final class C81166i1<T> implements C88631d.C76721a {

    /* renamed from: a */
    public final /* synthetic */ C1256g<ServiceForWebViewAnyProcess.IPCReportMiniProgramPageDataResult> f238490a;

    public C81166i1(C1256g<ServiceForWebViewAnyProcess.IPCReportMiniProgramPageDataResult> gVar) {
        this.f238490a = gVar;
    }

    /* renamed from: a */
    public final void mo1720a(Object obj) {
        String str;
        C1256g<ServiceForWebViewAnyProcess.IPCReportMiniProgramPageDataResult> gVar = this.f238490a;
        if (gVar != null) {
            Throwable th = obj instanceof Throwable ? (Throwable) obj : null;
            if (th == null || (str = th.getMessage()) == null) {
                str = obj.toString();
            }
            C87412m.m108594g(str, "errMsg");
            gVar.mo894a(new ServiceForWebViewAnyProcess.IPCReportMiniProgramPageDataResult(0, false, str));
        }
    }
}

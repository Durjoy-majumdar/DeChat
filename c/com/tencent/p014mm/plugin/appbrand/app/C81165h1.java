package com.tencent.p014mm.plugin.appbrand.app;

import com.tencent.p014mm.ipcinvoker.C1256g;
import com.tencent.p014mm.plugin.appbrand.app.ServiceForWebViewAnyProcess;
import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import gy3.C87412m;
import lp3.C88631d;

/* renamed from: com.tencent.mm.plugin.appbrand.app.h1 */
public final class C81165h1<T> implements C88631d.C88632b {

    /* renamed from: a */
    public final /* synthetic */ C1256g<ServiceForWebViewAnyProcess.IPCReportMiniProgramPageDataResult> f238489a;

    public C81165h1(C1256g<ServiceForWebViewAnyProcess.IPCReportMiniProgramPageDataResult> gVar) {
        this.f238489a = gVar;
    }

    /* renamed from: a */
    public void mo1772a(Object obj) {
        Integer num = (Integer) obj;
        C1256g<ServiceForWebViewAnyProcess.IPCReportMiniProgramPageDataResult> gVar = this.f238489a;
        if (gVar != null) {
            C87412m.m108593f(num, LocaleUtil.ITALIAN);
            gVar.mo894a(new ServiceForWebViewAnyProcess.IPCReportMiniProgramPageDataResult(num.intValue(), true, (String) null));
        }
    }
}

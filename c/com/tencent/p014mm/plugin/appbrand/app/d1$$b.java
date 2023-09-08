package com.tencent.p014mm.plugin.appbrand.app;

import com.tencent.p014mm.plugin.appbrand.ipc.C81964j;
import com.tencent.p014mm.plugin.appbrand.jsapi.op_report.AppBrandOpReportLogic$AppBrandOnOpReportStartEvent;
import eb0.C86484b;
import f40.C86709a0;
import hp3.C87581a;
import lp3.C88643g;

/* renamed from: com.tencent.mm.plugin.appbrand.app.d1$$b */
public class d1$$b implements C87581a<Integer, Void> {

    /* renamed from: a */
    public final /* synthetic */ String f238461a;

    public d1$$b(C81152d1 d1Var, String str) {
        this.f238461a = str;
    }

    public Object call(Object obj) {
        Void voidR = (Void) obj;
        if (!C86709a0.m107523b().mo121114l()) {
            C88643g.m110544b().mo72091a(new C86484b());
            return null;
        }
        String str = this.f238461a;
        AppBrandOpReportLogic$AppBrandOnOpReportStartEvent appBrandOpReportLogic$AppBrandOnOpReportStartEvent = new AppBrandOpReportLogic$AppBrandOnOpReportStartEvent();
        appBrandOpReportLogic$AppBrandOnOpReportStartEvent.f242312d = str;
        C81964j.m100679b(str, appBrandOpReportLogic$AppBrandOnOpReportStartEvent);
        C86709a0.m107529k().f251779b.mo123455a(1345, new C55442e1(this, C88643g.m110545c()));
        return null;
    }
}

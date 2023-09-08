package com.tencent.p014mm.plugin.appbrand.jsapi.media;

import a70.C112760b;
import com.tencent.p014mm.ipcinvoker.extension.XIPCInvoker;
import com.tencent.p014mm.plugin.appbrand.jsapi.media.GetSightParamsIPCTask;
import com.tencent.p014mm.plugin.mmsight.SightParams;
import com.tencent.p014mm.sdk.platformtools.WeChatProcess;
import com.tencent.p014mm.vfs.C86013q1;
import gy3.C8477a0;
import gy3.C87412m;
import hp3.C87581a;

/* renamed from: com.tencent.mm.plugin.appbrand.jsapi.media.u */
public final class C82767u<_Ret, _Var> implements C87581a {

    /* renamed from: a */
    public final /* synthetic */ C82777y f242099a;

    /* renamed from: b */
    public final /* synthetic */ C8477a0 f242100b;

    public C82767u(C82777y yVar, C8477a0 a0Var) {
        this.f242099a = yVar;
        this.f242100b = a0Var;
    }

    public Object call(Object obj) {
        Boolean bool = (Boolean) obj;
        C82777y yVar = this.f242099a;
        int i = yVar.f242127d;
        int i2 = 2;
        if (i == 2) {
            i2 = 1;
        } else if (i != 1) {
            i2 = 0;
        }
        Object b = XIPCInvoker.m98749b(WeChatProcess.PROCESS_MAIN, new GetSightParamsIPCTask.TaskParams(i2, yVar.f242129f, yVar.f242126c == C82784z1.FRONT.getFlag()), GetSightParamsIPCTask.class);
        C87412m.m108593f(b, "invokeSync(\n            …aramsIPCTask::class.java)");
        SightParams sightParams = (SightParams) b;
        C8477a0 a0Var = this.f242100b;
        sightParams.f248461r = false;
        sightParams.f248462s = true;
        if (!a0Var.f27482d) {
            String K = C112760b.m154203K();
            if (!C86013q1.m106450k(K)) {
                C86013q1.m106461v(K);
            }
            sightParams.f248453g = C112760b.m154203K() + sightParams.f248455i + ".mp4";
            sightParams.f248456j = C112760b.m154203K() + sightParams.f248455i + ".jpg";
        }
        return sightParams;
    }
}

package com.tencent.p014mm.plugin.brandservice.p028ui.timeline;

import by0.C16825a;
import com.tencent.p014mm.plugin.brandservice.p028ui.timeline.C18412m3;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C19623o0;
import f40.C86709a0;
import fx0.C20733t;
import java.util.LinkedList;
import ob0.C89137b0;

/* renamed from: com.tencent.mm.plugin.brandservice.ui.timeline.i3 */
public class C18203i3 implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ C18412m3.C18414b f50305d;

    /* renamed from: e */
    public final /* synthetic */ C19623o0 f50306e;

    /* renamed from: f */
    public final /* synthetic */ C18412m3 f50307f;

    public C18203i3(C18412m3 m3Var, C18412m3.C18414b bVar, C19623o0 o0Var) {
        this.f50307f = m3Var;
        this.f50305d = bVar;
        this.f50306e = o0Var;
    }

    public void run() {
        LinkedList linkedList = new LinkedList();
        linkedList.add(this.f50305d);
        if (!Util.isNullOrNil(this.f50305d.f51091f1)) {
            C18412m3.C18414b bVar = this.f50305d;
            C16825a aVar = C16825a.f45444a;
            bVar.f63880x0 = aVar.mo17867e(bVar.f51091f1);
            C18412m3.C18414b bVar2 = this.f50305d;
            bVar2.f63882y0 = (int) aVar.mo17866d(bVar2.f51091f1);
        }
        Log.m105925i("MicroMsg.BizTimeLineReport", "reportOnClick %s.", this.f50306e.mo25768r2());
        C89137b0 b0Var = C86709a0.m107529k().f251779b;
        C18412m3 m3Var = this.f50307f;
        b0Var.mo123460f(new C20733t(linkedList, m3Var.f51067a, m3Var.f51068b, m3Var.f51069c, m3Var.f51070d, 1, 1, m3Var.f51071e, m3Var.f51078l));
    }
}

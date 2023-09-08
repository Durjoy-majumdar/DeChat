package com.tencent.p014mm.plugin.sns.model;

import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.sdk.platformtools.Log;
import f40.C86709a0;
import ob0.C89137b0;
import te3.b94;
import vr2.C102236a0;

/* renamed from: com.tencent.mm.plugin.sns.model.q0 */
public class C94937q0 implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ b94 f275147d;

    /* renamed from: e */
    public final /* synthetic */ C94941r0 f275148e;

    public C94937q0(C94941r0 r0Var, b94 b94) {
        this.f275148e = r0Var;
        this.f275147d = b94;
    }

    public void run() {
        SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.model.NetSceneSnsUserPage$1");
        Log.m105925i("MicroMsg.NetSceneSnsUserPage", "doFetchByContinueID continueID:%s", C102236a0.m134765q0(this.f275147d.f297949f));
        C86709a0.m107528h();
        C89137b0 b0Var = C86709a0.m107529k().f251779b;
        b94 b94 = this.f275147d;
        String str = b94.f297948e;
        long j = b94.f297949f;
        C94941r0 r0Var = this.f275148e;
        SnsMethodCalculate.markStartTimeMs("access$000", "com.tencent.mm.plugin.sns.model.NetSceneSnsUserPage");
        boolean z = r0Var.f275162g;
        SnsMethodCalculate.markEndTimeMs("access$000", "com.tencent.mm.plugin.sns.model.NetSceneSnsUserPage");
        b94 b942 = this.f275147d;
        int i = b942.f297950g;
        C94941r0 r0Var2 = this.f275148e;
        int i2 = r0Var2.f275155A;
        int i3 = b942.f297953j;
        SnsMethodCalculate.markStartTimeMs("access$100", "com.tencent.mm.plugin.sns.model.NetSceneSnsUserPage");
        int i4 = r0Var2.f275175w;
        SnsMethodCalculate.markEndTimeMs("access$100", "com.tencent.mm.plugin.sns.model.NetSceneSnsUserPage");
        C94941r0 r0Var3 = this.f275148e;
        int i5 = r0Var3.f275156B;
        SnsMethodCalculate.markStartTimeMs("access$200", "com.tencent.mm.plugin.sns.model.NetSceneSnsUserPage");
        int i6 = r0Var3.f275158D;
        SnsMethodCalculate.markEndTimeMs("access$200", "com.tencent.mm.plugin.sns.model.NetSceneSnsUserPage");
        int i7 = i5;
        C94941r0 r0Var4 = r5;
        C94941r0 r0Var5 = new C94941r0(str, j, z, i, i2, i3, i4, i7, 1 + i6);
        b0Var.mo123460f(r0Var4);
        SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.model.NetSceneSnsUserPage$1");
    }
}

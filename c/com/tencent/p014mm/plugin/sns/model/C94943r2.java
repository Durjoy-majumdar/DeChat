package com.tencent.p014mm.plugin.sns.model;

import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.sdk.platformtools.Log;
import f40.C86709a0;

/* renamed from: com.tencent.mm.plugin.sns.model.r2 */
public class C94943r2 implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ int f275182d;

    /* renamed from: e */
    public final /* synthetic */ String f275183e;

    /* renamed from: f */
    public final /* synthetic */ boolean f275184f;

    /* renamed from: g */
    public final /* synthetic */ int f275185g;

    public C94943r2(C94928p2 p2Var, int i, String str, boolean z, int i2) {
        this.f275182d = i;
        this.f275183e = str;
        this.f275184f = z;
        this.f275185g = i2;
    }

    public void run() {
        SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.model.UploadManager$5");
        if (C94866e1.qy0()) {
            Log.m105920e("MicroMsg.UploadManager", "is invalid to getSnsInfoStorage");
            SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.model.UploadManager$5");
            return;
        }
        C94925p0 p0Var = new C94925p0(this.f275182d, this.f275183e, this.f275184f, this.f275185g);
        C94866e1.Rx0().mo130958q(this.f275182d, p0Var.hashCode());
        C86709a0.m107528h();
        C86709a0.m107529k().f251779b.mo123460f(p0Var);
        SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.model.UploadManager$5");
    }
}

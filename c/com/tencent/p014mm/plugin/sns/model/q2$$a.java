package com.tencent.p014mm.plugin.sns.model;

import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.plugin.sns.storage.SnsInfo;

/* renamed from: com.tencent.mm.plugin.sns.model.q2$$a */
public final /* synthetic */ class q2$$a implements C94849d {

    /* renamed from: a */
    public final /* synthetic */ C94939q2 f275151a;

    /* renamed from: b */
    public final /* synthetic */ SnsInfo f275152b;

    public /* synthetic */ q2$$a(C94939q2 q2Var, SnsInfo snsInfo) {
        this.f275151a = q2Var;
        this.f275152b = snsInfo;
    }

    /* renamed from: a */
    public final void mo131218a(boolean z) {
        C94939q2 q2Var = this.f275151a;
        SnsInfo snsInfo = this.f275152b;
        q2Var.getClass();
        SnsMethodCalculate.markStartTimeMs("lambda$run$0", "com.tencent.mm.plugin.sns.model.UploadManager$3");
        if (z) {
            q2Var.f275150d.mo131200k(snsInfo, -1, 7, "sns BackVideo is remux error");
        }
        SnsMethodCalculate.markEndTimeMs("lambda$run$0", "com.tencent.mm.plugin.sns.model.UploadManager$3");
    }
}

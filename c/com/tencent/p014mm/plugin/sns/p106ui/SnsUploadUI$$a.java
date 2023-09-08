package com.tencent.p014mm.plugin.sns.p106ui;

import androidx.activity.result.C67073a;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import p232rw.C77575r;

/* renamed from: com.tencent.mm.plugin.sns.ui.SnsUploadUI$$a */
public final /* synthetic */ class SnsUploadUI$$a implements C67073a {

    /* renamed from: a */
    public final /* synthetic */ SnsUploadUI f278977a;

    public /* synthetic */ SnsUploadUI$$a(SnsUploadUI snsUploadUI) {
        this.f278977a = snsUploadUI;
    }

    /* renamed from: a */
    public final void mo91080a(Object obj) {
        SnsUploadUI snsUploadUI = this.f278977a;
        C77575r rVar = (C77575r) obj;
        int i = SnsUploadUI.f278903Q0;
        snsUploadUI.getClass();
        SnsMethodCalculate.markStartTimeMs("lambda$onCreate$0", "com.tencent.mm.plugin.sns.ui.SnsUploadUI");
        C95778f1 f1Var = snsUploadUI.f278944u;
        if (f1Var instanceof C95712a1) {
            ((C95712a1) f1Var).mo132254n(rVar);
        }
        SnsMethodCalculate.markEndTimeMs("lambda$onCreate$0", "com.tencent.mm.plugin.sns.ui.SnsUploadUI");
    }
}

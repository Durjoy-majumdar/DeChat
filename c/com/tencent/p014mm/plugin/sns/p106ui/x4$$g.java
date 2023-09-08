package com.tencent.p014mm.plugin.sns.p106ui;

import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import wh2.C102446b;

/* renamed from: com.tencent.mm.plugin.sns.ui.x4$$g */
public final /* synthetic */ class x4$$g implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ C96313x4 f281673d;

    /* renamed from: e */
    public final /* synthetic */ CharSequence f281674e;

    /* renamed from: f */
    public final /* synthetic */ x4$$i f281675f;

    /* renamed from: g */
    public final /* synthetic */ C102446b f281676g;

    public /* synthetic */ x4$$g(C96313x4 x4Var, CharSequence charSequence, x4$$i x4__i, C102446b bVar) {
        this.f281673d = x4Var;
        this.f281674e = charSequence;
        this.f281675f = x4__i;
        this.f281676g = bVar;
    }

    public final void run() {
        C96313x4 x4Var = this.f281673d;
        CharSequence charSequence = this.f281674e;
        x4$$i x4__i = this.f281675f;
        C102446b bVar = this.f281676g;
        x4Var.getClass();
        SnsMethodCalculate.markStartTimeMs("lambda$getRealChildView$2", "com.tencent.mm.plugin.sns.ui.SnsLabelUIAdapter");
        x4Var.f281660s = charSequence;
        x4__i.f281684d.setText(charSequence);
        x4__i.f281684d.setVisibility(0);
        bVar.mo142014a();
        SnsMethodCalculate.markEndTimeMs("lambda$getRealChildView$2", "com.tencent.mm.plugin.sns.ui.SnsLabelUIAdapter");
    }
}

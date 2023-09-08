package com.tencent.p014mm.plugin.sns.p106ui;

import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import wh2.C102446b;

/* renamed from: com.tencent.mm.plugin.sns.ui.x4$$h */
public final /* synthetic */ class x4$$h implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ C96313x4 f281677d;

    /* renamed from: e */
    public final /* synthetic */ CharSequence f281678e;

    /* renamed from: f */
    public final /* synthetic */ x4$$i f281679f;

    /* renamed from: g */
    public final /* synthetic */ C102446b f281680g;

    public /* synthetic */ x4$$h(C96313x4 x4Var, CharSequence charSequence, x4$$i x4__i, C102446b bVar) {
        this.f281677d = x4Var;
        this.f281678e = charSequence;
        this.f281679f = x4__i;
        this.f281680g = bVar;
    }

    public final void run() {
        C96313x4 x4Var = this.f281677d;
        CharSequence charSequence = this.f281678e;
        x4$$i x4__i = this.f281679f;
        C102446b bVar = this.f281680g;
        x4Var.getClass();
        SnsMethodCalculate.markStartTimeMs("lambda$getRealChildView$5", "com.tencent.mm.plugin.sns.ui.SnsLabelUIAdapter");
        x4Var.f281661t = charSequence;
        x4__i.f281684d.setText(charSequence);
        x4__i.f281684d.setVisibility(0);
        bVar.mo142014a();
        SnsMethodCalculate.markEndTimeMs("lambda$getRealChildView$5", "com.tencent.mm.plugin.sns.ui.SnsLabelUIAdapter");
    }
}

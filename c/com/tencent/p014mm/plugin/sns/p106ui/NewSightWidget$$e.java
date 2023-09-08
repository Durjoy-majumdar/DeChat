package com.tencent.p014mm.plugin.sns.p106ui;

import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import nj3.C11182m0;
import nj3.C76874e0;
import sf0.C90188n0;

/* renamed from: com.tencent.mm.plugin.sns.ui.NewSightWidget$$e */
public final /* synthetic */ class NewSightWidget$$e implements C11182m0 {

    /* renamed from: d */
    public final /* synthetic */ NewSightWidget f277079d;

    public /* synthetic */ NewSightWidget$$e(NewSightWidget newSightWidget) {
        this.f277079d = newSightWidget;
    }

    public final void onCreateMMMenu(C76874e0 e0Var) {
        NewSightWidget newSightWidget = this.f277079d;
        newSightWidget.getClass();
        SnsMethodCalculate.markStartTimeMs("lambda$showAddPicDialog$3", "com.tencent.mm.plugin.sns.ui.NewSightWidget");
        boolean z = C90188n0.f258933a;
        e0Var.mo107142f(0, newSightWidget.f277039c.getString(C0966R.string.f7980y8));
        e0Var.mo107142f(1, newSightWidget.f277039c.getString(C0966R.string.f7989yh));
        SnsMethodCalculate.markEndTimeMs("lambda$showAddPicDialog$3", "com.tencent.mm.plugin.sns.ui.NewSightWidget");
    }
}

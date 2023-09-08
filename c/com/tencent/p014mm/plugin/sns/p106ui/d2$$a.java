package com.tencent.p014mm.plugin.sns.p106ui;

import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import nj3.C11182m0;
import nj3.C76874e0;
import sf0.C90188n0;

/* renamed from: com.tencent.mm.plugin.sns.ui.d2$$a */
public final /* synthetic */ class d2$$a implements C11182m0 {

    /* renamed from: d */
    public final /* synthetic */ C95754d2 f279334d;

    public /* synthetic */ d2$$a(C95754d2 d2Var) {
        this.f279334d = d2Var;
    }

    public final void onCreateMMMenu(C76874e0 e0Var) {
        C95754d2 d2Var = this.f279334d;
        d2Var.getClass();
        SnsMethodCalculate.markStartTimeMs("lambda$showAddPicDialog$0", "com.tencent.mm.plugin.sns.ui.PicWidget");
        boolean z = C90188n0.f258933a;
        e0Var.mo107142f(0, d2Var.f279311d.getString(C0966R.string.f7980y8));
        e0Var.mo107142f(1, d2Var.f279311d.getString(C0966R.string.f7989yh));
        SnsMethodCalculate.markEndTimeMs("lambda$showAddPicDialog$0", "com.tencent.mm.plugin.sns.ui.PicWidget");
    }
}

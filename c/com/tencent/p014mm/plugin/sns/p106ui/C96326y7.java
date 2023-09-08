package com.tencent.p014mm.plugin.sns.p106ui;

import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.sns.p106ui.SnsUserUI;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import nj3.C11182m0;
import nj3.C76874e0;

/* renamed from: com.tencent.mm.plugin.sns.ui.y7 */
public class C96326y7 implements C11182m0 {

    /* renamed from: d */
    public final /* synthetic */ SnsUserUI.C95700q f281730d;

    public C96326y7(SnsUserUI.C95700q qVar) {
        this.f281730d = qVar;
    }

    public void onCreateMMMenu(C76874e0 e0Var) {
        SnsMethodCalculate.markStartTimeMs("onCreateMMMenu", "com.tencent.mm.plugin.sns.ui.SnsUserUI$SnsEventListener$1");
        e0Var.mo107154n(0, SnsUserUI.this.getString(C0966R.string.f7980y8), SnsUserUI.this.getContext().getString(C0966R.string.f7985yd), 0);
        e0Var.mo107142f(1, SnsUserUI.this.getString(C0966R.string.f7989yh));
        SnsMethodCalculate.markEndTimeMs("onCreateMMMenu", "com.tencent.mm.plugin.sns.ui.SnsUserUI$SnsEventListener$1");
    }
}

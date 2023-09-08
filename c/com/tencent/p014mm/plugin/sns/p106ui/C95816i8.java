package com.tencent.p014mm.plugin.sns.p106ui;

import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import nj3.C11182m0;
import nj3.C76874e0;

/* renamed from: com.tencent.mm.plugin.sns.ui.i8 */
public class C95816i8 implements C11182m0 {

    /* renamed from: d */
    public final /* synthetic */ SnsWsFoldDetailUI f279576d;

    public C95816i8(SnsWsFoldDetailUI snsWsFoldDetailUI) {
        this.f279576d = snsWsFoldDetailUI;
    }

    public void onCreateMMMenu(C76874e0 e0Var) {
        SnsMethodCalculate.markStartTimeMs("onCreateMMMenu", "com.tencent.mm.plugin.sns.ui.SnsWsFoldDetailUI$6");
        e0Var.mo107142f(1, this.f279576d.getString(C0966R.string.a18));
        SnsMethodCalculate.markEndTimeMs("onCreateMMMenu", "com.tencent.mm.plugin.sns.ui.SnsWsFoldDetailUI$6");
    }
}

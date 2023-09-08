package com.unionpay;

import com.unionpay.utils.UPUtils;

/* renamed from: com.unionpay.s */
public final class C116531s implements C116515a0 {

    /* renamed from: a */
    public final /* synthetic */ UPPayWapActivity f349498a;

    public C116531s(UPPayWapActivity uPPayWapActivity) {
        this.f349498a = uPPayWapActivity;
    }

    /* renamed from: a */
    public final void mo180512a(String str, C116517b0 b0Var) {
        String a = UPUtils.m90294a(this.f349498a, str);
        if (b0Var != null) {
            b0Var.mo180515a(UPPayWapActivity.m164324H7("0", "success", a));
        }
    }
}

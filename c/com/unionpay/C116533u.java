package com.unionpay;

import android.view.View;
import j20.C117292a;
import k20.C60958c;
import k20.C9556a;

/* renamed from: com.unionpay.u */
public final class C116533u implements C116515a0 {

    /* renamed from: a */
    public final /* synthetic */ UPPayWapActivity f349500a;

    public C116533u(UPPayWapActivity uPPayWapActivity) {
        this.f349500a = uPPayWapActivity;
    }

    /* renamed from: a */
    public final void mo180512a(String str, C116517b0 b0Var) {
        boolean parseBoolean = Boolean.parseBoolean(str);
        View view = this.f349500a.f349477j;
        if (view != null) {
            int i = parseBoolean ? 0 : 8;
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(Integer.valueOf(i));
            View view2 = view;
            C117292a.m165358d(view2, aVar.mo10232b(), "com/unionpay/UPPayWapActivity", "a", "(Lcom/unionpay/UPPayWapActivity;Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(view2, "com/unionpay/UPPayWapActivity", "a", "(Lcom/unionpay/UPPayWapActivity;Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        if (b0Var != null) {
            b0Var.mo180515a(UPPayWapActivity.m164324H7("0", "success", (String) null));
        }
    }
}

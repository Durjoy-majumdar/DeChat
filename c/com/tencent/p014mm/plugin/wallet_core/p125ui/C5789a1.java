package com.tencent.p014mm.plugin.wallet_core.p125ui;

import android.view.View;
import j20.C117292a;
import java.util.ArrayList;
import k20.C60958c;
import k20.C9556a;

/* renamed from: com.tencent.mm.plugin.wallet_core.ui.a1 */
public class C5789a1 implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ C72338c1 f21923d;

    public C5789a1(C72338c1 c1Var) {
        this.f21923d = c1Var;
    }

    public void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/wallet_core/ui/WalletPwdCustomDialog$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        if (!this.f21923d.f210371h.isShown()) {
            View view2 = this.f21923d.f210371h;
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(0);
            C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/plugin/wallet_core/ui/WalletPwdCustomDialog$2", "onClick", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(view2, "com/tencent/mm/plugin/wallet_core/ui/WalletPwdCustomDialog$2", "onClick", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        C117292a.m165361g(this, "com/tencent/mm/plugin/wallet_core/ui/WalletPwdCustomDialog$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}

package com.tencent.p014mm.plugin.account.p024ui;

import android.view.View;
import j20.C117292a;
import java.util.ArrayList;
import p206nj.C11171e;
import p849e3.C107207u;

/* renamed from: com.tencent.mm.plugin.account.ui.i1 */
public class C104720i1 implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ C115132k1 f310970d;

    public C104720i1(C115132k1 k1Var) {
        this.f310970d = k1Var;
    }

    public void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/account/ui/MobileInputLoginLogic$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        if (!C11171e.m11046c(31) || !C107207u.m145164e(this.f310970d.f345157d.getWindow().getDecorView()).f320766a.mo157647o(8)) {
            this.f310970d.mo174897c();
        } else {
            this.f310970d.f345157d.hideVKB();
            this.f310970d.f345159f = true;
        }
        C117292a.m165361g(this, "com/tencent/mm/plugin/account/ui/MobileInputLoginLogic$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}

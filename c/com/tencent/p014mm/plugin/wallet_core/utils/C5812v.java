package com.tencent.p014mm.plugin.wallet_core.utils;

import android.view.View;
import j20.C117292a;
import java.util.ArrayList;
import qo3.C101218e0;

/* renamed from: com.tencent.mm.plugin.wallet_core.utils.v */
public class C5812v implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ C101218e0 f21959d;

    public C5812v(C72506r rVar, C101218e0 e0Var) {
        this.f21959d = e0Var;
    }

    public void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/wallet_core/utils/WCPayInterceptWinLogic$8", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        C101218e0 e0Var = this.f21959d;
        if (e0Var != null) {
            e0Var.mo140680z();
        }
        C117292a.m165361g(this, "com/tencent/mm/plugin/wallet_core/utils/WCPayInterceptWinLogic$8", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}

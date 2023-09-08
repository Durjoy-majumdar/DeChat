package com.tencent.p014mm.plugin.wallet_core.id_verify;

import android.view.View;
import j20.C117292a;
import java.util.ArrayList;
import yq3.C79143a;

/* renamed from: com.tencent.mm.plugin.wallet_core.id_verify.c0 */
public class C72142c0 implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ WcPayRealnameVerifySuccessUI f209272d;

    public C72142c0(WcPayRealnameVerifySuccessUI wcPayRealnameVerifySuccessUI) {
        this.f209272d = wcPayRealnameVerifySuccessUI;
    }

    public void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/wallet_core/id_verify/WcPayRealnameVerifySuccessUI$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        C79143a.m95763b(this.f209272d.getContext(), 1);
        C117292a.m165361g(this, "com/tencent/mm/plugin/wallet_core/id_verify/WcPayRealnameVerifySuccessUI$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}

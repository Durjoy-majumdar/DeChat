package com.tencent.p014mm.plugin.wallet_core.id_verify;

import android.view.View;
import j20.C117292a;
import java.util.ArrayList;
import yq3.C79143a;

/* renamed from: com.tencent.mm.plugin.wallet_core.id_verify.e0 */
public class C72145e0 implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ WcPayRealnameVerifySuccessUI f209276d;

    public C72145e0(WcPayRealnameVerifySuccessUI wcPayRealnameVerifySuccessUI) {
        this.f209276d = wcPayRealnameVerifySuccessUI;
    }

    public void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/wallet_core/id_verify/WcPayRealnameVerifySuccessUI$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        C79143a.m95764c(this.f209276d.getContext(), this.f209276d.getInput(), 0);
        C117292a.m165361g(this, "com/tencent/mm/plugin/wallet_core/id_verify/WcPayRealnameVerifySuccessUI$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}

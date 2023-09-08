package com.tencent.p014mm.plugin.account.p024ui;

import android.view.View;
import di3.C86312j;
import j20.C117292a;
import java.util.ArrayList;
import p214om.C11502f;

/* renamed from: com.tencent.mm.plugin.account.ui.l2 */
public class C1483l2 implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ RegAffiliateAccountUI f10829d;

    public C1483l2(RegAffiliateAccountUI regAffiliateAccountUI) {
        this.f10829d = regAffiliateAccountUI;
    }

    public void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/account/ui/RegAffiliateAccountUI$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        ((C11502f) C86312j.m106911c(C11502f.class)).mo11461Sr().mo93149TE(this.f10829d);
        C117292a.m165361g(this, "com/tencent/mm/plugin/account/ui/RegAffiliateAccountUI$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}

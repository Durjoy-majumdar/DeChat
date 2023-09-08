package com.tencent.p014mm.plugin.remittance.p098ui;

import android.view.View;
import j20.C117292a;
import java.util.ArrayList;

/* renamed from: com.tencent.mm.plugin.remittance.ui.e0 */
public class C70885e0 implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ RemittanceBaseUI f205298d;

    public C70885e0(RemittanceBaseUI remittanceBaseUI) {
        this.f205298d = remittanceBaseUI;
    }

    public void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/remittance/ui/RemittanceBaseUI$9", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        this.f205298d.hideTenpayKB();
        RemittanceBaseUI remittanceBaseUI = this.f205298d;
        int i = RemittanceBaseUI.f204341f1;
        remittanceBaseUI.getClass();
        C117292a.m165361g(this, "com/tencent/mm/plugin/remittance/ui/RemittanceBaseUI$9", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}

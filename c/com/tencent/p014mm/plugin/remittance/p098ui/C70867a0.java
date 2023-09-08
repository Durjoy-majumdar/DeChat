package com.tencent.p014mm.plugin.remittance.p098ui;

import android.view.View;
import com.tencent.p014mm.plugin.remittance.model.C70587h0;
import com.tencent.p014mm.plugin.report.service.C115669n;
import j20.C117292a;
import java.util.ArrayList;

/* renamed from: com.tencent.mm.plugin.remittance.ui.a0 */
public class C70867a0 implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ C70587h0 f205274d;

    /* renamed from: e */
    public final /* synthetic */ RemittanceBaseUI f205275e;

    public C70867a0(RemittanceBaseUI remittanceBaseUI, C70587h0 h0Var) {
        this.f205275e = remittanceBaseUI;
        this.f205274d = h0Var;
    }

    public void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/remittance/ui/RemittanceBaseUI$22", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        this.f205275e.showLoading();
        RemittanceBaseUI remittanceBaseUI = this.f205275e;
        C70587h0 h0Var = this.f205274d;
        remittanceBaseUI.mo97281V7(h0Var.f204093d, remittanceBaseUI.f204384f, remittanceBaseUI.f204361S, h0Var);
        if (this.f205275e.f204388j == 1) {
            C115669n.INSTANCE.mo160131h(12689, 12, 1);
        } else {
            C115669n.INSTANCE.mo160131h(12689, 3, 1);
        }
        C117292a.m165361g(this, "com/tencent/mm/plugin/remittance/ui/RemittanceBaseUI$22", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}

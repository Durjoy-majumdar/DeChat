package com.tencent.p014mm.plugin.product.p087ui;

import android.view.View;
import android.widget.TextView;
import com.tencent.p014mm.plugin.product.p087ui.MallProductSelectAmountView;
import com.tencent.p014mm.plugin.product.p087ui.MallProductSelectSkuUI;
import j20.C117292a;
import java.util.ArrayList;

/* renamed from: com.tencent.mm.plugin.product.ui.l */
public class C70114l implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ MallProductSelectAmountView f202396d;

    public C70114l(MallProductSelectAmountView mallProductSelectAmountView) {
        this.f202396d = mallProductSelectAmountView;
    }

    public void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/product/ui/MallProductSelectAmountView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        MallProductSelectAmountView mallProductSelectAmountView = this.f202396d;
        int i = mallProductSelectAmountView.f202288j;
        if (i + 1 > mallProductSelectAmountView.f202285g) {
            MallProductSelectAmountView.C70080a aVar = mallProductSelectAmountView.f202289n;
            if (aVar != null) {
                ((MallProductSelectSkuUI.C70083c) aVar).mo96471b(i, mallProductSelectAmountView.f202286h);
            }
            C117292a.m165361g(this, "com/tencent/mm/plugin/product/ui/MallProductSelectAmountView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            return;
        }
        mallProductSelectAmountView.f202288j = i + 1;
        if (mallProductSelectAmountView.mo96462a()) {
            TextView textView = this.f202396d.f202282d;
            textView.setText("" + this.f202396d.f202288j);
        }
        MallProductSelectAmountView mallProductSelectAmountView2 = this.f202396d;
        MallProductSelectAmountView.C70080a aVar2 = mallProductSelectAmountView2.f202289n;
        if (aVar2 != null) {
            ((MallProductSelectSkuUI.C70083c) aVar2).mo96470a(mallProductSelectAmountView2.f202288j);
        }
        C117292a.m165361g(this, "com/tencent/mm/plugin/product/ui/MallProductSelectAmountView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}

package com.tencent.p014mm.plugin.card.p031ui;

import android.view.View;
import j20.C117292a;
import java.util.ArrayList;
import nj3.C76901s0;

/* renamed from: com.tencent.mm.plugin.card.ui.h0 */
public class C68782h0 implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ C18596g0 f197608d;

    public C68782h0(C18596g0 g0Var) {
        this.f197608d = g0Var;
    }

    public void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/card/ui/CardPopupWindow$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        C76901s0 s0Var = this.f197608d.f51924f;
        if (s0Var != null && s0Var.isShowing()) {
            this.f197608d.f51924f.dismiss();
        }
        C117292a.m165361g(this, "com/tencent/mm/plugin/card/ui/CardPopupWindow$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}

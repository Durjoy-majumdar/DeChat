package com.tencent.p014mm.plugin.expt.p472ui;

import android.view.View;
import j20.C117292a;
import java.util.ArrayList;

/* renamed from: com.tencent.mm.plugin.expt.ui.r */
public class C55653r implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ KvInfoUI f158387d;

    public C55653r(KvInfoUI kvInfoUI) {
        this.f158387d = kvInfoUI;
    }

    public void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/expt/ui/KvInfoUI$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        this.f158387d.mo77152H7(this.f158387d.f158369d.getText().toString().trim());
        C117292a.m165361g(this, "com/tencent/mm/plugin/expt/ui/KvInfoUI$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}

package com.tencent.p014mm.p136ui;

import android.view.View;
import j20.C117292a;
import java.util.ArrayList;

/* renamed from: com.tencent.mm.ui.k3 */
public class C74788k3 implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ C74793m3 f219911d;

    public C74788k3(C74793m3 m3Var) {
        this.f219911d = m3Var;
    }

    public void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/ui/SearchBarView$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        C74793m3 m3Var = this.f219911d;
        m3Var.f219918e.setText("");
        m3Var.f219918e.setHint(m3Var.f219920g);
        m3Var.f219919f.setVisibility(8);
        C117292a.m165361g(this, "com/tencent/mm/ui/SearchBarView$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}

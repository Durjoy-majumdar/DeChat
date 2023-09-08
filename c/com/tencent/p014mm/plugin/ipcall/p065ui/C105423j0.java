package com.tencent.p014mm.plugin.ipcall.p065ui;

import android.view.View;
import j20.C117292a;
import java.util.ArrayList;
import q12.C35759c;

/* renamed from: com.tencent.mm.plugin.ipcall.ui.j0 */
public class C105423j0 implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ C105408f0 f313455d;

    public C105423j0(C105408f0 f0Var) {
        this.f313455d = f0Var;
    }

    public void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/ipcall/ui/IPCallFeedbackDialog$7", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        this.f313455d.dismiss();
        C105408f0 f0Var = this.f313455d;
        int i = f0Var.f313404v;
        String d = f0Var.mo150143d(i);
        C105408f0 f0Var2 = this.f313455d;
        C35759c.m40827a(1, -1, i, d, 1, -1, 1, f0Var2.f313390e, f0Var2.f313391f);
        C117292a.m165361g(this, "com/tencent/mm/plugin/ipcall/ui/IPCallFeedbackDialog$7", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}

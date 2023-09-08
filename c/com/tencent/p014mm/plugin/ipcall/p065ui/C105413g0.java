package com.tencent.p014mm.plugin.ipcall.p065ui;

import android.view.View;
import j20.C117292a;
import java.util.ArrayList;
import q12.C35759c;

/* renamed from: com.tencent.mm.plugin.ipcall.ui.g0 */
public class C105413g0 implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ C105408f0 f313415d;

    public C105413g0(C105408f0 f0Var) {
        this.f313415d = f0Var;
    }

    public void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/ipcall/ui/IPCallFeedbackDialog$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        this.f313415d.dismiss();
        C105408f0 f0Var = this.f313415d;
        C35759c.m40827a(-1, 1, -1, "", 0, -1, -1, f0Var.f313390e, f0Var.f313391f);
        C117292a.m165361g(this, "com/tencent/mm/plugin/ipcall/ui/IPCallFeedbackDialog$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}

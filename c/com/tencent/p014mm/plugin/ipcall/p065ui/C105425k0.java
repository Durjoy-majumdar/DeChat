package com.tencent.p014mm.plugin.ipcall.p065ui;

import android.content.Context;
import android.content.Intent;
import android.view.View;
import j20.C117292a;
import java.util.ArrayList;
import k20.C9556a;
import q12.C35759c;

/* renamed from: com.tencent.mm.plugin.ipcall.ui.k0 */
public class C105425k0 implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ C105408f0 f313456d;

    public C105425k0(C105408f0 f0Var) {
        this.f313456d = f0Var;
    }

    public void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/ipcall/ui/IPCallFeedbackDialog$8", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        this.f313456d.dismiss();
        Intent intent = new Intent();
        intent.putExtra("IPCallShareCouponCardUI_KFrom", 2);
        intent.setClass(this.f313456d.f313393h, IPCallShareCouponCardUI.class);
        Context context = this.f313456d.f313393h;
        C9556a aVar = new C9556a();
        aVar.mo10233c(intent);
        Context context2 = context;
        C117292a.m165358d(context2, aVar.mo10232b(), "com/tencent/mm/plugin/ipcall/ui/IPCallFeedbackDialog$8", "onClick", "(Landroid/view/View;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        context.startActivity((Intent) aVar.mo10231a(0));
        C117292a.m165359e(context2, "com/tencent/mm/plugin/ipcall/ui/IPCallFeedbackDialog$8", "onClick", "(Landroid/view/View;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        C105408f0 f0Var = this.f313456d;
        int i = f0Var.f313404v;
        String d = f0Var.mo150143d(i);
        C105408f0 f0Var2 = this.f313456d;
        C35759c.m40827a(1, -1, i, d, 1, 1, -1, f0Var2.f313390e, f0Var2.f313391f);
        C117292a.m165361g(this, "com/tencent/mm/plugin/ipcall/ui/IPCallFeedbackDialog$8", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}

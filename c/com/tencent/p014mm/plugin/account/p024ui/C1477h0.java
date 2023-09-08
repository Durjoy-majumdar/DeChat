package com.tencent.p014mm.plugin.account.p024ui;

import android.view.View;
import j20.C117292a;
import java.util.ArrayList;
import qo3.C77407n;

/* renamed from: com.tencent.mm.plugin.account.ui.h0 */
public class C1477h0 implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ C77407n f10821d;

    /* renamed from: e */
    public final /* synthetic */ LoginHistoryUI f10822e;

    public C1477h0(LoginHistoryUI loginHistoryUI, C77407n nVar) {
        this.f10822e = loginHistoryUI;
        this.f10821d = nVar;
    }

    public void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/account/ui/LoginHistoryUI$31", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        this.f10822e.hideVKB();
        this.f10821d.mo107573q();
        C117292a.m165361g(this, "com/tencent/mm/plugin/account/ui/LoginHistoryUI$31", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}

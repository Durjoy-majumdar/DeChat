package com.tencent.p014mm.plugin.ipcall.p065ui;

import android.view.View;
import j20.C117292a;
import java.util.ArrayList;

/* renamed from: com.tencent.mm.plugin.ipcall.ui.b2 */
public class C4675b2 implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ IPCallUserProfileUI f19646d;

    public C4675b2(IPCallUserProfileUI iPCallUserProfileUI) {
        this.f19646d = iPCallUserProfileUI;
    }

    public void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/ipcall/ui/IPCallUserProfileUI$9", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        IPCallUserProfileUI iPCallUserProfileUI = this.f19646d;
        IPCallUserProfileUI.m4932H7(iPCallUserProfileUI, iPCallUserProfileUI.f19631u);
        C117292a.m165361g(this, "com/tencent/mm/plugin/ipcall/ui/IPCallUserProfileUI$9", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}

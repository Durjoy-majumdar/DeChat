package com.tencent.p014mm.plugin.ipcall.p065ui;

import android.view.View;
import com.tencent.p014mm.plugin.ipcall.model.C105385g;
import j20.C117292a;
import java.util.ArrayList;

/* renamed from: com.tencent.mm.plugin.ipcall.ui.j2 */
public class C105424j2 implements View.OnClickListener {
    public C105424j2(C105420i2 i2Var) {
    }

    public void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/ipcall/ui/TalkUIController$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        C105385g.xx0().f313271i.mo150061d();
        C117292a.m165361g(this, "com/tencent/mm/plugin/ipcall/ui/TalkUIController$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}

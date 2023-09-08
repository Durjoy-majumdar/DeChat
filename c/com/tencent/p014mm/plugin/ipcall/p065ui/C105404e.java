package com.tencent.p014mm.plugin.ipcall.p065ui;

import android.view.View;
import j20.C117292a;
import java.util.ArrayList;

/* renamed from: com.tencent.mm.plugin.ipcall.ui.e */
public class C105404e implements View.OnLongClickListener {

    /* renamed from: d */
    public final /* synthetic */ C105394b f313372d;

    public C105404e(C105394b bVar) {
        this.f313372d = bVar;
    }

    public boolean onLongClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/ipcall/ui/DialPadController$5", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z", this, array);
        C105394b bVar = this.f313372d;
        if (bVar.f313355t) {
            bVar.f313349n = "+";
            bVar.f313338c.setText("+");
        } else {
            bVar.f313342g.setText("");
            C105394b bVar2 = this.f313372d;
            bVar2.f313350o = "";
            bVar2.mo150128e("", -1);
        }
        C117292a.m165362h(true, this, "com/tencent/mm/plugin/ipcall/ui/DialPadController$5", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z");
        return true;
    }
}

package com.tencent.p014mm.plugin.ipcall.p065ui;

import android.view.View;
import j20.C117292a;
import java.util.ArrayList;

/* renamed from: com.tencent.mm.plugin.ipcall.ui.h */
public class C105415h implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ C105394b f313417d;

    public C105415h(C105394b bVar) {
        this.f313417d = bVar;
    }

    public void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/ipcall/ui/DialPadController$8", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        this.f313417d.f313339d.setCursorVisible(true);
        this.f313417d.f313346k.hideVKB();
        this.f313417d.f313358w = true;
        C117292a.m165361g(this, "com/tencent/mm/plugin/ipcall/ui/DialPadController$8", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}

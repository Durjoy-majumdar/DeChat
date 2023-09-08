package com.tencent.p014mm.plugin.ipcall.p065ui;

import android.content.Intent;
import android.view.View;
import j20.C117292a;
import java.util.ArrayList;

/* renamed from: com.tencent.mm.plugin.ipcall.ui.p */
public class C4702p implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ C4725w f19692d;

    public C4702p(C4725w wVar) {
        this.f19692d = wVar;
    }

    public void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/ipcall/ui/IPCallAddressController$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        Intent intent = new Intent(this.f19692d.f19734d, IPCallDialUI.class);
        intent.putExtra("IPCallTalkUI_dialScene", 1);
        this.f19692d.f19734d.startActivityForResult(intent, 1001);
        C117292a.m165361g(this, "com/tencent/mm/plugin/ipcall/ui/IPCallAddressController$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}

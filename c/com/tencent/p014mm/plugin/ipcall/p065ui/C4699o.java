package com.tencent.p014mm.plugin.ipcall.p065ui;

import android.content.Intent;
import android.view.View;
import j20.C117292a;
import java.util.ArrayList;
import k20.C9556a;

/* renamed from: com.tencent.mm.plugin.ipcall.ui.o */
public class C4699o implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ C4725w f19689d;

    public C4699o(C4725w wVar) {
        this.f19689d = wVar;
    }

    public void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/ipcall/ui/IPCallAddressController$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        Intent intent = new Intent();
        intent.setClass(this.f19689d.f19734d, IPCallContactUI.class);
        IPCallAddressUI iPCallAddressUI = this.f19689d.f19734d;
        C9556a aVar = new C9556a();
        aVar.mo10233c(intent);
        IPCallAddressUI iPCallAddressUI2 = iPCallAddressUI;
        C117292a.m165358d(iPCallAddressUI2, aVar.mo10232b(), "com/tencent/mm/plugin/ipcall/ui/IPCallAddressController$2", "onClick", "(Landroid/view/View;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        iPCallAddressUI.startActivity((Intent) aVar.mo10231a(0));
        C117292a.m165359e(iPCallAddressUI2, "com/tencent/mm/plugin/ipcall/ui/IPCallAddressController$2", "onClick", "(Landroid/view/View;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        C117292a.m165361g(this, "com/tencent/mm/plugin/ipcall/ui/IPCallAddressController$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}

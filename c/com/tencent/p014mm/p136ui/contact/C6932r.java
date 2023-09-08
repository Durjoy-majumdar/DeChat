package com.tencent.p014mm.p136ui.contact;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import com.tencent.p014mm.p136ui.contact.C6935t;
import com.tencent.p014mm.sdk.platformtools.Log;
import j20.C117292a;
import java.util.ArrayList;
import k20.C9556a;
import ke3.C88144b;

/* renamed from: com.tencent.mm.ui.contact.r */
public class C6932r implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ C6935t.C6936a f24619d;

    /* renamed from: e */
    public final /* synthetic */ C6935t f24620e;

    public C6932r(C6935t tVar, C6935t.C6936a aVar) {
        this.f24620e = tVar;
        this.f24619d = aVar;
    }

    public void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/ui/contact/AddressUIEntranceHeaderView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        int ordinal = this.f24619d.ordinal();
        if (ordinal == 0) {
            Intent intent = new Intent();
            intent.setClassName(this.f24620e.f24623d, "com.tencent.mm.ui.contact.ChatroomContactUI");
            Context context = this.f24620e.f24623d;
            C9556a aVar = new C9556a();
            aVar.mo10233c(intent);
            Context context2 = context;
            C117292a.m165358d(context2, aVar.mo10232b(), "com/tencent/mm/ui/contact/AddressUIEntranceHeaderView$1", "onClick", "(Landroid/view/View;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            context.startActivity((Intent) aVar.mo10231a(0));
            C117292a.m165359e(context2, "com/tencent/mm/ui/contact/AddressUIEntranceHeaderView$1", "onClick", "(Landroid/view/View;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        } else if (ordinal == 1) {
            Intent intent2 = new Intent();
            intent2.putExtra("key_label_click_source", 2);
            C88144b.m109791i(this.f24620e.f24623d, "label", ".ui.ContactLabelManagerUI", intent2, (Bundle) null);
        } else if (ordinal == 2) {
            C88144b.m109791i(this.f24620e.f24623d, "ipcall", ".ui.IPCallAddressUI", new Intent(), (Bundle) null);
        } else if (ordinal != 3) {
            Log.m105921e("MicroMsg.ChatroomContactEntranceView", "[cpan] unknow type for click. type:%s", this.f24619d);
        } else {
            Intent intent3 = new Intent(this.f24620e.f24623d, OnlyChatContactMgrUI.class);
            Context context3 = this.f24620e.f24623d;
            C9556a aVar2 = new C9556a();
            aVar2.mo10233c(intent3);
            Context context4 = context3;
            C117292a.m165358d(context4, aVar2.mo10232b(), "com/tencent/mm/ui/contact/AddressUIEntranceHeaderView$1", "onClick", "(Landroid/view/View;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            context3.startActivity((Intent) aVar2.mo10231a(0));
            C117292a.m165359e(context4, "com/tencent/mm/ui/contact/AddressUIEntranceHeaderView$1", "onClick", "(Landroid/view/View;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        }
        C117292a.m165361g(this, "com/tencent/mm/ui/contact/AddressUIEntranceHeaderView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}

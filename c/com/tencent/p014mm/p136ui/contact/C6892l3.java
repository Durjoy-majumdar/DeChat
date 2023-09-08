package com.tencent.p014mm.p136ui.contact;

import android.content.Intent;
import android.view.View;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.sdk.platformtools.WeChatBrands;
import com.tencent.p014mm.storage.C72996z1;
import j20.C117292a;
import java.util.ArrayList;

/* renamed from: com.tencent.mm.ui.contact.l3 */
public class C6892l3 implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ SelectContactUI f24528d;

    public C6892l3(SelectContactUI selectContactUI) {
        this.f24528d = selectContactUI;
    }

    public void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/ui/contact/SelectContactUI$14", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        if (!WeChatBrands.Business.Entries.ContactWeCom.checkAvailable(view.getContext())) {
            C117292a.m165361g(this, "com/tencent/mm/ui/contact/SelectContactUI$14", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            return;
        }
        Intent intent = new Intent(this.f24528d.getIntent());
        intent.setClass(this.f24528d.getContext(), OpenIMSelectContactUI.class);
        intent.removeExtra("titile");
        intent.putExtra("openim_appid", "3552365301");
        ArrayList arrayList2 = new ArrayList();
        for (String next : this.f24528d.f218752R) {
            if (C72996z1.m85843n5(next)) {
                arrayList2.add(next);
            }
        }
        intent.putExtra("already_select_contact", Util.listToString(arrayList2, ","));
        this.f24528d.startActivityForResult(intent, 5);
        C117292a.m165361g(this, "com/tencent/mm/ui/contact/SelectContactUI$14", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}

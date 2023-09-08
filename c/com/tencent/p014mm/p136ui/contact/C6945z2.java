package com.tencent.p014mm.p136ui.contact;

import android.content.Context;
import android.content.Intent;
import android.view.View;
import com.tencent.p014mm.sdk.platformtools.WeChatBrands;
import j20.C117292a;
import java.util.ArrayList;
import k20.C9556a;

/* renamed from: com.tencent.mm.ui.contact.z2 */
public class C6945z2 implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ C6880b3 f24641d;

    public C6945z2(C6880b3 b3Var) {
        this.f24641d = b3Var;
    }

    public void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/ui/contact/OpenIMListViewItem$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        if (!WeChatBrands.Business.Entries.ContactWeCom.checkAvailable(view.getContext())) {
            C117292a.m165361g(this, "com/tencent/mm/ui/contact/OpenIMListViewItem$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            return;
        }
        Context context = view.getContext();
        Intent intent = new Intent(context, OpenIMAddressUI.class);
        intent.addFlags(67108864);
        intent.putExtra("key_openim_acctype_id", this.f24641d.f24515e);
        C9556a aVar = new C9556a();
        aVar.mo10233c(intent);
        Context context2 = context;
        C117292a.m165358d(context2, aVar.mo10232b(), "com/tencent/mm/ui/contact/OpenIMListViewItem$1", "onClick", "(Landroid/view/View;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        context.startActivity((Intent) aVar.mo10231a(0));
        C117292a.m165359e(context2, "com/tencent/mm/ui/contact/OpenIMListViewItem$1", "onClick", "(Landroid/view/View;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        C117292a.m165361g(this, "com/tencent/mm/ui/contact/OpenIMListViewItem$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}

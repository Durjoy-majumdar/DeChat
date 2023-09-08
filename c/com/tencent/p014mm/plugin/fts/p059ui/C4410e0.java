package com.tencent.p014mm.plugin.fts.p059ui;

import android.content.Context;
import android.content.Intent;
import android.view.View;
import j20.C117292a;
import java.util.ArrayList;
import k20.C9556a;
import zt3.C119157j;

/* renamed from: com.tencent.mm.plugin.fts.ui.e0 */
public class C4410e0 implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ String f19092d;

    public C4410e0(String str) {
        this.f19092d = str;
    }

    public void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/fts/ui/FTSUIApiLogic$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        Intent intent = new Intent();
        intent.setClassName(view.getContext(), "com.tencent.mm.plugin.label.ui.searchContact.ContactManagerUI");
        intent.putExtra("contact_search_query", this.f19092d);
        intent.addFlags(268435456);
        Context context = view.getContext();
        C9556a aVar = new C9556a();
        aVar.mo10233c(intent);
        Context context2 = context;
        C117292a.m165358d(context2, aVar.mo10232b(), "com/tencent/mm/plugin/fts/ui/FTSUIApiLogic$1", "onClick", "(Landroid/view/View;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        context.startActivity((Intent) aVar.mo10231a(0));
        C117292a.m165359e(context2, "com/tencent/mm/plugin/fts/ui/FTSUIApiLogic$1", "onClick", "(Landroid/view/View;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        String str = this.f19092d;
        int i = C18843b0.f52842a;
        ((C119157j) C119157j.f356862d).mo183878i(new C4409a0(2, str), 100);
        C117292a.m165361g(this, "com/tencent/mm/plugin/fts/ui/FTSUIApiLogic$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}

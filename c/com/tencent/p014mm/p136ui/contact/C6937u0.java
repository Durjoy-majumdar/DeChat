package com.tencent.p014mm.p136ui.contact;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import j20.C117292a;
import java.util.ArrayList;
import ke3.C88144b;

/* renamed from: com.tencent.mm.ui.contact.u0 */
public class C6937u0 implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ C6939w0 f24632d;

    public C6937u0(C6939w0 w0Var) {
        this.f24632d = w0Var;
    }

    public void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/ui/contact/EnterpriseBizViewItem$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        Intent intent = new Intent();
        intent.putExtra("enterprise_from_scene", 2);
        intent.putExtra("enterprise_biz_name", this.f24632d.f24635e);
        C88144b.m109791i(view.getContext(), "brandservice", ".ui.EnterpriseBizContactListUI", intent, (Bundle) null);
        C117292a.m165361g(this, "com/tencent/mm/ui/contact/EnterpriseBizViewItem$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}

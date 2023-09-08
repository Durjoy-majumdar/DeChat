package com.tencent.p014mm.p136ui.contact;

import android.app.Activity;
import android.view.View;
import com.tencent.p014mm.p136ui.contact.SelectContactUI;
import j20.C117292a;
import java.util.ArrayList;

/* renamed from: com.tencent.mm.ui.contact.u3 */
public class C74571u3 implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ Activity f219202d;

    /* renamed from: e */
    public final /* synthetic */ SelectContactUI.C74423s f219203e;

    public C74571u3(SelectContactUI.C74423s sVar, Activity activity) {
        this.f219203e = sVar;
        this.f219202d = activity;
    }

    public void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/ui/contact/SelectContactUI$AddTooManyMembersTips$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        SelectContactUI.C74423s sVar = this.f219203e;
        sVar.f218817d = true;
        sVar.mo103453b(this.f219202d);
        C117292a.m165361g(this, "com/tencent/mm/ui/contact/SelectContactUI$AddTooManyMembersTips$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}

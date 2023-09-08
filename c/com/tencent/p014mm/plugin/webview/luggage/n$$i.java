package com.tencent.p014mm.plugin.webview.luggage;

import android.view.View;
import j20.C117292a;
import java.util.ArrayList;

/* renamed from: com.tencent.mm.plugin.webview.luggage.n$$i */
public class n$$i implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ C43658n f117977d;

    public n$$i(C43658n nVar) {
        this.f117977d = nVar;
    }

    public void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/webview/luggage/LuggageMMWebPage$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        C43658n nVar = this.f117977d;
        nVar.f148259i.mo73821i(nVar.mo67943v());
        this.f117977d.f117956y.setVisibility(8);
        C117292a.m165361g(this, "com/tencent/mm/plugin/webview/luggage/LuggageMMWebPage$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}

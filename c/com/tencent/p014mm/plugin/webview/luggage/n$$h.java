package com.tencent.p014mm.plugin.webview.luggage;

import android.view.View;
import j20.C117292a;
import java.util.ArrayList;

/* renamed from: com.tencent.mm.plugin.webview.luggage.n$$h */
public class n$$h implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ C43658n f117976d;

    public n$$h(C43658n nVar) {
        this.f117976d = nVar;
    }

    public void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/webview/luggage/LuggageMMWebPage$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        this.f117976d.mo65789T();
        C117292a.m165361g(this, "com/tencent/mm/plugin/webview/luggage/LuggageMMWebPage$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}

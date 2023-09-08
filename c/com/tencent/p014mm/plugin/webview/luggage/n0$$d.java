package com.tencent.p014mm.plugin.webview.luggage;

import android.view.View;
import j20.C117292a;
import java.util.ArrayList;

/* renamed from: com.tencent.mm.plugin.webview.luggage.n0$$d */
public class n0$$d implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ C43661n0 f118013d;

    public n0$$d(C43661n0 n0Var) {
        this.f118013d = n0Var;
    }

    public void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/webview/luggage/LuggageWebActionBar$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        this.f118013d.mo65849k();
        C117292a.m165361g(this, "com/tencent/mm/plugin/webview/luggage/LuggageWebActionBar$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}

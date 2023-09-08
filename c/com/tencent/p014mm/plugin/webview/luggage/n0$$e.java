package com.tencent.p014mm.plugin.webview.luggage;

import android.view.View;
import j20.C117292a;
import java.util.ArrayList;

/* renamed from: com.tencent.mm.plugin.webview.luggage.n0$$e */
public class n0$$e implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ C43661n0 f118014d;

    public n0$$e(C43661n0 n0Var) {
        this.f118014d = n0Var;
    }

    public void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/webview/luggage/LuggageWebActionBar$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        this.f118014d.mo65849k();
        C117292a.m165361g(this, "com/tencent/mm/plugin/webview/luggage/LuggageWebActionBar$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}

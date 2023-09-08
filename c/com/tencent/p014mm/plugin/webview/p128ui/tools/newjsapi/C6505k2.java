package com.tencent.p014mm.plugin.webview.p128ui.tools.newjsapi;

import android.view.View;
import j20.C117292a;
import java.util.ArrayList;
import java.util.Map;
import qo3.C101218e0;
import t83.C13849g;
import t83.C13851h1;
import t83.C13855j;

/* renamed from: com.tencent.mm.plugin.webview.ui.tools.newjsapi.k2 */
public final class C6505k2 implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ C101218e0 f23621d;

    /* renamed from: e */
    public final /* synthetic */ C13855j f23622e;

    /* renamed from: f */
    public final /* synthetic */ C13851h1 f23623f;

    public C6505k2(C101218e0 e0Var, C13855j jVar, C13851h1 h1Var) {
        this.f23621d = e0Var;
        this.f23622e = jVar;
        this.f23623f = h1Var;
    }

    public final void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/webview/ui/tools/newjsapi/JsApiRequestBindPhoneNumber$showRequestPhoneNumDialog$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        this.f23621d.mo140680z();
        C13849g gVar = this.f23622e.f39001d;
        String str = this.f23623f.f38990c;
        C6439g2.f23461d.getClass();
        gVar.mo10774a(str, "requestBindPhoneNumber:fail not bind phone", (Map<String, Object>) null);
        C117292a.m165361g(this, "com/tencent/mm/plugin/webview/ui/tools/newjsapi/JsApiRequestBindPhoneNumber$showRequestPhoneNumDialog$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}

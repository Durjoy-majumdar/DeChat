package com.tencent.p014mm.plugin.webview.p128ui.tools.newjsapi;

import android.view.View;
import j20.C117292a;
import java.util.ArrayList;
import java.util.Map;
import qo3.C101218e0;
import rx3.C13604l;
import sx3.C90363p0;
import t83.C13849g;
import t83.C13851h1;
import t83.C13855j;

/* renamed from: com.tencent.mm.plugin.webview.ui.tools.newjsapi.j2 */
public final class C6500j2 implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ C101218e0 f23604d;

    /* renamed from: e */
    public final /* synthetic */ String f23605e;

    /* renamed from: f */
    public final /* synthetic */ C13855j f23606f;

    /* renamed from: g */
    public final /* synthetic */ C13851h1 f23607g;

    public C6500j2(C101218e0 e0Var, String str, C13855j jVar, C13851h1 h1Var) {
        this.f23604d = e0Var;
        this.f23605e = str;
        this.f23606f = jVar;
        this.f23607g = h1Var;
    }

    public final void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/webview/ui/tools/newjsapi/JsApiRequestBindPhoneNumber$showRequestPhoneNumDialog$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        this.f23604d.mo140680z();
        String str = this.f23605e;
        if (str == null || str.length() == 0) {
            C13849g gVar = this.f23606f.f39001d;
            String str2 = this.f23607g.f38990c;
            C6439g2.f23461d.getClass();
            gVar.mo10774a(str2, "requestBindPhoneNumber:fail not bind phone", (Map<String, Object>) null);
        } else {
            Map b = C90363p0.m113143b(new C13604l("phoneNumber", this.f23605e));
            C13849g gVar2 = this.f23606f.f39001d;
            String str3 = this.f23607g.f38990c;
            C6439g2.f23461d.getClass();
            gVar2.mo10774a(str3, "requestBindPhoneNumber:ok", b);
        }
        C117292a.m165361g(this, "com/tencent/mm/plugin/webview/ui/tools/newjsapi/JsApiRequestBindPhoneNumber$showRequestPhoneNumDialog$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}

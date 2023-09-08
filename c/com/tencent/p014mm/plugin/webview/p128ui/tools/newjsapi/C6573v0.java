package com.tencent.p014mm.plugin.webview.p128ui.tools.newjsapi;

import android.view.View;
import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C87412m;
import j20.C117292a;
import java.util.ArrayList;
import java.util.HashMap;
import t83.C13849g;
import t83.C13855j;
import t83.C48590l;

/* renamed from: com.tencent.mm.plugin.webview.ui.tools.newjsapi.v0 */
public final class C6573v0 implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ String f23795d;

    /* renamed from: e */
    public final /* synthetic */ C13855j f23796e;

    public C6573v0(String str, C13855j jVar) {
        this.f23795d = str;
        this.f23796e = jVar;
    }

    public final void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/webview/ui/tools/newjsapi/JsApiHandleMPPageAction$showNavShadow$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        Log.m105918d("MicroMsg.JsApiHandleMPPageAction", "click traceId=" + this.f23795d);
        HashMap hashMap = new HashMap(1);
        hashMap.put("traceId", this.f23795d);
        C13849g gVar = this.f23796e.f39001d;
        C87412m.m108592e(gVar, "null cannot be cast to non-null type com.tencent.mm.plugin.webview.jsapi.JsApiHandler");
        ((C48590l) gVar).mo8701f("onNavShadowClick", hashMap);
        C117292a.m165361g(this, "com/tencent/mm/plugin/webview/ui/tools/newjsapi/JsApiHandleMPPageAction$showNavShadow$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}

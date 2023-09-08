package com.tencent.p014mm.plugin.appbrand.p026ui;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import j20.C117292a;
import java.util.ArrayList;
import ke3.C88144b;

/* renamed from: com.tencent.mm.plugin.appbrand.ui.e0 */
public class C1983e0 implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ String f11899d;

    /* renamed from: e */
    public final /* synthetic */ C84552k0 f11900e;

    public C1983e0(C84552k0 k0Var, String str) {
        this.f11900e = k0Var;
        this.f11899d = str;
    }

    public void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/appbrand/ui/AppBrandGameUILoadingSplash$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        C88144b.m109791i(this.f11900e.f246743x.mo113026R(), "webview", ".ui.tools.WebViewUI", new Intent().putExtra("rawUrl", this.f11899d).putExtra("forceHideShare", true), (Bundle) null);
        C117292a.m165361g(this, "com/tencent/mm/plugin/appbrand/ui/AppBrandGameUILoadingSplash$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}

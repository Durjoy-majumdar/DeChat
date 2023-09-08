package com.tencent.p014mm.plugin.appbrand.p026ui;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import com.tencent.p014mm.protocal.protobuf.RelievedBuyInfo;
import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C87412m;
import j20.C117292a;
import java.util.ArrayList;
import ke3.C88144b;

/* renamed from: com.tencent.mm.plugin.appbrand.ui.k1 */
public final class C2002k1 implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ C1987f1 f11935d;

    /* renamed from: e */
    public final /* synthetic */ RelievedBuyInfo f11936e;

    public C2002k1(C1987f1 f1Var, RelievedBuyInfo relievedBuyInfo) {
        this.f11935d = f1Var;
        this.f11936e = relievedBuyInfo;
    }

    public final void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/appbrand/ui/AppBrandProfileRelievedBuyHalfScreenComponent$attachRelievedBuyInfo$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        C1987f1 f1Var = this.f11935d;
        String str = this.f11936e.click_url;
        C87412m.m108593f(str, "relievedBuyInfo.click_url");
        f1Var.getClass();
        Log.m105924i("MicroMsg.AppBrand.AppBrandProfileRelievedBuyHalfScreenComponent", "jump2WebView, url: " + str);
        C88144b.m109791i(f1Var.f11901a, "webview", ".ui.tools.WebViewUI", new Intent().putExtra("rawUrl", str).putExtra("forceHideShare", true), (Bundle) null);
        C117292a.m165361g(this, "com/tencent/mm/plugin/appbrand/ui/AppBrandProfileRelievedBuyHalfScreenComponent$attachRelievedBuyInfo$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}

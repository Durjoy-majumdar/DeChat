package com.tencent.p014mm.plugin.appbrand.p026ui;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import com.tencent.p014mm.plugin.appbrand.C83727p2;
import com.tencent.p014mm.plugin.appbrand.config.WxaProfileAttributes;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import j20.C117292a;
import java.util.ArrayList;
import ke3.C88144b;

/* renamed from: com.tencent.mm.plugin.appbrand.ui.e2 */
public class C84523e2 implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ AppBrandProfileUI f246665d;

    public C84523e2(AppBrandProfileUI appBrandProfileUI) {
        this.f246665d = appBrandProfileUI;
    }

    public void onClick(View view) {
        String str;
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/appbrand/ui/AppBrandProfileUI$7", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        WxaProfileAttributes wxaProfileAttributes = this.f246665d.f246452h;
        if (wxaProfileAttributes != null && !Util.isNullOrNil(wxaProfileAttributes.f239576e)) {
            AppBrandProfileUI appBrandProfileUI = this.f246665d;
            Intent intent = new Intent();
            String str2 = this.f246665d.f246452h.f239576e;
            String str3 = C83727p2.f244372d;
            if (Util.isNullOrNil(str2)) {
                Log.m105920e("MicroMsg.AppBrandUrlBuilders", "buildEntityUrl fail, null or nil appId");
                str = "";
            } else {
                str = String.format(C83727p2.f244374f, new Object[]{str2});
            }
            C88144b.m109791i(appBrandProfileUI, "webview", ".ui.tools.WebViewUI", intent.putExtra("rawUrl", str).putExtra("forceHideShare", true), (Bundle) null);
            this.f246665d.mo117090L7(16, 1);
        }
        C117292a.m165361g(this, "com/tencent/mm/plugin/appbrand/ui/AppBrandProfileUI$7", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}

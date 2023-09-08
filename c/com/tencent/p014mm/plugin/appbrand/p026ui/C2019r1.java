package com.tencent.p014mm.plugin.appbrand.p026ui;

import android.content.Intent;
import android.view.View;
import com.tencent.p014mm.plugin.appbrand.config.WxaProfileAttributes;
import com.tencent.p014mm.sdk.platformtools.Util;
import j20.C117292a;
import java.util.ArrayList;
import ke3.C88144b;

/* renamed from: com.tencent.mm.plugin.appbrand.ui.r1 */
public class C2019r1 implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ WxaProfileAttributes f11965d;

    /* renamed from: e */
    public final /* synthetic */ AppBrandProfileUI f11966e;

    public C2019r1(AppBrandProfileUI appBrandProfileUI, WxaProfileAttributes wxaProfileAttributes) {
        this.f11966e = appBrandProfileUI;
        this.f11965d = wxaProfileAttributes;
    }

    public void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/appbrand/ui/AppBrandProfileUI$14", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        AppBrandProfileUI appBrandProfileUI = this.f11966e;
        String str = this.f11965d.f239579h;
        String[] strArr = {str};
        int i = AppBrandProfileUI.f246424V;
        appBrandProfileUI.getClass();
        if (!Util.isNullOrNil(str)) {
            Intent intent = new Intent();
            intent.putExtra("nowUrl", str);
            intent.putExtra("thumbUrl", str);
            intent.putExtra("urlList", strArr);
            intent.putExtra("isFromWebView", false);
            intent.putExtra("shouldShowScanQrCodeMenu", false);
            C88144b.m109796n(appBrandProfileUI, "subapp", ".ui.gallery.GestureGalleryUI", intent, appBrandProfileUI.hashCode() & 65535, false);
            appBrandProfileUI.mo117090L7(14, 1);
        }
        C117292a.m165361g(this, "com/tencent/mm/plugin/appbrand/ui/AppBrandProfileUI$14", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}

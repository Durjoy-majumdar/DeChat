package com.tencent.p014mm.plugin.appbrand.p026ui;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.sdk.platformtools.Util;
import j20.C117292a;
import java.util.ArrayList;
import ke3.C88144b;

/* renamed from: com.tencent.mm.plugin.appbrand.ui.t1 */
public class C2023t1 extends ClickableSpan {

    /* renamed from: d */
    public final /* synthetic */ String f11970d;

    /* renamed from: e */
    public final /* synthetic */ AppBrandProfileUI f11971e;

    public C2023t1(AppBrandProfileUI appBrandProfileUI, String str) {
        this.f11971e = appBrandProfileUI;
        this.f11970d = str;
    }

    public void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/appbrand/ui/AppBrandProfileUI$16", "android/text/style/ClickableSpan", "onClick", "(Landroid/view/View;)V", this, array);
        if (!Util.isNullOrNil(this.f11970d)) {
            Intent intent = new Intent();
            intent.putExtra("rawUrl", this.f11970d);
            C88144b.m109791i(this.f11971e.getContext(), "webview", ".ui.tools.WebViewUI", intent, (Bundle) null);
        }
        AppBrandProfileUI appBrandProfileUI = this.f11971e;
        int i = AppBrandProfileUI.f246424V;
        appBrandProfileUI.mo117090L7(22, 1);
        C117292a.m165361g(this, "com/tencent/mm/plugin/appbrand/ui/AppBrandProfileUI$16", "android/text/style/ClickableSpan", "onClick", "(Landroid/view/View;)V");
    }

    public void updateDrawState(TextPaint textPaint) {
        textPaint.setColor(this.f11971e.getResources().getColor(C0966R.color.a1d));
        textPaint.setUnderlineText(false);
    }
}

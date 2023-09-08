package com.tencent.p014mm.plugin.appbrand.p026ui;

import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import di0.C86299o;
import di3.C86312j;
import j20.C117292a;
import java.util.ArrayList;
import kr0.C76630x0;

/* renamed from: com.tencent.mm.plugin.appbrand.ui.s1 */
public class C2021s1 extends ClickableSpan {

    /* renamed from: d */
    public final /* synthetic */ AppBrandProfileUI f11968d;

    public C2021s1(AppBrandProfileUI appBrandProfileUI) {
        this.f11968d = appBrandProfileUI;
    }

    public void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/appbrand/ui/AppBrandProfileUI$15", "android/text/style/ClickableSpan", "onClick", "(Landroid/view/View;)V", this, array);
        C86299o oVar = new C86299o();
        oVar.f250929a = "gh_32d0f14ab3c6@app";
        oVar.f250939k = 1085;
        ((C76630x0) C86312j.m106911c(C76630x0.class)).mo106898tv(MMApplicationContext.getContext(), oVar);
        AppBrandProfileUI appBrandProfileUI = this.f11968d;
        int i = AppBrandProfileUI.f246424V;
        appBrandProfileUI.mo117090L7(24, 1);
        this.f11968d.getClass();
        C115669n.INSTANCE.idkeyStat((long) 1135, (long) 0, 1, false);
        Log.m105919d("MicroMsg.AppBrand.Profile.AppBrandProfileUI", "profileIDkeyReport id:%d,key:%d", 1135, 0);
        C117292a.m165361g(this, "com/tencent/mm/plugin/appbrand/ui/AppBrandProfileUI$15", "android/text/style/ClickableSpan", "onClick", "(Landroid/view/View;)V");
    }

    public void updateDrawState(TextPaint textPaint) {
        textPaint.setColor(this.f11968d.getResources().getColor(C0966R.color.a1d));
        textPaint.setUnderlineText(false);
    }
}

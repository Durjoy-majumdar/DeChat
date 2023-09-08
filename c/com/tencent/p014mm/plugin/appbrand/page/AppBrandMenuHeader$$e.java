package com.tencent.p014mm.plugin.appbrand.page;

import ai0.C79553f;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.view.View;
import com.tencent.p014mm.plugin.appbrand.p025ad.p945ui.AppBrandAdUI;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import j20.C117292a;
import java.util.ArrayList;
import java.util.Map;
import k20.C9556a;

/* renamed from: com.tencent.mm.plugin.appbrand.page.AppBrandMenuHeader$$e */
public class AppBrandMenuHeader$$e implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ C83928t1 f244396d;

    public AppBrandMenuHeader$$e(AppBrandMenuHeader appBrandMenuHeader, C83928t1 t1Var) {
        this.f244396d = t1Var;
    }

    public void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/appbrand/page/AppBrandMenuHeader$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        C83845l0 l0Var = this.f244396d.f245023g1;
        if (l0Var != null) {
            l0Var.mo116321e();
        }
        C83928t1 t1Var = this.f244396d;
        Map<String, Class<? extends AppBrandAdUI>> map = C79553f.f233288a;
        if (t1Var != null) {
            try {
                Context context = t1Var.getContext() != null ? t1Var.getContext() : MMApplicationContext.getContext();
                Intent putExtra = new Intent(context, C79553f.f233288a.get(MMApplicationContext.getProcessName().replaceFirst(MMApplicationContext.getPackageName(), ""))).putExtra("appId", t1Var.getAppId());
                if (!(context instanceof Activity)) {
                    putExtra.addFlags(268435456);
                }
                C9556a aVar = new C9556a();
                aVar.mo10233c(putExtra);
                C117292a.m165358d(context, aVar.mo10232b(), "com/tencent/mm/plugin/appbrand/ad/AppBrandAdUtils", "openAdUIFromMenu", "(Lcom/tencent/mm/plugin/appbrand/page/AppBrandPageView;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                context.startActivity((Intent) aVar.mo10231a(0));
                C117292a.m165359e(context, "com/tencent/mm/plugin/appbrand/ad/AppBrandAdUtils", "openAdUIFromMenu", "(Lcom/tencent/mm/plugin/appbrand/page/AppBrandPageView;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            } catch (Exception e) {
                Log.printErrStackTrace("MicroMsg.AppBrandAdUtils[AppBrandSplashAd]", e, "openAdUIFromMenu fail", new Object[0]);
            }
        }
        C117292a.m165361g(this, "com/tencent/mm/plugin/appbrand/page/AppBrandMenuHeader$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}

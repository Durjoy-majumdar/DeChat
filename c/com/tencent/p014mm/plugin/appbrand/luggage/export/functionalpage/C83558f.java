package com.tencent.p014mm.plugin.appbrand.luggage.export.functionalpage;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import com.tencent.p014mm.plugin.appbrand.config.AppBrandInitConfigWC;
import com.tencent.p014mm.plugin.appbrand.p026ui.AppBrandPluginUI;
import com.tencent.p014mm.plugin.appbrand.p026ui.AppBrandPluginUI4MM;
import com.tencent.p014mm.plugin.appbrand.p026ui.C84566n2;
import com.tencent.p014mm.plugin.appbrand.report.AppBrandStatObject;
import com.tencent.p014mm.sdk.platformtools.BuildInfo;
import fy3.C32224a;
import gy3.C87413o;
import j20.C117292a;
import k20.C9556a;
import rx3.C13598b0;

/* renamed from: com.tencent.mm.plugin.appbrand.luggage.export.functionalpage.f */
public final class C83558f extends C87413o implements C32224a<C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ Context f244107d;

    /* renamed from: e */
    public final /* synthetic */ AppBrandInitConfigWC f244108e;

    /* renamed from: f */
    public final /* synthetic */ AppBrandStatObject f244109f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C83558f(Context context, AppBrandInitConfigWC appBrandInitConfigWC, AppBrandStatObject appBrandStatObject) {
        super(0);
        this.f244107d = context;
        this.f244108e = appBrandInitConfigWC;
        this.f244109f = appBrandStatObject;
    }

    public Object invoke() {
        boolean z = C84566n2.m104152a() || C84566n2.m104160i();
        Context context = this.f244107d;
        Intent intent = new Intent();
        Context context2 = this.f244107d;
        AppBrandInitConfigWC appBrandInitConfigWC = this.f244108e;
        AppBrandStatObject appBrandStatObject = this.f244109f;
        intent.setClass(context2, z ? AppBrandPluginUI4MM.class : AppBrandPluginUI.class);
        if (!(context2 instanceof Activity)) {
            intent.addFlags(268435456);
        }
        intent.putExtra("key_launch_app_client_version", BuildInfo.CLIENT_VERSION_INT);
        intent.putExtra("key_appbrand_init_config", appBrandInitConfigWC);
        intent.putExtra("key_appbrand_stat_object", appBrandStatObject);
        C9556a aVar = new C9556a();
        aVar.mo10233c(intent);
        Context context3 = context;
        C117292a.m165358d(context3, aVar.mo10232b(), "com/tencent/mm/plugin/appbrand/luggage/export/functionalpage/FunctionalLaunchInterceptor$shouldInterceptLaunch$2$1", "invoke", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        context.startActivity((Intent) aVar.mo10231a(0));
        C117292a.m165359e(context3, "com/tencent/mm/plugin/appbrand/luggage/export/functionalpage/FunctionalLaunchInterceptor$shouldInterceptLaunch$2$1", "invoke", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        Context context4 = this.f244107d;
        Activity activity = context4 instanceof Activity ? (Activity) context4 : null;
        if (activity != null) {
            activity.overridePendingTransition(0, 0);
        }
        return C13598b0.f38549a;
    }
}

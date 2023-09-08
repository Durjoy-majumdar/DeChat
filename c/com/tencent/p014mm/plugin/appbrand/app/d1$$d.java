package com.tencent.p014mm.plugin.appbrand.app;

import android.text.TextUtils;
import c30.C104289g;
import com.tencent.p014mm.plugin.appbrand.config.AppBrandLaunchReferrer;
import com.tencent.p014mm.plugin.appbrand.launching.C83285a;
import com.tencent.p014mm.plugin.appbrand.launching.params.LaunchParcel;
import com.tencent.p014mm.plugin.appbrand.launching.precondition.C83428o;
import com.tencent.p014mm.plugin.appbrand.luggage.export.functionalpage.C40492b;
import com.tencent.p014mm.plugin.appbrand.report.AppBrandStatObject;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.xweb.file.XVFSFile;
import gy3.C8480h;
import gy3.C87412m;
import hp3.C87581a;

/* renamed from: com.tencent.mm.plugin.appbrand.app.d1$$d */
public class d1$$d implements C87581a<Void, Void> {

    /* renamed from: a */
    public final /* synthetic */ String f238462a;

    /* renamed from: b */
    public final /* synthetic */ String f238463b;

    public d1$$d(C81152d1 d1Var, String str, String str2) {
        this.f238462a = str;
        this.f238463b = str2;
    }

    public Object call(Object obj) {
        Void voidR = (Void) obj;
        String str = this.f238462a;
        C87412m.m108594g(str, "uuid");
        new C40492b(str, 1, (String) null, 4, (C8480h) null).mo9225i();
        try {
            C104289g gVar = new C104289g(this.f238463b);
            if (!C81152d1.vx0(this.f238462a, gVar)) {
                C104289g gVar2 = new C104289g(gVar.optString("invokeData"));
                String optString = gVar2.optString("miniprogramAppID");
                if (TextUtils.isEmpty(optString)) {
                    Log.m105920e("MicroMsg.AppBrand.ServiceForWebView", "privateOpenWeappFunctionalPage, invalid miniprogramAppId");
                    String str2 = this.f238462a;
                    C87412m.m108594g(str2, "uuid");
                    new C40492b(str2, 4, (String) null, 4, (C8480h) null).mo9225i();
                } else {
                    String optString2 = gVar2.optString("path", "__wx__/open-api-redirecting-page");
                    String optString3 = gVar2.optString("name");
                    String optString4 = gVar.optString("runtimeAppid");
                    AppBrandStatObject appBrandStatObject = new AppBrandStatObject();
                    appBrandStatObject.f245533f = 1111;
                    appBrandStatObject.f245534g = optString4 + XVFSFile.PATH_SEPARATOR + optString3;
                    AppBrandLaunchReferrer appBrandLaunchReferrer = new AppBrandLaunchReferrer();
                    appBrandLaunchReferrer.f239396d = 7;
                    appBrandLaunchReferrer.f239397e = null;
                    appBrandLaunchReferrer.f239405p = gVar2.toString();
                    LaunchParcel launchParcel = new LaunchParcel();
                    launchParcel.f243731e = optString;
                    launchParcel.f243735i = optString2;
                    launchParcel.f243738o = appBrandStatObject;
                    launchParcel.f243739p = appBrandLaunchReferrer;
                    launchParcel.f243746w = new C81160g1(this);
                    ((C83285a) C83428o.f243800a).mo115582b(MMApplicationContext.getContext(), launchParcel);
                }
            }
        } catch (Exception e) {
            Log.m105921e("MicroMsg.AppBrand.ServiceForWebView", "privateOpenWeappFunctionalPage, parse failed e = %s, uuid = %s, json = %s", e, this.f238462a, this.f238463b);
            String str3 = this.f238462a;
            C87412m.m108594g(str3, "uuid");
            new C40492b(str3, 4, (String) null, 4, (C8480h) null).mo9225i();
        }
        return null;
    }
}

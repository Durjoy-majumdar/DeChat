package com.tencent.p014mm.plugin.appbrand.jsapi;

import android.content.Context;
import android.content.Intent;
import com.tencent.p014mm.plugin.appbrand.AppBrandRuntimeWC;
import com.tencent.p014mm.plugin.appbrand.appcache.C81243g;
import com.tencent.p014mm.plugin.appbrand.appstorage.C81415h0;
import com.tencent.p014mm.plugin.appbrand.config.AppBrandInitConfigWC;
import com.tencent.p014mm.plugin.appbrand.config.C81634a;
import com.tencent.p014mm.plugin.appbrand.ipc.C81956c;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.vfs.C86009m1;
import gy3.C8480h;
import gy3.C87412m;
import kr0.C88267e;
import org.json.JSONObject;
import p225rc.C12969d;
import z04.C112551y;

/* renamed from: com.tencent.mm.plugin.appbrand.jsapi.e6 */
public final class C82379e6 extends C82268c<C88267e> {
    private static final int CTRL_INDEX = 1014;
    private static final String NAME = "publishWeChatState";

    /* renamed from: u */
    public void mo1505u(C82381f fVar, JSONObject jSONObject, int i) {
        String str;
        Intent intent;
        SetTextStatusParams setTextStatusParams;
        String str2;
        C81634a F;
        C86009m1 absoluteFile;
        String i2;
        C81634a F2;
        AppBrandInitConfigWC M1;
        AppBrandInitConfigWC M12;
        AppBrandInitConfigWC M13;
        JSONObject jSONObject2 = jSONObject;
        C88267e eVar = (C88267e) fVar;
        if (eVar == null) {
            Log.m105928w("MicroMsg.AppBrand.JsApiSetTextStatus", "invoke, env is null");
            return;
        }
        String appId = eVar.getAppId();
        String str3 = "";
        String str4 = appId == null ? str3 : appId;
        AppBrandRuntimeWC N0 = eVar.getRuntime();
        String str5 = (N0 == null || (M13 = N0.mo113210l1()) == null) ? null : M13.f234839s;
        String str6 = str5 == null ? str3 : str5;
        AppBrandRuntimeWC N02 = eVar.getRuntime();
        int i3 = N02 != null ? N02.f238149o.f239365g : 0;
        AppBrandRuntimeWC N03 = eVar.getRuntime();
        int i4 = (N03 == null || (M12 = N03.mo113210l1()) == null) ? 0 : M12.f234802F;
        AppBrandRuntimeWC N04 = eVar.getRuntime();
        String I1 = N04 != null ? N04.mo113177I1() : null;
        if (I1 == null) {
            I1 = str3;
        }
        if (i3 == 0) {
            str = I1;
        } else {
            str = I1 + 183 + C81243g.m99551a(i3);
        }
        Log.m105924i("MicroMsg.AppBrand.JsApiSetTextStatus", "prepareParams, rawAppName: " + I1 + ", appName: " + str);
        AppBrandRuntimeWC N05 = eVar.getRuntime();
        String str7 = (N05 == null || (M1 = N05.mo113210l1()) == null) ? null : M1.f239364f;
        String str8 = str7 == null ? str3 : str7;
        if (jSONObject2 == null) {
            AppBrandRuntimeWC N06 = eVar.getRuntime();
            String b = (N06 == null || (F2 = N06.mo113008F()) == null) ? null : F2.mo113983b();
            String str9 = b == null ? str3 : b;
            intent = null;
            setTextStatusParams = new SetTextStatusParams((String) null, (String) null, (String) null, str9, (String) null, (String) null, str4, str6, i3, i4, str, str8, 55, (C8480h) null);
        } else {
            String str10 = str;
            String a = C12969d.m12407a(jSONObject2, "state");
            String a2 = C12969d.m12407a(jSONObject2, "imgUrl");
            if (C112551y.m153820t(a2, "wxfile://", false, 2, (Object) null)) {
                C81415h0 fileSystem = eVar.getFileSystem();
                str2 = (fileSystem == null || (absoluteFile = fileSystem.getAbsoluteFile(a2)) == null || (i2 = absoluteFile.mo119971i()) == null) ? str3 : i2;
            } else {
                str2 = a2;
            }
            Log.m105924i("MicroMsg.AppBrand.JsApiSetTextStatus", "prepareParams, rawThumbUrl: " + a2 + ", thumbUrl: " + str2);
            String a3 = C12969d.m12407a(jSONObject2, "desc");
            AppBrandRuntimeWC N07 = eVar.getRuntime();
            String b2 = (N07 == null || (F = N07.mo113008F()) == null) ? null : F.mo113983b();
            if (b2 != null) {
                str3 = b2;
            }
            Object opt = jSONObject2.opt("url");
            if (opt instanceof String) {
                str3 = (String) opt;
            }
            String str11 = str2;
            String str12 = a3;
            String str13 = str3;
            intent = null;
            setTextStatusParams = new SetTextStatusParams(a, str11, str12, str13, C12969d.m12407a(jSONObject2, "verifyInfo"), C12969d.m12407a(jSONObject2, "activityId"), str4, str6, i3, i4, str10, str8);
        }
        Log.m105924i("MicroMsg.AppBrand.JsApiSetTextStatus", "prepareParams, setTextStatusParams: " + setTextStatusParams);
        Context context = eVar.getContext();
        if (context == null) {
            context = MMApplicationContext.getContext();
        }
        C87412m.m108593f(context, "env.context ?: MMApplicationContext.getContext()");
        C81956c.m100675c(context, new DoSetTextStatusRequest(setTextStatusParams), new C55474c6(new C82371d6(eVar, i, this)), intent);
    }
}

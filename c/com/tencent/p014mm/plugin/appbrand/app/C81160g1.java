package com.tencent.p014mm.plugin.appbrand.app;

import android.os.Parcelable;
import c30.C104289g;
import c30.C79923f;
import com.tencent.luggage.sdk.launching.C80242c;
import com.tencent.p014mm.plugin.appbrand.luggage.export.functionalpage.ByRuntimeQrcodeResult;
import com.tencent.p014mm.plugin.appbrand.luggage.export.functionalpage.C40492b;
import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C87412m;

/* renamed from: com.tencent.mm.plugin.appbrand.app.g1 */
public class C81160g1 extends C80242c<ByRuntimeQrcodeResult> {

    /* renamed from: b */
    public final /* synthetic */ d1$$d f238468b;

    public C81160g1(d1$$d d1__d) {
        this.f238468b = d1__d;
    }

    /* renamed from: a */
    public void mo111345a(Parcelable parcelable) {
        String str;
        ByRuntimeQrcodeResult byRuntimeQrcodeResult = (ByRuntimeQrcodeResult) parcelable;
        if (byRuntimeQrcodeResult != null) {
            try {
                str = new C104289g().put("transitiveData", byRuntimeQrcodeResult.f244074e).put("data", byRuntimeQrcodeResult.f244073d).toString();
            } catch (C79923f e) {
                Log.m105921e("MicroMsg.AppBrand.Functional.ByRuntimeQrcodeResult", "toJsonString e = %s", e);
            }
            String str2 = this.f238468b.f238462a;
            C87412m.m108594g(str2, "uuid");
            C87412m.m108594g(str, "respData");
            new C40492b(str2, 5, str).mo9225i();
        }
        str = "{}";
        String str22 = this.f238468b.f238462a;
        C87412m.m108594g(str22, "uuid");
        C87412m.m108594g(str, "respData");
        new C40492b(str22, 5, str).mo9225i();
    }
}

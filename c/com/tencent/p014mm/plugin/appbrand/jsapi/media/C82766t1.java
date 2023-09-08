package com.tencent.p014mm.plugin.appbrand.jsapi.media;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import com.tencent.p014mm.plugin.appbrand.C81925i2;
import com.tencent.p014mm.plugin.appbrand.config.AppBrandInitConfigWC;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82268c;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82381f;
import com.tencent.p014mm.plugin.appbrand.page.C83780d1;
import com.tencent.p014mm.plugin.appbrand.report.AppBrandStatObject;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.vfs.C86009m1;
import ke3.C88144b;
import org.json.JSONArray;
import org.json.JSONObject;
import p170ic.C87687a;
import p225rc.C89916g;
import sn0.C13734a;
import sp0.C90272a;
import te3.d65;
import tj0.C90504b;
import uj0.C90665a;

/* renamed from: com.tencent.mm.plugin.appbrand.jsapi.media.t1 */
public class C82766t1 extends C82268c<C81925i2> {
    public static final int CTRL_INDEX = 30;
    public static final String NAME = "previewImage";

    /* renamed from: g */
    public final int f242098g = C87687a.m109085a(this);

    /* renamed from: u */
    public void mo1505u(C82381f fVar, JSONObject jSONObject, int i) {
        String str;
        int i2;
        C90665a aVar;
        JSONObject jSONObject2 = jSONObject;
        C81925i2 i2Var = (C81925i2) fVar;
        AppBrandInitConfigWC appBrandInitConfigWC = (AppBrandInitConfigWC) i2Var.getRuntime().mo113036W();
        if (!(appBrandInitConfigWC == null || !appBrandInitConfigWC.mo111300k() || (aVar = (C90665a) i2Var.mo114341l0().mo116150E0(C90665a.class)) == null || aVar.mo124807V() == null)) {
            d65 d65 = aVar.mo124807V().f260488a;
            if (d65 != null && d65.f182636d) {
                Log.m105924i("MicroMsg.JsApiPreviewImage", "addCustomDataListener to report canvas data");
                C90504b.m113326t(i2Var, i2Var.getAppId());
            }
        }
        Activity o0 = i2Var.mo114344o0();
        C83780d1 l0 = i2Var.mo114341l0();
        String appId = i2Var.getAppId();
        JSONArray optJSONArray = jSONObject2.optJSONArray("urls");
        if (optJSONArray == null || l0 == null || l0.mo116146A0() == null) {
            str = mo115109j("fail:invalid data");
        } else {
            int length = optJSONArray.length();
            String[] strArr = new String[length];
            for (int i3 = 0; i3 < optJSONArray.length(); i3++) {
                strArr[i3] = optJSONArray.optString(i3);
            }
            Object opt = jSONObject2.opt("current");
            if (opt instanceof Integer) {
                i2 = ((Integer) opt).intValue();
            } else if (opt instanceof String) {
                int i4 = 0;
                for (int i5 = 0; i5 < length; i5++) {
                    if (opt.equals(strArr[i5])) {
                        i4 = i5;
                    }
                }
                i2 = i4;
            } else {
                i2 = 0;
            }
            for (int i6 = 0; i6 < length; i6++) {
                C86009m1 absoluteFile = l0.getFileSystem().getAbsoluteFile(strArr[i6]);
                if (absoluteFile == null) {
                    absoluteFile = l0.getFileSystem().getPrivateAbsoluteFile(strArr[i6]);
                }
                if (absoluteFile != null) {
                    strArr[i6] = absoluteFile.mo119971i();
                }
            }
            String[] a = C13734a.m13038a(strArr);
            String[] b = C13734a.m13039b(a, strArr);
            if (i2 >= a.length) {
                i2 = 0;
            }
            if (!(o0 instanceof Activity)) {
                str = mo115109j("fail:internal error invalid android context");
            } else {
                boolean optBoolean = jSONObject2.optBoolean("showmenu", true);
                Log.m105925i("MicroMsg.JsApiPreviewImage", "showmenu:%b", Boolean.valueOf(optBoolean));
                Intent intent = new Intent();
                intent.putExtra("nowUrl", a[i2]);
                intent.putExtra("urlList", a);
                intent.putExtra("type", -255);
                intent.putExtra("isFromWebView", true);
                intent.putExtra("isFromAppBrand", true);
                intent.putExtra("showmenu", optBoolean);
                int i7 = l0.mo116146A0().getResources().getConfiguration().orientation;
                int i8 = i7 == 2 ? 0 : i7 == 1 ? 1 : -1;
                Log.m105925i("MicroMsg.JsApiPreviewImage", "KOrientation:%d", Integer.valueOf(i8));
                intent.putExtra("KOrientation", i8);
                C90272a aVar2 = (C90272a) l0.mo109671p(C90272a.class);
                if (aVar2 == null || Util.isNullOrNil(aVar2.f259122D)) {
                    Log.m105928w("MicroMsg.JsApiPreviewImage", "config.referer is null");
                } else {
                    C82705d2.m101475a(l0, jSONObject2, intent, aVar2.f259122D);
                }
                AppBrandInitConfigWC appBrandInitConfigWC2 = (AppBrandInitConfigWC) l0.getRuntime().mo113036W();
                if (appBrandInitConfigWC2 != null) {
                    intent.putExtra("wxaSessionId", appBrandInitConfigWC2.f234837q);
                    intent.putExtra("isFromAppBrandGame", appBrandInitConfigWC2.mo111300k());
                    AppBrandStatObject appBrandStatObject = appBrandInitConfigWC2.f234834c1;
                    if (appBrandStatObject != null) {
                        intent.putExtra("wxaScene", appBrandStatObject.f245533f);
                    }
                }
                intent.putExtra("shouldShowScanQrCodeMenu", true);
                intent.putExtra("scanQrCodeGetA8KeyScene", 44);
                Bundle bundle = new Bundle();
                bundle.putInt("stat_scene", 6);
                bundle.putString("stat_app_id", appId);
                bundle.putString("stat_url", l0.mo116162Q0());
                bundle.putString("wxappPathWithQuery", l0.mo116163R0());
                intent.putExtra("_stat_obj", bundle);
                intent.setClassName(o0, MMApplicationContext.getSourcePackageName() + ".plugin.subapp.ui.gallery.GestureGalleryUI");
                try {
                    int length2 = intent.getExtras().toString().length();
                    if (length2 > 524288) {
                        Log.m105921e("MicroMsg.JsApiPreviewImage", "data too large size:%d", Integer.valueOf(length2));
                        str = mo115109j("fail:data too large");
                    } else {
                        C89916g.m112446a(o0).mo124232f(new C82763s1(this, b));
                        C88144b.m109796n(o0, "subapp", ".ui.gallery.GestureGalleryUI", intent, this.f242098g, false);
                        str = mo115109j("ok");
                    }
                } catch (Exception e) {
                    Log.printErrStackTrace("MicroMsg.JsApiPreviewImage", e, "JsApiPreviewImage get size error", new Object[0]);
                    str = mo115109j("fail");
                }
            }
        }
        i2Var.mo109647a(i, str);
    }
}

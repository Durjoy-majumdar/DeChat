package com.tencent.p014mm.plugin.appbrand.app;

import com.tencent.p014mm.plugin.appbrand.jsapi.C1574a3;
import com.tencent.p014mm.plugin.appbrand.jsapi.C55516v3;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82543i5;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82870p;
import com.tencent.p014mm.plugin.appbrand.jsapi.JsApiOnWebPageUrlExposed;
import com.tencent.p014mm.plugin.appbrand.jsapi.JsApiPrivateAddContact;
import com.tencent.p014mm.plugin.appbrand.jsapi.advertise.C1586a;
import com.tencent.p014mm.plugin.appbrand.jsapi.appdownload.JsApiInstallDownloadTask;
import com.tencent.p014mm.plugin.appbrand.jsapi.bizvideochannel.JsApiOpenWebViewUseFastLoad;
import com.tencent.p014mm.plugin.appbrand.jsapi.channels.C55480f;
import com.tencent.p014mm.plugin.appbrand.jsapi.channels.C55483h;
import com.tencent.p014mm.plugin.appbrand.jsapi.channels.C55484i;
import com.tencent.p014mm.plugin.appbrand.jsapi.channels.C55486k;
import com.tencent.p014mm.plugin.appbrand.jsapi.channels.C55488m;
import com.tencent.p014mm.plugin.appbrand.jsapi.channels.C82294b;
import com.tencent.p014mm.plugin.appbrand.jsapi.channels.C82301j;
import com.tencent.p014mm.plugin.appbrand.jsapi.profile.C82895j;
import el0.C7735a;
import nm0.C11223g;
import nm0.C89030h;

/* renamed from: com.tencent.mm.plugin.appbrand.app.e */
public final class C81154e {
    /* renamed from: a */
    public static final C82870p m99438a(int i) {
        switch (i) {
            case 63:
                return new C89030h();
            case 64:
                return new C11223g();
            case 251:
                return new C55516v3();
            case 407:
                return new JsApiPrivateAddContact();
            case JsApiInstallDownloadTask.CTRL_INDEX:
                return new JsApiInstallDownloadTask();
            case 508:
                return new C82895j();
            case C82543i5.CTRL_INDEX /*678*/:
                return new C82543i5();
            case 711:
                return new C1574a3();
            case 764:
                return new JsApiOpenWebViewUseFastLoad();
            case JsApiOnWebPageUrlExposed.CTRL_INDEX:
                return new JsApiOnWebPageUrlExposed();
            case C7735a.CTRL_INDEX:
                return new C7735a();
            case C55480f.CTRL_INDEX:
                return new C55480f();
            case 969:
                return new C55488m();
            case 970:
                return new C82294b();
            case 984:
                return new C55484i();
            case 1001:
                return new C82301j();
            case 1065:
                return new C55486k();
            case 1112:
                return new C55483h();
            case 66012:
                return new C1586a();
            default:
                return null;
        }
    }
}

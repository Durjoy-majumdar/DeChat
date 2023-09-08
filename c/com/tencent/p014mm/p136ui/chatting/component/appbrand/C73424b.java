package com.tencent.p014mm.p136ui.chatting.component.appbrand;

import android.text.TextUtils;
import com.tencent.p014mm.plugin.appbrand.config.WxaExposedParams;
import com.tencent.p014mm.sdk.platformtools.Util;
import kj3.C76587i;

/* renamed from: com.tencent.mm.ui.chatting.component.appbrand.b */
public class C73424b implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ Runnable f215793d;

    /* renamed from: e */
    public final /* synthetic */ AppBrandServiceComponent f215794e;

    public C73424b(AppBrandServiceComponent appBrandServiceComponent, Runnable runnable) {
        this.f215794e = appBrandServiceComponent;
        this.f215793d = runnable;
    }

    public void run() {
        String str;
        String b = C76587i.m92182b(this.f215794e.f215796d.mo91577r());
        if (Util.isNullOrNil(b)) {
            b = this.f215794e.f215796d.mo91577r();
            str = Util.isNullOrNil(this.f215794e.f215796d.mo91576q()) ? C76587i.m92183c(this.f215794e.f215796d.mo91577r()) : this.f215794e.f215796d.mo91576q();
        } else {
            str = C76587i.m92183c(b);
        }
        AppBrandServiceComponent appBrandServiceComponent = this.f215794e;
        if (appBrandServiceComponent.f215774e == 3 && TextUtils.isEmpty(appBrandServiceComponent.f215776g.f239543h)) {
            this.f215794e.f215776g.f239543h = str;
        }
        int i = this.f215794e.f215774e;
        if (!(i == 2 || i == 3)) {
            WxaExposedParams.C81632b bVar = new WxaExposedParams.C81632b();
            bVar.f239557a = C76587i.m92181a(b);
            bVar.f239566j = 4;
            bVar.f239560d = b;
            bVar.f239561e = str;
            this.f215794e.f215776g = bVar.mo113977a();
        }
        Runnable runnable = this.f215793d;
        if (runnable != null) {
            runnable.run();
        }
    }
}

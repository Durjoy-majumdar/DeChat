package com.tencent.p014mm.plugin.appbrand.utils;

import android.content.Context;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82520h;
import com.tencent.p014mm.plugin.appbrand.utils.C84722b1;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import gy3.C8480h;
import gy3.C87412m;

/* renamed from: com.tencent.mm.plugin.appbrand.utils.i */
public final class C84747i implements C84722b1 {

    /* renamed from: b */
    public static final C84748a f247160b = new C84748a((C8480h) null);

    /* renamed from: a */
    public final Context f247161a;

    /* renamed from: com.tencent.mm.plugin.appbrand.utils.i$a */
    public static final class C84748a implements C84722b1.C84723a {
        public C84748a(C8480h hVar) {
        }

        /* renamed from: a */
        public C84722b1 mo109928a(C82520h hVar) {
            Context context;
            if (hVar == null || (context = hVar.getContext()) == null) {
                context = MMApplicationContext.getContext();
            }
            C87412m.m108593f(context, "componentView?.context ?…ationContext.getContext()");
            return new C84747i(context);
        }
    }

    public C84747i(Context context) {
        C87412m.m108594g(context, "context");
        this.f247161a = context;
    }

    /* renamed from: a */
    public C84797y1 mo109926a() {
        int i = this.f247161a.getResources().getConfiguration().orientation;
        return i != 1 ? i != 2 ? C84797y1.UNSPECIFIED : C84797y1.LANDSCAPE : C84797y1.PORTRAIT;
    }

    public String getName() {
        return "AndroidOrientationGetter";
    }
}

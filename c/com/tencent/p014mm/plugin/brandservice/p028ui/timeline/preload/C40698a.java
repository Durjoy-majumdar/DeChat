package com.tencent.p014mm.plugin.brandservice.p028ui.timeline.preload;

import android.webkit.ValueCallback;
import com.tencent.mapsdk.rastercore.tools.C40004IO;
import com.tencent.p014mm.plugin.appbrand.appcache.C40427l0;
import com.tencent.p014mm.plugin.appbrand.appcache.C81291m0;
import com.tencent.p014mm.plugin.appbrand.jsruntime.C40480g;
import com.tencent.p014mm.plugin.appbrand.jsruntime.C83148d;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMKVSlotManager;
import com.tencent.p014mm.sdk.platformtools.MultiProcessMMKV;
import com.tencent.p014mm.sdk.platformtools.Util;
import fy3.C32224a;
import fy3.C32226l;
import fy3.C32228q;
import gy3.C87412m;
import gy3.C87413o;
import java.io.Closeable;
import q73.C35812s;
import r73.C26114d;
import r73.C47930c;
import r73.C47937l;
import r73.C47943r;
import rx3.C13598b0;
import rx3.C13601g;
import rx3.C36568h;
import s73.C48255c;
import t73.C48571o;
import z04.C112551y;

/* renamed from: com.tencent.mm.plugin.brandservice.ui.timeline.preload.a */
public final class C40698a extends C48571o {

    /* renamed from: e */
    public static final C13601g<String> f109337e = C36568h.m40985a(C40699a.f109340d);

    /* renamed from: c */
    public String f109338c = "wxa06c02b5c00ff39b";

    /* renamed from: d */
    public final MMKVSlotManager f109339d;

    /* renamed from: com.tencent.mm.plugin.brandservice.ui.timeline.preload.a$a */
    public static final class C40699a extends C87413o implements C32224a<String> {

        /* renamed from: d */
        public static final C40699a f109340d = new C40699a();

        public C40699a() {
            super(0);
        }

        public /* bridge */ /* synthetic */ Object invoke() {
            return "/cgi-bin/mmbiz-bin/recommend/timelinecard";
        }
    }

    /* renamed from: com.tencent.mm.plugin.brandservice.ui.timeline.preload.a$b */
    public static final class C40700b extends C87413o implements C32228q<Integer, Integer, C40427l0, Boolean> {

        /* renamed from: d */
        public final /* synthetic */ C40698a f109341d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C40700b(C40698a aVar) {
            super(3);
            this.f109341d = aVar;
        }

        public Object invoke(Object obj, Object obj2, Object obj3) {
            boolean z;
            int intValue = ((Number) obj).intValue();
            int intValue2 = ((Number) obj2).intValue();
            C40427l0 l0Var = (C40427l0) obj3;
            C87412m.m108594g(l0Var, "resPkg");
            if (intValue2 > intValue) {
                C35812s sVar = C35812s.f95615a;
                C40698a aVar = this.f109341d;
                if (sVar.mo60423d(aVar.f109338c, l0Var, aVar.mo73188e().mo72996G1())) {
                    z = true;
                    return Boolean.valueOf(z);
                }
            }
            z = false;
            return Boolean.valueOf(z);
        }
    }

    /* renamed from: com.tencent.mm.plugin.brandservice.ui.timeline.preload.a$c */
    public static final class C40701c extends C87413o implements C32226l<C40480g, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C40698a f109342d;

        /* renamed from: e */
        public final /* synthetic */ String f109343e;

        /* renamed from: f */
        public final /* synthetic */ String f109344f;

        /* renamed from: g */
        public final /* synthetic */ String f109345g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C40701c(C40698a aVar, String str, String str2, String str3) {
            super(1);
            this.f109342d = aVar;
            this.f109343e = str;
            this.f109344f = str2;
            this.f109345g = str3;
        }

        public Object invoke(Object obj) {
            C87412m.m108594g((C40480g) obj, "cxt");
            C48255c e = this.f109342d.mo73188e();
            String str = this.f109343e;
            C47930c.C47931a.m53253a(e, str, "{target:'" + this.f109344f + '\'' + this.f109345g + '}', (ValueCallback) null, 4, (Object) null);
            return C13598b0.f38549a;
        }
    }

    public C40698a() {
        MultiProcessMMKV mmkv = MultiProcessMMKV.getMMKV("__WebJsEngineLocalData__");
        C87412m.m108593f(mmkv, "getMMKV(\"__WebJsEngineLocalData__\")");
        this.f109339d = new MMKVSlotManager(mmkv, 15552000);
    }

    /* renamed from: b */
    public boolean mo63601b(String str, String str2, String str3, String str4) {
        String str5;
        C87412m.m108594g(str3, "event");
        if (str == null || !Util.isEqual(this.f109338c, str)) {
            return false;
        }
        if (str4 == null || C112551y.m153811k(str4)) {
            str5 = "";
        } else {
            str5 = ',' + str4;
        }
        if (!mo73187d().containsKey(str)) {
            C40701c cVar = new C40701c(this, str3, str, str5);
            try {
                C40480g X = mo73188e().mo115378X();
                new C47943r(new C40703c(str, this)).mo72687a(X);
                C48255c.m53593z1(mo73188e(), X, "AdWebPrefetcherManifest#" + str, "manifest", (C32226l) null, mo73186c("manifest", this.f109338c), 8, (Object) null);
                C40427l0 g = mo63602g();
                C40480g X2 = mo73188e().mo115378X();
                new C47943r(new C40703c(str, this)).mo72687a(X2);
                new C47937l(new C40705d(this)).mo72687a(X2);
                new C26114d(new C18478e(this)).mo72687a(X2);
                C48255c.m53593z1(mo73188e(), X2, "AdWebPrefetcher#" + str, "prefetcher", (C32226l) null, mo73186c("prefetcher", this.f109338c), 8, (Object) null);
                Log.m105924i("MicroMsg.AdWebPrefetcherJsEngineInterceptor", "configPreFetcher /prefetcher.js");
                String f = C81291m0.m99670f(g, "/prefetcher.js");
                if (f.length() > 0) {
                    ((C83148d) X2).evaluateJavascript(f, new C40702b(this, str, X2, cVar));
                } else {
                    Log.m105928w("MicroMsg.AdWebPrefetcherJsEngineInterceptor", "configPreFetcher prefetcherJs is empty, id: " + str);
                }
                C40004IO.safeClose((Closeable) g);
            } catch (Exception e) {
                Log.printErrStackTrace("MicroMsg.AdWebPrefetcherJsEngineInterceptor", e, "configPreFetcher id=" + str, new Object[0]);
            }
        } else {
            C47930c.C47931a.m53253a(mo73188e(), str3, "{target:'" + str + '\'' + str5 + '}', (ValueCallback) null, 4, (Object) null);
        }
        return true;
    }

    /* renamed from: g */
    public C40427l0 mo63602g() {
        C48255c.C36632b bVar = C48255c.f129277x;
        C35812s sVar = C35812s.f95615a;
        boolean z = true;
        if (sVar.mo60422c() != 1) {
            z = false;
        }
        return C48255c.C36632b.m41016b(bVar, bVar.mo60770a("prefetcher/bizAd.wspkg", z, sVar.mo60421b(this.f109338c), this.f109338c), new C40700b(this), (C32228q) null, false, 12, (Object) null);
    }
}

package com.tencent.p014mm.plugin.appbrand.jsapi.auth;

import android.content.Context;
import android.graphics.Bitmap;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.appbrand.AppBrandRuntime;
import com.tencent.p014mm.plugin.appbrand.C81925i2;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82554k;
import com.tencent.p014mm.plugin.appbrand.page.C83780d1;
import com.tencent.p014mm.plugin.appbrand.report.AppBrandStatObject;
import com.tencent.p014mm.sdk.platformtools.MMHandlerThread;
import gt0.C87330d0;
import gy3.C87412m;
import java.util.ArrayList;
import lp3.C88629c;
import p224ra.C12964b;
import p963fc.C86812g;
import pe3.C47465a;
import te3.C49335eu3;
import te3.w55;
import yq0.C91566l;
import zp0.C16377l;

/* renamed from: com.tencent.mm.plugin.appbrand.jsapi.auth.i */
public interface C82166i {

    /* renamed from: com.tencent.mm.plugin.appbrand.jsapi.auth.i$a */
    public static final class C82167a extends Exception {
        public C82167a(String str) {
            super(str);
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.jsapi.auth.i$b */
    public static final class C82168b extends Exception {

        /* renamed from: d */
        public static final C82168b f240996d = new C82168b();
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.jsapi.auth.i$c */
    public static final class C82169c {

        /* renamed from: com.tencent.mm.plugin.appbrand.jsapi.auth.i$c$a */
        public static final class C82170a implements Runnable {

            /* renamed from: d */
            public final /* synthetic */ String f240997d;

            /* renamed from: e */
            public final /* synthetic */ Context f240998e;

            /* renamed from: f */
            public final /* synthetic */ String f240999f;

            /* renamed from: g */
            public final /* synthetic */ Bitmap f241000g;

            /* renamed from: h */
            public final /* synthetic */ C91566l f241001h;

            public C82170a(String str, Context context, String str2, Bitmap bitmap, C91566l lVar) {
                this.f240997d = str;
                this.f240998e = context;
                this.f240999f = str2;
                this.f241000g = bitmap;
                this.f241001h = lVar;
            }

            public final void run() {
                ArrayList arrayList = new ArrayList();
                arrayList.add(new C87330d0.C87331a(0, this.f240997d, this.f240998e.getResources().getString(C0966R.string.a4v), this.f240999f, this.f241000g, false, "", 0));
                this.f241001h.setSelectListItem(arrayList);
            }
        }

        /* renamed from: a */
        public static w55 m100887a(C82166i iVar, w55 w55, C82554k kVar) {
            AppBrandStatObject n1;
            C87412m.m108594g(w55, "$receiver");
            C87412m.m108594g(kVar, "service");
            AppBrandRuntime runtime = kVar.getRuntime();
            C86812g gVar = runtime instanceof C86812g ? (C86812g) runtime : null;
            int i = 0;
            w55.f143869e = (gVar == null || (n1 = gVar.mo121253n1()) == null) ? 0 : n1.f245533f;
            if (kVar instanceof C81925i2) {
                i = 1;
            } else if (kVar instanceof C83780d1) {
                i = 2;
            }
            w55.f143870f = i;
            return w55;
        }

        /* renamed from: b */
        public static Context m100888b(C82166i iVar, C82554k kVar) {
            C87412m.m108594g(kVar, "$receiver");
            Context context = kVar.getContext();
            if (context != null) {
                return context;
            }
            Context context2 = kVar.getRuntime().f238141d;
            C87412m.m108593f(context2, "{\n            this.runtime.appContext\n        }()");
            return context2;
        }

        /* renamed from: c */
        public static <R extends C49335eu3> C88629c<R> m100889c(C82166i iVar, C82554k kVar, String str, C47465a aVar, Class<R> cls) {
            C87412m.m108594g(kVar, "$receiver");
            C87412m.m108594g(str, "url");
            C87412m.m108594g(aVar, "request");
            C87412m.m108594g(cls, "clazz");
            C12964b l = kVar.mo109668l(C16377l.class);
            C87412m.m108591d(l);
            C88629c<R> YQ = ((C16377l) l).mo14840YQ(str, kVar.getAppId(), aVar, cls);
            C87412m.m108593f(YQ, "this.customize(ICgiServi…is.appId, request, clazz)");
            return YQ;
        }

        /* renamed from: d */
        public static void m100890d(C82166i iVar, Context context, Bitmap bitmap, String str, String str2, C91566l lVar) {
            C87412m.m108594g(context, "context");
            C87412m.m108594g(lVar, "dialog");
            MMHandlerThread.postToMainThread(new C82170a(str, context, str2, bitmap, lVar));
        }
    }
}

package ux0;

import a14.C0001s1;
import a14.C53895h;
import a14.C53934p0;
import android.content.Context;
import com.tencent.p014mm.plugin.appbrand.jsruntime.C40480g;
import com.tencent.p014mm.plugin.webview.luggage.jsapi.C43620m2;
import com.tencent.p014mm.sdk.platformtools.Log;
import di3.C86312j;
import fy3.C32227p;
import gy3.C87412m;
import java.util.ArrayList;
import java.util.LinkedList;
import p822sa.C48319p;
import p828wa.C53095a;
import p828wa.C53127q;
import rx3.C13598b0;
import s73.C48262e;
import vx0.C15017a;
import wx3.C15601d;
import wx3.C66212f;
import yx1.C53635c;

/* renamed from: ux0.f */
public final class C52634f extends C53127q implements C53095a {

    /* renamed from: f */
    public static final C52634f f146964f = new C52634f();

    /* renamed from: g */
    public static C52633e f146965g;

    /* renamed from: f */
    public static final void m58974f(C40480g gVar, String str, C32227p<? super Boolean, ? super String, C13598b0> pVar, C48262e eVar) {
        C87412m.m108594g(gVar, "context");
        C87412m.m108594g(pVar, "initCallback");
        C87412m.m108594g(eVar, "contextReporter");
        Log.m105924i("MicroMsg.GamePrefetchJsCoreAdapter", "alvinluo initGameJsPrefetchJsCore");
        C52633e.f146960e = gVar;
        C52633e eVar2 = C52633e.f146959d;
        C52633e.f146961f = new C48319p(eVar2);
        C53895h.m60466d(C0001s1.f0d, (C66212f) null, (C53934p0) null, new C52631c(eVar, pVar, str, (C15601d<? super C52631c>) null), 3, (Object) null);
        f146965g = eVar2;
        ArrayList<Class<? extends C43620m2<?>>> arrayList = C15017a.f41151a;
        C52634f fVar = f146964f;
        C87412m.m108594g(fVar, "runtime");
        C87412m.m108594g(fVar, "context");
        try {
            LinkedList<Class> dj02 = ((C53635c) C86312j.m106911c(C53635c.class)).dj0();
            C87412m.m108593f(dj02, "gameJsApiPool");
            for (Class cls : dj02) {
                C87412m.m108592e(cls, "null cannot be cast to non-null type java.lang.Class<com.tencent.luggage.container.LuggageJsApi<com.tencent.luggage.container.LuggageJsApiContext>>");
                fVar.mo73816e(cls, fVar);
            }
            for (Class cls2 : C15017a.f41151a) {
                C87412m.m108592e(cls2, "null cannot be cast to non-null type java.lang.Class<com.tencent.luggage.container.LuggageJsApi<com.tencent.luggage.container.LuggageJsApiContext>>");
                fVar.mo73816e(cls2, fVar);
            }
        } catch (Exception e) {
            Log.printErrStackTrace("MicroMsg.GamePrefetchJsApiPool", e, "[game-web-prefetch] init jsApiPool exception", new Object[0]);
        }
    }

    /* renamed from: c */
    public C48319p mo73584c() {
        if (f146965g != null) {
            return C52633e.f146961f;
        }
        C87412m.m108603p("jsCore");
        throw null;
    }

    /* renamed from: d */
    public String mo73585d() {
        C52633e eVar = f146965g;
        if (eVar != null) {
            String userAgent = eVar.getUserAgent();
            return userAgent == null ? "" : userAgent;
        }
        C87412m.m108603p("jsCore");
        throw null;
    }

    public Context getContext() {
        if (f146965g != null) {
            return null;
        }
        C87412m.m108603p("jsCore");
        throw null;
    }

    public C53127q getRuntime() {
        return this;
    }
}

package q52;

import android.app.Activity;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82268c;
import e42.C7594e;
import e42.C7596h;
import e42.C86430i;
import gy3.C87412m;

/* renamed from: q52.t */
public final class C89479t<T extends C7594e> extends C86430i<T> {

    /* renamed from: d */
    public final C82268c<?> f257538d;

    /* renamed from: e */
    public final String f257539e;

    public C89479t(C82268c<?> cVar, String str) {
        C87412m.m108594g(cVar, "jsapi");
        C87412m.m108594g(str, "appId");
        this.f257538d = cVar;
        this.f257539e = str;
    }

    /* renamed from: e */
    public String mo16e() {
        String e = this.f257538d.mo114779e();
        C87412m.m108593f(e, "jsapi.name");
        return e;
    }

    /* renamed from: o */
    public C86430i mo71237o() {
        return new C89479t(this.f257538d, this.f257539e);
    }

    /* renamed from: q */
    public void mo18q(C7596h hVar) {
        Activity e0;
        C87412m.m108594g(hVar, "data");
        T t = this.f251227a;
        if (t == null || (e0 = t.mo8720e0()) == null) {
            mo120840p().invoke(mo120842g(4096, "Run UI jsapi without activity context provide"));
            return;
        }
        C89467f fVar = new C89467f(e0, this.f257539e, mo120840p());
        C82268c<?> cVar = this.f257538d;
        C87412m.m108592e(cVar, "null cannot be cast to non-null type com.tencent.mm.plugin.appbrand.jsapi.AppBrandAsyncJsApi<com.tencent.mm.plugin.appbrand.jsapi.AppBrandComponent>");
        cVar.mo1505u(fVar, hVar, 0);
    }
}

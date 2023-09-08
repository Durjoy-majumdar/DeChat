package w42;

import com.tencent.p014mm.sdk.platformtools.Log;
import di3.C86312j;
import e42.C7594e;
import e42.C7596h;
import e42.C86430i;
import gy3.C87412m;
import p244tt.C14088e;

/* renamed from: w42.c */
public final class C15040c<T extends C7594e> extends C86430i<T> {

    /* renamed from: d */
    public final String f41176d = "MBJsApiOpenGameLiteApp";

    /* renamed from: w42.c$a */
    public static final class C15041a implements C14088e.C14090b {

        /* renamed from: a */
        public final /* synthetic */ C15040c<T> f41177a;

        public C15041a(C15040c<T> cVar) {
            this.f41177a = cVar;
        }

        /* renamed from: a */
        public void mo1717a() {
            Log.m105924i(this.f41177a.f41176d, "openLiteApp success!");
            this.f41177a.mo120840p().invoke(this.f41177a.mo120844i());
        }

        /* renamed from: b */
        public void mo1718b() {
            Log.m105924i(this.f41177a.f41176d, "openLiteApp fail!");
            this.f41177a.mo120840p().invoke(this.f41177a.mo120842g(1, "openLiteApp fail"));
        }
    }

    /* renamed from: e */
    public String mo16e() {
        return "openGameLiteApp";
    }

    /* renamed from: q */
    public void mo18q(C7596h hVar) {
        C87412m.m108594g(hVar, "data");
        String optString = hVar.optString("url");
        String str = this.f41176d;
        Log.m105924i(str, "url:" + optString);
        C14088e eVar = (C14088e) C86312j.m106911c(C14088e.class);
        T t = this.f251227a;
        eVar.mo13532yV(t != null ? t.mo8720e0() : null, optString, new C15041a(this));
    }
}

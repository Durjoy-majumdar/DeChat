package p163ho;

import e42.C7596h;
import e42.C86430i;
import fy3.C32227p;
import gy3.C87412m;
import gy3.C87413o;
import java.util.HashMap;
import p150eo.C86596j;
import p467co.C80112c;
import p467co.C80121e;
import rx3.C13598b0;

/* renamed from: ho.a */
public final class C8620a<T extends C86596j> extends C86430i<T> {

    /* renamed from: ho.a$a */
    public static final class C8621a extends C87413o implements C32227p<String, String, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C8620a<T> f27731d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C8621a(C8620a<T> aVar) {
            super(2);
            this.f27731d = aVar;
        }

        public Object invoke(Object obj, Object obj2) {
            String str = (String) obj;
            String str2 = (String) obj2;
            boolean z = false;
            if (str != null) {
                if (str.length() > 0) {
                    z = true;
                }
            }
            if (z) {
                this.f27731d.mo120840p().invoke(this.f27731d.mo120842g(1, str));
            } else {
                HashMap hashMap = new HashMap();
                hashMap.put("sessionId", str2);
                this.f27731d.mo120840p().invoke(this.f27731d.mo120846k(hashMap));
            }
            return C13598b0.f38549a;
        }
    }

    /* renamed from: e */
    public String mo16e() {
        return "getBrandServiceInfo";
    }

    /* renamed from: l */
    public boolean mo17l() {
        return true;
    }

    /* renamed from: q */
    public void mo18q(C7596h hVar) {
        C87412m.m108594g(hVar, "data");
        C86596j jVar = (C86596j) this.f251227a;
        if (jVar != null) {
            C8621a aVar = new C8621a(this);
            C80112c cVar = jVar.f251534n;
            cVar.getClass();
            cVar.mo121193A("getBrandServiceSessionId", (byte[]) null, new C80121e(aVar));
        }
    }
}

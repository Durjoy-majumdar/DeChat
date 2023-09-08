package iz3;

import fy3.C32224a;
import fz3.C24497b0;
import gy3.C87412m;
import gy3.C87413o;
import mz3.C25073y;
import rx3.C13602i;
import rx3.C36568h;
import wy3.C26456g;
import xy3.C26571h;

/* renamed from: iz3.b */
public final class C24641b {

    /* renamed from: iz3.b$a */
    public static final class C24642a extends C87413o implements C32224a<C24497b0> {

        /* renamed from: d */
        public final /* synthetic */ C24651h f70254d;

        /* renamed from: e */
        public final /* synthetic */ C26571h f70255e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C24642a(C24651h hVar, C26571h hVar2) {
            super(0);
            this.f70254d = hVar;
            this.f70255e = hVar2;
        }

        public Object invoke() {
            C24651h hVar = this.f70254d;
            C26571h hVar2 = this.f70255e;
            C87412m.m108594g(hVar, "<this>");
            C87412m.m108594g(hVar2, "additionalAnnotations");
            return hVar.f70290a.f70272q.mo51182b((C24497b0) hVar.f70293d.getValue(), hVar2);
        }
    }

    /* renamed from: a */
    public static C24651h m30819a(C24651h hVar, C26456g gVar, C25073y yVar, int i, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            yVar = null;
        }
        if ((i2 & 4) != 0) {
            i = 0;
        }
        C87412m.m108594g(hVar, "<this>");
        C87412m.m108594g(gVar, "containingDeclaration");
        return new C24651h(hVar.f70290a, yVar != null ? new C24652i(hVar, gVar, yVar, i) : hVar.f70291b, C36568h.m40986b(C13602i.NONE, new C24640a(hVar, gVar)));
    }

    /* renamed from: b */
    public static final C24651h m30820b(C24651h hVar, C26571h hVar2) {
        C87412m.m108594g(hVar, "<this>");
        C87412m.m108594g(hVar2, "additionalAnnotations");
        return hVar2.isEmpty() ? hVar : new C24651h(hVar.f70290a, hVar.f70291b, C36568h.m40986b(C13602i.NONE, new C24642a(hVar, hVar2)));
    }
}

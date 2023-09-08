package iz3;

import fy3.C32224a;
import fz3.C24497b0;
import gy3.C87412m;
import gy3.C87413o;
import wy3.C26456g;
import xy3.C26571h;

/* renamed from: iz3.a */
public final class C24640a extends C87413o implements C32224a<C24497b0> {

    /* renamed from: d */
    public final /* synthetic */ C24651h f70252d;

    /* renamed from: e */
    public final /* synthetic */ C26456g f70253e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C24640a(C24651h hVar, C26456g gVar) {
        super(0);
        this.f70252d = hVar;
        this.f70253e = gVar;
    }

    public Object invoke() {
        C24651h hVar = this.f70252d;
        C26571h annotations = this.f70253e.getAnnotations();
        C87412m.m108594g(hVar, "<this>");
        C87412m.m108594g(annotations, "additionalAnnotations");
        return hVar.f70290a.f70272q.mo51182b((C24497b0) hVar.f70293d.getValue(), annotations);
    }
}

package p658q1;

import fy3.C32224a;
import fy3.C32226l;
import gy3.C87412m;
import gy3.C87413o;
import p1140p1.C110095a;
import p1140p1.C110096b;
import p1140p1.C110098d;
import p1140p1.C110099e;
import p410k0.C108793e;
import rx3.C13598b0;

/* renamed from: q1.w */
public final class C110325w implements C32224a<C13598b0>, C110289d0, C110099e {

    /* renamed from: h */
    public static final C32226l<C110325w, C13598b0> f330030h = C110327b.f330036d;

    /* renamed from: i */
    public static final C110099e f330031i = new C110326a();

    /* renamed from: d */
    public C110329x f330032d;

    /* renamed from: e */
    public final C110096b f330033e;

    /* renamed from: f */
    public final C108793e<C110095a<?>> f330034f = new C108793e<>(new C110095a[16], 0);

    /* renamed from: g */
    public boolean f330035g;

    /* renamed from: q1.w$a */
    public static final class C110326a implements C110099e {
        /* renamed from: a */
        public <T> T mo161499a(C110095a<T> aVar) {
            C87412m.m108594g(aVar, "<this>");
            return aVar.f329410a.invoke();
        }
    }

    /* renamed from: q1.w$b */
    public static final class C110327b extends C87413o implements C32226l<C110325w, C13598b0> {

        /* renamed from: d */
        public static final C110327b f330036d = new C110327b();

        public C110327b() {
            super(1);
        }

        public Object invoke(Object obj) {
            C110325w wVar = (C110325w) obj;
            C87412m.m108594g(wVar, "node");
            wVar.mo161779b();
            return C13598b0.f38549a;
        }
    }

    /* renamed from: q1.w$c */
    public static final class C110328c extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C110325w f330037d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C110328c(C110325w wVar) {
            super(0);
            this.f330037d = wVar;
        }

        public Object invoke() {
            C110325w wVar = this.f330037d;
            wVar.f330033e.mo145808U(wVar);
            return C13598b0.f38549a;
        }
    }

    public C110325w(C110329x xVar, C110096b bVar) {
        C87412m.m108594g(xVar, "provider");
        C87412m.m108594g(bVar, "modifier");
        this.f330032d = xVar;
        this.f330033e = bVar;
    }

    /* renamed from: a */
    public <T> T mo161499a(C110095a<T> aVar) {
        C87412m.m108594g(aVar, "<this>");
        this.f330034f.mo159860b(aVar);
        C110098d<?> b = this.f330032d.mo161781b(aVar);
        return b == null ? aVar.f329410a.invoke() : b.getValue();
    }

    /* renamed from: b */
    public final void mo161779b() {
        if (this.f330035g) {
            this.f330034f.mo159863e();
            C110310r.m150081a(this.f330032d.f330038d).getSnapshotObserver().mo161693a(this, f330030h, new C110328c(this));
        }
    }

    public Object invoke() {
        mo161779b();
        return C13598b0.f38549a;
    }

    public boolean isValid() {
        return this.f330035g;
    }
}

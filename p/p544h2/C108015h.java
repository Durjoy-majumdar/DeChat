package p544h2;

import fy3.C32224a;
import gy3.C87412m;
import gy3.C87413o;
import p436a1.C103257q;
import p436a1.C103272w;

/* renamed from: h2.h */
public interface C108015h {

    /* renamed from: a */
    public static final /* synthetic */ int f323461a = 0;

    /* renamed from: h2.h$a */
    public static final class C108016a {

        /* renamed from: h2.h$a$a */
        public static final class C108017a extends C87413o implements C32224a<C108015h> {

            /* renamed from: d */
            public final /* synthetic */ C108015h f323462d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C108017a(C108015h hVar) {
                super(0);
                this.f323462d = hVar;
            }

            public Object invoke() {
                return this.f323462d;
            }
        }

        /* renamed from: a */
        public static C108015h m146336a(C108015h hVar, C108015h hVar2) {
            C87412m.m108594g(hVar2, "other");
            return hVar2.mo158405c() != null ? hVar2 : hVar.mo158405c() != null ? hVar : hVar2.mo158404b(new C108017a(hVar));
        }
    }

    /* renamed from: h2.h$b */
    public static final class C108018b implements C108015h {

        /* renamed from: b */
        public static final C108018b f323463b = new C108018b();

        /* renamed from: a */
        public long mo158403a() {
            int i = C103272w.f304516h;
            return C103272w.f304515g;
        }

        /* renamed from: b */
        public C108015h mo158404b(C32224a<? extends C108015h> aVar) {
            C87412m.m108594g(aVar, "other");
            return !C87412m.m108589b(this, f323463b) ? this : (C108015h) aVar.invoke();
        }

        /* renamed from: c */
        public C103257q mo158405c() {
            return null;
        }

        /* renamed from: d */
        public C108015h mo158406d(C108015h hVar) {
            return C108016a.m146336a(this, hVar);
        }
    }

    /* renamed from: a */
    long mo158403a();

    /* renamed from: b */
    C108015h mo158404b(C32224a<? extends C108015h> aVar);

    /* renamed from: c */
    C103257q mo158405c();

    /* renamed from: d */
    C108015h mo158406d(C108015h hVar);
}

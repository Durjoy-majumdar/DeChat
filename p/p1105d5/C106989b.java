package p1105d5;

import gy3.C87412m;
import java.util.ArrayList;
import java.util.List;
import p1126j5.C108576g;
import p1128k5.C108894b;
import p593l5.C109269b;
import p972h5.C108139e;
import rx3.C13604l;
import sx3.C110818d0;

/* renamed from: d5.b */
public final class C106989b {

    /* renamed from: a */
    public final List<C108894b> f320252a;

    /* renamed from: b */
    public final List<C13604l<C109269b<? extends Object, ?>, Class<? extends Object>>> f320253b;

    /* renamed from: c */
    public final List<C13604l<C108576g<? extends Object>, Class<? extends Object>>> f320254c;

    /* renamed from: d */
    public final List<C108139e> f320255d;

    public C106989b(List<? extends C108894b> list, List<? extends C13604l<? extends C109269b<? extends Object, ?>, ? extends Class<? extends Object>>> list2, List<? extends C13604l<? extends C108576g<? extends Object>, ? extends Class<? extends Object>>> list3, List<? extends C108139e> list4) {
        this.f320252a = list;
        this.f320253b = list2;
        this.f320254c = list3;
        this.f320255d = list4;
    }

    /* renamed from: d5.b$a */
    public static final class C106990a {

        /* renamed from: a */
        public final List<C108894b> f320256a;

        /* renamed from: b */
        public final List<C13604l<C109269b<? extends Object, ?>, Class<? extends Object>>> f320257b;

        /* renamed from: c */
        public final List<C13604l<C108576g<? extends Object>, Class<? extends Object>>> f320258c;

        /* renamed from: d */
        public final List<C108139e> f320259d;

        public C106990a() {
            this.f320256a = new ArrayList();
            this.f320257b = new ArrayList();
            this.f320258c = new ArrayList();
            this.f320259d = new ArrayList();
        }

        /* renamed from: a */
        public final <T> C106990a mo157424a(C108576g<T> gVar, Class<T> cls) {
            C87412m.m108594g(gVar, "fetcher");
            C87412m.m108594g(cls, "type");
            this.f320258c.add(new C13604l(gVar, cls));
            return this;
        }

        /* renamed from: b */
        public final <T> C106990a mo157425b(C109269b<T, ?> bVar, Class<T> cls) {
            C87412m.m108594g(bVar, "mapper");
            C87412m.m108594g(cls, "type");
            this.f320257b.add(new C13604l(bVar, cls));
            return this;
        }

        /* renamed from: c */
        public final C106989b mo157426c() {
            return new C106989b(C110818d0.m150953y0(this.f320256a), C110818d0.m150953y0(this.f320257b), C110818d0.m150953y0(this.f320258c), C110818d0.m150953y0(this.f320259d));
        }

        public C106990a(C106989b bVar) {
            C87412m.m108594g(bVar, "registry");
            this.f320256a = C110818d0.m150900B0(bVar.f320252a);
            this.f320257b = C110818d0.m150900B0(bVar.f320253b);
            this.f320258c = C110818d0.m150900B0(bVar.f320254c);
            this.f320259d = C110818d0.m150900B0(bVar.f320255d);
        }
    }
}

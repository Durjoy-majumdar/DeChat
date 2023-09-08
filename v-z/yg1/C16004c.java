package yg1;

import cj1.C0540g1;
import cl1.C39970c;
import ej1.C7664a;
import ej1.C7665a0;
import ej1.C7670d;
import ej1.C7675d0;
import ej1.C7677e0;
import ej1.C7680f0;
import ej1.C7683h;
import ej1.C7685i;
import ej1.C7686i0;
import ej1.C7687j;
import ej1.C7688j0;
import ej1.C7689k;
import ej1.C7692l;
import ej1.C7701l0;
import ej1.C7703m0;
import ej1.C7707o;
import ej1.C7708p;
import ej1.C7709q;
import ej1.C7710r;
import ej1.C7711s;
import ej1.C7712t;
import ej1.C7714v;
import ej1.C7715w;
import ej1.C7721x;
import fj1.C45795b;
import fy3.C32224a;
import gy3.C87412m;
import gy3.C87413o;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import rx3.C13601g;
import rx3.C36568h;
import rx3.C36570n;

/* renamed from: yg1.c */
public final class C16004c extends C39970c<C45795b> {

    /* renamed from: f */
    public final String f43060f = "FinderLiveCommentItemService";

    /* renamed from: g */
    public final Map<Integer, C15999b> f43061g = Collections.synchronizedMap(new HashMap());

    /* renamed from: h */
    public int[] f43062h = new int[0];

    /* renamed from: i */
    public final C13601g f43063i = C36568h.m40985a(C16005a.f43065d);

    /* renamed from: j */
    public int f43064j = -1;

    /* renamed from: yg1.c$a */
    public static final class C16005a extends C87413o implements C32224a<C0540g1> {

        /* renamed from: d */
        public static final C16005a f43065d = new C16005a();

        public C16005a() {
            super(0);
        }

        public Object invoke() {
            return new C0540g1();
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C16004c(C45795b bVar) {
        super(bVar);
        C87412m.m108594g(bVar, "liveContext");
    }

    /* renamed from: c3 */
    public final C0540g1 mo14629c3() {
        return (C0540g1) ((C36570n) this.f43063i).getValue();
    }

    /* renamed from: d3 */
    public final void mo14630d3() {
        mo14631e3(new C7688j0(this.f107146d));
        mo14631e3(new C7664a(this.f107146d));
        mo14631e3(new C7689k(this.f107146d));
        mo14631e3(new C7685i(this.f107146d));
        mo14631e3(new C7683h(this.f107146d));
        mo14631e3(new C7687j(this.f107146d));
        mo14631e3(new C7692l(this.f107146d));
        mo14631e3(new C7708p(this.f107146d));
        mo14631e3(new C7710r(this.f107146d));
        mo14631e3(new C7712t(this.f107146d));
        mo14631e3(new C7714v(this.f107146d));
        mo14631e3(new C7715w(this.f107146d));
        mo14631e3(new C7665a0(this.f107146d));
        mo14631e3(new C7675d0(this.f107146d));
        mo14631e3(new C7686i0(this.f107146d));
        mo14631e3(new C7677e0(this.f107146d));
        mo14631e3(new C7680f0(this.f107146d));
        mo14631e3(new C7701l0(this.f107146d));
        mo14631e3(new C7721x(this.f107146d));
        mo14631e3(new C7670d(this.f107146d));
        mo14631e3(new C7711s(this.f107146d));
        mo14631e3(new C7709q(this.f107146d));
        mo14631e3(new C7707o(this.f107146d));
        mo14631e3(new C7703m0(this.f107146d));
    }

    /* renamed from: e3 */
    public final void mo14631e3(C15999b bVar) {
        if (!this.f43061g.containsKey(Integer.valueOf(bVar.mo8797j()))) {
            Map<Integer, C15999b> map = this.f43061g;
            C87412m.m108593f(map, "itemMap");
            map.put(Integer.valueOf(bVar.mo8797j()), bVar);
        }
    }

    public void onCleared() {
        for (Map.Entry value : this.f43061g.entrySet()) {
            ((C15999b) value.getValue()).mo8813k();
        }
        this.f43061g.clear();
    }
}

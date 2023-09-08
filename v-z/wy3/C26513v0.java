package wy3;

import d04.C24442a;
import fy3.C32224a;
import fy3.C32226l;
import g04.C20770i;
import gy3.C24560g0;
import gy3.C24575y;
import gy3.C8480h;
import gy3.C87412m;
import gy3.C87413o;
import m04.C21480i;
import m04.C24979m;
import m04.C24980n;
import n04.C25144j1;
import ny3.C89104m;
import o04.C25323e;

/* renamed from: wy3.v0 */
public final class C26513v0<T extends C20770i> {

    /* renamed from: e */
    public static final C26514a f73797e = new C26514a((C8480h) null);

    /* renamed from: f */
    public static final /* synthetic */ C89104m<Object>[] f73798f = {C24560g0.m30727c(new C24575y(C24560g0.m30725a(C26513v0.class), "scopeForOwnerModule", "getScopeForOwnerModule()Lorg/jetbrains/kotlin/resolve/scopes/MemberScope;"))};

    /* renamed from: a */
    public final C26447e f73799a;

    /* renamed from: b */
    public final C32226l<C25323e, T> f73800b;

    /* renamed from: c */
    public final C25323e f73801c;

    /* renamed from: d */
    public final C21480i f73802d;

    /* renamed from: wy3.v0$a */
    public static final class C26514a {
        public C26514a(C8480h hVar) {
        }

        /* renamed from: a */
        public final <T extends C20770i> C26513v0<T> mo53471a(C26447e eVar, C24980n nVar, C25323e eVar2, C32226l<? super C25323e, ? extends T> lVar) {
            C87412m.m108594g(eVar, "classDescriptor");
            C87412m.m108594g(nVar, "storageManager");
            C87412m.m108594g(eVar2, "kotlinTypeRefinerForOwnerModule");
            C87412m.m108594g(lVar, "scopeFactory");
            return new C26513v0(eVar, nVar, lVar, eVar2, (C8480h) null);
        }
    }

    /* renamed from: wy3.v0$b */
    public static final class C26515b extends C87413o implements C32224a<T> {

        /* renamed from: d */
        public final /* synthetic */ C26513v0<T> f73803d;

        /* renamed from: e */
        public final /* synthetic */ C25323e f73804e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C26515b(C26513v0<T> v0Var, C25323e eVar) {
            super(0);
            this.f73803d = v0Var;
            this.f73804e = eVar;
        }

        public Object invoke() {
            return (C20770i) this.f73803d.f73800b.invoke(this.f73804e);
        }
    }

    public C26513v0(C26447e eVar, C24980n nVar, C32226l lVar, C25323e eVar2, C8480h hVar) {
        this.f73799a = eVar;
        this.f73800b = lVar;
        this.f73801c = eVar2;
        this.f73802d = nVar.mo52006g(new C26518w0(this));
    }

    /* renamed from: a */
    public final T mo53470a(C25323e eVar) {
        C87412m.m108594g(eVar, "kotlinTypeRefiner");
        if (!eVar.mo52410d(C24442a.m30543j(this.f73799a))) {
            return (C20770i) C24979m.m31587a(this.f73802d, this, f73798f[0]);
        }
        C25144j1 l = this.f73799a.mo36110l();
        C87412m.m108593f(l, "classDescriptor.typeConstructor");
        return !eVar.mo52411e(l) ? (C20770i) C24979m.m31587a(this.f73802d, this, f73798f[0]) : eVar.mo52409c(this.f73799a, new C26515b(this, eVar));
    }
}

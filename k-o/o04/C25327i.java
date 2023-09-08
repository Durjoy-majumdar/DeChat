package o04;

import a04.C23605b;
import fy3.C32224a;
import gy3.C8480h;
import gy3.C87412m;
import gy3.C87413o;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import n04.C25143j0;
import n04.C25158m1;
import n04.C25198y1;
import r04.C26094c;
import rx3.C13601g;
import rx3.C13602i;
import rx3.C36568h;
import sx3.C26236u;
import sx3.C36907w;
import sx3.C64186f0;
import tx3.C26314b;
import ty3.C26336h;
import wy3.C22935h;
import wy3.C26446d1;

/* renamed from: o04.i */
public final class C25327i implements C23605b {

    /* renamed from: a */
    public final C25158m1 f71831a;

    /* renamed from: b */
    public C32224a<? extends List<? extends C25198y1>> f71832b;

    /* renamed from: c */
    public final C25327i f71833c;

    /* renamed from: d */
    public final C26446d1 f71834d;

    /* renamed from: e */
    public final C13601g f71835e;

    /* renamed from: f */
    public C25198y1 f71836f;

    /* renamed from: o04.i$a */
    public static final class C25328a extends C87413o implements C32224a<List<? extends C25198y1>> {

        /* renamed from: d */
        public final /* synthetic */ C25327i f71837d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C25328a(C25327i iVar) {
            super(0);
            this.f71837d = iVar;
        }

        public Object invoke() {
            C32224a<? extends List<? extends C25198y1>> aVar = this.f71837d.f71832b;
            if (aVar != null) {
                return (List) aVar.invoke();
            }
            return null;
        }
    }

    /* renamed from: o04.i$b */
    public static final class C25329b extends C87413o implements C32224a<List<? extends C25198y1>> {

        /* renamed from: d */
        public final /* synthetic */ C25327i f71838d;

        /* renamed from: e */
        public final /* synthetic */ C25323e f71839e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C25329b(C25327i iVar, C25323e eVar) {
            super(0);
            this.f71838d = iVar;
            this.f71839e = eVar;
        }

        public Object invoke() {
            List<C25198y1> b = this.f71838d.mo37096r();
            C25323e eVar = this.f71839e;
            ArrayList arrayList = new ArrayList(C36907w.m41090l(b, 10));
            Iterator it = ((C26314b) b).iterator();
            while (it.hasNext()) {
                arrayList.add(((C25198y1) it.next()).mo37085P0(eVar));
            }
            return arrayList;
        }
    }

    public C25327i(C25158m1 m1Var, C32224a<? extends List<? extends C25198y1>> aVar, C25327i iVar, C26446d1 d1Var) {
        C87412m.m108594g(m1Var, "projection");
        this.f71831a = m1Var;
        this.f71832b = aVar;
        this.f71833c = iVar;
        this.f71834d = d1Var;
        this.f71835e = C36568h.m40986b(C13602i.PUBLICATION, new C25328a(this));
    }

    /* renamed from: b */
    public List<C25198y1> mo37096r() {
        C26314b bVar = new C26314b();
        C25198y1 y1Var = this.f71836f;
        if (y1Var != null) {
            bVar.add(y1Var);
        }
        List list = (List) this.f71835e.getValue();
        if (list != null) {
            bVar.addAll(list);
        }
        return C26236u.m33718a(bVar);
    }

    /* renamed from: c */
    public C25327i mo37093n(C25323e eVar) {
        C87412m.m108594g(eVar, "kotlinTypeRefiner");
        C25158m1 n = this.f71831a.mo52298n(eVar);
        C87412m.m108593f(n, "projection.refine(kotlinTypeRefiner)");
        C25329b bVar = this.f71832b != null ? new C25329b(this, eVar) : null;
        C25327i iVar = this.f71833c;
        if (iVar == null) {
            iVar = this;
        }
        return new C25327i(n, bVar, iVar, this.f71834d);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!C87412m.m108589b(C25327i.class, obj != null ? obj.getClass() : null)) {
            return false;
        }
        C87412m.m108592e(obj, "null cannot be cast to non-null type org.jetbrains.kotlin.types.checker.NewCapturedTypeConstructor");
        C25327i iVar = (C25327i) obj;
        C25327i iVar2 = this.f71833c;
        if (iVar2 == null) {
            iVar2 = this;
        }
        C25327i iVar3 = iVar.f71833c;
        if (iVar3 != null) {
            iVar = iVar3;
        }
        return iVar2 == iVar;
    }

    public List<C26446d1> getParameters() {
        return C64186f0.f181907d;
    }

    public C25158m1 getProjection() {
        return this.f71831a;
    }

    public int hashCode() {
        C25327i iVar = this.f71833c;
        return iVar != null ? iVar.hashCode() : super.hashCode();
    }

    /* renamed from: m */
    public C26336h mo37092m() {
        C25143j0 type = this.f71831a.getType();
        C87412m.m108593f(type, "projection.type");
        return C26094c.m33425e(type);
    }

    /* renamed from: o */
    public C22935h mo37094o() {
        return null;
    }

    /* renamed from: p */
    public boolean mo37095p() {
        return false;
    }

    public String toString() {
        return "CapturedType(" + this.f71831a + ')';
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C25327i(C25158m1 m1Var, C32224a aVar, C25327i iVar, C26446d1 d1Var, int i, C8480h hVar) {
        this(m1Var, (i & 2) != 0 ? null : aVar, (i & 4) != 0 ? null : iVar, (i & 8) != 0 ? null : d1Var);
    }
}

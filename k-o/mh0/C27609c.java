package mh0;

import fy3.C32224a;
import gy3.C87412m;
import gy3.C87413o;
import rx3.C13601g;
import rx3.C13602i;
import rx3.C36568h;
import sm2.C101656f;
import z04.C112551y;

/* renamed from: mh0.c */
public final class C27609c extends C99862a {

    /* renamed from: l */
    public final C99862a f76500l = new C99862a();

    /* renamed from: m */
    public C101656f f76501m;

    /* renamed from: n */
    public String f76502n;

    /* renamed from: o */
    public C101656f.C101657a f76503o;

    /* renamed from: p */
    public final C13601g f76504p;

    /* renamed from: q */
    public final C13601g f76505q;

    /* renamed from: r */
    public final C13601g f76506r;

    /* renamed from: s */
    public final C13601g f76507s;

    /* renamed from: t */
    public final C13601g f76508t;

    /* renamed from: u */
    public final C13601g f76509u;

    /* renamed from: mh0.c$a */
    public static final class C27610a extends C87413o implements C32224a<Integer> {

        /* renamed from: d */
        public final /* synthetic */ C27609c f76510d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C27610a(C27609c cVar) {
            super(0);
            this.f76510d = cVar;
        }

        public Object invoke() {
            String O = C27609c.m37704O(this.f76510d, "downloadprogress");
            C27609c.m37703N(this.f76510d, O, C101656f.C101658b.Text);
            C101656f fVar = this.f76510d.f76501m;
            if (fVar != null) {
                C27609c cVar = this.f76510d;
                Integer w = cVar.mo141115w(fVar.mo141123b().get(O), Integer.valueOf(cVar.f76500l.f292639k));
                return Integer.valueOf(w != null ? w.intValue() : this.f76510d.f76500l.f292639k);
            }
            C87412m.m108603p("__xmlParser__");
            throw null;
        }
    }

    /* renamed from: mh0.c$b */
    public static final class C27611b extends C87413o implements C32224a<Long> {

        /* renamed from: d */
        public final /* synthetic */ C27609c f76511d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C27611b(C27609c cVar) {
            super(0);
            this.f76511d = cVar;
        }

        public Object invoke() {
            String O = C27609c.m37704O(this.f76511d, "localid");
            C27609c.m37703N(this.f76511d, O, C101656f.C101658b.Text);
            C101656f fVar = this.f76511d.f76501m;
            if (fVar != null) {
                C27609c cVar = this.f76511d;
                Long x = cVar.mo141116x(fVar.mo141123b().get(O), Long.valueOf(cVar.f76500l.f292634f));
                return Long.valueOf(x != null ? x.longValue() : this.f76511d.f76500l.f292634f);
            }
            C87412m.m108603p("__xmlParser__");
            throw null;
        }
    }

    /* renamed from: mh0.c$c */
    public static final class C27612c extends C87413o implements C32224a<C99889n> {

        /* renamed from: d */
        public final /* synthetic */ C27609c f76512d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C27612c(C27609c cVar) {
            super(0);
            this.f76512d = cVar;
        }

        public Object invoke() {
            String O = C27609c.m37704O(this.f76512d, "originmediainfo");
            C27609c.m37703N(this.f76512d, O, C101656f.C101658b.Start);
            C101656f fVar = this.f76512d.f76501m;
            if (fVar == null) {
                C87412m.m108603p("__xmlParser__");
                throw null;
            } else if (!fVar.mo141123b().containsKey(O)) {
                return this.f76512d.f76500l.f292635g;
            } else {
                C27609c cVar = this.f76512d;
                C101656f fVar2 = cVar.f76501m;
                if (fVar2 != null) {
                    return new C99891p(fVar2, cVar.mo55375P("originmediainfo"));
                }
                C87412m.m108603p("__xmlParser__");
                throw null;
            }
        }
    }

    /* renamed from: mh0.c$d */
    public static final class C27613d extends C87413o implements C32224a<Integer> {

        /* renamed from: d */
        public final /* synthetic */ C27609c f76513d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C27613d(C27609c cVar) {
            super(0);
            this.f76513d = cVar;
        }

        public Object invoke() {
            String O = C27609c.m37704O(this.f76513d, "startuploadprogress");
            C27609c.m37703N(this.f76513d, O, C101656f.C101658b.Text);
            C101656f fVar = this.f76513d.f76501m;
            if (fVar != null) {
                C27609c cVar = this.f76513d;
                Integer w = cVar.mo141115w(fVar.mo141123b().get(O), Integer.valueOf(cVar.f76500l.f292637i));
                return Integer.valueOf(w != null ? w.intValue() : this.f76513d.f76500l.f292637i);
            }
            C87412m.m108603p("__xmlParser__");
            throw null;
        }
    }

    /* renamed from: mh0.c$e */
    public static final class C27614e extends C87413o implements C32224a<Integer> {

        /* renamed from: d */
        public final /* synthetic */ C27609c f76514d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C27614e(C27609c cVar) {
            super(0);
            this.f76514d = cVar;
        }

        public Object invoke() {
            String O = C27609c.m37704O(this.f76514d, "status");
            C27609c.m37703N(this.f76514d, O, C101656f.C101658b.Text);
            C101656f fVar = this.f76514d.f76501m;
            if (fVar != null) {
                C27609c cVar = this.f76514d;
                Integer w = cVar.mo141115w(fVar.mo141123b().get(O), Integer.valueOf(cVar.f76500l.f292636h));
                return Integer.valueOf(w != null ? w.intValue() : this.f76514d.f76500l.f292636h);
            }
            C87412m.m108603p("__xmlParser__");
            throw null;
        }
    }

    /* renamed from: mh0.c$f */
    public static final class C27615f extends C87413o implements C32224a<Integer> {

        /* renamed from: d */
        public final /* synthetic */ C27609c f76515d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C27615f(C27609c cVar) {
            super(0);
            this.f76515d = cVar;
        }

        public Object invoke() {
            String O = C27609c.m37704O(this.f76515d, "uploadprogress");
            C27609c.m37703N(this.f76515d, O, C101656f.C101658b.Text);
            C101656f fVar = this.f76515d.f76501m;
            if (fVar != null) {
                C27609c cVar = this.f76515d;
                Integer w = cVar.mo141115w(fVar.mo141123b().get(O), Integer.valueOf(cVar.f76500l.f292638j));
                return Integer.valueOf(w != null ? w.intValue() : this.f76515d.f76500l.f292638j);
            }
            C87412m.m108603p("__xmlParser__");
            throw null;
        }
    }

    public C27609c(C101656f fVar, String str) {
        C87412m.m108594g(fVar, "__xmlParser__");
        C87412m.m108594g(str, "__xmlPrefixTag__");
        C13602i iVar = C13602i.SYNCHRONIZED;
        this.f76504p = C36568h.m40986b(iVar, new C27611b(this));
        this.f76505q = C36568h.m40986b(iVar, new C27612c(this));
        this.f76506r = C36568h.m40986b(iVar, new C27614e(this));
        this.f76507s = C36568h.m40986b(iVar, new C27613d(this));
        this.f76508t = C36568h.m40986b(iVar, new C27615f(this));
        this.f76509u = C36568h.m40986b(iVar, new C27610a(this));
        this.f76501m = fVar;
        this.f76502n = str;
    }

    /* renamed from: N */
    public static final void m37703N(C27609c cVar, String str, C101656f.C101658b bVar) {
        C101656f fVar = cVar.f76501m;
        if (fVar == null) {
            C87412m.m108603p("__xmlParser__");
            throw null;
        } else if (!fVar.mo141123b().containsKey(str) && cVar.f76503o != C101656f.C101657a.ParseEnd) {
            C101656f fVar2 = cVar.f76501m;
            if (fVar2 != null) {
                cVar.f76503o = fVar2.mo141125d(str, bVar);
            } else {
                C87412m.m108603p("__xmlParser__");
                throw null;
            }
        }
    }

    /* renamed from: O */
    public static final String m37704O(C27609c cVar, String str) {
        cVar.getClass();
        return '.' + cVar.mo55375P(str);
    }

    /* renamed from: B */
    public int mo55363B() {
        return ((Number) this.f76509u.getValue()).intValue();
    }

    /* renamed from: C */
    public long mo55364C() {
        return ((Number) this.f76504p.getValue()).longValue();
    }

    /* renamed from: D */
    public C99889n mo55365D() {
        return (C99889n) this.f76505q.getValue();
    }

    /* renamed from: E */
    public int mo55366E() {
        return ((Number) this.f76507s.getValue()).intValue();
    }

    /* renamed from: F */
    public int mo55367F() {
        return ((Number) this.f76506r.getValue()).intValue();
    }

    /* renamed from: G */
    public int mo55368G() {
        return ((Number) this.f76508t.getValue()).intValue();
    }

    /* renamed from: H */
    public void mo55369H(int i) {
    }

    /* renamed from: I */
    public void mo55370I(long j) {
    }

    /* renamed from: J */
    public void mo55371J(C99889n nVar) {
        C87412m.m108594g(nVar, "value");
    }

    /* renamed from: K */
    public void mo55372K(int i) {
    }

    /* renamed from: L */
    public void mo55373L(int i) {
    }

    /* renamed from: M */
    public void mo55374M(int i) {
    }

    /* renamed from: P */
    public final String mo55375P(String str) {
        String str2 = this.f76502n;
        if (str2 == null) {
            C87412m.m108603p("__xmlPrefixTag__");
            throw null;
        } else if (!(!C112551y.m153811k(str2))) {
            return String.valueOf(str);
        } else {
            StringBuilder sb = new StringBuilder();
            String str3 = this.f76502n;
            if (str3 != null) {
                sb.append(str3);
                sb.append('.');
                sb.append(str);
                return sb.toString();
            }
            C87412m.m108603p("__xmlPrefixTag__");
            throw null;
        }
    }
}

package cc3;

import fy3.C32224a;
import gy3.C87412m;
import gy3.C87413o;
import rx3.C13601g;
import rx3.C13602i;
import rx3.C36568h;
import sm2.C101656f;
import z04.C112551y;

/* renamed from: cc3.c */
public final class C26830c extends C26828a {

    /* renamed from: j */
    public final C26828a f74623j = new C26828a();

    /* renamed from: k */
    public C101656f f74624k;

    /* renamed from: l */
    public String f74625l;

    /* renamed from: m */
    public C101656f.C101657a f74626m;

    /* renamed from: n */
    public final C13601g f74627n;

    /* renamed from: o */
    public final C13601g f74628o;

    /* renamed from: p */
    public final C13601g f74629p;

    /* renamed from: q */
    public final C13601g f74630q;

    /* renamed from: cc3.c$a */
    public static final class C26831a extends C87413o implements C32224a<String> {

        /* renamed from: d */
        public final /* synthetic */ C26830c f74631d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C26831a(C26830c cVar) {
            super(0);
            this.f74631d = cVar;
        }

        public Object invoke() {
            String J = C26830c.m35415J(this.f74631d, "aeskey");
            C26830c.m35414I(this.f74631d, J, C101656f.C101658b.Text);
            C101656f fVar = this.f74631d.f74624k;
            if (fVar != null) {
                C26830c cVar = this.f74631d;
                String y = cVar.mo141117y(fVar.mo141123b().get(J), cVar.f74623j.f74622i);
                return y != null ? y : this.f74631d.f74623j.f74622i;
            }
            C87412m.m108603p("__xmlParser__");
            throw null;
        }
    }

    /* renamed from: cc3.c$b */
    public static final class C26832b extends C87413o implements C32224a<String> {

        /* renamed from: d */
        public final /* synthetic */ C26830c f74632d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C26832b(C26830c cVar) {
            super(0);
            this.f74632d = cVar;
        }

        public Object invoke() {
            String J = C26830c.m35415J(this.f74632d, "attachid");
            C26830c.m35414I(this.f74632d, J, C101656f.C101658b.Text);
            C101656f fVar = this.f74632d.f74624k;
            if (fVar != null) {
                C26830c cVar = this.f74632d;
                String y = cVar.mo141117y(fVar.mo141123b().get(J), cVar.f74623j.f74620g);
                return y != null ? y : this.f74632d.f74623j.f74620g;
            }
            C87412m.m108603p("__xmlParser__");
            throw null;
        }
    }

    /* renamed from: cc3.c$c */
    public static final class C26833c extends C87413o implements C32224a<String> {

        /* renamed from: d */
        public final /* synthetic */ C26830c f74633d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C26833c(C26830c cVar) {
            super(0);
            this.f74633d = cVar;
        }

        public Object invoke() {
            String J = C26830c.m35415J(this.f74633d, "cdnattachurl");
            C26830c.m35414I(this.f74633d, J, C101656f.C101658b.Text);
            C101656f fVar = this.f74633d.f74624k;
            if (fVar != null) {
                C26830c cVar = this.f74633d;
                String y = cVar.mo141117y(fVar.mo141123b().get(J), cVar.f74623j.f74621h);
                return y != null ? y : this.f74633d.f74623j.f74621h;
            }
            C87412m.m108603p("__xmlParser__");
            throw null;
        }
    }

    /* renamed from: cc3.c$d */
    public static final class C26834d extends C87413o implements C32224a<Long> {

        /* renamed from: d */
        public final /* synthetic */ C26830c f74634d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C26834d(C26830c cVar) {
            super(0);
            this.f74634d = cVar;
        }

        public Object invoke() {
            String J = C26830c.m35415J(this.f74634d, "totallen");
            C26830c.m35414I(this.f74634d, J, C101656f.C101658b.Text);
            C101656f fVar = this.f74634d.f74624k;
            if (fVar != null) {
                C26830c cVar = this.f74634d;
                Long x = cVar.mo141116x(fVar.mo141123b().get(J), Long.valueOf(cVar.f74623j.f74619f));
                return Long.valueOf(x != null ? x.longValue() : this.f74634d.f74623j.f74619f);
            }
            C87412m.m108603p("__xmlParser__");
            throw null;
        }
    }

    public C26830c(C101656f fVar, String str) {
        C87412m.m108594g(fVar, "__xmlParser__");
        C87412m.m108594g(str, "__xmlPrefixTag__");
        C13602i iVar = C13602i.SYNCHRONIZED;
        this.f74627n = C36568h.m40986b(iVar, new C26834d(this));
        this.f74628o = C36568h.m40986b(iVar, new C26832b(this));
        this.f74629p = C36568h.m40986b(iVar, new C26833c(this));
        this.f74630q = C36568h.m40986b(iVar, new C26831a(this));
        this.f74624k = fVar;
        this.f74625l = str;
    }

    /* renamed from: I */
    public static final void m35414I(C26830c cVar, String str, C101656f.C101658b bVar) {
        C101656f fVar = cVar.f74624k;
        if (fVar == null) {
            C87412m.m108603p("__xmlParser__");
            throw null;
        } else if (!fVar.mo141123b().containsKey(str) && cVar.f74626m != C101656f.C101657a.ParseEnd) {
            C101656f fVar2 = cVar.f74624k;
            if (fVar2 != null) {
                cVar.f74626m = fVar2.mo141125d(str, bVar);
            } else {
                C87412m.m108603p("__xmlParser__");
                throw null;
            }
        }
    }

    /* renamed from: J */
    public static final String m35415J(C26830c cVar, String str) {
        String str2;
        cVar.getClass();
        StringBuilder sb = new StringBuilder();
        sb.append('.');
        String str3 = cVar.f74625l;
        if (str3 != null) {
            if (!C112551y.m153811k(str3)) {
                StringBuilder sb4 = new StringBuilder();
                String str4 = cVar.f74625l;
                if (str4 != null) {
                    sb4.append(str4);
                    sb4.append('.');
                    sb4.append(str);
                    str2 = sb4.toString();
                } else {
                    C87412m.m108603p("__xmlPrefixTag__");
                    throw null;
                }
            } else {
                str2 = String.valueOf(str);
            }
            sb.append(str2);
            return sb.toString();
        }
        C87412m.m108603p("__xmlPrefixTag__");
        throw null;
    }

    /* renamed from: A */
    public String mo53847A() {
        return (String) this.f74630q.getValue();
    }

    /* renamed from: B */
    public String mo53848B() {
        return (String) this.f74628o.getValue();
    }

    /* renamed from: C */
    public String mo53849C() {
        return (String) this.f74629p.getValue();
    }

    /* renamed from: D */
    public long mo53850D() {
        return ((Number) this.f74627n.getValue()).longValue();
    }

    /* renamed from: E */
    public void mo53851E(String str) {
        C87412m.m108594g(str, "value");
    }

    /* renamed from: F */
    public void mo53852F(String str) {
        C87412m.m108594g(str, "value");
    }

    /* renamed from: G */
    public void mo53853G(String str) {
        C87412m.m108594g(str, "value");
    }

    /* renamed from: H */
    public void mo53854H(long j) {
    }
}

package cc3;

import fy3.C32224a;
import gy3.C87412m;
import gy3.C87413o;
import rx3.C13601g;
import rx3.C13602i;
import rx3.C36568h;
import sm2.C101656f;
import z04.C112551y;

/* renamed from: cc3.i */
public final class C26850i extends C26848g {

    /* renamed from: k */
    public final C26848g f74670k = new C26848g();

    /* renamed from: l */
    public C101656f f74671l;

    /* renamed from: m */
    public String f74672m;

    /* renamed from: n */
    public C101656f.C101657a f74673n;

    /* renamed from: o */
    public final C13601g f74674o;

    /* renamed from: p */
    public final C13601g f74675p;

    /* renamed from: q */
    public final C13601g f74676q;

    /* renamed from: r */
    public final C13601g f74677r;

    /* renamed from: s */
    public final C13601g f74678s;

    /* renamed from: cc3.i$a */
    public static final class C26851a extends C87413o implements C32224a<String> {

        /* renamed from: d */
        public final /* synthetic */ C26850i f74679d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C26851a(C26850i iVar) {
            super(0);
            this.f74679d = iVar;
        }

        public Object invoke() {
            String L = C26850i.m35488L(this.f74679d, "aeskey");
            C26850i.m35487K(this.f74679d, L, C101656f.C101658b.Text);
            C101656f fVar = this.f74679d.f74671l;
            if (fVar != null) {
                C26850i iVar = this.f74679d;
                String y = iVar.mo141117y(fVar.mo141123b().get(L), iVar.f74670k.f74622i);
                return y != null ? y : this.f74679d.f74670k.f74622i;
            }
            C87412m.m108603p("__xmlParser__");
            throw null;
        }
    }

    /* renamed from: cc3.i$b */
    public static final class C26852b extends C87413o implements C32224a<String> {

        /* renamed from: d */
        public final /* synthetic */ C26850i f74680d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C26852b(C26850i iVar) {
            super(0);
            this.f74680d = iVar;
        }

        public Object invoke() {
            String L = C26850i.m35488L(this.f74680d, "attachid");
            C26850i.m35487K(this.f74680d, L, C101656f.C101658b.Text);
            C101656f fVar = this.f74680d.f74671l;
            if (fVar != null) {
                C26850i iVar = this.f74680d;
                String y = iVar.mo141117y(fVar.mo141123b().get(L), iVar.f74670k.f74620g);
                return y != null ? y : this.f74680d.f74670k.f74620g;
            }
            C87412m.m108603p("__xmlParser__");
            throw null;
        }
    }

    /* renamed from: cc3.i$c */
    public static final class C26853c extends C87413o implements C32224a<String> {

        /* renamed from: d */
        public final /* synthetic */ C26850i f74681d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C26853c(C26850i iVar) {
            super(0);
            this.f74681d = iVar;
        }

        public Object invoke() {
            String L = C26850i.m35488L(this.f74681d, "cdnattachurl");
            C26850i.m35487K(this.f74681d, L, C101656f.C101658b.Text);
            C101656f fVar = this.f74681d.f74671l;
            if (fVar != null) {
                C26850i iVar = this.f74681d;
                String y = iVar.mo141117y(fVar.mo141123b().get(L), iVar.f74670k.f74621h);
                return y != null ? y : this.f74681d.f74670k.f74621h;
            }
            C87412m.m108603p("__xmlParser__");
            throw null;
        }
    }

    /* renamed from: cc3.i$d */
    public static final class C26854d extends C87413o implements C32224a<Long> {

        /* renamed from: d */
        public final /* synthetic */ C26850i f74682d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C26854d(C26850i iVar) {
            super(0);
            this.f74682d = iVar;
        }

        public Object invoke() {
            String L = C26850i.m35488L(this.f74682d, "totallen");
            C26850i.m35487K(this.f74682d, L, C101656f.C101658b.Text);
            C101656f fVar = this.f74682d.f74671l;
            if (fVar != null) {
                C26850i iVar = this.f74682d;
                Long x = iVar.mo141116x(fVar.mo141123b().get(L), Long.valueOf(iVar.f74670k.f74619f));
                return Long.valueOf(x != null ? x.longValue() : this.f74682d.f74670k.f74619f);
            }
            C87412m.m108603p("__xmlParser__");
            throw null;
        }
    }

    /* renamed from: cc3.i$e */
    public static final class C26855e extends C87413o implements C32224a<String> {

        /* renamed from: d */
        public final /* synthetic */ C26850i f74683d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C26855e(C26850i iVar) {
            super(0);
            this.f74683d = iVar;
        }

        public Object invoke() {
            String L = C26850i.m35488L(this.f74683d, "tpthumburl");
            C26850i.m35487K(this.f74683d, L, C101656f.C101658b.Text);
            C101656f fVar = this.f74683d.f74671l;
            if (fVar != null) {
                C26850i iVar = this.f74683d;
                String y = iVar.mo141117y(fVar.mo141123b().get(L), iVar.f74670k.f74669j);
                return y != null ? y : this.f74683d.f74670k.f74669j;
            }
            C87412m.m108603p("__xmlParser__");
            throw null;
        }
    }

    public C26850i(C101656f fVar, String str) {
        C87412m.m108594g(fVar, "__xmlParser__");
        C87412m.m108594g(str, "__xmlPrefixTag__");
        C13602i iVar = C13602i.SYNCHRONIZED;
        this.f74674o = C36568h.m40986b(iVar, new C26854d(this));
        this.f74675p = C36568h.m40986b(iVar, new C26852b(this));
        this.f74676q = C36568h.m40986b(iVar, new C26853c(this));
        this.f74677r = C36568h.m40986b(iVar, new C26851a(this));
        this.f74678s = C36568h.m40986b(iVar, new C26855e(this));
        this.f74671l = fVar;
        this.f74672m = str;
    }

    /* renamed from: K */
    public static final void m35487K(C26850i iVar, String str, C101656f.C101658b bVar) {
        C101656f fVar = iVar.f74671l;
        if (fVar == null) {
            C87412m.m108603p("__xmlParser__");
            throw null;
        } else if (!fVar.mo141123b().containsKey(str) && iVar.f74673n != C101656f.C101657a.ParseEnd) {
            C101656f fVar2 = iVar.f74671l;
            if (fVar2 != null) {
                iVar.f74673n = fVar2.mo141125d(str, bVar);
            } else {
                C87412m.m108603p("__xmlParser__");
                throw null;
            }
        }
    }

    /* renamed from: L */
    public static final String m35488L(C26850i iVar, String str) {
        String str2;
        iVar.getClass();
        StringBuilder sb = new StringBuilder();
        sb.append('.');
        String str3 = iVar.f74672m;
        if (str3 != null) {
            if (!C112551y.m153811k(str3)) {
                StringBuilder sb4 = new StringBuilder();
                String str4 = iVar.f74672m;
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
        return (String) this.f74677r.getValue();
    }

    /* renamed from: B */
    public String mo53848B() {
        return (String) this.f74675p.getValue();
    }

    /* renamed from: C */
    public String mo53849C() {
        return (String) this.f74676q.getValue();
    }

    /* renamed from: D */
    public long mo53850D() {
        return ((Number) this.f74674o.getValue()).longValue();
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

    /* renamed from: I */
    public String mo53885I() {
        return (String) this.f74678s.getValue();
    }

    /* renamed from: J */
    public void mo53886J(String str) {
    }
}

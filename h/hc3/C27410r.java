package hc3;

import fy3.C32224a;
import gy3.C87412m;
import gy3.C87413o;
import rx3.C13601g;
import rx3.C13602i;
import rx3.C36568h;
import sm2.C101656f;
import z04.C112551y;

/* renamed from: hc3.r */
public final class C27410r extends C98366p {

    /* renamed from: j */
    public final C98366p f76030j = new C98366p();

    /* renamed from: k */
    public C101656f f76031k;

    /* renamed from: l */
    public String f76032l;

    /* renamed from: m */
    public C101656f.C101657a f76033m;

    /* renamed from: n */
    public final C13601g f76034n;

    /* renamed from: o */
    public final C13601g f76035o;

    /* renamed from: p */
    public final C13601g f76036p;

    /* renamed from: hc3.r$a */
    public static final class C27411a extends C87413o implements C32224a<String> {

        /* renamed from: d */
        public final /* synthetic */ C27410r f76037d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C27411a(C27410r rVar) {
            super(0);
            this.f76037d = rVar;
        }

        public Object invoke() {
            String J = C27410r.m37193J(this.f76037d, "fromusr");
            C27410r.m37192I(this.f76037d, J, C101656f.C101658b.Text);
            C101656f fVar = this.f76037d.f76031k;
            if (fVar != null) {
                C27410r rVar = this.f76037d;
                String y = rVar.mo141117y(fVar.mo141123b().get(J), rVar.f76030j.f288364f);
                return y != null ? y : this.f76037d.f76030j.f288364f;
            }
            C87412m.m108603p("__xmlParser__");
            throw null;
        }
    }

    /* renamed from: hc3.r$b */
    public static final class C27412b extends C87413o implements C32224a<String> {

        /* renamed from: d */
        public final /* synthetic */ C27410r f76038d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C27412b(C27410r rVar) {
            super(0);
            this.f76038d = rVar;
        }

        public Object invoke() {
            String J = C27410r.m37193J(this.f76038d, "hashusername");
            C27410r.m37192I(this.f76038d, J, C101656f.C101658b.Text);
            C101656f fVar = this.f76038d.f76031k;
            if (fVar != null) {
                C27410r rVar = this.f76038d;
                String y = rVar.mo141117y(fVar.mo141123b().get(J), rVar.f76030j.f288366h);
                return y != null ? y : this.f76038d.f76030j.f288366h;
            }
            C87412m.m108603p("__xmlParser__");
            throw null;
        }
    }

    /* renamed from: hc3.r$c */
    public static final class C27413c extends C87413o implements C32224a<String> {

        /* renamed from: d */
        public final /* synthetic */ C27410r f76039d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C27413c(C27410r rVar) {
            super(0);
            this.f76039d = rVar;
        }

        public Object invoke() {
            String J = C27410r.m37193J(this.f76039d, "realchatname");
            C27410r.m37192I(this.f76039d, J, C101656f.C101658b.Text);
            C101656f fVar = this.f76039d.f76031k;
            if (fVar != null) {
                C27410r rVar = this.f76039d;
                String y = rVar.mo141117y(fVar.mo141123b().get(J), rVar.f76030j.f288365g);
                return y != null ? y : this.f76039d.f76030j.f288365g;
            }
            C87412m.m108603p("__xmlParser__");
            throw null;
        }
    }

    public C27410r(C101656f fVar, String str) {
        C87412m.m108594g(fVar, "__xmlParser__");
        C87412m.m108594g(str, "__xmlPrefixTag__");
        C13602i iVar = C13602i.SYNCHRONIZED;
        this.f76034n = C36568h.m40986b(iVar, new C27411a(this));
        this.f76035o = C36568h.m40986b(iVar, new C27413c(this));
        this.f76036p = C36568h.m40986b(iVar, new C27412b(this));
        this.f76031k = fVar;
        this.f76032l = str;
    }

    /* renamed from: I */
    public static final void m37192I(C27410r rVar, String str, C101656f.C101658b bVar) {
        C101656f fVar = rVar.f76031k;
        if (fVar == null) {
            C87412m.m108603p("__xmlParser__");
            throw null;
        } else if (!fVar.mo141123b().containsKey(str) && rVar.f76033m != C101656f.C101657a.ParseEnd) {
            C101656f fVar2 = rVar.f76031k;
            if (fVar2 != null) {
                rVar.f76033m = fVar2.mo141125d(str, bVar);
            } else {
                C87412m.m108603p("__xmlParser__");
                throw null;
            }
        }
    }

    /* renamed from: J */
    public static final String m37193J(C27410r rVar, String str) {
        String str2;
        rVar.getClass();
        StringBuilder sb = new StringBuilder();
        sb.append('.');
        String str3 = rVar.f76032l;
        if (str3 != null) {
            if (!C112551y.m153811k(str3)) {
                StringBuilder sb4 = new StringBuilder();
                String str4 = rVar.f76032l;
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
    public String mo55075A() {
        return (String) this.f76034n.getValue();
    }

    /* renamed from: B */
    public String mo55076B() {
        return (String) this.f76036p.getValue();
    }

    /* renamed from: C */
    public String mo55077C() {
        return (String) this.f76035o.getValue();
    }

    /* renamed from: E */
    public void mo55078E(String str) {
        C87412m.m108594g(str, "value");
    }

    /* renamed from: F */
    public void mo55079F(String str) {
        C87412m.m108594g(str, "value");
    }

    /* renamed from: G */
    public void mo55080G(String str) {
        C87412m.m108594g(str, "value");
    }
}

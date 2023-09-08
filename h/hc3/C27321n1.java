package hc3;

import fy3.C32224a;
import gy3.C87412m;
import gy3.C87413o;
import rx3.C13601g;
import rx3.C13602i;
import rx3.C36568h;
import sm2.C101656f;
import z04.C112551y;

/* renamed from: hc3.n1 */
public final class C27321n1 extends C98361l1 {

    /* renamed from: h */
    public final C98361l1 f75841h = new C98361l1();

    /* renamed from: i */
    public C101656f f75842i;

    /* renamed from: j */
    public String f75843j;

    /* renamed from: k */
    public C101656f.C101657a f75844k;

    /* renamed from: l */
    public final C13601g f75845l;

    /* renamed from: m */
    public final C13601g f75846m;

    /* renamed from: hc3.n1$a */
    public static final class C27322a extends C87413o implements C32224a<String> {

        /* renamed from: d */
        public final /* synthetic */ C27321n1 f75847d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C27322a(C27321n1 n1Var) {
            super(0);
            this.f75847d = n1Var;
        }

        public Object invoke() {
            String F = C27321n1.m37006F(this.f75847d, "noteauthor");
            C27321n1.m37005E(this.f75847d, F, C101656f.C101658b.Text);
            C101656f fVar = this.f75847d.f75842i;
            if (fVar != null) {
                C27321n1 n1Var = this.f75847d;
                String y = n1Var.mo141117y(fVar.mo141123b().get(F), n1Var.f75841h.f288346f);
                return y != null ? y : this.f75847d.f75841h.f288346f;
            }
            C87412m.m108603p("__xmlParser__");
            throw null;
        }
    }

    /* renamed from: hc3.n1$b */
    public static final class C27323b extends C87413o implements C32224a<String> {

        /* renamed from: d */
        public final /* synthetic */ C27321n1 f75848d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C27323b(C27321n1 n1Var) {
            super(0);
            this.f75848d = n1Var;
        }

        public Object invoke() {
            String F = C27321n1.m37006F(this.f75848d, "noteeditor");
            C27321n1.m37005E(this.f75848d, F, C101656f.C101658b.Text);
            C101656f fVar = this.f75848d.f75842i;
            if (fVar != null) {
                C27321n1 n1Var = this.f75848d;
                String y = n1Var.mo141117y(fVar.mo141123b().get(F), n1Var.f75841h.f288347g);
                return y != null ? y : this.f75848d.f75841h.f288347g;
            }
            C87412m.m108603p("__xmlParser__");
            throw null;
        }
    }

    public C27321n1(C101656f fVar, String str) {
        C87412m.m108594g(fVar, "__xmlParser__");
        C87412m.m108594g(str, "__xmlPrefixTag__");
        C13602i iVar = C13602i.SYNCHRONIZED;
        this.f75845l = C36568h.m40986b(iVar, new C27322a(this));
        this.f75846m = C36568h.m40986b(iVar, new C27323b(this));
        this.f75842i = fVar;
        this.f75843j = str;
    }

    /* renamed from: E */
    public static final void m37005E(C27321n1 n1Var, String str, C101656f.C101658b bVar) {
        C101656f fVar = n1Var.f75842i;
        if (fVar == null) {
            C87412m.m108603p("__xmlParser__");
            throw null;
        } else if (!fVar.mo141123b().containsKey(str) && n1Var.f75844k != C101656f.C101657a.ParseEnd) {
            C101656f fVar2 = n1Var.f75842i;
            if (fVar2 != null) {
                n1Var.f75844k = fVar2.mo141125d(str, bVar);
            } else {
                C87412m.m108603p("__xmlParser__");
                throw null;
            }
        }
    }

    /* renamed from: F */
    public static final String m37006F(C27321n1 n1Var, String str) {
        String str2;
        n1Var.getClass();
        StringBuilder sb = new StringBuilder();
        sb.append('.');
        String str3 = n1Var.f75843j;
        if (str3 != null) {
            if (!C112551y.m153811k(str3)) {
                StringBuilder sb4 = new StringBuilder();
                String str4 = n1Var.f75843j;
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
    public String mo55028A() {
        return (String) this.f75845l.getValue();
    }

    /* renamed from: B */
    public String mo55029B() {
        return (String) this.f75846m.getValue();
    }

    /* renamed from: C */
    public void mo55030C(String str) {
        C87412m.m108594g(str, "value");
    }

    /* renamed from: D */
    public void mo55031D(String str) {
        C87412m.m108594g(str, "value");
    }
}

package hc3;

import fy3.C32224a;
import gy3.C87412m;
import gy3.C87413o;
import rx3.C13601g;
import rx3.C13602i;
import rx3.C36568h;
import sm2.C101656f;
import z04.C112551y;

/* renamed from: hc3.d0 */
public final class C27208d0 extends C98340b0 {

    /* renamed from: h */
    public final C98340b0 f75550h = new C98340b0();

    /* renamed from: i */
    public C101656f f75551i;

    /* renamed from: j */
    public String f75552j;

    /* renamed from: k */
    public C101656f.C101657a f75553k;

    /* renamed from: l */
    public final C13601g f75554l;

    /* renamed from: m */
    public final C13601g f75555m;

    /* renamed from: hc3.d0$a */
    public static final class C27209a extends C87413o implements C32224a<String> {

        /* renamed from: d */
        public final /* synthetic */ C27208d0 f75556d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C27209a(C27208d0 d0Var) {
            super(0);
            this.f75556d = d0Var;
        }

        public Object invoke() {
            String F = C27208d0.m36660F(this.f75556d, "objectId");
            C27208d0.m36659E(this.f75556d, F, C101656f.C101658b.Text);
            C101656f fVar = this.f75556d.f75551i;
            if (fVar != null) {
                C27208d0 d0Var = this.f75556d;
                String y = d0Var.mo141117y(fVar.mo141123b().get(F), d0Var.f75550h.f288248f);
                return y != null ? y : this.f75556d.f75550h.f288248f;
            }
            C87412m.m108603p("__xmlParser__");
            throw null;
        }
    }

    /* renamed from: hc3.d0$b */
    public static final class C27210b extends C87413o implements C32224a<String> {

        /* renamed from: d */
        public final /* synthetic */ C27208d0 f75557d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C27210b(C27208d0 d0Var) {
            super(0);
            this.f75557d = d0Var;
        }

        public Object invoke() {
            String F = C27208d0.m36660F(this.f75557d, "objectNonceId");
            C27208d0.m36659E(this.f75557d, F, C101656f.C101658b.Text);
            C101656f fVar = this.f75557d.f75551i;
            if (fVar != null) {
                C27208d0 d0Var = this.f75557d;
                String y = d0Var.mo141117y(fVar.mo141123b().get(F), d0Var.f75550h.f288249g);
                return y != null ? y : this.f75557d.f75550h.f288249g;
            }
            C87412m.m108603p("__xmlParser__");
            throw null;
        }
    }

    public C27208d0(C101656f fVar, String str) {
        C87412m.m108594g(fVar, "__xmlParser__");
        C87412m.m108594g(str, "__xmlPrefixTag__");
        C13602i iVar = C13602i.SYNCHRONIZED;
        this.f75554l = C36568h.m40986b(iVar, new C27209a(this));
        this.f75555m = C36568h.m40986b(iVar, new C27210b(this));
        this.f75551i = fVar;
        this.f75552j = str;
    }

    /* renamed from: E */
    public static final void m36659E(C27208d0 d0Var, String str, C101656f.C101658b bVar) {
        C101656f fVar = d0Var.f75551i;
        if (fVar == null) {
            C87412m.m108603p("__xmlParser__");
            throw null;
        } else if (!fVar.mo141123b().containsKey(str) && d0Var.f75553k != C101656f.C101657a.ParseEnd) {
            C101656f fVar2 = d0Var.f75551i;
            if (fVar2 != null) {
                d0Var.f75553k = fVar2.mo141125d(str, bVar);
            } else {
                C87412m.m108603p("__xmlParser__");
                throw null;
            }
        }
    }

    /* renamed from: F */
    public static final String m36660F(C27208d0 d0Var, String str) {
        String str2;
        d0Var.getClass();
        StringBuilder sb = new StringBuilder();
        sb.append('.');
        String str3 = d0Var.f75552j;
        if (str3 != null) {
            if (!C112551y.m153811k(str3)) {
                StringBuilder sb4 = new StringBuilder();
                String str4 = d0Var.f75552j;
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
    public String mo54738A() {
        return (String) this.f75554l.getValue();
    }

    /* renamed from: B */
    public String mo54739B() {
        return (String) this.f75555m.getValue();
    }

    /* renamed from: C */
    public void mo54740C(String str) {
        C87412m.m108594g(str, "value");
    }

    /* renamed from: D */
    public void mo54741D(String str) {
        C87412m.m108594g(str, "value");
    }
}

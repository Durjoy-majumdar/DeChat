package hc3;

import fy3.C32224a;
import gy3.C87412m;
import gy3.C87413o;
import rx3.C13601g;
import rx3.C13602i;
import rx3.C36568h;
import sm2.C101656f;
import z04.C112551y;

/* renamed from: hc3.v0 */
public final class C27437v0 extends C27421t0 {

    /* renamed from: i */
    public final C27421t0 f76089i = new C27421t0();

    /* renamed from: j */
    public C101656f f76090j;

    /* renamed from: k */
    public String f76091k;

    /* renamed from: l */
    public C101656f.C101657a f76092l;

    /* renamed from: m */
    public final C13601g f76093m;

    /* renamed from: n */
    public final C13601g f76094n;

    /* renamed from: o */
    public final C13601g f76095o;

    /* renamed from: hc3.v0$a */
    public static final class C27438a extends C87413o implements C32224a<Float> {

        /* renamed from: d */
        public final /* synthetic */ C27437v0 f76096d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C27438a(C27437v0 v0Var) {
            super(0);
            this.f76096d = v0Var;
        }

        public Object invoke() {
            String H = C27437v0.m37265H(this.f76096d, "latitude");
            C27437v0.m37264G(this.f76096d, H, C101656f.C101658b.Text);
            C101656f fVar = this.f76096d.f76090j;
            if (fVar != null) {
                C27437v0 v0Var = this.f76096d;
                Float v = v0Var.mo141114v(fVar.mo141123b().get(H), Float.valueOf(v0Var.f76089i.f76056h));
                return Float.valueOf(v != null ? v.floatValue() : this.f76096d.f76089i.f76056h);
            }
            C87412m.m108603p("__xmlParser__");
            throw null;
        }
    }

    /* renamed from: hc3.v0$b */
    public static final class C27439b extends C87413o implements C32224a<Float> {

        /* renamed from: d */
        public final /* synthetic */ C27437v0 f76097d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C27439b(C27437v0 v0Var) {
            super(0);
            this.f76097d = v0Var;
        }

        public Object invoke() {
            String H = C27437v0.m37265H(this.f76097d, "longitude");
            C27437v0.m37264G(this.f76097d, H, C101656f.C101658b.Text);
            C101656f fVar = this.f76097d.f76090j;
            if (fVar != null) {
                C27437v0 v0Var = this.f76097d;
                Float v = v0Var.mo141114v(fVar.mo141123b().get(H), Float.valueOf(v0Var.f76089i.f76055g));
                return Float.valueOf(v != null ? v.floatValue() : this.f76097d.f76089i.f76055g);
            }
            C87412m.m108603p("__xmlParser__");
            throw null;
        }
    }

    /* renamed from: hc3.v0$c */
    public static final class C27440c extends C87413o implements C32224a<String> {

        /* renamed from: d */
        public final /* synthetic */ C27437v0 f76098d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C27440c(C27437v0 v0Var) {
            super(0);
            this.f76098d = v0Var;
        }

        public Object invoke() {
            String H = C27437v0.m37265H(this.f76098d, "poiClassifyId");
            C27437v0.m37264G(this.f76098d, H, C101656f.C101658b.Text);
            C101656f fVar = this.f76098d.f76090j;
            if (fVar != null) {
                C27437v0 v0Var = this.f76098d;
                String y = v0Var.mo141117y(fVar.mo141123b().get(H), v0Var.f76089i.f76054f);
                return y != null ? y : this.f76098d.f76089i.f76054f;
            }
            C87412m.m108603p("__xmlParser__");
            throw null;
        }
    }

    public C27437v0(C101656f fVar, String str) {
        C87412m.m108594g(fVar, "__xmlParser__");
        C87412m.m108594g(str, "__xmlPrefixTag__");
        C13602i iVar = C13602i.SYNCHRONIZED;
        this.f76093m = C36568h.m40986b(iVar, new C27440c(this));
        this.f76094n = C36568h.m40986b(iVar, new C27439b(this));
        this.f76095o = C36568h.m40986b(iVar, new C27438a(this));
        this.f76090j = fVar;
        this.f76091k = str;
    }

    /* renamed from: G */
    public static final void m37264G(C27437v0 v0Var, String str, C101656f.C101658b bVar) {
        C101656f fVar = v0Var.f76090j;
        if (fVar == null) {
            C87412m.m108603p("__xmlParser__");
            throw null;
        } else if (!fVar.mo141123b().containsKey(str) && v0Var.f76092l != C101656f.C101657a.ParseEnd) {
            C101656f fVar2 = v0Var.f76090j;
            if (fVar2 != null) {
                v0Var.f76092l = fVar2.mo141125d(str, bVar);
            } else {
                C87412m.m108603p("__xmlParser__");
                throw null;
            }
        }
    }

    /* renamed from: H */
    public static final String m37265H(C27437v0 v0Var, String str) {
        String str2;
        v0Var.getClass();
        StringBuilder sb = new StringBuilder();
        sb.append('.');
        String str3 = v0Var.f76091k;
        if (str3 != null) {
            if (!C112551y.m153811k(str3)) {
                StringBuilder sb4 = new StringBuilder();
                String str4 = v0Var.f76091k;
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
    public float mo55081A() {
        return ((Number) this.f76095o.getValue()).floatValue();
    }

    /* renamed from: B */
    public float mo55082B() {
        return ((Number) this.f76094n.getValue()).floatValue();
    }

    /* renamed from: C */
    public String mo55083C() {
        return (String) this.f76093m.getValue();
    }

    /* renamed from: D */
    public void mo55084D(float f) {
    }

    /* renamed from: E */
    public void mo55085E(float f) {
    }

    /* renamed from: F */
    public void mo55086F(String str) {
        C87412m.m108594g(str, "value");
    }
}

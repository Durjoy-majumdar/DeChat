package hc3;

import fy3.C32224a;
import gy3.C87412m;
import gy3.C87413o;
import rx3.C13601g;
import rx3.C13602i;
import rx3.C36568h;
import sm2.C101656f;
import z04.C112551y;

/* renamed from: hc3.j0 */
public final class C27284j0 extends C98351h0 {

    /* renamed from: i */
    public final C98351h0 f75710i = new C98351h0();

    /* renamed from: j */
    public C101656f f75711j;

    /* renamed from: k */
    public String f75712k;

    /* renamed from: l */
    public C101656f.C101657a f75713l;

    /* renamed from: m */
    public final C13601g f75714m;

    /* renamed from: n */
    public final C13601g f75715n;

    /* renamed from: o */
    public final C13601g f75716o;

    /* renamed from: hc3.j0$a */
    public static final class C27285a extends C87413o implements C32224a<String> {

        /* renamed from: d */
        public final /* synthetic */ C27284j0 f75717d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C27285a(C27284j0 j0Var) {
            super(0);
            this.f75717d = j0Var;
        }

        public Object invoke() {
            String H = C27284j0.m36820H(this.f75717d, "coverUrl");
            C27284j0.m36819G(this.f75717d, H, C101656f.C101658b.Text);
            C101656f fVar = this.f75717d.f75711j;
            if (fVar != null) {
                C27284j0 j0Var = this.f75717d;
                String y = j0Var.mo141117y(fVar.mo141123b().get(H), j0Var.f75710i.f288309f);
                return y != null ? y : this.f75717d.f75710i.f288309f;
            }
            C87412m.m108603p("__xmlParser__");
            throw null;
        }
    }

    /* renamed from: hc3.j0$b */
    public static final class C27286b extends C87413o implements C32224a<Float> {

        /* renamed from: d */
        public final /* synthetic */ C27284j0 f75718d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C27286b(C27284j0 j0Var) {
            super(0);
            this.f75718d = j0Var;
        }

        public Object invoke() {
            String H = C27284j0.m36820H(this.f75718d, "height");
            C27284j0.m36819G(this.f75718d, H, C101656f.C101658b.Text);
            C101656f fVar = this.f75718d.f75711j;
            if (fVar != null) {
                C27284j0 j0Var = this.f75718d;
                Float v = j0Var.mo141114v(fVar.mo141123b().get(H), Float.valueOf(j0Var.f75710i.f288310g));
                return Float.valueOf(v != null ? v.floatValue() : this.f75718d.f75710i.f288310g);
            }
            C87412m.m108603p("__xmlParser__");
            throw null;
        }
    }

    /* renamed from: hc3.j0$c */
    public static final class C27287c extends C87413o implements C32224a<Float> {

        /* renamed from: d */
        public final /* synthetic */ C27284j0 f75719d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C27287c(C27284j0 j0Var) {
            super(0);
            this.f75719d = j0Var;
        }

        public Object invoke() {
            String H = C27284j0.m36820H(this.f75719d, "width");
            C27284j0.m36819G(this.f75719d, H, C101656f.C101658b.Text);
            C101656f fVar = this.f75719d.f75711j;
            if (fVar != null) {
                C27284j0 j0Var = this.f75719d;
                Float v = j0Var.mo141114v(fVar.mo141123b().get(H), Float.valueOf(j0Var.f75710i.f288311h));
                return Float.valueOf(v != null ? v.floatValue() : this.f75719d.f75710i.f288311h);
            }
            C87412m.m108603p("__xmlParser__");
            throw null;
        }
    }

    public C27284j0(C101656f fVar, String str) {
        C87412m.m108594g(fVar, "__xmlParser__");
        C87412m.m108594g(str, "__xmlPrefixTag__");
        C13602i iVar = C13602i.SYNCHRONIZED;
        this.f75714m = C36568h.m40986b(iVar, new C27285a(this));
        this.f75715n = C36568h.m40986b(iVar, new C27286b(this));
        this.f75716o = C36568h.m40986b(iVar, new C27287c(this));
        this.f75711j = fVar;
        this.f75712k = str;
    }

    /* renamed from: G */
    public static final void m36819G(C27284j0 j0Var, String str, C101656f.C101658b bVar) {
        C101656f fVar = j0Var.f75711j;
        if (fVar == null) {
            C87412m.m108603p("__xmlParser__");
            throw null;
        } else if (!fVar.mo141123b().containsKey(str) && j0Var.f75713l != C101656f.C101657a.ParseEnd) {
            C101656f fVar2 = j0Var.f75711j;
            if (fVar2 != null) {
                j0Var.f75713l = fVar2.mo141125d(str, bVar);
            } else {
                C87412m.m108603p("__xmlParser__");
                throw null;
            }
        }
    }

    /* renamed from: H */
    public static final String m36820H(C27284j0 j0Var, String str) {
        String str2;
        j0Var.getClass();
        StringBuilder sb = new StringBuilder();
        sb.append('.');
        String str3 = j0Var.f75712k;
        if (str3 != null) {
            if (!C112551y.m153811k(str3)) {
                StringBuilder sb4 = new StringBuilder();
                String str4 = j0Var.f75712k;
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
    public String mo54859A() {
        return (String) this.f75714m.getValue();
    }

    /* renamed from: B */
    public float mo54860B() {
        return ((Number) this.f75715n.getValue()).floatValue();
    }

    /* renamed from: C */
    public float mo54861C() {
        return ((Number) this.f75716o.getValue()).floatValue();
    }

    /* renamed from: D */
    public void mo54862D(String str) {
        C87412m.m108594g(str, "value");
    }

    /* renamed from: E */
    public void mo54863E(float f) {
    }

    /* renamed from: F */
    public void mo54864F(float f) {
    }
}

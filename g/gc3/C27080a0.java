package gc3;

import fy3.C32224a;
import gy3.C87412m;
import gy3.C87413o;
import rx3.C13601g;
import rx3.C13602i;
import rx3.C36568h;
import sm2.C101656f;
import z04.C112551y;

/* renamed from: gc3.a0 */
public final class C27080a0 extends C27153y {

    /* renamed from: i */
    public final C27153y f75300i = new C27153y();

    /* renamed from: j */
    public C101656f f75301j;

    /* renamed from: k */
    public String f75302k;

    /* renamed from: l */
    public C101656f.C101657a f75303l;

    /* renamed from: m */
    public final C13601g f75304m;

    /* renamed from: n */
    public final C13601g f75305n;

    /* renamed from: o */
    public final C13601g f75306o;

    /* renamed from: gc3.a0$a */
    public static final class C27081a extends C87413o implements C32224a<Long> {

        /* renamed from: d */
        public final /* synthetic */ C27080a0 f75307d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C27081a(C27080a0 a0Var) {
            super(0);
            this.f75307d = a0Var;
        }

        public Object invoke() {
            String H = C27080a0.m36311H(this.f75307d, "createtime");
            C27080a0.m36310G(this.f75307d, H, C101656f.C101658b.Text);
            C101656f fVar = this.f75307d.f75301j;
            if (fVar != null) {
                C27080a0 a0Var = this.f75307d;
                Long x = a0Var.mo141116x(fVar.mo141123b().get(H), Long.valueOf(a0Var.f75300i.f75469f));
                return Long.valueOf(x != null ? x.longValue() : this.f75307d.f75300i.f75469f);
            }
            C87412m.m108603p("__xmlParser__");
            throw null;
        }
    }

    /* renamed from: gc3.a0$b */
    public static final class C27082b extends C87413o implements C32224a<Long> {

        /* renamed from: d */
        public final /* synthetic */ C27080a0 f75308d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C27082b(C27080a0 a0Var) {
            super(0);
            this.f75308d = a0Var;
        }

        public Object invoke() {
            String H = C27080a0.m36311H(this.f75308d, "newsvrid");
            C27080a0.m36310G(this.f75308d, H, C101656f.C101658b.Text);
            C101656f fVar = this.f75308d.f75301j;
            if (fVar != null) {
                C27080a0 a0Var = this.f75308d;
                Long x = a0Var.mo141116x(fVar.mo141123b().get(H), Long.valueOf(a0Var.f75300i.f75471h));
                return Long.valueOf(x != null ? x.longValue() : this.f75308d.f75300i.f75471h);
            }
            C87412m.m108603p("__xmlParser__");
            throw null;
        }
    }

    /* renamed from: gc3.a0$c */
    public static final class C27083c extends C87413o implements C32224a<Long> {

        /* renamed from: d */
        public final /* synthetic */ C27080a0 f75309d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C27083c(C27080a0 a0Var) {
            super(0);
            this.f75309d = a0Var;
        }

        public Object invoke() {
            String H = C27080a0.m36311H(this.f75309d, "svrid");
            C27080a0.m36310G(this.f75309d, H, C101656f.C101658b.Text);
            C101656f fVar = this.f75309d.f75301j;
            if (fVar != null) {
                C27080a0 a0Var = this.f75309d;
                Long x = a0Var.mo141116x(fVar.mo141123b().get(H), Long.valueOf(a0Var.f75300i.f75470g));
                return Long.valueOf(x != null ? x.longValue() : this.f75309d.f75300i.f75470g);
            }
            C87412m.m108603p("__xmlParser__");
            throw null;
        }
    }

    public C27080a0(C101656f fVar, String str) {
        C87412m.m108594g(fVar, "__xmlParser__");
        C87412m.m108594g(str, "__xmlPrefixTag__");
        C13602i iVar = C13602i.SYNCHRONIZED;
        this.f75304m = C36568h.m40986b(iVar, new C27081a(this));
        this.f75305n = C36568h.m40986b(iVar, new C27083c(this));
        this.f75306o = C36568h.m40986b(iVar, new C27082b(this));
        this.f75301j = fVar;
        this.f75302k = str;
    }

    /* renamed from: G */
    public static final void m36310G(C27080a0 a0Var, String str, C101656f.C101658b bVar) {
        C101656f fVar = a0Var.f75301j;
        if (fVar == null) {
            C87412m.m108603p("__xmlParser__");
            throw null;
        } else if (!fVar.mo141123b().containsKey(str) && a0Var.f75303l != C101656f.C101657a.ParseEnd) {
            C101656f fVar2 = a0Var.f75301j;
            if (fVar2 != null) {
                a0Var.f75303l = fVar2.mo141125d(str, bVar);
            } else {
                C87412m.m108603p("__xmlParser__");
                throw null;
            }
        }
    }

    /* renamed from: H */
    public static final String m36311H(C27080a0 a0Var, String str) {
        String str2;
        a0Var.getClass();
        StringBuilder sb = new StringBuilder();
        sb.append('.');
        String str3 = a0Var.f75302k;
        if (str3 != null) {
            if (!C112551y.m153811k(str3)) {
                StringBuilder sb4 = new StringBuilder();
                String str4 = a0Var.f75302k;
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
    public long mo54610A() {
        return ((Number) this.f75304m.getValue()).longValue();
    }

    /* renamed from: B */
    public long mo54611B() {
        return ((Number) this.f75306o.getValue()).longValue();
    }

    /* renamed from: C */
    public long mo54612C() {
        return ((Number) this.f75305n.getValue()).longValue();
    }

    /* renamed from: D */
    public void mo54613D(long j) {
    }

    /* renamed from: E */
    public void mo54614E(long j) {
    }

    /* renamed from: F */
    public void mo54615F(long j) {
    }
}

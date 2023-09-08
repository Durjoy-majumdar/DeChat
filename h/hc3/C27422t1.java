package hc3;

import com.tencent.p014mm.plugin.mmsight.segment.FFmpegMetadataRetriever;
import fy3.C32224a;
import gy3.C87412m;
import gy3.C87413o;
import rx3.C13601g;
import rx3.C13602i;
import rx3.C36568h;
import sm2.C101656f;
import z04.C112551y;

/* renamed from: hc3.t1 */
public final class C27422t1 extends C98369r1 {

    /* renamed from: j */
    public final C98369r1 f76057j = new C98369r1();

    /* renamed from: k */
    public C101656f f76058k;

    /* renamed from: l */
    public String f76059l;

    /* renamed from: m */
    public C101656f.C101657a f76060m;

    /* renamed from: n */
    public final C13601g f76061n;

    /* renamed from: o */
    public final C13601g f76062o;

    /* renamed from: p */
    public final C13601g f76063p;

    /* renamed from: q */
    public final C13601g f76064q;

    /* renamed from: hc3.t1$a */
    public static final class C27423a extends C87413o implements C32224a<String> {

        /* renamed from: d */
        public final /* synthetic */ C27422t1 f76065d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C27423a(C27422t1 t1Var) {
            super(0);
            this.f76065d = t1Var;
        }

        public Object invoke() {
            String J = C27422t1.m37228J(this.f76065d, "desc");
            C27422t1.m37227I(this.f76065d, J, C101656f.C101658b.Text);
            C101656f fVar = this.f76065d.f76058k;
            if (fVar != null) {
                C27422t1 t1Var = this.f76065d;
                String y = t1Var.mo141117y(fVar.mo141123b().get(J), t1Var.f76057j.f288368g);
                return y != null ? y : this.f76065d.f76057j.f288368g;
            }
            C87412m.m108603p("__xmlParser__");
            throw null;
        }
    }

    /* renamed from: hc3.t1$b */
    public static final class C27424b extends C87413o implements C32224a<String> {

        /* renamed from: d */
        public final /* synthetic */ C27422t1 f76066d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C27424b(C27422t1 t1Var) {
            super(0);
            this.f76066d = t1Var;
        }

        public Object invoke() {
            String J = C27422t1.m37228J(this.f76066d, "thumburl");
            C27422t1.m37227I(this.f76066d, J, C101656f.C101658b.Text);
            C101656f fVar = this.f76066d.f76058k;
            if (fVar != null) {
                C27422t1 t1Var = this.f76066d;
                String y = t1Var.mo141117y(fVar.mo141123b().get(J), t1Var.f76057j.f288369h);
                return y != null ? y : this.f76066d.f76057j.f288369h;
            }
            C87412m.m108603p("__xmlParser__");
            throw null;
        }
    }

    /* renamed from: hc3.t1$c */
    public static final class C27425c extends C87413o implements C32224a<String> {

        /* renamed from: d */
        public final /* synthetic */ C27422t1 f76067d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C27425c(C27422t1 t1Var) {
            super(0);
            this.f76067d = t1Var;
        }

        public Object invoke() {
            String J = C27422t1.m37228J(this.f76067d, FFmpegMetadataRetriever.METADATA_KEY_TITLE);
            C27422t1.m37227I(this.f76067d, J, C101656f.C101658b.Text);
            C101656f fVar = this.f76067d.f76058k;
            if (fVar != null) {
                C27422t1 t1Var = this.f76067d;
                String y = t1Var.mo141117y(fVar.mo141123b().get(J), t1Var.f76057j.f288367f);
                return y != null ? y : this.f76067d.f76057j.f288367f;
            }
            C87412m.m108603p("__xmlParser__");
            throw null;
        }
    }

    /* renamed from: hc3.t1$d */
    public static final class C27426d extends C87413o implements C32224a<String> {

        /* renamed from: d */
        public final /* synthetic */ C27422t1 f76068d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C27426d(C27422t1 t1Var) {
            super(0);
            this.f76068d = t1Var;
        }

        public Object invoke() {
            String J = C27422t1.m37228J(this.f76068d, "tvinfo");
            C27422t1.m37227I(this.f76068d, J, C101656f.C101658b.Text);
            C101656f fVar = this.f76068d.f76058k;
            if (fVar != null) {
                C27422t1 t1Var = this.f76068d;
                String y = t1Var.mo141117y(fVar.mo141123b().get(J), t1Var.f76057j.f288370i);
                return y != null ? y : this.f76068d.f76057j.f288370i;
            }
            C87412m.m108603p("__xmlParser__");
            throw null;
        }
    }

    public C27422t1(C101656f fVar, String str) {
        C87412m.m108594g(fVar, "__xmlParser__");
        C87412m.m108594g(str, "__xmlPrefixTag__");
        C13602i iVar = C13602i.SYNCHRONIZED;
        this.f76061n = C36568h.m40986b(iVar, new C27425c(this));
        this.f76062o = C36568h.m40986b(iVar, new C27423a(this));
        this.f76063p = C36568h.m40986b(iVar, new C27424b(this));
        this.f76064q = C36568h.m40986b(iVar, new C27426d(this));
        this.f76058k = fVar;
        this.f76059l = str;
    }

    /* renamed from: I */
    public static final void m37227I(C27422t1 t1Var, String str, C101656f.C101658b bVar) {
        C101656f fVar = t1Var.f76058k;
        if (fVar == null) {
            C87412m.m108603p("__xmlParser__");
            throw null;
        } else if (!fVar.mo141123b().containsKey(str) && t1Var.f76060m != C101656f.C101657a.ParseEnd) {
            C101656f fVar2 = t1Var.f76058k;
            if (fVar2 != null) {
                t1Var.f76060m = fVar2.mo141125d(str, bVar);
            } else {
                C87412m.m108603p("__xmlParser__");
                throw null;
            }
        }
    }

    /* renamed from: J */
    public static final String m37228J(C27422t1 t1Var, String str) {
        String str2;
        t1Var.getClass();
        StringBuilder sb = new StringBuilder();
        sb.append('.');
        String str3 = t1Var.f76059l;
        if (str3 != null) {
            if (!C112551y.m153811k(str3)) {
                StringBuilder sb4 = new StringBuilder();
                String str4 = t1Var.f76059l;
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
    public String mo55087A() {
        return (String) this.f76062o.getValue();
    }

    /* renamed from: B */
    public String mo55088B() {
        return (String) this.f76063p.getValue();
    }

    /* renamed from: C */
    public String mo55089C() {
        return (String) this.f76061n.getValue();
    }

    /* renamed from: D */
    public String mo55090D() {
        return (String) this.f76064q.getValue();
    }

    /* renamed from: E */
    public void mo55091E(String str) {
        C87412m.m108594g(str, "value");
    }

    /* renamed from: F */
    public void mo55092F(String str) {
        C87412m.m108594g(str, "value");
    }

    /* renamed from: G */
    public void mo55093G(String str) {
        C87412m.m108594g(str, "value");
    }

    /* renamed from: H */
    public void mo55094H(String str) {
        C87412m.m108594g(str, "value");
    }
}

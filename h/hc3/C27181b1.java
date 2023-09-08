package hc3;

import com.tencent.p014mm.plugin.mmsight.segment.FFmpegMetadataRetriever;
import fy3.C32224a;
import gy3.C87412m;
import gy3.C87413o;
import java.util.ArrayList;
import java.util.List;
import rx3.C13601g;
import rx3.C13602i;
import rx3.C36568h;
import sm2.C101656f;
import z04.C112551y;

/* renamed from: hc3.b1 */
public final class C27181b1 extends C98381z0 {

    /* renamed from: A */
    public final C13601g f75492A;

    /* renamed from: B */
    public final C13601g f75493B;

    /* renamed from: C */
    public final C13601g f75494C;

    /* renamed from: D */
    public final C13601g f75495D;

    /* renamed from: E */
    public final C13601g f75496E;

    /* renamed from: F */
    public final C13601g f75497F;

    /* renamed from: G */
    public final C13601g f75498G;

    /* renamed from: H */
    public final C13601g f75499H;

    /* renamed from: I */
    public final C13601g f75500I;

    /* renamed from: s */
    public final C98381z0 f75501s = new C98381z0();

    /* renamed from: t */
    public C101656f f75502t;

    /* renamed from: u */
    public String f75503u;

    /* renamed from: v */
    public C101656f.C101657a f75504v;

    /* renamed from: w */
    public final C13601g f75505w;

    /* renamed from: x */
    public final C13601g f75506x;

    /* renamed from: y */
    public final C13601g f75507y;

    /* renamed from: z */
    public final C13601g f75508z;

    /* renamed from: hc3.b1$a */
    public static final class C27182a extends C87413o implements C32224a<String> {

        /* renamed from: d */
        public final /* synthetic */ C27181b1 f75509d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C27182a(C27181b1 b1Var) {
            super(0);
            this.f75509d = b1Var;
        }

        public Object invoke() {
            String b0 = C27181b1.m36605b0(this.f75509d, "cdnthumbkey");
            C27181b1.m36604a0(this.f75509d, b0, C101656f.C101658b.Text);
            C101656f fVar = this.f75509d.f75502t;
            if (fVar != null) {
                C27181b1 b1Var = this.f75509d;
                String y = b1Var.mo141117y(fVar.mo141123b().get(b0), b1Var.f75501s.f287027i);
                return y != null ? y : this.f75509d.f75501s.f287027i;
            }
            C87412m.m108603p("__xmlParser__");
            throw null;
        }
    }

    /* renamed from: hc3.b1$b */
    public static final class C27183b extends C87413o implements C32224a<String> {

        /* renamed from: d */
        public final /* synthetic */ C27181b1 f75510d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C27183b(C27181b1 b1Var) {
            super(0);
            this.f75510d = b1Var;
        }

        public Object invoke() {
            String b0 = C27181b1.m36605b0(this.f75510d, "cdnthumburl");
            C27181b1.m36604a0(this.f75510d, b0, C101656f.C101658b.Text);
            C101656f fVar = this.f75510d.f75502t;
            if (fVar != null) {
                C27181b1 b1Var = this.f75510d;
                String y = b1Var.mo141117y(fVar.mo141123b().get(b0), b1Var.f75501s.f287026h);
                return y != null ? y : this.f75510d.f75501s.f287026h;
            }
            C87412m.m108603p("__xmlParser__");
            throw null;
        }
    }

    /* renamed from: hc3.b1$c */
    public static final class C27184c extends C87413o implements C32224a<List<C27313m>> {

        /* renamed from: d */
        public final /* synthetic */ C27181b1 f75511d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C27184c(C27181b1 b1Var) {
            super(0);
            this.f75511d = b1Var;
        }

        public Object invoke() {
            String b0 = C27181b1.m36605b0(this.f75511d, "datalist");
            C27181b1.m36604a0(this.f75511d, b0, C101656f.C101658b.End);
            ArrayList arrayList = new ArrayList();
            Class<C27313m> cls = C27313m.class;
            C27181b1 b1Var = this.f75511d;
            C101656f fVar = b1Var.f75502t;
            if (fVar != null) {
                b1Var.mo141107o(arrayList, cls, fVar.mo141123b(), b0, "dataitem");
                return arrayList.size() > 0 ? arrayList : this.f75511d.f75501s.f288420m;
            }
            C87412m.m108603p("__xmlParser__");
            throw null;
        }
    }

    /* renamed from: hc3.b1$d */
    public static final class C27185d extends C87413o implements C32224a<String> {

        /* renamed from: d */
        public final /* synthetic */ C27181b1 f75512d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C27185d(C27181b1 b1Var) {
            super(0);
            this.f75512d = b1Var;
        }

        public Object invoke() {
            String b0 = C27181b1.m36605b0(this.f75512d, "desc");
            C27181b1.m36604a0(this.f75512d, b0, C101656f.C101658b.Text);
            C101656f fVar = this.f75512d.f75502t;
            if (fVar != null) {
                C27181b1 b1Var = this.f75512d;
                String y = b1Var.mo141117y(fVar.mo141123b().get(b0), b1Var.f75501s.f287025g);
                return y != null ? y : this.f75512d.f75501s.f287025g;
            }
            C87412m.m108603p("__xmlParser__");
            throw null;
        }
    }

    /* renamed from: hc3.b1$e */
    public static final class C27186e extends C87413o implements C32224a<Long> {

        /* renamed from: d */
        public final /* synthetic */ C27181b1 f75513d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C27186e(C27181b1 b1Var) {
            super(0);
            this.f75513d = b1Var;
        }

        public Object invoke() {
            String b0 = C27181b1.m36605b0(this.f75513d, "edittime");
            C27181b1.m36604a0(this.f75513d, b0, C101656f.C101658b.Text);
            C101656f fVar = this.f75513d.f75502t;
            if (fVar != null) {
                C27181b1 b1Var = this.f75513d;
                Long x = b1Var.mo141116x(fVar.mo141123b().get(b0), Long.valueOf(b1Var.f75501s.f288423p));
                return Long.valueOf(x != null ? x.longValue() : this.f75513d.f75501s.f288423p);
            }
            C87412m.m108603p("__xmlParser__");
            throw null;
        }
    }

    /* renamed from: hc3.b1$f */
    public static final class C27187f extends C87413o implements C32224a<String> {

        /* renamed from: d */
        public final /* synthetic */ C27181b1 f75514d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C27187f(C27181b1 b1Var) {
            super(0);
            this.f75514d = b1Var;
        }

        public Object invoke() {
            String b0 = C27181b1.m36605b0(this.f75514d, "editusr");
            C27181b1.m36604a0(this.f75514d, b0, C101656f.C101658b.Text);
            C101656f fVar = this.f75514d.f75502t;
            if (fVar != null) {
                C27181b1 b1Var = this.f75514d;
                String y = b1Var.mo141117y(fVar.mo141123b().get(b0), b1Var.f75501s.f288424q);
                return y != null ? y : this.f75514d.f75501s.f288424q;
            }
            C87412m.m108603p("__xmlParser__");
            throw null;
        }
    }

    /* renamed from: hc3.b1$g */
    public static final class C27188g extends C87413o implements C32224a<String> {

        /* renamed from: d */
        public final /* synthetic */ C27181b1 f75515d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C27188g(C27181b1 b1Var) {
            super(0);
            this.f75515d = b1Var;
        }

        public Object invoke() {
            String b0 = C27181b1.m36605b0(this.f75515d, "favcreatetime");
            C27181b1.m36604a0(this.f75515d, b0, C101656f.C101658b.Text);
            C101656f fVar = this.f75515d.f75502t;
            if (fVar != null) {
                C27181b1 b1Var = this.f75515d;
                String y = b1Var.mo141117y(fVar.mo141123b().get(b0), b1Var.f75501s.f288422o);
                return y != null ? y : this.f75515d.f75501s.f288422o;
            }
            C87412m.m108603p("__xmlParser__");
            throw null;
        }
    }

    /* renamed from: hc3.b1$h */
    public static final class C27189h extends C87413o implements C32224a<String> {

        /* renamed from: d */
        public final /* synthetic */ C27181b1 f75516d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C27189h(C27181b1 b1Var) {
            super(0);
            this.f75516d = b1Var;
        }

        public Object invoke() {
            String b0 = C27181b1.m36605b0(this.f75516d, "favusername");
            C27181b1.m36604a0(this.f75516d, b0, C101656f.C101658b.Text);
            C101656f fVar = this.f75516d.f75502t;
            if (fVar != null) {
                C27181b1 b1Var = this.f75516d;
                String y = b1Var.mo141117y(fVar.mo141123b().get(b0), b1Var.f75501s.f288421n);
                return y != null ? y : this.f75516d.f75501s.f288421n;
            }
            C87412m.m108603p("__xmlParser__");
            throw null;
        }
    }

    /* renamed from: hc3.b1$i */
    public static final class C27190i extends C87413o implements C32224a<Integer> {

        /* renamed from: d */
        public final /* synthetic */ C27181b1 f75517d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C27190i(C27181b1 b1Var) {
            super(0);
            this.f75517d = b1Var;
        }

        public Object invoke() {
            String b0 = C27181b1.m36605b0(this.f75517d, "isChatRoom");
            C27181b1.m36604a0(this.f75517d, b0, C101656f.C101658b.Text);
            C101656f fVar = this.f75517d.f75502t;
            if (fVar != null) {
                C27181b1 b1Var = this.f75517d;
                Integer w = b1Var.mo141115w(fVar.mo141123b().get(b0), Integer.valueOf(b1Var.f75501s.f288425r));
                return Integer.valueOf(w != null ? w.intValue() : this.f75517d.f75501s.f288425r);
            }
            C87412m.m108603p("__xmlParser__");
            throw null;
        }
    }

    /* renamed from: hc3.b1$j */
    public static final class C27191j extends C87413o implements C32224a<C98361l1> {

        /* renamed from: d */
        public final /* synthetic */ C27181b1 f75518d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C27191j(C27181b1 b1Var) {
            super(0);
            this.f75518d = b1Var;
        }

        public Object invoke() {
            String b0 = C27181b1.m36605b0(this.f75518d, "noteinfo");
            C27181b1.m36604a0(this.f75518d, b0, C101656f.C101658b.Start);
            C101656f fVar = this.f75518d.f75502t;
            if (fVar == null) {
                C87412m.m108603p("__xmlParser__");
                throw null;
            } else if (!fVar.mo141123b().containsKey(b0)) {
                return this.f75518d.f75501s.f288419l;
            } else {
                C27181b1 b1Var = this.f75518d;
                C101656f fVar2 = b1Var.f75502t;
                if (fVar2 != null) {
                    return new C27321n1(fVar2, b1Var.mo54713c0("noteinfo"));
                }
                C87412m.m108603p("__xmlParser__");
                throw null;
            }
        }
    }

    /* renamed from: hc3.b1$k */
    public static final class C27192k extends C87413o implements C32224a<String> {

        /* renamed from: d */
        public final /* synthetic */ C27181b1 f75519d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C27192k(C27181b1 b1Var) {
            super(0);
            this.f75519d = b1Var;
        }

        public Object invoke() {
            String b0 = C27181b1.m36605b0(this.f75519d, "thumbfullmd5");
            C27181b1.m36604a0(this.f75519d, b0, C101656f.C101658b.Text);
            C101656f fVar = this.f75519d.f75502t;
            if (fVar != null) {
                C27181b1 b1Var = this.f75519d;
                String y = b1Var.mo141117y(fVar.mo141123b().get(b0), b1Var.f75501s.f287028j);
                return y != null ? y : this.f75519d.f75501s.f287028j;
            }
            C87412m.m108603p("__xmlParser__");
            throw null;
        }
    }

    /* renamed from: hc3.b1$l */
    public static final class C27193l extends C87413o implements C32224a<Long> {

        /* renamed from: d */
        public final /* synthetic */ C27181b1 f75520d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C27193l(C27181b1 b1Var) {
            super(0);
            this.f75520d = b1Var;
        }

        public Object invoke() {
            String b0 = C27181b1.m36605b0(this.f75520d, "thumbsize");
            C27181b1.m36604a0(this.f75520d, b0, C101656f.C101658b.Text);
            C101656f fVar = this.f75520d.f75502t;
            if (fVar != null) {
                C27181b1 b1Var = this.f75520d;
                Long x = b1Var.mo141116x(fVar.mo141123b().get(b0), Long.valueOf(b1Var.f75501s.f287029k));
                return Long.valueOf(x != null ? x.longValue() : this.f75520d.f75501s.f287029k);
            }
            C87412m.m108603p("__xmlParser__");
            throw null;
        }
    }

    /* renamed from: hc3.b1$m */
    public static final class C27194m extends C87413o implements C32224a<String> {

        /* renamed from: d */
        public final /* synthetic */ C27181b1 f75521d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C27194m(C27181b1 b1Var) {
            super(0);
            this.f75521d = b1Var;
        }

        public Object invoke() {
            String b0 = C27181b1.m36605b0(this.f75521d, FFmpegMetadataRetriever.METADATA_KEY_TITLE);
            C27181b1.m36604a0(this.f75521d, b0, C101656f.C101658b.Text);
            C101656f fVar = this.f75521d.f75502t;
            if (fVar != null) {
                C27181b1 b1Var = this.f75521d;
                String y = b1Var.mo141117y(fVar.mo141123b().get(b0), b1Var.f75501s.f287024f);
                return y != null ? y : this.f75521d.f75501s.f287024f;
            }
            C87412m.m108603p("__xmlParser__");
            throw null;
        }
    }

    public C27181b1(C101656f fVar, String str) {
        C87412m.m108594g(fVar, "__xmlParser__");
        C87412m.m108594g(str, "__xmlPrefixTag__");
        C13602i iVar = C13602i.SYNCHRONIZED;
        this.f75505w = C36568h.m40986b(iVar, new C27194m(this));
        this.f75506x = C36568h.m40986b(iVar, new C27185d(this));
        this.f75507y = C36568h.m40986b(iVar, new C27183b(this));
        this.f75508z = C36568h.m40986b(iVar, new C27182a(this));
        this.f75492A = C36568h.m40986b(iVar, new C27192k(this));
        this.f75493B = C36568h.m40986b(iVar, new C27193l(this));
        this.f75494C = C36568h.m40986b(iVar, new C27191j(this));
        this.f75495D = C36568h.m40986b(iVar, new C27184c(this));
        this.f75496E = C36568h.m40986b(iVar, new C27189h(this));
        this.f75497F = C36568h.m40986b(iVar, new C27188g(this));
        this.f75498G = C36568h.m40986b(iVar, new C27186e(this));
        this.f75499H = C36568h.m40986b(iVar, new C27187f(this));
        this.f75500I = C36568h.m40986b(iVar, new C27190i(this));
        this.f75502t = fVar;
        this.f75503u = str;
    }

    /* renamed from: a0 */
    public static final void m36604a0(C27181b1 b1Var, String str, C101656f.C101658b bVar) {
        C101656f fVar = b1Var.f75502t;
        if (fVar == null) {
            C87412m.m108603p("__xmlParser__");
            throw null;
        } else if (!fVar.mo141123b().containsKey(str) && b1Var.f75504v != C101656f.C101657a.ParseEnd) {
            C101656f fVar2 = b1Var.f75502t;
            if (fVar2 != null) {
                b1Var.f75504v = fVar2.mo141125d(str, bVar);
            } else {
                C87412m.m108603p("__xmlParser__");
                throw null;
            }
        }
    }

    /* renamed from: b0 */
    public static final String m36605b0(C27181b1 b1Var, String str) {
        b1Var.getClass();
        return '.' + b1Var.mo54713c0(str);
    }

    /* renamed from: A */
    public String mo54566A() {
        return (String) this.f75508z.getValue();
    }

    /* renamed from: B */
    public String mo54567B() {
        return (String) this.f75507y.getValue();
    }

    /* renamed from: C */
    public String mo54568C() {
        return (String) this.f75506x.getValue();
    }

    /* renamed from: D */
    public String mo54569D() {
        return (String) this.f75492A.getValue();
    }

    /* renamed from: E */
    public long mo54570E() {
        return ((Number) this.f75493B.getValue()).longValue();
    }

    /* renamed from: F */
    public String mo54571F() {
        return (String) this.f75505w.getValue();
    }

    /* renamed from: G */
    public void mo54572G(String str) {
        C87412m.m108594g(str, "value");
    }

    /* renamed from: H */
    public void mo54573H(String str) {
        C87412m.m108594g(str, "value");
    }

    /* renamed from: I */
    public void mo54574I(String str) {
        C87412m.m108594g(str, "value");
    }

    /* renamed from: J */
    public void mo54575J(String str) {
        C87412m.m108594g(str, "value");
    }

    /* renamed from: K */
    public void mo54576K(long j) {
    }

    /* renamed from: L */
    public void mo54577L(String str) {
        C87412m.m108594g(str, "value");
    }

    /* renamed from: M */
    public List<C27313m> mo54699M() {
        return (List) this.f75495D.getValue();
    }

    /* renamed from: N */
    public long mo54700N() {
        return ((Number) this.f75498G.getValue()).longValue();
    }

    /* renamed from: O */
    public String mo54701O() {
        return (String) this.f75499H.getValue();
    }

    /* renamed from: P */
    public String mo54702P() {
        return (String) this.f75497F.getValue();
    }

    /* renamed from: Q */
    public String mo54703Q() {
        return (String) this.f75496E.getValue();
    }

    /* renamed from: R */
    public C98361l1 mo54704R() {
        return (C98361l1) this.f75494C.getValue();
    }

    /* renamed from: S */
    public int mo54705S() {
        return ((Number) this.f75500I.getValue()).intValue();
    }

    /* renamed from: T */
    public void mo54706T(int i) {
    }

    /* renamed from: U */
    public void mo54707U(List<C27313m> list) {
        C87412m.m108594g(list, "value");
    }

    /* renamed from: V */
    public void mo54708V(long j) {
    }

    /* renamed from: W */
    public void mo54709W(String str) {
        C87412m.m108594g(str, "value");
    }

    /* renamed from: X */
    public void mo54710X(String str) {
        C87412m.m108594g(str, "value");
    }

    /* renamed from: Y */
    public void mo54711Y(String str) {
        C87412m.m108594g(str, "value");
    }

    /* renamed from: Z */
    public void mo54712Z(C98361l1 l1Var) {
    }

    /* renamed from: c0 */
    public final String mo54713c0(String str) {
        String str2 = this.f75503u;
        if (str2 == null) {
            C87412m.m108603p("__xmlPrefixTag__");
            throw null;
        } else if (!(!C112551y.m153811k(str2))) {
            return String.valueOf(str);
        } else {
            StringBuilder sb = new StringBuilder();
            String str3 = this.f75503u;
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

package hc3;

import com.google.firebase.analytics.FirebaseAnalytics;
import fy3.C32224a;
import gy3.C87412m;
import gy3.C87413o;
import rx3.C13601g;
import rx3.C13602i;
import rx3.C36568h;
import sm2.C101656f;
import z04.C112551y;

/* renamed from: hc3.y0 */
public final class C27476y0 extends C27441w0 {

    /* renamed from: m */
    public final C27441w0 f76176m = new C27441w0();

    /* renamed from: n */
    public C101656f f76177n;

    /* renamed from: o */
    public String f76178o;

    /* renamed from: p */
    public C101656f.C101657a f76179p;

    /* renamed from: q */
    public final C13601g f76180q;

    /* renamed from: r */
    public final C13601g f76181r;

    /* renamed from: s */
    public final C13601g f76182s;

    /* renamed from: t */
    public final C13601g f76183t;

    /* renamed from: u */
    public final C13601g f76184u;

    /* renamed from: v */
    public final C13601g f76185v;

    /* renamed from: w */
    public final C13601g f76186w;

    /* renamed from: hc3.y0$a */
    public static final class C27477a extends C87413o implements C32224a<String> {

        /* renamed from: d */
        public final /* synthetic */ C27476y0 f76187d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C27477a(C27476y0 y0Var) {
            super(0);
            this.f76187d = y0Var;
        }

        public Object invoke() {
            String P = C27476y0.m37365P(this.f76187d, "desc");
            C27476y0.m37364O(this.f76187d, P, C101656f.C101658b.Text);
            C101656f fVar = this.f76187d.f76177n;
            if (fVar != null) {
                C27476y0 y0Var = this.f76187d;
                String y = y0Var.mo141117y(fVar.mo141123b().get(P), y0Var.f76176m.f76102i);
                return y != null ? y : this.f76187d.f76176m.f76102i;
            }
            C87412m.m108603p("__xmlParser__");
            throw null;
        }
    }

    /* renamed from: hc3.y0$b */
    public static final class C27478b extends C87413o implements C32224a<String> {

        /* renamed from: d */
        public final /* synthetic */ C27476y0 f76188d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C27478b(C27476y0 y0Var) {
            super(0);
            this.f76188d = y0Var;
        }

        public Object invoke() {
            String P = C27476y0.m37365P(this.f76188d, "iconUrl");
            C27476y0.m37364O(this.f76188d, P, C101656f.C101658b.Text);
            C101656f fVar = this.f76188d.f76177n;
            if (fVar != null) {
                C27476y0 y0Var = this.f76188d;
                String y = y0Var.mo141117y(fVar.mo141123b().get(P), y0Var.f76176m.f76101h);
                return y != null ? y : this.f76188d.f76176m.f76101h;
            }
            C87412m.m108603p("__xmlParser__");
            throw null;
        }
    }

    /* renamed from: hc3.y0$c */
    public static final class C27479c extends C87413o implements C32224a<String> {

        /* renamed from: d */
        public final /* synthetic */ C27476y0 f76189d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C27479c(C27476y0 y0Var) {
            super(0);
            this.f76189d = y0Var;
        }

        public Object invoke() {
            String P = C27476y0.m37365P(this.f76189d, "patMusicId");
            C27476y0.m37364O(this.f76189d, P, C101656f.C101658b.Text);
            C101656f fVar = this.f76189d.f76177n;
            if (fVar != null) {
                C27476y0 y0Var = this.f76189d;
                String y = y0Var.mo141117y(fVar.mo141123b().get(P), y0Var.f76176m.f76103j);
                return y != null ? y : this.f76189d.f76176m.f76103j;
            }
            C87412m.m108603p("__xmlParser__");
            throw null;
        }
    }

    /* renamed from: hc3.y0$d */
    public static final class C27480d extends C87413o implements C32224a<C27403q0> {

        /* renamed from: d */
        public final /* synthetic */ C27476y0 f76190d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C27480d(C27476y0 y0Var) {
            super(0);
            this.f76190d = y0Var;
        }

        public Object invoke() {
            String P = C27476y0.m37365P(this.f76190d, "event");
            C27476y0.m37364O(this.f76190d, P, C101656f.C101658b.Start);
            C101656f fVar = this.f76190d.f76177n;
            if (fVar == null) {
                C87412m.m108603p("__xmlParser__");
                throw null;
            } else if (!fVar.mo141123b().containsKey(P)) {
                return this.f76190d.f76176m.f76105l;
            } else {
                C27476y0 y0Var = this.f76190d;
                C101656f fVar2 = y0Var.f76177n;
                if (fVar2 != null) {
                    return new C27415s0(fVar2, y0Var.mo55189Q("event"));
                }
                C87412m.m108603p("__xmlParser__");
                throw null;
            }
        }
    }

    /* renamed from: hc3.y0$e */
    public static final class C27481e extends C87413o implements C32224a<C27421t0> {

        /* renamed from: d */
        public final /* synthetic */ C27476y0 f76191d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C27481e(C27476y0 y0Var) {
            super(0);
            this.f76191d = y0Var;
        }

        public Object invoke() {
            String P = C27476y0.m37365P(this.f76191d, FirebaseAnalytics.C113379b.LOCATION);
            C27476y0.m37364O(this.f76191d, P, C101656f.C101658b.Start);
            C101656f fVar = this.f76191d.f76177n;
            if (fVar == null) {
                C87412m.m108603p("__xmlParser__");
                throw null;
            } else if (!fVar.mo141123b().containsKey(P)) {
                return this.f76191d.f76176m.f76104k;
            } else {
                C27476y0 y0Var = this.f76191d;
                C101656f fVar2 = y0Var.f76177n;
                if (fVar2 != null) {
                    return new C27437v0(fVar2, y0Var.mo55189Q(FirebaseAnalytics.C113379b.LOCATION));
                }
                C87412m.m108603p("__xmlParser__");
                throw null;
            }
        }
    }

    /* renamed from: hc3.y0$f */
    public static final class C27482f extends C87413o implements C32224a<Integer> {

        /* renamed from: d */
        public final /* synthetic */ C27476y0 f76192d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C27482f(C27476y0 y0Var) {
            super(0);
            this.f76192d = y0Var;
        }

        public Object invoke() {
            String P = C27476y0.m37365P(this.f76192d, "topicType");
            C27476y0.m37364O(this.f76192d, P, C101656f.C101658b.Text);
            C101656f fVar = this.f76192d.f76177n;
            if (fVar != null) {
                C27476y0 y0Var = this.f76192d;
                Integer w = y0Var.mo141115w(fVar.mo141123b().get(P), Integer.valueOf(y0Var.f76176m.f76100g));
                return Integer.valueOf(w != null ? w.intValue() : this.f76192d.f76176m.f76100g);
            }
            C87412m.m108603p("__xmlParser__");
            throw null;
        }
    }

    /* renamed from: hc3.y0$g */
    public static final class C27483g extends C87413o implements C32224a<String> {

        /* renamed from: d */
        public final /* synthetic */ C27476y0 f76193d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C27483g(C27476y0 y0Var) {
            super(0);
            this.f76193d = y0Var;
        }

        public Object invoke() {
            String P = C27476y0.m37365P(this.f76193d, "topic");
            C27476y0.m37364O(this.f76193d, P, C101656f.C101658b.Text);
            C101656f fVar = this.f76193d.f76177n;
            if (fVar != null) {
                C27476y0 y0Var = this.f76193d;
                String y = y0Var.mo141117y(fVar.mo141123b().get(P), y0Var.f76176m.f76099f);
                return y != null ? y : this.f76193d.f76176m.f76099f;
            }
            C87412m.m108603p("__xmlParser__");
            throw null;
        }
    }

    public C27476y0(C101656f fVar, String str) {
        C87412m.m108594g(fVar, "__xmlParser__");
        C87412m.m108594g(str, "__xmlPrefixTag__");
        C13602i iVar = C13602i.SYNCHRONIZED;
        this.f76180q = C36568h.m40986b(iVar, new C27483g(this));
        this.f76181r = C36568h.m40986b(iVar, new C27482f(this));
        this.f76182s = C36568h.m40986b(iVar, new C27478b(this));
        this.f76183t = C36568h.m40986b(iVar, new C27477a(this));
        this.f76184u = C36568h.m40986b(iVar, new C27479c(this));
        this.f76185v = C36568h.m40986b(iVar, new C27481e(this));
        this.f76186w = C36568h.m40986b(iVar, new C27480d(this));
        this.f76177n = fVar;
        this.f76178o = str;
    }

    /* renamed from: O */
    public static final void m37364O(C27476y0 y0Var, String str, C101656f.C101658b bVar) {
        C101656f fVar = y0Var.f76177n;
        if (fVar == null) {
            C87412m.m108603p("__xmlParser__");
            throw null;
        } else if (!fVar.mo141123b().containsKey(str) && y0Var.f76179p != C101656f.C101657a.ParseEnd) {
            C101656f fVar2 = y0Var.f76177n;
            if (fVar2 != null) {
                y0Var.f76179p = fVar2.mo141125d(str, bVar);
            } else {
                C87412m.m108603p("__xmlParser__");
                throw null;
            }
        }
    }

    /* renamed from: P */
    public static final String m37365P(C27476y0 y0Var, String str) {
        y0Var.getClass();
        return '.' + y0Var.mo55189Q(str);
    }

    /* renamed from: A */
    public String mo55111A() {
        return (String) this.f76183t.getValue();
    }

    /* renamed from: B */
    public String mo55112B() {
        return (String) this.f76182s.getValue();
    }

    /* renamed from: C */
    public String mo55113C() {
        return (String) this.f76184u.getValue();
    }

    /* renamed from: D */
    public String mo55114D() {
        return (String) this.f76180q.getValue();
    }

    /* renamed from: E */
    public C27403q0 mo55115E() {
        return (C27403q0) this.f76186w.getValue();
    }

    /* renamed from: F */
    public C27421t0 mo55116F() {
        return (C27421t0) this.f76185v.getValue();
    }

    /* renamed from: G */
    public int mo55117G() {
        return ((Number) this.f76181r.getValue()).intValue();
    }

    /* renamed from: H */
    public void mo55118H(String str) {
        C87412m.m108594g(str, "value");
    }

    /* renamed from: I */
    public void mo55119I(String str) {
        C87412m.m108594g(str, "value");
    }

    /* renamed from: J */
    public void mo55120J(String str) {
        C87412m.m108594g(str, "value");
    }

    /* renamed from: K */
    public void mo55121K(String str) {
        C87412m.m108594g(str, "value");
    }

    /* renamed from: L */
    public void mo55122L(C27403q0 q0Var) {
    }

    /* renamed from: M */
    public void mo55123M(C27421t0 t0Var) {
    }

    /* renamed from: N */
    public void mo55124N(int i) {
    }

    /* renamed from: Q */
    public final String mo55189Q(String str) {
        String str2 = this.f76178o;
        if (str2 == null) {
            C87412m.m108603p("__xmlPrefixTag__");
            throw null;
        } else if (!(!C112551y.m153811k(str2))) {
            return String.valueOf(str);
        } else {
            StringBuilder sb = new StringBuilder();
            String str3 = this.f76178o;
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

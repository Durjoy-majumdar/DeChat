package hc3;

import com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys;
import fy3.C32224a;
import gy3.C87412m;
import gy3.C87413o;
import rx3.C13601g;
import rx3.C13602i;
import rx3.C36568h;
import sm2.C101656f;
import z04.C112551y;

/* renamed from: hc3.l */
public final class C27303l extends C98356j {

    /* renamed from: A */
    public final C13601g f75752A;

    /* renamed from: o */
    public final C98356j f75753o = new C98356j();

    /* renamed from: p */
    public C101656f f75754p;

    /* renamed from: q */
    public String f75755q;

    /* renamed from: r */
    public C101656f.C101657a f75756r;

    /* renamed from: s */
    public final C13601g f75757s;

    /* renamed from: t */
    public final C13601g f75758t;

    /* renamed from: u */
    public final C13601g f75759u;

    /* renamed from: v */
    public final C13601g f75760v;

    /* renamed from: w */
    public final C13601g f75761w;

    /* renamed from: x */
    public final C13601g f75762x;

    /* renamed from: y */
    public final C13601g f75763y;

    /* renamed from: z */
    public final C13601g f75764z;

    /* renamed from: hc3.l$a */
    public static final class C27304a extends C87413o implements C32224a<String> {

        /* renamed from: d */
        public final /* synthetic */ C27303l f75765d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C27304a(C27303l lVar) {
            super(0);
            this.f75765d = lVar;
        }

        public Object invoke() {
            String T = C27303l.m36858T(this.f75765d, "biznickname");
            C27303l.m36857S(this.f75765d, T, C101656f.C101658b.Text);
            C101656f fVar = this.f75765d.f75754p;
            if (fVar != null) {
                C27303l lVar = this.f75765d;
                String y = lVar.mo141117y(fVar.mo141123b().get(T), lVar.f75753o.f288336j);
                return y != null ? y : this.f75765d.f75753o.f288336j;
            }
            C87412m.m108603p("__xmlParser__");
            throw null;
        }
    }

    /* renamed from: hc3.l$b */
    public static final class C27305b extends C87413o implements C32224a<String> {

        /* renamed from: d */
        public final /* synthetic */ C27303l f75766d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C27305b(C27303l lVar) {
            super(0);
            this.f75766d = lVar;
        }

        public Object invoke() {
            String T = C27303l.m36858T(this.f75766d, "bizusrname");
            C27303l.m36857S(this.f75766d, T, C101656f.C101658b.Text);
            C101656f fVar = this.f75766d.f75754p;
            if (fVar != null) {
                C27303l lVar = this.f75766d;
                String y = lVar.mo141117y(fVar.mo141123b().get(T), lVar.f75753o.f288335i);
                return y != null ? y : this.f75766d.f75753o.f288335i;
            }
            C87412m.m108603p("__xmlParser__");
            throw null;
        }
    }

    /* renamed from: hc3.l$c */
    public static final class C27306c extends C87413o implements C32224a<Integer> {

        /* renamed from: d */
        public final /* synthetic */ C27303l f75767d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C27306c(C27303l lVar) {
            super(0);
            this.f75767d = lVar;
        }

        public Object invoke() {
            String T = C27303l.m36858T(this.f75767d, "duration");
            C27303l.m36857S(this.f75767d, T, C101656f.C101658b.Text);
            C101656f fVar = this.f75767d.f75754p;
            if (fVar != null) {
                C27303l lVar = this.f75767d;
                Integer w = lVar.mo141115w(fVar.mo141123b().get(T), Integer.valueOf(lVar.f75753o.f288340n));
                return Integer.valueOf(w != null ? w.intValue() : this.f75767d.f75753o.f288340n);
            }
            C87412m.m108603p("__xmlParser__");
            throw null;
        }
    }

    /* renamed from: hc3.l$d */
    public static final class C27307d extends C87413o implements C32224a<String> {

        /* renamed from: d */
        public final /* synthetic */ C27303l f75768d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C27307d(C27303l lVar) {
            super(0);
            this.f75768d = lVar;
        }

        public Object invoke() {
            String T = C27303l.m36858T(this.f75768d, "mpurl");
            C27303l.m36857S(this.f75768d, T, C101656f.C101658b.Text);
            C101656f fVar = this.f75768d.f75754p;
            if (fVar != null) {
                C27303l lVar = this.f75768d;
                String y = lVar.mo141117y(fVar.mo141123b().get(T), lVar.f75753o.f288334h);
                return y != null ? y : this.f75768d.f75753o.f288334h;
            }
            C87412m.m108603p("__xmlParser__");
            throw null;
        }
    }

    /* renamed from: hc3.l$e */
    public static final class C27308e extends C87413o implements C32224a<Integer> {

        /* renamed from: d */
        public final /* synthetic */ C27303l f75769d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C27308e(C27303l lVar) {
            super(0);
            this.f75769d = lVar;
        }

        public Object invoke() {
            String T = C27303l.m36858T(this.f75769d, "thumbheight");
            C27303l.m36857S(this.f75769d, T, C101656f.C101658b.Text);
            C101656f fVar = this.f75769d.f75754p;
            if (fVar != null) {
                C27303l lVar = this.f75769d;
                Integer w = lVar.mo141115w(fVar.mo141123b().get(T), Integer.valueOf(lVar.f75753o.f288339m));
                return Integer.valueOf(w != null ? w.intValue() : this.f75769d.f75753o.f288339m);
            }
            C87412m.m108603p("__xmlParser__");
            throw null;
        }
    }

    /* renamed from: hc3.l$f */
    public static final class C27309f extends C87413o implements C32224a<String> {

        /* renamed from: d */
        public final /* synthetic */ C27303l f75770d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C27309f(C27303l lVar) {
            super(0);
            this.f75770d = lVar;
        }

        public Object invoke() {
            String T = C27303l.m36858T(this.f75770d, "thumburl");
            C27303l.m36857S(this.f75770d, T, C101656f.C101658b.Text);
            C101656f fVar = this.f75770d.f75754p;
            if (fVar != null) {
                C27303l lVar = this.f75770d;
                String y = lVar.mo141117y(fVar.mo141123b().get(T), lVar.f75753o.f288337k);
                return y != null ? y : this.f75770d.f75753o.f288337k;
            }
            C87412m.m108603p("__xmlParser__");
            throw null;
        }
    }

    /* renamed from: hc3.l$g */
    public static final class C27310g extends C87413o implements C32224a<Integer> {

        /* renamed from: d */
        public final /* synthetic */ C27303l f75771d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C27310g(C27303l lVar) {
            super(0);
            this.f75771d = lVar;
        }

        public Object invoke() {
            String T = C27303l.m36858T(this.f75771d, "thumbwidth");
            C27303l.m36857S(this.f75771d, T, C101656f.C101658b.Text);
            C101656f fVar = this.f75771d.f75754p;
            if (fVar != null) {
                C27303l lVar = this.f75771d;
                Integer w = lVar.mo141115w(fVar.mo141123b().get(T), Integer.valueOf(lVar.f75753o.f288338l));
                return Integer.valueOf(w != null ? w.intValue() : this.f75771d.f75753o.f288338l);
            }
            C87412m.m108603p("__xmlParser__");
            throw null;
        }
    }

    /* renamed from: hc3.l$h */
    public static final class C27311h extends C87413o implements C32224a<String> {

        /* renamed from: d */
        public final /* synthetic */ C27303l f75772d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C27311h(C27303l lVar) {
            super(0);
            this.f75772d = lVar;
        }

        public Object invoke() {
            String T = C27303l.m36858T(this.f75772d, TPReportKeys.Common.COMMON_VID);
            C27303l.m36857S(this.f75772d, T, C101656f.C101658b.Text);
            C101656f fVar = this.f75772d.f75754p;
            if (fVar != null) {
                C27303l lVar = this.f75772d;
                String y = lVar.mo141117y(fVar.mo141123b().get(T), lVar.f75753o.f288332f);
                return y != null ? y : this.f75772d.f75753o.f288332f;
            }
            C87412m.m108603p("__xmlParser__");
            throw null;
        }
    }

    /* renamed from: hc3.l$i */
    public static final class C27312i extends C87413o implements C32224a<String> {

        /* renamed from: d */
        public final /* synthetic */ C27303l f75773d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C27312i(C27303l lVar) {
            super(0);
            this.f75773d = lVar;
        }

        public Object invoke() {
            String T = C27303l.m36858T(this.f75773d, "videourl");
            C27303l.m36857S(this.f75773d, T, C101656f.C101658b.Text);
            C101656f fVar = this.f75773d.f75754p;
            if (fVar != null) {
                C27303l lVar = this.f75773d;
                String y = lVar.mo141117y(fVar.mo141123b().get(T), lVar.f75753o.f288333g);
                return y != null ? y : this.f75773d.f75753o.f288333g;
            }
            C87412m.m108603p("__xmlParser__");
            throw null;
        }
    }

    public C27303l(C101656f fVar, String str) {
        C87412m.m108594g(fVar, "__xmlParser__");
        C87412m.m108594g(str, "__xmlPrefixTag__");
        C13602i iVar = C13602i.SYNCHRONIZED;
        this.f75757s = C36568h.m40986b(iVar, new C27311h(this));
        this.f75758t = C36568h.m40986b(iVar, new C27312i(this));
        this.f75759u = C36568h.m40986b(iVar, new C27307d(this));
        this.f75760v = C36568h.m40986b(iVar, new C27305b(this));
        this.f75761w = C36568h.m40986b(iVar, new C27304a(this));
        this.f75762x = C36568h.m40986b(iVar, new C27309f(this));
        this.f75763y = C36568h.m40986b(iVar, new C27310g(this));
        this.f75764z = C36568h.m40986b(iVar, new C27308e(this));
        this.f75752A = C36568h.m40986b(iVar, new C27306c(this));
        this.f75754p = fVar;
        this.f75755q = str;
    }

    /* renamed from: S */
    public static final void m36857S(C27303l lVar, String str, C101656f.C101658b bVar) {
        C101656f fVar = lVar.f75754p;
        if (fVar == null) {
            C87412m.m108603p("__xmlParser__");
            throw null;
        } else if (!fVar.mo141123b().containsKey(str) && lVar.f75756r != C101656f.C101657a.ParseEnd) {
            C101656f fVar2 = lVar.f75754p;
            if (fVar2 != null) {
                lVar.f75756r = fVar2.mo141125d(str, bVar);
            } else {
                C87412m.m108603p("__xmlParser__");
                throw null;
            }
        }
    }

    /* renamed from: T */
    public static final String m36858T(C27303l lVar, String str) {
        String str2;
        lVar.getClass();
        StringBuilder sb = new StringBuilder();
        sb.append('.');
        String str3 = lVar.f75755q;
        if (str3 != null) {
            if (!C112551y.m153811k(str3)) {
                StringBuilder sb4 = new StringBuilder();
                String str4 = lVar.f75755q;
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
    public String mo54893A() {
        return (String) this.f75761w.getValue();
    }

    /* renamed from: B */
    public String mo54894B() {
        return (String) this.f75760v.getValue();
    }

    /* renamed from: C */
    public int mo54895C() {
        return ((Number) this.f75752A.getValue()).intValue();
    }

    /* renamed from: D */
    public String mo54896D() {
        return (String) this.f75759u.getValue();
    }

    /* renamed from: E */
    public int mo54897E() {
        return ((Number) this.f75764z.getValue()).intValue();
    }

    /* renamed from: F */
    public String mo54898F() {
        return (String) this.f75762x.getValue();
    }

    /* renamed from: G */
    public int mo54899G() {
        return ((Number) this.f75763y.getValue()).intValue();
    }

    /* renamed from: H */
    public String mo54900H() {
        return (String) this.f75757s.getValue();
    }

    /* renamed from: I */
    public String mo54901I() {
        return (String) this.f75758t.getValue();
    }

    /* renamed from: J */
    public void mo54902J(String str) {
        C87412m.m108594g(str, "value");
    }

    /* renamed from: K */
    public void mo54903K(String str) {
        C87412m.m108594g(str, "value");
    }

    /* renamed from: L */
    public void mo54904L(int i) {
    }

    /* renamed from: M */
    public void mo54905M(String str) {
        C87412m.m108594g(str, "value");
    }

    /* renamed from: N */
    public void mo54906N(int i) {
    }

    /* renamed from: O */
    public void mo54907O(String str) {
        C87412m.m108594g(str, "value");
    }

    /* renamed from: P */
    public void mo54908P(int i) {
    }

    /* renamed from: Q */
    public void mo54909Q(String str) {
        C87412m.m108594g(str, "value");
    }

    /* renamed from: R */
    public void mo54910R(String str) {
        C87412m.m108594g(str, "value");
    }
}

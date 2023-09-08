package cc3;

import com.tencent.p014mm.plugin.mmsight.segment.FFmpegMetadataRetriever;
import fy3.C32224a;
import gy3.C87412m;
import gy3.C87413o;
import rx3.C13601g;
import rx3.C13602i;
import rx3.C36568h;
import sm2.C101656f;
import z04.C112551y;

/* renamed from: cc3.l */
public final class C26858l extends C26856j {

    /* renamed from: A */
    public final C13601g f74686A;

    /* renamed from: B */
    public final C13601g f74687B;

    /* renamed from: C */
    public final C13601g f74688C;

    /* renamed from: D */
    public final C13601g f74689D;

    /* renamed from: E */
    public final C13601g f74690E;

    /* renamed from: F */
    public final C13601g f74691F;

    /* renamed from: G */
    public final C13601g f74692G;

    /* renamed from: r */
    public final C26856j f74693r = new C26856j();

    /* renamed from: s */
    public C101656f f74694s;

    /* renamed from: t */
    public String f74695t;

    /* renamed from: u */
    public C101656f.C101657a f74696u;

    /* renamed from: v */
    public final C13601g f74697v;

    /* renamed from: w */
    public final C13601g f74698w;

    /* renamed from: x */
    public final C13601g f74699x;

    /* renamed from: y */
    public final C13601g f74700y;

    /* renamed from: z */
    public final C13601g f74701z;

    /* renamed from: cc3.l$a */
    public static final class C26859a extends C87413o implements C32224a<String> {

        /* renamed from: d */
        public final /* synthetic */ C26858l f74702d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C26859a(C26858l lVar) {
            super(0);
            this.f74702d = lVar;
        }

        public Object invoke() {
            String Z = C26858l.m35513Z(this.f74702d, "action");
            C26858l.m35512Y(this.f74702d, Z, C101656f.C101658b.Text);
            C101656f fVar = this.f74702d.f74694s;
            if (fVar != null) {
                C26858l lVar = this.f74702d;
                String y = lVar.mo141117y(fVar.mo141123b().get(Z), lVar.f74693r.f74640k);
                return y != null ? y : this.f74702d.f74693r.f74640k;
            }
            C87412m.m108603p("__xmlParser__");
            throw null;
        }
    }

    /* renamed from: cc3.l$b */
    public static final class C26860b extends C87413o implements C32224a<C26848g> {

        /* renamed from: d */
        public final /* synthetic */ C26858l f74703d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C26860b(C26858l lVar) {
            super(0);
            this.f74703d = lVar;
        }

        public Object invoke() {
            String Z = C26858l.m35513Z(this.f74703d, "appattach");
            C26858l.m35512Y(this.f74703d, Z, C101656f.C101658b.Start);
            C101656f fVar = this.f74703d.f74694s;
            if (fVar == null) {
                C87412m.m108603p("__xmlParser__");
                throw null;
            } else if (!fVar.mo141123b().containsKey(Z)) {
                return this.f74703d.f74693r.f74684p;
            } else {
                C26858l lVar = this.f74703d;
                C101656f fVar2 = lVar.f74694s;
                if (fVar2 != null) {
                    return new C26850i(fVar2, lVar.mo53891a0("appattach"));
                }
                C87412m.m108603p("__xmlParser__");
                throw null;
            }
        }
    }

    /* renamed from: cc3.l$c */
    public static final class C26861c extends C87413o implements C32224a<String> {

        /* renamed from: d */
        public final /* synthetic */ C26858l f74704d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C26861c(C26858l lVar) {
            super(0);
            this.f74704d = lVar;
        }

        public Object invoke() {
            String Z = C26858l.m35513Z(this.f74704d, "appid");
            C26858l.m35512Y(this.f74704d, Z, C101656f.C101658b.Text);
            C101656f fVar = this.f74704d.f74694s;
            if (fVar != null) {
                C26858l lVar = this.f74704d;
                String y = lVar.mo141117y(fVar.mo141123b().get(Z), lVar.f74693r.f74635f);
                return y != null ? y : this.f74704d.f74693r.f74635f;
            }
            C87412m.m108603p("__xmlParser__");
            throw null;
        }
    }

    /* renamed from: cc3.l$d */
    public static final class C26862d extends C87413o implements C32224a<String> {

        /* renamed from: d */
        public final /* synthetic */ C26858l f74705d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C26862d(C26858l lVar) {
            super(0);
            this.f74705d = lVar;
        }

        public Object invoke() {
            String Z = C26858l.m35513Z(this.f74705d, "content");
            C26858l.m35512Y(this.f74705d, Z, C101656f.C101658b.Text);
            C101656f fVar = this.f74705d.f74694s;
            if (fVar != null) {
                C26858l lVar = this.f74705d;
                String y = lVar.mo141117y(fVar.mo141123b().get(Z), lVar.f74693r.f74643n);
                return y != null ? y : this.f74705d.f74693r.f74643n;
            }
            C87412m.m108603p("__xmlParser__");
            throw null;
        }
    }

    /* renamed from: cc3.l$e */
    public static final class C26863e extends C87413o implements C32224a<String> {

        /* renamed from: d */
        public final /* synthetic */ C26858l f74706d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C26863e(C26858l lVar) {
            super(0);
            this.f74706d = lVar;
        }

        public Object invoke() {
            String Z = C26858l.m35513Z(this.f74706d, "des");
            C26858l.m35512Y(this.f74706d, Z, C101656f.C101658b.Text);
            C101656f fVar = this.f74706d.f74694s;
            if (fVar != null) {
                C26858l lVar = this.f74706d;
                String y = lVar.mo141117y(fVar.mo141123b().get(Z), lVar.f74693r.f74638i);
                return y != null ? y : this.f74706d.f74693r.f74638i;
            }
            C87412m.m108603p("__xmlParser__");
            throw null;
        }
    }

    /* renamed from: cc3.l$f */
    public static final class C26864f extends C87413o implements C32224a<Integer> {

        /* renamed from: d */
        public final /* synthetic */ C26858l f74707d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C26864f(C26858l lVar) {
            super(0);
            this.f74707d = lVar;
        }

        public Object invoke() {
            String Z = C26858l.m35513Z(this.f74707d, "sdkver");
            C26858l.m35512Y(this.f74707d, Z, C101656f.C101658b.Text);
            C101656f fVar = this.f74707d.f74694s;
            if (fVar != null) {
                C26858l lVar = this.f74707d;
                Integer w = lVar.mo141115w(fVar.mo141123b().get(Z), Integer.valueOf(lVar.f74693r.f74636g));
                return Integer.valueOf(w != null ? w.intValue() : this.f74707d.f74693r.f74636g);
            }
            C87412m.m108603p("__xmlParser__");
            throw null;
        }
    }

    /* renamed from: cc3.l$g */
    public static final class C26865g extends C87413o implements C32224a<Integer> {

        /* renamed from: d */
        public final /* synthetic */ C26858l f74708d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C26865g(C26858l lVar) {
            super(0);
            this.f74708d = lVar;
        }

        public Object invoke() {
            String Z = C26858l.m35513Z(this.f74708d, "showtype");
            C26858l.m35512Y(this.f74708d, Z, C101656f.C101658b.Text);
            C101656f fVar = this.f74708d.f74694s;
            if (fVar != null) {
                C26858l lVar = this.f74708d;
                Integer w = lVar.mo141115w(fVar.mo141123b().get(Z), Integer.valueOf(lVar.f74693r.f74642m));
                return Integer.valueOf(w != null ? w.intValue() : this.f74708d.f74693r.f74642m);
            }
            C87412m.m108603p("__xmlParser__");
            throw null;
        }
    }

    /* renamed from: cc3.l$h */
    public static final class C26866h extends C87413o implements C32224a<String> {

        /* renamed from: d */
        public final /* synthetic */ C26858l f74709d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C26866h(C26858l lVar) {
            super(0);
            this.f74709d = lVar;
        }

        public Object invoke() {
            String Z = C26858l.m35513Z(this.f74709d, "thumburl");
            C26858l.m35512Y(this.f74709d, Z, C101656f.C101658b.Text);
            C101656f fVar = this.f74709d.f74694s;
            if (fVar != null) {
                C26858l lVar = this.f74709d;
                String y = lVar.mo141117y(fVar.mo141123b().get(Z), lVar.f74693r.f74685q);
                return y != null ? y : this.f74709d.f74693r.f74685q;
            }
            C87412m.m108603p("__xmlParser__");
            throw null;
        }
    }

    /* renamed from: cc3.l$i */
    public static final class C26867i extends C87413o implements C32224a<String> {

        /* renamed from: d */
        public final /* synthetic */ C26858l f74710d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C26867i(C26858l lVar) {
            super(0);
            this.f74710d = lVar;
        }

        public Object invoke() {
            String Z = C26858l.m35513Z(this.f74710d, FFmpegMetadataRetriever.METADATA_KEY_TITLE);
            C26858l.m35512Y(this.f74710d, Z, C101656f.C101658b.Text);
            C101656f fVar = this.f74710d.f74694s;
            if (fVar != null) {
                C26858l lVar = this.f74710d;
                String y = lVar.mo141117y(fVar.mo141123b().get(Z), lVar.f74693r.f74637h);
                return y != null ? y : this.f74710d.f74693r.f74637h;
            }
            C87412m.m108603p("__xmlParser__");
            throw null;
        }
    }

    /* renamed from: cc3.l$j */
    public static final class C26868j extends C87413o implements C32224a<Integer> {

        /* renamed from: d */
        public final /* synthetic */ C26858l f74711d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C26868j(C26858l lVar) {
            super(0);
            this.f74711d = lVar;
        }

        public Object invoke() {
            String Z = C26858l.m35513Z(this.f74711d, "type");
            C26858l.m35512Y(this.f74711d, Z, C101656f.C101658b.Text);
            C101656f fVar = this.f74711d.f74694s;
            if (fVar != null) {
                C26858l lVar = this.f74711d;
                Integer w = lVar.mo141115w(fVar.mo141123b().get(Z), Integer.valueOf(lVar.f74693r.f74641l));
                return Integer.valueOf(w != null ? w.intValue() : this.f74711d.f74693r.f74641l);
            }
            C87412m.m108603p("__xmlParser__");
            throw null;
        }
    }

    /* renamed from: cc3.l$k */
    public static final class C26869k extends C87413o implements C32224a<String> {

        /* renamed from: d */
        public final /* synthetic */ C26858l f74712d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C26869k(C26858l lVar) {
            super(0);
            this.f74712d = lVar;
        }

        public Object invoke() {
            String Z = C26858l.m35513Z(this.f74712d, "url");
            C26858l.m35512Y(this.f74712d, Z, C101656f.C101658b.Text);
            C101656f fVar = this.f74712d.f74694s;
            if (fVar != null) {
                C26858l lVar = this.f74712d;
                String y = lVar.mo141117y(fVar.mo141123b().get(Z), lVar.f74693r.f74644o);
                return y != null ? y : this.f74712d.f74693r.f74644o;
            }
            C87412m.m108603p("__xmlParser__");
            throw null;
        }
    }

    /* renamed from: cc3.l$l */
    public static final class C26870l extends C87413o implements C32224a<String> {

        /* renamed from: d */
        public final /* synthetic */ C26858l f74713d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C26870l(C26858l lVar) {
            super(0);
            this.f74713d = lVar;
        }

        public Object invoke() {
            String Z = C26858l.m35513Z(this.f74713d, "username");
            C26858l.m35512Y(this.f74713d, Z, C101656f.C101658b.Text);
            C101656f fVar = this.f74713d.f74694s;
            if (fVar != null) {
                C26858l lVar = this.f74713d;
                String y = lVar.mo141117y(fVar.mo141123b().get(Z), lVar.f74693r.f74639j);
                return y != null ? y : this.f74713d.f74693r.f74639j;
            }
            C87412m.m108603p("__xmlParser__");
            throw null;
        }
    }

    public C26858l(C101656f fVar, String str) {
        C87412m.m108594g(fVar, "__xmlParser__");
        C87412m.m108594g(str, "__xmlPrefixTag__");
        C13602i iVar = C13602i.SYNCHRONIZED;
        this.f74697v = C36568h.m40986b(iVar, new C26861c(this));
        this.f74698w = C36568h.m40986b(iVar, new C26864f(this));
        this.f74699x = C36568h.m40986b(iVar, new C26867i(this));
        this.f74700y = C36568h.m40986b(iVar, new C26863e(this));
        this.f74701z = C36568h.m40986b(iVar, new C26870l(this));
        this.f74686A = C36568h.m40986b(iVar, new C26859a(this));
        this.f74687B = C36568h.m40986b(iVar, new C26868j(this));
        this.f74688C = C36568h.m40986b(iVar, new C26865g(this));
        this.f74689D = C36568h.m40986b(iVar, new C26862d(this));
        this.f74690E = C36568h.m40986b(iVar, new C26869k(this));
        this.f74691F = C36568h.m40986b(iVar, new C26860b(this));
        this.f74692G = C36568h.m40986b(iVar, new C26866h(this));
        this.f74694s = fVar;
        this.f74695t = str;
    }

    /* renamed from: Y */
    public static final void m35512Y(C26858l lVar, String str, C101656f.C101658b bVar) {
        C101656f fVar = lVar.f74694s;
        if (fVar == null) {
            C87412m.m108603p("__xmlParser__");
            throw null;
        } else if (!fVar.mo141123b().containsKey(str) && lVar.f74696u != C101656f.C101657a.ParseEnd) {
            C101656f fVar2 = lVar.f74694s;
            if (fVar2 != null) {
                lVar.f74696u = fVar2.mo141125d(str, bVar);
            } else {
                C87412m.m108603p("__xmlParser__");
                throw null;
            }
        }
    }

    /* renamed from: Z */
    public static final String m35513Z(C26858l lVar, String str) {
        lVar.getClass();
        return '.' + lVar.mo53891a0(str);
    }

    /* renamed from: A */
    public String mo53864A() {
        return (String) this.f74686A.getValue();
    }

    /* renamed from: B */
    public String mo53865B() {
        return (String) this.f74697v.getValue();
    }

    /* renamed from: C */
    public String mo53866C() {
        return (String) this.f74689D.getValue();
    }

    /* renamed from: D */
    public String mo53867D() {
        return (String) this.f74700y.getValue();
    }

    /* renamed from: E */
    public int mo53868E() {
        return ((Number) this.f74698w.getValue()).intValue();
    }

    /* renamed from: F */
    public int mo53869F() {
        return ((Number) this.f74688C.getValue()).intValue();
    }

    /* renamed from: G */
    public String mo53870G() {
        return (String) this.f74699x.getValue();
    }

    /* renamed from: H */
    public int mo53871H() {
        return ((Number) this.f74687B.getValue()).intValue();
    }

    /* renamed from: I */
    public String mo53872I() {
        return (String) this.f74690E.getValue();
    }

    /* renamed from: J */
    public String mo53873J() {
        return (String) this.f74701z.getValue();
    }

    /* renamed from: K */
    public void mo53874K(String str) {
        C87412m.m108594g(str, "value");
    }

    /* renamed from: L */
    public void mo53875L(String str) {
        C87412m.m108594g(str, "value");
    }

    /* renamed from: M */
    public void mo53876M(String str) {
        C87412m.m108594g(str, "value");
    }

    /* renamed from: N */
    public void mo53877N(String str) {
        C87412m.m108594g(str, "value");
    }

    /* renamed from: O */
    public void mo53878O(int i) {
    }

    /* renamed from: P */
    public void mo53879P(int i) {
    }

    /* renamed from: Q */
    public void mo53880Q(String str) {
        C87412m.m108594g(str, "value");
    }

    /* renamed from: R */
    public void mo53881R(int i) {
    }

    /* renamed from: S */
    public void mo53882S(String str) {
        C87412m.m108594g(str, "value");
    }

    /* renamed from: T */
    public void mo53883T(String str) {
        C87412m.m108594g(str, "value");
    }

    /* renamed from: U */
    public C26848g mo53887U() {
        return (C26848g) this.f74691F.getValue();
    }

    /* renamed from: V */
    public String mo53888V() {
        return (String) this.f74692G.getValue();
    }

    /* renamed from: W */
    public void mo53889W(C26848g gVar) {
    }

    /* renamed from: X */
    public void mo53890X(String str) {
    }

    /* renamed from: a0 */
    public final String mo53891a0(String str) {
        String str2 = this.f74695t;
        if (str2 == null) {
            C87412m.m108603p("__xmlPrefixTag__");
            throw null;
        } else if (!(!C112551y.m153811k(str2))) {
            return String.valueOf(str);
        } else {
            StringBuilder sb = new StringBuilder();
            String str3 = this.f74695t;
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

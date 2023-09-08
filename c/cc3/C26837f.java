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

/* renamed from: cc3.f */
public final class C26837f extends C26835d {

    /* renamed from: A */
    public final C13601g f74645A;

    /* renamed from: B */
    public final C13601g f74646B;

    /* renamed from: C */
    public final C13601g f74647C;

    /* renamed from: p */
    public final C26835d f74648p = new C26835d();

    /* renamed from: q */
    public C101656f f74649q;

    /* renamed from: r */
    public String f74650r;

    /* renamed from: s */
    public C101656f.C101657a f74651s;

    /* renamed from: t */
    public final C13601g f74652t;

    /* renamed from: u */
    public final C13601g f74653u;

    /* renamed from: v */
    public final C13601g f74654v;

    /* renamed from: w */
    public final C13601g f74655w;

    /* renamed from: x */
    public final C13601g f74656x;

    /* renamed from: y */
    public final C13601g f74657y;

    /* renamed from: z */
    public final C13601g f74658z;

    /* renamed from: cc3.f$a */
    public static final class C26838a extends C87413o implements C32224a<String> {

        /* renamed from: d */
        public final /* synthetic */ C26837f f74659d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C26838a(C26837f fVar) {
            super(0);
            this.f74659d = fVar;
        }

        public Object invoke() {
            String V = C26837f.m35455V(this.f74659d, "action");
            C26837f.m35454U(this.f74659d, V, C101656f.C101658b.Text);
            C101656f fVar = this.f74659d.f74649q;
            if (fVar != null) {
                C26837f fVar2 = this.f74659d;
                String y = fVar2.mo141117y(fVar.mo141123b().get(V), fVar2.f74648p.f74640k);
                return y != null ? y : this.f74659d.f74648p.f74640k;
            }
            C87412m.m108603p("__xmlParser__");
            throw null;
        }
    }

    /* renamed from: cc3.f$b */
    public static final class C26839b extends C87413o implements C32224a<String> {

        /* renamed from: d */
        public final /* synthetic */ C26837f f74660d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C26839b(C26837f fVar) {
            super(0);
            this.f74660d = fVar;
        }

        public Object invoke() {
            String V = C26837f.m35455V(this.f74660d, "appid");
            C26837f.m35454U(this.f74660d, V, C101656f.C101658b.Text);
            C101656f fVar = this.f74660d.f74649q;
            if (fVar != null) {
                C26837f fVar2 = this.f74660d;
                String y = fVar2.mo141117y(fVar.mo141123b().get(V), fVar2.f74648p.f74635f);
                return y != null ? y : this.f74660d.f74648p.f74635f;
            }
            C87412m.m108603p("__xmlParser__");
            throw null;
        }
    }

    /* renamed from: cc3.f$c */
    public static final class C26840c extends C87413o implements C32224a<String> {

        /* renamed from: d */
        public final /* synthetic */ C26837f f74661d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C26840c(C26837f fVar) {
            super(0);
            this.f74661d = fVar;
        }

        public Object invoke() {
            String V = C26837f.m35455V(this.f74661d, "content");
            C26837f.m35454U(this.f74661d, V, C101656f.C101658b.Text);
            C101656f fVar = this.f74661d.f74649q;
            if (fVar != null) {
                C26837f fVar2 = this.f74661d;
                String y = fVar2.mo141117y(fVar.mo141123b().get(V), fVar2.f74648p.f74643n);
                return y != null ? y : this.f74661d.f74648p.f74643n;
            }
            C87412m.m108603p("__xmlParser__");
            throw null;
        }
    }

    /* renamed from: cc3.f$d */
    public static final class C26841d extends C87413o implements C32224a<String> {

        /* renamed from: d */
        public final /* synthetic */ C26837f f74662d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C26841d(C26837f fVar) {
            super(0);
            this.f74662d = fVar;
        }

        public Object invoke() {
            String V = C26837f.m35455V(this.f74662d, "des");
            C26837f.m35454U(this.f74662d, V, C101656f.C101658b.Text);
            C101656f fVar = this.f74662d.f74649q;
            if (fVar != null) {
                C26837f fVar2 = this.f74662d;
                String y = fVar2.mo141117y(fVar.mo141123b().get(V), fVar2.f74648p.f74638i);
                return y != null ? y : this.f74662d.f74648p.f74638i;
            }
            C87412m.m108603p("__xmlParser__");
            throw null;
        }
    }

    /* renamed from: cc3.f$e */
    public static final class C26842e extends C87413o implements C32224a<Integer> {

        /* renamed from: d */
        public final /* synthetic */ C26837f f74663d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C26842e(C26837f fVar) {
            super(0);
            this.f74663d = fVar;
        }

        public Object invoke() {
            String V = C26837f.m35455V(this.f74663d, "sdkver");
            C26837f.m35454U(this.f74663d, V, C101656f.C101658b.Text);
            C101656f fVar = this.f74663d.f74649q;
            if (fVar != null) {
                C26837f fVar2 = this.f74663d;
                Integer w = fVar2.mo141115w(fVar.mo141123b().get(V), Integer.valueOf(fVar2.f74648p.f74636g));
                return Integer.valueOf(w != null ? w.intValue() : this.f74663d.f74648p.f74636g);
            }
            C87412m.m108603p("__xmlParser__");
            throw null;
        }
    }

    /* renamed from: cc3.f$f */
    public static final class C26843f extends C87413o implements C32224a<Integer> {

        /* renamed from: d */
        public final /* synthetic */ C26837f f74664d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C26843f(C26837f fVar) {
            super(0);
            this.f74664d = fVar;
        }

        public Object invoke() {
            String V = C26837f.m35455V(this.f74664d, "showtype");
            C26837f.m35454U(this.f74664d, V, C101656f.C101658b.Text);
            C101656f fVar = this.f74664d.f74649q;
            if (fVar != null) {
                C26837f fVar2 = this.f74664d;
                Integer w = fVar2.mo141115w(fVar.mo141123b().get(V), Integer.valueOf(fVar2.f74648p.f74642m));
                return Integer.valueOf(w != null ? w.intValue() : this.f74664d.f74648p.f74642m);
            }
            C87412m.m108603p("__xmlParser__");
            throw null;
        }
    }

    /* renamed from: cc3.f$g */
    public static final class C26844g extends C87413o implements C32224a<String> {

        /* renamed from: d */
        public final /* synthetic */ C26837f f74665d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C26844g(C26837f fVar) {
            super(0);
            this.f74665d = fVar;
        }

        public Object invoke() {
            String V = C26837f.m35455V(this.f74665d, FFmpegMetadataRetriever.METADATA_KEY_TITLE);
            C26837f.m35454U(this.f74665d, V, C101656f.C101658b.Text);
            C101656f fVar = this.f74665d.f74649q;
            if (fVar != null) {
                C26837f fVar2 = this.f74665d;
                String y = fVar2.mo141117y(fVar.mo141123b().get(V), fVar2.f74648p.f74637h);
                return y != null ? y : this.f74665d.f74648p.f74637h;
            }
            C87412m.m108603p("__xmlParser__");
            throw null;
        }
    }

    /* renamed from: cc3.f$h */
    public static final class C26845h extends C87413o implements C32224a<Integer> {

        /* renamed from: d */
        public final /* synthetic */ C26837f f74666d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C26845h(C26837f fVar) {
            super(0);
            this.f74666d = fVar;
        }

        public Object invoke() {
            String V = C26837f.m35455V(this.f74666d, "type");
            C26837f.m35454U(this.f74666d, V, C101656f.C101658b.Text);
            C101656f fVar = this.f74666d.f74649q;
            if (fVar != null) {
                C26837f fVar2 = this.f74666d;
                Integer w = fVar2.mo141115w(fVar.mo141123b().get(V), Integer.valueOf(fVar2.f74648p.f74641l));
                return Integer.valueOf(w != null ? w.intValue() : this.f74666d.f74648p.f74641l);
            }
            C87412m.m108603p("__xmlParser__");
            throw null;
        }
    }

    /* renamed from: cc3.f$i */
    public static final class C26846i extends C87413o implements C32224a<String> {

        /* renamed from: d */
        public final /* synthetic */ C26837f f74667d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C26846i(C26837f fVar) {
            super(0);
            this.f74667d = fVar;
        }

        public Object invoke() {
            String V = C26837f.m35455V(this.f74667d, "url");
            C26837f.m35454U(this.f74667d, V, C101656f.C101658b.Text);
            C101656f fVar = this.f74667d.f74649q;
            if (fVar != null) {
                C26837f fVar2 = this.f74667d;
                String y = fVar2.mo141117y(fVar.mo141123b().get(V), fVar2.f74648p.f74644o);
                return y != null ? y : this.f74667d.f74648p.f74644o;
            }
            C87412m.m108603p("__xmlParser__");
            throw null;
        }
    }

    /* renamed from: cc3.f$j */
    public static final class C26847j extends C87413o implements C32224a<String> {

        /* renamed from: d */
        public final /* synthetic */ C26837f f74668d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C26847j(C26837f fVar) {
            super(0);
            this.f74668d = fVar;
        }

        public Object invoke() {
            String V = C26837f.m35455V(this.f74668d, "username");
            C26837f.m35454U(this.f74668d, V, C101656f.C101658b.Text);
            C101656f fVar = this.f74668d.f74649q;
            if (fVar != null) {
                C26837f fVar2 = this.f74668d;
                String y = fVar2.mo141117y(fVar.mo141123b().get(V), fVar2.f74648p.f74639j);
                return y != null ? y : this.f74668d.f74648p.f74639j;
            }
            C87412m.m108603p("__xmlParser__");
            throw null;
        }
    }

    public C26837f(C101656f fVar, String str) {
        C87412m.m108594g(fVar, "__xmlParser__");
        C87412m.m108594g(str, "__xmlPrefixTag__");
        C13602i iVar = C13602i.SYNCHRONIZED;
        this.f74652t = C36568h.m40986b(iVar, new C26839b(this));
        this.f74653u = C36568h.m40986b(iVar, new C26842e(this));
        this.f74654v = C36568h.m40986b(iVar, new C26844g(this));
        this.f74655w = C36568h.m40986b(iVar, new C26841d(this));
        this.f74656x = C36568h.m40986b(iVar, new C26847j(this));
        this.f74657y = C36568h.m40986b(iVar, new C26838a(this));
        this.f74658z = C36568h.m40986b(iVar, new C26845h(this));
        this.f74645A = C36568h.m40986b(iVar, new C26843f(this));
        this.f74646B = C36568h.m40986b(iVar, new C26840c(this));
        this.f74647C = C36568h.m40986b(iVar, new C26846i(this));
        this.f74649q = fVar;
        this.f74650r = str;
    }

    /* renamed from: U */
    public static final void m35454U(C26837f fVar, String str, C101656f.C101658b bVar) {
        C101656f fVar2 = fVar.f74649q;
        if (fVar2 == null) {
            C87412m.m108603p("__xmlParser__");
            throw null;
        } else if (!fVar2.mo141123b().containsKey(str) && fVar.f74651s != C101656f.C101657a.ParseEnd) {
            C101656f fVar3 = fVar.f74649q;
            if (fVar3 != null) {
                fVar.f74651s = fVar3.mo141125d(str, bVar);
            } else {
                C87412m.m108603p("__xmlParser__");
                throw null;
            }
        }
    }

    /* renamed from: V */
    public static final String m35455V(C26837f fVar, String str) {
        String str2;
        fVar.getClass();
        StringBuilder sb = new StringBuilder();
        sb.append('.');
        String str3 = fVar.f74650r;
        if (str3 != null) {
            if (!C112551y.m153811k(str3)) {
                StringBuilder sb4 = new StringBuilder();
                String str4 = fVar.f74650r;
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
    public String mo53864A() {
        return (String) this.f74657y.getValue();
    }

    /* renamed from: B */
    public String mo53865B() {
        return (String) this.f74652t.getValue();
    }

    /* renamed from: C */
    public String mo53866C() {
        return (String) this.f74646B.getValue();
    }

    /* renamed from: D */
    public String mo53867D() {
        return (String) this.f74655w.getValue();
    }

    /* renamed from: E */
    public int mo53868E() {
        return ((Number) this.f74653u.getValue()).intValue();
    }

    /* renamed from: F */
    public int mo53869F() {
        return ((Number) this.f74645A.getValue()).intValue();
    }

    /* renamed from: G */
    public String mo53870G() {
        return (String) this.f74654v.getValue();
    }

    /* renamed from: H */
    public int mo53871H() {
        return ((Number) this.f74658z.getValue()).intValue();
    }

    /* renamed from: I */
    public String mo53872I() {
        return (String) this.f74647C.getValue();
    }

    /* renamed from: J */
    public String mo53873J() {
        return (String) this.f74656x.getValue();
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
}

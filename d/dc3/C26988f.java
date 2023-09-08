package dc3;

import com.tencent.p014mm.plugin.mmsight.segment.FFmpegMetadataRetriever;
import fy3.C32224a;
import gy3.C87412m;
import gy3.C87413o;
import rx3.C13601g;
import rx3.C13602i;
import rx3.C36568h;
import sm2.C101656f;
import z04.C112551y;

/* renamed from: dc3.f */
public final class C26988f extends C26986d {

    /* renamed from: A */
    public final C13601g f75014A;

    /* renamed from: B */
    public final C13601g f75015B;

    /* renamed from: C */
    public final C13601g f75016C;

    /* renamed from: D */
    public final C13601g f75017D;

    /* renamed from: E */
    public final C13601g f75018E;

    /* renamed from: F */
    public final C13601g f75019F;

    /* renamed from: G */
    public final C13601g f75020G;

    /* renamed from: H */
    public final C13601g f75021H;

    /* renamed from: I */
    public final C13601g f75022I;

    /* renamed from: J */
    public final C13601g f75023J;

    /* renamed from: K */
    public final C13601g f75024K;

    /* renamed from: t */
    public final C26986d f75025t = new C26986d();

    /* renamed from: u */
    public C101656f f75026u;

    /* renamed from: v */
    public String f75027v;

    /* renamed from: w */
    public C101656f.C101657a f75028w;

    /* renamed from: x */
    public final C13601g f75029x;

    /* renamed from: y */
    public final C13601g f75030y;

    /* renamed from: z */
    public final C13601g f75031z;

    /* renamed from: dc3.f$a */
    public static final class C26989a extends C87413o implements C32224a<String> {

        /* renamed from: d */
        public final /* synthetic */ C26988f f75032d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C26989a(C26988f fVar) {
            super(0);
            this.f75032d = fVar;
        }

        public Object invoke() {
            String d0 = C26988f.m35993d0(this.f75032d, "action");
            C26988f.m35992c0(this.f75032d, d0, C101656f.C101658b.Text);
            C101656f fVar = this.f75032d.f75026u;
            if (fVar != null) {
                C26988f fVar2 = this.f75032d;
                String y = fVar2.mo141117y(fVar.mo141123b().get(d0), fVar2.f75025t.f74640k);
                return y != null ? y : this.f75032d.f75025t.f74640k;
            }
            C87412m.m108603p("__xmlParser__");
            throw null;
        }
    }

    /* renamed from: dc3.f$b */
    public static final class C26990b extends C87413o implements C32224a<C26975a> {

        /* renamed from: d */
        public final /* synthetic */ C26988f f75033d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C26990b(C26988f fVar) {
            super(0);
            this.f75033d = fVar;
        }

        public Object invoke() {
            String d0 = C26988f.m35993d0(this.f75033d, "appattach");
            C26988f.m35992c0(this.f75033d, d0, C101656f.C101658b.Start);
            C101656f fVar = this.f75033d.f75026u;
            if (fVar == null) {
                C87412m.m108603p("__xmlParser__");
                throw null;
            } else if (!fVar.mo141123b().containsKey(d0)) {
                return this.f75033d.f75025t.f75010p;
            } else {
                C26988f fVar2 = this.f75033d;
                C101656f fVar3 = fVar2.f75026u;
                if (fVar3 != null) {
                    return new C26977c(fVar3, fVar2.mo54464e0("appattach"));
                }
                C87412m.m108603p("__xmlParser__");
                throw null;
            }
        }
    }

    /* renamed from: dc3.f$c */
    public static final class C26991c extends C87413o implements C32224a<String> {

        /* renamed from: d */
        public final /* synthetic */ C26988f f75034d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C26991c(C26988f fVar) {
            super(0);
            this.f75034d = fVar;
        }

        public Object invoke() {
            String d0 = C26988f.m35993d0(this.f75034d, "appid");
            C26988f.m35992c0(this.f75034d, d0, C101656f.C101658b.Text);
            C101656f fVar = this.f75034d.f75026u;
            if (fVar != null) {
                C26988f fVar2 = this.f75034d;
                String y = fVar2.mo141117y(fVar.mo141123b().get(d0), fVar2.f75025t.f74635f);
                return y != null ? y : this.f75034d.f75025t.f74635f;
            }
            C87412m.m108603p("__xmlParser__");
            throw null;
        }
    }

    /* renamed from: dc3.f$d */
    public static final class C26992d extends C87413o implements C32224a<String> {

        /* renamed from: d */
        public final /* synthetic */ C26988f f75035d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C26992d(C26988f fVar) {
            super(0);
            this.f75035d = fVar;
        }

        public Object invoke() {
            String d0 = C26988f.m35993d0(this.f75035d, "content");
            C26988f.m35992c0(this.f75035d, d0, C101656f.C101658b.Text);
            C101656f fVar = this.f75035d.f75026u;
            if (fVar != null) {
                C26988f fVar2 = this.f75035d;
                String y = fVar2.mo141117y(fVar.mo141123b().get(d0), fVar2.f75025t.f74643n);
                return y != null ? y : this.f75035d.f75025t.f74643n;
            }
            C87412m.m108603p("__xmlParser__");
            throw null;
        }
    }

    /* renamed from: dc3.f$e */
    public static final class C26993e extends C87413o implements C32224a<String> {

        /* renamed from: d */
        public final /* synthetic */ C26988f f75036d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C26993e(C26988f fVar) {
            super(0);
            this.f75036d = fVar;
        }

        public Object invoke() {
            String d0 = C26988f.m35993d0(this.f75036d, "des");
            C26988f.m35992c0(this.f75036d, d0, C101656f.C101658b.Text);
            C101656f fVar = this.f75036d.f75026u;
            if (fVar != null) {
                C26988f fVar2 = this.f75036d;
                String y = fVar2.mo141117y(fVar.mo141123b().get(d0), fVar2.f75025t.f74638i);
                return y != null ? y : this.f75036d.f75025t.f74638i;
            }
            C87412m.m108603p("__xmlParser__");
            throw null;
        }
    }

    /* renamed from: dc3.f$f */
    public static final class C26994f extends C87413o implements C32224a<Integer> {

        /* renamed from: d */
        public final /* synthetic */ C26988f f75037d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C26994f(C26988f fVar) {
            super(0);
            this.f75037d = fVar;
        }

        public Object invoke() {
            String d0 = C26988f.m35993d0(this.f75037d, "sdkver");
            C26988f.m35992c0(this.f75037d, d0, C101656f.C101658b.Text);
            C101656f fVar = this.f75037d.f75026u;
            if (fVar != null) {
                C26988f fVar2 = this.f75037d;
                Integer w = fVar2.mo141115w(fVar.mo141123b().get(d0), Integer.valueOf(fVar2.f75025t.f74636g));
                return Integer.valueOf(w != null ? w.intValue() : this.f75037d.f75025t.f74636g);
            }
            C87412m.m108603p("__xmlParser__");
            throw null;
        }
    }

    /* renamed from: dc3.f$g */
    public static final class C26995g extends C87413o implements C32224a<Integer> {

        /* renamed from: d */
        public final /* synthetic */ C26988f f75038d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C26995g(C26988f fVar) {
            super(0);
            this.f75038d = fVar;
        }

        public Object invoke() {
            String d0 = C26988f.m35993d0(this.f75038d, "showtype");
            C26988f.m35992c0(this.f75038d, d0, C101656f.C101658b.Text);
            C101656f fVar = this.f75038d.f75026u;
            if (fVar != null) {
                C26988f fVar2 = this.f75038d;
                Integer w = fVar2.mo141115w(fVar.mo141123b().get(d0), Integer.valueOf(fVar2.f75025t.f74642m));
                return Integer.valueOf(w != null ? w.intValue() : this.f75038d.f75025t.f74642m);
            }
            C87412m.m108603p("__xmlParser__");
            throw null;
        }
    }

    /* renamed from: dc3.f$h */
    public static final class C26996h extends C87413o implements C32224a<String> {

        /* renamed from: d */
        public final /* synthetic */ C26988f f75039d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C26996h(C26988f fVar) {
            super(0);
            this.f75039d = fVar;
        }

        public Object invoke() {
            String d0 = C26988f.m35993d0(this.f75039d, "sourcedisplayname");
            C26988f.m35992c0(this.f75039d, d0, C101656f.C101658b.Text);
            C101656f fVar = this.f75039d.f75026u;
            if (fVar != null) {
                C26988f fVar2 = this.f75039d;
                String y = fVar2.mo141117y(fVar.mo141123b().get(d0), fVar2.f75025t.f75011q);
                return y != null ? y : this.f75039d.f75025t.f75011q;
            }
            C87412m.m108603p("__xmlParser__");
            throw null;
        }
    }

    /* renamed from: dc3.f$i */
    public static final class C26997i extends C87413o implements C32224a<String> {

        /* renamed from: d */
        public final /* synthetic */ C26988f f75040d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C26997i(C26988f fVar) {
            super(0);
            this.f75040d = fVar;
        }

        public Object invoke() {
            String d0 = C26988f.m35993d0(this.f75040d, "thumburl");
            C26988f.m35992c0(this.f75040d, d0, C101656f.C101658b.Text);
            C101656f fVar = this.f75040d.f75026u;
            if (fVar != null) {
                C26988f fVar2 = this.f75040d;
                String y = fVar2.mo141117y(fVar.mo141123b().get(d0), fVar2.f75025t.f75012r);
                return y != null ? y : this.f75040d.f75025t.f75012r;
            }
            C87412m.m108603p("__xmlParser__");
            throw null;
        }
    }

    /* renamed from: dc3.f$j */
    public static final class C26998j extends C87413o implements C32224a<String> {

        /* renamed from: d */
        public final /* synthetic */ C26988f f75041d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C26998j(C26988f fVar) {
            super(0);
            this.f75041d = fVar;
        }

        public Object invoke() {
            String d0 = C26988f.m35993d0(this.f75041d, FFmpegMetadataRetriever.METADATA_KEY_TITLE);
            C26988f.m35992c0(this.f75041d, d0, C101656f.C101658b.Text);
            C101656f fVar = this.f75041d.f75026u;
            if (fVar != null) {
                C26988f fVar2 = this.f75041d;
                String y = fVar2.mo141117y(fVar.mo141123b().get(d0), fVar2.f75025t.f74637h);
                return y != null ? y : this.f75041d.f75025t.f74637h;
            }
            C87412m.m108603p("__xmlParser__");
            throw null;
        }
    }

    /* renamed from: dc3.f$k */
    public static final class C26999k extends C87413o implements C32224a<Integer> {

        /* renamed from: d */
        public final /* synthetic */ C26988f f75042d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C26999k(C26988f fVar) {
            super(0);
            this.f75042d = fVar;
        }

        public Object invoke() {
            String d0 = C26988f.m35993d0(this.f75042d, "type");
            C26988f.m35992c0(this.f75042d, d0, C101656f.C101658b.Text);
            C101656f fVar = this.f75042d.f75026u;
            if (fVar != null) {
                C26988f fVar2 = this.f75042d;
                Integer w = fVar2.mo141115w(fVar.mo141123b().get(d0), Integer.valueOf(fVar2.f75025t.f74641l));
                return Integer.valueOf(w != null ? w.intValue() : this.f75042d.f75025t.f74641l);
            }
            C87412m.m108603p("__xmlParser__");
            throw null;
        }
    }

    /* renamed from: dc3.f$l */
    public static final class C27000l extends C87413o implements C32224a<String> {

        /* renamed from: d */
        public final /* synthetic */ C26988f f75043d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C27000l(C26988f fVar) {
            super(0);
            this.f75043d = fVar;
        }

        public Object invoke() {
            String d0 = C26988f.m35993d0(this.f75043d, "url");
            C26988f.m35992c0(this.f75043d, d0, C101656f.C101658b.Text);
            C101656f fVar = this.f75043d.f75026u;
            if (fVar != null) {
                C26988f fVar2 = this.f75043d;
                String y = fVar2.mo141117y(fVar.mo141123b().get(d0), fVar2.f75025t.f74644o);
                return y != null ? y : this.f75043d.f75025t.f74644o;
            }
            C87412m.m108603p("__xmlParser__");
            throw null;
        }
    }

    /* renamed from: dc3.f$m */
    public static final class C27001m extends C87413o implements C32224a<String> {

        /* renamed from: d */
        public final /* synthetic */ C26988f f75044d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C27001m(C26988f fVar) {
            super(0);
            this.f75044d = fVar;
        }

        public Object invoke() {
            String d0 = C26988f.m35993d0(this.f75044d, "username");
            C26988f.m35992c0(this.f75044d, d0, C101656f.C101658b.Text);
            C101656f fVar = this.f75044d.f75026u;
            if (fVar != null) {
                C26988f fVar2 = this.f75044d;
                String y = fVar2.mo141117y(fVar.mo141123b().get(d0), fVar2.f75025t.f74639j);
                return y != null ? y : this.f75044d.f75025t.f74639j;
            }
            C87412m.m108603p("__xmlParser__");
            throw null;
        }
    }

    /* renamed from: dc3.f$n */
    public static final class C27002n extends C87413o implements C32224a<C27003g> {

        /* renamed from: d */
        public final /* synthetic */ C26988f f75045d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C27002n(C26988f fVar) {
            super(0);
            this.f75045d = fVar;
        }

        public Object invoke() {
            String d0 = C26988f.m35993d0(this.f75045d, "weappinfo");
            C26988f.m35992c0(this.f75045d, d0, C101656f.C101658b.Start);
            C101656f fVar = this.f75045d.f75026u;
            if (fVar == null) {
                C87412m.m108603p("__xmlParser__");
                throw null;
            } else if (!fVar.mo141123b().containsKey(d0)) {
                return this.f75045d.f75025t.f75013s;
            } else {
                C26988f fVar2 = this.f75045d;
                C101656f fVar3 = fVar2.f75026u;
                if (fVar3 != null) {
                    return new C27005i(fVar3, fVar2.mo54464e0("weappinfo"));
                }
                C87412m.m108603p("__xmlParser__");
                throw null;
            }
        }
    }

    public C26988f(C101656f fVar, String str) {
        C87412m.m108594g(fVar, "__xmlParser__");
        C87412m.m108594g(str, "__xmlPrefixTag__");
        C13602i iVar = C13602i.SYNCHRONIZED;
        this.f75029x = C36568h.m40986b(iVar, new C26991c(this));
        this.f75030y = C36568h.m40986b(iVar, new C26994f(this));
        this.f75031z = C36568h.m40986b(iVar, new C26998j(this));
        this.f75014A = C36568h.m40986b(iVar, new C26993e(this));
        this.f75015B = C36568h.m40986b(iVar, new C27001m(this));
        this.f75016C = C36568h.m40986b(iVar, new C26989a(this));
        this.f75017D = C36568h.m40986b(iVar, new C26999k(this));
        this.f75018E = C36568h.m40986b(iVar, new C26995g(this));
        this.f75019F = C36568h.m40986b(iVar, new C26992d(this));
        this.f75020G = C36568h.m40986b(iVar, new C27000l(this));
        this.f75021H = C36568h.m40986b(iVar, new C26990b(this));
        this.f75022I = C36568h.m40986b(iVar, new C26996h(this));
        this.f75023J = C36568h.m40986b(iVar, new C26997i(this));
        this.f75024K = C36568h.m40986b(iVar, new C27002n(this));
        this.f75026u = fVar;
        this.f75027v = str;
    }

    /* renamed from: c0 */
    public static final void m35992c0(C26988f fVar, String str, C101656f.C101658b bVar) {
        C101656f fVar2 = fVar.f75026u;
        if (fVar2 == null) {
            C87412m.m108603p("__xmlParser__");
            throw null;
        } else if (!fVar2.mo141123b().containsKey(str) && fVar.f75028w != C101656f.C101657a.ParseEnd) {
            C101656f fVar3 = fVar.f75026u;
            if (fVar3 != null) {
                fVar.f75028w = fVar3.mo141125d(str, bVar);
            } else {
                C87412m.m108603p("__xmlParser__");
                throw null;
            }
        }
    }

    /* renamed from: d0 */
    public static final String m35993d0(C26988f fVar, String str) {
        fVar.getClass();
        return '.' + fVar.mo54464e0(str);
    }

    /* renamed from: A */
    public String mo53864A() {
        return (String) this.f75016C.getValue();
    }

    /* renamed from: B */
    public String mo53865B() {
        return (String) this.f75029x.getValue();
    }

    /* renamed from: C */
    public String mo53866C() {
        return (String) this.f75019F.getValue();
    }

    /* renamed from: D */
    public String mo53867D() {
        return (String) this.f75014A.getValue();
    }

    /* renamed from: E */
    public int mo53868E() {
        return ((Number) this.f75030y.getValue()).intValue();
    }

    /* renamed from: F */
    public int mo53869F() {
        return ((Number) this.f75018E.getValue()).intValue();
    }

    /* renamed from: G */
    public String mo53870G() {
        return (String) this.f75031z.getValue();
    }

    /* renamed from: H */
    public int mo53871H() {
        return ((Number) this.f75017D.getValue()).intValue();
    }

    /* renamed from: I */
    public String mo53872I() {
        return (String) this.f75020G.getValue();
    }

    /* renamed from: J */
    public String mo53873J() {
        return (String) this.f75015B.getValue();
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
    public C26975a mo54456U() {
        return (C26975a) this.f75021H.getValue();
    }

    /* renamed from: V */
    public String mo54457V() {
        return (String) this.f75022I.getValue();
    }

    /* renamed from: W */
    public String mo54458W() {
        return (String) this.f75023J.getValue();
    }

    /* renamed from: X */
    public C27003g mo54459X() {
        return (C27003g) this.f75024K.getValue();
    }

    /* renamed from: Y */
    public void mo54460Y(C26975a aVar) {
    }

    /* renamed from: Z */
    public void mo54461Z(String str) {
    }

    /* renamed from: a0 */
    public void mo54462a0(String str) {
    }

    /* renamed from: b0 */
    public void mo54463b0(C27003g gVar) {
    }

    /* renamed from: e0 */
    public final String mo54464e0(String str) {
        String str2 = this.f75027v;
        if (str2 == null) {
            C87412m.m108603p("__xmlPrefixTag__");
            throw null;
        } else if (!(!C112551y.m153811k(str2))) {
            return String.valueOf(str);
        } else {
            StringBuilder sb = new StringBuilder();
            String str3 = this.f75027v;
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

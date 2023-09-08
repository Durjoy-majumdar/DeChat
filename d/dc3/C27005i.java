package dc3;

import com.google.android.gms.dynamite.ProviderConstants;
import fy3.C32224a;
import gy3.C87412m;
import gy3.C87413o;
import rx3.C13601g;
import rx3.C13602i;
import rx3.C36568h;
import sm2.C101656f;
import z04.C112551y;

/* renamed from: dc3.i */
public final class C27005i extends C27003g {

    /* renamed from: l */
    public final C27003g f75052l = new C27003g();

    /* renamed from: m */
    public C101656f f75053m;

    /* renamed from: n */
    public String f75054n;

    /* renamed from: o */
    public C101656f.C101657a f75055o;

    /* renamed from: p */
    public final C13601g f75056p;

    /* renamed from: q */
    public final C13601g f75057q;

    /* renamed from: r */
    public final C13601g f75058r;

    /* renamed from: s */
    public final C13601g f75059s;

    /* renamed from: t */
    public final C13601g f75060t;

    /* renamed from: u */
    public final C13601g f75061u;

    /* renamed from: dc3.i$a */
    public static final class C27006a extends C87413o implements C32224a<String> {

        /* renamed from: d */
        public final /* synthetic */ C27005i f75062d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C27006a(C27005i iVar) {
            super(0);
            this.f75062d = iVar;
        }

        public Object invoke() {
            String N = C27005i.m36045N(this.f75062d, "appid");
            C27005i.m36044M(this.f75062d, N, C101656f.C101658b.Text);
            C101656f fVar = this.f75062d.f75053m;
            if (fVar != null) {
                C27005i iVar = this.f75062d;
                String y = iVar.mo141117y(fVar.mo141123b().get(N), iVar.f75052l.f75047g);
                return y != null ? y : this.f75062d.f75052l.f75047g;
            }
            C87412m.m108603p("__xmlParser__");
            throw null;
        }
    }

    /* renamed from: dc3.i$b */
    public static final class C27007b extends C87413o implements C32224a<String> {

        /* renamed from: d */
        public final /* synthetic */ C27005i f75063d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C27007b(C27005i iVar) {
            super(0);
            this.f75063d = iVar;
        }

        public Object invoke() {
            String N = C27005i.m36045N(this.f75063d, "pagepath");
            C27005i.m36044M(this.f75063d, N, C101656f.C101658b.Text);
            C101656f fVar = this.f75063d.f75053m;
            if (fVar != null) {
                C27005i iVar = this.f75063d;
                String y = iVar.mo141117y(fVar.mo141123b().get(N), iVar.f75052l.f75051k);
                return y != null ? y : this.f75063d.f75052l.f75051k;
            }
            C87412m.m108603p("__xmlParser__");
            throw null;
        }
    }

    /* renamed from: dc3.i$c */
    public static final class C27008c extends C87413o implements C32224a<Integer> {

        /* renamed from: d */
        public final /* synthetic */ C27005i f75064d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C27008c(C27005i iVar) {
            super(0);
            this.f75064d = iVar;
        }

        public Object invoke() {
            String N = C27005i.m36045N(this.f75064d, "type");
            C27005i.m36044M(this.f75064d, N, C101656f.C101658b.Text);
            C101656f fVar = this.f75064d.f75053m;
            if (fVar != null) {
                C27005i iVar = this.f75064d;
                Integer w = iVar.mo141115w(fVar.mo141123b().get(N), Integer.valueOf(iVar.f75052l.f75048h));
                return Integer.valueOf(w != null ? w.intValue() : this.f75064d.f75052l.f75048h);
            }
            C87412m.m108603p("__xmlParser__");
            throw null;
        }
    }

    /* renamed from: dc3.i$d */
    public static final class C27009d extends C87413o implements C32224a<String> {

        /* renamed from: d */
        public final /* synthetic */ C27005i f75065d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C27009d(C27005i iVar) {
            super(0);
            this.f75065d = iVar;
        }

        public Object invoke() {
            String N = C27005i.m36045N(this.f75065d, "username");
            C27005i.m36044M(this.f75065d, N, C101656f.C101658b.Text);
            C101656f fVar = this.f75065d.f75053m;
            if (fVar != null) {
                C27005i iVar = this.f75065d;
                String y = iVar.mo141117y(fVar.mo141123b().get(N), iVar.f75052l.f75046f);
                return y != null ? y : this.f75065d.f75052l.f75046f;
            }
            C87412m.m108603p("__xmlParser__");
            throw null;
        }
    }

    /* renamed from: dc3.i$e */
    public static final class C27010e extends C87413o implements C32224a<Integer> {

        /* renamed from: d */
        public final /* synthetic */ C27005i f75066d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C27010e(C27005i iVar) {
            super(0);
            this.f75066d = iVar;
        }

        public Object invoke() {
            String N = C27005i.m36045N(this.f75066d, ProviderConstants.API_COLNAME_FEATURE_VERSION);
            C27005i.m36044M(this.f75066d, N, C101656f.C101658b.Text);
            C101656f fVar = this.f75066d.f75053m;
            if (fVar != null) {
                C27005i iVar = this.f75066d;
                Integer w = iVar.mo141115w(fVar.mo141123b().get(N), Integer.valueOf(iVar.f75052l.f75049i));
                return Integer.valueOf(w != null ? w.intValue() : this.f75066d.f75052l.f75049i);
            }
            C87412m.m108603p("__xmlParser__");
            throw null;
        }
    }

    /* renamed from: dc3.i$f */
    public static final class C27011f extends C87413o implements C32224a<String> {

        /* renamed from: d */
        public final /* synthetic */ C27005i f75067d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C27011f(C27005i iVar) {
            super(0);
            this.f75067d = iVar;
        }

        public Object invoke() {
            String N = C27005i.m36045N(this.f75067d, "weappiconurl");
            C27005i.m36044M(this.f75067d, N, C101656f.C101658b.Text);
            C101656f fVar = this.f75067d.f75053m;
            if (fVar != null) {
                C27005i iVar = this.f75067d;
                String y = iVar.mo141117y(fVar.mo141123b().get(N), iVar.f75052l.f75050j);
                return y != null ? y : this.f75067d.f75052l.f75050j;
            }
            C87412m.m108603p("__xmlParser__");
            throw null;
        }
    }

    public C27005i(C101656f fVar, String str) {
        C87412m.m108594g(fVar, "__xmlParser__");
        C87412m.m108594g(str, "__xmlPrefixTag__");
        C13602i iVar = C13602i.SYNCHRONIZED;
        this.f75056p = C36568h.m40986b(iVar, new C27009d(this));
        this.f75057q = C36568h.m40986b(iVar, new C27006a(this));
        this.f75058r = C36568h.m40986b(iVar, new C27008c(this));
        this.f75059s = C36568h.m40986b(iVar, new C27010e(this));
        this.f75060t = C36568h.m40986b(iVar, new C27011f(this));
        this.f75061u = C36568h.m40986b(iVar, new C27007b(this));
        this.f75053m = fVar;
        this.f75054n = str;
    }

    /* renamed from: M */
    public static final void m36044M(C27005i iVar, String str, C101656f.C101658b bVar) {
        C101656f fVar = iVar.f75053m;
        if (fVar == null) {
            C87412m.m108603p("__xmlParser__");
            throw null;
        } else if (!fVar.mo141123b().containsKey(str) && iVar.f75055o != C101656f.C101657a.ParseEnd) {
            C101656f fVar2 = iVar.f75053m;
            if (fVar2 != null) {
                iVar.f75055o = fVar2.mo141125d(str, bVar);
            } else {
                C87412m.m108603p("__xmlParser__");
                throw null;
            }
        }
    }

    /* renamed from: N */
    public static final String m36045N(C27005i iVar, String str) {
        String str2;
        iVar.getClass();
        StringBuilder sb = new StringBuilder();
        sb.append('.');
        String str3 = iVar.f75054n;
        if (str3 != null) {
            if (!C112551y.m153811k(str3)) {
                StringBuilder sb4 = new StringBuilder();
                String str4 = iVar.f75054n;
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
    public String mo54465A() {
        return (String) this.f75057q.getValue();
    }

    /* renamed from: B */
    public String mo54466B() {
        return (String) this.f75061u.getValue();
    }

    /* renamed from: C */
    public int mo54467C() {
        return ((Number) this.f75058r.getValue()).intValue();
    }

    /* renamed from: D */
    public String mo54468D() {
        return (String) this.f75056p.getValue();
    }

    /* renamed from: E */
    public int mo54469E() {
        return ((Number) this.f75059s.getValue()).intValue();
    }

    /* renamed from: F */
    public String mo54470F() {
        return (String) this.f75060t.getValue();
    }

    /* renamed from: G */
    public void mo54471G(String str) {
    }

    /* renamed from: H */
    public void mo54472H(String str) {
    }

    /* renamed from: I */
    public void mo54473I(int i) {
    }

    /* renamed from: J */
    public void mo54474J(String str) {
    }

    /* renamed from: K */
    public void mo54475K(int i) {
    }

    /* renamed from: L */
    public void mo54476L(String str) {
    }
}

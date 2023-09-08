package gc3;

import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import fy3.C32224a;
import gy3.C87412m;
import gy3.C87413o;
import rx3.C13601g;
import rx3.C13602i;
import rx3.C36568h;
import sm2.C101656f;
import z04.C112551y;

/* renamed from: gc3.d */
public final class C27086d extends C27084b {

    /* renamed from: i */
    public final C27084b f75313i = new C27084b();

    /* renamed from: j */
    public C101656f f75314j;

    /* renamed from: k */
    public String f75315k;

    /* renamed from: l */
    public C101656f.C101657a f75316l;

    /* renamed from: m */
    public final C13601g f75317m;

    /* renamed from: n */
    public final C13601g f75318n;

    /* renamed from: o */
    public final C13601g f75319o;

    /* renamed from: gc3.d$a */
    public static final class C27087a extends C87413o implements C32224a<Integer> {

        /* renamed from: d */
        public final /* synthetic */ C27086d f75320d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C27087a(C27086d dVar) {
            super(0);
            this.f75320d = dVar;
        }

        public Object invoke() {
            String H = C27086d.m36334H(this.f75320d, "cf");
            C27086d.m36333G(this.f75320d, H, C101656f.C101658b.Text);
            C101656f fVar = this.f75320d.f75314j;
            if (fVar != null) {
                C27086d dVar = this.f75320d;
                Integer w = dVar.mo141115w(fVar.mo141123b().get(H), Integer.valueOf(dVar.f75313i.f75310f));
                return Integer.valueOf(w != null ? w.intValue() : this.f75320d.f75313i.f75310f);
            }
            C87412m.m108603p("__xmlParser__");
            throw null;
        }
    }

    /* renamed from: gc3.d$b */
    public static final class C27088b extends C87413o implements C32224a<Integer> {

        /* renamed from: d */
        public final /* synthetic */ C27086d f75321d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C27088b(C27086d dVar) {
            super(0);
            this.f75321d = dVar;
        }

        public Object invoke() {
            String H = C27086d.m36334H(this.f75321d, LocaleUtil.FRENCH);
            C27086d.m36333G(this.f75321d, H, C101656f.C101658b.Text);
            C101656f fVar = this.f75321d.f75314j;
            if (fVar != null) {
                C27086d dVar = this.f75321d;
                Integer w = dVar.mo141115w(fVar.mo141123b().get(H), Integer.valueOf(dVar.f75313i.f75311g));
                return Integer.valueOf(w != null ? w.intValue() : this.f75321d.f75313i.f75311g);
            }
            C87412m.m108603p("__xmlParser__");
            throw null;
        }
    }

    /* renamed from: gc3.d$c */
    public static final class C27089c extends C87413o implements C32224a<String> {

        /* renamed from: d */
        public final /* synthetic */ C27086d f75322d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C27089c(C27086d dVar) {
            super(0);
            this.f75322d = dVar;
        }

        public Object invoke() {
            String H = C27086d.m36334H(this.f75322d, "inlenlist");
            C27086d.m36333G(this.f75322d, H, C101656f.C101658b.Text);
            C101656f fVar = this.f75322d.f75314j;
            if (fVar != null) {
                C27086d dVar = this.f75322d;
                String y = dVar.mo141117y(fVar.mo141123b().get(H), dVar.f75313i.f75312h);
                return y != null ? y : this.f75322d.f75313i.f75312h;
            }
            C87412m.m108603p("__xmlParser__");
            throw null;
        }
    }

    public C27086d(C101656f fVar, String str) {
        C87412m.m108594g(fVar, "__xmlParser__");
        C87412m.m108594g(str, "__xmlPrefixTag__");
        C13602i iVar = C13602i.SYNCHRONIZED;
        this.f75317m = C36568h.m40986b(iVar, new C27087a(this));
        this.f75318n = C36568h.m40986b(iVar, new C27088b(this));
        this.f75319o = C36568h.m40986b(iVar, new C27089c(this));
        this.f75314j = fVar;
        this.f75315k = str;
    }

    /* renamed from: G */
    public static final void m36333G(C27086d dVar, String str, C101656f.C101658b bVar) {
        C101656f fVar = dVar.f75314j;
        if (fVar == null) {
            C87412m.m108603p("__xmlParser__");
            throw null;
        } else if (!fVar.mo141123b().containsKey(str) && dVar.f75316l != C101656f.C101657a.ParseEnd) {
            C101656f fVar2 = dVar.f75314j;
            if (fVar2 != null) {
                dVar.f75316l = fVar2.mo141125d(str, bVar);
            } else {
                C87412m.m108603p("__xmlParser__");
                throw null;
            }
        }
    }

    /* renamed from: H */
    public static final String m36334H(C27086d dVar, String str) {
        String str2;
        dVar.getClass();
        StringBuilder sb = new StringBuilder();
        sb.append('.');
        String str3 = dVar.f75315k;
        if (str3 != null) {
            if (!C112551y.m153811k(str3)) {
                StringBuilder sb4 = new StringBuilder();
                String str4 = dVar.f75315k;
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
    public int mo54616A() {
        return ((Number) this.f75317m.getValue()).intValue();
    }

    /* renamed from: B */
    public int mo54617B() {
        return ((Number) this.f75318n.getValue()).intValue();
    }

    /* renamed from: C */
    public String mo54618C() {
        return (String) this.f75319o.getValue();
    }

    /* renamed from: D */
    public void mo54619D(int i) {
    }

    /* renamed from: E */
    public void mo54620E(int i) {
    }

    /* renamed from: F */
    public void mo54621F(String str) {
    }
}

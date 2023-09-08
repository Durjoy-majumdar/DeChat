package gc3;

import fy3.C32224a;
import gy3.C87412m;
import gy3.C87413o;
import rx3.C13601g;
import rx3.C13602i;
import rx3.C36568h;
import sm2.C101656f;
import z04.C112551y;

/* renamed from: gc3.g */
public final class C27092g extends C98101e {

    /* renamed from: h */
    public final C98101e f75329h = new C98101e();

    /* renamed from: i */
    public C101656f f75330i;

    /* renamed from: j */
    public String f75331j;

    /* renamed from: k */
    public C101656f.C101657a f75332k;

    /* renamed from: l */
    public final C13601g f75333l;

    /* renamed from: m */
    public final C13601g f75334m;

    /* renamed from: gc3.g$a */
    public static final class C27093a extends C87413o implements C32224a<String> {

        /* renamed from: d */
        public final /* synthetic */ C27092g f75335d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C27093a(C27092g gVar) {
            super(0);
            this.f75335d = gVar;
        }

        public Object invoke() {
            String F = C27092g.m36363F(this.f75335d, "md5");
            C27092g.m36362E(this.f75335d, F, C101656f.C101658b.Text);
            C101656f fVar = this.f75335d.f75330i;
            if (fVar != null) {
                C27092g gVar = this.f75335d;
                String y = gVar.mo141117y(fVar.mo141123b().get(F), gVar.f75329h.f287573g);
                return y != null ? y : this.f75335d.f75329h.f287573g;
            }
            C87412m.m108603p("__xmlParser__");
            throw null;
        }
    }

    /* renamed from: gc3.g$b */
    public static final class C27094b extends C87413o implements C32224a<String> {

        /* renamed from: d */
        public final /* synthetic */ C27092g f75336d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C27094b(C27092g gVar) {
            super(0);
            this.f75336d = gVar;
        }

        public Object invoke() {
            String F = C27092g.m36363F(this.f75336d, "searchquery");
            C27092g.m36362E(this.f75336d, F, C101656f.C101658b.Text);
            C101656f fVar = this.f75336d.f75330i;
            if (fVar != null) {
                C27092g gVar = this.f75336d;
                String y = gVar.mo141117y(fVar.mo141123b().get(F), gVar.f75329h.f287572f);
                return y != null ? y : this.f75336d.f75329h.f287572f;
            }
            C87412m.m108603p("__xmlParser__");
            throw null;
        }
    }

    public C27092g(C101656f fVar, String str) {
        C87412m.m108594g(fVar, "__xmlParser__");
        C87412m.m108594g(str, "__xmlPrefixTag__");
        C13602i iVar = C13602i.SYNCHRONIZED;
        this.f75333l = C36568h.m40986b(iVar, new C27094b(this));
        this.f75334m = C36568h.m40986b(iVar, new C27093a(this));
        this.f75330i = fVar;
        this.f75331j = str;
    }

    /* renamed from: E */
    public static final void m36362E(C27092g gVar, String str, C101656f.C101658b bVar) {
        C101656f fVar = gVar.f75330i;
        if (fVar == null) {
            C87412m.m108603p("__xmlParser__");
            throw null;
        } else if (!fVar.mo141123b().containsKey(str) && gVar.f75332k != C101656f.C101657a.ParseEnd) {
            C101656f fVar2 = gVar.f75330i;
            if (fVar2 != null) {
                gVar.f75332k = fVar2.mo141125d(str, bVar);
            } else {
                C87412m.m108603p("__xmlParser__");
                throw null;
            }
        }
    }

    /* renamed from: F */
    public static final String m36363F(C27092g gVar, String str) {
        String str2;
        gVar.getClass();
        StringBuilder sb = new StringBuilder();
        sb.append('.');
        String str3 = gVar.f75331j;
        if (str3 != null) {
            if (!C112551y.m153811k(str3)) {
                StringBuilder sb4 = new StringBuilder();
                String str4 = gVar.f75331j;
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
    public String mo54634A() {
        return (String) this.f75334m.getValue();
    }

    /* renamed from: B */
    public String mo54635B() {
        return (String) this.f75333l.getValue();
    }

    /* renamed from: C */
    public void mo54636C(String str) {
        C87412m.m108594g(str, "value");
    }

    /* renamed from: D */
    public void mo54637D(String str) {
        C87412m.m108594g(str, "value");
    }
}

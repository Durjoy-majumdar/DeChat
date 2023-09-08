package gc3;

import fy3.C32224a;
import gy3.C87412m;
import gy3.C87413o;
import rx3.C13601g;
import rx3.C13602i;
import rx3.C36568h;
import sm2.C101656f;
import z04.C112551y;

/* renamed from: gc3.d0 */
public final class C98099d0 extends C98097b0 {

    /* renamed from: g */
    public final C98097b0 f287566g = new C98097b0();

    /* renamed from: h */
    public C101656f f287567h;

    /* renamed from: i */
    public String f287568i;

    /* renamed from: j */
    public C101656f.C101657a f287569j;

    /* renamed from: k */
    public final C13601g f287570k = C36568h.m40986b(C13602i.SYNCHRONIZED, new C98100a(this));

    /* renamed from: gc3.d0$a */
    public static final class C98100a extends C87413o implements C32224a<String> {

        /* renamed from: d */
        public final /* synthetic */ C98099d0 f287571d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C98100a(C98099d0 d0Var) {
            super(0);
            this.f287571d = d0Var;
        }

        public Object invoke() {
            C98099d0 d0Var = this.f287571d;
            d0Var.getClass();
            StringBuilder sb = new StringBuilder();
            sb.append('.');
            String str = d0Var.f287568i;
            if (str != null) {
                String str2 = "publisher-id";
                if (!C112551y.m153811k(str)) {
                    StringBuilder sb4 = new StringBuilder();
                    String str3 = d0Var.f287568i;
                    if (str3 != null) {
                        sb4.append(str3);
                        sb4.append('.');
                        sb4.append(str2);
                        str2 = sb4.toString();
                    } else {
                        C87412m.m108603p("__xmlPrefixTag__");
                        throw null;
                    }
                }
                sb.append(str2);
                String sb5 = sb.toString();
                C98099d0 d0Var2 = this.f287571d;
                C101656f.C101658b bVar = C101656f.C101658b.Text;
                C101656f fVar = d0Var2.f287567h;
                if (fVar != null) {
                    if (!fVar.mo141123b().containsKey(sb5) && d0Var2.f287569j != C101656f.C101657a.ParseEnd) {
                        C101656f fVar2 = d0Var2.f287567h;
                        if (fVar2 != null) {
                            d0Var2.f287569j = fVar2.mo141125d(sb5, bVar);
                        } else {
                            C87412m.m108603p("__xmlParser__");
                            throw null;
                        }
                    }
                    C101656f fVar3 = this.f287571d.f287567h;
                    if (fVar3 != null) {
                        C98099d0 d0Var3 = this.f287571d;
                        String y = d0Var3.mo141117y(fVar3.mo141123b().get(sb5), d0Var3.f287566g.f287565f);
                        return y != null ? y : this.f287571d.f287566g.f287565f;
                    }
                    C87412m.m108603p("__xmlParser__");
                    throw null;
                }
                C87412m.m108603p("__xmlParser__");
                throw null;
            }
            C87412m.m108603p("__xmlPrefixTag__");
            throw null;
        }
    }

    public C98099d0(C101656f fVar, String str) {
        C87412m.m108594g(fVar, "__xmlParser__");
        C87412m.m108594g(str, "__xmlPrefixTag__");
        this.f287567h = fVar;
        this.f287568i = str;
    }

    /* renamed from: A */
    public String mo137396A() {
        return (String) this.f287570k.getValue();
    }

    /* renamed from: B */
    public void mo137397B(String str) {
        C87412m.m108594g(str, "value");
    }
}

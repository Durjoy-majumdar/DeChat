package gc3;

import fy3.C32224a;
import gy3.C87412m;
import gy3.C87413o;
import rx3.C13601g;
import rx3.C13602i;
import rx3.C36568h;
import sm2.C101656f;
import z04.C112551y;

/* renamed from: gc3.s */
public final class C27119s extends C27117q {

    /* renamed from: g */
    public final C27117q f75389g = new C27117q();

    /* renamed from: h */
    public C101656f f75390h;

    /* renamed from: i */
    public String f75391i;

    /* renamed from: j */
    public C101656f.C101657a f75392j;

    /* renamed from: k */
    public final C13601g f75393k = C36568h.m40986b(C13602i.SYNCHRONIZED, new C27120a(this));

    /* renamed from: gc3.s$a */
    public static final class C27120a extends C87413o implements C32224a<String> {

        /* renamed from: d */
        public final /* synthetic */ C27119s f75394d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C27120a(C27119s sVar) {
            super(0);
            this.f75394d = sVar;
        }

        public Object invoke() {
            C27119s sVar = this.f75394d;
            sVar.getClass();
            StringBuilder sb = new StringBuilder();
            sb.append('.');
            String str = sVar.f75391i;
            if (str != null) {
                String str2 = "sec-hash";
                if (!C112551y.m153811k(str)) {
                    StringBuilder sb4 = new StringBuilder();
                    String str3 = sVar.f75391i;
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
                C27119s sVar2 = this.f75394d;
                C101656f.C101658b bVar = C101656f.C101658b.Text;
                C101656f fVar = sVar2.f75390h;
                if (fVar != null) {
                    if (!fVar.mo141123b().containsKey(sb5) && sVar2.f75392j != C101656f.C101657a.ParseEnd) {
                        C101656f fVar2 = sVar2.f75390h;
                        if (fVar2 != null) {
                            sVar2.f75392j = fVar2.mo141125d(sb5, bVar);
                        } else {
                            C87412m.m108603p("__xmlParser__");
                            throw null;
                        }
                    }
                    C101656f fVar3 = this.f75394d.f75390h;
                    if (fVar3 != null) {
                        C27119s sVar3 = this.f75394d;
                        String y = sVar3.mo141117y(fVar3.mo141123b().get(sb5), sVar3.f75389g.f75388f);
                        return y != null ? y : this.f75394d.f75389g.f75388f;
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

    public C27119s(C101656f fVar, String str) {
        C87412m.m108594g(fVar, "__xmlParser__");
        C87412m.m108594g(str, "__xmlPrefixTag__");
        this.f75390h = fVar;
        this.f75391i = str;
    }

    /* renamed from: A */
    public String mo54656A() {
        return (String) this.f75393k.getValue();
    }

    /* renamed from: B */
    public void mo54657B(String str) {
        C87412m.m108594g(str, "value");
    }
}

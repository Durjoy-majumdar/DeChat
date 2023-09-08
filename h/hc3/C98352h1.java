package hc3;

import fy3.C32224a;
import gy3.C87412m;
import gy3.C87413o;
import rx3.C13601g;
import rx3.C13602i;
import rx3.C36568h;
import sm2.C101656f;
import z04.C112551y;

/* renamed from: hc3.h1 */
public final class C98352h1 extends C98347f1 {

    /* renamed from: g */
    public final C98347f1 f288312g = new C98347f1();

    /* renamed from: h */
    public C101656f f288313h;

    /* renamed from: i */
    public String f288314i;

    /* renamed from: j */
    public C101656f.C101657a f288315j;

    /* renamed from: k */
    public final C13601g f288316k = C36568h.m40986b(C13602i.SYNCHRONIZED, new C98353a(this));

    /* renamed from: hc3.h1$a */
    public static final class C98353a extends C87413o implements C32224a<C98343d> {

        /* renamed from: d */
        public final /* synthetic */ C98352h1 f288317d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C98353a(C98352h1 h1Var) {
            super(0);
            this.f288317d = h1Var;
        }

        public Object invoke() {
            C98352h1 h1Var = this.f288317d;
            h1Var.getClass();
            String str = '.' + h1Var.mo137666C("appmsg");
            C98352h1 h1Var2 = this.f288317d;
            C101656f.C101658b bVar = C101656f.C101658b.Start;
            C101656f fVar = h1Var2.f288313h;
            if (fVar != null) {
                if (!fVar.mo141123b().containsKey(str) && h1Var2.f288315j != C101656f.C101657a.ParseEnd) {
                    C101656f fVar2 = h1Var2.f288313h;
                    if (fVar2 != null) {
                        h1Var2.f288315j = fVar2.mo141125d(str, bVar);
                    } else {
                        C87412m.m108603p("__xmlParser__");
                        throw null;
                    }
                }
                C101656f fVar3 = this.f288317d.f288313h;
                if (fVar3 == null) {
                    C87412m.m108603p("__xmlParser__");
                    throw null;
                } else if (!fVar3.mo141123b().containsKey(str)) {
                    return this.f288317d.f288312g.f288296f;
                } else {
                    C98352h1 h1Var3 = this.f288317d;
                    C101656f fVar4 = h1Var3.f288313h;
                    if (fVar4 != null) {
                        return new C27226f(fVar4, h1Var3.mo137666C("appmsg"));
                    }
                    C87412m.m108603p("__xmlParser__");
                    throw null;
                }
            } else {
                C87412m.m108603p("__xmlParser__");
                throw null;
            }
        }
    }

    public C98352h1(C101656f fVar, String str) {
        C87412m.m108594g(fVar, "__xmlParser__");
        C87412m.m108594g(str, "__xmlPrefixTag__");
        this.f288313h = fVar;
        this.f288314i = str;
    }

    /* renamed from: A */
    public C98343d mo137664A() {
        return (C98343d) this.f288316k.getValue();
    }

    /* renamed from: B */
    public void mo137665B(C98343d dVar) {
    }

    /* renamed from: C */
    public final String mo137666C(String str) {
        String str2 = this.f288314i;
        if (str2 == null) {
            C87412m.m108603p("__xmlPrefixTag__");
            throw null;
        } else if (!(!C112551y.m153811k(str2))) {
            return String.valueOf(str);
        } else {
            StringBuilder sb = new StringBuilder();
            String str3 = this.f288314i;
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

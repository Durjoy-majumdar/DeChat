package hc3;

import fy3.C32224a;
import gy3.C87412m;
import gy3.C87413o;
import rx3.C13601g;
import rx3.C13602i;
import rx3.C36568h;
import sm2.C101656f;
import z04.C112551y;

/* renamed from: hc3.z1 */
public final class C98382z1 extends C98377x1 {

    /* renamed from: g */
    public final C98377x1 f288426g = new C98377x1();

    /* renamed from: h */
    public C101656f f288427h;

    /* renamed from: i */
    public String f288428i;

    /* renamed from: j */
    public C101656f.C101657a f288429j;

    /* renamed from: k */
    public final C13601g f288430k = C36568h.m40986b(C13602i.SYNCHRONIZED, new C98383a(this));

    /* renamed from: hc3.z1$a */
    public static final class C98383a extends C87413o implements C32224a<C98381z0> {

        /* renamed from: d */
        public final /* synthetic */ C98382z1 f288431d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C98383a(C98382z1 z1Var) {
            super(0);
            this.f288431d = z1Var;
        }

        public Object invoke() {
            C98382z1 z1Var = this.f288431d;
            z1Var.getClass();
            String str = '.' + z1Var.mo137670C("recordinfo");
            C98382z1 z1Var2 = this.f288431d;
            C101656f.C101658b bVar = C101656f.C101658b.Start;
            C101656f fVar = z1Var2.f288427h;
            if (fVar != null) {
                if (!fVar.mo141123b().containsKey(str) && z1Var2.f288429j != C101656f.C101657a.ParseEnd) {
                    C101656f fVar2 = z1Var2.f288427h;
                    if (fVar2 != null) {
                        z1Var2.f288429j = fVar2.mo141125d(str, bVar);
                    } else {
                        C87412m.m108603p("__xmlParser__");
                        throw null;
                    }
                }
                C101656f fVar3 = this.f288431d.f288427h;
                if (fVar3 == null) {
                    C87412m.m108603p("__xmlParser__");
                    throw null;
                } else if (!fVar3.mo141123b().containsKey(str)) {
                    return this.f288431d.f288426g.f288410f;
                } else {
                    C98382z1 z1Var3 = this.f288431d;
                    C101656f fVar4 = z1Var3.f288427h;
                    if (fVar4 != null) {
                        return new C27181b1(fVar4, z1Var3.mo137670C("recordinfo"));
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

    public C98382z1(C101656f fVar, String str) {
        C87412m.m108594g(fVar, "__xmlParser__");
        C87412m.m108594g(str, "__xmlPrefixTag__");
        this.f288427h = fVar;
        this.f288428i = str;
    }

    /* renamed from: A */
    public C98381z0 mo137667A() {
        return (C98381z0) this.f288430k.getValue();
    }

    /* renamed from: B */
    public void mo137668B(C98381z0 z0Var) {
    }

    /* renamed from: C */
    public final String mo137670C(String str) {
        String str2 = this.f288428i;
        if (str2 == null) {
            C87412m.m108603p("__xmlPrefixTag__");
            throw null;
        } else if (!(!C112551y.m153811k(str2))) {
            return String.valueOf(str);
        } else {
            StringBuilder sb = new StringBuilder();
            String str3 = this.f288428i;
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

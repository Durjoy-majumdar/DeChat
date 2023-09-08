package mh0;

import fy3.C32224a;
import gy3.C87412m;
import gy3.C87413o;
import java.util.ArrayList;
import rx3.C13601g;
import rx3.C13602i;
import rx3.C36568h;
import sm2.C101656f;
import z04.C112551y;

/* renamed from: mh0.p */
public final class C99891p extends C99889n {

    /* renamed from: g */
    public final C99889n f292695g = new C99889n();

    /* renamed from: h */
    public C101656f f292696h;

    /* renamed from: i */
    public String f292697i;

    /* renamed from: j */
    public C101656f.C101657a f292698j;

    /* renamed from: k */
    public final C13601g f292699k = C36568h.m40986b(C13602i.SYNCHRONIZED, new C99892a(this));

    /* renamed from: mh0.p$a */
    public static final class C99892a extends C87413o implements C32224a<ArrayList<C99893q>> {

        /* renamed from: d */
        public final /* synthetic */ C99891p f292700d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C99892a(C99891p pVar) {
            super(0);
            this.f292700d = pVar;
        }

        public Object invoke() {
            C99891p pVar = this.f292700d;
            pVar.getClass();
            StringBuilder sb = new StringBuilder();
            sb.append('.');
            String str = pVar.f292697i;
            if (str != null) {
                String str2 = "originmediainfolist";
                if (!C112551y.m153811k(str)) {
                    StringBuilder sb4 = new StringBuilder();
                    String str3 = pVar.f292697i;
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
                C99891p pVar2 = this.f292700d;
                C101656f.C101658b bVar = C101656f.C101658b.End;
                C101656f fVar = pVar2.f292696h;
                if (fVar != null) {
                    if (!fVar.mo141123b().containsKey(sb5) && pVar2.f292698j != C101656f.C101657a.ParseEnd) {
                        C101656f fVar2 = pVar2.f292696h;
                        if (fVar2 != null) {
                            pVar2.f292698j = fVar2.mo141125d(sb5, bVar);
                        } else {
                            C87412m.m108603p("__xmlParser__");
                            throw null;
                        }
                    }
                    ArrayList arrayList = new ArrayList();
                    Class<C99893q> cls = C99893q.class;
                    C99891p pVar3 = this.f292700d;
                    C101656f fVar3 = pVar3.f292696h;
                    if (fVar3 != null) {
                        pVar3.mo141107o(arrayList, cls, fVar3.mo141123b(), sb5, "orimediadataitem");
                        return arrayList.size() > 0 ? arrayList : this.f292700d.f292695g.f292694f;
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

    public C99891p(C101656f fVar, String str) {
        C87412m.m108594g(fVar, "__xmlParser__");
        C87412m.m108594g(str, "__xmlPrefixTag__");
        this.f292696h = fVar;
        this.f292697i = str;
    }

    /* renamed from: A */
    public ArrayList<C99893q> mo139238A() {
        return (ArrayList) this.f292699k.getValue();
    }

    /* renamed from: B */
    public void mo139239B(ArrayList<C99893q> arrayList) {
        C87412m.m108594g(arrayList, "value");
    }
}

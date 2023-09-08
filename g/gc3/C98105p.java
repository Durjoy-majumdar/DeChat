package gc3;

import fy3.C32224a;
import gy3.C87412m;
import gy3.C87413o;
import java.util.ArrayList;
import java.util.List;
import rx3.C13601g;
import rx3.C13602i;
import rx3.C36568h;
import sm2.C101656f;
import z04.C112551y;

/* renamed from: gc3.p */
public final class C98105p extends C98103n {

    /* renamed from: g */
    public final C98103n f287575g = new C98103n();

    /* renamed from: h */
    public C101656f f287576h;

    /* renamed from: i */
    public String f287577i;

    /* renamed from: j */
    public C101656f.C101657a f287578j;

    /* renamed from: k */
    public final C13601g f287579k = C36568h.m40986b(C13602i.SYNCHRONIZED, new C98106a(this));

    /* renamed from: gc3.p$a */
    public static final class C98106a extends C87413o implements C32224a<List<C98101e>> {

        /* renamed from: d */
        public final /* synthetic */ C98105p f287580d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C98106a(C98105p pVar) {
            super(0);
            this.f287580d = pVar;
        }

        public Object invoke() {
            C98105p pVar = this.f287580d;
            pVar.getClass();
            StringBuilder sb = new StringBuilder();
            sb.append('.');
            String str = pVar.f287577i;
            if (str != null) {
                String str2 = "emojilist";
                if (!C112551y.m153811k(str)) {
                    StringBuilder sb4 = new StringBuilder();
                    String str3 = pVar.f287577i;
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
                C98105p pVar2 = this.f287580d;
                C101656f.C101658b bVar = C101656f.C101658b.End;
                C101656f fVar = pVar2.f287576h;
                if (fVar != null) {
                    if (!fVar.mo141123b().containsKey(sb5) && pVar2.f287578j != C101656f.C101657a.ParseEnd) {
                        C101656f fVar2 = pVar2.f287576h;
                        if (fVar2 != null) {
                            pVar2.f287578j = fVar2.mo141125d(sb5, bVar);
                        } else {
                            C87412m.m108603p("__xmlParser__");
                            throw null;
                        }
                    }
                    ArrayList arrayList = new ArrayList();
                    Class<C98101e> cls = C98101e.class;
                    C98105p pVar3 = this.f287580d;
                    C101656f fVar3 = pVar3.f287576h;
                    if (fVar3 != null) {
                        pVar3.mo141107o(arrayList, cls, fVar3.mo141123b(), sb5, "emojiitem");
                        return arrayList.size() > 0 ? arrayList : this.f287580d.f287575g.f287574f;
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

    public C98105p(C101656f fVar, String str) {
        C87412m.m108594g(fVar, "__xmlParser__");
        C87412m.m108594g(str, "__xmlPrefixTag__");
        this.f287576h = fVar;
        this.f287577i = str;
    }

    /* renamed from: A */
    public List<C98101e> mo137398A() {
        return (List) this.f287579k.getValue();
    }

    /* renamed from: B */
    public void mo137399B(List<C98101e> list) {
        C87412m.m108594g(list, "value");
    }
}

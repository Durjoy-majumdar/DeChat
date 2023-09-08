package p434ig;

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

/* renamed from: ig.o */
public final class C98682o extends C98680m {

    /* renamed from: g */
    public final C98680m f289376g = new C98680m();

    /* renamed from: h */
    public C101656f f289377h;

    /* renamed from: i */
    public String f289378i;

    /* renamed from: j */
    public C101656f.C101657a f289379j;

    /* renamed from: k */
    public final C13601g f289380k = C36568h.m40986b(C13602i.SYNCHRONIZED, new C98683a(this));

    /* renamed from: ig.o$a */
    public static final class C98683a extends C87413o implements C32224a<List<C98672d>> {

        /* renamed from: d */
        public final /* synthetic */ C98682o f289381d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C98683a(C98682o oVar) {
            super(0);
            this.f289381d = oVar;
        }

        public Object invoke() {
            C98682o oVar = this.f289381d;
            oVar.getClass();
            StringBuilder sb = new StringBuilder();
            sb.append('.');
            String str = oVar.f289378i;
            if (str != null) {
                String str2 = "datalist";
                if (!C112551y.m153811k(str)) {
                    StringBuilder sb4 = new StringBuilder();
                    String str3 = oVar.f289378i;
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
                C98682o oVar2 = this.f289381d;
                C101656f.C101658b bVar = C101656f.C101658b.End;
                C101656f fVar = oVar2.f289377h;
                if (fVar != null) {
                    if (!fVar.mo141123b().containsKey(sb5) && oVar2.f289379j != C101656f.C101657a.ParseEnd) {
                        C101656f fVar2 = oVar2.f289377h;
                        if (fVar2 != null) {
                            oVar2.f289379j = fVar2.mo141125d(sb5, bVar);
                        } else {
                            C87412m.m108603p("__xmlParser__");
                            throw null;
                        }
                    }
                    ArrayList arrayList = new ArrayList();
                    Class<C98672d> cls = C98672d.class;
                    C98682o oVar3 = this.f289381d;
                    C101656f fVar3 = oVar3.f289377h;
                    if (fVar3 != null) {
                        oVar3.mo141107o(arrayList, cls, fVar3.mo141123b(), sb5, "dataitem");
                        return arrayList.size() > 0 ? arrayList : this.f289381d.f289376g.f289375f;
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

    public C98682o(C101656f fVar, String str) {
        C87412m.m108594g(fVar, "__xmlParser__");
        C87412m.m108594g(str, "__xmlPrefixTag__");
        this.f289377h = fVar;
        this.f289378i = str;
    }

    /* renamed from: A */
    public List<C98672d> mo138092A() {
        return (List) this.f289380k.getValue();
    }

    /* renamed from: B */
    public void mo138093B(List<C98672d> list) {
        C87412m.m108594g(list, "value");
    }
}

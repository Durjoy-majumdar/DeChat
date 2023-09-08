package bp3;

import com.tencent.p014mm.api.QueryImageData;
import com.tencent.p014mm.p136ui.gridviewheaders.C74763a;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import gy3.C87412m;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import p157gk.C59480d;
import p749xh.C66261f3;
import rx3.C13598b0;
import sx3.C110818d0;
import sx3.C64175a0;

/* renamed from: bp3.k */
public final class C54527k {

    /* renamed from: a */
    public static final C54527k f152883a = new C54527k();

    /* renamed from: a */
    public final void mo75391a(ArrayList<QueryImageData> arrayList, ArrayList<C59480d> arrayList2) {
        C59480d dVar;
        C87412m.m108594g(arrayList, C66261f3.COL_CUSTOMDATA);
        C87412m.m108594g(arrayList2, "customListData");
        if ((!arrayList2.isEmpty()) && C87412m.m108589b(((C59480d) C110818d0.m150923U(arrayList2)).f169959a, "BOTTOM")) {
            C64175a0.m75515w(arrayList2);
        }
        for (QueryImageData queryImageData : arrayList) {
            String d = C74763a.m89510e().mo103936d(new Date(queryImageData.f154724e), MMApplicationContext.getContext());
            if (d == null) {
                d = "";
            }
            Iterator<T> it = arrayList2.iterator();
            while (true) {
                if (!it.hasNext()) {
                    dVar = null;
                    break;
                }
                dVar = (C59480d) it.next();
                if (C87412m.m108589b(dVar.f169959a, d)) {
                    break;
                }
            }
            if (dVar == null) {
                ArrayList arrayList3 = new ArrayList();
                arrayList3.add(queryImageData);
                C13598b0 b0Var = C13598b0.f38549a;
                arrayList2.add(new C59480d(d, arrayList3));
            } else if (dVar.f169960b.size() > 0) {
                int indexOf = arrayList2.indexOf(dVar);
                arrayList2.remove(indexOf);
                String str = dVar.f169959a;
                ArrayList arrayList4 = new ArrayList();
                arrayList4.addAll(dVar.f169960b);
                arrayList4.add(queryImageData);
                C13598b0 b0Var2 = C13598b0.f38549a;
                arrayList2.add(indexOf, new C59480d(str, arrayList4));
            }
        }
    }
}

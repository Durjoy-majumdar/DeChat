package fh1;

import cj1.C54847z3;
import com.tencent.p014mm.sdk.platformtools.Log;
import di3.C86312j;
import fy3.C32226l;
import gy3.C87412m;
import ht1.C60152b4;
import ht1.C60200t1;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import pe3.C47465a;
import rx3.C13604l;
import sx3.C36907w;
import te3.C50752oy0;
import te3.C51213s91;
import te3.C51978xi1;
import te3.C64586nn1;

/* renamed from: fh1.l2 */
public final class C45786l2 extends C54847z3.C54849b<C51213s91> {

    /* renamed from: b */
    public final /* synthetic */ C45788m2 f123684b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C45786l2(C45788m2 m2Var, Class<C51213s91> cls) {
        super(cls);
        this.f123684b = m2Var;
    }

    /* renamed from: a */
    public void mo9116a(C47465a aVar) {
        C51213s91 s912 = (C51213s91) aVar;
        C87412m.m108594g(s912, "result");
        LinkedList<C50752oy0> linkedList = s912.f141384d;
        C87412m.m108593f(linkedList, "result.reddot_infos");
        C45788m2 m2Var = this.f123684b;
        for (C50752oy0 oy02 : linkedList) {
            C51978xi1 xi12 = oy02.f139443d;
            if (xi12 != null) {
                String str = m2Var.f123686j;
                StringBuilder sb = new StringBuilder();
                sb.append("sync reddot ");
                sb.append(xi12.f144670e);
                sb.append(", showInfos = ");
                LinkedList<C64586nn1> linkedList2 = xi12.f144672g;
                C87412m.m108593f(linkedList2, "ctrlInfo.show_infos");
                ArrayList arrayList = new ArrayList(C36907w.m41090l(linkedList2, 10));
                for (C64586nn1 nn12 : linkedList2) {
                    arrayList.add(nn12.f184507i);
                }
                sb.append(arrayList);
                Log.m105918d(str, sb.toString());
                C60152b4.C8759a.m8561a(((C60200t1) C86312j.m106911c(C60200t1.class)).Nt0(), xi12, "FinderLiveSync", (HashSet) null, true, (C13604l) null, (C32226l) null, 0, false, 244, (Object) null);
            }
        }
    }
}

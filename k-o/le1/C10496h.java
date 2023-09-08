package le1;

import cm1.C0707a0;
import cm1.C0712b0;
import cm1.C0740i2;
import cm1.C0758o0;
import cm1.C0784u1;
import cm1.C0788w1;
import com.tencent.p014mm.plugin.finder.storage.FinderItem;
import com.tencent.p014mm.protocal.protobuf.FinderObject;
import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import di3.C7335d;
import di3.C86312j;
import dp1.C58417y0;
import er1.C58784w3;
import gy3.C87412m;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import kf1.C9794i6;
import kf1.C9833k9;
import o40.C61926c;
import sx3.C36907w;
import te3.C49712hj1;
import te3.C51124rl1;
import te3.C64629pl1;
import wp1.C15585f;

/* renamed from: le1.h */
public final class C10496h {
    /* renamed from: a */
    public static final String m10426a(C64629pl1 pl12) {
        C87412m.m108594g(pl12, "<this>");
        return C61926c.m72691p(pl12.f184854u) + '_' + pl12.f184840d + '_' + pl12.f184847n + '_' + pl12.f184844h.size() + '_' + pl12.f184842f + '_' + pl12.f184841e + '_' + pl12.f184853t;
    }

    /* renamed from: b */
    public static final C0740i2 m10427b(C64629pl1 pl12, int i) {
        Class cls = C58417y0.class;
        C87412m.m108594g(pl12, "<this>");
        C15585f.C15586a aVar = C15585f.f42211a;
        LinkedList<FinderObject> linkedList = pl12.f184844h;
        C87412m.m108593f(linkedList, "`object`");
        ArrayList arrayList = new ArrayList();
        for (T next : linkedList) {
            FinderObject finderObject = (FinderObject) next;
            C58784w3 w3Var = C58784w3.f168295a;
            C87412m.m108593f(finderObject, LocaleUtil.ITALIAN);
            if (w3Var.mo83866E0(finderObject)) {
                arrayList.add(next);
            }
        }
        List<FinderItem> f = aVar.mo14343f(arrayList, C58784w3.f168295a.mo83887M1(i), (C49712hj1) null);
        ArrayList arrayList2 = new ArrayList(C36907w.m41090l(f, 10));
        Iterator it = ((ArrayList) f).iterator();
        while (it.hasNext()) {
            arrayList2.add(C15585f.f42211a.mo14348k((FinderItem) it.next()));
        }
        LinkedList linkedList2 = new LinkedList(arrayList2);
        if (pl12.f184847n == 1) {
            C0707a0 a0Var = new C0707a0(pl12);
            for (C0712b0 b0Var : a0Var.mo683j()) {
                C7335d c = C86312j.m106911c(cls);
                C87412m.m108593f(c, "getService(FinderReportLogic::class.java)");
                ((C58417y0) c).py0(b0Var.f1709d.f164794id, C58784w3.f168295a.mo83890O(i), b0Var.f1709d.sessionBuffer, 0);
            }
            Log.m105924i("Finder.HandleLayoutInfoInterceptor", "[updateLiveList] tabType:" + i + ", live list:" + a0Var);
            if (a0Var.mo683j().size() > 0) {
                return a0Var;
            }
            return null;
        }
        C7335d c2 = C86312j.m106911c(cls);
        C87412m.m108593f(c2, "getService(FinderReportLogic::class.java)");
        ((C58417y0) c2).py0(pl12.f184854u, C58784w3.f168295a.mo83890O(i), pl12.f184855v, 0);
        return new C9833k9(pl12, pl12.f184847n, linkedList2);
    }

    /* renamed from: c */
    public static final C0740i2 m10428c(C51124rl1 rl12) {
        C87412m.m108594g(rl12, "<this>");
        int i = rl12.f141000f;
        if (i == 1 || i == 2) {
            return new C0758o0(rl12);
        }
        if (i == 6) {
            return new C0784u1(rl12);
        }
        switch (i) {
            case 8:
            case 9:
            case 10:
            case 11:
                return new C0788w1(rl12);
            default:
                return new C9794i6(rl12);
        }
    }
}

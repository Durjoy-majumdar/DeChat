package ke1;

import com.tencent.p014mm.plugin.finder.feed.model.FinderLbsLoader;
import com.tencent.p014mm.sdk.platformtools.Log;
import dp1.C20480e0;
import gy3.C87412m;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import je1.C9336m0;
import je1.C9360p1;
import ke1.C9595n;
import kf1.C9778h6;
import sx3.C36907w;
import sx3.C64186f0;
import te3.C49034cp0;
import te3.C49980je1;

/* renamed from: ke1.o */
public final class C9599o implements C9336m0.C9337a {

    /* renamed from: a */
    public final /* synthetic */ C9595n f29855a;

    /* renamed from: b */
    public final /* synthetic */ C9595n.C9596a f29856b;

    public C9599o(C9595n nVar, C9595n.C9596a aVar, C9360p1.C9362b bVar) {
        this.f29855a = nVar;
        this.f29856b = aVar;
    }

    /* renamed from: a */
    public void mo10078a(int i, int i2, String str, C49034cp0 cp02, int i3) {
        List list;
        C87412m.m108594g(cp02, "resp");
        FinderLbsLoader.C2698a aVar = new FinderLbsLoader.C2698a(i, i2, str);
        boolean z = true;
        if (i == 0 && i2 == 0) {
            this.f29855a.f29845i.f29851b = cp02.f131886e;
            LinkedList<C49980je1> linkedList = cp02.f131885d;
            if (linkedList != null) {
                list = new ArrayList(C36907w.m41090l(linkedList, 10));
                for (C49980je1 je12 : linkedList) {
                    C9778h6 h6Var = C9778h6.f30304a;
                    C87412m.m108593f(je12, "section");
                    list.add(h6Var.mo10380a(je12));
                }
            } else {
                list = C64186f0.f181907d;
            }
            C20480e0.f57583a.mo32028a(this.f29855a.f29843g, list.size());
            StringBuilder sb = new StringBuilder();
            sb.append("incrementList size: ");
            List incrementList = aVar.getIncrementList();
            sb.append(incrementList != null ? Integer.valueOf(incrementList.size()) : null);
            Log.m105924i("Finder.FinderLbsFeedFetcher", sb.toString());
            aVar.setIncrementList(list);
            aVar.setPullType(i3);
            aVar.setLastBuffer(cp02.f131886e);
            if (cp02.f131887f != 1) {
                z = false;
            }
            aVar.setHasMore(z);
            this.f29856b.mo2927a(aVar);
            return;
        }
        aVar.setHasMore(true);
    }
}

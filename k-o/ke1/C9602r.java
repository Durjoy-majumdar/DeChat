package ke1;

import cm1.C0716c;
import cm1.C0740i2;
import com.tencent.p014mm.plugin.finder.feed.model.C2781d;
import com.tencent.p014mm.plugin.finder.feed.model.FinderLbsLoader;
import com.tencent.p014mm.plugin.finder.model.BaseFinderFeed;
import com.tencent.p014mm.plugin.finder.storage.FinderItem;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import gy3.C87412m;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import je1.C9360p1;
import ke1.C9595n;
import te3.C50382mc1;
import up1.C14269a0;

/* renamed from: ke1.r */
public final class C9602r implements C9360p1.C9361a {

    /* renamed from: d */
    public final /* synthetic */ C9595n f29865d;

    /* renamed from: e */
    public final /* synthetic */ int f29866e;

    /* renamed from: f */
    public final /* synthetic */ C9595n.C9596a f29867f;

    public C9602r(C9595n nVar, int i, C9595n.C9596a aVar) {
        this.f29865d = nVar;
        this.f29866e = i;
        this.f29867f = aVar;
    }

    /* renamed from: a */
    public void mo2805a(C2781d dVar, int i) {
        Integer num;
        C87412m.m108594g(dVar, "info");
        if (dVar.f13964a == 0 && dVar.f13965b == 0) {
            this.f29865d.f29845i.f29852c = dVar.f13977n;
        }
        Log.m105924i("Finder.FinderLbsFeedFetcher", "[call] onFetchDone... pullType=" + i);
        boolean z = dVar.f13971h != 0;
        FinderLbsLoader.C2698a aVar = new FinderLbsLoader.C2698a(dVar.f13964a, dVar.f13965b, dVar.f13966c);
        LinkedList linkedList = new LinkedList();
        if (!Util.isNullOrNil((List) this.f29865d.f29845i.f29853d)) {
            linkedList.addAll(this.f29865d.f29845i.f29853d);
            this.f29865d.f29845i.f29853d.clear();
        }
        Iterator<T> it = dVar.f13968e.iterator();
        while (true) {
            num = null;
            if (!it.hasNext()) {
                break;
            }
            C0740i2 i2Var = (C0740i2) it.next();
            if (i2Var instanceof BaseFinderFeed) {
                BaseFinderFeed baseFinderFeed = (BaseFinderFeed) i2Var;
                C87412m.m108594g(baseFinderFeed, "feed");
                C50382mc1 mc12 = new C50382mc1();
                mc12.f137948d = 2;
                mc12.f137951g = baseFinderFeed.mo3513o().getFeedObject();
                C14269a0 a0Var = new C14269a0(mc12);
                a0Var.f39807b = null;
                FinderItem o = baseFinderFeed.mo3513o();
                a0Var.f39808c = o;
                a0Var.f39809d = null;
                a0Var.f39811f = o.getMediaType();
                a0Var.f39812g = o.getId();
                linkedList.add(new C0716c(a0Var));
            }
        }
        aVar.setIncrementList(linkedList);
        StringBuilder sb = new StringBuilder();
        sb.append("incrementList size: ");
        List incrementList = aVar.getIncrementList();
        if (incrementList != null) {
            num = Integer.valueOf(incrementList.size());
        }
        sb.append(num);
        Log.m105924i("Finder.FinderLbsFeedFetcher", sb.toString());
        aVar.setPullType(this.f29866e);
        aVar.setLastBuffer(dVar.f13977n);
        aVar.setHasMore(z);
        this.f29867f.mo2927a(aVar);
    }
}

package kf1;

import android.view.View;
import cm1.C55012e1;
import com.tencent.p014mm.plugin.finder.model.BaseFinderFeed;
import com.tencent.p014mm.sdk.platformtools.Log;
import di3.C86312j;
import dp1.C58417y0;
import gy3.C87412m;
import java.util.LinkedList;
import java.util.Set;
import jq3.C9493c;
import jq3.C9494d;
import jq3.C9499g;
import o40.C61926c;
import te3.C49712hj1;
import te3.C51449tu2;

/* renamed from: kf1.i */
public final class C9784i extends C9499g<C9493c> {

    /* renamed from: a */
    public final /* synthetic */ C9753h f30308a;

    /* renamed from: b */
    public final /* synthetic */ C49712hj1 f30309b;

    public C9784i(C9753h hVar, C49712hj1 hj12) {
        this.f30308a = hVar;
        this.f30309b = hj12;
    }

    /* renamed from: a */
    public float mo10184a(View view) {
        C87412m.m108594g(view, "view");
        return this.f30308a.mo10349N0();
    }

    /* renamed from: b */
    public void mo752b(Set<C9494d<C9493c>> set) {
        C87412m.m108594g(set, "recordsSet");
        String str = this.f30308a.f30218h;
        Log.m105924i(str, "onExposeTimeRecorded: size = " + set.size() + ", commentScene=" + this.f30309b.f134675i);
        LinkedList linkedList = new LinkedList();
        LinkedList linkedList2 = new LinkedList();
        C49712hj1 hj12 = this.f30309b;
        C9753h hVar = this.f30308a;
        for (C9494d dVar : set) {
            if (dVar.f29663a instanceof BaseFinderFeed) {
                C51449tu2 tu22 = new C51449tu2();
                T t = dVar.f29663a;
                C87412m.m108592e(t, "null cannot be cast to non-null type com.tencent.mm.plugin.finder.model.BaseFinderFeed");
                BaseFinderFeed baseFinderFeed = (BaseFinderFeed) t;
                baseFinderFeed.mo3492Z(true);
                linkedList2.add(baseFinderFeed);
                tu22.f142417d = baseFinderFeed.getItemId();
                tu22.f142423j = dVar.f29667e;
                C55012e1.f154468d.mo76062f(tu22, hj12.f134675i, hj12.f134677n);
                tu22.f142422i = (int) dVar.f29666d;
                tu22.f142421h = ((C58417y0) C86312j.m106911c(C58417y0.class)).mo83281Cu(baseFinderFeed.getItemId(), hj12.f134675i);
                linkedList.add(tu22);
                String str2 = hVar.f30218h;
                Log.m105918d(str2, "onExposeTimeRecorded: commentScene=" + hj12.f134675i + ", pos=" + dVar.f29667e + " exposeTime=" + dVar.f29666d + " nick=" + baseFinderFeed.mo3513o().getFeedObject().nickname + ", id=" + C61926c.m72691p(baseFinderFeed.getItemId()));
            }
        }
        C55012e1.f154468d.mo76061e(linkedList, linkedList2, this.f30309b);
    }

    /* renamed from: c */
    public void mo753c(C9494d<C9493c> dVar) {
        C87412m.m108594g(dVar, "item");
        T t = dVar.f29663a;
        if (t instanceof BaseFinderFeed) {
            C87412m.m108592e(t, "null cannot be cast to non-null type com.tencent.mm.plugin.finder.model.BaseFinderFeed");
            BaseFinderFeed baseFinderFeed = (BaseFinderFeed) t;
            String str = this.f30308a.f30218h;
            Log.m105918d(str, "onItemExposeStart: commentScene=" + this.f30309b.f134675i + ", nick=" + baseFinderFeed.mo3513o().getFeedObject().nickname + ", id=" + C61926c.m72691p(baseFinderFeed.getItemId()));
            C51449tu2 tu22 = new C51449tu2();
            tu22.f142417d = baseFinderFeed.getItemId();
            tu22.f142423j = dVar.f29667e;
            tu22.f142421h = ((C58417y0) C86312j.m106911c(C58417y0.class)).mo83281Cu(baseFinderFeed.getItemId(), this.f30309b.f134675i);
            tu22.f142428r = 1;
            C55012e1 e1Var = C55012e1.f154468d;
            LinkedList linkedList = new LinkedList();
            linkedList.add(tu22);
            e1Var.mo76060d(linkedList);
        }
    }
}

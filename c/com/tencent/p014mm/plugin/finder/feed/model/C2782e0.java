package com.tencent.p014mm.plugin.finder.feed.model;

import cm1.C0740i2;
import com.tencent.p014mm.plugin.finder.model.BaseFinderFeed;
import com.tencent.p014mm.plugin.finder.storage.FinderItem;
import gy3.C87412m;
import java.util.ArrayList;
import java.util.LinkedList;
import rx3.C13604l;
import sx3.C36907w;

/* renamed from: com.tencent.mm.plugin.finder.feed.model.e0 */
public final class C2782e0 implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ LinkedList<C0740i2> f13980d;

    /* renamed from: e */
    public final /* synthetic */ C55757d0 f13981e;

    public C2782e0(LinkedList<C0740i2> linkedList, C55757d0 d0Var) {
        this.f13980d = linkedList;
        this.f13981e = d0Var;
    }

    public final void run() {
        ArrayList arrayList;
        LinkedList linkedList = new LinkedList();
        LinkedList<C0740i2> linkedList2 = this.f13980d;
        ArrayList arrayList2 = null;
        if (linkedList2 != null) {
            ArrayList arrayList3 = new ArrayList();
            for (T next : linkedList2) {
                if (next instanceof BaseFinderFeed) {
                    arrayList3.add(next);
                }
            }
            ArrayList<BaseFinderFeed> arrayList4 = new ArrayList<>();
            for (Object next2 : arrayList3) {
                BaseFinderFeed baseFinderFeed = (BaseFinderFeed) next2;
                boolean z = C2816v.f14072a.mo2914c(baseFinderFeed.mo3513o().getUserName()) != null;
                if (z) {
                    linkedList.add(baseFinderFeed.mo3513o().getUserName());
                }
                if (!z) {
                    arrayList4.add(next2);
                }
            }
            arrayList = new ArrayList(C36907w.m41090l(arrayList4, 10));
            for (BaseFinderFeed baseFinderFeed2 : arrayList4) {
                C87412m.m108592e(baseFinderFeed2, "null cannot be cast to non-null type com.tencent.mm.plugin.finder.model.BaseFinderFeed");
                FinderItem o = baseFinderFeed2.mo3513o();
                Long valueOf = Long.valueOf(o.getExpectId());
                String objectNonceId = o.getObjectNonceId();
                if (objectNonceId == null) {
                    objectNonceId = "";
                }
                arrayList.add(new C13604l(valueOf, objectNonceId));
            }
        } else {
            arrayList = null;
        }
        if (arrayList != null) {
            if (!arrayList.isEmpty()) {
                arrayList2 = arrayList;
            }
            if (arrayList2 != null) {
                C55757d0 d0Var = this.f13981e;
                LinkedList linkedList3 = new LinkedList(arrayList);
                d0Var.mo77358E1().removeMessages(d0Var.f158750t);
                d0Var.mo77358E1().sendMessage(d0Var.mo77358E1().obtainMessage(d0Var.f158750t, linkedList3));
            }
        }
    }
}

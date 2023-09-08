package com.tencent.p014mm.plugin.finder.p056ui.fragment;

import com.tencent.p014mm.autogen.events.FeedUpdateEvent;
import fy3.C32224a;
import gy3.C87413o;
import java.util.HashSet;
import rx3.C13598b0;

/* renamed from: com.tencent.mm.plugin.finder.ui.fragment.d */
public final class C3826d extends C87413o implements C32224a<C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ FeedUpdateEvent f17357d;

    /* renamed from: e */
    public final /* synthetic */ FinderLikeFeedGridFragment f17358e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C3826d(FeedUpdateEvent feedUpdateEvent, FinderLikeFeedGridFragment finderLikeFeedGridFragment) {
        super(0);
        this.f17357d = feedUpdateEvent;
        this.f17358e = finderLikeFeedGridFragment;
    }

    public Object invoke() {
        HashSet<Long> hashSet;
        this.f17357d.f9173d.getClass();
        FeedUpdateEvent.C1041a aVar = this.f17357d.f9173d;
        if (aVar.f9175b == 4) {
            int i = aVar.f9178e;
            if (i == 0) {
                HashSet<Long> hashSet2 = this.f17358e.f17341w;
                if (hashSet2 != null) {
                    hashSet2.add(Long.valueOf(aVar.f9174a));
                }
            } else if (i == 1 && (hashSet = this.f17358e.f17341w) != null) {
                hashSet.remove(Long.valueOf(aVar.f9174a));
            }
        }
        return C13598b0.f38549a;
    }
}

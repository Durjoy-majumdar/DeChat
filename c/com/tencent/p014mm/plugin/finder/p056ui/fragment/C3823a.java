package com.tencent.p014mm.plugin.finder.p056ui.fragment;

import com.tencent.p014mm.autogen.events.FeedUpdateEvent;
import fy3.C32224a;
import gy3.C87413o;
import java.util.HashSet;
import rx3.C13598b0;

/* renamed from: com.tencent.mm.plugin.finder.ui.fragment.a */
public final class C3823a extends C87413o implements C32224a<C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ FeedUpdateEvent f17350d;

    /* renamed from: e */
    public final /* synthetic */ FinderFavFeedFragment f17351e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C3823a(FeedUpdateEvent feedUpdateEvent, FinderFavFeedFragment finderFavFeedFragment) {
        super(0);
        this.f17350d = feedUpdateEvent;
        this.f17351e = finderFavFeedFragment;
    }

    public Object invoke() {
        HashSet<Long> hashSet;
        this.f17350d.f9173d.getClass();
        FeedUpdateEvent.C1041a aVar = this.f17350d.f9173d;
        if (aVar.f9175b == 5) {
            int i = aVar.f9176c;
            if (i == 2) {
                HashSet<Long> hashSet2 = this.f17351e.f17317w;
                if (hashSet2 != null) {
                    hashSet2.add(Long.valueOf(aVar.f9174a));
                }
            } else if (i == 1 && (hashSet = this.f17351e.f17317w) != null) {
                hashSet.remove(Long.valueOf(aVar.f9174a));
            }
        }
        return C13598b0.f38549a;
    }
}

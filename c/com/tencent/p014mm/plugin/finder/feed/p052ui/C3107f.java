package com.tencent.p014mm.plugin.finder.feed.p052ui;

import com.tencent.p014mm.autogen.events.FeedLikeEvent;
import com.tencent.p014mm.plugin.finder.p056ui.C3881w0;
import fy3.C32224a;
import gy3.C87412m;
import gy3.C87413o;
import rx3.C13598b0;
import te3.C50581nr0;

/* renamed from: com.tencent.mm.plugin.finder.feed.ui.f */
public final class C3107f extends C87413o implements C32224a<C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ FinderFriendRecommendUI f14967d;

    /* renamed from: e */
    public final /* synthetic */ FeedLikeEvent f14968e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C3107f(FinderFriendRecommendUI finderFriendRecommendUI, FeedLikeEvent feedLikeEvent) {
        super(0);
        this.f14967d = finderFriendRecommendUI;
        this.f14968e = feedLikeEvent;
    }

    public Object invoke() {
        C50581nr0 nr02;
        C3881w0 w0Var = this.f14967d.f14367s;
        FeedLikeEvent feedLikeEvent = this.f14968e;
        w0Var.getClass();
        C87412m.m108594g(feedLikeEvent, "likeEvent");
        int size = w0Var.f17436e.size();
        int i = 0;
        while (true) {
            nr02 = null;
            if (i >= size) {
                break;
            }
            feedLikeEvent.f9157d.getClass();
            if (C87412m.m108589b((Object) null, w0Var.f17436e.get(i).f138729i)) {
                nr02 = w0Var.f17436e.get(i);
                break;
            }
            i++;
        }
        if (nr02 != null) {
            feedLikeEvent.f9157d.getClass();
            nr02.f138728h = 0;
            w0Var.notifyDataSetChanged();
        }
        return C13598b0.f38549a;
    }
}

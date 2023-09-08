package com.tencent.p014mm.plugin.finder.p056ui;

import com.tencent.p014mm.autogen.events.FeedDeleteEvent;
import com.tencent.p014mm.sdk.platformtools.Log;
import fy3.C32224a;
import gy3.C87413o;
import rx3.C13598b0;

/* renamed from: com.tencent.mm.plugin.finder.ui.x1 */
public final class C3888x1 extends C87413o implements C32224a<C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ FeedDeleteEvent f17459d;

    /* renamed from: e */
    public final /* synthetic */ FinderMsgFeedDetailUI f17460e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C3888x1(FeedDeleteEvent feedDeleteEvent, FinderMsgFeedDetailUI finderMsgFeedDetailUI) {
        super(0);
        this.f17459d = feedDeleteEvent;
        this.f17460e = finderMsgFeedDetailUI;
    }

    public Object invoke() {
        long j = this.f17459d.f9154d.f9155a;
        FinderMsgFeedDetailUI finderMsgFeedDetailUI = this.f17460e;
        if (j == finderMsgFeedDetailUI.f16992s) {
            String str = finderMsgFeedDetailUI.f16989p;
            Log.m105924i(str, this.f17459d.f9154d.f9155a + " delete, finish");
            this.f17460e.finish();
        }
        return C13598b0.f38549a;
    }
}

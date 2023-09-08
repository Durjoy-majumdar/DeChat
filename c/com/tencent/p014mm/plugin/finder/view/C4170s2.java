package com.tencent.p014mm.plugin.finder.view;

import android.os.Looper;
import com.tencent.p014mm.sdk.platformtools.MTimerHandler;
import fy3.C32224a;
import gy3.C87413o;

/* renamed from: com.tencent.mm.plugin.finder.view.s2 */
public final class C4170s2 extends C87413o implements C32224a<MTimerHandler> {

    /* renamed from: d */
    public final /* synthetic */ FinderFeedLiveRecommendView f18415d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C4170s2(FinderFeedLiveRecommendView finderFeedLiveRecommendView) {
        super(0);
        this.f18415d = finderFeedLiveRecommendView;
    }

    public Object invoke() {
        MTimerHandler mTimerHandler = new MTimerHandler(Looper.getMainLooper(), this.f18415d.f17772x, true);
        mTimerHandler.setLogging(false);
        return mTimerHandler;
    }
}

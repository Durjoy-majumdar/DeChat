package com.tencent.p014mm.plugin.finder.view;

import android.os.Looper;
import com.tencent.p014mm.sdk.platformtools.MMHandler;
import fy3.C32224a;
import gy3.C87413o;

/* renamed from: com.tencent.mm.plugin.finder.view.q2 */
public final class C4153q2 extends C87413o implements C32224a<MMHandler> {

    /* renamed from: d */
    public final /* synthetic */ FinderFeedLiveRecommendView f18376d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C4153q2(FinderFeedLiveRecommendView finderFeedLiveRecommendView) {
        super(0);
        this.f18376d = finderFeedLiveRecommendView;
    }

    public Object invoke() {
        MMHandler mMHandler = new MMHandler(Looper.getMainLooper(), (MMHandler.Callback) new C4145p2(this.f18376d));
        mMHandler.setLogging(false);
        return mMHandler;
    }
}

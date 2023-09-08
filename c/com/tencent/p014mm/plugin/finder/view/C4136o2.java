package com.tencent.p014mm.plugin.finder.view;

import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MTimerHandler;
import java.util.LinkedList;

/* renamed from: com.tencent.mm.plugin.finder.view.o2 */
public final class C4136o2 implements MTimerHandler.CallBack {

    /* renamed from: d */
    public final /* synthetic */ FinderFeedLiveRecommendView f18358d;

    /* renamed from: com.tencent.mm.plugin.finder.view.o2$a */
    public static final class C4137a implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ FinderFeedLiveRecommendView f18359d;

        public C4137a(FinderFeedLiveRecommendView finderFeedLiveRecommendView) {
            this.f18359d = finderFeedLiveRecommendView;
        }

        public final void run() {
            FinderFeedLiveRecommendView.m4163c(this.f18359d);
        }
    }

    public C4136o2(FinderFeedLiveRecommendView finderFeedLiveRecommendView) {
        this.f18358d = finderFeedLiveRecommendView;
    }

    public final boolean onTimerExpired() {
        LinkedList<String> linkedList = this.f18358d.f17763o;
        int size = linkedList != null ? linkedList.size() : 0;
        String str = this.f18358d.f17755d;
        Log.m105924i(str, "curVisiblePosition:" + this.f18358d.f17767s + ", size:" + size);
        FinderFeedLiveRecommendView finderFeedLiveRecommendView = this.f18358d;
        int i = finderFeedLiveRecommendView.f17766r ? 2 : 1;
        int i2 = finderFeedLiveRecommendView.f17767s;
        if (i2 == size - i) {
            finderFeedLiveRecommendView.getTimeHandler().stopTimer();
            FinderFeedLiveRecommendView finderFeedLiveRecommendView2 = this.f18358d;
            long j = finderFeedLiveRecommendView2.f17765q;
            long j2 = (long) (size - 3);
            long j3 = finderFeedLiveRecommendView2.f17764p;
            Long.signum(j2);
            long j4 = j - (j2 * j3);
            if (j4 >= 0) {
                j = j4;
            }
            finderFeedLiveRecommendView2.getHandlerForEmptyTips().postDelayed(new C4137a(this.f18358d), j);
            FinderFeedLiveRecommendView finderFeedLiveRecommendView3 = this.f18358d;
            if (!finderFeedLiveRecommendView3.f17766r) {
                finderFeedLiveRecommendView3.getHandlerForEmptyTips().sendEmptyMessageDelayed(1, j);
            }
            return false;
        }
        LinkedList<String> linkedList2 = finderFeedLiveRecommendView.f17763o;
        if (i2 < (linkedList2 != null ? linkedList2.size() : 0)) {
            FinderFeedLiveRecommendView.m4163c(this.f18358d);
        }
        FinderFeedLiveRecommendView finderFeedLiveRecommendView4 = this.f18358d;
        int i3 = finderFeedLiveRecommendView4.f17767s + 1;
        finderFeedLiveRecommendView4.f17767s = i3;
        LinkedList<String> linkedList3 = finderFeedLiveRecommendView4.f17763o;
        return i3 < (linkedList3 != null ? linkedList3.size() : 0);
    }
}

package com.tencent.p014mm.plugin.finder.feed;

import com.tencent.p014mm.autogen.events.ActivityFeedRemoveEvent;
import fy3.C32224a;
import gy3.C87413o;
import rx3.C13598b0;

/* renamed from: com.tencent.mm.plugin.finder.feed.l0 */
public final class C2655l0 extends C87413o implements C32224a<C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ ActivityFeedRemoveEvent f13513d;

    /* renamed from: e */
    public final /* synthetic */ FinderTopicTimelineUIContract$Presenter f13514e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C2655l0(ActivityFeedRemoveEvent activityFeedRemoveEvent, FinderTopicTimelineUIContract$Presenter finderTopicTimelineUIContract$Presenter) {
        super(0);
        this.f13513d = activityFeedRemoveEvent;
        this.f13514e = finderTopicTimelineUIContract$Presenter;
    }

    /* JADX WARNING: type inference failed for: r1v2, types: [com.tencent.mm.plugin.finder.feed.model.internal.BaseFeedLoader<cm1.i2>] */
    /* JADX WARNING: type inference failed for: r0v5, types: [com.tencent.mm.plugin.finder.feed.model.internal.BaseFeedLoader<cm1.i2>] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 2 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object invoke() {
        /*
            r8 = this;
            com.tencent.mm.autogen.events.ActivityFeedRemoveEvent r0 = r8.f13513d
            com.tencent.mm.autogen.events.ActivityFeedRemoveEvent$a r0 = r0.f9022d
            long r1 = r0.f9023a
            r3 = 1
            r4 = 0
            r5 = 0
            int r7 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r7 == 0) goto L_0x001f
            com.tencent.mm.plugin.finder.feed.FinderTopicTimelineUIContract$Presenter r0 = r8.f13514e
            com.tencent.mm.plugin.finder.feed.model.internal.BaseFeedLoader<cm1.i2> r0 = r0.f13124s
            boolean r5 = r0 instanceof com.tencent.p014mm.plugin.finder.feed.model.BaseFinderFeedLoader
            if (r5 == 0) goto L_0x0019
            r4 = r0
            com.tencent.mm.plugin.finder.feed.model.BaseFinderFeedLoader r4 = (com.tencent.p014mm.plugin.finder.feed.model.BaseFinderFeedLoader) r4
        L_0x0019:
            if (r4 == 0) goto L_0x0031
            r4.remove(r1, r3)
            goto L_0x0031
        L_0x001f:
            com.tencent.mm.plugin.finder.feed.FinderTopicTimelineUIContract$Presenter r1 = r8.f13514e
            com.tencent.mm.plugin.finder.feed.model.internal.BaseFeedLoader<cm1.i2> r1 = r1.f13124s
            boolean r2 = r1 instanceof com.tencent.p014mm.plugin.finder.feed.model.BaseFinderFeedLoader
            if (r2 == 0) goto L_0x002a
            r4 = r1
            com.tencent.mm.plugin.finder.feed.model.BaseFinderFeedLoader r4 = (com.tencent.p014mm.plugin.finder.feed.model.BaseFinderFeedLoader) r4
        L_0x002a:
            if (r4 == 0) goto L_0x0031
            long r0 = r0.f9024b
            r4.removeByLocalId(r0, r3)
        L_0x0031:
            rx3.b0 r0 = rx3.C13598b0.f38549a
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.finder.feed.C2655l0.invoke():java.lang.Object");
    }
}

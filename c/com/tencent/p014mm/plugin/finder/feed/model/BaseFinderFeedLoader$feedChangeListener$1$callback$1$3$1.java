package com.tencent.p014mm.plugin.finder.feed.model;

import cm1.C0797z;
import com.tencent.p014mm.autogen.events.FeedUpdateEvent;
import gy3.C8477a0;
import kotlin.Metadata;
import p565ir.C60606n;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000#\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\"\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016¨\u0006\n"}, mo182094d2 = {"com/tencent/mm/plugin/finder/feed/model/BaseFinderFeedLoader$feedChangeListener$1$callback$1$3$1", "Lir/n$c;", "", "respLiveId", "", "status", "", "liveInfoResp", "Lrx3/b0;", "onLiveStatusCallback", "plugin-finder_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.finder.feed.model.BaseFinderFeedLoader$feedChangeListener$1$callback$1$3$1 */
public final class BaseFinderFeedLoader$feedChangeListener$1$callback$1$3$1 implements C60606n.C60609c {
    public final /* synthetic */ C8477a0 $changed;
    public final /* synthetic */ FeedUpdateEvent $event;
    public final /* synthetic */ C0797z $feed;
    public final /* synthetic */ int $indexFeed;
    public final /* synthetic */ BaseFinderFeedLoader this$0;

    public BaseFinderFeedLoader$feedChangeListener$1$callback$1$3$1(FeedUpdateEvent feedUpdateEvent, BaseFinderFeedLoader baseFinderFeedLoader, C0797z zVar, int i, C8477a0 a0Var) {
        this.$event = feedUpdateEvent;
        this.this$0 = baseFinderFeedLoader;
        this.$feed = zVar;
        this.$indexFeed = i;
        this.$changed = a0Var;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x004f, code lost:
        r5 = r5.f182363I;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onLiveStatusCallback(long r3, int r5, java.lang.Object r6) {
        /*
            r2 = this;
            com.tencent.mm.autogen.events.FeedUpdateEvent r5 = r2.$event
            com.tencent.mm.autogen.events.FeedUpdateEvent$a r5 = r5.f9173d
            long r0 = r5.f9174a
            int r5 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r5 != 0) goto L_0x00cc
            boolean r3 = r6 instanceof te3.C51713vn0
            if (r3 == 0) goto L_0x00cc
            com.tencent.mm.plugin.finder.feed.model.BaseFinderFeedLoader r3 = r2.this$0
            java.lang.String r3 = r3.getTAG()
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = "TYPE_LIVE_REFRESH id:"
            r4.append(r5)
            com.tencent.mm.autogen.events.FeedUpdateEvent r5 = r2.$event
            com.tencent.mm.autogen.events.FeedUpdateEvent$a r5 = r5.f9173d
            long r0 = r5.f9174a
            r4.append(r0)
            java.lang.String r5 = ",username:"
            r4.append(r5)
            com.tencent.mm.autogen.events.FeedUpdateEvent r5 = r2.$event
            com.tencent.mm.autogen.events.FeedUpdateEvent$a r5 = r5.f9173d
            java.lang.String r5 = r5.f9181h
            r4.append(r5)
            java.lang.String r5 = ",liveStaus:"
            r4.append(r5)
            com.tencent.mm.autogen.events.FeedUpdateEvent r5 = r2.$event
            com.tencent.mm.autogen.events.FeedUpdateEvent$a r5 = r5.f9173d
            int r5 = r5.f9182i
            r4.append(r5)
            r5 = 44
            r4.append(r5)
            te3.vn0 r6 = (te3.C51713vn0) r6
            te3.c21 r5 = r6.f143572d
            r0 = 0
            if (r5 == 0) goto L_0x005a
            te3.e61 r5 = r5.f182363I
            if (r5 == 0) goto L_0x005a
            sk1.a r1 = sk1.C63947a.f181274a
            java.lang.String r5 = r1.mo88725k(r5)
            goto L_0x005b
        L_0x005a:
            r5 = r0
        L_0x005b:
            r4.append(r5)
            java.lang.String r5 = ", ori streamUrl:"
            r4.append(r5)
            cm1.z r5 = r2.$feed
            com.tencent.mm.plugin.finder.storage.FinderItem r5 = r5.mo3513o()
            te3.c21 r5 = r5.getLiveInfo()
            if (r5 == 0) goto L_0x0072
            java.lang.String r5 = r5.f182395g
            goto L_0x0073
        L_0x0072:
            r5 = r0
        L_0x0073:
            r4.append(r5)
            java.lang.String r5 = " ,new streamUrl:"
            r4.append(r5)
            te3.c21 r5 = r6.f143572d
            if (r5 == 0) goto L_0x0082
            java.lang.String r5 = r5.f182395g
            goto L_0x0083
        L_0x0082:
            r5 = r0
        L_0x0083:
            r4.append(r5)
            java.lang.String r4 = r4.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r3, r4)
            cm1.z r3 = r2.$feed
            com.tencent.mm.plugin.finder.storage.FinderItem r3 = r3.mo3513o()
            te3.c21 r4 = r6.f143572d
            r3.setLiveInfo(r4)
            cm1.z r3 = r2.$feed
            com.tencent.mm.plugin.finder.storage.FinderItem r3 = r3.mo3513o()
            te3.rq2 r3 = r3.getLiveFinderMedia()
            if (r3 != 0) goto L_0x00a5
            goto L_0x00b5
        L_0x00a5:
            cm1.z r4 = r2.$feed
            com.tencent.mm.plugin.finder.storage.FinderItem r4 = r4.mo3513o()
            te3.c21 r4 = r4.getLiveInfo()
            if (r4 == 0) goto L_0x00b3
            java.lang.String r0 = r4.f182395g
        L_0x00b3:
            r3.f185266d = r0
        L_0x00b5:
            com.tencent.mm.plugin.finder.feed.model.BaseFinderFeedLoader r3 = r2.this$0
            tf1.g r3 = r3.dispatcher()
            int r4 = r2.$indexFeed
            r5 = 1
            r3.mo13377b(r4, r5)
            com.tencent.mm.plugin.finder.feed.model.BaseFinderFeedLoader r3 = r2.this$0
            cm1.z r4 = r2.$feed
            r3.updateFinderPageItem(r4)
            gy3.a0 r3 = r2.$changed
            r3.f27482d = r5
        L_0x00cc:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.finder.feed.model.BaseFinderFeedLoader$feedChangeListener$1$callback$1$3$1.onLiveStatusCallback(long, int, java.lang.Object):void");
    }
}

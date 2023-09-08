package com.tencent.p014mm.plugin.finder.feed.model;

import com.tencent.p014mm.autogen.events.FeedUpdateEvent;
import fy3.C32224a;
import gy3.C87413o;
import kotlin.Metadata;
import rx3.C13598b0;
import te3.C49712hj1;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, mo182094d2 = {"Lrx3/b0;", "invoke", "()V", "<anonymous>"}, mo182095k = 3, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.finder.feed.model.BaseFinderFeedLoader$feedChangeListener$1$callback$1 */
public final class BaseFinderFeedLoader$feedChangeListener$1$callback$1 extends C87413o implements C32224a<C13598b0> {
    public final /* synthetic */ C49712hj1 $contextObj;
    public final /* synthetic */ FeedUpdateEvent $event;
    public final /* synthetic */ BaseFinderFeedLoader this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public BaseFinderFeedLoader$feedChangeListener$1$callback$1(FeedUpdateEvent feedUpdateEvent, BaseFinderFeedLoader baseFinderFeedLoader, C49712hj1 hj12) {
        super(0);
        this.$event = feedUpdateEvent;
        this.this$0 = baseFinderFeedLoader;
        this.$contextObj = hj12;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:469:0x0be8, code lost:
        if (r0 != false) goto L_0x0bea;
     */
    /* JADX WARNING: Removed duplicated region for block: B:134:0x03d4  */
    /* JADX WARNING: Removed duplicated region for block: B:341:0x09bb A[LOOP:16: B:327:0x098a->B:341:0x09bb, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:494:0x0c50  */
    /* JADX WARNING: Removed duplicated region for block: B:495:0x0c66  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x01b7 A[LOOP:2: B:41:0x0185->B:56:0x01b7, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:637:0x01b5 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:668:0x09bf A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void invoke() {
        /*
            r27 = this;
            r1 = r27
            com.tencent.mm.autogen.events.FeedUpdateEvent r0 = r1.$event
            com.tencent.mm.autogen.events.FeedUpdateEvent$a r0 = r0.f9173d
            r0.getClass()
            com.tencent.mm.plugin.finder.feed.model.BaseFinderFeedLoader r0 = r1.this$0
            java.lang.String r0 = r0.getTAG()
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "feedChangeListener "
            r2.append(r3)
            com.tencent.mm.autogen.events.FeedUpdateEvent r3 = r1.$event
            com.tencent.mm.autogen.events.FeedUpdateEvent$a r3 = r3.f9173d
            long r3 = r3.f9174a
            r2.append(r3)
            java.lang.String r3 = ",fav = "
            r2.append(r3)
            com.tencent.mm.autogen.events.FeedUpdateEvent r3 = r1.$event
            com.tencent.mm.autogen.events.FeedUpdateEvent$a r3 = r3.f9173d
            int r3 = r3.f9176c
            r2.append(r3)
            java.lang.String r3 = ",like = "
            r2.append(r3)
            com.tencent.mm.autogen.events.FeedUpdateEvent r3 = r1.$event
            com.tencent.mm.autogen.events.FeedUpdateEvent$a r3 = r3.f9173d
            int r3 = r3.f9178e
            r2.append(r3)
            java.lang.String r3 = ",likeCount = "
            r2.append(r3)
            com.tencent.mm.autogen.events.FeedUpdateEvent r3 = r1.$event
            com.tencent.mm.autogen.events.FeedUpdateEvent$a r3 = r3.f9173d
            int r3 = r3.f9179f
            r2.append(r3)
            java.lang.String r3 = " ,needChangeData = "
            r2.append(r3)
            com.tencent.mm.autogen.events.FeedUpdateEvent r3 = r1.$event
            com.tencent.mm.autogen.events.FeedUpdateEvent$a r3 = r3.f9173d
            int r3 = r3.f9177d
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r2)
            gy3.a0 r2 = new gy3.a0
            r2.<init>()
            com.tencent.mm.autogen.events.FeedUpdateEvent r0 = r1.$event
            com.tencent.mm.autogen.events.FeedUpdateEvent$a r0 = r0.f9173d
            int r3 = r0.f9175b
            java.lang.String r4 = ",live status:"
            java.lang.String r5 = ",feed id:"
            java.lang.String r6 = ",nickname:"
            r7 = 7
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            r8 = 35
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)
            r10 = 10
            java.lang.Integer r10 = java.lang.Integer.valueOf(r10)
            r12 = 9
            java.lang.Integer r13 = java.lang.Integer.valueOf(r12)
            r9 = 1
            java.lang.Integer r11 = java.lang.Integer.valueOf(r9)
            java.lang.String r12 = ", live status:"
            java.lang.String r14 = "event.data.username"
            java.lang.String r9 = ",feedList:"
            r20 = 3
            java.lang.Integer r15 = java.lang.Integer.valueOf(r20)
            r20 = r8
            java.lang.String r8 = " id:"
            r21 = r13
            java.lang.String r13 = ""
            r22 = r4
            java.lang.String r4 = "null cannot be cast to non-null type com.tencent.mm.plugin.finder.model.BaseFinderFeed"
            r23 = r5
            java.lang.String r5 = ",liveStaus:"
            r24 = r6
            java.lang.String r6 = ",username:"
            r25 = 0
            switch(r3) {
                case 0: goto L_0x0f5a;
                case 1: goto L_0x0efe;
                case 2: goto L_0x00b3;
                case 3: goto L_0x00b3;
                case 4: goto L_0x0dcf;
                case 5: goto L_0x0cc6;
                case 6: goto L_0x0c6b;
                case 7: goto L_0x0b7b;
                case 8: goto L_0x0930;
                case 9: goto L_0x075a;
                case 10: goto L_0x00b3;
                case 11: goto L_0x06c2;
                case 12: goto L_0x05fe;
                case 13: goto L_0x0540;
                case 14: goto L_0x00b3;
                case 15: goto L_0x04c1;
                case 16: goto L_0x0442;
                case 17: goto L_0x0367;
                case 18: goto L_0x027c;
                case 19: goto L_0x00b3;
                case 20: goto L_0x0200;
                case 21: goto L_0x016d;
                case 22: goto L_0x00b3;
                case 23: goto L_0x00b3;
                case 24: goto L_0x00b3;
                case 25: goto L_0x0111;
                case 26: goto L_0x00b5;
                default: goto L_0x00b3;
            }
        L_0x00b3:
            goto L_0x0fd6
        L_0x00b5:
            long r3 = r0.f9174a
            int r0 = (r3 > r25 ? 1 : (r3 == r25 ? 0 : -1))
            if (r0 == 0) goto L_0x0fd6
            com.tencent.mm.plugin.finder.feed.model.BaseFinderFeedLoader r0 = r1.this$0
            com.tencent.mm.plugin.finder.feed.model.internal.DataBuffer r0 = r0.getDataList()
            com.tencent.mm.autogen.events.FeedUpdateEvent r3 = r1.$event
            java.util.Iterator r0 = r0.iterator()
            r4 = 0
        L_0x00c8:
            boolean r5 = r0.hasNext()
            if (r5 == 0) goto L_0x00f4
            java.lang.Object r5 = r0.next()
            cm1.i2 r5 = (cm1.C0740i2) r5
            boolean r6 = r5 instanceof com.tencent.p014mm.plugin.finder.model.BaseFinderFeed
            if (r6 == 0) goto L_0x00ec
            com.tencent.mm.plugin.finder.model.BaseFinderFeed r5 = (com.tencent.p014mm.plugin.finder.model.BaseFinderFeed) r5
            com.tencent.mm.plugin.finder.storage.FinderItem r5 = r5.mo3513o()
            long r5 = r5.getId()
            com.tencent.mm.autogen.events.FeedUpdateEvent$a r7 = r3.f9173d
            long r7 = r7.f9174a
            int r9 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r9 != 0) goto L_0x00ec
            r5 = 1
            goto L_0x00ed
        L_0x00ec:
            r5 = 0
        L_0x00ed:
            if (r5 == 0) goto L_0x00f1
            r0 = -1
            goto L_0x00f6
        L_0x00f1:
            int r4 = r4 + 1
            goto L_0x00c8
        L_0x00f4:
            r0 = -1
            r4 = -1
        L_0x00f6:
            if (r4 == r0) goto L_0x0fd6
            com.tencent.mm.plugin.finder.feed.model.BaseFinderFeedLoader r0 = r1.this$0
            tf1.g r0 = r0.dispatcher()
            rx3.l r3 = new rx3.l
            r5 = 32
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            com.tencent.mm.autogen.events.FeedUpdateEvent r6 = r1.$event
            r3.<init>(r5, r6)
            r5 = 1
            r0.mo13378c(r4, r5, r3)
            goto L_0x0fd6
        L_0x0111:
            long r3 = r0.f9174a
            int r0 = (r3 > r25 ? 1 : (r3 == r25 ? 0 : -1))
            if (r0 == 0) goto L_0x0fd6
            com.tencent.mm.plugin.finder.feed.model.BaseFinderFeedLoader r0 = r1.this$0
            com.tencent.mm.plugin.finder.feed.model.internal.DataBuffer r0 = r0.getDataList()
            com.tencent.mm.autogen.events.FeedUpdateEvent r3 = r1.$event
            java.util.Iterator r0 = r0.iterator()
            r4 = 0
        L_0x0124:
            boolean r5 = r0.hasNext()
            if (r5 == 0) goto L_0x0150
            java.lang.Object r5 = r0.next()
            cm1.i2 r5 = (cm1.C0740i2) r5
            boolean r6 = r5 instanceof com.tencent.p014mm.plugin.finder.model.BaseFinderFeed
            if (r6 == 0) goto L_0x0148
            com.tencent.mm.plugin.finder.model.BaseFinderFeed r5 = (com.tencent.p014mm.plugin.finder.model.BaseFinderFeed) r5
            com.tencent.mm.plugin.finder.storage.FinderItem r5 = r5.mo3513o()
            long r5 = r5.getId()
            com.tencent.mm.autogen.events.FeedUpdateEvent$a r7 = r3.f9173d
            long r7 = r7.f9174a
            int r9 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r9 != 0) goto L_0x0148
            r5 = 1
            goto L_0x0149
        L_0x0148:
            r5 = 0
        L_0x0149:
            if (r5 == 0) goto L_0x014d
            r0 = -1
            goto L_0x0152
        L_0x014d:
            int r4 = r4 + 1
            goto L_0x0124
        L_0x0150:
            r0 = -1
            r4 = -1
        L_0x0152:
            if (r4 == r0) goto L_0x0fd6
            com.tencent.mm.plugin.finder.feed.model.BaseFinderFeedLoader r0 = r1.this$0
            tf1.g r0 = r0.dispatcher()
            rx3.l r3 = new rx3.l
            r5 = 31
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            com.tencent.mm.autogen.events.FeedUpdateEvent r6 = r1.$event
            r3.<init>(r5, r6)
            r5 = 1
            r0.mo13378c(r4, r5, r3)
            goto L_0x0fd6
        L_0x016d:
            r5 = 1
            long r3 = r0.f9174a
            int r6 = (r3 > r25 ? 1 : (r3 == r25 ? 0 : -1))
            if (r6 == 0) goto L_0x0fd6
            int r0 = r0.f9177d
            if (r0 != r5) goto L_0x0fd6
            com.tencent.mm.plugin.finder.feed.model.BaseFinderFeedLoader r0 = r1.this$0
            com.tencent.mm.plugin.finder.feed.model.internal.DataBuffer r0 = r0.getDataList()
            com.tencent.mm.autogen.events.FeedUpdateEvent r3 = r1.$event
            java.util.Iterator r0 = r0.iterator()
            r4 = 0
        L_0x0185:
            boolean r5 = r0.hasNext()
            if (r5 == 0) goto L_0x01ba
            java.lang.Object r5 = r0.next()
            cm1.i2 r5 = (cm1.C0740i2) r5
            boolean r6 = r5 instanceof cm1.C0797z
            if (r6 == 0) goto L_0x01b2
            cm1.z r5 = (cm1.C0797z) r5
            com.tencent.mm.plugin.finder.storage.FinderItem r5 = r5.mo3513o()
            te3.c21 r5 = r5.getLiveInfo()
            if (r5 == 0) goto L_0x01ad
            long r5 = r5.f182392d
            com.tencent.mm.autogen.events.FeedUpdateEvent$a r7 = r3.f9173d
            long r7 = r7.f9174a
            int r9 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r9 != 0) goto L_0x01ad
            r5 = 1
            goto L_0x01ae
        L_0x01ad:
            r5 = 0
        L_0x01ae:
            if (r5 == 0) goto L_0x01b2
            r5 = 1
            goto L_0x01b3
        L_0x01b2:
            r5 = 0
        L_0x01b3:
            if (r5 == 0) goto L_0x01b7
            r7 = r4
            goto L_0x01bb
        L_0x01b7:
            int r4 = r4 + 1
            goto L_0x0185
        L_0x01ba:
            r7 = -1
        L_0x01bb:
            if (r7 < 0) goto L_0x0fd6
            com.tencent.mm.plugin.finder.feed.model.BaseFinderFeedLoader r0 = r1.this$0
            com.tencent.mm.plugin.finder.feed.model.internal.DataBuffer r0 = r0.getDataList()
            java.lang.Object r0 = r0.get(r7)
            boolean r3 = r0 instanceof cm1.C0797z
            if (r3 == 0) goto L_0x01cf
            cm1.z r0 = (cm1.C0797z) r0
            r6 = r0
            goto L_0x01d0
        L_0x01cf:
            r6 = 0
        L_0x01d0:
            if (r6 == 0) goto L_0x0fd6
            com.tencent.mm.autogen.events.FeedUpdateEvent r4 = r1.$event
            com.tencent.mm.plugin.finder.feed.model.BaseFinderFeedLoader r5 = r1.this$0
            java.lang.Class<ir.n> r0 = p565ir.C60606n.class
            di3.d r0 = di3.C86312j.m106911c(r0)
            java.lang.String r3 = "getService(IFinderLiveFeatureService::class.java)"
            gy3.C87412m.m108593f(r0, r3)
            ir.n r0 = (p565ir.C60606n) r0
            com.tencent.mm.autogen.events.FeedUpdateEvent$a r3 = r4.f9173d
            long r9 = r3.f9174a
            r11 = 1
            r12 = 0
            com.tencent.mm.plugin.finder.feed.model.BaseFinderFeedLoader$feedChangeListener$1$callback$1$3$1 r13 = new com.tencent.mm.plugin.finder.feed.model.BaseFinderFeedLoader$feedChangeListener$1$callback$1$3$1
            r3 = r13
            r8 = r2
            r3.<init>(r4, r5, r6, r7, r8)
            r14 = 0
            r15 = 0
            r16 = 0
            r17 = 112(0x70, float:1.57E-43)
            r18 = 0
            r8 = r0
            p565ir.C60606n.C60607a.m70857a(r8, r9, r11, r12, r13, r14, r15, r16, r17, r18)
            rx3.b0 r0 = rx3.C13598b0.f38549a
            goto L_0x0fd6
        L_0x0200:
            com.tencent.mm.plugin.finder.feed.model.BaseFinderFeedLoader r0 = r1.this$0
            com.tencent.mm.plugin.finder.feed.model.internal.DataBuffer r0 = r0.getDataList()
            com.tencent.mm.autogen.events.FeedUpdateEvent r3 = r1.$event
            java.util.Iterator r0 = r0.iterator()
            r4 = 0
        L_0x020d:
            boolean r5 = r0.hasNext()
            if (r5 == 0) goto L_0x0238
            java.lang.Object r5 = r0.next()
            cm1.i2 r5 = (cm1.C0740i2) r5
            boolean r6 = r5 instanceof com.tencent.p014mm.plugin.finder.model.BaseFinderFeed
            if (r6 == 0) goto L_0x0231
            com.tencent.mm.plugin.finder.model.BaseFinderFeed r5 = (com.tencent.p014mm.plugin.finder.model.BaseFinderFeed) r5
            com.tencent.mm.plugin.finder.storage.FinderItem r5 = r5.mo3513o()
            long r5 = r5.getId()
            com.tencent.mm.autogen.events.FeedUpdateEvent$a r7 = r3.f9173d
            long r7 = r7.f9174a
            int r9 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r9 != 0) goto L_0x0231
            r5 = 1
            goto L_0x0232
        L_0x0231:
            r5 = 0
        L_0x0232:
            if (r5 == 0) goto L_0x0235
            goto L_0x0239
        L_0x0235:
            int r4 = r4 + 1
            goto L_0x020d
        L_0x0238:
            r4 = -1
        L_0x0239:
            com.tencent.mm.plugin.finder.feed.model.BaseFinderFeedLoader r0 = r1.this$0
            java.lang.String r0 = r0.getTAG()
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r5 = "FeedUpdateEvent TYPE_OP_COUNT_CHANGED, feedId = "
            r3.append(r5)
            com.tencent.mm.autogen.events.FeedUpdateEvent r5 = r1.$event
            com.tencent.mm.autogen.events.FeedUpdateEvent$a r5 = r5.f9173d
            long r5 = r5.f9174a
            r3.append(r5)
            java.lang.String r5 = ", index = "
            r3.append(r5)
            r3.append(r4)
            java.lang.String r3 = r3.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r3)
            r0 = -1
            if (r4 == r0) goto L_0x0fd6
            com.tencent.mm.plugin.finder.feed.model.BaseFinderFeedLoader r0 = r1.this$0
            tf1.g r0 = r0.dispatcher()
            rx3.l r3 = new rx3.l
            r5 = 12
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            r6 = 0
            r3.<init>(r5, r6)
            r5 = 1
            r0.mo13378c(r4, r5, r3)
            goto L_0x0fd6
        L_0x027c:
            com.tencent.mm.plugin.finder.feed.model.BaseFinderFeedLoader r0 = r1.this$0
            java.lang.String r0 = r0.getTAG()
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "FeedLiveListItemUpdateEvent TYPE_LIVE_LIST_ITEM_STATUS_CHANGE id:"
            r3.append(r4)
            com.tencent.mm.autogen.events.FeedUpdateEvent r4 = r1.$event
            com.tencent.mm.autogen.events.FeedUpdateEvent$a r4 = r4.f9173d
            long r7 = r4.f9174a
            r3.append(r7)
            r3.append(r9)
            com.tencent.mm.autogen.events.FeedUpdateEvent r4 = r1.$event
            com.tencent.mm.autogen.events.FeedUpdateEvent$a r4 = r4.f9173d
            r4.getClass()
            r4 = 0
            r3.append(r4)
            r3.append(r5)
            com.tencent.mm.autogen.events.FeedUpdateEvent r4 = r1.$event
            com.tencent.mm.autogen.events.FeedUpdateEvent$a r4 = r4.f9173d
            int r4 = r4.f9182i
            r3.append(r4)
            r3.append(r6)
            com.tencent.mm.autogen.events.FeedUpdateEvent r4 = r1.$event
            com.tencent.mm.autogen.events.FeedUpdateEvent$a r4 = r4.f9173d
            java.lang.String r4 = r4.f9181h
            r3.append(r4)
            java.lang.String r3 = r3.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r3)
            com.tencent.mm.plugin.finder.feed.model.BaseFinderFeedLoader r0 = r1.this$0
            com.tencent.mm.plugin.finder.feed.model.internal.DataBuffer r0 = r0.getDataList()
            java.util.Iterator r0 = r0.iterator()
            r19 = 0
        L_0x02ce:
            boolean r3 = r0.hasNext()
            if (r3 == 0) goto L_0x02e4
            java.lang.Object r3 = r0.next()
            cm1.i2 r3 = (cm1.C0740i2) r3
            boolean r3 = r3 instanceof cm1.C0707a0
            if (r3 == 0) goto L_0x02e1
            r0 = r19
            goto L_0x02e5
        L_0x02e1:
            int r19 = r19 + 1
            goto L_0x02ce
        L_0x02e4:
            r0 = -1
        L_0x02e5:
            if (r0 < 0) goto L_0x0fd6
            com.tencent.mm.plugin.finder.feed.model.BaseFinderFeedLoader r3 = r1.this$0
            com.tencent.mm.plugin.finder.feed.model.internal.DataBuffer r3 = r3.getDataList()
            java.lang.Object r3 = r3.get(r0)
            cm1.i2 r3 = (cm1.C0740i2) r3
            boolean r4 = r3 instanceof cm1.C0707a0
            if (r4 == 0) goto L_0x0fd6
            cm1.a0 r3 = (cm1.C0707a0) r3
            com.tencent.mm.autogen.events.FeedUpdateEvent r4 = r1.$event
            com.tencent.mm.autogen.events.FeedUpdateEvent$a r4 = r4.f9173d
            long r4 = r4.f9174a
            cm1.b0 r3 = r3.mo680b(r4)
            if (r3 == 0) goto L_0x0fd6
            com.tencent.mm.autogen.events.FeedUpdateEvent r4 = r1.$event
            com.tencent.mm.plugin.finder.feed.model.BaseFinderFeedLoader r5 = r1.this$0
            com.tencent.mm.protocal.protobuf.FinderObject r6 = r3.mo690a()
            if (r6 == 0) goto L_0x0312
            te3.c21 r6 = r6.liveInfo
            goto L_0x0313
        L_0x0312:
            r6 = 0
        L_0x0313:
            if (r6 != 0) goto L_0x0316
            goto L_0x031c
        L_0x0316:
            com.tencent.mm.autogen.events.FeedUpdateEvent$a r7 = r4.f9173d
            int r7 = r7.f9182i
            r6.f182394f = r7
        L_0x031c:
            java.lang.String r6 = r5.getTAG()
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.String r8 = "FeedLiveListItemUpdateEvent nickname:"
            r7.append(r8)
            com.tencent.mm.protocal.protobuf.FinderObject r3 = r3.mo690a()
            if (r3 == 0) goto L_0x0337
            com.tencent.mm.protocal.protobuf.FinderContact r3 = r3.contact
            if (r3 == 0) goto L_0x0337
            java.lang.String r14 = r3.nickname
            goto L_0x0338
        L_0x0337:
            r14 = 0
        L_0x0338:
            r7.append(r14)
            r7.append(r12)
            com.tencent.mm.autogen.events.FeedUpdateEvent$a r3 = r4.f9173d
            int r3 = r3.f9182i
            r7.append(r3)
            java.lang.String r3 = r7.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r6, r3)
            tf1.g r3 = r5.dispatcher()
            rx3.l r5 = new rx3.l
            com.tencent.mm.autogen.events.FeedUpdateEvent$a r4 = r4.f9173d
            long r6 = r4.f9174a
            java.lang.Long r4 = java.lang.Long.valueOf(r6)
            r5.<init>(r15, r4)
            r4 = 1
            r3.mo13378c(r0, r4, r5)
            r2.f27482d = r4
            rx3.b0 r0 = rx3.C13598b0.f38549a
            goto L_0x0fd6
        L_0x0367:
            com.tencent.mm.plugin.finder.feed.model.BaseFinderFeedLoader r0 = r1.this$0
            com.tencent.mm.plugin.finder.feed.model.internal.DataBuffer r0 = r0.getDataList()
            com.tencent.mm.autogen.events.FeedUpdateEvent r3 = r1.$event
            java.util.Iterator r0 = r0.iterator()
            r4 = 0
        L_0x0374:
            boolean r5 = r0.hasNext()
            if (r5 == 0) goto L_0x03a0
            java.lang.Object r5 = r0.next()
            cm1.i2 r5 = (cm1.C0740i2) r5
            boolean r6 = r5 instanceof com.tencent.p014mm.plugin.finder.model.BaseFinderFeed
            if (r6 == 0) goto L_0x0398
            com.tencent.mm.plugin.finder.model.BaseFinderFeed r5 = (com.tencent.p014mm.plugin.finder.model.BaseFinderFeed) r5
            com.tencent.mm.plugin.finder.storage.FinderItem r5 = r5.mo3513o()
            long r5 = r5.getId()
            com.tencent.mm.autogen.events.FeedUpdateEvent$a r7 = r3.f9173d
            long r11 = r7.f9174a
            int r7 = (r5 > r11 ? 1 : (r5 == r11 ? 0 : -1))
            if (r7 != 0) goto L_0x0398
            r5 = 1
            goto L_0x0399
        L_0x0398:
            r5 = 0
        L_0x0399:
            if (r5 == 0) goto L_0x039d
            r0 = -1
            goto L_0x03a2
        L_0x039d:
            int r4 = r4 + 1
            goto L_0x0374
        L_0x03a0:
            r0 = -1
            r4 = -1
        L_0x03a2:
            if (r4 == r0) goto L_0x0fd6
            com.tencent.mm.plugin.finder.feed.model.BaseFinderFeedLoader r0 = r1.this$0
            com.tencent.mm.plugin.finder.feed.model.internal.DataBuffer r0 = r0.getDataList()
            java.lang.Object r0 = r0.get(r4)
            boolean r3 = r0 instanceof com.tencent.p014mm.plugin.finder.model.BaseFinderFeed
            if (r3 == 0) goto L_0x03b5
            com.tencent.mm.plugin.finder.model.BaseFinderFeed r0 = (com.tencent.p014mm.plugin.finder.model.BaseFinderFeed) r0
            goto L_0x03b6
        L_0x03b5:
            r0 = 0
        L_0x03b6:
            if (r0 == 0) goto L_0x03d1
            com.tencent.mm.plugin.finder.storage.FinderItem r0 = r0.mo3513o()
            if (r0 == 0) goto L_0x03d1
            com.tencent.mm.protocal.protobuf.FinderObject r0 = r0.getFeedObject()
            if (r0 == 0) goto L_0x03d1
            int r0 = r0.adFlag
            com.tencent.mm.autogen.events.FeedUpdateEvent r3 = r1.$event
            com.tencent.mm.autogen.events.FeedUpdateEvent$a r3 = r3.f9173d
            r3.getClass()
            if (r0 != 0) goto L_0x03d1
            r0 = 1
            goto L_0x03d2
        L_0x03d1:
            r0 = 0
        L_0x03d2:
            if (r0 != 0) goto L_0x0fd6
            com.tencent.mm.plugin.finder.feed.model.BaseFinderFeedLoader r0 = r1.this$0
            com.tencent.mm.plugin.finder.feed.model.internal.DataBuffer r0 = r0.getDataList()
            java.lang.Object r0 = r0.get(r4)
            boolean r3 = r0 instanceof com.tencent.p014mm.plugin.finder.model.BaseFinderFeed
            if (r3 == 0) goto L_0x03e5
            com.tencent.mm.plugin.finder.model.BaseFinderFeed r0 = (com.tencent.p014mm.plugin.finder.model.BaseFinderFeed) r0
            goto L_0x03e6
        L_0x03e5:
            r0 = 0
        L_0x03e6:
            if (r0 == 0) goto L_0x03f3
            com.tencent.mm.plugin.finder.storage.FinderItem r0 = r0.mo3513o()
            if (r0 == 0) goto L_0x03f3
            com.tencent.mm.protocal.protobuf.FinderObject r14 = r0.getFeedObject()
            goto L_0x03f4
        L_0x03f3:
            r14 = 0
        L_0x03f4:
            if (r14 != 0) goto L_0x03f7
            goto L_0x0401
        L_0x03f7:
            com.tencent.mm.autogen.events.FeedUpdateEvent r0 = r1.$event
            com.tencent.mm.autogen.events.FeedUpdateEvent$a r0 = r0.f9173d
            r0.getClass()
            r3 = 0
            r14.adFlag = r3
        L_0x0401:
            com.tencent.mm.plugin.finder.feed.model.BaseFinderFeedLoader r0 = r1.this$0
            tf1.g r0 = r0.dispatcher()
            rx3.l r3 = new rx3.l
            r5 = 28
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            r3.<init>(r5, r10)
            r5 = 1
            r0.mo13378c(r4, r5, r3)
            com.tencent.mm.plugin.finder.feed.model.BaseFinderFeedLoader r0 = r1.this$0
            java.lang.String r0 = r0.getTAG()
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r5 = "TYPE_FINDER_AD_STAT_CHANGED index:"
            r3.append(r5)
            r3.append(r4)
            r3.append(r8)
            com.tencent.mm.autogen.events.FeedUpdateEvent r4 = r1.$event
            com.tencent.mm.autogen.events.FeedUpdateEvent$a r4 = r4.f9173d
            long r4 = r4.f9174a
            java.lang.String r4 = o40.C61926c.m72691p(r4)
            r3.append(r4)
            java.lang.String r3 = r3.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r3)
            goto L_0x0fd6
        L_0x0442:
            r3 = 0
            com.tencent.mm.plugin.finder.feed.model.BaseFinderFeedLoader r0 = r1.this$0
            com.tencent.mm.plugin.finder.feed.model.internal.DataBuffer r0 = r0.getDataList()
            com.tencent.mm.autogen.events.FeedUpdateEvent r4 = r1.$event
            java.util.Iterator r0 = r0.iterator()
            r5 = 0
        L_0x0450:
            boolean r6 = r0.hasNext()
            if (r6 == 0) goto L_0x047c
            java.lang.Object r6 = r0.next()
            cm1.i2 r6 = (cm1.C0740i2) r6
            boolean r7 = r6 instanceof com.tencent.p014mm.plugin.finder.model.BaseFinderFeed
            if (r7 == 0) goto L_0x0474
            com.tencent.mm.plugin.finder.model.BaseFinderFeed r6 = (com.tencent.p014mm.plugin.finder.model.BaseFinderFeed) r6
            com.tencent.mm.plugin.finder.storage.FinderItem r6 = r6.mo3513o()
            long r6 = r6.getId()
            com.tencent.mm.autogen.events.FeedUpdateEvent$a r9 = r4.f9173d
            long r11 = r9.f9174a
            int r9 = (r6 > r11 ? 1 : (r6 == r11 ? 0 : -1))
            if (r9 != 0) goto L_0x0474
            r6 = 1
            goto L_0x0475
        L_0x0474:
            r6 = 0
        L_0x0475:
            if (r6 == 0) goto L_0x0479
            r0 = -1
            goto L_0x047e
        L_0x0479:
            int r5 = r5 + 1
            goto L_0x0450
        L_0x047c:
            r0 = -1
            r5 = -1
        L_0x047e:
            if (r5 == r0) goto L_0x0fd6
            com.tencent.mm.plugin.finder.feed.model.BaseFinderFeedLoader r0 = r1.this$0
            tf1.g r0 = r0.dispatcher()
            rx3.l r3 = new rx3.l
            r4 = 27
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r3.<init>(r4, r10)
            r4 = 1
            r0.mo13378c(r5, r4, r3)
            com.tencent.mm.plugin.finder.feed.model.BaseFinderFeedLoader r0 = r1.this$0
            java.lang.String r0 = r0.getTAG()
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "TYPE_FINDER_AD_SNS_INFO index:"
            r3.append(r4)
            r3.append(r5)
            r3.append(r8)
            com.tencent.mm.autogen.events.FeedUpdateEvent r4 = r1.$event
            com.tencent.mm.autogen.events.FeedUpdateEvent$a r4 = r4.f9173d
            long r4 = r4.f9174a
            java.lang.String r4 = o40.C61926c.m72691p(r4)
            r3.append(r4)
            java.lang.String r3 = r3.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r3)
            goto L_0x0fd6
        L_0x04c1:
            r3 = 0
            com.tencent.mm.plugin.finder.feed.model.BaseFinderFeedLoader r0 = r1.this$0
            com.tencent.mm.plugin.finder.feed.model.internal.DataBuffer r0 = r0.getDataList()
            com.tencent.mm.autogen.events.FeedUpdateEvent r4 = r1.$event
            java.util.Iterator r0 = r0.iterator()
            r5 = 0
        L_0x04cf:
            boolean r6 = r0.hasNext()
            if (r6 == 0) goto L_0x04fb
            java.lang.Object r6 = r0.next()
            cm1.i2 r6 = (cm1.C0740i2) r6
            boolean r7 = r6 instanceof com.tencent.p014mm.plugin.finder.model.BaseFinderFeed
            if (r7 == 0) goto L_0x04f3
            com.tencent.mm.plugin.finder.model.BaseFinderFeed r6 = (com.tencent.p014mm.plugin.finder.model.BaseFinderFeed) r6
            com.tencent.mm.plugin.finder.storage.FinderItem r6 = r6.mo3513o()
            long r6 = r6.getId()
            com.tencent.mm.autogen.events.FeedUpdateEvent$a r9 = r4.f9173d
            long r9 = r9.f9174a
            int r12 = (r6 > r9 ? 1 : (r6 == r9 ? 0 : -1))
            if (r12 != 0) goto L_0x04f3
            r6 = 1
            goto L_0x04f4
        L_0x04f3:
            r6 = 0
        L_0x04f4:
            if (r6 == 0) goto L_0x04f8
            r0 = -1
            goto L_0x04fd
        L_0x04f8:
            int r5 = r5 + 1
            goto L_0x04cf
        L_0x04fb:
            r0 = -1
            r5 = -1
        L_0x04fd:
            if (r5 == r0) goto L_0x0fd6
            com.tencent.mm.plugin.finder.feed.model.BaseFinderFeedLoader r0 = r1.this$0
            tf1.g r0 = r0.dispatcher()
            rx3.l r3 = new rx3.l
            r4 = 26
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r3.<init>(r4, r11)
            r4 = 1
            r0.mo13378c(r5, r4, r3)
            com.tencent.mm.plugin.finder.feed.model.BaseFinderFeedLoader r0 = r1.this$0
            java.lang.String r0 = r0.getTAG()
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "TYPE_FINDER_AD_MUTUAL_INFO index:"
            r3.append(r4)
            r3.append(r5)
            r3.append(r8)
            com.tencent.mm.autogen.events.FeedUpdateEvent r4 = r1.$event
            com.tencent.mm.autogen.events.FeedUpdateEvent$a r4 = r4.f9173d
            long r4 = r4.f9174a
            java.lang.String r4 = o40.C61926c.m72691p(r4)
            r3.append(r4)
            java.lang.String r3 = r3.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r3)
            goto L_0x0fd6
        L_0x0540:
            r3 = 0
            com.tencent.mm.plugin.finder.feed.model.BaseFinderFeedLoader r0 = r1.this$0
            java.lang.String r0 = r0.getTAG()
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r6 = "FeedUpdateEvent TYPE_ACTIVITY_ANTI_SPAM id:"
            r5.append(r6)
            com.tencent.mm.autogen.events.FeedUpdateEvent r6 = r1.$event
            com.tencent.mm.autogen.events.FeedUpdateEvent$a r6 = r6.f9173d
            long r6 = r6.f9174a
            r5.append(r6)
            java.lang.String r5 = r5.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r5)
            com.tencent.mm.autogen.events.FeedUpdateEvent r0 = r1.$event
            com.tencent.mm.autogen.events.FeedUpdateEvent$a r0 = r0.f9173d
            long r5 = r0.f9174a
            int r0 = (r5 > r25 ? 1 : (r5 == r25 ? 0 : -1))
            if (r0 == 0) goto L_0x0fd6
            com.tencent.mm.plugin.finder.feed.model.BaseFinderFeedLoader r0 = r1.this$0
            com.tencent.mm.plugin.finder.feed.model.internal.DataBuffer r0 = r0.getDataList()
            com.tencent.mm.autogen.events.FeedUpdateEvent r5 = r1.$event
            java.util.Iterator r0 = r0.iterator()
            r6 = 0
        L_0x0578:
            boolean r7 = r0.hasNext()
            if (r7 == 0) goto L_0x05a4
            java.lang.Object r7 = r0.next()
            cm1.i2 r7 = (cm1.C0740i2) r7
            boolean r8 = r7 instanceof com.tencent.p014mm.plugin.finder.model.BaseFinderFeed
            if (r8 == 0) goto L_0x059c
            com.tencent.mm.plugin.finder.model.BaseFinderFeed r7 = (com.tencent.p014mm.plugin.finder.model.BaseFinderFeed) r7
            com.tencent.mm.plugin.finder.storage.FinderItem r7 = r7.mo3513o()
            long r7 = r7.getId()
            com.tencent.mm.autogen.events.FeedUpdateEvent$a r9 = r5.f9173d
            long r9 = r9.f9174a
            int r11 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r11 != 0) goto L_0x059c
            r7 = 1
            goto L_0x059d
        L_0x059c:
            r7 = 0
        L_0x059d:
            if (r7 == 0) goto L_0x05a1
            r0 = -1
            goto L_0x05a6
        L_0x05a1:
            int r6 = r6 + 1
            goto L_0x0578
        L_0x05a4:
            r0 = -1
            r6 = -1
        L_0x05a6:
            if (r6 == r0) goto L_0x0fd6
            com.tencent.mm.plugin.finder.feed.model.BaseFinderFeedLoader r0 = r1.this$0
            com.tencent.mm.plugin.finder.feed.model.internal.DataBuffer r0 = r0.getDataList()
            java.lang.Object r0 = r0.get(r6)
            gy3.C87412m.m108592e(r0, r4)
            com.tencent.mm.plugin.finder.model.BaseFinderFeed r0 = (com.tencent.p014mm.plugin.finder.model.BaseFinderFeed) r0
            com.tencent.mm.autogen.events.FeedUpdateEvent r3 = r1.$event
            com.tencent.mm.autogen.events.FeedUpdateEvent$a r3 = r3.f9173d
            int r3 = r3.f9177d
            r4 = 1
            if (r3 != r4) goto L_0x05f1
            com.tencent.mm.plugin.finder.storage.FinderItem r3 = r0.mo3513o()
            com.tencent.mm.protocal.protobuf.FinderObject r3 = r3.getFeedObject()
            com.tencent.mm.protocal.protobuf.FinderObjectDesc r3 = r3.objectDesc
            if (r3 == 0) goto L_0x05e1
            te3.ef1 r3 = r3.event
            if (r3 == 0) goto L_0x05e1
            com.tencent.mm.plugin.finder.feed.model.BaseFinderFeedLoader r4 = r1.this$0
            r3.f132899e = r13
            r3.f132900f = r13
            java.lang.String r3 = r4.getTAG()
            java.lang.String r4 = "TYPE_ACTIVITY_ANTI_SPAM value changed"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r3, r4)
            rx3.b0 r3 = rx3.C13598b0.f38549a
        L_0x05e1:
            com.tencent.mm.plugin.finder.feed.model.BaseFinderFeedLoader r3 = r1.this$0
            tf1.g r3 = r3.dispatcher()
            r4 = 1
            r3.mo13377b(r6, r4)
            com.tencent.mm.plugin.finder.feed.model.BaseFinderFeedLoader r3 = r1.this$0
            r3.updateFinderPageItem(r0)
            goto L_0x05fa
        L_0x05f1:
            com.tencent.mm.plugin.finder.feed.model.BaseFinderFeedLoader r0 = r1.this$0
            tf1.g r0 = r0.dispatcher()
            r0.mo13377b(r6, r4)
        L_0x05fa:
            r2.f27482d = r4
            goto L_0x0fd6
        L_0x05fe:
            r3 = 0
            com.tencent.mm.plugin.finder.feed.model.BaseFinderFeedLoader r0 = r1.this$0
            java.lang.String r0 = r0.getTAG()
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.String r8 = "FeedUpdateEvent TYPE_ACTIVITY_REMOVED id:"
            r7.append(r8)
            com.tencent.mm.autogen.events.FeedUpdateEvent r8 = r1.$event
            com.tencent.mm.autogen.events.FeedUpdateEvent$a r8 = r8.f9173d
            long r8 = r8.f9174a
            r7.append(r8)
            r7.append(r6)
            com.tencent.mm.autogen.events.FeedUpdateEvent r6 = r1.$event
            com.tencent.mm.autogen.events.FeedUpdateEvent$a r6 = r6.f9173d
            java.lang.String r6 = r6.f9181h
            r7.append(r6)
            r7.append(r5)
            com.tencent.mm.autogen.events.FeedUpdateEvent r5 = r1.$event
            com.tencent.mm.autogen.events.FeedUpdateEvent$a r5 = r5.f9173d
            int r5 = r5.f9182i
            r7.append(r5)
            java.lang.String r5 = r7.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r5)
            com.tencent.mm.autogen.events.FeedUpdateEvent r0 = r1.$event
            com.tencent.mm.autogen.events.FeedUpdateEvent$a r0 = r0.f9173d
            long r5 = r0.f9174a
            int r0 = (r5 > r25 ? 1 : (r5 == r25 ? 0 : -1))
            if (r0 == 0) goto L_0x0fd6
            com.tencent.mm.plugin.finder.feed.model.BaseFinderFeedLoader r0 = r1.this$0
            com.tencent.mm.plugin.finder.feed.model.internal.DataBuffer r0 = r0.getDataList()
            com.tencent.mm.autogen.events.FeedUpdateEvent r5 = r1.$event
            java.util.Iterator r0 = r0.iterator()
            r6 = 0
        L_0x064e:
            boolean r7 = r0.hasNext()
            if (r7 == 0) goto L_0x067a
            java.lang.Object r7 = r0.next()
            cm1.i2 r7 = (cm1.C0740i2) r7
            boolean r8 = r7 instanceof com.tencent.p014mm.plugin.finder.model.BaseFinderFeed
            if (r8 == 0) goto L_0x0672
            com.tencent.mm.plugin.finder.model.BaseFinderFeed r7 = (com.tencent.p014mm.plugin.finder.model.BaseFinderFeed) r7
            com.tencent.mm.plugin.finder.storage.FinderItem r7 = r7.mo3513o()
            long r7 = r7.getId()
            com.tencent.mm.autogen.events.FeedUpdateEvent$a r9 = r5.f9173d
            long r9 = r9.f9174a
            int r11 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r11 != 0) goto L_0x0672
            r7 = 1
            goto L_0x0673
        L_0x0672:
            r7 = 0
        L_0x0673:
            if (r7 == 0) goto L_0x0677
            r0 = -1
            goto L_0x067c
        L_0x0677:
            int r6 = r6 + 1
            goto L_0x064e
        L_0x067a:
            r0 = -1
            r6 = -1
        L_0x067c:
            if (r6 == r0) goto L_0x0fd6
            com.tencent.mm.plugin.finder.feed.model.BaseFinderFeedLoader r0 = r1.this$0
            com.tencent.mm.plugin.finder.feed.model.internal.DataBuffer r0 = r0.getDataList()
            java.lang.Object r0 = r0.get(r6)
            gy3.C87412m.m108592e(r0, r4)
            com.tencent.mm.plugin.finder.model.BaseFinderFeed r0 = (com.tencent.p014mm.plugin.finder.model.BaseFinderFeed) r0
            com.tencent.mm.autogen.events.FeedUpdateEvent r3 = r1.$event
            com.tencent.mm.autogen.events.FeedUpdateEvent$a r3 = r3.f9173d
            int r3 = r3.f9177d
            r4 = 1
            if (r3 != r4) goto L_0x06b5
            com.tencent.mm.plugin.finder.storage.FinderItem r3 = r0.mo3513o()
            com.tencent.mm.protocal.protobuf.FinderObject r3 = r3.getFeedObject()
            com.tencent.mm.protocal.protobuf.FinderObjectDesc r3 = r3.objectDesc
            if (r3 != 0) goto L_0x06a3
            goto L_0x06a6
        L_0x06a3:
            r5 = 0
            r3.event = r5
        L_0x06a6:
            com.tencent.mm.plugin.finder.feed.model.BaseFinderFeedLoader r3 = r1.this$0
            tf1.g r3 = r3.dispatcher()
            r3.mo13377b(r6, r4)
            com.tencent.mm.plugin.finder.feed.model.BaseFinderFeedLoader r3 = r1.this$0
            r3.updateFinderPageItem(r0)
            goto L_0x06be
        L_0x06b5:
            com.tencent.mm.plugin.finder.feed.model.BaseFinderFeedLoader r0 = r1.this$0
            tf1.g r0 = r0.dispatcher()
            r0.mo13377b(r6, r4)
        L_0x06be:
            r2.f27482d = r4
            goto L_0x0fd6
        L_0x06c2:
            r3 = 0
            java.lang.Class<tf0.q1> r0 = tf0.C13887q1.class
            di3.d r0 = di3.C86312j.m106911c(r0)
            tf0.q1 r0 = (tf0.C13887q1) r0
            com.tencent.mm.autogen.events.FeedUpdateEvent r4 = r1.$event
            com.tencent.mm.autogen.events.FeedUpdateEvent$a r4 = r4.f9173d
            java.lang.String r4 = r4.f9181h
            gy3.C87412m.m108593f(r4, r14)
            java.util.List r0 = r0.mo13331Ut(r4)
            com.tencent.mm.plugin.finder.feed.model.BaseFinderFeedLoader r4 = r1.this$0
            com.tencent.mm.autogen.events.FeedUpdateEvent r5 = r1.$event
            java.util.Iterator r0 = r0.iterator()
        L_0x06e0:
            boolean r6 = r0.hasNext()
            if (r6 == 0) goto L_0x0fd6
            java.lang.Object r6 = r0.next()
            java.lang.String r6 = (java.lang.String) r6
            com.tencent.mm.plugin.finder.feed.model.internal.DataBuffer r7 = r4.getDataList()
            java.util.Iterator r7 = r7.iterator()
            r8 = 0
        L_0x06f5:
            boolean r9 = r7.hasNext()
            if (r9 == 0) goto L_0x06e0
            java.lang.Object r9 = r7.next()
            int r10 = r8 + 1
            if (r8 < 0) goto L_0x0755
            cm1.i2 r9 = (cm1.C0740i2) r9
            int r11 = r6.length()
            if (r11 <= 0) goto L_0x070d
            r11 = 1
            goto L_0x070e
        L_0x070d:
            r11 = 0
        L_0x070e:
            if (r11 == 0) goto L_0x0753
            boolean r11 = r9 instanceof com.tencent.p014mm.plugin.finder.model.BaseFinderFeed
            if (r11 == 0) goto L_0x0753
            com.tencent.mm.plugin.finder.model.BaseFinderFeed r9 = (com.tencent.p014mm.plugin.finder.model.BaseFinderFeed) r9
            fe1.q r9 = r9.mo3507l()
            if (r9 == 0) goto L_0x0721
            java.lang.String r9 = r9.getUsername()
            goto L_0x0722
        L_0x0721:
            r9 = 0
        L_0x0722:
            boolean r9 = gy3.C87412m.m108589b(r9, r6)
            if (r9 == 0) goto L_0x0753
            tf1.g r9 = r4.dispatcher()
            rx3.l r11 = new rx3.l
            r12 = 8
            java.lang.Integer r12 = java.lang.Integer.valueOf(r12)
            r11.<init>(r12, r5)
            r12 = 1
            r9.mo13378c(r8, r12, r11)
            java.lang.String r8 = r4.getTAG()
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            java.lang.String r11 = "TYPE_FEED_LIVE_NOTICE username:"
            r9.append(r11)
            r9.append(r6)
            java.lang.String r9 = r9.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r8, r9)
        L_0x0753:
            r8 = r10
            goto L_0x06f5
        L_0x0755:
            sx3.C64197v.m75542k()
            r2 = 0
            throw r2
        L_0x075a:
            r3 = 0
            com.tencent.mm.plugin.finder.feed.model.BaseFinderFeedLoader r0 = r1.this$0
            java.lang.String r0 = r0.getTAG()
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r8 = "FeedUpdateEvent TYPE_LIVE_STREAM_CHANGE id:"
            r4.append(r8)
            com.tencent.mm.autogen.events.FeedUpdateEvent r8 = r1.$event
            com.tencent.mm.autogen.events.FeedUpdateEvent$a r8 = r8.f9173d
            long r10 = r8.f9174a
            r4.append(r10)
            r4.append(r9)
            com.tencent.mm.autogen.events.FeedUpdateEvent r8 = r1.$event
            com.tencent.mm.autogen.events.FeedUpdateEvent$a r8 = r8.f9173d
            r8.getClass()
            r8 = 0
            r4.append(r8)
            r4.append(r5)
            com.tencent.mm.autogen.events.FeedUpdateEvent r5 = r1.$event
            com.tencent.mm.autogen.events.FeedUpdateEvent$a r5 = r5.f9173d
            int r5 = r5.f9182i
            r4.append(r5)
            r4.append(r6)
            com.tencent.mm.autogen.events.FeedUpdateEvent r5 = r1.$event
            com.tencent.mm.autogen.events.FeedUpdateEvent$a r5 = r5.f9173d
            java.lang.String r5 = r5.f9181h
            r4.append(r5)
            java.lang.String r4 = r4.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r4)
            com.tencent.mm.autogen.events.FeedUpdateEvent r0 = r1.$event
            com.tencent.mm.autogen.events.FeedUpdateEvent$a r0 = r0.f9173d
            int r0 = r0.f9177d
            r4 = 1
            if (r0 != r4) goto L_0x081c
            com.tencent.mm.plugin.finder.feed.model.BaseFinderFeedLoader r0 = r1.this$0
            com.tencent.mm.plugin.finder.feed.model.internal.DataBuffer r0 = r0.getDataList()
            com.tencent.mm.autogen.events.FeedUpdateEvent r4 = r1.$event
            java.util.Iterator r0 = r0.iterator()
            r5 = 0
        L_0x07b7:
            boolean r6 = r0.hasNext()
            if (r6 == 0) goto L_0x07df
            java.lang.Object r6 = r0.next()
            cm1.i2 r6 = (cm1.C0740i2) r6
            boolean r8 = r6 instanceof cm1.C0707a0
            if (r8 == 0) goto L_0x07d7
            cm1.a0 r6 = (cm1.C0707a0) r6
            long r8 = r6.mo682i()
            com.tencent.mm.autogen.events.FeedUpdateEvent$a r6 = r4.f9173d
            long r10 = r6.f9174a
            int r6 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r6 != 0) goto L_0x07d7
            r6 = 1
            goto L_0x07d8
        L_0x07d7:
            r6 = 0
        L_0x07d8:
            if (r6 == 0) goto L_0x07dc
            r15 = r5
            goto L_0x07e0
        L_0x07dc:
            int r5 = r5 + 1
            goto L_0x07b7
        L_0x07df:
            r15 = -1
        L_0x07e0:
            if (r15 < 0) goto L_0x081c
            com.tencent.mm.plugin.finder.feed.model.BaseFinderFeedLoader r0 = r1.this$0
            com.tencent.mm.plugin.finder.feed.model.internal.DataBuffer r0 = r0.getDataList()
            java.lang.Object r0 = r0.get(r15)
            cm1.i2 r0 = (cm1.C0740i2) r0
            boolean r4 = r0 instanceof cm1.C0707a0
            if (r4 == 0) goto L_0x07f5
            cm1.a0 r0 = (cm1.C0707a0) r0
            goto L_0x07f6
        L_0x07f5:
            r0 = 0
        L_0x07f6:
            if (r0 == 0) goto L_0x0819
            com.tencent.mm.plugin.finder.feed.model.BaseFinderFeedLoader r0 = r1.this$0
            com.tencent.mm.autogen.events.FeedUpdateEvent r4 = r1.$event
            tf1.g r0 = r0.dispatcher()
            rx3.l r5 = new rx3.l
            r6 = 2
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            com.tencent.mm.autogen.events.FeedUpdateEvent$a r4 = r4.f9173d
            long r8 = r4.f9174a
            java.lang.Long r4 = java.lang.Long.valueOf(r8)
            r5.<init>(r6, r4)
            r4 = 1
            r0.mo13378c(r15, r4, r5)
            rx3.b0 r0 = rx3.C13598b0.f38549a
            goto L_0x081a
        L_0x0819:
            r4 = 1
        L_0x081a:
            r2.f27482d = r4
        L_0x081c:
            com.tencent.mm.autogen.events.FeedUpdateEvent r0 = r1.$event
            com.tencent.mm.autogen.events.FeedUpdateEvent$a r0 = r0.f9173d
            java.lang.String r0 = r0.f9181h
            gy3.C87412m.m108593f(r0, r14)
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            org.json.JSONArray r5 = new org.json.JSONArray     // Catch:{ Exception -> 0x0843 }
            r5.<init>(r0)     // Catch:{ Exception -> 0x0843 }
            int r0 = r5.length()     // Catch:{ Exception -> 0x0843 }
            r6 = 0
        L_0x0834:
            if (r6 >= r0) goto L_0x084d
            java.lang.String r8 = r5.optString(r6)     // Catch:{ Exception -> 0x0843 }
            if (r8 != 0) goto L_0x083d
            r8 = r13
        L_0x083d:
            r4.add(r8)     // Catch:{ Exception -> 0x0843 }
            int r6 = r6 + 1
            goto L_0x0834
        L_0x0843:
            r0 = move-exception
            java.lang.String r0 = r0.getMessage()
            java.lang.String r5 = "FinderFeedLiveList"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r5, r0)
        L_0x084d:
            com.tencent.mm.plugin.finder.feed.model.BaseFinderFeedLoader r0 = r1.this$0
            com.tencent.mm.autogen.events.FeedUpdateEvent r5 = r1.$event
            java.util.Iterator r4 = r4.iterator()
        L_0x0855:
            boolean r6 = r4.hasNext()
            if (r6 == 0) goto L_0x0fd6
            java.lang.Object r6 = r4.next()
            java.lang.String r6 = (java.lang.String) r6
            com.tencent.mm.plugin.finder.feed.model.internal.DataBuffer r8 = r0.getDataList()
            java.util.Iterator r8 = r8.iterator()
            r9 = 0
        L_0x086a:
            boolean r10 = r8.hasNext()
            if (r10 == 0) goto L_0x0855
            java.lang.Object r10 = r8.next()
            int r11 = r9 + 1
            if (r9 < 0) goto L_0x092b
            cm1.i2 r10 = (cm1.C0740i2) r10
            int r12 = r6.length()
            if (r12 <= 0) goto L_0x0882
            r12 = 1
            goto L_0x0883
        L_0x0882:
            r12 = 0
        L_0x0883:
            if (r12 == 0) goto L_0x0919
            boolean r12 = r10 instanceof com.tencent.p014mm.plugin.finder.model.BaseFinderFeed
            if (r12 == 0) goto L_0x0919
            r12 = r10
            com.tencent.mm.plugin.finder.model.BaseFinderFeed r12 = (com.tencent.p014mm.plugin.finder.model.BaseFinderFeed) r12
            fe1.q r13 = r12.mo3507l()
            if (r13 == 0) goto L_0x0897
            java.lang.String r13 = r13.getUsername()
            goto L_0x0898
        L_0x0897:
            r13 = 0
        L_0x0898:
            boolean r13 = gy3.C87412m.m108589b(r13, r6)
            if (r13 == 0) goto L_0x0919
            fe1.q r13 = r12.mo3507l()
            if (r13 == 0) goto L_0x08ac
            com.tencent.mm.autogen.events.FeedUpdateEvent$a r14 = r5.f9173d
            int r14 = r14.f9182i
            r13.field_liveStatus = r14
            rx3.b0 r13 = rx3.C13598b0.f38549a
        L_0x08ac:
            com.tencent.mm.plugin.finder.storage.FinderItem r13 = r12.mo3513o()
            com.tencent.mm.protocal.protobuf.FinderObject r13 = r13.getFeedObject()
            com.tencent.mm.protocal.protobuf.FinderContact r13 = r13.contact
            if (r13 == 0) goto L_0x08c0
            com.tencent.mm.autogen.events.FeedUpdateEvent$a r14 = r5.f9173d
            int r14 = r14.f9182i
            r13.liveStatus = r14
            rx3.b0 r13 = rx3.C13598b0.f38549a
        L_0x08c0:
            tf1.g r13 = r0.dispatcher()
            rx3.l r14 = new rx3.l
            r14.<init>(r7, r5)
            r15 = 1
            r13.mo13378c(r9, r15, r14)
            r0.updateFinderPageItem(r12)
            java.lang.String r9 = r0.getTAG()
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            r13.<init>()
            java.lang.String r14 = "FeedUpdateEvent username:"
            r13.append(r14)
            r13.append(r6)
            r14 = r24
            r13.append(r14)
            fe1.q r12 = r12.mo3507l()
            if (r12 == 0) goto L_0x08f1
            java.lang.String r12 = r12.getNickname()
            goto L_0x08f2
        L_0x08f1:
            r12 = 0
        L_0x08f2:
            r13.append(r12)
            r15 = r23
            r13.append(r15)
            r12 = r4
            long r3 = r10.getItemId()
            r13.append(r3)
            r3 = r22
            r13.append(r3)
            com.tencent.mm.autogen.events.FeedUpdateEvent$a r4 = r5.f9173d
            int r4 = r4.f9182i
            r13.append(r4)
            java.lang.String r4 = r13.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r9, r4)
            r4 = 1
            r2.f27482d = r4
            goto L_0x0920
        L_0x0919:
            r12 = r4
            r3 = r22
            r15 = r23
            r14 = r24
        L_0x0920:
            r22 = r3
            r9 = r11
            r4 = r12
            r24 = r14
            r23 = r15
            r3 = 0
            goto L_0x086a
        L_0x092b:
            sx3.C64197v.m75542k()
            r2 = 0
            throw r2
        L_0x0930:
            r3 = r22
            r15 = r23
            r14 = r24
            com.tencent.mm.plugin.finder.feed.model.BaseFinderFeedLoader r0 = r1.this$0
            java.lang.String r0 = r0.getTAG()
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r8 = "FeedUpdateEvent TYPE_LIVE_CHANGE id:"
            r4.append(r8)
            com.tencent.mm.autogen.events.FeedUpdateEvent r8 = r1.$event
            com.tencent.mm.autogen.events.FeedUpdateEvent$a r8 = r8.f9173d
            long r8 = r8.f9174a
            r4.append(r8)
            r4.append(r6)
            com.tencent.mm.autogen.events.FeedUpdateEvent r6 = r1.$event
            com.tencent.mm.autogen.events.FeedUpdateEvent$a r6 = r6.f9173d
            java.lang.String r6 = r6.f9181h
            r4.append(r6)
            r4.append(r5)
            com.tencent.mm.autogen.events.FeedUpdateEvent r5 = r1.$event
            com.tencent.mm.autogen.events.FeedUpdateEvent$a r5 = r5.f9173d
            int r5 = r5.f9182i
            r4.append(r5)
            java.lang.String r4 = r4.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r4)
            com.tencent.mm.autogen.events.FeedUpdateEvent r0 = r1.$event
            com.tencent.mm.autogen.events.FeedUpdateEvent$a r0 = r0.f9173d
            long r4 = r0.f9174a
            int r6 = (r4 > r25 ? 1 : (r4 == r25 ? 0 : -1))
            if (r6 == 0) goto L_0x0fd6
            int r0 = r0.f9177d
            r4 = 1
            if (r0 != r4) goto L_0x0fd6
            com.tencent.mm.plugin.finder.feed.model.BaseFinderFeedLoader r0 = r1.this$0
            com.tencent.mm.plugin.finder.feed.model.internal.DataBuffer r0 = r0.getDataList()
            com.tencent.mm.autogen.events.FeedUpdateEvent r4 = r1.$event
            java.util.Iterator r0 = r0.iterator()
            r5 = 0
        L_0x098a:
            boolean r6 = r0.hasNext()
            if (r6 == 0) goto L_0x09be
            java.lang.Object r6 = r0.next()
            cm1.i2 r6 = (cm1.C0740i2) r6
            boolean r8 = r6 instanceof cm1.C0797z
            if (r8 == 0) goto L_0x09b7
            cm1.z r6 = (cm1.C0797z) r6
            com.tencent.mm.plugin.finder.storage.FinderItem r6 = r6.mo3513o()
            te3.c21 r6 = r6.getLiveInfo()
            if (r6 == 0) goto L_0x09b2
            long r8 = r6.f182392d
            com.tencent.mm.autogen.events.FeedUpdateEvent$a r6 = r4.f9173d
            long r10 = r6.f9174a
            int r6 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r6 != 0) goto L_0x09b2
            r6 = 1
            goto L_0x09b3
        L_0x09b2:
            r6 = 0
        L_0x09b3:
            if (r6 == 0) goto L_0x09b7
            r6 = 1
            goto L_0x09b8
        L_0x09b7:
            r6 = 0
        L_0x09b8:
            if (r6 == 0) goto L_0x09bb
            goto L_0x09bf
        L_0x09bb:
            int r5 = r5 + 1
            goto L_0x098a
        L_0x09be:
            r5 = -1
        L_0x09bf:
            if (r5 < 0) goto L_0x09fb
            com.tencent.mm.plugin.finder.feed.model.BaseFinderFeedLoader r0 = r1.this$0
            com.tencent.mm.plugin.finder.feed.model.internal.DataBuffer r0 = r0.getDataList()
            java.lang.Object r0 = r0.get(r5)
            cm1.i2 r0 = (cm1.C0740i2) r0
            boolean r4 = r0 instanceof cm1.C0797z
            if (r4 == 0) goto L_0x09d5
            r6 = r0
            cm1.z r6 = (cm1.C0797z) r6
            goto L_0x09d6
        L_0x09d5:
            r6 = 0
        L_0x09d6:
            if (r6 == 0) goto L_0x09f8
            com.tencent.mm.autogen.events.FeedUpdateEvent r0 = r1.$event
            com.tencent.mm.plugin.finder.feed.model.BaseFinderFeedLoader r4 = r1.this$0
            com.tencent.mm.plugin.finder.storage.FinderItem r6 = r6.mo3513o()
            te3.c21 r6 = r6.getLiveInfo()
            if (r6 != 0) goto L_0x09e7
            goto L_0x09ed
        L_0x09e7:
            com.tencent.mm.autogen.events.FeedUpdateEvent$a r0 = r0.f9173d
            int r0 = r0.f9182i
            r6.f182394f = r0
        L_0x09ed:
            tf1.g r0 = r4.dispatcher()
            r4 = 1
            r0.mo13377b(r5, r4)
            rx3.b0 r0 = rx3.C13598b0.f38549a
            goto L_0x09f9
        L_0x09f8:
            r4 = 1
        L_0x09f9:
            r2.f27482d = r4
        L_0x09fb:
            com.tencent.mm.plugin.finder.feed.model.BaseFinderFeedLoader r0 = r1.this$0
            com.tencent.mm.plugin.finder.feed.model.internal.DataBuffer r0 = r0.getDataList()
            java.util.Iterator r0 = r0.iterator()
            r4 = 0
        L_0x0a06:
            boolean r5 = r0.hasNext()
            if (r5 == 0) goto L_0x0a1a
            java.lang.Object r5 = r0.next()
            cm1.i2 r5 = (cm1.C0740i2) r5
            boolean r5 = r5 instanceof cm1.C0707a0
            if (r5 == 0) goto L_0x0a17
            goto L_0x0a1b
        L_0x0a17:
            int r4 = r4 + 1
            goto L_0x0a06
        L_0x0a1a:
            r4 = -1
        L_0x0a1b:
            if (r4 < 0) goto L_0x0ab4
            com.tencent.mm.plugin.finder.feed.model.BaseFinderFeedLoader r0 = r1.this$0
            com.tencent.mm.plugin.finder.feed.model.internal.DataBuffer r0 = r0.getDataList()
            java.lang.Object r0 = r0.get(r4)
            cm1.i2 r0 = (cm1.C0740i2) r0
            boolean r5 = r0 instanceof cm1.C0707a0
            if (r5 == 0) goto L_0x0ab1
            cm1.a0 r0 = (cm1.C0707a0) r0
            com.tencent.mm.autogen.events.FeedUpdateEvent r5 = r1.$event
            com.tencent.mm.autogen.events.FeedUpdateEvent$a r5 = r5.f9173d
            long r5 = r5.f9174a
            int r5 = r0.mo679a(r5)
            if (r5 < 0) goto L_0x0ab1
            com.tencent.mm.autogen.events.FeedUpdateEvent r6 = r1.$event
            com.tencent.mm.autogen.events.FeedUpdateEvent$a r6 = r6.f9173d
            int r6 = r6.f9182i
            r8 = 2
            if (r6 != r8) goto L_0x0a4a
            r0.mo686m(r5)
            rx3.b0 r0 = rx3.C13598b0.f38549a
            goto L_0x0a58
        L_0x0a4a:
            java.util.ArrayList r0 = r0.mo681d()
            java.lang.Object r0 = r0.get(r5)
            java.lang.String r5 = "{\n                      …                        }"
            gy3.C87412m.m108593f(r0, r5)
        L_0x0a58:
            com.tencent.mm.plugin.finder.feed.model.BaseFinderFeedLoader r5 = r1.this$0
            tf1.g r5 = r5.dispatcher()
            r6 = 1
            r5.mo13377b(r4, r6)
            boolean r4 = r0 instanceof cm1.C0712b0
            if (r4 == 0) goto L_0x0ab1
            cm1.b0 r0 = (cm1.C0712b0) r0
            com.tencent.mm.protocal.protobuf.FinderObject r4 = r0.mo690a()
            if (r4 == 0) goto L_0x0a71
            te3.c21 r6 = r4.liveInfo
            goto L_0x0a72
        L_0x0a71:
            r6 = 0
        L_0x0a72:
            if (r6 != 0) goto L_0x0a75
            goto L_0x0a7d
        L_0x0a75:
            com.tencent.mm.autogen.events.FeedUpdateEvent r4 = r1.$event
            com.tencent.mm.autogen.events.FeedUpdateEvent$a r4 = r4.f9173d
            int r4 = r4.f9182i
            r6.f182394f = r4
        L_0x0a7d:
            com.tencent.mm.plugin.finder.feed.model.BaseFinderFeedLoader r4 = r1.this$0
            java.lang.String r4 = r4.getTAG()
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r6 = "FeedUpdateEvent nickname:"
            r5.append(r6)
            com.tencent.mm.protocal.protobuf.FinderObject r0 = r0.mo690a()
            if (r0 == 0) goto L_0x0a9a
            com.tencent.mm.protocal.protobuf.FinderContact r0 = r0.contact
            if (r0 == 0) goto L_0x0a9a
            java.lang.String r6 = r0.nickname
            goto L_0x0a9b
        L_0x0a9a:
            r6 = 0
        L_0x0a9b:
            r5.append(r6)
            r5.append(r12)
            com.tencent.mm.autogen.events.FeedUpdateEvent r0 = r1.$event
            com.tencent.mm.autogen.events.FeedUpdateEvent$a r0 = r0.f9173d
            int r0 = r0.f9182i
            r5.append(r0)
            java.lang.String r0 = r5.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r4, r0)
        L_0x0ab1:
            r4 = 1
            r2.f27482d = r4
        L_0x0ab4:
            com.tencent.mm.autogen.events.FeedUpdateEvent r0 = r1.$event
            com.tencent.mm.autogen.events.FeedUpdateEvent$a r0 = r0.f9173d
            java.lang.String r0 = r0.f9181h
            boolean r4 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r0)
            if (r4 == 0) goto L_0x0ac1
            return
        L_0x0ac1:
            com.tencent.mm.plugin.finder.feed.model.BaseFinderFeedLoader r4 = r1.this$0
            com.tencent.mm.plugin.finder.feed.model.internal.DataBuffer r4 = r4.getDataList()
            com.tencent.mm.plugin.finder.feed.model.BaseFinderFeedLoader r5 = r1.this$0
            com.tencent.mm.autogen.events.FeedUpdateEvent r6 = r1.$event
            java.util.Iterator r4 = r4.iterator()
            r12 = 0
        L_0x0ad0:
            boolean r8 = r4.hasNext()
            if (r8 == 0) goto L_0x0fd6
            java.lang.Object r8 = r4.next()
            int r9 = r12 + 1
            if (r12 < 0) goto L_0x0b76
            cm1.i2 r8 = (cm1.C0740i2) r8
            boolean r10 = r8 instanceof com.tencent.p014mm.plugin.finder.model.BaseFinderFeed
            if (r10 == 0) goto L_0x0b6f
            r10 = r8
            com.tencent.mm.plugin.finder.model.BaseFinderFeed r10 = (com.tencent.p014mm.plugin.finder.model.BaseFinderFeed) r10
            fe1.q r11 = r10.mo3507l()
            if (r11 == 0) goto L_0x0af2
            java.lang.String r11 = r11.getUsername()
            goto L_0x0af3
        L_0x0af2:
            r11 = 0
        L_0x0af3:
            boolean r11 = gy3.C87412m.m108589b(r11, r0)
            if (r11 == 0) goto L_0x0b6f
            fe1.q r11 = r10.mo3507l()
            if (r11 == 0) goto L_0x0b07
            com.tencent.mm.autogen.events.FeedUpdateEvent$a r13 = r6.f9173d
            int r13 = r13.f9182i
            r11.field_liveStatus = r13
            rx3.b0 r11 = rx3.C13598b0.f38549a
        L_0x0b07:
            com.tencent.mm.plugin.finder.storage.FinderItem r11 = r10.mo3513o()
            com.tencent.mm.protocal.protobuf.FinderObject r11 = r11.getFeedObject()
            com.tencent.mm.protocal.protobuf.FinderContact r11 = r11.contact
            if (r11 == 0) goto L_0x0b1b
            com.tencent.mm.autogen.events.FeedUpdateEvent$a r13 = r6.f9173d
            int r13 = r13.f9182i
            r11.liveStatus = r13
            rx3.b0 r11 = rx3.C13598b0.f38549a
        L_0x0b1b:
            tf1.g r11 = r5.dispatcher()
            rx3.l r13 = new rx3.l
            r13.<init>(r7, r6)
            r16 = r4
            r4 = 1
            r11.mo13378c(r12, r4, r13)
            r5.updateFinderPageItem(r10)
            java.lang.String r4 = r5.getTAG()
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            java.lang.String r12 = "FeedUpdateEvent TYPE_LIVE_CHANGE username:"
            r11.append(r12)
            r11.append(r0)
            r11.append(r14)
            fe1.q r10 = r10.mo3507l()
            if (r10 == 0) goto L_0x0b4c
            java.lang.String r10 = r10.getNickname()
            goto L_0x0b4d
        L_0x0b4c:
            r10 = 0
        L_0x0b4d:
            r11.append(r10)
            r11.append(r15)
            long r12 = r8.getItemId()
            r11.append(r12)
            r11.append(r3)
            com.tencent.mm.autogen.events.FeedUpdateEvent$a r8 = r6.f9173d
            int r8 = r8.f9182i
            r11.append(r8)
            java.lang.String r8 = r11.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r4, r8)
            r4 = 1
            r2.f27482d = r4
            goto L_0x0b71
        L_0x0b6f:
            r16 = r4
        L_0x0b71:
            r12 = r9
            r4 = r16
            goto L_0x0ad0
        L_0x0b76:
            sx3.C64197v.m75542k()
            r2 = 0
            throw r2
        L_0x0b7b:
            long r3 = r0.f9174a
            int r0 = (r3 > r25 ? 1 : (r3 == r25 ? 0 : -1))
            if (r0 == 0) goto L_0x0fd6
            te3.hj1 r0 = r1.$contextObj
            if (r0 == 0) goto L_0x0b8d
            int r3 = r0.f134675i
            r4 = 17
            if (r3 != r4) goto L_0x0b8d
            r3 = 1
            goto L_0x0b8e
        L_0x0b8d:
            r3 = 0
        L_0x0b8e:
            r4 = 6
            if (r3 != 0) goto L_0x0bea
            if (r0 == 0) goto L_0x0b9b
            int r3 = r0.f134675i
            r5 = 18
            if (r3 != r5) goto L_0x0b9b
            r3 = 1
            goto L_0x0b9c
        L_0x0b9b:
            r3 = 0
        L_0x0b9c:
            if (r3 != 0) goto L_0x0bea
            if (r0 == 0) goto L_0x0ba8
            int r3 = r0.f134675i
            r5 = 20
            if (r3 != r5) goto L_0x0ba8
            r3 = 1
            goto L_0x0ba9
        L_0x0ba8:
            r3 = 0
        L_0x0ba9:
            if (r3 != 0) goto L_0x0bea
            if (r0 == 0) goto L_0x0bb5
            int r3 = r0.f134675i
            r5 = 16
            if (r3 != r5) goto L_0x0bb5
            r3 = 1
            goto L_0x0bb6
        L_0x0bb5:
            r3 = 0
        L_0x0bb6:
            if (r3 != 0) goto L_0x0bea
            if (r0 == 0) goto L_0x0bc0
            int r3 = r0.f134675i
            if (r3 != r4) goto L_0x0bc0
            r3 = 1
            goto L_0x0bc1
        L_0x0bc0:
            r3 = 0
        L_0x0bc1:
            if (r3 != 0) goto L_0x0bea
            if (r0 == 0) goto L_0x0bcd
            int r3 = r0.f134675i
            r5 = 27
            if (r3 != r5) goto L_0x0bcd
            r3 = 1
            goto L_0x0bce
        L_0x0bcd:
            r3 = 0
        L_0x0bce:
            if (r3 != 0) goto L_0x0bea
            if (r0 == 0) goto L_0x0bda
            int r3 = r0.f134675i
            r5 = 9
            if (r3 != r5) goto L_0x0bda
            r3 = 1
            goto L_0x0bdb
        L_0x0bda:
            r3 = 0
        L_0x0bdb:
            if (r3 != 0) goto L_0x0bea
            if (r0 == 0) goto L_0x0be7
            int r0 = r0.f134675i
            r3 = 25
            if (r0 != r3) goto L_0x0be7
            r0 = 1
            goto L_0x0be8
        L_0x0be7:
            r0 = 0
        L_0x0be8:
            if (r0 == 0) goto L_0x0fd6
        L_0x0bea:
            com.tencent.mm.plugin.finder.feed.model.BaseFinderFeedLoader r0 = r1.this$0
            com.tencent.mm.plugin.finder.feed.model.internal.DataBuffer r0 = r0.getDataList()
            com.tencent.mm.autogen.events.FeedUpdateEvent r3 = r1.$event
            java.util.Iterator r0 = r0.iterator()
            r5 = 0
        L_0x0bf7:
            boolean r6 = r0.hasNext()
            if (r6 == 0) goto L_0x0c23
            java.lang.Object r6 = r0.next()
            cm1.i2 r6 = (cm1.C0740i2) r6
            boolean r7 = r6 instanceof com.tencent.p014mm.plugin.finder.model.BaseFinderFeed
            if (r7 == 0) goto L_0x0c1b
            com.tencent.mm.plugin.finder.model.BaseFinderFeed r6 = (com.tencent.p014mm.plugin.finder.model.BaseFinderFeed) r6
            com.tencent.mm.plugin.finder.storage.FinderItem r6 = r6.mo3513o()
            long r6 = r6.getId()
            com.tencent.mm.autogen.events.FeedUpdateEvent$a r8 = r3.f9173d
            long r8 = r8.f9174a
            int r10 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r10 != 0) goto L_0x0c1b
            r6 = 1
            goto L_0x0c1c
        L_0x0c1b:
            r6 = 0
        L_0x0c1c:
            if (r6 == 0) goto L_0x0c20
            r0 = -1
            goto L_0x0c25
        L_0x0c20:
            int r5 = r5 + 1
            goto L_0x0bf7
        L_0x0c23:
            r0 = -1
            r5 = -1
        L_0x0c25:
            if (r5 == r0) goto L_0x0fd6
            com.tencent.mm.plugin.finder.feed.model.BaseFinderFeedLoader r0 = r1.this$0
            com.tencent.mm.plugin.finder.feed.model.internal.DataBuffer r0 = r0.getDataList()
            java.lang.Object r0 = r0.get(r5)
            cm1.i2 r0 = (cm1.C0740i2) r0
            boolean r3 = r0 instanceof com.tencent.p014mm.plugin.finder.model.BaseFinderFeed
            if (r3 == 0) goto L_0x0c4d
            com.tencent.mm.plugin.finder.model.BaseFinderFeed r0 = (com.tencent.p014mm.plugin.finder.model.BaseFinderFeed) r0
            boolean r0 = r0.mo3467A()
            com.tencent.mm.autogen.events.FeedUpdateEvent r3 = r1.$event
            com.tencent.mm.autogen.events.FeedUpdateEvent$a r3 = r3.f9173d
            int r3 = r3.f9177d
            r6 = 1
            if (r3 != r6) goto L_0x0c48
            r3 = 1
            goto L_0x0c49
        L_0x0c48:
            r3 = 0
        L_0x0c49:
            if (r0 == r3) goto L_0x0c4d
            r12 = 1
            goto L_0x0c4e
        L_0x0c4d:
            r12 = 0
        L_0x0c4e:
            if (r12 == 0) goto L_0x0c66
            com.tencent.mm.plugin.finder.feed.model.BaseFinderFeedLoader r0 = r1.this$0
            tf1.g r0 = r0.dispatcher()
            rx3.l r3 = new rx3.l
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            com.tencent.mm.autogen.events.FeedUpdateEvent r6 = r1.$event
            r3.<init>(r4, r6)
            r4 = 1
            r0.mo13378c(r5, r4, r3)
            goto L_0x0c67
        L_0x0c66:
            r4 = 1
        L_0x0c67:
            r2.f27482d = r4
            goto L_0x0fd6
        L_0x0c6b:
            long r3 = r0.f9174a
            int r0 = (r3 > r25 ? 1 : (r3 == r25 ? 0 : -1))
            if (r0 == 0) goto L_0x0fd6
            com.tencent.mm.plugin.finder.feed.model.BaseFinderFeedLoader r0 = r1.this$0
            com.tencent.mm.plugin.finder.feed.model.internal.DataBuffer r0 = r0.getDataList()
            com.tencent.mm.autogen.events.FeedUpdateEvent r3 = r1.$event
            java.util.Iterator r0 = r0.iterator()
            r4 = 0
        L_0x0c7e:
            boolean r5 = r0.hasNext()
            if (r5 == 0) goto L_0x0caa
            java.lang.Object r5 = r0.next()
            cm1.i2 r5 = (cm1.C0740i2) r5
            boolean r6 = r5 instanceof com.tencent.p014mm.plugin.finder.model.BaseFinderFeed
            if (r6 == 0) goto L_0x0ca2
            com.tencent.mm.plugin.finder.model.BaseFinderFeed r5 = (com.tencent.p014mm.plugin.finder.model.BaseFinderFeed) r5
            com.tencent.mm.plugin.finder.storage.FinderItem r5 = r5.mo3513o()
            long r5 = r5.getId()
            com.tencent.mm.autogen.events.FeedUpdateEvent$a r7 = r3.f9173d
            long r7 = r7.f9174a
            int r9 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r9 != 0) goto L_0x0ca2
            r5 = 1
            goto L_0x0ca3
        L_0x0ca2:
            r5 = 0
        L_0x0ca3:
            if (r5 == 0) goto L_0x0ca7
            r0 = -1
            goto L_0x0cac
        L_0x0ca7:
            int r4 = r4 + 1
            goto L_0x0c7e
        L_0x0caa:
            r0 = -1
            r4 = -1
        L_0x0cac:
            if (r4 == r0) goto L_0x0fd6
            com.tencent.mm.plugin.finder.feed.model.BaseFinderFeedLoader r0 = r1.this$0
            tf1.g r0 = r0.dispatcher()
            rx3.l r3 = new rx3.l
            r5 = 5
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            r3.<init>(r5, r11)
            r5 = 1
            r0.mo13378c(r4, r5, r3)
            r2.f27482d = r5
            goto L_0x0fd6
        L_0x0cc6:
            long r5 = r0.f9174a
            int r0 = (r5 > r25 ? 1 : (r5 == r25 ? 0 : -1))
            if (r0 == 0) goto L_0x0fd6
            com.tencent.mm.plugin.finder.feed.model.BaseFinderFeedLoader r0 = r1.this$0
            com.tencent.mm.plugin.finder.feed.model.internal.DataBuffer r0 = r0.getDataList()
            com.tencent.mm.autogen.events.FeedUpdateEvent r3 = r1.$event
            java.util.Iterator r0 = r0.iterator()
            r5 = 0
        L_0x0cd9:
            boolean r6 = r0.hasNext()
            if (r6 == 0) goto L_0x0d04
            java.lang.Object r6 = r0.next()
            cm1.i2 r6 = (cm1.C0740i2) r6
            boolean r7 = r6 instanceof com.tencent.p014mm.plugin.finder.model.BaseFinderFeed
            if (r7 == 0) goto L_0x0cfd
            com.tencent.mm.plugin.finder.model.BaseFinderFeed r6 = (com.tencent.p014mm.plugin.finder.model.BaseFinderFeed) r6
            com.tencent.mm.plugin.finder.storage.FinderItem r6 = r6.mo3513o()
            long r6 = r6.getId()
            com.tencent.mm.autogen.events.FeedUpdateEvent$a r8 = r3.f9173d
            long r8 = r8.f9174a
            int r10 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r10 != 0) goto L_0x0cfd
            r6 = 1
            goto L_0x0cfe
        L_0x0cfd:
            r6 = 0
        L_0x0cfe:
            if (r6 == 0) goto L_0x0d01
            goto L_0x0d05
        L_0x0d01:
            int r5 = r5 + 1
            goto L_0x0cd9
        L_0x0d04:
            r5 = -1
        L_0x0d05:
            com.tencent.mm.autogen.events.FeedUpdateEvent r0 = r1.$event
            com.tencent.mm.autogen.events.FeedUpdateEvent$a r0 = r0.f9173d
            int r0 = r0.f9176c
            r3 = 1
            if (r0 != r3) goto L_0x0d11
            r0 = -1
            r12 = 1
            goto L_0x0d13
        L_0x0d11:
            r0 = -1
            r12 = 0
        L_0x0d13:
            if (r5 == r0) goto L_0x0fd6
            com.tencent.mm.plugin.finder.feed.model.BaseFinderFeedLoader r0 = r1.this$0
            com.tencent.mm.plugin.finder.feed.model.internal.DataBuffer r0 = r0.getDataList()
            java.lang.Object r0 = r0.get(r5)
            gy3.C87412m.m108592e(r0, r4)
            com.tencent.mm.plugin.finder.model.BaseFinderFeed r0 = (com.tencent.p014mm.plugin.finder.model.BaseFinderFeed) r0
            com.tencent.mm.autogen.events.FeedUpdateEvent r3 = r1.$event
            com.tencent.mm.autogen.events.FeedUpdateEvent$a r3 = r3.f9173d
            int r3 = r3.f9177d
            r4 = 4
            r6 = 1
            if (r3 != r6) goto L_0x0d8f
            com.tencent.mm.plugin.finder.feed.model.BaseFinderFeedLoader r3 = r1.this$0
            java.lang.String r3 = r3.getTAG()
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r7 = "TYPE_FAV_CHANGED oldFlag = "
            r6.append(r7)
            com.tencent.mm.plugin.finder.storage.FinderItem r7 = r0.mo3513o()
            int r7 = r7.getFavFlag()
            r6.append(r7)
            java.lang.String r7 = ", eventFlag = "
            r6.append(r7)
            r6.append(r12)
            java.lang.String r6 = r6.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r3, r6)
            com.tencent.mm.plugin.finder.storage.FinderItem r3 = r0.mo3513o()
            int r3 = r3.getFavFlag()
            if (r3 == r12) goto L_0x0d8d
            com.tencent.mm.plugin.finder.storage.FinderItem r0 = r0.mo3513o()
            r0.setFavFlag(r12)
            com.tencent.mm.plugin.finder.feed.model.BaseFinderFeedLoader r0 = r1.this$0
            tf1.g r0 = r0.dispatcher()
            rx3.l r3 = new rx3.l
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r3.<init>(r4, r11)
            r6 = 1
            r0.mo13378c(r5, r6, r3)
            com.tencent.mm.plugin.finder.feed.model.BaseFinderFeedLoader r0 = r1.this$0
            tf1.g r0 = r0.dispatcher()
            rx3.l r3 = new rx3.l
            r7 = r21
            r3.<init>(r7, r11)
            r0.mo13378c(r5, r6, r3)
            goto L_0x0db1
        L_0x0d8d:
            r6 = 1
            goto L_0x0db1
        L_0x0d8f:
            r7 = r21
            com.tencent.mm.plugin.finder.feed.model.BaseFinderFeedLoader r0 = r1.this$0
            tf1.g r0 = r0.dispatcher()
            rx3.l r3 = new rx3.l
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r3.<init>(r4, r11)
            r0.mo13378c(r5, r6, r3)
            com.tencent.mm.plugin.finder.feed.model.BaseFinderFeedLoader r0 = r1.this$0
            tf1.g r0 = r0.dispatcher()
            rx3.l r3 = new rx3.l
            r3.<init>(r7, r11)
            r0.mo13378c(r5, r6, r3)
        L_0x0db1:
            com.tencent.mm.autogen.events.FeedUpdateEvent r0 = r1.$event
            com.tencent.mm.autogen.events.FeedUpdateEvent$a r0 = r0.f9173d
            int r0 = r0.f9185l
            if (r0 <= 0) goto L_0x0dcb
            com.tencent.mm.plugin.finder.feed.model.BaseFinderFeedLoader r0 = r1.this$0
            tf1.g r0 = r0.dispatcher()
            rx3.l r3 = new rx3.l
            com.tencent.mm.autogen.events.FeedUpdateEvent r4 = r1.$event
            r7 = r20
            r3.<init>(r7, r4)
            r0.mo13378c(r5, r6, r3)
        L_0x0dcb:
            r2.f27482d = r6
            goto L_0x0fd6
        L_0x0dcf:
            r7 = r20
            long r5 = r0.f9174a
            int r0 = (r5 > r25 ? 1 : (r5 == r25 ? 0 : -1))
            if (r0 == 0) goto L_0x0fd6
            com.tencent.mm.plugin.finder.feed.model.BaseFinderFeedLoader r0 = r1.this$0
            com.tencent.mm.plugin.finder.feed.model.internal.DataBuffer r0 = r0.getDataList()
            com.tencent.mm.autogen.events.FeedUpdateEvent r3 = r1.$event
            java.util.Iterator r0 = r0.iterator()
            r5 = 0
        L_0x0de4:
            boolean r6 = r0.hasNext()
            if (r6 == 0) goto L_0x0e10
            java.lang.Object r6 = r0.next()
            cm1.i2 r6 = (cm1.C0740i2) r6
            boolean r8 = r6 instanceof com.tencent.p014mm.plugin.finder.model.BaseFinderFeed
            if (r8 == 0) goto L_0x0e08
            com.tencent.mm.plugin.finder.model.BaseFinderFeed r6 = (com.tencent.p014mm.plugin.finder.model.BaseFinderFeed) r6
            com.tencent.mm.plugin.finder.storage.FinderItem r6 = r6.mo3513o()
            long r8 = r6.getId()
            com.tencent.mm.autogen.events.FeedUpdateEvent$a r6 = r3.f9173d
            long r12 = r6.f9174a
            int r6 = (r8 > r12 ? 1 : (r8 == r12 ? 0 : -1))
            if (r6 != 0) goto L_0x0e08
            r6 = 1
            goto L_0x0e09
        L_0x0e08:
            r6 = 0
        L_0x0e09:
            if (r6 == 0) goto L_0x0e0d
            r0 = -1
            goto L_0x0e12
        L_0x0e0d:
            int r5 = r5 + 1
            goto L_0x0de4
        L_0x0e10:
            r0 = -1
            r5 = -1
        L_0x0e12:
            if (r5 == r0) goto L_0x0fd6
            com.tencent.mm.plugin.finder.feed.model.BaseFinderFeedLoader r0 = r1.this$0
            com.tencent.mm.plugin.finder.feed.model.internal.DataBuffer r0 = r0.getDataList()
            java.lang.Object r0 = r0.get(r5)
            gy3.C87412m.m108592e(r0, r4)
            com.tencent.mm.plugin.finder.model.BaseFinderFeed r0 = (com.tencent.p014mm.plugin.finder.model.BaseFinderFeed) r0
            com.tencent.mm.autogen.events.FeedUpdateEvent r3 = r1.$event
            com.tencent.mm.autogen.events.FeedUpdateEvent$a r3 = r3.f9173d
            int r4 = r3.f9177d
            r6 = 1
            if (r4 != r6) goto L_0x0ed3
            int r3 = r3.f9178e
            com.tencent.mm.plugin.finder.storage.FinderItem r4 = r0.mo3513o()
            int r4 = r4.getLikeFlag()
            com.tencent.mm.plugin.finder.feed.model.BaseFinderFeedLoader r6 = r1.this$0
            java.lang.String r6 = r6.getTAG()
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            java.lang.String r9 = "TYPE_FEED_LIKE_CHANGED oldFlag:"
            r8.append(r9)
            r8.append(r4)
            java.lang.String r9 = ", newFlag:"
            r8.append(r9)
            r8.append(r3)
            java.lang.String r8 = r8.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r6, r8)
            if (r4 == r3) goto L_0x0ed1
            com.tencent.mm.plugin.finder.storage.FinderItem r6 = r0.mo3513o()
            r6.setLikeFlag(r3)
            if (r4 != 0) goto L_0x0e71
            com.tencent.mm.plugin.finder.storage.FinderItem r6 = r0.mo3513o()
            int r8 = r6.getLikeCount()
            r9 = 1
            int r8 = r8 + r9
            r6.setLikeCount(r8)
            goto L_0x0e81
        L_0x0e71:
            r9 = 1
            if (r3 != 0) goto L_0x0e81
            com.tencent.mm.plugin.finder.storage.FinderItem r6 = r0.mo3513o()
            int r8 = r6.getLikeCount()
            r10 = -1
            int r8 = r8 + r10
            r6.setLikeCount(r8)
        L_0x0e81:
            if (r3 != r9) goto L_0x0ea1
            com.tencent.mm.plugin.finder.storage.FinderItem r3 = r0.mo3513o()
            int r4 = r3.getFriendLikeCount()
            int r4 = r4 + r9
            r3.setFriendLikeCount(r4)
            vq1.w$a r3 = vq1.C65866w.f189406g
            vq1.w r3 = r3.mo14019a()
            com.tencent.mm.plugin.finder.storage.FinderItem r0 = r0.mo3513o()
            java.util.LinkedList r0 = r0.getLikeList()
            r3.mo89903a(r0)
            goto L_0x0ec1
        L_0x0ea1:
            if (r4 != r9) goto L_0x0ec1
            com.tencent.mm.plugin.finder.storage.FinderItem r3 = r0.mo3513o()
            int r4 = r3.getFriendLikeCount()
            r6 = -1
            int r4 = r4 + r6
            r3.setFriendLikeCount(r4)
            vq1.w$a r3 = vq1.C65866w.f189406g
            vq1.w r3 = r3.mo14019a()
            com.tencent.mm.plugin.finder.storage.FinderItem r0 = r0.mo3513o()
            java.util.LinkedList r0 = r0.getLikeList()
            r3.mo89912k(r0)
        L_0x0ec1:
            com.tencent.mm.plugin.finder.feed.model.BaseFinderFeedLoader r0 = r1.this$0
            tf1.g r0 = r0.dispatcher()
            rx3.l r3 = new rx3.l
            r3.<init>(r15, r11)
            r4 = 1
            r0.mo13378c(r5, r4, r3)
            goto L_0x0ee2
        L_0x0ed1:
            r4 = 1
            goto L_0x0ee2
        L_0x0ed3:
            r4 = 1
            com.tencent.mm.plugin.finder.feed.model.BaseFinderFeedLoader r0 = r1.this$0
            tf1.g r0 = r0.dispatcher()
            rx3.l r3 = new rx3.l
            r3.<init>(r15, r11)
            r0.mo13378c(r5, r4, r3)
        L_0x0ee2:
            com.tencent.mm.autogen.events.FeedUpdateEvent r0 = r1.$event
            com.tencent.mm.autogen.events.FeedUpdateEvent$a r0 = r0.f9173d
            int r0 = r0.f9185l
            if (r0 <= 0) goto L_0x0efa
            com.tencent.mm.plugin.finder.feed.model.BaseFinderFeedLoader r0 = r1.this$0
            tf1.g r0 = r0.dispatcher()
            rx3.l r3 = new rx3.l
            com.tencent.mm.autogen.events.FeedUpdateEvent r6 = r1.$event
            r3.<init>(r7, r6)
            r0.mo13378c(r5, r4, r3)
        L_0x0efa:
            r2.f27482d = r4
            goto L_0x0fd6
        L_0x0efe:
            long r3 = r0.f9174a
            int r0 = (r3 > r25 ? 1 : (r3 == r25 ? 0 : -1))
            if (r0 == 0) goto L_0x0fd6
            com.tencent.mm.plugin.finder.feed.model.BaseFinderFeedLoader r0 = r1.this$0
            com.tencent.mm.plugin.finder.feed.model.internal.DataBuffer r0 = r0.getDataList()
            com.tencent.mm.autogen.events.FeedUpdateEvent r3 = r1.$event
            java.util.Iterator r0 = r0.iterator()
            r4 = 0
        L_0x0f11:
            boolean r5 = r0.hasNext()
            if (r5 == 0) goto L_0x0f3d
            java.lang.Object r5 = r0.next()
            cm1.i2 r5 = (cm1.C0740i2) r5
            boolean r6 = r5 instanceof com.tencent.p014mm.plugin.finder.model.BaseFinderFeed
            if (r6 == 0) goto L_0x0f35
            com.tencent.mm.plugin.finder.model.BaseFinderFeed r5 = (com.tencent.p014mm.plugin.finder.model.BaseFinderFeed) r5
            com.tencent.mm.plugin.finder.storage.FinderItem r5 = r5.mo3513o()
            long r5 = r5.getId()
            com.tencent.mm.autogen.events.FeedUpdateEvent$a r7 = r3.f9173d
            long r7 = r7.f9174a
            int r9 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r9 != 0) goto L_0x0f35
            r5 = 1
            goto L_0x0f36
        L_0x0f35:
            r5 = 0
        L_0x0f36:
            if (r5 == 0) goto L_0x0f3a
            r0 = -1
            goto L_0x0f3f
        L_0x0f3a:
            int r4 = r4 + 1
            goto L_0x0f11
        L_0x0f3d:
            r0 = -1
            r4 = -1
        L_0x0f3f:
            if (r4 == r0) goto L_0x0fd6
            com.tencent.mm.plugin.finder.feed.model.BaseFinderFeedLoader r0 = r1.this$0
            tf1.g r0 = r0.dispatcher()
            rx3.l r3 = new rx3.l
            r5 = 29
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            r3.<init>(r5, r11)
            r5 = 1
            r0.mo13378c(r4, r5, r3)
            r2.f27482d = r5
            goto L_0x0fd6
        L_0x0f5a:
            long r3 = r0.f9174a
            int r0 = (r3 > r25 ? 1 : (r3 == r25 ? 0 : -1))
            if (r0 == 0) goto L_0x0fd6
            vp1.e r0 = vp1.C65834e.f189316a
            com.tencent.mm.plugin.finder.storage.FinderItem r0 = r0.mo89871e(r3)
            if (r0 == 0) goto L_0x0fd6
            com.tencent.mm.plugin.finder.feed.model.BaseFinderFeedLoader r3 = r1.this$0
            com.tencent.mm.autogen.events.FeedUpdateEvent r4 = r1.$event
            com.tencent.mm.plugin.finder.feed.model.internal.DataBuffer r5 = r3.getDataList()
            java.util.Iterator r5 = r5.iterator()
            r6 = 0
        L_0x0f75:
            boolean r7 = r5.hasNext()
            if (r7 == 0) goto L_0x0fa1
            java.lang.Object r7 = r5.next()
            cm1.i2 r7 = (cm1.C0740i2) r7
            boolean r8 = r7 instanceof com.tencent.p014mm.plugin.finder.model.BaseFinderFeed
            if (r8 == 0) goto L_0x0f99
            com.tencent.mm.plugin.finder.model.BaseFinderFeed r7 = (com.tencent.p014mm.plugin.finder.model.BaseFinderFeed) r7
            com.tencent.mm.plugin.finder.storage.FinderItem r7 = r7.mo3513o()
            long r7 = r7.getId()
            com.tencent.mm.autogen.events.FeedUpdateEvent$a r9 = r4.f9173d
            long r9 = r9.f9174a
            int r12 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r12 != 0) goto L_0x0f99
            r7 = 1
            goto L_0x0f9a
        L_0x0f99:
            r7 = 0
        L_0x0f9a:
            if (r7 == 0) goto L_0x0f9e
            r5 = -1
            goto L_0x0fa3
        L_0x0f9e:
            int r6 = r6 + 1
            goto L_0x0f75
        L_0x0fa1:
            r5 = -1
            r6 = -1
        L_0x0fa3:
            if (r6 == r5) goto L_0x0fd4
            com.tencent.mm.autogen.events.FeedUpdateEvent$a r4 = r4.f9173d
            int r4 = r4.f9183j
            r5 = 1
            if (r4 != r5) goto L_0x0fae
            r12 = 1
            goto L_0x0faf
        L_0x0fae:
            r12 = 0
        L_0x0faf:
            com.tencent.mm.plugin.finder.feed.model.internal.DataBuffer r4 = r3.getDataList()
            com.tencent.mm.plugin.finder.model.BaseFinderFeed r0 = r3.transformFinderObj(r0)
            if (r12 == 0) goto L_0x0fbc
            r0.mo3497e0(r5)
        L_0x0fbc:
            rx3.b0 r7 = rx3.C13598b0.f38549a
            r4.set(r6, r0)
            if (r12 == 0) goto L_0x0fcb
            tf1.g r0 = r3.dispatcher()
            r0.mo13377b(r6, r5)
            goto L_0x0fd2
        L_0x0fcb:
            tf1.g r0 = r3.dispatcher()
            r0.mo13378c(r6, r5, r11)
        L_0x0fd2:
            r2.f27482d = r5
        L_0x0fd4:
            rx3.b0 r0 = rx3.C13598b0.f38549a
        L_0x0fd6:
            boolean r0 = r2.f27482d
            if (r0 == 0) goto L_0x0fdf
            com.tencent.mm.plugin.finder.feed.model.BaseFinderFeedLoader r0 = r1.this$0
            r0.onDataChanged()
        L_0x0fdf:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.finder.feed.model.BaseFinderFeedLoader$feedChangeListener$1$callback$1.invoke():void");
    }
}

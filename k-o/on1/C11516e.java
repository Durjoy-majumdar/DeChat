package on1;

import cm1.C0797z;
import com.tencent.p014mm.autogen.events.FeedUpdateEvent;
import fy3.C32224a;
import gy3.C8477a0;
import gy3.C87413o;
import p565ir.C60606n;
import rx3.C13598b0;

/* renamed from: on1.e */
public final class C11516e extends C87413o implements C32224a<C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ FeedUpdateEvent f33830d;

    /* renamed from: e */
    public final /* synthetic */ C11533k f33831e;

    /* renamed from: on1.e$a */
    public static final class C11517a implements C60606n.C60609c {

        /* renamed from: a */
        public final /* synthetic */ FeedUpdateEvent f33832a;

        /* renamed from: b */
        public final /* synthetic */ C0797z f33833b;

        /* renamed from: c */
        public final /* synthetic */ C11533k f33834c;

        /* renamed from: d */
        public final /* synthetic */ int f33835d;

        /* renamed from: e */
        public final /* synthetic */ C8477a0 f33836e;

        public C11517a(FeedUpdateEvent feedUpdateEvent, C0797z zVar, C11533k kVar, int i, C8477a0 a0Var) {
            this.f33832a = feedUpdateEvent;
            this.f33833b = zVar;
            this.f33834c = kVar;
            this.f33835d = i;
            this.f33836e = a0Var;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:6:0x0049, code lost:
            r9 = r9.f182363I;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void onLiveStatusCallback(long r8, int r10, java.lang.Object r11) {
            /*
                r7 = this;
                com.tencent.mm.autogen.events.FeedUpdateEvent r10 = r7.f33832a
                com.tencent.mm.autogen.events.FeedUpdateEvent$a r10 = r10.f9173d
                long r0 = r10.f9174a
                int r10 = (r8 > r0 ? 1 : (r8 == r0 ? 0 : -1))
                if (r10 != 0) goto L_0x00ca
                boolean r8 = r11 instanceof te3.C51713vn0
                if (r8 == 0) goto L_0x00ca
                java.lang.StringBuilder r8 = new java.lang.StringBuilder
                r8.<init>()
                java.lang.String r9 = "TYPE_LIVE_REFRESH id:"
                r8.append(r9)
                com.tencent.mm.autogen.events.FeedUpdateEvent r9 = r7.f33832a
                com.tencent.mm.autogen.events.FeedUpdateEvent$a r9 = r9.f9173d
                long r9 = r9.f9174a
                r8.append(r9)
                java.lang.String r9 = ",username:"
                r8.append(r9)
                com.tencent.mm.autogen.events.FeedUpdateEvent r9 = r7.f33832a
                com.tencent.mm.autogen.events.FeedUpdateEvent$a r9 = r9.f9173d
                java.lang.String r9 = r9.f9181h
                r8.append(r9)
                java.lang.String r9 = ",liveStaus:"
                r8.append(r9)
                com.tencent.mm.autogen.events.FeedUpdateEvent r9 = r7.f33832a
                com.tencent.mm.autogen.events.FeedUpdateEvent$a r9 = r9.f9173d
                int r9 = r9.f9182i
                r8.append(r9)
                r9 = 44
                r8.append(r9)
                te3.vn0 r11 = (te3.C51713vn0) r11
                te3.c21 r9 = r11.f143572d
                r10 = 0
                if (r9 == 0) goto L_0x0054
                te3.e61 r9 = r9.f182363I
                if (r9 == 0) goto L_0x0054
                sk1.a r0 = sk1.C63947a.f181274a
                java.lang.String r9 = r0.mo88725k(r9)
                goto L_0x0055
            L_0x0054:
                r9 = r10
            L_0x0055:
                r8.append(r9)
                java.lang.String r9 = ", ori streamUrl:"
                r8.append(r9)
                cm1.z r9 = r7.f33833b
                com.tencent.mm.plugin.finder.storage.FinderItem r9 = r9.mo3513o()
                te3.c21 r9 = r9.getLiveInfo()
                if (r9 == 0) goto L_0x006c
                java.lang.String r9 = r9.f182395g
                goto L_0x006d
            L_0x006c:
                r9 = r10
            L_0x006d:
                r8.append(r9)
                java.lang.String r9 = " ,new streamUrl:"
                r8.append(r9)
                te3.c21 r9 = r11.f143572d
                if (r9 == 0) goto L_0x007c
                java.lang.String r9 = r9.f182395g
                goto L_0x007d
            L_0x007c:
                r9 = r10
            L_0x007d:
                r8.append(r9)
                java.lang.String r8 = r8.toString()
                java.lang.String r9 = "Finder.DefaultLoaderActions"
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r9, r8)
                cm1.z r8 = r7.f33833b
                com.tencent.mm.plugin.finder.storage.FinderItem r8 = r8.mo3513o()
                te3.c21 r9 = r11.f143572d
                r8.setLiveInfo(r9)
                cm1.z r8 = r7.f33833b
                com.tencent.mm.plugin.finder.storage.FinderItem r8 = r8.mo3513o()
                te3.rq2 r8 = r8.getLiveFinderMedia()
                if (r8 != 0) goto L_0x00a1
                goto L_0x00b1
            L_0x00a1:
                cm1.z r9 = r7.f33833b
                com.tencent.mm.plugin.finder.storage.FinderItem r9 = r9.mo3513o()
                te3.c21 r9 = r9.getLiveInfo()
                if (r9 == 0) goto L_0x00af
                java.lang.String r10 = r9.f182395g
            L_0x00af:
                r8.f185266d = r10
            L_0x00b1:
                on1.k r0 = r7.f33834c
                int r1 = r7.f33835d
                r2 = 1
                r3 = 0
                r4 = 0
                r5 = 12
                r6 = 0
                on1.C11533k.m11346e(r0, r1, r2, r3, r4, r5, r6)
                on1.k r8 = r7.f33834c
                cm1.z r9 = r7.f33833b
                on1.C11533k.m11345c(r8, r9)
                gy3.a0 r8 = r7.f33836e
                r9 = 1
                r8.f27482d = r9
            L_0x00ca:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: on1.C11516e.C11517a.onLiveStatusCallback(long, int, java.lang.Object):void");
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C11516e(FeedUpdateEvent feedUpdateEvent, C11533k kVar) {
        super(0);
        this.f33830d = feedUpdateEvent;
        this.f33831e = kVar;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:476:0x0bc6, code lost:
        if (r0 != false) goto L_0x0bc8;
     */
    /* JADX WARNING: Removed duplicated region for block: B:134:0x03a3  */
    /* JADX WARNING: Removed duplicated region for block: B:338:0x0966  */
    /* JADX WARNING: Removed duplicated region for block: B:342:0x096f A[LOOP:16: B:326:0x0935->B:342:0x096f, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:501:0x0c25  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x01ad A[LOOP:2: B:41:0x017b->B:56:0x01ad, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:642:0x01ab A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:673:0x0978 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void invoke() {
        /*
            r34 = this;
            r1 = r34
            com.tencent.mm.autogen.events.FeedUpdateEvent r0 = r1.f33830d
            com.tencent.mm.autogen.events.FeedUpdateEvent$a r0 = r0.f9173d
            r0.getClass()
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r2 = "feedChangeListener "
            r0.append(r2)
            com.tencent.mm.autogen.events.FeedUpdateEvent r2 = r1.f33830d
            com.tencent.mm.autogen.events.FeedUpdateEvent$a r2 = r2.f9173d
            long r2 = r2.f9174a
            r0.append(r2)
            java.lang.String r2 = ",fav = "
            r0.append(r2)
            com.tencent.mm.autogen.events.FeedUpdateEvent r2 = r1.f33830d
            com.tencent.mm.autogen.events.FeedUpdateEvent$a r2 = r2.f9173d
            int r2 = r2.f9176c
            r0.append(r2)
            java.lang.String r2 = ",like = "
            r0.append(r2)
            com.tencent.mm.autogen.events.FeedUpdateEvent r2 = r1.f33830d
            com.tencent.mm.autogen.events.FeedUpdateEvent$a r2 = r2.f9173d
            int r2 = r2.f9178e
            r0.append(r2)
            java.lang.String r2 = ",likeCount = "
            r0.append(r2)
            com.tencent.mm.autogen.events.FeedUpdateEvent r2 = r1.f33830d
            com.tencent.mm.autogen.events.FeedUpdateEvent$a r2 = r2.f9173d
            int r2 = r2.f9179f
            r0.append(r2)
            java.lang.String r2 = " ,needChangeData = "
            r0.append(r2)
            com.tencent.mm.autogen.events.FeedUpdateEvent r2 = r1.f33830d
            com.tencent.mm.autogen.events.FeedUpdateEvent$a r2 = r2.f9173d
            int r2 = r2.f9177d
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            java.lang.String r2 = "Finder.DefaultLoaderActions"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r0)
            gy3.a0 r9 = new gy3.a0
            r9.<init>()
            on1.k r0 = r1.f33831e
            on1.q r0 = r0.f33860d
            java.util.List r3 = r0.mo11502d3()
            com.tencent.mm.autogen.events.FeedUpdateEvent r0 = r1.f33830d
            com.tencent.mm.autogen.events.FeedUpdateEvent$a r4 = r0.f9173d
            int r5 = r4.f9175b
            java.lang.String r6 = ",live status:"
            java.lang.String r7 = ",feed id:"
            r8 = 7
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)
            r11 = 35
            java.lang.Integer r11 = java.lang.Integer.valueOf(r11)
            r12 = 10
            java.lang.Integer r12 = java.lang.Integer.valueOf(r12)
            r13 = 1
            java.lang.Integer r10 = java.lang.Integer.valueOf(r13)
            java.lang.String r14 = ",nickname:"
            java.lang.String r13 = ", live status:"
            java.lang.String r15 = "event.data.username"
            r21 = r11
            java.lang.String r11 = ",feedList:"
            r22 = 3
            r23 = r6
            java.lang.Integer r6 = java.lang.Integer.valueOf(r22)
            r22 = r7
            java.lang.String r7 = " id:"
            r24 = r14
            java.lang.String r14 = ""
            r25 = r8
            java.lang.String r8 = "null cannot be cast to non-null type com.tencent.mm.plugin.finder.model.BaseFinderFeed"
            r26 = r15
            java.lang.String r15 = ",liveStaus:"
            r27 = r14
            java.lang.String r14 = ",username:"
            r28 = 0
            switch(r5) {
                case 0: goto L_0x0ec5;
                case 1: goto L_0x0e6b;
                case 2: goto L_0x00b7;
                case 3: goto L_0x00b7;
                case 4: goto L_0x0d44;
                case 5: goto L_0x0c98;
                case 6: goto L_0x0c40;
                case 7: goto L_0x0b2b;
                case 8: goto L_0x08e5;
                case 9: goto L_0x0700;
                case 10: goto L_0x00b7;
                case 11: goto L_0x0668;
                case 12: goto L_0x05ae;
                case 13: goto L_0x04ff;
                case 14: goto L_0x00b7;
                case 15: goto L_0x048a;
                case 16: goto L_0x040e;
                case 17: goto L_0x0342;
                case 18: goto L_0x0264;
                case 19: goto L_0x00b7;
                case 20: goto L_0x01f2;
                case 21: goto L_0x0169;
                case 22: goto L_0x00b7;
                case 23: goto L_0x00b7;
                case 24: goto L_0x00b7;
                case 25: goto L_0x0111;
                case 26: goto L_0x00b9;
                default: goto L_0x00b7;
            }
        L_0x00b7:
            goto L_0x0f49
        L_0x00b9:
            long r4 = r4.f9174a
            int r2 = (r4 > r28 ? 1 : (r4 == r28 ? 0 : -1))
            if (r2 == 0) goto L_0x0f49
            java.util.ArrayList r3 = (java.util.ArrayList) r3
            java.util.Iterator r2 = r3.iterator()
            r3 = 0
        L_0x00c6:
            boolean r4 = r2.hasNext()
            if (r4 == 0) goto L_0x00f3
            java.lang.Object r4 = r2.next()
            cm1.i2 r4 = (cm1.C0740i2) r4
            boolean r5 = r4 instanceof com.tencent.p014mm.plugin.finder.model.BaseFinderFeed
            if (r5 == 0) goto L_0x00ea
            com.tencent.mm.plugin.finder.model.BaseFinderFeed r4 = (com.tencent.p014mm.plugin.finder.model.BaseFinderFeed) r4
            com.tencent.mm.plugin.finder.storage.FinderItem r4 = r4.mo3513o()
            long r4 = r4.getId()
            com.tencent.mm.autogen.events.FeedUpdateEvent$a r6 = r0.f9173d
            long r6 = r6.f9174a
            int r8 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r8 != 0) goto L_0x00ea
            r4 = 1
            goto L_0x00eb
        L_0x00ea:
            r4 = 0
        L_0x00eb:
            if (r4 == 0) goto L_0x00f0
            r11 = r3
            r0 = -1
            goto L_0x00f5
        L_0x00f0:
            int r3 = r3 + 1
            goto L_0x00c6
        L_0x00f3:
            r0 = -1
            r11 = -1
        L_0x00f5:
            if (r11 == r0) goto L_0x0f49
            on1.k r10 = r1.f33831e
            r12 = 1
            rx3.l r13 = new rx3.l
            r0 = 32
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            com.tencent.mm.autogen.events.FeedUpdateEvent r2 = r1.f33830d
            r13.<init>(r0, r2)
            r14 = 0
            r15 = 8
            r16 = 0
            on1.C11533k.m11346e(r10, r11, r12, r13, r14, r15, r16)
            goto L_0x0f49
        L_0x0111:
            long r4 = r4.f9174a
            int r2 = (r4 > r28 ? 1 : (r4 == r28 ? 0 : -1))
            if (r2 == 0) goto L_0x0f49
            java.util.ArrayList r3 = (java.util.ArrayList) r3
            java.util.Iterator r2 = r3.iterator()
            r3 = 0
        L_0x011e:
            boolean r4 = r2.hasNext()
            if (r4 == 0) goto L_0x014b
            java.lang.Object r4 = r2.next()
            cm1.i2 r4 = (cm1.C0740i2) r4
            boolean r5 = r4 instanceof com.tencent.p014mm.plugin.finder.model.BaseFinderFeed
            if (r5 == 0) goto L_0x0142
            com.tencent.mm.plugin.finder.model.BaseFinderFeed r4 = (com.tencent.p014mm.plugin.finder.model.BaseFinderFeed) r4
            com.tencent.mm.plugin.finder.storage.FinderItem r4 = r4.mo3513o()
            long r4 = r4.getId()
            com.tencent.mm.autogen.events.FeedUpdateEvent$a r6 = r0.f9173d
            long r6 = r6.f9174a
            int r8 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r8 != 0) goto L_0x0142
            r4 = 1
            goto L_0x0143
        L_0x0142:
            r4 = 0
        L_0x0143:
            if (r4 == 0) goto L_0x0148
            r11 = r3
            r0 = -1
            goto L_0x014d
        L_0x0148:
            int r3 = r3 + 1
            goto L_0x011e
        L_0x014b:
            r0 = -1
            r11 = -1
        L_0x014d:
            if (r11 == r0) goto L_0x0f49
            on1.k r10 = r1.f33831e
            r12 = 1
            rx3.l r13 = new rx3.l
            r0 = 31
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            com.tencent.mm.autogen.events.FeedUpdateEvent r2 = r1.f33830d
            r13.<init>(r0, r2)
            r14 = 0
            r15 = 8
            r16 = 0
            on1.C11533k.m11346e(r10, r11, r12, r13, r14, r15, r16)
            goto L_0x0f49
        L_0x0169:
            long r5 = r4.f9174a
            int r2 = (r5 > r28 ? 1 : (r5 == r28 ? 0 : -1))
            if (r2 == 0) goto L_0x0f49
            int r2 = r4.f9177d
            r4 = 1
            if (r2 != r4) goto L_0x0f49
            java.util.ArrayList r3 = (java.util.ArrayList) r3
            java.util.Iterator r2 = r3.iterator()
            r4 = 0
        L_0x017b:
            boolean r5 = r2.hasNext()
            if (r5 == 0) goto L_0x01b0
            java.lang.Object r5 = r2.next()
            cm1.i2 r5 = (cm1.C0740i2) r5
            boolean r6 = r5 instanceof cm1.C0797z
            if (r6 == 0) goto L_0x01a8
            cm1.z r5 = (cm1.C0797z) r5
            com.tencent.mm.plugin.finder.storage.FinderItem r5 = r5.mo3513o()
            te3.c21 r5 = r5.getLiveInfo()
            if (r5 == 0) goto L_0x01a3
            long r5 = r5.f182392d
            com.tencent.mm.autogen.events.FeedUpdateEvent$a r7 = r0.f9173d
            long r7 = r7.f9174a
            int r10 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r10 != 0) goto L_0x01a3
            r5 = 1
            goto L_0x01a4
        L_0x01a3:
            r5 = 0
        L_0x01a4:
            if (r5 == 0) goto L_0x01a8
            r5 = 1
            goto L_0x01a9
        L_0x01a8:
            r5 = 0
        L_0x01a9:
            if (r5 == 0) goto L_0x01ad
            r7 = r4
            goto L_0x01b1
        L_0x01ad:
            int r4 = r4 + 1
            goto L_0x017b
        L_0x01b0:
            r7 = -1
        L_0x01b1:
            if (r7 < 0) goto L_0x0f49
            java.lang.Object r0 = r3.get(r7)
            boolean r2 = r0 instanceof cm1.C0797z
            if (r2 == 0) goto L_0x01bf
            cm1.z r0 = (cm1.C0797z) r0
            r5 = r0
            goto L_0x01c0
        L_0x01bf:
            r5 = 0
        L_0x01c0:
            if (r5 == 0) goto L_0x0f49
            com.tencent.mm.autogen.events.FeedUpdateEvent r4 = r1.f33830d
            on1.k r6 = r1.f33831e
            java.lang.Class<ir.n> r0 = p565ir.C60606n.class
            di3.d r0 = di3.C86312j.m106911c(r0)
            java.lang.String r2 = "getService(IFinderLiveFeatureService::class.java)"
            gy3.C87412m.m108593f(r0, r2)
            r10 = r0
            ir.n r10 = (p565ir.C60606n) r10
            com.tencent.mm.autogen.events.FeedUpdateEvent$a r0 = r4.f9173d
            long r11 = r0.f9174a
            r13 = 1
            r14 = 0
            on1.e$a r15 = new on1.e$a
            r3 = r15
            r8 = r9
            r3.<init>(r4, r5, r6, r7, r8)
            r16 = 0
            r17 = 0
            r18 = 0
            r19 = 112(0x70, float:1.57E-43)
            r20 = 0
            p565ir.C60606n.C60607a.m70857a(r10, r11, r13, r14, r15, r16, r17, r18, r19, r20)
            rx3.b0 r0 = rx3.C13598b0.f38549a
            goto L_0x0f49
        L_0x01f2:
            java.util.ArrayList r3 = (java.util.ArrayList) r3
            java.util.Iterator r3 = r3.iterator()
            r4 = 0
        L_0x01f9:
            boolean r5 = r3.hasNext()
            if (r5 == 0) goto L_0x0225
            java.lang.Object r5 = r3.next()
            cm1.i2 r5 = (cm1.C0740i2) r5
            boolean r6 = r5 instanceof com.tencent.p014mm.plugin.finder.model.BaseFinderFeed
            if (r6 == 0) goto L_0x021d
            com.tencent.mm.plugin.finder.model.BaseFinderFeed r5 = (com.tencent.p014mm.plugin.finder.model.BaseFinderFeed) r5
            com.tencent.mm.plugin.finder.storage.FinderItem r5 = r5.mo3513o()
            long r5 = r5.getId()
            com.tencent.mm.autogen.events.FeedUpdateEvent$a r7 = r0.f9173d
            long r7 = r7.f9174a
            int r10 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r10 != 0) goto L_0x021d
            r5 = 1
            goto L_0x021e
        L_0x021d:
            r5 = 0
        L_0x021e:
            if (r5 == 0) goto L_0x0222
            r11 = r4
            goto L_0x0226
        L_0x0222:
            int r4 = r4 + 1
            goto L_0x01f9
        L_0x0225:
            r11 = -1
        L_0x0226:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r3 = "FeedUpdateEvent TYPE_OP_COUNT_CHANGED, feedId = "
            r0.append(r3)
            com.tencent.mm.autogen.events.FeedUpdateEvent r3 = r1.f33830d
            com.tencent.mm.autogen.events.FeedUpdateEvent$a r3 = r3.f9173d
            long r3 = r3.f9174a
            r0.append(r3)
            java.lang.String r3 = ", index = "
            r0.append(r3)
            r0.append(r11)
            java.lang.String r0 = r0.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r0)
            r0 = -1
            if (r11 == r0) goto L_0x0f49
            on1.k r10 = r1.f33831e
            r12 = 1
            rx3.l r13 = new rx3.l
            r0 = 12
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r2 = 0
            r13.<init>(r0, r2)
            r14 = 0
            r15 = 8
            r16 = 0
            on1.C11533k.m11346e(r10, r11, r12, r13, r14, r15, r16)
            goto L_0x0f49
        L_0x0264:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r4 = "FeedLiveListItemUpdateEvent TYPE_LIVE_LIST_ITEM_STATUS_CHANGE id:"
            r0.append(r4)
            com.tencent.mm.autogen.events.FeedUpdateEvent r4 = r1.f33830d
            com.tencent.mm.autogen.events.FeedUpdateEvent$a r4 = r4.f9173d
            long r4 = r4.f9174a
            r0.append(r4)
            r0.append(r11)
            com.tencent.mm.autogen.events.FeedUpdateEvent r4 = r1.f33830d
            com.tencent.mm.autogen.events.FeedUpdateEvent$a r4 = r4.f9173d
            r4.getClass()
            r4 = 0
            r0.append(r4)
            r0.append(r15)
            com.tencent.mm.autogen.events.FeedUpdateEvent r4 = r1.f33830d
            com.tencent.mm.autogen.events.FeedUpdateEvent$a r4 = r4.f9173d
            int r4 = r4.f9182i
            r0.append(r4)
            r0.append(r14)
            com.tencent.mm.autogen.events.FeedUpdateEvent r4 = r1.f33830d
            com.tencent.mm.autogen.events.FeedUpdateEvent$a r4 = r4.f9173d
            java.lang.String r4 = r4.f9181h
            r0.append(r4)
            java.lang.String r0 = r0.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r0)
            java.util.ArrayList r3 = (java.util.ArrayList) r3
            java.util.Iterator r0 = r3.iterator()
            r10 = 0
        L_0x02ab:
            boolean r4 = r0.hasNext()
            if (r4 == 0) goto L_0x02bf
            java.lang.Object r4 = r0.next()
            cm1.i2 r4 = (cm1.C0740i2) r4
            boolean r4 = r4 instanceof cm1.C0707a0
            if (r4 == 0) goto L_0x02bc
            goto L_0x02c0
        L_0x02bc:
            int r10 = r10 + 1
            goto L_0x02ab
        L_0x02bf:
            r10 = -1
        L_0x02c0:
            if (r10 < 0) goto L_0x0f49
            java.lang.Object r0 = r3.get(r10)
            cm1.i2 r0 = (cm1.C0740i2) r0
            boolean r3 = r0 instanceof cm1.C0707a0
            if (r3 == 0) goto L_0x0f49
            cm1.a0 r0 = (cm1.C0707a0) r0
            com.tencent.mm.autogen.events.FeedUpdateEvent r3 = r1.f33830d
            com.tencent.mm.autogen.events.FeedUpdateEvent$a r3 = r3.f9173d
            long r3 = r3.f9174a
            cm1.b0 r0 = r0.mo680b(r3)
            if (r0 == 0) goto L_0x0f49
            com.tencent.mm.autogen.events.FeedUpdateEvent r3 = r1.f33830d
            on1.k r4 = r1.f33831e
            com.tencent.mm.protocal.protobuf.FinderObject r5 = r0.mo690a()
            if (r5 == 0) goto L_0x02e7
            te3.c21 r5 = r5.liveInfo
            goto L_0x02e8
        L_0x02e7:
            r5 = 0
        L_0x02e8:
            if (r5 != 0) goto L_0x02eb
            goto L_0x02f1
        L_0x02eb:
            com.tencent.mm.autogen.events.FeedUpdateEvent$a r7 = r3.f9173d
            int r7 = r7.f9182i
            r5.f182394f = r7
        L_0x02f1:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r7 = "FeedLiveListItemUpdateEvent nickname:"
            r5.append(r7)
            com.tencent.mm.protocal.protobuf.FinderObject r0 = r0.mo690a()
            if (r0 == 0) goto L_0x0308
            com.tencent.mm.protocal.protobuf.FinderContact r0 = r0.contact
            if (r0 == 0) goto L_0x0308
            java.lang.String r14 = r0.nickname
            goto L_0x0309
        L_0x0308:
            r14 = 0
        L_0x0309:
            r5.append(r14)
            r5.append(r13)
            com.tencent.mm.autogen.events.FeedUpdateEvent$a r0 = r3.f9173d
            int r0 = r0.f9182i
            r5.append(r0)
            java.lang.String r0 = r5.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r0)
            r27 = 1
            rx3.l r0 = new rx3.l
            com.tencent.mm.autogen.events.FeedUpdateEvent$a r2 = r3.f9173d
            long r2 = r2.f9174a
            java.lang.Long r2 = java.lang.Long.valueOf(r2)
            r0.<init>(r6, r2)
            r29 = 0
            r30 = 8
            r31 = 0
            r25 = r4
            r26 = r10
            r28 = r0
            on1.C11533k.m11346e(r25, r26, r27, r28, r29, r30, r31)
            r2 = 1
            r9.f27482d = r2
            rx3.b0 r0 = rx3.C13598b0.f38549a
            goto L_0x0f49
        L_0x0342:
            java.util.ArrayList r3 = (java.util.ArrayList) r3
            java.util.Iterator r4 = r3.iterator()
            r5 = 0
        L_0x0349:
            boolean r6 = r4.hasNext()
            if (r6 == 0) goto L_0x0375
            java.lang.Object r6 = r4.next()
            cm1.i2 r6 = (cm1.C0740i2) r6
            boolean r8 = r6 instanceof com.tencent.p014mm.plugin.finder.model.BaseFinderFeed
            if (r8 == 0) goto L_0x036d
            com.tencent.mm.plugin.finder.model.BaseFinderFeed r6 = (com.tencent.p014mm.plugin.finder.model.BaseFinderFeed) r6
            com.tencent.mm.plugin.finder.storage.FinderItem r6 = r6.mo3513o()
            long r10 = r6.getId()
            com.tencent.mm.autogen.events.FeedUpdateEvent$a r6 = r0.f9173d
            long r13 = r6.f9174a
            int r6 = (r10 > r13 ? 1 : (r10 == r13 ? 0 : -1))
            if (r6 != 0) goto L_0x036d
            r6 = 1
            goto L_0x036e
        L_0x036d:
            r6 = 0
        L_0x036e:
            if (r6 == 0) goto L_0x0372
            r0 = -1
            goto L_0x0377
        L_0x0372:
            int r5 = r5 + 1
            goto L_0x0349
        L_0x0375:
            r0 = -1
            r5 = -1
        L_0x0377:
            if (r5 == r0) goto L_0x0f49
            java.lang.Object r0 = r3.get(r5)
            boolean r4 = r0 instanceof com.tencent.p014mm.plugin.finder.model.BaseFinderFeed
            if (r4 == 0) goto L_0x0384
            com.tencent.mm.plugin.finder.model.BaseFinderFeed r0 = (com.tencent.p014mm.plugin.finder.model.BaseFinderFeed) r0
            goto L_0x0385
        L_0x0384:
            r0 = 0
        L_0x0385:
            if (r0 == 0) goto L_0x03a0
            com.tencent.mm.plugin.finder.storage.FinderItem r0 = r0.mo3513o()
            if (r0 == 0) goto L_0x03a0
            com.tencent.mm.protocal.protobuf.FinderObject r0 = r0.getFeedObject()
            if (r0 == 0) goto L_0x03a0
            int r0 = r0.adFlag
            com.tencent.mm.autogen.events.FeedUpdateEvent r4 = r1.f33830d
            com.tencent.mm.autogen.events.FeedUpdateEvent$a r4 = r4.f9173d
            r4.getClass()
            if (r0 != 0) goto L_0x03a0
            r13 = 1
            goto L_0x03a1
        L_0x03a0:
            r13 = 0
        L_0x03a1:
            if (r13 != 0) goto L_0x0f49
            java.lang.Object r0 = r3.get(r5)
            boolean r3 = r0 instanceof com.tencent.p014mm.plugin.finder.model.BaseFinderFeed
            if (r3 == 0) goto L_0x03ae
            com.tencent.mm.plugin.finder.model.BaseFinderFeed r0 = (com.tencent.p014mm.plugin.finder.model.BaseFinderFeed) r0
            goto L_0x03af
        L_0x03ae:
            r0 = 0
        L_0x03af:
            if (r0 == 0) goto L_0x03bc
            com.tencent.mm.plugin.finder.storage.FinderItem r0 = r0.mo3513o()
            if (r0 == 0) goto L_0x03bc
            com.tencent.mm.protocal.protobuf.FinderObject r14 = r0.getFeedObject()
            goto L_0x03bd
        L_0x03bc:
            r14 = 0
        L_0x03bd:
            if (r14 != 0) goto L_0x03c0
            goto L_0x03ca
        L_0x03c0:
            com.tencent.mm.autogen.events.FeedUpdateEvent r0 = r1.f33830d
            com.tencent.mm.autogen.events.FeedUpdateEvent$a r0 = r0.f9173d
            r0.getClass()
            r6 = 0
            r14.adFlag = r6
        L_0x03ca:
            on1.k r0 = r1.f33831e
            r27 = 1
            rx3.l r3 = new rx3.l
            r4 = 28
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r3.<init>(r4, r12)
            r29 = 0
            r30 = 8
            r31 = 0
            r25 = r0
            r26 = r5
            r28 = r3
            on1.C11533k.m11346e(r25, r26, r27, r28, r29, r30, r31)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r3 = "TYPE_FINDER_AD_STAT_CHANGED index:"
            r0.append(r3)
            r0.append(r5)
            r0.append(r7)
            com.tencent.mm.autogen.events.FeedUpdateEvent r3 = r1.f33830d
            com.tencent.mm.autogen.events.FeedUpdateEvent$a r3 = r3.f9173d
            long r3 = r3.f9174a
            java.lang.String r3 = o40.C61926c.m72691p(r3)
            r0.append(r3)
            java.lang.String r0 = r0.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r0)
            goto L_0x0f49
        L_0x040e:
            r6 = 0
            java.util.ArrayList r3 = (java.util.ArrayList) r3
            java.util.Iterator r3 = r3.iterator()
            r4 = 0
        L_0x0416:
            boolean r5 = r3.hasNext()
            if (r5 == 0) goto L_0x0442
            java.lang.Object r5 = r3.next()
            cm1.i2 r5 = (cm1.C0740i2) r5
            boolean r8 = r5 instanceof com.tencent.p014mm.plugin.finder.model.BaseFinderFeed
            if (r8 == 0) goto L_0x043a
            com.tencent.mm.plugin.finder.model.BaseFinderFeed r5 = (com.tencent.p014mm.plugin.finder.model.BaseFinderFeed) r5
            com.tencent.mm.plugin.finder.storage.FinderItem r5 = r5.mo3513o()
            long r10 = r5.getId()
            com.tencent.mm.autogen.events.FeedUpdateEvent$a r5 = r0.f9173d
            long r13 = r5.f9174a
            int r5 = (r10 > r13 ? 1 : (r10 == r13 ? 0 : -1))
            if (r5 != 0) goto L_0x043a
            r5 = 1
            goto L_0x043b
        L_0x043a:
            r5 = 0
        L_0x043b:
            if (r5 == 0) goto L_0x043f
            r0 = -1
            goto L_0x0444
        L_0x043f:
            int r4 = r4 + 1
            goto L_0x0416
        L_0x0442:
            r0 = -1
            r4 = -1
        L_0x0444:
            if (r4 == r0) goto L_0x0f49
            on1.k r0 = r1.f33831e
            r27 = 1
            rx3.l r3 = new rx3.l
            r5 = 27
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            r3.<init>(r5, r12)
            r29 = 0
            r30 = 8
            r31 = 0
            r25 = r0
            r26 = r4
            r28 = r3
            on1.C11533k.m11346e(r25, r26, r27, r28, r29, r30, r31)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r3 = "TYPE_FINDER_AD_SNS_INFO index:"
            r0.append(r3)
            r0.append(r4)
            r0.append(r7)
            com.tencent.mm.autogen.events.FeedUpdateEvent r3 = r1.f33830d
            com.tencent.mm.autogen.events.FeedUpdateEvent$a r3 = r3.f9173d
            long r3 = r3.f9174a
            java.lang.String r3 = o40.C61926c.m72691p(r3)
            r0.append(r3)
            java.lang.String r0 = r0.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r0)
            goto L_0x0f49
        L_0x048a:
            r6 = 0
            java.util.ArrayList r3 = (java.util.ArrayList) r3
            java.util.Iterator r3 = r3.iterator()
            r4 = 0
        L_0x0492:
            boolean r5 = r3.hasNext()
            if (r5 == 0) goto L_0x04be
            java.lang.Object r5 = r3.next()
            cm1.i2 r5 = (cm1.C0740i2) r5
            boolean r8 = r5 instanceof com.tencent.p014mm.plugin.finder.model.BaseFinderFeed
            if (r8 == 0) goto L_0x04b6
            com.tencent.mm.plugin.finder.model.BaseFinderFeed r5 = (com.tencent.p014mm.plugin.finder.model.BaseFinderFeed) r5
            com.tencent.mm.plugin.finder.storage.FinderItem r5 = r5.mo3513o()
            long r11 = r5.getId()
            com.tencent.mm.autogen.events.FeedUpdateEvent$a r5 = r0.f9173d
            long r13 = r5.f9174a
            int r5 = (r11 > r13 ? 1 : (r11 == r13 ? 0 : -1))
            if (r5 != 0) goto L_0x04b6
            r5 = 1
            goto L_0x04b7
        L_0x04b6:
            r5 = 0
        L_0x04b7:
            if (r5 == 0) goto L_0x04bb
            r0 = -1
            goto L_0x04c0
        L_0x04bb:
            int r4 = r4 + 1
            goto L_0x0492
        L_0x04be:
            r0 = -1
            r4 = -1
        L_0x04c0:
            if (r4 == r0) goto L_0x0f49
            on1.k r11 = r1.f33831e
            r13 = 1
            rx3.l r14 = new rx3.l
            r0 = 26
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r14.<init>(r0, r10)
            r15 = 0
            r16 = 8
            r17 = 0
            r12 = r4
            on1.C11533k.m11346e(r11, r12, r13, r14, r15, r16, r17)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r3 = "TYPE_FINDER_AD_MUTUAL_INFO index:"
            r0.append(r3)
            r0.append(r4)
            r0.append(r7)
            com.tencent.mm.autogen.events.FeedUpdateEvent r3 = r1.f33830d
            com.tencent.mm.autogen.events.FeedUpdateEvent$a r3 = r3.f9173d
            long r3 = r3.f9174a
            java.lang.String r3 = o40.C61926c.m72691p(r3)
            r0.append(r3)
            java.lang.String r0 = r0.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r0)
            goto L_0x0f49
        L_0x04ff:
            r6 = 0
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r4 = "FeedUpdateEvent TYPE_ACTIVITY_ANTI_SPAM id:"
            r0.append(r4)
            com.tencent.mm.autogen.events.FeedUpdateEvent r4 = r1.f33830d
            com.tencent.mm.autogen.events.FeedUpdateEvent$a r4 = r4.f9173d
            long r4 = r4.f9174a
            r0.append(r4)
            java.lang.String r0 = r0.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r0)
            com.tencent.mm.autogen.events.FeedUpdateEvent r0 = r1.f33830d
            com.tencent.mm.autogen.events.FeedUpdateEvent$a r4 = r0.f9173d
            long r4 = r4.f9174a
            int r7 = (r4 > r28 ? 1 : (r4 == r28 ? 0 : -1))
            if (r7 == 0) goto L_0x0f49
            java.util.ArrayList r3 = (java.util.ArrayList) r3
            java.util.Iterator r4 = r3.iterator()
            r5 = 0
        L_0x052b:
            boolean r7 = r4.hasNext()
            if (r7 == 0) goto L_0x0558
            java.lang.Object r7 = r4.next()
            cm1.i2 r7 = (cm1.C0740i2) r7
            boolean r10 = r7 instanceof com.tencent.p014mm.plugin.finder.model.BaseFinderFeed
            if (r10 == 0) goto L_0x054f
            com.tencent.mm.plugin.finder.model.BaseFinderFeed r7 = (com.tencent.p014mm.plugin.finder.model.BaseFinderFeed) r7
            com.tencent.mm.plugin.finder.storage.FinderItem r7 = r7.mo3513o()
            long r10 = r7.getId()
            com.tencent.mm.autogen.events.FeedUpdateEvent$a r7 = r0.f9173d
            long r12 = r7.f9174a
            int r7 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r7 != 0) goto L_0x054f
            r7 = 1
            goto L_0x0550
        L_0x054f:
            r7 = 0
        L_0x0550:
            if (r7 == 0) goto L_0x0555
            r11 = r5
            r0 = -1
            goto L_0x055a
        L_0x0555:
            int r5 = r5 + 1
            goto L_0x052b
        L_0x0558:
            r0 = -1
            r11 = -1
        L_0x055a:
            if (r11 == r0) goto L_0x0f49
            java.lang.Object r0 = r3.get(r11)
            gy3.C87412m.m108592e(r0, r8)
            com.tencent.mm.plugin.finder.model.BaseFinderFeed r0 = (com.tencent.p014mm.plugin.finder.model.BaseFinderFeed) r0
            com.tencent.mm.autogen.events.FeedUpdateEvent r3 = r1.f33830d
            com.tencent.mm.autogen.events.FeedUpdateEvent$a r3 = r3.f9173d
            int r3 = r3.f9177d
            r4 = 1
            if (r3 != r4) goto L_0x059d
            com.tencent.mm.plugin.finder.storage.FinderItem r3 = r0.mo3513o()
            com.tencent.mm.protocal.protobuf.FinderObject r3 = r3.getFeedObject()
            com.tencent.mm.protocal.protobuf.FinderObjectDesc r3 = r3.objectDesc
            if (r3 == 0) goto L_0x058b
            te3.ef1 r3 = r3.event
            if (r3 == 0) goto L_0x058b
            r4 = r27
            r3.f132899e = r4
            r3.f132900f = r4
            java.lang.String r3 = "TYPE_ACTIVITY_ANTI_SPAM value changed"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r3)
            rx3.b0 r2 = rx3.C13598b0.f38549a
        L_0x058b:
            on1.k r10 = r1.f33831e
            r12 = 1
            r13 = 0
            r14 = 0
            r15 = 12
            r16 = 0
            on1.C11533k.m11346e(r10, r11, r12, r13, r14, r15, r16)
            on1.k r2 = r1.f33831e
            on1.C11533k.m11345c(r2, r0)
            goto L_0x05a9
        L_0x059d:
            on1.k r10 = r1.f33831e
            r12 = 1
            r13 = 0
            r14 = 0
            r15 = 12
            r16 = 0
            on1.C11533k.m11346e(r10, r11, r12, r13, r14, r15, r16)
        L_0x05a9:
            r2 = 1
            r9.f27482d = r2
            goto L_0x0f49
        L_0x05ae:
            r6 = 0
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r4 = "FeedUpdateEvent TYPE_ACTIVITY_REMOVED id:"
            r0.append(r4)
            com.tencent.mm.autogen.events.FeedUpdateEvent r4 = r1.f33830d
            com.tencent.mm.autogen.events.FeedUpdateEvent$a r4 = r4.f9173d
            long r4 = r4.f9174a
            r0.append(r4)
            r0.append(r14)
            com.tencent.mm.autogen.events.FeedUpdateEvent r4 = r1.f33830d
            com.tencent.mm.autogen.events.FeedUpdateEvent$a r4 = r4.f9173d
            java.lang.String r4 = r4.f9181h
            r0.append(r4)
            r0.append(r15)
            com.tencent.mm.autogen.events.FeedUpdateEvent r4 = r1.f33830d
            com.tencent.mm.autogen.events.FeedUpdateEvent$a r4 = r4.f9173d
            int r4 = r4.f9182i
            r0.append(r4)
            java.lang.String r0 = r0.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r0)
            com.tencent.mm.autogen.events.FeedUpdateEvent r0 = r1.f33830d
            com.tencent.mm.autogen.events.FeedUpdateEvent$a r2 = r0.f9173d
            long r4 = r2.f9174a
            int r2 = (r4 > r28 ? 1 : (r4 == r28 ? 0 : -1))
            if (r2 == 0) goto L_0x0f49
            java.util.ArrayList r3 = (java.util.ArrayList) r3
            java.util.Iterator r2 = r3.iterator()
            r4 = 0
        L_0x05f2:
            boolean r5 = r2.hasNext()
            if (r5 == 0) goto L_0x061f
            java.lang.Object r5 = r2.next()
            cm1.i2 r5 = (cm1.C0740i2) r5
            boolean r7 = r5 instanceof com.tencent.p014mm.plugin.finder.model.BaseFinderFeed
            if (r7 == 0) goto L_0x0616
            com.tencent.mm.plugin.finder.model.BaseFinderFeed r5 = (com.tencent.p014mm.plugin.finder.model.BaseFinderFeed) r5
            com.tencent.mm.plugin.finder.storage.FinderItem r5 = r5.mo3513o()
            long r10 = r5.getId()
            com.tencent.mm.autogen.events.FeedUpdateEvent$a r5 = r0.f9173d
            long r12 = r5.f9174a
            int r5 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r5 != 0) goto L_0x0616
            r5 = 1
            goto L_0x0617
        L_0x0616:
            r5 = 0
        L_0x0617:
            if (r5 == 0) goto L_0x061c
            r11 = r4
            r0 = -1
            goto L_0x0621
        L_0x061c:
            int r4 = r4 + 1
            goto L_0x05f2
        L_0x061f:
            r0 = -1
            r11 = -1
        L_0x0621:
            if (r11 == r0) goto L_0x0f49
            java.lang.Object r0 = r3.get(r11)
            gy3.C87412m.m108592e(r0, r8)
            com.tencent.mm.plugin.finder.model.BaseFinderFeed r0 = (com.tencent.p014mm.plugin.finder.model.BaseFinderFeed) r0
            com.tencent.mm.autogen.events.FeedUpdateEvent r2 = r1.f33830d
            com.tencent.mm.autogen.events.FeedUpdateEvent$a r2 = r2.f9173d
            int r2 = r2.f9177d
            r3 = 1
            if (r2 != r3) goto L_0x0657
            com.tencent.mm.plugin.finder.storage.FinderItem r2 = r0.mo3513o()
            com.tencent.mm.protocal.protobuf.FinderObject r2 = r2.getFeedObject()
            com.tencent.mm.protocal.protobuf.FinderObjectDesc r2 = r2.objectDesc
            if (r2 != 0) goto L_0x0642
            goto L_0x0645
        L_0x0642:
            r3 = 0
            r2.event = r3
        L_0x0645:
            on1.k r10 = r1.f33831e
            r12 = 1
            r13 = 0
            r14 = 0
            r15 = 12
            r16 = 0
            on1.C11533k.m11346e(r10, r11, r12, r13, r14, r15, r16)
            on1.k r2 = r1.f33831e
            on1.C11533k.m11345c(r2, r0)
            goto L_0x0663
        L_0x0657:
            on1.k r10 = r1.f33831e
            r12 = 1
            r13 = 0
            r14 = 0
            r15 = 12
            r16 = 0
            on1.C11533k.m11346e(r10, r11, r12, r13, r14, r15, r16)
        L_0x0663:
            r2 = 1
            r9.f27482d = r2
            goto L_0x0f49
        L_0x0668:
            r6 = 0
            java.lang.Class<tf0.q1> r0 = tf0.C13887q1.class
            di3.d r0 = di3.C86312j.m106911c(r0)
            tf0.q1 r0 = (tf0.C13887q1) r0
            com.tencent.mm.autogen.events.FeedUpdateEvent r4 = r1.f33830d
            com.tencent.mm.autogen.events.FeedUpdateEvent$a r4 = r4.f9173d
            java.lang.String r4 = r4.f9181h
            r5 = r26
            gy3.C87412m.m108593f(r4, r5)
            java.util.List r0 = r0.mo13331Ut(r4)
            on1.k r4 = r1.f33831e
            com.tencent.mm.autogen.events.FeedUpdateEvent r5 = r1.f33830d
            java.util.Iterator r0 = r0.iterator()
        L_0x0688:
            boolean r7 = r0.hasNext()
            if (r7 == 0) goto L_0x0f49
            java.lang.Object r7 = r0.next()
            java.lang.String r7 = (java.lang.String) r7
            r8 = r3
            java.util.ArrayList r8 = (java.util.ArrayList) r8
            java.util.Iterator r8 = r8.iterator()
            r11 = 0
        L_0x069c:
            boolean r10 = r8.hasNext()
            if (r10 == 0) goto L_0x0688
            java.lang.Object r10 = r8.next()
            int r17 = r11 + 1
            if (r11 < 0) goto L_0x06fb
            cm1.i2 r10 = (cm1.C0740i2) r10
            int r12 = r7.length()
            if (r12 <= 0) goto L_0x06b4
            r12 = 1
            goto L_0x06b5
        L_0x06b4:
            r12 = 0
        L_0x06b5:
            if (r12 == 0) goto L_0x06f8
            boolean r12 = r10 instanceof com.tencent.p014mm.plugin.finder.model.BaseFinderFeed
            if (r12 == 0) goto L_0x06f8
            com.tencent.mm.plugin.finder.model.BaseFinderFeed r10 = (com.tencent.p014mm.plugin.finder.model.BaseFinderFeed) r10
            fe1.q r10 = r10.mo3507l()
            if (r10 == 0) goto L_0x06c8
            java.lang.String r10 = r10.getUsername()
            goto L_0x06c9
        L_0x06c8:
            r10 = 0
        L_0x06c9:
            boolean r10 = gy3.C87412m.m108589b(r10, r7)
            if (r10 == 0) goto L_0x06f8
            r12 = 1
            rx3.l r13 = new rx3.l
            r10 = 8
            java.lang.Integer r10 = java.lang.Integer.valueOf(r10)
            r13.<init>(r10, r5)
            r14 = 0
            r15 = 8
            r16 = 0
            r10 = r4
            on1.C11533k.m11346e(r10, r11, r12, r13, r14, r15, r16)
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            java.lang.String r11 = "TYPE_FEED_LIVE_NOTICE username:"
            r10.append(r11)
            r10.append(r7)
            java.lang.String r10 = r10.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r10)
        L_0x06f8:
            r11 = r17
            goto L_0x069c
        L_0x06fb:
            sx3.C64197v.m75542k()
            r2 = 0
            throw r2
        L_0x0700:
            r5 = r26
            r4 = r27
            r6 = 0
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r7 = "FeedUpdateEvent TYPE_LIVE_STREAM_CHANGE id:"
            r0.append(r7)
            com.tencent.mm.autogen.events.FeedUpdateEvent r7 = r1.f33830d
            com.tencent.mm.autogen.events.FeedUpdateEvent$a r7 = r7.f9173d
            long r7 = r7.f9174a
            r0.append(r7)
            r0.append(r11)
            com.tencent.mm.autogen.events.FeedUpdateEvent r7 = r1.f33830d
            com.tencent.mm.autogen.events.FeedUpdateEvent$a r7 = r7.f9173d
            r7.getClass()
            r7 = 0
            r0.append(r7)
            r0.append(r15)
            com.tencent.mm.autogen.events.FeedUpdateEvent r7 = r1.f33830d
            com.tencent.mm.autogen.events.FeedUpdateEvent$a r7 = r7.f9173d
            int r7 = r7.f9182i
            r0.append(r7)
            r0.append(r14)
            com.tencent.mm.autogen.events.FeedUpdateEvent r7 = r1.f33830d
            com.tencent.mm.autogen.events.FeedUpdateEvent$a r7 = r7.f9173d
            java.lang.String r7 = r7.f9181h
            r0.append(r7)
            java.lang.String r0 = r0.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r0)
            com.tencent.mm.autogen.events.FeedUpdateEvent r0 = r1.f33830d
            com.tencent.mm.autogen.events.FeedUpdateEvent$a r7 = r0.f9173d
            int r7 = r7.f9177d
            r8 = 1
            if (r7 != r8) goto L_0x07bc
            r7 = r3
            java.util.ArrayList r7 = (java.util.ArrayList) r7
            java.util.Iterator r8 = r7.iterator()
            r10 = 0
        L_0x0756:
            boolean r11 = r8.hasNext()
            if (r11 == 0) goto L_0x077d
            java.lang.Object r11 = r8.next()
            cm1.i2 r11 = (cm1.C0740i2) r11
            boolean r12 = r11 instanceof cm1.C0707a0
            if (r12 == 0) goto L_0x0776
            cm1.a0 r11 = (cm1.C0707a0) r11
            long r11 = r11.mo682i()
            com.tencent.mm.autogen.events.FeedUpdateEvent$a r13 = r0.f9173d
            long r13 = r13.f9174a
            int r15 = (r11 > r13 ? 1 : (r11 == r13 ? 0 : -1))
            if (r15 != 0) goto L_0x0776
            r11 = 1
            goto L_0x0777
        L_0x0776:
            r11 = 0
        L_0x0777:
            if (r11 == 0) goto L_0x077a
            goto L_0x077e
        L_0x077a:
            int r10 = r10 + 1
            goto L_0x0756
        L_0x077d:
            r10 = -1
        L_0x077e:
            if (r10 < 0) goto L_0x07bc
            java.lang.Object r0 = r7.get(r10)
            cm1.i2 r0 = (cm1.C0740i2) r0
            boolean r7 = r0 instanceof cm1.C0707a0
            if (r7 == 0) goto L_0x078d
            cm1.a0 r0 = (cm1.C0707a0) r0
            goto L_0x078e
        L_0x078d:
            r0 = 0
        L_0x078e:
            if (r0 == 0) goto L_0x07b9
            on1.k r0 = r1.f33831e
            com.tencent.mm.autogen.events.FeedUpdateEvent r7 = r1.f33830d
            r28 = 1
            rx3.l r8 = new rx3.l
            r11 = 2
            java.lang.Integer r11 = java.lang.Integer.valueOf(r11)
            com.tencent.mm.autogen.events.FeedUpdateEvent$a r7 = r7.f9173d
            long r12 = r7.f9174a
            java.lang.Long r7 = java.lang.Long.valueOf(r12)
            r8.<init>(r11, r7)
            r30 = 0
            r31 = 8
            r32 = 0
            r26 = r0
            r27 = r10
            r29 = r8
            on1.C11533k.m11346e(r26, r27, r28, r29, r30, r31, r32)
            rx3.b0 r0 = rx3.C13598b0.f38549a
        L_0x07b9:
            r7 = 1
            r9.f27482d = r7
        L_0x07bc:
            com.tencent.mm.autogen.events.FeedUpdateEvent r0 = r1.f33830d
            com.tencent.mm.autogen.events.FeedUpdateEvent$a r0 = r0.f9173d
            java.lang.String r0 = r0.f9181h
            gy3.C87412m.m108593f(r0, r5)
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            org.json.JSONArray r7 = new org.json.JSONArray     // Catch:{ Exception -> 0x07e3 }
            r7.<init>(r0)     // Catch:{ Exception -> 0x07e3 }
            int r0 = r7.length()     // Catch:{ Exception -> 0x07e3 }
            r8 = 0
        L_0x07d4:
            if (r8 >= r0) goto L_0x07ed
            java.lang.String r10 = r7.optString(r8)     // Catch:{ Exception -> 0x07e3 }
            if (r10 != 0) goto L_0x07dd
            r10 = r4
        L_0x07dd:
            r5.add(r10)     // Catch:{ Exception -> 0x07e3 }
            int r8 = r8 + 1
            goto L_0x07d4
        L_0x07e3:
            r0 = move-exception
            java.lang.String r0 = r0.getMessage()
            java.lang.String r4 = "FinderFeedLiveList"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r4, r0)
        L_0x07ed:
            on1.k r0 = r1.f33831e
            com.tencent.mm.autogen.events.FeedUpdateEvent r4 = r1.f33830d
            java.util.Iterator r5 = r5.iterator()
        L_0x07f5:
            boolean r7 = r5.hasNext()
            if (r7 == 0) goto L_0x0f49
            java.lang.Object r7 = r5.next()
            java.lang.String r7 = (java.lang.String) r7
            r8 = r3
            java.util.ArrayList r8 = (java.util.ArrayList) r8
            java.util.Iterator r8 = r8.iterator()
            r11 = 0
        L_0x0809:
            boolean r10 = r8.hasNext()
            if (r10 == 0) goto L_0x08e0
            java.lang.Object r10 = r8.next()
            int r17 = r11 + 1
            if (r11 < 0) goto L_0x08db
            r15 = r10
            cm1.i2 r15 = (cm1.C0740i2) r15
            int r10 = r7.length()
            if (r10 <= 0) goto L_0x0822
            r10 = 1
            goto L_0x0823
        L_0x0822:
            r10 = 0
        L_0x0823:
            if (r10 == 0) goto L_0x08c6
            boolean r10 = r15 instanceof com.tencent.p014mm.plugin.finder.model.BaseFinderFeed
            if (r10 == 0) goto L_0x08c6
            r14 = r15
            com.tencent.mm.plugin.finder.model.BaseFinderFeed r14 = (com.tencent.p014mm.plugin.finder.model.BaseFinderFeed) r14
            fe1.q r10 = r14.mo3507l()
            if (r10 == 0) goto L_0x0837
            java.lang.String r10 = r10.getUsername()
            goto L_0x0838
        L_0x0837:
            r10 = 0
        L_0x0838:
            boolean r10 = gy3.C87412m.m108589b(r10, r7)
            if (r10 == 0) goto L_0x08c6
            fe1.q r10 = r14.mo3507l()
            if (r10 == 0) goto L_0x084c
            com.tencent.mm.autogen.events.FeedUpdateEvent$a r12 = r4.f9173d
            int r12 = r12.f9182i
            r10.field_liveStatus = r12
            rx3.b0 r10 = rx3.C13598b0.f38549a
        L_0x084c:
            com.tencent.mm.plugin.finder.storage.FinderItem r10 = r14.mo3513o()
            com.tencent.mm.protocal.protobuf.FinderObject r10 = r10.getFeedObject()
            com.tencent.mm.protocal.protobuf.FinderContact r10 = r10.contact
            if (r10 == 0) goto L_0x0860
            com.tencent.mm.autogen.events.FeedUpdateEvent$a r12 = r4.f9173d
            int r12 = r12.f9182i
            r10.liveStatus = r12
            rx3.b0 r10 = rx3.C13598b0.f38549a
        L_0x0860:
            r12 = 1
            rx3.l r13 = new rx3.l
            r10 = r25
            r13.<init>(r10, r4)
            r16 = 0
            r18 = 8
            r20 = 0
            r6 = r10
            r10 = r0
            r33 = r14
            r14 = r16
            r21 = r15
            r15 = r18
            r16 = r20
            on1.C11533k.m11346e(r10, r11, r12, r13, r14, r15, r16)
            r15 = r33
            on1.C11533k.m11345c(r0, r15)
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            java.lang.String r11 = "FeedUpdateEvent username:"
            r10.append(r11)
            r10.append(r7)
            r11 = r24
            r10.append(r11)
            fe1.q r12 = r15.mo3507l()
            if (r12 == 0) goto L_0x089f
            java.lang.String r12 = r12.getNickname()
            goto L_0x08a0
        L_0x089f:
            r12 = 0
        L_0x08a0:
            r10.append(r12)
            r12 = r22
            r10.append(r12)
            long r13 = r21.getItemId()
            r10.append(r13)
            r13 = r23
            r10.append(r13)
            com.tencent.mm.autogen.events.FeedUpdateEvent$a r14 = r4.f9173d
            int r14 = r14.f9182i
            r10.append(r14)
            java.lang.String r10 = r10.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r10)
            r10 = 1
            r9.f27482d = r10
            goto L_0x08ce
        L_0x08c6:
            r12 = r22
            r13 = r23
            r11 = r24
            r6 = r25
        L_0x08ce:
            r25 = r6
            r24 = r11
            r22 = r12
            r23 = r13
            r11 = r17
            r6 = 0
            goto L_0x0809
        L_0x08db:
            sx3.C64197v.m75542k()
            r2 = 0
            throw r2
        L_0x08e0:
            r6 = r25
            r6 = 0
            goto L_0x07f5
        L_0x08e5:
            r12 = r22
            r4 = r23
            r11 = r24
            r6 = r25
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r5 = "FeedUpdateEvent TYPE_LIVE_CHANGE id:"
            r0.append(r5)
            com.tencent.mm.autogen.events.FeedUpdateEvent r5 = r1.f33830d
            com.tencent.mm.autogen.events.FeedUpdateEvent$a r5 = r5.f9173d
            long r7 = r5.f9174a
            r0.append(r7)
            r0.append(r14)
            com.tencent.mm.autogen.events.FeedUpdateEvent r5 = r1.f33830d
            com.tencent.mm.autogen.events.FeedUpdateEvent$a r5 = r5.f9173d
            java.lang.String r5 = r5.f9181h
            r0.append(r5)
            r0.append(r15)
            com.tencent.mm.autogen.events.FeedUpdateEvent r5 = r1.f33830d
            com.tencent.mm.autogen.events.FeedUpdateEvent$a r5 = r5.f9173d
            int r5 = r5.f9182i
            r0.append(r5)
            java.lang.String r0 = r0.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r0)
            com.tencent.mm.autogen.events.FeedUpdateEvent r0 = r1.f33830d
            com.tencent.mm.autogen.events.FeedUpdateEvent$a r5 = r0.f9173d
            long r7 = r5.f9174a
            int r10 = (r7 > r28 ? 1 : (r7 == r28 ? 0 : -1))
            if (r10 == 0) goto L_0x0f49
            int r5 = r5.f9177d
            r7 = 1
            if (r5 != r7) goto L_0x0f49
            java.util.ArrayList r3 = (java.util.ArrayList) r3
            java.util.Iterator r5 = r3.iterator()
            r7 = 0
        L_0x0935:
            boolean r8 = r5.hasNext()
            if (r8 == 0) goto L_0x0975
            java.lang.Object r8 = r5.next()
            cm1.i2 r8 = (cm1.C0740i2) r8
            boolean r10 = r8 instanceof cm1.C0797z
            if (r10 == 0) goto L_0x0968
            cm1.z r8 = (cm1.C0797z) r8
            com.tencent.mm.plugin.finder.storage.FinderItem r8 = r8.mo3513o()
            te3.c21 r8 = r8.getLiveInfo()
            if (r8 == 0) goto L_0x0960
            long r14 = r8.f182392d
            com.tencent.mm.autogen.events.FeedUpdateEvent$a r8 = r0.f9173d
            r23 = r4
            r10 = r5
            long r4 = r8.f9174a
            int r8 = (r14 > r4 ? 1 : (r14 == r4 ? 0 : -1))
            if (r8 != 0) goto L_0x0963
            r4 = 1
            goto L_0x0964
        L_0x0960:
            r23 = r4
            r10 = r5
        L_0x0963:
            r4 = 0
        L_0x0964:
            if (r4 == 0) goto L_0x096b
            r4 = 1
            goto L_0x096c
        L_0x0968:
            r23 = r4
            r10 = r5
        L_0x096b:
            r4 = 0
        L_0x096c:
            if (r4 == 0) goto L_0x096f
            goto L_0x0978
        L_0x096f:
            int r7 = r7 + 1
            r5 = r10
            r4 = r23
            goto L_0x0935
        L_0x0975:
            r23 = r4
            r7 = -1
        L_0x0978:
            if (r7 < 0) goto L_0x09b5
            java.lang.Object r0 = r3.get(r7)
            cm1.i2 r0 = (cm1.C0740i2) r0
            boolean r4 = r0 instanceof cm1.C0797z
            if (r4 == 0) goto L_0x0987
            cm1.z r0 = (cm1.C0797z) r0
            goto L_0x0988
        L_0x0987:
            r0 = 0
        L_0x0988:
            if (r0 == 0) goto L_0x09b2
            com.tencent.mm.autogen.events.FeedUpdateEvent r4 = r1.f33830d
            on1.k r5 = r1.f33831e
            com.tencent.mm.plugin.finder.storage.FinderItem r0 = r0.mo3513o()
            te3.c21 r0 = r0.getLiveInfo()
            if (r0 != 0) goto L_0x0999
            goto L_0x099f
        L_0x0999:
            com.tencent.mm.autogen.events.FeedUpdateEvent$a r4 = r4.f9173d
            int r4 = r4.f9182i
            r0.f182394f = r4
        L_0x099f:
            r28 = 1
            r29 = 0
            r30 = 0
            r31 = 12
            r32 = 0
            r26 = r5
            r27 = r7
            on1.C11533k.m11346e(r26, r27, r28, r29, r30, r31, r32)
            rx3.b0 r0 = rx3.C13598b0.f38549a
        L_0x09b2:
            r4 = 1
            r9.f27482d = r4
        L_0x09b5:
            java.util.Iterator r0 = r3.iterator()
            r4 = 0
        L_0x09ba:
            boolean r5 = r0.hasNext()
            if (r5 == 0) goto L_0x09ce
            java.lang.Object r5 = r0.next()
            cm1.i2 r5 = (cm1.C0740i2) r5
            boolean r5 = r5 instanceof cm1.C0707a0
            if (r5 == 0) goto L_0x09cb
            goto L_0x09cf
        L_0x09cb:
            int r4 = r4 + 1
            goto L_0x09ba
        L_0x09ce:
            r4 = -1
        L_0x09cf:
            if (r4 < 0) goto L_0x0a65
            java.lang.Object r0 = r3.get(r4)
            cm1.i2 r0 = (cm1.C0740i2) r0
            boolean r5 = r0 instanceof cm1.C0707a0
            if (r5 == 0) goto L_0x0a62
            cm1.a0 r0 = (cm1.C0707a0) r0
            com.tencent.mm.autogen.events.FeedUpdateEvent r5 = r1.f33830d
            com.tencent.mm.autogen.events.FeedUpdateEvent$a r5 = r5.f9173d
            long r7 = r5.f9174a
            int r5 = r0.mo679a(r7)
            if (r5 < 0) goto L_0x0a62
            com.tencent.mm.autogen.events.FeedUpdateEvent r7 = r1.f33830d
            com.tencent.mm.autogen.events.FeedUpdateEvent$a r7 = r7.f9173d
            int r7 = r7.f9182i
            r8 = 2
            if (r7 != r8) goto L_0x09f8
            r0.mo686m(r5)
            rx3.b0 r0 = rx3.C13598b0.f38549a
            goto L_0x0a06
        L_0x09f8:
            java.util.ArrayList r0 = r0.mo681d()
            java.lang.Object r0 = r0.get(r5)
            java.lang.String r5 = "{\n                      …                        }"
            gy3.C87412m.m108593f(r0, r5)
        L_0x0a06:
            on1.k r5 = r1.f33831e
            r28 = 1
            r29 = 0
            r30 = 0
            r31 = 12
            r32 = 0
            r26 = r5
            r27 = r4
            on1.C11533k.m11346e(r26, r27, r28, r29, r30, r31, r32)
            boolean r4 = r0 instanceof cm1.C0712b0
            if (r4 == 0) goto L_0x0a62
            cm1.b0 r0 = (cm1.C0712b0) r0
            com.tencent.mm.protocal.protobuf.FinderObject r4 = r0.mo690a()
            if (r4 == 0) goto L_0x0a28
            te3.c21 r4 = r4.liveInfo
            goto L_0x0a29
        L_0x0a28:
            r4 = 0
        L_0x0a29:
            if (r4 != 0) goto L_0x0a2c
            goto L_0x0a34
        L_0x0a2c:
            com.tencent.mm.autogen.events.FeedUpdateEvent r5 = r1.f33830d
            com.tencent.mm.autogen.events.FeedUpdateEvent$a r5 = r5.f9173d
            int r5 = r5.f9182i
            r4.f182394f = r5
        L_0x0a34:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = "FeedUpdateEvent nickname:"
            r4.append(r5)
            com.tencent.mm.protocal.protobuf.FinderObject r0 = r0.mo690a()
            if (r0 == 0) goto L_0x0a4b
            com.tencent.mm.protocal.protobuf.FinderContact r0 = r0.contact
            if (r0 == 0) goto L_0x0a4b
            java.lang.String r0 = r0.nickname
            goto L_0x0a4c
        L_0x0a4b:
            r0 = 0
        L_0x0a4c:
            r4.append(r0)
            r4.append(r13)
            com.tencent.mm.autogen.events.FeedUpdateEvent r0 = r1.f33830d
            com.tencent.mm.autogen.events.FeedUpdateEvent$a r0 = r0.f9173d
            int r0 = r0.f9182i
            r4.append(r0)
            java.lang.String r0 = r4.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r0)
        L_0x0a62:
            r4 = 1
            r9.f27482d = r4
        L_0x0a65:
            com.tencent.mm.autogen.events.FeedUpdateEvent r0 = r1.f33830d
            com.tencent.mm.autogen.events.FeedUpdateEvent$a r0 = r0.f9173d
            java.lang.String r0 = r0.f9181h
            boolean r4 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r0)
            if (r4 == 0) goto L_0x0a72
            return
        L_0x0a72:
            on1.k r4 = r1.f33831e
            com.tencent.mm.autogen.events.FeedUpdateEvent r5 = r1.f33830d
            java.util.Iterator r3 = r3.iterator()
            r27 = 0
        L_0x0a7c:
            boolean r7 = r3.hasNext()
            if (r7 == 0) goto L_0x0f49
            java.lang.Object r7 = r3.next()
            int r10 = r27 + 1
            if (r27 < 0) goto L_0x0b26
            cm1.i2 r7 = (cm1.C0740i2) r7
            boolean r8 = r7 instanceof com.tencent.p014mm.plugin.finder.model.BaseFinderFeed
            if (r8 == 0) goto L_0x0b1e
            r8 = r7
            com.tencent.mm.plugin.finder.model.BaseFinderFeed r8 = (com.tencent.p014mm.plugin.finder.model.BaseFinderFeed) r8
            fe1.q r13 = r8.mo3507l()
            if (r13 == 0) goto L_0x0a9e
            java.lang.String r13 = r13.getUsername()
            goto L_0x0a9f
        L_0x0a9e:
            r13 = 0
        L_0x0a9f:
            boolean r13 = gy3.C87412m.m108589b(r13, r0)
            if (r13 == 0) goto L_0x0b1e
            fe1.q r13 = r8.mo3507l()
            if (r13 == 0) goto L_0x0ab3
            com.tencent.mm.autogen.events.FeedUpdateEvent$a r14 = r5.f9173d
            int r14 = r14.f9182i
            r13.field_liveStatus = r14
            rx3.b0 r13 = rx3.C13598b0.f38549a
        L_0x0ab3:
            com.tencent.mm.plugin.finder.storage.FinderItem r13 = r8.mo3513o()
            com.tencent.mm.protocal.protobuf.FinderObject r13 = r13.getFeedObject()
            com.tencent.mm.protocal.protobuf.FinderContact r13 = r13.contact
            if (r13 == 0) goto L_0x0ac7
            com.tencent.mm.autogen.events.FeedUpdateEvent$a r14 = r5.f9173d
            int r14 = r14.f9182i
            r13.liveStatus = r14
            rx3.b0 r13 = rx3.C13598b0.f38549a
        L_0x0ac7:
            r28 = 1
            rx3.l r13 = new rx3.l
            r13.<init>(r6, r5)
            r30 = 0
            r31 = 8
            r32 = 0
            r26 = r4
            r29 = r13
            on1.C11533k.m11346e(r26, r27, r28, r29, r30, r31, r32)
            on1.C11533k.m11345c(r4, r8)
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            r13.<init>()
            java.lang.String r14 = "FeedUpdateEvent TYPE_LIVE_CHANGE username:"
            r13.append(r14)
            r13.append(r0)
            r13.append(r11)
            fe1.q r8 = r8.mo3507l()
            if (r8 == 0) goto L_0x0af9
            java.lang.String r8 = r8.getNickname()
            goto L_0x0afa
        L_0x0af9:
            r8 = 0
        L_0x0afa:
            r13.append(r8)
            r13.append(r12)
            long r7 = r7.getItemId()
            r13.append(r7)
            r7 = r23
            r13.append(r7)
            com.tencent.mm.autogen.events.FeedUpdateEvent$a r8 = r5.f9173d
            int r8 = r8.f9182i
            r13.append(r8)
            java.lang.String r8 = r13.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r8)
            r8 = 1
            r9.f27482d = r8
            goto L_0x0b20
        L_0x0b1e:
            r7 = r23
        L_0x0b20:
            r23 = r7
            r27 = r10
            goto L_0x0a7c
        L_0x0b26:
            sx3.C64197v.m75542k()
            r2 = 0
            throw r2
        L_0x0b2b:
            long r4 = r4.f9174a
            int r0 = (r4 > r28 ? 1 : (r4 == r28 ? 0 : -1))
            if (r0 == 0) goto L_0x0f49
            on1.k r0 = r1.f33831e
            te3.hj1 r0 = r0.f33862f
            if (r0 == 0) goto L_0x0b41
            int r0 = r0.f134675i
            r2 = 17
            if (r0 != r2) goto L_0x0b41
            r0 = 1
            goto L_0x0b42
        L_0x0b41:
            r0 = 0
        L_0x0b42:
            r2 = 6
            if (r0 != 0) goto L_0x0bc8
            on1.k r0 = r1.f33831e
            te3.hj1 r0 = r0.f33862f
            if (r0 == 0) goto L_0x0b55
            int r0 = r0.f134675i
            r4 = 18
            if (r0 != r4) goto L_0x0b55
            r0 = 1
            goto L_0x0b56
        L_0x0b55:
            r0 = 0
        L_0x0b56:
            if (r0 != 0) goto L_0x0bc8
            on1.k r0 = r1.f33831e
            te3.hj1 r0 = r0.f33862f
            if (r0 == 0) goto L_0x0b68
            int r0 = r0.f134675i
            r4 = 20
            if (r0 != r4) goto L_0x0b68
            r0 = 1
            goto L_0x0b69
        L_0x0b68:
            r0 = 0
        L_0x0b69:
            if (r0 != 0) goto L_0x0bc8
            on1.k r0 = r1.f33831e
            te3.hj1 r0 = r0.f33862f
            if (r0 == 0) goto L_0x0b7b
            int r0 = r0.f134675i
            r4 = 16
            if (r0 != r4) goto L_0x0b7b
            r0 = 1
            goto L_0x0b7c
        L_0x0b7b:
            r0 = 0
        L_0x0b7c:
            if (r0 != 0) goto L_0x0bc8
            on1.k r0 = r1.f33831e
            te3.hj1 r0 = r0.f33862f
            if (r0 == 0) goto L_0x0b8c
            int r0 = r0.f134675i
            if (r0 != r2) goto L_0x0b8c
            r0 = 1
            goto L_0x0b8d
        L_0x0b8c:
            r0 = 0
        L_0x0b8d:
            if (r0 != 0) goto L_0x0bc8
            on1.k r0 = r1.f33831e
            te3.hj1 r0 = r0.f33862f
            if (r0 == 0) goto L_0x0b9f
            int r0 = r0.f134675i
            r4 = 27
            if (r0 != r4) goto L_0x0b9f
            r0 = 1
            goto L_0x0ba0
        L_0x0b9f:
            r0 = 0
        L_0x0ba0:
            if (r0 != 0) goto L_0x0bc8
            on1.k r0 = r1.f33831e
            te3.hj1 r0 = r0.f33862f
            if (r0 == 0) goto L_0x0bb2
            int r0 = r0.f134675i
            r4 = 9
            if (r0 != r4) goto L_0x0bb2
            r0 = 1
            goto L_0x0bb3
        L_0x0bb2:
            r0 = 0
        L_0x0bb3:
            if (r0 != 0) goto L_0x0bc8
            on1.k r0 = r1.f33831e
            te3.hj1 r0 = r0.f33862f
            if (r0 == 0) goto L_0x0bc5
            int r0 = r0.f134675i
            r4 = 25
            if (r0 != r4) goto L_0x0bc5
            r0 = 1
            goto L_0x0bc6
        L_0x0bc5:
            r0 = 0
        L_0x0bc6:
            if (r0 == 0) goto L_0x0f49
        L_0x0bc8:
            com.tencent.mm.autogen.events.FeedUpdateEvent r0 = r1.f33830d
            java.util.ArrayList r3 = (java.util.ArrayList) r3
            java.util.Iterator r4 = r3.iterator()
            r5 = 0
        L_0x0bd1:
            boolean r6 = r4.hasNext()
            if (r6 == 0) goto L_0x0bfe
            java.lang.Object r6 = r4.next()
            cm1.i2 r6 = (cm1.C0740i2) r6
            boolean r7 = r6 instanceof com.tencent.p014mm.plugin.finder.model.BaseFinderFeed
            if (r7 == 0) goto L_0x0bf5
            com.tencent.mm.plugin.finder.model.BaseFinderFeed r6 = (com.tencent.p014mm.plugin.finder.model.BaseFinderFeed) r6
            com.tencent.mm.plugin.finder.storage.FinderItem r6 = r6.mo3513o()
            long r6 = r6.getId()
            com.tencent.mm.autogen.events.FeedUpdateEvent$a r8 = r0.f9173d
            long r10 = r8.f9174a
            int r8 = (r6 > r10 ? 1 : (r6 == r10 ? 0 : -1))
            if (r8 != 0) goto L_0x0bf5
            r6 = 1
            goto L_0x0bf6
        L_0x0bf5:
            r6 = 0
        L_0x0bf6:
            if (r6 == 0) goto L_0x0bfb
            r11 = r5
            r0 = -1
            goto L_0x0c00
        L_0x0bfb:
            int r5 = r5 + 1
            goto L_0x0bd1
        L_0x0bfe:
            r0 = -1
            r11 = -1
        L_0x0c00:
            if (r11 == r0) goto L_0x0f49
            java.lang.Object r0 = r3.get(r11)
            cm1.i2 r0 = (cm1.C0740i2) r0
            boolean r3 = r0 instanceof com.tencent.p014mm.plugin.finder.model.BaseFinderFeed
            if (r3 == 0) goto L_0x0c22
            com.tencent.mm.plugin.finder.model.BaseFinderFeed r0 = (com.tencent.p014mm.plugin.finder.model.BaseFinderFeed) r0
            boolean r0 = r0.mo3467A()
            com.tencent.mm.autogen.events.FeedUpdateEvent r3 = r1.f33830d
            com.tencent.mm.autogen.events.FeedUpdateEvent$a r3 = r3.f9173d
            int r3 = r3.f9177d
            r4 = 1
            if (r3 != r4) goto L_0x0c1d
            r3 = 1
            goto L_0x0c1e
        L_0x0c1d:
            r3 = 0
        L_0x0c1e:
            if (r0 == r3) goto L_0x0c22
            r10 = 1
            goto L_0x0c23
        L_0x0c22:
            r10 = 0
        L_0x0c23:
            if (r10 == 0) goto L_0x0c3b
            on1.k r10 = r1.f33831e
            r12 = 1
            rx3.l r13 = new rx3.l
            java.lang.Integer r0 = java.lang.Integer.valueOf(r2)
            com.tencent.mm.autogen.events.FeedUpdateEvent r2 = r1.f33830d
            r13.<init>(r0, r2)
            r14 = 0
            r15 = 8
            r16 = 0
            on1.C11533k.m11346e(r10, r11, r12, r13, r14, r15, r16)
        L_0x0c3b:
            r2 = 1
            r9.f27482d = r2
            goto L_0x0f49
        L_0x0c40:
            long r4 = r4.f9174a
            int r2 = (r4 > r28 ? 1 : (r4 == r28 ? 0 : -1))
            if (r2 == 0) goto L_0x0f49
            java.util.ArrayList r3 = (java.util.ArrayList) r3
            java.util.Iterator r2 = r3.iterator()
            r3 = 0
        L_0x0c4d:
            boolean r4 = r2.hasNext()
            if (r4 == 0) goto L_0x0c7a
            java.lang.Object r4 = r2.next()
            cm1.i2 r4 = (cm1.C0740i2) r4
            boolean r5 = r4 instanceof com.tencent.p014mm.plugin.finder.model.BaseFinderFeed
            if (r5 == 0) goto L_0x0c71
            com.tencent.mm.plugin.finder.model.BaseFinderFeed r4 = (com.tencent.p014mm.plugin.finder.model.BaseFinderFeed) r4
            com.tencent.mm.plugin.finder.storage.FinderItem r4 = r4.mo3513o()
            long r4 = r4.getId()
            com.tencent.mm.autogen.events.FeedUpdateEvent$a r6 = r0.f9173d
            long r6 = r6.f9174a
            int r8 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r8 != 0) goto L_0x0c71
            r4 = 1
            goto L_0x0c72
        L_0x0c71:
            r4 = 0
        L_0x0c72:
            if (r4 == 0) goto L_0x0c77
            r12 = r3
            r0 = -1
            goto L_0x0c7c
        L_0x0c77:
            int r3 = r3 + 1
            goto L_0x0c4d
        L_0x0c7a:
            r0 = -1
            r12 = -1
        L_0x0c7c:
            if (r12 == r0) goto L_0x0f49
            on1.k r11 = r1.f33831e
            r13 = 1
            rx3.l r14 = new rx3.l
            r0 = 5
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r14.<init>(r0, r10)
            r15 = 0
            r16 = 8
            r17 = 0
            on1.C11533k.m11346e(r11, r12, r13, r14, r15, r16, r17)
            r2 = 1
            r9.f27482d = r2
            goto L_0x0f49
        L_0x0c98:
            long r4 = r4.f9174a
            int r6 = (r4 > r28 ? 1 : (r4 == r28 ? 0 : -1))
            if (r6 == 0) goto L_0x0f49
            java.util.ArrayList r3 = (java.util.ArrayList) r3
            java.util.Iterator r4 = r3.iterator()
            r5 = 0
        L_0x0ca5:
            boolean r6 = r4.hasNext()
            if (r6 == 0) goto L_0x0cd1
            java.lang.Object r6 = r4.next()
            cm1.i2 r6 = (cm1.C0740i2) r6
            boolean r7 = r6 instanceof com.tencent.p014mm.plugin.finder.model.BaseFinderFeed
            if (r7 == 0) goto L_0x0cc9
            com.tencent.mm.plugin.finder.model.BaseFinderFeed r6 = (com.tencent.p014mm.plugin.finder.model.BaseFinderFeed) r6
            com.tencent.mm.plugin.finder.storage.FinderItem r6 = r6.mo3513o()
            long r6 = r6.getId()
            com.tencent.mm.autogen.events.FeedUpdateEvent$a r10 = r0.f9173d
            long r10 = r10.f9174a
            int r12 = (r6 > r10 ? 1 : (r6 == r10 ? 0 : -1))
            if (r12 != 0) goto L_0x0cc9
            r6 = 1
            goto L_0x0cca
        L_0x0cc9:
            r6 = 0
        L_0x0cca:
            if (r6 == 0) goto L_0x0cce
            r11 = r5
            goto L_0x0cd2
        L_0x0cce:
            int r5 = r5 + 1
            goto L_0x0ca5
        L_0x0cd1:
            r11 = -1
        L_0x0cd2:
            com.tencent.mm.autogen.events.FeedUpdateEvent r0 = r1.f33830d
            com.tencent.mm.autogen.events.FeedUpdateEvent$a r0 = r0.f9173d
            int r0 = r0.f9176c
            r4 = 1
            if (r0 != r4) goto L_0x0cde
            r0 = -1
            r10 = 1
            goto L_0x0ce0
        L_0x0cde:
            r0 = -1
            r10 = 0
        L_0x0ce0:
            if (r11 == r0) goto L_0x0f49
            java.lang.Object r0 = r3.get(r11)
            gy3.C87412m.m108592e(r0, r8)
            com.tencent.mm.plugin.finder.model.BaseFinderFeed r0 = (com.tencent.p014mm.plugin.finder.model.BaseFinderFeed) r0
            com.tencent.mm.autogen.events.FeedUpdateEvent r3 = r1.f33830d
            com.tencent.mm.autogen.events.FeedUpdateEvent$a r3 = r3.f9173d
            int r3 = r3.f9177d
            if (r3 != r4) goto L_0x0d23
            com.tencent.mm.plugin.finder.storage.FinderItem r0 = r0.mo3513o()
            com.tencent.mm.protocal.protobuf.FinderObject r0 = r0.getFeedObject()
            if (r0 == 0) goto L_0x0d23
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "TYPE_FAV_CHANGED oldFlag = "
            r3.append(r4)
            int r4 = r0.favFlag
            r3.append(r4)
            java.lang.String r4 = ", eventFlag = "
            r3.append(r4)
            r3.append(r10)
            java.lang.String r3 = r3.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r3)
            int r2 = r0.favFlag
            if (r2 == r10) goto L_0x0d21
            r0.favFlag = r10
        L_0x0d21:
            rx3.b0 r0 = rx3.C13598b0.f38549a
        L_0x0d23:
            com.tencent.mm.autogen.events.FeedUpdateEvent r0 = r1.f33830d
            com.tencent.mm.autogen.events.FeedUpdateEvent$a r0 = r0.f9173d
            int r0 = r0.f9185l
            if (r0 <= 0) goto L_0x0d3f
            on1.k r10 = r1.f33831e
            r12 = 1
            rx3.l r13 = new rx3.l
            com.tencent.mm.autogen.events.FeedUpdateEvent r0 = r1.f33830d
            r5 = r21
            r13.<init>(r5, r0)
            r14 = 0
            r15 = 8
            r16 = 0
            on1.C11533k.m11346e(r10, r11, r12, r13, r14, r15, r16)
        L_0x0d3f:
            r2 = 1
            r9.f27482d = r2
            goto L_0x0f49
        L_0x0d44:
            r5 = r21
            r7 = 0
            long r11 = r4.f9174a
            int r4 = (r11 > r28 ? 1 : (r11 == r28 ? 0 : -1))
            if (r4 == 0) goto L_0x0f49
            java.util.ArrayList r3 = (java.util.ArrayList) r3
            java.util.Iterator r4 = r3.iterator()
            r11 = 0
        L_0x0d54:
            boolean r12 = r4.hasNext()
            if (r12 == 0) goto L_0x0d80
            java.lang.Object r12 = r4.next()
            cm1.i2 r12 = (cm1.C0740i2) r12
            boolean r13 = r12 instanceof com.tencent.p014mm.plugin.finder.model.BaseFinderFeed
            if (r13 == 0) goto L_0x0d78
            com.tencent.mm.plugin.finder.model.BaseFinderFeed r12 = (com.tencent.p014mm.plugin.finder.model.BaseFinderFeed) r12
            com.tencent.mm.plugin.finder.storage.FinderItem r12 = r12.mo3513o()
            long r12 = r12.getId()
            com.tencent.mm.autogen.events.FeedUpdateEvent$a r14 = r0.f9173d
            long r14 = r14.f9174a
            int r16 = (r12 > r14 ? 1 : (r12 == r14 ? 0 : -1))
            if (r16 != 0) goto L_0x0d78
            r12 = 1
            goto L_0x0d79
        L_0x0d78:
            r12 = 0
        L_0x0d79:
            if (r12 == 0) goto L_0x0d7d
            r0 = -1
            goto L_0x0d82
        L_0x0d7d:
            int r11 = r11 + 1
            goto L_0x0d54
        L_0x0d80:
            r0 = -1
            r11 = -1
        L_0x0d82:
            if (r11 == r0) goto L_0x0f49
            java.lang.Object r0 = r3.get(r11)
            gy3.C87412m.m108592e(r0, r8)
            com.tencent.mm.plugin.finder.model.BaseFinderFeed r0 = (com.tencent.p014mm.plugin.finder.model.BaseFinderFeed) r0
            com.tencent.mm.autogen.events.FeedUpdateEvent r3 = r1.f33830d
            com.tencent.mm.autogen.events.FeedUpdateEvent$a r3 = r3.f9173d
            int r4 = r3.f9177d
            r7 = 1
            if (r4 != r7) goto L_0x0e38
            int r3 = r3.f9178e
            com.tencent.mm.plugin.finder.storage.FinderItem r4 = r0.mo3513o()
            int r4 = r4.getLikeFlag()
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.String r8 = "TYPE_FEED_LIKE_CHANGED oldFlag:"
            r7.append(r8)
            r7.append(r4)
            java.lang.String r8 = ", newFlag:"
            r7.append(r8)
            r7.append(r3)
            java.lang.String r7 = r7.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r7)
            if (r4 == r3) goto L_0x0e4a
            com.tencent.mm.plugin.finder.storage.FinderItem r2 = r0.mo3513o()
            r2.setLikeFlag(r3)
            if (r4 != 0) goto L_0x0dd5
            com.tencent.mm.plugin.finder.storage.FinderItem r2 = r0.mo3513o()
            int r7 = r2.getLikeCount()
            r8 = 1
            int r7 = r7 + r8
            r2.setLikeCount(r7)
            goto L_0x0de5
        L_0x0dd5:
            r8 = 1
            if (r3 != 0) goto L_0x0de5
            com.tencent.mm.plugin.finder.storage.FinderItem r2 = r0.mo3513o()
            int r7 = r2.getLikeCount()
            r12 = -1
            int r7 = r7 + r12
            r2.setLikeCount(r7)
        L_0x0de5:
            if (r3 != r8) goto L_0x0e05
            com.tencent.mm.plugin.finder.storage.FinderItem r2 = r0.mo3513o()
            int r3 = r2.getFriendLikeCount()
            int r3 = r3 + r8
            r2.setFriendLikeCount(r3)
            vq1.w$a r2 = vq1.C65866w.f189406g
            vq1.w r2 = r2.mo14019a()
            com.tencent.mm.plugin.finder.storage.FinderItem r0 = r0.mo3513o()
            java.util.LinkedList r0 = r0.getLikeList()
            r2.mo89903a(r0)
            goto L_0x0e25
        L_0x0e05:
            if (r4 != r8) goto L_0x0e25
            com.tencent.mm.plugin.finder.storage.FinderItem r2 = r0.mo3513o()
            int r3 = r2.getFriendLikeCount()
            r4 = -1
            int r3 = r3 + r4
            r2.setFriendLikeCount(r3)
            vq1.w$a r2 = vq1.C65866w.f189406g
            vq1.w r2 = r2.mo14019a()
            com.tencent.mm.plugin.finder.storage.FinderItem r0 = r0.mo3513o()
            java.util.LinkedList r0 = r0.getLikeList()
            r2.mo89912k(r0)
        L_0x0e25:
            on1.k r12 = r1.f33831e
            r14 = 1
            rx3.l r15 = new rx3.l
            r15.<init>(r6, r10)
            r16 = 0
            r17 = 8
            r18 = 0
            r13 = r11
            on1.C11533k.m11346e(r12, r13, r14, r15, r16, r17, r18)
            goto L_0x0e4a
        L_0x0e38:
            on1.k r12 = r1.f33831e
            r14 = 1
            rx3.l r15 = new rx3.l
            r15.<init>(r6, r10)
            r16 = 0
            r17 = 8
            r18 = 0
            r13 = r11
            on1.C11533k.m11346e(r12, r13, r14, r15, r16, r17, r18)
        L_0x0e4a:
            com.tencent.mm.autogen.events.FeedUpdateEvent r0 = r1.f33830d
            com.tencent.mm.autogen.events.FeedUpdateEvent$a r0 = r0.f9173d
            int r0 = r0.f9185l
            if (r0 <= 0) goto L_0x0e66
            on1.k r12 = r1.f33831e
            r14 = 1
            rx3.l r15 = new rx3.l
            com.tencent.mm.autogen.events.FeedUpdateEvent r0 = r1.f33830d
            r15.<init>(r5, r0)
            r16 = 0
            r17 = 8
            r18 = 0
            r13 = r11
            on1.C11533k.m11346e(r12, r13, r14, r15, r16, r17, r18)
        L_0x0e66:
            r2 = 1
            r9.f27482d = r2
            goto L_0x0f49
        L_0x0e6b:
            r7 = 0
            long r4 = r4.f9174a
            int r2 = (r4 > r28 ? 1 : (r4 == r28 ? 0 : -1))
            if (r2 == 0) goto L_0x0f49
            java.util.ArrayList r3 = (java.util.ArrayList) r3
            java.util.Iterator r2 = r3.iterator()
            r3 = 0
        L_0x0e79:
            boolean r4 = r2.hasNext()
            if (r4 == 0) goto L_0x0ea6
            java.lang.Object r4 = r2.next()
            cm1.i2 r4 = (cm1.C0740i2) r4
            boolean r5 = r4 instanceof com.tencent.p014mm.plugin.finder.model.BaseFinderFeed
            if (r5 == 0) goto L_0x0e9d
            com.tencent.mm.plugin.finder.model.BaseFinderFeed r4 = (com.tencent.p014mm.plugin.finder.model.BaseFinderFeed) r4
            com.tencent.mm.plugin.finder.storage.FinderItem r4 = r4.mo3513o()
            long r4 = r4.getId()
            com.tencent.mm.autogen.events.FeedUpdateEvent$a r6 = r0.f9173d
            long r11 = r6.f9174a
            int r6 = (r4 > r11 ? 1 : (r4 == r11 ? 0 : -1))
            if (r6 != 0) goto L_0x0e9d
            r4 = 1
            goto L_0x0e9e
        L_0x0e9d:
            r4 = 0
        L_0x0e9e:
            if (r4 == 0) goto L_0x0ea3
            r12 = r3
            r0 = -1
            goto L_0x0ea8
        L_0x0ea3:
            int r3 = r3 + 1
            goto L_0x0e79
        L_0x0ea6:
            r0 = -1
            r12 = -1
        L_0x0ea8:
            if (r12 == r0) goto L_0x0f49
            on1.k r11 = r1.f33831e
            r13 = 1
            rx3.l r14 = new rx3.l
            r0 = 29
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r14.<init>(r0, r10)
            r15 = 0
            r16 = 8
            r17 = 0
            on1.C11533k.m11346e(r11, r12, r13, r14, r15, r16, r17)
            r2 = 1
            r9.f27482d = r2
            goto L_0x0f49
        L_0x0ec5:
            r7 = 0
            long r4 = r4.f9174a
            int r0 = (r4 > r28 ? 1 : (r4 == r28 ? 0 : -1))
            if (r0 == 0) goto L_0x0f49
            vp1.e r0 = vp1.C65834e.f189316a
            com.tencent.mm.plugin.finder.storage.FinderItem r0 = r0.mo89871e(r4)
            if (r0 == 0) goto L_0x0f49
            com.tencent.mm.autogen.events.FeedUpdateEvent r2 = r1.f33830d
            on1.k r11 = r1.f33831e
            java.util.ArrayList r3 = (java.util.ArrayList) r3
            java.util.Iterator r4 = r3.iterator()
            r6 = 0
        L_0x0edf:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L_0x0f0c
            java.lang.Object r5 = r4.next()
            cm1.i2 r5 = (cm1.C0740i2) r5
            boolean r8 = r5 instanceof com.tencent.p014mm.plugin.finder.model.BaseFinderFeed
            if (r8 == 0) goto L_0x0f03
            com.tencent.mm.plugin.finder.model.BaseFinderFeed r5 = (com.tencent.p014mm.plugin.finder.model.BaseFinderFeed) r5
            com.tencent.mm.plugin.finder.storage.FinderItem r5 = r5.mo3513o()
            long r12 = r5.getId()
            com.tencent.mm.autogen.events.FeedUpdateEvent$a r5 = r2.f9173d
            long r14 = r5.f9174a
            int r5 = (r12 > r14 ? 1 : (r12 == r14 ? 0 : -1))
            if (r5 != 0) goto L_0x0f03
            r5 = 1
            goto L_0x0f04
        L_0x0f03:
            r5 = 0
        L_0x0f04:
            if (r5 == 0) goto L_0x0f09
            r12 = r6
            r4 = -1
            goto L_0x0f0e
        L_0x0f09:
            int r6 = r6 + 1
            goto L_0x0edf
        L_0x0f0c:
            r4 = -1
            r12 = -1
        L_0x0f0e:
            if (r12 == r4) goto L_0x0f47
            com.tencent.mm.autogen.events.FeedUpdateEvent$a r2 = r2.f9173d
            int r2 = r2.f9183j
            r4 = 1
            if (r2 != r4) goto L_0x0f18
            r7 = 1
        L_0x0f18:
            com.tencent.mm.plugin.finder.model.BaseFinderFeed r0 = r11.mo11486d(r0)
            if (r7 == 0) goto L_0x0f21
            r0.mo3497e0(r4)
        L_0x0f21:
            rx3.b0 r2 = rx3.C13598b0.f38549a
            r3.set(r12, r0)
            if (r7 == 0) goto L_0x0f33
            r13 = 1
            r14 = 0
            r15 = 0
            r16 = 12
            r17 = 0
            on1.C11533k.m11346e(r11, r12, r13, r14, r15, r16, r17)
            goto L_0x0f44
        L_0x0f33:
            r20 = 1
            r22 = 0
            r23 = 8
            r24 = 0
            r18 = r11
            r19 = r12
            r21 = r10
            on1.C11533k.m11346e(r18, r19, r20, r21, r22, r23, r24)
        L_0x0f44:
            r2 = 1
            r9.f27482d = r2
        L_0x0f47:
            rx3.b0 r0 = rx3.C13598b0.f38549a
        L_0x0f49:
            boolean r0 = r9.f27482d
            if (r0 == 0) goto L_0x0f52
            on1.k r0 = r1.f33831e
            r0.getClass()
        L_0x0f52:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: on1.C11516e.invoke():void");
    }
}

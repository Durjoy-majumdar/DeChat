package com.tencent.p014mm.plugin.finder.preload;

import cm1.C0740i2;
import com.tencent.p014mm.plugin.finder.preload.MediaPreloadCore;
import com.tencent.p014mm.plugin.finder.storage.FeedData;
import java.util.List;
import rx3.C13604l;
import te3.C64689rq2;

/* renamed from: com.tencent.mm.plugin.finder.preload.a */
public final class C56185a implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ MediaPreloadCore f160318d;

    /* renamed from: e */
    public final /* synthetic */ FeedData f160319e;

    /* renamed from: f */
    public final /* synthetic */ List<C13604l<C0740i2, List<C64689rq2>>> f160320f;

    /* renamed from: g */
    public final /* synthetic */ int f160321g;

    /* renamed from: h */
    public final /* synthetic */ MediaPreloadCore.C56183a f160322h;

    public C56185a(MediaPreloadCore mediaPreloadCore, FeedData feedData, List<C13604l<C0740i2, List<C64689rq2>>> list, int i, MediaPreloadCore.C56183a aVar) {
        this.f160318d = mediaPreloadCore;
        this.f160319e = feedData;
        this.f160320f = list;
        this.f160321g = i;
        this.f160322h = aVar;
    }

    /* JADX WARNING: Removed duplicated region for block: B:100:0x01af A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x0183 A[LOOP:2: B:39:0x0153->B:49:0x0183, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x01d7  */
    /* JADX WARNING: Removed duplicated region for block: B:97:0x0181 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r20 = this;
            r0 = r20
            com.tencent.mm.plugin.finder.preload.MediaPreloadCore r1 = r0.f160318d
            eo1.b r2 = r1.f160307f
            if (r2 == 0) goto L_0x0023
            e03.b r14 = new e03.b
            r4 = 1
            r5 = -1
            int r6 = r1.f160310i
            r7 = 1
            r8 = 0
            r10 = 0
            r11 = 0
            r12 = 112(0x70, float:1.57E-43)
            r13 = 0
            r3 = r14
            r3.<init>(r4, r5, r6, r7, r8, r10, r11, r12, r13)
            com.tencent.mm.plugin.finder.storage.FeedData r1 = r0.f160319e
            java.util.List<rx3.l<cm1.i2, java.util.List<te3.rq2>>> r3 = r0.f160320f
            int r4 = r0.f160321g
            r2.mo83526h(r14, r1, r3, r4)
        L_0x0023:
            com.tencent.mm.plugin.finder.preload.MediaPreloadCore$a r1 = r0.f160322h
            com.tencent.mm.plugin.finder.storage.FeedData r2 = r0.f160319e
            java.util.List<rx3.l<cm1.i2, java.util.List<te3.rq2>>> r3 = r0.f160320f
            r1.getClass()
            java.util.concurrent.CopyOnWriteArrayList r1 = new java.util.concurrent.CopyOnWriteArrayList
            r1.<init>()
            java.util.Iterator r4 = r3.iterator()
            r5 = 0
            r6 = 0
        L_0x0037:
            boolean r7 = r4.hasNext()
            r8 = -1
            r9 = 1
            if (r7 == 0) goto L_0x005e
            java.lang.Object r7 = r4.next()
            rx3.l r7 = (rx3.C13604l) r7
            A r7 = r7.f38555d
            cm1.i2 r7 = (cm1.C0740i2) r7
            long r10 = r7.getItemId()
            long r12 = r2.getId()
            int r7 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r7 != 0) goto L_0x0057
            r7 = 1
            goto L_0x0058
        L_0x0057:
            r7 = 0
        L_0x0058:
            if (r7 == 0) goto L_0x005b
            goto L_0x005f
        L_0x005b:
            int r6 = r6 + 1
            goto L_0x0037
        L_0x005e:
            r6 = -1
        L_0x005f:
            r2 = 100
            java.lang.Class<com.tencent.mm.plugin.FinderCommonFeatureService> r4 = com.tencent.p014mm.plugin.FinderCommonFeatureService.class
            di3.d r4 = di3.C86312j.m106911c(r4)
            com.tencent.mm.plugin.FinderCommonFeatureService r4 = (com.tencent.p014mm.plugin.FinderCommonFeatureService) r4
            co1.e r4 = r4.Hx0()
            int r4 = r4.f154543I
            int r2 = java.lang.Math.min(r2, r4)
            int r4 = r6 + 1
            int r7 = r3.size()
            int r7 = r7 - r9
            int r4 = java.lang.Math.min(r4, r7)
            int r4 = java.lang.Math.max(r4, r5)
            int r7 = r6 + r2
            int r7 = r7 + r9
            int r10 = r3.size()
            int r7 = java.lang.Math.min(r7, r10)
            r10 = 0
            if (r2 <= 0) goto L_0x00e8
            if (r7 >= r4) goto L_0x0093
            goto L_0x00e8
        L_0x0093:
            java.util.List r2 = r3.subList(r4, r7)
            java.util.Iterator r2 = r2.iterator()
            r3 = 0
        L_0x009c:
            boolean r6 = r2.hasNext()
            if (r6 == 0) goto L_0x00df
            java.lang.Object r6 = r2.next()
            int r7 = r3 + 1
            if (r3 < 0) goto L_0x00db
            rx3.l r6 = (rx3.C13604l) r6
            te3.tj0 r11 = new te3.tj0
            r11.<init>()
            A r12 = r6.f38555d
            cm1.i2 r12 = (cm1.C0740i2) r12
            long r12 = r12.getItemId()
            r11.f185579d = r12
            B r6 = r6.f38556e
            java.util.List r6 = (java.util.List) r6
            java.lang.Object r6 = sx3.C110818d0.m150916N(r6)
            te3.rq2 r6 = (te3.C64689rq2) r6
            if (r6 == 0) goto L_0x00d6
            int r12 = r6.f185269g
            r11.f185585j = r12
            long r12 = r6.f185238E
            r11.f185573G = r12
            int r3 = r3 + r4
            r11.f185574H = r3
            r11.f185577K = r5
            r11.f185578L = r5
        L_0x00d6:
            r1.add(r11)
            r3 = r7
            goto L_0x009c
        L_0x00db:
            sx3.C64197v.m75542k()
            throw r10
        L_0x00df:
            java.util.concurrent.CopyOnWriteArrayList<te3.tj0> r2 = gr1.C45946r0.f123949e
            r2.clear()
            r2.addAll(r1)
            goto L_0x011b
        L_0x00e8:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r3 = "recordNextFeed return for centerIndex:"
            r1.append(r3)
            r1.append(r6)
            java.lang.String r3 = " nextCount:"
            r1.append(r3)
            r1.append(r2)
            java.lang.String r2 = " range:("
            r1.append(r2)
            r1.append(r4)
            java.lang.String r2 = ", "
            r1.append(r2)
            r1.append(r7)
            r2 = 41
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            java.lang.String r2 = "Finder.MediaPreloadCore"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r1)
        L_0x011b:
            com.tencent.mm.plugin.finder.preload.MediaPreloadCore r1 = r0.f160318d
            eo1.a r2 = r1.f160308g
            if (r2 == 0) goto L_0x02e8
            int r1 = r1.f160310i
            r1 = 112(0x70, float:1.57E-43)
            r2 = 32
            r1 = r1 & r2
            if (r1 == 0) goto L_0x012d
            java.lang.String r1 = ""
            goto L_0x012e
        L_0x012d:
            r1 = r10
        L_0x012e:
            java.lang.String r3 = "desc"
            gy3.C87412m.m108594g(r1, r3)
            com.tencent.mm.plugin.finder.storage.FeedData r1 = r0.f160319e
            java.util.List<rx3.l<cm1.i2, java.util.List<te3.rq2>>> r3 = r0.f160320f
            java.lang.String r4 = "centerFeed"
            gy3.C87412m.m108594g(r1, r4)
            java.lang.String r4 = "dataList"
            gy3.C87412m.m108594g(r3, r4)
            boolean r4 = r3.isEmpty()
            if (r4 == 0) goto L_0x014e
            java.util.LinkedList r1 = new java.util.LinkedList
            r1.<init>()
            goto L_0x02e8
        L_0x014e:
            java.util.Iterator r4 = r3.iterator()
            r6 = 0
        L_0x0153:
            boolean r7 = r4.hasNext()
            java.lang.String r11 = "null cannot be cast to non-null type com.tencent.mm.plugin.finder.model.BaseFinderFeed"
            if (r7 == 0) goto L_0x0186
            java.lang.Object r7 = r4.next()
            rx3.l r7 = (rx3.C13604l) r7
            A r7 = r7.f38555d
            boolean r12 = r7 instanceof com.tencent.p014mm.plugin.finder.model.BaseFinderFeed
            if (r12 == 0) goto L_0x017e
            gy3.C87412m.m108592e(r7, r11)
            com.tencent.mm.plugin.finder.model.BaseFinderFeed r7 = (com.tencent.p014mm.plugin.finder.model.BaseFinderFeed) r7
            com.tencent.mm.plugin.finder.storage.FinderItem r7 = r7.mo3513o()
            long r12 = r7.getExpectId()
            long r14 = r1.getExpectId()
            int r7 = (r12 > r14 ? 1 : (r12 == r14 ? 0 : -1))
            if (r7 != 0) goto L_0x017e
            r7 = 1
            goto L_0x017f
        L_0x017e:
            r7 = 0
        L_0x017f:
            if (r7 == 0) goto L_0x0183
            r8 = r6
            goto L_0x0186
        L_0x0183:
            int r6 = r6 + 1
            goto L_0x0153
        L_0x0186:
            if (r8 >= 0) goto L_0x018f
            java.util.LinkedList r1 = new java.util.LinkedList
            r1.<init>()
            goto L_0x02e8
        L_0x018f:
            int r8 = r8 - r9
            int r1 = java.lang.Math.max(r5, r8)
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.util.LinkedList r6 = new java.util.LinkedList
            r6.<init>()
            int r7 = r3.size()
            java.util.List r1 = r3.subList(r1, r7)
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            java.util.Iterator r1 = r1.iterator()
        L_0x01af:
            boolean r7 = r1.hasNext()
            r8 = 2
            if (r7 == 0) goto L_0x01db
            java.lang.Object r7 = r1.next()
            r12 = r7
            rx3.l r12 = (rx3.C13604l) r12
            A r12 = r12.f38555d
            boolean r13 = r12 instanceof com.tencent.p014mm.plugin.finder.model.BaseFinderFeed
            if (r13 == 0) goto L_0x01d4
            gy3.C87412m.m108592e(r12, r11)
            com.tencent.mm.plugin.finder.model.BaseFinderFeed r12 = (com.tencent.p014mm.plugin.finder.model.BaseFinderFeed) r12
            com.tencent.mm.plugin.finder.storage.FinderItem r12 = r12.mo3513o()
            int r12 = r12.getMediaType()
            if (r12 != r8) goto L_0x01d4
            r8 = 1
            goto L_0x01d5
        L_0x01d4:
            r8 = 0
        L_0x01d5:
            if (r8 == 0) goto L_0x01af
            r3.add(r7)
            goto L_0x01af
        L_0x01db:
            java.util.Iterator r1 = r3.iterator()
            r3 = 0
        L_0x01e0:
            boolean r7 = r1.hasNext()
            if (r7 == 0) goto L_0x0297
            java.lang.Object r7 = r1.next()
            int r9 = r3 + 1
            if (r3 < 0) goto L_0x0293
            rx3.l r7 = (rx3.C13604l) r7
            r12 = 4
            if (r3 >= r12) goto L_0x028f
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r12 = "feed="
            r3.append(r12)
            A r12 = r7.f38555d
            gy3.C87412m.m108592e(r12, r11)
            com.tencent.mm.plugin.finder.model.BaseFinderFeed r12 = (com.tencent.p014mm.plugin.finder.model.BaseFinderFeed) r12
            com.tencent.mm.plugin.finder.storage.FinderItem r12 = r12.mo3513o()
            com.tencent.mm.protocal.protobuf.FinderObject r12 = r12.getFeedObject()
            long r12 = r12.f164794id
            java.lang.String r12 = o40.C61926c.m72691p(r12)
            r3.append(r12)
            java.lang.String r12 = " mediaSize="
            r3.append(r12)
            B r12 = r7.f38556e
            java.util.List r12 = (java.util.List) r12
            int r12 = r12.size()
            r3.append(r12)
            java.lang.String r12 = " | "
            r3.append(r12)
            java.lang.String r3 = r3.toString()
            r4.append(r3)
            B r3 = r7.f38556e
            java.util.List r3 = (java.util.List) r3
            int r7 = r3.size()
            int r7 = java.lang.Math.min(r8, r7)
            java.util.List r3 = r3.subList(r5, r7)
            java.util.Iterator r3 = r3.iterator()
        L_0x0245:
            boolean r7 = r3.hasNext()
            if (r7 == 0) goto L_0x028a
            java.lang.Object r7 = r3.next()
            te3.rq2 r7 = (te3.C64689rq2) r7
            pl1.b0 r15 = new pl1.b0
            up1.y r14 = up1.C27696y.RAW_IMAGE
            r16 = 0
            r17 = 0
            r18 = 12
            r19 = 0
            r12 = r15
            r13 = r7
            r8 = r15
            r15 = r16
            r16 = r17
            r17 = r18
            r18 = r19
            r12.<init>(r13, r14, r15, r16, r17, r18)
            r6.add(r8)
            java.lang.String r7 = r7.f185275p
            if (r7 == 0) goto L_0x027f
            r8 = 5
            int r12 = r7.length()
            if (r8 <= r12) goto L_0x027a
            r8 = r12
        L_0x027a:
            java.lang.CharSequence r7 = r7.subSequence(r5, r8)
            goto L_0x0280
        L_0x027f:
            r7 = r10
        L_0x0280:
            r4.append(r7)
            java.lang.String r7 = ","
            r4.append(r7)
            r8 = 2
            goto L_0x0245
        L_0x028a:
            java.lang.String r3 = "\n"
            r4.append(r3)
        L_0x028f:
            r3 = r9
            r8 = 2
            goto L_0x01e0
        L_0x0293:
            sx3.C64197v.m75542k()
            throw r10
        L_0x0297:
            java.util.Iterator r1 = r6.iterator()
        L_0x029b:
            boolean r3 = r1.hasNext()
            if (r3 == 0) goto L_0x02c3
            java.lang.Object r3 = r1.next()
            pl1.b0 r3 = (pl1.C62344b0) r3
            bl3.r r5 = bl3.C39818r.f106831a
            java.lang.Class<ht1.t1> r7 = ht1.C60200t1.class
            bl3.r$a r5 = r5.mo62446e(r7)
            java.lang.Class<pl1.s0> r7 = pl1.C11990s0.class
            bl3.c r5 = r5.mo62447c(r7)
            pl1.s0 r5 = (pl1.C11990s0) r5
            k60.d r5 = r5.mo11871f2()
            l60.b r3 = r5.mo85955a(r3)
            r3.mo85953c()
            goto L_0x029b
        L_0x02c3:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r3 = "[preload] size="
            r1.append(r3)
            int r3 = r6.size()
            r1.append(r3)
            r1.append(r2)
            r1.append(r4)
            java.lang.String r1 = r1.toString()
            java.lang.String r2 = "ImagePreloadWorker"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r1)
            java.util.LinkedList r1 = new java.util.LinkedList
            r1.<init>()
        L_0x02e8:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.finder.preload.C56185a.run():void");
    }
}

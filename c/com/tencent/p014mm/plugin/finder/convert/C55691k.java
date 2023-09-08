package com.tencent.p014mm.plugin.finder.convert;

import cm1.C0740i2;
import kf1.C9833k9;
import tf1.C13910j;
import u60.C14121l;

/* renamed from: com.tencent.mm.plugin.finder.convert.k */
public final class C55691k implements C13910j<C0740i2> {

    /* renamed from: d */
    public final /* synthetic */ FinderStreamCardAlbumConvert f158500d;

    /* renamed from: e */
    public final /* synthetic */ C9833k9 f158501e;

    /* renamed from: f */
    public final /* synthetic */ C14121l f158502f;

    public C55691k(FinderStreamCardAlbumConvert finderStreamCardAlbumConvert, C9833k9 k9Var, C14121l lVar) {
        this.f158500d = finderStreamCardAlbumConvert;
        this.f158501e = k9Var;
        this.f158502f = lVar;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0044, code lost:
        r5 = (cm1.C0740i2) sx3.C110818d0.m150916N(r5);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onFetchDone(com.tencent.p014mm.plugin.finder.feed.model.internal.IResponse<cm1.C0740i2> r22) {
        /*
            r21 = this;
            r1 = r21
            r0 = r22
            u60.n r2 = u60.C65234n.OK
            java.lang.String r3 = "response"
            gy3.C87412m.m108594g(r0, r3)
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "[preloadContent] errType="
            r3.append(r4)
            int r4 = r22.getErrType()
            r3.append(r4)
            java.lang.String r4 = " errCode="
            r3.append(r4)
            int r4 = r22.getErrCode()
            r3.append(r4)
            java.lang.String r3 = r3.toString()
            java.lang.String r4 = "Finder.FinderStreamCardAlbumConvert"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r4, r3)
            r3 = 0
            int r5 = r22.getErrType()     // Catch:{ all -> 0x0169 }
            if (r5 != 0) goto L_0x015f
            int r5 = r22.getErrCode()     // Catch:{ all -> 0x0169 }
            if (r5 != 0) goto L_0x015f
            java.util.List r5 = r22.getIncrementList()     // Catch:{ all -> 0x0169 }
            if (r5 == 0) goto L_0x0055
            java.lang.Object r5 = sx3.C110818d0.m150916N(r5)     // Catch:{ all -> 0x0169 }
            cm1.i2 r5 = (cm1.C0740i2) r5     // Catch:{ all -> 0x0169 }
            if (r5 == 0) goto L_0x0055
            int r5 = r5.mo75c()     // Catch:{ all -> 0x0169 }
            r6 = 4
            if (r5 != r6) goto L_0x0055
            r5 = 1
            goto L_0x0056
        L_0x0055:
            r5 = 0
        L_0x0056:
            if (r5 == 0) goto L_0x015f
            java.util.List r5 = r22.getIncrementList()     // Catch:{ all -> 0x0169 }
            if (r5 == 0) goto L_0x0065
            java.lang.Object r5 = sx3.C110818d0.m150916N(r5)     // Catch:{ all -> 0x0169 }
            cm1.i2 r5 = (cm1.C0740i2) r5     // Catch:{ all -> 0x0169 }
            goto L_0x0066
        L_0x0065:
            r5 = 0
        L_0x0066:
            boolean r7 = r5 instanceof com.tencent.p014mm.plugin.finder.model.BaseFinderFeed     // Catch:{ all -> 0x0169 }
            if (r7 == 0) goto L_0x006d
            com.tencent.mm.plugin.finder.model.BaseFinderFeed r5 = (com.tencent.p014mm.plugin.finder.model.BaseFinderFeed) r5     // Catch:{ all -> 0x0169 }
            goto L_0x006e
        L_0x006d:
            r5 = 0
        L_0x006e:
            if (r5 != 0) goto L_0x007a
            com.tencent.mm.plugin.finder.convert.FinderStreamCardAlbumConvert r0 = r1.f158500d
            r0.f158451x = r3
            u60.l r0 = r1.f158502f
            r0.mo11853b(r2)
            return
        L_0x007a:
            com.tencent.mm.plugin.finder.storage.FinderItem$a r7 = com.tencent.p014mm.plugin.finder.storage.FinderItem.Companion     // Catch:{ all -> 0x0169 }
            com.tencent.mm.plugin.finder.storage.FinderItem r8 = r5.mo3513o()     // Catch:{ all -> 0x0169 }
            com.tencent.mm.protocal.protobuf.FinderObject r8 = r8.getFeedObject()     // Catch:{ all -> 0x0169 }
            er1.w3 r9 = er1.C58784w3.f168295a     // Catch:{ all -> 0x0169 }
            com.tencent.mm.plugin.finder.convert.FinderStreamCardAlbumConvert r10 = r1.f158500d     // Catch:{ all -> 0x0169 }
            int r10 = r10.f158436f     // Catch:{ all -> 0x0169 }
            int r10 = r9.mo83887M1(r10)     // Catch:{ all -> 0x0169 }
            com.tencent.mm.plugin.finder.storage.FinderItem r7 = r7.mo79056a(r8, r10)     // Catch:{ all -> 0x0169 }
            wp1.f$a r8 = wp1.C15585f.f42211a     // Catch:{ all -> 0x0169 }
            com.tencent.mm.plugin.finder.model.BaseFinderFeed r7 = r8.mo14348k(r7)     // Catch:{ all -> 0x0169 }
            java.util.LinkedList r8 = new java.util.LinkedList     // Catch:{ all -> 0x0169 }
            r8.<init>()     // Catch:{ all -> 0x0169 }
            com.tencent.mm.plugin.finder.storage.FinderItem r10 = r7.mo3513o()     // Catch:{ all -> 0x0169 }
            java.util.LinkedList r10 = r10.getMediaList()     // Catch:{ all -> 0x0169 }
            r8.addAll(r10)     // Catch:{ all -> 0x0169 }
            rx3.l r10 = new rx3.l     // Catch:{ all -> 0x0169 }
            java.util.List r8 = sx3.C110818d0.m150900B0(r8)     // Catch:{ all -> 0x0169 }
            r10.<init>(r7, r8)     // Catch:{ all -> 0x0169 }
            java.util.LinkedList r7 = new java.util.LinkedList     // Catch:{ all -> 0x0169 }
            r7.<init>()     // Catch:{ all -> 0x0169 }
            r7.add(r10)     // Catch:{ all -> 0x0169 }
            com.tencent.mm.plugin.finder.convert.FinderStreamCardAlbumConvert r8 = r1.f158500d     // Catch:{ all -> 0x0169 }
            rx3.g r8 = r8.f158437g     // Catch:{ all -> 0x0169 }
            rx3.n r8 = (rx3.C36570n) r8     // Catch:{ all -> 0x0169 }
            java.lang.Object r8 = r8.getValue()     // Catch:{ all -> 0x0169 }
            eo1.b r8 = (eo1.C58638b) r8     // Catch:{ all -> 0x0169 }
            e03.b r15 = new e03.b     // Catch:{ all -> 0x0169 }
            r11 = 1
            r12 = -1
            com.tencent.mm.plugin.finder.convert.FinderStreamCardAlbumConvert r10 = r1.f158500d     // Catch:{ all -> 0x0169 }
            int r10 = r10.f158436f     // Catch:{ all -> 0x0169 }
            int r13 = r9.mo83890O(r10)     // Catch:{ all -> 0x0169 }
            r14 = 1
            r16 = 0
            r9 = 0
            r18 = 0
            r19 = 112(0x70, float:1.57E-43)
            r20 = 0
            r10 = r15
            r6 = r15
            r15 = r16
            r17 = r9
            r10.<init>(r11, r12, r13, r14, r15, r17, r18, r19, r20)     // Catch:{ all -> 0x0169 }
            com.tencent.mm.plugin.finder.storage.FeedData$a r9 = com.tencent.p014mm.plugin.finder.storage.FeedData.Companion     // Catch:{ all -> 0x0169 }
            com.tencent.mm.plugin.finder.storage.FinderItem r10 = r5.mo3513o()     // Catch:{ all -> 0x0169 }
            com.tencent.mm.plugin.finder.storage.FeedData r9 = r9.mo78884b(r10)     // Catch:{ all -> 0x0169 }
            java.util.List r7 = sx3.C110818d0.m150900B0(r7)     // Catch:{ all -> 0x0169 }
            r8.mo83526h(r6, r9, r7, r3)     // Catch:{ all -> 0x0169 }
            boolean r6 = r0 instanceof com.tencent.p014mm.plugin.finder.feed.model.FinderFeedRelTimelineLoader.C2664b     // Catch:{ all -> 0x0169 }
            if (r6 == 0) goto L_0x015f
            com.tencent.mm.plugin.finder.feed.model.FinderFeedRelTimelineLoader$b r0 = (com.tencent.p014mm.plugin.finder.feed.model.FinderFeedRelTimelineLoader.C2664b) r0     // Catch:{ all -> 0x0169 }
            java.util.LinkedList<te3.pl1> r0 = r0.f13558c     // Catch:{ all -> 0x0169 }
            java.lang.Object r0 = sx3.C110818d0.m150916N(r0)     // Catch:{ all -> 0x0169 }
            te3.pl1 r0 = (te3.C64629pl1) r0     // Catch:{ all -> 0x0169 }
            if (r0 == 0) goto L_0x0108
            java.lang.String r6 = r0.f184841e     // Catch:{ all -> 0x0169 }
            goto L_0x0109
        L_0x0108:
            r6 = 0
        L_0x0109:
            r7 = 0
            if (r0 == 0) goto L_0x0110
            long r9 = r0.f184854u     // Catch:{ all -> 0x0169 }
            goto L_0x0111
        L_0x0110:
            r9 = r7
        L_0x0111:
            java.lang.String r0 = o40.C61926c.m72691p(r9)     // Catch:{ all -> 0x0169 }
            java.lang.StringBuilder r9 = new java.lang.StringBuilder     // Catch:{ all -> 0x0169 }
            r9.<init>()     // Catch:{ all -> 0x0169 }
            java.lang.String r10 = "preload this feed video. cardId="
            r9.append(r10)     // Catch:{ all -> 0x0169 }
            r9.append(r0)     // Catch:{ all -> 0x0169 }
            java.lang.String r0 = " titleWording="
            r9.append(r0)     // Catch:{ all -> 0x0169 }
            r9.append(r6)     // Catch:{ all -> 0x0169 }
            java.lang.String r0 = " card request id="
            r9.append(r0)     // Catch:{ all -> 0x0169 }
            kf1.k9 r0 = r1.f158501e     // Catch:{ all -> 0x0169 }
            te3.pl1 r0 = r0.f30387d     // Catch:{ all -> 0x0169 }
            te3.ql1 r0 = r0.f184837C     // Catch:{ all -> 0x0169 }
            if (r0 == 0) goto L_0x0141
            te3.kp0 r0 = r0.f140381f     // Catch:{ all -> 0x0169 }
            if (r0 == 0) goto L_0x0141
            te3.vd4 r0 = r0.f136954z     // Catch:{ all -> 0x0169 }
            if (r0 == 0) goto L_0x0141
            long r7 = r0.f143446d     // Catch:{ all -> 0x0169 }
        L_0x0141:
            java.lang.String r0 = o40.C61926c.m72691p(r7)     // Catch:{ all -> 0x0169 }
            r9.append(r0)     // Catch:{ all -> 0x0169 }
            java.lang.String r0 = " first feedId="
            r9.append(r0)     // Catch:{ all -> 0x0169 }
            long r5 = r5.getItemId()     // Catch:{ all -> 0x0169 }
            java.lang.String r0 = o40.C61926c.m72691p(r5)     // Catch:{ all -> 0x0169 }
            r9.append(r0)     // Catch:{ all -> 0x0169 }
            java.lang.String r0 = r9.toString()     // Catch:{ all -> 0x0169 }
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r4, r0)     // Catch:{ all -> 0x0169 }
        L_0x015f:
            com.tencent.mm.plugin.finder.convert.FinderStreamCardAlbumConvert r0 = r1.f158500d
            r0.f158451x = r3
            u60.l r0 = r1.f158502f
            r0.mo11853b(r2)
            return
        L_0x0169:
            r0 = move-exception
            com.tencent.mm.plugin.finder.convert.FinderStreamCardAlbumConvert r4 = r1.f158500d
            r4.f158451x = r3
            u60.l r3 = r1.f158502f
            r3.mo11853b(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.finder.convert.C55691k.onFetchDone(com.tencent.mm.plugin.finder.feed.model.internal.IResponse):void");
    }
}

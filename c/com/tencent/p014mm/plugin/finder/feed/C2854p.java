package com.tencent.p014mm.plugin.finder.feed;

import com.tencent.p014mm.autogen.events.FeedUpdateEvent;
import fy3.C32224a;
import gy3.C87413o;
import rx3.C13598b0;

/* renamed from: com.tencent.mm.plugin.finder.feed.p */
public final class C2854p extends C87413o implements C32224a<C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ FeedUpdateEvent f14175d;

    /* renamed from: e */
    public final /* synthetic */ C2829n f14176e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C2854p(FeedUpdateEvent feedUpdateEvent, C2829n nVar) {
        super(0);
        this.f14175d = feedUpdateEvent;
        this.f14176e = nVar;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v10, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v3, resolved type: cm1.j0} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v18, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v7, resolved type: cm1.j0} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v24, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v16, resolved type: cm1.j0} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v35, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v21, resolved type: cm1.j0} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object invoke() {
        /*
            r18 = this;
            r0 = r18
            com.tencent.mm.autogen.events.FeedUpdateEvent r1 = r0.f14175d
            com.tencent.mm.autogen.events.FeedUpdateEvent$a r1 = r1.f9173d
            r1.getClass()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "feedChangeListener "
            r1.append(r2)
            com.tencent.mm.autogen.events.FeedUpdateEvent r2 = r0.f14175d
            com.tencent.mm.autogen.events.FeedUpdateEvent$a r2 = r2.f9173d
            long r2 = r2.f9174a
            r1.append(r2)
            java.lang.String r2 = ",fav = "
            r1.append(r2)
            com.tencent.mm.autogen.events.FeedUpdateEvent r2 = r0.f14175d
            com.tencent.mm.autogen.events.FeedUpdateEvent$a r2 = r2.f9173d
            int r2 = r2.f9176c
            r1.append(r2)
            java.lang.String r2 = ",like = "
            r1.append(r2)
            com.tencent.mm.autogen.events.FeedUpdateEvent r2 = r0.f14175d
            com.tencent.mm.autogen.events.FeedUpdateEvent$a r2 = r2.f9173d
            int r2 = r2.f9178e
            r1.append(r2)
            java.lang.String r2 = ",likeCount = "
            r1.append(r2)
            com.tencent.mm.autogen.events.FeedUpdateEvent r2 = r0.f14175d
            com.tencent.mm.autogen.events.FeedUpdateEvent$a r2 = r2.f9173d
            int r2 = r2.f9179f
            r1.append(r2)
            java.lang.String r2 = " ,needChangeData = "
            r1.append(r2)
            com.tencent.mm.autogen.events.FeedUpdateEvent r2 = r0.f14175d
            com.tencent.mm.autogen.events.FeedUpdateEvent$a r2 = r2.f9173d
            int r2 = r2.f9177d
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            java.lang.String r2 = "FinderLongVideoShareContract"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r1)
            com.tencent.mm.autogen.events.FeedUpdateEvent r1 = r0.f14175d
            com.tencent.mm.autogen.events.FeedUpdateEvent$a r1 = r1.f9173d
            int r3 = r1.f9175b
            r4 = 0
            r6 = 0
            r7 = 0
            r8 = 1
            if (r3 == 0) goto L_0x0332
            if (r3 == r8) goto L_0x02e4
            r9 = 35
            r10 = 4
            java.lang.String r11 = "feed"
            if (r3 == r10) goto L_0x01cd
            r12 = 5
            if (r3 == r12) goto L_0x00ca
            r2 = 20
            if (r3 == r2) goto L_0x007c
            goto L_0x0380
        L_0x007c:
            long r1 = r1.f9174a
            int r3 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
            if (r3 == 0) goto L_0x0380
            com.tencent.mm.plugin.finder.feed.n r1 = r0.f14176e
            jq3.o r1 = r1.mo2931f()
            java.lang.Object r1 = r1.f173503E
            boolean r2 = r1 instanceof cm1.C55018j0
            if (r2 == 0) goto L_0x0091
            cm1.j0 r1 = (cm1.C55018j0) r1
            goto L_0x0092
        L_0x0091:
            r1 = r6
        L_0x0092:
            if (r1 == 0) goto L_0x00a3
            long r1 = r1.getItemId()
            com.tencent.mm.autogen.events.FeedUpdateEvent r3 = r0.f14175d
            com.tencent.mm.autogen.events.FeedUpdateEvent$a r3 = r3.f9173d
            long r3 = r3.f9174a
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 != 0) goto L_0x00a3
            r7 = 1
        L_0x00a3:
            if (r7 == 0) goto L_0x0380
            com.tencent.mm.plugin.finder.feed.n r1 = r0.f14176e
            jq3.o r1 = r1.mo2931f()
            java.lang.Object r1 = r1.f173503E
            r13 = r1
            cm1.j0 r13 = (cm1.C55018j0) r13
            com.tencent.mm.plugin.finder.feed.n r12 = r0.f14176e
            gy3.C87412m.m108593f(r13, r11)
            rx3.l r14 = new rx3.l
            r1 = 12
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r14.<init>(r1, r6)
            r15 = 0
            r16 = 4
            r17 = 0
            com.tencent.p014mm.plugin.finder.feed.C2829n.m2663b(r12, r13, r14, r15, r16, r17)
            goto L_0x0380
        L_0x00ca:
            long r12 = r1.f9174a
            int r1 = (r12 > r4 ? 1 : (r12 == r4 ? 0 : -1))
            if (r1 == 0) goto L_0x0380
            com.tencent.mm.plugin.finder.feed.n r1 = r0.f14176e
            jq3.o r1 = r1.mo2931f()
            java.lang.Object r1 = r1.f173503E
            boolean r3 = r1 instanceof cm1.C55018j0
            if (r3 == 0) goto L_0x00df
            r6 = r1
            cm1.j0 r6 = (cm1.C55018j0) r6
        L_0x00df:
            if (r6 == 0) goto L_0x00f1
            long r3 = r6.getItemId()
            com.tencent.mm.autogen.events.FeedUpdateEvent r1 = r0.f14175d
            com.tencent.mm.autogen.events.FeedUpdateEvent$a r1 = r1.f9173d
            long r5 = r1.f9174a
            int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r1 != 0) goto L_0x00f1
            r1 = 1
            goto L_0x00f2
        L_0x00f1:
            r1 = 0
        L_0x00f2:
            if (r1 == 0) goto L_0x0380
            com.tencent.mm.plugin.finder.feed.n r1 = r0.f14176e
            jq3.o r1 = r1.mo2931f()
            java.lang.Object r1 = r1.f173503E
            cm1.j0 r1 = (cm1.C55018j0) r1
            com.tencent.mm.autogen.events.FeedUpdateEvent r3 = r0.f14175d
            com.tencent.mm.autogen.events.FeedUpdateEvent$a r3 = r3.f9173d
            int r4 = r3.f9176c
            if (r4 != r8) goto L_0x0107
            r7 = 1
        L_0x0107:
            int r3 = r3.f9177d
            r4 = 9
            if (r3 != r8) goto L_0x0175
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r5 = "TYPE_FAV_CHANGED oldFlag = "
            r3.append(r5)
            com.tencent.mm.plugin.finder.storage.FinderItem r5 = r1.mo3513o()
            int r5 = r5.getFavFlag()
            r3.append(r5)
            java.lang.String r5 = ", eventFlag = "
            r3.append(r5)
            r3.append(r7)
            java.lang.String r3 = r3.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r3)
            com.tencent.mm.plugin.finder.storage.FinderItem r2 = r1.mo3513o()
            int r2 = r2.getFavFlag()
            if (r2 == r7) goto L_0x01aa
            com.tencent.mm.plugin.finder.storage.FinderItem r2 = r1.mo3513o()
            r2.setFavFlag(r7)
            com.tencent.mm.plugin.finder.feed.n r12 = r0.f14176e
            rx3.l r14 = new rx3.l
            java.lang.Integer r2 = java.lang.Integer.valueOf(r10)
            java.lang.Integer r3 = java.lang.Integer.valueOf(r8)
            r14.<init>(r2, r3)
            r2 = 0
            r3 = 4
            r5 = 0
            r15 = 0
            r16 = 4
            r17 = 0
            r13 = r1
            com.tencent.p014mm.plugin.finder.feed.C2829n.m2663b(r12, r13, r14, r15, r16, r17)
            com.tencent.mm.plugin.finder.feed.n r12 = r0.f14176e
            rx3.l r14 = new rx3.l
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            java.lang.Integer r6 = java.lang.Integer.valueOf(r8)
            r14.<init>(r4, r6)
            r15 = r2
            r16 = r3
            r17 = r5
            com.tencent.p014mm.plugin.finder.feed.C2829n.m2663b(r12, r13, r14, r15, r16, r17)
            goto L_0x01aa
        L_0x0175:
            com.tencent.mm.plugin.finder.feed.n r12 = r0.f14176e
            gy3.C87412m.m108593f(r1, r11)
            rx3.l r14 = new rx3.l
            java.lang.Integer r2 = java.lang.Integer.valueOf(r10)
            java.lang.Integer r3 = java.lang.Integer.valueOf(r8)
            r14.<init>(r2, r3)
            r2 = 0
            r3 = 4
            r5 = 0
            r15 = 0
            r16 = 4
            r17 = 0
            r13 = r1
            com.tencent.p014mm.plugin.finder.feed.C2829n.m2663b(r12, r13, r14, r15, r16, r17)
            com.tencent.mm.plugin.finder.feed.n r12 = r0.f14176e
            rx3.l r14 = new rx3.l
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            java.lang.Integer r6 = java.lang.Integer.valueOf(r8)
            r14.<init>(r4, r6)
            r15 = r2
            r16 = r3
            r17 = r5
            com.tencent.p014mm.plugin.finder.feed.C2829n.m2663b(r12, r13, r14, r15, r16, r17)
        L_0x01aa:
            com.tencent.mm.autogen.events.FeedUpdateEvent r2 = r0.f14175d
            com.tencent.mm.autogen.events.FeedUpdateEvent$a r2 = r2.f9173d
            int r2 = r2.f9185l
            if (r2 <= 0) goto L_0x0380
            com.tencent.mm.plugin.finder.feed.n r12 = r0.f14176e
            gy3.C87412m.m108593f(r1, r11)
            rx3.l r14 = new rx3.l
            java.lang.Integer r2 = java.lang.Integer.valueOf(r9)
            com.tencent.mm.autogen.events.FeedUpdateEvent r3 = r0.f14175d
            r14.<init>(r2, r3)
            r15 = 0
            r16 = 4
            r17 = 0
            r13 = r1
            com.tencent.p014mm.plugin.finder.feed.C2829n.m2663b(r12, r13, r14, r15, r16, r17)
            goto L_0x0380
        L_0x01cd:
            long r12 = r1.f9174a
            int r1 = (r12 > r4 ? 1 : (r12 == r4 ? 0 : -1))
            if (r1 == 0) goto L_0x0380
            com.tencent.mm.plugin.finder.feed.n r1 = r0.f14176e
            jq3.o r1 = r1.mo2931f()
            java.lang.Object r1 = r1.f173503E
            boolean r3 = r1 instanceof cm1.C55018j0
            if (r3 == 0) goto L_0x01e2
            r6 = r1
            cm1.j0 r6 = (cm1.C55018j0) r6
        L_0x01e2:
            if (r6 == 0) goto L_0x01f3
            long r3 = r6.getItemId()
            com.tencent.mm.autogen.events.FeedUpdateEvent r1 = r0.f14175d
            com.tencent.mm.autogen.events.FeedUpdateEvent$a r1 = r1.f9173d
            long r5 = r1.f9174a
            int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r1 != 0) goto L_0x01f3
            r7 = 1
        L_0x01f3:
            if (r7 == 0) goto L_0x0380
            com.tencent.mm.plugin.finder.feed.n r1 = r0.f14176e
            jq3.o r1 = r1.mo2931f()
            java.lang.Object r1 = r1.f173503E
            cm1.j0 r1 = (cm1.C55018j0) r1
            com.tencent.mm.autogen.events.FeedUpdateEvent r3 = r0.f14175d
            com.tencent.mm.autogen.events.FeedUpdateEvent$a r3 = r3.f9173d
            int r4 = r3.f9177d
            r5 = 3
            if (r4 != r8) goto L_0x02a6
            int r3 = r3.f9178e
            com.tencent.mm.plugin.finder.storage.FinderItem r4 = r1.mo3513o()
            int r4 = r4.getLikeFlag()
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r7 = "TYPE_FEED_LIKE_CHANGED oldFlag:"
            r6.append(r7)
            r6.append(r4)
            java.lang.String r7 = ", newFlag:"
            r6.append(r7)
            r6.append(r3)
            java.lang.String r6 = r6.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r6)
            if (r4 == r3) goto L_0x02c1
            com.tencent.mm.plugin.finder.storage.FinderItem r2 = r1.mo3513o()
            r2.setLikeFlag(r3)
            if (r4 != 0) goto L_0x0246
            com.tencent.mm.plugin.finder.storage.FinderItem r2 = r1.mo3513o()
            int r6 = r2.getLikeCount()
            int r6 = r6 + r8
            r2.setLikeCount(r6)
            goto L_0x0255
        L_0x0246:
            if (r3 != 0) goto L_0x0255
            com.tencent.mm.plugin.finder.storage.FinderItem r2 = r1.mo3513o()
            int r6 = r2.getLikeCount()
            int r6 = r6 + -1
            r2.setLikeCount(r6)
        L_0x0255:
            if (r3 != r8) goto L_0x0271
            com.tencent.mm.plugin.finder.storage.FinderItem r2 = r1.mo3513o()
            int r3 = r2.getFriendLikeCount()
            int r3 = r3 + r8
            r2.setFriendLikeCount(r3)
            vq1.w r2 = vq1.C65866w.f189407h
            com.tencent.mm.plugin.finder.storage.FinderItem r3 = r1.mo3513o()
            java.util.LinkedList r3 = r3.getLikeList()
            r2.mo89903a(r3)
            goto L_0x028d
        L_0x0271:
            if (r4 != r8) goto L_0x028d
            com.tencent.mm.plugin.finder.storage.FinderItem r2 = r1.mo3513o()
            int r3 = r2.getFriendLikeCount()
            int r3 = r3 + -1
            r2.setFriendLikeCount(r3)
            vq1.w r2 = vq1.C65866w.f189407h
            com.tencent.mm.plugin.finder.storage.FinderItem r3 = r1.mo3513o()
            java.util.LinkedList r3 = r3.getLikeList()
            r2.mo89912k(r3)
        L_0x028d:
            com.tencent.mm.plugin.finder.feed.n r12 = r0.f14176e
            rx3.l r14 = new rx3.l
            java.lang.Integer r2 = java.lang.Integer.valueOf(r5)
            java.lang.Integer r3 = java.lang.Integer.valueOf(r8)
            r14.<init>(r2, r3)
            r15 = 0
            r16 = 4
            r17 = 0
            r13 = r1
            com.tencent.p014mm.plugin.finder.feed.C2829n.m2663b(r12, r13, r14, r15, r16, r17)
            goto L_0x02c1
        L_0x02a6:
            com.tencent.mm.plugin.finder.feed.n r12 = r0.f14176e
            gy3.C87412m.m108593f(r1, r11)
            rx3.l r14 = new rx3.l
            java.lang.Integer r2 = java.lang.Integer.valueOf(r5)
            java.lang.Integer r3 = java.lang.Integer.valueOf(r8)
            r14.<init>(r2, r3)
            r15 = 0
            r16 = 4
            r17 = 0
            r13 = r1
            com.tencent.p014mm.plugin.finder.feed.C2829n.m2663b(r12, r13, r14, r15, r16, r17)
        L_0x02c1:
            com.tencent.mm.autogen.events.FeedUpdateEvent r2 = r0.f14175d
            com.tencent.mm.autogen.events.FeedUpdateEvent$a r2 = r2.f9173d
            int r2 = r2.f9185l
            if (r2 <= 0) goto L_0x0380
            com.tencent.mm.plugin.finder.feed.n r12 = r0.f14176e
            gy3.C87412m.m108593f(r1, r11)
            rx3.l r14 = new rx3.l
            java.lang.Integer r2 = java.lang.Integer.valueOf(r9)
            com.tencent.mm.autogen.events.FeedUpdateEvent r3 = r0.f14175d
            r14.<init>(r2, r3)
            r15 = 0
            r16 = 4
            r17 = 0
            r13 = r1
            com.tencent.p014mm.plugin.finder.feed.C2829n.m2663b(r12, r13, r14, r15, r16, r17)
            goto L_0x0380
        L_0x02e4:
            long r1 = r1.f9174a
            int r3 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
            if (r3 == 0) goto L_0x0380
            com.tencent.mm.plugin.finder.feed.n r1 = r0.f14176e
            jq3.o r1 = r1.mo2931f()
            java.lang.Object r1 = r1.f173503E
            boolean r2 = r1 instanceof cm1.C55018j0
            if (r2 == 0) goto L_0x02f9
            r6 = r1
            cm1.j0 r6 = (cm1.C55018j0) r6
        L_0x02f9:
            if (r6 == 0) goto L_0x030a
            long r1 = r6.getItemId()
            com.tencent.mm.autogen.events.FeedUpdateEvent r3 = r0.f14175d
            com.tencent.mm.autogen.events.FeedUpdateEvent$a r3 = r3.f9173d
            long r3 = r3.f9174a
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 != 0) goto L_0x030a
            r7 = 1
        L_0x030a:
            if (r7 == 0) goto L_0x0380
            com.tencent.mm.plugin.finder.feed.n r1 = r0.f14176e
            jq3.o r2 = r1.mo2931f()
            java.lang.Object r2 = r2.f173503E
            java.lang.String r3 = "videoHolder.getAssociatedObject()"
            gy3.C87412m.m108593f(r2, r3)
            cm1.j0 r2 = (cm1.C55018j0) r2
            rx3.l r3 = new rx3.l
            r4 = 29
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            java.lang.Integer r5 = java.lang.Integer.valueOf(r8)
            r3.<init>(r4, r5)
            r4 = 0
            r5 = 4
            r6 = 0
            com.tencent.p014mm.plugin.finder.feed.C2829n.m2663b(r1, r2, r3, r4, r5, r6)
            goto L_0x0380
        L_0x0332:
            long r1 = r1.f9174a
            int r3 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
            if (r3 == 0) goto L_0x0380
            com.tencent.mm.plugin.finder.feed.n r1 = r0.f14176e
            jq3.o r1 = r1.mo2931f()
            java.lang.Object r1 = r1.f173503E
            boolean r2 = r1 instanceof cm1.C55018j0
            if (r2 == 0) goto L_0x0347
            r6 = r1
            cm1.j0 r6 = (cm1.C55018j0) r6
        L_0x0347:
            if (r6 == 0) goto L_0x0358
            long r1 = r6.getItemId()
            com.tencent.mm.autogen.events.FeedUpdateEvent r3 = r0.f14175d
            com.tencent.mm.autogen.events.FeedUpdateEvent$a r3 = r3.f9173d
            long r3 = r3.f9174a
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 != 0) goto L_0x0358
            r7 = 1
        L_0x0358:
            if (r7 == 0) goto L_0x0380
            vp1.e r1 = vp1.C65834e.f189316a
            com.tencent.mm.autogen.events.FeedUpdateEvent r2 = r0.f14175d
            com.tencent.mm.autogen.events.FeedUpdateEvent$a r2 = r2.f9173d
            gy3.C87412m.m108591d(r2)
            long r2 = r2.f9174a
            com.tencent.mm.plugin.finder.storage.FinderItem r1 = r1.mo89871e(r2)
            if (r1 == 0) goto L_0x0380
            com.tencent.mm.plugin.finder.feed.n r2 = r0.f14176e
            wp1.f$a r3 = wp1.C15585f.f42211a
            com.tencent.mm.plugin.finder.model.BaseFinderFeed r1 = r3.mo14348k(r1)
            r3 = r1
            cm1.j0 r3 = (cm1.C55018j0) r3
            java.lang.Integer r4 = java.lang.Integer.valueOf(r8)
            r5 = 0
            r6 = 4
            r7 = 0
            com.tencent.p014mm.plugin.finder.feed.C2829n.m2663b(r2, r3, r4, r5, r6, r7)
        L_0x0380:
            rx3.b0 r1 = rx3.C13598b0.f38549a
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.finder.feed.C2854p.invoke():java.lang.Object");
    }
}

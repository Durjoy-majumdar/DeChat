package com.tencent.p014mm.plugin.finder.nearby.newlivesquare;

import com.tencent.p014mm.autogen.events.FinderNewSquareDataUpdateEvent;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.sdk.event.IListener;
import kotlin.Metadata;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u000f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, mo182094d2 = {"com/tencent/mm/plugin/finder/nearby/newlivesquare/LiveEntranceFragmentViewCallback$finderNearbyInsertEventListener$1", "Lcom/tencent/mm/sdk/event/IListener;", "Lcom/tencent/mm/autogen/events/FinderNewSquareDataUpdateEvent;", "plugin-finder-nearby_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.finder.nearby.newlivesquare.LiveEntranceFragmentViewCallback$finderNearbyInsertEventListener$1 */
public final class C3319x38874615 extends IListener<FinderNewSquareDataUpdateEvent> {

    /* renamed from: d */
    public final /* synthetic */ LiveEntranceFragmentViewCallback f15741d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C3319x38874615(LiveEntranceFragmentViewCallback liveEntranceFragmentViewCallback, MMActivity mMActivity) {
        super(mMActivity);
        this.f15741d = liveEntranceFragmentViewCallback;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v4, resolved type: an1.o} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v5, resolved type: an1.m} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v7, resolved type: an1.o} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v9, resolved type: an1.o} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r16v2, resolved type: an1.o} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean callback(com.tencent.p014mm.sdk.event.IEvent r26) {
        /*
            r25 = this;
            r0 = r25
            r1 = r26
            com.tencent.mm.autogen.events.FinderNewSquareDataUpdateEvent r1 = (com.tencent.p014mm.autogen.events.FinderNewSquareDataUpdateEvent) r1
            java.lang.String r2 = "event"
            gy3.C87412m.m108594g(r1, r2)
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = " receive FinderNewEntranceNotifyInsertEvent objectId = "
            r2.append(r3)
            com.tencent.mm.autogen.events.FinderNewSquareDataUpdateEvent$a r3 = r1.f9233d
            long r3 = r3.f9234a
            r2.append(r3)
            java.lang.String r3 = " recomRsp: "
            r2.append(r3)
            com.tencent.mm.plugin.finder.nearby.newlivesquare.LiveEntranceFragmentViewCallback r3 = r0.f15741d
            te3.ge1 r3 = r3.f15697B
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            java.lang.String r3 = "Finder.LiveEntranceFragmentViewCallback"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r3, r2)
            com.tencent.mm.autogen.events.FinderNewSquareDataUpdateEvent$a r1 = r1.f9233d
            long r4 = r1.f9234a
            r6 = 0
            r2 = 0
            r8 = 1
            int r9 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r9 == 0) goto L_0x017d
            com.tencent.mm.plugin.finder.nearby.newlivesquare.LiveEntranceFragmentViewCallback r6 = r0.f15741d
            te3.ge1 r7 = r6.f15697B
            if (r7 != 0) goto L_0x0045
            goto L_0x017d
        L_0x0045:
            boolean r1 = r1.f9235b
            java.util.ArrayList<cm1.i2> r7 = r6.f15710i
            java.util.Iterator r7 = r7.iterator()
            r9 = -1
            r10 = -1
            r11 = 0
            r12 = -1
        L_0x0051:
            boolean r13 = r7.hasNext()
            r14 = 4
            r15 = 0
            if (r13 == 0) goto L_0x0088
            java.lang.Object r13 = r7.next()
            int r16 = r11 + 1
            if (r11 < 0) goto L_0x0084
            cm1.i2 r13 = (cm1.C0740i2) r13
            boolean r15 = r13 instanceof bn1.C0331b
            if (r15 == 0) goto L_0x0081
            bn1.b r13 = (bn1.C0331b) r13
            te3.a91 r15 = r13.f903d
            int r15 = r15.f130378e
            if (r15 != r14) goto L_0x0081
            if (r12 != r9) goto L_0x0072
            r12 = r11
        L_0x0072:
            com.tencent.mm.plugin.finder.storage.FinderItem r13 = r13.mo3513o()
            com.tencent.mm.protocal.protobuf.FinderObject r13 = r13.getFeedObject()
            long r13 = r13.f164794id
            int r15 = (r13 > r4 ? 1 : (r13 == r4 ? 0 : -1))
            if (r15 != 0) goto L_0x0081
            r10 = r11
        L_0x0081:
            r11 = r16
            goto L_0x0051
        L_0x0084:
            sx3.C64197v.m75542k()
            throw r15
        L_0x0088:
            if (r10 == r9) goto L_0x0099
            if (r1 == 0) goto L_0x008d
            goto L_0x0099
        L_0x008d:
            int r4 = r10 - r12
            int r4 = r4 % 2
            if (r4 != 0) goto L_0x0096
            int r4 = r10 + 2
            goto L_0x009a
        L_0x0096:
            int r4 = r10 + 1
            goto L_0x009a
        L_0x0099:
            r4 = r12
        L_0x009a:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r7 = "withInsertAfterWatchLive curObjectIndex: "
            r5.append(r7)
            r5.append(r10)
            java.lang.String r7 = " firstRecomIndex: "
            r5.append(r7)
            r5.append(r12)
            java.lang.String r7 = " isFromRedRecom: "
            r5.append(r7)
            r5.append(r1)
            java.lang.String r1 = " targetInsertPosition: "
            r5.append(r1)
            r5.append(r4)
            java.lang.String r1 = r5.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r3, r1)
            if (r4 != r9) goto L_0x00cb
            goto L_0x017c
        L_0x00cb:
            te3.ge1 r1 = r6.f15697B
            if (r1 == 0) goto L_0x017a
            java.util.LinkedList<te3.a91> r1 = r1.f133994d
            if (r1 == 0) goto L_0x017a
            java.util.Iterator r1 = r1.iterator()
        L_0x00d7:
            boolean r5 = r1.hasNext()
            if (r5 == 0) goto L_0x017a
            java.lang.Object r5 = r1.next()
            te3.a91 r5 = (te3.C48682a91) r5
            int r7 = r5.f130378e
            if (r7 != r14) goto L_0x00d7
            java.util.LinkedList<te3.z81> r7 = r5.f130381h
            if (r7 == 0) goto L_0x00d7
            java.util.Iterator r7 = r7.iterator()
        L_0x00ef:
            boolean r9 = r7.hasNext()
            if (r9 == 0) goto L_0x00d7
            java.lang.Object r9 = r7.next()
            te3.z81 r9 = (te3.C52231z81) r9
            com.tencent.mm.protocal.protobuf.FinderObject r10 = r9.f145756f
            if (r10 == 0) goto L_0x00ef
            wp1.f$a r11 = wp1.C15585f.f42211a
            java.util.List r10 = sx3.C26236u.m33719b(r10)
            er1.w3 r12 = er1.C58784w3.f168295a
            int r12 = r12.mo83887M1(r2)
            te3.hj1 r13 = r6.f15705d
            java.util.List r10 = r11.mo14343f(r10, r12, r13)
            java.lang.Object r10 = sx3.C110818d0.m150916N(r10)
            com.tencent.mm.plugin.finder.storage.FinderItem r10 = (com.tencent.p014mm.plugin.finder.storage.FinderItem) r10
            if (r10 == 0) goto L_0x00ef
            int r11 = r9.f145755e
            if (r11 == r14) goto L_0x0145
            r12 = 6
            if (r11 == r12) goto L_0x0122
            r11 = r15
            goto L_0x014c
        L_0x0122:
            an1.o r11 = new an1.o
            java.util.LinkedList<com.tencent.mm.protocal.protobuf.FinderObject> r12 = r9.f145759i
            java.lang.String r13 = "card.relate_living"
            gy3.C87412m.m108593f(r12, r13)
            te3.b71 r13 = r9.f145763p
            java.lang.String r9 = r9.f145762o
            r22 = 0
            r23 = 32
            r24 = 0
            r16 = r11
            r17 = r10
            r18 = r5
            r19 = r12
            r20 = r13
            r21 = r9
            r16.<init>(r17, r18, r19, r20, r21, r22, r23, r24)
            goto L_0x014c
        L_0x0145:
            an1.m r11 = new an1.m
            java.lang.String r9 = r9.f145762o
            r11.<init>(r10, r5, r9, r8)
        L_0x014c:
            if (r11 == 0) goto L_0x00ef
            java.util.ArrayList<cm1.i2> r9 = r6.f15710i
            r9.add(r4, r11)
            zm1.e r9 = r6.f15711j
            if (r9 == 0) goto L_0x015a
            r9.notifyItemInserted(r4)
        L_0x015a:
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            java.lang.String r10 = "#transResponseToListData insertAfterObjectId success! userName="
            r9.append(r10)
            com.tencent.mm.plugin.finder.storage.FinderItem r10 = r11.mo3513o()
            java.lang.String r10 = r10.getUserName()
            r9.append(r10)
            java.lang.String r9 = r9.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r3, r9)
            int r4 = r4 + 1
            goto L_0x00ef
        L_0x017a:
            r6.f15697B = r15
        L_0x017c:
            r2 = 1
        L_0x017d:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.finder.nearby.newlivesquare.C3319x38874615.callback(com.tencent.mm.sdk.event.IEvent):boolean");
    }
}

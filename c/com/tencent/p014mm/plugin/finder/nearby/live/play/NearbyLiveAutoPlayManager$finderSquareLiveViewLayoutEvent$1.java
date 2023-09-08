package com.tencent.p014mm.plugin.finder.nearby.live.play;

import com.tencent.p014mm.app.C40008f;
import com.tencent.p014mm.autogen.events.FinderSquareLiveViewLayoutEvent;
import com.tencent.p014mm.sdk.event.IListener;
import kotlin.Metadata;
import pm1.C62381d;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, mo182094d2 = {"com/tencent/mm/plugin/finder/nearby/live/play/NearbyLiveAutoPlayManager$finderSquareLiveViewLayoutEvent$1", "Lcom/tencent/mm/sdk/event/IListener;", "Lcom/tencent/mm/autogen/events/FinderSquareLiveViewLayoutEvent;", "plugin-finder-nearby_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.finder.nearby.live.play.NearbyLiveAutoPlayManager$finderSquareLiveViewLayoutEvent$1 */
public final class NearbyLiveAutoPlayManager$finderSquareLiveViewLayoutEvent$1 extends IListener<FinderSquareLiveViewLayoutEvent> {

    /* renamed from: d */
    public final /* synthetic */ C62381d f160211d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public NearbyLiveAutoPlayManager$finderSquareLiveViewLayoutEvent$1(C62381d dVar, C40008f fVar) {
        super(fVar);
        this.f160211d = dVar;
    }

    /* JADX WARNING: Removed duplicated region for block: B:19:0x0055 A[LOOP:0: B:3:0x001c->B:19:0x0055, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x0059 A[EDGE_INSN: B:43:0x0059->B:21:0x0059 ?: BREAK  , SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean callback(com.tencent.p014mm.sdk.event.IEvent r10) {
        /*
            r9 = this;
            com.tencent.mm.autogen.events.FinderSquareLiveViewLayoutEvent r10 = (com.tencent.p014mm.autogen.events.FinderSquareLiveViewLayoutEvent) r10
            java.lang.String r0 = "event"
            gy3.C87412m.m108594g(r10, r0)
            pm1.d r0 = r9.f160211d
            androidx.recyclerview.widget.RecyclerView r1 = r0.f177286b
            r2 = 0
            r3 = 1
            if (r1 != 0) goto L_0x0011
            goto L_0x00dc
        L_0x0011:
            com.tencent.mm.autogen.events.FinderSquareLiveViewLayoutEvent$a r10 = r10.f154812d
            long r4 = r10.f154813a
            java.util.List<jq3.c> r10 = r0.f177287c
            java.util.Iterator r10 = r10.iterator()
            r0 = 0
        L_0x001c:
            boolean r1 = r10.hasNext()
            if (r1 == 0) goto L_0x0058
            java.lang.Object r1 = r10.next()
            jq3.c r1 = (jq3.C9493c) r1
            boolean r6 = r1 instanceof cm1.C0797z
            if (r6 == 0) goto L_0x0051
            cm1.z r1 = (cm1.C0797z) r1
            com.tencent.mm.plugin.finder.storage.FinderItem r6 = r1.mo3513o()
            te3.c21 r6 = r6.getLiveInfo()
            if (r6 == 0) goto L_0x003e
            int r6 = r6.f182394f
            if (r6 != r3) goto L_0x003e
            r6 = 1
            goto L_0x003f
        L_0x003e:
            r6 = 0
        L_0x003f:
            if (r6 == 0) goto L_0x0051
            com.tencent.mm.plugin.finder.storage.FinderItem r1 = r1.mo3513o()
            com.tencent.mm.protocal.protobuf.FinderObject r1 = r1.getFeedObject()
            long r6 = r1.f164794id
            int r1 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r1 != 0) goto L_0x0051
            r1 = 1
            goto L_0x0052
        L_0x0051:
            r1 = 0
        L_0x0052:
            if (r1 == 0) goto L_0x0055
            goto L_0x0059
        L_0x0055:
            int r0 = r0 + 1
            goto L_0x001c
        L_0x0058:
            r0 = -1
        L_0x0059:
            if (r0 < 0) goto L_0x0062
            pm1.d r10 = r9.f160211d
            int r10 = r10.mo87438q()
            int r0 = r0 + r10
        L_0x0062:
            pm1.d r10 = r9.f160211d
            androidx.recyclerview.widget.RecyclerView r10 = r10.f177286b
            androidx.recyclerview.widget.RecyclerView$LayoutManager r10 = r10.getLayoutManager()
            java.lang.String r1 = "null cannot be cast to non-null type com.tencent.mm.plugin.finder.view.manager.FinderStaggeredGridLayoutManager"
            gy3.C87412m.m108592e(r10, r1)
            com.tencent.mm.plugin.finder.view.manager.FinderStaggeredGridLayoutManager r10 = (com.tencent.p014mm.plugin.finder.view.manager.FinderStaggeredGridLayoutManager) r10
            pm1.d r1 = r9.f160211d
            r1.getClass()
            android.view.View r4 = r10.findViewByPosition(r0)
            if (r4 == 0) goto L_0x00ab
            boolean r1 = r1.mo87446y(r0)
            if (r1 == 0) goto L_0x0087
            int[] r1 = new int[r3]
            r1[r2] = r0
            goto L_0x00ac
        L_0x0087:
            r1 = 2
            int[] r5 = new int[r1]
            android.graphics.Rect r6 = new android.graphics.Rect
            r6.<init>()
            r4.getGlobalVisibleRect(r6)
            int r4 = r6.left
            er1.r3 r6 = er1.C7865r3.f26468a
            int r6 = r6.mo8970c()
            int r6 = r6 / r1
            if (r4 < r6) goto L_0x00a4
            int r1 = r0 + -1
            r5[r2] = r1
            r5[r3] = r0
            goto L_0x00a9
        L_0x00a4:
            r5[r2] = r0
            int r0 = r0 + r3
            r5[r3] = r0
        L_0x00a9:
            r1 = r5
            goto L_0x00ac
        L_0x00ab:
            r1 = 0
        L_0x00ac:
            if (r1 == 0) goto L_0x00db
            pm1.d r0 = r9.f160211d
            r0.f177296l = r3
            int r4 = r1.length
        L_0x00b3:
            if (r2 >= r4) goto L_0x00db
            r5 = r1[r2]
            java.lang.String r6 = r0.mo87439r()
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.String r8 = "getSwitchPlayPosition pos = "
            r7.append(r8)
            r7.append(r5)
            java.lang.String r7 = r7.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r6, r7)
            android.view.View r6 = r10.findViewByPosition(r5)
            if (r6 == 0) goto L_0x00d8
            r0.mo87430i(r5, r6)
        L_0x00d8:
            int r2 = r2 + 1
            goto L_0x00b3
        L_0x00db:
            r2 = 1
        L_0x00dc:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.finder.nearby.live.play.NearbyLiveAutoPlayManager$finderSquareLiveViewLayoutEvent$1.callback(com.tencent.mm.sdk.event.IEvent):boolean");
    }
}

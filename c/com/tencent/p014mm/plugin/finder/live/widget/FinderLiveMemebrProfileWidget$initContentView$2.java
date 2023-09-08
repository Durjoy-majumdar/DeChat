package com.tencent.p014mm.plugin.finder.live.widget;

import com.tencent.p014mm.app.C40008f;
import com.tencent.p014mm.autogen.events.FollowUserEvent;
import com.tencent.p014mm.sdk.event.IListener;
import kotlin.Metadata;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u000f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, mo182094d2 = {"com/tencent/mm/plugin/finder/live/widget/FinderLiveMemebrProfileWidget$initContentView$2", "Lcom/tencent/mm/sdk/event/IListener;", "Lcom/tencent/mm/autogen/events/FollowUserEvent;", "plugin-finder-live_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.finder.live.widget.FinderLiveMemebrProfileWidget$initContentView$2 */
public final class FinderLiveMemebrProfileWidget$initContentView$2 extends IListener<FollowUserEvent> {

    /* renamed from: d */
    public final /* synthetic */ FinderLiveMemebrProfileWidget f15426d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FinderLiveMemebrProfileWidget$initContentView$2(FinderLiveMemebrProfileWidget finderLiveMemebrProfileWidget, C40008f fVar) {
        super(fVar);
        this.f15426d = finderLiveMemebrProfileWidget;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x000e, code lost:
        r0 = r0.f134919d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean callback(com.tencent.p014mm.sdk.event.IEvent r5) {
        /*
            r4 = this;
            com.tencent.mm.autogen.events.FollowUserEvent r5 = (com.tencent.p014mm.autogen.events.FollowUserEvent) r5
            java.lang.String r0 = "event"
            gy3.C87412m.m108594g(r5, r0)
            com.tencent.mm.plugin.finder.live.widget.FinderLiveMemebrProfileWidget r0 = r4.f15426d
            te3.hx0 r0 = r0.f15413r
            r1 = 0
            if (r0 == 0) goto L_0x0015
            com.tencent.mm.protocal.protobuf.FinderContact r0 = r0.f134919d
            if (r0 == 0) goto L_0x0015
            java.lang.String r0 = r0.username
            goto L_0x0016
        L_0x0015:
            r0 = r1
        L_0x0016:
            r2 = 0
            if (r0 == 0) goto L_0x0022
            int r3 = r0.length()
            if (r3 != 0) goto L_0x0020
            goto L_0x0022
        L_0x0020:
            r3 = 0
            goto L_0x0023
        L_0x0022:
            r3 = 1
        L_0x0023:
            if (r3 != 0) goto L_0x003b
            com.tencent.mm.autogen.events.FollowUserEvent$a r3 = r5.f154820d
            if (r3 == 0) goto L_0x002b
            java.lang.String r1 = r3.f154821a
        L_0x002b:
            boolean r0 = gy3.C87412m.m108589b(r1, r0)
            if (r0 == 0) goto L_0x003b
            com.tencent.mm.plugin.finder.live.widget.b r0 = new com.tencent.mm.plugin.finder.live.widget.b
            com.tencent.mm.plugin.finder.live.widget.FinderLiveMemebrProfileWidget r1 = r4.f15426d
            r0.<init>(r5, r1)
            o40.C61926c.m72668M(r0)
        L_0x003b:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.finder.live.widget.FinderLiveMemebrProfileWidget$initContentView$2.callback(com.tencent.mm.sdk.event.IEvent):boolean");
    }
}

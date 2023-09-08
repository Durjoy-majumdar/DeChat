package com.tencent.p014mm.plugin.finder.feed;

import com.tencent.p014mm.app.C40008f;
import com.tencent.p014mm.autogen.events.FinderCommentChangeEvent;
import com.tencent.p014mm.sdk.event.IListener;
import kotlin.Metadata;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u000f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, mo182094d2 = {"com/tencent/mm/plugin/finder/feed/FinderTimelinePresenter$commentChangeEventListener$1", "Lcom/tencent/mm/sdk/event/IListener;", "Lcom/tencent/mm/autogen/events/FinderCommentChangeEvent;", "plugin-finder_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.finder.feed.FinderTimelinePresenter$commentChangeEventListener$1 */
public final class FinderTimelinePresenter$commentChangeEventListener$1 extends IListener<FinderCommentChangeEvent> {

    /* renamed from: d */
    public final /* synthetic */ FinderTimelinePresenter f158659d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FinderTimelinePresenter$commentChangeEventListener$1(FinderTimelinePresenter finderTimelinePresenter, C40008f fVar) {
        super(fVar);
        this.f158659d = finderTimelinePresenter;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0014, code lost:
        r1 = r1.f154759e;
     */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0049  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean callback(com.tencent.p014mm.sdk.event.IEvent r11) {
        /*
            r10 = this;
            com.tencent.mm.autogen.events.FinderCommentChangeEvent r11 = (com.tencent.p014mm.autogen.events.FinderCommentChangeEvent) r11
            java.lang.String r0 = "event"
            gy3.C87412m.m108594g(r11, r0)
            com.tencent.mm.plugin.finder.feed.FinderTimelinePresenter r0 = r10.f158659d
            int r1 = r0.f13272p
            r2 = 1
            r3 = 0
            if (r2 != r1) goto L_0x0085
            com.tencent.mm.autogen.events.FinderCommentChangeEvent$a r1 = r11.f154754d
            r4 = -1
            if (r1 == 0) goto L_0x001e
            xh.z2 r1 = r1.f154759e
            if (r1 == 0) goto L_0x001e
            int r1 = r1.field_state
            if (r1 != r4) goto L_0x001e
            r1 = 1
            goto L_0x001f
        L_0x001e:
            r1 = 0
        L_0x001f:
            if (r1 == 0) goto L_0x002a
            com.tencent.mm.plugin.finder.feed.v r1 = new com.tencent.mm.plugin.finder.feed.v
            r1.<init>(r0)
            r0 = 0
            o40.C61926c.m72656A(r0, r1)
        L_0x002a:
            com.tencent.mm.autogen.events.FinderCommentChangeEvent$a r0 = r11.f154754d
            if (r0 == 0) goto L_0x0038
            xh.z2 r1 = r0.f154759e
            if (r1 == 0) goto L_0x0038
            int r1 = r1.field_state
            if (r1 != r4) goto L_0x0038
            r1 = 1
            goto L_0x0039
        L_0x0038:
            r1 = 0
        L_0x0039:
            if (r1 == 0) goto L_0x0085
            if (r0 == 0) goto L_0x0046
            int r0 = r0.f154758d
            java.lang.String[] r1 = up1.C65412c.f188250f
            r1 = 3
            if (r0 != r1) goto L_0x0046
            r0 = 1
            goto L_0x0047
        L_0x0046:
            r0 = 0
        L_0x0047:
            if (r0 == 0) goto L_0x0085
            com.tencent.mm.plugin.finder.feed.FinderTimelinePresenter r0 = r10.f158659d
            java.util.concurrent.ConcurrentLinkedQueue<cm1.f> r0 = r0.f13259T
            java.util.Iterator r0 = r0.iterator()
        L_0x0051:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x007b
            java.lang.Object r1 = r0.next()
            cm1.f r1 = (cm1.C55014f) r1
            com.tencent.mm.autogen.events.FinderCommentChangeEvent$a r4 = r11.f154754d
            if (r4 == 0) goto L_0x006b
            long r5 = r1.f154475d
            long r7 = r4.f154755a
            int r9 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r9 != 0) goto L_0x006b
            r5 = 1
            goto L_0x006c
        L_0x006b:
            r5 = 0
        L_0x006c:
            if (r5 == 0) goto L_0x0051
            if (r4 == 0) goto L_0x0077
            xh.z2 r4 = r4.f154759e
            if (r4 == 0) goto L_0x0077
            int r4 = r4.field_canRemove
            goto L_0x0078
        L_0x0077:
            r4 = 0
        L_0x0078:
            r1.f154477f = r4
            goto L_0x0051
        L_0x007b:
            com.tencent.mm.plugin.finder.feed.w r11 = new com.tencent.mm.plugin.finder.feed.w
            com.tencent.mm.plugin.finder.feed.FinderTimelinePresenter r0 = r10.f158659d
            r11.<init>(r0)
            o40.C61926c.m72668M(r11)
        L_0x0085:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.finder.feed.FinderTimelinePresenter$commentChangeEventListener$1.callback(com.tencent.mm.sdk.event.IEvent):boolean");
    }
}

package com.tencent.p014mm.plugin.finder.live;

import com.tencent.p014mm.app.C40008f;
import com.tencent.p014mm.autogen.events.FeedUpdateEvent;
import com.tencent.p014mm.sdk.event.IListener;
import kotlin.Metadata;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u000f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, mo182094d2 = {"com/tencent/mm/plugin/finder/live/FinderLivePresenter$feedChangeListener$1", "Lcom/tencent/mm/sdk/event/IListener;", "Lcom/tencent/mm/autogen/events/FeedUpdateEvent;", "plugin-finder-live_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.finder.live.FinderLivePresenter$feedChangeListener$1 */
public final class FinderLivePresenter$feedChangeListener$1 extends IListener<FeedUpdateEvent> {

    /* renamed from: d */
    public final /* synthetic */ FinderLivePresenter f159186d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FinderLivePresenter$feedChangeListener$1(FinderLivePresenter finderLivePresenter, C40008f fVar) {
        super(fVar);
        this.f159186d = finderLivePresenter;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0021, code lost:
        r11 = r11.f151988c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean callback(com.tencent.p014mm.sdk.event.IEvent r11) {
        /*
            r10 = this;
            com.tencent.mm.autogen.events.FeedUpdateEvent r11 = (com.tencent.p014mm.autogen.events.FeedUpdateEvent) r11
            java.lang.String r0 = "event"
            gy3.C87412m.m108594g(r11, r0)
            com.tencent.mm.autogen.events.FeedUpdateEvent$a r11 = r11.f9173d
            int r0 = r11.f9175b
            r1 = 14
            r2 = 0
            if (r0 == r1) goto L_0x0046
            r1 = 21
            if (r0 == r1) goto L_0x0015
            goto L_0x004f
        L_0x0015:
            int r11 = r11.f9177d
            if (r11 != 0) goto L_0x004f
            com.tencent.mm.plugin.finder.live.FinderLivePresenter r3 = r10.f159186d
            al1.i r11 = r3.mo77507q()
            if (r11 == 0) goto L_0x002c
            al1.l r11 = r11.f151988c
            if (r11 == 0) goto L_0x002c
            int r11 = r11.f152032l
            r0 = -1
            if (r11 != r0) goto L_0x002c
            r11 = 1
            goto L_0x002d
        L_0x002c:
            r11 = 0
        L_0x002d:
            java.lang.String r0 = "FinderLivePresenter"
            if (r11 == 0) goto L_0x0036
            java.lang.String r11 = "refreshData but pullType is can't pull more"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r11)
        L_0x0036:
            java.lang.String r11 = "refreshData"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r11)
            r4 = 4
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = 12
            r9 = 0
            com.tencent.p014mm.plugin.finder.live.FinderLivePresenter.m63673x(r3, r4, r5, r6, r7, r8, r9)
            goto L_0x004f
        L_0x0046:
            com.tencent.mm.plugin.finder.live.FinderLivePresenter r11 = r10.f159186d
            eg1.v r11 = r11.f159179e
            if (r11 == 0) goto L_0x004f
            r11.mo77524v0()
        L_0x004f:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.finder.live.FinderLivePresenter$feedChangeListener$1.callback(com.tencent.mm.sdk.event.IEvent):boolean");
    }
}

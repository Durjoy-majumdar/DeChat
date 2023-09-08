package com.tencent.p014mm.plugin.finder.feed;

import com.tencent.p014mm.app.C40008f;
import com.tencent.p014mm.autogen.events.ModNewContactEvent;
import com.tencent.p014mm.sdk.event.IListener;
import kotlin.Metadata;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, mo182094d2 = {"com/tencent/mm/plugin/finder/feed/FinderTimelinePresenter$onAttach$12", "Lcom/tencent/mm/sdk/event/IListener;", "Lcom/tencent/mm/autogen/events/ModNewContactEvent;", "plugin-finder_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.finder.feed.FinderTimelinePresenter$onAttach$12 */
public final class FinderTimelinePresenter$onAttach$12 extends IListener<ModNewContactEvent> {

    /* renamed from: d */
    public final /* synthetic */ FinderTimelinePresenter f13391d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FinderTimelinePresenter$onAttach$12(FinderTimelinePresenter finderTimelinePresenter, C40008f fVar) {
        super(fVar);
        this.f13391d = finderTimelinePresenter;
    }

    /* JADX WARNING: Removed duplicated region for block: B:25:0x0048 A[EDGE_INSN: B:25:0x0048->B:15:0x0048 ?: BREAK  , SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean callback(com.tencent.p014mm.sdk.event.IEvent r9) {
        /*
            r8 = this;
            com.tencent.mm.autogen.events.ModNewContactEvent r9 = (com.tencent.p014mm.autogen.events.ModNewContactEvent) r9
            java.lang.String r0 = "event"
            gy3.C87412m.m108594g(r9, r0)
            com.tencent.mm.plugin.finder.feed.FinderTimelinePresenter r0 = r8.f13391d
            com.tencent.mm.plugin.finder.feed.model.FinderTimelineFeedLoader r1 = r0.f13285z
            com.tencent.mm.plugin.finder.feed.model.internal.DataBuffer r1 = r1.getDataListJustForAdapter()
            java.util.Iterator r1 = r1.iterator()
        L_0x0013:
            boolean r2 = r1.hasNext()
            r3 = 0
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L_0x0047
            java.lang.Object r2 = r1.next()
            r6 = r2
            cm1.i2 r6 = (cm1.C0740i2) r6
            boolean r7 = r6 instanceof com.tencent.p014mm.plugin.finder.model.BaseFinderFeed
            if (r7 == 0) goto L_0x0043
            com.tencent.mm.plugin.finder.model.BaseFinderFeed r6 = (com.tencent.p014mm.plugin.finder.model.BaseFinderFeed) r6
            com.tencent.mm.plugin.finder.storage.FinderItem r6 = r6.mo3513o()
            te3.cg r6 = r6.getBizInfo()
            if (r6 == 0) goto L_0x0036
            java.lang.String r6 = r6.f182468d
            goto L_0x0037
        L_0x0036:
            r6 = r3
        L_0x0037:
            com.tencent.mm.autogen.events.ModNewContactEvent$a r7 = r9.f193738d
            java.lang.String r7 = r7.f193739a
            boolean r6 = gy3.C87412m.m108589b(r6, r7)
            if (r6 == 0) goto L_0x0043
            r6 = 1
            goto L_0x0044
        L_0x0043:
            r6 = 0
        L_0x0044:
            if (r6 == 0) goto L_0x0013
            goto L_0x0048
        L_0x0047:
            r2 = r3
        L_0x0048:
            cm1.i2 r2 = (cm1.C0740i2) r2
            boolean r9 = r2 instanceof com.tencent.p014mm.plugin.finder.model.BaseFinderFeed
            if (r9 == 0) goto L_0x0051
            com.tencent.mm.plugin.finder.model.BaseFinderFeed r2 = (com.tencent.p014mm.plugin.finder.model.BaseFinderFeed) r2
            goto L_0x0052
        L_0x0051:
            r2 = r3
        L_0x0052:
            if (r2 == 0) goto L_0x0089
            java.lang.String r9 = r0.f13249I
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "onAddContact: biz nickname = "
            r0.append(r1)
            com.tencent.mm.plugin.finder.storage.FinderItem r1 = r2.mo3513o()
            te3.cg r1 = r1.getBizInfo()
            if (r1 == 0) goto L_0x006c
            java.lang.String r3 = r1.f182469e
        L_0x006c:
            r0.append(r3)
            java.lang.String r0 = r0.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r9, r0)
            java.lang.Class<vq1.t> r9 = vq1.C14967t.class
            di3.d r9 = di3.C86312j.m106911c(r9)
            vq1.t r9 = (vq1.C14967t) r9
            com.tencent.mm.plugin.finder.storage.FinderItem r0 = r2.mo3513o()
            java.lang.String r0 = r0.getUserName()
            r9.mo14013LZ(r4, r0, r5)
        L_0x0089:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.finder.feed.FinderTimelinePresenter$onAttach$12.callback(com.tencent.mm.sdk.event.IEvent):boolean");
    }
}

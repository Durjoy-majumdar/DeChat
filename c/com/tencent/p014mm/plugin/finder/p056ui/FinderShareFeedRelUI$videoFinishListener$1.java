package com.tencent.p014mm.plugin.finder.p056ui;

import com.tencent.p014mm.app.C40008f;
import com.tencent.p014mm.autogen.events.FeedMegaVideoAnimPlayEvent;
import com.tencent.p014mm.sdk.event.IListener;
import kotlin.Metadata;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u000f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, mo182094d2 = {"com/tencent/mm/plugin/finder/ui/FinderShareFeedRelUI$videoFinishListener$1", "Lcom/tencent/mm/sdk/event/IListener;", "Lcom/tencent/mm/autogen/events/FeedMegaVideoAnimPlayEvent;", "plugin-finder_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.finder.ui.FinderShareFeedRelUI$videoFinishListener$1 */
public final class FinderShareFeedRelUI$videoFinishListener$1 extends IListener<FeedMegaVideoAnimPlayEvent> {

    /* renamed from: d */
    public final /* synthetic */ FinderShareFeedRelUI f17200d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FinderShareFeedRelUI$videoFinishListener$1(FinderShareFeedRelUI finderShareFeedRelUI, C40008f fVar) {
        super(fVar);
        this.f17200d = finderShareFeedRelUI;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v6, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v5, resolved type: cm1.j0} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean callback(com.tencent.p014mm.sdk.event.IEvent r10) {
        /*
            r9 = this;
            com.tencent.mm.autogen.events.FeedMegaVideoAnimPlayEvent r10 = (com.tencent.p014mm.autogen.events.FeedMegaVideoAnimPlayEvent) r10
            java.lang.String r0 = "event"
            gy3.C87412m.m108594g(r10, r0)
            com.tencent.mm.plugin.finder.ui.FinderShareFeedRelUI r0 = r9.f17200d
            boolean r1 = r0.f17153W
            r2 = 1
            if (r1 != 0) goto L_0x00ad
            kf1.c2 r0 = r0.f17168u
            r1 = 0
            if (r0 == 0) goto L_0x00a6
            androidx.recyclerview.widget.RecyclerView r0 = r0.getRecyclerView()
            com.tencent.mm.plugin.finder.ui.FinderShareFeedRelUI r3 = r9.f17200d
            androidx.recyclerview.widget.RecyclerView$LayoutManager r4 = r0.getLayoutManager()
            boolean r5 = r4 instanceof androidx.recyclerview.widget.LinearLayoutManager
            if (r5 == 0) goto L_0x0024
            androidx.recyclerview.widget.LinearLayoutManager r4 = (androidx.recyclerview.widget.LinearLayoutManager) r4
            goto L_0x0025
        L_0x0024:
            r4 = r1
        L_0x0025:
            if (r4 == 0) goto L_0x00ad
            r4 = 0
            androidx.recyclerview.widget.RecyclerView$z r0 = r0.mo17024J0(r4, r4)
            boolean r4 = r0 instanceof jq3.C60905o
            if (r4 == 0) goto L_0x0033
            jq3.o r0 = (jq3.C60905o) r0
            goto L_0x0034
        L_0x0033:
            r0 = r1
        L_0x0034:
            if (r0 == 0) goto L_0x00ad
            java.lang.Object r0 = r0.f173503E
            boolean r4 = r0 instanceof cm1.C55018j0
            if (r4 == 0) goto L_0x003f
            r1 = r0
            cm1.j0 r1 = (cm1.C55018j0) r1
        L_0x003f:
            if (r1 == 0) goto L_0x00ad
            com.tencent.mm.plugin.finder.storage.FinderItem r0 = r1.mo3513o()
            boolean r0 = r0.isPostFinish()
            if (r0 == 0) goto L_0x00ad
            com.tencent.mm.plugin.finder.storage.FinderItem r0 = r1.mo3513o()
            long r4 = r0.getExpectId()
            com.tencent.mm.autogen.events.FeedMegaVideoAnimPlayEvent$a r0 = r10.f9160d
            long r6 = r0.f9161a
            int r8 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r8 == 0) goto L_0x006f
            boolean r0 = r0.f9162b
            if (r0 == 0) goto L_0x00ad
            com.tencent.mm.plugin.finder.storage.FinderItem r0 = r1.mo3513o()
            long r0 = r0.getLocalId()
            com.tencent.mm.autogen.events.FeedMegaVideoAnimPlayEvent$a r4 = r10.f9160d
            long r4 = r4.f9161a
            int r6 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r6 != 0) goto L_0x00ad
        L_0x006f:
            com.tencent.mm.autogen.events.FeedMegaVideoAnimPlayEvent$a r0 = r10.f9160d
            boolean r1 = r0.f9166f
            if (r1 != 0) goto L_0x0079
            boolean r0 = r0.f9164d
            if (r0 == 0) goto L_0x00ad
        L_0x0079:
            java.lang.String r0 = r3.f17166s
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r4 = "share video is completed: isVideoComplete:"
            r1.append(r4)
            com.tencent.mm.autogen.events.FeedMegaVideoAnimPlayEvent$a r4 = r10.f9160d
            boolean r4 = r4.f9164d
            r1.append(r4)
            java.lang.String r4 = " isEnd:"
            r1.append(r4)
            com.tencent.mm.autogen.events.FeedMegaVideoAnimPlayEvent$a r10 = r10.f9160d
            boolean r10 = r10.f9166f
            r1.append(r10)
            java.lang.String r10 = r1.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r10)
            r3.f17153W = r2
            r3.mo4130c8()
            goto L_0x00ad
        L_0x00a6:
            java.lang.String r10 = "viewCallback"
            gy3.C87412m.m108603p(r10)
            throw r1
        L_0x00ad:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.finder.p056ui.FinderShareFeedRelUI$videoFinishListener$1.callback(com.tencent.mm.sdk.event.IEvent):boolean");
    }
}

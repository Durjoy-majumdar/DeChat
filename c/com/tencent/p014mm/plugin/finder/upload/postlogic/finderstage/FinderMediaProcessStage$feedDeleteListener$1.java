package com.tencent.p014mm.plugin.finder.upload.postlogic.finderstage;

import com.tencent.p014mm.app.C40008f;
import com.tencent.p014mm.autogen.events.FeedDeleteEvent;
import com.tencent.p014mm.plugin.vlog.model.C57463v;
import com.tencent.p014mm.protocal.protobuf.FinderFeedReportObject;
import com.tencent.p014mm.sdk.event.IEvent;
import com.tencent.p014mm.sdk.event.IListener;
import com.tencent.p014mm.sdk.platformtools.Log;
import fy3.C32224a;
import gy3.C87412m;
import kotlin.Metadata;
import wp1.C15585f;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u000f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, mo182094d2 = {"com/tencent/mm/plugin/finder/upload/postlogic/finderstage/FinderMediaProcessStage$feedDeleteListener$1", "Lcom/tencent/mm/sdk/event/IListener;", "Lcom/tencent/mm/autogen/events/FeedDeleteEvent;", "plugin-finder-publish_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.finder.upload.postlogic.finderstage.FinderMediaProcessStage$feedDeleteListener$1 */
public final class FinderMediaProcessStage$feedDeleteListener$1 extends IListener<FeedDeleteEvent> {

    /* renamed from: d */
    public final /* synthetic */ FinderMediaProcessStage f161595d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FinderMediaProcessStage$feedDeleteListener$1(FinderMediaProcessStage finderMediaProcessStage, C40008f fVar) {
        super(fVar);
        this.f161595d = finderMediaProcessStage;
    }

    public boolean callback(IEvent iEvent) {
        FeedDeleteEvent feedDeleteEvent = (FeedDeleteEvent) iEvent;
        C87412m.m108594g(feedDeleteEvent, "event");
        FinderMediaProcessStage finderMediaProcessStage = this.f161595d;
        long j = feedDeleteEvent.f9154d.f9156b;
        if (j == 0 || j != finderMediaProcessStage.f161540h.getLocalId()) {
            return false;
        }
        String str = finderMediaProcessStage.f161541i;
        Log.m105924i(str, "feedDeleteListener localId:" + feedDeleteEvent.f9154d.f9156b);
        if (C15585f.f42211a.mo14344g(finderMediaProcessStage.f161540h.getLocalId())) {
            return false;
        }
        FinderFeedReportObject finderFeedReportObject = finderMediaProcessStage.f161540h.field_reportObject;
        if (finderFeedReportObject != null) {
            finderFeedReportObject.uploadLogicError = 200;
        }
        C57463v vVar = finderMediaProcessStage.f161542j;
        if (vVar == null) {
            return false;
        }
        C57463v.C57464a.m66219a(vVar, (C32224a) null, 1, (Object) null);
        return false;
    }
}

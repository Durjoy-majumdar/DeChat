package com.tencent.p014mm.plugin.finder.upload.postlogic.finderstage;

import ar1.C54324i;
import com.tencent.p014mm.app.C40008f;
import com.tencent.p014mm.autogen.events.FeedDeleteEvent;
import com.tencent.p014mm.protocal.protobuf.FinderFeedReportObject;
import com.tencent.p014mm.sdk.event.IEvent;
import com.tencent.p014mm.sdk.event.IListener;
import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C87412m;
import kotlin.Metadata;
import o40.C61926c;
import wp1.C15585f;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u000f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, mo182094d2 = {"com/tencent/mm/plugin/finder/upload/postlogic/finderstage/FinderUploadStage$feedDeleteListener$1", "Lcom/tencent/mm/sdk/event/IListener;", "Lcom/tencent/mm/autogen/events/FeedDeleteEvent;", "plugin-finder-publish_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.finder.upload.postlogic.finderstage.FinderUploadStage$feedDeleteListener$1 */
public final class FinderUploadStage$feedDeleteListener$1 extends IListener<FeedDeleteEvent> {

    /* renamed from: d */
    public final /* synthetic */ FinderUploadStage f161613d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FinderUploadStage$feedDeleteListener$1(FinderUploadStage finderUploadStage, C40008f fVar) {
        super(fVar);
        this.f161613d = finderUploadStage;
    }

    public boolean callback(IEvent iEvent) {
        FeedDeleteEvent feedDeleteEvent = (FeedDeleteEvent) iEvent;
        C87412m.m108594g(feedDeleteEvent, "event");
        FinderUploadStage finderUploadStage = this.f161613d;
        long j = feedDeleteEvent.f9154d.f9156b;
        if (j == 0 || j != finderUploadStage.f161596h.getLocalId()) {
            return false;
        }
        String str = finderUploadStage.f161597i;
        Log.m105924i(str, "feedDeleteListener localId:" + feedDeleteEvent.f9154d.f9156b);
        if (C15585f.f42211a.mo14344g(finderUploadStage.f161596h.getLocalId())) {
            return false;
        }
        finderUploadStage.f161602q = true;
        FinderFeedReportObject finderFeedReportObject = finderUploadStage.f161596h.field_reportObject;
        if (finderFeedReportObject != null) {
            finderFeedReportObject.uploadLogicError = 100;
        }
        C61926c.m72656A((String) null, new C56490a(finderUploadStage));
        FinderUploadStage.m64879i(finderUploadStage, new C54324i(finderUploadStage.f161596h, 1));
        return false;
    }
}

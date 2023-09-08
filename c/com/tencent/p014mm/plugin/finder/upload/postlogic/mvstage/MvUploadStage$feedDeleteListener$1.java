package com.tencent.p014mm.plugin.finder.upload.postlogic.mvstage;

import com.tencent.p014mm.app.C40008f;
import com.tencent.p014mm.autogen.events.FeedDeleteEvent;
import com.tencent.p014mm.sdk.event.IEvent;
import com.tencent.p014mm.sdk.event.IListener;
import com.tencent.p014mm.sdk.platformtools.Log;
import cr1.C57985h;
import gy3.C87412m;
import kotlin.Metadata;
import o40.C61926c;
import wp1.C15585f;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u000f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, mo182094d2 = {"com/tencent/mm/plugin/finder/upload/postlogic/mvstage/MvUploadStage$feedDeleteListener$1", "Lcom/tencent/mm/sdk/event/IListener;", "Lcom/tencent/mm/autogen/events/FeedDeleteEvent;", "plugin-finder-publish_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.finder.upload.postlogic.mvstage.MvUploadStage$feedDeleteListener$1 */
public final class MvUploadStage$feedDeleteListener$1 extends IListener<FeedDeleteEvent> {

    /* renamed from: d */
    public final /* synthetic */ MvUploadStage f161635d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MvUploadStage$feedDeleteListener$1(MvUploadStage mvUploadStage, C40008f fVar) {
        super(fVar);
        this.f161635d = mvUploadStage;
    }

    public boolean callback(IEvent iEvent) {
        FeedDeleteEvent feedDeleteEvent = (FeedDeleteEvent) iEvent;
        C87412m.m108594g(feedDeleteEvent, "event");
        MvUploadStage mvUploadStage = this.f161635d;
        long j = feedDeleteEvent.f9154d.f9156b;
        if (j == 0 || j != mvUploadStage.f161619h.getLocalId()) {
            return false;
        }
        String str = mvUploadStage.f161620i;
        Log.m105924i(str, "feedDeleteListener localId:" + feedDeleteEvent.f9154d.f9156b);
        if (C15585f.f42211a.mo14344g(mvUploadStage.f161619h.getLocalId())) {
            return false;
        }
        mvUploadStage.f161625q = true;
        C61926c.m72656A((String) null, new C56492a(mvUploadStage));
        MvUploadStage.m64905i(mvUploadStage, new C57985h(mvUploadStage.f161619h, 2));
        return false;
    }
}

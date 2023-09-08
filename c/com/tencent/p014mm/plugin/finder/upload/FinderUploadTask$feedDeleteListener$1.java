package com.tencent.p014mm.plugin.finder.upload;

import com.tencent.p014mm.app.C40008f;
import com.tencent.p014mm.autogen.events.FeedDeleteEvent;
import com.tencent.p014mm.sdk.event.IEvent;
import com.tencent.p014mm.sdk.event.IListener;
import gy3.C87412m;
import kotlin.Metadata;
import uq1.C14373s;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, mo182094d2 = {"com/tencent/mm/plugin/finder/upload/FinderUploadTask$feedDeleteListener$1", "Lcom/tencent/mm/sdk/event/IListener;", "Lcom/tencent/mm/autogen/events/FeedDeleteEvent;", "plugin-finder-publish_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.finder.upload.FinderUploadTask$feedDeleteListener$1 */
public final class FinderUploadTask$feedDeleteListener$1 extends IListener<FeedDeleteEvent> {

    /* renamed from: d */
    public final /* synthetic */ C14373s f17478d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FinderUploadTask$feedDeleteListener$1(C14373s sVar, C40008f fVar) {
        super(fVar);
        this.f17478d = sVar;
    }

    public boolean callback(IEvent iEvent) {
        FeedDeleteEvent feedDeleteEvent = (FeedDeleteEvent) iEvent;
        C87412m.m108594g(feedDeleteEvent, "event");
        C14373s sVar = this.f17478d;
        if (feedDeleteEvent.f9154d.f9156b == 0) {
            return false;
        }
        sVar.getClass();
        throw null;
    }
}

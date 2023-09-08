package com.tencent.p014mm.plugin.finder.upload.postlogic.draftstage;

import com.tencent.p014mm.app.C40008f;
import com.tencent.p014mm.autogen.events.FinderDraftModifyEvent;
import com.tencent.p014mm.plugin.vlog.model.C57463v;
import com.tencent.p014mm.sdk.event.IEvent;
import com.tencent.p014mm.sdk.event.IListener;
import com.tencent.p014mm.sdk.platformtools.Log;
import fy3.C32224a;
import gy3.C87412m;
import kotlin.Metadata;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u000f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, mo182094d2 = {"com/tencent/mm/plugin/finder/upload/postlogic/draftstage/FinderDraftMediaProcessStage$draftModifyListener$1", "Lcom/tencent/mm/sdk/event/IListener;", "Lcom/tencent/mm/autogen/events/FinderDraftModifyEvent;", "plugin-finder-publish_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.finder.upload.postlogic.draftstage.FinderDraftMediaProcessStage$draftModifyListener$1 */
public final class FinderDraftMediaProcessStage$draftModifyListener$1 extends IListener<FinderDraftModifyEvent> {

    /* renamed from: d */
    public final /* synthetic */ FinderDraftMediaProcessStage f161492d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FinderDraftMediaProcessStage$draftModifyListener$1(FinderDraftMediaProcessStage finderDraftMediaProcessStage, C40008f fVar) {
        super(fVar);
        this.f161492d = finderDraftMediaProcessStage;
    }

    public boolean callback(IEvent iEvent) {
        FinderDraftModifyEvent finderDraftModifyEvent = (FinderDraftModifyEvent) iEvent;
        C87412m.m108594g(finderDraftModifyEvent, "event");
        FinderDraftModifyEvent.C55122a aVar = finderDraftModifyEvent.f154763d;
        if (!(aVar != null && aVar.f154764a == this.f161492d.f161471h.field_localId)) {
            return false;
        }
        String str = this.f161492d.f161472i;
        StringBuilder sb = new StringBuilder();
        sb.append("canceled ");
        sb.append(this.f161492d.f161471h.field_localId);
        sb.append(", ");
        sb.append(this.f161492d.f161471h.field_objectId);
        sb.append(", modifyType:");
        FinderDraftModifyEvent.C55122a aVar2 = finderDraftModifyEvent.f154763d;
        sb.append(aVar2 != null ? Integer.valueOf(aVar2.f154765b) : null);
        Log.m105924i(str, sb.toString());
        FinderDraftMediaProcessStage finderDraftMediaProcessStage = this.f161492d;
        finderDraftMediaProcessStage.f161475o = true;
        C57463v vVar = finderDraftMediaProcessStage.f161474n;
        if (vVar == null) {
            return true;
        }
        C57463v.C57464a.m66219a(vVar, (C32224a) null, 1, (Object) null);
        return true;
    }
}

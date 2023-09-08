package com.tencent.p014mm.plugin.finder.upload.postlogic.draftstage;

import com.tencent.p014mm.app.C40008f;
import com.tencent.p014mm.autogen.events.FinderDraftModifyEvent;
import com.tencent.p014mm.sdk.event.IEvent;
import com.tencent.p014mm.sdk.event.IListener;
import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C87412m;
import kotlin.Metadata;
import o40.C61926c;
import zq1.C66961c;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u000f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, mo182094d2 = {"com/tencent/mm/plugin/finder/upload/postlogic/draftstage/FinderDraftUploadStage$draftModifyListener$1", "Lcom/tencent/mm/sdk/event/IListener;", "Lcom/tencent/mm/autogen/events/FinderDraftModifyEvent;", "plugin-finder-publish_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.finder.upload.postlogic.draftstage.FinderDraftUploadStage$draftModifyListener$1 */
public final class FinderDraftUploadStage$draftModifyListener$1 extends IListener<FinderDraftModifyEvent> {

    /* renamed from: d */
    public final /* synthetic */ FinderDraftUploadStage f161511d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FinderDraftUploadStage$draftModifyListener$1(FinderDraftUploadStage finderDraftUploadStage, C40008f fVar) {
        super(fVar);
        this.f161511d = finderDraftUploadStage;
    }

    public boolean callback(IEvent iEvent) {
        FinderDraftModifyEvent finderDraftModifyEvent = (FinderDraftModifyEvent) iEvent;
        C87412m.m108594g(finderDraftModifyEvent, "event");
        FinderDraftModifyEvent.C55122a aVar = finderDraftModifyEvent.f154763d;
        if (!(aVar != null && aVar.f154764a == 0)) {
            if (aVar != null && aVar.f154764a == this.f161511d.f161494h.field_localId) {
                String str = this.f161511d.f161495i;
                StringBuilder sb = new StringBuilder();
                sb.append("draftModifyListener cancel localId:");
                sb.append(this.f161511d.f161494h.field_localId);
                sb.append(", ");
                sb.append(this.f161511d.f161494h.field_objectId);
                sb.append(" modifyType:");
                FinderDraftModifyEvent.C55122a aVar2 = finderDraftModifyEvent.f154763d;
                sb.append(aVar2 != null ? Integer.valueOf(aVar2.f154765b) : null);
                Log.m105924i(str, sb.toString());
                FinderDraftUploadStage finderDraftUploadStage = this.f161511d;
                finderDraftUploadStage.f161501r = true;
                C61926c.m72656A((String) null, new C56479a(finderDraftUploadStage));
                FinderDraftUploadStage finderDraftUploadStage2 = this.f161511d;
                FinderDraftUploadStage.m64818i(finderDraftUploadStage2, new C66961c(finderDraftUploadStage2.f161494h, 3));
            }
        }
        return false;
    }
}

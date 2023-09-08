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

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u000f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, mo182094d2 = {"com/tencent/mm/plugin/finder/upload/postlogic/draftstage/MvDraftUploadStage$draftModifyListener$1", "Lcom/tencent/mm/sdk/event/IListener;", "Lcom/tencent/mm/autogen/events/FinderDraftModifyEvent;", "plugin-finder-publish_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.finder.upload.postlogic.draftstage.MvDraftUploadStage$draftModifyListener$1 */
public final class MvDraftUploadStage$draftModifyListener$1 extends IListener<FinderDraftModifyEvent> {

    /* renamed from: d */
    public final /* synthetic */ MvDraftUploadStage f161536d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MvDraftUploadStage$draftModifyListener$1(MvDraftUploadStage mvDraftUploadStage, C40008f fVar) {
        super(fVar);
        this.f161536d = mvDraftUploadStage;
    }

    public boolean callback(IEvent iEvent) {
        FinderDraftModifyEvent finderDraftModifyEvent = (FinderDraftModifyEvent) iEvent;
        C87412m.m108594g(finderDraftModifyEvent, "event");
        MvDraftUploadStage mvDraftUploadStage = this.f161536d;
        long j = finderDraftModifyEvent.f154763d.f154764a;
        if (j == 0 || j != mvDraftUploadStage.f161519h.field_localId) {
            return false;
        }
        String str = mvDraftUploadStage.f161520i;
        Log.m105924i(str, "draftModifyListener localId:" + finderDraftModifyEvent.f154763d.f154764a);
        mvDraftUploadStage.f161526r = true;
        C61926c.m72656A((String) null, new C56480b(mvDraftUploadStage));
        MvDraftUploadStage.m64844i(mvDraftUploadStage, new C66961c(mvDraftUploadStage.f161519h, 2));
        return false;
    }
}

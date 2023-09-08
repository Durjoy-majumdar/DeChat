package com.tencent.p014mm.plugin.sns.p106ui.item.improve.click;

import android.content.Context;
import android.content.Intent;
import com.tencent.p014mm.app.C40008f;
import com.tencent.p014mm.autogen.events.SnsFinderPostEvent;
import com.tencent.p014mm.mj_template.api.MaasAlbumMultiTemplateRequestParams;
import com.tencent.p014mm.plugin.gallery.model.GalleryItem$MediaItem;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.plugin.sns.storage.SnsInfo;
import com.tencent.p014mm.protocal.protobuf.TimeLineObject;
import com.tencent.p014mm.sdk.event.IEvent;
import com.tencent.p014mm.sdk.event.IListener;
import com.tencent.p014mm.sdk.platformtools.Log;
import da0.C58247e;
import di3.C86312j;
import gy3.C87412m;
import java.util.ArrayList;
import kotlin.Metadata;
import os2.C100417r0;
import p599lr.C61381b;
import rx3.C13598b0;
import yn2.C102882s0;
import yn2.C102887v0;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u000f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, mo182094d2 = {"com/tencent/mm/plugin/sns/ui/item/improve/click/TimelineItemClickEventCenter$finderPostListener$1", "Lcom/tencent/mm/sdk/event/IListener;", "Lcom/tencent/mm/autogen/events/SnsFinderPostEvent;", "plugin-sns_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.sns.ui.item.improve.click.TimelineItemClickEventCenter$finderPostListener$1 */
public final class TimelineItemClickEventCenter$finderPostListener$1 extends IListener<SnsFinderPostEvent> {
    public TimelineItemClickEventCenter$finderPostListener$1(C40008f fVar) {
        super(fVar);
    }

    public boolean callback(IEvent iEvent) {
        MaasAlbumMultiTemplateRequestParams maasAlbumMultiTemplateRequestParams;
        SnsMethodCalculate.markStartTimeMs("callback", "com.tencent.mm.plugin.sns.ui.item.improve.click.TimelineItemClickEventCenter$finderPostListener$1");
        SnsFinderPostEvent snsFinderPostEvent = (SnsFinderPostEvent) iEvent;
        SnsMethodCalculate.markStartTimeMs("callback", "com.tencent.mm.plugin.sns.ui.item.improve.click.TimelineItemClickEventCenter$finderPostListener$1");
        C87412m.m108594g(snsFinderPostEvent, "event");
        Log.m105924i("MicroMsg.TimelineItemClickEventCenter", "PhotoTimeLineItem click to post finder");
        SnsFinderPostEvent.C92576a aVar = snsFinderPostEvent.f265144d;
        SnsInfo snsInfo = aVar.f265147c;
        int i = aVar.f265145a;
        Context context = aVar.f265146b;
        C102887v0 v0Var = C102887v0.VideoPath;
        boolean z = true;
        boolean z2 = false;
        if (i == 2) {
            TimeLineObject timeLine = snsInfo.getTimeLine();
            C87412m.m108593f(timeLine, "info.getTimeLine()");
            String j = C100417r0.m131421j("sns_table_", (long) snsInfo.localid);
            C102882s0 s0Var = C102882s0.f303681a;
            ArrayList<GalleryItem$MediaItem> f = s0Var.mo142594f(j);
            if (f == null || !((C61381b) C86312j.m106911c(C61381b.class)).mo78560xU()) {
                C87412m.m108593f(context, "context");
                String str = timeLine.ContentDesc;
                C87412m.m108593f(str, "timeLineObject.ContentDesc");
                z = s0Var.mo142597i(context, str, snsInfo.field_snsId, (long) snsInfo.localid, j, true);
            } else {
                C87412m.m108593f(context, "context");
                Intent intent = new Intent();
                intent.putExtra("key_maas_entrance", 9);
                C13598b0 b0Var = C13598b0.f38549a;
                String str2 = timeLine.ContentDesc;
                C87412m.m108593f(str2, "timeLineObject.ContentDesc");
                new MaasAlbumMultiTemplateRequestParams(f, true, true, true, s0Var.mo142593e(str2, snsInfo.field_snsId, (long) snsInfo.localid, j));
                ((C58247e) C86312j.m106911c(C58247e.class)).q40(context, intent, maasAlbumMultiTemplateRequestParams);
            }
            SnsMethodCalculate.markEndTimeMs("callback", "com.tencent.mm.plugin.sns.ui.item.improve.click.TimelineItemClickEventCenter$finderPostListener$1");
            z2 = z;
        } else {
            if (!(i == 1 || i == 0)) {
                z = false;
            }
            if (z) {
                TimeLineObject timeLine2 = snsInfo.getTimeLine();
                C87412m.m108593f(timeLine2, "info.getTimeLine()");
                String str3 = timeLine2.ContentDesc;
                String j2 = C100417r0.m131421j("sns_table_", (long) snsInfo.localid);
                C102882s0 s0Var2 = C102882s0.f303681a;
                C87412m.m108593f(context, "context");
                C87412m.m108593f(str3, "desc");
                s0Var2.mo142596h(context, j2, str3, snsInfo.field_snsId, (long) snsInfo.localid, timeLine2.videoTemplate, false);
            }
            SnsMethodCalculate.markEndTimeMs("callback", "com.tencent.mm.plugin.sns.ui.item.improve.click.TimelineItemClickEventCenter$finderPostListener$1");
        }
        SnsMethodCalculate.markEndTimeMs("callback", "com.tencent.mm.plugin.sns.ui.item.improve.click.TimelineItemClickEventCenter$finderPostListener$1");
        return z2;
    }
}

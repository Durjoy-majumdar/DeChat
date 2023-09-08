package com.tencent.p014mm.plugin.sns.p106ui.improve.item;

import androidx.lifecycle.C0125s;
import com.tencent.p014mm.autogen.events.MusicPlayerEvent;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.sdk.event.IEvent;
import com.tencent.p014mm.sdk.event.IListener;
import gy3.C87412m;
import kotlin.Metadata;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u000f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, mo182094d2 = {"com/tencent/mm/plugin/sns/ui/improve/item/MVImproveTimelineItem$musicPlayerListener$1", "Lcom/tencent/mm/sdk/event/IListener;", "Lcom/tencent/mm/autogen/events/MusicPlayerEvent;", "plugin-sns_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.sns.ui.improve.item.MVImproveTimelineItem$musicPlayerListener$1 */
public final class MVImproveTimelineItem$musicPlayerListener$1 extends IListener<MusicPlayerEvent> {

    /* renamed from: d */
    public final /* synthetic */ MVImproveTimelineItem f164440d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MVImproveTimelineItem$musicPlayerListener$1(MVImproveTimelineItem mVImproveTimelineItem, C0125s sVar) {
        super(sVar);
        this.f164440d = mVImproveTimelineItem;
    }

    public boolean callback(IEvent iEvent) {
        SnsMethodCalculate.markStartTimeMs("callback", "com.tencent.mm.plugin.sns.ui.improve.item.MVImproveTimelineItem$musicPlayerListener$1");
        MusicPlayerEvent musicPlayerEvent = (MusicPlayerEvent) iEvent;
        SnsMethodCalculate.markStartTimeMs("callback", "com.tencent.mm.plugin.sns.ui.improve.item.MVImproveTimelineItem$musicPlayerListener$1");
        C87412m.m108594g(musicPlayerEvent, "event");
        int i = musicPlayerEvent.f9336d.f9337a;
        if (i == 0 || i == 1 || i == 2 || i == 3 || i == 4 || i == 7) {
            MVImproveTimelineItem.m66132Z(this.f164440d);
        }
        SnsMethodCalculate.markEndTimeMs("callback", "com.tencent.mm.plugin.sns.ui.improve.item.MVImproveTimelineItem$musicPlayerListener$1");
        SnsMethodCalculate.markEndTimeMs("callback", "com.tencent.mm.plugin.sns.ui.improve.item.MVImproveTimelineItem$musicPlayerListener$1");
        return false;
    }
}

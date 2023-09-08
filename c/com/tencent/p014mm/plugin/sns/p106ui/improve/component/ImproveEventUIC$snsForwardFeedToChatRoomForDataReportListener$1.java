package com.tencent.p014mm.plugin.sns.p106ui.improve.component;

import androidx.lifecycle.C0125s;
import com.tencent.p014mm.autogen.events.SnsForwardFeedToChatRoomForDataReportEvent;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.sdk.event.IEvent;
import com.tencent.p014mm.sdk.event.IListener;
import di3.C86312j;
import gy3.C87412m;
import kotlin.Metadata;
import l31.C99333f;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u000f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, mo182094d2 = {"com/tencent/mm/plugin/sns/ui/improve/component/ImproveEventUIC$snsForwardFeedToChatRoomForDataReportListener$1", "Lcom/tencent/mm/sdk/event/IListener;", "Lcom/tencent/mm/autogen/events/SnsForwardFeedToChatRoomForDataReportEvent;", "plugin-sns_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.sns.ui.improve.component.ImproveEventUIC$snsForwardFeedToChatRoomForDataReportListener$1 */
public final class ImproveEventUIC$snsForwardFeedToChatRoomForDataReportListener$1 extends IListener<SnsForwardFeedToChatRoomForDataReportEvent> {
    public ImproveEventUIC$snsForwardFeedToChatRoomForDataReportListener$1(C0125s sVar) {
        super(sVar);
    }

    public boolean callback(IEvent iEvent) {
        SnsMethodCalculate.markStartTimeMs("callback", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveEventUIC$snsForwardFeedToChatRoomForDataReportListener$1");
        SnsForwardFeedToChatRoomForDataReportEvent snsForwardFeedToChatRoomForDataReportEvent = (SnsForwardFeedToChatRoomForDataReportEvent) iEvent;
        SnsMethodCalculate.markStartTimeMs("callback", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveEventUIC$snsForwardFeedToChatRoomForDataReportListener$1");
        C87412m.m108594g(snsForwardFeedToChatRoomForDataReportEvent, "event");
        String str = snsForwardFeedToChatRoomForDataReportEvent.f265152d.f265153a;
        C87412m.m108593f(str, "event.data.snsId");
        ((C99333f) C86312j.m106911c(C99333f.class)).mo138726rL(12076, "ForwardToChatRoomFeedIdCount", str);
        SnsMethodCalculate.markEndTimeMs("callback", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveEventUIC$snsForwardFeedToChatRoomForDataReportListener$1");
        SnsMethodCalculate.markEndTimeMs("callback", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveEventUIC$snsForwardFeedToChatRoomForDataReportListener$1");
        return false;
    }
}

package com.tencent.p014mm.plugin.sns.p106ui.improve.component;

import androidx.lifecycle.C0125s;
import com.tencent.p014mm.autogen.events.SnsAdLongVideoBrowseStatusChangedForDataReportEvent;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.sdk.event.IEvent;
import com.tencent.p014mm.sdk.event.IListener;
import di3.C86312j;
import gy3.C87412m;
import kotlin.Metadata;
import l31.C99333f;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u000f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, mo182094d2 = {"com/tencent/mm/plugin/sns/ui/improve/component/ImproveEventUIC$snsAdLongVideoBrowseStatusChangedForDataReportListener$1", "Lcom/tencent/mm/sdk/event/IListener;", "Lcom/tencent/mm/autogen/events/SnsAdLongVideoBrowseStatusChangedForDataReportEvent;", "plugin-sns_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.sns.ui.improve.component.ImproveEventUIC$snsAdLongVideoBrowseStatusChangedForDataReportListener$1 */
public final class C95821xe5281eab extends IListener<SnsAdLongVideoBrowseStatusChangedForDataReportEvent> {
    public C95821xe5281eab(C0125s sVar) {
        super(sVar);
    }

    public boolean callback(IEvent iEvent) {
        SnsMethodCalculate.markStartTimeMs("callback", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveEventUIC$snsAdLongVideoBrowseStatusChangedForDataReportListener$1");
        SnsMethodCalculate.markStartTimeMs("callback", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveEventUIC$snsAdLongVideoBrowseStatusChangedForDataReportListener$1");
        C87412m.m108594g((SnsAdLongVideoBrowseStatusChangedForDataReportEvent) iEvent, "event");
        ((C99333f) C86312j.m106911c(C99333f.class)).um0(12076, "BrowseAdLongVideoTime");
        SnsMethodCalculate.markEndTimeMs("callback", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveEventUIC$snsAdLongVideoBrowseStatusChangedForDataReportListener$1");
        SnsMethodCalculate.markEndTimeMs("callback", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveEventUIC$snsAdLongVideoBrowseStatusChangedForDataReportListener$1");
        return false;
    }
}

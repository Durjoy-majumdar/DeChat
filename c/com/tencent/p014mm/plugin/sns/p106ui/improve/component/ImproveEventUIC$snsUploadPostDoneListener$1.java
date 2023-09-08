package com.tencent.p014mm.plugin.sns.p106ui.improve.component;

import androidx.lifecycle.C0125s;
import com.tencent.p014mm.autogen.events.SnsUploadPostDoneEvent;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.sdk.event.IEvent;
import com.tencent.p014mm.sdk.event.IListener;
import gy3.C87412m;
import kotlin.Metadata;
import z31.C102972b;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u000f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, mo182094d2 = {"com/tencent/mm/plugin/sns/ui/improve/component/ImproveEventUIC$snsUploadPostDoneListener$1", "Lcom/tencent/mm/sdk/event/IListener;", "Lcom/tencent/mm/autogen/events/SnsUploadPostDoneEvent;", "plugin-sns_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.sns.ui.improve.component.ImproveEventUIC$snsUploadPostDoneListener$1 */
public final class ImproveEventUIC$snsUploadPostDoneListener$1 extends IListener<SnsUploadPostDoneEvent> {
    public ImproveEventUIC$snsUploadPostDoneListener$1(C0125s sVar) {
        super(sVar);
    }

    public boolean callback(IEvent iEvent) {
        SnsMethodCalculate.markStartTimeMs("callback", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveEventUIC$snsUploadPostDoneListener$1");
        SnsMethodCalculate.markStartTimeMs("callback", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveEventUIC$snsUploadPostDoneListener$1");
        C87412m.m108594g((SnsUploadPostDoneEvent) iEvent, "event");
        SnsMethodCalculate.markEndTimeMs("callback", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveEventUIC$snsUploadPostDoneListener$1");
        C102972b.f303874a.mo142710d(12076, "PostFeedCount", 1);
        SnsMethodCalculate.markEndTimeMs("callback", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveEventUIC$snsUploadPostDoneListener$1");
        return false;
    }
}

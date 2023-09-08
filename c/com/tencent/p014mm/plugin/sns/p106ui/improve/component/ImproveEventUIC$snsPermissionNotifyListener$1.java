package com.tencent.p014mm.plugin.sns.p106ui.improve.component;

import androidx.lifecycle.C0125s;
import com.tencent.p014mm.autogen.events.SnsPermissionNotifyEvent;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.sdk.event.IEvent;
import com.tencent.p014mm.sdk.event.IListener;
import gy3.C87412m;
import kotlin.Metadata;
import z31.C102972b;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u000f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, mo182094d2 = {"com/tencent/mm/plugin/sns/ui/improve/component/ImproveEventUIC$snsPermissionNotifyListener$1", "Lcom/tencent/mm/sdk/event/IListener;", "Lcom/tencent/mm/autogen/events/SnsPermissionNotifyEvent;", "plugin-sns_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.sns.ui.improve.component.ImproveEventUIC$snsPermissionNotifyListener$1 */
public final class ImproveEventUIC$snsPermissionNotifyListener$1 extends IListener<SnsPermissionNotifyEvent> {

    /* renamed from: d */
    public final /* synthetic */ ImproveEventUIC f279642d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ImproveEventUIC$snsPermissionNotifyListener$1(ImproveEventUIC improveEventUIC, C0125s sVar) {
        super(sVar);
        this.f279642d = improveEventUIC;
    }

    public boolean callback(IEvent iEvent) {
        SnsMethodCalculate.markStartTimeMs("callback", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveEventUIC$snsPermissionNotifyListener$1");
        SnsPermissionNotifyEvent snsPermissionNotifyEvent = (SnsPermissionNotifyEvent) iEvent;
        SnsMethodCalculate.markStartTimeMs("callback", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveEventUIC$snsPermissionNotifyListener$1");
        C87412m.m108594g(snsPermissionNotifyEvent, "event");
        SnsPermissionNotifyEvent.C40168a aVar = snsPermissionNotifyEvent.f107766d;
        if (aVar.f107767a) {
            ImproveEventUIC improveEventUIC = this.f279642d;
            String str = aVar.f107769c;
            C87412m.m108593f(str, "event.data.username");
            SnsMethodCalculate.markStartTimeMs("access$handleBlackUser", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveEventUIC");
            improveEventUIC.getClass();
            SnsMethodCalculate.markStartTimeMs("handleBlackUser", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveEventUIC");
            improveEventUIC.f279636e = str;
            SnsMethodCalculate.markEndTimeMs("handleBlackUser", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveEventUIC");
            C102972b.f303874a.mo142713g(12076, "BlackListFriendCount", improveEventUIC.f279636e);
            SnsMethodCalculate.markEndTimeMs("access$handleBlackUser", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveEventUIC");
        } else {
            ImproveEventUIC improveEventUIC2 = this.f279642d;
            String str2 = aVar.f107769c;
            C87412m.m108593f(str2, "event.data.username");
            SnsMethodCalculate.markStartTimeMs("access$handleOutsideUser", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveEventUIC");
            improveEventUIC2.getClass();
            SnsMethodCalculate.markStartTimeMs("handleOutsideUser", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveEventUIC");
            improveEventUIC2.f279636e = str2;
            SnsMethodCalculate.markEndTimeMs("handleOutsideUser", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveEventUIC");
            C102972b.f303874a.mo142713g(12076, "OutsiderFriendCount", improveEventUIC2.f279636e);
            SnsMethodCalculate.markEndTimeMs("access$handleOutsideUser", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveEventUIC");
        }
        SnsMethodCalculate.markEndTimeMs("callback", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveEventUIC$snsPermissionNotifyListener$1");
        SnsMethodCalculate.markEndTimeMs("callback", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveEventUIC$snsPermissionNotifyListener$1");
        return false;
    }
}

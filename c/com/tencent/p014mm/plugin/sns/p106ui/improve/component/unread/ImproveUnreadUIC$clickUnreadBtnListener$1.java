package com.tencent.p014mm.plugin.sns.p106ui.improve.component.unread;

import a14.C53934p0;
import androidx.lifecycle.C0125s;
import bl3.C0317e;
import com.tencent.p014mm.autogen.events.SnsClickUnreadBtnEvent;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.sdk.event.IEvent;
import com.tencent.p014mm.sdk.event.IListener;
import gy3.C87412m;
import kotlin.Metadata;
import wx3.C15601d;
import wx3.C66212f;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u000f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, mo182094d2 = {"com/tencent/mm/plugin/sns/ui/improve/component/unread/ImproveUnreadUIC$clickUnreadBtnListener$1", "Lcom/tencent/mm/sdk/event/IListener;", "Lcom/tencent/mm/autogen/events/SnsClickUnreadBtnEvent;", "plugin-sns_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.sns.ui.improve.component.unread.ImproveUnreadUIC$clickUnreadBtnListener$1 */
public final class ImproveUnreadUIC$clickUnreadBtnListener$1 extends IListener<SnsClickUnreadBtnEvent> {

    /* renamed from: d */
    public final /* synthetic */ ImproveUnreadUIC f82127d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ImproveUnreadUIC$clickUnreadBtnListener$1(ImproveUnreadUIC improveUnreadUIC, C0125s sVar) {
        super(sVar);
        this.f82127d = improveUnreadUIC;
    }

    public boolean callback(IEvent iEvent) {
        SnsMethodCalculate.markStartTimeMs("callback", "com.tencent.mm.plugin.sns.ui.improve.component.unread.ImproveUnreadUIC$clickUnreadBtnListener$1");
        SnsMethodCalculate.markStartTimeMs("callback", "com.tencent.mm.plugin.sns.ui.improve.component.unread.ImproveUnreadUIC$clickUnreadBtnListener$1");
        C87412m.m108594g((SnsClickUnreadBtnEvent) iEvent, "event");
        ImproveUnreadUIC improveUnreadUIC = this.f82127d;
        C0317e.launch$default(improveUnreadUIC, (C66212f) null, (C53934p0) null, new C95873a(improveUnreadUIC, (C15601d<? super C95873a>) null), 3, (Object) null);
        SnsMethodCalculate.markEndTimeMs("callback", "com.tencent.mm.plugin.sns.ui.improve.component.unread.ImproveUnreadUIC$clickUnreadBtnListener$1");
        SnsMethodCalculate.markEndTimeMs("callback", "com.tencent.mm.plugin.sns.ui.improve.component.unread.ImproveUnreadUIC$clickUnreadBtnListener$1");
        return true;
    }
}

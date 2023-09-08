package com.tencent.p014mm.plugin.sns.p106ui.improve.compatibility;

import androidx.lifecycle.C0125s;
import com.tencent.p014mm.autogen.events.SnsOldItemContactEvent;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.sdk.event.IEvent;
import com.tencent.p014mm.sdk.event.IListener;
import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C87412m;
import kotlin.Metadata;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u000f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, mo182094d2 = {"com/tencent/mm/plugin/sns/ui/improve/compatibility/OldVersionItemView$oldItemContactListener$1", "Lcom/tencent/mm/sdk/event/IListener;", "Lcom/tencent/mm/autogen/events/SnsOldItemContactEvent;", "plugin-sns_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.sns.ui.improve.compatibility.OldVersionItemView$oldItemContactListener$1 */
public final class OldVersionItemView$oldItemContactListener$1 extends IListener<SnsOldItemContactEvent> {

    /* renamed from: d */
    public final /* synthetic */ OldVersionItemView f279631d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public OldVersionItemView$oldItemContactListener$1(OldVersionItemView oldVersionItemView, C0125s sVar) {
        super(sVar);
        this.f279631d = oldVersionItemView;
    }

    public boolean callback(IEvent iEvent) {
        SnsMethodCalculate.markStartTimeMs("callback", "com.tencent.mm.plugin.sns.ui.improve.compatibility.OldVersionItemView$oldItemContactListener$1");
        SnsMethodCalculate.markStartTimeMs("callback", "com.tencent.mm.plugin.sns.ui.improve.compatibility.OldVersionItemView$oldItemContactListener$1");
        C87412m.m108594g((SnsOldItemContactEvent) iEvent, "event");
        Log.m105924i("MicroMsg.Improve.OldItem", "oldItemContactEvent");
        if (OldVersionItemView.m122684i(this.f279631d) != null) {
            OldVersionItemView oldVersionItemView = this.f279631d;
            OldVersionItemView.m122685j(oldVersionItemView, oldVersionItemView.getPosition());
        }
        SnsMethodCalculate.markEndTimeMs("callback", "com.tencent.mm.plugin.sns.ui.improve.compatibility.OldVersionItemView$oldItemContactListener$1");
        SnsMethodCalculate.markEndTimeMs("callback", "com.tencent.mm.plugin.sns.ui.improve.compatibility.OldVersionItemView$oldItemContactListener$1");
        return true;
    }
}

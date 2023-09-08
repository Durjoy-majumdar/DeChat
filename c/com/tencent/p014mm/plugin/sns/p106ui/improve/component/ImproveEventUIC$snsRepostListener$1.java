package com.tencent.p014mm.plugin.sns.p106ui.improve.component;

import androidx.lifecycle.C0125s;
import com.tencent.p014mm.autogen.events.SnsRepostEvent;
import com.tencent.p014mm.plugin.sns.model.C94866e1;
import com.tencent.p014mm.plugin.sns.model.C94897n1;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.sdk.event.IEvent;
import com.tencent.p014mm.sdk.event.IListener;
import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C87412m;
import kotlin.Metadata;
import os2.C100417r0;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u000f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, mo182094d2 = {"com/tencent/mm/plugin/sns/ui/improve/component/ImproveEventUIC$snsRepostListener$1", "Lcom/tencent/mm/sdk/event/IListener;", "Lcom/tencent/mm/autogen/events/SnsRepostEvent;", "plugin-sns_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.sns.ui.improve.component.ImproveEventUIC$snsRepostListener$1 */
public final class ImproveEventUIC$snsRepostListener$1 extends IListener<SnsRepostEvent> {
    public ImproveEventUIC$snsRepostListener$1(C0125s sVar) {
        super(sVar);
    }

    public boolean callback(IEvent iEvent) {
        SnsMethodCalculate.markStartTimeMs("callback", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveEventUIC$snsRepostListener$1");
        SnsRepostEvent snsRepostEvent = (SnsRepostEvent) iEvent;
        SnsMethodCalculate.markStartTimeMs("callback", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveEventUIC$snsRepostListener$1");
        C87412m.m108594g(snsRepostEvent, "event");
        String str = snsRepostEvent.f265193d.f265194a;
        Log.m105924i("MicroMsg.Improve.EventUIC", "localId " + str);
        C94897n1.m120379q(C100417r0.m131424m(str));
        C94897n1.m120378p(C100417r0.m131424m(str));
        C94866e1.gy0().mo131192c();
        SnsMethodCalculate.markEndTimeMs("callback", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveEventUIC$snsRepostListener$1");
        SnsMethodCalculate.markEndTimeMs("callback", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveEventUIC$snsRepostListener$1");
        return true;
    }
}

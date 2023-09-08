package com.tencent.p014mm.feature.expt.forward;

import androidx.camera.core.FocusMeteringAction;
import com.tencent.p014mm.app.C40008f;
import com.tencent.p014mm.autogen.events.ForwardUpdateMsgIdEvent;
import com.tencent.p014mm.feature.expt.forward.ForwardReport;
import com.tencent.p014mm.sdk.event.IEvent;
import com.tencent.p014mm.sdk.event.IListener;
import com.tencent.p014mm.sdk.platformtools.MMHandler;
import gy3.C87412m;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Metadata;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u000f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, mo182094d2 = {"com/tencent/mm/feature/expt/forward/ForwardReport$Companion$updateMsgIdListener$1", "Lcom/tencent/mm/sdk/event/IListener;", "Lcom/tencent/mm/autogen/events/ForwardUpdateMsgIdEvent;", "plugin-expt_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.feature.expt.forward.ForwardReport$Companion$updateMsgIdListener$1 */
public final class ForwardReport$Companion$updateMsgIdListener$1 extends IListener<ForwardUpdateMsgIdEvent> {
    public ForwardReport$Companion$updateMsgIdListener$1(C40008f fVar) {
        super(fVar);
    }

    public boolean callback(IEvent iEvent) {
        ForwardUpdateMsgIdEvent forwardUpdateMsgIdEvent = (ForwardUpdateMsgIdEvent) iEvent;
        C87412m.m108594g(forwardUpdateMsgIdEvent, "event");
        ForwardUpdateMsgIdEvent.C92520a aVar = forwardUpdateMsgIdEvent.f264876d;
        if (aVar == null) {
            return false;
        }
        String str = aVar.f264877a + aVar.f264879c;
        ConcurrentHashMap<String, Long> concurrentHashMap = ForwardReport.f266737c;
        if (!concurrentHashMap.containsKey(str) && !concurrentHashMap.containsKey(aVar.f264879c)) {
            return false;
        }
        MMHandler mMHandler = ForwardReport.f266738d;
        long j = aVar.f264877a;
        String str2 = aVar.f264879c;
        C87412m.m108593f(str2, "it.toUserName");
        mMHandler.postDelayed(new ForwardReport.C92685a.C92686a(j, str2, aVar.f264878b), FocusMeteringAction.DEFAULT_AUTOCANCEL_DURATION);
        return false;
    }
}

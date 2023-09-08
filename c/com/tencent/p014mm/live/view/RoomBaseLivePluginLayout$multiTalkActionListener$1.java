package com.tencent.p014mm.live.view;

import android.os.Bundle;
import com.tencent.p014mm.app.C40008f;
import com.tencent.p014mm.autogen.events.MultiTalkActionEvent;
import com.tencent.p014mm.sdk.event.IEvent;
import com.tencent.p014mm.sdk.event.IListener;
import d60.C58124b;
import gy3.C87412m;
import kotlin.Metadata;
import p182kk.C61104a;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u000f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, mo182094d2 = {"com/tencent/mm/live/view/RoomBaseLivePluginLayout$multiTalkActionListener$1", "Lcom/tencent/mm/sdk/event/IListener;", "Lcom/tencent/mm/autogen/events/MultiTalkActionEvent;", "plugin-logic_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.live.view.RoomBaseLivePluginLayout$multiTalkActionListener$1 */
public final class RoomBaseLivePluginLayout$multiTalkActionListener$1 extends IListener<MultiTalkActionEvent> {

    /* renamed from: d */
    public final /* synthetic */ RoomBaseLivePluginLayout f157366d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public RoomBaseLivePluginLayout$multiTalkActionListener$1(RoomBaseLivePluginLayout roomBaseLivePluginLayout, C40008f fVar) {
        super(fVar);
        this.f157366d = roomBaseLivePluginLayout;
    }

    public boolean callback(IEvent iEvent) {
        MultiTalkActionEvent multiTalkActionEvent = (MultiTalkActionEvent) iEvent;
        C87412m.m108594g(multiTalkActionEvent, "event");
        if (multiTalkActionEvent.f154837d.f107635a != 3 || C61104a.m71662r()) {
            return false;
        }
        Bundle bundle = new Bundle();
        bundle.putInt("voipEvent", 3);
        this.f157366d.statusChange(C58124b.C58125b.LIVE_HAPPEN_VOIP_EVENT, bundle);
        return false;
    }
}

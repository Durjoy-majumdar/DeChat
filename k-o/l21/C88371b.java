package l21;

import com.tencent.p014mm.autogen.events.VoipCallEvent;
import com.tencent.p014mm.autogen.events.VoipEvent;
import com.tencent.p014mm.sdk.event.IEvent;
import com.tencent.p014mm.sdk.event.IStaticListener;
import p182kk.C61104a;

/* renamed from: l21.b */
public class C88371b extends IStaticListener<VoipCallEvent> {
    public boolean callback(IEvent iEvent) {
        VoipCallEvent voipCallEvent = (VoipCallEvent) iEvent;
        if (voipCallEvent instanceof VoipCallEvent) {
            VoipCallEvent.C80744a aVar = voipCallEvent.f236298d;
            VoipEvent voipEvent = new VoipEvent();
            voipEvent.f194019d.f194022b = 2;
            voipEvent.publish();
            aVar.f236299a = voipEvent.f194020e.f194028b || C61104a.m71644D();
        }
        return false;
    }
}

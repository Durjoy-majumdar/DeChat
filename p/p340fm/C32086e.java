package p340fm;

import com.tencent.p014mm.autogen.events.WeChatTabRedDotEvent;
import com.tencent.p014mm.sdk.event.IEvent;
import com.tencent.p014mm.sdk.event.IStaticListener;
import hh0.C32910c;
import hh0.C32913e;
import zt3.C119157j;

/* renamed from: fm.e */
public class C32086e extends IStaticListener<WeChatTabRedDotEvent> {
    public boolean callback(IEvent iEvent) {
        WeChatTabRedDotEvent weChatTabRedDotEvent = (WeChatTabRedDotEvent) iEvent;
        if (C32913e.f89480h == null) {
            C32913e.f89480h = new C32913e();
        }
        C32913e eVar = C32913e.f89480h;
        eVar.getClass();
        if (weChatTabRedDotEvent == null || weChatTabRedDotEvent.f79062d == null) {
            return false;
        }
        ((C119157j) C119157j.f356862d).mo183875f(new C32910c(eVar, weChatTabRedDotEvent));
        return false;
    }
}

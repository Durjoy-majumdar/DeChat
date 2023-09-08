package p340fm;

import com.tencent.p014mm.autogen.events.WeChatTabRedDotEvent;
import com.tencent.p014mm.sdk.event.IEvent;
import com.tencent.p014mm.sdk.event.IStaticListener;
import com.tencent.p014mm.sdk.platformtools.Log;
import ih0.C33328d;
import ih0.C33329e;
import zt3.C119157j;
import zt3.C119179t;

/* renamed from: fm.q */
public class C32115q extends IStaticListener<WeChatTabRedDotEvent> {
    public boolean callback(IEvent iEvent) {
        WeChatTabRedDotEvent.C28853a aVar;
        WeChatTabRedDotEvent weChatTabRedDotEvent = (WeChatTabRedDotEvent) iEvent;
        C33329e xx02 = C33329e.xx0();
        xx02.getClass();
        if (!(weChatTabRedDotEvent == null || (aVar = weChatTabRedDotEvent.f79062d) == null)) {
            Log.m105927v("MicroMsg.AiRedDotData", "wechat tab red dot [%d] redDot[%b] unread[%d]", Integer.valueOf(aVar.f79063a), Boolean.valueOf(weChatTabRedDotEvent.f79062d.f79064b), Integer.valueOf(weChatTabRedDotEvent.f79062d.f79065c));
            C119179t tVar = C119157j.f356862d;
            ((C119157j) tVar).mo183894y("aireddot_" + weChatTabRedDotEvent.f79062d.f79063a);
            C119179t tVar2 = C119157j.f356862d;
            C33328d dVar = new C33328d(xx02, weChatTabRedDotEvent);
            ((C119157j) tVar2).mo183879j(dVar, 500, "aireddot_" + weChatTabRedDotEvent.f79062d.f79063a);
        }
        return false;
    }
}

package p340fm;

import com.tencent.p014mm.autogen.events.WeChatFrontBackEvent;
import com.tencent.p014mm.sdk.event.IEvent;
import com.tencent.p014mm.sdk.event.IStaticListener;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.xweb.WCWebUpdater;
import di3.C86312j;
import ih0.C21093g;

/* renamed from: fm.u */
public class C32124u extends IStaticListener<WeChatFrontBackEvent> {
    public boolean callback(IEvent iEvent) {
        WeChatFrontBackEvent.C28852a aVar;
        WeChatFrontBackEvent weChatFrontBackEvent = (WeChatFrontBackEvent) iEvent;
        C21093g gVar = (C21093g) C86312j.m106911c(C21093g.class);
        gVar.getClass();
        if (!(weChatFrontBackEvent == null || (aVar = weChatFrontBackEvent.f79057d) == null)) {
            if (aVar.f79058a == 8) {
                gVar.vx0(WCWebUpdater.XWEB_UPDATER_START_CHECK_TYPE_EMBEDINSTALL, aVar.f79060c);
            }
            WeChatFrontBackEvent.C28852a aVar2 = weChatFrontBackEvent.f79057d;
            Log.m105927v("MicroMsg.AiSessionData", "wechat front back event [%d] [%s] [%d]", Integer.valueOf(weChatFrontBackEvent.f79057d.f79058a), aVar2.f79059b, Long.valueOf(aVar2.f79060c));
        }
        return false;
    }
}

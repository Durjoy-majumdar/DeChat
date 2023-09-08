package p340fm;

import com.tencent.p014mm.autogen.events.WeChatFrontBackEvent;
import com.tencent.p014mm.sdk.event.IEvent;
import com.tencent.p014mm.sdk.event.IStaticListener;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import ih0.C117197j;
import jh0.C33573a;
import lh0.C34262g;

/* renamed from: fm.c0 */
public class C32081c0 extends IStaticListener<WeChatFrontBackEvent> {
    public boolean callback(IEvent iEvent) {
        WeChatFrontBackEvent.C28852a aVar;
        WeChatFrontBackEvent weChatFrontBackEvent = (WeChatFrontBackEvent) iEvent;
        C117197j wx02 = C117197j.wx0();
        wx02.getClass();
        if (!(weChatFrontBackEvent == null || (aVar = weChatFrontBackEvent.f79057d) == null)) {
            wx02.f351082e = false;
            if (aVar.f79058a == 7) {
                if (Util.milliSecondsToNow(wx02.f351081d) <= 10000) {
                    wx02.f351082e = true;
                }
                wx02.f351081d = 0;
            }
            WeChatFrontBackEvent.C28852a aVar2 = weChatFrontBackEvent.f79057d;
            if (aVar2.f79058a == 7) {
                long j = aVar2.f79060c;
                C34262g vx02 = C34262g.vx0();
                vx02.requireAccountInitialized();
                long a = vx02.f92371i.mo33600a("calendar_first_enter_app_time", 0);
                if (C33573a.m40127c(a) != C33573a.m40127c(Util.nowMilliSecond())) {
                    a = 0;
                }
                if (a <= 0) {
                    C34262g vx03 = C34262g.vx0();
                    vx03.requireAccountInitialized();
                    vx03.f92371i.mo33604e("calendar_first_enter_app_time", j);
                }
            }
            WeChatFrontBackEvent.C28852a aVar3 = weChatFrontBackEvent.f79057d;
            Log.m105927v("MicroMsg.AiWeixinData", "wechat front back event [%d] [%s] [%d]", Integer.valueOf(weChatFrontBackEvent.f79057d.f79058a), aVar3.f79059b, Long.valueOf(aVar3.f79060c));
        }
        return false;
    }
}

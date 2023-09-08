package p340fm;

import com.tencent.p014mm.autogen.events.NewNotificationEvent;
import com.tencent.p014mm.sdk.event.IEvent;
import com.tencent.p014mm.sdk.event.IStaticListener;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import ih0.C117197j;

/* renamed from: fm.a0 */
public class C32075a0 extends IStaticListener<NewNotificationEvent> {
    public boolean callback(IEvent iEvent) {
        NewNotificationEvent newNotificationEvent = (NewNotificationEvent) iEvent;
        C117197j wx02 = C117197j.wx0();
        wx02.getClass();
        if (!(newNotificationEvent == null || newNotificationEvent.f78873d == null)) {
            wx02.f351081d = Util.nowMilliSecond();
            NewNotificationEvent.C28781a aVar = newNotificationEvent.f78873d;
            Log.m105925i("MicroMsg.AiWeixinData", "wechat notification event talker[%s] unreadCount[%d] silence[%b]", aVar.f78874a, Integer.valueOf(aVar.f78875b), Boolean.valueOf(newNotificationEvent.f78873d.f78876c));
        }
        return false;
    }
}

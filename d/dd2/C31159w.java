package dd2;

import cd2.C28535f;
import cd2.C28541j;
import cd2.C67355d;
import com.tencent.p014mm.autogen.events.SendMsgFailEvent;
import com.tencent.p014mm.sdk.event.IEvent;
import com.tencent.p014mm.sdk.event.IStaticListener;
import com.tencent.p014mm.sdk.platformtools.MMHandlerThread;

/* renamed from: dd2.w */
public class C31159w extends IStaticListener<SendMsgFailEvent> {
    public boolean callback(IEvent iEvent) {
        C28535f xx02 = C28541j.vx0().xx0();
        xx02.getClass();
        MMHandlerThread.postToMainThread(new C67355d(xx02, (SendMsgFailEvent) iEvent));
        return false;
    }
}

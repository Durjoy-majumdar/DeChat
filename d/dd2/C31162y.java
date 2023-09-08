package dd2;

import cd2.C28535f;
import cd2.C28541j;
import cd2.C67356e;
import com.tencent.p014mm.autogen.events.SendMsgSuccessEvent;
import com.tencent.p014mm.sdk.event.IEvent;
import com.tencent.p014mm.sdk.event.IStaticListener;
import com.tencent.p014mm.sdk.platformtools.MMHandlerThread;

/* renamed from: dd2.y */
public class C31162y extends IStaticListener<SendMsgSuccessEvent> {
    public boolean callback(IEvent iEvent) {
        C28535f xx02 = C28541j.vx0().xx0();
        xx02.getClass();
        MMHandlerThread.postToMainThread(new C67356e(xx02, (SendMsgSuccessEvent) iEvent));
        return false;
    }
}

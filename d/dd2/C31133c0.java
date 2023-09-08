package dd2;

import cd2.C28537g;
import cd2.C28539i;
import cd2.C28541j;
import com.tencent.p014mm.autogen.events.SnsPostSuccessEvent;
import com.tencent.p014mm.sdk.event.IEvent;
import com.tencent.p014mm.sdk.event.IStaticListener;
import com.tencent.p014mm.sdk.platformtools.MMHandlerThread;

/* renamed from: dd2.c0 */
public class C31133c0 extends IStaticListener<SnsPostSuccessEvent> {
    public boolean callback(IEvent iEvent) {
        C28539i yx02 = C28541j.vx0().yx0();
        yx02.getClass();
        MMHandlerThread.postToMainThread(new C28537g(yx02, (SnsPostSuccessEvent) iEvent));
        return false;
    }
}

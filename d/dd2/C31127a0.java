package dd2;

import cd2.C28538h;
import cd2.C28539i;
import cd2.C28541j;
import com.tencent.p014mm.autogen.events.SnsPostFailEvent;
import com.tencent.p014mm.sdk.event.IEvent;
import com.tencent.p014mm.sdk.event.IStaticListener;
import com.tencent.p014mm.sdk.platformtools.MMHandlerThread;

/* renamed from: dd2.a0 */
public class C31127a0 extends IStaticListener<SnsPostFailEvent> {
    public boolean callback(IEvent iEvent) {
        C28539i yx02 = C28541j.vx0().yx0();
        yx02.getClass();
        MMHandlerThread.postToMainThread(new C28538h(yx02, (SnsPostFailEvent) iEvent));
        return false;
    }
}

package p621nn;

import com.tencent.p014mm.autogen.events.MsgSynchronizeStartEvent;
import com.tencent.p014mm.sdk.event.IEvent;
import com.tencent.p014mm.sdk.event.IStaticListener;
import com.tencent.p014mm.sdk.platformtools.Log;
import f40.C86709a0;

/* renamed from: nn.h0 */
public class C34910h0 extends IStaticListener<MsgSynchronizeStartEvent> {
    public boolean callback(IEvent iEvent) {
        MsgSynchronizeStartEvent msgSynchronizeStartEvent = (MsgSynchronizeStartEvent) iEvent;
        if (msgSynchronizeStartEvent == null || msgSynchronizeStartEvent.f9331d == null) {
            return false;
        }
        Log.m105924i("MicroMsg.BackupCore", "receive msgSynchronizeStartEvent.");
        C86709a0.m107525e().postToWorker(new C34908g0(this, msgSynchronizeStartEvent));
        return false;
    }
}

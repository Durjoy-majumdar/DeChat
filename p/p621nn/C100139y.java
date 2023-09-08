package p621nn;

import av0.C16686a;
import com.tencent.p014mm.autogen.events.BackupStartMergeEvent;
import com.tencent.p014mm.sdk.crash.CrashReportFactory;
import com.tencent.p014mm.sdk.event.IEvent;
import com.tencent.p014mm.sdk.event.IStaticListener;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandlerThread;
import f40.C86709a0;
import yu0.C102913k;

/* renamed from: nn.y */
public class C100139y extends IStaticListener<BackupStartMergeEvent> {
    public boolean callback(IEvent iEvent) {
        BackupStartMergeEvent backupStartMergeEvent = (BackupStartMergeEvent) iEvent;
        if (backupStartMergeEvent != null) {
            Log.m105925i("MicroMsg.BackupCore", "receive msgSynchronizeStartEvent, op:%d.", Integer.valueOf(backupStartMergeEvent.f264640d.f264641a));
            int i = backupStartMergeEvent.f264640d.f264641a;
            if (i != 1) {
                if (i != 2) {
                    if (i == 3) {
                        C102913k.m136043h();
                        C102913k.m136047l(C102913k.m136051p());
                        C102913k.m136047l(C102913k.m136052q());
                        MMHandlerThread.postToMainThread(new C34930x(this));
                    }
                } else if (!C16686a.m16193i().mo17661j().mo17675h()) {
                    MMHandlerThread.postToMainThread(new C34929v(this));
                } else {
                    C86709a0.m107525e().postToWorker(new C100138w(this));
                }
            } else if (CrashReportFactory.hasDebuger()) {
                C102913k.f303764a = true;
                MMHandlerThread.postToMainThread(new C34928u(this));
            }
        }
        return false;
    }
}

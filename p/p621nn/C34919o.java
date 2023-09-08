package p621nn;

import com.tencent.p014mm.autogen.events.BackupGetA8keyRedirectEvent;
import com.tencent.p014mm.sdk.event.IEvent;
import com.tencent.p014mm.sdk.event.IStaticListener;
import com.tencent.p014mm.sdk.platformtools.Log;
import rv0.C118235c;

/* renamed from: nn.o */
public class C34919o extends IStaticListener<BackupGetA8keyRedirectEvent> {
    public boolean callback(IEvent iEvent) {
        BackupGetA8keyRedirectEvent backupGetA8keyRedirectEvent = (BackupGetA8keyRedirectEvent) iEvent;
        if (backupGetA8keyRedirectEvent != null) {
            Log.m105924i("MicroMsg.BackupCore", "receive BackupGetA8keyRedirectEvent.");
            String str = backupGetA8keyRedirectEvent.f78722d.f78723a;
            C118235c.m166796a(2).mo17657c(str);
        }
        return false;
    }
}

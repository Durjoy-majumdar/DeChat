package p621nn;

import android.content.Context;
import com.tencent.p014mm.autogen.events.BackupUSBStopActionEvent;
import com.tencent.p014mm.sdk.event.IEvent;
import com.tencent.p014mm.sdk.event.IStaticListener;
import com.tencent.p014mm.sdk.platformtools.Log;
import rv0.C118235c;

/* renamed from: nn.a0 */
public class C34891a0 extends IStaticListener<BackupUSBStopActionEvent> {
    public boolean callback(IEvent iEvent) {
        BackupUSBStopActionEvent backupUSBStopActionEvent = (BackupUSBStopActionEvent) iEvent;
        if (backupUSBStopActionEvent != null) {
            C118235c.m166796a(-1).mo17657c((Context) backupUSBStopActionEvent.f78726d.f78727a);
            Log.m105924i("MicroMsg.BackupCore", "receive BackupUSBStopActionEvent.");
        }
        return false;
    }
}

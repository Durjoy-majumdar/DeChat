package p621nn;

import com.tencent.p014mm.autogen.events.BackupCoreResetEvent;
import com.tencent.p014mm.sdk.event.IEvent;
import com.tencent.p014mm.sdk.event.IStaticListener;
import java.util.Iterator;
import yu0.C102908a;
import yu0.C102910f;

/* renamed from: nn.m */
public class C100137m extends IStaticListener<BackupCoreResetEvent> {
    public boolean callback(IEvent iEvent) {
        BackupCoreResetEvent backupCoreResetEvent = (BackupCoreResetEvent) iEvent;
        if (!C102910f.f303741j) {
            Iterator<C102908a> it = C102908a.f303737a.iterator();
            while (it.hasNext()) {
                it.next().mo17656b();
            }
            C102908a.f303737a.clear();
            C102910f.f303739h = "key".getBytes();
            C102910f.f303738g = 0;
            C102910f.f303740i = null;
            C102910f.f303741j = false;
        }
        return false;
    }
}

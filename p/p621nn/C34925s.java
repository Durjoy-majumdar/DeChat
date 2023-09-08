package p621nn;

import com.tencent.p014mm.autogen.events.BackupProcessMgrExitEvent;
import com.tencent.p014mm.sdk.event.IEvent;
import com.tencent.p014mm.sdk.event.IStaticListener;
import rv0.C118235c;

/* renamed from: nn.s */
public class C34925s extends IStaticListener<BackupProcessMgrExitEvent> {
    public boolean callback(IEvent iEvent) {
        boolean z = ((BackupProcessMgrExitEvent) iEvent).f78724d.f78725a;
        C118235c.m166796a(1).mo17657c(Boolean.valueOf(z));
        return false;
    }
}

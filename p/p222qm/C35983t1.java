package p222qm;

import android.os.Process;
import com.tencent.p014mm.app.C80610p1;
import com.tencent.p014mm.autogen.events.SwitchAccountKillProcessEvent;
import com.tencent.p014mm.p136ui.MMAppMgr;
import com.tencent.p014mm.sdk.event.IEvent;
import com.tencent.p014mm.sdk.event.IStaticListener;
import com.tencent.p014mm.sdk.platformtools.Log;
import j20.C117292a;
import k20.C60958c;
import k20.C9556a;

/* renamed from: qm.t1 */
public class C35983t1 extends IStaticListener<SwitchAccountKillProcessEvent> {
    public boolean callback(IEvent iEvent) {
        SwitchAccountKillProcessEvent switchAccountKillProcessEvent = (SwitchAccountKillProcessEvent) iEvent;
        C80610p1 p1Var = C80610p1.f235824f;
        Log.m105925i("MicroMsg.WorkerProfile", "try to kill mm pid %d", Integer.valueOf(Process.myPid()));
        MMAppMgr.m85989i();
        int myPid = Process.myPid();
        C9556a aVar = new C9556a();
        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
        aVar.mo10233c(Integer.valueOf(myPid));
        Object obj = new Object();
        C117292a.m165358d(obj, aVar.mo10232b(), "com/tencent/mm/app/WorkerProfile", "callbackOfSwitchAccountKillProcessEvent", "(Lcom/tencent/mm/autogen/events/SwitchAccountKillProcessEvent;)Z", "android/os/Process_EXEC_", "killProcess", "(I)V");
        Process.killProcess(((Integer) aVar.mo10231a(0)).intValue());
        C117292a.m165359e(obj, "com/tencent/mm/app/WorkerProfile", "callbackOfSwitchAccountKillProcessEvent", "(Lcom/tencent/mm/autogen/events/SwitchAccountKillProcessEvent;)Z", "android/os/Process_EXEC_", "killProcess", "(I)V");
        return true;
    }
}

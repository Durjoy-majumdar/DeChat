package dp1;

import android.app.ActivityManager;
import android.os.Debug;
import android.os.Process;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.tinker.loader.hotplug.EnvConsts;
import gy3.C87412m;

/* renamed from: dp1.p0 */
public final class C58397p0 implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ C58396o0 f167308d;

    public C58397p0(C58396o0 o0Var) {
        this.f167308d = o0Var;
    }

    public final void run() {
        C58393n0 n0Var = new C58393n0();
        Object systemService = MMApplicationContext.getContext().getSystemService(EnvConsts.ACTIVITY_MANAGER_SRVNAME);
        C87412m.m108592e(systemService, "null cannot be cast to non-null type android.app.ActivityManager");
        Debug.MemoryInfo[] processMemoryInfo = ((ActivityManager) systemService).getProcessMemoryInfo(new int[]{Process.myPid()});
        if (processMemoryInfo != null && processMemoryInfo.length == 1) {
            Debug.MemoryInfo memoryInfo = processMemoryInfo[0];
            n0Var.f167302a = memoryInfo.getTotalPss();
            n0Var.f167303b = memoryInfo.dalvikPss;
            n0Var.f167304c = memoryInfo.nativePss;
        }
        C58396o0 o0Var = this.f167308d;
        if (o0Var != null) {
            o0Var.mo78147a(n0Var);
        }
    }
}

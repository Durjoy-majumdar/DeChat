package q70;

import com.tencent.matrix.util.MemInfo;
import com.tencent.p014mm.plugin.report.service.C115669n;
import p723vf.C118672d;

/* renamed from: q70.f0 */
public final class C89506f0 implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ MemInfo f257589d;

    public C89506f0(MemInfo memInfo) {
        this.f257589d = memInfo;
    }

    public final void run() {
        C118672d.m167352b("MicroMsg.monitor.ProcBackgroundMemory", "ProcessDeepBackgroundOwner 3min mem over threshold", new Object[0]);
        C115669n.INSTANCE.mo175912v(1832, 2);
        C89508g0.m111903a(C89508g0.f257593a, this.f257589d, 2, C89508g0.f257595c);
    }
}

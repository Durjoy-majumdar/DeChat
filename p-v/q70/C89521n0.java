package q70;

import com.tencent.matrix.util.MemInfo;
import com.tencent.p014mm.plugin.report.service.C115669n;
import p723vf.C118672d;

/* renamed from: q70.n0 */
public final class C89521n0 implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ MemInfo f257617d;

    public C89521n0(MemInfo memInfo) {
        this.f257617d = memInfo;
    }

    public final void run() {
        C118672d.m167352b("MicroMsg.monitor.ProcBackgroundMemory", "ProcessStagedBackgroundOwner 3min mem over threshold", new Object[0]);
        C115669n.INSTANCE.mo175912v(1832, 1);
        C89508g0.m111903a(C89508g0.f257593a, this.f257617d, 13, C89508g0.f257596d);
    }
}

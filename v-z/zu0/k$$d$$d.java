package zu0;

import com.tencent.p014mm.plugin.backup.backuppcui.BackupMigratePCUI;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import gv0.C20842c;
import pv0.C47527g;
import pv0.C62556a;
import yu0.C102913k;

public final /* synthetic */ class k$$d$$d implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ k$$d f67637d;

    /* renamed from: e */
    public final /* synthetic */ long f67638e;

    /* renamed from: f */
    public final /* synthetic */ int f67639f;

    public /* synthetic */ k$$d$$d(k$$d k__d, long j, int i) {
        this.f67637d = k__d;
        this.f67638e = j;
        this.f67639f = i;
    }

    public final void run() {
        k$$d k__d = this.f67637d;
        long j = this.f67638e;
        int i = this.f67639f;
        k__d.f67653g.f67621j.f177664e = Util.milliSecondsToNow(j);
        C23584k kVar = k__d.f67653g;
        kVar.getClass();
        int i2 = 0;
        C23583j jVar = C23584k.f67611q;
        Log.m105925i("MicroMsg.BackupPackAndSend", "moveFinish count:%d, waitCount:%d", Integer.valueOf(i), Long.valueOf(jVar.f67601b.get() - jVar.f67602c.get()));
        C23583j jVar2 = C23584k.f67611q;
        jVar2.f67606g = true;
        jVar2.mo37042b();
        C62556a aVar = kVar.f67621j;
        C47527g gVar = new C47527g();
        gVar.f127504d = kVar.f67615d.f303742b;
        gVar.f127515r = aVar;
        C102913k.m136032D(aVar);
        try {
            C20842c.m22885v1(gVar.toByteArray(), 8);
        } catch (Exception e) {
            Log.printErrStackTrace("MicroMsg.BackupPackAndSend", e, "BackupFinishRequest to buf err.", new Object[0]);
        }
        try {
            Thread.sleep(300);
        } catch (InterruptedException unused) {
        }
        kVar.f67615d.mo142622e().mo142626d(15, i, i);
        kVar.f67614c.mo17705K(15);
        long milliSecondsToNow = (long) ((int) Util.milliSecondsToNow(kVar.f67623l));
        long j2 = C20842c.f58882p.f58943e / 1024;
        if (milliSecondsToNow > 0 && j2 > 0) {
            i2 = (int) (j2 / milliSecondsToNow);
        }
        BackupMigratePCUI.f50079o.mo22722a(102, (int) milliSecondsToNow, (int) j2, i2);
        kVar.mo37044b(true);
        C20842c.m22876D1();
        C20842c.m22877E1();
        kVar.f67614c.mo17706L();
    }
}

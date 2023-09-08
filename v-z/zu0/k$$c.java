package zu0;

import com.tencent.p014mm.sdk.platformtools.Log;

public final /* synthetic */ class k$$c implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ C23584k f67649d;

    public /* synthetic */ k$$c(C23584k kVar) {
        this.f67649d = kVar;
    }

    public final void run() {
        C23584k kVar = this.f67649d;
        kVar.getClass();
        Log.m105924i("MicroMsg.BackupPackAndSend", "packScene thread running");
        while (kVar.f67626o) {
            Runnable poll = kVar.f67627p.poll();
            if (poll != null) {
                poll.run();
            } else {
                kVar.f67619h.close();
                kVar.f67619h.block(500);
            }
        }
        Log.m105925i("MicroMsg.BackupPackAndSend", "packScene thread end: packTagQueue.size:%d", Integer.valueOf(kVar.f67627p.size()));
    }
}

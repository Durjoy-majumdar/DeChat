package zu0;

import com.tencent.p014mm.sdk.platformtools.Log;
import gv0.C20842c;
import java.util.concurrent.ConcurrentHashMap;

public final /* synthetic */ class k$$d$$c implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ k$$d f67634d;

    /* renamed from: e */
    public final /* synthetic */ long f67635e;

    /* renamed from: f */
    public final /* synthetic */ int f67636f;

    public /* synthetic */ k$$d$$c(k$$d k__d, long j, int i) {
        this.f67634d = k__d;
        this.f67635e = j;
        this.f67636f = i;
    }

    public final void run() {
        k$$d k__d = this.f67634d;
        long j = this.f67635e;
        int i = this.f67636f;
        if (k__d.f67653g.f67613b) {
            Log.m105920e("MicroMsg.BackupPackAndSend", "finish prepare backupChatRunnable cancel!");
            return;
        }
        int i2 = 0;
        while (true) {
            ConcurrentHashMap<Integer, C20842c> concurrentHashMap = C20842c.f58876g;
            Log.m105921e("MicroMsg.BackupPackAndSend", "backupChatRunnable moveFinish block! seqCount:%d, isFinish:%b, waitCount:%d", Integer.valueOf(concurrentHashMap.size()), Boolean.valueOf(k__d.f67653g.f67620i.mo37066a()), Integer.valueOf(i2));
            if (k__d.f67653g.f67620i.mo37066a() || i2 > 20) {
                break;
            }
            if (concurrentHashMap.size() == 0) {
                int i3 = i2 + 1;
                if (i2 > 20) {
                    break;
                }
                i2 = i3;
            }
            k__d.f67653g.f67618g.close();
            k__d.f67653g.f67618g.block(500);
        }
        if (k__d.f67653g.f67613b) {
            Log.m105920e("MicroMsg.BackupPackAndSend", "finish prepare backupChatRunnable cancel!");
            return;
        }
        C23583j jVar = C23584k.f67611q;
        k$$d$$d k__d__d = new k$$d$$d(k__d, j, i);
        jVar.getClass();
        jVar.mo37041a(new C23582i(k__d__d), 0);
    }
}

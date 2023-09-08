package com.tencent.p014mm.sdcard_migrate;

import com.tencent.p014mm.sdcard_migrate.ExtStorageMigrateMonitor;
import com.tencent.p014mm.sdk.platformtools.MultiProcessMMKV;
import hp3.C87581a;
import kj2.C117407d;

/* renamed from: com.tencent.mm.sdcard_migrate.e */
public class C85729e implements C87581a<Void, Void> {
    public Object call(Object obj) {
        Void voidR = (Void) obj;
        boolean[] zArr = ExtStorageMigrateMonitor.f249773c;
        synchronized (zArr) {
            zArr[0] = true;
        }
        ExtStorageMigrateMonitor.PendingOps d = ExtStorageMigrateMonitor.m105905d();
        if (d != null) {
            for (ExtStorageMigrateMonitor.PendingOps.C85722b next : d.f249776d) {
                C117407d.INSTANCE.idkeyStat(next.f249778a, next.f249779b, next.f249780c, true);
            }
            for (ExtStorageMigrateMonitor.PendingOps.C85723c next2 : d.f249777e) {
                ExtStorageMigrateMonitor.m105902a(next2.f249781a, next2.f249782b, next2.f249783c);
            }
            try {
                MultiProcessMMKV.getMMKV("mmkv_extstg_mon_pending_ops").removeValueForKey("mmkv_key_pendingops");
            } catch (Throwable th) {
                ((ExtStorageMigrateMonitor.C85724a) ExtStorageMigrateMonitor.f249775e).mo119342d("MicroMsg.ExtStorageMigrateMonitor", th, "[-] Fail to clear persisted ops.", new Object[0]);
            }
        }
        for (ExtStorageMigrateMonitor.PendingOps.C85722b next3 : ExtStorageMigrateMonitor.f249774d.f249776d) {
            C117407d.INSTANCE.idkeyStat(next3.f249778a, next3.f249779b, next3.f249780c, true);
        }
        ExtStorageMigrateMonitor.PendingOps pendingOps = ExtStorageMigrateMonitor.f249774d;
        pendingOps.f249776d.clear();
        for (ExtStorageMigrateMonitor.PendingOps.C85723c next4 : pendingOps.f249777e) {
            ExtStorageMigrateMonitor.m105902a(next4.f249781a, next4.f249782b, next4.f249783c);
        }
        ExtStorageMigrateMonitor.f249774d.f249777e.clear();
        return null;
    }
}

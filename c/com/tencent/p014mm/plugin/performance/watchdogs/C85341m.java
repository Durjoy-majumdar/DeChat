package com.tencent.p014mm.plugin.performance.watchdogs;

import android.app.ActivityManager;
import android.os.Debug;
import android.os.Process;
import com.tencent.mars.smc.IDKey;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.tinker.loader.hotplug.EnvConsts;
import di3.C86312j;
import h81.C32735h;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import kj2.C117407d;
import zt3.C119157j;

/* renamed from: com.tencent.mm.plugin.performance.watchdogs.m */
public class C85341m implements Runnable {

    /* renamed from: g */
    public static final C85341m f248689g = new C85341m();

    /* renamed from: d */
    public boolean f248690d = false;

    /* renamed from: e */
    public int f248691e = 0;

    /* renamed from: f */
    public final ActivityManager f248692f = ((ActivityManager) MMApplicationContext.getContext().getSystemService(EnvConsts.ACTIVITY_MANAGER_SRVNAME));

    /* renamed from: com.tencent.mm.plugin.performance.watchdogs.m$a */
    public static class C30350a {

        /* renamed from: a */
        public String f81907a;

        /* renamed from: b */
        public int f81908b;

        /* renamed from: c */
        public long f81909c;

        public C30350a(String str, int i) {
            this.f81907a = str;
            this.f81908b = i;
        }

        public String toString() {
            return this.f81907a + "|pid:" + this.f81908b + "|pss:" + this.f81909c;
        }
    }

    /* renamed from: a */
    public final List<C30350a> mo118627a() {
        Debug.MemoryInfo memoryInfo;
        long currentTimeMillis = System.currentTimeMillis();
        List<ActivityManager.RunningAppProcessInfo> runningAppProcesses = this.f248692f.getRunningAppProcesses();
        ArrayList arrayList = new ArrayList();
        if (runningAppProcesses != null) {
            for (ActivityManager.RunningAppProcessInfo next : runningAppProcesses) {
                int myUid = Process.myUid();
                int i = next.uid;
                if (myUid != i) {
                    Log.m105921e("MicroMsg.ProcessWatchDog", "info with uid [%s] & process name [%s] is not current app [%s]", Integer.valueOf(i), next.processName, Integer.valueOf(Process.myUid()));
                } else {
                    Debug.MemoryInfo[] processMemoryInfo = this.f248692f.getProcessMemoryInfo(new int[]{next.pid});
                    C30350a aVar = new C30350a(next.processName, next.pid);
                    if (!(processMemoryInfo == null || processMemoryInfo.length != 1 || (memoryInfo = processMemoryInfo[0]) == null)) {
                        aVar.f81909c = (long) memoryInfo.getTotalPss();
                    }
                    arrayList.add(aVar);
                }
            }
        }
        Log.m105925i("MicroMsg.ProcessWatchDog", "dumpProcess cost: %s", Long.valueOf(System.currentTimeMillis() - currentTimeMillis));
        return arrayList;
    }

    public void run() {
        ArrayList arrayList = (ArrayList) mo118627a();
        if (!arrayList.isEmpty()) {
            int size = arrayList.size();
            ArrayList arrayList2 = new ArrayList();
            arrayList2.add(new IDKey(1474, 0, 1));
            if (size <= 127) {
                arrayList2.add(new IDKey(1474, size, 1));
            }
            C117407d.INSTANCE.mo160124a(arrayList2, false);
            int Qe = ((C32735h) C86312j.m106911c(C32735h.class)).mo58779Qe(C32735h.C32737c.clicfg_process_watchdog_count_threshold_v2, 12);
            long j = 0;
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                j += ((C30350a) it.next()).f81909c;
            }
            String replace = Arrays.toString(arrayList.toArray()).replace(",", ";");
            if (size >= Qe && size > this.f248691e) {
                this.f248691e = size;
                C117407d.INSTANCE.mo160131h(20846, Integer.valueOf(size), replace, Long.valueOf(j));
            }
            Log.m105925i("MicroMsg.ProcessWatchDog", "DumpProcesses: %s || pssSum : %s", replace, Long.valueOf(j));
        }
        ((C119157j) C119157j.f356862d).mo183878i(this, this.f248690d ? 300000 : 1800000);
    }
}

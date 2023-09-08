package zh3;

import a70.C112760b;
import android.os.Environment;
import android.os.Process;
import android.os.StatFs;
import com.tencent.p014mm.app.AppForegroundDelegate;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MultiProcessMMKV;
import com.tencent.p014mm.storage.C85803w4;
import j20.C117292a;
import k20.C60958c;
import k20.C9556a;
import kj2.C117407d;
import lu3.C34379c;
import oa1.C117731d;
import zt3.C119157j;
import zt3.C119179t;

public class e$$d implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ C119118e f356749d;

    /* renamed from: zh3.e$$d$a */
    public class C119119a implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ String f356750d;

        /* renamed from: zh3.e$$d$a$a */
        public class C119120a implements Runnable {

            /* renamed from: d */
            public final /* synthetic */ long f356752d;

            /* renamed from: e */
            public final /* synthetic */ long f356753e;

            /* renamed from: f */
            public final /* synthetic */ long f356754f;

            /* renamed from: g */
            public final /* synthetic */ long f356755g;

            /* renamed from: h */
            public final /* synthetic */ long f356756h;

            public C119120a(long j, long j2, long j3, long j4, long j5) {
                this.f356752d = j;
                this.f356753e = j2;
                this.f356754f = j3;
                this.f356755g = j4;
                this.f356756h = j5;
            }

            public void run() {
                if (!AppForegroundDelegate.INSTANCE.f343454n) {
                    Log.m105920e("MicroMsg.MMDataBase", "vacuum too slow, kill self");
                    e$$d.this.f356749d.mo183810b();
                    int myPid = Process.myPid();
                    C9556a aVar = new C9556a();
                    ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                    aVar.mo10233c(Integer.valueOf(myPid));
                    Object obj = new Object();
                    C117292a.m165358d(obj, aVar.mo10232b(), "com/tencent/mm/storagebase/MMDataBase$3$1$1", "run", "()V", "android/os/Process_EXEC_", "killProcess", "(I)V");
                    Process.killProcess(((Integer) aVar.mo10231a(0)).intValue());
                    C117292a.m165359e(obj, "com/tencent/mm/storagebase/MMDataBase$3$1$1", "run", "()V", "android/os/Process_EXEC_", "killProcess", "(I)V");
                    C117407d dVar = C117407d.INSTANCE;
                    C119119a aVar2 = C119119a.this;
                    dVar.mo160131h(25824, aVar2.f356750d, e$$d.this.f356749d.mo183817j(), Long.valueOf(this.f356752d), Long.valueOf(Math.min(this.f356753e, this.f356754f)), Long.valueOf(this.f356755g), "slow-kill", 0, Long.valueOf(this.f356756h), 0, 0, 0, 0, 0);
                }
            }
        }

        public C119119a(String str) {
            this.f356750d = str;
        }

        public void run() {
            long g = e$$d.this.f356749d.mo183814g();
            try {
                StatFs statFs = new StatFs(Environment.getDataDirectory().getPath());
                StatFs statFs2 = new StatFs(C112760b.m154230f0());
                long f = e$$d.this.f356749d.mo183813f() - g;
                long availableBytes = statFs.getAvailableBytes();
                long availableBytes2 = statFs2.getAvailableBytes();
                long f2 = e$$d.this.f356749d.mo183813f();
                C117407d dVar = C117407d.INSTANCE;
                dVar.mo160131h(25824, this.f356750d, e$$d.this.f356749d.mo183817j(), Long.valueOf(f2), Long.valueOf(Math.min(availableBytes, availableBytes2)), Long.valueOf(g), "s-before", 0, Long.valueOf(f), 0, 0, 0, 0, 0);
                Log.m105924i("MicroMsg.MMDataBase", "start vacuum, dbPath = " + e$$d.this.f356749d.mo183817j());
                C119179t tVar = C119157j.f356862d;
                String str = "MicroMsg.MMDataBase";
                C119120a aVar = r1;
                C117407d dVar2 = dVar;
                long j = availableBytes2;
                long j2 = availableBytes;
                C119120a aVar2 = new C119120a(f2, availableBytes, availableBytes2, g, f);
                C34379c<?> i = ((C119157j) tVar).mo183878i(aVar, 2700000);
                if (g <= 209715200) {
                    dVar2.mo160131h(25824, this.f356750d, e$$d.this.f356749d.mo183817j(), Long.valueOf(f2), Long.valueOf(Math.min(j2, j)), Long.valueOf(g), "s-check-return", 0, Long.valueOf(f), 0, 0, 0, 0, 0);
                    return;
                }
                long j3 = j;
                long currentTimeMillis = System.currentTimeMillis();
                C119118e.f356735o = true;
                boolean x = e$$d.this.f356749d.mo183826x();
                C119118e.f356735o = false;
                long currentTimeMillis2 = System.currentTimeMillis() - currentTimeMillis;
                i.cancel(true);
                String str2 = str;
                Log.m105924i(str2, "vacuum finished, duration = " + currentTimeMillis2);
                long f3 = e$$d.this.f356749d.mo183813f();
                StringBuilder sb = new StringBuilder();
                sb.append("vacuum finished, dbFileSizeAfterVacuum = ");
                sb.append(f3);
                sb.append(", trimmedSize = ");
                long j4 = currentTimeMillis2;
                long j5 = f2 - f3;
                sb.append(j5);
                Log.m105924i(str2, sb.toString());
                dVar2.mo160131h(25824, this.f356750d, e$$d.this.f356749d.mo183817j(), Long.valueOf(f2), Long.valueOf(Math.min(j2, j3)), Long.valueOf(g), "s-" + x, Long.valueOf(f3), Long.valueOf(f), Long.valueOf(j5), Long.valueOf(j4), 0, 1, Long.valueOf(f / j4));
            } catch (Throwable th) {
                Log.m105920e("MicroMsg.MMDataBase", "sf or sdsf is null : " + th.getMessage());
            }
        }
    }

    public e$$d(C119118e eVar) {
        this.f356749d = eVar;
    }

    public void run() {
        boolean g = C117731d.m166007c().mo182445g("clicfg_vacuum_midnight_2", false, true);
        boolean g2 = C117731d.m166007c().mo182445g("clicfg_vacuum_midnight_3", false, true);
        boolean g3 = C117731d.m166007c().mo182445g("clicfg_vacuum_midnight_4", false, true);
        Log.m105924i("MicroMsg.MMDataBase", "willVacuumOnMidnight, s1 = " + true + ", s2 = " + g + ", s3 = " + g2);
        long j = g ? 524288000 : 209715200;
        if (g2) {
            j = 1073741824;
        }
        if (g3) {
            j = 2147483648L;
        }
        String substring = this.f356749d.mo183817j().substring(this.f356749d.mo183817j().lastIndexOf("/") + 1);
        Log.m105924i("MicroMsg.MMDataBase", "checkVacuumRunnable, before get freelist_count");
        long currentTimeMillis = System.currentTimeMillis();
        long g4 = this.f356749d.mo183814g();
        long j2 = MultiProcessMMKV.getDefault().getLong("extreme_storage_wechat_total", -1);
        int i = j2 != -1 ? (int) ((((float) g4) / ((float) j2)) * 100.0f) : -1;
        if (substring.equals("EnMicroMsg.db")) {
            MultiProcessMMKV.getDefault().encode("report_freelist_daily_EnMicroMsg", g4);
            MultiProcessMMKV.getDefault().encode("report_freelist_daily_ratio_EnMicroMsg", i);
        } else if (substring.equals("WxFileIndex.db")) {
            MultiProcessMMKV.getDefault().encode("report_freelist_daily_WxFileIndex", g4);
            MultiProcessMMKV.getDefault().encode("report_freelist_daily_ratio_WxFileIndex", i);
        } else if (substring.equals("FTS5IndexMicroMsg_encrypt.db")) {
            MultiProcessMMKV.getDefault().encode("report_freelist_daily_FTS", g4);
            MultiProcessMMKV.getDefault().encode("report_freelist_daily_ratio_FTS", i);
        } else if (substring.equals("UnEncryptNewBiz.db")) {
            MultiProcessMMKV.getDefault().encode("report_freelist_daily_NewBiz", g4);
            MultiProcessMMKV.getDefault().encode("report_freelist_daily_ratio_NewBiz", i);
        }
        Log.m105924i("MicroMsg.MMDataBase", "checkVacuumRunnable, after get freelist_count, duration = " + (System.currentTimeMillis() - currentTimeMillis));
        long f = this.f356749d.mo183813f() - g4;
        long f2 = this.f356749d.mo183813f();
        Log.m105924i("MicroMsg.MMDataBase", "report vacuum, db.getPath() = " + this.f356749d.mo183817j() + ", dbFileSize = " + f2);
        Log.m105924i("MicroMsg.MMDataBase", "dbRealDataSize = " + f + ", freeListSize = " + g4);
        boolean z = f < j && g4 > 209715200;
        Log.m105924i("MicroMsg.MMDataBase", "willVacuum = " + z);
        if (z) {
            C119119a aVar = new C119119a(substring);
            boolean z2 = C85803w4.f249907a;
            C85803w4.C30795c cVar = C85803w4.C30795c.FIRST_SCREEN_OFF;
            Log.m105924i("MicroMsg.SilentTask", "executeSqlSilently runnable, name = Vacuum-Task");
            C85803w4.f249908b.add(new C85803w4.C85806b(aVar, "Vacuum-Task", cVar));
        }
    }
}

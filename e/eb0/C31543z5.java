package eb0;

import android.os.SystemClock;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.MultiProcessMMKV;
import f40.C86709a0;
import p573jk.C33586b;

/* renamed from: eb0.z5 */
public final class C31543z5 {

    /* renamed from: a */
    public static volatile boolean f84315a;

    /* renamed from: b */
    public static long f84316b = -1;

    /* renamed from: c */
    public static long f84317c = -1;

    /* renamed from: d */
    public static final Object f84318d = new Object();

    /* renamed from: eb0.z5$a */
    public class C31544a implements C33586b.C33587a {
    }

    static {
        C33586b.f90913a = new C31544a();
    }

    /* renamed from: a */
    public static long m39451a() {
        if (MMApplicationContext.isMainProcess() && C86709a0.m107528h().f251735l) {
            C86709a0.m107528h();
            if (C86709a0.m107523b().mo121114l()) {
                try {
                    return m39453c();
                } catch (Throwable th) {
                    Log.m105920e("MicroMsg.TimeHelper", th.getMessage());
                    return 0;
                }
            }
        }
        Log.m105924i("MicroMsg.TimeHelper", "account error");
        return 0;
    }

    /* renamed from: b */
    public static long m39452b() {
        try {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            long j = MultiProcessMMKV.getMMKV("time").getLong("client_server_elapsed_time_long", elapsedRealtime);
            long j2 = MultiProcessMMKV.getMMKV("time").getLong("client_server_time_long", 0);
            long max = Math.max(0, elapsedRealtime - j);
            Log.m105918d("MicroMsg.TimeHelper", "[getSyncServerTimeMs] lastServerTime:" + j2 + " curElapsedRealTime: " + elapsedRealtime + " SyncServerTime:" + j + " offset:" + max);
            return 0 < j2 ? j2 + max : System.currentTimeMillis();
        } catch (Throwable th) {
            Log.m105921e("MicroMsg.TimeHelper", "getCurrentServerTimeNoMMProcess %s", th.getMessage());
            return System.currentTimeMillis();
        }
    }

    /* renamed from: c */
    public static long m39453c() {
        long max;
        if (!f84315a) {
            return System.currentTimeMillis();
        }
        synchronized (f84318d) {
            max = f84316b + Math.max(0, SystemClock.elapsedRealtime() - f84317c);
        }
        return max;
    }

    /* renamed from: d */
    public static long m39454d() {
        return m39453c();
    }

    /* renamed from: e */
    public static int m39455e() {
        return (int) (m39453c() / 1000);
    }

    /* renamed from: f */
    public static void m39456f(long j) {
        synchronized (f84318d) {
            if (!f84315a) {
                f84316b = j;
            } else {
                f84316b = Math.max(j, m39453c());
            }
            f84317c = SystemClock.elapsedRealtime();
            f84315a = true;
        }
        MultiProcessMMKV.getMMKV("time").edit().putLong("client_server_time_long", f84316b);
        MultiProcessMMKV.getMMKV("time").edit().putLong("client_server_elapsed_time_long", f84317c);
    }
}

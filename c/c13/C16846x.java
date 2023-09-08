package c13;

import com.tencent.p014mm.plugin.trafficmonitor.C19402b;
import com.tencent.p014mm.sdk.platformtools.MAlarmHandler;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: c13.x */
public class C16846x {

    /* renamed from: d */
    public static C16846x f45510d;

    /* renamed from: e */
    public static boolean f45511e;

    /* renamed from: a */
    public final Map<Integer, C16844r> f45512a = new ConcurrentHashMap();

    /* renamed from: b */
    public long f45513b = Long.MIN_VALUE;

    /* renamed from: c */
    public long f45514c = MAlarmHandler.NEXT_FIRE_INTERVAL;

    public C16846x() {
        mo17898a(0, 1, 60000, false);
        if (MMApplicationContext.isMainProcess()) {
            mo17898a(0, 2, 900000, true);
            mo17898a(0, 3, 1800000, true);
        }
    }

    /* renamed from: b */
    public static C16846x m16494b() {
        if (f45510d == null) {
            synchronized (C16846x.class) {
                if (f45510d == null) {
                    f45510d = new C16846x();
                }
            }
        }
        return f45510d;
    }

    /* renamed from: a */
    public void mo17898a(int i, int i2, long j, boolean z) {
        C16844r rVar = new C16844r(new C19402b());
        rVar.f45488b = j;
        rVar.f45489c = i;
        rVar.f45490d = z;
        rVar.f45493g = new x$$a(this, i2);
        this.f45512a.put(Integer.valueOf(i2), rVar);
        long j2 = this.f45513b;
        long j3 = rVar.f45488b;
        if (j2 < j3) {
            this.f45513b = j3;
        }
        if (this.f45514c > j3) {
            this.f45514c = j3;
        }
    }
}

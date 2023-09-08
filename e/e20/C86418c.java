package e20;

import android.app.ActivityManager;
import android.content.Context;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.tinker.loader.hotplug.EnvConsts;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: e20.c */
public class C86418c implements C97586b {

    /* renamed from: a */
    public Context f251200a;

    /* renamed from: b */
    public List<Double> f251201b = new ArrayList(100);

    /* renamed from: c */
    public int f251202c = 0;

    /* renamed from: d */
    public double f251203d = 0.0d;

    /* renamed from: e */
    public double f251204e = 0.0d;

    /* renamed from: f */
    public double f251205f = 2.147483647E9d;

    /* renamed from: g */
    public double f251206g = 0.0d;

    /* renamed from: h */
    public double f251207h = 0.0d;

    public C86418c(Context context) {
        this.f251200a = context;
        ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
        ((ActivityManager) context.getSystemService(EnvConsts.ACTIVITY_MANAGER_SRVNAME)).getMemoryInfo(memoryInfo);
        this.f251203d = (((double) (memoryInfo.totalMem - memoryInfo.availMem)) / 1024.0d) / 1024.0d;
        Log.m105926v("MicroMsg.MemoryRecord", "hy: init mem to " + this.f251203d);
    }

    /* renamed from: a */
    public void mo120827a() {
        Context context;
        List<Double> list = this.f251201b;
        if (list != null && ((ArrayList) list).size() <= 10000 && (context = this.f251200a) != null) {
            ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
            ((ActivityManager) context.getSystemService(EnvConsts.ACTIVITY_MANAGER_SRVNAME)).getMemoryInfo(memoryInfo);
            double d = (((double) (memoryInfo.totalMem - memoryInfo.availMem)) / 1024.0d) / 1024.0d;
            double min = Math.min(d, this.f251203d);
            this.f251203d = min;
            if (min == d) {
                Log.m105926v("MicroMsg.MemoryRecord", "hy: updating min mem to " + this.f251203d);
            }
            ((ArrayList) this.f251201b).add(Double.valueOf(d));
        }
    }

    /* renamed from: b */
    public void mo120828b() {
        int size = ((ArrayList) this.f251201b).size();
        this.f251202c = size;
        if (size == 0) {
            Log.m105928w("MicroMsg.MemoryRecord", "hy: check frames 0!");
            return;
        }
        Double valueOf = Double.valueOf(0.0d);
        Iterator it = ((ArrayList) this.f251201b).iterator();
        while (it.hasNext()) {
            Double d = (Double) it.next();
            valueOf = Double.valueOf(valueOf.doubleValue() + d.doubleValue());
            this.f251204e = Math.max(this.f251204e, d.doubleValue());
            this.f251205f = Math.min(this.f251205f, d.doubleValue());
        }
        Double valueOf2 = Double.valueOf(valueOf.doubleValue() / ((double) this.f251202c));
        double doubleValue = valueOf2.doubleValue();
        double d2 = this.f251203d;
        this.f251207h = doubleValue - d2;
        this.f251204e -= d2;
        this.f251205f -= d2;
        long j = 0;
        Iterator it4 = ((ArrayList) this.f251201b).iterator();
        while (it4.hasNext()) {
            j = (long) (((double) j) + Math.pow(((Double) it4.next()).doubleValue() - valueOf2.doubleValue(), 2.0d));
        }
        this.f251206g = Math.sqrt((double) (j / ((long) this.f251202c)));
    }
}

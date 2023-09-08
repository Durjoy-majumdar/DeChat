package p348ih;

import com.tencent.p014mm.sdk.platformtools.Log;
import java.util.LinkedList;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import p213oh.C11412b;

/* renamed from: ih.k */
public class C21087k {

    /* renamed from: f */
    public static C21087k f59637f;

    /* renamed from: a */
    public Object f59638a = new Object();

    /* renamed from: b */
    public ThreadPoolExecutor f59639b;

    /* renamed from: c */
    public PriorityBlockingQueue<Runnable> f59640c = new PriorityBlockingQueue<>(33);

    /* renamed from: d */
    public LinkedList<C21088l> f59641d = new LinkedList<>();

    /* renamed from: e */
    public int f59642e;

    public C21087k() {
        int availableProcessors = Runtime.getRuntime().availableProcessors();
        Object[] objArr = {Integer.valueOf(availableProcessors)};
        int i = C11412b.f33577a;
        Log.m105925i("MicroMsg.Mix.AudioThreadPool", "getNormalCorePoolSize cpuCount:%d", objArr);
        int i2 = (availableProcessors * 2) + 2;
        if (i2 > 32) {
            i2 = 32;
        } else if (i2 < 8) {
            i2 = 8;
        }
        this.f59642e = i2;
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(i2, 32, 120, TimeUnit.SECONDS, this.f59640c, new C87731j());
        this.f59639b = threadPoolExecutor;
        threadPoolExecutor.setMaximumPoolSize(32);
        Log.m105925i("MicroMsg.Mix.AudioThreadPool", "new AudioThreadPool poolSize:%d", Integer.valueOf(i2));
    }

    /* renamed from: a */
    public static C21087k m23341a() {
        if (f59637f == null) {
            synchronized (C21087k.class) {
                if (f59637f == null) {
                    f59637f = new C21087k();
                }
            }
        }
        return f59637f;
    }

    /* renamed from: b */
    public static void m23342b(C21088l lVar) {
        C21087k a = m23341a();
        synchronized (a.f59638a) {
            lVar.mo32806a();
            a.f59641d.add(lVar);
            int i = a.f59642e;
            if (a.f59641d.size() > i) {
                a.mo32846d(i + 2);
            }
        }
        a.f59639b.execute(lVar);
    }

    /* renamed from: c */
    public static void m23343c(C21088l lVar) {
        C21087k a = m23341a();
        synchronized (a.f59638a) {
            a.f59641d.remove(lVar);
            if (a.f59641d.size() <= 4) {
                a.f59642e = 4;
                a.mo32846d(4);
            }
        }
        a.f59639b.remove(lVar);
    }

    /* renamed from: d */
    public void mo32846d(int i) {
        if (i > 32) {
            this.f59642e = 32;
        } else if (i < 4) {
            this.f59642e = 4;
        } else {
            this.f59642e = i;
        }
        Object[] objArr = {Integer.valueOf(i)};
        int i2 = C11412b.f33577a;
        Log.m105925i("MicroMsg.Mix.AudioThreadPool", "setCorePoolSize poolSize:%d", objArr);
        this.f59639b.setCorePoolSize(i);
    }
}

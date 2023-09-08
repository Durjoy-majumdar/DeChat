package p350jh;

import com.tencent.p014mm.sdk.platformtools.Log;
import java.util.LinkedList;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import p213oh.C11412b;
import p348ih.C21088l;
import p348ih.C87731j;

/* renamed from: jh.e */
public class C21242e {

    /* renamed from: f */
    public static C21242e f60052f;

    /* renamed from: a */
    public Object f60053a = new Object();

    /* renamed from: b */
    public ThreadPoolExecutor f60054b;

    /* renamed from: c */
    public PriorityBlockingQueue<Runnable> f60055c = new PriorityBlockingQueue<>(9);

    /* renamed from: d */
    public LinkedList<C21088l> f60056d = new LinkedList<>();

    /* renamed from: e */
    public int f60057e;

    public C21242e() {
        int availableProcessors = Runtime.getRuntime().availableProcessors();
        Object[] objArr = {Integer.valueOf(availableProcessors)};
        int i = C11412b.f33577a;
        Log.m105925i("MicroMsg.Mix.AudioDownloadThreadPool", "getNormalCorePoolSize cpuCount:%d", objArr);
        int i2 = (availableProcessors * 2) + 2;
        if (i2 > 8) {
            i2 = 8;
        } else if (i2 < 4) {
            i2 = 4;
        }
        this.f60057e = i2;
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(i2, 8, 120, TimeUnit.SECONDS, this.f60055c, new C87731j("AUDIO_DOWNLOAD_THREAD_POOL_GROUP", "audio_download_thread#"));
        this.f60054b = threadPoolExecutor;
        threadPoolExecutor.setMaximumPoolSize(8);
        Log.m105925i("MicroMsg.Mix.AudioDownloadThreadPool", "new AudioThreadPool poolSize:%d", Integer.valueOf(i2));
    }

    /* renamed from: a */
    public void mo33232a(int i) {
        if (i > 8) {
            this.f60057e = 8;
        } else if (i < 4) {
            this.f60057e = 4;
        } else {
            this.f60057e = i;
        }
        Object[] objArr = {Integer.valueOf(i)};
        int i2 = C11412b.f33577a;
        Log.m105925i("MicroMsg.Mix.AudioDownloadThreadPool", "setCorePoolSize poolSize:%d", objArr);
        this.f60054b.setCorePoolSize(i);
    }
}

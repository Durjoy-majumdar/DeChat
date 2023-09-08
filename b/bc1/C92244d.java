package bc1;

import bc1.C92241c;
import com.tencent.p014mm.sdk.platformtools.Log;
import ic0.C108455d;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CountDownLatch;

/* renamed from: bc1.d */
public class C92244d implements C108455d {

    /* renamed from: a */
    public final /* synthetic */ String f264017a;

    /* renamed from: b */
    public final /* synthetic */ String f264018b;

    /* renamed from: c */
    public final /* synthetic */ String f264019c;

    /* renamed from: d */
    public final /* synthetic */ C92241c.C92243b f264020d;

    public C92244d(C92241c.C92243b bVar, String str, String str2, String str3) {
        this.f264020d = bVar;
        this.f264017a = str;
        this.f264018b = str2;
        this.f264019c = str3;
    }

    /* renamed from: a */
    public void mo26263a(boolean z, Object... objArr) {
        Object[] objArr2 = new Object[3];
        CountDownLatch countDownLatch = this.f264020d.f264015f;
        objArr2[0] = countDownLatch == null ? "null" : Long.valueOf(countDownLatch.getCount());
        objArr2[1] = this.f264017a;
        objArr2[2] = Boolean.valueOf(z);
        Log.m105925i("MicroMsg.offline.FavOfflineService", "replaceImagUrl num:%s url:%s, success:%b", objArr2);
        if (z) {
            ConcurrentHashMap<String, String> concurrentHashMap = this.f264020d.f264014e;
            String str = this.f264017a;
            concurrentHashMap.put(str, "./" + this.f264018b + "/" + this.f264019c);
        }
        CountDownLatch countDownLatch2 = this.f264020d.f264015f;
        if (countDownLatch2 != null) {
            countDownLatch2.countDown();
        }
    }
}

package c13;

import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.MultiProcessMMKV;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.TimeUnit;
import zt3.C119157j;
import zt3.C119179t;

/* renamed from: c13.h */
public class C113234h {

    /* renamed from: a */
    public static final Map<String, C28475f> f338832a = new ConcurrentHashMap();

    /* renamed from: b */
    public static final boolean f338833b = MMApplicationContext.isAppBrandProcess();

    /* renamed from: c */
    public static final long f338834c;

    /* renamed from: d */
    public static final Map<String, h$$c> f338835d = new ConcurrentHashMap();

    static {
        TimeUnit timeUnit = TimeUnit.MINUTES;
        f338834c = timeUnit.toMillis(5);
        if (MMApplicationContext.isMainProcess()) {
            MultiProcessMMKV.getDefault().encode("FileTransportStats_accumulateSize", 0);
        }
        C119179t tVar = C119157j.f356862d;
        ((C119157j) tVar).mo183872c(new h$$b(), timeUnit.toMillis(3), timeUnit.toMillis(3));
    }
}

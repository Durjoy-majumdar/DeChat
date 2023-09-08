package do1;

import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandler;
import eb0.C31543z5;
import gy3.C87412m;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: do1.a */
public final class C58329a {

    /* renamed from: a */
    public final String f167009a;

    /* renamed from: b */
    public final MMHandler f167010b;

    /* renamed from: c */
    public AtomicReference<C58331b> f167011c = new AtomicReference<>();

    /* renamed from: do1.a$a */
    public enum C58330a {
        Normal,
        WxForeground
    }

    /* renamed from: do1.a$b */
    public static abstract class C58331b implements Runnable {

        /* renamed from: d */
        public long f167015d;

        /* renamed from: e */
        public long f167016e = C31543z5.m39453c();

        /* renamed from: f */
        public C58330a f167017f = C58330a.Normal;
    }

    public C58329a(String str) {
        C87412m.m108594g(str, "name");
        this.f167009a = "Finder.ExpiredTimer#" + str;
        MMHandler mMHandler = new MMHandler(str);
        mMHandler.setLogging(false);
        this.f167010b = mMHandler;
    }

    /* renamed from: b */
    public static /* synthetic */ void m67539b(C58329a aVar, C58331b bVar, long j, String str, C58330a aVar2, int i, Object obj) {
        if ((i & 8) != 0) {
            aVar2 = C58330a.Normal;
        }
        aVar.mo83079a(bVar, j, str, aVar2);
    }

    /* renamed from: a */
    public final void mo83079a(C58331b bVar, long j, String str, C58330a aVar) {
        C87412m.m108594g(bVar, "runnable");
        C87412m.m108594g(str, "tag");
        C87412m.m108594g(aVar, "triggerSource");
        long max = Math.max(0, j);
        this.f167010b.removeCallbacksAndMessages((Object) null);
        bVar.f167015d = max;
        bVar.f167016e = C31543z5.m39453c();
        bVar.f167017f = aVar;
        this.f167010b.postDelayed(bVar, max);
        String str2 = this.f167009a;
        Log.m105924i(str2, "[postDelayed] delay=" + bVar.f167015d + "ms triggerSource=" + aVar + ", hash=" + bVar.hashCode() + " tag=" + str);
    }

    /* renamed from: c */
    public final C58331b mo83080c(String str) {
        C87412m.m108594g(str, "tag");
        this.f167011c.set((Object) null);
        this.f167010b.removeCallbacksAndMessages((Object) null);
        String str2 = this.f167009a;
        Log.m105924i(str2, "[stop] tag=" + str + ", null");
        return null;
    }
}

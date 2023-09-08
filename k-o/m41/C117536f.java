package m41;

import android.os.Looper;
import com.tencent.p014mm.sdk.platformtools.MMHandler;
import java.util.ArrayList;
import java.util.List;

/* renamed from: m41.f */
public class C117536f {

    /* renamed from: a */
    public static final MMHandler f351647a = new MMHandler(Looper.getMainLooper());

    /* renamed from: b */
    public static final MMHandler f351648b = new MMHandler("DataReportService#ThreadUtils#ASYNC_HANDLER", (MMHandler.Callback) new C117537a());

    /* renamed from: c */
    public static List<MMHandler.Callback> f351649c = new ArrayList();

    /* renamed from: m41.f$a */
    public class C117537a implements MMHandler.Callback {
        /* JADX WARNING: Removed duplicated region for block: B:1:0x0009 A[LOOP:0: B:1:0x0009->B:4:0x0019, LOOP_START, PHI: r1 
          PHI: (r1v1 boolean) = (r1v0 boolean), (r1v5 boolean) binds: [B:0:0x0000, B:4:0x0019] A[DONT_GENERATE, DONT_INLINE]] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean handleMessage(android.os.Message r4) {
            /*
                r3 = this;
                java.util.List<com.tencent.mm.sdk.platformtools.MMHandler$Callback> r0 = m41.C117536f.f351649c
                java.util.ArrayList r0 = (java.util.ArrayList) r0
                java.util.Iterator r0 = r0.iterator()
                r1 = 0
            L_0x0009:
                boolean r2 = r0.hasNext()
                if (r2 == 0) goto L_0x001b
                java.lang.Object r1 = r0.next()
                com.tencent.mm.sdk.platformtools.MMHandler$Callback r1 = (com.tencent.p014mm.sdk.platformtools.MMHandler.Callback) r1
                boolean r1 = r1.handleMessage(r4)
                if (r1 == 0) goto L_0x0009
            L_0x001b:
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: m41.C117536f.C117537a.handleMessage(android.os.Message):boolean");
        }
    }

    /* renamed from: a */
    public static void m165799a(Runnable runnable) {
        if (runnable != null) {
            if (Looper.myLooper() == Looper.getMainLooper()) {
                runnable.run();
            } else {
                m165801c(runnable);
            }
        }
    }

    /* renamed from: b */
    public static void m165800b(Runnable runnable) {
        if (runnable != null) {
            f351648b.post(runnable);
        }
    }

    /* renamed from: c */
    public static void m165801c(Runnable runnable) {
        if (runnable != null) {
            f351647a.post(runnable);
        }
    }

    /* renamed from: d */
    public static void m165802d(Runnable runnable, long j) {
        if (runnable != null) {
            f351647a.postDelayed(runnable, j);
        }
    }

    /* renamed from: e */
    public static MMHandler m165803e(MMHandler.Callback callback) {
        if (callback != null && !((ArrayList) f351649c).contains(callback)) {
            ((ArrayList) f351649c).add(callback);
        }
        return f351648b;
    }
}

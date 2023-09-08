package p392w5;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;

/* renamed from: w5.e */
public class C26421e {

    /* renamed from: a */
    public int f73687a;

    /* renamed from: b */
    public int f73688b;

    /* renamed from: c */
    public int f73689c = 255;

    /* renamed from: d */
    public int f73690d;

    /* renamed from: e */
    public HandlerThread f73691e;

    /* renamed from: f */
    public Handler f73692f;

    /* renamed from: g */
    public C26423b f73693g;

    /* renamed from: w5.e$a */
    public class C26422a extends Handler {
        public C26422a(Looper looper) {
            super(looper);
        }

        /* JADX WARNING: Code restructure failed: missing block: B:23:?, code lost:
            return;
         */
        /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void handleMessage(android.os.Message r6) {
            /*
                r5 = this;
                int r6 = r6.what     // Catch:{ all -> 0x0046 }
                r0 = 102(0x66, float:1.43E-43)
                r1 = 101(0x65, float:1.42E-43)
                if (r6 == r1) goto L_0x001e
                if (r6 == r0) goto L_0x000b
                goto L_0x0046
            L_0x000b:
                w5.e r6 = p392w5.C26421e.this     // Catch:{ all -> 0x0046 }
                int r0 = r6.f73688b     // Catch:{ all -> 0x0046 }
                int r0 = r0 + -1
                r6.f73688b = r0     // Catch:{ all -> 0x0046 }
                if (r0 <= 0) goto L_0x0046
                android.os.Handler r0 = r6.f73692f     // Catch:{ all -> 0x0046 }
                int r6 = r6.f73687a     // Catch:{ all -> 0x0046 }
                long r2 = (long) r6     // Catch:{ all -> 0x0046 }
                r0.sendEmptyMessageDelayed(r1, r2)     // Catch:{ all -> 0x0046 }
                goto L_0x0046
            L_0x001e:
                w5.e r6 = p392w5.C26421e.this     // Catch:{ all -> 0x0046 }
                w5.e$b r6 = r6.f73693g     // Catch:{ all -> 0x0046 }
                a6.b$a r6 = (p288a6.C23611b.C23612a) r6     // Catch:{ all -> 0x0046 }
                a6.b r1 = p288a6.C23611b.this     // Catch:{ all -> 0x0046 }
                java.lang.String r2 = r6.f67768a     // Catch:{ all -> 0x0046 }
                w5.e r3 = r1.f67767i     // Catch:{ all -> 0x0046 }
                if (r3 == 0) goto L_0x0034
                monitor-enter(r3)     // Catch:{ all -> 0x0046 }
                int r4 = r3.f73689c     // Catch:{ all -> 0x0031 }
                monitor-exit(r3)     // Catch:{ all -> 0x0046 }
                goto L_0x0036
            L_0x0031:
                r6 = move-exception
                monitor-exit(r3)     // Catch:{ all -> 0x0046 }
                throw r6     // Catch:{ all -> 0x0046 }
            L_0x0034:
                int r4 = r6.f67769b     // Catch:{ all -> 0x0046 }
            L_0x0036:
                int r6 = r6.f67770c     // Catch:{ all -> 0x0046 }
                r3 = 0
                r1.mo37106e(r2, r4, r6, r3)     // Catch:{ all -> 0x0046 }
                w5.e r6 = p392w5.C26421e.this     // Catch:{ all -> 0x0046 }
                android.os.Handler r1 = r6.f73692f     // Catch:{ all -> 0x0046 }
                int r6 = r6.f73690d     // Catch:{ all -> 0x0046 }
                long r2 = (long) r6     // Catch:{ all -> 0x0046 }
                r1.sendEmptyMessageDelayed(r0, r2)     // Catch:{ all -> 0x0046 }
            L_0x0046:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p392w5.C26421e.C26422a.handleMessage(android.os.Message):void");
        }
    }

    /* renamed from: w5.e$b */
    public static abstract class C26423b {
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0032, code lost:
        return;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized void mo53416a(int r2, int r3, int r4, p392w5.C26421e.C26423b r5) {
        /*
            r1 = this;
            monitor-enter(r1)
            r0 = 1
            if (r2 < r0) goto L_0x0031
            if (r4 < 0) goto L_0x0031
            if (r5 != 0) goto L_0x0009
            goto L_0x0031
        L_0x0009:
            r1.f73688b = r2     // Catch:{ all -> 0x002f }
            r1.f73687a = r3     // Catch:{ all -> 0x002f }
            r1.f73690d = r4     // Catch:{ all -> 0x002f }
            r1.f73693g = r5     // Catch:{ all -> 0x002f }
            android.os.HandlerThread r2 = new android.os.HandlerThread     // Catch:{ all -> 0x002f }
            java.lang.String r3 = "RepeatExecutor"
            r2.<init>(r3)     // Catch:{ all -> 0x002f }
            r1.f73691e = r2     // Catch:{ all -> 0x002f }
            r2.start()     // Catch:{ all -> 0x002f }
            w5.e$a r2 = new w5.e$a     // Catch:{ all -> 0x002f }
            android.os.HandlerThread r3 = r1.f73691e     // Catch:{ all -> 0x002f }
            android.os.Looper r3 = r3.getLooper()     // Catch:{ all -> 0x002f }
            r2.<init>(r3)     // Catch:{ all -> 0x002f }
            r1.f73692f = r2     // Catch:{ all -> 0x002f }
            r3 = 101(0x65, float:1.42E-43)
            r2.sendEmptyMessage(r3)     // Catch:{ all -> 0x002f }
        L_0x002f:
            monitor-exit(r1)
            return
        L_0x0031:
            monitor-exit(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p392w5.C26421e.mo53416a(int, int, int, w5.e$b):void");
    }
}

package p1174c5;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;

/* renamed from: c5.b */
public final class C113242b {

    /* renamed from: c */
    public static final C113242b f338842c = new C113242b();

    /* renamed from: a */
    public final ExecutorService f338843a;

    /* renamed from: b */
    public final Executor f338844b;

    /* renamed from: c5.b$b */
    public static class C113244b implements Executor {

        /* renamed from: d */
        public ThreadLocal<Integer> f338845d = new ThreadLocal<>();

        public C113244b(C113243a aVar) {
        }

        /* renamed from: a */
        public final int mo165788a() {
            Integer num = this.f338845d.get();
            if (num == null) {
                num = 0;
            }
            int intValue = num.intValue() - 1;
            if (intValue == 0) {
                this.f338845d.remove();
            } else {
                this.f338845d.set(Integer.valueOf(intValue));
            }
            return intValue;
        }

        public void execute(Runnable runnable) {
            Integer num = this.f338845d.get();
            if (num == null) {
                num = 0;
            }
            int intValue = num.intValue() + 1;
            this.f338845d.set(Integer.valueOf(intValue));
            if (intValue <= 15) {
                try {
                    runnable.run();
                } finally {
                    mo165788a();
                }
            } else {
                C113242b.f338842c.f338843a.execute(runnable);
            }
        }
    }

    /* JADX WARNING: type inference failed for: r0v7, types: [java.util.concurrent.ExecutorService] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C113242b() {
        /*
            r8 = this;
            r8.<init>()
            java.lang.String r0 = "java.runtime.name"
            java.lang.String r0 = java.lang.System.getProperty(r0)
            if (r0 != 0) goto L_0x000d
            r0 = 0
            goto L_0x0019
        L_0x000d:
            java.util.Locale r1 = java.util.Locale.US
            java.lang.String r0 = r0.toLowerCase(r1)
            java.lang.String r1 = "android"
            boolean r0 = r0.contains(r1)
        L_0x0019:
            if (r0 != 0) goto L_0x0020
            java.util.concurrent.ExecutorService r0 = java.util.concurrent.Executors.newCachedThreadPool()
            goto L_0x0039
        L_0x0020:
            c5.a r0 = p1174c5.C113239a.f338838b
            java.util.concurrent.ThreadPoolExecutor r0 = new java.util.concurrent.ThreadPoolExecutor
            int r2 = p1174c5.C113239a.f338839c
            int r3 = p1174c5.C113239a.f338840d
            java.util.concurrent.TimeUnit r6 = java.util.concurrent.TimeUnit.SECONDS
            java.util.concurrent.LinkedBlockingQueue r7 = new java.util.concurrent.LinkedBlockingQueue
            r7.<init>()
            r4 = 1
            r1 = r0
            r1.<init>(r2, r3, r4, r6, r7)
            r1 = 1
            r0.allowCoreThreadTimeOut(r1)
        L_0x0039:
            r8.f338843a = r0
            java.util.concurrent.Executors.newSingleThreadScheduledExecutor()
            c5.b$b r0 = new c5.b$b
            r1 = 0
            r0.<init>(r1)
            r8.f338844b = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p1174c5.C113242b.<init>():void");
    }
}

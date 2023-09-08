package com.tencent.p014mm.ipcinvoker;

import com.tencent.p014mm.ipcinvoker.C80922v;
import java.util.concurrent.ThreadFactory;
import v20.C90741c;

/* renamed from: com.tencent.mm.ipcinvoker.s */
public class C80917s implements ThreadFactory {

    /* renamed from: d */
    public int f237767d = 0;

    /* renamed from: e */
    public final /* synthetic */ C80922v.C80923a f237768e;

    /* renamed from: com.tencent.mm.ipcinvoker.s$a */
    public class C80918a implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ Runnable f237769d;

        public C80918a(Runnable runnable) {
            this.f237769d = runnable;
        }

        /* JADX WARNING: Removed duplicated region for block: B:20:0x0047  */
        /* JADX WARNING: Removed duplicated region for block: B:21:0x0060  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void run() {
            /*
                r7 = this;
                u20.a r0 = new u20.a
                java.lang.Class<android.os.Looper> r1 = android.os.Looper.class
                java.lang.String r2 = "sThreadLocal"
                r0.<init>(r1, r2)
                monitor-enter(r0)
                r1 = 1
                r2 = 0
                java.lang.Object r3 = r0.mo124752a(r1)     // Catch:{ NoSuchFieldException -> 0x002e, IllegalAccessException -> 0x0021, IllegalArgumentException -> 0x0014 }
                goto L_0x003b
            L_0x0012:
                r1 = move-exception
                goto L_0x0073
            L_0x0014:
                r3 = move-exception
                java.lang.String r4 = "SDK.ReflectStaticFieldSmith"
                java.lang.String r5 = "getWithoutThrow, exception occur :%s"
                java.lang.Object[] r6 = new java.lang.Object[r1]     // Catch:{ all -> 0x0012 }
                r6[r2] = r3     // Catch:{ all -> 0x0012 }
                v20.C90741c.m113809b(r4, r5, r6)     // Catch:{ all -> 0x0012 }
                goto L_0x003a
            L_0x0021:
                r3 = move-exception
                java.lang.String r4 = "SDK.ReflectStaticFieldSmith"
                java.lang.String r5 = "getWithoutThrow, exception occur :%s"
                java.lang.Object[] r6 = new java.lang.Object[r1]     // Catch:{ all -> 0x0012 }
                r6[r2] = r3     // Catch:{ all -> 0x0012 }
                v20.C90741c.m113809b(r4, r5, r6)     // Catch:{ all -> 0x0012 }
                goto L_0x003a
            L_0x002e:
                r3 = move-exception
                java.lang.String r4 = "SDK.ReflectStaticFieldSmith"
                java.lang.String r5 = "getWithoutThrow, exception occur :%s"
                java.lang.Object[] r6 = new java.lang.Object[r1]     // Catch:{ all -> 0x0012 }
                r6[r2] = r3     // Catch:{ all -> 0x0012 }
                v20.C90741c.m113809b(r4, r5, r6)     // Catch:{ all -> 0x0012 }
            L_0x003a:
                r3 = 0
            L_0x003b:
                monitor-exit(r0)
                java.lang.ThreadLocal r3 = (java.lang.ThreadLocal) r3
                r0 = 3
                if (r3 == 0) goto L_0x0060
                java.lang.Object r4 = r3.get()
                if (r4 != 0) goto L_0x0060
                java.lang.String r1 = "IPC.ExecutorServiceCreatorImpl"
                java.lang.String r4 = "create a new Looper ThreadLocal variable."
                java.lang.Object[] r2 = new java.lang.Object[r2]
                w20.a r5 = v20.C90741c.f260625a
                r5.mo997a(r0, r1, r4, r2)
                com.tencent.mm.ipcinvoker.s r0 = com.tencent.p014mm.ipcinvoker.C80917s.this
                com.tencent.mm.ipcinvoker.v$a r0 = r0.f237768e
                android.os.HandlerThread r0 = r0.f237776a
                android.os.Looper r0 = r0.getLooper()
                r3.set(r0)
                goto L_0x006d
            L_0x0060:
                java.lang.String r4 = "IPC.ExecutorServiceCreatorImpl"
                java.lang.String r5 = "ThreadLocal Looper variable is null or has set.(%s)"
                java.lang.Object[] r1 = new java.lang.Object[r1]
                r1[r2] = r3
                w20.a r2 = v20.C90741c.f260625a
                r2.mo997a(r0, r4, r5, r1)
            L_0x006d:
                java.lang.Runnable r0 = r7.f237769d
                r0.run()
                return
            L_0x0073:
                monitor-exit(r0)
                throw r1
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.ipcinvoker.C80917s.C80918a.run():void");
        }
    }

    public C80917s(C80922v.C80923a aVar) {
        this.f237768e = aVar;
    }

    public Thread newThread(Runnable runnable) {
        StringBuilder sb = new StringBuilder();
        sb.append("IPCThreadPool#Thread-");
        int i = this.f237767d;
        this.f237767d = i + 1;
        sb.append(i);
        String sb4 = sb.toString();
        Thread thread = new Thread(new C80918a(runnable), sb4);
        C90741c.m113809b("IPC.ExecutorServiceCreatorImpl", "newThread(thread : %s)", sb4);
        return thread;
    }
}

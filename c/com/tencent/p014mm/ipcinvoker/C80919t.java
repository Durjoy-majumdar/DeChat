package com.tencent.p014mm.ipcinvoker;

import com.tencent.p014mm.ipcinvoker.C80922v;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.ThreadFactory;

/* renamed from: com.tencent.mm.ipcinvoker.t */
public class C80919t extends ScheduledThreadPoolExecutor {

    /* renamed from: com.tencent.mm.ipcinvoker.t$a */
    public class C80920a implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ Runnable f237771d;

        public C80920a(C80919t tVar, Runnable runnable) {
            this.f237771d = runnable;
        }

        public void run() {
            try {
                C80922v vVar = C80922v.f237772b;
                this.f237771d.run();
            } catch (Throwable th) {
                C80922v vVar2 = C80922v.f237772b;
                throw th;
            }
        }
    }

    public C80919t(C80922v.C80923a aVar, int i, ThreadFactory threadFactory) {
        super(i, threadFactory);
    }

    public void execute(Runnable runnable) {
        super.execute(new C80920a(this, runnable));
    }
}

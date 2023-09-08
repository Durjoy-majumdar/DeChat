package p1222y4;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import p1014o4.C117693m;

/* renamed from: y4.r */
public class C118936r {

    /* renamed from: e */
    public static final String f356238e = C117693m.m165967e("WorkTimer");

    /* renamed from: a */
    public final ScheduledExecutorService f356239a;

    /* renamed from: b */
    public final Map<String, C118939c> f356240b = new HashMap();

    /* renamed from: c */
    public final Map<String, C118938b> f356241c = new HashMap();

    /* renamed from: d */
    public final Object f356242d = new Object();

    /* renamed from: y4.r$a */
    public class C118937a implements ThreadFactory {

        /* renamed from: d */
        public int f356243d = 0;

        public C118937a(C118936r rVar) {
        }

        public Thread newThread(Runnable runnable) {
            Thread newThread = Executors.defaultThreadFactory().newThread(runnable);
            newThread.setName("WorkManager-WorkTimer-thread-" + this.f356243d);
            this.f356243d = this.f356243d + 1;
            return newThread;
        }
    }

    /* renamed from: y4.r$b */
    public interface C118938b {
        /* renamed from: a */
        void mo165546a(String str);
    }

    /* renamed from: y4.r$c */
    public static class C118939c implements Runnable {

        /* renamed from: d */
        public final C118936r f356244d;

        /* renamed from: e */
        public final String f356245e;

        public C118939c(C118936r rVar, String str) {
            this.f356244d = rVar;
            this.f356245e = str;
        }

        public void run() {
            synchronized (this.f356244d.f356242d) {
                if (((C118939c) ((HashMap) this.f356244d.f356240b).remove(this.f356245e)) != null) {
                    C118938b bVar = (C118938b) ((HashMap) this.f356244d.f356241c).remove(this.f356245e);
                    if (bVar != null) {
                        bVar.mo165546a(this.f356245e);
                    }
                } else {
                    C117693m.m165966c().mo182389a("WrkTimerRunnable", String.format("Timer with %s is already marked as complete.", new Object[]{this.f356245e}), new Throwable[0]);
                }
            }
        }
    }

    public C118936r() {
        C118937a aVar = new C118937a(this);
        this.f356239a = Executors.newSingleThreadScheduledExecutor(aVar);
    }

    /* renamed from: a */
    public void mo183613a(String str, long j, C118938b bVar) {
        synchronized (this.f356242d) {
            C117693m.m165966c().mo182389a(f356238e, String.format("Starting timer for %s", new Object[]{str}), new Throwable[0]);
            mo183614b(str);
            C118939c cVar = new C118939c(this, str);
            ((HashMap) this.f356240b).put(str, cVar);
            ((HashMap) this.f356241c).put(str, bVar);
            this.f356239a.schedule(cVar, j, TimeUnit.MILLISECONDS);
        }
    }

    /* renamed from: b */
    public void mo183614b(String str) {
        synchronized (this.f356242d) {
            if (((C118939c) ((HashMap) this.f356240b).remove(str)) != null) {
                C117693m.m165966c().mo182389a(f356238e, String.format("Stopping timer for %s", new Object[]{str}), new Throwable[0]);
                ((HashMap) this.f356241c).remove(str);
            }
        }
    }
}

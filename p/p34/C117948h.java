package p34;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import l34.C117456i;
import l34.C117459k;
import m34.C117527b;
import n34.C117603a;
import n34.C117605d;
import q34.C118156f;
import q34.C118160h;
import t34.C118372j;
import t34.C118375m;
import v34.C118649d;

/* renamed from: p34.h */
public class C117948h extends C117456i.C117457a {

    /* renamed from: f */
    public static final boolean f352525f;

    /* renamed from: g */
    public static final int f352526g = Integer.getInteger("rx.scheduler.jdk6.purge-frequency-millis", 1000).intValue();

    /* renamed from: h */
    public static final ConcurrentHashMap<ScheduledThreadPoolExecutor, ScheduledThreadPoolExecutor> f352527h = new ConcurrentHashMap<>();

    /* renamed from: i */
    public static final AtomicReference<ScheduledExecutorService> f352528i = new AtomicReference<>();

    /* renamed from: j */
    public static volatile Object f352529j;

    /* renamed from: n */
    public static final Object f352530n = new Object();

    /* renamed from: d */
    public final ScheduledExecutorService f352531d;

    /* renamed from: e */
    public volatile boolean f352532e;

    /* renamed from: p34.h$a */
    public static class C117949a implements Runnable {
        public void run() {
            try {
                Iterator<ScheduledThreadPoolExecutor> it = C117948h.f352527h.keySet().iterator();
                while (it.hasNext()) {
                    ScheduledThreadPoolExecutor next = it.next();
                    if (!next.isShutdown()) {
                        next.purge();
                    } else {
                        it.remove();
                    }
                }
            } catch (Throwable th) {
                C117527b.m165774b(th);
                C118375m.m166985a(th);
            }
        }
    }

    static {
        boolean z = Boolean.getBoolean("rx.scheduler.jdk6.purge-force");
        int i = C118156f.f353184a;
        f352525f = !z && (i == 0 || i >= 21);
    }

    public C117948h(ThreadFactory threadFactory) {
        ScheduledExecutorService newScheduledThreadPool = Executors.newScheduledThreadPool(1, threadFactory);
        if (!m166333i(newScheduledThreadPool) && (newScheduledThreadPool instanceof ScheduledThreadPoolExecutor)) {
            m166332g((ScheduledThreadPoolExecutor) newScheduledThreadPool);
        }
        this.f352531d = newScheduledThreadPool;
    }

    /* renamed from: f */
    public static Method m166331f(ScheduledExecutorService scheduledExecutorService) {
        for (Method method : scheduledExecutorService.getClass().getMethods()) {
            if (method.getName().equals("setRemoveOnCancelPolicy")) {
                Class[] parameterTypes = method.getParameterTypes();
                if (parameterTypes.length == 1 && parameterTypes[0] == Boolean.TYPE) {
                    return method;
                }
            }
        }
        return null;
    }

    /* renamed from: g */
    public static void m166332g(ScheduledThreadPoolExecutor scheduledThreadPoolExecutor) {
        while (true) {
            AtomicReference<ScheduledExecutorService> atomicReference = f352528i;
            if (atomicReference.get() != null) {
                break;
            }
            boolean z = true;
            ScheduledExecutorService newScheduledThreadPool = Executors.newScheduledThreadPool(1, new C118160h("RxSchedulerPurge-"));
            while (true) {
                if (!atomicReference.compareAndSet((Object) null, newScheduledThreadPool)) {
                    if (atomicReference.get() != null) {
                        z = false;
                        break;
                    }
                } else {
                    break;
                }
            }
            if (z) {
                C117949a aVar = new C117949a();
                int i = f352526g;
                newScheduledThreadPool.scheduleAtFixedRate(aVar, (long) i, (long) i, TimeUnit.MILLISECONDS);
                break;
            }
            newScheduledThreadPool.shutdownNow();
        }
        f352527h.putIfAbsent(scheduledThreadPoolExecutor, scheduledThreadPoolExecutor);
    }

    /* renamed from: i */
    public static boolean m166333i(ScheduledExecutorService scheduledExecutorService) {
        Method method;
        if (f352525f) {
            if (scheduledExecutorService instanceof ScheduledThreadPoolExecutor) {
                Object obj = f352529j;
                Object obj2 = f352530n;
                if (obj == obj2) {
                    return false;
                }
                if (obj == null) {
                    method = m166331f(scheduledExecutorService);
                    if (method != null) {
                        obj2 = method;
                    }
                    f352529j = obj2;
                } else {
                    method = (Method) obj;
                }
            } else {
                method = m166331f(scheduledExecutorService);
            }
            if (method != null) {
                try {
                    method.invoke(scheduledExecutorService, new Object[]{Boolean.TRUE});
                    return true;
                } catch (InvocationTargetException e) {
                    C118375m.m166985a(e);
                } catch (IllegalAccessException e2) {
                    C118375m.m166985a(e2);
                } catch (IllegalArgumentException e3) {
                    C118375m.m166985a(e3);
                }
            }
        }
        return false;
    }

    /* renamed from: b */
    public C117459k mo182162b(C117603a aVar) {
        return mo182163e(aVar, 0, (TimeUnit) null);
    }

    /* renamed from: c */
    public boolean mo182164c() {
        return this.f352532e;
    }

    /* renamed from: d */
    public void mo182165d() {
        this.f352532e = true;
        this.f352531d.shutdownNow();
        f352527h.remove(this.f352531d);
    }

    /* renamed from: e */
    public C117459k mo182163e(C117603a aVar, long j, TimeUnit timeUnit) {
        return this.f352532e ? C118649d.f355040a : mo182714h(aVar, j, timeUnit);
    }

    /* renamed from: h */
    public C117950i mo182714h(C117603a aVar, long j, TimeUnit timeUnit) {
        C117605d<C117603a, C117603a> dVar = C118375m.f353775g;
        if (dVar != null) {
            aVar = (C117603a) ((C118372j) dVar).call(aVar);
        }
        C117950i iVar = new C117950i(aVar);
        iVar.mo182716a(j <= 0 ? this.f352531d.submit(iVar) : this.f352531d.schedule(iVar, j, timeUnit));
        return iVar;
    }
}

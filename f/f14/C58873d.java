package f14;

import java.lang.reflect.Method;
import java.util.concurrent.ScheduledThreadPoolExecutor;

/* renamed from: f14.d */
public final class C58873d {

    /* renamed from: a */
    public static final Method f168511a;

    static {
        Method method;
        Class<ScheduledThreadPoolExecutor> cls = ScheduledThreadPoolExecutor.class;
        try {
            method = cls.getMethod("setRemoveOnCancelPolicy", new Class[]{Boolean.TYPE});
        } catch (Throwable unused) {
            method = null;
        }
        f168511a = method;
    }
}

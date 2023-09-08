package cu3;

import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;
import lu3.C109426i;
import lu3.C117479j;
import mu3.C117577e;

/* renamed from: cu3.a */
public class C116540a {
    /* renamed from: a */
    public static C117479j<?> m164347a(Runnable runnable, long j, String str) {
        if (str == null || str.isEmpty()) {
            return new C117479j<>(runnable, m164350d(j, TimeUnit.MILLISECONDS), m164349c(runnable));
        }
        return new C117577e(runnable, m164350d(j, TimeUnit.MILLISECONDS), str, m164349c(runnable));
    }

    /* renamed from: b */
    public static <E> C117479j<E> m164348b(Callable<E> callable, long j, String str) {
        if (str == null || str.isEmpty()) {
            return new C117479j<>(callable, m164350d(j, TimeUnit.MILLISECONDS), m164349c(callable));
        }
        return new C117577e(callable, m164350d(j, TimeUnit.MILLISECONDS), str, m164349c(callable));
    }

    /* renamed from: c */
    public static boolean m164349c(Object obj) {
        if (obj instanceof C109426i) {
            return ((C109426i) obj).isLogging();
        }
        return true;
    }

    /* renamed from: d */
    public static long m164350d(long j, TimeUnit timeUnit) {
        if (timeUnit == null) {
            return System.nanoTime();
        }
        if (j < 0) {
            j = 0;
        }
        long nanos = timeUnit.toNanos(j);
        long nanoTime = System.nanoTime();
        if (nanos >= 4611686018427387903L) {
            nanos = 4611686018427387903L;
        }
        return nanoTime + nanos;
    }
}

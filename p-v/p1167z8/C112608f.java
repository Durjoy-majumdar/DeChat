package p1167z8;

import java.util.concurrent.Executor;
import java.util.concurrent.Future;

/* renamed from: z8.f */
public interface C112608f<V> extends Future<V> {
    void addListener(Runnable runnable, Executor executor);
}

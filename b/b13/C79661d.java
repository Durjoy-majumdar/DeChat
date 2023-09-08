package b13;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* renamed from: b13.d */
public final class C79661d extends ThreadPoolExecutor {
    public C79661d() {
        super(10, 20, 3000, TimeUnit.MILLISECONDS, new ArrayBlockingQueue(200), new ThreadPoolExecutor.CallerRunsPolicy());
    }
}

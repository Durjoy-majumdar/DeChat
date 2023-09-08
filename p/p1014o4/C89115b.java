package p1014o4;

import androidx.work.C113038a;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: o4.b */
public class C89115b implements ThreadFactory {

    /* renamed from: d */
    public final AtomicInteger f256767d = new AtomicInteger(0);

    /* renamed from: e */
    public final /* synthetic */ boolean f256768e;

    public C89115b(C113038a aVar, boolean z) {
        this.f256768e = z;
    }

    public Thread newThread(Runnable runnable) {
        String str = this.f256768e ? "WM.task-" : "androidx.work-";
        return new Thread(runnable, str + this.f256767d.incrementAndGet());
    }
}

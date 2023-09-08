package androidx.window.java.layout;

import a14.C53895h;
import a14.C53930o0;
import a14.C53934p0;
import a14.C53943r1;
import a14.C53973z1;
import android.app.Activity;
import androidx.window.layout.WindowInfoTracker;
import androidx.window.layout.WindowLayoutInfo;
import com.tencent.tinker.loader.hotplug.EnvConsts;
import d14.C45252f;
import gy3.C87412m;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.Metadata;
import p329d3.C86165a;
import rx3.C13598b0;
import wx3.C15601d;
import wx3.C66212f;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0012\u001a\u00020\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ2\u0010\n\u001a\u00020\t\"\u0004\b\u0000\u0010\u00022\u0006\u0010\u0004\u001a\u00020\u00032\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u00052\f\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007H\u0002J\u0014\u0010\u000b\u001a\u00020\t2\n\u0010\u0006\u001a\u0006\u0012\u0002\b\u00030\u0005H\u0002J\u0017\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00072\u0006\u0010\r\u001a\u00020\fH\u0001J$\u0010\u0010\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u0004\u001a\u00020\u00032\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0005J\u0014\u0010\u0011\u001a\u00020\t2\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0005R\u0014\u0010\u0012\u001a\u00020\u00018\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R$\u0010\u0019\u001a\u0012\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0005\u0012\u0004\u0012\u00020\u00180\u00178\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001a¨\u0006\u001d"}, mo182094d2 = {"Landroidx/window/java/layout/WindowInfoTrackerCallbackAdapter;", "Landroidx/window/layout/WindowInfoTracker;", "T", "Ljava/util/concurrent/Executor;", "executor", "Ld3/a;", "consumer", "Ld14/f;", "flow", "Lrx3/b0;", "addListener", "removeListener", "Landroid/app/Activity;", "activity", "Landroidx/window/layout/WindowLayoutInfo;", "windowLayoutInfo", "addWindowLayoutInfoListener", "removeWindowLayoutInfoListener", "tracker", "Landroidx/window/layout/WindowInfoTracker;", "Ljava/util/concurrent/locks/ReentrantLock;", "lock", "Ljava/util/concurrent/locks/ReentrantLock;", "", "La14/z1;", "consumerToJobMap", "Ljava/util/Map;", "<init>", "(Landroidx/window/layout/WindowInfoTracker;)V", "window-java_release"}, mo182095k = 1, mo182096mv = {1, 5, 1})
public final class WindowInfoTrackerCallbackAdapter implements WindowInfoTracker {
    private final Map<C86165a<?>, C53973z1> consumerToJobMap = new LinkedHashMap();
    private final ReentrantLock lock = new ReentrantLock();
    private final WindowInfoTracker tracker;

    public WindowInfoTrackerCallbackAdapter(WindowInfoTracker windowInfoTracker) {
        C87412m.m108594g(windowInfoTracker, "tracker");
        this.tracker = windowInfoTracker;
    }

    private final <T> void addListener(Executor executor, C86165a<T> aVar, C45252f<? extends T> fVar) {
        ReentrantLock reentrantLock = this.lock;
        reentrantLock.lock();
        try {
            if (this.consumerToJobMap.get(aVar) == null) {
                this.consumerToJobMap.put(aVar, C53895h.m60466d(C53930o0.m60554a(C53943r1.m60574a(executor)), (C66212f) null, (C53934p0) null, new WindowInfoTrackerCallbackAdapter$addListener$1$1(fVar, aVar, (C15601d<? super WindowInfoTrackerCallbackAdapter$addListener$1$1>) null), 3, (Object) null));
            }
            C13598b0 b0Var = C13598b0.f38549a;
        } finally {
            reentrantLock.unlock();
        }
    }

    private final void removeListener(C86165a<?> aVar) {
        ReentrantLock reentrantLock = this.lock;
        reentrantLock.lock();
        try {
            C53973z1 z1Var = this.consumerToJobMap.get(aVar);
            if (z1Var != null) {
                C53973z1.C53974a.m60623a(z1Var, (CancellationException) null, 1, (Object) null);
            }
            C53973z1 remove = this.consumerToJobMap.remove(aVar);
        } finally {
            reentrantLock.unlock();
        }
    }

    public final void addWindowLayoutInfoListener(Activity activity, Executor executor, C86165a<WindowLayoutInfo> aVar) {
        C87412m.m108594g(activity, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
        C87412m.m108594g(executor, "executor");
        C87412m.m108594g(aVar, "consumer");
        addListener(executor, aVar, this.tracker.windowLayoutInfo(activity));
    }

    public final void removeWindowLayoutInfoListener(C86165a<WindowLayoutInfo> aVar) {
        C87412m.m108594g(aVar, "consumer");
        removeListener(aVar);
    }

    public C45252f<WindowLayoutInfo> windowLayoutInfo(Activity activity) {
        C87412m.m108594g(activity, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
        return this.tracker.windowLayoutInfo(activity);
    }
}

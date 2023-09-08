package androidx.camera.core.impl;

import android.view.Surface;
import androidx.camera.core.impl.DeferrableSurface;
import androidx.camera.core.impl.utils.futures.FutureCallback;
import androidx.camera.core.impl.utils.futures.Futures;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import p1167z8.C112608f;
import p202m2.C117512b;
import p202m2.C117518e;

public final class DeferrableSurfaces {
    private DeferrableSurfaces() {
    }

    public static void decrementAll(List<DeferrableSurface> list) {
        for (DeferrableSurface decrementUseCount : list) {
            decrementUseCount.decrementUseCount();
        }
    }

    public static void incrementAll(List<DeferrableSurface> list) {
        if (!list.isEmpty()) {
            int i = 0;
            do {
                try {
                    list.get(i).incrementUseCount();
                    i++;
                } catch (DeferrableSurface.SurfaceClosedException e) {
                    for (int i2 = i - 1; i2 >= 0; i2--) {
                        list.get(i2).decrementUseCount();
                    }
                    throw e;
                }
            } while (i < list.size());
        }
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void lambda$surfaceListWithTimeout$0(C112608f fVar, C117512b.C117513a aVar, long j) {
        if (!fVar.isDone()) {
            aVar.mo182232b(new TimeoutException("Cannot complete surfaceList within " + j));
            fVar.cancel(true);
        }
    }

    /* access modifiers changed from: private */
    public static Object lambda$surfaceListWithTimeout$3(List list, ScheduledExecutorService scheduledExecutorService, Executor executor, long j, final boolean z, final C117512b.C117513a aVar) {
        C112608f successfulAsList = Futures.successfulAsList(list);
        final ScheduledFuture<?> schedule = scheduledExecutorService.schedule(new DeferrableSurfaces$$b(executor, successfulAsList, aVar, j), j, TimeUnit.MILLISECONDS);
        DeferrableSurfaces$$c deferrableSurfaces$$c = new DeferrableSurfaces$$c(successfulAsList);
        C117518e<Void> eVar = aVar.f351636c;
        if (eVar != null) {
            eVar.addListener(deferrableSurfaces$$c, executor);
        }
        Futures.addCallback(successfulAsList, new FutureCallback<List<Surface>>() {
            public void onFailure(Throwable th) {
                aVar.mo182231a(Collections.unmodifiableList(Collections.emptyList()));
                schedule.cancel(true);
            }

            public void onSuccess(List<Surface> list) {
                ArrayList arrayList = new ArrayList(list);
                if (z) {
                    arrayList.removeAll(Collections.singleton((Object) null));
                }
                aVar.mo182231a(arrayList);
                schedule.cancel(true);
            }
        }, executor);
        return "surfaceList";
    }

    public static C112608f<List<Surface>> surfaceListWithTimeout(Collection<DeferrableSurface> collection, boolean z, long j, Executor executor, ScheduledExecutorService scheduledExecutorService) {
        ArrayList arrayList = new ArrayList();
        for (DeferrableSurface surface : collection) {
            arrayList.add(Futures.nonCancellationPropagating(surface.getSurface()));
        }
        return C117512b.m165760a(new DeferrableSurfaces$$d(arrayList, scheduledExecutorService, executor, j, z));
    }

    public static boolean tryIncrementAll(List<DeferrableSurface> list) {
        try {
            incrementAll(list);
            return true;
        } catch (DeferrableSurface.SurfaceClosedException unused) {
            return false;
        }
    }
}

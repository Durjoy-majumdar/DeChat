package p969gc;

import com.tencent.p014mm.sdk.platformtools.Log;
import fy3.C32224a;
import gy3.C87412m;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.FutureTask;

/* renamed from: gc.d */
public final class C87176d {

    /* renamed from: a */
    public static final C87176d f252818a = new C87176d();

    /* renamed from: b */
    public static final ConcurrentHashMap<String, C87175c> f252819b = new ConcurrentHashMap<>();

    /* renamed from: a */
    public final void mo121613a(String str) {
        C87412m.m108594g(str, "instanceId");
        C87175c remove = f252819b.remove(str);
        if (remove != null) {
            Log.m105924i("Luggage.AppBrandParallelTasksCollection", "finishAllTask: ");
            for (Map.Entry<Integer, C87174b<?>> value : remove.f252816a.entrySet()) {
                FutureTask<T> futureTask = ((C87174b) value.getValue()).f252811a;
                if (futureTask != null) {
                    if (futureTask != null) {
                        futureTask.cancel(false);
                    } else {
                        throw new IllegalStateException();
                    }
                }
            }
            remove.f252816a.clear();
            for (C32224a invoke : remove.f252817b) {
                invoke.invoke();
            }
            remove.f252817b.clear();
        }
    }

    /* renamed from: b */
    public final C87175c mo121614b(String str, boolean z) {
        C87412m.m108594g(str, "instanceId");
        ConcurrentHashMap<String, C87175c> concurrentHashMap = f252819b;
        C87175c cVar = concurrentHashMap.get(str);
        if (cVar != null) {
            return cVar;
        }
        if (!z) {
            return null;
        }
        C87175c cVar2 = new C87175c();
        concurrentHashMap.put(str, cVar2);
        return cVar2;
    }
}

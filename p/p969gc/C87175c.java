package p969gc;

import fy3.C32224a;
import gy3.C87412m;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.concurrent.FutureTask;
import rx3.C13598b0;
import zt3.C119157j;

/* renamed from: gc.c */
public class C87175c {

    /* renamed from: a */
    public final HashMap<Integer, C87174b<?>> f252816a = new HashMap<>();

    /* renamed from: b */
    public final LinkedList<C32224a<C13598b0>> f252817b = new LinkedList<>();

    /* renamed from: a */
    public final void mo121612a(C87174b<?> bVar) {
        C87412m.m108594g(bVar, "preFetchLaunchTask");
        this.f252816a.put(Integer.valueOf(bVar.mo109763b()), bVar);
        FutureTask<T> futureTask = new FutureTask<>(new C87173a(bVar));
        bVar.f252811a = futureTask;
        ((C119157j) C119157j.f356862d).mo183875f(futureTask);
    }
}

package wy0;

import fy3.C32224a;
import lu3.C109426i;
import rx3.C13598b0;

/* renamed from: wy0.d */
public final class C38364d implements C109426i {

    /* renamed from: d */
    public final /* synthetic */ C32224a<C13598b0> f101236d;

    public C38364d(C32224a<C13598b0> aVar) {
        this.f101236d = aVar;
    }

    public String getKey() {
        return "CalcWxNewService.EventRunnable";
    }

    public boolean isLogging() {
        return false;
    }

    public void run() {
        this.f101236d.invoke();
    }
}

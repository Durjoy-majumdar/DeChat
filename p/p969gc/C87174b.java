package p969gc;

import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C87412m;
import java.util.concurrent.FutureTask;
import java.util.concurrent.TimeUnit;

/* renamed from: gc.b */
public abstract class C87174b<T> {

    /* renamed from: a */
    public FutureTask<T> f252811a;

    /* renamed from: b */
    public long f252812b;

    /* renamed from: c */
    public long f252813c;

    /* renamed from: d */
    public boolean f252814d;

    /* renamed from: e */
    public long f252815e;

    /* renamed from: a */
    public T mo109762a(int i) {
        FutureTask<T> futureTask = this.f252811a;
        if (futureTask != null) {
            boolean isDone = futureTask.isDone();
            long j = 0;
            T t = null;
            try {
                long currentTimeMillis = System.currentTimeMillis();
                FutureTask<T> futureTask2 = this.f252811a;
                if (futureTask2 != null) {
                    t = futureTask2.get((long) i, TimeUnit.MILLISECONDS);
                    j = System.currentTimeMillis() - currentTimeMillis;
                    boolean z = false;
                    if (t == null) {
                        FutureTask<T> futureTask3 = this.f252811a;
                        if (futureTask3 != null) {
                            futureTask3.cancel(false);
                        } else {
                            throw new IllegalStateException();
                        }
                    }
                    Object[] objArr = new Object[5];
                    objArr[0] = Integer.valueOf(mo109763b());
                    if (t != null) {
                        z = true;
                    }
                    objArr[1] = Boolean.valueOf(z);
                    objArr[2] = Boolean.valueOf(isDone);
                    objArr[3] = Long.valueOf(this.f252815e);
                    objArr[4] = Long.valueOf(j);
                    Log.m105925i("Luggage.AppBrandBasePreFetchTask", "getPreFetchResult: #%d task hit preFetch, isPreFetchSuccess = [%b], is done before invoke = [%b], cost = [%dms], wait = [%dms]", objArr);
                    this.f252814d = true;
                    return t;
                }
                C87412m.m108603p("futureTask");
                throw null;
            } catch (Exception e) {
                Log.m105920e("Luggage.AppBrandBasePreFetchTask", "getPreFetchResult: " + e.getMessage());
            }
        } else {
            throw new IllegalStateException();
        }
    }

    /* renamed from: b */
    public abstract int mo109763b();

    /* renamed from: c */
    public abstract T mo109764c();
}

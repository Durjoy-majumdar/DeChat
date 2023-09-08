package ob0;

import android.os.Looper;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandlerThread;
import com.tencent.p014mm.sdk.platformtools.MTimerHandler;
import f40.C86723g;
import hp3.C87581a;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicReference;
import ob0.C89132b;
import te3.C49335eu3;

/* renamed from: ob0.n0 */
public final class C89147n0 {

    /* renamed from: ob0.n0$a */
    public class C89148a implements l0$$e {

        /* renamed from: d */
        public final /* synthetic */ AtomicReference f256866d;

        /* renamed from: e */
        public final /* synthetic */ CountDownLatch f256867e;

        public C89148a(AtomicReference atomicReference, CountDownLatch countDownLatch) {
            this.f256866d = atomicReference;
            this.f256867e = countDownLatch;
        }

        /* renamed from: a */
        public int mo1488a(int i, int i2, String str, C47350c cVar, C117747y yVar) {
            this.f256866d.set(C89132b.C89134c.m111401a(i, i2, str, (C49335eu3) cVar.f127056b.f127083a, yVar, (C89132b) null));
            this.f256867e.countDown();
            return 0;
        }
    }

    /* renamed from: ob0.n0$b */
    public class C89149b implements MTimerHandler.CallBack {

        /* renamed from: d */
        public final /* synthetic */ AtomicReference f256868d;

        /* renamed from: e */
        public final /* synthetic */ CountDownLatch f256869e;

        public C89149b(AtomicReference atomicReference, CountDownLatch countDownLatch) {
            this.f256868d = atomicReference;
            this.f256869e = countDownLatch;
        }

        public boolean onTimerExpired() {
            this.f256868d.set(new C89151d());
            this.f256869e.countDown();
            return false;
        }
    }

    /* renamed from: ob0.n0$c */
    public class C89150c implements C87581a<Void, C89132b.C89134c<T>> {

        /* renamed from: a */
        public final /* synthetic */ AtomicReference f256870a;

        /* renamed from: b */
        public final /* synthetic */ CountDownLatch f256871b;

        public C89150c(AtomicReference atomicReference, CountDownLatch countDownLatch) {
            this.f256870a = atomicReference;
            this.f256871b = countDownLatch;
        }

        public Object call(Object obj) {
            this.f256870a.set((C89132b.C89134c) obj);
            this.f256871b.countDown();
            return null;
        }
    }

    /* renamed from: ob0.n0$d */
    public static class C89151d<T extends C49335eu3> extends C89132b.C89134c<T> {
        public C89151d() {
            this.f256793a = 3;
            this.f256794b = -13;
        }
    }

    /* renamed from: a */
    public static <T extends C49335eu3> C89132b.C89134c<T> m111434a(C89132b<T> bVar) {
        if (bVar != null) {
            l0$$f l0__f = C89144l0.f256845a;
            C89137b0 b0Var = l0__f == null ? null : C86723g.this.f251779b;
            if (b0Var == null) {
                Log.m105920e("MicroMsg.SynchronousCgiCall", "NetSceneQueue not ready, just return NULL");
                return null;
            } else if (MMHandlerThread.isMainThread()) {
                throw new IllegalAccessError("Cant call this function in main thread");
            } else if (b0Var.f256810e.getLooper().getThread().getId() != Thread.currentThread().getId()) {
                AtomicReference atomicReference = new AtomicReference();
                CountDownLatch countDownLatch = new CountDownLatch(1);
                bVar.mo9225i().mo123062e(new C89150c(atomicReference, countDownLatch));
                try {
                    countDownLatch.await();
                    return (C89132b.C89134c) atomicReference.get();
                } catch (Exception e) {
                    Log.printErrStackTrace("MicroMsg.SynchronousCgiCall", e, "semaphore await exp ", new Object[0]);
                    return null;
                }
            } else {
                throw new IllegalAccessError("Cant call this function in NetSceneQueue's worker thread!!!");
            }
        } else {
            throw new IllegalArgumentException("Cant use NULL cgi instance");
        }
    }

    /* renamed from: b */
    public static <T extends C49335eu3> C89132b.C89134c<T> m111435b(C47350c cVar, long j) {
        if (cVar != null) {
            l0$$f l0__f = C89144l0.f256845a;
            C89137b0 b0Var = l0__f == null ? null : C86723g.this.f251779b;
            if (b0Var == null) {
                Log.m105920e("MicroMsg.SynchronousCgiCall", "NetSceneQueue not ready, just return NULL");
                return null;
            } else if (MMHandlerThread.isMainThread()) {
                throw new IllegalAccessError("Cant call this function in main thread");
            } else if (b0Var.f256810e.getLooper().getThread().getId() != Thread.currentThread().getId()) {
                AtomicReference atomicReference = new AtomicReference();
                CountDownLatch countDownLatch = new CountDownLatch(1);
                C89144l0.m111429e(cVar, new C89148a(atomicReference, countDownLatch), false);
                new MTimerHandler(Looper.getMainLooper(), (MTimerHandler.CallBack) new C89149b(atomicReference, countDownLatch), false).startTimer(j);
                try {
                    countDownLatch.await();
                    return (C89132b.C89134c) atomicReference.get();
                } catch (InterruptedException e) {
                    Log.printErrStackTrace("MicroMsg.SynchronousCgiCall", e, "latch await exp ", new Object[0]);
                    return null;
                }
            } else {
                throw new IllegalAccessError("Cant call this function in NetSceneQueue's worker thread!!!");
            }
        } else {
            throw new IllegalArgumentException("Cant use NULL rr");
        }
    }
}

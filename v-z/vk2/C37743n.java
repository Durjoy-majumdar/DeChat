package vk2;

import android.os.Looper;
import android.os.MessageQueue;
import fy3.C32224a;
import rx3.C13598b0;

/* renamed from: vk2.n */
public final class C37743n implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ C32224a<C13598b0> f99963d;

    /* renamed from: vk2.n$a */
    public static final class C37744a implements MessageQueue.IdleHandler {

        /* renamed from: d */
        public final /* synthetic */ C32224a f99964d;

        public C37744a(C32224a aVar) {
            this.f99964d = aVar;
        }

        public boolean queueIdle() {
            Looper.myQueue().removeIdleHandler(this);
            this.f99964d.invoke();
            return false;
        }
    }

    public C37743n(C32224a<C13598b0> aVar) {
        this.f99963d = aVar;
    }

    public final void run() {
        Looper.myQueue().addIdleHandler(new C37744a(this.f99963d));
    }
}

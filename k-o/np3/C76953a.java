package np3;

import android.os.Handler;
import android.os.HandlerThread;

/* renamed from: np3.a */
public final class C76953a {

    /* renamed from: b */
    public static C76953a f224883b = new C76953a();

    /* renamed from: a */
    public HandlerThread f224884a;

    public C76953a() {
        HandlerThread handlerThread = new HandlerThread("Vending-HeavyWorkThread", 10);
        this.f224884a = handlerThread;
        handlerThread.start();
        new Handler(this.f224884a.getLooper());
    }
}

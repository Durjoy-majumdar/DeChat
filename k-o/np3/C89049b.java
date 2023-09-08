package np3;

import android.os.Handler;
import android.os.HandlerThread;

/* renamed from: np3.b */
public final class C89049b {

    /* renamed from: b */
    public static C89049b f256699b = new C89049b();

    /* renamed from: a */
    public HandlerThread f256700a;

    public C89049b() {
        HandlerThread handlerThread = new HandlerThread("Vending-LogicThread");
        this.f256700a = handlerThread;
        handlerThread.start();
        new Handler(this.f256700a.getLooper());
    }
}

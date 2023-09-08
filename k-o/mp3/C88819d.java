package mp3;

import android.os.Looper;
import np3.C76953a;
import np3.C89049b;

/* renamed from: mp3.d */
public abstract class C88819d {
    public static final C88825i HEAVY_WORK = new C88825i(C76953a.f224883b.f224884a.getLooper(), "Vending.HEAVY_WORK");
    public static final C88825i LOGIC = new C88825i(C89049b.f256699b.f256700a.getLooper(), "Vending.LOGIC");

    /* renamed from: UI */
    public static final C88825i f256219UI = new C88825i(Looper.getMainLooper(), "Vending.UI");

    static {
        C88824h.m110910d();
    }

    public static C88819d current() {
        return C88824h.m110907a();
    }

    public static C88819d find(String str) {
        return C88824h.m110909c(str);
    }

    public abstract void arrange(Runnable runnable);

    public abstract void arrangeInterval(Runnable runnable, long j);

    public abstract void cancel();

    public abstract String getType();
}

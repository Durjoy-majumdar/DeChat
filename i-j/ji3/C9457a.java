package ji3;

import com.tencent.p014mm.sdk.platformtools.MMHandlerThread;
import zt3.C119157j;

/* renamed from: ji3.a */
public class C9457a {
    /* renamed from: a */
    public static boolean m9137a(Runnable runnable) {
        if (runnable == null) {
            return false;
        }
        ((C119157j) C119157j.f356862d).mo183875f(runnable);
        return true;
    }

    /* renamed from: b */
    public static boolean m9138b(boolean z, Runnable runnable) {
        if (runnable == null) {
            return false;
        }
        if (!z) {
            return m9137a(runnable);
        }
        MMHandlerThread.postToMainThread(runnable);
        return true;
    }
}

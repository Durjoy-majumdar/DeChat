package gq0;

import android.os.Looper;
import zt3.C119157j;

/* renamed from: gq0.i0 */
public interface C45944i0 {

    /* renamed from: a */
    public static final C45944i0 f123944a = new C45945a();

    /* renamed from: gq0.i0$a */
    public class C45945a implements C45944i0 {
        /* renamed from: a */
        public void mo71346a(Runnable runnable) {
            if (Looper.getMainLooper() == Looper.myLooper()) {
                runnable.run();
            } else {
                ((C119157j) C119157j.f356862d).mo183895z(runnable);
            }
        }
    }

    /* renamed from: a */
    void mo71346a(Runnable runnable);
}

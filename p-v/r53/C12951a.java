package r53;

import android.os.Looper;
import androidx.lifecycle.C54219z;
import gy3.C8480h;
import zt3.C119157j;

/* renamed from: r53.a */
public final class C12951a {
    /* renamed from: a */
    public static final <T> void m12391a(C54219z<T> zVar, T t) {
        if (zVar != null) {
            if (Thread.currentThread() == Looper.getMainLooper().getThread()) {
                zVar.setValue(t);
                return;
            }
            ((C119157j) C119157j.f356862d).mo183895z(new C12952b(zVar, t, (C8480h) null));
        }
    }
}

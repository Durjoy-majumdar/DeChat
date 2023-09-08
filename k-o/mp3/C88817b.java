package mp3;

import android.os.Handler;
import android.os.Looper;

/* renamed from: mp3.b */
public class C88817b implements C88816a {

    /* renamed from: a */
    public Handler f256218a;

    public C88817b(Handler handler) {
        this.f256218a = handler;
    }

    /* renamed from: a */
    public void mo123210a() {
        this.f256218a.removeCallbacksAndMessages((Object) null);
    }

    public Looper getLooper() {
        return this.f256218a.getLooper();
    }

    public void post(Runnable runnable) {
        this.f256218a.post(runnable);
    }

    public void postDelayed(Runnable runnable, long j) {
        this.f256218a.postDelayed(runnable, j);
    }
}

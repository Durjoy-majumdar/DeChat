package o40;

import com.tencent.p014mm.sdk.platformtools.Log;
import mp3.C88819d;
import zt3.C119157j;

/* renamed from: o40.i */
public final class C61938i extends C88819d {

    /* renamed from: a */
    public static final C61938i f176062a = new C61938i();

    public void arrange(Runnable runnable) {
        if (runnable != null) {
            ((C119157j) C119157j.f356862d).mo183875f(runnable);
        }
    }

    public void arrangeInterval(Runnable runnable, long j) {
        if (runnable != null) {
            ((C119157j) C119157j.f356862d).mo183878i(runnable, j);
        }
    }

    public void cancel() {
        Log.m105920e("ThreadScheduler", "can not support");
    }

    public String getType() {
        return "ThreadScheduler";
    }
}

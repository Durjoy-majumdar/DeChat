package nr3;

import android.os.Looper;
import com.tencent.p014mm.sdk.platformtools.MMHandler;
import mp3.C88816a;

/* renamed from: nr3.c */
public class C89057c implements C88816a {

    /* renamed from: a */
    public MMHandler f256711a;

    public C89057c(MMHandler mMHandler) {
        this.f256711a = mMHandler;
    }

    /* renamed from: a */
    public void mo123210a() {
        this.f256711a.removeCallbacksAndMessages((Object) null);
    }

    public Looper getLooper() {
        return this.f256711a.getLooper();
    }

    public void post(Runnable runnable) {
        this.f256711a.post(runnable);
    }

    public void postDelayed(Runnable runnable, long j) {
        this.f256711a.postDelayed(runnable, j);
    }
}

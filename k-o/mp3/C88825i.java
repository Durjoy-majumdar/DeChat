package mp3;

import android.os.Handler;
import android.os.Looper;

/* renamed from: mp3.i */
public class C88825i extends C88819d {

    /* renamed from: a */
    public C88816a f256230a;

    /* renamed from: b */
    public Looper f256231b;

    /* renamed from: c */
    public String f256232c;

    public C88825i(C88816a aVar, String str) {
        this.f256231b = aVar.getLooper();
        this.f256230a = aVar;
        this.f256232c = str;
    }

    /* renamed from: a */
    public Looper mo123216a() {
        return this.f256231b;
    }

    public void arrange(Runnable runnable) {
        this.f256230a.post(runnable);
    }

    public void arrangeInterval(Runnable runnable, long j) {
        if (j >= 0) {
            this.f256230a.postDelayed(runnable, j);
        } else {
            this.f256230a.post(runnable);
        }
    }

    public void cancel() {
        this.f256230a.mo123210a();
    }

    public String getType() {
        return this.f256232c;
    }

    public C88825i(Looper looper, String str) {
        this((C88816a) new C88817b(new Handler(looper)), str);
    }
}

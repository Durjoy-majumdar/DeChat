package jj0;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;
import l34.C117456i;
import p418rx.schedulers.Schedulers;

/* renamed from: jj0.a */
public class C87971a implements Executor {

    /* renamed from: f */
    public static C87971a f254563f;

    /* renamed from: d */
    public final C117456i f254564d = Schedulers.from(this);

    /* renamed from: e */
    public final Handler f254565e = new Handler(Looper.getMainLooper());

    /* renamed from: a */
    public static C117456i m109468a() {
        if (f254563f == null) {
            synchronized (C87971a.class) {
                if (f254563f == null) {
                    f254563f = new C87971a();
                }
            }
        }
        return f254563f.f254564d;
    }

    public void execute(Runnable runnable) {
        this.f254565e.post(runnable);
    }
}

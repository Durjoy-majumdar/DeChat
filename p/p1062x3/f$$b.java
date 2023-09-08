package p1062x3;

import android.content.Context;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* renamed from: x3.f$$b */
public final /* synthetic */ class f$$b implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ Context f355507d;

    public /* synthetic */ f$$b(Context context) {
        this.f355507d = context;
    }

    public final void run() {
        new ThreadPoolExecutor(0, 1, 0, TimeUnit.MILLISECONDS, new LinkedBlockingQueue()).execute(new f$$c(this.f355507d));
    }
}

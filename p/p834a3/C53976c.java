package p834a3;

import android.os.Handler;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;

/* renamed from: a3.c */
public class C53976c implements Executor {

    /* renamed from: d */
    public final Handler f151223d;

    public C53976c(Handler handler) {
        handler.getClass();
        this.f151223d = handler;
    }

    public void execute(Runnable runnable) {
        Handler handler = this.f151223d;
        runnable.getClass();
        if (!handler.post(runnable)) {
            throw new RejectedExecutionException(this.f151223d + " is shutting down");
        }
    }
}

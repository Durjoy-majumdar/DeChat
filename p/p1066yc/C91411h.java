package p1066yc;

import android.graphics.SurfaceTexture;
import android.os.Handler;
import com.tencent.p014mm.sdk.platformtools.Log;
import java.util.ArrayList;
import java.util.concurrent.Future;
import p1066yc.C91393a0;

/* renamed from: yc.h */
public class C91411h implements SurfaceTexture.OnFrameAvailableListener {

    /* renamed from: d */
    public final /* synthetic */ Future f262131d;

    /* renamed from: e */
    public final /* synthetic */ Runnable f262132e;

    /* renamed from: f */
    public final /* synthetic */ C91393a0 f262133f;

    /* renamed from: g */
    public final /* synthetic */ C91408g f262134g;

    public C91411h(C91408g gVar, Future future, Runnable runnable, C91393a0 a0Var) {
        this.f262134g = gVar;
        this.f262131d = future;
        this.f262132e = runnable;
        this.f262133f = a0Var;
    }

    public void onFrameAvailable(SurfaceTexture surfaceTexture) {
        Log.m105924i(this.f262134g.f262123a, "scheduleAfterTransferToTask, onFrameAvailable");
        this.f262131d.cancel(true);
        this.f262132e.run();
        C91393a0 a0Var = this.f262133f;
        synchronized (a0Var) {
            ((ArrayList) a0Var.f262094b).remove(new C91393a0.C91395b(this, (Handler) null));
        }
    }
}

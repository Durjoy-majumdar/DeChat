package p1062x3;

import android.view.Choreographer;

/* renamed from: x3.g$$a */
public final /* synthetic */ class g$$a implements Choreographer.FrameCallback {

    /* renamed from: d */
    public final /* synthetic */ Runnable f335398d;

    public /* synthetic */ g$$a(Runnable runnable) {
        this.f335398d = runnable;
    }

    public final void doFrame(long j) {
        this.f335398d.run();
    }
}

package androidx.camera.core;

public final /* synthetic */ class ProcessingSurface$$b implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ ProcessingSurface f44286d;

    public /* synthetic */ ProcessingSurface$$b(ProcessingSurface processingSurface) {
        this.f44286d = processingSurface;
    }

    public final void run() {
        this.f44286d.release();
    }
}

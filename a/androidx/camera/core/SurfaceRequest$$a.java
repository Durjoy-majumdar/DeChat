package androidx.camera.core;

import android.view.Surface;
import androidx.camera.core.SurfaceRequest;
import p329d3.C86165a;

public final /* synthetic */ class SurfaceRequest$$a implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ C86165a f44290d;

    /* renamed from: e */
    public final /* synthetic */ Surface f44291e;

    public /* synthetic */ SurfaceRequest$$a(C86165a aVar, Surface surface) {
        this.f44290d = aVar;
        this.f44291e = surface;
    }

    public final void run() {
        this.f44290d.accept(SurfaceRequest.Result.m15500of(3, this.f44291e));
    }
}

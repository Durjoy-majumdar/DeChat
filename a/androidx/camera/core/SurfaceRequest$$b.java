package androidx.camera.core;

import android.view.Surface;
import androidx.camera.core.SurfaceRequest;
import p329d3.C86165a;

public final /* synthetic */ class SurfaceRequest$$b implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ C86165a f44292d;

    /* renamed from: e */
    public final /* synthetic */ Surface f44293e;

    public /* synthetic */ SurfaceRequest$$b(C86165a aVar, Surface surface) {
        this.f44292d = aVar;
        this.f44293e = surface;
    }

    public final void run() {
        this.f44292d.accept(SurfaceRequest.Result.m15500of(4, this.f44293e));
    }
}

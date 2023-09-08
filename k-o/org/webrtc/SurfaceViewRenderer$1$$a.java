package org.webrtc;

import android.graphics.Bitmap;
import org.webrtc.IRenderer;
import org.webrtc.SurfaceViewRenderer;

public final /* synthetic */ class SurfaceViewRenderer$1$$a implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ SurfaceViewRenderer.C218571 f61850d;

    /* renamed from: e */
    public final /* synthetic */ IRenderer.OnCaptureListener f61851e;

    /* renamed from: f */
    public final /* synthetic */ Bitmap f61852f;

    public /* synthetic */ SurfaceViewRenderer$1$$a(SurfaceViewRenderer.C218571 r1, IRenderer.OnCaptureListener onCaptureListener, Bitmap bitmap) {
        this.f61850d = r1;
        this.f61851e = onCaptureListener;
        this.f61852f = bitmap;
    }

    public final void run() {
        this.f61850d.lambda$onFrame$0(this.f61851e, this.f61852f);
    }
}

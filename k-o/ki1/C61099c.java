package ki1;

import android.graphics.SurfaceTexture;
import android.view.TextureView;
import android.view.ViewTreeObserver;

/* renamed from: ki1.c */
public final class C61099c implements ViewTreeObserver.OnPreDrawListener {

    /* renamed from: d */
    public final /* synthetic */ C61100d f173967d;

    /* renamed from: e */
    public final /* synthetic */ SurfaceTexture f173968e;

    public C61099c(C61100d dVar, SurfaceTexture surfaceTexture) {
        this.f173967d = dVar;
        this.f173968e = surfaceTexture;
    }

    public boolean onPreDraw() {
        this.f173967d.getRootView().getViewTreeObserver().removeOnPreDrawListener(this);
        C61100d dVar = this.f173967d;
        TextureView.SurfaceTextureListener surfaceTextureListener = dVar.f173975j;
        if (surfaceTextureListener == null) {
            return true;
        }
        surfaceTextureListener.onSurfaceTextureSizeChanged(this.f173968e, dVar.getWidth(), dVar.getHeight());
        return true;
    }
}

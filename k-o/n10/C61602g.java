package n10;

import android.graphics.SurfaceTexture;
import android.view.TextureView;
import gy3.C87412m;

/* renamed from: n10.g */
public final class C61602g implements TextureView.SurfaceTextureListener {

    /* renamed from: d */
    public final TextureView.SurfaceTextureListener f175188d;

    /* renamed from: e */
    public final TextureView.SurfaceTextureListener f175189e;

    public C61602g(TextureView.SurfaceTextureListener surfaceTextureListener, TextureView.SurfaceTextureListener surfaceTextureListener2) {
        C87412m.m108594g(surfaceTextureListener2, "newListener");
        this.f175188d = surfaceTextureListener;
        this.f175189e = surfaceTextureListener2;
    }

    public void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
        C87412m.m108594g(surfaceTexture, "surface");
        TextureView.SurfaceTextureListener surfaceTextureListener = this.f175188d;
        if (surfaceTextureListener != null) {
            surfaceTextureListener.onSurfaceTextureAvailable(surfaceTexture, i, i2);
        }
        this.f175189e.onSurfaceTextureAvailable(surfaceTexture, i, i2);
    }

    public boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        C87412m.m108594g(surfaceTexture, "surface");
        TextureView.SurfaceTextureListener surfaceTextureListener = this.f175188d;
        return (surfaceTextureListener == null ? true : surfaceTextureListener.onSurfaceTextureDestroyed(surfaceTexture)) || this.f175189e.onSurfaceTextureDestroyed(surfaceTexture);
    }

    public void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
        C87412m.m108594g(surfaceTexture, "surface");
        TextureView.SurfaceTextureListener surfaceTextureListener = this.f175188d;
        if (surfaceTextureListener != null) {
            surfaceTextureListener.onSurfaceTextureSizeChanged(surfaceTexture, i, i2);
        }
        this.f175189e.onSurfaceTextureSizeChanged(surfaceTexture, i, i2);
    }

    public void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        C87412m.m108594g(surfaceTexture, "surface");
        TextureView.SurfaceTextureListener surfaceTextureListener = this.f175188d;
        if (surfaceTextureListener != null) {
            surfaceTextureListener.onSurfaceTextureUpdated(surfaceTexture);
        }
        this.f175189e.onSurfaceTextureUpdated(surfaceTexture);
    }
}

package go0;

import android.graphics.SurfaceTexture;
import android.view.TextureView;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.xweb.skia_canvas.SkiaCanvasView;

/* renamed from: go0.e */
public class C87281e implements TextureView.SurfaceTextureListener {

    /* renamed from: d */
    public SurfaceTexture f253016d;

    /* renamed from: e */
    public final /* synthetic */ C87278d f253017e;

    public C87281e(C87278d dVar) {
        this.f253017e = dVar;
        dVar.f253013h.setCallback(new e$$a(this));
    }

    public void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
        Log.m105925i("Luggage.SkiaCanvasTextureView", "onSurfaceTextureAvailable:%s width:%d height:%d viewId%d", surfaceTexture, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(this.f253017e.f253010e));
        if (this.f253016d == null) {
            this.f253016d = surfaceTexture;
            this.f253017e.f253013h.countDown();
        }
    }

    public boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        Log.m105925i("Luggage.SkiaCanvasTextureView", "onSurfaceTextureDestroyed:%s, viewId:%d", surfaceTexture, Integer.valueOf(this.f253017e.f253010e));
        SkiaCanvasView skiaCanvasView = this.f253017e.f253011f;
        if (skiaCanvasView != null) {
            skiaCanvasView.recycle();
        }
        if (this.f253016d == surfaceTexture) {
            this.f253017e.f253013h.cancel();
        }
        return true;
    }

    public void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
        Log.m105925i("Luggage.SkiaCanvasTextureView", "onSurfaceTextureSizeChanged:%s width:%d height:%d viewId:%d", surfaceTexture, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(this.f253017e.f253010e));
        if (this.f253016d == null) {
            this.f253016d = surfaceTexture;
            this.f253017e.f253013h.countDown();
        }
    }

    public void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        Log.m105925i("Luggage.SkiaCanvasTextureView", "onSurfaceTextureUpdated:%s, viewId:%d", surfaceTexture, Integer.valueOf(this.f253017e.f253010e));
        if (this.f253016d == null) {
            this.f253016d = surfaceTexture;
            this.f253017e.f253013h.countDown();
        }
    }
}

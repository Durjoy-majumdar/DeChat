package xo1;

import android.graphics.SurfaceTexture;
import android.view.Surface;
import android.view.TextureView;
import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C87412m;
import j03.C60698b;

/* renamed from: xo1.e */
public final class C66387e implements TextureView.SurfaceTextureListener {

    /* renamed from: d */
    public final /* synthetic */ C66388f f191112d;

    public C66387e(C66388f fVar) {
        this.f191112d = fVar;
    }

    public void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
        C87412m.m108594g(surfaceTexture, "surface");
        Log.m105924i(this.f191112d.f191113j, "onSurfaceTextureAvailable");
        C60698b bVar = this.f191112d.f191119s;
        if (bVar != null) {
            bVar.setSurface(new Surface(surfaceTexture));
        }
    }

    public boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        C87412m.m108594g(surfaceTexture, "surface");
        Log.m105924i(this.f191112d.f191113j, "onSurfaceTextureDestroyed");
        return false;
    }

    public void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
        C87412m.m108594g(surfaceTexture, "surface");
        String str = this.f191112d.f191113j;
        Log.m105924i(str, "onSurfaceTextureSizeChanged  width = " + i + "  height = " + i2);
    }

    public void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        C87412m.m108594g(surfaceTexture, "surface");
    }
}

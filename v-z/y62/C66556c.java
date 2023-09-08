package y62;

import android.graphics.SurfaceTexture;
import android.view.TextureView;
import com.tencent.p014mm.plugin.mmplayer.render.MMTextureViewRender;
import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C87412m;
import y62.C23252a;

/* renamed from: y62.c */
public final class C66556c implements TextureView.SurfaceTextureListener {

    /* renamed from: d */
    public final /* synthetic */ MMTextureViewRender f191413d;

    public C66556c(MMTextureViewRender mMTextureViewRender) {
        this.f191413d = mMTextureViewRender;
    }

    public void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
        C87412m.m108594g(surfaceTexture, "surface");
        String logTag = this.f191413d.getLogTag();
        Log.m105924i(logTag, "onSurfaceTextureAvailable surface:" + surfaceTexture + " [" + i + ", " + i2 + "] listener:" + this.f191413d.f162941e);
        this.f191413d.getClass();
        C23252a.C23253a aVar = this.f191413d.f162941e;
        if (aVar != null) {
            aVar.mo24012b(surfaceTexture);
        }
    }

    public boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        C87412m.m108594g(surfaceTexture, "surface");
        C23252a.C23253a aVar = this.f191413d.f162941e;
        boolean d = aVar != null ? aVar.mo24014d(surfaceTexture) : true;
        String logTag = this.f191413d.getLogTag();
        Log.m105924i(logTag, "onSurfaceTextureDestroyed surface:" + surfaceTexture + " result:" + d + " listener:" + this.f191413d.f162941e);
        return d;
    }

    public void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
        C87412m.m108594g(surfaceTexture, "surface");
        String logTag = this.f191413d.getLogTag();
        Log.m105924i(logTag, "onSurfaceTextureSizeChanged surface:" + surfaceTexture + " [" + i + ", " + i2 + "] listener:" + this.f191413d.f162941e);
        C23252a.C23253a aVar = this.f191413d.f162941e;
        if (aVar != null) {
            aVar.mo24011a(surfaceTexture, i, i2);
        }
    }

    public void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        C87412m.m108594g(surfaceTexture, "surface");
        C23252a.C23253a aVar = this.f191413d.f162941e;
        if (aVar != null) {
            aVar.mo24013c(surfaceTexture);
        }
    }
}

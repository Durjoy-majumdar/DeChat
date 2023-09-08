package k03;

import android.graphics.SurfaceTexture;
import android.view.TextureView;
import com.tencent.p014mm.plugin.thumbplayer.render.MMTextureViewRender;
import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C87412m;
import k03.C60931a;

/* renamed from: k03.e */
public final class C60938e implements TextureView.SurfaceTextureListener {

    /* renamed from: d */
    public final /* synthetic */ MMTextureViewRender f173569d;

    public C60938e(MMTextureViewRender mMTextureViewRender) {
        this.f173569d = mMTextureViewRender;
    }

    public void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
        C87412m.m108594g(surfaceTexture, "surface");
        String logTag = this.f173569d.getLogTag();
        Log.m105924i(logTag, "onSurfaceTextureAvailable surface:" + surfaceTexture + " [" + i + ", " + i2 + "] listener:" + this.f173569d.f164611e);
        this.f173569d.getClass();
        C60931a.C60932a aVar = this.f173569d.f164611e;
        if (aVar != null) {
            aVar.mo24865b(surfaceTexture);
        }
    }

    public boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        C87412m.m108594g(surfaceTexture, "surface");
        C60931a.C60932a aVar = this.f173569d.f164611e;
        boolean d = aVar != null ? aVar.mo24867d(surfaceTexture) : true;
        String logTag = this.f173569d.getLogTag();
        Log.m105924i(logTag, "onSurfaceTextureDestroyed surface:" + surfaceTexture + " result:" + d + " listener:" + this.f173569d.f164611e);
        return d;
    }

    public void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
        C87412m.m108594g(surfaceTexture, "surface");
        String logTag = this.f173569d.getLogTag();
        Log.m105924i(logTag, "onSurfaceTextureSizeChanged surface:" + surfaceTexture + " [" + i + ", " + i2 + "] listener:" + this.f173569d.f164611e);
        C60931a.C60932a aVar = this.f173569d.f164611e;
        if (aVar != null) {
            aVar.mo24864a(surfaceTexture, i, i2);
        }
    }

    public void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        C87412m.m108594g(surfaceTexture, "surface");
        C60931a.C60932a aVar = this.f173569d.f164611e;
        if (aVar != null) {
            aVar.mo24866c(surfaceTexture);
        }
    }
}

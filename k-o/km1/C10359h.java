package km1;

import android.graphics.SurfaceTexture;
import android.view.TextureView;
import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C87412m;

/* renamed from: km1.h */
public final class C10359h implements TextureView.SurfaceTextureListener {
    public void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
        C87412m.m108594g(surfaceTexture, "surface");
        Log.m105924i("FinderLiveCardPreViewAnimationHelper", "detachMaskView#onSurfaceTextureAvailable surface:" + surfaceTexture);
    }

    public boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        C87412m.m108594g(surfaceTexture, "surface");
        Log.m105924i("FinderLiveCardPreViewAnimationHelper", "detachMaskView#onSurfaceTextureDestroyed surface:" + surfaceTexture);
        return false;
    }

    public void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
        C87412m.m108594g(surfaceTexture, "surface");
        Log.m105924i("FinderLiveCardPreViewAnimationHelper", "detachMaskView#onSurfaceTextureSizeChanged");
    }

    public void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        C87412m.m108594g(surfaceTexture, "surface");
    }
}

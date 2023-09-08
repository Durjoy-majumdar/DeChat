package ph1;

import android.content.Context;
import android.graphics.Matrix;
import android.graphics.SurfaceTexture;
import android.view.TextureView;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C87412m;

/* renamed from: ph1.l */
public final class C62295l extends TextureView {

    /* renamed from: d */
    public int f177097d;

    /* renamed from: e */
    public int f177098e;

    /* renamed from: ph1.l$a */
    public static class C62296a implements TextureView.SurfaceTextureListener {

        /* renamed from: d */
        public final String f177099d;

        /* renamed from: e */
        public final boolean f177100e;

        public C62296a(String str, boolean z) {
            C87412m.m108594g(str, FirebaseAnalytics.C113379b.SOURCE);
            this.f177099d = str;
            this.f177100e = z;
        }

        public void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
            C87412m.m108594g(surfaceTexture, "surface");
            Log.m105924i("FluentSwitchTextureView", this.f177099d + " onSurfaceTextureAvailable surface:" + surfaceTexture);
        }

        public boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
            C87412m.m108594g(surfaceTexture, "surface");
            Log.m105924i("FluentSwitchTextureView", this.f177099d + " onSurfaceTextureDestroyed surface:" + surfaceTexture);
            return this.f177100e;
        }

        public void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
            C87412m.m108594g(surfaceTexture, "surface");
            Log.m105924i("FluentSwitchTextureView", this.f177099d + " onSurfaceTextureSizeChanged surface:" + surfaceTexture);
        }

        public void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
            C87412m.m108594g(surfaceTexture, "surface");
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C62295l(Context context) {
        super(context);
        C87412m.m108594g(context, "context");
        setOpaque(false);
        setSurfaceTextureListener(new C62296a("FluentSwitchTextureView", false));
    }

    /* renamed from: a */
    public final void mo87364a(int i, int i2) {
        float f = (float) i;
        float f2 = f / ((float) this.f177097d);
        float f3 = (float) i2;
        float f4 = f3 / ((float) this.f177098e);
        Matrix matrix = new Matrix();
        if (f2 < f4) {
            f2 = f4;
        }
        float f5 = (float) 2;
        matrix.preTranslate((f - ((float) this.f177097d)) / f5, (f3 - ((float) this.f177098e)) / f5);
        matrix.preScale(((float) this.f177097d) / f, ((float) this.f177098e) / f3);
        matrix.postScale(f2, f2, f / f5, f3 / f5);
        setTransform(matrix);
        postInvalidate();
    }

    public final int getVideoHeight() {
        return this.f177098e;
    }

    public final int getVideoWidth() {
        return this.f177097d;
    }

    public final void setVideoHeight(int i) {
        this.f177098e = i;
    }

    public final void setVideoWidth(int i) {
        this.f177097d = i;
    }
}

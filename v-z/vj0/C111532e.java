package vj0;

import android.content.Context;
import android.graphics.SurfaceTexture;
import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C87412m;
import s80.C110777a;
import s80.C110780c;
import u80.C111139a;
import u80.C111141c;

/* renamed from: vj0.e */
public class C111532e extends C111517b {

    /* renamed from: q */
    public boolean f333927q = false;

    /* renamed from: r */
    public int f333928r = 0;

    /* renamed from: s */
    public int f333929s = 0;

    /* renamed from: t */
    public C110777a f333930t = null;

    /* renamed from: vj0.e$a */
    public class C111533a extends C110780c {
        public C111533a(C111532e eVar, int i, int i2) {
            super(i, i2);
        }

        /* renamed from: f */
        public C111139a mo157952f() {
            return new C111141c(this.f331376a, this.f331377b, this.f331378c, this.f331379d, this.f331380e, this.f331381f);
        }
    }

    /* renamed from: vj0.e$b */
    public class C111534b extends C110780c {

        /* renamed from: t */
        public final /* synthetic */ int f333931t;

        /* renamed from: u */
        public final /* synthetic */ int f333932u;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C111534b(C111532e eVar, int i, int i2, int i3, int i4) {
            super(i, i2);
            this.f333931t = i3;
            this.f333932u = i4;
        }

        /* renamed from: f */
        public C111139a mo157952f() {
            int i = this.f333931t;
            int i2 = this.f333932u;
            return new C111141c(i, i2, i, i2, 1, 1);
        }
    }

    public C111532e(Context context) {
        super(context);
    }

    public C110777a getAbsSurfaceRenderer() {
        return this.f333930t;
    }

    public int getSurfaceHeight() {
        return this.f333929s;
    }

    public int getSurfaceWidth() {
        return this.f333928r;
    }

    public boolean isAvailable() {
        return this.f333927q;
    }

    public void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
        Log.m105924i("MicroMsg.ScreenView", "onSurfaceTextureAvailable, surface:" + surfaceTexture + ", width:" + i + ", height:" + i2);
        try {
            C111533a aVar = new C111533a(this, 1, 2);
            this.f333930t = aVar;
            aVar.mo159591u(i, i2);
            this.f333930t.mo159590t(i, i2);
            setPreviewRenderer(new C111534b(this, 1, 2, i, i2));
            synchronized (this) {
                this.f333927q = true;
                this.f333928r = i;
                this.f333929s = i2;
            }
            super.onSurfaceTextureAvailable(surfaceTexture, i, i2);
        } catch (Exception e) {
            Log.m105924i("MicroMsg.ScreenView", "onSurfaceTextureAvailable, error:" + e.getMessage());
        }
    }

    public boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        Log.m105924i("MicroMsg.ScreenView", "onSurfaceTextureDestroyed, surface:" + surfaceTexture);
        C110777a aVar = this.f333930t;
        if (aVar != null) {
            aVar.mo157956n(true);
        }
        super.onSurfaceTextureDestroyed(surfaceTexture);
        return false;
    }

    public void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
        Log.m105924i("MicroMsg.ScreenView", "onSurfaceTextureSizeChanged, surface:" + surfaceTexture + ", width:" + i + ", height:" + i2);
        super.onSurfaceTextureSizeChanged(surfaceTexture, i, i2);
    }

    public void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        C87412m.m108594g(surfaceTexture, "surface");
    }
}

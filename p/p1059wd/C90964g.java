package p1059wd;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.view.TextureView;
import android.view.View;
import com.tencent.magicbrush.MBRuntime;
import com.tencent.magicbrush.p941ui.MagicBrushView;
import fy3.C32226l;
import gy3.C87412m;

/* renamed from: wd.g */
public class C90964g extends TextureView implements MagicBrushView.C80319b, TextureView.SurfaceTextureListener {

    /* renamed from: d */
    public final View f261025d = this;

    /* renamed from: e */
    public MagicBrushView.C80321c f261026e;

    /* renamed from: f */
    public final MagicBrushView.C80327h f261027f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C90964g(Context context) {
        super(context);
        C87412m.m108594g(context, "context");
        super.setSurfaceTextureListener(this);
        this.f261027f = MagicBrushView.C80327h.TextureView;
    }

    public Object getSurface() {
        return MagicBrushView.C80319b.C80320a.m97787a(this);
    }

    public View getThisView() {
        return this.f261025d;
    }

    public MagicBrushView.C80327h getViewType() {
        return this.f261027f;
    }

    /* renamed from: l */
    public void mo111654l(boolean z, int i, C32226l<? super Boolean, Void> lVar, MBRuntime mBRuntime) {
        C87412m.m108594g(lVar, "callback");
        C87412m.m108594g(mBRuntime, "runtime");
        lVar.invoke(Boolean.TRUE);
    }

    public void onDestroy() {
    }

    public void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
        C87412m.m108594g(surfaceTexture, "surface");
        MagicBrushView.C80321c cVar = this.f261026e;
        if (cVar != null) {
            MagicBrushView.C80321c.C80322a.m97791a(cVar, surfaceTexture, i, i2, true, false, 16, (Object) null);
        }
    }

    public boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        C87412m.m108594g(surfaceTexture, "surface");
        MagicBrushView.C80321c cVar = this.f261026e;
        if (cVar != null) {
            cVar.mo55505e(surfaceTexture, false);
        }
        return false;
    }

    public void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
        C87412m.m108594g(surfaceTexture, "surface");
        MagicBrushView.C80321c cVar = this.f261026e;
        if (cVar != null) {
            cVar.mo55504b(surfaceTexture, i, i2);
        }
    }

    public void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        C87412m.m108594g(surfaceTexture, "surface");
    }

    public void setSurfaceListener(MagicBrushView.C80321c cVar) {
        this.f261026e = cVar;
    }
}

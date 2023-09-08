package p1059wd;

import android.content.Context;
import android.graphics.Rect;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.view.View;
import com.tencent.magicbrush.MBRuntime;
import com.tencent.magicbrush.p941ui.MagicBrushView;
import fy3.C32226l;
import gy3.C87412m;

/* renamed from: wd.f */
public class C90963f extends SurfaceView implements MagicBrushView.C80319b, SurfaceHolder.Callback {

    /* renamed from: d */
    public final View f261022d = this;

    /* renamed from: e */
    public final MagicBrushView.C80327h f261023e = MagicBrushView.C80327h.SurfaceView;

    /* renamed from: f */
    public MagicBrushView.C80321c f261024f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C90963f(Context context) {
        super(context);
        C87412m.m108594g(context, "context");
        getHolder().addCallback(this);
    }

    /* renamed from: a */
    public void mo125040a(SurfaceHolder surfaceHolder, boolean z) {
        Object obj;
        C87412m.m108594g(surfaceHolder, "holder");
        MagicBrushView.C80321c cVar = this.f261024f;
        if (cVar != null) {
            if (getSurfaceTexture() == null) {
                obj = surfaceHolder.getSurface();
            } else {
                obj = getSurfaceTexture();
                C87412m.m108591d(obj);
            }
            C87412m.m108593f(obj, "when (getSurfaceTexture(…-> getSurfaceTexture()!!}");
            cVar.mo55505e(obj, z);
        }
    }

    public Object getSurface() {
        return MagicBrushView.C80319b.C80320a.m97787a(this);
    }

    public Object getSurfaceTexture() {
        return null;
    }

    public View getThisView() {
        return this.f261022d;
    }

    public MagicBrushView.C80327h getViewType() {
        return this.f261023e;
    }

    /* renamed from: l */
    public void mo111654l(boolean z, int i, C32226l<? super Boolean, Void> lVar, MBRuntime mBRuntime) {
        C87412m.m108594g(lVar, "callback");
        C87412m.m108594g(mBRuntime, "runtime");
        lVar.invoke(Boolean.TRUE);
    }

    public void onDestroy() {
    }

    public void setSurfaceListener(MagicBrushView.C80321c cVar) {
        this.f261024f = cVar;
    }

    public void surfaceChanged(SurfaceHolder surfaceHolder, int i, int i2, int i3) {
        Object obj;
        C87412m.m108594g(surfaceHolder, "holder");
        MagicBrushView.C80321c cVar = this.f261024f;
        if (cVar != null) {
            if (getSurfaceTexture() == null) {
                obj = surfaceHolder.getSurface();
            } else {
                obj = getSurfaceTexture();
                C87412m.m108591d(obj);
            }
            C87412m.m108593f(obj, "when (getSurfaceTexture(…-> getSurfaceTexture()!!}");
            cVar.mo55504b(obj, i2, i3);
        }
    }

    public void surfaceCreated(SurfaceHolder surfaceHolder) {
        Object obj;
        C87412m.m108594g(surfaceHolder, "holder");
        Rect surfaceFrame = surfaceHolder.getSurfaceFrame();
        MagicBrushView.C80321c cVar = this.f261024f;
        if (cVar != null) {
            if (getSurfaceTexture() == null) {
                obj = surfaceHolder.getSurface();
            } else {
                obj = getSurfaceTexture();
                C87412m.m108591d(obj);
            }
            Object obj2 = obj;
            C87412m.m108593f(obj2, "when (getSurfaceTexture(…-> getSurfaceTexture()!!}");
            MagicBrushView.C80321c.C80322a.m97791a(cVar, obj2, surfaceFrame.width(), surfaceFrame.height(), false, false, 16, (Object) null);
        }
    }

    public void surfaceDestroyed(SurfaceHolder surfaceHolder) {
        C87412m.m108594g(surfaceHolder, "holder");
        mo125040a(surfaceHolder, false);
    }
}

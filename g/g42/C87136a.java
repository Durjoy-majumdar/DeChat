package g42;

import android.content.Context;
import android.view.Surface;
import android.view.View;
import com.tencent.magicbrush.C80301a;
import com.tencent.magicbrush.MBRuntime;
import com.tencent.magicbrush.p941ui.MagicBrushView;
import com.tencent.p014mm.sdk.platformtools.Log;
import fy3.C32226l;
import gy3.C87412m;

/* renamed from: g42.a */
public final class C87136a implements MagicBrushView.C80319b {

    /* renamed from: d */
    public MagicBrushView.C80321c f252725d;

    /* renamed from: e */
    public Surface f252726e;

    /* renamed from: f */
    public final MagicBrushView f252727f;

    public C87136a(Context context, C80301a aVar) {
        C87412m.m108594g(context, "context");
        C87412m.m108594g(aVar, "magicBrush");
        MagicBrushView magicBrushView = new MagicBrushView(context, (MagicBrushView.C80319b) this);
        magicBrushView.setEnableTouchEvent(false);
        magicBrushView.setMagicBrush(aVar);
        this.f252727f = magicBrushView;
    }

    public Object getSurface() {
        return this.f252726e;
    }

    public View getThisView() {
        return this.f252727f;
    }

    public MagicBrushView.C80327h getViewType() {
        return MagicBrushView.C80327h.SurfaceView;
    }

    /* renamed from: l */
    public void mo111654l(boolean z, int i, C32226l<? super Boolean, Void> lVar, MBRuntime mBRuntime) {
        C87412m.m108594g(lVar, "callback");
        C87412m.m108594g(mBRuntime, "runtime");
        lVar.invoke(Boolean.FALSE);
    }

    public void onDestroy() {
        Log.m105924i("MicroMsg.MBRendererView", "onDestroy() called");
        this.f252726e = null;
        this.f252725d = null;
    }

    public void setSurfaceListener(MagicBrushView.C80321c cVar) {
        Log.m105924i("MicroMsg.MBRendererView", "setSurfaceListener() called with: l = " + cVar);
        this.f252725d = cVar;
    }
}

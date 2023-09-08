package m82;

import android.graphics.SurfaceTexture;
import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import fy3.C32226l;
import gy3.C87412m;
import gy3.C87413o;
import m82.C109548c;
import rx3.C13598b0;

/* renamed from: m82.e */
public final class C109553e extends C87413o implements C32226l<SurfaceTexture, C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ String f327926d;

    /* renamed from: e */
    public final /* synthetic */ C109548c.C109549a f327927e;

    /* renamed from: f */
    public final /* synthetic */ C109548c f327928f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C109553e(String str, C109548c.C109549a aVar, C109548c cVar) {
        super(1);
        this.f327926d = str;
        this.f327927e = aVar;
        this.f327928f = cVar;
    }

    public Object invoke(Object obj) {
        SurfaceTexture surfaceTexture = (SurfaceTexture) obj;
        C87412m.m108594g(surfaceTexture, LocaleUtil.ITALIAN);
        Log.m105924i("MicroMsg.MTR.RenderTargetHolder", "onSurfaceTextureDestroyed " + this.f327926d + ' ' + surfaceTexture);
        C109548c.C109550b a = this.f327927e.mo160777a();
        if (C87412m.m108589b(a != null ? a.getRenderTarget() : null, surfaceTexture)) {
            this.f327928f.mo160775a(this.f327927e);
        } else {
            Log.m105920e("MicroMsg.MTR.RenderTargetHolder", "bindOutputView: not current surface");
        }
        return C13598b0.f38549a;
    }
}

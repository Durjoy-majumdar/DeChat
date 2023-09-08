package m82;

import android.graphics.SurfaceTexture;
import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import fy3.C32226l;
import gy3.C87412m;
import gy3.C87413o;
import m82.C109548c;
import rx3.C13598b0;

/* renamed from: m82.d */
public final class C109552d extends C87413o implements C32226l<SurfaceTexture, C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ String f327924d;

    /* renamed from: e */
    public final /* synthetic */ C109548c.C109549a f327925e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C109552d(String str, C109548c.C109549a aVar) {
        super(1);
        this.f327924d = str;
        this.f327925e = aVar;
    }

    public Object invoke(Object obj) {
        SurfaceTexture surfaceTexture = (SurfaceTexture) obj;
        C87412m.m108594g(surfaceTexture, LocaleUtil.ITALIAN);
        Log.m105924i("MicroMsg.MTR.RenderTargetHolder", "onSurfaceTextureAvailable " + this.f327924d + ' ' + surfaceTexture);
        C109548c.C109550b a = this.f327925e.mo160777a();
        if (C87412m.m108589b(a != null ? a.getRenderTarget() : null, surfaceTexture)) {
            Log.m105924i("MicroMsg.MTR.RenderTargetHolder", "bindOutputView: set inUse");
            this.f327925e.f327922e = true;
        }
        return C13598b0.f38549a;
    }
}

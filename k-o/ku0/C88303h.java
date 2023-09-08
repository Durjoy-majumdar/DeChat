package ku0;

import android.graphics.SurfaceTexture;
import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import fy3.C32226l;
import gy3.C87412m;
import gy3.C87413o;
import rx3.C13598b0;

/* renamed from: ku0.h */
public final class C88303h extends C87413o implements C32226l<SurfaceTexture, C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ C88288a f255253d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C88303h(C88288a aVar) {
        super(1);
        this.f255253d = aVar;
    }

    public Object invoke(Object obj) {
        SurfaceTexture surfaceTexture = (SurfaceTexture) obj;
        C87412m.m108594g(surfaceTexture, LocaleUtil.ITALIAN);
        this.f255253d.onFrameAvailable(surfaceTexture);
        return C13598b0.f38549a;
    }
}

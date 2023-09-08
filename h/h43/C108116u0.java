package h43;

import android.graphics.SurfaceTexture;
import com.tencent.p014mm.plugin.voip.model.v2protocal;
import fy3.C32226l;
import gy3.C87412m;
import gy3.C87413o;
import rx3.C13598b0;

/* renamed from: h43.u0 */
public final class C108116u0 extends C87413o implements C32226l<C108073f, C13598b0> {

    /* renamed from: d */
    public static final C108116u0 f323755d = new C108116u0();

    public C108116u0() {
        super(1);
    }

    public Object invoke(Object obj) {
        SurfaceTexture surfaceTexture;
        C108073f fVar = (C108073f) obj;
        C87412m.m108594g(fVar, "renderer");
        if (v2protocal.f317545f2 == null && (surfaceTexture = fVar.f323621n) != null) {
            v2protocal.f317547h2 = surfaceTexture;
            v2protocal.f317546g2 = fVar.f323618k;
            v2protocal.f317545f2 = fVar.f323622o;
        }
        return C13598b0.f38549a;
    }
}

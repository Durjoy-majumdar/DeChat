package vp3;

import android.view.Surface;
import com.tencent.tav.decoder.RenderContext;
import fy3.C32224a;
import gy3.C87413o;
import rx3.C13598b0;

/* renamed from: vp3.k */
public final class C111598k extends C87413o implements C32224a<C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ C111592h f334058d;

    /* renamed from: e */
    public final /* synthetic */ Surface f334059e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C111598k(C111592h hVar, Surface surface) {
        super(0);
        this.f334058d = hVar;
        this.f334059e = surface;
    }

    public Object invoke() {
        RenderContext renderContext = this.f334058d.f334037f;
        if (renderContext != null) {
            renderContext.setSurface(this.f334059e);
        }
        return C13598b0.f38549a;
    }
}

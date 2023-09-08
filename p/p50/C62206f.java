package p50;

import android.graphics.SurfaceTexture;
import fy3.C32226l;
import gy3.C87412m;
import gy3.C87413o;
import rx3.C13598b0;

/* renamed from: p50.f */
public final class C62206f extends C87413o implements C32226l<SurfaceTexture, C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ C62197e f176842d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C62206f(C62197e eVar) {
        super(1);
        this.f176842d = eVar;
    }

    public Object invoke(Object obj) {
        SurfaceTexture surfaceTexture = (SurfaceTexture) obj;
        C87412m.m108594g(surfaceTexture, "surfaceTexture");
        this.f176842d.f173031q.mo162268c(surfaceTexture);
        return C13598b0.f38549a;
    }
}

package j50;

import android.graphics.SurfaceTexture;
import com.tencent.p014mm.sdk.platformtools.Log;
import fy3.C32226l;
import gy3.C87412m;
import gy3.C87413o;
import rx3.C13598b0;

/* renamed from: j50.o */
public final class C60767o extends C87413o implements C32226l<SurfaceTexture, C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ C60735a f173087d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C60767o(C60735a aVar) {
        super(1);
        this.f173087d = aVar;
    }

    public Object invoke(Object obj) {
        SurfaceTexture surfaceTexture = (SurfaceTexture) obj;
        C87412m.m108594g(surfaceTexture, "surfaceTexture");
        Log.m105924i("MicroMsg.LiveCore", "startPreviewToRemote onViewCreated");
        this.f173087d.f173031q.mo162268c(surfaceTexture);
        return C13598b0.f38549a;
    }
}

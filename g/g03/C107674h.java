package g03;

import android.graphics.SurfaceTexture;
import android.view.Surface;
import com.tencent.p014mm.sdk.platformtools.Log;
import fy3.C32226l;
import gy3.C87413o;
import h03.C107989a;
import h03.C107999j;
import rx3.C13598b0;

/* renamed from: g03.h */
public final class C107674h extends C87413o implements C32226l<SurfaceTexture, C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ C107666c f322134d;

    /* renamed from: e */
    public final /* synthetic */ C107999j f322135e;

    /* renamed from: f */
    public final /* synthetic */ C107989a f322136f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C107674h(C107666c cVar, C107999j jVar, C107989a aVar) {
        super(1);
        this.f322134d = cVar;
        this.f322135e = jVar;
        this.f322136f = aVar;
    }

    public Object invoke(Object obj) {
        int i;
        SurfaceTexture surfaceTexture = (SurfaceTexture) obj;
        String str = this.f322134d.f322101g;
        Log.m105924i(str, "real set videoPlayer inputSurface:" + surfaceTexture);
        C107999j jVar = this.f322135e;
        String str2 = jVar.f323429k;
        Log.m105924i(str2, "setInputSurface:" + surfaceTexture);
        if (surfaceTexture != null) {
            String str3 = jVar.f323429k;
            Log.m105924i(str3, "setInputSurface, default buffer size:[" + jVar.f323433o + ", " + jVar.f323434p + ']');
            int i2 = jVar.f323433o;
            if (i2 > 0 && (i = jVar.f323434p) > 0) {
                surfaceTexture.setDefaultBufferSize(i2, i);
            }
            jVar.f323430l.mo85606d(new Surface(surfaceTexture), false);
        } else {
            jVar.f323430l.mo85606d((Surface) null, false);
        }
        C107666c cVar = this.f322134d;
        cVar.getClass();
        if (surfaceTexture != null) {
            surfaceTexture.setOnFrameAvailableListener(new C107677l(cVar, surfaceTexture));
        }
        this.f322136f.f323392j = true;
        return C13598b0.f38549a;
    }
}

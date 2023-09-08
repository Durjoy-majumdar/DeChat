package mz1;

import android.graphics.SurfaceTexture;
import android.view.Surface;
import com.tencent.p014mm.sdk.platformtools.Log;
import fy3.C32226l;
import gy3.C87413o;
import mz1.C88870s;
import rx3.C13598b0;

/* renamed from: mz1.g */
public final class C88863g extends C87413o implements C32226l<SurfaceTexture, C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ C88870s.C88871a f256317d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C88863g(C88870s.C88871a aVar) {
        super(1);
        this.f256317d = aVar;
    }

    public Object invoke(Object obj) {
        C13598b0 b0Var;
        SurfaceTexture surfaceTexture = (SurfaceTexture) obj;
        if (surfaceTexture != null) {
            C88870s.C88871a aVar = this.f256317d;
            Log.m105924i("MicroMsg.GameLiveMainRenderMgrService", "get surface");
            aVar.mo112615a(new Surface(surfaceTexture));
            b0Var = C13598b0.f38549a;
        } else {
            b0Var = null;
        }
        if (b0Var == null) {
            C88870s.C88871a aVar2 = this.f256317d;
            Log.m105928w("MicroMsg.GameLiveMainRenderMgrService", "renderMgr get surfaceTexture is null");
            aVar2.mo112615a((Surface) null);
        }
        return C13598b0.f38549a;
    }
}

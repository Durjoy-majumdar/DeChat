package g03;

import android.graphics.SurfaceTexture;
import com.tencent.p014mm.sdk.platformtools.Log;

/* renamed from: g03.l */
public final class C107677l implements SurfaceTexture.OnFrameAvailableListener {

    /* renamed from: d */
    public final /* synthetic */ C107666c f322139d;

    /* renamed from: e */
    public final /* synthetic */ SurfaceTexture f322140e;

    public C107677l(C107666c cVar, SurfaceTexture surfaceTexture) {
        this.f322139d = cVar;
        this.f322140e = surfaceTexture;
    }

    public final void onFrameAvailable(SurfaceTexture surfaceTexture) {
        Log.m105924i(this.f322139d.f322101g, "first frame available");
        this.f322139d.mo158089l();
        this.f322140e.setOnFrameAvailableListener((SurfaceTexture.OnFrameAvailableListener) null);
    }
}

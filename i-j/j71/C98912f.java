package j71;

import android.graphics.SurfaceTexture;
import com.tencent.p014mm.sdk.platformtools.Log;

/* renamed from: j71.f */
public final class C98912f implements SurfaceTexture.OnFrameAvailableListener {

    /* renamed from: d */
    public final /* synthetic */ C108587c f289953d;

    public C98912f(C108587c cVar) {
        this.f289953d = cVar;
    }

    public final void onFrameAvailable(SurfaceTexture surfaceTexture) {
        C108587c cVar = this.f289953d;
        cVar.getClass();
        Log.m105924i("MicroMsg.EmojiCaptureEGLPixelBuffer", "onVideoSurfaceFrameAvailable");
        cVar.f325062k.post(new C98914h(new C98913g(cVar)));
    }
}

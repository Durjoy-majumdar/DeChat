package a43;

import android.graphics.SurfaceTexture;
import com.tencent.p014mm.sdk.platformtools.Log;

/* renamed from: a43.l */
public final class C103318l extends SurfaceTexture {

    /* renamed from: a */
    public final String f304623a = "MicroMsg.VoipSurfaceTexture";

    public C103318l(int i) {
        super(i);
        try {
            detachFromGLContext();
        } catch (Exception unused) {
            Log.m105924i(this.f304623a, "detachFromGLContext  in init error");
        }
    }
}

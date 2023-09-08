package a43;

import com.tencent.p014mm.plugin.voip.video.OpenGlRender;
import com.tencent.p014mm.sdk.platformtools.Log;
import f43.C107476d;
import p80.C110194c;

/* renamed from: a43.c */
public class C103304c implements Runnable {
    public C103304c(OpenGlRender openGlRender) {
    }

    public void run() {
        C107476d b = C107476d.m145590b();
        b.getClass();
        try {
            if (b.f321555c != null) {
                C110194c cVar = b.f321554b;
                if (cVar != null) {
                    cVar.close();
                }
                b.f321555c.release();
                b.f321555c = null;
                Log.m105924i("MicroMsg.VoipHardDecodeUtil", "uninit surface texture");
            }
        } catch (Exception e) {
            Log.printErrStackTrace("MicroMsg.VoipHardDecodeUtil", e, "uninitSurfaceTexture error", new Object[0]);
        }
        int i = OpenGlRender.f318118B;
        Log.m105924i("OpenGlRender", "releaseSurfaceTexture call finish");
        Object obj = OpenGlRender.f318121E;
        synchronized (obj) {
            try {
                obj.notifyAll();
            } catch (Exception e2) {
                int i2 = OpenGlRender.f318118B;
                Log.printErrStackTrace("OpenGlRender", e2, "", new Object[0]);
            }
        }
    }
}

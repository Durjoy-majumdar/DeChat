package j50;

import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.trtc.TRTCCloudDef;
import fy3.C32226l;
import gy3.C87413o;
import p80.C110194c;
import rx3.C13598b0;

/* renamed from: j50.q */
public final class C60769q extends C87413o implements C32226l<C110194c, C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ C60735a f173089d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C60769q(C60735a aVar) {
        super(1);
        this.f173089d = aVar;
    }

    public Object invoke(Object obj) {
        C110194c cVar = (C110194c) obj;
        C60735a aVar = this.f173089d;
        if (aVar.f172990B) {
            if (aVar.f172989A.f166264k) {
                Log.m105924i("MicroMsg.LiveCore", "skip sendCustomVideoData by isDocMode:" + this.f173089d.f172989A.f166264k);
                C60735a.m71076L(this.f173089d);
            } else if (cVar != null) {
                aVar.f173027n.eglContext14 = aVar.f173031q.getEGLContext();
                TRTCCloudDef.TRTCTexture tRTCTexture = aVar.f173027n;
                tRTCTexture.textureId = cVar.f329652e;
                TRTCCloudDef.TRTCVideoFrame tRTCVideoFrame = aVar.f173026j;
                tRTCVideoFrame.texture = tRTCTexture;
                tRTCVideoFrame.width = cVar.f329657j;
                tRTCVideoFrame.height = cVar.f329658n;
                tRTCVideoFrame.pixelFormat = 2;
                tRTCVideoFrame.bufferType = 3;
                aVar.mo85679W().sendCustomVideoData(aVar.f173026j);
            }
        }
        return C13598b0.f38549a;
    }
}

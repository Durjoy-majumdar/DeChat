package j50;

import com.tencent.trtc.TRTCCloudDef;
import fy3.C32228q;
import gy3.C87413o;
import rx3.C13598b0;
import s50.C110755r;
import w80.C111742d;

/* renamed from: j50.e */
public final class C60755e extends C87413o implements C32228q<Integer, Integer, Integer, C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ C110755r f173068d;

    /* renamed from: e */
    public final /* synthetic */ C60735a f173069e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C60755e(C110755r rVar, C60735a aVar) {
        super(3);
        this.f173068d = rVar;
        this.f173069e = aVar;
    }

    public Object invoke(Object obj, Object obj2, Object obj3) {
        int intValue = ((Number) obj).intValue();
        int intValue2 = ((Number) obj2).intValue();
        int intValue3 = ((Number) obj3).intValue();
        C110755r rVar = this.f173068d;
        C60735a aVar = this.f173069e;
        TRTCCloudDef.TRTCTexture tRTCTexture = aVar.f173027n;
        C111742d.C65942b bVar = rVar.f331265k;
        tRTCTexture.eglContext14 = bVar != null ? bVar.f189593c : null;
        tRTCTexture.textureId = intValue;
        TRTCCloudDef.TRTCVideoFrame tRTCVideoFrame = aVar.f173026j;
        tRTCVideoFrame.texture = tRTCTexture;
        tRTCVideoFrame.pixelFormat = 2;
        tRTCVideoFrame.bufferType = 3;
        tRTCVideoFrame.width = intValue2;
        tRTCVideoFrame.height = intValue3;
        aVar.mo85679W().sendCustomVideoData(aVar.f173026j);
        return C13598b0.f38549a;
    }
}

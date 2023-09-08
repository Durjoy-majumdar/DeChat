package r80;

import android.media.MediaCodec;
import android.media.MediaFormat;
import android.os.HandlerThread;
import com.tencent.p014mm.sdk.platformtools.Log;
import fy3.C32229r;
import gy3.C87412m;
import gy3.C87413o;
import java.nio.ByteBuffer;
import m80.C109537f;
import rx3.C13598b0;

/* renamed from: r80.j */
public final class C110529j extends C87413o implements C32229r<ByteBuffer, Long, MediaCodec.BufferInfo, Boolean, C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ C110536p f330524d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C110529j(C110536p pVar) {
        super(4);
        this.f330524d = pVar;
    }

    /* renamed from: I */
    public Object mo162I(Object obj, Object obj2, Object obj3, Object obj4) {
        ByteBuffer byteBuffer = (ByteBuffer) obj;
        long longValue = ((Number) obj2).longValue();
        ((Boolean) obj4).booleanValue();
        C87412m.m108594g((MediaCodec.BufferInfo) obj3, "<anonymous parameter 2>");
        String str = this.f330524d.f330546g;
        StringBuilder sb = new StringBuilder();
        sb.append("onDecode, format:");
        C109537f fVar = this.f330524d.f330541b;
        MediaFormat mediaFormat = null;
        sb.append(fVar != null ? fVar.f327873g : null);
        sb.append(", pts:");
        sb.append(longValue);
        Log.m105924i(str, sb.toString());
        C110536p pVar = this.f330524d;
        synchronized (pVar.f330544e) {
            C109537f fVar2 = pVar.f330541b;
            if (fVar2 != null) {
                mediaFormat = fVar2.f327873g;
            }
            if (!pVar.f330543d) {
                Log.m105924i(pVar.f330546g, "stopDecoder");
                C109537f fVar3 = pVar.f330541b;
                if (fVar3 != null) {
                    fVar3.mo145767c();
                }
                HandlerThread handlerThread = pVar.f330547h;
                if (handlerThread != null) {
                    handlerThread.quitSafely();
                }
                pVar.f330545f.post(new C110523i(pVar, mediaFormat));
                pVar.f330543d = true;
            }
        }
        return C13598b0.f38549a;
    }
}

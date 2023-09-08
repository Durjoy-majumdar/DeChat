package h23;

import android.media.MediaCodec;
import com.tencent.p014mm.sdk.platformtools.Log;
import fy3.C32227p;
import gy3.C87412m;
import gy3.C87413o;
import java.nio.ByteBuffer;
import rx3.C13598b0;

/* renamed from: h23.n */
public final class C108035n extends C87413o implements C32227p<ByteBuffer, MediaCodec.BufferInfo, C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ C108038q f323515d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C108035n(C108038q qVar) {
        super(2);
        this.f323515d = qVar;
    }

    public Object invoke(Object obj, Object obj2) {
        ByteBuffer byteBuffer = (ByteBuffer) obj;
        MediaCodec.BufferInfo bufferInfo = (MediaCodec.BufferInfo) obj2;
        C87412m.m108594g(byteBuffer, "byteBuffer");
        C87412m.m108594g(bufferInfo, "bufferInfo");
        StringBuilder sb = new StringBuilder();
        sb.append("writeH264Data  ,bufferInfo.size : ");
        sb.append(bufferInfo.size);
        sb.append("  frameCount :");
        C108038q qVar = this.f323515d;
        int i = qVar.f323524g;
        qVar.f323524g = i + 1;
        sb.append(i);
        sb.append("  presentationTimeUs:");
        sb.append(bufferInfo.presentationTimeUs);
        Log.m105924i("MicroMsg.VLogRemuxer", sb.toString());
        this.f323515d.f323535r.mo161990e(byteBuffer, bufferInfo);
        return C13598b0.f38549a;
    }
}

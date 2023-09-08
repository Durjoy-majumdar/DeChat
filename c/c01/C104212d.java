package c01;

import android.media.MediaCodec;
import fy3.C32227p;
import gy3.C87412m;
import gy3.C87413o;
import java.nio.ByteBuffer;
import rx3.C13598b0;

/* renamed from: c01.d */
public final class C104212d extends C87413o implements C32227p<ByteBuffer, MediaCodec.BufferInfo, C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ C104224p f308501d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C104212d(C104224p pVar) {
        super(2);
        this.f308501d = pVar;
    }

    public Object invoke(Object obj, Object obj2) {
        ByteBuffer byteBuffer = (ByteBuffer) obj;
        MediaCodec.BufferInfo bufferInfo = (MediaCodec.BufferInfo) obj2;
        C87412m.m108594g(byteBuffer, "data");
        C87412m.m108594g(bufferInfo, "bufferInfo");
        C104224p.m139027b(this.f308501d, bufferInfo, byteBuffer);
        return C13598b0.f38549a;
    }
}

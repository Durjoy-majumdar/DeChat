package h23;

import android.media.MediaCodec;
import android.media.MediaFormat;
import com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys;
import fy3.C32228q;
import gy3.C87412m;
import gy3.C87413o;
import java.nio.ByteBuffer;
import rx3.C13598b0;

/* renamed from: h23.h */
public final class C108029h extends C87413o implements C32228q<ByteBuffer, MediaCodec.BufferInfo, MediaFormat, C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ C108038q f323508d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C108029h(C108038q qVar) {
        super(3);
        this.f323508d = qVar;
    }

    public Object invoke(Object obj, Object obj2, Object obj3) {
        ByteBuffer byteBuffer = (ByteBuffer) obj;
        MediaCodec.BufferInfo bufferInfo = (MediaCodec.BufferInfo) obj2;
        MediaFormat mediaFormat = (MediaFormat) obj3;
        C87412m.m108594g(byteBuffer, "buffer");
        C87412m.m108594g(bufferInfo, "bufferInfo");
        C87412m.m108594g(mediaFormat, TPReportKeys.PlayerStep.PLAYER_FORMAT);
        this.f323508d.f323535r.mo161989c(byteBuffer, bufferInfo, mediaFormat);
        return C13598b0.f38549a;
    }
}

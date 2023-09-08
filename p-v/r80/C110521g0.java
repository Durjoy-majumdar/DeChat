package r80;

import android.media.MediaCodec;
import android.media.MediaFormat;
import com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys;
import fy3.C32228q;
import gy3.C87412m;
import gy3.C87413o;
import java.nio.ByteBuffer;
import r80.C110524i0;
import rx3.C13598b0;

/* renamed from: r80.g0 */
public final class C110521g0 extends C87413o implements C32228q<ByteBuffer, MediaCodec.BufferInfo, MediaFormat, C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ C110538r f330500d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C110521g0(C110538r rVar) {
        super(3);
        this.f330500d = rVar;
    }

    public Object invoke(Object obj, Object obj2, Object obj3) {
        C32228q<? super ByteBuffer, ? super MediaCodec.BufferInfo, ? super MediaFormat, C13598b0> qVar;
        ByteBuffer byteBuffer = (ByteBuffer) obj;
        MediaCodec.BufferInfo bufferInfo = (MediaCodec.BufferInfo) obj2;
        MediaFormat mediaFormat = (MediaFormat) obj3;
        C87412m.m108594g(byteBuffer, "buffer");
        C87412m.m108594g(bufferInfo, "bufferInfo");
        C87412m.m108594g(mediaFormat, TPReportKeys.PlayerStep.PLAYER_FORMAT);
        C110524i0 i0Var = this.f330500d.f330570T;
        if (!(i0Var == null || (qVar = i0Var.f330517m) == null)) {
            ((C110524i0.C110525a) qVar).invoke(byteBuffer, bufferInfo, mediaFormat);
        }
        return C13598b0.f38549a;
    }
}

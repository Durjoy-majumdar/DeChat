package bh2;

import android.media.MediaCodec;
import com.tencent.p014mm.sdk.platformtools.Log;
import fy3.C32227p;
import gy3.C87412m;
import gy3.C87413o;
import java.nio.ByteBuffer;
import r80.C110524i0;
import rx3.C13598b0;

/* renamed from: bh2.q */
public final class C104131q extends C87413o implements C32227p<ByteBuffer, MediaCodec.BufferInfo, C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ C104119h f308112d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C104131q(C104119h hVar) {
        super(2);
        this.f308112d = hVar;
    }

    public Object invoke(Object obj, Object obj2) {
        C13598b0 b0Var;
        C32227p<? super ByteBuffer, ? super MediaCodec.BufferInfo, C13598b0> pVar;
        ByteBuffer byteBuffer = (ByteBuffer) obj;
        MediaCodec.BufferInfo bufferInfo = (MediaCodec.BufferInfo) obj2;
        C87412m.m108594g(byteBuffer, "byteBuffer");
        C87412m.m108594g(bufferInfo, "bufferInfo");
        String str = this.f308112d.f308081m;
        Log.m105924i(str, "onEncode: " + this.f308112d.f308064L + ", isDecodeEnd:" + this.f308112d.f308066N + ", drawFrameCount:" + this.f308112d.f308065M + ", decodeFrameCount:" + this.f308112d.f308063K);
        C104119h hVar = this.f308112d;
        hVar.f308064L = hVar.f308064L + 1;
        C110524i0 i0Var = hVar.f308057E;
        if (i0Var == null || (pVar = i0Var.f330516l) == null) {
            b0Var = null;
        } else {
            ((C110524i0.C110528d) pVar).invoke(byteBuffer, bufferInfo);
            b0Var = C13598b0.f38549a;
        }
        C87412m.m108591d(b0Var);
        C104119h.m138955e(this.f308112d);
        return C13598b0.f38549a;
    }
}

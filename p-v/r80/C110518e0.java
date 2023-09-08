package r80;

import android.media.MediaCodec;
import androidx.camera.core.FocusMeteringAction;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.platformtools.Log;
import fy3.C32227p;
import gy3.C87412m;
import gy3.C87413o;
import java.nio.ByteBuffer;
import r80.C110524i0;
import rx3.C13598b0;
import zt3.C119157j;
import zt3.C119179t;

/* renamed from: r80.e0 */
public final class C110518e0 extends C87413o implements C32227p<ByteBuffer, MediaCodec.BufferInfo, C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ C110538r f330497d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C110518e0(C110538r rVar) {
        super(2);
        this.f330497d = rVar;
    }

    public Object invoke(Object obj, Object obj2) {
        C13598b0 b0Var;
        C32227p<? super ByteBuffer, ? super MediaCodec.BufferInfo, C13598b0> pVar;
        ByteBuffer byteBuffer = (ByteBuffer) obj;
        MediaCodec.BufferInfo bufferInfo = (MediaCodec.BufferInfo) obj2;
        C87412m.m108594g(byteBuffer, "byteBuffer");
        C87412m.m108594g(bufferInfo, "bufferInfo");
        String str = this.f330497d.f330612w;
        Log.m105924i(str, "onEncode: " + this.f330497d.f330580b0 + ", isDecodeEnd:" + this.f330497d.f330592h0 + ", drawFrameCount:" + this.f330497d.f330582c0 + ", decodeFrameCount:" + this.f330497d.f330578a0 + ", " + bufferInfo.presentationTimeUs);
        C110538r rVar = this.f330497d;
        rVar.f330580b0 = rVar.f330580b0 + 1;
        C110524i0 i0Var = rVar.f330570T;
        if (i0Var == null || (pVar = i0Var.f330516l) == null) {
            b0Var = null;
        } else {
            ((C110524i0.C110528d) pVar).invoke(byteBuffer, bufferInfo);
            b0Var = C13598b0.f38549a;
        }
        C87412m.m108591d(b0Var);
        C110538r.m150463e(this.f330497d);
        if (this.f330497d.f330584d0 != 0) {
            long currentTimeMillis = System.currentTimeMillis() - this.f330497d.f330584d0;
            Log.m105924i("MicroMsg.MediaEditorIDKeyStat", "markFrameHandlingTime time:" + currentTimeMillis);
            if (currentTimeMillis < 1000) {
                C115669n.INSTANCE.mo175913w(986, 130, 1);
            } else if (currentTimeMillis < 2000) {
                C115669n.INSTANCE.mo175913w(986, 131, 1);
            } else if (currentTimeMillis < 3000) {
                C115669n.INSTANCE.mo175913w(986, 132, 1);
            } else if (currentTimeMillis < 4000) {
                C115669n.INSTANCE.mo175913w(986, 133, 1);
            } else if (currentTimeMillis < FocusMeteringAction.DEFAULT_AUTOCANCEL_DURATION) {
                C115669n.INSTANCE.mo175913w(986, 134, 1);
            } else if (currentTimeMillis < 6000) {
                C115669n.INSTANCE.mo175913w(986, 135, 1);
            } else if (currentTimeMillis < 7000) {
                C115669n.INSTANCE.mo175913w(986, 136, 1);
            } else if (currentTimeMillis < 8000) {
                C115669n.INSTANCE.mo175913w(986, 137, 1);
            } else if (currentTimeMillis < 9000) {
                C115669n.INSTANCE.mo175913w(986, 138, 1);
            } else if (currentTimeMillis < 10000) {
                C115669n.INSTANCE.mo175913w(986, 139, 1);
            } else if (currentTimeMillis < 15000) {
                C115669n.INSTANCE.mo175913w(986, 140, 1);
            } else if (currentTimeMillis < 20000) {
                C115669n.INSTANCE.mo175913w(986, 141, 1);
            } else {
                C115669n.INSTANCE.mo175913w(986, 142, 1);
            }
        }
        this.f330497d.f330584d0 = System.currentTimeMillis();
        this.f330497d.f330600l0.mo97819a();
        C119179t tVar = C119157j.f356862d;
        C110538r rVar2 = this.f330497d;
        ((C119157j) tVar).mo183878i(rVar2.f330600l0, (long) rVar2.f330590g0);
        return C13598b0.f38549a;
    }
}

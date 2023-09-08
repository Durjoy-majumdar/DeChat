package r80;

import android.graphics.Bitmap;
import android.media.MediaCodec;
import com.tencent.p014mm.sdk.platformtools.Log;
import fy3.C32226l;
import fy3.C32229r;
import gy3.C87412m;
import gy3.C87413o;
import java.nio.ByteBuffer;
import m80.C109537f;
import rx3.C13598b0;

/* renamed from: r80.a0 */
public final class C110511a0 extends C87413o implements C32229r<ByteBuffer, Long, MediaCodec.BufferInfo, Boolean, C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ C110538r f330476d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C110511a0(C110538r rVar) {
        super(4);
        this.f330476d = rVar;
    }

    /* renamed from: I */
    public Object mo162I(Object obj, Object obj2, Object obj3, Object obj4) {
        C109537f fVar;
        ByteBuffer byteBuffer = (ByteBuffer) obj;
        long longValue = ((Number) obj2).longValue();
        boolean booleanValue = ((Boolean) obj4).booleanValue();
        C87412m.m108594g((MediaCodec.BufferInfo) obj3, "<anonymous parameter 2>");
        C110538r rVar = this.f330476d;
        rVar.f330578a0++;
        if (!booleanValue && (fVar = rVar.f330555E) != null) {
            fVar.mo145768d(true);
        }
        C110538r rVar2 = this.f330476d;
        long j = rVar2.f330553C;
        long j2 = 0;
        if (j < 0) {
            j2 = longValue;
        } else if (rVar2.f330578a0 == 1) {
            rVar2.f330553C = longValue / ((long) 1000);
        } else {
            j2 = longValue - (j * ((long) 1000));
        }
        if (!rVar2.f330604o) {
            if (rVar2.f330578a0 == 1) {
                rVar2.f330561K.mo161991f(((long) -1) * ((long) Math.round(((float) 1000) / ((float) rVar2.f330603n))) * 1000);
                this.f330476d.f330586e0++;
            }
            this.f330476d.f330561K.mo161991f(j2);
            this.f330476d.f330586e0++;
        }
        Log.m105924i(this.f330476d.f330612w, "onDecode, drawPts:" + j2 + ", pts:" + longValue + ", remuxStartTime:" + this.f330476d.f330553C);
        C110538r rVar3 = this.f330476d;
        float f = (((float) j2) / ((float) 1000)) / ((float) (rVar3.f330554D - rVar3.f330553C));
        if (f >= 0.9f) {
            f = 0.9f;
        }
        C32226l<? super Float, C13598b0> lVar = rVar3.f330610u;
        if (lVar != null) {
            lVar.invoke(Float.valueOf(f));
        }
        if (this.f330476d.f330596j0) {
            C110538r rVar4 = this.f330476d;
            Bitmap bitmap = rVar4.f330569S;
            if (bitmap != null) {
                C110505a aVar = rVar4.f330559I;
                if (aVar != null) {
                    aVar.mo161975d(new C110514c(aVar, true, j2 * ((long) 1000), bitmap, (Bitmap) null));
                }
            } else {
                C110505a aVar2 = rVar4.f330559I;
                if (aVar2 != null) {
                    long j3 = ((long) 1000) * j2;
                    C32226l<? super Long, Bitmap> lVar2 = rVar4.f330568R;
                    Bitmap bitmap2 = null;
                    Bitmap invoke = lVar2 != null ? lVar2.invoke(Long.valueOf(j2)) : null;
                    C32226l<? super Long, Bitmap> lVar3 = this.f330476d.f330571U;
                    if (lVar3 != null) {
                        bitmap2 = lVar3.invoke(Long.valueOf(j2));
                    }
                    aVar2.mo161975d(new C110514c(aVar2, true, j3, invoke, bitmap2));
                }
            }
        }
        return C13598b0.f38549a;
    }
}

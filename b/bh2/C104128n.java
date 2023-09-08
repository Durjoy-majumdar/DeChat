package bh2;

import android.media.MediaCodec;
import com.tencent.p014mm.sdk.platformtools.Log;
import fy3.C32229r;
import gy3.C87412m;
import gy3.C87413o;
import java.nio.ByteBuffer;
import rx3.C13598b0;

/* renamed from: bh2.n */
public final class C104128n extends C87413o implements C32229r<ByteBuffer, Long, MediaCodec.BufferInfo, Boolean, C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ C104119h f308108d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C104128n(C104119h hVar) {
        super(4);
        this.f308108d = hVar;
    }

    /* renamed from: I */
    public Object mo162I(Object obj, Object obj2, Object obj3, Object obj4) {
        C104114f fVar;
        ByteBuffer byteBuffer = (ByteBuffer) obj;
        long longValue = ((Number) obj2).longValue();
        boolean booleanValue = ((Boolean) obj4).booleanValue();
        C87412m.m108594g((MediaCodec.BufferInfo) obj3, "<anonymous parameter 2>");
        C104119h hVar = this.f308108d;
        hVar.f308063K++;
        if (!booleanValue && (fVar = hVar.f308088t) != null) {
            fVar.mo145768d(true);
        }
        C104119h hVar2 = this.f308108d;
        long j = hVar2.f308086r;
        long j2 = j >= 0 ? longValue - (j * ((long) 1000)) : longValue;
        if (!hVar2.f308079k) {
            if (hVar2.f308063K == 1) {
                hVar2.f308092x.mo161991f(((long) -1) * ((long) Math.round(((float) 1000) / ((float) hVar2.f308078j))) * 1000);
            }
            this.f308108d.f308092x.mo161991f(j2);
        }
        Log.m105918d(this.f308108d.f308081m, "onDecode, drawPts:" + j2 + ", pts:" + longValue + ", remuxStartTime:" + this.f308108d.f308086r);
        return C13598b0.f38549a;
    }
}

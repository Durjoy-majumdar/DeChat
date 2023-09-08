package p189kx;

import com.tencent.p014mm.sdk.platformtools.Log;
import di3.C86301e;
import ei3.C86522b;
import p200lx.C99711g0;
import rw3.C13588a;

@C86522b
/* renamed from: kx.l0 */
public final class C10426l0 extends C86301e implements C99711g0 {
    public boolean cq0(int i, int i2) {
        float f = (((float) i2) * 1.0f) / ((float) i);
        int i3 = C13588a.f38533a;
        if (f <= ((float) i3) && f >= 1.0f / ((float) i3)) {
            return false;
        }
        Log.m105928w("MicroMsg.WordDetectImageCompressStrategy", "isOverRatioLimit ratio invalid " + f);
        return true;
    }
}

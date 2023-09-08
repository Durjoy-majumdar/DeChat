package p160gy;

import android.graphics.PointF;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.sdk.platformtools.Log;
import di3.C86301e;
import ei3.C86522b;
import java.util.List;
import p166hy.C8828e0;
import pn3.C100827a;
import rq2.C101425k;
import vr2.C102236a0;

@C86522b
/* renamed from: gy.i0 */
public class C98286i0 extends C86301e implements C8828e0 {
    /* renamed from: OM */
    public boolean mo9661OM(String str, String str2, float f) {
        SnsMethodCalculate.markStartTimeMs("checkGestureDraw", "com.tencent.mm.feature.sns.GestureHelperService");
        SnsMethodCalculate.markStartTimeMs("checkGestureDraw", "com.tencent.mm.plugin.sns.ad.helper.GestureHelper");
        boolean z = false;
        try {
            List<PointF> s0 = C102236a0.m134769s0(str2);
            List<PointF> s05 = C102236a0.m134769s0(str);
            if (!C101425k.m133097a(s0) && !C101425k.m133097a(s05)) {
                double a = C100827a.m132079a(s0, C100827a.m132082d(s05));
                Log.m105925i("GestureHelper", "forwardSimilarity: %f", Double.valueOf(a));
                if (a <= ((double) f)) {
                    SnsMethodCalculate.markEndTimeMs("checkGestureDraw", "com.tencent.mm.plugin.sns.ad.helper.GestureHelper");
                    z = true;
                    SnsMethodCalculate.markEndTimeMs("checkGestureDraw", "com.tencent.mm.feature.sns.GestureHelperService");
                    return z;
                }
            }
        } catch (Exception e) {
            Log.printErrStackTrace("GestureHelper", e, "recog gesture error!", new Object[0]);
        }
        SnsMethodCalculate.markEndTimeMs("checkGestureDraw", "com.tencent.mm.plugin.sns.ad.helper.GestureHelper");
        SnsMethodCalculate.markEndTimeMs("checkGestureDraw", "com.tencent.mm.feature.sns.GestureHelperService");
        return z;
    }
}

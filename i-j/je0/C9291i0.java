package je0;

import com.tencent.p014mm.sdk.platformtools.Log;
import fy3.C32226l;
import gy3.C87413o;
import rx3.C13598b0;

/* renamed from: je0.i0 */
public final class C9291i0 extends C87413o implements C32226l<Boolean, C13598b0> {

    /* renamed from: d */
    public static final C9291i0 f29053d = new C9291i0();

    public C9291i0() {
        super(1);
    }

    public Object invoke(Object obj) {
        boolean booleanValue = ((Boolean) obj).booleanValue();
        if (booleanValue) {
            Log.m105925i("MicroMsg.OpenIMKefuLocationReqController", "reportLocation success=%s", Boolean.valueOf(booleanValue));
        } else {
            Log.m105921e("MicroMsg.OpenIMKefuLocationReqController", "reportLocation success=%s", Boolean.valueOf(booleanValue));
        }
        return C13598b0.f38549a;
    }
}

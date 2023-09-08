package fh1;

import com.tencent.p014mm.sdk.platformtools.Log;
import fy3.C32227p;
import gy3.C87413o;
import rx3.C13598b0;

/* renamed from: fh1.e */
public final class C32050e extends C87413o implements C32227p<Float, Boolean, C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ C58989a f85289d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C32050e(C58989a aVar) {
        super(2);
        this.f85289d = aVar;
    }

    public Object invoke(Object obj, Object obj2) {
        float floatValue = ((Number) obj).floatValue();
        boolean booleanValue = ((Boolean) obj2).booleanValue();
        String str = this.f85289d.f168783j;
        Log.m105924i(str, "startChargeLiveCountDown OutAnim " + floatValue + ",finish:" + booleanValue + '!');
        if (booleanValue) {
            C58989a.m68901F3(this.f85289d);
        }
        return C13598b0.f38549a;
    }
}

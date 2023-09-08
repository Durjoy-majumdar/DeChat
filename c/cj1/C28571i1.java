package cj1;

import com.tencent.p014mm.sdk.platformtools.Log;
import fy3.C32230s;
import gy3.C87412m;
import gy3.C87413o;
import rx3.C13598b0;
import te3.C50262lh0;

/* renamed from: cj1.i1 */
public final class C28571i1 extends C87413o implements C32230s<Boolean, Integer, Integer, String, C50262lh0, C13598b0> {

    /* renamed from: d */
    public static final C28571i1 f78435d = new C28571i1();

    public C28571i1() {
        super(5);
    }

    /* renamed from: D */
    public Object mo237D(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        boolean booleanValue = ((Boolean) obj).booleanValue();
        ((Number) obj2).intValue();
        ((Number) obj3).intValue();
        C50262lh0 lh02 = (C50262lh0) obj5;
        C87412m.m108594g((String) obj4, "errMsg");
        Log.m105924i("FinderLiveExternalHelper", "close live result:" + booleanValue);
        return C13598b0.f38549a;
    }
}

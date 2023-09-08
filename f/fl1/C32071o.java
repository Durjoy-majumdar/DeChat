package fl1;

import com.tencent.p014mm.sdk.platformtools.Log;
import fy3.C32230s;
import gy3.C87412m;
import gy3.C87413o;
import rx3.C13598b0;
import te3.C50262lh0;

/* renamed from: fl1.o */
public final class C32071o extends C87413o implements C32230s<Boolean, Integer, Integer, String, C50262lh0, C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ C59161f f85320d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C32071o(C59161f fVar) {
        super(5);
        this.f85320d = fVar;
    }

    /* renamed from: D */
    public Object mo237D(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        boolean booleanValue = ((Boolean) obj).booleanValue();
        ((Number) obj2).intValue();
        ((Number) obj3).intValue();
        C50262lh0 lh02 = (C50262lh0) obj5;
        C87412m.m108594g((String) obj4, "errMsg");
        String str = this.f85320d.f169228i;
        Log.m105924i(str, "close live result:" + booleanValue);
        return C13598b0.f38549a;
    }
}

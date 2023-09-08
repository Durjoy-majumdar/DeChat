package tm0;

import android.content.Context;
import com.tencent.p014mm.sdk.platformtools.LocationUtil;
import fy3.C32227p;
import gy3.C87412m;
import gy3.C87413o;
import java.util.Map;
import rx3.C13598b0;

/* renamed from: tm0.o0 */
public final class C14033o0 extends C87413o implements C32227p<Context, Map<String, Object>, C13598b0> {

    /* renamed from: d */
    public static final C14033o0 f39386d = new C14033o0();

    public C14033o0() {
        super(2);
    }

    public Object invoke(Object obj, Object obj2) {
        Context context = (Context) obj;
        Map map = (Map) obj2;
        C87412m.m108594g(map, "outRes");
        map.put("locationEnabled", Boolean.valueOf(LocationUtil.isGpsEnable()));
        return C13598b0.f38549a;
    }
}

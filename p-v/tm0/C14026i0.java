package tm0;

import android.content.Context;
import fy3.C32227p;
import gy3.C87412m;
import gy3.C87413o;
import java.util.Map;
import rx3.C13598b0;
import tm0.C14028j0;

/* renamed from: tm0.i0 */
public final class C14026i0 extends C87413o implements C32227p<Context, Map<String, Object>, C13598b0> {

    /* renamed from: d */
    public static final C14026i0 f39379d = new C14026i0();

    public C14026i0() {
        super(2);
    }

    public Object invoke(Object obj, Object obj2) {
        Context context = (Context) obj;
        Map map = (Map) obj2;
        C87412m.m108594g(map, "outRes");
        map.put("phoneCalendarAuthorized", C14028j0.C14030b.m13394a(C14028j0.f39380b, true));
        return C13598b0.f38549a;
    }
}

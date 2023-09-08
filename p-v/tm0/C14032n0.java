package tm0;

import android.content.Context;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import fy3.C32227p;
import gy3.C87412m;
import gy3.C87413o;
import java.util.Map;
import rx3.C13598b0;

/* renamed from: tm0.n0 */
public final class C14032n0 extends C87413o implements C32227p<Context, Map<String, Object>, C13598b0> {

    /* renamed from: d */
    public static final C14032n0 f39385d = new C14032n0();

    public C14032n0() {
        super(2);
    }

    public Object invoke(Object obj, Object obj2) {
        Context context = (Context) obj;
        Map map = (Map) obj2;
        C87412m.m108594g(map, "outRes");
        if (context == null) {
            context = MMApplicationContext.getContext();
        }
        map.put("deviceOrientation", 2 == context.getResources().getConfiguration().orientation ? "landscape" : "portrait");
        return C13598b0.f38549a;
    }
}

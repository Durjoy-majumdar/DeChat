package tm0;

import android.content.Context;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82381f;
import fy3.C32227p;
import gy3.C87412m;
import gy3.C87413o;
import java.util.Map;
import p225rc.C89922k;
import rx3.C13598b0;
import tm0.C14028j0;

/* renamed from: tm0.g0 */
public final class C14024g0 extends C87413o implements C32227p<Context, Map<String, Object>, C13598b0> {

    /* renamed from: d */
    public static final C14024g0 f39377d = new C14024g0();

    public C14024g0() {
        super(2);
    }

    public Object invoke(Object obj, Object obj2) {
        Context context = (Context) obj;
        Map map = (Map) obj2;
        C87412m.m108594g(map, "outRes");
        if (context != null) {
            map.put("microphoneAuthorized", C14028j0.C14030b.m13394a(C14028j0.f39380b, C89922k.m112465b(context, (C82381f) null, "android.permission.RECORD_AUDIO")));
        }
        return C13598b0.f38549a;
    }
}

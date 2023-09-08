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

/* renamed from: tm0.e0 */
public final class C14021e0 extends C87413o implements C32227p<Context, Map<String, Object>, C13598b0> {

    /* renamed from: d */
    public static final C14021e0 f39375d = new C14021e0();

    public C14021e0() {
        super(2);
    }

    public Object invoke(Object obj, Object obj2) {
        Context context = (Context) obj;
        Map map = (Map) obj2;
        C87412m.m108594g(map, "outRes");
        if (context != null) {
            map.put("cameraAuthorized", C14028j0.C14030b.m13394a(C14028j0.f39380b, C89922k.m112465b(context, (C82381f) null, "android.permission.CAMERA")));
        }
        return C13598b0.f38549a;
    }
}

package tm0;

import android.content.Context;
import fy3.C32224a;
import fy3.C32227p;
import gy3.C87413o;
import java.util.Map;
import rx3.C13598b0;
import rx3.C13601g;
import rx3.C13604l;
import rx3.C36568h;
import rx3.C36570n;
import sx3.C90364q0;

/* renamed from: tm0.q0 */
public final class C14035q0 extends C14038s0 {

    /* renamed from: b */
    public static final C13601g<Map<String, C32227p<Context, Map<String, Object>, C13598b0>>> f39388b = C36568h.m40985a(C14036a.f39390d);

    /* renamed from: a */
    public final Map<String, C32227p<Context, Map<String, Object>, C13598b0>> f39389a = ((Map) ((C36570n) f39388b).getValue());

    /* renamed from: tm0.q0$a */
    public static final class C14036a extends C87413o implements C32224a<Map<String, ? extends C32227p<? super Context, ? super Map<String, Object>, ? extends C13598b0>>> {

        /* renamed from: d */
        public static final C14036a f39390d = new C14036a();

        public C14036a() {
            super(0);
        }

        public Object invoke() {
            return C90364q0.m113147f(new C13604l("bluetoothEnabled", C14031m0.f39384d), new C13604l("deviceOrientation", C14032n0.f39385d), new C13604l("locationEnabled", C14033o0.f39386d), new C13604l("wifiEnabled", C14034p0.f39387d));
        }
    }

    /* renamed from: b */
    public Map<String, C32227p<Context, Map<String, Object>, C13598b0>> mo13451b() {
        return this.f39389a;
    }
}

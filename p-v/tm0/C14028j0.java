package tm0;

import android.content.Context;
import fy3.C32224a;
import fy3.C32227p;
import gy3.C8480h;
import gy3.C87413o;
import java.util.Map;
import rx3.C13598b0;
import rx3.C13601g;
import rx3.C13604l;
import rx3.C36568h;
import rx3.C36570n;
import sx3.C90364q0;

/* renamed from: tm0.j0 */
public final class C14028j0 extends C14038s0 {

    /* renamed from: b */
    public static final C14030b f39380b = new C14030b((C8480h) null);

    /* renamed from: c */
    public static final C13601g<Map<String, C32227p<Context, Map<String, Object>, C13598b0>>> f39381c = C36568h.m40985a(C14029a.f39383d);

    /* renamed from: a */
    public final Map<String, C32227p<Context, Map<String, Object>, C13598b0>> f39382a = ((Map) ((C36570n) f39381c).getValue());

    /* renamed from: tm0.j0$a */
    public static final class C14029a extends C87413o implements C32224a<Map<String, ? extends C32227p<? super Context, ? super Map<String, Object>, ? extends C13598b0>>> {

        /* renamed from: d */
        public static final C14029a f39383d = new C14029a();

        public C14029a() {
            super(0);
        }

        public Object invoke() {
            return C90364q0.m113147f(new C13604l("cameraAuthorized", C14021e0.f39375d), new C13604l("locationAuthorized", C14022f0.f39376d), new C13604l("microphoneAuthorized", C14024g0.f39377d), new C13604l("notificationAuthorized", C14025h0.f39378d), new C13604l("phoneCalendarAuthorized", C14026i0.f39379d));
        }
    }

    /* renamed from: tm0.j0$b */
    public static final class C14030b {
        public C14030b(C8480h hVar) {
        }

        /* renamed from: a */
        public static final String m13394a(C14030b bVar, boolean z) {
            bVar.getClass();
            return z ? "authorized" : "denied";
        }
    }

    /* renamed from: b */
    public Map<String, C32227p<Context, Map<String, Object>, C13598b0>> mo13451b() {
        return this.f39382a;
    }
}

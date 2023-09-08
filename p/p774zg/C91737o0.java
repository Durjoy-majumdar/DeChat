package p774zg;

import android.os.SystemClock;
import com.eclipsesource.mmv8.C80135V8;
import com.eclipsesource.mmv8.IV8Tracer;
import com.eclipsesource.mmv8.V8TracerAccessible;
import com.tencent.p014mm.appbrand.p942v8.C80662g;
import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C87412m;
import p206nj.C88957l;

/* renamed from: zg.o0 */
public final class C91737o0 {

    /* renamed from: a */
    public static final long f262771a;

    /* renamed from: b */
    public static final /* synthetic */ int f262772b = 0;

    /* renamed from: zg.o0$a */
    public static final class C91738a implements IV8Tracer {
        public void beginSection(String str) {
            C87412m.m108594g(str, "scetionName");
        }

        public void endSection() {
        }
    }

    static {
        Class<C80662g> cls = C80662g.class;
        V8TracerAccessible.setTracer(new C91738a());
        long elapsedRealtime = SystemClock.elapsedRealtime();
        C80135V8.getFlags();
        C88957l.m111079o("mmv8", cls.getClassLoader());
        C88957l.m111079o("mmnode", cls.getClassLoader());
        C88957l.m111079o("mmj2v8", cls.getClassLoader());
        long elapsedRealtime2 = SystemClock.elapsedRealtime() - elapsedRealtime;
        f262771a = elapsedRealtime2;
        Log.m105924i("MicroMsg.V8Env", "init, cost " + elapsedRealtime2 + " ms");
    }
}

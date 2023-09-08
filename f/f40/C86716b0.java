package f40;

import android.os.Handler;
import android.os.Looper;
import bp3.C79760s;
import com.tencent.p014mm.legacy.app.C80969o;
import com.tencent.p014mm.legacy.app.WeChatSplashStartup;
import di3.C86312j;
import f40.C86732g0;
import hp3.C87581a;

/* renamed from: f40.b0 */
public class C86716b0 implements C87581a<Void, Object> {

    /* renamed from: a */
    public final /* synthetic */ C86732g0 f251740a;

    public C86716b0(C86732g0 g0Var) {
        this.f251740a = g0Var;
    }

    public Object call(Object obj) {
        try {
            C79760s.m96908a("ServiceManager.preloadServicesWithOnSplashMode()");
            C86312j.m106920l();
            C86732g0.C86733a aVar = this.f251740a.f251794f;
            if (aVar != null) {
                new Handler(Looper.getMainLooper()).post(new C80969o((WeChatSplashStartup.C80945b) aVar));
                this.f251740a.f251794f = null;
            }
            return null;
        } finally {
            C79760s.m96909b();
        }
    }
}

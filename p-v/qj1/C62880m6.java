package qj1;

import android.content.Context;
import android.os.Bundle;
import android.view.ViewGroup;
import android.webkit.ValueCallback;
import cj1.C54804r0;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandlerThread;
import d60.C58124b;
import di0.C86299o;
import gy3.C87412m;
import java.util.regex.Pattern;
import o40.C61926c;
import te3.C49712hj1;

/* renamed from: qj1.m6 */
public final class C62880m6 extends C62660c {

    /* renamed from: p */
    public final C58124b f178423p;

    /* renamed from: qj1.m6$a */
    public static final class C62881a implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ C62880m6 f178424d;

        /* renamed from: e */
        public final /* synthetic */ Object f178425e;

        /* renamed from: f */
        public final /* synthetic */ long f178426f;

        public C62881a(C62880m6 m6Var, Object obj, long j) {
            this.f178424d = m6Var;
            this.f178425e = obj;
            this.f178426f = j;
        }

        public final void run() {
            if (!this.f178424d.mo87688G0()) {
                Object obj = this.f178425e;
                C86299o oVar = obj instanceof C86299o ? (C86299o) obj : null;
                if (oVar != null) {
                    long j = this.f178426f;
                    C62880m6 m6Var = this.f178424d;
                    Log.m105924i("FinderLiveEmptyPlugin", "openFullScreenMiniprogramImpl delayMs:" + j);
                    C54804r0 r0Var = C54804r0.f153631a;
                    Context context = m6Var.f166287d.getContext();
                    C87412m.m108593f(context, "root.context");
                    r0Var.mo75766h(context, m6Var.mo87684A0(), oVar, true, (ValueCallback<String>) null);
                    return;
                }
                return;
            }
            Log.m105924i("FinderLiveEmptyPlugin", "openFullScreenMiniprogramImpl delayMs:" + this.f178426f + ",isFinished!");
        }
    }

    /* renamed from: qj1.m6$b */
    public static final class C62882b implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ C62880m6 f178427d;

        /* renamed from: e */
        public final /* synthetic */ Object f178428e;

        /* renamed from: f */
        public final /* synthetic */ long f178429f;

        public C62882b(C62880m6 m6Var, Object obj, long j) {
            this.f178427d = m6Var;
            this.f178428e = obj;
            this.f178429f = j;
        }

        public final void run() {
            if (!this.f178427d.mo87688G0()) {
                Object obj = this.f178428e;
                C86299o oVar = obj instanceof C86299o ? (C86299o) obj : null;
                if (oVar != null) {
                    long j = this.f178429f;
                    C62880m6 m6Var = this.f178427d;
                    Log.m105924i("FinderLiveEmptyPlugin", "openHalfScreenMiniprogramImpl delayMs:" + j);
                    C54804r0 r0Var = C54804r0.f153631a;
                    Context context = m6Var.f166287d.getContext();
                    C87412m.m108593f(context, "root.context");
                    r0Var.mo75767i(context, m6Var.mo87684A0(), oVar, m6Var.mo14484z0());
                    return;
                }
                return;
            }
            Log.m105924i("FinderLiveEmptyPlugin", "openHalfScreenMiniprogramImpl delayMs:" + this.f178429f + ",isFinished!");
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C62880m6(ViewGroup viewGroup, C58124b bVar) {
        super(viewGroup, bVar, (C49712hj1) null);
        C87412m.m108594g(viewGroup, "emptyFrameLayout");
        C87412m.m108594g(bVar, "statusMonitor");
        this.f178423p = bVar;
    }

    /* renamed from: b */
    public boolean mo3200b() {
        return false;
    }

    /* renamed from: e */
    public void mo12022e(Bundle bundle, Object obj, long j) {
        Class cls = C62924pe.class;
        String str = "";
        String string = bundle != null ? bundle.getString("ACTION_POST_PORTRAIT", str) : null;
        if (string != null) {
            str = string;
        }
        if (C87412m.m108589b(str, "PORTRAIT_ACTION_FULL_SCREEN_MINIPRO")) {
            if (mo87687E0(cls) == null) {
                C62881a aVar = new C62881a(this, obj, j);
                Pattern pattern = C61926c.f176038a;
                MMHandlerThread.postToMainThreadDelayed(aVar, j);
            }
        } else if (C87412m.m108589b(str, "PORTRAIT_ACTION_HALF_SCREEN_MINIPRO") && mo87687E0(cls) == null) {
            C62882b bVar = new C62882b(this, obj, j);
            Pattern pattern2 = C61926c.f176038a;
            MMHandlerThread.postToMainThreadDelayed(bVar, j);
        }
    }

    /* renamed from: h */
    public boolean mo3206h() {
        return false;
    }

    /* renamed from: m */
    public boolean mo3208m() {
        return false;
    }
}

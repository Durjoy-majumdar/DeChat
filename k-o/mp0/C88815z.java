package mp0;

import android.content.Context;
import com.eclipsesource.mmv8.C80135V8;
import com.tencent.p014mm.plugin.appbrand.AppBrandRuntime;
import com.tencent.p014mm.plugin.appbrand.AppBrandRuntimeWC;
import com.tencent.p014mm.plugin.appbrand.C84072q1;
import com.tencent.p014mm.plugin.appbrand.C84073q2;
import com.tencent.p014mm.plugin.appbrand.jsruntime.C40482o;
import com.tencent.p014mm.plugin.appbrand.page.C83780d1;
import com.tencent.p014mm.plugin.appbrand.page.C83928t1;
import com.tencent.p014mm.sdk.platformtools.BuildInfo;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.WeChatEnvironment;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kr0.C88267e;
import lp0.C88620b;

/* renamed from: mp0.z */
public class C88815z implements C88620b<C83928t1> {
    /* renamed from: a */
    public void mo115970a(Context context, C83780d1 d1Var, String str) {
        AppBrandRuntimeWC J1 = ((C83928t1) d1Var).getRuntime();
        if (J1 != null && ((C88267e) J1.f238150p) != null) {
            if (C80135V8.isV8TracingRunning()) {
                ((C88267e) J1.f238150p).getJsRuntime().evaluateJavascript("(function(){if(!stopV8Tracing)return false;return stopV8Tracing();})()", new C88814y(this, context));
                List<C40482o> d = mo123209d(J1);
                if (d != null) {
                    Iterator it = ((ArrayList) d).iterator();
                    while (it.hasNext()) {
                        ((C40482o) it.next()).evaluateJavascript("(function(){if(!stopV8Tracing)return false;return stopV8Tracing();})()", new C88814y(this, context));
                    }
                    return;
                }
                return;
            }
            ((C88267e) J1.f238150p).getJsRuntime().evaluateJavascript("(function(){if(!startV8Tracing)return false;return startV8Tracing();})()", new C88812w(this, context));
            List<C40482o> d2 = mo123209d(J1);
            if (d2 != null) {
                ArrayList arrayList = (ArrayList) d2;
                Log.m105925i("MiroMsg.V8Tracing", "hy: trigger worker v8 tracing: %d", Integer.valueOf(arrayList.size()));
                Iterator it4 = arrayList.iterator();
                while (it4.hasNext()) {
                    ((C40482o) it4.next()).evaluateJavascript("(function(){if(!startV8Tracing)return false;return startV8Tracing();})()", new C88812w(this, context));
                }
            }
        }
    }

    /* renamed from: b */
    public String mo115971b(Context context, C83780d1 d1Var, String str) {
        C83928t1 t1Var = (C83928t1) d1Var;
        return C80135V8.isV8TracingRunning() ? "Stop V8 Tracing" : "Start V8 Tracing";
    }

    /* renamed from: c */
    public boolean mo115972c(Context context, C83780d1 d1Var, String str) {
        C83928t1 t1Var = (C83928t1) d1Var;
        return BuildInfo.DEBUG || WeChatEnvironment.hasDebugger() || WeChatEnvironment.isMonkeyEnv() || BuildInfo.IS_FLAVOR_RED || C84072q1.m103586a(str).f245471o;
    }

    /* renamed from: d */
    public final List<C40482o> mo123209d(AppBrandRuntime appBrandRuntime) {
        if (appBrandRuntime.mo113047b0() == null) {
            Log.m105920e("MiroMsg.V8Tracing", "hy: service released. abort walking through workers");
            return null;
        }
        C84073q2 r0 = appBrandRuntime.mo113047b0().mo114347r0();
        if (r0 != null) {
            return r0.mo116729d();
        }
        return null;
    }
}

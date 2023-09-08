package b02;

import android.content.Context;
import c02.C28462d;
import c02.C92331c;
import com.tencent.p014mm.app.C80625v0;
import com.tencent.p014mm.ipcinvoker.wx_extension.C1262l;
import com.tencent.p014mm.plugin.appbrand.config.GetOnLineInfoInfoResult;
import com.tencent.p014mm.sdk.platformtools.Log;
import di3.C86301e;
import di3.C86312j;
import eb0.C31461f3;
import ei3.C86522b;
import f02.C31790e;
import f40.C86709a0;
import gy3.C87412m;
import java.util.List;
import kr0.C34016t0;
import kr0.C88274h0;

@C86522b(dependencies = {C1262l.class}, onProcess = {C80625v0.MATCH_MM, C80625v0.MATCH_TOOLS, C80625v0.MATCH_APPBRAND, C80625v0.MATCH_MAGIC_EMOJI})
/* renamed from: b02.h */
public final class C28221h extends C86301e implements C28462d {

    /* renamed from: d */
    public final String f77757d = "PluginHandOff";

    /* renamed from: e */
    public final C31461f3 f77758e = new C28222a(this);

    /* renamed from: b02.h$a */
    public static final class C28222a implements C31461f3 {

        /* renamed from: d */
        public final /* synthetic */ C28221h f77759d;

        public C28222a(C28221h hVar) {
            this.f77759d = hVar;
        }

        /* renamed from: f4 */
        public final void mo24653f4() {
            String str = this.f77759d.f77757d;
            Log.m105924i(str, "webwx online status: " + C86709a0.m107523b().mo121120t());
            C34016t0 t0Var = (C34016t0) C86312j.m106911c(C34016t0.class);
            if (t0Var != null) {
                GetOnLineInfoInfoResult getOnLineInfoInfoResult = new GetOnLineInfoInfoResult();
                getOnLineInfoInfoResult.f80325f = t0Var.Ld0();
                List<Integer> v7 = t0Var.mo56399v7();
                if (v7.contains(1)) {
                    getOnLineInfoInfoResult.f80323d = 1;
                } else if (v7.contains(2)) {
                    getOnLineInfoInfoResult.f80323d = 2;
                } else {
                    getOnLineInfoInfoResult.f80323d = -1;
                }
                int Wu0 = t0Var.Wu0();
                getOnLineInfoInfoResult.f80324e = Wu0;
                if (getOnLineInfoInfoResult.f80323d == -1 || Wu0 == 0) {
                    String str2 = this.f77759d.f77757d;
                    Log.m105924i(str2, "invalid login: " + getOnLineInfoInfoResult);
                } else {
                    ((C88274h0) C86312j.m106911c(C88274h0.class)).O30("Common_IPC_appid", getOnLineInfoInfoResult);
                    ((C92331c) C86312j.m106911c(C92331c.class)).mo58374qN(getOnLineInfoInfoResult);
                }
            }
            if (C86709a0.m107523b().mo121120t()) {
                Log.m105924i(this.f77759d.f77757d, "webwx is online, send alllist");
                C31790e.f84852d.m50();
            }
        }
    }

    public void onAccountInitialized(Context context) {
        C87412m.m108594g(context, "context");
        Log.m105924i(this.f77757d, "onAccountInitialized");
        C86709a0.m107523b().mo121106a(this.f77758e);
    }

    public void onAccountReleased(Context context) {
        C87412m.m108594g(context, "context");
        Log.m105924i(this.f77757d, "onAccountRelease");
        C86709a0.m107523b().mo121124y(this.f77758e);
    }

    public void onCreate(Context context) {
        C87412m.m108594g(context, "context");
        Log.m105924i(this.f77757d, "execute");
    }
}

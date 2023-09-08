package rs1;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.C0120a0;
import bl3.C113200q;
import com.tencent.p014mm.p136ui.component.UIComponent;
import com.tencent.p014mm.plugin.finder.extension.reddot.C2479n0;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandlerThread;
import com.tencent.p014mm.storage.C72994y1;
import com.tencent.tinker.loader.hotplug.EnvConsts;
import f40.C86709a0;
import gy3.C8477a0;
import gy3.C87412m;
import java.util.regex.Pattern;
import o40.C61926c;
import te3.C64586nn1;

@C113200q(initialMode = 2)
/* renamed from: rs1.w7 */
public final class C13521w7 extends UIComponent {

    /* renamed from: d */
    public Runnable f38350d;

    /* renamed from: rs1.w7$a */
    public static final class C13522a<T> implements C0120a0 {

        /* renamed from: d */
        public final /* synthetic */ C8477a0 f38351d;

        /* renamed from: e */
        public final /* synthetic */ C13521w7 f38352e;

        public C13522a(C8477a0 a0Var, C13521w7 w7Var) {
            this.f38351d = a0Var;
            this.f38352e = w7Var;
        }

        public void onChanged(Object obj) {
            C2479n0.C2480a aVar = (C2479n0.C2480a) obj;
            StringBuilder sb = new StringBuilder();
            sb.append("[MENU_ID_POST] red=");
            boolean z = false;
            sb.append(aVar != null && aVar.f12908a);
            sb.append("，hasShowQualityBottomSheet = ");
            sb.append(this.f38351d.f27482d);
            Log.m105924i("Finder.PostQualityUIC", sb.toString());
            if (aVar != null && aVar.f12908a) {
                z = true;
            }
            if (z) {
                C64586nn1 nn12 = aVar.f12909b;
                if (!C87412m.m108589b(nn12 != null ? nn12.f184504f : null, "temp")) {
                    C8477a0 a0Var = this.f38351d;
                    if (!a0Var.f27482d) {
                        a0Var.f27482d = true;
                        C86709a0.m107535s().mo121142i().mo119677K(C72994y1.C72995a.USERINFO_FINDER_HAS_SHOWN_GET_POST_QUALITY_TIPS_BOOLEAN_SYNC, Boolean.TRUE);
                        C13521w7 w7Var = this.f38352e;
                        w7Var.f38350d = new C13488v7(w7Var);
                    }
                }
            }
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C13521w7(AppCompatActivity appCompatActivity) {
        super(appCompatActivity);
        C87412m.m108594g(appCompatActivity, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        C8477a0 a0Var = new C8477a0();
        Object f = C86709a0.m107535s().mo121142i().mo119685f(C72994y1.C72995a.USERINFO_FINDER_HAS_SHOWN_GET_POST_QUALITY_TIPS_BOOLEAN_SYNC, Boolean.FALSE);
        C87412m.m108592e(f, "null cannot be cast to non-null type kotlin.Boolean");
        boolean booleanValue = ((Boolean) f).booleanValue();
        a0Var.f27482d = booleanValue;
        if (!booleanValue) {
            C2479n0 n0Var = C2479n0.f12955a;
            C61926c.m72695t(C2479n0.f12958d, getActivity(), new C13522a(a0Var, this));
        }
    }

    public void onResume() {
        super.onResume();
        if (this.f38350d != null) {
            Log.m105924i("Finder.PostQualityUIC", "showBottomSheet onResume");
            Runnable runnable = this.f38350d;
            C87412m.m108591d(runnable);
            Pattern pattern = C61926c.f176038a;
            MMHandlerThread.postToMainThreadDelayed(runnable, 0);
        }
    }
}

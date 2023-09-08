package rs1;

import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import bl3.C113200q;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.component.UIComponent;
import com.tencent.tinker.loader.hotplug.EnvConsts;
import gy3.C87412m;
import ht1.C8818z1;
import jq3.C60905o;

@C113200q(initialMode = 2)
/* renamed from: rs1.h1 */
public final class C13256h1 extends UIComponent implements C8818z1 {

    /* renamed from: d */
    public final String f37627d = "Finder.FindDescClickTipsUIC";

    /* renamed from: e */
    public boolean f37628e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C13256h1(AppCompatActivity appCompatActivity) {
        super(appCompatActivity);
        C87412m.m108594g(appCompatActivity, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
    }

    /* renamed from: c3 */
    public final void mo12723c3(C60905o oVar) {
        View D;
        C87412m.m108594g(oVar, "holder");
        if (this.f37628e && (D = oVar.mo85812D(C0966R.C0970id.n7x)) != null) {
            View view = oVar.f44854d;
            C87412m.m108592e(view, "null cannot be cast to non-null type android.view.ViewGroup");
            ((ViewGroup) view).removeView(D);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C13256h1(Fragment fragment) {
        super(fragment);
        C87412m.m108594g(fragment, "fragment");
    }
}

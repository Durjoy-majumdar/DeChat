package yb2;

import androidx.appcompat.app.AppCompatActivity;
import bl3.C39818r;
import com.tencent.p014mm.p136ui.component.UIComponent;
import com.tencent.p014mm.plugin.mvvmbase.BaseMvvmActivity;
import com.tencent.p014mm.sdk.coroutines.LifecycleScope;
import com.tencent.p014mm.sdk.statecenter.BaseState;
import com.tencent.p014mm.sdk.statecenter.UIStateCenter;
import com.tencent.tinker.loader.hotplug.EnvConsts;
import gy3.C87412m;
import wb2.C65946a;

/* renamed from: yb2.a */
public class C15946a extends UIComponent {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C15946a(AppCompatActivity appCompatActivity) {
        super(appCompatActivity);
        C87412m.m108594g(appCompatActivity, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
    }

    /* renamed from: c3 */
    public final LifecycleScope mo14597c3() {
        LifecycleScope c3;
        BaseMvvmActivity d3 = mo14598d3();
        if (d3 == null || (c3 = ((C65946a) C39818r.f106831a.mo62444c(d3).mo75002a(C65946a.class)).mo89983c3()) == null) {
            return null;
        }
        return c3;
    }

    /* renamed from: d3 */
    public final BaseMvvmActivity mo14598d3() {
        AppCompatActivity activity = getActivity();
        if (activity instanceof BaseMvvmActivity) {
            return (BaseMvvmActivity) activity;
        }
        return null;
    }

    /* renamed from: e3 */
    public final <State extends BaseState> UIStateCenter<State> mo14599e3() {
        BaseMvvmActivity d3 = mo14598d3();
        if (d3 != null) {
            return d3.getStateCenter();
        }
        return null;
    }

    /* renamed from: f3 */
    public final void mo14600f3() {
        BaseMvvmActivity d3 = mo14598d3();
        if (d3 != null) {
            d3.hideVKB();
        }
    }
}

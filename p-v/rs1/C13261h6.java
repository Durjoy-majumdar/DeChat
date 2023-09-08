package rs1;

import androidx.appcompat.app.AppCompatActivity;
import bl3.C113200q;
import com.tencent.p014mm.p136ui.component.UIComponent;
import com.tencent.p014mm.protocal.protobuf.FinderObject;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.tinker.loader.hotplug.EnvConsts;
import di3.C86312j;
import gy3.C87412m;
import ht1.C60172g4;
import tf0.C13887q1;
import tf0.C64916p1;

@C113200q(initialMode = 2)
/* renamed from: rs1.h6 */
public final class C13261h6 extends UIComponent {

    /* renamed from: d */
    public final String f37635d = "FinderLiveFeedReportLiftUIC";

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C13261h6(AppCompatActivity appCompatActivity) {
        super(appCompatActivity);
        C87412m.m108594g(appCompatActivity, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
    }

    public void onStop() {
        Log.m105924i(this.f37635d, "[FinderLiveFeedReportLiftUIC] onStop");
        C13887q1 q1Var = (C13887q1) C86312j.m106911c(C13887q1.class);
        AppCompatActivity activity = getActivity();
        C60172g4 gr02 = ((C64916p1) C86312j.m106911c(C64916p1.class)).gr0(getActivity());
        q1Var.mo13319Lr(activity, (FinderObject) null, gr02 != null ? gr02.mo12861q3() : null, true);
    }
}

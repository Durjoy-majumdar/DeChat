package xm3;

import android.os.Bundle;
import android.view.View;
import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.C0125s;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.p136ui.MMActivityController;
import com.tencent.p014mm.plugin.mvvmbase.BaseMvvmActivity;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.statecenter.IStateAction;
import com.tencent.p014mm.sdk.statecenter.IStateActionResult;
import com.tencent.p014mm.sdk.statecenter.UIStateCenter;
import com.tencent.tinker.loader.hotplug.EnvConsts;
import fy3.C32226l;
import gy3.C87412m;
import gy3.C87413o;
import rx3.C13598b0;
import tm3.C64961s;
import tm3.C78048a0;
import tm3.C78052b0;
import tm3.C78066t;
import tm3.C78067u;
import tm3.C78068v;
import tm3.C78069w;
import tm3.C78071z;
import yb2.C15946a;

/* renamed from: xm3.o0 */
public final class C78924o0 extends C15946a {

    /* renamed from: xm3.o0$a */
    public static final class C78925a extends C87413o implements C32226l<C78069w, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C78924o0 f231794d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C78925a(C78924o0 o0Var) {
            super(1);
            this.f231794d = o0Var;
        }

        public Object invoke(Object obj) {
            IStateActionResult result;
            C78069w wVar = (C78069w) obj;
            C87412m.m108594g(wVar, "state");
            C78924o0 o0Var = this.f231794d;
            IStateAction action = wVar.getAction();
            if (action != null && (action instanceof C64961s)) {
                C64961s sVar = (C64961s) action;
                AppCompatActivity activity = o0Var.getActivity();
                C87412m.m108592e(activity, "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity");
                MMActivity mMActivity = (MMActivity) activity;
                if (wVar.mo108033b()) {
                    mMActivity.addTextOptionMenu(1, o0Var.getString(C0966R.string.f8014z_), new C78922n0(o0Var), (View.OnLongClickListener) null, MMActivityController.C73075r.GREEN);
                    o0Var.mo108909g3(wVar);
                }
            }
            if (wVar.mo108033b()) {
                C78924o0 o0Var2 = this.f231794d;
                IStateAction action2 = wVar.getAction();
                if (action2 != null && (action2 instanceof C78071z) && (result = ((C78071z) action2).getResult()) != null && (result instanceof C78048a0) && ((C78048a0) result).f228787b == C78048a0.C78049a.Success) {
                    o0Var2.mo108909g3(wVar);
                }
                C78924o0 o0Var3 = this.f231794d;
                IStateAction action3 = wVar.getAction();
                if (action3 != null && (action3 instanceof C78052b0)) {
                    C78052b0 b0Var = (C78052b0) action3;
                    o0Var3.mo108909g3(wVar);
                }
                C78924o0 o0Var4 = this.f231794d;
                IStateAction action4 = wVar.getAction();
                if (action4 != null && (action4 instanceof C78067u)) {
                    C78067u uVar = (C78067u) action4;
                    o0Var4.mo108909g3(wVar);
                }
                C78924o0 o0Var5 = this.f231794d;
                IStateAction action5 = wVar.getAction();
                if (action5 != null && (action5 instanceof C78068v)) {
                    C78068v vVar = (C78068v) action5;
                    o0Var5.mo108909g3(wVar);
                }
                C78924o0 o0Var6 = this.f231794d;
                IStateAction action6 = wVar.getAction();
                if (action6 != null && (action6 instanceof C78066t)) {
                    C78066t tVar = (C78066t) action6;
                    o0Var6.mo108909g3(wVar);
                }
            }
            return C13598b0.f38549a;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C78924o0(AppCompatActivity appCompatActivity) {
        super(appCompatActivity);
        C87412m.m108594g(appCompatActivity, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
    }

    /* renamed from: g3 */
    public final void mo108909g3(C78069w wVar) {
        C87412m.m108594g(wVar, "state");
        AppCompatActivity activity = getActivity();
        C87412m.m108592e(activity, "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity");
        MMActivity mMActivity = (MMActivity) activity;
        Log.m105924i("MicroMsg.SelectContactTopMenuUIC", "updateMenu: " + wVar.f228826n.size());
        if (wVar.f228826n.size() > 0) {
            mMActivity.updateOptionMenuText(1, getString(C0966R.string.f8014z_) + '(' + wVar.f228826n.size() + ')');
        } else {
            mMActivity.updateOptionMenuText(1, getString(C0966R.string.f8014z_));
        }
        if (wVar.f228826n.size() > wVar.f228824i) {
            mMActivity.enableOptionMenu(1, true);
        } else {
            mMActivity.enableOptionMenu(1, false);
        }
    }

    public void onCreate(Bundle bundle) {
        UIStateCenter stateCenter;
        super.onCreate(bundle);
        BaseMvvmActivity d3 = mo14598d3();
        if (d3 != null && (stateCenter = d3.getStateCenter()) != null) {
            stateCenter.observe((C0125s) getActivity(), new C78925a(this));
        }
    }
}

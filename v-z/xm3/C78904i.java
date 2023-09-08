package xm3;

import android.animation.ObjectAnimator;
import android.os.Bundle;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.C0125s;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.tools.C7020t0;
import com.tencent.p014mm.p136ui.tools.KeyboardHeightProvider;
import com.tencent.p014mm.plugin.mvvmbase.BaseMvvmActivity;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.statecenter.IStateAction;
import com.tencent.p014mm.sdk.statecenter.IStateActionResult;
import com.tencent.p014mm.sdk.statecenter.UIStateCenter;
import com.tencent.tinker.loader.hotplug.EnvConsts;
import fy3.C32224a;
import fy3.C32226l;
import gy3.C87412m;
import gy3.C87413o;
import p278yh.C79115l;
import rx3.C13598b0;
import rx3.C13601g;
import rx3.C36568h;
import rx3.C36570n;
import tm3.C64961s;
import tm3.C78048a0;
import tm3.C78052b0;
import tm3.C78054c0;
import tm3.C78066t;
import tm3.C78067u;
import tm3.C78069w;
import tm3.C78071z;
import yb2.C15946a;

/* renamed from: xm3.i */
public class C78904i extends C15946a {

    /* renamed from: d */
    public final C13601g f231767d = C36568h.m40985a(new C78907c(this));

    /* renamed from: e */
    public KeyboardHeightProvider f231768e;

    /* renamed from: f */
    public ObjectAnimator f231769f;

    /* renamed from: g */
    public final C13601g f231770g = C36568h.m40985a(new C78905a(this));

    /* renamed from: xm3.i$a */
    public static final class C78905a extends C87413o implements C32224a<C7020t0> {

        /* renamed from: d */
        public final /* synthetic */ C78904i f231771d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C78905a(C78904i iVar) {
            super(0);
            this.f231771d = iVar;
        }

        public Object invoke() {
            return new C78901h(this.f231771d);
        }
    }

    /* renamed from: xm3.i$b */
    public static final class C78906b extends C87413o implements C32226l<C78069w, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C78904i f231772d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C78906b(C78904i iVar) {
            super(1);
            this.f231772d = iVar;
        }

        public Object invoke(Object obj) {
            IStateActionResult result;
            C78069w wVar = (C78069w) obj;
            C87412m.m108594g(wVar, "state");
            C78904i iVar = this.f231772d;
            IStateAction action = wVar.getAction();
            if (action != null && (action instanceof C64961s)) {
                C64961s sVar = (C64961s) action;
                if (wVar.mo108033b()) {
                    iVar.mo108153i3(true);
                    iVar.mo108901g3().mo109045c().setOnClickListener(new C78910j(iVar));
                    KeyboardHeightProvider keyboardHeightProvider = new KeyboardHeightProvider(iVar.getActivity());
                    keyboardHeightProvider.f220015b = (C7020t0) ((C36570n) iVar.f231770g).getValue();
                    keyboardHeightProvider.mo104022e();
                    iVar.f231768e = keyboardHeightProvider;
                    iVar.mo108902j3(wVar);
                }
            }
            if (wVar.mo108033b()) {
                C78904i iVar2 = this.f231772d;
                IStateAction action2 = wVar.getAction();
                if (action2 != null && (action2 instanceof C78071z) && (result = ((C78071z) action2).getResult()) != null && (result instanceof C78048a0) && ((C78048a0) result).f228787b == C78048a0.C78049a.Success) {
                    iVar2.mo108902j3(wVar);
                }
                C78904i iVar3 = this.f231772d;
                IStateAction action3 = wVar.getAction();
                if (action3 != null && (action3 instanceof C78052b0)) {
                    C78052b0 b0Var = (C78052b0) action3;
                    iVar3.mo108902j3(wVar);
                }
                C78904i iVar4 = this.f231772d;
                IStateAction action4 = wVar.getAction();
                if (action4 != null && (action4 instanceof C78067u)) {
                    C78067u uVar = (C78067u) action4;
                    iVar4.mo108902j3(wVar);
                }
                C78904i iVar5 = this.f231772d;
                IStateAction action5 = wVar.getAction();
                if (action5 != null && (action5 instanceof C78066t)) {
                    C78066t tVar = (C78066t) action5;
                    iVar5.mo108902j3(wVar);
                }
            }
            return C13598b0.f38549a;
        }
    }

    /* renamed from: xm3.i$c */
    public static final class C78907c extends C87413o implements C32224a<C79115l> {

        /* renamed from: d */
        public final /* synthetic */ C78904i f231773d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C78907c(C78904i iVar) {
            super(0);
            this.f231773d = iVar;
        }

        public Object invoke() {
            return new C79115l(this.f231773d.getRootView());
        }
    }

    /* renamed from: xm3.i$d */
    public static final class C78908d implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ C78904i f231774d;

        public C78908d(C78904i iVar) {
            this.f231774d = iVar;
        }

        public final void run() {
            UIStateCenter stateCenter;
            BaseMvvmActivity d3 = this.f231774d.mo14598d3();
            if (d3 != null && (stateCenter = d3.getStateCenter()) != null) {
                stateCenter.dispatch(new C78054c0(this.f231774d.mo108901g3().mo109053k().getHeight()));
            }
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C78904i(AppCompatActivity appCompatActivity) {
        super(appCompatActivity);
        C87412m.m108594g(appCompatActivity, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
    }

    /* renamed from: g3 */
    public final C79115l mo108901g3() {
        return (C79115l) ((C36570n) this.f231767d).getValue();
    }

    /* renamed from: i3 */
    public void mo108153i3(boolean z) {
        mo108901g3().mo109053k().setVisibility(z ? 0 : 8);
        mo108901g3().mo109053k().post(new C78908d(this));
        mo108901g3().mo109052j().setVisibility(8);
    }

    /* renamed from: j3 */
    public final void mo108902j3(C78069w wVar) {
        C87412m.m108594g(wVar, "state");
        Log.m105924i("MicroMsg.SelectContactBottomMenuUIC", "updateMenu: " + wVar.f228826n.size());
        if (wVar.f228826n.size() > 0) {
            Button c = mo108901g3().mo109045c();
            c.setText(getString(C0966R.string.f8014z_) + '(' + wVar.f228826n.size() + ')');
        } else {
            mo108901g3().mo109045c().setText(getString(C0966R.string.f8014z_));
        }
        mo108901g3().mo109045c().setEnabled(wVar.f228826n.size() > wVar.f228824i);
    }

    public void onCreate(Bundle bundle) {
        UIStateCenter stateCenter;
        super.onCreate(bundle);
        BaseMvvmActivity d3 = mo14598d3();
        if (d3 != null && (stateCenter = d3.getStateCenter()) != null) {
            stateCenter.observe((C0125s) getActivity(), new C78906b(this));
        }
    }

    public void onDestroy() {
        ObjectAnimator objectAnimator = this.f231769f;
        if (objectAnimator != null) {
            objectAnimator.cancel();
        }
        super.onDestroy();
    }

    public void onPause() {
        KeyboardHeightProvider keyboardHeightProvider = this.f231768e;
        if (keyboardHeightProvider != null) {
            keyboardHeightProvider.mo104021d();
        }
        super.onPause();
    }

    public void onResume() {
        super.onResume();
        KeyboardHeightProvider keyboardHeightProvider = this.f231768e;
        if (keyboardHeightProvider != null) {
            keyboardHeightProvider.mo104022e();
        }
    }

    public void onWindowFocusChanged(boolean z) {
        KeyboardHeightProvider keyboardHeightProvider;
        super.onWindowFocusChanged(z);
        if (z && (keyboardHeightProvider = this.f231768e) != null) {
            keyboardHeightProvider.mo104022e();
        }
    }
}

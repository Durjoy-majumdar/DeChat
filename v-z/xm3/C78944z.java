package xm3;

import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.C0125s;
import bc2.C67221b;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.C74942w4;
import com.tencent.p014mm.plugin.mvvmbase.BaseMvvmActivity;
import com.tencent.p014mm.sdk.statecenter.IStateAction;
import com.tencent.p014mm.sdk.statecenter.UIStateCenter;
import com.tencent.p014mm.view.recyclerview.WxRecyclerView;
import com.tencent.tinker.loader.hotplug.EnvConsts;
import fy3.C32224a;
import fy3.C32226l;
import gy3.C87412m;
import gy3.C87413o;
import om3.C77020b;
import p278yh.C79115l;
import rx3.C13598b0;
import rx3.C13601g;
import rx3.C36568h;
import rx3.C36570n;
import tm3.C78056e;
import tm3.C78058g;
import tm3.C78060i;
import tm3.C78069w;

/* renamed from: xm3.z */
public final class C78944z extends C67221b<C77020b> {

    /* renamed from: d */
    public View f231819d;

    /* renamed from: e */
    public final C13601g f231820e = C36568h.m40985a(new C78946b(this));

    /* renamed from: xm3.z$a */
    public static final class C78945a extends C87413o implements C32226l<C78069w, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C78944z f231821d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C78945a(C78944z zVar) {
            super(1);
            this.f231821d = zVar;
        }

        public Object invoke(Object obj) {
            LinearLayout linearLayout;
            C78069w wVar = (C78069w) obj;
            C87412m.m108594g(wVar, "state");
            C78944z zVar = this.f231821d;
            IStateAction action = wVar.getAction();
            if (action != null && (action instanceof C78058g)) {
                C78058g gVar = (C78058g) action;
                View view = zVar.f231819d;
                if (view != null && wVar.f228826n.size() > 0) {
                    int c = C74942w4.m89786c(zVar.getActivity(), C0966R.dimen.f3763dc);
                    LinearLayout linearLayout2 = (LinearLayout) view.findViewById(C0966R.C0970id.eu_);
                    if (linearLayout2 != null) {
                        linearLayout2.setLayoutParams(new LinearLayout.LayoutParams(linearLayout2.getWidth(), c));
                    }
                }
                UIStateCenter e3 = zVar.mo14599e3();
                if (e3 != null) {
                    C32226l<View, C13598b0> lVar = gVar.f228800a;
                    C32226l<View, C13598b0> lVar2 = gVar.f228801b;
                    WxRecyclerView g = ((C79115l) ((C36570n) zVar.f231820e).getValue()).mo109049g();
                    C87412m.m108593f(g, "uiBinding.selectContactRv");
                    e3.dispatch(new C78056e(lVar, lVar2, g));
                }
            }
            C78944z zVar2 = this.f231821d;
            IStateAction action2 = wVar.getAction();
            if (action2 != null && (action2 instanceof C78060i)) {
                int i = ((C78060i) action2).f228802a;
                View view2 = zVar2.f231819d;
                if (!(view2 == null || (linearLayout = (LinearLayout) view2.findViewById(C0966R.C0970id.eu_)) == null)) {
                    linearLayout.setLayoutParams(new LinearLayout.LayoutParams(linearLayout.getWidth(), i));
                }
            }
            return C13598b0.f38549a;
        }
    }

    /* renamed from: xm3.z$b */
    public static final class C78946b extends C87413o implements C32224a<C79115l> {

        /* renamed from: d */
        public final /* synthetic */ C78944z f231822d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C78946b(C78944z zVar) {
            super(0);
            this.f231822d = zVar;
        }

        public Object invoke() {
            return new C79115l(this.f231822d.getRootView());
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C78944z(AppCompatActivity appCompatActivity) {
        super(appCompatActivity);
        C87412m.m108594g(appCompatActivity, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
    }

    public void onCreate(Bundle bundle) {
        UIStateCenter stateCenter;
        super.onCreate(bundle);
        BaseMvvmActivity d3 = mo14598d3();
        if (d3 != null && (stateCenter = d3.getStateCenter()) != null) {
            stateCenter.observe((C0125s) getActivity(), new C78945a(this));
        }
    }
}

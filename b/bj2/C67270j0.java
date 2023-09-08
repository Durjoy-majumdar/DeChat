package bj2;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.C0125s;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.mvvmlist.MvvmList;
import com.tencent.p014mm.plugin.repairer.p099ui.demo.RepairerSvgDemoListUIC$buildItemConvertFactory$1;
import com.tencent.p014mm.sdk.coroutines.LifecycleScope;
import com.tencent.p014mm.sdk.statecenter.IStateAction;
import com.tencent.p014mm.sdk.statecenter.UIStateCenter;
import com.tencent.p014mm.view.recyclerview.WxLinearLayoutManager;
import com.tencent.p014mm.view.recyclerview.WxRecyclerView;
import com.tencent.tinker.loader.hotplug.EnvConsts;
import fy3.C32224a;
import fy3.C32226l;
import gy3.C24565l;
import gy3.C8480h;
import gy3.C87412m;
import gy3.C87413o;
import java.util.List;
import p278yh.C79118t;
import rx3.C13598b0;
import rx3.C13601g;
import rx3.C36568h;
import rx3.C36570n;
import yb2.C15946a;
import zb2.C103009m;
import zb2.C53769h;

/* renamed from: bj2.j0 */
public final class C67270j0 extends C15946a {

    /* renamed from: d */
    public final C13601g f193106d = C36568h.m40985a(new C67273c(this));

    /* renamed from: e */
    public C103009m<C67265e0> f193107e;

    /* renamed from: bj2.j0$a */
    public /* synthetic */ class C67271a extends C24565l implements C32226l<C67274k0, C13598b0> {
        public C67271a(Object obj) {
            super(1, obj, C67270j0.class, "processState", "processState(Lcom/tencent/mm/plugin/repairer/ui/demo/RepairerSvgDemoState;)V", 0);
        }

        public Object invoke(Object obj) {
            C87412m.m108594g((C67274k0) obj, "p0");
            ((C67270j0) this.receiver).getClass();
            return C13598b0.f38549a;
        }
    }

    /* renamed from: bj2.j0$b */
    public /* synthetic */ class C67272b extends C24565l implements C32226l<C67274k0, C13598b0> {
        public C67272b(Object obj) {
            super(1, obj, C67270j0.class, "observeState", "observeState(Lcom/tencent/mm/plugin/repairer/ui/demo/RepairerSvgDemoState;)V", 0);
        }

        public Object invoke(Object obj) {
            C67274k0 k0Var = (C67274k0) obj;
            C87412m.m108594g(k0Var, "p0");
            C67270j0 j0Var = (C67270j0) this.receiver;
            j0Var.getClass();
            IStateAction action = k0Var.getAction();
            if (action != null && (action instanceof C67262d0)) {
                C67262d0 d0Var = (C67262d0) action;
                C79118t tVar = (C79118t) ((C36570n) j0Var.f193106d).getValue();
                if (tVar.f232334b == null) {
                    tVar.f232334b = (WxRecyclerView) tVar.f232333a.findViewById(C0966R.C0970id.iiq);
                }
                tVar.f232334b.setLayoutManager(new WxLinearLayoutManager(j0Var.getActivity()));
                j0Var.f193107e = new C103009m<>(new MvvmList(new C54463b0(d0Var.f193097a), new C53769h(), j0Var.getActivity(), (LifecycleScope) null, (List) null, 24, (C8480h) null), new RepairerSvgDemoListUIC$buildItemConvertFactory$1(), false);
                C79118t tVar2 = (C79118t) ((C36570n) j0Var.f193106d).getValue();
                if (tVar2.f232334b == null) {
                    tVar2.f232334b = (WxRecyclerView) tVar2.f232333a.findViewById(C0966R.C0970id.iiq);
                }
                tVar2.f232334b.setAdapter(j0Var.f193107e);
                C103009m<C67265e0> mVar = j0Var.f193107e;
                if (mVar != null) {
                    mVar.f165746y = new C67269i0(j0Var);
                }
            }
            return C13598b0.f38549a;
        }
    }

    /* renamed from: bj2.j0$c */
    public static final class C67273c extends C87413o implements C32224a<C79118t> {

        /* renamed from: d */
        public final /* synthetic */ C67270j0 f193108d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C67273c(C67270j0 j0Var) {
            super(0);
            this.f193108d = j0Var;
        }

        public Object invoke() {
            return new C79118t(this.f193108d.getRootView());
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C67270j0(AppCompatActivity appCompatActivity) {
        super(appCompatActivity);
        C87412m.m108594g(appCompatActivity, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
    }

    public void onCreate(Bundle bundle) {
        UIStateCenter e3 = mo14599e3();
        if (e3 != null) {
            e3.process((C0125s) getActivity(), new C67271a(this));
        }
        UIStateCenter e35 = mo14599e3();
        if (e35 != null) {
            e35.observe((C0125s) getActivity(), new C67272b(this));
        }
    }
}

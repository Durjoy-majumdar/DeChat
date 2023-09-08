package xm3;

import android.os.Bundle;
import android.view.ViewGroup;
import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.C0125s;
import bc2.C67221b;
import com.tencent.p014mm.plugin.mvvmbase.BaseMvvmActivity;
import com.tencent.p014mm.plugin.mvvmlist.MvvmList;
import com.tencent.p014mm.sdk.statecenter.IStateAction;
import com.tencent.p014mm.sdk.statecenter.UIStateCenter;
import com.tencent.p014mm.view.recyclerview.WxLinearLayoutManager;
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
import tm3.C78052b0;
import tm3.C78054c0;
import tm3.C78066t;
import tm3.C78067u;
import tm3.C78068v;
import tm3.C78069w;
import tm3.C78071z;
import zb2.C79317n;

/* renamed from: xm3.r */
public class C78928r extends C67221b<C77020b> {

    /* renamed from: d */
    public final C13601g f231798d = C36568h.m40985a(new C78931c(this));

    /* renamed from: xm3.r$a */
    public static final class C78929a extends C87413o implements C32224a<WxLinearLayoutManager> {

        /* renamed from: d */
        public final /* synthetic */ AppCompatActivity f231799d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C78929a(AppCompatActivity appCompatActivity) {
            super(0);
            this.f231799d = appCompatActivity;
        }

        public Object invoke() {
            return new WxLinearLayoutManager(this.f231799d);
        }
    }

    /* renamed from: xm3.r$b */
    public static final class C78930b extends C87413o implements C32226l<C78069w, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C78928r f231800d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C78930b(C78928r rVar) {
            super(1);
            this.f231800d = rVar;
        }

        public Object invoke(Object obj) {
            C78069w wVar = (C78069w) obj;
            C87412m.m108594g(wVar, "state");
            if (((C78071z) wVar.checkAction(C78071z.class)) != null) {
                WxRecyclerView g = this.f231800d.mo108910i3().mo109049g();
                C87412m.m108593f(g, "uiBinding.selectContactRv");
                MvvmList a = C79317n.m96015a(g);
                if (a != null) {
                    a.mo129614r(new C78932s(wVar));
                }
            }
            if (((C78052b0) wVar.checkAction(C78052b0.class)) != null) {
                WxRecyclerView g2 = this.f231800d.mo108910i3().mo109049g();
                C87412m.m108593f(g2, "uiBinding.selectContactRv");
                MvvmList a2 = C79317n.m96015a(g2);
                if (a2 != null) {
                    a2.mo129614r(new C78933t(wVar));
                }
            }
            C78928r rVar = this.f231800d;
            IStateAction action = wVar.getAction();
            if (action != null && (action instanceof C78054c0)) {
                C78054c0 c0Var = (C78054c0) action;
                ViewGroup.LayoutParams layoutParams = rVar.mo108910i3().mo109049g().getLayoutParams();
                if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                    ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin = c0Var.f228796a;
                }
                rVar.mo108910i3().mo109049g().setLayoutParams(layoutParams);
            }
            C78928r rVar2 = this.f231800d;
            IStateAction action2 = wVar.getAction();
            if (action2 != null && (action2 instanceof C78067u)) {
                C78067u uVar = (C78067u) action2;
                WxRecyclerView g3 = rVar2.mo108910i3().mo109049g();
                C87412m.m108593f(g3, "uiBinding.selectContactRv");
                MvvmList a3 = C79317n.m96015a(g3);
                if (a3 != null) {
                    a3.mo129614r(new C78934u(wVar));
                }
            }
            C78928r rVar3 = this.f231800d;
            IStateAction action3 = wVar.getAction();
            if (action3 != null && (action3 instanceof C78068v)) {
                C78068v vVar = (C78068v) action3;
                WxRecyclerView g4 = rVar3.mo108910i3().mo109049g();
                C87412m.m108593f(g4, "uiBinding.selectContactRv");
                MvvmList a4 = C79317n.m96015a(g4);
                if (a4 != null) {
                    a4.mo129614r(new C78935v(wVar));
                }
            }
            C78928r rVar4 = this.f231800d;
            IStateAction action4 = wVar.getAction();
            if (action4 != null && (action4 instanceof C78066t)) {
                C78066t tVar = (C78066t) action4;
                WxRecyclerView g5 = rVar4.mo108910i3().mo109049g();
                C87412m.m108593f(g5, "uiBinding.selectContactRv");
                MvvmList a5 = C79317n.m96015a(g5);
                if (a5 != null) {
                    a5.mo129614r(new C78936w(wVar));
                }
            }
            return C13598b0.f38549a;
        }
    }

    /* renamed from: xm3.r$c */
    public static final class C78931c extends C87413o implements C32224a<C79115l> {

        /* renamed from: d */
        public final /* synthetic */ C78928r f231801d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C78931c(C78928r rVar) {
            super(0);
            this.f231801d = rVar;
        }

        public Object invoke() {
            return new C79115l(this.f231801d.getRootView());
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C78928r(AppCompatActivity appCompatActivity) {
        super(appCompatActivity);
        C87412m.m108594g(appCompatActivity, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
        C36568h.m40985a(new C78929a(appCompatActivity));
    }

    /* renamed from: i3 */
    public final C79115l mo108910i3() {
        return (C79115l) ((C36570n) this.f231798d).getValue();
    }

    public void onCreate(Bundle bundle) {
        UIStateCenter stateCenter;
        BaseMvvmActivity d3 = mo14598d3();
        if (d3 != null && (stateCenter = d3.getStateCenter()) != null) {
            stateCenter.observe((C0125s) getActivity(), new C78930b(this));
        }
    }
}

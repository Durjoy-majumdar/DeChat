package xm3;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.C0125s;
import bc2.C67221b;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.C74942w4;
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
import om3.C77020b;
import p278yh.C79115l;
import rx3.C13598b0;
import rx3.C13601g;
import rx3.C36568h;
import rx3.C36570n;
import tm3.C64961s;
import tm3.C78048a0;
import tm3.C78052b0;
import tm3.C78060i;
import tm3.C78066t;
import tm3.C78067u;
import tm3.C78069w;
import tm3.C78071z;

/* renamed from: xm3.a */
public class C78870a extends C67221b<C77020b> {

    /* renamed from: d */
    public final C13601g f231719d = C36568h.m40985a(new C78872b(this));

    /* renamed from: xm3.a$a */
    public static final class C78871a extends C87413o implements C32226l<C78069w, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C78870a f231720d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C78871a(C78870a aVar) {
            super(1);
            this.f231720d = aVar;
        }

        public Object invoke(Object obj) {
            UIStateCenter stateCenter;
            BaseMvvmActivity d3;
            UIStateCenter stateCenter2;
            C78069w wVar = (C78069w) obj;
            C87412m.m108594g(wVar, "state");
            int i = 0;
            if (((C64961s) wVar.checkAction(C64961s.class)) != null) {
                C78870a aVar = this.f231720d;
                Log.m105924i("MicroMsg.MultiSelectContactMvvmListUIC", "InitAction");
                aVar.mo108890j3().mo109044b().setVisibility(0);
                for (String d : wVar.f228826n) {
                    aVar.mo108890j3().mo109044b().mo100244d(d);
                }
            }
            C78071z zVar = (C78071z) wVar.checkAction(C78071z.class);
            if (zVar != null) {
                C78870a aVar2 = this.f231720d;
                IStateActionResult result = zVar.getResult();
                if (result == null || !(result instanceof C78048a0)) {
                    result = null;
                } else if (((C78048a0) result).f228787b == C78048a0.C78049a.Success) {
                    if (wVar.f228826n.size() == 0) {
                        i = C74942w4.m89786c(aVar2.getActivity(), C0966R.dimen.f3758d_);
                    } else if (wVar.f228826n.size() == 1) {
                        i = C74942w4.m89786c(aVar2.getActivity(), C0966R.dimen.f3763dc);
                    }
                    if (!(i <= 0 || (d3 = aVar2.mo14598d3()) == null || (stateCenter2 = d3.getStateCenter()) == null)) {
                        stateCenter2.dispatch(new C78060i(i));
                    }
                    aVar2.mo108890j3().mo109044b().mo100244d(zVar.f228837a.f225007f);
                    zVar.f228837a.getClass();
                    C77020b bVar = zVar.f228837a;
                    if (bVar.f225009h.mo105663e(bVar)) {
                        aVar2.mo108890j3().mo109044b().mo100242c();
                        aVar2.mo108890j3().mo109044b().clearFocus();
                        aVar2.mo14600f3();
                    }
                }
                C78048a0 a0Var = (C78048a0) result;
            }
            C78870a aVar3 = this.f231720d;
            IStateAction action = wVar.getAction();
            if (action != null && (action instanceof C78052b0)) {
                C78052b0 b0Var = (C78052b0) action;
                if (wVar.f228826n.size() == 0) {
                    int c = C74942w4.m89786c(aVar3.getActivity(), C0966R.dimen.f3758d_);
                    BaseMvvmActivity d35 = aVar3.mo14598d3();
                    if (!(d35 == null || (stateCenter = d35.getStateCenter()) == null)) {
                        stateCenter.dispatch(new C78060i(c));
                    }
                }
            }
            if (((C78066t) wVar.checkAction(C78066t.class)) != null) {
                C78870a.m95402i3(this.f231720d, wVar);
            }
            if (((C78067u) wVar.checkAction(C78067u.class)) != null) {
                C78870a.m95402i3(this.f231720d, wVar);
            }
            return C13598b0.f38549a;
        }
    }

    /* renamed from: xm3.a$b */
    public static final class C78872b extends C87413o implements C32224a<C79115l> {

        /* renamed from: d */
        public final /* synthetic */ C78870a f231721d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C78872b(C78870a aVar) {
            super(0);
            this.f231721d = aVar;
        }

        public Object invoke() {
            return new C79115l(this.f231721d.getRootView());
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C78870a(AppCompatActivity appCompatActivity) {
        super(appCompatActivity);
        C87412m.m108594g(appCompatActivity, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
    }

    /* renamed from: i3 */
    public static final void m95402i3(C78870a aVar, C78069w wVar) {
        aVar.getClass();
        Log.m105924i("MicroMsg.MultiSelectContactMvvmListUIC", "handleSelectionFromOtherPage selectUserSet:" + wVar.f228826n);
        aVar.mo108890j3().mo109044b().mo100246f();
        for (String d : wVar.f228826n) {
            aVar.mo108890j3().mo109044b().mo100244d(d);
        }
    }

    /* renamed from: j3 */
    public final C79115l mo108890j3() {
        return (C79115l) ((C36570n) this.f231719d).getValue();
    }

    public void onCreate(Bundle bundle) {
        UIStateCenter stateCenter;
        BaseMvvmActivity d3 = mo14598d3();
        if (d3 != null && (stateCenter = d3.getStateCenter()) != null) {
            stateCenter.observe((C0125s) getActivity(), new C78871a(this));
        }
    }
}

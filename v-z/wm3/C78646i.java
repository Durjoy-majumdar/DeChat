package wm3;

import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
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
import java.util.List;
import om3.C77020b;
import p278yh.C79115l;
import rx3.C13598b0;
import rx3.C13601g;
import rx3.C36568h;
import rx3.C36570n;
import tm3.C64961s;
import tm3.C78047a;
import tm3.C78048a0;
import tm3.C78052b0;
import tm3.C78060i;
import tm3.C78068v;
import tm3.C78069w;
import tm3.C78071z;

/* renamed from: wm3.i */
public final class C78646i extends C67221b<C77020b> {

    /* renamed from: d */
    public final C13601g f230345d = C36568h.m40985a(new C78648b(this));

    /* renamed from: wm3.i$a */
    public static final class C78647a extends C87413o implements C32226l<C78069w, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C78646i f230346d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C78647a(C78646i iVar) {
            super(1);
            this.f230346d = iVar;
        }

        public Object invoke(Object obj) {
            C78069w wVar = (C78069w) obj;
            C87412m.m108594g(wVar, "state");
            int i = 0;
            C78048a0 a0Var = null;
            if (((C64961s) wVar.checkAction(C64961s.class)) != null) {
                C78646i iVar = this.f230346d;
                Log.m105924i("MicroMsg.MultiSelectAtSomeOneMvvmListUIC", "InitAction");
                iVar.mo108613i3().mo109044b().setVisibility(0);
                View findViewById = iVar.mo108613i3().mo109044b().findViewById(C0966R.C0970id.iwc);
                if (findViewById != null) {
                    findViewById.setBackground((Drawable) null);
                }
                View findViewById2 = iVar.mo108613i3().mo109044b().findViewById(C0966R.C0970id.h7n);
                if (findViewById2 != null) {
                    findViewById2.setBackgroundResource(C0966R.C0969drawable.f357228b82);
                }
                for (String d : wVar.f228826n) {
                    iVar.mo108613i3().mo109044b().mo100244d(d);
                }
            }
            C78071z zVar = (C78071z) wVar.checkAction(C78071z.class);
            if (zVar != null) {
                C78646i iVar2 = this.f230346d;
                IStateActionResult result = zVar.getResult();
                if (result != null && (result instanceof C78048a0)) {
                    if (((C78048a0) result).f228787b == C78048a0.C78049a.Success) {
                        if (wVar.f228826n.size() == 0) {
                            i = C74942w4.m89786c(iVar2.getActivity(), C0966R.dimen.f3758d_);
                        } else if (wVar.f228826n.size() == 1) {
                            i = C74942w4.m89786c(iVar2.getActivity(), C0966R.dimen.f3763dc);
                        }
                        if (i > 0) {
                            C78646i.m95029a(iVar2, i);
                        }
                        iVar2.mo108613i3().mo109044b().mo100244d(zVar.f228837a.f225007f);
                        zVar.f228837a.getClass();
                        C77020b bVar = zVar.f228837a;
                        if (bVar.f225009h.mo105663e(bVar)) {
                            iVar2.mo108613i3().mo109044b().mo100242c();
                            iVar2.mo108613i3().mo109044b().clearFocus();
                            iVar2.mo14600f3();
                        }
                    }
                    a0Var = result;
                }
                C78048a0 a0Var2 = a0Var;
            }
            C78646i iVar3 = this.f230346d;
            IStateAction action = wVar.getAction();
            if (action != null && (action instanceof C78052b0)) {
                C78052b0 b0Var = (C78052b0) action;
                if (wVar.f228826n.size() == 0) {
                    C78646i.m95029a(iVar3, C74942w4.m89786c(iVar3.getActivity(), C0966R.dimen.f3758d_));
                }
            }
            C78646i iVar4 = this.f230346d;
            IStateAction action2 = wVar.getAction();
            if (action2 != null && (action2 instanceof C78047a)) {
                C78047a aVar = (C78047a) action2;
                iVar4.mo108613i3().mo109044b().mo100246f();
            }
            C78646i iVar5 = this.f230346d;
            IStateAction action3 = wVar.getAction();
            if (action3 != null && (action3 instanceof C78068v)) {
                List<String> list = ((C78068v) action3).f228818a;
                int c = list.isEmpty() ^ true ? C74942w4.m89786c(iVar5.getActivity(), C0966R.dimen.f3763dc) : C74942w4.m89786c(iVar5.getActivity(), C0966R.dimen.f3758d_);
                if (c > 0) {
                    C78646i.m95029a(iVar5, c);
                }
                iVar5.mo108613i3().mo109044b().mo100245e(list);
            }
            return C13598b0.f38549a;
        }
    }

    /* renamed from: wm3.i$b */
    public static final class C78648b extends C87413o implements C32224a<C79115l> {

        /* renamed from: d */
        public final /* synthetic */ C78646i f230347d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C78648b(C78646i iVar) {
            super(0);
            this.f230347d = iVar;
        }

        public Object invoke() {
            return new C79115l(this.f230347d.getRootView());
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C78646i(AppCompatActivity appCompatActivity) {
        super(appCompatActivity);
        C87412m.m108594g(appCompatActivity, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
    }

    /* renamed from: a */
    public static final void m95029a(C78646i iVar, int i) {
        UIStateCenter stateCenter;
        BaseMvvmActivity d3 = iVar.mo14598d3();
        if (d3 != null && (stateCenter = d3.getStateCenter()) != null) {
            stateCenter.dispatch(new C78060i(i));
        }
    }

    /* renamed from: i3 */
    public final C79115l mo108613i3() {
        return (C79115l) ((C36570n) this.f230345d).getValue();
    }

    public void onCreate(Bundle bundle) {
        UIStateCenter stateCenter;
        BaseMvvmActivity d3 = mo14598d3();
        if (d3 != null && (stateCenter = d3.getStateCenter()) != null) {
            stateCenter.observe((C0125s) getActivity(), new C78647a(this));
        }
    }
}

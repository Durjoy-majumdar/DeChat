package cn3;

import android.os.Bundle;
import android.view.View;
import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.C0125s;
import bc2.C67221b;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.mvvmbase.BaseMvvmActivity;
import com.tencent.p014mm.sdk.statecenter.IStateAction;
import com.tencent.p014mm.sdk.statecenter.IStateActionResult;
import com.tencent.p014mm.sdk.statecenter.UIStateCenter;
import com.tencent.tinker.loader.hotplug.EnvConsts;
import eb0.C45628s0;
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
import tm3.C78069w;
import tm3.C78071z;

/* renamed from: cn3.g */
public class C67417g extends C67221b<C77020b> {

    /* renamed from: d */
    public final C13601g f193333d = C36568h.m40985a(new C67420c(this));

    /* renamed from: cn3.g$a */
    public static final class C67418a extends C87413o implements C32226l<C78069w, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C67417g f193334d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C67418a(C67417g gVar) {
            super(1);
            this.f193334d = gVar;
        }

        public Object invoke(Object obj) {
            C78069w wVar = (C78069w) obj;
            C87412m.m108594g(wVar, "state");
            if (((C64961s) wVar.checkAction(C64961s.class)) != null) {
                C67417g gVar = this.f193334d;
                ((C79115l) ((C36570n) gVar.f193333d).getValue()).mo109044b().setVisibility(0);
                View findViewById = ((C79115l) ((C36570n) gVar.f193333d).getValue()).mo109044b().findViewById(C0966R.C0970id.h7n);
                if (findViewById != null) {
                    findViewById.setBackgroundResource(C0966R.C0969drawable.f357228b82);
                }
            }
            C78071z zVar = (C78071z) wVar.checkAction(C78071z.class);
            if (zVar != null) {
                C67417g gVar2 = this.f193334d;
                IStateActionResult result = zVar.getResult();
                if (result != null && (result instanceof C78048a0) && ((C78048a0) result).f228787b == C78048a0.C78049a.Success) {
                    zVar.f228837a.getClass();
                    C77020b bVar = zVar.f228837a;
                    if (bVar.f225009h.mo105663e(bVar)) {
                        ((C79115l) ((C36570n) gVar2.f193333d).getValue()).mo109044b().mo100242c();
                        ((C79115l) ((C36570n) gVar2.f193333d).getValue()).mo109044b().clearFocus();
                        gVar2.mo14600f3();
                    }
                }
            }
            return C13598b0.f38549a;
        }
    }

    /* renamed from: cn3.g$b */
    public static final class C67419b extends C87413o implements C32226l<C78069w, C13598b0> {

        /* renamed from: d */
        public static final C67419b f193335d = new C67419b();

        public C67419b() {
            super(1);
        }

        public Object invoke(Object obj) {
            C78069w wVar = (C78069w) obj;
            C87412m.m108594g(wVar, "state");
            IStateAction action = wVar.getAction();
            if (action != null && (action instanceof C64961s)) {
                C64961s sVar = (C64961s) action;
                wVar.f228827o.add("weixin");
                wVar.f228827o.addAll(C45628s0.m50776h());
                wVar.f228827o.addAll(C45628s0.m50774g());
                wVar.f228827o.remove("conversationboxservice");
                wVar.f228827o.remove("opencustomerservicemsg");
                wVar.f228827o.remove("filehelper");
            }
            return C13598b0.f38549a;
        }
    }

    /* renamed from: cn3.g$c */
    public static final class C67420c extends C87413o implements C32224a<C79115l> {

        /* renamed from: d */
        public final /* synthetic */ C67417g f193336d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C67420c(C67417g gVar) {
            super(0);
            this.f193336d = gVar;
        }

        public Object invoke() {
            return new C79115l(this.f193336d.getRootView());
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C67417g(AppCompatActivity appCompatActivity) {
        super(appCompatActivity);
        C87412m.m108594g(appCompatActivity, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
    }

    public void onCreate(Bundle bundle) {
        UIStateCenter stateCenter;
        UIStateCenter stateCenter2;
        BaseMvvmActivity d3 = mo14598d3();
        if (!(d3 == null || (stateCenter2 = d3.getStateCenter()) == null)) {
            stateCenter2.observe((C0125s) getActivity(), new C67418a(this));
        }
        BaseMvvmActivity d35 = mo14598d3();
        if (d35 != null && (stateCenter = d35.getStateCenter()) != null) {
            stateCenter.process((C0125s) getActivity(), C67419b.f193335d);
        }
    }
}

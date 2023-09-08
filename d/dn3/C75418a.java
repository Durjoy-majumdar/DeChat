package dn3;

import android.os.Bundle;
import android.view.View;
import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.C0125s;
import bc2.C67221b;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.mvvmbase.BaseMvvmActivity;
import com.tencent.p014mm.sdk.platformtools.Log;
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
import tm3.C78069w;
import tm3.C78071z;

/* renamed from: dn3.a */
public class C75418a extends C67221b<C77020b> {

    /* renamed from: d */
    public final C13601g f221703d = C36568h.m40985a(new C75420b(this));

    /* renamed from: dn3.a$a */
    public static final class C75419a extends C87413o implements C32226l<C78069w, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C75418a f221704d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C75419a(C75418a aVar) {
            super(1);
            this.f221704d = aVar;
        }

        public Object invoke(Object obj) {
            C78069w wVar = (C78069w) obj;
            C87412m.m108594g(wVar, "state");
            if (((C64961s) wVar.checkAction(C64961s.class)) != null) {
                C75418a aVar = this.f221704d;
                Log.m105924i("MicroMsg.SelectContactBaseMvvmListUIC", "InitAction");
                aVar.mo105770i3().mo109044b().setVisibility(0);
                aVar.mo105770i3().mo109044b().setDefaultHint(aVar.getString(C0966R.string.mqb));
                View findViewById = aVar.mo105770i3().mo109044b().findViewById(C0966R.C0970id.h7n);
                if (findViewById != null) {
                    findViewById.setBackgroundResource(C0966R.C0969drawable.f357228b82);
                }
            }
            C78071z zVar = (C78071z) wVar.checkAction(C78071z.class);
            if (zVar != null) {
                C75418a aVar2 = this.f221704d;
                IStateActionResult result = zVar.getResult();
                if (result != null && (result instanceof C78048a0) && ((C78048a0) result).f228787b == C78048a0.C78049a.Success) {
                    zVar.f228837a.getClass();
                    C77020b bVar = zVar.f228837a;
                    if (bVar.f225009h.mo105663e(bVar)) {
                        aVar2.mo105770i3().mo109044b().mo100242c();
                        aVar2.mo105770i3().mo109044b().clearFocus();
                        aVar2.mo14600f3();
                    }
                }
            }
            return C13598b0.f38549a;
        }
    }

    /* renamed from: dn3.a$b */
    public static final class C75420b extends C87413o implements C32224a<C79115l> {

        /* renamed from: d */
        public final /* synthetic */ C75418a f221705d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C75420b(C75418a aVar) {
            super(0);
            this.f221705d = aVar;
        }

        public Object invoke() {
            return new C79115l(this.f221705d.getRootView());
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C75418a(AppCompatActivity appCompatActivity) {
        super(appCompatActivity);
        C87412m.m108594g(appCompatActivity, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
    }

    /* renamed from: i3 */
    public final C79115l mo105770i3() {
        return (C79115l) ((C36570n) this.f221703d).getValue();
    }

    public void onCreate(Bundle bundle) {
        UIStateCenter stateCenter;
        BaseMvvmActivity d3 = mo14598d3();
        if (d3 != null && (stateCenter = d3.getStateCenter()) != null) {
            stateCenter.observe((C0125s) getActivity(), new C75419a(this));
        }
    }
}

package zm3;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.C0125s;
import com.tencent.p014mm.plugin.mvvmbase.BaseMvvmActivity;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.statecenter.IStateAction;
import com.tencent.p014mm.sdk.statecenter.UIStateCenter;
import com.tencent.tinker.loader.hotplug.EnvConsts;
import fy3.C32226l;
import gy3.C87412m;
import gy3.C87413o;
import rx3.C13598b0;
import tm3.C78047a;
import tm3.C78065p;
import tm3.C78069w;
import yb2.C15946a;

/* renamed from: zm3.a */
public final class C16307a extends C15946a {

    /* renamed from: zm3.a$a */
    public static final class C16308a extends C87413o implements C32226l<C78069w, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C16307a f43608d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C16308a(C16307a aVar) {
            super(1);
            this.f43608d = aVar;
        }

        public Object invoke(Object obj) {
            C78069w wVar = (C78069w) obj;
            C87412m.m108594g(wVar, "state");
            C16307a aVar = this.f43608d;
            IStateAction action = wVar.getAction();
            if (action != null && (action instanceof C78047a)) {
                C78047a aVar2 = (C78047a) action;
                Log.m105924i("BackUpProcessResultUIC", "onCreate: ClickCancelMenuAction");
                aVar.getActivity().finish();
            }
            IStateAction action2 = wVar.getAction();
            if (action2 != null && (action2 instanceof C78065p)) {
                Log.m105924i("BackUpProcessResultUIC", "onCreate: SelectConfirmAction  usernameList.size:" + ((C78065p) action2).f228813a.size());
            }
            return C13598b0.f38549a;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C16307a(AppCompatActivity appCompatActivity) {
        super(appCompatActivity);
        C87412m.m108594g(appCompatActivity, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
    }

    public void onCreate(Bundle bundle) {
        UIStateCenter stateCenter;
        super.onCreate(bundle);
        BaseMvvmActivity d3 = mo14598d3();
        if (d3 != null && (stateCenter = d3.getStateCenter()) != null) {
            stateCenter.observe((C0125s) getActivity(), new C16308a(this));
        }
    }
}

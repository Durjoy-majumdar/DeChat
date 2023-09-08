package xm3;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.C0125s;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.mvvmbase.BaseMvvmActivity;
import com.tencent.p014mm.pluginsdk.p133ui.MultiSelectContactView;
import com.tencent.p014mm.sdk.statecenter.IStateAction;
import com.tencent.p014mm.sdk.statecenter.UIStateCenter;
import com.tencent.tinker.loader.hotplug.EnvConsts;
import fy3.C32226l;
import gy3.C87412m;
import gy3.C87413o;
import java.util.List;
import rx3.C13598b0;
import tm3.C78059h;
import tm3.C78069w;
import yb2.C15946a;
import z04.C112550d0;

/* renamed from: xm3.g */
public final class C78899g extends C15946a {

    /* renamed from: xm3.g$a */
    public static final class C78900a extends C87413o implements C32226l<C78069w, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C78899g f231763d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C78900a(C78899g gVar) {
            super(1);
            this.f231763d = gVar;
        }

        public Object invoke(Object obj) {
            C78069w wVar = (C78069w) obj;
            C87412m.m108594g(wVar, "state");
            C78899g gVar = this.f231763d;
            IStateAction action = wVar.getAction();
            if (action != null && (action instanceof C78059h)) {
                C78059h hVar = (C78059h) action;
                String stringExtra = gVar.getActivity().getIntent().getStringExtra("KEY_PRE_SELECT_CONTACT_USERNAME_LIST_STRING");
                List list = null;
                List U = stringExtra != null ? C112550d0.m153785U(stringExtra, new String[]{","}, false, 0, 6, (Object) null) : null;
                boolean z = false;
                if (U != null && (!U.isEmpty())) {
                    z = true;
                }
                if (z) {
                    list = U;
                }
                if (list != null) {
                    ((MultiSelectContactView) gVar.getRootView().findViewById(C0966R.C0970id.bpe)).post(new C78888f(gVar, list));
                }
            }
            return C13598b0.f38549a;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C78899g(AppCompatActivity appCompatActivity) {
        super(appCompatActivity);
        C87412m.m108594g(appCompatActivity, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
    }

    public void onCreate(Bundle bundle) {
        UIStateCenter stateCenter;
        BaseMvvmActivity d3 = mo14598d3();
        if (d3 != null && (stateCenter = d3.getStateCenter()) != null) {
            stateCenter.process((C0125s) getActivity(), new C78900a(this));
        }
    }
}

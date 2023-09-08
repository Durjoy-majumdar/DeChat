package cn3;

import android.content.Context;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.C0125s;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.contact.C57827q0;
import com.tencent.p014mm.plugin.mvvmbase.BaseMvvmActivity;
import com.tencent.p014mm.sdk.statecenter.UIStateCenter;
import com.tencent.tinker.loader.hotplug.EnvConsts;
import fy3.C32226l;
import gy3.C87412m;
import gy3.C87413o;
import p910lj.C76701a;
import rx3.C13598b0;
import tm3.C78069w;
import um3.C78236a;
import um3.C78237b;
import yb2.C15946a;
import z04.C112551y;

/* renamed from: cn3.a */
public final class C67408a extends C15946a {

    /* renamed from: cn3.a$a */
    public static final class C67409a extends C87413o implements C32226l<C78069w, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C67408a f193318d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C67409a(C67408a aVar) {
            super(1);
            this.f193318d = aVar;
        }

        public Object invoke(Object obj) {
            String str;
            C78069w wVar = (C78069w) obj;
            C87412m.m108594g(wVar, "state");
            if (((C78237b) wVar.checkAction(C78237b.class)) != null) {
                C67408a aVar = this.f193318d;
                C76701a.makeText((Context) aVar.getActivity(), (CharSequence) aVar.getActivity().getString(C0966R.string.fjh), 0).show();
            }
            C78236a aVar2 = (C78236a) wVar.checkAction(C78236a.class);
            if (!(aVar2 == null || (str = aVar2.f229201a) == null || C112551y.m153808h(str, "@kefu.openim", false, 2, (Object) null))) {
                C57827q0.m66828a(str);
            }
            return C13598b0.f38549a;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C67408a(AppCompatActivity appCompatActivity) {
        super(appCompatActivity);
        C87412m.m108594g(appCompatActivity, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
    }

    public void onCreate(Bundle bundle) {
        UIStateCenter stateCenter;
        super.onCreate(bundle);
        BaseMvvmActivity d3 = mo14598d3();
        if (d3 != null && (stateCenter = d3.getStateCenter()) != null) {
            stateCenter.observe((C0125s) getActivity(), new C67409a(this));
        }
    }
}

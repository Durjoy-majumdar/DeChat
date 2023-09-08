package un3;

import a14.C53934p0;
import android.content.Intent;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.C0125s;
import com.tencent.p014mm.plugin.mvvmbase.BaseMvvmActivity;
import com.tencent.p014mm.sdk.coroutines.LifecycleScope;
import com.tencent.p014mm.sdk.statecenter.IStateAction;
import com.tencent.p014mm.sdk.statecenter.UIStateCenter;
import com.tencent.tinker.loader.hotplug.EnvConsts;
import fy3.C32226l;
import gy3.C87412m;
import gy3.C87413o;
import java.util.LinkedList;
import java.util.List;
import rx3.C13598b0;
import tm3.C78056e;
import tm3.C78065p;
import tm3.C78067u;
import tm3.C78069w;
import wx3.C15601d;
import yb2.C15946a;
import z04.C112550d0;

/* renamed from: un3.d */
public final class C14263d extends C15946a {

    /* renamed from: un3.d$a */
    public static final class C14264a extends C87413o implements C32226l<C78069w, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C14263d f39800d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C14264a(C14263d dVar) {
            super(1);
            this.f39800d = dVar;
        }

        public Object invoke(Object obj) {
            C78069w wVar = (C78069w) obj;
            C87412m.m108594g(wVar, "state");
            C14263d dVar = this.f39800d;
            IStateAction action = wVar.getAction();
            if (action != null && (action instanceof C78056e)) {
                C78056e eVar = (C78056e) action;
                LifecycleScope c3 = dVar.mo14597c3();
                if (c3 != null) {
                    LifecycleScope.launchDefault$default(c3, (C53934p0) null, new C14254a(dVar, eVar, (C15601d<? super C14254a>) null), 1, (Object) null);
                }
                LifecycleScope c35 = dVar.mo14597c3();
                if (c35 != null) {
                    LifecycleScope.launchDefault$default(c35, (C53934p0) null, new C14257b(dVar, eVar, (C15601d<? super C14257b>) null), 1, (Object) null);
                }
                LifecycleScope c36 = dVar.mo14597c3();
                if (c36 != null) {
                    LifecycleScope.launchDefault$default(c36, (C53934p0) null, new C14260c(dVar, eVar, wVar, (C15601d<? super C14260c>) null), 1, (Object) null);
                }
            }
            return C13598b0.f38549a;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C14263d(AppCompatActivity appCompatActivity) {
        super(appCompatActivity);
        C87412m.m108594g(appCompatActivity, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        C78069w wVar;
        int i3 = i;
        Intent intent2 = intent;
        super.onActivityResult(i, i2, intent);
        if (intent2 != null && i3 == 5) {
            LinkedList linkedList = new LinkedList();
            LinkedList linkedList2 = new LinkedList();
            String stringExtra = intent2.getStringExtra("Select_Contact");
            List list = null;
            if (stringExtra != null) {
                List U = C112550d0.m153785U(stringExtra, new String[]{","}, false, 0, 6, (Object) null);
                if (!(!U.isEmpty())) {
                    U = null;
                }
                if (U != null) {
                    linkedList.addAll(U);
                }
            }
            String stringExtra2 = intent2.getStringExtra("Cancel_Select_Contact");
            if (stringExtra2 != null) {
                List U2 = C112550d0.m153785U(stringExtra2, new String[]{","}, false, 0, 6, (Object) null);
                if (!U2.isEmpty()) {
                    list = U2;
                }
                if (list != null) {
                    linkedList2.addAll(list);
                }
            }
            UIStateCenter e3 = mo14599e3();
            if (e3 != null && (wVar = (C78069w) e3.getState()) != null) {
                if (wVar.mo108033b()) {
                    UIStateCenter e35 = mo14599e3();
                    if (e35 != null) {
                        e35.dispatch(new C78067u(linkedList, linkedList2));
                        return;
                    }
                    return;
                }
                UIStateCenter e36 = mo14599e3();
                if (e36 != null) {
                    e36.dispatch(new C78065p(linkedList, i3));
                }
            }
        }
    }

    public void onCreate(Bundle bundle) {
        UIStateCenter stateCenter;
        super.onCreate(bundle);
        BaseMvvmActivity d3 = mo14598d3();
        if (d3 != null && (stateCenter = d3.getStateCenter()) != null) {
            stateCenter.observe((C0125s) getActivity(), new C14264a(this));
        }
    }
}

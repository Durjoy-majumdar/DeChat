package p249ui;

import a14.C53934p0;
import android.content.Intent;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.C0125s;
import com.tencent.p014mm.sdk.coroutines.LifecycleScope;
import com.tencent.p014mm.sdk.platformtools.Util;
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

/* renamed from: ui.c */
public final class C14193c extends C15946a {

    /* renamed from: ui.c$a */
    public static final class C14194a extends C87413o implements C32226l<C78069w, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C14193c f39648d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C14194a(C14193c cVar) {
            super(1);
            this.f39648d = cVar;
        }

        public Object invoke(Object obj) {
            C78069w wVar = (C78069w) obj;
            C87412m.m108594g(wVar, "state");
            C14193c cVar = this.f39648d;
            IStateAction action = wVar.getAction();
            if (action != null && (action instanceof C78056e)) {
                C78056e eVar = (C78056e) action;
                LifecycleScope c3 = cVar.mo14597c3();
                if (c3 != null) {
                    LifecycleScope.launchDefault$default(c3, (C53934p0) null, new C14190b(cVar, eVar, wVar, (C15601d<? super C14190b>) null), 1, (Object) null);
                }
            }
            C78065p pVar = (C78065p) wVar.checkAction(C78065p.class);
            if (pVar != null) {
                C14193c cVar2 = this.f39648d;
                Intent intent = new Intent();
                intent.putExtra("Select_Contact", Util.listToString(pVar.f228813a, ","));
                cVar2.getActivity().setResult(-1, intent);
                cVar2.getActivity().finish();
            }
            return C13598b0.f38549a;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C14193c(AppCompatActivity appCompatActivity) {
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
        UIStateCenter e3 = mo14599e3();
        if (e3 != null) {
            e3.observe((C0125s) getActivity(), new C14194a(this));
        }
    }
}

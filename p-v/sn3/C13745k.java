package sn3;

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
import sx3.C26236u;
import tm3.C78056e;
import tm3.C78065p;
import tm3.C78066t;
import tm3.C78067u;
import tm3.C78069w;
import wx3.C15601d;
import yb2.C15946a;
import z04.C112550d0;

/* renamed from: sn3.k */
public final class C13745k extends C15946a {

    /* renamed from: sn3.k$a */
    public static final class C13746a extends C87413o implements C32226l<C78069w, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C13745k f38855d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C13746a(C13745k kVar) {
            super(1);
            this.f38855d = kVar;
        }

        public Object invoke(Object obj) {
            C78069w wVar = (C78069w) obj;
            C87412m.m108594g(wVar, "state");
            C78065p pVar = (C78065p) wVar.checkAction(C78065p.class);
            if (pVar != null) {
                C13745k kVar = this.f38855d;
                Intent intent = new Intent();
                intent.putExtra("Select_Conv_User", Util.listToString(pVar.f228813a, ","));
                intent.putExtra("label_source", wVar.f228819d);
                intent.putExtra("Is_Chatroom", pVar.f228814b == 1);
                intent.putExtra("scene_from", 13);
                kVar.getActivity().setResult(-1, intent);
                kVar.getActivity().finish();
            }
            C13745k kVar2 = this.f38855d;
            IStateAction action = wVar.getAction();
            if (action != null && (action instanceof C78056e)) {
                C78056e eVar = (C78056e) action;
                LifecycleScope c3 = kVar2.mo14597c3();
                if (c3 != null) {
                    LifecycleScope.launchDefault$default(c3, (C53934p0) null, new C13739i(kVar2, eVar, wVar, (C15601d<? super C13739i>) null), 1, (Object) null);
                }
                LifecycleScope c35 = kVar2.mo14597c3();
                if (c35 != null) {
                    LifecycleScope.launchDefault$default(c35, (C53934p0) null, new C13742j(kVar2, eVar, wVar, (C15601d<? super C13742j>) null), 1, (Object) null);
                }
            }
            return C13598b0.f38549a;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C13745k(AppCompatActivity appCompatActivity) {
        super(appCompatActivity);
        C87412m.m108594g(appCompatActivity, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        UIStateCenter e3;
        C78069w wVar;
        super.onActivityResult(i, i2, intent);
        if (intent == null) {
            return;
        }
        if (i != 0) {
            List list = null;
            if (i == 4) {
                String stringExtra = intent.getStringExtra("Select_Conv_User");
                C87412m.m108591d(stringExtra);
                List U = C112550d0.m153785U(stringExtra, new String[]{","}, false, 0, 6, (Object) null);
                if (!U.isEmpty()) {
                    list = U;
                }
                if (list != null && (e3 = mo14599e3()) != null) {
                    e3.dispatch(new C78066t(list, i));
                }
            } else if (i == 5) {
                LinkedList linkedList = new LinkedList();
                LinkedList linkedList2 = new LinkedList();
                String stringExtra2 = intent.getStringExtra("Select_Contact");
                if (stringExtra2 != null) {
                    List U2 = C112550d0.m153785U(stringExtra2, new String[]{","}, false, 0, 6, (Object) null);
                    if (!(!U2.isEmpty())) {
                        U2 = null;
                    }
                    if (U2 != null) {
                        linkedList.addAll(U2);
                    }
                }
                String stringExtra3 = intent.getStringExtra("Cancel_Select_Contact");
                if (stringExtra3 != null) {
                    List U3 = C112550d0.m153785U(stringExtra3, new String[]{","}, false, 0, 6, (Object) null);
                    if (!U3.isEmpty()) {
                        list = U3;
                    }
                    if (list != null) {
                        linkedList2.addAll(list);
                    }
                }
                UIStateCenter e35 = mo14599e3();
                if (e35 != null && (wVar = (C78069w) e35.getState()) != null) {
                    if (wVar.mo108033b()) {
                        UIStateCenter e36 = mo14599e3();
                        if (e36 != null) {
                            e36.dispatch(new C78067u(linkedList, linkedList2));
                            return;
                        }
                        return;
                    }
                    UIStateCenter e37 = mo14599e3();
                    if (e37 != null) {
                        e37.dispatch(new C78065p(linkedList, i));
                    }
                }
            }
        } else {
            String stringExtra4 = intent.getStringExtra("Select_Conv_User");
            C87412m.m108591d(stringExtra4);
            UIStateCenter e38 = mo14599e3();
            if (e38 != null) {
                e38.dispatch(new C78065p(C26236u.m33719b(stringExtra4), i));
            }
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        UIStateCenter e3 = mo14599e3();
        if (e3 != null) {
            e3.observe((C0125s) getActivity(), new C13746a(this));
        }
    }
}

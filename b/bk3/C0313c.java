package bk3;

import a14.C53934p0;
import android.content.Intent;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.C0125s;
import com.tencent.p014mm.sdk.coroutines.LifecycleScope;
import com.tencent.p014mm.sdk.statecenter.IStateAction;
import com.tencent.p014mm.sdk.statecenter.UIStateCenter;
import com.tencent.p014mm.storage.C72996z1;
import com.tencent.tinker.loader.hotplug.EnvConsts;
import fy3.C32226l;
import gy3.C87412m;
import gy3.C87413o;
import java.util.LinkedList;
import java.util.List;
import rx3.C13598b0;
import sx3.C110818d0;
import sx3.C26236u;
import tm3.C78056e;
import tm3.C78065p;
import tm3.C78067u;
import tm3.C78069w;
import wx3.C15601d;
import yb2.C15946a;
import z04.C112550d0;

/* renamed from: bk3.c */
public final class C0313c extends C15946a {

    /* renamed from: bk3.c$a */
    public static final class C0314a extends C87413o implements C32226l<C78069w, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C0313c f895d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C0314a(C0313c cVar) {
            super(1);
            this.f895d = cVar;
        }

        public Object invoke(Object obj) {
            C78069w wVar = (C78069w) obj;
            C87412m.m108594g(wVar, "state");
            C78065p pVar = (C78065p) wVar.checkAction(C78065p.class);
            if (pVar != null) {
                C0313c cVar = this.f895d;
                String stringExtra = cVar.getIntent().getStringExtra("received_card_name");
                String str = "";
                if (stringExtra == null) {
                    stringExtra = str;
                }
                Intent intent = new Intent();
                String str2 = (String) C110818d0.m150917O(pVar.f228813a, 0);
                if (str2 != null) {
                    str = str2;
                }
                intent.putExtra("be_send_card_name", str);
                intent.putExtra("received_card_name", stringExtra);
                intent.putExtra("Is_Chatroom", C72996z1.m85820U5(stringExtra));
                cVar.getActivity().setResult(-1, intent);
                cVar.getActivity().finish();
            }
            C0313c cVar2 = this.f895d;
            IStateAction action = wVar.getAction();
            if (action != null && (action instanceof C78056e)) {
                C78056e eVar = (C78056e) action;
                LifecycleScope c3 = cVar2.mo14597c3();
                if (c3 != null) {
                    LifecycleScope.launchDefault$default(c3, (C53934p0) null, new C0307a(cVar2, eVar, (C15601d<? super C0307a>) null), 1, (Object) null);
                }
                LifecycleScope c35 = cVar2.mo14597c3();
                if (c35 != null) {
                    LifecycleScope.launchDefault$default(c35, (C53934p0) null, new C0310b(cVar2, eVar, wVar, (C15601d<? super C0310b>) null), 1, (Object) null);
                }
            }
            return C13598b0.f38549a;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C0313c(AppCompatActivity appCompatActivity) {
        super(appCompatActivity);
        C87412m.m108594g(appCompatActivity, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        C78069w wVar;
        int i3 = i;
        Intent intent2 = intent;
        super.onActivityResult(i, i2, intent);
        if (intent2 == null) {
            return;
        }
        if (i3 == 2) {
            String stringExtra = intent2.getStringExtra("Select_Contact");
            C87412m.m108591d(stringExtra);
            UIStateCenter e3 = mo14599e3();
            if (e3 != null) {
                e3.dispatch(new C78065p(C26236u.m33719b(stringExtra), i3));
            }
        } else if (i3 == 5) {
            LinkedList linkedList = new LinkedList();
            LinkedList linkedList2 = new LinkedList();
            String stringExtra2 = intent2.getStringExtra("Select_Contact");
            List list = null;
            if (stringExtra2 != null) {
                List U = C112550d0.m153785U(stringExtra2, new String[]{","}, false, 0, 6, (Object) null);
                if (!(!U.isEmpty())) {
                    U = null;
                }
                if (U != null) {
                    linkedList.addAll(U);
                }
            }
            String stringExtra3 = intent2.getStringExtra("Cancel_Select_Contact");
            if (stringExtra3 != null) {
                List U2 = C112550d0.m153785U(stringExtra3, new String[]{","}, false, 0, 6, (Object) null);
                if (!U2.isEmpty()) {
                    list = U2;
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
                    e37.dispatch(new C78065p(linkedList, i3));
                }
            }
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        UIStateCenter e3 = mo14599e3();
        if (e3 != null) {
            e3.observe((C0125s) getActivity(), new C0314a(this));
        }
    }
}

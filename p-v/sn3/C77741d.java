package sn3;

import android.content.Intent;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.C0125s;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.chatting.C97182r4;
import com.tencent.p014mm.plugin.mvvmbase.BaseMvvmActivity;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.sdk.statecenter.UIStateCenter;
import com.tencent.tinker.loader.hotplug.EnvConsts;
import com.tencent.wework.api.IWWAPI;
import d62.C7250m;
import eb0.C45628s0;
import fy3.C32226l;
import gy3.C87412m;
import gy3.C87413o;
import java.util.List;
import rx3.C13598b0;
import tm3.C78065p;
import tm3.C78069w;
import um3.C78236a;
import um3.C78238c;
import wd3.C78575u;
import yb2.C15946a;

/* renamed from: sn3.d */
public final class C77741d extends C15946a {

    /* renamed from: sn3.d$a */
    public static final class C77742a extends C87413o implements C32226l<C78069w, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C77741d f226555d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C77742a(C77741d dVar) {
            super(1);
            this.f226555d = dVar;
        }

        public Object invoke(Object obj) {
            C78069w wVar = (C78069w) obj;
            C87412m.m108594g(wVar, "state");
            C78065p pVar = (C78065p) wVar.checkAction(C78065p.class);
            if (pVar != null) {
                C77741d dVar = this.f226555d;
                Log.m105924i("MicroMsg.ForwardTxtUIC", "SelectConfirmAction usernameList:" + pVar.f228813a + ": ");
                String stringExtra = dVar.getActivity().getIntent().getStringExtra("KEY_MSG_CONTENT");
                if (stringExtra == null) {
                    stringExtra = "";
                }
                List<String> list = pVar.f228813a;
                if (list.size() == 1) {
                    String str = list.get(0);
                    C78575u.C78583h hVar = new C78575u.C78583h(dVar.getContext());
                    hVar.mo108578p(str);
                    hVar.mo108571i(stringExtra);
                    hVar.mo108572j(2);
                    hVar.mo108564b(new C77740c(dVar, stringExtra));
                    hVar.mo108569g(Boolean.TRUE);
                    hVar.f230208d = dVar.mo107873i3();
                    hVar.mo108563a(new C77739b(dVar, str, stringExtra));
                    hVar.mo108574l();
                } else {
                    C78575u.C78583h hVar2 = new C78575u.C78583h(dVar.getContext());
                    hVar2.mo108578p(list);
                    hVar2.mo108571i(stringExtra);
                    hVar2.mo108572j(2);
                    hVar2.mo108564b(new C77740c(dVar, stringExtra));
                    hVar2.mo108569g(Boolean.TRUE);
                    hVar2.f230208d = dVar.mo107873i3();
                    hVar2.mo108563a(new C77738a(dVar, list, stringExtra));
                    hVar2.mo108574l();
                }
            }
            C78238c cVar = (C78238c) wVar.checkAction(C78238c.class);
            if (cVar != null) {
                C97182r4.m125143f(this.f226555d.getActivity(), cVar.f229202a, IWWAPI.WWAppType.WwAppTypeWxwork);
            }
            return C13598b0.f38549a;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C77741d(AppCompatActivity appCompatActivity) {
        super(appCompatActivity);
        C87412m.m108594g(appCompatActivity, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
    }

    /* renamed from: g3 */
    public static final boolean m93797g3(C77741d dVar, String str, String str2) {
        dVar.getClass();
        if (Util.isNullOrNil(str2)) {
            Log.m105920e("MicroMsg.ForwardTxtUIC", "processTextTransfer: msgContent empty");
            return false;
        } else if (Util.isNullOrNil(str)) {
            Log.m105920e("MicroMsg.ForwardTxtUIC", "processTextTransfer: toUser empty");
            return false;
        } else {
            C7250m.m7431a().mo136257Tm(str, str2, C45628s0.m50810y(str), 0);
            UIStateCenter e3 = dVar.mo14599e3();
            if (e3 != null) {
                e3.dispatch(new C78236a(str));
            }
            return true;
        }
    }

    /* renamed from: i3 */
    public final String mo107873i3() {
        Intent intent = getContext().getIntent();
        String stringExtra = intent != null ? intent.getStringExtra("KSendWording") : null;
        return Util.isNullOrNil(stringExtra) ? getString(C0966R.string.a2s) : stringExtra;
    }

    public void onCreate(Bundle bundle) {
        UIStateCenter stateCenter;
        super.onCreate(bundle);
        BaseMvvmActivity d3 = mo14598d3();
        if (d3 != null && (stateCenter = d3.getStateCenter()) != null) {
            stateCenter.observe((C0125s) getActivity(), new C77742a(this));
        }
    }
}

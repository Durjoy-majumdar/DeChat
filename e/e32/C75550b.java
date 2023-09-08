package e32;

import android.content.Intent;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.C0125s;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.mvvmbase.BaseMvvmActivity;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.statecenter.IStateAction;
import com.tencent.p014mm.sdk.statecenter.UIStateCenter;
import com.tencent.tinker.loader.hotplug.EnvConsts;
import di3.C86312j;
import eb0.C45628s0;
import eb0.C75592q0;
import ft3.C116895f;
import fy3.C32226l;
import gy3.C87412m;
import gy3.C87413o;
import rx3.C13598b0;
import sx3.C110818d0;
import tm3.C64961s;
import tm3.C78065p;
import tm3.C78069w;
import wc3.C78541w;
import yb2.C15946a;

/* renamed from: e32.b */
public final class C75550b extends C15946a {

    /* renamed from: d */
    public String f221942d = "";

    /* renamed from: e */
    public String f221943e = "";

    /* renamed from: f */
    public boolean f221944f;

    /* renamed from: g */
    public int f221945g;

    /* renamed from: e32.b$a */
    public static final class C75551a extends C87413o implements C32226l<C78069w, C13598b0> {

        /* renamed from: d */
        public static final C75551a f221946d = new C75551a();

        public C75551a() {
            super(1);
        }

        public Object invoke(Object obj) {
            C78069w wVar = (C78069w) obj;
            C87412m.m108594g(wVar, "state");
            IStateAction action = wVar.getAction();
            if (action != null && (action instanceof C64961s)) {
                C64961s sVar = (C64961s) action;
                wVar.f228827o.add(C75592q0.m90789s());
                wVar.f228827o.add("weixin");
                wVar.f228827o.addAll(C45628s0.m50776h());
                wVar.f228827o.addAll(C45628s0.m50774g());
                wVar.f228827o.remove("conversationboxservice");
            }
            return C13598b0.f38549a;
        }
    }

    /* renamed from: e32.b$b */
    public static final class C75552b extends C87413o implements C32226l<C78069w, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C75550b f221947d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C75552b(C75550b bVar) {
            super(1);
            this.f221947d = bVar;
        }

        public Object invoke(Object obj) {
            C78069w wVar = (C78069w) obj;
            C87412m.m108594g(wVar, "state");
            C78065p pVar = (C78065p) wVar.checkAction(C78065p.class);
            if (pVar != null) {
                C75550b bVar = this.f221947d;
                String str = (String) C110818d0.m150917O(pVar.f228813a, 0);
                if (str != null) {
                    if (bVar.f221944f) {
                        C115669n nVar = C115669n.INSTANCE;
                        String str2 = bVar.f221942d;
                        nVar.mo160131h(27809, 2, str2, str2, str, bVar.f221943e, Long.valueOf(System.currentTimeMillis()), 12);
                    } else {
                        C115669n nVar2 = C115669n.INSTANCE;
                        String str3 = bVar.f221942d;
                        nVar2.mo160131h(27809, 2, str3, str3, str, bVar.f221943e, Long.valueOf(System.currentTimeMillis()), 10);
                    }
                    ((C78541w) C86312j.m106911c(C78541w.class)).Lj0(bVar.getContext(), str, bVar.getActivity().getString(C0966R.string.f361158na2), new C75553c(bVar, str));
                }
            }
            return C13598b0.f38549a;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C75550b(AppCompatActivity appCompatActivity) {
        super(appCompatActivity);
        C87412m.m108594g(appCompatActivity, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i == this.f221945g && i2 == -1 && intent != null) {
            String stringExtra = intent.getStringExtra("KEY_FINISH_ACTIVITY_REASON");
            if (C87412m.m108589b(stringExtra, "KEY_FINISH_ACTIVITY_FOR_BACK_PRESSED")) {
                return;
            }
            if (C87412m.m108589b(stringExtra, "KEY_FINISH_ACTIVITY_FOR_PAY_SUCCESS")) {
                Intent intent2 = new Intent();
                intent2.putExtra("KEY_FINISH_ACTIVITY_REASON", "KEY_FINISH_ACTIVITY_FOR_PAY_SUCCESS");
                getActivity().setResult(-1, intent2);
                getActivity().finish();
                return;
            }
            C116895f.m164891c("MicroMsg.QuickSendRedPacketUIC", "unknown finish activity reason, do nothing");
        }
    }

    public boolean onBackPressed() {
        Intent intent = new Intent();
        intent.putExtra("KEY_FINISH_ACTIVITY_REASON", "KEY_FINISH_ACTIVITY_FOR_BACK_PRESSED");
        getActivity().setResult(-1, intent);
        return super.onBackPressed();
    }

    public void onCreate(Bundle bundle) {
        UIStateCenter stateCenter;
        UIStateCenter stateCenter2;
        super.onCreate(bundle);
        C116895f.m164891c("MicroMsg.QuickSendRedPacketUIC", "onCreate");
        BaseMvvmActivity d3 = mo14598d3();
        if (!(d3 == null || (stateCenter2 = d3.getStateCenter()) == null)) {
            stateCenter2.process((C0125s) getActivity(), C75551a.f221946d);
        }
        this.f221942d = String.valueOf(getIntent().getStringExtra("KQuickSendRedPacketMaterialId"));
        this.f221943e = String.valueOf(getIntent().getStringExtra("KQuickSendRedPacketSessionId"));
        this.f221944f = getIntent().getBooleanExtra("KQuickSendRedPacketFromMakeSkinMiniProgram", false);
        this.f221945g = getIntent().getIntExtra("KQuickSendRedPacketRequestCode", 215);
        BaseMvvmActivity d35 = mo14598d3();
        if (d35 != null && (stateCenter = d35.getStateCenter()) != null) {
            stateCenter.observe((C0125s) getActivity(), new C75552b(this));
        }
    }

    public void onDestroy() {
        super.onDestroy();
    }
}

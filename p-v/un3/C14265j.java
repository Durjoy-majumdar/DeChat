package un3;

import android.content.Intent;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.C0125s;
import com.tencent.p014mm.p136ui.chatting.ChattingUI;
import com.tencent.p014mm.plugin.mvvmbase.BaseMvvmActivity;
import com.tencent.p014mm.sdk.statecenter.UIStateCenter;
import com.tencent.tinker.loader.hotplug.EnvConsts;
import fy3.C32226l;
import gy3.C87412m;
import gy3.C87413o;
import j20.C117292a;
import k20.C9556a;
import rx3.C13598b0;
import sx3.C110818d0;
import tm3.C78065p;
import tm3.C78069w;
import yb2.C15946a;

/* renamed from: un3.j */
public final class C14265j extends C15946a {

    /* renamed from: un3.j$a */
    public static final class C14266a extends C87413o implements C32226l<C78069w, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C14265j f39801d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C14266a(C14265j jVar) {
            super(1);
            this.f39801d = jVar;
        }

        public Object invoke(Object obj) {
            C78069w wVar = (C78069w) obj;
            C87412m.m108594g(wVar, "state");
            C78065p pVar = (C78065p) wVar.checkAction(C78065p.class);
            if (pVar != null) {
                C14265j jVar = this.f39801d;
                String str = (String) C110818d0.m150917O(pVar.f228813a, 0);
                if (str != null) {
                    Intent intent = new Intent(jVar.getActivity(), ChattingUI.class);
                    intent.addFlags(67108864);
                    intent.putExtra("Chat_User", str);
                    intent.putExtra("finish_direct", false);
                    AppCompatActivity activity = jVar.getActivity();
                    C9556a aVar = new C9556a();
                    aVar.mo10233c(intent);
                    AppCompatActivity appCompatActivity = activity;
                    C117292a.m165358d(appCompatActivity, aVar.mo10232b(), "com/tencent/mm/ui/uic/SelectDirectChatUIC$onCreate$1", "invoke", "(Lcom/tencent/mm/ui/mvvm/state/SelectContactState;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                    activity.startActivity((Intent) aVar.mo10231a(0));
                    C117292a.m165359e(appCompatActivity, "com/tencent/mm/ui/uic/SelectDirectChatUIC$onCreate$1", "invoke", "(Lcom/tencent/mm/ui/mvvm/state/SelectContactState;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                    jVar.getActivity().finish();
                }
            }
            return C13598b0.f38549a;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C14265j(AppCompatActivity appCompatActivity) {
        super(appCompatActivity);
        C87412m.m108594g(appCompatActivity, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
    }

    public void onCreate(Bundle bundle) {
        UIStateCenter stateCenter;
        super.onCreate(bundle);
        BaseMvvmActivity d3 = mo14598d3();
        if (d3 != null && (stateCenter = d3.getStateCenter()) != null) {
            stateCenter.observe((C0125s) getActivity(), new C14266a(this));
        }
    }
}

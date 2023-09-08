package f00;

import android.content.Context;
import android.content.Intent;
import com.tencent.p014mm.p136ui.base.preference.CheckBoxPreference;
import com.tencent.p014mm.plugin.webview.p128ui.tools.fts.C6166a0;
import com.tencent.p014mm.plugin.webview.p128ui.tools.fts.FTSSOSHomeWebViewUI;
import di3.C86312j;
import eb0.C45628s0;
import eb0.C75592q0;
import f40.C86709a0;
import j20.C117292a;
import k20.C9556a;
import ke3.C88144b;
import p274xx.C15907f;

/* renamed from: f00.b0 */
public class C7958b0 implements C88144b.C9615g {

    /* renamed from: f00.b0$a */
    public class C7959a implements C15907f.C15909b {

        /* renamed from: a */
        public final /* synthetic */ Context f26645a;

        /* renamed from: b */
        public final /* synthetic */ Intent f26646b;

        public C7959a(C7958b0 b0Var, Context context, Intent intent) {
            this.f26645a = context;
            this.f26646b = intent;
        }

        /* renamed from: a */
        public void mo6380a() {
        }

        public void onSuccess() {
            C86709a0.m107535s().mo121142i().mo119676J(147457, Long.valueOf(C75592q0.m90781k() & -2097153));
            Context context = this.f26645a;
            Intent intent = this.f26646b;
            C9556a aVar = new C9556a();
            aVar.mo10233c(intent);
            Context context2 = context;
            C117292a.m165358d(context2, aVar.mo10232b(), "com/tencent/mm/feature/webview/extension/WvPluginInterceptor$1", "onSuccess", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            context.startActivity((Intent) aVar.mo10231a(0));
            C117292a.m165359e(context2, "com/tencent/mm/feature/webview/extension/WvPluginInterceptor$1", "onSuccess", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        }
    }

    /* renamed from: d */
    public boolean mo2009d(Context context, String str, Intent intent) {
        if (!C45628s0.m50756U()) {
            return false;
        }
        if ((!str.equals("com.tencent.mm.plugin.websearch.ui.WebSearchImageLoadingUI") && !str.equals("com.tencent.mm.plugin.websearch.ui.WebSearchSnsImageLoadingUI") && !str.equals(FTSSOSHomeWebViewUI.class.getName()) && !str.equals("com.tencent.mm.plugin.webview.ui.tools.fts.MMFTSSOSHomeWebViewUI") && !str.equals("com.tencent.mm.plugin.webview.ui.tools.fts.FTSSearchTabWebViewUI") && !str.equals("com.tencent.mm.plugin.webview.ui.tools.fts.MMFTSSearchTabWebViewUI")) || !C6166a0.m6052a()) {
            return false;
        }
        ((C15907f) C86312j.m106911c(C15907f.class)).K00(context, 2097152, (CheckBoxPreference) null, new C7959a(this, context, intent), 3);
        return true;
    }
}

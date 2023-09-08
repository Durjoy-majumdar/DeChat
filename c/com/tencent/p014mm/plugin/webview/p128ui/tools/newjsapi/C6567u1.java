package com.tencent.p014mm.plugin.webview.p128ui.tools.newjsapi;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.webview.modeltools.C43741b;
import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C87412m;
import j20.C117292a;
import java.util.Map;
import k20.C9556a;
import qo3.C47883u;
import qo3.C77426q;
import t83.C13851h1;
import t83.C13855j;
import w83.C15053a;
import z04.C112551y;

/* renamed from: com.tencent.mm.plugin.webview.ui.tools.newjsapi.u1 */
public final class C6567u1 extends C15053a {

    /* renamed from: d */
    public static final C6567u1 f23784d = new C6567u1();

    /* renamed from: com.tencent.mm.plugin.webview.ui.tools.newjsapi.u1$a */
    public static final class C6568a implements C47883u {

        /* renamed from: a */
        public final /* synthetic */ C13855j f23785a;

        /* renamed from: b */
        public final /* synthetic */ C13851h1 f23786b;

        public C6568a(C13855j jVar, C13851h1 h1Var) {
            this.f23785a = jVar;
            this.f23786b = h1Var;
        }

        /* renamed from: a */
        public final void mo353a(boolean z, String str) {
            this.f23785a.f39001d.mo10774a(this.f23786b.f38990c, "open_url_by_ext_browser:ok", (Map<String, Object>) null);
        }
    }

    /* renamed from: com.tencent.mm.plugin.webview.ui.tools.newjsapi.u1$b */
    public static final class C6569b implements C47883u {

        /* renamed from: a */
        public final /* synthetic */ C13855j f23787a;

        /* renamed from: b */
        public final /* synthetic */ C13851h1 f23788b;

        public C6569b(C13855j jVar, C13851h1 h1Var) {
            this.f23787a = jVar;
            this.f23788b = h1Var;
        }

        /* renamed from: a */
        public final void mo353a(boolean z, String str) {
            this.f23787a.f39001d.mo10774a(this.f23788b.f38990c, "open_url_by_ext_browser:cancel", (Map<String, Object>) null);
        }
    }

    /* renamed from: com.tencent.mm.plugin.webview.ui.tools.newjsapi.u1$c */
    public static final class C6570c implements C47883u {

        /* renamed from: a */
        public final /* synthetic */ String f23789a;

        /* renamed from: b */
        public final /* synthetic */ C13855j f23790b;

        /* renamed from: c */
        public final /* synthetic */ C13851h1 f23791c;

        public C6570c(String str, C13855j jVar, C13851h1 h1Var) {
            this.f23789a = str;
            this.f23790b = jVar;
            this.f23791c = h1Var;
        }

        /* renamed from: a */
        public final void mo353a(boolean z, String str) {
            try {
                Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(this.f23789a));
                intent.addFlags(268435456);
                Context context = this.f23790b.f38998a;
                C9556a aVar = new C9556a();
                aVar.mo10233c(intent);
                C117292a.m165358d(context, aVar.mo10232b(), "com/tencent/mm/plugin/webview/ui/tools/newjsapi/JsApiOpenUrlByExtBrowser$handleMsg$3", "onDialogClick", "(ZLjava/lang/String;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                context.startActivity((Intent) aVar.mo10231a(0));
                C117292a.m165359e(context, "com/tencent/mm/plugin/webview/ui/tools/newjsapi/JsApiOpenUrlByExtBrowser$handleMsg$3", "onDialogClick", "(ZLjava/lang/String;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                this.f23790b.f39001d.mo10774a(this.f23791c.f38990c, "open_url_by_ext_browser:ok", (Map<String, Object>) null);
            } catch (Exception e) {
                Log.printErrStackTrace("MicroMsg.JsApiOpenUrlByExtBrowser", e, "openUrlByExtBrowser exception", new Object[0]);
                this.f23790b.f39001d.mo10774a(this.f23791c.f38990c, "open_url_by_ext_browser:fail", (Map<String, Object>) null);
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.webview.ui.tools.newjsapi.u1$d */
    public static final class C6571d implements C47883u {

        /* renamed from: a */
        public final /* synthetic */ C13855j f23792a;

        /* renamed from: b */
        public final /* synthetic */ C13851h1 f23793b;

        public C6571d(C13855j jVar, C13851h1 h1Var) {
            this.f23792a = jVar;
            this.f23793b = h1Var;
        }

        /* renamed from: a */
        public final void mo353a(boolean z, String str) {
            this.f23792a.f39001d.mo10774a(this.f23793b.f38990c, "open_url_by_ext_browser:cancel", (Map<String, Object>) null);
        }
    }

    /* renamed from: a */
    public boolean mo7286a(C13855j jVar, C13851h1 h1Var) {
        C87412m.m108594g(jVar, "env");
        C87412m.m108594g(h1Var, "msg");
        String str = (String) h1Var.f38983a.get("url");
        if (str == null || str.length() == 0) {
            Log.m105920e("MicroMsg.JsApiOpenUrlByExtBrowser", "openUrlByExtBrowser url is null");
            jVar.f39001d.mo10774a(h1Var.f38990c, "open_url_by_ext_browser:fail", (Map<String, Object>) null);
            return true;
        }
        Log.m105925i("MicroMsg.JsApiOpenUrlByExtBrowser", "openUrlByExtBrowser url: %s", str);
        String string = jVar.f38998a.getString(C0966R.string.mpy);
        C87412m.m108593f(string, "env.context.getString(R.…w_browser_open_third_app)");
        if (C112551y.m153819s(str, "http", false)) {
            C43741b.m47584b(jVar.f38998a, str, string, new C6568a(jVar, h1Var), new C6569b(jVar, h1Var));
        } else {
            C77426q qVar = new C77426q(jVar.f38998a);
            qVar.mo107595g(string);
            qVar.mo107602n(jVar.f38998a.getString(C0966R.string.f7564js));
            qVar.mo107598j(jVar.f38998a.getString(C0966R.string.f7926wf));
            qVar.mo107600l(new C6570c(str, jVar, h1Var));
            qVar.mo107597i(new C6571d(jVar, h1Var));
            qVar.mo107603o();
        }
        return true;
    }

    /* renamed from: b */
    public int mo7287b() {
        return 55;
    }

    /* renamed from: c */
    public String mo7288c() {
        return "openUrlByExtBrowser";
    }
}

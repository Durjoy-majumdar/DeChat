package com.tencent.p014mm.plugin.webview.model;

import android.os.Bundle;
import com.tencent.p014mm.model.gdpr.C1290b;
import com.tencent.p014mm.plugin.webview.model.C85523o0;
import com.tencent.p014mm.plugin.webview.model.C85541t0;
import com.tencent.p014mm.sdk.platformtools.Log;
import ea3.C7608b;
import ji3.C9457a;

/* renamed from: com.tencent.mm.plugin.webview.model.y0 */
public final class C85555y0 implements C1290b {

    /* renamed from: a */
    public final /* synthetic */ String f249337a;

    /* renamed from: b */
    public final /* synthetic */ C85541t0.C85544b f249338b;

    /* renamed from: com.tencent.mm.plugin.webview.model.y0$a */
    public static final class C85556a implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ int f249339d;

        /* renamed from: e */
        public final /* synthetic */ String f249340e;

        /* renamed from: f */
        public final /* synthetic */ C85541t0.C85544b f249341f;

        public C85556a(int i, String str, C85541t0.C85544b bVar) {
            this.f249339d = i;
            this.f249340e = str;
            this.f249341f = bVar;
        }

        public void run() {
            String string;
            C7608b bVar = C7608b.INSTANCE;
            String str = "";
            if (this.f249339d == 1) {
                C85541t0 t0Var = C85541t0.f249286a;
                t0Var.getClass();
                Log.m105924i(C85541t0.f249287b, "[OauthQueue.sendResult] MPGdprPolicyUtil.checkPolicy DENY");
                String str2 = this.f249340e;
                bVar.mo8744a(str2 == null ? str : str2, C85523o0.C85524b.f249235a, 0, 1, 0, 1, 0);
                C85541t0.m105566a(t0Var);
            } else {
                C85541t0 t0Var2 = C85541t0.f249286a;
                t0Var2.getClass();
                String str3 = C85541t0.f249287b;
                Log.m105924i(str3, "[OauthQueue.sendResult] MPGdprPolicyUtil.checkPolicy PROCEED");
                String str4 = this.f249340e;
                bVar.mo8744a(str4 == null ? str : str4, C85523o0.C85524b.f249235a, 1, 1, 0, 1, 0);
                C85541t0.C85544b bVar2 = this.f249341f;
                Bundle bundle = bVar2.f249307e;
                boolean z = bundle != null ? bundle.getBoolean("is_call_server_when_confirm") : false;
                t0Var2.getClass();
                Log.m105924i(str3, "[OauthQueue.accept] isCallServerWhenConfirm = " + z);
                if (z) {
                    bVar2.mo118932a(1);
                } else {
                    Bundle bundle2 = bVar2.f249307e;
                    if (!(bundle2 == null || (string = bundle2.getString("redirect_url")) == null)) {
                        str = string;
                    }
                    C85541t0.m105567b(t0Var2, str);
                }
            }
            bVar.mo8745b(2, (int) (System.currentTimeMillis() - C85523o0.C85524b.f249236b), 0);
        }
    }

    public C85555y0(String str, C85541t0.C85544b bVar) {
        this.f249337a = str;
        this.f249338b = bVar;
    }

    /* renamed from: a */
    public final void mo1216a(int i) {
        C9457a.m9138b(true, new C85556a(i, this.f249337a, this.f249338b));
    }
}

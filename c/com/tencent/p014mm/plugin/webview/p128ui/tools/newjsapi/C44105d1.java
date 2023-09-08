package com.tencent.p014mm.plugin.webview.p128ui.tools.newjsapi;

import android.os.Bundle;
import com.tencent.p014mm.openim.model.OpenImKefuStartChattingResultReceiver;
import com.tencent.p014mm.sdk.platformtools.Log;
import zt3.C119157j;
import zt3.C119179t;

/* renamed from: com.tencent.mm.plugin.webview.ui.tools.newjsapi.d1 */
public final class C44105d1 implements OpenImKefuStartChattingResultReceiver.C40388a {

    /* renamed from: a */
    public boolean f119474a;

    /* renamed from: com.tencent.mm.plugin.webview.ui.tools.newjsapi.d1$a */
    public static final class C44106a implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ int f119475d;

        /* renamed from: e */
        public final /* synthetic */ String f119476e;

        public C44106a(int i, String str) {
            this.f119475d = i;
            this.f119476e = str;
        }

        public final void run() {
            C44107e1.f119477d.mo68730e(this.f119475d, this.f119476e);
        }
    }

    /* renamed from: a */
    public void mo63102a(Bundle bundle) {
        int i;
        if (bundle != null && (i = bundle.getInt("result_key_action", -1)) >= 0) {
            int i2 = bundle.getInt("result_key_err_code", -1);
            String string = bundle.getString("result_key_err_msg");
            if (string == null) {
                string = "";
            }
            Log.m105924i("MicroMsg.JsApiOpenCustomerServiceChat", "openCustomerServiceChat startKfConversation onReceiveResult action: " + i + ", errCode: " + i2 + ", errMsg: " + string);
            if (i == 2) {
                C44107e1.f119477d.mo68730e(i2, string);
            } else if (i == 3) {
                C119179t tVar = C119157j.f356862d;
                C44106a aVar = new C44106a(i2, string);
                long j = this.f119474a ? 0 : 600;
                C119157j jVar = (C119157j) tVar;
                jVar.getClass();
                jVar.mo183892w(aVar, j, false);
            } else if (i == 4) {
                C44107e1.f119477d.mo68730e(i2, string);
            } else if (i == 5) {
                this.f119474a = true;
            } else if (i == 6) {
                C44107e1.f119477d.mo68730e(i2, string);
            }
        }
    }
}

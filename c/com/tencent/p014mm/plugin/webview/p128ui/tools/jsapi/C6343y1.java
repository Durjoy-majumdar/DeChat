package com.tencent.p014mm.plugin.webview.p128ui.tools.jsapi;

import android.content.Intent;
import android.os.Bundle;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.Map;
import ke3.C88144b;
import qo3.C47883u;
import t83.C13851h1;

/* renamed from: com.tencent.mm.plugin.webview.ui.tools.jsapi.y1 */
public class C6343y1 implements C47883u {

    /* renamed from: a */
    public final /* synthetic */ String f23237a;

    /* renamed from: b */
    public final /* synthetic */ String f23238b;

    /* renamed from: c */
    public final /* synthetic */ String f23239c;

    /* renamed from: d */
    public final /* synthetic */ int f23240d;

    /* renamed from: e */
    public final /* synthetic */ C13851h1 f23241e;

    /* renamed from: f */
    public final /* synthetic */ MsgHandler f23242f;

    public C6343y1(MsgHandler msgHandler, String str, String str2, String str3, int i, C13851h1 h1Var) {
        this.f23242f = msgHandler;
        this.f23237a = str;
        this.f23238b = str2;
        this.f23239c = str3;
        this.f23240d = i;
        this.f23241e = h1Var;
    }

    /* renamed from: a */
    public void mo353a(boolean z, String str) {
        if (z) {
            Intent intent = new Intent();
            intent.putExtra(FirebaseAnalytics.C113379b.TRANSACTION_ID, this.f23237a);
            intent.putExtra("transfer_id", this.f23238b);
            intent.putExtra("receiver_name", this.f23239c);
            intent.putExtra("resend_msg_from_flag", 4);
            intent.putExtra("is_open_im", this.f23240d);
            C88144b.m109791i(this.f23242f.f22697d, "remittance", ".ui.RemittanceResendMsgUI", intent, (Bundle) null);
            this.f23242f.mo7210k5(this.f23241e, "doResendRemittanceMsg:ok", (Map<String, Object>) null);
            return;
        }
        this.f23242f.mo7210k5(this.f23241e, "doResendRemittanceMsg:fail", (Map<String, Object>) null);
    }
}

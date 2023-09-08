package com.tencent.p014mm.plugin.remittance.p098ui;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.tencent.p014mm.plugin.remittance.model.C70611s0;
import ke3.C88144b;
import qo3.C47883u;
import td2.C77891a;

/* renamed from: com.tencent.mm.plugin.remittance.ui.o0 */
public class C70928o0 implements C77891a.C77892a {

    /* renamed from: a */
    public final /* synthetic */ C70611s0 f205372a;

    /* renamed from: b */
    public final /* synthetic */ RemittanceDetailUI f205373b;

    /* renamed from: com.tencent.mm.plugin.remittance.ui.o0$a */
    public class C70929a implements C47883u {
        public C70929a() {
        }

        /* renamed from: a */
        public void mo353a(boolean z, String str) {
            if (z) {
                Intent intent = new Intent();
                intent.putExtra(FirebaseAnalytics.C113379b.TRANSACTION_ID, C70928o0.this.f205373b.f204734X);
                intent.putExtra("transfer_id", C70928o0.this.f205373b.f204738Z);
                intent.putExtra("receiver_name", C70928o0.this.f205373b.f204729U0);
                intent.putExtra("resend_msg_from_flag", 3);
                intent.putExtra("is_open_im", C70928o0.this.f205373b.f204739Z0 ? 1 : 0);
                RemittanceDetailUI remittanceDetailUI = C70928o0.this.f205373b;
                remittanceDetailUI.getClass();
                C88144b.m109791i(remittanceDetailUI, "remittance", ".ui.RemittanceResendMsgUI", intent, (Bundle) null);
            }
        }
    }

    public C70928o0(RemittanceDetailUI remittanceDetailUI, C70611s0 s0Var) {
        this.f205373b = remittanceDetailUI;
        this.f205372a = s0Var;
    }

    public void onClick(View view) {
        new C70939r(this.f205373b).mo97594a(this.f205372a.mo97258r1(), new C70929a());
    }
}

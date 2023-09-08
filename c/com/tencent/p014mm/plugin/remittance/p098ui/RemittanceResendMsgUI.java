package com.tencent.p014mm.plugin.remittance.p098ui;

import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.autogen.events.RemittanceDetailUIFinishEvent;
import com.tencent.p014mm.plugin.remittance.model.C42844k0;
import com.tencent.p014mm.plugin.remittance.model.C42850p0;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.wallet_core.p137ui.WalletBaseUI;
import j20.C117292a;
import k20.C60958c;
import k20.C9556a;
import nj3.C100124v0;
import nj3.C76879j;
import nj3.C88989a;
import ob0.C117747y;
import te3.C50580nr;

@C88989a(7)
/* renamed from: com.tencent.mm.plugin.remittance.ui.RemittanceResendMsgUI */
public class RemittanceResendMsgUI extends WalletBaseUI {

    /* renamed from: com.tencent.mm.plugin.remittance.ui.RemittanceResendMsgUI$a */
    public class C42865a implements DialogInterface.OnClickListener {
        public C42865a() {
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            Log.m105924i("MicroMsg.RemittanceResendMsgUI", "click AlertDialog");
            RemittanceResendMsgUI.this.finish();
        }
    }

    public int getLayoutId() {
        return -1;
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        addSceneEndListener(4808);
        View contentView = getContentView();
        C9556a aVar = new C9556a();
        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
        aVar.mo10233c(8);
        C117292a.m165358d(contentView, aVar.mo10232b(), "com/tencent/mm/plugin/remittance/ui/RemittanceResendMsgUI", "onCreate", "(Landroid/os/Bundle;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        contentView.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
        C117292a.m165359e(contentView, "com/tencent/mm/plugin/remittance/ui/RemittanceResendMsgUI", "onCreate", "(Landroid/os/Bundle;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        setTitleVisibility(8);
        String stringExtra = getIntent().getStringExtra(FirebaseAnalytics.C113379b.TRANSACTION_ID);
        String stringExtra2 = getIntent().getStringExtra("transfer_id");
        String stringExtra3 = getIntent().getStringExtra("receiver_name");
        int intExtra = getIntent().getIntExtra("resend_msg_from_flag", 1);
        int intExtra2 = getIntent().getIntExtra("invalid_time", 0);
        int intExtra3 = getIntent().getIntExtra("is_open_im", 0);
        if (Util.isNullOrNil(stringExtra3)) {
            Log.m105924i("MicroMsg.RemittanceResendMsgUI", "onCreate() receiverName == null");
        } else if (intExtra3 != 0) {
            doSceneProgress(new C42850p0(stringExtra2, intExtra));
        } else {
            C42844k0 k0Var = new C42844k0(stringExtra, stringExtra2, stringExtra3, intExtra2, intExtra);
            k0Var.setProcessName("RemittanceProcess");
            doSceneProgress(k0Var);
        }
    }

    public void onDestroy() {
        super.onDestroy();
        removeSceneEndListener(4808);
    }

    public boolean onSceneEnd(int i, int i2, String str, C117747y yVar) {
        Log.m105924i("MicroMsg.RemittanceResendMsgUI", "onSceneEnd() errType:" + i + " errCode:" + i2 + " errMsg:" + str + " netsceneType:" + yVar.getType());
        if (yVar instanceof C42844k0) {
            if (i == 0 && i2 == 0) {
                C100124v0.m130821c((Drawable) null, getContext().getResources().getString(C0966R.string.fjh), getContext(), 0, (DialogInterface.OnDismissListener) null);
                finish();
                new RemittanceDetailUIFinishEvent().publish();
                return true;
            }
            C76879j.m92754y(this, str, "", getContext().getString(C0966R.string.f8028zq), new C42865a());
            return true;
        } else if (!(yVar instanceof C42850p0)) {
            return false;
        } else {
            if (i == 0 && i2 == 0) {
                C50580nr nrVar = ((C42850p0) yVar).f116043r;
                if (nrVar.f138722d == 0) {
                    C100124v0.m130821c((Drawable) null, getContext().getResources().getString(C0966R.string.fjh), getContext(), 0, (DialogInterface.OnDismissListener) null);
                    finish();
                    new RemittanceDetailUIFinishEvent().publish();
                } else {
                    showNetErrorDialog(nrVar.f138723e, true);
                }
            } else {
                showNetErrorDialog(str, true);
            }
            return true;
        }
    }
}

package com.tencent.p014mm.plugin.wallet.balance.p119ui.lqt;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.tencent.kinda.gen.ITransmitKvData;
import com.tencent.kinda.gen.UseCaseCallback;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.wallet_core.p137ui.C75228t;
import com.tencent.p014mm.wallet_core.p137ui.WalletBaseUI;
import di3.C86312j;
import ie3.C76324c;
import jm2.C117361f;
import nj3.C76879j;
import nj3.C88989a;
import ob0.C117747y;

@C88989a(3)
/* renamed from: com.tencent.mm.plugin.wallet.balance.ui.lqt.WalletLqtCheckPwdInputDialogUI */
public class WalletLqtCheckPwdInputDialogUI extends WalletBaseUI {

    /* renamed from: d */
    public String f207916d = "";

    /* renamed from: e */
    public String f207917e = "";

    /* renamed from: f */
    public String f207918f;

    /* renamed from: com.tencent.mm.plugin.wallet.balance.ui.lqt.WalletLqtCheckPwdInputDialogUI$a */
    public class C71718a implements DialogInterface.OnClickListener {
        public C71718a() {
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            WalletLqtCheckPwdInputDialogUI.this.finish();
        }
    }

    /* renamed from: com.tencent.mm.plugin.wallet.balance.ui.lqt.WalletLqtCheckPwdInputDialogUI$b */
    public class C71719b implements UseCaseCallback {
        public C71719b() {
        }

        public void call(ITransmitKvData iTransmitKvData) {
            if (iTransmitKvData == null) {
                Log.m105924i("MicroMsg.WalletLqtCheckPwdInputDialogUI", "hy: verifyPwdPay fail, data is null");
                WalletLqtCheckPwdInputDialogUI.this.finish();
            } else if (iTransmitKvData.getInt("retCode") == 0) {
                Intent intent = new Intent();
                intent.putExtra("lqt_fetch_enc_pwd", iTransmitKvData.getString("pwd"));
                intent.putExtra("lqt_redeem_listid", WalletLqtCheckPwdInputDialogUI.this.f207918f);
                WalletLqtCheckPwdInputDialogUI.this.setResult(-1, intent);
                WalletLqtCheckPwdInputDialogUI.this.finish();
            } else {
                WalletLqtCheckPwdInputDialogUI.this.finish();
            }
        }
    }

    /* renamed from: H7 */
    public final void mo98913H7() {
        this.f207917e = C75228t.m90256l(Util.getDouble(this.f207917e, 0.0d));
        ITransmitKvData create = ITransmitKvData.create();
        create.putString("sp_name", this.f207916d);
        create.putString(FirebaseAnalytics.C113379b.PRICE, this.f207917e);
        ((C76324c) C86312j.m106911c(C76324c.class)).startUseCase("verifyPwdPay", create, new C71719b());
    }

    public void cleanUiData(int i) {
        if (i == 0) {
            finish();
        } else if (i == 1) {
            mo98913H7();
        }
    }

    public int getLayoutId() {
        return -1;
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentViewVisibility(4);
        this.f207916d = getIntent().getStringExtra("lqt_fetch_pwd_title");
        this.f207917e = getIntent().getStringExtra("lqt_fetch_pwd_money");
        this.f207918f = getIntent().getStringExtra("lqt_redeem_listid");
        boolean z = true;
        Log.m105925i("MicroMsg.WalletLqtCheckPwdInputDialogUI", "hy: money : %s, title : %s, redeemListId: %s", Util.nullAsNil(this.f207917e), Util.nullAsNil(this.f207916d), this.f207918f);
        if (Util.isNullOrNil(this.f207916d) || Util.isNullOrNil(this.f207917e)) {
            z = false;
        }
        if (!z) {
            C76879j.m92742m(getContext(), C0966R.string.l0d, 0, new C71718a());
            return;
        }
        getWindow().setBackgroundDrawableResource(C0966R.color.ahf);
        C117361f.INSTANCE.Tj0();
        mo98913H7();
    }

    public boolean onSceneEnd(int i, int i2, String str, C117747y yVar) {
        return false;
    }
}

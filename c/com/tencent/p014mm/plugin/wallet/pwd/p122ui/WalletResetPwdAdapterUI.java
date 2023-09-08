package com.tencent.p014mm.plugin.wallet.pwd.p122ui;

import android.content.Intent;
import android.os.Bundle;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.wallet_core.p137ui.WalletBaseUI;
import i53.C76294b;
import ie3.C8883h;
import nj3.C76879j;
import nj3.C88989a;
import ob0.C117747y;
import te3.C64592nu;
import te3.C64607oc3;
import v53.C78339d;
import yq3.C79143a;
import yq3.C79148e;

@C88989a(7)
/* renamed from: com.tencent.mm.plugin.wallet.pwd.ui.WalletResetPwdAdapterUI */
public class WalletResetPwdAdapterUI extends WalletBaseUI {

    /* renamed from: d */
    public String f208909d = "";

    public int getLayoutId() {
        return -1;
    }

    public void onBackPressed() {
        Log.m105918d("MicroMsg.WalletResetPwdAdapterUI", "back press not lock");
        finish();
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentViewVisibility(8);
        String stringExtra = getIntent().getStringExtra("reset_pwd_token");
        this.f208909d = stringExtra;
        Log.m105925i("MicroMsg.WalletResetPwdAdapterUI", "token_by_resetPwd %s", stringExtra);
        addSceneEndListener(580);
        if (getIntent() == null) {
            Log.m105918d("MicroMsg.WalletResetPwdAdapterUI", "func[doCheckPayNetscene] intent null");
            setResult(0);
            finish();
            return;
        }
        C78339d dVar = new C78339d(getIntent().getStringExtra("appId"), getIntent().getStringExtra("timeStamp"), getIntent().getStringExtra("nonceStr"), getIntent().getStringExtra("packageExt"), getIntent().getStringExtra("signtype"), getIntent().getStringExtra("paySignature"), getIntent().getStringExtra("url"), 13, "setWCPayPassword", getIntent().getIntExtra("pay_channel", 0));
        dVar.setProcessName("RemittanceProcess");
        doSceneForceProgress(dVar);
    }

    public void onDestroy() {
        removeSceneEndListener(580);
        super.onDestroy();
    }

    public void onNewIntent(Intent intent) {
        Log.m105926v("MicroMsg.WalletResetPwdAdapterUI", "onNewIntent");
        int intExtra = intent.getIntExtra("RESET_PWD_USER_ACTION", 0);
        if (intExtra == 1) {
            setResult(-1);
            finish();
        } else if (intExtra == 2) {
            setResult(-1000);
            finish();
        } else {
            setResult(0);
            finish();
        }
    }

    public boolean onSceneEnd(int i, int i2, String str, C117747y yVar) {
        if (i != 0 || i2 != 0) {
            setResult(-1000);
            C76879j.m92726T(this, str);
            finish();
            return true;
        } else if (!(yVar instanceof C78339d)) {
            return false;
        } else {
            C78339d dVar = (C78339d) yVar;
            C8883h.f28150a = dVar.mo108331j1();
            Bundle bundle = new Bundle();
            bundle.putString("kreq_token", this.f208909d);
            C64607oc3 oc32 = ((C64592nu) dVar.f229547e.f127056b.f127083a).f184560g;
            if (oc32 != null) {
                bundle.putString("key_pwd_title", oc32.f184658d);
                bundle.putString("key_pwd_desc", oc32.f184659e);
            }
            C79143a.m95771j(this, C76294b.class, bundle, (C79148e.C79149a) null);
            return true;
        }
    }
}

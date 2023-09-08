package com.tencent.p014mm.plugin.wallet.p123ui;

import android.content.Intent;
import android.os.Bundle;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.wallet_core.p137ui.WalletBaseUI;
import di3.C86312j;
import ie3.C76324c;
import ie3.C8883h;
import ke3.C88144b;
import nj3.C76879j;
import nj3.C88989a;
import ob0.C117747y;
import v53.C78339d;

@C88989a(7)
/* renamed from: com.tencent.mm.plugin.wallet.ui.WalletJsApiAdapterUI */
public class WalletJsApiAdapterUI extends WalletBaseUI {

    /* renamed from: d */
    public String f209018d = "";

    /* renamed from: e */
    public String f209019e = "";

    public int getLayoutId() {
        return -1;
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i == 1) {
            setResult(-1);
            finish();
        }
    }

    public void onBackPressed() {
        Log.m105918d("MicroMsg.WalletJsApiAdapterUI", "back press not lock");
        finish();
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentViewVisibility(8);
        this.f209018d = getIntent().getStringExtra("intent_jump_package");
        this.f209019e = getIntent().getStringExtra("intent_jump_ui");
        addSceneEndListener(580);
        if (getIntent() == null) {
            Log.m105918d("MicroMsg.WalletJsApiAdapterUI", "func[doCheckPayNetscene] intent null");
            setResult(0);
            finish();
            return;
        }
        int intExtra = getIntent().getIntExtra("source_type", 1);
        Log.m105925i("MicroMsg.WalletJsApiAdapterUI", "do check jsapi: %s", Integer.valueOf(intExtra));
        C78339d dVar = null;
        if (intExtra == 1) {
            dVar = new C78339d(getIntent().getStringExtra("appId"), getIntent().getStringExtra("timeStamp"), getIntent().getStringExtra("nonceStr"), getIntent().getStringExtra("packageExt"), getIntent().getStringExtra("signtype"), getIntent().getStringExtra("paySignature"), getIntent().getStringExtra("url"), getIntent().getIntExtra("jsapi_scene", 0), "openWCPayCardList", getIntent().getIntExtra("pay_channel", 0));
        } else if (intExtra == 2) {
            dVar = new C78339d(getIntent().getStringExtra("appId"), getIntent().getStringExtra("timeStamp"), getIntent().getStringExtra("nonceStr"), getIntent().getStringExtra("packageExt"), getIntent().getStringExtra("signtype"), getIntent().getStringExtra("paySignature"), getIntent().getIntExtra("jsapi_scene", 0), getIntent().getStringExtra("wxapp_username"), getIntent().getStringExtra("wxapp_path"), getIntent().getStringExtra("command_word"), getIntent().getIntExtra("pay_channel", 0));
        }
        if (dVar != null) {
            doSceneForceProgress(dVar);
        }
    }

    public void onDestroy() {
        removeSceneEndListener(580);
        super.onDestroy();
    }

    public void onNewIntent(Intent intent) {
        Log.m105926v("MicroMsg.WalletJsApiAdapterUI", "onNewIntent");
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
        Class cls = C76324c.class;
        Log.m105925i("MicroMsg.WalletJsApiAdapterUI", "onSceneEnd errType %s errCode %s errMsg %s scene %s", Integer.valueOf(i), Integer.valueOf(i2), str, yVar);
        if (i != 0 || i2 != 0) {
            setResult(-1000);
            C76879j.m92726T(this, str);
            finish();
            return true;
        } else if (!(yVar instanceof C78339d)) {
            return false;
        } else {
            C8883h.f28150a = ((C78339d) yVar).mo108331j1();
            if (!Util.isNullOrNil(this.f209019e) && this.f209019e.equals("openHKOfflinePayView")) {
                ((C76324c) C86312j.m106911c(cls)).startHKOfflinePrePayFromJsApi(this, getIntent().getStringExtra("packageExt"));
                setResult(-1);
                finish();
            } else if (!Util.isNullOrNil(this.f209019e) && this.f209019e.equals("requestHKCashier")) {
                ((C76324c) C86312j.m106911c(cls)).requestHKCashierNotify(this, getIntent().getStringExtra("packageExt"));
                setResult(-1);
                finish();
            } else if (Util.isNullOrNil(this.f209018d) || Util.isNullOrNil(this.f209019e)) {
                setResult(-1);
                finish();
            } else {
                Intent intent = new Intent();
                intent.putExtra("intent_finish_self", true);
                C88144b.m109795m(this, this.f209018d, this.f209019e, intent, 1);
            }
            return true;
        }
    }
}

package com.tencent.p014mm.plugin.wallet.p123ui;

import android.os.Bundle;
import com.tencent.kinda.framework.jsapi.IPCInvoke_KindaJSInvoke;
import com.tencent.p014mm.ipcinvoker.C80907o;
import com.tencent.p014mm.plugin.appbrand.jsapi.C1680f5;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.WeChatProcess;
import com.tencent.p014mm.wallet_core.p137ui.WalletBaseUI;
import k53.C76496b;
import k53.C76497c;
import k53.C76498d;
import nj3.C88989a;
import ob0.C117747y;
import zt3.C119157j;

@C88989a(7)
/* renamed from: com.tencent.mm.plugin.wallet.ui.WXPayJsApiKindaEntranceUI */
public class WXPayJsApiKindaEntranceUI extends WalletBaseUI {

    /* renamed from: d */
    public boolean f209017d = false;

    public int getLayoutId() {
        return -1;
    }

    public void onBackPressed() {
        Log.m105918d("MicroMsg.WXPayJsApiKindaEntranceUI", "back press not lock");
        finish();
    }

    public void onCreate(Bundle bundle) {
        Class<IPCInvoke_KindaJSInvoke> cls = IPCInvoke_KindaJSInvoke.class;
        super.onCreate(bundle);
        setContentViewVisibility(8);
        if (getIntent() == null) {
            Log.m105918d("MicroMsg.WXPayJsApiKindaEntranceUI", "func[doCheckPayNetscene] intent null");
            setResult(0);
            finish();
            return;
        }
        String stringExtra = getIntent().getStringExtra("jsapiName");
        if (stringExtra.equals(C1680f5.NAME)) {
            C80907o.m98781d(WeChatProcess.PROCESS_MAIN, getIntent().getExtras(), cls, new C76496b(this));
        } else if (stringExtra.equals("requestKidsPayRechargePayment")) {
            C80907o.m98781d(WeChatProcess.PROCESS_MAIN, getIntent().getExtras(), cls, new C76497c(this));
        } else if (stringExtra.equals("requestSnsPayment")) {
            C80907o.m98781d(WeChatProcess.PROCESS_MAIN, getIntent().getExtras(), cls, new C76497c(this));
        } else {
            finish();
        }
    }

    public void onDestroy() {
        super.onDestroy();
    }

    public void onPause() {
        super.onPause();
        this.f209017d = false;
        ((C119157j) C119157j.f356862d).mo183894y("WXPayJsApiKindaEntranceUIObserver");
    }

    public void onResume() {
        super.onResume();
        this.f209017d = true;
        ((C119157j) C119157j.f356862d).mo183879j(new C76498d(this), 6000, "WXPayJsApiKindaEntranceUIObserver");
    }

    public boolean onSceneEnd(int i, int i2, String str, C117747y yVar) {
        return false;
    }
}

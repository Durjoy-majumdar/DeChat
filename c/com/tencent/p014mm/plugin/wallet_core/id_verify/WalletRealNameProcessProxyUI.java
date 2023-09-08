package com.tencent.p014mm.plugin.wallet_core.id_verify;

import android.content.Intent;
import android.os.Bundle;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.app.C40008f;
import com.tencent.p014mm.autogen.events.WalletRealNameResultNotifyEvent;
import com.tencent.p014mm.plugin.wallet.api.JsApiRequestWCPayRealnameVerifyParameter;
import com.tencent.p014mm.sdk.event.IEvent;
import com.tencent.p014mm.sdk.event.IListener;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.wallet_core.p137ui.WalletBaseUI;
import ie3.C8883h;
import nj3.C76879j;
import nj3.C88989a;
import ob0.C117747y;
import pe3.C47465a;
import te3.C64592nu;
import v53.C78339d;
import yq3.C79143a;
import yq3.C79148e;

@C88989a(7)
/* renamed from: com.tencent.mm.plugin.wallet_core.id_verify.WalletRealNameProcessProxyUI */
public class WalletRealNameProcessProxyUI extends WalletBaseUI {

    /* renamed from: d */
    public String f209079d;

    /* renamed from: e */
    public String f209080e;

    /* renamed from: f */
    public C79148e.C79149a f209081f;

    /* renamed from: g */
    public final IListener<WalletRealNameResultNotifyEvent> f209082g = new IListener<WalletRealNameResultNotifyEvent>(C40008f.f107254d) {
        {
            this.__eventId = 323604482;
        }

        public boolean callback(IEvent iEvent) {
            WalletRealNameProcessProxyUI.this.f209082g.dead();
            int i = ((WalletRealNameResultNotifyEvent) iEvent).f9603d.f9604a;
            if (i != -1 && i != 0) {
                return false;
            }
            WalletRealNameProcessProxyUI.this.finish();
            return false;
        }
    };

    /* renamed from: com.tencent.mm.plugin.wallet_core.id_verify.WalletRealNameProcessProxyUI$a */
    public class C72078a implements C79148e.C79149a {
        public C72078a(WalletRealNameProcessProxyUI walletRealNameProcessProxyUI) {
        }

        public Intent onProcessEnd(int i, Bundle bundle) {
            Log.m105925i("MicroMsg.WalletRealNameProcessProxyUI", "realname end: %s", Integer.valueOf(i));
            return new Intent();
        }
    }

    /* renamed from: H7 */
    public void mo99293H7(Bundle bundle) {
        Log.m105924i("MicroMsg.WalletRealNameProcessProxyUI", "goRealNameUI");
        if (bundle == null) {
            Log.m105924i("MicroMsg.WalletRealNameProcessProxyUI", "goRealNameUI, param is null");
            bundle = new Bundle();
        }
        bundle.putString("key_realname_scene", this.f209080e);
        bundle.putString("key_realname_sessionid", this.f209079d);
        bundle.putString("realname_verify_process_jump_plugin", "wallet_core");
        bundle.putString("realname_verify_process_jump_activity", ".id_verify.WalletRealNameProcessProxyUI");
        bundle.putBoolean("process_finish_stay_orgpage", false);
        bundle.putParcelable("JsApiRequestWCPayRealnameVerifyParameter", (JsApiRequestWCPayRealnameVerifyParameter) getIntent().getParcelableExtra("JSAPI_TYPE_TINYAPP_PARAMETER"));
        C72078a aVar = new C72078a(this);
        this.f209081f = aVar;
        C79143a.m95771j(this, RealNameVerifyProcess.class, bundle, aVar);
    }

    public int getLayoutId() {
        return -1;
    }

    public boolean isTransparent() {
        return true;
    }

    public void onCreate(Bundle bundle) {
        String str;
        int i;
        super.onCreate(bundle);
        Log.m105924i("MicroMsg.WalletRealNameProcessProxyUI", "on create");
        addSceneEndListener(580);
        this.f209082g.alive();
        Bundle input = getInput();
        String str2 = "";
        if (input != null) {
            i = input.getInt("realname_scene", 0);
            str = input.getString("JSAPI_TYPE", str2);
        } else {
            str = str2;
            i = 0;
        }
        if (i == 0) {
            i = getIntent().getIntExtra("realname_scene", 0);
        }
        if (str.equals("JSAPI_TYPE_TINYAPP")) {
            Log.m105924i("MicroMsg.WalletRealNameProcessProxyUI", "from tiny app jsapi, do NetSceneCheckPayJsapi");
            doSceneForceProgress(new C78339d(getIntent().getStringExtra("appId"), getIntent().getStringExtra("timeStamp"), getIntent().getStringExtra("nonceStr"), getIntent().getStringExtra("packageExt"), getIntent().getStringExtra("signtype"), getIntent().getStringExtra("paySignature"), 8, getIntent().getStringExtra("wxapp_username"), getIntent().getStringExtra("wxapp_path"), getIntent().getStringExtra("command_word"), 0));
        } else if (i == 1) {
            Log.m105924i("MicroMsg.WalletRealNameProcessProxyUI", "from jsapi, do NetSceneCheckPayJsapi");
            if (getIntent() == null) {
                if (Util.isNullOrNil(str2)) {
                    str2 = getString(C0966R.string.l_3);
                }
                C76879j.m92713G(this, str2, (String) null, false, new C72152l(this));
                return;
            }
            doSceneForceProgress(new C78339d(getIntent().getStringExtra("appId"), getIntent().getStringExtra("timeStamp"), getIntent().getStringExtra("nonceStr"), getIntent().getStringExtra("packageExt"), getIntent().getStringExtra("signtype"), getIntent().getStringExtra("paySignature"), getIntent().getStringExtra("url"), getInput().getInt("realname_scene") == 2 ? 12 : 8, "idCardRealnameVerify", getIntent().getIntExtra("pay_channel", 0)));
        } else {
            mo99293H7(input);
        }
    }

    public void onDestroy() {
        super.onDestroy();
        removeSceneEndListener(580);
        this.f209082g.dead();
    }

    public void onNewIntent(Intent intent) {
        Log.m105924i("MicroMsg.WalletRealNameProcessProxyUI", "onNewIntent");
        Bundle extras = intent != null ? intent.getExtras() : null;
        if (extras == null || !extras.getBoolean("key_is_realname_verify_process")) {
            setResult(0);
        } else if (extras.getInt("realname_verify_process_ret", 0) != -1) {
            setResult(0);
        } else {
            setResult(-1);
        }
        finish();
    }

    public void onResume() {
        super.onResume();
    }

    public boolean onSceneEnd(int i, int i2, String str, C117747y yVar) {
        if (!(yVar instanceof C78339d)) {
            return false;
        }
        Log.m105920e("MicroMsg.WalletRealNameProcessProxyUI", "NetSceneCheckPayJsapi resp,errType = " + i + ",errCode=" + i2);
        if (i != 0 || i2 != 0) {
            return false;
        }
        C78339d dVar = (C78339d) yVar;
        C8883h.f28150a = dVar.mo108331j1();
        C47465a aVar = dVar.f229547e.f127056b.f127083a;
        this.f209079d = ((C64592nu) aVar).f184564n;
        this.f209080e = ((C64592nu) aVar).f184565o;
        mo99293H7(getInput());
        return true;
    }
}

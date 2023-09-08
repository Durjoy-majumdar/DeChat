package com.tencent.p014mm.plugin.wallet_index.p127ui;

import android.content.Intent;
import android.os.Bundle;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.pluginsdk.wallet.PayInfo;
import com.tencent.p014mm.pluginsdk.wallet.WalletJsapiData;
import com.tencent.p014mm.sdk.event.IListener;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.wallet_core.model.C75136r0;
import di3.C86312j;
import ie3.C76324c;
import ie3.C76331i;
import java.util.ArrayList;
import m63.C76750e;
import n63.C76835c;
import te3.C77991rh2;
import te3.C78022z93;

/* renamed from: com.tencent.mm.plugin.wallet_index.ui.q */
public class C72573q implements C72559b {

    /* renamed from: a */
    public final int f211129a = (hashCode() & 65535);

    /* renamed from: b */
    public C72561d f211130b = null;

    /* renamed from: c */
    public C72560c f211131c;

    /* renamed from: d */
    public IListener f211132d;

    public C72573q(C72560c cVar, IListener iListener) {
        Log.m105924i("MicroMsg.WeiXinWallet", "WeiXinWallet create");
        this.f211131c = cVar;
        this.f211132d = iListener;
        iListener.alive();
    }

    /* renamed from: a */
    public int mo99961a() {
        return 2;
    }

    /* renamed from: b */
    public void mo99962b(MMActivity mMActivity) {
        Log.m105924i("MicroMsg.WeiXinWallet", "WeiXinWallet onDestroy");
        this.f211132d.dead();
    }

    /* renamed from: c */
    public boolean mo99963c(MMActivity mMActivity, int i, int i2, Intent intent) {
        Object[] objArr = new Object[4];
        objArr[0] = Integer.valueOf(i);
        objArr[1] = Integer.valueOf(i2);
        objArr[2] = Integer.valueOf(this.f211129a);
        objArr[3] = Boolean.valueOf(intent == null);
        Log.m105925i("MicroMsg.WeiXinWallet", "onPayEnd requestCode : %d,payResult : %d,SIMPLE_PAY : %d, data is null : %b", objArr);
        if (i == this.f211129a && this.f211130b != null) {
            C76835c a = i2 == -1 ? (intent == null || intent.getIntExtra("key_jsapi_pay_err_code", 0) != 0) ? C76835c.m92624a(5) : C76835c.m92624a(0) : i2 == 0 ? C76835c.m92624a(1) : C76835c.m92624a(6);
            Log.m105925i("MicroMsg.WeiXinWallet", "wxpay result : %s", a);
            C72560c cVar = this.f211131c;
            this.f211130b.mo99950a(a, new C76750e(cVar.f211098l, cVar.f211096j, cVar.f211095i, cVar.f211094h));
            this.f211130b = null;
        }
        return true;
    }

    /* renamed from: d */
    public void mo99964d(MMActivity mMActivity, ArrayList<String> arrayList, C72561d dVar, boolean z) {
        Log.m105924i("MicroMsg.WeiXinWallet", "WeiXinWallet restorePurchase");
        if (dVar != null) {
            C76835c a = C76835c.m92624a(0);
            C72560c cVar = this.f211131c;
            dVar.mo99950a(a, new C76750e(cVar.f211098l, cVar.f211096j, cVar.f211095i, cVar.f211094h));
        }
    }

    /* renamed from: e */
    public void mo99965e(MMActivity mMActivity, boolean z) {
        Log.m105924i("MicroMsg.WeiXinWallet", "WeiXinWallet restorePurchase");
        Intent intent = new Intent();
        intent.putExtra("key_err_code", 0);
        intent.putExtra("key_err_msg", "");
        mMActivity.setResult(-1, intent);
        mMActivity.finish();
    }

    /* renamed from: f */
    public int mo99966f(MMActivity mMActivity, C72561d dVar) {
        Class cls = C76324c.class;
        Log.m105925i("MicroMsg.WeiXinWallet", "[alex] WeiXinWallet launchPay MiniProgram:%b,taskid:%d,scene:%d,rawscene:%d", Boolean.valueOf(this.f211131c.f211100n), Integer.valueOf(mMActivity.getTaskId()), Integer.valueOf(this.f211131c.f211104r), Integer.valueOf(this.f211131c.f211105s));
        C75136r0.f221075a = System.currentTimeMillis();
        this.f211130b = dVar;
        C72560c cVar = this.f211131c;
        if (!cVar.f211100n) {
            boolean isSwitch2InWxAppPay = ((C76324c) C86312j.m106911c(cls)).isSwitch2InWxAppPay(this.f211131c.f211089c.f228165f);
            Log.m105925i("MicroMsg.WeiXinWallet", "doEmojiReward, isSwitch2InWxAppPay:%b", Boolean.valueOf(isSwitch2InWxAppPay));
            if (isSwitch2InWxAppPay) {
                Bundle bundle = new Bundle();
                bundle.putString("prepayId", this.f211131c.f211089c.f228165f);
                bundle.putInt("payScene", 5);
                bundle.putInt("payChannel", 0);
                ((C76324c) C86312j.m106911c(cls)).startInWxAppPayUseCase(mMActivity, bundle);
            } else {
                PayInfo payInfo = new PayInfo();
                C77991rh2 rh22 = this.f211131c.f211089c;
                payInfo.f212592j = rh22.f228165f;
                payInfo.f212596q = rh22.f228166g;
                payInfo.f212597r = rh22.f228167h;
                payInfo.f212587e = 5;
                C76331i.m91761e(mMActivity, payInfo, this.f211129a);
            }
        } else if (cVar.f211089c != null) {
            WalletJsapiData walletJsapiData = new WalletJsapiData();
            C72560c cVar2 = this.f211131c;
            C77991rh2 rh23 = cVar2.f211089c;
            C78022z93 z932 = rh23.f228168i;
            walletJsapiData.f24075d = z932.f228679d;
            walletJsapiData.f24079h = z932.f228680e;
            walletJsapiData.f24078g = z932.f228681f;
            walletJsapiData.f24080i = z932.f228683h;
            walletJsapiData.f24077f = z932.f228682g;
            walletJsapiData.f24084p = rh23.f228167h;
            walletJsapiData.f24088t = rh23.f228163d;
            walletJsapiData.f24090v = 33;
            walletJsapiData.f24063F = "key_from_scene_appbrandgame";
            int i = this.f211129a;
            walletJsapiData.f24089u = i;
            int i2 = cVar2.f211104r;
            if (i2 > 0) {
                walletJsapiData.f24092x = i2;
            }
            C76331i.m91760d(mMActivity, walletJsapiData, i, (MMActivity.C6739d) null);
        } else {
            Log.m105920e("MicroMsg.WeiXinWallet", "[alex] mIapData.iapWxPayData is null");
        }
        Log.m105921e("MicroMsg.WeiXinWallet", "launchPay return SIMPLE_PAY:%d", Integer.valueOf(this.f211129a));
        return this.f211129a;
    }
}

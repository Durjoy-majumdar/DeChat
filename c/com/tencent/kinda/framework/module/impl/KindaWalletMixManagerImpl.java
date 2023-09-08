package com.tencent.kinda.framework.module.impl;

import android.app.Activity;
import android.content.Intent;
import android.text.TextUtils;
import com.tencent.kinda.framework.widget.tools.KindaContext;
import com.tencent.kinda.gen.ITransmitKvData;
import com.tencent.kinda.gen.KindaWalletMixManager;
import com.tencent.kinda.gen.VoidCallback;
import com.tencent.kinda.gen.VoidITransmitKvDataCallback;
import com.tencent.p014mm.app.C40008f;
import com.tencent.p014mm.autogen.events.WalletPayResultEvent;
import com.tencent.p014mm.sdk.event.IListener;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import ke3.C88144b;
import te3.C64630pm;
import te3.wy4;

public class KindaWalletMixManagerImpl implements KindaWalletMixManager {
    private static final String TAG = "KindaWalletMixManagerImpl";
    /* access modifiers changed from: private */
    public VoidCallback mCancelCallback;
    /* access modifiers changed from: private */
    public VoidITransmitKvDataCallback mSuccessCallback;
    /* access modifiers changed from: private */
    public IListener<WalletPayResultEvent> mWalletPayResultEventIListener = new IListener<WalletPayResultEvent>(C40008f.f107254d) {
        {
            this.__eventId = 520089918;
        }

        public boolean callback(WalletPayResultEvent walletPayResultEvent) {
            int i = walletPayResultEvent.f194085d.f194088c;
            if (i == 0) {
                if (KindaWalletMixManagerImpl.this.mCancelCallback != null) {
                    KindaWalletMixManagerImpl.this.mCancelCallback.call();
                }
            } else if (i == -1 && KindaWalletMixManagerImpl.this.mSuccessCallback != null) {
                ITransmitKvData create = ITransmitKvData.create();
                Intent intent = walletPayResultEvent.f194085d.f194086a;
                if (intent != null) {
                    create.putBool("is_jsapi_close_page", "1".equals(intent.getStringExtra("is_jsapi_close_page")));
                }
                KindaWalletMixManagerImpl.this.mSuccessCallback.call(create);
            }
            KindaWalletMixManagerImpl.this.mWalletPayResultEventIListener.dead();
            return false;
        }
    };

    private wy4 genWalletMixSpGenPrePayRespFromUrl(String str, ITransmitKvData iTransmitKvData) {
        if (TextUtils.isEmpty(str) || iTransmitKvData == null) {
            return null;
        }
        wy4 wy4 = new wy4();
        wy4.f186241d = str;
        wy4.f186243f = false;
        wy4.f186244g = "";
        wy4.f186242e = null;
        if (iTransmitKvData.getBool("hasCallbackRetryConf")) {
            C64630pm pmVar = new C64630pm();
            wy4.f186242e = pmVar;
            pmVar.f184861e = iTransmitKvData.getInt("maxCount");
            wy4.f186242e.f184860d = iTransmitKvData.getInt("intevalTime");
            wy4.f186242e.f184862f = iTransmitKvData.getString("defaultWording");
        }
        return wy4;
    }

    public void startWalletMixUseCaseImpl(String str, ITransmitKvData iTransmitKvData, VoidITransmitKvDataCallback voidITransmitKvDataCallback, VoidCallback voidCallback, VoidCallback voidCallback2) {
        wy4 genWalletMixSpGenPrePayRespFromUrl = genWalletMixSpGenPrePayRespFromUrl(str, iTransmitKvData);
        if (genWalletMixSpGenPrePayRespFromUrl != null && !Util.isNullOrNil(genWalletMixSpGenPrePayRespFromUrl.f186241d)) {
            Activity topOrUIPageFragmentActivity = KindaContext.getTopOrUIPageFragmentActivity();
            if (topOrUIPageFragmentActivity == null) {
                Log.m105920e(TAG, "KindaWalletMixManagerImpl startWalletMixUseCaseImpl() KindaContext.getTopOrUIPageFragmentActivity() return null!");
                return;
            }
            Intent intent = new Intent();
            intent.putExtra("prepayId", iTransmitKvData.getString("prepayId"));
            intent.putExtra("is_jsapi_offline_pay", false);
            intent.putExtra("pay_gate_url", genWalletMixSpGenPrePayRespFromUrl.f186241d);
            intent.putExtra("need_dialog", genWalletMixSpGenPrePayRespFromUrl.f186243f);
            intent.putExtra("dialog_text", genWalletMixSpGenPrePayRespFromUrl.f186244g);
            intent.putExtra("max_count", genWalletMixSpGenPrePayRespFromUrl.f186242e.f184861e);
            intent.putExtra("inteval_time", genWalletMixSpGenPrePayRespFromUrl.f186242e.f184860d);
            intent.putExtra("default_wording", genWalletMixSpGenPrePayRespFromUrl.f186242e.f184862f);
            C88144b.m109792j(topOrUIPageFragmentActivity, "wallet_core", ".ui.WalletMixOrderInfoUI", intent, true);
        }
        this.mSuccessCallback = voidITransmitKvDataCallback;
        this.mCancelCallback = voidCallback;
        this.mWalletPayResultEventIListener.alive();
    }
}

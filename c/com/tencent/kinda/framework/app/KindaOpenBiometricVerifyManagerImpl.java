package com.tencent.kinda.framework.app;

import android.content.Context;
import android.os.Bundle;
import android.os.Looper;
import b63.C67199q0;
import com.tencent.kinda.framework.widget.tools.KindaContext;
import com.tencent.kinda.gen.KindaOpenBiometricVerifyManager;
import com.tencent.kinda.gen.SelectBioType;
import com.tencent.p014mm.autogen.events.WalletGetUserInfoEvent;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.sdk.platformtools.Log;
import di3.C86312j;
import st1.C77781t;
import y43.C79029b0;

public class KindaOpenBiometricVerifyManagerImpl implements KindaOpenBiometricVerifyManager {
    private static final String TAG = "KindaOpenBiometricVerifyManagerImpl";

    public void openBiometricVerify(String str, boolean z, SelectBioType selectBioType) {
        Context context = KindaContext.get();
        if (context == null) {
            Log.m105920e(TAG, "Fail to start KindaOpenBiometricVerifyManagerImpl due to context is null!");
        } else if (!(context instanceof MMActivity)) {
            Log.m105921e(TAG, "Fail to start KindaOpenBiometricVerifyManagerImpl due to incompatible context(%s)", context.getClass().getName());
        } else {
            final MMActivity mMActivity = (MMActivity) context;
            mMActivity.getIntent().putExtra("isFromKinda", true);
            mMActivity.getIntent().putExtra("kindaPayPwd", str);
            if (z) {
                mMActivity.getIntent().putExtra("bSupportFaceAndTouch", true);
                if (selectBioType == SelectBioType.TOUCHID) {
                    mMActivity.getIntent().putExtra("selectBioType", 1);
                } else if (selectBioType == SelectBioType.FACEID) {
                    mMActivity.getIntent().putExtra("selectBioType", 2);
                }
            }
            Bundle extras = mMActivity.getIntent().getExtras();
            if (extras == null) {
                Log.m105924i(TAG, "The Extras data in current kinda Activity is null!");
            } else {
                Log.m105924i(TAG, "The Extras data in current kinda Activity is " + extras.toString());
            }
            C67199q0 p = C79029b0.vx0().wx0().mo91334p();
            if (p == null || !p.mo91308h()) {
                Log.m105924i(TAG, "WalletSwitchConfig.isSupportTouchPay return that the user has not opened fingerprint (biometric) payment in WeChat. Send a message to call the bind query.");
                WalletGetUserInfoEvent walletGetUserInfoEvent = new WalletGetUserInfoEvent();
                WalletGetUserInfoEvent.C67824a aVar = walletGetUserInfoEvent.f194038d;
                aVar.f194040a = 1;
                aVar.f194041b = true;
                aVar.f194042c = true;
                walletGetUserInfoEvent.f194039e.f194055a = new Runnable() {
                    public void run() {
                        ((C77781t) C86312j.m106911c(C77781t.class)).mo107897LJ(mMActivity);
                    }
                };
                walletGetUserInfoEvent.asyncPublish(Looper.myLooper());
                return;
            }
            Log.m105924i(TAG, "WalletSwitchConfig.isSupportTouchPay return that the user has opened fingerprint (biometric) payment in WeChat.");
            ((C77781t) C86312j.m106911c(C77781t.class)).mo107897LJ(mMActivity);
        }
    }
}

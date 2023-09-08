package com.tencent.kinda.framework.app;

import android.app.Activity;
import com.tencent.kinda.framework.widget.tools.KindaContext;
import com.tencent.kinda.gen.KindaFaceRegManager;
import com.tencent.kinda.gen.VoidBoolStringI32StringCallback;
import com.tencent.kinda.gen.VoidCallback;
import com.tencent.p014mm.autogen.events.RequestFaceVerifyForPayEvent;
import com.tencent.p014mm.framework.app.UIPageFragmentActivity;
import com.tencent.p014mm.plugin.wallet_index.p127ui.WalletBrandUI;
import com.tencent.p014mm.sdk.platformtools.Log;

public class MMKindaFaceRegManagerImpl implements KindaFaceRegManager {
    private static final int FACE_ACTION_REQUEST_CODE = 1;
    private final String TAG = "MMKindaFaceRegManagerImpl";

    public void startFaceImpl(int i, String str, String str2, VoidBoolStringI32StringCallback voidBoolStringI32StringCallback, VoidCallback voidCallback, String str3) {
        startFaceImpl(i, str, str2, voidBoolStringI32StringCallback, voidCallback, str3, "");
    }

    public void startFaceImpl(int i, String str, String str2, VoidBoolStringI32StringCallback voidBoolStringI32StringCallback, VoidCallback voidCallback, String str3, String str4) {
        Activity topOrUIPageFragmentActivity = KindaContext.getTopOrUIPageFragmentActivity();
        if ((topOrUIPageFragmentActivity instanceof UIPageFragmentActivity) || (topOrUIPageFragmentActivity instanceof WalletBrandUI)) {
            Log.m105925i("MMKindaFaceRegManagerImpl", "siScene:%s，strPackage：%s,strPackageSign:%s,otherVerifyTitle:%s，faceVerifyTitle：%s", Integer.valueOf(i), str, str2, str3, str4);
            if (topOrUIPageFragmentActivity instanceof WalletBrandUI) {
                WalletBrandUI walletBrandUI = (WalletBrandUI) topOrUIPageFragmentActivity;
                walletBrandUI.f211009r = true;
                walletBrandUI.f211007p = voidBoolStringI32StringCallback;
                walletBrandUI.f211008q = voidCallback;
                RequestFaceVerifyForPayEvent requestFaceVerifyForPayEvent = new RequestFaceVerifyForPayEvent();
                RequestFaceVerifyForPayEvent.C1117a aVar = requestFaceVerifyForPayEvent.f9431d;
                aVar.f9441i = walletBrandUI;
                aVar.f9433a = i;
                aVar.f9434b = str;
                aVar.f9435c = str2;
                aVar.f9436d = str3;
                aVar.f9439g = str4;
                aVar.f9440h = 4;
                requestFaceVerifyForPayEvent.publish();
                return;
            }
            UIPageFragmentActivity uIPageFragmentActivity = (UIPageFragmentActivity) topOrUIPageFragmentActivity;
            uIPageFragmentActivity.f195309g = voidBoolStringI32StringCallback;
            uIPageFragmentActivity.f195310h = voidCallback;
            RequestFaceVerifyForPayEvent requestFaceVerifyForPayEvent2 = new RequestFaceVerifyForPayEvent();
            RequestFaceVerifyForPayEvent.C1117a aVar2 = requestFaceVerifyForPayEvent2.f9431d;
            aVar2.f9441i = uIPageFragmentActivity;
            aVar2.f9433a = i;
            aVar2.f9434b = str;
            aVar2.f9435c = str2;
            aVar2.f9436d = str3;
            aVar2.f9439g = str4;
            aVar2.f9440h = 4;
            requestFaceVerifyForPayEvent2.publish();
            return;
        }
        Log.m105921e("MMKindaFaceRegManagerImpl", "startFaceImpl failed due to incompatible context(%s)", topOrUIPageFragmentActivity.getClass().getName());
    }
}

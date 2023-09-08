package ie3;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.pluginsdk.wallet.PayInfo;
import com.tencent.p014mm.pluginsdk.wallet.WalletJsapiData;
import di3.C7335d;
import java.util.Map;

/* renamed from: ie3.c */
public interface C76324c extends C7335d {

    /* renamed from: ie3.c$c */
    public interface C8882c {
    }

    /* renamed from: ie3.c$a */
    public interface C76325a {
        /* renamed from: a */
        void mo5281a(Intent intent);
    }

    /* renamed from: ie3.c$b */
    public interface C76326b {
        /* renamed from: a */
        void mo97424a(int i);
    }

    /* renamed from: ie3.c$d */
    public interface C76327d {
    }

    boolean TenPaySDKABTestKindaEnable();

    boolean canOpenKindaCashier(Context context);

    void checkIfNeedRequestUserBindqueryWhenUnBindCard(String str);

    void checkIfNeedUpdateOfflinePayToken();

    void ensureLibraryLoaded();

    long getColorByMode(long j, long j2);

    Activity getCrossActivity();

    void handleHKNativeCashier(Context context, String str, C76326b bVar);

    void handleHKOfflineNewXmlMsg(String str);

    boolean isOfflineReady();

    boolean isSwitch2InWxAppPay(String str);

    boolean isUseCaseAlive(String str);

    void notifyAllUseCase(Object obj);

    void notifyUploadCardSuccess();

    void requestHKCashierNotify(Context context, String str);

    void startBindCardUseCase(Context context, Bundle bundle);

    void startFaceCheckUseCase(String str, Intent intent, C76325a aVar);

    void startFastBindUseCase(String str, int i, Runnable runnable);

    void startHKOfflinePrePay(Context context, int i);

    void startHKOfflinePrePayFromJsApi(Context context, String str);

    void startInWxAppPayUseCase(Context context, Bundle bundle);

    void startJSApiWCPaySecurityCrosscut(Map<String, Object> map);

    void startJsApiComponentUseCase(Context context, WalletJsapiData walletJsapiData, MMActivity.C6739d dVar, int i);

    boolean startLqtDetailUseCase(Context context, Intent intent);

    boolean startLqtFetchUseCase(Context context, Intent intent, C76325a aVar);

    void startLqtFixedDepositMakePlanUseCase(Context context, Bundle bundle);

    void startLqtFixedDepositPlanListUseCase(Context context, Bundle bundle);

    boolean startLqtSaveUseCase(Context context, Intent intent, C76325a aVar);

    void startModifyPwdUseCase(Context context, Bundle bundle);

    void startOfflinePay(Context context, String str, String str2, int i);

    void startOfflinePrePay(Context context, int i, int i2, int i3, Map<String, String> map);

    boolean startOverseaWalletSuccPageUseCase(Context context, Bundle bundle);

    boolean startPayIBGJsGetSuccPageUseCase(Context context, Bundle bundle);

    void startPaySecurityUseCase(int i, C76325a aVar);

    void startQrcodeCollectionSettingUseCase(Intent intent, C76325a aVar);

    void startResetPwdUseCase(Context context, Bundle bundle);

    void startSNSPay(Context context, PayInfo payInfo);

    void startScanQRCodePay(Context context, Bundle bundle);

    void startTeenagerPay(Context context, byte[] bArr);

    void startTeenagerPayGetDetail(Context context, C8882c cVar);

    void startUiTest();

    void startUseCase(String str, Object obj, Object obj2);

    boolean startWalletBalanceEntryUseCase(Context context);

    void startWalletBalanceFetchUseCase(Context context, Bundle bundle);

    void startWalletBalanceSaveUseCase(Context context, Bundle bundle);

    void startWeBankLoanPay(Context context, String str, String str2, C76327d dVar);

    void startWxpayAppPay(Context context, Bundle bundle, String str, String str2, String str3, String str4);

    void startWxpayH5Pay(Context context, Bundle bundle, String str, String str2, String str3, String str4);

    void startWxpayJsApiPay(Context context, WalletJsapiData walletJsapiData, MMActivity.C6739d dVar, int i);

    void startWxpayQueryCashierPay(String str, int i, int i2);

    boolean tryStartTransferToBankDetailUseCase(String str, C76325a aVar);

    boolean tryStartTransferToBankUseCase(String str, C76325a aVar);

    void updateLocationCacheIfNeed(float f, float f2);

    void updateOfflinePayDefaultCard(String str, String str2);

    void updateOfflinePayTokenFromScene(int i);
}

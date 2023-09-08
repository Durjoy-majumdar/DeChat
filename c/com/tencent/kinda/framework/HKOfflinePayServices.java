package com.tencent.kinda.framework;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.util.Base64;
import com.tencent.kinda.framework.api.IHKOfflinePayServices;
import com.tencent.kinda.framework.widget.tools.KindaContext;
import com.tencent.kinda.gen.VoidBoolCallback;
import com.tencent.p014mm.app.C80625v0;
import com.tencent.p014mm.p136ui.widget.MMWebView;
import com.tencent.p014mm.plugin.webview.p128ui.tools.widget.C44361u;
import com.tencent.p014mm.plugin.webview.p128ui.tools.widget.C6606x;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MD5Util;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C72994y1;
import com.tenpay.ndk.Encrypt;
import com.tenpay.ndk.HkWxCertUtil;
import com.tenpay.ndk.MessageDigestUtil;
import di3.C86301e;
import di3.C86312j;
import e00.C7578x;
import eb0.C75592q0;
import ei3.C86522b;
import f40.C86709a0;
import ke3.C88144b;
import p156gj.C87203t;

@C86522b(onProcess = {C80625v0.MATCH_MM})
public class HKOfflinePayServices extends C86301e implements IHKOfflinePayServices {
    private static final String TAG = "HKOfflinePayServices";
    private boolean mInitFlag = false;

    private String getHKCertDeviceId() {
        String f = C87203t.m108270f(false);
        return Util.isNullOrNil(f) ? C87203t.m108273i() : f;
    }

    private String getHKCertRootPath() {
        return MMApplicationContext.getContext().getFilesDir().getParentFile().getAbsolutePath() + "/hkcert";
    }

    private String getHKCertUserId() {
        return MD5Util.getMD5String(C75592q0.m90789s());
    }

    private void initHKCertIfNeed() {
        if (!this.mInitFlag) {
            if (!HkWxCertUtil.init(getHKCertRootPath(), getHKCertDeviceId(), "WeChatPayHK", getHKCertUserId())) {
                Log.m105925i(TAG, "hkcert init fail, errcode is %s", Integer.valueOf(HkWxCertUtil.getError()));
                return;
            }
            Log.m105924i(TAG, "hkcert init succ");
            this.mInitFlag = true;
        }
    }

    public byte[] decryptByAes(byte[] bArr, byte[] bArr2, byte[] bArr3) {
        return Encrypt.aesDecryptCBC(bArr, bArr2, bArr3);
    }

    public String decryptByCftCert(String str, String str2) {
        if (Util.isNullOrNil(str) || Util.isNullOrNil(str2)) {
            return "";
        }
        initHKCertIfNeed();
        byte[] certDecrypt = HkWxCertUtil.certDecrypt(str, Base64.decode(str2, 0));
        if (certDecrypt == null) {
            Log.m105925i(TAG, "cert decrypt fail, plain data is null, cerid : %s, errcode : %s", str, Integer.valueOf(HkWxCertUtil.getError()));
            return "";
        }
        String str3 = new String(certDecrypt);
        if (Util.isNullOrNil(str3)) {
            Log.m105925i(TAG, "cert decrypt fail, plain to string null, cerid : %s, errcode : %s", str, Integer.valueOf(HkWxCertUtil.getError()));
        }
        return str3;
    }

    public boolean deleteCftCert(String str) {
        if (Util.isNullOrNil(str)) {
            return false;
        }
        initHKCertIfNeed();
        if (HkWxCertUtil.clearCert(str)) {
            Log.m105925i(TAG, "clear cert succ, certid is : %s", str);
            return true;
        }
        Log.m105925i(TAG, "clear cert fail, certid is : %s, errcode is : %s", str, Integer.valueOf(HkWxCertUtil.getError()));
        return false;
    }

    public byte[] encryptByAes(byte[] bArr, byte[] bArr2, byte[] bArr3) {
        return Encrypt.aesEncryptCBC(bArr, bArr2, bArr3);
    }

    public String genAlgoToken(String str, int i, int i2, byte[] bArr, long j, long j2, long j3, int i3) {
        initHKCertIfNeed();
        String algoToken = HkWxCertUtil.getAlgoToken(str, i, i2, bArr, j, j2, j3, i3);
        if (Util.isNullOrNil(algoToken)) {
            Log.m105925i(TAG, "gen code fail, errcode is : %s", Integer.valueOf(HkWxCertUtil.getError()));
        }
        return algoToken;
    }

    public String getCertid() {
        return (String) C86709a0.m107535s().mo121142i().mo119685f(C72994y1.C72995a.USERINFO_HKOFFLINE_CERTID_STRING_SYNC, (Object) null);
    }

    public String getCftCSR(String str) {
        initHKCertIfNeed();
        String csr = HkWxCertUtil.getCsr(1);
        if (!Util.isNullOrNil(csr)) {
            return csr;
        }
        Log.m105925i(TAG, "get rsa2048 csr fail, errcode is : %s", Integer.valueOf(HkWxCertUtil.getError()));
        return "";
    }

    public String getCftCertSign(String str, String str2) {
        if (Util.isNullOrNil(str)) {
            return "";
        }
        initHKCertIfNeed();
        byte[] certSign = HkWxCertUtil.certSign(str, str2.getBytes());
        if (certSign == null) {
            Log.m105925i(TAG, "cert sign fail, sign is null,cerid : %s, errcode : %s", str, Integer.valueOf(HkWxCertUtil.getError()));
            return "";
        }
        String encodeToString = Base64.encodeToString(certSign, 0);
        if (Util.isNullOrNil(encodeToString)) {
            Log.m105925i(TAG, "cert sign fail, base64 encode sign fail, cerid : %s, errcode : %s", str, Integer.valueOf(HkWxCertUtil.getError()));
        }
        return encodeToString;
    }

    public String getDeviceid() {
        return (String) C86709a0.m107535s().mo121142i().mo119685f(C72994y1.C72995a.USERINFO_HKOFFLINE_DEVICEID_STRING_SYNC, (Object) null);
    }

    public String getLastSelectedCVItemId() {
        return (String) C86709a0.m107535s().mo121142i().mo119685f(C72994y1.C72995a.USERINFO_HKOFFLINE_LASTSELECTEDCVID_STRING_SYNC, (Object) null);
    }

    public String getLastSelectedCardBindSerial() {
        return (String) C86709a0.m107535s().mo121142i().mo119685f(C72994y1.C72995a.USERINFO_HKOFFLINE_LASTSELECTEDBINDSERIAL_STRING_SYNC, (Object) null);
    }

    public String getOfflinePayAckKey() {
        return (String) C86709a0.m107535s().mo121142i().mo119685f(C72994y1.C72995a.USERINFO_HKOFFLINE_PAYACKKEY_STRING_SYNC, (Object) null);
    }

    public boolean importCftCert(String str, String str2) {
        if (Util.isNullOrNil(str)) {
            return false;
        }
        initHKCertIfNeed();
        if (HkWxCertUtil.importCert(str, str2)) {
            Log.m105925i(TAG, "import cert succ, certid is : %s", str);
            return true;
        }
        Log.m105925i(TAG, "import cert fail, certid is : %s, errcode is : %s", str, Integer.valueOf(HkWxCertUtil.getError()));
        return false;
    }

    public boolean isCertExists(String str) {
        if (Util.isNullOrNil(str)) {
            return false;
        }
        initHKCertIfNeed();
        return HkWxCertUtil.hasCert(str);
    }

    public void openHKFacingReceiveView() {
        Log.m105924i(TAG, "open hk facing receive activity");
        Intent intent = new Intent();
        intent.putExtra("key_from_scene", 2);
        C88144b.m109791i(KindaContext.get(), "collect", ".ui.CollectHKMainUI", intent, (Bundle) null);
    }

    public void openHalfPageWebViewImpl(String str, final VoidBoolCallback voidBoolCallback) {
        if (!Util.isNullOrNil(str)) {
            C44361u uVar = new C44361u();
            uVar.f120216a = 0.9f;
            uVar.f120218c = false;
            uVar.f120219d = false;
            uVar.f120220e = -1;
            C6606x Ws = ((C7578x) C86312j.m106911c(C7578x.class)).mo8699Ws(KindaContext.get(), str, (MMWebView) null, uVar);
            Ws.show();
            Ws.setOnDismissListener(new DialogInterface.OnDismissListener() {
                public void onDismiss(DialogInterface dialogInterface) {
                    Log.m105924i(HKOfflinePayServices.TAG, "close half page webview dialog");
                    VoidBoolCallback voidBoolCallback = voidBoolCallback;
                    if (voidBoolCallback != null) {
                        voidBoolCallback.call(true);
                    }
                }
            });
        }
    }

    public void openScanQrCodeView() {
        Log.m105924i(TAG, "open scan qrcode activity");
        Intent intent = new Intent();
        intent.putExtra("BaseScanUI_select_scan_mode", 8);
        intent.putExtra("key_scan_report_enter_scene", 3);
        C88144b.m109791i(KindaContext.get(), "scanner", ".ui.BaseScanUI", intent, (Bundle) null);
    }

    public void removeCertId() {
        C86709a0.m107535s().mo121142i().mo119677K(C72994y1.C72995a.USERINFO_HKOFFLINE_CERTID_STRING_SYNC, "");
    }

    public boolean setCertid(String str) {
        if (Util.isNullOrNil(str)) {
            return false;
        }
        C86709a0.m107535s().mo121142i().mo119677K(C72994y1.C72995a.USERINFO_HKOFFLINE_CERTID_STRING_SYNC, str);
        return true;
    }

    public boolean setDeviceid(String str) {
        if (Util.isNullOrNil(str)) {
            return false;
        }
        C86709a0.m107535s().mo121142i().mo119677K(C72994y1.C72995a.USERINFO_HKOFFLINE_DEVICEID_STRING_SYNC, str);
        return true;
    }

    public void setLastSelectedCVItemId(String str) {
        C72994y1.C72995a aVar = C72994y1.C72995a.USERINFO_HKOFFLINE_LASTSELECTEDCVID_STRING_SYNC;
        if (!Util.isNullOrNil(str)) {
            C86709a0.m107535s().mo121142i().mo119677K(aVar, str);
        } else {
            C86709a0.m107535s().mo121142i().mo119677K(aVar, "");
        }
    }

    public void setLastSelectedCardBindSerial(String str) {
        C72994y1.C72995a aVar = C72994y1.C72995a.USERINFO_HKOFFLINE_LASTSELECTEDBINDSERIAL_STRING_SYNC;
        if (!Util.isNullOrNil(str)) {
            C86709a0.m107535s().mo121142i().mo119677K(aVar, str);
        } else {
            C86709a0.m107535s().mo121142i().mo119677K(aVar, "");
        }
    }

    public void setOfflinePayAckKey(String str) {
        if (!Util.isNullOrNil(str)) {
            C86709a0.m107535s().mo121142i().mo119677K(C72994y1.C72995a.USERINFO_HKOFFLINE_PAYACKKEY_STRING_SYNC, str);
        }
    }

    public String sha256Hex(byte[] bArr) {
        return new MessageDigestUtil().getSHA256Hex(bArr);
    }
}

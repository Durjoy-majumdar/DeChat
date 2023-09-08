package com.tencent.kinda.framework;

import android.util.Base64;
import com.tencent.kinda.framework.api.IOfflinePayTsmServices;
import com.tencent.p014mm.app.C80625v0;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MD5Util;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tenpay.ndk.WxSmCertUtil;
import di3.C86301e;
import di3.C86312j;
import eb0.C31543z5;
import eb0.C75592q0;
import ei3.C86522b;
import h81.C32735h;
import p156gj.C87203t;

@C86522b(onProcess = {C80625v0.MATCH_MM})
public class OfflinePayTsmServices extends C86301e implements IOfflinePayTsmServices {
    private static final String TAG = "OfflinePayTsmService";
    private boolean mInitFlag = false;

    private String getTsmCertDeviceId() {
        String f = C87203t.m108270f(false);
        return Util.isNullOrNil(f) ? C87203t.m108273i() : f;
    }

    private String getTsmCertRootPath() {
        return MMApplicationContext.getContext().getFilesDir().getParentFile().getAbsolutePath() + "/tsmCert";
    }

    private String getTsmCertUserId() {
        return MD5Util.getMD5String(C75592q0.m90789s());
    }

    private void initTsmCertIfNeed() {
        if (!this.mInitFlag) {
            String tsmCertRootPath = getTsmCertRootPath();
            String tsmCertDeviceId = getTsmCertDeviceId();
            String tsmCertUserId = getTsmCertUserId();
            WxSmCertUtil instance = WxSmCertUtil.getInstance();
            if (!instance.init(tsmCertRootPath, tsmCertDeviceId, "OfflinePayTsm", tsmCertUserId)) {
                Log.m105925i(TAG, "tsmCert init fail, errcode is %s", Integer.valueOf(instance.getLastError()));
                return;
            }
            Log.m105924i(TAG, "tsmCert init succ");
            this.mInitFlag = true;
        }
    }

    public void cleanTsmToken(String str) {
        if (!Util.isNullOrNil(str)) {
            initTsmCertIfNeed();
            if (!WxSmCertUtil.getInstance().clearToken(str)) {
                Log.m105925i(TAG, "clean tsm token fail, errorcode is : %s", Integer.valueOf(WxSmCertUtil.getInstance().getLastError()));
                C115669n.INSTANCE.idkeyStat(1105, 154, 1, false);
            }
        }
    }

    public String decryptByTsmCert(String str, String str2) {
        if (Util.isNullOrNil(str) || Util.isNullOrNil(str2)) {
            return null;
        }
        initTsmCertIfNeed();
        byte[] certDecrypt = WxSmCertUtil.getInstance().certDecrypt(str, str2.getBytes());
        if (certDecrypt != null) {
            return new String(certDecrypt);
        }
        Log.m105925i(TAG, "cert decrypt fail, errorcode is : %s", Integer.valueOf(WxSmCertUtil.getInstance().getLastError()));
        return null;
    }

    public boolean deleteTsmCert(String str) {
        if (Util.isNullOrNil(str)) {
            return false;
        }
        initTsmCertIfNeed();
        boolean clearCert = WxSmCertUtil.getInstance().clearCert(str);
        if (!clearCert) {
            Log.m105925i(TAG, "delete tsm cert fail, errorcode is : %s", Integer.valueOf(WxSmCertUtil.getInstance().getLastError()));
            C115669n.INSTANCE.idkeyStat(1105, 155, 1, false);
        }
        return clearCert;
    }

    public int getRemainTsmTokenCount(String str) {
        if (Util.isNullOrNil(str)) {
            return 0;
        }
        initTsmCertIfNeed();
        return WxSmCertUtil.getInstance().getTokenCount(str);
    }

    public String getTokenPrefix() {
        return null;
    }

    public String getTsmCSR(String str) {
        if (Util.isNullOrNil(str)) {
            str = getTsmCertUserId();
        }
        initTsmCertIfNeed();
        String makeCsr = WxSmCertUtil.getInstance().makeCsr("WeChatPay", str);
        if (Util.isNullOrNil(makeCsr)) {
            Log.m105925i(TAG, "make csr return nil, errorcode is : %s", Integer.valueOf(WxSmCertUtil.getInstance().getLastError()));
            C115669n.INSTANCE.idkeyStat(1105, 157, 1, false);
        }
        return makeCsr;
    }

    public String getTsmCertCAVersion() {
        initTsmCertIfNeed();
        int caCertVersion = WxSmCertUtil.getInstance().getCaCertVersion();
        return caCertVersion + "";
    }

    public String getTsmCertSign(String str, String str2) {
        if (Util.isNullOrNil(str) || Util.isNullOrNil(str2)) {
            return null;
        }
        initTsmCertIfNeed();
        byte[] certSign = WxSmCertUtil.getInstance().certSign(str, str2.getBytes(), getTsmCertUserId().getBytes());
        if (certSign != null) {
            return Base64.encodeToString(certSign, 2);
        }
        Log.m105925i(TAG, "cert sign fail, errorcode is : %s", Integer.valueOf(WxSmCertUtil.getInstance().getLastError()));
        C115669n.INSTANCE.idkeyStat(1105, 153, 1, false);
        return null;
    }

    public String getTsmSignUserId() {
        return getTsmCertUserId();
    }

    public String getTsmToken(String str) {
        if (Util.isNullOrNil(str)) {
            return null;
        }
        initTsmCertIfNeed();
        return WxSmCertUtil.getInstance().getToken(str);
    }

    public boolean importTsmCert(String str, String str2) {
        if (Util.isNullOrNil(str) || Util.isNullOrNil(str2)) {
            return false;
        }
        initTsmCertIfNeed();
        boolean wf = ((C32735h) C86312j.m106911c(C32735h.class)).mo58784wf(C32735h.C32737c.clicfg_android_wcpay_offline_tsm_verify, false);
        boolean importCert = WxSmCertUtil.getInstance().importCert(str, str2, wf);
        if (!importCert) {
            Log.m105925i(TAG, "import cert fail, errorcode is : %s", Integer.valueOf(WxSmCertUtil.getInstance().getLastError()));
            if (!wf) {
                C115669n.INSTANCE.idkeyStat(1105, 158, 1, false);
            } else {
                C115669n.INSTANCE.idkeyStat(1105, 159, 1, false);
            }
        }
        return importCert;
    }

    public boolean isOfflinePayCertExists(String str) {
        if (Util.isNullOrNil(str)) {
            return false;
        }
        initTsmCertIfNeed();
        boolean hasCert = WxSmCertUtil.getInstance().hasCert(str);
        if (hasCert) {
            long[] certValidTime = WxSmCertUtil.getInstance().getCertValidTime(str);
            if (certValidTime.length > 1) {
                long j = certValidTime[1];
                Long valueOf = Long.valueOf(C31543z5.m39451a() / 1000);
                if (j < valueOf.longValue()) {
                    Log.m105925i(TAG, "cert expiretime is %ld, small than current time %ld, need delete", Long.valueOf(j), valueOf);
                    C115669n nVar = C115669n.INSTANCE;
                    nVar.idkeyStat(1105, 150, 1, false);
                    if (((C32735h) C86312j.m106911c(C32735h.class)).mo58784wf(C32735h.C32737c.clicfg_android_wcpay_offline_tsm_expire_delete_disable, false)) {
                        Log.m105924i(TAG, "delete block abtest is open");
                        nVar.idkeyStat(1105, 152, 1, false);
                    } else {
                        Log.m105924i(TAG, "cert expire, delete");
                        nVar.idkeyStat(1105, 151, 1, false);
                        deleteTsmCert(str);
                        return false;
                    }
                }
            }
        }
        return hasCert;
    }

    public boolean setTsmTokenCode(String str, String str2) {
        if (Util.isNullOrNil(str2) || Util.isNullOrNil(str)) {
            return false;
        }
        initTsmCertIfNeed();
        boolean token = WxSmCertUtil.getInstance().setToken(str2, str);
        if (!token) {
            Log.m105925i(TAG, "set token fail, errorcode is : %s", Integer.valueOf(WxSmCertUtil.getInstance().getLastError()));
            C115669n.INSTANCE.idkeyStat(1105, 156, 1, false);
        }
        return token;
    }

    public void updateTsmCert(String str, String[] strArr) {
        if (!Util.isNullOrNil(str) && strArr != null && strArr.length != 0) {
            initTsmCertIfNeed();
            int i = Util.getInt(str, 0);
            int caCertVersion = WxSmCertUtil.getInstance().getCaCertVersion();
            if (i > 0 && i > caCertVersion) {
                if (!WxSmCertUtil.getInstance().updateCaCert(i, strArr)) {
                    Log.m105925i(TAG, "update ca cert fail, errorcode is : %s", Integer.valueOf(WxSmCertUtil.getInstance().getLastError()));
                    C115669n.INSTANCE.idkeyStat(1105, 160, 1, false);
                    return;
                }
                Log.m105924i(TAG, "update ca cert succ");
            }
        }
    }
}

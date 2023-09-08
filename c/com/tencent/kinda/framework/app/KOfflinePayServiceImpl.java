package com.tencent.kinda.framework.app;

import com.tencent.kinda.framework.api.IOfflinePayTsmServices;
import com.tencent.kinda.gen.KOfflinePayService;
import com.tencent.p014mm.plugin.offline.C69963m;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C72994y1;
import com.tencent.p014mm.wallet_core.model.C75105d;
import com.tenpay.ndk.CertUtil;
import di3.C86312j;
import f40.C86709a0;
import java.util.ArrayList;
import kd2.C76559f;
import p1035sf.C90183c;
import p281yz.C79173v;
import yq3.C79144b;

public class KOfflinePayServiceImpl implements KOfflinePayService {
    private static final String TAG = "KOfflinePayServiceImpl";
    private int KindaOfflinePayCertCsrType_RSA = 1;
    private int KindaOfflinePayCertCsrType_SM = 2;

    private boolean isTsmModeEnable() {
        return getKindaOfflinePayCertType() == this.KindaOfflinePayCertCsrType_SM;
    }

    public void cleanCftToken(String str) {
        if (isTsmModeEnable()) {
            ((IOfflinePayTsmServices) C86312j.m106911c(IOfflinePayTsmServices.class)).cleanTsmToken(str);
        } else {
            C75105d.m90074e().mo104799b(str);
        }
    }

    public String decryptByCftCert(String str, String str2) {
        if (isTsmModeEnable()) {
            return ((IOfflinePayTsmServices) C86312j.m106911c(IOfflinePayTsmServices.class)).decryptByTsmCert(str, str2);
        }
        C75105d.m90074e().getClass();
        Log.m105925i("MicroMsg.CertUtilWx", "call cert decrypt %s, %s", str, str2);
        return CertUtil.getInstance().decrypt(str, str2);
    }

    public boolean deleteCftCert(String str) {
        if (isTsmModeEnable()) {
            return ((IOfflinePayTsmServices) C86312j.m106911c(IOfflinePayTsmServices.class)).deleteTsmCert(str);
        }
        C75105d.m90074e().mo104798a(str);
        return true;
    }

    public String getCertCAVersion() {
        if (getKindaOfflinePayCsrCertType() == this.KindaOfflinePayCertCsrType_SM) {
            return ((IOfflinePayTsmServices) C86312j.m106911c(IOfflinePayTsmServices.class)).getTsmCertCAVersion();
        }
        return null;
    }

    public String getCertid() {
        return C69963m.wx0().zx0(196617);
    }

    public String getCftCSR(String str) {
        if (getKindaOfflinePayCsrCertType() == this.KindaOfflinePayCertCsrType_SM) {
            return ((IOfflinePayTsmServices) C86312j.m106911c(IOfflinePayTsmServices.class)).getTsmCSR(str);
        }
        C75105d e = C75105d.m90074e();
        e.getClass();
        Log.m105918d("MicroMsg.CertUtilWx", "importCertNone");
        synchronized (e) {
            e.f221019a = false;
        }
        return C75105d.m90074e().mo104801d(str, C79144b.m95773a().mo109090e() ? 1 : 0);
    }

    public String getCftCertSign(String str, String str2) {
        return isTsmModeEnable() ? ((IOfflinePayTsmServices) C86312j.m106911c(IOfflinePayTsmServices.class)).getTsmCertSign(str, str2) : C75105d.m90074e().mo104800c(str, str2);
    }

    public String getCftToken(String str) {
        if (isTsmModeEnable()) {
            String tsmToken = ((IOfflinePayTsmServices) C86312j.m106911c(IOfflinePayTsmServices.class)).getTsmToken(str);
            if (C76559f.m92114j(tsmToken)) {
                return tsmToken;
            }
            Log.m105924i(TAG, "tsm token is null or not numeric");
            C115669n.INSTANCE.idkeyStat(1105, 77, 1, false);
            return null;
        }
        String g = C75105d.m90074e().mo104803g(str);
        if (C76559f.m92114j(g)) {
            return g;
        }
        Log.m105924i(TAG, "rsa token is null or not numeric");
        C115669n.INSTANCE.idkeyStat(1105, 76, 1, false);
        return null;
    }

    public int getCodever() {
        String str = C86709a0.m107535s().mo121142i().mo119685f(C72994y1.C72995a.USERINFO_WALLET_OFFLINE_CODE_VER_STRING, "") + "";
        if (Util.isNullOrNil(str)) {
            return 0;
        }
        return Util.getInt(str, 0);
    }

    public String getDeviceid() {
        return C69963m.wx0().zx0(196628);
    }

    public int getKindaOfflinePayCertType() {
        return C86709a0.m107535s().mo121142i().mo119689j(C72994y1.C72995a.USERINFO_KINDAOFFLINE_CERTTYPE_INT_SYNC, 0);
    }

    public int getKindaOfflinePayCsrCertType() {
        return C86709a0.m107535s().mo121142i().mo119689j(C72994y1.C72995a.USERINFO_KINDAOFFLINE_CSRCERTYPE_INT_SYNC, 0);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0028, code lost:
        r0 = y43.C79029b0.vx0().wx0().mo91324f(r0);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.String getLastSelectedCardBankType() {
        /*
            r3 = this;
            java.lang.Class<yz.v> r0 = p281yz.C79173v.class
            di3.d r0 = di3.C86312j.m106911c(r0)
            yz.v r0 = (p281yz.C79173v) r0
            b63.s0 r0 = r0.Ex0()
            r0.getClass()
            f40.o r0 = f40.C86709a0.m107535s()
            com.tencent.mm.storage.v1 r0 = r0.mo121142i()
            com.tencent.mm.storage.y1$a r1 = com.tencent.p014mm.storage.C72994y1.C72995a.USERINFO_WALLET_OFFLINE_ONLINE_BIND_SERIAL_STRING_SYNC
            java.lang.String r2 = ""
            java.lang.Object r0 = r0.mo119685f(r1, r2)
            java.lang.String r0 = (java.lang.String) r0
            boolean r1 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r0)
            if (r1 == 0) goto L_0x0028
            return r2
        L_0x0028:
            y43.b0 r1 = y43.C79029b0.vx0()
            b63.s0 r1 = r1.wx0()
            com.tencent.mm.plugin.wallet_core.model.Bankcard r0 = r1.mo91324f(r0)
            if (r0 == 0) goto L_0x0039
            java.lang.String r0 = r0.field_bankcardType
            return r0
        L_0x0039:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.kinda.framework.app.KOfflinePayServiceImpl.getLastSelectedCardBankType():java.lang.String");
    }

    public String getLastSelectedCardBindSerial() {
        ((C79173v) C86312j.m106911c(C79173v.class)).Ex0().getClass();
        return (String) C86709a0.m107535s().mo121142i().mo119685f(C72994y1.C72995a.USERINFO_WALLET_OFFLINE_ONLINE_BIND_SERIAL_STRING_SYNC, "");
    }

    public long getLastTokenUpdateTs() {
        try {
            return Long.valueOf(C69963m.wx0().zx0(196632)).longValue();
        } catch (NumberFormatException unused) {
            return 0;
        }
    }

    public String getOfflinePayAckKey() {
        Object f = C86709a0.m107535s().mo121142i().mo119685f(C72994y1.C72995a.BUSINESS_OFFLINE_GETMSG_ACK_KEY_STRING, "");
        if (f != null) {
            return (String) f;
        }
        return null;
    }

    public boolean getOfflinePayHasSuccess() {
        return ((Boolean) C86709a0.m107535s().mo121142i().mo119685f(C72994y1.C72995a.USERINFO_ADDRESS_HAS_SHOW_WALLETOFFLINE2_DIALOG_BOOLEAN_SYNC, Boolean.FALSE)).booleanValue();
    }

    public int getRegetTokenNum() {
        return C69963m.xx0();
    }

    public int getRemainCftTokenNum(String str) {
        return isTsmModeEnable() ? ((IOfflinePayTsmServices) C86312j.m106911c(IOfflinePayTsmServices.class)).getRemainTsmTokenCount(str) : C69963m.wx0().Bx0().mo96269d(true);
    }

    public String getSignUserId() {
        return isTsmModeEnable() ? ((IOfflinePayTsmServices) C86312j.m106911c(IOfflinePayTsmServices.class)).getTsmSignUserId() : "";
    }

    public String getTokenPin() {
        return isTsmModeEnable() ? ((IOfflinePayTsmServices) C86312j.m106911c(IOfflinePayTsmServices.class)).getTokenPrefix() : C69963m.wx0().zx0(196647);
    }

    public int getTokenUpdateInterval() {
        return C76559f.m92111g();
    }

    public boolean importCftCert(String str, String str2) {
        return isTsmModeEnable() ? ((IOfflinePayTsmServices) C86312j.m106911c(IOfflinePayTsmServices.class)).importTsmCert(str, str2) : C75105d.m90074e().mo104804h(str, str2);
    }

    public boolean isCertExists(String str) {
        Class cls = IOfflinePayTsmServices.class;
        if (Util.isNullOrNil(str)) {
            return false;
        }
        if (isTsmModeEnable()) {
            boolean isOfflinePayCertExists = ((IOfflinePayTsmServices) C86312j.m106911c(cls)).isOfflinePayCertExists(str);
            if (isOfflinePayCertExists) {
                return isOfflinePayCertExists;
            }
            C75105d.m90074e().mo104798a(str);
            C69963m.wx0().Cx0(196617, "");
            Log.m105924i(TAG, "certid exists, but cert not exist in tsm, remove cert from rsa");
            return isOfflinePayCertExists;
        }
        boolean j = C75105d.m90074e().mo104806j(str);
        if (!j) {
            ((IOfflinePayTsmServices) C86312j.m106911c(cls)).deleteTsmCert(str);
            C69963m.wx0().Cx0(196617, "");
            Log.m105924i(TAG, "certid exists, but cert not exist in rsa, remove cert from tsm");
        }
        return j;
    }

    public void removeCertid() {
        C69963m.wx0().Cx0(196617, "");
    }

    public boolean setCertid(String str) {
        if (C90183c.m112859g(str)) {
            return false;
        }
        C69963m.wx0().Cx0(196617, str);
        return true;
    }

    public boolean setCftTokenCode(String str, String str2) {
        boolean tsmTokenCode = isTsmModeEnable() ? ((IOfflinePayTsmServices) C86312j.m106911c(IOfflinePayTsmServices.class)).setTsmTokenCode(str, str2) : C75105d.m90074e().mo104807k(str2, str, false);
        if (tsmTokenCode) {
            C76559f.m92125u(2);
        }
        return tsmTokenCode;
    }

    public boolean setCodever(int i) {
        String str = i + "";
        if (Util.isNullOrNil(str)) {
            return false;
        }
        C86709a0.m107535s().mo121142i().mo119677K(C72994y1.C72995a.USERINFO_WALLET_OFFLINE_CODE_VER_STRING, str);
        return true;
    }

    public boolean setDeviceid(String str) {
        if (C90183c.m112859g(str)) {
            return false;
        }
        C69963m.wx0().Cx0(196628, str);
        return true;
    }

    public boolean setKindaOfflinePayCertType(int i) {
        C86709a0.m107535s().mo121142i().mo119677K(C72994y1.C72995a.USERINFO_KINDAOFFLINE_CERTTYPE_INT_SYNC, Integer.valueOf(i));
        return true;
    }

    public boolean setKindaOfflinePayCsrCertType(int i) {
        C86709a0.m107535s().mo121142i().mo119677K(C72994y1.C72995a.USERINFO_KINDAOFFLINE_CSRCERTYPE_INT_SYNC, Integer.valueOf(i));
        return true;
    }

    public void setLastSelectedCardBindSerial(String str, String str2) {
        ((C79173v) C86312j.m106911c(C79173v.class)).Ex0().getClass();
        C86709a0.m107535s().mo121142i().mo119677K(C72994y1.C72995a.USERINFO_WALLET_OFFLINE_ONLINE_BIND_SERIAL_STRING_SYNC, str);
    }

    public void setLastTokenUpdateTs(long j) {
        C69963m.wx0().Cx0(196632, String.valueOf(j));
    }

    public void setOfflinePayAckKey(String str) {
        if (str == null) {
            str = "";
        }
        C86709a0.m107535s().mo121142i().mo119677K(C72994y1.C72995a.BUSINESS_OFFLINE_GETMSG_ACK_KEY_STRING, str);
    }

    public void setOfflinePayHasSuccess() {
        C86709a0.m107535s().mo121142i().mo119677K(C72994y1.C72995a.USERINFO_ADDRESS_HAS_SHOW_WALLETOFFLINE2_DIALOG_BOOLEAN_SYNC, Boolean.TRUE);
    }

    public void setOfflineStateClose() {
        C69963m.wx0().Cx0(196630, "0");
    }

    public void setOfflineStateOpen() {
        if (isTsmModeEnable()) {
            C69963m.wx0().Cx0(196630, "0");
        } else {
            C69963m.wx0().Cx0(196630, "1");
        }
    }

    public void setRegetTokenNum(int i) {
        C76559f.m92122r(i);
    }

    public boolean setTokenPin(String str) {
        if (C90183c.m112859g(str)) {
            return false;
        }
        C69963m.wx0().Cx0(196647, str);
        return true;
    }

    public void setTokenUpdateInterval(int i) {
        C69963m.wx0().Cx0(196649, String.valueOf(i));
    }

    public void updateCert(String str, ArrayList<String> arrayList) {
        if (isTsmModeEnable() && arrayList.size() > 0) {
            String[] strArr = new String[arrayList.size()];
            arrayList.toArray(strArr);
            ((IOfflinePayTsmServices) C86312j.m106911c(IOfflinePayTsmServices.class)).updateTsmCert(str, strArr);
        }
    }
}

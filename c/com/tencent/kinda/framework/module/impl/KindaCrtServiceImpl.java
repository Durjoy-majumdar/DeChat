package com.tencent.kinda.framework.module.impl;

import android.content.Context;
import com.tencent.kinda.framework.widget.tools.KindaContext;
import com.tencent.kinda.gen.ITransmitKvData;
import com.tencent.kinda.gen.KCrtService;
import com.tencent.kinda.gen.KGenDigitalCrtReq;
import com.tencent.kinda.gen.VoidCallback;
import com.tencent.kinda.gen.VoidStringCallback;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.wallet_core.model.C75100a0;
import com.tencent.p014mm.wallet_core.model.C75108e;
import com.tencent.p014mm.wallet_core.model.C75140t0;
import f40.C86709a0;
import ob0.C11385n;
import ob0.C117747y;
import te3.oo4;

public class KindaCrtServiceImpl implements KCrtService, C11385n {
    private final String TAG = "KindaCrtServiceImpl";
    private VoidStringCallback m_deleteFailCallBack;
    private VoidCallback m_deleteSuccessCallback;
    private VoidStringCallback m_failCallback;
    private KGenDigitalCrtReq m_req;
    private VoidCallback m_successCallback;

    public void delCert() {
        this.m_deleteFailCallBack = null;
        this.m_deleteSuccessCallback = null;
        C75140t0.m90124c().getClass();
        String b = C75140t0.m90123b();
        Log.m105925i("KindaCrtServiceImpl", "do delete cert: %s", b);
        C75140t0.m90124c().mo104862a(b);
        C86709a0.m107524d().mo123460f(new C75100a0(b));
    }

    public String getCrtNo() {
        C75140t0.m90124c().getClass();
        String b = C75140t0.m90123b();
        if (b.isEmpty()) {
            Log.m105920e("KindaCrtServiceImpl", "crt_no is empty.");
            return null;
        }
        Context context = KindaContext.get();
        if (context != null) {
            C75108e.m90085b().mo104814e(context);
        }
        if (C75108e.m90085b().mo104815f(b)) {
            return b;
        }
        Log.m105920e("KindaCrtServiceImpl", "crt_no is not exist.");
        return null;
    }

    public boolean hasCrt() {
        String crtNo = getCrtNo();
        return crtNo != null && !crtNo.isEmpty();
    }

    public boolean isCrtExist(String str) {
        return C75108e.m90085b().mo104815f(str);
    }

    public void onSceneEnd(int i, int i2, String str, C117747y yVar) {
        Log.m105920e("KindaCrtServiceImpl", "onSceneEnd. errCode: " + i2 + " errMsg: " + str);
        if (yVar instanceof NetSceneKindaGenDigitalCert) {
            Log.m105920e("KindaCrtServiceImpl", "NetSceneKindaGenDigitalCert");
            if (i2 == 0) {
                VoidCallback voidCallback = this.m_successCallback;
                if (voidCallback != null) {
                    voidCallback.call();
                } else {
                    Log.m105920e("KindaCrtServiceImpl", "m_successCallback is null!!");
                }
            } else {
                VoidStringCallback voidStringCallback = this.m_failCallback;
                if (voidStringCallback != null) {
                    voidStringCallback.call(str);
                } else {
                    Log.m105920e("KindaCrtServiceImpl", "m_failCallback is null!!");
                }
            }
            C86709a0.m107529k().f251779b.mo123470p(1580, this);
        } else if (yVar instanceof C75100a0) {
            Log.m105920e("KindaCrtServiceImpl", "NetSceneDeletedigitalcert");
            if (i2 == 0) {
                VoidCallback voidCallback2 = this.m_deleteSuccessCallback;
                if (voidCallback2 != null) {
                    voidCallback2.call();
                } else {
                    Log.m105920e("KindaCrtServiceImpl", "m_deleteSuccessCallback is null!!");
                }
            } else {
                VoidStringCallback voidStringCallback2 = this.m_deleteFailCallBack;
                if (voidStringCallback2 != null) {
                    voidStringCallback2.call(str);
                } else {
                    Log.m105920e("KindaCrtServiceImpl", "m_deleteFailCallBack is null!!");
                }
            }
            this.m_deleteFailCallBack = null;
            this.m_successCallback = null;
            C86709a0.m107529k().f251779b.mo123470p(1580, this);
        }
    }

    public String sign(String str, byte[] bArr) {
        if (str == null || bArr == null) {
            return null;
        }
        Context context = KindaContext.get();
        if (context != null) {
            C75108e.m90085b().mo104814e(context);
        }
        String a = C75108e.m90085b().mo104811a(str, bArr);
        if (Util.isNullOrNil(a)) {
            C115669n.INSTANCE.mo160131h(20743, "user_identification", "pay_cert_sign", "", "", "", "", Integer.valueOf(C75108e.m90085b().mo104812c()));
        }
        return a;
    }

    public void startDeleteDigitalCrtImpl(String str, VoidCallback voidCallback, VoidStringCallback voidStringCallback) {
        this.m_deleteSuccessCallback = voidCallback;
        this.m_deleteFailCallBack = voidStringCallback;
        C75140t0.m90124c().mo104862a(str);
        C75100a0 a0Var = new C75100a0(str);
        C86709a0.m107529k().f251779b.mo123455a(1568, this);
        C86709a0.m107524d().mo123460f(a0Var);
    }

    public void startGenDigitalCrtImpl(KGenDigitalCrtReq kGenDigitalCrtReq, VoidCallback voidCallback, VoidStringCallback voidStringCallback) {
        this.m_req = kGenDigitalCrtReq;
        this.m_successCallback = voidCallback;
        this.m_failCallback = voidStringCallback;
        C86709a0.m107529k().f251779b.mo123455a(1580, this);
        NetSceneKindaGenDigitalCert netSceneKindaGenDigitalCert = new NetSceneKindaGenDigitalCert(kGenDigitalCrtReq);
        Log.m105924i("KindaCrtServiceImpl", "The Param of startGenDigitalCrtImpl is: " + kGenDigitalCrtReq.toString());
        C86709a0.m107524d().mo123460f(netSceneKindaGenDigitalCert);
    }

    public String updateCurrentDeviceCertNoWithInfo(ITransmitKvData iTransmitKvData) {
        byte[] binary = iTransmitKvData.getBinary("UserCertInfo");
        oo4 oo4 = new oo4();
        try {
            oo4.parseFrom(binary);
        } catch (Exception unused) {
            Log.m105920e("KindaCrtServiceImpl", "userCertInfo parse failed");
        }
        C75140t0.m90124c().getClass();
        if (C75140t0.m90123b().length() <= 0 || oo4.f139290e <= 0) {
            return "";
        }
        C75140t0.m90124c().getClass();
        return C75140t0.m90123b();
    }
}

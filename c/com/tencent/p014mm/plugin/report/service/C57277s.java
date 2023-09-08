package com.tencent.p014mm.plugin.report.service;

import android.os.Build;
import com.tencent.mars.app.AppLogic;
import com.tencent.mars.smc.SmcLogic;
import com.tencent.mars.smc.SmcProtoBufUtil;
import com.tencent.p014mm.sdk.platformtools.ChannelUtil;
import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import f40.C86709a0;
import f62.C75700k0;
import g62.C32330n;
import mj2.C61497g;
import p156gj.C87203t;
import re3.C48021k;
import tc0.C77885p;
import te3.C64469jh2;

/* renamed from: com.tencent.mm.plugin.report.service.s */
public class C57277s implements SmcLogic.ICallBack {

    /* renamed from: a */
    public static IKVReportNotify f164059a;

    public boolean OnSelfMonitorOpLogReady(byte[] bArr) {
        if (!C86709a0.m107523b().mo121115m()) {
            Log.m105920e("MicroMsg.SmcCallBack", "onReportKVDaSelfMonitorOpLogReady account not ready");
            return false;
        }
        try {
            C48021k kVar = new C48021k();
            kVar.parseFrom(bArr);
            C64469jh2 mMSelfMonitor = SmcProtoBufUtil.toMMSelfMonitor(kVar);
            if (mMSelfMonitor.f183794d <= 0) {
                Log.m105920e("KVReportJni", "error selfmonitor count");
                return true;
            }
            ((C77885p) ((C75700k0) C86709a0.m107533q(C75700k0.class)).mo96100XW()).mo107993q(new C32330n(202, mMSelfMonitor));
            return true;
        } catch (Exception e) {
            Log.m105920e("KVReportJni", e.getMessage());
            return false;
        }
    }

    public String getKVCommPath() {
        String str = AppLogic.getAppFilePath() + "/kvcomm/";
        Log.m105924i("MicroMsg.SmcCallBack", "[TEST-PATH (Smc)]path:" + AppLogic.getAppFilePath());
        return str;
    }

    public SmcLogic.BaseInfo getKVCommReqBaseInfo() {
        SmcLogic.BaseInfo baseInfo = new SmcLogic.BaseInfo();
        baseInfo.deviceModel = C87203t.m108275k() + Build.CPU_ABI;
        baseInfo.deviceBrand = Build.BRAND;
        baseInfo.osName = "android-" + Build.MANUFACTURER;
        baseInfo.osVersion = "" + Build.VERSION.SDK_INT;
        baseInfo.languageVer = LocaleUtil.getApplicationLanguage();
        return baseInfo;
    }

    public int getSingleReportBufSizeB() {
        return 20480;
    }

    public void onReportDataReady(byte[] bArr, byte[] bArr2, int i, String str) {
        try {
            IKVReportNotify iKVReportNotify = f164059a;
            if (iKVReportNotify != null && bArr2 != null && bArr2.length > 0) {
                iKVReportNotify.onReportKVDataReady(bArr, bArr2, i);
            }
        } catch (Exception e) {
            Log.m105920e("KVReportJni", e.getMessage());
        }
    }

    public boolean onRequestGetStrategy(byte[] bArr, int i) {
        boolean z;
        try {
            if (!ChannelUtil.shouldShowGprsAlert || !MMApplicationContext.getContext().getSharedPreferences(MMApplicationContext.getDefaultPreferencePath(), 0).getBoolean("gprs_alert", true)) {
                synchronized (this) {
                    synchronized (C61497g.f174830i) {
                        z = C61497g.f174829h;
                    }
                    if (z) {
                        Log.m105924i("KVReportJni", "already running");
                        return false;
                    }
                    C86709a0.m107529k().f251779b.mo123460f(new C61497g(bArr));
                    return true;
                }
            }
            Log.m105924i("MicroMsg.SmcCallBack", "onRequestGetStrategy gprs alert return false");
            return false;
        } catch (Exception e) {
            Log.m105920e("KVReportJni", "onRequestGetStrategy error: " + e.getMessage());
            return false;
        }
    }
}

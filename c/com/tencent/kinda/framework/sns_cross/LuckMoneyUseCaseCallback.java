package com.tencent.kinda.framework.sns_cross;

import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.tencent.kinda.gen.ITransmitKvData;
import com.tencent.p014mm.autogen.mmdata.rpt.HBReportNewStruct;
import com.tencent.p014mm.plugin.luckymoney.model.C69242l1;
import com.tencent.p014mm.plugin.luckymoney.p073ui.C69677r2;
import com.tencent.p014mm.plugin.luckymoney.p073ui.LuckyMoneyNewYearSendUIV2;
import com.tencent.p014mm.plugin.luckymoney.p073ui.LuckyMoneyPrepareUI;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.plugin.wallet_core.id_verify.util.RealnameGuideHelper;
import com.tencent.p014mm.pluginsdk.wallet.PayInfo;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.XmlParser;
import g32.C75846b;
import java.util.Map;
import yq3.C79148e;

public class LuckMoneyUseCaseCallback implements ISnsUseCaseCallback {
    private SnsServiceBean mBean;

    public void call(ITransmitKvData iTransmitKvData) {
        RealnameGuideHelper realnameGuideHelper;
        Context context = this.mBean.getContext();
        if (context instanceof LuckyMoneyPrepareUI) {
            LuckyMoneyPrepareUI luckyMoneyPrepareUI = (LuckyMoneyPrepareUI) context;
            if (iTransmitKvData.getString("closeLoading").equals("1")) {
                Dialog dialog = luckyMoneyPrepareUI.f200730r;
                if (dialog != null && dialog.isShowing()) {
                    luckyMoneyPrepareUI.f200730r.dismiss();
                    return;
                }
                return;
            }
            int i = iTransmitKvData.getInt("retcode");
            String string = iTransmitKvData.getString(FirebaseAnalytics.C113379b.TRANSACTION_ID);
            PayInfo payInfo = this.mBean.getPayInfo();
            int i2 = i == 1 ? -1 : 0;
            Intent intent = new Intent();
            intent.putExtra("key_trans_id", string);
            Bundle bundle = payInfo.f212600u;
            if (bundle != null ? bundle.getBoolean("isF2FHongBao", false) : false) {
                if (i2 == -1) {
                    luckyMoneyPrepareUI.getClass();
                    luckyMoneyPrepareUI.mo95763M7(intent.getStringExtra("key_trans_id"));
                }
                luckyMoneyPrepareUI.finish();
            } else {
                luckyMoneyPrepareUI.mo95772U7(i2, intent);
            }
        }
        if (context instanceof LuckyMoneyNewYearSendUIV2) {
            LuckyMoneyNewYearSendUIV2 luckyMoneyNewYearSendUIV2 = (LuckyMoneyNewYearSendUIV2) context;
            if (iTransmitKvData.getString("closeLoading").equals("1")) {
                Dialog dialog2 = luckyMoneyNewYearSendUIV2.f200307T0;
                if (dialog2 != null && dialog2.isShowing()) {
                    luckyMoneyNewYearSendUIV2.f200307T0.dismiss();
                    return;
                }
                return;
            }
            int i3 = iTransmitKvData.getInt("retcode");
            String string2 = iTransmitKvData.getString(FirebaseAnalytics.C113379b.TRANSACTION_ID);
            int i4 = i3 == 1 ? -1 : 0;
            Intent intent2 = new Intent();
            intent2.putExtra("key_trans_id", string2);
            luckyMoneyNewYearSendUIV2.getClass();
            Log.m105925i("MicroMsg.LuckyMoneyNewYearSendUIV2", "[onResultPay] kinda resultCode: %s", Integer.valueOf(i4));
            if (i4 == -1) {
                Log.m105924i("MicroMsg.LuckyMoneyNewYearSendUIV2", "do pay success!");
                luckyMoneyNewYearSendUIV2.mo95672U7(19);
                C115669n.INSTANCE.mo160131h(11701, 15, 3, 0, 1, 2);
                boolean z = (!intent2.hasExtra("key_realname_guide_helper") || (realnameGuideHelper = (RealnameGuideHelper) intent2.getParcelableExtra("key_realname_guide_helper")) == null) ? false : !realnameGuideHelper.mo99370a(luckyMoneyNewYearSendUIV2, (Bundle) null, new C69677r2(luckyMoneyNewYearSendUIV2), (C79148e.C79149a) null);
                luckyMoneyNewYearSendUIV2.mo95663L7();
                Map<String, String> parseXml = XmlParser.parseXml(luckyMoneyNewYearSendUIV2.f200304S0, "msg", (String) null);
                if (parseXml == null) {
                    Log.m105920e("MicroMsg.LuckyMoneyNewYearSendUIV2", "LuckyMoneyNewYearSendUIV2 onActivityResult values is null");
                    luckyMoneyNewYearSendUIV2.finish();
                    return;
                }
                if (C75846b.zx0().Bx0().mo57182a(parseXml.get(".msg.appmsg.wcpayinfo.paymsgid"))) {
                    Log.m105925i("MicroMsg.LuckyMoneyNewYearSendUIV2", "sendLocalMsg() for hb! mMsgXml:%s", luckyMoneyNewYearSendUIV2.f200304S0);
                    C69242l1.m81614t(luckyMoneyNewYearSendUIV2.f200304S0, luckyMoneyNewYearSendUIV2.f200298Q0, 3);
                } else {
                    Log.m105920e("MicroMsg.LuckyMoneyNewYearSendUIV2", "it is a duplicate msg");
                }
                if (!z) {
                    luckyMoneyNewYearSendUIV2.finish();
                }
                HBReportNewStruct hBReportNewStruct = new HBReportNewStruct();
                luckyMoneyNewYearSendUIV2.f200337l1 = hBReportNewStruct;
                int i5 = luckyMoneyNewYearSendUIV2.f200340n1;
                if (i5 == 1) {
                    hBReportNewStruct.f194229d = 8;
                } else if (i5 == 2) {
                    hBReportNewStruct.f194229d = 6;
                } else if (i5 == 3) {
                    hBReportNewStruct.f194229d = 7;
                } else if (i5 == 4) {
                    hBReportNewStruct.f194229d = 14;
                }
                hBReportNewStruct.mo86054n();
                luckyMoneyNewYearSendUIV2.mo95674W7(1);
            } else {
                Log.m105924i("MicroMsg.LuckyMoneyNewYearSendUIV2", "do pay cancel or failed!");
            }
            luckyMoneyNewYearSendUIV2.mo95664M7(i4, intent2);
        }
    }

    public void setData(Context context, PayInfo payInfo) {
        this.mBean = new SnsServiceBean(context, payInfo);
    }
}

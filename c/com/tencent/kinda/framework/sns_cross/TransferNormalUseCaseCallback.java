package com.tencent.kinda.framework.sns_cross;

import android.content.Context;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.tencent.kinda.gen.ITransmitKvData;
import com.tencent.p014mm.autogen.events.BusiF2fPaySuccEvent;
import com.tencent.p014mm.autogen.events.F2fPayCheckEvent;
import com.tencent.p014mm.plugin.remittance.p098ui.RemittanceF2fDynamicCodeUI;
import com.tencent.p014mm.pluginsdk.wallet.PayInfo;
import com.tencent.p014mm.wallet_core.p137ui.WalletBaseUI;

public class TransferNormalUseCaseCallback implements ISnsUseCaseCallback {
    private SnsServiceBean mBean;

    public void call(ITransmitKvData iTransmitKvData) {
        Context context = this.mBean.getContext();
        if (!"1".equals(iTransmitKvData.getString("closeLoading")) || !(context instanceof WalletBaseUI)) {
            String string = iTransmitKvData.getString(FirebaseAnalytics.C113379b.TRANSACTION_ID);
            int payScene = this.mBean.getPayScene();
            int i = iTransmitKvData.getInt("retcode");
            long j = iTransmitKvData.getLong("total_fee");
            int i2 = iTransmitKvData.getInt("action");
            F2fPayCheckEvent f2fPayCheckEvent = new F2fPayCheckEvent();
            f2fPayCheckEvent.f193594d.f193595a = iTransmitKvData.getString("req_key");
            if (payScene == 31 || payScene == 82) {
                f2fPayCheckEvent.f193594d.f193596b = 0;
            } else if (payScene == 32 || payScene == 33 || payScene == 65) {
                f2fPayCheckEvent.f193594d.f193596b = 1;
            }
            if (payScene != 31 && payScene != 82) {
                f2fPayCheckEvent.f193594d.f193599e = i;
            } else if (i == 1 && i2 == 1) {
                f2fPayCheckEvent.f193594d.f193599e = 1;
            } else if (i == 1 && i2 == 2) {
                f2fPayCheckEvent.f193594d.f193599e = 2;
            }
            F2fPayCheckEvent.C67693a aVar = f2fPayCheckEvent.f193594d;
            aVar.f193597c = string;
            aVar.f193598d = true;
            aVar.f193600f = context.hashCode();
            f2fPayCheckEvent.publish();
            if (payScene != 31) {
                BusiF2fPaySuccEvent busiF2fPaySuccEvent = new BusiF2fPaySuccEvent();
                busiF2fPaySuccEvent.f193493d.f193494a = iTransmitKvData.getString("req_key");
                BusiF2fPaySuccEvent.C67663a aVar2 = busiF2fPaySuccEvent.f193493d;
                aVar2.f193495b = string;
                aVar2.f193497d = i;
                aVar2.f193498e = ((double) j) / 100.0d;
                aVar2.f193496c = true;
                aVar2.f193499f = iTransmitKvData.getInt("pay_fail_reason");
                busiF2fPaySuccEvent.f193493d.f193502i = this.mBean.getAppId();
                busiF2fPaySuccEvent.f193493d.f193500g = iTransmitKvData.getInt("pay_succ_action");
                busiF2fPaySuccEvent.f193493d.f193501h = this.mBean.getChannel();
                busiF2fPaySuccEvent.publish();
            }
        } else if (context instanceof RemittanceF2fDynamicCodeUI) {
            ((RemittanceF2fDynamicCodeUI) context).hideProgress();
        } else {
            ((WalletBaseUI) context).hideLoading();
        }
    }

    public void setData(Context context, PayInfo payInfo) {
        this.mBean = new SnsServiceBean(context, payInfo);
    }
}

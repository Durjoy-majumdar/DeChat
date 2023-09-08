package com.tencent.kinda.framework.sns_cross;

import android.content.Context;
import android.content.Intent;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.tencent.kinda.gen.ITransmitKvData;
import com.tencent.p014mm.plugin.p019aa.p020ui.AARemittanceUI;
import com.tencent.p014mm.plugin.p019aa.p020ui.PaylistAAUI;
import com.tencent.p014mm.pluginsdk.wallet.PayInfo;

public class NewAAUseCaseCallback implements ISnsUseCaseCallback {
    private SnsServiceBean mBean;

    public void call(ITransmitKvData iTransmitKvData) {
        Context context = this.mBean.getContext();
        if (!"1".equals(iTransmitKvData.getString("closeLoading")) || !(context instanceof PaylistAAUI)) {
            String string = iTransmitKvData.getString(FirebaseAnalytics.C113379b.TRANSACTION_ID);
            int i = iTransmitKvData.getInt("retcode") == 1 ? -1 : 0;
            if (context instanceof PaylistAAUI) {
                Intent intent = new Intent();
                intent.putExtra("key_trans_id", string);
                ((PaylistAAUI) context).mo93854P7(i, intent);
            } else if (context instanceof AARemittanceUI) {
                Intent intent2 = new Intent();
                intent2.putExtra("key_trans_id", string);
                ((AARemittanceUI) context).mo93737L7(i, intent2);
            }
        } else {
            ((PaylistAAUI) context).hideLoading();
        }
    }

    public void setData(Context context, PayInfo payInfo) {
        this.mBean = new SnsServiceBean(context, payInfo);
    }
}

package com.tencent.kinda.framework.sns_cross;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.tencent.kinda.gen.ITransmitKvData;
import com.tencent.p014mm.plugin.remittance.bankcard.p096ui.BankRemitDetailUI;
import com.tencent.p014mm.plugin.remittance.bankcard.p096ui.BankRemitMoneyInputUI;
import com.tencent.p014mm.pluginsdk.wallet.PayInfo;
import si2.C48391l;

public class T2BUseCaseCallback implements ISnsUseCaseCallback {
    private static final int REQ_DETAIL = 2;
    private SnsServiceBean mBean;

    public void call(ITransmitKvData iTransmitKvData) {
        SnsServiceBean snsServiceBean;
        Bundle bundle;
        Context context = this.mBean.getContext();
        if (context instanceof BankRemitMoneyInputUI) {
            Activity activity = (Activity) context;
            if (iTransmitKvData.getString("closeLoading").equals("1")) {
                ((BankRemitMoneyInputUI) activity).hideLoading();
                return;
            }
            int i = iTransmitKvData.getInt("retcode");
            String string = iTransmitKvData.getString(FirebaseAnalytics.C113379b.TRANSACTION_ID);
            if (i == 1 && (snsServiceBean = this.mBean) != null && snsServiceBean.getPayInfo() != null && (bundle = this.mBean.getPayInfo().f212600u) != null) {
                String string2 = bundle.getString("key_transfer_bill_id");
                Intent intent = new Intent(context, BankRemitDetailUI.class);
                intent.putExtra("key_transfer_transaction_id", string);
                intent.putExtra("key_transfer_bill_id", string2);
                intent.putExtra("key_enter_scene", 0);
                BankRemitMoneyInputUI bankRemitMoneyInputUI = (BankRemitMoneyInputUI) activity;
                bankRemitMoneyInputUI.startActivityForResult(intent, 2);
                bankRemitMoneyInputUI.mo97187L7(intent.getStringExtra("key_transfer_transaction_id"));
                bankRemitMoneyInputUI.f203801L = 1;
                bankRemitMoneyInputUI.doSceneProgress(new C48391l(bankRemitMoneyInputUI.f203799J, bankRemitMoneyInputUI.f203800K, 1), false);
            }
        }
    }

    public void setData(Context context, PayInfo payInfo) {
        this.mBean = new SnsServiceBean(context, payInfo);
    }
}

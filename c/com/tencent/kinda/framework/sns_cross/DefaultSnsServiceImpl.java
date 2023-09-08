package com.tencent.kinda.framework.sns_cross;

import android.os.Bundle;
import com.tencent.kinda.gen.ITransmitKvData;
import com.tencent.p014mm.pluginsdk.wallet.PayInfo;

public class DefaultSnsServiceImpl extends BaseSnsSceneService {
    public ITransmitKvData generateSnsUseCaseData() {
        Bundle bundle;
        ITransmitKvData generateSnsUseCaseData = super.generateSnsUseCaseData();
        PayInfo payInfo = this.mBean.getPayInfo();
        if (!(payInfo == null || (bundle = payInfo.f212600u) == null)) {
            generateSnsUseCaseData.putString("cashier_desc", bundle.getString("cashier_desc"));
            generateSnsUseCaseData.putString("succ_tip", bundle.getString("succ_tip"));
            generateSnsUseCaseData.putString("prepay_page_payee", bundle.getString("prepay_page_payee"));
            generateSnsUseCaseData.putString("openim_cashier_format", bundle.getString("openim_cashier_format"));
            generateSnsUseCaseData.putString("openim_succ_format", bundle.getString("openim_succ_format"));
            generateSnsUseCaseData.putString("openim_nickname", bundle.getString("openim_nickname"));
            generateSnsUseCaseData.putString("openim_truename", bundle.getString("openim_truename"));
            generateSnsUseCaseData.putString("openim_businessname", bundle.getString("openim_businessname"));
            generateSnsUseCaseData.putBool("need_kinda_cashier_Loading", bundle.getBoolean("need_kinda_cashier_Loading", false));
            generateSnsUseCaseData.putBool("yunshanfu_disabled", bundle.getBoolean("yunshanfu_disabled"));
            generateSnsUseCaseData.putInt("chat_type", payInfo.f212600u.getInt("chat_type"));
            generateSnsUseCaseData.putInt("send_type", payInfo.f212600u.getInt("send_type"));
            if (this.mBean.getPayScene() == 32 || this.mBean.getPayScene() == 33) {
                generateSnsUseCaseData.putBinary("after_place_order_commreq", bundle.getByteArray("after_place_order_commreq"));
                generateSnsUseCaseData.putString("suc_page_extend", bundle.getString("suc_page_extend"));
                generateSnsUseCaseData.putInt("fault_flag", bundle.getInt("fault_flag"));
                generateSnsUseCaseData.putString("suc_page_name", bundle.getString("suc_page_name"));
                generateSnsUseCaseData.putString("rece_photo_url", bundle.getString("rece_photo_url"));
            }
        }
        return generateSnsUseCaseData;
    }
}

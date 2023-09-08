package com.tencent.kinda.framework.sns_cross;

import com.tencent.kinda.gen.ITransmitKvData;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.pluginsdk.wallet.PayInfo;

class QRCodeRewardServiceImpl extends BaseSnsSceneService {
    public ITransmitKvData generateSnsUseCaseData() {
        ITransmitKvData generateSnsUseCaseData = super.generateSnsUseCaseData();
        PayInfo payInfo = this.mBean.getPayInfo();
        generateSnsUseCaseData.putString("rece_desc", "收款方");
        generateSnsUseCaseData.putString("rece_name", this.mBean.getPayInfo().f212600u.getString("extinfo_key_28"));
        generateSnsUseCaseData.putString("username", this.mBean.getReceiverName());
        generateSnsUseCaseData.putString("rece_img_url", this.mBean.getPayInfo().f212600u.getString("extinfo_key_27"));
        generateSnsUseCaseData.putString("cashier_desc", this.mBean.getContext().getString(C0966R.string.hpd));
        generateSnsUseCaseData.putString("rece_remark", this.mBean.getPayInfo().f212600u.getString("extinfo_key_3"));
        generateSnsUseCaseData.putString("payee_remark", this.mBean.getPayInfo().f212600u.getString("extinfo_key_7"));
        generateSnsUseCaseData.putInt("chat_type", payInfo.f212600u.getInt("chat_type"));
        generateSnsUseCaseData.putInt("send_type", payInfo.f212600u.getInt("send_type"));
        return generateSnsUseCaseData;
    }
}

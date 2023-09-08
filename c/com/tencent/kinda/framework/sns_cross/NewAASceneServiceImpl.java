package com.tencent.kinda.framework.sns_cross;

import android.os.Bundle;
import com.tencent.kinda.gen.ITransmitKvData;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.pluginsdk.wallet.PayInfo;

class NewAASceneServiceImpl extends BaseSnsSceneService {
    public ITransmitKvData generateSnsUseCaseData() {
        Bundle bundle;
        ITransmitKvData generateSnsUseCaseData = super.generateSnsUseCaseData();
        String receiverText = SnsTextUtil.getReceiverText(this.mBean.getContext(), this.mBean.getReceiverName(), this.mBean.getTrueName());
        generateSnsUseCaseData.putString("prepay_page_payee", receiverText);
        generateSnsUseCaseData.putString("cashier_desc", this.mBean.getContext().getString(C0966R.string.l5o, new Object[]{receiverText}));
        PayInfo payInfo = this.mBean.getPayInfo();
        if (!(payInfo == null || (bundle = payInfo.f212600u) == null)) {
            generateSnsUseCaseData.putInt("chat_type", bundle.getInt("chat_type"));
            generateSnsUseCaseData.putInt("send_type", payInfo.f212600u.getInt("send_type"));
        }
        return generateSnsUseCaseData;
    }
}

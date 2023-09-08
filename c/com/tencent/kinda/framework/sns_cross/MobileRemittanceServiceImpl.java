package com.tencent.kinda.framework.sns_cross;

import com.tencent.kinda.gen.ITransmitKvData;

public class MobileRemittanceServiceImpl extends BaseSnsSceneService {
    public ITransmitKvData generateSnsUseCaseData() {
        ITransmitKvData generateSnsUseCaseData = super.generateSnsUseCaseData();
        if (!(this.mBean.getPayInfo() == null || this.mBean.getPayInfo().f212600u == null)) {
            generateSnsUseCaseData.putString("cashier_desc", this.mBean.getPayInfo().f212600u.getString("extinfo_key_12"));
        }
        return generateSnsUseCaseData;
    }
}

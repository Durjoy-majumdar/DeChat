package com.tencent.kinda.framework.sns_cross;

import android.os.Bundle;
import com.tencent.kinda.gen.ITransmitKvData;
import com.tencent.p014mm.C0966R;

public class T2BSceneServiceImpl extends BaseSnsSceneService {
    public ITransmitKvData generateSnsUseCaseData() {
        ITransmitKvData generateSnsUseCaseData = super.generateSnsUseCaseData();
        if (!(this.mBean.getPayInfo() == null || this.mBean.getPayInfo().f212600u == null)) {
            Bundle bundle = this.mBean.getPayInfo().f212600u;
            String string = bundle.getString("extinfo_key_3");
            String string2 = bundle.getString("extinfo_key_4");
            generateSnsUseCaseData.putString("cashier_desc", this.mBean.getContext().getString(C0966R.string.i0c, new Object[]{this.mBean.getContext().getString(C0966R.string.ai7, new Object[]{string, string2}) + this.mBean.getTrueName()}));
        }
        return generateSnsUseCaseData;
    }
}

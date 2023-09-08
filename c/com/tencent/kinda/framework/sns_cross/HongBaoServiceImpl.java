package com.tencent.kinda.framework.sns_cross;

import android.os.Bundle;
import com.tencent.kinda.gen.ITransmitKvData;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.pluginsdk.wallet.PayInfo;

public class HongBaoServiceImpl extends BaseSnsSceneService {
    public ITransmitKvData generateSnsUseCaseData() {
        Bundle bundle;
        ITransmitKvData generateSnsUseCaseData = super.generateSnsUseCaseData();
        String string = this.mBean.getContext().getResources().getString(C0966R.string.gjj);
        PayInfo payInfo = this.mBean.getPayInfo();
        generateSnsUseCaseData.putString("cashier_desc", string);
        if (!(payInfo == null || (bundle = payInfo.f212600u) == null)) {
            generateSnsUseCaseData.putInt("chat_type", bundle.getInt("chat_type"));
            generateSnsUseCaseData.putInt("send_type", payInfo.f212600u.getInt("send_type"));
        }
        return generateSnsUseCaseData;
    }
}

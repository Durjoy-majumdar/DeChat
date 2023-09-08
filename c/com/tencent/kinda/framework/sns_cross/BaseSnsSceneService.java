package com.tencent.kinda.framework.sns_cross;

import android.content.Context;
import com.tencent.kinda.gen.ITransmitKvData;
import com.tencent.p014mm.pluginsdk.wallet.PayInfo;

public abstract class BaseSnsSceneService implements ISnsSceneService {
    public SnsServiceBean mBean;

    public ITransmitKvData generateSnsUseCaseData() {
        ITransmitKvData create = ITransmitKvData.create();
        create.putString("req_key", this.mBean.getReqKey());
        create.putInt("payChannel", this.mBean.getChannel());
        create.putInt("payScene", this.mBean.getPayScene());
        return create;
    }

    public void setData(Context context, PayInfo payInfo) {
        this.mBean = new SnsServiceBean(context, payInfo);
    }
}

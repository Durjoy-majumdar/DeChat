package com.tencent.kinda.framework.sns_cross;

import android.content.Context;
import com.tencent.kinda.gen.ITransmitKvData;
import com.tencent.p014mm.pluginsdk.wallet.PayInfo;

public class SnsSceneServiceFactory {
    public static ISnsUseCaseCallback createCallback(int i) {
        if (i != 37) {
            if (i == 42) {
                return new NewAAUseCaseCallback();
            }
            if (i == 56) {
                return new MobileRemittanceCaseCallBack();
            }
            if (i != 65) {
                if (i != 78) {
                    if (!(i == 82 || i == 48)) {
                        if (i == 49) {
                            return new T2BUseCaseCallback();
                        }
                        switch (i) {
                            case 31:
                            case 32:
                            case 33:
                                break;
                            default:
                                return new ISnsUseCaseCallback() {
                                    public void call(ITransmitKvData iTransmitKvData) {
                                    }

                                    public void setData(Context context, PayInfo payInfo) {
                                    }
                                };
                        }
                    }
                }
            }
            return new TransferNormalUseCaseCallback();
        }
        return new LuckMoneyUseCaseCallback();
    }

    public static ISnsSceneService createService(int i) {
        if (i != 37) {
            if (i == 42) {
                return new NewAASceneServiceImpl();
            }
            if (i == 56) {
                return new MobileRemittanceServiceImpl();
            }
            if (i != 78) {
                return i != 48 ? i != 49 ? new DefaultSnsServiceImpl() : new T2BSceneServiceImpl() : new QRCodeRewardServiceImpl();
            }
        }
        return new HongBaoServiceImpl();
    }
}

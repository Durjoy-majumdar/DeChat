package com.tencent.kinda.framework.sns_cross;

import android.content.Context;
import android.content.Intent;
import com.tencent.kinda.gen.ITransmitKvData;
import com.tencent.p014mm.plugin.remittance.mobile.p097ui.MobileRemittanceUI;
import com.tencent.p014mm.pluginsdk.wallet.PayInfo;
import com.tencent.p014mm.sdk.platformtools.Log;
import j20.C117292a;
import k20.C9556a;

public class MobileRemittanceCaseCallBack implements ISnsUseCaseCallback {
    private SnsServiceBean mBean;

    public void call(ITransmitKvData iTransmitKvData) {
        Context context = this.mBean.getContext();
        if (context instanceof MobileRemittanceUI) {
            MobileRemittanceUI mobileRemittanceUI = (MobileRemittanceUI) context;
            if (iTransmitKvData.getString("closeLoading").equals("1")) {
                mobileRemittanceUI.hideProgress();
                return;
            }
            int i = iTransmitKvData.getInt("retcode") == 1 ? -1 : 0;
            mobileRemittanceUI.hideProgress();
            mobileRemittanceUI.hideLoading();
            Log.m105925i("MicroMsg.mobileRemit.MobileRemittanceUI", "resultCode :%s", Integer.valueOf(i));
            if (i == -1) {
                Intent intent = mobileRemittanceUI.f203961V;
                C9556a aVar = new C9556a();
                aVar.mo10233c(intent);
                MobileRemittanceUI mobileRemittanceUI2 = mobileRemittanceUI;
                C117292a.m165358d(mobileRemittanceUI2, aVar.mo10232b(), "com/tencent/mm/plugin/remittance/mobile/ui/MobileRemittanceUI", "onMobileRemittanceResult", "(I)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                mobileRemittanceUI.startActivity((Intent) aVar.mo10231a(0));
                C117292a.m165359e(mobileRemittanceUI2, "com/tencent/mm/plugin/remittance/mobile/ui/MobileRemittanceUI", "onMobileRemittanceResult", "(I)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            }
        }
    }

    public void setData(Context context, PayInfo payInfo) {
        this.mBean = new SnsServiceBean(context, payInfo);
    }
}

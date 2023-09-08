package nd2;

import android.app.Activity;
import android.os.Bundle;
import com.tencent.p014mm.plugin.order.p889ui.MallOrderDetailInfoUI;
import com.tencent.p014mm.plugin.order.p889ui.MallOrderProductListUI;
import com.tencent.p014mm.plugin.order.p889ui.MallOrderRecordListUI;
import com.tencent.p014mm.plugin.order.p889ui.MallOrderTransactionInfoUI;
import com.tencent.p014mm.sdk.platformtools.Log;
import yq3.C79148e;

/* renamed from: nd2.b */
public class C76852b extends C79148e {
    /* renamed from: A */
    public C79148e mo91260A(Activity activity, Bundle bundle) {
        Log.m105918d("MicroMsg.ShowOrdersInfoProcess", "start Process : ShowOrdersInfo");
        mo109103B(activity, MallOrderRecordListUI.class, bundle);
        return this;
    }

    /* renamed from: c */
    public void mo91257c(Activity activity, int i) {
        mo96262m(activity);
    }

    /* renamed from: e */
    public String mo91258e() {
        return "ShowOrdersInfoProcess";
    }

    /* renamed from: f */
    public void mo91259f(Activity activity, Bundle bundle) {
        mo109109g(activity);
    }

    /* renamed from: o */
    public void mo91264o(Activity activity, int i, Bundle bundle) {
        Class<MallOrderTransactionInfoUI> cls = MallOrderTransactionInfoUI.class;
        if (activity instanceof MallOrderRecordListUI) {
            mo109103B(activity, cls, bundle);
        } else if (activity instanceof MallOrderDetailInfoUI) {
            int i2 = bundle.getInt("key_enter_id");
            if (i2 == 0) {
                mo109103B(activity, MallOrderProductListUI.class, bundle);
            } else if (i2 == 1) {
                mo109103B(activity, cls, bundle);
            }
        } else if ((activity instanceof MallOrderProductListUI) || (activity instanceof MallOrderTransactionInfoUI)) {
            mo96262m(activity);
        }
    }

    /* renamed from: t */
    public boolean mo91267t(Activity activity, Bundle bundle) {
        return false;
    }
}

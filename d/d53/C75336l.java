package d53;

import com.tencent.p014mm.plugin.wallet_core.model.Authen;
import com.tencent.p014mm.plugin.wallet_core.model.Orders;

/* renamed from: d53.l */
public class C75336l extends C75326b {
    public C75336l(Authen authen, Orders orders, boolean z) {
        super(authen, orders, z);
    }

    public int getFuncId() {
        return 2862;
    }

    public String getUri() {
        return "/cgi-bin/mmpay-bin/tenpay/tax_authen";
    }
}

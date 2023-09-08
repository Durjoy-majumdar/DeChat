package d53;

import com.tencent.p014mm.plugin.wallet_core.model.Authen;
import com.tencent.p014mm.plugin.wallet_core.model.Orders;

/* renamed from: d53.e */
public class C75329e extends C75326b {
    public C75329e(Authen authen, Orders orders, boolean z) {
        super(authen, orders, z);
    }

    public int getFuncId() {
        return 1536;
    }

    public String getUri() {
        return "/cgi-bin/mmpay-bin/tenpay/sns_ff_authen";
    }
}

package d53;

import com.tencent.p014mm.plugin.wallet_core.model.Authen;
import com.tencent.p014mm.plugin.wallet_core.model.Orders;

/* renamed from: d53.g */
public class C75331g extends C75326b {
    public C75331g(Authen authen, Orders orders, boolean z) {
        super(authen, orders, z);
    }

    public int getFuncId() {
        return 1552;
    }

    public String getUri() {
        return "/cgi-bin/mmpay-bin/tenpay/ts_authen";
    }
}

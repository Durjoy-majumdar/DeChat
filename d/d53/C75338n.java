package d53;

import com.tencent.p014mm.plugin.wallet_core.model.Authen;
import com.tencent.p014mm.plugin.wallet_core.model.Orders;

/* renamed from: d53.n */
public class C75338n extends C75326b {
    public C75338n(Authen authen, Orders orders, boolean z) {
        super(authen, orders, z);
    }

    public int getFuncId() {
        return 2814;
    }

    public String getUri() {
        return "/cgi-bin/mmpay-bin/tenpay/uniauthen";
    }
}

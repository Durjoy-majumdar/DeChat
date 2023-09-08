package d53;

import com.tencent.p014mm.plugin.wallet_core.model.Authen;
import com.tencent.p014mm.plugin.wallet_core.model.Orders;

/* renamed from: d53.j */
public class C75334j extends C75326b {
    public C75334j(Authen authen, Orders orders, boolean z) {
        super(authen, orders, z);
    }

    public int getFuncId() {
        return 1664;
    }

    public String getUri() {
        return "/cgi-bin/mmpay-bin/tenpay/sns_authen";
    }
}

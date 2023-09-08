package d53;

import com.tencent.p014mm.plugin.wallet_core.model.Authen;
import com.tencent.p014mm.plugin.wallet_core.model.Orders;

/* renamed from: d53.a */
public class C75325a extends C75326b {
    public C75325a(Authen authen, Orders orders, boolean z) {
        super(authen, orders, z);
    }

    public int getFuncId() {
        return 1527;
    }

    public String getUri() {
        return "/cgi-bin/mmpay-bin/tenpay/sns_aa_authen";
    }
}

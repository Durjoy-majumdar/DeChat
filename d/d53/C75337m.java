package d53;

import com.tencent.p014mm.plugin.wallet_core.model.Authen;
import com.tencent.p014mm.plugin.wallet_core.model.Orders;

/* renamed from: d53.m */
public class C75337m extends C75326b {
    public C75337m(Authen authen, Orders orders, boolean z) {
        super(authen, orders, z);
    }

    public int getFuncId() {
        return 1659;
    }

    public String getUri() {
        return "/cgi-bin/mmpay-bin/tenpay/sns_tf_authen";
    }
}

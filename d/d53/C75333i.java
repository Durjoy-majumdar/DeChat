package d53;

import com.tencent.p014mm.plugin.wallet_core.model.Authen;
import com.tencent.p014mm.plugin.wallet_core.model.Orders;

/* renamed from: d53.i */
public class C75333i extends C75326b {
    public C75333i(Authen authen, Orders orders, boolean z) {
        super(authen, orders, z);
    }

    public int getFuncId() {
        return 2740;
    }

    public String getUri() {
        return "/cgi-bin/mmpay-bin/seb_ff_authen";
    }
}

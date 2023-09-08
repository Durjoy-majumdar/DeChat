package d53;

import com.tencent.p014mm.plugin.wallet_core.model.Authen;
import com.tencent.p014mm.plugin.wallet_core.model.Orders;

/* renamed from: d53.h */
public class C75332h extends C75326b {
    public C75332h(Authen authen, Orders orders, boolean z) {
        super(authen, orders, z);
    }

    public int getFuncId() {
        return 1972;
    }

    public String getUri() {
        return "/cgi-bin/mmpay-bin/tenpay/offlinepayauthen";
    }

    public boolean isBlock() {
        Authen authen = this.f221493C;
        return authen == null || authen.f209382v.f212580K == 1;
    }
}

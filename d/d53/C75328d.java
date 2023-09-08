package d53;

import com.tencent.nativecrash.NativeCrash;
import com.tencent.p014mm.plugin.wallet_core.model.Authen;
import com.tencent.p014mm.plugin.wallet_core.model.Orders;

/* renamed from: d53.d */
public class C75328d extends C75326b {
    public C75328d(Authen authen, Orders orders, boolean z) {
        super(authen, orders, z);
    }

    public int getFuncId() {
        return NativeCrash.DEFAULT_SHORT_FLAGS;
    }

    public String getUri() {
        return "/cgi-bin/mmpay-bin/tenpay/dc_authen";
    }
}

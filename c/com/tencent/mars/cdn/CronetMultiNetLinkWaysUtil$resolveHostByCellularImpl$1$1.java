package com.tencent.mars.cdn;

import android.net.Network;
import com.tencent.p014mm.sdk.platformtools.Log;
import fy3.C32224a;
import gy3.C8479f0;
import gy3.C87412m;
import gy3.C87413o;
import java.net.InetAddress;
import kotlin.Metadata;
import rx3.C13598b0;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, mo182094d2 = {"Lrx3/b0;", "invoke", "()V", "<anonymous>"}, mo182095k = 3, mo182096mv = {1, 7, 1})
public final class CronetMultiNetLinkWaysUtil$resolveHostByCellularImpl$1$1 extends C87413o implements C32224a<C13598b0> {
    public final /* synthetic */ Object $dnsTimer;
    public final /* synthetic */ String $host;
    public final /* synthetic */ C8479f0<String> $ip;
    public final /* synthetic */ CronetMultiNetLinkWaysUtil this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CronetMultiNetLinkWaysUtil$resolveHostByCellularImpl$1$1(CronetMultiNetLinkWaysUtil cronetMultiNetLinkWaysUtil, String str, C8479f0<String> f0Var, Object obj) {
        super(0);
        this.this$0 = cronetMultiNetLinkWaysUtil;
        this.$host = str;
        this.$ip = f0Var;
        this.$dnsTimer = obj;
    }

    public final void invoke() {
        try {
            Network access$getMMobileNetwork$p = this.this$0.mMobileNetwork;
            C87412m.m108591d(access$getMMobileNetwork$p);
            InetAddress byName = access$getMMobileNetwork$p.getByName(this.$host);
            if (!(byName == null || byName.getHostAddress() == null)) {
                C8479f0<String> f0Var = this.$ip;
                T hostAddress = byName.getHostAddress();
                C87412m.m108591d(hostAddress);
                f0Var.f27484d = hostAddress;
            }
        } catch (Exception e) {
            Log.m105920e("CronetMultiNetLinkWaysUtil.cronet", "mMobileNetwork!!.getByName error msg:" + e.getMessage());
        }
        Object obj = this.$dnsTimer;
        synchronized (obj) {
            obj.notifyAll();
            C13598b0 b0Var = C13598b0.f38549a;
        }
    }
}

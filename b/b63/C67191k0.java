package b63;

import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandlerThread;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.wallet_core.p137ui.C75228t;
import java.util.Map;

/* renamed from: b63.k0 */
public class C67191k0 implements C75228t.C45126l {

    /* renamed from: a */
    public final /* synthetic */ long f192908a;

    /* renamed from: b */
    public final /* synthetic */ long f192909b;

    /* renamed from: c */
    public final /* synthetic */ int f192910c;

    /* renamed from: d */
    public final /* synthetic */ int f192911d;

    /* renamed from: e */
    public final /* synthetic */ Map f192912e;

    public C67191k0(C67192l0 l0Var, long j, long j2, int i, int i2, Map map) {
        this.f192908a = j;
        this.f192909b = j2;
        this.f192910c = i;
        this.f192911d = i2;
        this.f192912e = map;
    }

    /* renamed from: a */
    public void mo70511a(Map<String, Object> map) {
        if (map != null) {
            long nullAs = Util.nullAs((Long) map.get("wallet_balance_version"), -1);
            long nullAs2 = Util.nullAs((Long) map.get("wallet_balance_last_update_time"), -1);
            if (nullAs2 < 0 || nullAs < 0 || nullAs2 + this.f192908a > Util.currentTicks() || this.f192909b >= nullAs) {
                C75228t.m90238c(new C75228t.C75239o("wallet_balance_version", Long.valueOf(this.f192909b)), new C75228t.C75239o("wallet_balance_last_update_time", Long.valueOf(Util.currentTicks())), new C75228t.C75239o("wallet_balance", Double.valueOf(((double) this.f192910c) / 100.0d)));
                MMHandlerThread.postToMainThread(new C67190j0(this.f192911d, this.f192912e, (Object[]) null));
                return;
            }
            Log.m105928w("MicroMsg.WalletPushNotifyManager", "hy: new balance comes but last msg is not timeout and balance version is smaller than before");
        }
    }
}

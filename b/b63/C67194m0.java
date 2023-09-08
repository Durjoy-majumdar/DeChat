package b63;

import com.tencent.p014mm.plugin.wallet_core.model.Bankcard;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.wallet_core.p137ui.C75228t;
import java.util.Map;

/* renamed from: b63.m0 */
public class C67194m0 implements C75228t.C45126l {

    /* renamed from: a */
    public final /* synthetic */ long f192919a;

    /* renamed from: b */
    public final /* synthetic */ long f192920b;

    /* renamed from: c */
    public final /* synthetic */ long f192921c;

    /* renamed from: d */
    public final /* synthetic */ Bankcard f192922d;

    public C67194m0(long j, long j2, long j3, Bankcard bankcard) {
        this.f192919a = j;
        this.f192920b = j2;
        this.f192921c = j3;
        this.f192922d = bankcard;
    }

    /* renamed from: a */
    public void mo70511a(Map<String, Object> map) {
        if (map != null) {
            long nullAs = Util.nullAs((Long) map.get("wallet_balance_version"), -1);
            long nullAs2 = Util.nullAs((Long) map.get("wallet_balance_last_update_time"), -1);
            if (nullAs2 < 0 || nullAs < 0 || nullAs2 + this.f192919a > Util.currentTicks() || this.f192920b >= nullAs) {
                C75228t.m90238c(new C75228t.C75239o("wallet_balance_version", Long.valueOf(this.f192920b)), new C75228t.C75239o("wallet_balance_last_update_time", Long.valueOf(Util.currentTicks())), new C75228t.C75239o("wallet_balance", Double.valueOf(((double) this.f192921c) / 100.0d)));
                this.f192922d.f209415j2 = ((double) this.f192921c) / 100.0d;
                return;
            }
            Log.m105928w("MicroMsg.WalletQueryBankcardParser", "hy: new balance comes but last msg is not timeout and balance version is smaller than before");
        }
    }
}

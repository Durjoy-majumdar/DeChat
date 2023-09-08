package com.tencent.p014mm.plugin.wallet.balance.model.lqt;

import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.vfs.C86013q1;

/* renamed from: com.tencent.mm.plugin.wallet.balance.model.lqt.x */
public class C30544x implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ byte[] f82287d;

    /* renamed from: e */
    public final /* synthetic */ boolean f82288e;

    /* renamed from: f */
    public final /* synthetic */ C71654w f82289f;

    public C30544x(C71654w wVar, byte[] bArr, boolean z) {
        this.f82289f = wVar;
        this.f82287d = bArr;
        this.f82288e = z;
    }

    public void run() {
        if (this.f82287d != null) {
            this.f82289f.f207668g.lock();
            if (this.f82288e) {
                String str = C71654w.f207660r;
                if (C86013q1.m106450k(str)) {
                    C86013q1.m106446g(str, true);
                }
                C86013q1.m106461v(str);
                this.f82289f.f207666e = null;
            } else {
                String str2 = C71654w.f207661s;
                if (C86013q1.m106450k(str2)) {
                    C86013q1.m106446g(str2, true);
                }
                C86013q1.m106461v(str2);
                this.f82289f.f207667f = null;
            }
            this.f82289f.f207668g.unlock();
            try {
                String str3 = System.currentTimeMillis() + "";
                Object[] objArr = new Object[3];
                boolean z = this.f82288e;
                objArr[0] = z ? C71654w.f207660r : C71654w.f207661s;
                objArr[1] = str3;
                objArr[2] = Boolean.valueOf(z);
                Log.m105925i("MicroMsg.LqtBindQueryInfoCache", "saveCacheToDisk, dir: %s, name: %s, save: %s", objArr);
                long currentTicks = Util.currentTicks();
                StringBuilder sb = new StringBuilder();
                sb.append(this.f82288e ? C71654w.f207660r : C71654w.f207661s);
                sb.append(str3);
                C86013q1.m106437S(sb.toString(), this.f82287d);
                Log.m105925i("MicroMsg.LqtBindQueryInfoCache", "finish saveCacheToDisk, used %sms", Long.valueOf(Util.ticksToNow(currentTicks)));
            } catch (Exception e) {
                Log.printErrStackTrace("MicroMsg.LqtBindQueryInfoCache", e, "saveCacheToDisk error: %s", e.getMessage());
            }
        }
    }
}

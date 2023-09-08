package g93;

import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.NetStatusUtil;

/* renamed from: g93.c */
public class C45902c {

    /* renamed from: a */
    public int f123866a = 0;

    /* renamed from: b */
    public int f123867b = 0;

    /* renamed from: c */
    public int f123868c = 0;

    /* renamed from: d */
    public long f123869d;

    /* renamed from: e */
    public long f123870e;

    /* renamed from: f */
    public int f123871f = 0;

    /* renamed from: a */
    public void mo71329a() {
        long j = this.f123870e - this.f123869d;
        String str = NetStatusUtil.isWifi(MMApplicationContext.getContext()) ? "wifi" : NetStatusUtil.is5G(MMApplicationContext.getContext()) ? "5g" : NetStatusUtil.is4G(MMApplicationContext.getContext()) ? "4g" : NetStatusUtil.is3G(MMApplicationContext.getContext()) ? "3g" : NetStatusUtil.is2G(MMApplicationContext.getContext()) ? "2g" : "none";
        Log.m105919d("MicroMsg.Preload.Kv15871", "scene:%d, requestCount:%d, responseContentUpdateCount:%d, responseContentNotUpdateCount:%d, costTime:%d responseContentTotalSize:%d, netWorkType:%s", 0, Integer.valueOf(this.f123866a), Integer.valueOf(this.f123867b), Integer.valueOf(this.f123868c), Long.valueOf(j), Integer.valueOf(this.f123871f), str);
        C115669n.INSTANCE.mo160131h(15871, 0, Integer.valueOf(this.f123866a), Integer.valueOf(this.f123867b), Integer.valueOf(this.f123868c), Long.valueOf(j), Integer.valueOf(this.f123871f), str);
    }
}

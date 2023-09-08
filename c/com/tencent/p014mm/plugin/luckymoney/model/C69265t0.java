package com.tencent.p014mm.plugin.luckymoney.model;

import com.tencent.mars.cdn.CdnLogic;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.vfs.C86013q1;

/* renamed from: com.tencent.mm.plugin.luckymoney.model.t0 */
public class C69265t0 implements CdnLogic.DownloadCallback {

    /* renamed from: d */
    public final /* synthetic */ long f199332d;

    /* renamed from: e */
    public final /* synthetic */ String f199333e;

    /* renamed from: f */
    public final /* synthetic */ String f199334f;

    /* renamed from: g */
    public final /* synthetic */ String f199335g;

    public C69265t0(long j, String str, String str2, String str3) {
        this.f199332d = j;
        this.f199333e = str;
        this.f199334f = str2;
        this.f199335g = str3;
    }

    public void onC2CDownloadCompleted(String str, CdnLogic.C2CDownloadResult c2CDownloadResult) {
        CdnLogic.CronetTaskResult cronetTaskResult;
        Log.m105925i("MicroMsg.LuckyMoneyEnvelopeResUpdateListener", "pag resource download end , cost：%s", Long.valueOf(Util.nowMilliSecond() - this.f199332d));
        if (!(c2CDownloadResult == null || (cronetTaskResult = c2CDownloadResult.cronetTaskResult) == null || cronetTaskResult.performance == null)) {
            Log.m105925i("MicroMsg.LuckyMoneyEnvelopeResUpdateListener", "pag resource download end, fileId:%s, statusCode:%d, profile:%s", this.f199333e, Integer.valueOf(cronetTaskResult.statusCode), c2CDownloadResult.cronetTaskResult.performance);
        }
        String str2 = this.f199334f;
        Log.m105925i("MicroMsg.LuckyMoneyEnvelopeResUpdateListener", "pag resource download result.errorCode ：%s， tempFilePath ：%s , md5：%s , file downaload md5:%s ", Integer.valueOf(c2CDownloadResult.errorCode), str2, this.f199335g, C86013q1.m106456q(str2));
        int i = c2CDownloadResult.errorCode;
        if (i != 0) {
            Log.m105925i("MicroMsg.LuckyMoneyEnvelopeResUpdateListener", "pag resource download failed:%s", Integer.valueOf(i));
            C115669n.INSTANCE.mo175911u(991, 28);
        } else if (!C86013q1.m106450k(this.f199334f)) {
            Log.m105925i("MicroMsg.LuckyMoneyEnvelopeResUpdateListener", "pag resource download File fail:%s", this.f199334f);
            C115669n.INSTANCE.mo175911u(991, 28);
        } else if (C69218g1.m81560g(this.f199334f, C69218g1.m81558e())) {
            C115669n.INSTANCE.mo175911u(991, 29);
        } else {
            C115669n.INSTANCE.mo175911u(991, 30);
        }
    }

    public void onDownloadProgressChanged(String str, long j, long j2, boolean z) {
    }
}

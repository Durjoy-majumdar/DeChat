package com.tencent.p014mm.plugin.brandservice.p028ui.timeline.preload;

import com.tencent.p014mm.plugin.appbrand.video.player.thumb.C18054e;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.thumbplayer.api.proxy.ITPPreloadProxy;

/* renamed from: com.tencent.mm.plugin.brandservice.ui.timeline.preload.n */
public final class C85113n implements ITPPreloadProxy.IPreloadListener {

    /* renamed from: a */
    public final /* synthetic */ String f247993a;

    /* renamed from: b */
    public final /* synthetic */ String f247994b;

    /* renamed from: c */
    public final /* synthetic */ long f247995c;

    public C85113n(String str, String str2, long j) {
        this.f247993a = str;
        this.f247994b = str2;
        this.f247995c = j;
    }

    public void onPrepareDownloadProgressUpdate(int i, int i2, long j, long j2) {
        Log.m105924i("MicroMsg.BizVideoPreloadLogic", "preloadTTPlayer  onPrepareDownloadProgressUpdate   fileId:" + this.f247993a + "   playableDurationMS:" + i + "  currentDownloadSizeByte：" + j + "   totalFileSizeByte:" + j2);
        C18054e.f49894a.mo22567e(this.f247994b, j);
    }

    public void onPrepareError() {
        Log.m105920e("MicroMsg.BizVideoPreloadLogic", "preloadTTPlayer  onPrepareError  fileId:" + this.f247993a);
        C18054e.f49894a.mo22567e(this.f247994b, 0);
        C115669n.INSTANCE.idkeyStat(1379, 53, 1, false);
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x0035 A[Catch:{ Exception -> 0x0055 }] */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x0034 A[Catch:{ Exception -> 0x0055 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onPrepareSuccess() {
        /*
            r12 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "preloadTTPlayer  onPrepareSuccess  fileId:"
            r0.append(r1)
            java.lang.String r1 = r12.f247993a
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "MicroMsg.BizVideoPreloadLogic"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r0)
            com.tencent.mm.plugin.appbrand.video.player.thumb.e r0 = com.tencent.p014mm.plugin.appbrand.video.player.thumb.C18054e.f49894a
            java.lang.String r1 = r12.f247994b
            long r2 = r12.f247995c
            r0.mo22567e(r1, r2)
            java.lang.String r1 = r12.f247993a
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L_0x0031
            boolean r4 = z04.C112551y.m153811k(r1)     // Catch:{ Exception -> 0x0055 }
            if (r4 == 0) goto L_0x002f
            goto L_0x0031
        L_0x002f:
            r4 = 0
            goto L_0x0032
        L_0x0031:
            r4 = 1
        L_0x0032:
            if (r4 == 0) goto L_0x0035
            goto L_0x005f
        L_0x0035:
            com.tencent.mm.sdk.platformtools.MMKVSlotManager r0 = r0.mo22565c()     // Catch:{ Exception -> 0x0055 }
            java.lang.Object r0 = r0.getSlotForWrite()     // Catch:{ Exception -> 0x0055 }
            com.tencent.mm.sdk.platformtools.MultiProcessMMKV r0 = (com.tencent.p014mm.sdk.platformtools.MultiProcessMMKV) r0     // Catch:{ Exception -> 0x0055 }
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0055 }
            r4.<init>()     // Catch:{ Exception -> 0x0055 }
            java.lang.String r5 = "su"
            r4.append(r5)     // Catch:{ Exception -> 0x0055 }
            r4.append(r1)     // Catch:{ Exception -> 0x0055 }
            java.lang.String r1 = r4.toString()     // Catch:{ Exception -> 0x0055 }
            r0.encode((java.lang.String) r1, (boolean) r2)     // Catch:{ Exception -> 0x0055 }
            goto L_0x005f
        L_0x0055:
            r0 = move-exception
            java.lang.Object[] r1 = new java.lang.Object[r3]
            java.lang.String r2 = "MicroMsg.AppBrand.ThumbPlayerInitLogic"
            java.lang.String r3 = ""
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r2, r0, r3, r1)
        L_0x005f:
            com.tencent.mm.plugin.report.service.n r4 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            r5 = 1379(0x563, double:6.813E-321)
            r7 = 52
            r9 = 1
            r11 = 0
            r4.idkeyStat(r5, r7, r9, r11)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.brandservice.p028ui.timeline.preload.C85113n.onPrepareSuccess():void");
    }
}

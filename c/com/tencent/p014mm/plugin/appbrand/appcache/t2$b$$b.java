package com.tencent.p014mm.plugin.appbrand.appcache;

import com.tencent.mars.cdn.CdnLogic;
import com.tencent.mars.cdn.CronetLogic;
import com.tencent.p014mm.modelstat.C29048w;
import com.tencent.p014mm.plugin.appbrand.appcache.C81355t2;
import com.tencent.p014mm.pluginsdk.res.downloader.model.C85631f;
import com.tencent.p014mm.pluginsdk.res.downloader.model.C85639p;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MTimerHandler;
import com.tencent.p014mm.sdk.platformtools.Util;
import eb0.C31519v2;
import java.util.Locale;
import java.util.concurrent.CountDownLatch;
import javax.net.ssl.SSLException;
import js0.C9514m;
import qd3.C89599a;

/* renamed from: com.tencent.mm.plugin.appbrand.appcache.t2$b$$b */
public class t2$b$$b implements CronetLogic.CronetTaskCallback {

    /* renamed from: a */
    public final /* synthetic */ MTimerHandler f238849a;

    /* renamed from: b */
    public final /* synthetic */ C9514m f238850b;

    /* renamed from: c */
    public final /* synthetic */ CountDownLatch f238851c;

    /* renamed from: d */
    public final /* synthetic */ C81355t2.C81360e f238852d;

    /* renamed from: e */
    public final /* synthetic */ String f238853e;

    /* renamed from: f */
    public final /* synthetic */ C81355t2.C81357b f238854f;

    public t2$b$$b(C81355t2.C81357b bVar, MTimerHandler mTimerHandler, C9514m mVar, CountDownLatch countDownLatch, C81355t2.C81360e eVar, String str) {
        this.f238854f = bVar;
        this.f238849a = mTimerHandler;
        this.f238850b = mVar;
        this.f238851c = countDownLatch;
        this.f238852d = eVar;
        this.f238853e = str;
    }

    public void onCronetReceiveChunkedData(CronetLogic.ChunkedData chunkedData, long j) {
    }

    public int onCronetReceiveHeader(CronetLogic.ResponseHeader responseHeader, int i, String str) {
        String str2;
        Object[] objArr = new Object[4];
        objArr[0] = this.f238853e;
        if (responseHeader == null || responseHeader.headers == null) {
            str2 = "(null)";
        } else {
            StringBuilder sb = new StringBuilder();
            sb.append("(");
            for (CronetLogic.HeaderMap headerMap : responseHeader.headers) {
                sb.append(Util.nullAsNil(headerMap.key));
                sb.append(": ");
                sb.append(Util.nullAsNil(headerMap.value));
                sb.append(" & ");
            }
            sb.append(")");
            str2 = sb.toString();
        }
        objArr[1] = str2;
        objArr[2] = Integer.valueOf(i);
        objArr[3] = str;
        Log.m105925i("MicroMsg.AppBrand.CronetHttpsDownloadPerformer", "onCronetReceiveHeader urlKey:%s, headers:%s, status_code:%d, protocol:%s", objArr);
        return 0;
    }

    public void onCronetReceiveUploadProgress(long j, long j2) {
    }

    public void onCronetTaskCompleted(String str, CronetLogic.CronetTaskResult cronetTaskResult, String str2) {
        T t;
        CronetLogic.CronetTaskResult cronetTaskResult2 = cronetTaskResult;
        if (cronetTaskResult2 != null) {
            boolean z = cronetTaskResult2.errorCode == 0 && 200 == cronetTaskResult2.statusCode;
            Log.m105925i("MicroMsg.AppBrand.CronetHttpsDownloadPerformer", "onCronetTaskCompleted, succeed:%b, errorCode:%d, statusCode:%d, urlKey:%s", Boolean.valueOf(z), Integer.valueOf(cronetTaskResult2.errorCode), Integer.valueOf(cronetTaskResult2.statusCode), this.f238853e);
            if (z) {
                this.f238852d.getClass();
                String f = this.f238852d.mo119192f();
                C81355t2.C81360e eVar = this.f238852d;
                t = new C85639p("AppBrandWxaPkgDownloader", f, eVar.f238838i, eVar.mo119191e(), -1, (String) null, 2, (Exception) null);
            } else {
                long j = cronetTaskResult2.totalWriteByte;
                t = (j <= 0 || this.f238852d.mo113637b(j)) ? new C85639p((C85631f) this.f238852d, (Exception) new SSLException(String.format(Locale.US, "CdnHttpsDownloadFailed$%s$%d", new Object[]{this.f238852d.mo119192f(), Integer.valueOf(cronetTaskResult2.errorCode)})), cronetTaskResult2.statusCode, 3) : new C85639p((C85631f) this.f238852d, (Exception) new C89599a(), cronetTaskResult2.statusCode, 3);
            }
            long j2 = cronetTaskResult2.totalReceiveByte;
            if ((j2 > 0 || cronetTaskResult2.totalSendByte > 0) && C31519v2.f84271a != null) {
                ((C29048w.C29055f) C31519v2.f84271a).mo56422a(Math.max(0, (int) j2), Math.max(0, (int) cronetTaskResult2.totalSendByte), 0);
            }
            this.f238854f.getClass();
            t.f249601j.putBoolean("RESPONSE_KEY_USE_NEWDNS", cronetTaskResult2.useNewdns);
            t.f249601j.putBoolean("RESPONSE_KEY_USE_QUIC", cronetTaskResult2.useQuic);
            t.f249601j.putBoolean("RESPONSE_KEY_USE_HTTP2", cronetTaskResult2.useHttp2);
            t.f249601j.putBoolean("RESPONSE_KEY_USE_PLAIN_CRONET_LOGIC", true);
            CronetLogic.WebPageProfile webPageProfile = cronetTaskResult2.webPageProfile;
            if (webPageProfile != null) {
                CdnLogic.WebPageProfile webPageProfile2 = new CdnLogic.WebPageProfile();
                webPageProfile2.redirectStart = webPageProfile.redirectStart;
                webPageProfile2.redirectEnd = webPageProfile.redirectEnd;
                webPageProfile2.fetchStart = webPageProfile.fetchStart;
                webPageProfile2.domainLookUpStart = webPageProfile.domainLookUpStart;
                webPageProfile2.domainLookUpEnd = webPageProfile.domainLookUpEnd;
                webPageProfile2.connectStart = webPageProfile.connectStart;
                webPageProfile2.connectEnd = webPageProfile.connectEnd;
                webPageProfile2.SSLconnectionStart = webPageProfile.SSLconnectionStart;
                webPageProfile2.SSLconnectionEnd = webPageProfile.SSLconnectionEnd;
                webPageProfile2.requestStart = webPageProfile.requestStart;
                webPageProfile2.requestEnd = webPageProfile.requestEnd;
                webPageProfile2.responseStart = webPageProfile.responseStart;
                webPageProfile2.responseEnd = webPageProfile.responseEnd;
                webPageProfile2.protocol = webPageProfile.protocol;
                webPageProfile2.rtt = webPageProfile.rtt;
                webPageProfile2.statusCode = webPageProfile.statusCode;
                webPageProfile2.networkTypeEstimate = webPageProfile.networkTypeEstimate;
                webPageProfile2.httpRttEstimate = webPageProfile.httpRttEstimate;
                webPageProfile2.transportRttEstimate = webPageProfile.transportRttEstimate;
                webPageProfile2.downstreamThroughputKbpsEstimate = webPageProfile.downstreamThroughputKbpsEstimate;
                webPageProfile2.throughputKbps = webPageProfile.throughputKbps;
                webPageProfile2.peerIP = webPageProfile.peerIP;
                webPageProfile2.port = webPageProfile.port;
                webPageProfile2.socketReused = webPageProfile.socketReused;
                webPageProfile2.sendBytesCount = webPageProfile.sendBytesCount;
                webPageProfile2.receivedBytedCount = webPageProfile.receivedBytedCount;
                t.f249601j.putParcelable("RESPONSE_KEY_CRONET_PERFORMANCE", webPageProfile2);
                Log.m105925i("MicroMsg.AppBrand.CronetHttpsDownloadPerformer", "fill cronet performance profile, urlKey:%s, resp.status:%d, url:%s, performance:%s", t.f249592a, Integer.valueOf(t.f249598g), t.f249593b, webPageProfile2);
            }
            MTimerHandler mTimerHandler = this.f238849a;
            if (mTimerHandler != null) {
                mTimerHandler.stopTimer();
            }
            this.f238850b.f29691a = t;
            this.f238851c.countDown();
            return;
        }
        Log.m105921e("MicroMsg.AppBrand.CronetHttpsDownloadPerformer", "onCronetTaskCompleted get null result with urlKey:%s", this.f238853e);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x003f, code lost:
        r0 = com.tencent.p014mm.plugin.appbrand.appcache.C81293m3.m99678d();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onDownloadProgressChanged(java.lang.String r11, com.tencent.mars.cdn.CronetLogic.CronetDownloadProgress r12) {
        /*
            r10 = this;
            com.tencent.mm.plugin.appbrand.appcache.t2$e r11 = r10.f238852d
            com.tencent.mm.pluginsdk.res.downloader.model.d r11 = r11.f249607g
            com.tencent.mm.plugin.appbrand.appcache.t2$f r11 = (com.tencent.p014mm.plugin.appbrand.appcache.C81355t2.C81362f) r11
            if (r11 == 0) goto L_0x006f
            long r0 = r12.currentWriteByte
            long r2 = r12.totalByte
            long r6 = java.lang.Math.min(r0, r2)
            long r8 = r12.totalByte
            float r11 = (float) r6
            float r12 = (float) r8
            float r11 = r11 / r12
            r12 = 1120403456(0x42c80000, float:100.0)
            float r11 = r11 * r12
            int r5 = java.lang.Math.round(r11)
            com.tencent.mm.plugin.appbrand.appcache.t2$e r11 = r10.f238852d
            java.lang.String r11 = r11.mo119192f()
            com.tencent.mm.plugin.appbrand.appcache.WxaPkgLoadProgress r12 = new com.tencent.mm.plugin.appbrand.appcache.WxaPkgLoadProgress
            r4 = r12
            r4.<init>(r5, r6, r8)
            r0 = 2
            java.lang.Object[] r0 = new java.lang.Object[r0]
            r1 = 0
            r0[r1] = r11
            r2 = 1
            r0[r2] = r12
            java.lang.String r3 = "MicroMsg.WxaPkgUpdater"
            java.lang.String r4 = "hy: urlkey: %s, onProgressUpdate %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r3, r4, r0)
            boolean r0 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r11)
            if (r0 != 0) goto L_0x004d
            com.tencent.mm.plugin.appbrand.appcache.m3 r0 = com.tencent.p014mm.plugin.appbrand.appcache.C81293m3.m99678d()
            if (r0 != 0) goto L_0x0046
            goto L_0x004d
        L_0x0046:
            js0.l<java.lang.String, com.tencent.mm.plugin.appbrand.appcache.m3$$b> r0 = r0.f238705a
            java.util.Set r0 = r0.mo122463d(r11)
            goto L_0x004e
        L_0x004d:
            r0 = 0
        L_0x004e:
            if (r0 == 0) goto L_0x0066
            java.util.Iterator r11 = r0.iterator()
        L_0x0054:
            boolean r0 = r11.hasNext()
            if (r0 == 0) goto L_0x006f
            java.lang.Object r0 = r11.next()
            com.tencent.mm.plugin.appbrand.appcache.m3$$b r0 = (com.tencent.p014mm.plugin.appbrand.appcache.m3$$b) r0
            if (r0 == 0) goto L_0x0054
            r0.mo113494b(r12)
            goto L_0x0054
        L_0x0066:
            java.lang.Object[] r12 = new java.lang.Object[r2]
            r12[r1] = r11
            java.lang.String r11 = "callback progress, null callback urlKey = %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105919d(r3, r11, r12)
        L_0x006f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.appbrand.appcache.t2$b$$b.onDownloadProgressChanged(java.lang.String, com.tencent.mars.cdn.CronetLogic$CronetDownloadProgress):void");
    }
}

package qs0;

import a70.C112760b;
import com.tencent.mars.cdn.CdnLogic;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.vfs.C86009m1;
import com.tencent.p014mm.vfs.C86013q1;
import eb0.C45628s0;
import gy3.C87412m;
import java.util.Arrays;
import java.util.concurrent.ConcurrentHashMap;
import p1081gi.C98121d;
import p1081gi.C98127h;
import rx3.C13598b0;

/* renamed from: qs0.a */
public final class C101241a implements CdnLogic.DownloadCallback, CdnLogic.VideoStreamingCallback, CdnLogic.AppCallback {

    /* renamed from: d */
    public static final C101241a f296445d;

    /* renamed from: e */
    public static final ConcurrentHashMap<String, C98127h> f296446e = new ConcurrentHashMap<>();

    static {
        C101241a aVar = new C101241a();
        f296445d = aVar;
        String i = C86013q1.m106448i(new C86009m1(C112760b.m154195C(), "ThumbVideoCache/CdnDownload/History").mo119971i(), true);
        Log.m105924i("MicroMsg.AppBrandCdnService", "<init>, historyPath: " + i);
        CdnLogic.Initialize(i, aVar, "1", "BFEDFFB5EA28509F9C89ED83FA7FDDA8881435D444E984D53A98AD8E9410F1145EDD537890E10456190B22E6E5006455EFC6C12E41FDA985F38FBBC7213ECB810E3053D4B8D74FFBC70B4600ABD728202322AFCE1406046631261BD5EE3D44721082FEAB74340D73645DC0D02A293B962B9D47E4A64100BD7524DE00D9D3B5C1", "010001", "cdnwx2013usrname", C45628s0.m50756U() ^ true);
    }

    /* renamed from: a */
    public final int mo140713a(String str) {
        C87412m.m108594g(str, "mediaId");
        Log.m105924i("MicroMsg.AppBrandCdnService", "cancelDownloadTask mediaId: " + str);
        int cancelDownloadTaskWithResult = CdnLogic.cancelDownloadTaskWithResult(str, new CdnLogic.C2CDownloadResult());
        Log.m105924i("MicroMsg.AppBrandCdnService", "cancelDownloadTask, cancelDownloadTaskWithResult, result: " + cancelDownloadTaskWithResult);
        f296446e.remove(str);
        return cancelDownloadTaskWithResult;
    }

    public void onBadNetworkProbed() {
        Log.m105918d("MicroMsg.AppBrandCdnService", "onBadNetworkProbed");
    }

    public void onC2CDownloadCompleted(String str, CdnLogic.C2CDownloadResult c2CDownloadResult) {
        C98127h.C98128a aVar;
        C98127h.C98128a aVar2;
        Log.m105918d("MicroMsg.AppBrandCdnService", "onC2CDownloadCompleted, mediaId: " + str + ", result: " + c2CDownloadResult);
        if (c2CDownloadResult != null) {
            C98127h hVar = f296446e.get(str);
            if (hVar != null && (aVar2 = hVar.f287704f1) != null) {
                int i = c2CDownloadResult.errorCode;
                C98121d dVar = new C98121d();
                dVar.field_recvedBytes = c2CDownloadResult.recvedBytes;
                dVar.field_fileLength = c2CDownloadResult.fileSize;
                C13598b0 b0Var = C13598b0.f38549a;
                aVar2.mo17918g(str, i, dVar);
                return;
            }
            return;
        }
        C98127h hVar2 = f296446e.get(str);
        if (hVar2 != null && (aVar = hVar2.f287704f1) != null) {
            aVar.mo17918g(str, -1, (C98121d) null);
        }
    }

    public void onDataAvailable(String str, long j, long j2) {
        C98127h.C98128a aVar;
        Log.m105918d("MicroMsg.AppBrandCdnService", "onDataAvailable, mediaId: " + str + ", offset: " + j + ", length: " + j2);
        C98127h hVar = f296446e.get(str);
        if (hVar != null && (aVar = hVar.f287704f1) != null) {
            aVar.onDataAvailable(str, j, j2);
        }
    }

    public void onDownloadProgressChanged(String str, long j, long j2, boolean z) {
        C98127h.C98128a aVar;
        Log.m105918d("MicroMsg.AppBrandCdnService", "onDownloadProgressChanged, mediaId: " + str + ", offset: " + j + ", total: " + j2 + ", tryShow: " + z);
        C98127h hVar = f296446e.get(str);
        if (hVar != null && (aVar = hVar.f287704f1) != null) {
            aVar.mo17917e(str, j, j2);
        }
    }

    public void onDownloadToEnd(String str, long j, long j2) {
        Log.m105918d("MicroMsg.AppBrandCdnService", "onDownloadToEnd, mediaId: " + str + ", offset: " + j + ", length: " + j2);
    }

    public void onM3U8Ready(String str, String str2) {
        C98127h.C98128a aVar;
        Log.m105918d("MicroMsg.AppBrandCdnService", "onM3U8Ready, mediaId: " + str + ", m3u8: " + str2);
        C98127h hVar = f296446e.get(str);
        if (hVar != null && (aVar = hVar.f287704f1) != null) {
            aVar.onM3U8Ready(str, str2);
        }
    }

    public void onMoovReady(String str, long j, long j2, CdnLogic.VideoInfo videoInfo) {
        C98127h.C98128a aVar;
        StringBuilder sb = new StringBuilder();
        sb.append("onMoovReadyWithFlag, mediaId: ");
        sb.append(str);
        sb.append(", offset: ");
        sb.append(j);
        sb.append(", length: ");
        sb.append(j2);
        sb.append(", svrflag: ");
        sb.append(videoInfo != null ? videoInfo.svrFlag : null);
        Log.m105918d("MicroMsg.AppBrandCdnService", sb.toString());
        C98127h hVar = f296446e.get(str);
        if (hVar != null && (aVar = hVar.f287704f1) != null) {
            aVar.onMoovReady(str, j, j2, videoInfo);
        }
    }

    public void onMoovReadyWithFlag(String str, long j, long j2, String str2) {
    }

    public void onPreloadCompletedWithResult(String str, long j, long j2, CdnLogic.C2CDownloadResult c2CDownloadResult) {
        C98127h.C98128a aVar;
        Log.m105918d("MicroMsg.AppBrandCdnService", "onPreloadCompletedWithResult, mediaId: " + str + ", offset: " + j + ", total: " + j2 + ", result: " + c2CDownloadResult);
        C98127h hVar = f296446e.get(str);
        if (hVar != null && (aVar = hVar.f287704f1) != null) {
            aVar.mo17917e(str, j, j2);
        }
    }

    public void onTaskTearDown(String str, CdnLogic.DownloadTaskProfile downloadTaskProfile, String str2) {
    }

    public void reportFlow(int i, int i2, int i3, int i4) {
        Log.m105918d("MicroMsg.AppBrandCdnService", "reportFlow, wifiRecv: " + i + ", wifiSend: " + i2 + ", mobileRecv: " + i3 + ", mobileSend: " + i4);
    }

    public void reportFlowWithTag(String str, int i, long j, long j2, long j3, long j4) {
    }

    public void requestGetCDN(int i) {
        Log.m105918d("MicroMsg.AppBrandCdnService", "requestGetCDN, reason: " + i);
    }

    public void requestSnsGetCdnDistance(int i, int i2, int i3) {
    }

    public String[] resolveHost(String str, boolean z, int[] iArr) {
        String str2;
        StringBuilder sb = new StringBuilder();
        sb.append("reportFlow, host: ");
        sb.append(str);
        sb.append(", isDcip: ");
        sb.append(z);
        sb.append(", dnsType: ");
        if (iArr != null) {
            str2 = Arrays.toString(iArr);
            C87412m.m108593f(str2, "toString(this)");
        } else {
            str2 = null;
        }
        sb.append(str2);
        Log.m105918d("MicroMsg.AppBrandCdnService", sb.toString());
        return new String[0];
    }
}

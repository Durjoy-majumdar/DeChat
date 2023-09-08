package tu1;

import c13.C79917p;
import com.tencent.mars.cdn.CdnLogic;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import di3.C86312j;
import eb0.C45628s0;
import gy3.C24564k0;
import gy3.C87412m;
import java.util.HashMap;
import p1081gi.C98121d;
import p1081gi.C98127h;
import p592kz.C99274d;

/* renamed from: tu1.c */
public final class C101928c implements CdnLogic.VideoStreamingCallback, CdnLogic.DownloadCallback, CdnLogic.AppCallback {

    /* renamed from: d */
    public final HashMap<String, C98127h> f300102d = new HashMap<>();

    public C101928c() {
        CdnLogic.Initialize(MMApplicationContext.getContext().getFilesDir().toString() + "/NativeCDNInfo", this, "1", "BFEDFFB5EA28509F9C89ED83FA7FDDA8881435D444E984D53A98AD8E9410F1145EDD537890E10456190B22E6E5006455EFC6C12E41FDA985F38FBBC7213ECB810E3053D4B8D74FFBC70B4600ABD728202322AFCE1406046631261BD5EE3D44721082FEAB74340D73645DC0D02A293B962B9D47E4A64100BD7524DE00D9D3B5C1", "010001", "cdnwx2013usrname", !C45628s0.m50756U());
        CdnLogic.setFlowReportParams("ANDROID.MM.CDN.FlutterCdnService", 5242880, 60);
    }

    /* renamed from: a */
    public final int mo141424a(C98127h hVar) {
        C87412m.m108594g(hVar, "task");
        Log.m105918d("MicroMsg.FlutterCdnService", "FlutterCdnService addDownloadTask mediaId:" + hVar.field_mediaId);
        CdnLogic.C2CDownloadRequest c2CDownloadRequest = new CdnLogic.C2CDownloadRequest();
        c2CDownloadRequest.fileKey = hVar.field_mediaId;
        c2CDownloadRequest.url = hVar.f287705p0;
        c2CDownloadRequest.referer = hVar.f287706x0;
        c2CDownloadRequest.setSavePath(hVar.field_fullpath);
        c2CDownloadRequest.fileType = CdnLogic.kMediaTypeAdVideo;
        c2CDownloadRequest.concurrentCount = 10;
        c2CDownloadRequest.preloadRatio = hVar.field_preloadRatio;
        c2CDownloadRequest.preloadMinSize = hVar.f287671r;
        int startHttpVideoStreamingDownload = CdnLogic.startHttpVideoStreamingDownload(c2CDownloadRequest, this, this, hVar.f287689V);
        Log.m105918d("MicroMsg.FlutterCdnService", "FlutterCdnService startHttpVideoStreamingDownload result:" + startHttpVideoStreamingDownload);
        if (startHttpVideoStreamingDownload == 0) {
            HashMap<String, C98127h> hashMap = this.f300102d;
            String str = hVar.field_mediaId;
            C87412m.m108593f(str, "task.field_mediaId");
            hashMap.put(str, hVar);
        }
        return startHttpVideoStreamingDownload;
    }

    /* renamed from: b */
    public final int mo141425b(String str) {
        Log.m105918d("MicroMsg.FlutterCdnService", "FlutterCdnService cancelDownloadTask mediaId:" + str);
        int cancelDownloadTaskWithResult = CdnLogic.cancelDownloadTaskWithResult(str, new CdnLogic.C2CDownloadResult());
        if (cancelDownloadTaskWithResult == 0) {
            C24564k0.m30739c(this.f300102d).remove(str);
        }
        return cancelDownloadTaskWithResult;
    }

    /* renamed from: c */
    public final int mo141426c(String str, long j, long j2, int i) {
        C87412m.m108594g(str, "mediaId");
        Log.m105918d("MicroMsg.FlutterCdnService", "FlutterCdnService requestVideoData mediaId:" + str + " offset:" + j + " length:" + j2);
        return CdnLogic.requestVideoData(str, j, j2, i);
    }

    public void onBadNetworkProbed() {
    }

    public void onC2CDownloadCompleted(String str, CdnLogic.C2CDownloadResult c2CDownloadResult) {
        C98127h.C98128a aVar;
        C98127h.C98128a aVar2;
        Log.m105918d("MicroMsg.FlutterCdnService", "FlutterCdnService onC2CDownloadCompleted mediaId:" + str + " result:" + c2CDownloadResult);
        C98127h hVar = this.f300102d.get(str);
        C98121d dVar = new C98121d();
        if (c2CDownloadResult != null) {
            dVar.field_recvedBytes = c2CDownloadResult.recvedBytes;
            dVar.field_fileLength = c2CDownloadResult.fileSize;
            if (hVar != null && (aVar2 = hVar.f287704f1) != null) {
                aVar2.mo17918g(str, c2CDownloadResult.errorCode, dVar);
            }
        } else if (hVar != null && (aVar = hVar.f287704f1) != null) {
            aVar.mo17918g(str, -1, (C98121d) null);
        }
    }

    public void onDataAvailable(String str, long j, long j2) {
        C98127h.C98128a aVar;
        Log.m105918d("MicroMsg.FlutterCdnService", "FlutterCdnService onDataAvailable mediaId:" + str + " offset:" + j + " length:" + j2);
        C98127h hVar = this.f300102d.get(str);
        if (hVar != null && (aVar = hVar.f287704f1) != null) {
            aVar.onDataAvailable(str, j, j2);
        }
    }

    public void onDownloadProgressChanged(String str, long j, long j2, boolean z) {
        C98127h.C98128a aVar;
        Log.m105918d("MicroMsg.FlutterCdnService", "FlutterCdnService onDownloadProgressChanged mediaId:" + str + " offset:" + j + " total:" + j2);
        C98127h hVar = this.f300102d.get(str);
        if (hVar != null && (aVar = hVar.f287704f1) != null) {
            aVar.mo17917e(str, j, j2);
        }
    }

    public void onDownloadToEnd(String str, long j, long j2) {
        Log.m105918d("MicroMsg.FlutterCdnService", "FlutterCdnService onDownloadToEnd mediaId:" + str + " offset:" + j + " length:" + j2);
    }

    public void onM3U8Ready(String str, String str2) {
        C98127h.C98128a aVar;
        Log.m105918d("MicroMsg.FlutterCdnService", "FlutterCdnService onM3U8Ready mediaId:" + str);
        C98127h hVar = this.f300102d.get(str);
        if (hVar != null && (aVar = hVar.f287704f1) != null) {
            aVar.onM3U8Ready(str, str2);
        }
    }

    public void onMoovReady(String str, long j, long j2, CdnLogic.VideoInfo videoInfo) {
        C98127h.C98128a aVar;
        Log.m105918d("MicroMsg.FlutterCdnService", "FlutterCdnService onMoovReadyWithFlag mediaId:" + str + " offset:" + j + " length:" + j2);
        C98127h hVar = this.f300102d.get(str);
        if (hVar != null && (aVar = hVar.f287704f1) != null) {
            aVar.onMoovReady(str, j, j2, videoInfo);
        }
    }

    public void onMoovReadyWithFlag(String str, long j, long j2, String str2) {
    }

    public void onPreloadCompletedWithResult(String str, long j, long j2, CdnLogic.C2CDownloadResult c2CDownloadResult) {
        C98127h.C98128a aVar;
        Log.m105918d("MicroMsg.FlutterCdnService", "FlutterCdnService onPreloadCompletedWithResult mediaId:" + str + " offset:" + j + " total:" + j2);
        C98127h hVar = this.f300102d.get(str);
        if (hVar != null && (aVar = hVar.f287704f1) != null) {
            aVar.mo17917e(str, j, j2);
        }
    }

    public void onTaskTearDown(String str, CdnLogic.DownloadTaskProfile downloadTaskProfile, String str2) {
    }

    public void reportFlow(int i, int i2, int i3, int i4) {
    }

    public void reportFlowWithTag(String str, int i, long j, long j2, long j3, long j4) {
        ((C79917p.C79918a) ((C99274d) C86312j.m106911c(C99274d.class)).mo110079wT()).mo110081b(str, j2, j, j4, j3);
    }

    public void requestGetCDN(int i) {
    }

    public void requestSnsGetCdnDistance(int i, int i2, int i3) {
    }

    public String[] resolveHost(String str, boolean z, int[] iArr) {
        return new String[0];
    }
}

package gx1;

import com.tencent.mars.cdn.CdnLogic;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MD5Util;
import com.tencent.p014mm.sdk.platformtools.Util;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import p1084mk.C99907a;
import p1084mk.C99908b;

/* renamed from: gx1.g */
public class C98277g implements C99907a {

    /* renamed from: c */
    public static C98277g f288108c;

    /* renamed from: a */
    public final Map<String, C98279b> f288109a = new ConcurrentHashMap();

    /* renamed from: b */
    public final CdnLogic.DownloadCallback f288110b = new C98278a();

    /* renamed from: gx1.g$a */
    public class C98278a implements CdnLogic.DownloadCallback {
        public C98278a() {
        }

        public void onC2CDownloadCompleted(String str, CdnLogic.C2CDownloadResult c2CDownloadResult) {
            int i = c2CDownloadResult.errorCode;
            if (i != 0) {
                C98277g.m127012b(C98277g.this, str, 4, i, "", false);
            } else {
                C98277g.m127012b(C98277g.this, str, 3, i, "", false);
            }
        }

        public void onDownloadProgressChanged(String str, long j, long j2, boolean z) {
            C98277g gVar = C98277g.this;
            gVar.getClass();
            Log.m105919d("PagCdnDownloader", "updateProgressChange, mediaId = %s, recvLen = %d, totalLen= %d, containCallback = %b", str, Long.valueOf(j), Long.valueOf(j2), Boolean.valueOf(((ConcurrentHashMap) gVar.f288109a).containsKey(str)));
            if (((ConcurrentHashMap) gVar.f288109a).containsKey(str)) {
                C99908b bVar = ((C98279b) ((ConcurrentHashMap) gVar.f288109a).get(str)).f288112a;
                if (bVar == null) {
                    Log.m105920e("PagCdnDownloader", "error proxy_callback null");
                } else {
                    bVar.onTaskProgressChanged(str, j, j2);
                }
            }
        }
    }

    /* renamed from: gx1.g$b */
    public static class C98279b {

        /* renamed from: a */
        public C99908b f288112a = null;

        /* renamed from: b */
        public String f288113b = null;
    }

    /* renamed from: b */
    public static void m127012b(C98277g gVar, String str, int i, int i2, String str2, boolean z) {
        gVar.getClass();
        Log.m105925i("PagCdnDownloader", "updateDownloadState, mediaId = %s, state = %d, errCode= %d, errMsg = %s, containCallback = %b", str, Integer.valueOf(i), Integer.valueOf(i2), str2, Boolean.valueOf(((ConcurrentHashMap) gVar.f288109a).containsKey(str)));
        if (((ConcurrentHashMap) gVar.f288109a).containsKey(str)) {
            C99908b bVar = ((C98279b) ((ConcurrentHashMap) gVar.f288109a).get(str)).f288112a;
            if (bVar == null) {
                Log.m105920e("PagCdnDownloader", "error proxy_callback null");
            } else if (i == 3) {
                bVar.onTaskFinished(str, ((C98279b) ((ConcurrentHashMap) gVar.f288109a).get(str)).f288113b, z);
            } else {
                bVar.onTaskFailed(str, i2, z);
            }
        }
    }

    /* renamed from: a */
    public int mo137573a(String str, String str2, int i, C99908b bVar) {
        Log.m105925i("PagCdnDownloader", "addDownloadTask: %s filepath:%s", str, str2);
        String mD5String = MD5Util.getMD5String(str);
        long nowMilliSecond = Util.nowMilliSecond();
        CdnLogic.C2CDownloadRequest c2CDownloadRequest = new CdnLogic.C2CDownloadRequest();
        c2CDownloadRequest.queueTimeoutSeconds = 60;
        c2CDownloadRequest.transforTimeoutSeconds = 60;
        c2CDownloadRequest.taskStartTime = nowMilliSecond;
        c2CDownloadRequest.fileKey = mD5String;
        c2CDownloadRequest.url = str;
        c2CDownloadRequest.setSavePath(str2);
        C98279b bVar2 = new C98279b();
        bVar2.f288112a = bVar;
        bVar2.f288113b = str2;
        ((ConcurrentHashMap) this.f288109a).put(mD5String, bVar2);
        int startHttpsDownload = CdnLogic.startHttpsDownload(c2CDownloadRequest, this.f288110b);
        Log.m105924i("PagCdnDownloader", "addDownloadTask: " + startHttpsDownload);
        return startHttpsDownload;
    }
}

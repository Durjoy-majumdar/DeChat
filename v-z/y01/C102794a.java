package y01;

import com.tencent.mars.cdn.CdnLogic;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.xweb.downloader.IFileDownloaderProxy;
import com.tencent.xweb.downloader.IFileDownloaderProxyCallback;
import java.io.ByteArrayOutputStream;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import p1081gi.C98120c;
import p1081gi.C98121d;
import p1081gi.C98124g;
import s01.C101493b;

/* renamed from: y01.a */
public class C102794a implements IFileDownloaderProxy {

    /* renamed from: c */
    public static C102794a f303486c;

    /* renamed from: a */
    public Map<String, C102796b> f303487a = new ConcurrentHashMap();

    /* renamed from: b */
    public C98124g.C98125a f303488b = new C102795a();

    /* renamed from: y01.a$a */
    public class C102795a implements C98124g.C98125a {
        public C102795a() {
        }

        /* renamed from: g0 */
        public int mo1773g0(String str, int i, C98120c cVar, C98121d dVar, boolean z) {
            String str2 = str;
            int i2 = i;
            C98120c cVar2 = cVar;
            C98121d dVar2 = dVar;
            Object[] objArr = new Object[4];
            objArr[0] = str2;
            objArr[1] = Integer.valueOf(i);
            String str3 = "null";
            objArr[2] = cVar2 == null ? str3 : cVar.toString();
            if (dVar2 != null) {
                str3 = dVar.toString();
            }
            objArr[3] = str3;
            Log.m105919d("XWeb.MM.FileDownloaderXWEBProxy", "cdnCallback, mediaId:%s, startRet:%d, keep_ProgressInfo:%s, keep_SceneResult:%s", objArr);
            if (i2 == -21006) {
                Log.m105925i("XWeb.MM.FileDownloaderXWEBProxy", "duplicate request, ignore this request, mediaId:%s", str2);
                return 0;
            } else if (i2 != 0) {
                Log.m105921e("XWeb.MM.FileDownloaderXWEBProxy", "cdnCallback, start failed:%d, mediaId:%s", Integer.valueOf(i), str2);
                C102794a.m135845a(C102794a.this, str, 4, i, (String) null, false);
                return 0;
            } else if (cVar2 != null) {
                C102794a aVar = C102794a.this;
                long j = cVar2.field_finishedLength;
                long j2 = cVar2.field_toltalLength;
                aVar.getClass();
                Log.m105919d("XWeb.MM.FileDownloaderXWEBProxy", "updateProgressChange, mediaId:%s, recvLen:%d, totalLen:%d, containCallback:%b", str2, Long.valueOf(j), Long.valueOf(j2), Boolean.valueOf(((ConcurrentHashMap) aVar.f303487a).containsKey(str2)));
                if (((ConcurrentHashMap) aVar.f303487a).containsKey(str2)) {
                    IFileDownloaderProxyCallback iFileDownloaderProxyCallback = ((C102796b) ((ConcurrentHashMap) aVar.f303487a).get(str2)).f303490a;
                    if (iFileDownloaderProxyCallback == null) {
                        Log.m105920e("XWeb.MM.FileDownloaderXWEBProxy", "updateProgressChange, proxy_callback is null");
                    } else {
                        iFileDownloaderProxyCallback.onTaskProgressChanged(str, j, j2);
                    }
                }
                return 0;
            } else {
                if (dVar2 != null) {
                    int i3 = dVar2.field_retCode;
                    if (i3 != 0) {
                        Log.m105921e("XWeb.MM.FileDownloaderXWEBProxy", "cdnCallback, download fail, mediaId:%s, retCode:%d, sceneResult:%s", str2, Integer.valueOf(i3), dVar2);
                        C102794a.m135845a(C102794a.this, str, 4, dVar2.field_retCode, (String) null, dVar2.field_isResume);
                    } else {
                        Log.m105925i("XWeb.MM.FileDownloaderXWEBProxy", "cdnCallback, download success, mediaId:%s", str2);
                        C102794a.m135845a(C102794a.this, str, 3, 0, (String) null, dVar2.field_isResume);
                    }
                }
                return 0;
            }
        }

        /* renamed from: h */
        public void mo1774h(String str, ByteArrayOutputStream byteArrayOutputStream) {
        }

        /* renamed from: j */
        public byte[] mo1775j(String str, byte[] bArr) {
            return new byte[0];
        }
    }

    /* renamed from: y01.a$b */
    public class C102796b {

        /* renamed from: a */
        public IFileDownloaderProxyCallback f303490a = null;

        /* renamed from: b */
        public String f303491b = null;

        public C102796b(C102794a aVar, C102795a aVar2) {
        }
    }

    /* renamed from: a */
    public static void m135845a(C102794a aVar, String str, int i, int i2, String str2, boolean z) {
        aVar.getClass();
        Log.m105925i("XWeb.MM.FileDownloaderXWEBProxy", "updateDownloadState, mediaId:%s, state:%d, errCode:%d, errMsg:%s, containCallback:%b", str, Integer.valueOf(i), Integer.valueOf(i2), str2, Boolean.valueOf(((ConcurrentHashMap) aVar.f303487a).containsKey(str)));
        if (((ConcurrentHashMap) aVar.f303487a).containsKey(str)) {
            IFileDownloaderProxyCallback iFileDownloaderProxyCallback = ((C102796b) ((ConcurrentHashMap) aVar.f303487a).get(str)).f303490a;
            if (iFileDownloaderProxyCallback == null) {
                Log.m105920e("XWeb.MM.FileDownloaderXWEBProxy", "updateDownloadState, proxy_callback is null");
            } else if (i == 3) {
                iFileDownloaderProxyCallback.onTaskFinished(str, ((C102796b) ((ConcurrentHashMap) aVar.f303487a).get(str)).f303491b, z);
            } else {
                iFileDownloaderProxyCallback.onTaskFailed(str, i2, z);
            }
        }
    }

    public int addDownloadTask(String str, String str2, int i, IFileDownloaderProxyCallback iFileDownloaderProxyCallback) {
        Log.m105925i("XWeb.MM.FileDownloaderXWEBProxy", "addDownloadTask, url:%s, filepath:%s, bizType:%s", str, str2, Integer.valueOf(i));
        C98124g gVar = new C98124g();
        gVar.f287660d = "task_FileDownloaderXWEBProxy";
        gVar.field_mediaId = str;
        gVar.field_fullpath = str2;
        gVar.f287672s = str;
        gVar.field_fileType = CdnLogic.PCDNAppID.kStoriesVideo;
        gVar.f287662f = this.f303488b;
        gVar.f287673t = 60;
        gVar.f287674u = 600;
        gVar.f287675v = false;
        C102796b bVar = new C102796b(this, (C102795a) null);
        bVar.f303490a = iFileDownloaderProxyCallback;
        bVar.f303491b = str2;
        ((ConcurrentHashMap) this.f303487a).put(str, bVar);
        int c = C101493b.m133250g().mo140981c(gVar);
        Log.m105924i("XWeb.MM.FileDownloaderXWEBProxy", "addDownloadTask, result:" + c);
        return c;
    }
}

package x01;

import com.tencent.p014mm.sdk.platformtools.Log;
import java.io.ByteArrayOutputStream;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import p1081gi.C98120c;
import p1081gi.C98121d;
import p1081gi.C98124g;
import p1084mk.C99907a;
import p1084mk.C99908b;
import s01.C101493b;

/* renamed from: x01.a */
public class C102527a implements C99907a {

    /* renamed from: c */
    public static C102527a f301884c;

    /* renamed from: a */
    public Map<String, C102529b> f301885a = new ConcurrentHashMap();

    /* renamed from: b */
    public C98124g.C98125a f301886b = new C102528a();

    /* renamed from: x01.a$a */
    public class C102528a implements C98124g.C98125a {
        public C102528a() {
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
            Log.m105919d("FileDownloaderWAGameProxy", "on cdn callback mediaId = %s, startRet = %d, keep_ProgressInfo = %s, keep_SceneResult = %s", objArr);
            if (i2 == -21006) {
                Log.m105925i("FileDownloaderWAGameProxy", "duplicate request, ignore this request, media id is %s", str2);
                return 0;
            } else if (i2 != 0) {
                Log.m105921e("FileDownloaderWAGameProxy", "start failed : %d, media id is :%s", Integer.valueOf(i), str2);
                C102527a.m135344b(C102527a.this, str, 4, i, (String) null, false);
                return 0;
            } else if (cVar2 != null) {
                C102527a aVar = C102527a.this;
                long j = cVar2.field_finishedLength;
                long j2 = cVar2.field_toltalLength;
                aVar.getClass();
                Log.m105919d("FileDownloaderWAGameProxy", "updateProgressChange, mediaId = %s, recvLen = %d, totalLen= %d, containCallback = %b", str2, Long.valueOf(j), Long.valueOf(j2), Boolean.valueOf(((ConcurrentHashMap) aVar.f301885a).containsKey(str2)));
                if (((ConcurrentHashMap) aVar.f301885a).containsKey(str2)) {
                    C99908b bVar = ((C102529b) ((ConcurrentHashMap) aVar.f301885a).get(str2)).f301888a;
                    if (bVar == null) {
                        Log.m105920e("FileDownloaderWAGameProxy", "error proxy_callback null");
                    } else {
                        bVar.onTaskProgressChanged(str, j, j2);
                    }
                }
                return 0;
            } else {
                if (dVar2 != null) {
                    int i3 = dVar2.field_retCode;
                    if (i3 != 0) {
                        Log.m105921e("FileDownloaderWAGameProxy", "cdntra clientid:%s sceneResult.retCode:%d sceneResult[%s]", str2, Integer.valueOf(i3), dVar2);
                        C102527a.m135344b(C102527a.this, str, 4, dVar2.field_retCode, (String) null, dVar2.field_isResume);
                    } else {
                        Log.m105925i("FileDownloaderWAGameProxy", "cdn trans suceess, media id : %s", str2);
                        C102527a.m135344b(C102527a.this, str, 3, 0, (String) null, dVar2.field_isResume);
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

    /* renamed from: x01.a$b */
    public class C102529b {

        /* renamed from: a */
        public C99908b f301888a = null;

        /* renamed from: b */
        public String f301889b = null;

        public C102529b(C102527a aVar, C102528a aVar2) {
        }
    }

    /* renamed from: b */
    public static void m135344b(C102527a aVar, String str, int i, int i2, String str2, boolean z) {
        aVar.getClass();
        Log.m105925i("FileDownloaderWAGameProxy", "updateDownloadState, mediaId = %s, state = %d, errCode= %d, errMsg = %s, containCallback = %b", str, Integer.valueOf(i), Integer.valueOf(i2), str2, Boolean.valueOf(((ConcurrentHashMap) aVar.f301885a).containsKey(str)));
        if (((ConcurrentHashMap) aVar.f301885a).containsKey(str)) {
            C99908b bVar = ((C102529b) ((ConcurrentHashMap) aVar.f301885a).get(str)).f301888a;
            if (bVar == null) {
                Log.m105920e("FileDownloaderWAGameProxy", "error proxy_callback null");
            } else if (i == 3) {
                bVar.onTaskFinished(str, ((C102529b) ((ConcurrentHashMap) aVar.f301885a).get(str)).f301889b, z);
            } else {
                bVar.onTaskFailed(str, i2, z);
            }
        }
    }

    /* renamed from: a */
    public int mo137573a(String str, String str2, int i, C99908b bVar) {
        Log.m105925i("FileDownloaderWAGameProxy", "addDownloadTask: %s filepath:%s", str, str2);
        C98124g gVar = new C98124g();
        gVar.f287660d = "task_FileDownloaderWAGameProxy";
        gVar.field_mediaId = str;
        gVar.field_fullpath = str2;
        gVar.f287672s = str;
        gVar.field_fileType = 50001;
        gVar.f287662f = this.f301886b;
        gVar.f287673t = 60;
        gVar.f287674u = 600;
        gVar.f287675v = false;
        C102529b bVar2 = new C102529b(this, (C102528a) null);
        bVar2.f301888a = bVar;
        bVar2.f301889b = str2;
        ((ConcurrentHashMap) this.f301885a).put(str, bVar2);
        int c = C101493b.m133250g().mo140981c(gVar);
        Log.m105924i("FileDownloaderWAGameProxy", "addDownloadTask: " + c);
        return c;
    }
}

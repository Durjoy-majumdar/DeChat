package s01;

import com.tencent.mars.cdn.CdnLogic;
import com.tencent.p014mm.modelcdntran.C92779i0;
import com.tencent.p014mm.modelcdntran.C92796u;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.MMHandler;
import com.tencent.p014mm.sdk.platformtools.NetStatusUtil;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.vfs.C86013q1;
import java.io.ByteArrayOutputStream;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;
import java.util.concurrent.ConcurrentHashMap;
import p1081gi.C98119b;
import p1081gi.C98120c;
import p1081gi.C98121d;
import p1081gi.C98124g;

/* renamed from: s01.b */
public class C101493b implements C98119b {

    /* renamed from: j */
    public static C101493b f297188j;

    /* renamed from: d */
    public Queue<String> f297189d = new LinkedList();

    /* renamed from: e */
    public Map<String, C98124g> f297190e = new ConcurrentHashMap();

    /* renamed from: f */
    public Map<String, C98124g> f297191f = new ConcurrentHashMap();

    /* renamed from: g */
    public Map<String, Integer> f297192g = new ConcurrentHashMap();

    /* renamed from: h */
    public MMHandler f297193h = new MMHandler("CdnDownloadNativeService#" + hashCode());

    /* renamed from: i */
    public C92796u f297194i = null;

    /* renamed from: s01.b$a */
    public class C101494a implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ String f297195d;

        /* renamed from: e */
        public final /* synthetic */ C98120c f297196e;

        /* renamed from: f */
        public final /* synthetic */ boolean f297197f;

        /* renamed from: g */
        public final /* synthetic */ C98121d f297198g;

        public C101494a(String str, C98120c cVar, boolean z, C98121d dVar) {
            this.f297195d = str;
            this.f297196e = cVar;
            this.f297197f = z;
            this.f297198g = dVar;
        }

        public void run() {
            C98120c cVar;
            C98124g gVar = (C98124g) ((ConcurrentHashMap) C101493b.this.f297191f).get(this.f297195d);
            boolean z = false;
            if (gVar == null) {
                Log.m105921e("MicroMsg.CdnDownloadNativeService", " task in jni get info failed mediaid:%s", this.f297195d);
                return;
            }
            C98120c cVar2 = this.f297196e;
            if (cVar2 != null) {
                cVar2.f287607a = this.f297195d;
                Log.m105925i("MicroMsg.CdnDownloadNativeService", "MTL: total:%d, cur:%d, mtl:%b, isSend:%b, isUploadTask:%b(%b)", Long.valueOf(cVar2.field_toltalLength), Long.valueOf(this.f297196e.field_finishedLength), Boolean.valueOf(this.f297196e.field_mtlnotify), Boolean.valueOf(gVar.f287661e), Boolean.valueOf(this.f297196e.field_isUploadTask), Boolean.valueOf(this.f297197f));
                if (this.f297197f != gVar.f287661e) {
                    return;
                }
            }
            C98121d dVar = this.f297198g;
            if (dVar != null) {
                dVar.f287609a = this.f297195d;
            }
            if (gVar.f287662f != null) {
                long nowMilliSecond = Util.nowMilliSecond();
                if (this.f297198g != null || (cVar = this.f297196e) == null || cVar.field_mtlnotify || NetStatusUtil.getNetWorkType(MMApplicationContext.getContext()) != -1) {
                    gVar.field_lastProgressCallbackTime = nowMilliSecond;
                    gVar.f287662f.mo1773g0(this.f297195d, 0, this.f297196e, this.f297198g, gVar.field_onlycheckexist);
                } else {
                    return;
                }
            }
            C101493b bVar = C101493b.this;
            C98120c cVar3 = this.f297196e;
            bVar.getClass();
            if (cVar3 == null || cVar3.field_finishedLength == cVar3.field_toltalLength) {
                z = true;
            }
            if (z) {
                ((ConcurrentHashMap) C101493b.this.f297192g).remove(this.f297195d);
            }
            if (this.f297198g != null) {
                ((ConcurrentHashMap) C101493b.this.f297191f).remove(this.f297195d);
                if (this.f297198g.field_retCode == -5103011) {
                    Log.m105924i("MicroMsg.CdnDownloadNativeService", "summersafecdn ERR_VALIDATE_AUTHKEY");
                    C115669n.INSTANCE.idkeyStat(546, 4, 1, true);
                    C101493b.this.mo140984f().keep_OnRequestDoGetCdnDnsInfo(999);
                }
            }
        }

        public String toString() {
            return super.toString() + "|callback";
        }
    }

    /* renamed from: s01.b$b */
    public class C101495b implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ String f297200d;

        /* renamed from: e */
        public final /* synthetic */ C98121d f297201e;

        public C101495b(String str, C98121d dVar) {
            this.f297200d = str;
            this.f297201e = dVar;
        }

        public void run() {
            C98124g gVar = (C98124g) ((ConcurrentHashMap) C101493b.this.f297191f).get(this.f297200d);
            if (gVar == null) {
                Log.m105921e("MicroMsg.CdnDownloadNativeService", " task in jni get info failed mediaid:%s", this.f297200d);
                return;
            }
            C98124g.C98126b bVar = gVar.f287656M;
            if (bVar != null) {
                bVar.mo31987b(this.f297200d, this.f297201e);
            }
        }
    }

    public C101493b() {
        new HashSet();
    }

    /* renamed from: g */
    public static synchronized C101493b m133250g() {
        C101493b bVar;
        synchronized (C101493b.class) {
            if (f297188j == null) {
                f297188j = new C101493b();
            }
            bVar = f297188j;
        }
        return bVar;
    }

    /* renamed from: a */
    public int mo17770a(String str, C98120c cVar, C98121d dVar) {
        if (Util.isNullOrNil(str)) {
            Log.m105920e("MicroMsg.CdnDownloadNativeService", "cdn callback mediaid is null");
            return -1;
        } else if (cVar == null && dVar == null) {
            Log.m105920e("MicroMsg.CdnDownloadNativeService", "cdn callback info all null");
            return -2;
        } else {
            if (cVar != null) {
                Log.m105919d("MicroMsg.CdnDownloadNativeService", "CDN progress. total:%d, cur:%d, canshow:%b, isUploadTask:%b", Long.valueOf(cVar.field_toltalLength), Long.valueOf(cVar.field_finishedLength), Boolean.valueOf(cVar.field_mtlnotify), Boolean.valueOf(cVar.field_isUploadTask));
            }
            boolean z = cVar != null ? cVar.field_isUploadTask : false;
            Util.nowMilliSecond();
            this.f297193h.postToWorker(new C101494a(str, cVar, z, dVar));
            return 0;
        }
    }

    /* renamed from: b */
    public int mo17771b(String str, C98121d dVar) {
        if (Util.isNullOrNil(str)) {
            return 0;
        }
        this.f297193h.postToWorker(new C101495b(str, dVar));
        return 0;
    }

    /* renamed from: c */
    public int mo140981c(C98124g gVar) {
        if (gVar == null) {
            Log.m105920e("MicroMsg.CdnDownloadNativeService", "addRecvTask task info is null");
            return -1;
        } else if (Util.isNullOrNil(gVar.field_mediaId)) {
            Log.m105920e("MicroMsg.CdnDownloadNativeService", "addRecvTask mediaId is null");
            return -1;
        } else {
            if (gVar.field_fileId == null) {
                gVar.field_fileId = "";
            }
            if (gVar.field_aesKey == null) {
                gVar.field_aesKey = "";
            }
            if (((LinkedList) this.f297189d).contains(gVar.field_fileId)) {
                Log.m105920e("MicroMsg.CdnDownloadNativeService", "addRecvTask mediaId  exists in queueTask");
            } else {
                if (((ConcurrentHashMap) this.f297190e).containsKey(gVar.field_fileId)) {
                    Log.m105920e("MicroMsg.CdnDownloadNativeService", "addRecvTask mediaId  exists in mapWaitTask");
                } else {
                    if (((ConcurrentHashMap) this.f297191f).containsKey(gVar.field_fileId)) {
                        Log.m105920e("MicroMsg.CdnDownloadNativeService", "addRecvTask mediaId  exists in mapTaskInJni");
                    } else {
                        gVar.f287661e = false;
                        this.f297193h.postToWorker(new C101492a(this, -1, gVar));
                        return 0;
                    }
                }
            }
            return -2;
        }
    }

    /* renamed from: d */
    public boolean mo140982d(String str) {
        C98124g gVar = (C98124g) ((ConcurrentHashMap) this.f297191f).get(str);
        mo140983e(str);
        if (gVar == null || gVar.field_fullpath == null) {
            return true;
        }
        Log.m105924i("MicroMsg.CdnDownloadNativeService", "cancelGameRecvTask, delete file:" + gVar.field_fullpath);
        C86013q1.m106447h(gVar.field_fullpath);
        return true;
    }

    /* renamed from: e */
    public boolean mo140983e(String str) {
        C98124g gVar = (C98124g) ((ConcurrentHashMap) this.f297191f).remove(str);
        if (gVar != null) {
            int i = gVar.field_fileType;
            if (i == 30001 || i == 30003) {
                mo140984f().mo127051t(str);
            } else if (gVar.f287677x) {
                mo140984f().getClass();
                Log.m105924i("MicroMsg.CdnTransportEngine", "stopGamePackageDownload: mediaid:" + str);
                CdnLogic.cancelTask(str);
            } else {
                mo140984f().getClass();
                CdnLogic.cancelTask(str);
            }
            C115669n.INSTANCE.mo160131h(10769, -10002, Integer.valueOf(gVar.field_fileType), Long.valueOf(Util.nowMilliSecond() - gVar.field_startTime));
        }
        ((ConcurrentHashMap) this.f297190e).remove(str);
        ((ConcurrentHashMap) this.f297192g).remove(str);
        Log.m105925i("MicroMsg.CdnDownloadNativeService", "summersafecdn cdntra cancelRecvTask mediaid:%s mapremove:%s engine ret:%d", str, gVar, 0);
        return true;
    }

    /* renamed from: f */
    public C92796u mo140984f() {
        if (this.f297194i == null) {
            if (MMApplicationContext.isMMProcess()) {
                Log.m105924i("MicroMsg.CdnDownloadNativeService", "use mm process cdn engine.");
                this.f297194i = C92779i0.Dx0();
            } else {
                Log.m105924i("MicroMsg.CdnDownloadNativeService", "use new cdn engine.");
                this.f297194i = new C92796u(MMApplicationContext.getContext().getFilesDir() + "/NativeCDNInfo", this);
            }
        }
        return this.f297194i;
    }

    /* renamed from: h */
    public void mo17772h(String str, ByteArrayOutputStream byteArrayOutputStream) {
        if (Util.isNullOrNil(str)) {
            Log.m105920e("MicroMsg.CdnDownloadNativeService", "cdn callback getauthbuf mediaid is null");
            return;
        }
        C98124g gVar = (C98124g) ((ConcurrentHashMap) this.f297191f).get(str);
        if (gVar == null) {
            Log.m105921e("MicroMsg.CdnDownloadNativeService", " getauthbuf task in jni get info failed mediaid:%s", str);
            return;
        }
        C98124g.C98125a aVar = gVar.f287662f;
        if (aVar != null) {
            aVar.mo1774h(str, byteArrayOutputStream);
        } else {
            Log.m105920e("MicroMsg.CdnDownloadNativeService", "getCdnAuthInfo fail, null taskcallback.");
        }
    }

    /* renamed from: i */
    public int mo140985i(C98124g gVar) {
        if (((ConcurrentHashMap) this.f297191f).containsKey(gVar.field_mediaId)) {
            int resumeHttpMultiSocketDownloadTask = CdnLogic.resumeHttpMultiSocketDownloadTask(gVar.field_mediaId);
            Log.m105925i("MicroMsg.CdnDownloadNativeService", "summersafecdn cdntra resumeRecvTask task resume mediaid:%s, ret:%d", gVar.field_mediaId, Integer.valueOf(resumeHttpMultiSocketDownloadTask));
            return resumeHttpMultiSocketDownloadTask;
        }
        Log.m105925i("MicroMsg.CdnDownloadNativeService", "summersafecdn cdntra resumeRecvTask task add new mediaid:%s", gVar.field_mediaId);
        return mo140981c(gVar);
    }

    /* renamed from: j */
    public byte[] mo17773j(String str, byte[] bArr) {
        if (Util.isNullOrNil(str)) {
            Log.m105920e("MicroMsg.CdnDownloadNativeService", "cdn callback decodePrepareResponse mediaid is null");
            return null;
        }
        C98124g gVar = (C98124g) ((ConcurrentHashMap) this.f297191f).get(str);
        if (gVar == null) {
            Log.m105921e("MicroMsg.CdnDownloadNativeService", " decodePrepareResponse task in jni get info failed mediaid:%s", str);
            return null;
        }
        C98124g.C98125a aVar = gVar.f287662f;
        if (aVar != null) {
            return aVar.mo1775j(str, bArr);
        }
        Log.m105920e("MicroMsg.CdnDownloadNativeService", "decodePrepareResponse fail, null taskcallback.");
        return null;
    }
}

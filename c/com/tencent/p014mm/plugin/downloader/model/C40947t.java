package com.tencent.p014mm.plugin.downloader.model;

import android.content.Context;
import android.content.Intent;
import com.tencent.mars.cdn.CdnLogic;
import com.tencent.p014mm.plugin.appbrand.jsapi.appdownload.JsApiPauseDownloadTask;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MD5Util;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.vfs.C86009m1;
import com.tencent.p014mm.vfs.VFSStrategy;
import di3.C86312j;
import java.io.ByteArrayOutputStream;
import java.util.HashMap;
import ke3.C88144b;
import p1081gi.C98120c;
import p1081gi.C98121d;
import p1081gi.C98124g;
import p663qo.C101213l;
import z41.C53736a;
import zt3.C119157j;

/* renamed from: com.tencent.mm.plugin.downloader.model.t */
public class C40947t extends C40945r {

    /* renamed from: e */
    public static final String f110212e = VFSStrategy.m163776d("HotPatchDownload");

    /* renamed from: b */
    public Context f110213b = MMApplicationContext.getContext();

    /* renamed from: c */
    public HashMap<String, Long> f110214c = new HashMap<>();

    /* renamed from: d */
    public C98124g.C98125a f110215d = new C40951d();

    /* renamed from: com.tencent.mm.plugin.downloader.model.t$a */
    public class C40948a implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ long f110216d;

        public C40948a(long j) {
            this.f110216d = j;
        }

        public void run() {
            C53736a c = C40933j.m44314c(this.f110216d);
            if (c != null) {
                ((C101213l) C86312j.m106911c(C101213l.class)).Gm0(c.field_downloadUrl);
                if (c.field_status != 5) {
                    c.field_status = 5;
                    C40933j.m44322k(c);
                    C40947t.this.f110211a.mo63944g(this.f110216d);
                }
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.downloader.model.t$b */
    public class C40949b implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ long f110218d;

        public C40949b(long j) {
            this.f110218d = j;
        }

        public void run() {
            Log.m105918d("MicroMsg.FileWebNetDownloader", JsApiPauseDownloadTask.NAME);
            FileDownloadTaskInfo e = C40947t.this.mo62095e(this.f110218d);
            if (e.f12196f == 1) {
                CdnLogic.pauseHttpMultiSocketDownloadTask(e.f12195e);
                C53736a c = C40933j.m44314c(this.f110218d);
                if (c != null) {
                    c.field_status = 2;
                    C40933j.m44322k(c);
                }
                C40947t.this.f110211a.mo63942e(this.f110218d);
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.downloader.model.t$c */
    public class C40950c implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ C53736a f110220d;

        /* renamed from: e */
        public final /* synthetic */ long f110221e;

        public C40950c(C53736a aVar, long j) {
            this.f110220d = aVar;
            this.f110221e = j;
        }

        public void run() {
            int resumeHttpMultiSocketDownloadTask = CdnLogic.resumeHttpMultiSocketDownloadTask(this.f110220d.field_downloadUrl);
            Log.m105924i("MicroMsg.FileWebNetDownloader", "resumeDownloadTask: " + resumeHttpMultiSocketDownloadTask);
            this.f110220d.field_startTime = System.currentTimeMillis();
            C53736a aVar = this.f110220d;
            aVar.field_startState = 1;
            aVar.field_startSize = aVar.field_downloadedSize;
            if (resumeHttpMultiSocketDownloadTask == 0) {
                aVar.field_status = 1;
                aVar.field_errCode = 0;
                C40933j.m44322k(aVar);
                C40947t.this.f110211a.mo63945h(this.f110221e, this.f110220d.field_filePath);
                C53736a aVar2 = this.f110220d;
                long j = aVar2.field_totalSize;
                if (j != 0) {
                    long j2 = aVar2.field_downloadedSize / j;
                    return;
                }
                return;
            }
            aVar.field_status = 4;
            aVar.field_errCode = 202;
            C40933j.m44322k(aVar);
            C40947t.this.f110211a.mo63940c(this.f110221e, this.f110220d.field_errCode, false);
        }
    }

    /* renamed from: com.tencent.mm.plugin.downloader.model.t$d */
    public class C40951d implements C98124g.C98125a {
        public C40951d() {
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
            Log.m105919d("MicroMsg.FileWebNetDownloader", "on webnet callback mediaId = %s, startRet = %d, keep_ProgressInfo = %s, keep_SceneResult = %s", objArr);
            if (i2 == -21006) {
                Log.m105925i("MicroMsg.FileWebNetDownloader", "duplicate request, ignore this request, media id is %s", str2);
                return 0;
            } else if (i2 != 0) {
                Log.m105921e("MicroMsg.FileWebNetDownloader", "start failed : %d, media id is :%s", Integer.valueOf(i), str2);
                C40947t.m44364f(C40947t.this, str2, 4, i2, (String) null);
                return 0;
            } else if (cVar2 != null) {
                C40947t tVar = C40947t.this;
                long j = cVar2.field_finishedLength;
                long j2 = cVar2.field_toltalLength;
                tVar.getClass();
                C53736a e = C40933j.m44316e(str);
                Object[] objArr2 = new Object[4];
                objArr2[0] = Boolean.valueOf(e != null);
                objArr2[1] = str2;
                objArr2[2] = Long.valueOf(j);
                objArr2[3] = Long.valueOf(j2);
                Log.m105925i("MicroMsg.FileWebNetDownloader", "updateProgressChange, info is %s %s %d %d", objArr2);
                if (e != null) {
                    Long l = tVar.f110214c.get(e.field_downloadUrl);
                    Long valueOf = Long.valueOf(System.currentTimeMillis());
                    if (l == null || valueOf.longValue() - l.longValue() >= 500) {
                        tVar.f110214c.put(e.field_downloadUrl, valueOf);
                        e.field_status = 1;
                        e.field_downloadedSize = j;
                        e.field_totalSize = j2;
                        C40933j.m44322k(e);
                        tVar.f110211a.mo63943f(e.field_downloadId, str, j, j2);
                    }
                }
                return 0;
            } else {
                if (dVar2 != null) {
                    int i3 = dVar2.field_retCode;
                    if (i3 != 0) {
                        Log.m105921e("MicroMsg.FileWebNetDownloader", "cdntra clientid:%s sceneResult.retCode:%d sceneResult[%s]", str2, Integer.valueOf(i3), dVar2);
                        C40947t.m44364f(C40947t.this, str2, 4, dVar2.field_retCode, (String) null);
                    } else {
                        Log.m105925i("MicroMsg.FileWebNetDownloader", "cdn trans suceess, media id : %s", str2);
                        C40947t.m44364f(C40947t.this, str2, 3, 0, (String) null);
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

    public C40947t(C40923i iVar) {
        super(iVar);
    }

    /* renamed from: f */
    public static void m44364f(C40947t tVar, String str, int i, int i2, String str2) {
        tVar.getClass();
        Log.m105925i("MicroMsg.FileWebNetDownloader", "updateDownloadState, url = %s, state = %d, errCode= %d, errMsg = %s", str, Integer.valueOf(i), Integer.valueOf(i2), str2);
        C53736a e = C40933j.m44316e(str);
        if (e == null) {
            Log.m105924i("MicroMsg.FileWebNetDownloader", "updateDownloadState, info is null");
            return;
        }
        Log.m105925i("MicroMsg.FileWebNetDownloader", "updateDownloadState, url = %s, state = %d, errCode = %d, errMsg = %s", str, Integer.valueOf(i), Integer.valueOf(i2), str2);
        if (i == 3) {
            Intent intent = new Intent();
            intent.putExtra(FileDownloadService.f110081n, 1);
            intent.setClass(tVar.f110213b, FileDownloadService.class);
            intent.putExtra(FileDownloadService.f110080j, e.field_downloadId);
            try {
                C88144b.m109807y(intent);
            } catch (Exception e2) {
                Log.m105920e("MicroMsg.FileWebNetDownloader", e2.getMessage());
            }
        } else if (i == 4) {
            e.field_errCode = Math.abs(i2);
            e.field_status = 4;
            C40933j.m44322k(e);
            tVar.f110211a.mo63940c(e.field_downloadId, Math.abs(i2), false);
        }
    }

    /* renamed from: a */
    public boolean mo62091a(long j) {
        C53736a c = C40933j.m44314c(j);
        if (c == null || c.field_status != 2) {
            return false;
        }
        ((C119157j) C119157j.f356862d).mo183884o(new C40950c(c, j));
        return true;
    }

    /* renamed from: b */
    public long mo62092b(C40939n nVar) {
        if (nVar == null || Util.isNullOrNil(nVar.f110176a)) {
            Log.m105920e("MicroMsg.FileWebNetDownloader", "Invalid Request");
            return -1;
        }
        Log.m105925i("MicroMsg.FileWebNetDownloader", "addDownloadTask: %s", nVar.f110176a);
        String str = nVar.f110176a;
        C53736a e = C40933j.m44316e(str);
        if (e != null) {
            FileDownloadTaskInfo e2 = mo62095e(e.field_downloadId);
            Log.m105924i("MicroMsg.FileWebNetDownloader", "addDownloadTask, status = " + e2.f12196f);
            if (e2.f12196f == 1) {
                return e2.f12194d;
            }
        }
        C40933j.m44321j(str);
        C40933j.m44320i(nVar.f110182g);
        C53736a b = C40940o.m44349b(nVar);
        b.field_downloadId = System.currentTimeMillis();
        b.field_downloaderType = 4;
        String mD5String = MD5Util.getMD5String(str);
        StringBuilder sb = new StringBuilder();
        String str2 = f110212e;
        sb.append(str2);
        sb.append("/");
        sb.append(mD5String);
        String sb4 = sb.toString();
        b.field_filePath = sb4;
        if (e != null) {
            String str3 = e.field_filePath;
            if (!(sb4 == null || str3 == null || sb4.equals(str3))) {
                Log.m105925i("MicroMsg.FileWebNetDownloader", "removeLastFile, new File = %s, oldFile = %s", sb4, str3);
                C86009m1 m1Var = new C86009m1(str3);
                if (m1Var.mo119967g()) {
                    Log.m105925i("MicroMsg.FileWebNetDownloader", "Delete previous file result: %b", Boolean.valueOf(m1Var.mo119966f()));
                }
            }
        }
        b.field_startTime = System.currentTimeMillis();
        C86009m1 m1Var2 = new C86009m1(str2);
        if (!m1Var2.mo119967g()) {
            if (!m1Var2.mo119974l().mo119967g()) {
                C86009m1 l = m1Var2.mo119974l();
                C86009m1 m1Var3 = new C86009m1(l.mo119971i() + System.currentTimeMillis());
                if (m1Var3.mo119987x()) {
                    m1Var3.mo119988y(l);
                } else {
                    Log.m105921e("MicroMsg.FileWebNetDownloader", "mkdir parent error, %s", l.mo119971i());
                }
            }
            Log.m105925i("MicroMsg.FileWebNetDownloader", "Make download dir result: %b", Boolean.valueOf(m1Var2.mo119987x()));
        }
        C98124g gVar = new C98124g();
        gVar.f287660d = "task_FileWebNetDownloader";
        String str4 = nVar.f110176a;
        gVar.f287672s = str4;
        gVar.field_mediaId = str4;
        if (nVar.f110181f == 2) {
            gVar.field_fileType = 30003;
            gVar.f287652I = nVar.f110175B;
            gVar.f287673t = 20;
            if (nVar.f110200y) {
                gVar.f287674u = 900;
            } else {
                gVar.f287674u = 90;
            }
        }
        gVar.field_fullpath = b.field_filePath;
        gVar.f287662f = this.f110215d;
        boolean xf02 = ((C101213l) C86312j.m106911c(C101213l.class)).xf0(gVar);
        Log.m105924i("MicroMsg.FileWebNetDownloader", "addDownloadTask: " + xf02);
        if (xf02) {
            b.field_status = 1;
            C40933j.m44312a(b);
            this.f110211a.mo63946i(b.field_downloadId, b.field_filePath);
        } else {
            b.field_status = 4;
            b.field_errCode = 201;
            C40933j.m44312a(b);
            this.f110211a.mo63940c(b.field_downloadId, b.field_errCode, false);
        }
        return b.field_downloadId;
    }

    /* renamed from: c */
    public boolean mo62093c(long j) {
        ((C119157j) C119157j.f356862d).mo183884o(new C40949b(j));
        return true;
    }

    /* renamed from: d */
    public long mo62094d(C53736a aVar) {
        return 0;
    }

    /* renamed from: e */
    public FileDownloadTaskInfo mo62095e(long j) {
        int i;
        FileDownloadTaskInfo fileDownloadTaskInfo = new FileDownloadTaskInfo();
        C53736a c = C40933j.m44314c(j);
        if (c != null) {
            CdnLogic.CdnTaskStateInfo httpMultiSocketDownloadTaskState = CdnLogic.httpMultiSocketDownloadTaskState(c.field_downloadUrl);
            int i2 = c.field_status;
            if (i2 != 1 || (httpMultiSocketDownloadTaskState != null && ((i = httpMultiSocketDownloadTaskState.taskState) == 100 || i == 101))) {
                fileDownloadTaskInfo.f12196f = i2;
            } else {
                fileDownloadTaskInfo.f12196f = 0;
            }
            fileDownloadTaskInfo.f12200j = c.field_downloadedSize;
            fileDownloadTaskInfo.f12201n = c.field_totalSize;
            fileDownloadTaskInfo.f12194d = j;
            fileDownloadTaskInfo.f12203p = c.field_downloaderType;
            fileDownloadTaskInfo.f12202o = c.field_autoDownload;
            fileDownloadTaskInfo.f12197g = c.field_filePath;
            fileDownloadTaskInfo.f12195e = c.field_downloadUrl;
            fileDownloadTaskInfo.f12198h = c.field_md5;
        }
        return fileDownloadTaskInfo;
    }

    public int removeDownloadTask(long j) {
        ((C119157j) C119157j.f356862d).mo183884o(new C40948a(j));
        return 1;
    }
}

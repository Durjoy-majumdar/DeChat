package com.tencent.p014mm.plugin.downloader.model;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Looper;
import android.os.RemoteException;
import bd2.C79690d;
import c51.C0418d;
import c51.C39890a;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.booter.notification.MMNotification;
import com.tencent.p014mm.plugin.appbrand.jsapi.appdownload.JsApiPauseDownloadTask;
import com.tencent.p014mm.plugin.cdndownloader.ipc.CDNTaskInfo;
import com.tencent.p014mm.plugin.cdndownloader.ipc.CDNTaskState;
import com.tencent.p014mm.plugin.downloader.api.C40910b;
import com.tencent.p014mm.plugin.downloader.p796ui.FileDownloadConfirmUI;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.pluginsdk.model.app.C44561j;
import com.tencent.p014mm.pluginsdk.model.app.C44565l;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MD5Util;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.NetStatusUtil;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.vfs.C86009m1;
import com.tencent.p014mm.vfs.C86013q1;
import di3.C86312j;
import java.util.HashMap;
import java.util.HashSet;
import java.util.concurrent.ConcurrentHashMap;
import ji3.C9457a;
import ke3.C88144b;
import ld2.C46848g;
import nd3.C47223a;
import org.json.JSONException;
import org.json.JSONObject;
import p237sp.C36767n;
import p918s2.C90116e;
import q01.C47731a;
import t01.C48520a;
import t01.C48526b;
import z41.C53736a;
import zt3.C119157j;

/* renamed from: com.tencent.mm.plugin.downloader.model.h */
public class C40917h extends C40945r {

    /* renamed from: j */
    public static final String f110091j = C36767n.f97661a;

    /* renamed from: b */
    public Context f110092b = MMApplicationContext.getContext();

    /* renamed from: c */
    public byte[] f110093c = new byte[0];

    /* renamed from: d */
    public HashMap<String, Long> f110094d = new HashMap<>();

    /* renamed from: e */
    public HashMap<String, Long> f110095e = new HashMap<>();

    /* renamed from: f */
    public ConcurrentHashMap<String, Integer> f110096f = new ConcurrentHashMap<>();

    /* renamed from: g */
    public HashMap<String, Long> f110097g = new HashMap<>();

    /* renamed from: h */
    public HashMap<String, Long> f110098h = new HashMap<>();

    /* renamed from: i */
    public C48526b f110099i = new C40918a();

    /* renamed from: com.tencent.mm.plugin.downloader.model.h$a */
    public class C40918a implements C48526b {
        public C40918a() {
        }

        /* renamed from: a */
        public void mo63934a(String str, int i, int i2, String str2) {
            boolean z;
            C53736a e = C40933j.m44316e(str);
            if (e == null) {
                C115669n.INSTANCE.idkeyStat(710, 18, 1, false);
                Log.m105924i("MicroMsg.FileCDNDownloader", "onDownloadTaskStateChanged, info is null");
                return;
            }
            Log.m105925i("MicroMsg.FileCDNDownloader", "onDownloadTaskStateChanged, url = %s, state = %d, errCode = %d, errMsg = %s", str, Integer.valueOf(i), Integer.valueOf(i2), str2);
            if (i == 1) {
                C40933j.m44323l(e.field_downloadUrl, 1);
            } else if (i == 3) {
                e.field_finishTime = System.currentTimeMillis();
                long j = e.field_totalSize;
                e.field_downloadedSize = j;
                e.field_status = 6;
                Log.m105925i("MicroMsg.FileCDNDownloader", "download succeed, downloadedSize = %d, startSize = %d", Long.valueOf(j), Long.valueOf(e.field_startSize));
                C40933j.m44322k(e);
                C40933j.m44323l(e.field_downloadUrl, 6);
                C40917h.this.f110211a.mo63939b(e.field_downloadId);
                Intent intent = new Intent();
                intent.putExtra(FileDownloadService.f110081n, 1);
                intent.setClass(C40917h.this.f110092b, FileDownloadService.class);
                intent.putExtra(FileDownloadService.f110080j, e.field_downloadId);
                try {
                    C88144b.m109807y(intent);
                } catch (Exception e2) {
                    Log.m105920e("MicroMsg.FileCDNDownloader", e2.getMessage());
                }
                C40917h.this.mo63931g(e.field_downloadUrl);
                C40917h.this.f110097g.remove(e.field_downloadUrl);
                C40917h.this.f110098h.remove(e.field_downloadUrl);
            } else if (i == 4) {
                if ((i2 != 21009 && i2 != 21020) || C40940o.m44348a(e.field_totalSize)) {
                    z = false;
                } else if (C40940o.m44350c(e.field_totalSize)) {
                    C40917h.this.mo62094d(e);
                    return;
                } else {
                    z = true;
                }
                e.field_finishTime = System.currentTimeMillis();
                e.field_errCode = Math.abs(i2);
                e.field_status = 4;
                if (NetStatusUtil.isWifi(MMApplicationContext.getContext()) && e.field_downloadInWifi) {
                    e.field_downloadInWifi = false;
                    e.field_reserveInWifi = false;
                }
                C40933j.m44322k(e);
                C40917h.this.f110211a.mo63940c(e.field_downloadId, Math.abs(i2), false);
                C40917h.this.mo63933i(e.field_downloadUrl, 4, 0, false, z);
                C40917h.this.f110097g.remove(e.field_downloadUrl);
                C40917h.this.f110098h.remove(e.field_downloadUrl);
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.downloader.model.h$b */
    public class C40919b implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ C53736a f110101d;

        public C40919b(C53736a aVar) {
            this.f110101d = aVar;
        }

        public void run() {
            int i;
            C53736a aVar = this.f110101d;
            C40910b.m44270c(aVar.field_appId, aVar.field_downloadUrl, aVar.field_secondaryUrl);
            C46848g.Cx0().mo69342c(this.f110101d.field_appId);
            CDNTaskInfo f = C40917h.m44285f(C40917h.this, this.f110101d);
            C48520a f2 = C48520a.m53896f();
            synchronized (f2) {
                if (Util.isNullOrNil(f.f109964e)) {
                    Log.m105928w("MicroMsg.CDNDownloadClient", "addDownloadTask, info invalid");
                    i = -1;
                } else {
                    Log.m105925i("MicroMsg.CDNDownloadClient", "addDownloadTask filePath:%s, url:%s", f.f109966g, f.f109964e);
                    if (((HashSet) f2.f129778g).contains(f)) {
                        Log.m105924i("MicroMsg.CDNDownloadClient", "addDownloadTask, already in running");
                        i = -2;
                    } else {
                        CDNTaskState g = f2.mo73158g(f.f109964e);
                        if (g == null || g.f109974d != 104 || !C86013q1.m106450k(f.f109966g)) {
                            C47731a aVar2 = f2.f129776e;
                            if (aVar2 != null) {
                                try {
                                    int NQ = aVar2.mo63880NQ(f);
                                    ((C48520a.C48524d) f2.f129782n).mo72549A9(f.f109965f, 1, 0, "");
                                    if (NQ == 0 || NQ == -2) {
                                        f2.mo73155c(f);
                                    }
                                    i = NQ;
                                } catch (RemoteException e) {
                                    Log.m105920e("MicroMsg.CDNDownloadClient", "addDownloadTask, " + e.getMessage());
                                }
                            }
                            f2.mo73155c(f);
                            f2.mo73156d();
                            i = 0;
                        } else {
                            Log.m105924i("MicroMsg.CDNDownloadClient", "addDownloadTask, has download success");
                            i = 1;
                        }
                    }
                }
            }
            Log.m105925i("MicroMsg.FileCDNDownloader", "addDownloadTask: ret = %d, downloadId = %d", Integer.valueOf(i), Long.valueOf(this.f110101d.field_downloadId));
            if (i == 0) {
                C53736a aVar3 = this.f110101d;
                aVar3.field_status = 1;
                aVar3.field_startTime = System.currentTimeMillis();
                C40933j.m44312a(this.f110101d);
                C40923i iVar = C40917h.this.f110211a;
                C53736a aVar4 = this.f110101d;
                iVar.mo63946i(aVar4.field_downloadId, aVar4.field_filePath);
                C40917h.this.mo63933i(this.f110101d.field_downloadUrl, 1, 0, true, false);
            } else if (i == -2) {
                C53736a aVar5 = this.f110101d;
                aVar5.field_status = 1;
                aVar5.field_startTime = System.currentTimeMillis();
                C40933j.m44312a(this.f110101d);
            } else if (i == 1) {
                C53736a aVar6 = this.f110101d;
                aVar6.field_status = 6;
                long l = C86013q1.m106451l(aVar6.field_filePath);
                aVar6.field_totalSize = l;
                aVar6.field_downloadedSize = l;
                aVar6.field_startSize = l;
                C53736a aVar7 = this.f110101d;
                long currentTimeMillis = System.currentTimeMillis();
                aVar7.field_finishTime = currentTimeMillis;
                aVar7.field_startTime = currentTimeMillis;
                C40933j.m44312a(this.f110101d);
                C40917h.this.f110211a.mo63939b(this.f110101d.field_downloadId);
                Intent intent = new Intent();
                intent.putExtra(FileDownloadService.f110081n, 1);
                intent.setClass(C40917h.this.f110092b, FileDownloadService.class);
                intent.putExtra(FileDownloadService.f110080j, this.f110101d.field_downloadId);
                try {
                    C88144b.m109807y(intent);
                } catch (Exception e2) {
                    Log.m105920e("MicroMsg.FileCDNDownloader", e2.getMessage());
                }
            } else {
                C53736a aVar8 = this.f110101d;
                aVar8.field_status = 4;
                aVar8.field_errCode = 201;
                C40933j.m44312a(aVar8);
                C40923i iVar2 = C40917h.this.f110211a;
                C53736a aVar9 = this.f110101d;
                iVar2.mo63940c(aVar9.field_downloadId, aVar9.field_errCode, false);
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.downloader.model.h$c */
    public class C40920c implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ long f110103d;

        public C40920c(long j) {
            this.f110103d = j;
        }

        public void run() {
            C53736a c;
            FileDownloadTaskInfo e = C40917h.this.mo62095e(this.f110103d);
            if (e != null) {
                C48520a f = C48520a.m53896f();
                String str = e.f12195e;
                synchronized (f) {
                    Log.m105924i("MicroMsg.CDNDownloadClient", "removeDownloadTask: " + str);
                    if (Util.isNullOrNil(str)) {
                        Log.m105928w("MicroMsg.CDNDownloadClient", "removeDownloadTask, url invalid");
                    } else {
                        f.mo73159h(new CDNTaskInfo(str));
                        C47731a aVar = f.f129776e;
                        if (aVar != null) {
                            try {
                                aVar.Wa0(str);
                            } catch (RemoteException e2) {
                                Log.m105920e("MicroMsg.CDNDownloadClient", "removeDownloadTask, " + e2.getMessage());
                            }
                        }
                        Log.m105924i("MicroMsg.CDNDownloadClient", "removeDownloadTask false, service interface is null");
                    }
                }
                C40917h.this.mo63931g(e.f12195e);
                C86013q1.m106447h(e.f12197g);
                Log.m105925i("MicroMsg.FileCDNDownloader", "removeDownloadTask, delete file, path: %s", e.f12197g);
                if (e.f12196f != 5 && (c = C40933j.m44314c(this.f110103d)) != null) {
                    c.field_finishTime = System.currentTimeMillis();
                    c.field_downloadedSize = e.f12200j;
                    c.field_status = 5;
                    C40933j.m44322k(c);
                    C40933j.m44323l(c.field_downloadUrl, 5);
                    Long valueOf = Long.valueOf(Util.nullAs(C40917h.this.f110098h.get(e.f12195e), c.field_startTime));
                    if (valueOf != null) {
                        Long valueOf2 = Long.valueOf(Util.nullAs(C40917h.this.f110097g.get(e.f12195e), c.field_startSize));
                        long currentTimeMillis = System.currentTimeMillis() - valueOf.longValue();
                        C0418d.m366a(this.f110103d, ((((float) (e.f12200j - valueOf2.longValue())) * 1000.0f) / ((float) currentTimeMillis)) / 1048576.0f, (int) ((((float) e.f12200j) / ((float) e.f12201n)) * 100.0f));
                    }
                    C40917h.this.f110097g.remove(e.f12195e);
                    C40917h.this.f110098h.remove(e.f12195e);
                    C40917h.this.f110211a.mo63944g(this.f110103d);
                }
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.downloader.model.h$d */
    public class C40921d implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ long f110105d;

        public C40921d(long j) {
            this.f110105d = j;
        }

        public void run() {
            Log.m105924i("MicroMsg.FileCDNDownloader", JsApiPauseDownloadTask.NAME);
            FileDownloadTaskInfo e = C40917h.this.mo62095e(this.f110105d);
            if (e != null && e.f12196f == 1) {
                C48520a f = C48520a.m53896f();
                String str = e.f12195e;
                synchronized (f) {
                    Log.m105924i("MicroMsg.CDNDownloadClient", "pauseDownloadTask: " + str);
                    if (Util.isNullOrNil(str)) {
                        Log.m105928w("MicroMsg.CDNDownloadClient", "pauseDownloadTask, url invalid");
                    } else {
                        f.mo73159h(new CDNTaskInfo(str));
                        C47731a aVar = f.f129776e;
                        if (aVar != null) {
                            try {
                                aVar.mo63878IC(str);
                            } catch (RemoteException e2) {
                                Log.m105920e("MicroMsg.CDNDownloadClient", "pauseDownloadTask, " + e2.getMessage());
                            }
                        }
                        Log.m105924i("MicroMsg.CDNDownloadClient", "pauseDownloadTask false, service interface is null");
                    }
                }
                C40917h.this.mo63931g(e.f12195e);
                C53736a c = C40933j.m44314c(this.f110105d);
                if (c != null) {
                    c.field_finishTime = System.currentTimeMillis();
                    c.field_status = 2;
                    c.field_downloadedSize = e.f12200j;
                    C40933j.m44322k(c);
                    Long valueOf = Long.valueOf(Util.nullAs(C40917h.this.f110098h.get(e.f12195e), c.field_startTime));
                    if (valueOf != null) {
                        Long valueOf2 = Long.valueOf(Util.nullAs(C40917h.this.f110097g.get(e.f12195e), c.field_startSize));
                        long currentTimeMillis = System.currentTimeMillis() - valueOf.longValue();
                        C0418d.m366a(c.field_downloadId, ((((float) (c.field_downloadedSize - valueOf2.longValue())) * 1000.0f) / ((float) currentTimeMillis)) / 1048576.0f, (int) ((((float) c.field_downloadedSize) / ((float) c.field_totalSize)) * 100.0f));
                    }
                }
                C40917h.this.f110097g.remove(e.f12195e);
                C40917h.this.f110098h.remove(e.f12195e);
                C40917h.this.f110211a.mo63942e(this.f110105d);
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.downloader.model.h$e */
    public class C40922e implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ C53736a f110107d;

        /* renamed from: e */
        public final /* synthetic */ boolean f110108e;

        /* renamed from: f */
        public final /* synthetic */ long f110109f;

        public C40922e(C53736a aVar, boolean z, long j) {
            this.f110107d = aVar;
            this.f110108e = z;
            this.f110109f = j;
        }

        public void run() {
            int i;
            C53736a aVar = this.f110107d;
            C40910b.m44270c(aVar.field_appId, aVar.field_downloadUrl, aVar.field_secondaryUrl);
            C46848g.Cx0().mo69342c(this.f110107d.field_appId);
            C48520a f = C48520a.m53896f();
            CDNTaskInfo f2 = C40917h.m44285f(C40917h.this, this.f110107d);
            synchronized (f) {
                if (Util.isNullOrNil(f2.f109964e)) {
                    Log.m105928w("MicroMsg.CDNDownloadClient", "resumeDownloadTask, info invalid");
                    i = -1;
                } else {
                    Log.m105924i("MicroMsg.CDNDownloadClient", "resumeDownloadTask: " + f2.f109964e);
                    if (((HashSet) f.f129778g).contains(f2)) {
                        Log.m105924i("MicroMsg.CDNDownloadClient", "resumeDownloadTask, already in running");
                        i = -2;
                    } else {
                        CDNTaskState g = f.mo73158g(f2.f109964e);
                        if (g == null || g.f109974d != 104 || !C86013q1.m106450k(f2.f109966g)) {
                            f2.f109973q = true;
                            C47731a aVar2 = f.f129776e;
                            if (aVar2 != null) {
                                try {
                                    i = aVar2.r90(f2);
                                    ((C48520a.C48524d) f.f129782n).mo72549A9(f2.f109965f, 1, 0, "");
                                    if (i == 0 || i == -2) {
                                        f.mo73155c(f2);
                                    }
                                } catch (RemoteException e) {
                                    Log.m105920e("MicroMsg.CDNDownloadClient", "resumeDownloadTask, " + e.getMessage());
                                }
                            }
                            f.mo73155c(f2);
                            f.mo73156d();
                            i = 0;
                        } else {
                            Log.m105924i("MicroMsg.CDNDownloadClient", "resumeDownloadTask, has download success");
                            i = 1;
                        }
                    }
                }
            }
            Log.m105924i("MicroMsg.FileCDNDownloader", "resumeDownloadTask: " + i);
            this.f110107d.field_startTime = System.currentTimeMillis();
            C53736a aVar3 = this.f110107d;
            aVar3.field_startSize = aVar3.field_downloadedSize;
            aVar3.field_startState = 1;
            if (i == 0) {
                aVar3.field_status = 1;
                aVar3.field_errCode = 0;
                C40933j.m44322k(aVar3);
                if (this.f110108e) {
                    C40917h.this.f110211a.mo63945h(this.f110109f, this.f110107d.field_filePath);
                }
                C53736a aVar4 = this.f110107d;
                long j = aVar4.field_totalSize;
                long j2 = 0;
                if (j != 0) {
                    j2 = (aVar4.field_downloadedSize * 100) / j;
                }
                Log.m105919d("MicroMsg.FileCDNDownloader", "resumeDownloadTask, progress = %d, downloadedSize = %d, totalSize = %d", Long.valueOf(j2), Long.valueOf(this.f110107d.field_downloadedSize), Long.valueOf(this.f110107d.field_totalSize));
                C40917h.this.mo63933i(this.f110107d.field_downloadUrl, 1, (int) j2, true, false);
            } else if (i == -2) {
                aVar3.field_status = 1;
                aVar3.field_errCode = 0;
                C40933j.m44322k(aVar3);
            } else if (i == 1) {
                int i2 = aVar3.field_status;
                if (i2 != 6 && i2 != 3) {
                    aVar3.field_status = 6;
                    long j3 = aVar3.field_totalSize;
                    aVar3.field_downloadedSize = j3;
                    aVar3.field_startSize = j3;
                    long currentTimeMillis = System.currentTimeMillis();
                    aVar3.field_finishTime = currentTimeMillis;
                    aVar3.field_startTime = currentTimeMillis;
                    C40933j.m44322k(this.f110107d);
                    C40917h.this.f110211a.mo63939b(this.f110107d.field_downloadId);
                    Intent intent = new Intent();
                    intent.putExtra(FileDownloadService.f110081n, 1);
                    intent.setClass(C40917h.this.f110092b, FileDownloadService.class);
                    intent.putExtra(FileDownloadService.f110080j, this.f110107d.field_downloadId);
                    try {
                        C88144b.m109807y(intent);
                    } catch (Exception e2) {
                        Log.m105920e("MicroMsg.FileCDNDownloader", e2.getMessage());
                    }
                }
            } else {
                aVar3.field_status = 4;
                aVar3.field_errCode = 202;
                C40933j.m44322k(aVar3);
                C40917h.this.f110211a.mo63940c(this.f110109f, this.f110107d.field_errCode, false);
            }
        }
    }

    public C40917h(C40923i iVar) {
        super(iVar);
        C48520a.m53896f().f129779h = this.f110099i;
    }

    /* renamed from: f */
    public static CDNTaskInfo m44285f(C40917h hVar, C53736a aVar) {
        hVar.getClass();
        CDNTaskInfo cDNTaskInfo = new CDNTaskInfo();
        cDNTaskInfo.f109963d = true;
        String str = aVar.field_downloadUrl;
        cDNTaskInfo.f109965f = str;
        cDNTaskInfo.f109964e = str;
        cDNTaskInfo.f109966g = aVar.field_filePath;
        cDNTaskInfo.f109967h = aVar.field_secondaryUrl;
        cDNTaskInfo.f109969j = 15;
        cDNTaskInfo.f109970n = 3600;
        cDNTaskInfo.f109971o = true;
        cDNTaskInfo.f109972p = aVar.field_downloadInWifi;
        JSONObject jSONObject = new JSONObject();
        try {
            long j = aVar.field_fileSize;
            if (j > 0) {
                jSONObject.put("Content-Length", j);
            }
            cDNTaskInfo.f109968i = jSONObject.toString();
        } catch (JSONException e) {
            Log.m105920e("MicroMsg.FileCDNDownloader", "addVerifyHeaders: " + e.getMessage());
        }
        return cDNTaskInfo;
    }

    /* renamed from: a */
    public boolean mo62091a(long j) {
        return mo63932h(j, true);
    }

    /* renamed from: b */
    public long mo62092b(C40939n nVar) {
        if (nVar == null || Util.isNullOrNil(nVar.f110176a)) {
            Log.m105920e("MicroMsg.FileCDNDownloader", "Invalid Request");
            return -1;
        }
        Log.m105925i("MicroMsg.FileCDNDownloader", "addDownloadTask, appId : %s", nVar.f110182g);
        String str = nVar.f110176a;
        C53736a e = C40933j.m44316e(str);
        if (e == null) {
            e = C40933j.m44315d(nVar.f110182g);
        }
        FileDownloadTaskInfo fileDownloadTaskInfo = null;
        if (e != null) {
            FileDownloadTaskInfo e2 = mo62095e(e.field_downloadId);
            if (e2 != null) {
                Log.m105924i("MicroMsg.FileCDNDownloader", "addDownloadTask, status = " + e2.f12196f);
                int i = e2.f12196f;
                if (i == 1 || i == 6) {
                    return e2.f12194d;
                }
                if (i == 3) {
                    if (e.field_autoInstall) {
                        C39890a.m42668a(e2.f12194d, false, (C47223a) null);
                    }
                    return e2.f12194d;
                }
            }
            fileDownloadTaskInfo = e2;
        }
        if (e != null) {
            C40933j.m44319h(e.field_downloadId);
        }
        C53736a b = C40940o.m44349b(nVar);
        if (!nVar.f110188m || e == null) {
            b.field_downloadId = System.currentTimeMillis();
        } else {
            b.field_downloadId = e.field_downloadId;
        }
        b.field_downloaderType = 3;
        if (!Util.isNullOrNil(nVar.f110201z)) {
            b.field_filePath = nVar.f110201z;
        } else {
            String mD5String = MD5Util.getMD5String(str);
            b.field_filePath = f110091j + mD5String;
        }
        String str2 = b.field_filePath;
        C86009m1 m1Var = new C86009m1(str2.substring(0, str2.lastIndexOf("/") + 1));
        if (!m1Var.mo119967g()) {
            if (!m1Var.mo119974l().mo119967g()) {
                C86009m1 l = m1Var.mo119974l();
                C86009m1 m1Var2 = new C86009m1(l.mo119971i());
                if (m1Var2.mo119987x()) {
                    m1Var2.mo119988y(l);
                } else {
                    Log.m105921e("MicroMsg.FileCDNDownloader", "mkdir parent error, %s", l.mo119971i());
                }
            }
            Log.m105925i("MicroMsg.FileCDNDownloader", "Make download dir result: %b", Boolean.valueOf(m1Var.mo119987x()));
        }
        if (fileDownloadTaskInfo != null) {
            String str3 = b.field_filePath;
            String str4 = fileDownloadTaskInfo.f12197g;
            if (!(str3 == null || str4 == null || str3.equals(str4))) {
                Log.m105925i("MicroMsg.FileCDNDownloader", "removeLastFile, new File = %s, oldFile = %s", str3, str4);
                C86009m1 m1Var3 = new C86009m1(str4);
                if (m1Var3.mo119967g()) {
                    Log.m105925i("MicroMsg.FileCDNDownloader", "Delete previous file result: %b", Boolean.valueOf(m1Var3.mo119966f()));
                }
            }
            int i2 = fileDownloadTaskInfo.f12196f;
            if (i2 == 2) {
                b.field_startState = 1;
            } else if (i2 == 4) {
                b.field_startState = 2;
            } else {
                b.field_startState = 0;
            }
            b.field_startSize = fileDownloadTaskInfo.f12200j;
            Log.m105924i("MicroMsg.FileCDNDownloader", "addDownloadTask, startSize = " + fileDownloadTaskInfo.f12200j);
        } else {
            b.field_startState = 0;
        }
        if (!nVar.f110189n || NetStatusUtil.isWifi(MMApplicationContext.getContext())) {
            if (NetStatusUtil.isWifi(MMApplicationContext.getContext())) {
                b.field_downloadInWifi = true;
            }
            return mo62094d(b);
        }
        Log.m105924i("MicroMsg.FileCDNDownloader", "downloadInWifi, not in wifi");
        b.field_status = 0;
        b.field_downloadInWifi = true;
        C40933j.m44312a(b);
        return b.field_downloadId;
    }

    /* renamed from: c */
    public boolean mo62093c(long j) {
        ((C119157j) C119157j.f356862d).mo183875f(new C40921d(j));
        return true;
    }

    /* renamed from: d */
    public long mo62094d(C53736a aVar) {
        C9457a.m9137a(new C40919b(aVar));
        return aVar.field_downloadId;
    }

    /* renamed from: e */
    public FileDownloadTaskInfo mo62095e(long j) {
        C53736a c = C40933j.m44314c(j);
        if (c == null) {
            return null;
        }
        Log.m105925i("MicroMsg.FileCDNDownloader", "queryDownloadTask, downloadid ; %d, appId : %s, status : %d", Long.valueOf(c.field_downloadId), c.field_appId, Integer.valueOf(c.field_status));
        FileDownloadTaskInfo fileDownloadTaskInfo = new FileDownloadTaskInfo();
        CDNTaskState g = Thread.currentThread().getId() == Looper.getMainLooper().getThread().getId() ? C48520a.m53896f().mo73158g(c.field_downloadUrl) : C48520a.m53896f().mo73158g(c.field_downloadUrl);
        if (g != null) {
            Log.m105925i("MicroMsg.FileCDNDownloader", "queryDownloadTask, cdntaskstate: %d", Integer.valueOf(g.f109974d));
            switch (g.f109974d) {
                case 100:
                    fileDownloadTaskInfo.f12196f = 1;
                    fileDownloadTaskInfo.f12200j = g.f109975e;
                    fileDownloadTaskInfo.f12201n = g.f109976f;
                    break;
                case 101:
                    fileDownloadTaskInfo.f12196f = 1;
                    fileDownloadTaskInfo.f12200j = c.field_downloadedSize;
                    fileDownloadTaskInfo.f12201n = c.field_totalSize;
                    break;
                case 102:
                    fileDownloadTaskInfo.f12196f = 2;
                    fileDownloadTaskInfo.f12200j = g.f109975e;
                    fileDownloadTaskInfo.f12201n = g.f109976f;
                    break;
                case 104:
                    if (C86013q1.m106450k(c.field_filePath)) {
                        if (c.field_status != 6) {
                            fileDownloadTaskInfo.f12196f = 3;
                            break;
                        } else {
                            fileDownloadTaskInfo.f12196f = 6;
                            break;
                        }
                    } else {
                        fileDownloadTaskInfo.f12196f = 0;
                        break;
                    }
                default:
                    int i = c.field_status;
                    if (i == 1) {
                        fileDownloadTaskInfo.f12196f = 2;
                    } else {
                        fileDownloadTaskInfo.f12196f = i;
                    }
                    fileDownloadTaskInfo.f12200j = c.field_downloadedSize;
                    fileDownloadTaskInfo.f12201n = c.field_totalSize;
                    break;
            }
            long abs = Math.abs(fileDownloadTaskInfo.f12201n);
            fileDownloadTaskInfo.f12201n = abs;
            long j2 = fileDownloadTaskInfo.f12200j;
            if (j2 > abs) {
                j2 = abs;
            }
            fileDownloadTaskInfo.f12200j = j2;
            c.field_downloadedSize = j2;
            c.field_totalSize = abs;
        } else {
            int i2 = c.field_status;
            if (i2 == 1) {
                fileDownloadTaskInfo.f12196f = 0;
            } else {
                fileDownloadTaskInfo.f12196f = i2;
            }
            if (!C86013q1.m106450k(c.field_filePath)) {
                fileDownloadTaskInfo.f12200j = 0;
                fileDownloadTaskInfo.f12201n = 0;
            } else {
                fileDownloadTaskInfo.f12200j = c.field_downloadedSize;
                fileDownloadTaskInfo.f12201n = c.field_totalSize;
            }
        }
        int i3 = fileDownloadTaskInfo.f12196f;
        if ((i3 == 6 || i3 == 3) && !C86013q1.m106450k(c.field_filePath)) {
            fileDownloadTaskInfo.f12196f = 0;
        }
        if (fileDownloadTaskInfo.f12196f == 6) {
            if (!((HashSet) C40934k.f110154a).contains(Long.valueOf(fileDownloadTaskInfo.f12194d))) {
                fileDownloadTaskInfo.f12196f = 3;
            }
        }
        fileDownloadTaskInfo.f12194d = j;
        fileDownloadTaskInfo.f12203p = c.field_downloaderType;
        fileDownloadTaskInfo.f12202o = c.field_autoDownload;
        fileDownloadTaskInfo.f12197g = c.field_filePath;
        fileDownloadTaskInfo.f12195e = c.field_downloadUrl;
        fileDownloadTaskInfo.f12198h = c.field_md5;
        int i4 = c.field_status;
        int i5 = fileDownloadTaskInfo.f12196f;
        if (i4 != i5 && (i5 == 1 || i4 == 1)) {
            c.field_status = i5;
            C40933j.m44322k(c);
        }
        Log.m105925i("MicroMsg.FileCDNDownloader", "queryDownloadTask, url: %s, status = %d, downloadedSize = %d, totalSize = %d", fileDownloadTaskInfo.f12195e, Integer.valueOf(fileDownloadTaskInfo.f12196f), Long.valueOf(fileDownloadTaskInfo.f12200j), Long.valueOf(fileDownloadTaskInfo.f12201n));
        return fileDownloadTaskInfo;
    }

    /* renamed from: g */
    public final void mo63931g(String str) {
        synchronized (this.f110093c) {
            Integer num = this.f110096f.get(str);
            if (num == null) {
                Log.m105924i("MicroMsg.FileCDNDownloader", "No notification id found");
                return;
            }
            ((MMNotification) ((C79690d) C86312j.m106911c(C79690d.class)).mo109806kA()).mo93207e(num.intValue());
            Log.m105924i("MicroMsg.FileCDNDownloader", "cancelNotification, id = " + num);
            this.f110096f.remove(str);
        }
    }

    /* renamed from: h */
    public boolean mo63932h(long j, boolean z) {
        FileDownloadTaskInfo e;
        C53736a c = C40933j.m44314c(j);
        if (c == null || (e = mo62095e(c.field_downloadId)) == null) {
            return false;
        }
        int i = e.f12196f;
        if (!(i == 1 || i == 6)) {
            if (i == 3) {
                if (c.field_autoInstall) {
                    C39890a.m42668a(e.f12194d, false, (C47223a) null);
                }
                return true;
            } else if ((c.field_reserveInWifi || c.field_downloadInWifi) && !NetStatusUtil.isWifi(MMApplicationContext.getContext())) {
                Log.m105924i("MicroMsg.FileCDNDownloader", "resumeDownloadTask, downloadInWifi, not wifi");
                return true;
            } else {
                if (NetStatusUtil.isWifi(MMApplicationContext.getContext())) {
                    c.field_downloadInWifi = true;
                }
                C9457a.m9137a(new C40922e(c, z, j));
            }
        }
        return true;
    }

    /* renamed from: i */
    public final void mo63933i(String str, int i, int i2, boolean z, boolean z2) {
        Class cls = C79690d.class;
        boolean z3 = false;
        Log.m105919d("MicroMsg.FileCDNDownloader", "state = %d, progress = %d, firstShown = %b", Integer.valueOf(i), Integer.valueOf(i2), Boolean.valueOf(z));
        C53736a e = C40933j.m44316e(str);
        if (e == null) {
            Log.m105920e("MicroMsg.FileCDNDownloader", "updateNotification failed: null task info");
        } else if (e.field_showNotification) {
            C90116e.C90121c cVar = new C90116e.C90121c(this.f110092b, "reminder_channel_id");
            if (z) {
                long currentTimeMillis = System.currentTimeMillis();
                this.f110094d.put(str, Long.valueOf(currentTimeMillis));
                cVar.f258814z.when = currentTimeMillis;
            } else {
                Long l = this.f110094d.get(str);
                if (l != null) {
                    cVar.f258814z.when = l.longValue();
                } else {
                    Long valueOf = Long.valueOf(System.currentTimeMillis());
                    this.f110094d.put(str, valueOf);
                    cVar.f258814z.when = valueOf.longValue();
                }
            }
            if (!Util.isNullOrNil(e.field_notificationTitle)) {
                cVar.mo124383h(e.field_notificationTitle + " · " + MMApplicationContext.getContext().getString(C0966R.string.cud));
            } else {
                C44561j i3 = C44565l.m48989i(e.field_appId, false, false);
                if (i3 == null || Util.isNullOrNil(i3.field_appName)) {
                    cVar.mo124383h(e.field_fileName);
                } else {
                    cVar.mo124383h(i3.field_appName);
                }
            }
            if (i == 1) {
                cVar.f258814z.icon = 17301633;
                if (i2 == 0) {
                    i2 = 1;
                }
                if (i2 == 0) {
                    z3 = true;
                }
                cVar.mo124386k(100, i2, z3);
                if (e.field_reserveInWifi) {
                    cVar.mo124382g(this.f110092b.getString(C0966R.string.cuk) + "·" + this.f110092b.getString(C0966R.string.cui));
                } else {
                    cVar.mo124382g(this.f110092b.getString(C0966R.string.cui));
                }
                cVar.mo124384i(2, true);
                Intent intent = new Intent(this.f110092b, FileDownloadConfirmUI.class);
                intent.putExtra("extra_download_id", e.field_downloadId);
                cVar.f258795g = PendingIntent.getActivity(this.f110092b, (int) System.currentTimeMillis(), intent, 268435456);
            } else if (i != 4) {
                mo63931g(str);
                return;
            } else {
                cVar.f258814z.icon = 17301634;
                cVar.mo124380e(true);
                cVar.f258795g = PendingIntent.getActivity(MMApplicationContext.getContext(), 0, new Intent(), 0);
                if (z2) {
                    cVar.mo124382g(this.f110092b.getString(C0966R.string.cug));
                } else {
                    cVar.mo124382g(this.f110092b.getString(C0966R.string.cuf));
                }
            }
            synchronized (this.f110093c) {
                Integer num = this.f110096f.get(str);
                if (num == null) {
                    this.f110096f.put(str, Integer.valueOf(((MMNotification) ((C79690d) C86312j.m106911c(cls)).mo109806kA()).mo93214k(cVar.mo124378b(), true)));
                } else {
                    ((MMNotification) ((C79690d) C86312j.m106911c(cls)).mo109806kA()).mo93215l(num.intValue(), cVar.mo124378b(), true);
                }
                if (i == 4) {
                    this.f110096f.remove(str);
                }
            }
        }
    }

    public int removeDownloadTask(long j) {
        C9457a.m9137a(new C40920c(j));
        return 1;
    }
}

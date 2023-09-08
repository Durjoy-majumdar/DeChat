package p228rp;

import a51.C39487a;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.database.Cursor;
import com.tencent.p014mm.app.C80625v0;
import com.tencent.p014mm.plugin.downloader.api.C40910b;
import com.tencent.p014mm.plugin.downloader.event.DownloadEventBus;
import com.tencent.p014mm.plugin.downloader.event.DownloadEventBus$$b;
import com.tencent.p014mm.plugin.downloader.model.C40917h;
import com.tencent.p014mm.plugin.downloader.model.C40923i;
import com.tencent.p014mm.plugin.downloader.model.C40933j;
import com.tencent.p014mm.plugin.downloader.model.C40935l;
import com.tencent.p014mm.plugin.downloader.model.FileDownloadService;
import com.tencent.p014mm.plugin.downloader.model.FileDownloadTaskInfo;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.MMHandler;
import com.tencent.p014mm.sdk.platformtools.NetStatusUtil;
import com.tencent.p014mm.sdk.platformtools.Util;
import di3.C86301e;
import di3.C86312j;
import ei3.C86522b;
import h81.C32735h;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArraySet;
import ke3.C88144b;
import s41.C48225a;
import sx1.C48493b;
import v10.C52735e;
import w01.C53064a;
import x41.C53286a;
import y41.C53491a;
import y41.C53493b;
import z41.C53736a;
import z41.C53737b;

@C86522b(onProcess = {C80625v0.MATCH_MM})
/* renamed from: rp.i */
public class C48065i extends C86301e {

    /* renamed from: d */
    public final C40917h[] f128913d = {null};

    /* renamed from: rp.i$a */
    public class C48066a implements C48493b.C48494a {

        /* renamed from: rp.i$a$a */
        public class C48067a implements Runnable {
            public C48067a() {
            }

            public void run() {
                LinkedList linkedList;
                C48065i.this.getClass();
                C53737b f = C40933j.m44317f();
                if (f == null) {
                    linkedList = null;
                } else {
                    Log.m105924i("MicroMsg.FileDownloadInfoStorage", "getDownloadInWifiPauseTasks, sql = select * from FileDownloadInfo where status=6");
                    Cursor rawQuery = f.rawQuery("select * from FileDownloadInfo where status=6", new String[0]);
                    LinkedList linkedList2 = new LinkedList();
                    if (rawQuery != null) {
                        while (rawQuery.moveToNext()) {
                            C53736a aVar = new C53736a();
                            aVar.convertFrom(rawQuery);
                            linkedList2.add(aVar);
                        }
                        rawQuery.close();
                    }
                    linkedList = linkedList2;
                }
                if (!Util.isNullOrNil((List) linkedList)) {
                    Iterator it = linkedList.iterator();
                    while (it.hasNext()) {
                        Intent intent = new Intent();
                        intent.putExtra(FileDownloadService.f110081n, 1);
                        intent.setClass(MMApplicationContext.getContext(), FileDownloadService.class);
                        intent.putExtra(FileDownloadService.f110080j, ((C53736a) it.next()).field_downloadId);
                        try {
                            C88144b.m109807y(intent);
                        } catch (Exception e) {
                            Log.m105920e("MicroMsg.DownloaderFeatureService", e.getMessage());
                        }
                        C115669n.INSTANCE.idkeyStat(710, 25, 1, false);
                    }
                }
            }
        }

        public C48066a() {
        }

        /* renamed from: a */
        public void mo65649a() {
            if (C53064a.f148102a == null) {
                synchronized (C53064a.f148103b) {
                    if (C53064a.f148102a == null) {
                        C53064a.f148102a = new MMHandler("CDNDownloader#WorkThread");
                    }
                }
            }
            C53064a.f148102a.postDelayed(new C48067a(), 0);
        }
    }

    /* renamed from: rp.i$b */
    public class C48068b implements C48493b.C48494a {

        /* renamed from: rp.i$b$a */
        public class C48069a implements Runnable {
            public C48069a() {
            }

            public void run() {
                C48065i iVar = C48065i.this;
                iVar.getClass();
                Log.m105924i("MicroMsg.DownloaderFeatureService", "gamelog.restart,resumeDownloadTaskWhenProcessRestart()");
                C53737b f = C40933j.m44317f();
                LinkedList linkedList = null;
                if (f != null) {
                    Log.m105924i("MicroMsg.FileDownloadInfoStorage", "getRunningDownloadInfos: select * from FileDownloadInfo where status=1");
                    Cursor rawQuery = f.rawQuery("select * from FileDownloadInfo where status=1", new String[0]);
                    if (rawQuery == null) {
                        Log.m105924i("MicroMsg.FileDownloadInfoStorage", "cursor is null");
                    } else {
                        linkedList = new LinkedList();
                        while (rawQuery.moveToNext()) {
                            C53736a aVar = new C53736a();
                            aVar.convertFrom(rawQuery);
                            linkedList.add(aVar);
                        }
                        rawQuery.close();
                    }
                }
                if (!Util.isNullOrNil((List) linkedList)) {
                    Iterator it = linkedList.iterator();
                    while (it.hasNext()) {
                        C53736a aVar2 = (C53736a) it.next();
                        Log.m105925i("MicroMsg.DownloaderFeatureService", "resumeDownloadTaskWhenProcessRestart, downloadid : %d, appid : %s, status : %d", Long.valueOf(aVar2.field_downloadId), aVar2.field_appId, Integer.valueOf(aVar2.field_status));
                        if (C40933j.m44318g(aVar2.field_downloadUrl)) {
                            Log.m105924i("MicroMsg.DownloaderFeatureService", "hasDuplicatedTask");
                            C40933j.m44321j(aVar2.field_downloadUrl);
                            C115669n.INSTANCE.idkeyStat(710, 26, 1, false);
                        } else {
                            C53493b bVar = new C53493b();
                            bVar.mo74165a(aVar2);
                            C53491a.m60013c(20, bVar);
                            FileDownloadTaskInfo n = C40935l.m44326g().mo63966n(aVar2.field_downloadId);
                            int i = n.f12196f;
                            if (i == 3) {
                                Log.m105924i("MicroMsg.DownloaderFeatureService", "has download finish");
                                aVar2.field_finishTime = System.currentTimeMillis();
                                long j = aVar2.field_totalSize;
                                aVar2.field_downloadedSize = j;
                                aVar2.field_status = 6;
                                Log.m105925i("MicroMsg.DownloaderFeatureService", "download succeed, downloadedSize = %d, startSize = %d", Long.valueOf(j), Long.valueOf(aVar2.field_startSize));
                                C40933j.m44322k(aVar2);
                                C40935l g = C40935l.m44326g();
                                long j2 = aVar2.field_downloadId;
                                C40923i iVar2 = g.f110163f;
                                if (iVar2 != null) {
                                    iVar2.mo63939b(j2);
                                }
                                Intent intent = new Intent();
                                intent.putExtra(FileDownloadService.f110081n, 1);
                                intent.setClass(MMApplicationContext.getContext(), FileDownloadService.class);
                                intent.putExtra(FileDownloadService.f110080j, aVar2.field_downloadId);
                                try {
                                    C88144b.m109807y(intent);
                                } catch (Exception e) {
                                    Log.m105920e("MicroMsg.DownloaderFeatureService", e.getMessage());
                                }
                                C115669n.INSTANCE.idkeyStat(710, 12, 1, false);
                            } else if (i != 1) {
                                C115669n nVar = C115669n.INSTANCE;
                                nVar.idkeyStat(710, 14, 1, false);
                                Log.m105924i("MicroMsg.DownloaderFeatureService", "download fail, all process dead, appId: " + aVar2.field_appId);
                                long currentTimeMillis = (System.currentTimeMillis() - aVar2.field_updateTime) / 1000;
                                Log.m105924i("MicroMsg.DownloaderFeatureService", "lastTime = " + currentTimeMillis);
                                if (currentTimeMillis <= 86400) {
                                    boolean fe = ((C52735e) C86312j.m106911c(C52735e.class)).mo61269fe(C32735h.C32737c.clicfg_download_resume_not_in_wifi, false);
                                    Log.m105925i("MicroMsg.DownloaderFeatureService", "in half hour, net: %s, downloadInWifi: %b, expt: %b", NetStatusUtil.getNetTypeString(MMApplicationContext.getContext()), Boolean.valueOf(n.f12204q), Boolean.valueOf(fe));
                                    if (NetStatusUtil.isWifi(MMApplicationContext.getContext())) {
                                        Log.m105924i("MicroMsg.DownloaderFeatureService", "in one day, in wifi, restart");
                                        iVar.vx0(aVar2);
                                        nVar.idkeyStat(710, 15, 1, false);
                                    } else if (n.f12204q || !fe) {
                                        nVar.idkeyStat(710, 17, 1, false);
                                        aVar2.field_status = 2;
                                        C40933j.m44322k(aVar2);
                                    } else {
                                        Log.m105924i("MicroMsg.DownloaderFeatureService", "download not in wifi");
                                        iVar.vx0(aVar2);
                                        nVar.idkeyStat(710, 19, 1, false);
                                    }
                                } else {
                                    nVar.idkeyStat(710, 16, 1, false);
                                    if (!NetStatusUtil.isWifi(MMApplicationContext.getContext())) {
                                        nVar.idkeyStat(710, 17, 1, false);
                                    }
                                    aVar2.field_status = 2;
                                    C40933j.m44322k(aVar2);
                                    C40935l g2 = C40935l.m44326g();
                                    long j3 = aVar2.field_downloadId;
                                    int i2 = aVar2.field_errCode;
                                    C40923i iVar3 = g2.f110163f;
                                    if (iVar3 != null) {
                                        iVar3.mo63940c(j3, i2, false);
                                    }
                                }
                            } else {
                                Log.m105924i("MicroMsg.DownloaderFeatureService", "download process alive, still downloading: " + aVar2.field_appId);
                                C115669n.INSTANCE.idkeyStat(710, 13, 1, false);
                            }
                        }
                    }
                }
            }
        }

        public C48068b() {
        }

        /* renamed from: a */
        public void mo65649a() {
            if (C53064a.f148102a == null) {
                synchronized (C53064a.f148103b) {
                    if (C53064a.f148102a == null) {
                        C53064a.f148102a = new MMHandler("CDNDownloader#WorkThread");
                    }
                }
            }
            C53064a.f148102a.postDelayed(new C48069a(), 0);
        }
    }

    public void onAccountInitialized(Context context) {
        if (DownloadEventBus.f110051d == null) {
            DownloadEventBus.f110051d = new DownloadEventBus();
        }
        if (DownloadEventBus.f110052e == null) {
            DownloadEventBus.f110052e = new DownloadEventBus$$b((DownloadEventBus.C409121) null);
        }
        C40935l.m44326g().mo63955a(DownloadEventBus.f110051d);
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.intent.action.PACKAGE_ADDED");
        intentFilter.addAction("android.intent.action.PACKAGE_REPLACED");
        intentFilter.addDataScheme("package");
        MMApplicationContext.getContext().registerReceiver(DownloadEventBus.f110052e, intentFilter);
        DownloadEventBus.f110055h.alive();
        C48493b.m53856b().mo73124a("md5_check", new C48066a());
        C48493b.m53856b().mo73124a("download_resume", new C48068b());
        if (C53286a.f148883a == null) {
            C53286a.f148883a = new C53286a.C53288b((C53286a.C53287a) null);
        }
        IntentFilter intentFilter2 = new IntentFilter();
        intentFilter2.addAction("android.net.wifi.STATE_CHANGE");
        intentFilter2.addAction("android.net.wifi.WIFI_STATE_CHANGED");
        intentFilter2.addAction("android.net.conn.CONNECTIVITY_CHANGE");
        try {
            MMApplicationContext.getContext().registerReceiver(C53286a.f148883a, intentFilter2);
        } catch (Exception e) {
            Log.m105920e("MicroMsg.Downloader.NetWorkManager", e.getMessage());
        }
    }

    public void onAccountReleased(Context context) {
        Log.m105924i("MicroMsg.DownloaderFeatureService", "onAccountRelease");
        if (C53286a.f148883a != null) {
            try {
                MMApplicationContext.getContext().unregisterReceiver(C53286a.f148883a);
            } catch (Exception e) {
                Log.m105920e("MicroMsg.Downloader.NetWorkManager", e.getMessage());
            }
        }
        C53286a.f148883a = null;
        DownloadEventBus downloadEventBus = DownloadEventBus.f110051d;
        C40935l.m44326g().mo63969q(DownloadEventBus.f110051d);
        MMApplicationContext.getContext().unregisterReceiver(DownloadEventBus.f110052e);
        DownloadEventBus.f110051d = null;
        DownloadEventBus.f110052e = null;
        ((CopyOnWriteArraySet) DownloadEventBus.f110053f).clear();
        DownloadEventBus.f110055h.dead();
        ((ConcurrentHashMap) C40910b.f110050b).clear();
    }

    public void onCreate(Context context) {
        Log.m105918d("MicroMsg.DownloaderFeatureService", "execute");
        new C48225a(C40917h.f110091j).startWatching();
    }

    public final void vx0(C53736a aVar) {
        aVar.field_downloadType = 3;
        C40933j.m44322k(aVar);
        C40935l g = C40935l.m44326g();
        long j = aVar.field_downloadId;
        g.getClass();
        Log.m105924i("MicroMsg.FileDownloadManager", "resumeDownloadTask, id = " + j);
        Log.m105924i("MicroMsg.FileDownloadManager", "gamelog.restart,resumeDownloadTaskWhenProcessRestart id = " + j);
        if (!g.mo63963k(j)) {
            C53736a c = C40933j.m44314c(j);
            if (c == null || c.field_downloaderType != 3) {
                C39487a j2 = g.mo63962j();
                j2.getClass();
                Log.m105924i("MicroMsg.FileDownloaderImplTMAssistant", "resumeDownloadTaskWhenProcessRestart, id = " + j);
                j2.mo62098j(j, false);
            } else {
                C40917h e = g.mo63959e();
                e.getClass();
                Log.m105924i("MicroMsg.FileCDNDownloader", "resumeDownloadTaskWhenProcessRestart, id = " + j);
                e.mo63932h(j, false);
            }
        }
        C53493b bVar = new C53493b();
        bVar.mo74165a(aVar);
        C53491a.m60013c(24, bVar);
    }
}

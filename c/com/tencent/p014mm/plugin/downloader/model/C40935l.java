package com.tencent.p014mm.plugin.downloader.model;

import a51.C39487a;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.database.Cursor;
import android.text.TextUtils;
import bd2.C79690d;
import com.tencent.p014mm.autogen.events.GameSilentDownloadEvent;
import com.tencent.p014mm.autogen.events.GetGameDebugDownloaderTypeEvent;
import com.tencent.p014mm.booter.notification.MMNotification;
import com.tencent.p014mm.modelsimple.C40363l0;
import com.tencent.p014mm.network.C114770g;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.pluginsdk.model.app.C44561j;
import com.tencent.p014mm.pluginsdk.model.app.C44563k0;
import com.tencent.p014mm.pluginsdk.model.app.C44565l;
import com.tencent.p014mm.sdk.platformtools.BuildInfo;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.MMHandlerThread;
import com.tencent.p014mm.sdk.platformtools.MultiProcessSharedPreferences;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.vfs.C86013q1;
import di3.C86312j;
import f40.C86709a0;
import f40.C86718e;
import java.io.File;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import lc3.C10485b;
import oa1.C117731d;
import ob0.C11385n;
import ob0.C117747y;
import ob0.C89137b0;
import p1054vg.C90796c;
import p228rp.C48065i;
import p237sp.C13752v;
import p823sg.C48380r;
import p918s2.C90116e;
import z41.C53736a;
import z41.C53737b;

/* renamed from: com.tencent.mm.plugin.downloader.model.l */
public final class C40935l implements C13752v {

    /* renamed from: h */
    public static Map<Long, Long> f110155h = new HashMap();

    /* renamed from: i */
    public static int f110156i = 2;

    /* renamed from: j */
    public static C40935l f110157j;

    /* renamed from: a */
    public C40953v f110158a;

    /* renamed from: b */
    public C40953v f110159b;

    /* renamed from: c */
    public C40953v f110160c;

    /* renamed from: d */
    public C39487a f110161d;

    /* renamed from: e */
    public C40953v f110162e;

    /* renamed from: f */
    public C40923i f110163f;

    /* renamed from: g */
    public boolean f110164g = false;

    /* renamed from: com.tencent.mm.plugin.downloader.model.l$a */
    public class C40936a implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ C53736a f110165d;

        /* renamed from: e */
        public final /* synthetic */ int f110166e;

        /* renamed from: f */
        public final /* synthetic */ Context f110167f;

        /* renamed from: g */
        public final /* synthetic */ boolean f110168g;

        /* renamed from: com.tencent.mm.plugin.downloader.model.l$a$a */
        public class C40937a implements C11385n {
            public C40937a() {
            }

            public void onSceneEnd(int i, int i2, String str, C117747y yVar) {
                yVar.setHasCallbackToQueue(true);
                if (i == 0 && i2 == 0) {
                    String string = MultiProcessSharedPreferences.getSharedPreferences(MMApplicationContext.getContext(), "yyb_pkg_sig_prefs", 4).getString(C40936a.this.f110165d.field_packageName, "");
                    Log.m105925i("MicroMsg.FileDownloadManager", "summertoken onMD5CheckSucceeded sig[%s]", string);
                    if (Util.isNullOrNil(string) || BuildInfo.IS_FLAVOR_RED || BuildInfo.IS_FLAVOR_PURPLE) {
                        C115669n nVar = C115669n.INSTANCE;
                        nVar.idkeyStat(322, 26, 1, false);
                        C53736a aVar = C40936a.this.f110165d;
                        nVar.mo160131h(11098, 4026, String.format("%s,%s", new Object[]{aVar.field_packageName, aVar.field_filePath}));
                    } else {
                        try {
                            String h = C40935l.m44327h(C40936a.this.f110165d.field_filePath);
                            if (!C40936a.this.f110167f.getPackageName().equalsIgnoreCase(h) || C117731d.m166007c().mo182444f("clicfg_appcompat_pkg_sig", "0", false, true).equals("1")) {
                                C90796c.m113868d(new File(C86013q1.m106448i(C40936a.this.f110165d.field_filePath, true)), string);
                            } else {
                                Log.m105924i("MicroMsg.FileDownloadManager", "Skip writing apkSig for v2 signing, pkg = " + h);
                            }
                            Log.m105924i("MicroMsg.FileDownloadManager", "summertoken onMD5CheckSucceeded writeSecurityCode done");
                            C115669n nVar2 = C115669n.INSTANCE;
                            nVar2.idkeyStat(322, 25, 1, false);
                            C53736a aVar2 = C40936a.this.f110165d;
                            nVar2.mo160131h(11098, 4025, String.format("%s,%s,%s", new Object[]{aVar2.field_packageName, aVar2.field_filePath, string}));
                        } catch (Exception e) {
                            Log.m105928w("MicroMsg.FileDownloadManager", "summertoken onMD5CheckSucceeded writeSecurityCode e: " + e.getMessage());
                            C115669n nVar3 = C115669n.INSTANCE;
                            nVar3.idkeyStat(322, 27, 1, false);
                            C53736a aVar3 = C40936a.this.f110165d;
                            nVar3.mo160131h(11098, 4027, String.format("%s,%s,%s", new Object[]{aVar3.field_packageName, aVar3.field_filePath, e.getMessage()}));
                        }
                    }
                } else {
                    Log.m105928w("MicroMsg.FileDownloadManager", "summertoken onMD5CheckSucceeded get pkg sig error");
                    C115669n nVar4 = C115669n.INSTANCE;
                    nVar4.idkeyStat(322, 28, 1, false);
                    C53736a aVar4 = C40936a.this.f110165d;
                    nVar4.mo160131h(11098, 4028, String.format("%s,%s,%d,%d", new Object[]{aVar4.field_packageName, aVar4.field_filePath, Integer.valueOf(i), Integer.valueOf(i2)}));
                    if (!Util.isNullOrNil(C40936a.this.f110165d.field_appId) && C44565l.m48998r(C40936a.this.f110165d.field_appId)) {
                        Log.m105925i("MicroMsg.FileDownloadManager", "onSceneEnd, fail, appId: %s", C40936a.this.f110165d.field_appId);
                        nVar4.idkeyStat(710, 24, 1, false);
                    }
                }
                C40936a aVar5 = C40936a.this;
                C40935l lVar = C40935l.this;
                C53736a aVar6 = aVar5.f110165d;
                boolean z = aVar5.f110168g;
                lVar.getClass();
                MMHandlerThread.postToMainThread(new C40938m(lVar, aVar6, z));
            }
        }

        public C40936a(C53736a aVar, int i, Context context, boolean z) {
            this.f110165d = aVar;
            this.f110166e = i;
            this.f110167f = context;
            this.f110168g = z;
        }

        public void run() {
            C114770g gVar;
            C89137b0 b0Var = C86709a0.m107529k().f251779b;
            if (b0Var != null && (gVar = b0Var.f256809d) != null) {
                new C40363l0(this.f110165d.field_packageName, this.f110166e).doScene(gVar, new C40937a());
            }
        }
    }

    public C40935l() {
        Map<String, ?> all;
        SharedPreferences sharedPreferences = MMApplicationContext.getContext().getSharedPreferences("off_line_download_ids", 0);
        if (!(sharedPreferences == null || (all = sharedPreferences.getAll()) == null || all.size() == 0)) {
            ((HashMap) f110155h).clear();
            for (Map.Entry next : all.entrySet()) {
                if (next != null && !Util.isNullOrNil((String) next.getKey())) {
                    try {
                        long j = Util.getLong((String) next.getKey(), 0);
                        long longValue = ((Long) next.getValue()).longValue();
                        long currentTimeMillis = (System.currentTimeMillis() - j) - j;
                        if (currentTimeMillis > 0 && currentTimeMillis < 86400000) {
                            ((HashMap) f110155h).put(Long.valueOf(j), Long.valueOf(longValue));
                        }
                    } catch (Exception e) {
                        Log.m105920e("MicroMsg.FileDownloadManager", "parse download task failed: " + e.toString());
                        Log.printErrStackTrace("MicroMsg.FileDownloadManager", e, "", new Object[0]);
                    }
                }
            }
            sharedPreferences.edit().clear();
            for (Map.Entry entry : ((HashMap) f110155h).entrySet()) {
                SharedPreferences.Editor edit = sharedPreferences.edit();
                edit.putLong(entry.getKey() + "", ((Long) entry.getValue()).longValue());
            }
            sharedPreferences.edit().commit();
        }
        if (C86709a0.m107523b().mo121114l()) {
            C86709a0.m107523b();
            if (!C86718e.m107551r()) {
                int i = Util.getInt(((C10485b) C86709a0.m107533q(C10485b.class)).vh0().mo107405c("FileDownloaderType"), 2);
                f110156i = i;
                Log.m105925i("MicroMsg.FileDownloadManager", "get downloader type from dynamic config = %d", Integer.valueOf(i));
                this.f110163f = new C40923i();
            }
        }
        Log.m105924i("MicroMsg.FileDownloadManager", "not login, use the default tmassist downloader");
        this.f110163f = new C40923i();
    }

    /* renamed from: g */
    public static C40935l m44326g() {
        if (f110157j == null) {
            f110157j = new C40935l();
        }
        return f110157j;
    }

    /* renamed from: h */
    public static String m44327h(String str) {
        if (Util.isNullOrNil(str)) {
            return "";
        }
        String a = C44563k0.m48976a(str);
        return Util.isNullOrNil(a) ? C44563k0.m48976a(C48380r.m53726a(str, false)) : a;
    }

    /* renamed from: a */
    public void mo63955a(C40952u uVar) {
        this.f110163f.getClass();
        if (uVar != null && !C40923i.f110111a.contains(uVar)) {
            C40923i.f110111a.add(uVar);
        }
    }

    /* renamed from: b */
    public long mo63956b(C40939n nVar) {
        Log.m105925i("MicroMsg.FileDownloadManager", "addDownloadTask, filetype:%d, appId = %s", Integer.valueOf(nVar.f110181f), nVar.f110182g);
        if (nVar.f110181f == 2) {
            if (this.f110162e == null) {
                this.f110162e = new C40947t(this.f110163f);
            }
            return ((C40947t) this.f110162e).mo62092b(nVar);
        }
        mo63971s(nVar.f110182g, nVar);
        if (C86709a0.m107523b().mo121114l()) {
            C86709a0.m107523b();
            if (!C86718e.m107551r()) {
                Log.m105924i("MicroMsg.FileDownloadManager", "account ok, getDownloader");
                return mo63960f().mo62092b(nVar);
            }
        }
        long b = mo63961i().mo62092b(nVar);
        if (b >= 0) {
            ((HashMap) f110155h).put(Long.valueOf(b), 0L);
            SharedPreferences.Editor edit = MMApplicationContext.getContext().getSharedPreferences("off_line_download_ids", 0).edit();
            edit.putLong(b + "", 0).commit();
            Log.m105925i("MicroMsg.FileDownloadManager", "Add id: %d to offline ids", Long.valueOf(b));
            return b;
        }
        Log.m105924i("MicroMsg.FileDownloadManager", "add download task to system downloader failed, use browser to download it");
        if (this.f110159b == null) {
            this.f110159b = new C40946s(this.f110163f);
        }
        ((C40946s) this.f110159b).mo62092b(nVar);
        return b;
    }

    /* renamed from: c */
    public long mo63957c(C40939n nVar) {
        Log.m105925i("MicroMsg.FileDownloadManager", "addDownloadTaskByCDNDownloader, appId = %s", nVar.f110182g);
        mo63971s(nVar.f110182g, nVar);
        if (C86709a0.m107523b().mo121114l()) {
            C86709a0.m107523b();
            if (!C86718e.m107551r()) {
                return mo63959e().mo62092b(nVar);
            }
        }
        long b = mo63961i().mo62092b(nVar);
        if (b >= 0) {
            ((HashMap) f110155h).put(Long.valueOf(b), 0L);
            SharedPreferences.Editor edit = MMApplicationContext.getContext().getSharedPreferences("off_line_download_ids", 0).edit();
            edit.putLong(b + "", 0).commit();
            Log.m105925i("MicroMsg.FileDownloadManager", "Add id: %d to offline ids", Long.valueOf(b));
            return b;
        }
        Log.m105924i("MicroMsg.FileDownloadManager", "add download task to system downloader failed, use browser to download it");
        if (this.f110159b == null) {
            this.f110159b = new C40946s(this.f110163f);
        }
        ((C40946s) this.f110159b).mo62092b(nVar);
        return b;
    }

    /* renamed from: d */
    public LinkedList<FileDownloadTaskInfo> mo63958d(LinkedList<String> linkedList) {
        C53737b f = C40933j.m44317f();
        LinkedList linkedList2 = null;
        if (f != null && !Util.isNullOrNil((List) linkedList)) {
            Cursor rawQuery = f.rawQuery(String.format("select * from %s where %s in %s or %s in %s", new Object[]{"FileDownloadInfo", "appId", f.mo74325Lo(linkedList), "rawAppId", f.mo74325Lo(linkedList)}), new String[0]);
            if (rawQuery != null) {
                linkedList2 = new LinkedList();
                if (rawQuery.moveToFirst()) {
                    do {
                        C53736a aVar = new C53736a();
                        aVar.convertFrom(rawQuery);
                        linkedList2.add(aVar);
                    } while (rawQuery.moveToNext());
                }
                rawQuery.close();
            }
        }
        LinkedList<FileDownloadTaskInfo> linkedList3 = new LinkedList<>();
        if (linkedList2 != null && linkedList2.size() > 0) {
            Iterator it = linkedList2.iterator();
            while (it.hasNext()) {
                C53736a aVar2 = (C53736a) it.next();
                FileDownloadTaskInfo fileDownloadTaskInfo = new FileDownloadTaskInfo();
                if (aVar2.field_status != 3 || C86013q1.m106450k(aVar2.field_filePath)) {
                    fileDownloadTaskInfo.f12196f = aVar2.field_status;
                } else {
                    fileDownloadTaskInfo.f12196f = 0;
                }
                fileDownloadTaskInfo.f12199i = aVar2.field_appId;
                fileDownloadTaskInfo.f12194d = aVar2.field_downloadId;
                fileDownloadTaskInfo.f12195e = aVar2.field_downloadUrl;
                fileDownloadTaskInfo.f12197g = aVar2.field_filePath;
                fileDownloadTaskInfo.f12198h = aVar2.field_md5;
                fileDownloadTaskInfo.f12200j = aVar2.field_downloadedSize;
                fileDownloadTaskInfo.f12201n = aVar2.field_totalSize;
                fileDownloadTaskInfo.f12202o = aVar2.field_autoDownload;
                fileDownloadTaskInfo.f12203p = aVar2.field_downloaderType;
                fileDownloadTaskInfo.f12204q = aVar2.field_downloadInWifi;
                fileDownloadTaskInfo.f12205r = aVar2.field_reserveInWifi;
                linkedList3.add(fileDownloadTaskInfo);
            }
        }
        return linkedList3;
    }

    /* renamed from: e */
    public final C40917h mo63959e() {
        C48065i iVar = (C48065i) C86312j.m106911c(C48065i.class);
        C40923i iVar2 = this.f110163f;
        C40917h[] hVarArr = iVar.f128913d;
        if (hVarArr[0] == null) {
            synchronized (hVarArr) {
                C40917h[] hVarArr2 = iVar.f128913d;
                if (hVarArr2[0] == null) {
                    hVarArr2[0] = new C40917h(iVar2);
                }
            }
        }
        return iVar.f128913d[0];
    }

    /* renamed from: f */
    public final C40953v mo63960f() {
        Log.m105924i("MicroMsg.FileDownloadManager", "mDownloaderType = " + f110156i);
        C40953v vVar = this.f110158a;
        if (vVar != null) {
            return vVar;
        }
        GetGameDebugDownloaderTypeEvent getGameDebugDownloaderTypeEvent = new GetGameDebugDownloaderTypeEvent();
        getGameDebugDownloaderTypeEvent.publish();
        int i = getGameDebugDownloaderTypeEvent.f107595d.f107596a;
        Log.m105924i("MicroMsg.FileDownloadManager", "gameDebugDownloaderType = " + i);
        if (i > 0) {
            f110156i = i;
        }
        if (f110156i == 1) {
            this.f110158a = mo63961i();
        } else {
            this.f110158a = mo63962j();
        }
        return this.f110158a;
    }

    /* renamed from: i */
    public final C40953v mo63961i() {
        if (this.f110160c == null) {
            this.f110160c = new C40941p(this.f110163f);
        }
        return this.f110160c;
    }

    /* renamed from: j */
    public final C39487a mo63962j() {
        if (this.f110161d == null) {
            this.f110161d = new C39487a(this.f110163f);
        }
        return this.f110161d;
    }

    /* renamed from: k */
    public boolean mo63963k(long j) {
        return ((HashMap) f110155h).containsKey(Long.valueOf(j));
    }

    /* renamed from: l */
    public void mo63964l(long j, boolean z) {
        int i;
        Log.m105919d("MicroMsg.FileDownloadManager", "summertoken onMD5CheckSucceeded id[%d], stack[%s]", Long.valueOf(j), Util.getStack());
        Context context = MMApplicationContext.getContext();
        if (mo63963k(j)) {
            this.f110163f.mo63941d(j, mo63966n(j).f12197g, z);
            return;
        }
        C53736a c = C40933j.m44314c(j);
        if (c != null) {
            if (Util.isNullOrNil(c.field_packageName)) {
                String h = m44327h(c.field_filePath);
                if (!Util.isNullOrNil(h)) {
                    c.field_packageName = h;
                    Log.m105925i("MicroMsg.FileDownloadManager", "get package name from file : %s, %s", c.field_filePath, h);
                    C40933j.m44322k(c);
                }
            }
            String str = c.field_filePath;
            if (Util.isNullOrNil(str)) {
                i = 0;
            } else {
                int b = C44563k0.m48977b(str);
                if (b == 0) {
                    b = C44563k0.m48977b(C48380r.m53726a(str, false));
                }
                i = b;
            }
            Log.m105919d("MicroMsg.FileDownloadManager", "summertoken onMD5CheckSucceeded field_packageName[%s], field_filePath[%s], versionCode[%d]", c.field_packageName, c.field_filePath, Integer.valueOf(i));
            C86709a0.m107525e().postToWorker(new C40936a(c, i, context, z));
        }
    }

    /* renamed from: m */
    public boolean mo63965m(long j) {
        Log.m105924i("MicroMsg.FileDownloadManager", "pauseDownloadTask, id = " + j);
        C53736a c = C40933j.m44314c(j);
        if (c == null) {
            this.f110164g = false;
        } else {
            mo63971s(c.field_appId, (C40939n) null);
        }
        if (mo63963k(j)) {
            return mo63961i().mo62093c(j);
        }
        C53736a c2 = C40933j.m44314c(j);
        if (c2 != null && (c2.field_downloadInWifi || c2.field_reserveInWifi)) {
            c2.field_downloadInWifi = false;
            c2.field_reserveInWifi = false;
            C40933j.m44322k(c2);
        }
        if (c2 == null || c2.field_downloaderType != 3) {
            return mo63960f().mo62093c(j);
        }
        mo63959e().mo62093c(j);
        return true;
    }

    /* renamed from: n */
    public FileDownloadTaskInfo mo63966n(long j) {
        FileDownloadTaskInfo fileDownloadTaskInfo;
        if (mo63963k(j)) {
            return mo63961i().mo62095e(j);
        }
        C53736a c = C40933j.m44314c(j);
        if (c != null && c.field_status == 3 && C86013q1.m106450k(c.field_filePath)) {
            fileDownloadTaskInfo = new FileDownloadTaskInfo();
            fileDownloadTaskInfo.f12194d = j;
            fileDownloadTaskInfo.f12195e = c.field_downloadUrl;
            fileDownloadTaskInfo.f12196f = 3;
            fileDownloadTaskInfo.f12197g = c.field_filePath;
            fileDownloadTaskInfo.f12198h = c.field_md5;
            fileDownloadTaskInfo.f12200j = c.field_downloadedSize;
            fileDownloadTaskInfo.f12201n = c.field_totalSize;
            fileDownloadTaskInfo.f12202o = c.field_autoDownload;
            fileDownloadTaskInfo.f12203p = c.field_downloaderType;
        } else if (c == null || c.field_downloaderType != 3) {
            fileDownloadTaskInfo = mo63960f().mo62095e(j);
            if (c != null) {
                fileDownloadTaskInfo.f12202o = c.field_autoDownload;
                fileDownloadTaskInfo.f12203p = c.field_downloaderType;
            }
        } else {
            fileDownloadTaskInfo = mo63959e().mo62095e(j);
        }
        if (fileDownloadTaskInfo == null) {
            fileDownloadTaskInfo = new FileDownloadTaskInfo();
        }
        int i = fileDownloadTaskInfo.f12196f;
        if (i == 3 || i == 6) {
            if (!C86013q1.m106450k(fileDownloadTaskInfo.f12197g)) {
                fileDownloadTaskInfo.f12196f = 0;
            } else if (fileDownloadTaskInfo.f12196f == 6) {
                fileDownloadTaskInfo.f12196f = 1;
            }
        }
        if (c != null) {
            fileDownloadTaskInfo.f12204q = c.field_downloadInWifi;
            fileDownloadTaskInfo.f12199i = c.field_appId;
            fileDownloadTaskInfo.f12205r = c.field_reserveInWifi;
        }
        Log.m105925i("MicroMsg.FileDownloadManager", "getDownloadTaskInfo: id: %d, url: %s, status: %d, path: %s, md5: %s, totalsize: %d, autodownload: %b, downloaderType: %d", Long.valueOf(fileDownloadTaskInfo.f12194d), fileDownloadTaskInfo.f12195e, Integer.valueOf(fileDownloadTaskInfo.f12196f), fileDownloadTaskInfo.f12197g, fileDownloadTaskInfo.f12198h, Long.valueOf(fileDownloadTaskInfo.f12201n), Boolean.valueOf(fileDownloadTaskInfo.f12202o), Integer.valueOf(fileDownloadTaskInfo.f12203p));
        return fileDownloadTaskInfo;
    }

    /* renamed from: o */
    public FileDownloadTaskInfo mo63967o(String str) {
        C53736a d = C40933j.m44315d(str);
        return d != null ? mo63966n(d.field_downloadId) : new FileDownloadTaskInfo();
    }

    /* renamed from: p */
    public FileDownloadTaskInfo mo63968p(String str) {
        C53736a e = C40933j.m44316e(str);
        return e != null ? mo63966n(e.field_downloadId) : new FileDownloadTaskInfo();
    }

    /* renamed from: q */
    public void mo63969q(C40952u uVar) {
        this.f110163f.getClass();
        if (uVar != null) {
            C40923i.f110111a.remove(uVar);
        }
    }

    /* renamed from: r */
    public int mo63970r(long j) {
        Log.m105924i("MicroMsg.FileDownloadManager", "removeDownloadTask, id = " + j);
        if (mo63963k(j)) {
            return mo63961i().removeDownloadTask(j);
        }
        C53736a c = C40933j.m44314c(j);
        if (c != null && (c.field_downloadInWifi || c.field_reserveInWifi)) {
            c.field_downloadInWifi = false;
            c.field_reserveInWifi = false;
            C40933j.m44322k(c);
        }
        if (c == null || c.field_downloaderType != 3) {
            return mo63960f().removeDownloadTask(j);
        }
        mo63959e().removeDownloadTask(j);
        return 1;
    }

    /* renamed from: s */
    public final void mo63971s(String str, C40939n nVar) {
        C53736a d;
        if (!this.f110164g && (d = C40933j.m44315d(str)) != null && d.field_autoDownload) {
            GameSilentDownloadEvent gameSilentDownloadEvent = new GameSilentDownloadEvent();
            gameSilentDownloadEvent.f107565d.f107566a = str;
            gameSilentDownloadEvent.publish();
            if (nVar != null) {
                d.field_autoInstall = nVar.f110184i;
                d.field_showNotification = nVar.f110185j;
                d.field_autoDownload = nVar.f110186k;
            } else {
                d.field_autoInstall = true;
                d.field_showNotification = true;
                d.field_autoDownload = false;
            }
            C40933j.m44322k(d);
            Log.m105925i("MicroMsg.FileDownloadManager", "remove silentDownload, appId:%s", str);
        }
        this.f110164g = false;
    }

    /* renamed from: t */
    public boolean mo63972t(long j) {
        Log.m105924i("MicroMsg.FileDownloadManager", "resumeDownloadTask, id = " + j);
        C53736a c = C40933j.m44314c(j);
        if (c == null) {
            this.f110164g = false;
        } else {
            mo63971s(c.field_appId, (C40939n) null);
        }
        if (mo63963k(j)) {
            return mo63961i().mo62091a(j);
        }
        C53736a c2 = C40933j.m44314c(j);
        if (c2 != null && !c2.field_reserveInWifi && c2.field_downloadInWifi) {
            c2.field_downloadInWifi = false;
            C40933j.m44322k(c2);
        }
        return (c2 == null || c2.field_downloaderType != 3) ? mo63960f().mo62091a(j) : mo63959e().mo63932h(j, true);
    }

    /* renamed from: u */
    public boolean mo63973u(C53736a aVar) {
        return (aVar == null || aVar.field_downloaderType != 3) ? mo63962j().mo62098j(aVar.field_downloadId, true) : mo63959e().mo63932h(aVar.field_downloadId, true);
    }

    /* renamed from: v */
    public final void mo63974v(String str, String str2, String str3, PendingIntent pendingIntent) {
        C90116e.C90121c cVar = new C90116e.C90121c(MMApplicationContext.getContext(), "reminder_channel_id");
        if (!TextUtils.isEmpty(str2)) {
            cVar.mo124383h(str2);
        } else {
            C44561j i = C44565l.m48989i(str, false, false);
            if (i == null || Util.isNullOrNil(i.field_appName)) {
                cVar.mo124383h("");
            } else {
                cVar.mo124383h(i.field_appName);
            }
        }
        cVar.mo124382g(str3);
        cVar.f258814z.icon = 17301634;
        cVar.mo124380e(true);
        if (pendingIntent != null) {
            cVar.f258795g = pendingIntent;
        } else {
            cVar.f258795g = PendingIntent.getActivity(MMApplicationContext.getContext(), 0, new Intent(), 0);
        }
        ((MMNotification) ((C79690d) C86312j.m106911c(C79690d.class)).mo109806kA()).mo93214k(cVar.mo124378b(), true);
        Log.m105924i("MicroMsg.FileDownloadManager", "show notification");
    }
}

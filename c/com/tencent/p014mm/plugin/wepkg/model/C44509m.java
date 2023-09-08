package com.tencent.p014mm.plugin.wepkg.model;

import com.google.android.gms.wearable.WearableStatusCodes;
import com.tencent.p014mm.plugin.wepkg.downloader.WePkgDownloader;
import com.tencent.p014mm.plugin.wepkg.utils.C44536d;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.Util;
import java.util.List;

/* renamed from: com.tencent.mm.plugin.wepkg.model.m */
public class C44509m {

    /* renamed from: com.tencent.mm.plugin.wepkg.model.m$a */
    public class C44510a implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ WepkgDownloadProcessTask f120711d;

        /* renamed from: e */
        public final /* synthetic */ C44488a f120712e;

        /* renamed from: f */
        public final /* synthetic */ int f120713f;

        /* renamed from: g */
        public final /* synthetic */ String f120714g;

        /* renamed from: h */
        public final /* synthetic */ String f120715h;

        /* renamed from: i */
        public final /* synthetic */ String f120716i;

        /* renamed from: j */
        public final /* synthetic */ long f120717j;

        /* renamed from: n */
        public final /* synthetic */ String f120718n;

        /* renamed from: o */
        public final /* synthetic */ String f120719o;

        /* renamed from: p */
        public final /* synthetic */ int f120720p;

        /* renamed from: com.tencent.mm.plugin.wepkg.model.m$a$a */
        public class C44511a implements WePkgDownloader.IWepkgUpdateCallback {
            public C44511a() {
            }

            /* renamed from: a */
            public void mo69236a(String str, String str2, WePkgDownloader.IWepkgUpdateCallback.RetCode retCode) {
                Log.m105925i("MicroMsg.Wepkg.WepkgProcessTaskPerformer", "onPkgUpdatingCallback errCode:%s", retCode);
                C44510a aVar = C44510a.this;
                WepkgDownloadProcessTask wepkgDownloadProcessTask = aVar.f120711d;
                wepkgDownloadProcessTask.f120627i = str;
                wepkgDownloadProcessTask.f120634s = str2;
                wepkgDownloadProcessTask.f120635t = retCode;
                C44488a aVar2 = aVar.f120712e;
                if (aVar2 != null) {
                    aVar2.mo66027a(wepkgDownloadProcessTask);
                }
            }
        }

        public C44510a(WepkgDownloadProcessTask wepkgDownloadProcessTask, C44488a aVar, int i, String str, String str2, String str3, long j, String str4, String str5, int i2) {
            this.f120711d = wepkgDownloadProcessTask;
            this.f120712e = aVar;
            this.f120713f = i;
            this.f120714g = str;
            this.f120715h = str2;
            this.f120716i = str3;
            this.f120717j = j;
            this.f120718n = str4;
            this.f120719o = str5;
            this.f120720p = i2;
        }

        public void run() {
            C44511a aVar = new C44511a();
            if (this.f120713f == 1) {
                WePkgDownloader.m48821a().mo69232c(this.f120714g, aVar);
            } else {
                WePkgDownloader.m48821a().mo69235f(this.f120713f, Util.nullAsNil(this.f120714g), "", Util.nullAsNil(this.f120715h), Util.nullAsNil(this.f120716i), this.f120717j, Util.nullAsNil(this.f120718n), "", Util.nullAsNil(this.f120719o), this.f120720p, aVar);
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.wepkg.model.m$b */
    public class C44512b implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ C44488a f120722d;

        /* renamed from: e */
        public final /* synthetic */ WepkgDownloadProcessTask f120723e;

        public C44512b(C44488a aVar, WepkgDownloadProcessTask wepkgDownloadProcessTask) {
            this.f120722d = aVar;
            this.f120723e = wepkgDownloadProcessTask;
        }

        public void run() {
            C44488a aVar = this.f120722d;
            if (aVar != null) {
                aVar.mo66027a(this.f120723e);
            }
            this.f120723e.mo114397h();
        }
    }

    /* renamed from: com.tencent.mm.plugin.wepkg.model.m$c */
    public class C44513c implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ WepkgCrossProcessTask f120724d;

        /* renamed from: e */
        public final /* synthetic */ C44488a f120725e;

        public C44513c(WepkgCrossProcessTask wepkgCrossProcessTask, C44488a aVar) {
            this.f120724d = wepkgCrossProcessTask;
            this.f120725e = aVar;
        }

        public void run() {
            this.f120724d.mo1553j();
            C44488a aVar = this.f120725e;
            if (aVar != null) {
                aVar.mo66027a(this.f120724d);
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.wepkg.model.m$d */
    public class C44514d implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ C44488a f120726d;

        /* renamed from: e */
        public final /* synthetic */ WepkgCrossProcessTask f120727e;

        public C44514d(C44488a aVar, WepkgCrossProcessTask wepkgCrossProcessTask) {
            this.f120726d = aVar;
            this.f120727e = wepkgCrossProcessTask;
        }

        public void run() {
            C44488a aVar = this.f120726d;
            if (aVar != null) {
                aVar.mo66027a(this.f120727e);
            }
            this.f120727e.mo114397h();
        }
    }

    /* renamed from: com.tencent.mm.plugin.wepkg.model.m$e */
    public class C44515e implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ WepkgCrossProcessTask f120728d;

        /* renamed from: e */
        public final /* synthetic */ C44488a f120729e;

        public C44515e(WepkgCrossProcessTask wepkgCrossProcessTask, C44488a aVar) {
            this.f120728d = wepkgCrossProcessTask;
            this.f120729e = aVar;
        }

        public void run() {
            this.f120728d.mo1553j();
            C44488a aVar = this.f120729e;
            if (aVar != null) {
                aVar.mo66027a(this.f120728d);
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.wepkg.model.m$f */
    public class C44516f implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ C44488a f120730d;

        /* renamed from: e */
        public final /* synthetic */ WepkgCrossProcessTask f120731e;

        public C44516f(C44488a aVar, WepkgCrossProcessTask wepkgCrossProcessTask) {
            this.f120730d = aVar;
            this.f120731e = wepkgCrossProcessTask;
        }

        public void run() {
            C44488a aVar = this.f120730d;
            if (aVar != null) {
                aVar.mo66027a(this.f120731e);
            }
            this.f120731e.mo114397h();
        }
    }

    /* renamed from: com.tencent.mm.plugin.wepkg.model.m$g */
    public class C44517g implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ WepkgCrossProcessTask f120732d;

        /* renamed from: e */
        public final /* synthetic */ C44488a f120733e;

        public C44517g(WepkgCrossProcessTask wepkgCrossProcessTask, C44488a aVar) {
            this.f120732d = wepkgCrossProcessTask;
            this.f120733e = aVar;
        }

        public void run() {
            this.f120732d.mo1553j();
            C44488a aVar = this.f120733e;
            if (aVar != null) {
                aVar.mo66027a(this.f120732d);
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.wepkg.model.m$h */
    public class C44518h implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ C44488a f120734d;

        /* renamed from: e */
        public final /* synthetic */ WepkgCrossProcessTask f120735e;

        public C44518h(C44488a aVar, WepkgCrossProcessTask wepkgCrossProcessTask) {
            this.f120734d = aVar;
            this.f120735e = wepkgCrossProcessTask;
        }

        public void run() {
            C44488a aVar = this.f120734d;
            if (aVar != null) {
                aVar.mo66027a(this.f120735e);
            }
            this.f120735e.mo114397h();
        }
    }

    /* renamed from: a */
    public static void m48880a(int i, String str, String str2, String str3, long j, String str4, String str5, int i2, C44488a aVar) {
        WepkgDownloadProcessTask wepkgDownloadProcessTask = new WepkgDownloadProcessTask();
        wepkgDownloadProcessTask.f120626h = i;
        wepkgDownloadProcessTask.f120627i = str;
        wepkgDownloadProcessTask.f120629n = str3;
        wepkgDownloadProcessTask.f120630o = j;
        wepkgDownloadProcessTask.f120631p = str4;
        wepkgDownloadProcessTask.f120632q = str5;
        wepkgDownloadProcessTask.f120633r = i2;
        if (MMApplicationContext.isMMProcess()) {
            C44536d.m48918d().postToWorker(new C44510a(wepkgDownloadProcessTask, aVar, i, str, str2, str3, j, str4, str5, i2));
            return;
        }
        wepkgDownloadProcessTask.f120636u = new C44512b(aVar, wepkgDownloadProcessTask);
        wepkgDownloadProcessTask.mo114395c();
    }

    /* renamed from: b */
    public static List<WepkgPreloadFile> m48881b(String str) {
        WepkgCrossProcessTask wepkgCrossProcessTask = new WepkgCrossProcessTask();
        wepkgCrossProcessTask.f120618h = 4001;
        wepkgCrossProcessTask.f120619i.f120651d = str;
        if (MMApplicationContext.isMMProcess()) {
            wepkgCrossProcessTask.mo1553j();
        } else {
            wepkgCrossProcessTask.mo114396f();
        }
        return wepkgCrossProcessTask.f120623p;
    }

    /* renamed from: c */
    public static List<WepkgPreloadFile> m48882c(String str) {
        WepkgCrossProcessTask wepkgCrossProcessTask = new WepkgCrossProcessTask();
        wepkgCrossProcessTask.f120618h = WearableStatusCodes.DATA_ITEM_TOO_LARGE;
        wepkgCrossProcessTask.f120619i.f120651d = str;
        if (MMApplicationContext.isMMProcess()) {
            wepkgCrossProcessTask.mo1553j();
        } else {
            wepkgCrossProcessTask.mo114396f();
        }
        return wepkgCrossProcessTask.f120623p;
    }

    /* renamed from: d */
    public static WepkgVersion m48883d(String str) {
        WepkgCrossProcessTask wepkgCrossProcessTask = new WepkgCrossProcessTask();
        wepkgCrossProcessTask.f120618h = 3001;
        wepkgCrossProcessTask.f120619i.f120651d = str;
        if (MMApplicationContext.isMMProcess()) {
            wepkgCrossProcessTask.mo1553j();
        } else {
            wepkgCrossProcessTask.mo114396f();
        }
        WepkgVersion wepkgVersion = wepkgCrossProcessTask.f120619i;
        if (wepkgVersion == null) {
            return null;
        }
        return wepkgVersion;
    }

    /* renamed from: e */
    public static WepkgVersion m48884e(String str) {
        Log.printInfoStack("MicroMsg.Wepkg.WepkgProcessTaskPerformer", "getWepkgVersionRecordWithAble", new Object[0]);
        WepkgCrossProcessTask wepkgCrossProcessTask = new WepkgCrossProcessTask();
        wepkgCrossProcessTask.f120618h = 3002;
        wepkgCrossProcessTask.f120619i.f120651d = str;
        if (MMApplicationContext.isMMProcess()) {
            wepkgCrossProcessTask.mo1553j();
        } else {
            wepkgCrossProcessTask.mo114396f();
        }
        WepkgVersion wepkgVersion = wepkgCrossProcessTask.f120619i;
        if (wepkgVersion == null) {
            return null;
        }
        return wepkgVersion;
    }

    /* renamed from: f */
    public static void m48885f(String str, C44488a aVar) {
        WepkgCrossProcessTask wepkgCrossProcessTask = new WepkgCrossProcessTask();
        wepkgCrossProcessTask.f120618h = 2004;
        wepkgCrossProcessTask.f120619i.f120651d = str;
        if (MMApplicationContext.isMMProcess()) {
            C44536d.m48918d().postToWorker(new C44515e(wepkgCrossProcessTask, aVar));
            return;
        }
        wepkgCrossProcessTask.f120625r = new C44516f(aVar, wepkgCrossProcessTask);
        wepkgCrossProcessTask.mo114395c();
    }

    /* renamed from: g */
    public static void m48886g(String str, String str2, String str3, boolean z, C44488a aVar) {
        WepkgCrossProcessTask wepkgCrossProcessTask = new WepkgCrossProcessTask();
        wepkgCrossProcessTask.f120618h = 4002;
        WepkgPreloadFile wepkgPreloadFile = wepkgCrossProcessTask.f120622o;
        wepkgPreloadFile.f120639e = str;
        wepkgPreloadFile.f120642h = str2;
        wepkgPreloadFile.f120641g = str3;
        wepkgPreloadFile.f120648q = z;
        if (MMApplicationContext.isMMProcess()) {
            C44536d.m48918d().postToWorker(new C44513c(wepkgCrossProcessTask, aVar));
            return;
        }
        wepkgCrossProcessTask.f120625r = new C44514d(aVar, wepkgCrossProcessTask);
        wepkgCrossProcessTask.mo114395c();
    }

    /* renamed from: h */
    public static void m48887h(String str, String str2, boolean z, C44488a aVar) {
        WepkgCrossProcessTask wepkgCrossProcessTask = new WepkgCrossProcessTask();
        wepkgCrossProcessTask.f120618h = 3005;
        WepkgVersion wepkgVersion = wepkgCrossProcessTask.f120619i;
        wepkgVersion.f120651d = str;
        wepkgVersion.f120654g = str2;
        wepkgVersion.f120667w = z;
        if (MMApplicationContext.isMMProcess()) {
            C44536d.m48918d().postToWorker(new C44517g(wepkgCrossProcessTask, aVar));
            return;
        }
        wepkgCrossProcessTask.f120625r = new C44518h(aVar, wepkgCrossProcessTask);
        wepkgCrossProcessTask.mo114395c();
    }

    /* renamed from: i */
    public static void m48888i(String str, boolean z, long j, long j2) {
        WepkgCrossProcessTask wepkgCrossProcessTask = new WepkgCrossProcessTask();
        wepkgCrossProcessTask.f120618h = 3004;
        WepkgVersion wepkgVersion = wepkgCrossProcessTask.f120619i;
        wepkgVersion.f120651d = str;
        wepkgVersion.f120655h = z;
        wepkgVersion.f120656i = j;
        wepkgVersion.f120657j = j2;
        if (MMApplicationContext.isMMProcess()) {
            wepkgCrossProcessTask.mo1553j();
        } else {
            wepkgCrossProcessTask.mo114396f();
        }
    }
}

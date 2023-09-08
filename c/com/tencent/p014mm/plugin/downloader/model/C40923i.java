package com.tencent.p014mm.plugin.downloader.model;

import com.tencent.p014mm.plugin.downloader.api.C40910b;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandlerThread;
import java.util.HashSet;
import java.util.Vector;
import p261wl.C38166b;
import z41.C53736a;

/* renamed from: com.tencent.mm.plugin.downloader.model.i */
public class C40923i {

    /* renamed from: a */
    public static Vector<C40952u> f110111a;

    /* renamed from: com.tencent.mm.plugin.downloader.model.i$a */
    public class C40924a implements C40952u {
        /* renamed from: B */
        public void mo1796B(long j, String str, long j2, long j3) {
            C38166b.m41755b(C40954w.class, new i$a$$f(j, str, j2, j3));
        }

        /* renamed from: D */
        public void mo1797D(long j) {
            C38166b.m41755b(C40954w.class, new i$a$$e(j));
        }

        /* renamed from: O */
        public void mo1798O(long j) {
            C38166b.m41755b(C40954w.class, new i$a$$g(j));
        }

        /* renamed from: Q */
        public void mo1799Q(long j, String str) {
            C38166b.m41755b(C40954w.class, new i$a$$d(j, str));
        }

        /* renamed from: S */
        public void mo1800S(long j) {
            C38166b.m41755b(C40954w.class, new i$a$$a(j));
        }

        /* renamed from: d */
        public void mo1801d(long j, int i, boolean z) {
            C38166b.m41755b(C40954w.class, new i$a$$h(j, i, z));
        }

        /* renamed from: f0 */
        public void mo1802f0(long j, String str) {
            C38166b.m41755b(C40954w.class, new i$a$$c(j, str));
        }

        /* renamed from: q */
        public void mo1803q(long j, String str, boolean z) {
            C38166b.m41755b(C40954w.class, new i$a$$b(j, str, z));
        }
    }

    /* renamed from: com.tencent.mm.plugin.downloader.model.i$b */
    public class C40925b implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ long f110112d;

        /* renamed from: e */
        public final /* synthetic */ String f110113e;

        public C40925b(long j, String str) {
            this.f110112d = j;
            this.f110113e = str;
        }

        public void run() {
            for (C40952u f0 : C40923i.m44295a(C40923i.this)) {
                f0.mo1802f0(this.f110112d, this.f110113e);
            }
            Vector<C40952u> vector = C40923i.f110111a;
        }
    }

    /* renamed from: com.tencent.mm.plugin.downloader.model.i$c */
    public class C40926c implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ long f110115d;

        /* renamed from: e */
        public final /* synthetic */ String f110116e;

        public C40926c(long j, String str) {
            this.f110115d = j;
            this.f110116e = str;
        }

        public void run() {
            for (C40952u Q : C40923i.m44295a(C40923i.this)) {
                Q.mo1799Q(this.f110115d, this.f110116e);
            }
            Vector<C40952u> vector = C40923i.f110111a;
        }
    }

    /* renamed from: com.tencent.mm.plugin.downloader.model.i$d */
    public class C40927d implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ long f110118d;

        public C40927d(long j) {
            this.f110118d = j;
        }

        public void run() {
            for (C40952u D : C40923i.m44295a(C40923i.this)) {
                D.mo1797D(this.f110118d);
            }
            Vector<C40952u> vector = C40923i.f110111a;
        }
    }

    /* renamed from: com.tencent.mm.plugin.downloader.model.i$e */
    public class C40928e implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ long f110120d;

        /* renamed from: e */
        public final /* synthetic */ String f110121e;

        /* renamed from: f */
        public final /* synthetic */ boolean f110122f;

        public C40928e(long j, String str, boolean z) {
            this.f110120d = j;
            this.f110121e = str;
            this.f110122f = z;
        }

        public void run() {
            for (C40952u q : C40923i.m44295a(C40923i.this)) {
                q.mo1803q(this.f110120d, this.f110121e, this.f110122f);
            }
            Vector<C40952u> vector = C40923i.f110111a;
        }
    }

    /* renamed from: com.tencent.mm.plugin.downloader.model.i$f */
    public class C40929f implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ long f110124d;

        /* renamed from: e */
        public final /* synthetic */ int f110125e;

        /* renamed from: f */
        public final /* synthetic */ boolean f110126f;

        public C40929f(long j, int i, boolean z) {
            this.f110124d = j;
            this.f110125e = i;
            this.f110126f = z;
        }

        public void run() {
            for (C40952u d : C40923i.m44295a(C40923i.this)) {
                d.mo1801d(this.f110124d, this.f110125e, this.f110126f);
            }
            Vector<C40952u> vector = C40923i.f110111a;
        }
    }

    /* renamed from: com.tencent.mm.plugin.downloader.model.i$g */
    public class C40930g implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ long f110128d;

        public C40930g(long j) {
            this.f110128d = j;
        }

        public void run() {
            for (C40952u S : C40923i.m44295a(C40923i.this)) {
                S.mo1800S(this.f110128d);
            }
            Vector<C40952u> vector = C40923i.f110111a;
        }
    }

    /* renamed from: com.tencent.mm.plugin.downloader.model.i$h */
    public class C40931h implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ long f110130d;

        /* renamed from: e */
        public final /* synthetic */ String f110131e;

        /* renamed from: f */
        public final /* synthetic */ long f110132f;

        /* renamed from: g */
        public final /* synthetic */ long f110133g;

        public C40931h(long j, String str, long j2, long j3) {
            this.f110130d = j;
            this.f110131e = str;
            this.f110132f = j2;
            this.f110133g = j3;
        }

        public void run() {
            for (C40952u B : C40923i.m44295a(C40923i.this)) {
                B.mo1796B(this.f110130d, this.f110131e, this.f110132f, this.f110133g);
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.downloader.model.i$i */
    public class C40932i implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ long f110135d;

        public C40932i(long j) {
            this.f110135d = j;
        }

        public void run() {
            for (C40952u O : C40923i.m44295a(C40923i.this)) {
                O.mo1798O(this.f110135d);
            }
        }
    }

    static {
        Vector<C40952u> vector = new Vector<>();
        f110111a = vector;
        vector.add(new C40924a());
    }

    /* renamed from: a */
    public static C40952u[] m44295a(C40923i iVar) {
        iVar.getClass();
        return (C40952u[]) f110111a.toArray(new C40952u[f110111a.size()]);
    }

    /* renamed from: b */
    public void mo63939b(long j) {
        Log.m105925i("MicroMsg.FileDownloaderCallbackManager", "notifyMd5Checking: %d", Long.valueOf(j));
        ((HashSet) C40934k.f110154a).add(Long.valueOf(j));
        MMHandlerThread.postToMainThread(new C40932i(j));
    }

    /* renamed from: c */
    public void mo63940c(long j, int i, boolean z) {
        Log.m105925i("MicroMsg.FileDownloaderCallbackManager", "notifyTaskFailed: %d, errCode : %d", Long.valueOf(j), Integer.valueOf(i));
        ((HashSet) C40934k.f110154a).remove(Long.valueOf(j));
        C53736a c = C40933j.m44314c(j);
        if (c != null) {
            C40910b.m44271d(c.field_downloadUrl, c.field_secondaryUrl);
        }
        MMHandlerThread.postToMainThread(new C40929f(j, i, z));
    }

    /* renamed from: d */
    public void mo63941d(long j, String str, boolean z) {
        Log.m105925i("MicroMsg.FileDownloaderCallbackManager", "notifyTaskFinished: %d", Long.valueOf(j));
        ((HashSet) C40934k.f110154a).remove(Long.valueOf(j));
        C53736a c = C40933j.m44314c(j);
        if (c != null) {
            C40910b.m44271d(c.field_downloadUrl, c.field_secondaryUrl);
        }
        MMHandlerThread.postToMainThread(new C40928e(j, str, z));
    }

    /* renamed from: e */
    public void mo63942e(long j) {
        Log.m105925i("MicroMsg.FileDownloaderCallbackManager", "notifyTaskPaused: %d", Long.valueOf(j));
        C53736a c = C40933j.m44314c(j);
        if (c != null) {
            C40910b.m44271d(c.field_downloadUrl, c.field_secondaryUrl);
        }
        MMHandlerThread.postToMainThread(new C40930g(j));
    }

    /* renamed from: f */
    public void mo63943f(long j, String str, long j2, long j3) {
        MMHandlerThread.postToMainThread(new C40931h(j, str, j2, j3));
    }

    /* renamed from: g */
    public void mo63944g(long j) {
        Log.m105925i("MicroMsg.FileDownloaderCallbackManager", "notifyTaskRemoved: %d", Long.valueOf(j));
        C53736a c = C40933j.m44314c(j);
        if (c != null) {
            C40910b.m44271d(c.field_downloadUrl, c.field_secondaryUrl);
        }
        MMHandlerThread.postToMainThread(new C40927d(j));
    }

    /* renamed from: h */
    public void mo63945h(long j, String str) {
        Log.m105925i("MicroMsg.FileDownloaderCallbackManager", "notifyTaskResumed: %d, %s", Long.valueOf(j), str);
        MMHandlerThread.postToMainThread(new C40926c(j, str));
    }

    /* renamed from: i */
    public void mo63946i(long j, String str) {
        Log.m105925i("MicroMsg.FileDownloaderCallbackManager", "notifyTaskStarted: %d, %s", Long.valueOf(j), str);
        MMHandlerThread.postToMainThread(new C40925b(j, str));
    }
}

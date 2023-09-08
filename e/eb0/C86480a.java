package eb0;

import androidx.camera.core.FocusMeteringAction;
import com.tencent.p014mm.network.C81039e;
import com.tencent.p014mm.sdk.crash.CrashReportFactory;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandlerThread;
import com.tencent.p014mm.sdk.platformtools.Util;
import f40.C86709a0;
import f40.C86718e;
import kj2.C117407d;
import lc3.C10485b;
import p823sg.C101615j;

/* renamed from: eb0.a */
public class C86480a {

    /* renamed from: a */
    public byte[] f251305a;

    /* renamed from: b */
    public long f251306b = -1;

    /* renamed from: eb0.a$a */
    public class C86481a implements Runnable {
        public C86481a(C86480a aVar) {
        }

        public void run() {
            try {
                if (C86480a.m107209c()) {
                    C117407d.INSTANCE.idkeyStat(226, 1, 1, false);
                }
            } catch (Exception e) {
                Log.m105921e("MicroMsg.AccInfoCacheInWorker", "init Exception:%s", Util.stackTraceToString(e));
            }
        }
    }

    public C86480a() {
        if (m107209c()) {
            MMHandlerThread.postToMainThreadDelayed(new C86481a(this), FocusMeteringAction.DEFAULT_AUTOCANCEL_DURATION);
        }
    }

    /* renamed from: c */
    public static boolean m107209c() {
        if (!C86718e.m107551r() && C86709a0.m107522a()) {
            int i = Util.getInt(((C10485b) C86709a0.m107533q(C10485b.class)).vh0().mo107405c("AndroidUseWorkerAuthCache"), 0);
            C86709a0.m107528h();
            int b = C101615j.m133462b(C86709a0.m107523b().mo121110g(), 100);
            boolean hasDebuger = CrashReportFactory.hasDebuger();
            C86709a0.m107528h();
            Log.m105925i("MicroMsg.AccInfoCacheInWorker", "checkUse debug:%s dyVal:%s uin:%d  uinHash:%d init:%b", Boolean.valueOf(hasDebuger), Integer.valueOf(i), Integer.valueOf(C86709a0.m107523b().mo121110g()), Integer.valueOf(b), Boolean.valueOf(C86709a0.m107523b().mo121114l()));
            return hasDebuger || i > b;
        }
    }

    /* renamed from: e */
    public static void m107210e() {
        try {
            C86709a0.m107528h();
            if (C86709a0.m107523b().f251753d != null) {
                C86709a0.m107528h();
                if (C86709a0.m107529k().f251779b.f256809d != null) {
                    C86709a0.m107528h();
                    C86480a aVar = C86709a0.m107523b().f251753d;
                    C86709a0.m107528h();
                    aVar.mo120941f(C86709a0.m107529k().f251779b.f256809d.mo55443A3());
                    return;
                }
            }
            C86709a0.m107528h();
            C86709a0.m107528h();
            Log.m105925i("MicroMsg.AccInfoCacheInWorker", "tryReuseToPush but object is null [%s, %s]", C86709a0.m107523b().f251753d, C86709a0.m107529k().f251779b.f256809d);
        } catch (Throwable th) {
            Log.m105921e("MicroMsg.AccInfoCacheInWorker", "tryReuseToPush Exception:%s", Util.stackTraceToString(th));
        }
    }

    /* renamed from: g */
    public static void m107211g() {
        if (m107209c()) {
            try {
                C86709a0.m107528h();
                if (C86709a0.m107523b().f251753d != null) {
                    C86709a0.m107528h();
                    if (C86709a0.m107529k().f251779b.f256809d != null) {
                        C86709a0.m107528h();
                        C86480a aVar = C86709a0.m107523b().f251753d;
                        C86709a0.m107528h();
                        aVar.mo120940d(C86709a0.m107529k().f251779b.f256809d.mo55443A3());
                        return;
                    }
                }
                C86709a0.m107528h();
                C86709a0.m107528h();
                Log.m105925i("MicroMsg.AccInfoCacheInWorker", "tryReuseToPush but object is null [%s, %s]", C86709a0.m107523b().f251753d, C86709a0.m107529k().f251779b.f256809d);
            } catch (Throwable th) {
                Log.m105921e("MicroMsg.AccInfoCacheInWorker", "tryReuseToPush Exception:%s", Util.stackTraceToString(th));
            }
        }
    }

    /* renamed from: a */
    public final void mo120938a(C81039e eVar) {
        long nowMilliSecond = Util.nowMilliSecond();
        if (eVar == null) {
            Log.m105920e("MicroMsg.AccInfoCacheInWorker", "backupToWorker  accinfo == null");
            C117407d.INSTANCE.idkeyStat(226, 2, 1, false);
            return;
        }
        Log.m105925i("MicroMsg.AccInfoCacheInWorker", "backupToWorker islogin:%b cache:%s", Boolean.valueOf(eVar.mo55417G3()), Integer.valueOf(mo120939b()));
        if (!eVar.mo55417G3()) {
            C117407d.INSTANCE.idkeyStat(226, 3, 1, false);
            Log.m105920e("MicroMsg.AccInfoCacheInWorker", "backupToWorker ERR: Is Not Login");
            return;
        }
        this.f251305a = eVar.mo55433l4();
        C117407d dVar = C117407d.INSTANCE;
        long j = 5;
        dVar.idkeyStat(226, mo120939b() > 0 ? 4 : 5, 1, false);
        Log.m105925i("MicroMsg.AccInfoCacheInWorker", "backupToWorker time:%s cache:%s useCacheCount:%s ", Long.valueOf(Util.milliSecondsToNow(nowMilliSecond)), Integer.valueOf(mo120939b()), Long.valueOf(this.f251306b));
        if (mo120939b() > 0) {
            long j2 = this.f251306b;
            if (j2 <= 5) {
                j = j2;
            }
            dVar.idkeyStat(226, 31 - j, 1, false);
            dVar.mo160131h(11098, 2000, Long.valueOf(this.f251306b));
            this.f251306b = -1;
        }
    }

    /* renamed from: b */
    public final int mo120939b() {
        byte[] bArr = this.f251305a;
        if (bArr == null) {
            return -1;
        }
        return bArr.length;
    }

    /* renamed from: d */
    public final void mo120940d(C81039e eVar) {
        C81039e eVar2 = eVar;
        long nowMilliSecond = Util.nowMilliSecond();
        if (eVar2 == null) {
            Log.m105920e("MicroMsg.AccInfoCacheInWorker", "reuseToPush  accinfo == null");
            C117407d.INSTANCE.idkeyStat(226, 6, 1, false);
            return;
        }
        Log.m105925i("MicroMsg.AccInfoCacheInWorker", "reuseToPush islogin:%b cache:%s", Boolean.valueOf(eVar.mo55417G3()), Integer.valueOf(mo120939b()));
        if (eVar.mo55417G3()) {
            if (mo120939b() > 0) {
                C117407d.INSTANCE.idkeyStat(226, 7, 1, false);
                Log.m105920e("MicroMsg.AccInfoCacheInWorker", "reuseToPush  something Error! islogin && isCacheValid . Clean Cache Now !");
                this.f251305a = null;
            } else {
                Log.m105928w("MicroMsg.AccInfoCacheInWorker", "reuseToPush Here, DANGER! . HERE means worker just init , try set from push now!");
                C117407d.INSTANCE.idkeyStat(226, 8, 1, false);
            }
            this.f251305a = eVar.mo55433l4();
            C117407d.INSTANCE.idkeyStat(226, mo120939b() > 0 ? 9 : 10, 1, false);
        } else if (mo120939b() <= 0) {
            C117407d.INSTANCE.idkeyStat(226, 11, 1, false);
            Log.m105929w("MicroMsg.AccInfoCacheInWorker", "reuseToPush something is null. give up %s", toString());
        } else {
            int A4 = eVar2.mo55412A4(this.f251305a);
            Log.m105925i("MicroMsg.AccInfoCacheInWorker", "reuseToPush parseBuf ret:%s time:%s  cache:%s", Integer.valueOf(A4), Long.valueOf(Util.milliSecondsToNow(nowMilliSecond)), Integer.valueOf(mo120939b()));
            if (A4 != 0) {
                Log.m105921e("MicroMsg.AccInfoCacheInWorker", "reuseToPush parseBuf ret:%s", Integer.valueOf(A4));
                this.f251305a = null;
            } else {
                this.f251306b = 0;
            }
            C117407d.INSTANCE.idkeyStat(226, (long) (A4 + 20), 1, false);
        }
    }

    /* renamed from: f */
    public final void mo120941f(C81039e eVar) {
        if (mo120939b() <= 0) {
            C117407d.INSTANCE.idkeyStat(226, 11, 1, false);
            Log.m105929w("MicroMsg.AccInfoCacheInWorker", "reuseToPush something is null. give up %s", toString());
            return;
        }
        int r1 = eVar.mo55438r1(this.f251305a);
        if (r1 != 0) {
            Log.m105921e("MicroMsg.AccInfoCacheInWorker", "reuseToPush parseBuf ret:%s", Integer.valueOf(r1));
            this.f251305a = null;
            return;
        }
        this.f251306b = 0;
    }
}

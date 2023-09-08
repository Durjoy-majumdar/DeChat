package h40;

import android.os.SystemClock;
import com.tencent.p014mm.graphics.MMBitmapFactory;
import com.tencent.p014mm.legacy.app.C80960d;
import com.tencent.p014mm.legacy.app.C80962f;
import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.vfs.C86002c2;
import com.tencent.p014mm.vfs.VFSStrategy;
import com.tencent.p014mm.vfs.VFSStrategy$$b;
import com.tencent.tmassistantsdk.downloadservice.ApkDownloadManager;
import di3.C86312j;
import f40.C86709a0;
import f40.C86732g0;
import f40.C86739i0;
import j40.C46396a;
import junit.framework.Assert;
import p206nj.C88955f;
import p787ai.C79546a;
import p787ai.C79547b;
import zt3.C119157j;

/* renamed from: h40.a */
public class C87422a {

    /* renamed from: b */
    public static long f253331b;

    /* renamed from: c */
    public static long f253332c;

    /* renamed from: a */
    public C87423b f253333a;

    /* renamed from: a */
    public static final void m108608a(String str, Object... objArr) {
        if (objArr == null || objArr.length == 0) {
            C86739i0.m107599a("MMSkeleton.Boot", str, new Object[0]);
        } else {
            C86739i0.m107599a("MMSkeleton.Boot", str, objArr);
        }
    }

    /* renamed from: d */
    public static String m108609d(long j) {
        return (System.currentTimeMillis() - j) + LocaleUtil.MALAY;
    }

    /* renamed from: b */
    public void mo121840b() {
        Assert.assertNotNull("You must call whichBootStep(BootStep defaultOne, BootStep ... bootSteps) to specify your BootStep instance first!", this.f253333a);
    }

    /* renamed from: c */
    public void mo121841c(C46396a aVar) {
        long currentTimeMillis = System.currentTimeMillis();
        m108608a("boot configure plugins...", new Object[0]);
        ((C80962f) this.f253333a).getClass();
        VFSStrategy$$b vFSStrategy$$b = VFSStrategy.f348871a;
        synchronized (VFSStrategy.class) {
            MMBitmapFactory.m98741j(new C86002c2());
        }
        int[] iArr = C79546a.f233229a;
        C86739i0.m107600b("configurePlugins");
        m108608a("boot configure plugins done in [%s].", m108609d(currentTimeMillis));
    }

    /* renamed from: e */
    public void mo121842e(C46396a aVar) {
        boolean z;
        m108608a("boot execute extension... ", new Object[0]);
        ((C87429d) this.f253333a).getClass();
        m108608a("startup final step, account initialize... for parallels", new Object[0]);
        if (aVar.mo71804b() && C86709a0.m107523b().mo121114l()) {
            C86709a0.m107523b().mo121121v(false);
        }
        boolean z2 = aVar.mo71804b() && C86709a0.m107523b().mo121114l();
        if (!C86709a0.m107522a()) {
            C86312j.m106919k(false);
        }
        C79547b bVar = C79547b.f233255g;
        C79547b.C39606b bVar2 = C79547b.C39606b.Now;
        if (bVar.f233261f.compareAndSet(false, true)) {
            Log.m105925i("MicroMsg.FirstScreenArrangement", "initialize pending plugins from %s", bVar2);
            C87424c cVar = C87424c.f253334g;
            cVar.getClass();
            int[] iArr = C79546a.f233229a;
            C86739i0.m107600b("initializePendingPlugins");
            if (cVar.f253337f.compareAndSet(false, true)) {
                Log.m105924i("MicroMsg.CallbacksProxy", "initialize pending plugins.");
                C86739i0.m107600b("configureAndExecutePendingPlugins");
                VFSStrategy$$b vFSStrategy$$b = VFSStrategy.f348871a;
                Log.m105924i("VFS.VFSStrategy", "Configuration done.");
                VFSStrategy.f348875e = true;
                synchronized (VFSStrategy.class) {
                    if (!VFSStrategy.f348872b || !VFSStrategy.f348874d) {
                        z = false;
                    } else {
                        z = !VFSStrategy.f348876f;
                        if (z) {
                            VFSStrategy.f348876f = true;
                        }
                    }
                }
                if (z) {
                    VFSStrategy.m163773a(C88955f.m111058b());
                }
                C86739i0.m107600b("configureAndExecutePendingPlugins done");
                cVar.f253336e = true;
                if (C86709a0.m107531m().mo58407a().mo71804b()) {
                    if (C86709a0.m107523b().mo121114l()) {
                        C86739i0.m107600b("preloadServicesWithAsyncModeOnDemand-before_firstscreen");
                        C86312j.m106913e(false, false);
                    }
                    C86709a0.m107523b().mo121107b();
                }
                C86739i0.m107600b("initializePendingPlugins done");
            }
            synchronized (bVar) {
                bVar.f233258c = true;
                bVar.mo109608b();
            }
        }
        if (z2) {
            C86709a0.m107523b().mo121104C();
        }
        int[] iArr2 = C79546a.f233229a;
        C86739i0.m107600b("afterAccountInit");
    }

    /* renamed from: f */
    public void mo121843f() {
        f253332c = SystemClock.elapsedRealtime();
        m108608a("hello WeChat.", new Object[0]);
        C80962f fVar = (C80962f) this.f253333a;
        fVar.getClass();
        int[] iArr = C79546a.f233229a;
        C86739i0.m107600b("helloWeChat");
        MMApplicationContext.getContext().getSystemService("audio");
        ((C119157j) C119157j.f356862d).mo183878i(new C80960d(fVar), MMApplicationContext.isMainProcess() ? ApkDownloadManager.INTERVAL : 360000);
    }

    /* renamed from: g */
    public void mo121844g(C87423b bVar, C87423b... bVarArr) {
        Assert.assertNotNull(bVar);
        String a = C86732g0.m107592c().mo121134b().mo58407a().mo71803a();
        int length = bVarArr.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                break;
            }
            C80962f fVar = bVarArr[i];
            if (a.equals(fVar.mo112743d())) {
                bVar = fVar;
                break;
            }
            i++;
        }
        this.f253333a = bVar;
    }
}

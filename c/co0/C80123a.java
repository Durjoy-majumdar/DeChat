package co0;

import android.app.NotificationManager;
import android.graphics.Bitmap;
import android.util.ArrayMap;
import com.tencent.p014mm.plugin.appbrand.AppBrandRuntime;
import com.tencent.p014mm.plugin.appbrand.C83231l;
import com.tencent.p014mm.plugin.appbrand.backgroundrunning.AppBrandAudioOfVideoBackgroundPlayNotificationLogic;
import com.tencent.p014mm.plugin.appbrand.backgroundrunning.C81593u;
import com.tencent.p014mm.plugin.appbrand.jsapi.xwebplugin.live.AppBrandBackgroundRunningOperationEvent;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import p1066yc.C91418n;
import p1066yc.C91421q;
import p1066yc.C91422r;
import p1066yc.C91423s;
import p910lj.C76701a;

/* renamed from: co0.a */
public class C80123a extends C81593u {

    /* renamed from: d */
    public final AppBrandRuntime f234608d;

    /* renamed from: e */
    public final String f234609e;

    /* renamed from: f */
    public final C80129c f234610f;

    /* renamed from: g */
    public volatile boolean f234611g;

    /* renamed from: h */
    public volatile C80126c f234612h = null;

    /* renamed from: i */
    public volatile boolean f234613i = true;

    /* renamed from: j */
    public volatile C91418n f234614j = null;

    /* renamed from: n */
    public final Object f234615n = new Object();

    /* renamed from: o */
    public final Map<C91418n, Boolean> f234616o = new ArrayMap();

    /* renamed from: p */
    public final List<C91418n> f234617p = new ArrayList();

    /* renamed from: q */
    public final List<C91418n> f234618q = new ArrayList();

    /* renamed from: r */
    public final LinkedList<C91418n> f234619r = new LinkedList<>();

    /* renamed from: s */
    public AtomicBoolean f234620s = new AtomicBoolean(false);

    /* renamed from: t */
    public AtomicBoolean f234621t = new AtomicBoolean(false);

    /* renamed from: co0.a$a */
    public class C80124a extends C83231l.C83234d {
        public C80124a() {
        }

        /* renamed from: b */
        public void mo109496b() {
            Log.m105924i("MicroMsg.AppBrand.AppBrandRuntimeAudioOfVideoBackgroundPlayManager", "onCreate");
            C80123a.this.f234611g = false;
        }

        /* renamed from: c */
        public void mo109497c() {
            Log.m105924i("MicroMsg.AppBrand.AppBrandRuntimeAudioOfVideoBackgroundPlayManager", "onDestroy");
            C80123a.this.mo110366d();
            C83231l.m102144e(C80123a.this.f234609e, this);
        }

        /* renamed from: e */
        public void mo74049e(C83231l.C83235e eVar) {
            Log.m105924i("MicroMsg.AppBrand.AppBrandRuntimeAudioOfVideoBackgroundPlayManager", "onPause, type: " + eVar);
            C80123a.this.mo110376y(eVar);
        }

        /* renamed from: f */
        public void mo109498f() {
            Log.m105924i("MicroMsg.AppBrand.AppBrandRuntimeAudioOfVideoBackgroundPlayManager", "onResume");
            C80123a aVar = C80123a.this;
            aVar.f234611g = false;
            if (aVar.f234620s.getAndSet(false)) {
                Log.m105924i("MicroMsg.AppBrand.AppBrandRuntimeAudioOfVideoBackgroundPlayManager", "onRuntimeForeground, ignore");
                return;
            }
            C91418n o = aVar.mo110370o();
            if (o != null) {
                if (!aVar.mo110372s(o)) {
                    aVar.mo110361M(o);
                }
                aVar.f234613i = false;
                aVar.f234610f.mo110378a();
                aVar.f234614j = null;
                Log.m105924i("MicroMsg.AppBrand.AppBrandRuntimeAudioOfVideoBackgroundPlayManager", "onRuntimeForeground, disableAppBrandBackgroundRun");
                aVar.mo110366d();
            }
        }
    }

    /* renamed from: co0.a$b */
    public class C80125b implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ String f234623d;

        public C80125b(C80123a aVar, String str) {
            this.f234623d = str;
        }

        public void run() {
            C76701a.makeText(MMApplicationContext.getContext(), (CharSequence) this.f234623d, 0).show();
        }
    }

    /* renamed from: co0.a$c */
    public interface C80126c {
    }

    public C80123a(AppBrandRuntime appBrandRuntime) {
        this.f234608d = appBrandRuntime;
        String str = appBrandRuntime.f238147j;
        this.f234609e = str;
        this.f234610f = new C80129c(this);
        this.f234611g = !appBrandRuntime.f238122S;
        C83231l.m102140a(str, new C80124a());
    }

    /* renamed from: A */
    public void mo110358A() {
        Log.m105924i("MicroMsg.AppBrand.AppBrandRuntimeAudioOfVideoBackgroundPlayManager", "pauseBackgroundAudioPlay");
        C91418n o = mo110370o();
        if (o == null) {
            Log.m105928w("MicroMsg.AppBrand.AppBrandRuntimeAudioOfVideoBackgroundPlayManager", "pauseBackgroundAudioPlay, mBackgroundAudioPlayer is null");
        } else if (mo110359C(o)) {
            this.f234613i = true;
            C80126c cVar = this.f234612h;
            if (cVar != null) {
                AppBrandAudioOfVideoBackgroundPlayNotificationLogic.C81565b bVar = (AppBrandAudioOfVideoBackgroundPlayNotificationLogic.C81565b) cVar;
                if (AppBrandAudioOfVideoBackgroundPlayNotificationLogic.this.f239198i) {
                    Log.m105924i("AppBrand.MicroMsg.AppBrandAudioOfVideoBackgroundPlayNotificationLogic", "onBackgroundAudioPause, isCanceled");
                    return;
                }
                AppBrandAudioOfVideoBackgroundPlayNotificationLogic.this.f239199j = false;
                Log.m105918d("AppBrand.MicroMsg.AppBrandAudioOfVideoBackgroundPlayNotificationLogic", "onBackgroundAudioPause, notify pause");
                AppBrandAudioOfVideoBackgroundPlayNotificationLogic appBrandAudioOfVideoBackgroundPlayNotificationLogic = AppBrandAudioOfVideoBackgroundPlayNotificationLogic.this;
                NotificationManager notificationManager = appBrandAudioOfVideoBackgroundPlayNotificationLogic.f239196g;
                int d = appBrandAudioOfVideoBackgroundPlayNotificationLogic.mo113825d();
                AppBrandAudioOfVideoBackgroundPlayNotificationLogic appBrandAudioOfVideoBackgroundPlayNotificationLogic2 = AppBrandAudioOfVideoBackgroundPlayNotificationLogic.this;
                notificationManager.notify(d, appBrandAudioOfVideoBackgroundPlayNotificationLogic2.mo113827k(appBrandAudioOfVideoBackgroundPlayNotificationLogic2.f239195f, false, (Bitmap) null));
            }
        }
    }

    /* renamed from: C */
    public final boolean mo110359C(C91418n nVar) {
        Log.m105924i("MicroMsg.AppBrand.AppBrandRuntimeAudioOfVideoBackgroundPlayManager", "pausePlay, videoPlayer:" + nVar.getName());
        C91423s sVar = (C91423s) nVar.mo109509c(C91423s.class);
        if (sVar == null) {
            Log.m105928w("MicroMsg.AppBrand.AppBrandRuntimeAudioOfVideoBackgroundPlayManager", "pausePlay, playerAddOnVideoController is null");
            return false;
        }
        sVar.pause();
        return true;
    }

    /* renamed from: J */
    public final void mo110360J(C91418n nVar) {
        Log.m105924i("MicroMsg.AppBrand.AppBrandRuntimeAudioOfVideoBackgroundPlayManager", "playAudio, videoPlayer:" + nVar.getName());
        C91422r rVar = (C91422r) nVar.mo109509c(C91422r.class);
        if (rVar == null) {
            Log.m105928w("MicroMsg.AppBrand.AppBrandRuntimeAudioOfVideoBackgroundPlayManager", "playAudio, videoPlayerAddOnPlayAudio is null");
            return;
        }
        rVar.mo109550d();
        mo110374w(nVar);
    }

    /* renamed from: M */
    public final void mo110361M(C91418n nVar) {
        Log.m105924i("MicroMsg.AppBrand.AppBrandRuntimeAudioOfVideoBackgroundPlayManager", "playVideo, videoPlayer:" + nVar.getName());
        C91422r rVar = (C91422r) nVar.mo109509c(C91422r.class);
        if (rVar == null) {
            Log.m105928w("MicroMsg.AppBrand.AppBrandRuntimeAudioOfVideoBackgroundPlayManager", "playVideo, videoPlayerAddOnPlayAudio is null");
            return;
        }
        rVar.mo109549b();
        mo110374w(nVar);
    }

    /* renamed from: O */
    public void mo110362O() {
        boolean z;
        Log.m105924i("MicroMsg.AppBrand.AppBrandRuntimeAudioOfVideoBackgroundPlayManager", "startBackgroundAudioPlay");
        C91418n o = mo110370o();
        if (o == null) {
            Log.m105928w("MicroMsg.AppBrand.AppBrandRuntimeAudioOfVideoBackgroundPlayManager", "startBackgroundAudioPlay, backgroundAudioPlayer is null");
            return;
        }
        Log.m105924i("MicroMsg.AppBrand.AppBrandRuntimeAudioOfVideoBackgroundPlayManager", "startPlay, videoPlayer:" + o.getName());
        C91423s sVar = (C91423s) o.mo109509c(C91423s.class);
        if (sVar == null) {
            Log.m105928w("MicroMsg.AppBrand.AppBrandRuntimeAudioOfVideoBackgroundPlayManager", "startPlay, playerAddOnVideoController is null");
            z = false;
        } else {
            sVar.start();
            z = true;
        }
        if (z) {
            this.f234613i = false;
            this.f234610f.f234630b.requestFocus();
            C80126c cVar = this.f234612h;
            if (cVar != null) {
                AppBrandAudioOfVideoBackgroundPlayNotificationLogic.C81565b bVar = (AppBrandAudioOfVideoBackgroundPlayNotificationLogic.C81565b) cVar;
                if (AppBrandAudioOfVideoBackgroundPlayNotificationLogic.this.f239198i) {
                    Log.m105924i("AppBrand.MicroMsg.AppBrandAudioOfVideoBackgroundPlayNotificationLogic", "onBackgroundAudioStart, isCanceled");
                    return;
                }
                AppBrandAudioOfVideoBackgroundPlayNotificationLogic.this.f239199j = true;
                Log.m105918d("AppBrand.MicroMsg.AppBrandAudioOfVideoBackgroundPlayNotificationLogic", "onBackgroundAudioStart, notify start");
                AppBrandAudioOfVideoBackgroundPlayNotificationLogic appBrandAudioOfVideoBackgroundPlayNotificationLogic = AppBrandAudioOfVideoBackgroundPlayNotificationLogic.this;
                NotificationManager notificationManager = appBrandAudioOfVideoBackgroundPlayNotificationLogic.f239196g;
                int d = appBrandAudioOfVideoBackgroundPlayNotificationLogic.mo113825d();
                AppBrandAudioOfVideoBackgroundPlayNotificationLogic appBrandAudioOfVideoBackgroundPlayNotificationLogic2 = AppBrandAudioOfVideoBackgroundPlayNotificationLogic.this;
                notificationManager.notify(d, appBrandAudioOfVideoBackgroundPlayNotificationLogic2.mo113827k(appBrandAudioOfVideoBackgroundPlayNotificationLogic2.f239195f, true, (Bitmap) null));
            }
        }
    }

    /* renamed from: P */
    public boolean mo110363P() {
        boolean z;
        synchronized (this.f234615n) {
            z = !this.f234619r.isEmpty();
        }
        return z;
    }

    /* renamed from: Q */
    public void mo110364Q() {
        Log.m105924i("MicroMsg.AppBrand.AppBrandRuntimeAudioOfVideoBackgroundPlayManager", "stopBackgroundAudioPlay");
        C91418n o = mo110370o();
        if (o == null) {
            Log.m105928w("MicroMsg.AppBrand.AppBrandRuntimeAudioOfVideoBackgroundPlayManager", "stopBackgroundAudioPlay, backgroundAudioPlayer is null");
        } else if (mo110359C(o)) {
            this.f234613i = false;
            this.f234610f.mo110378a();
        }
    }

    /* renamed from: c */
    public boolean mo110365c(C91418n nVar) {
        boolean z;
        boolean z2;
        C83231l.C83235e d = C83231l.m102143d(this.f234609e);
        Log.m105924i("MicroMsg.AppBrand.AppBrandRuntimeAudioOfVideoBackgroundPlayManager", "amIBackgroundAudioPlayer, videoPlayer: " + nVar.getName() + ", pauseType: " + d);
        synchronized (this.f234615n) {
            z = false;
            z2 = !this.f234619r.isEmpty() && nVar == this.f234619r.getFirst();
        }
        if (!z2 || !this.f234621t.getAndSet(false)) {
            z = z2;
        } else {
            Log.m105924i("MicroMsg.AppBrand.AppBrandRuntimeAudioOfVideoBackgroundPlayManager", "amIBackgroundAudioPlayer, ignore");
        }
        Log.m105924i("MicroMsg.AppBrand.AppBrandRuntimeAudioOfVideoBackgroundPlayManager", "amIBackgroundAudioPlayer, amIBackgroundAudioPlayer: " + z);
        return z;
    }

    /* renamed from: d */
    public void mo110366d() {
        Log.m105924i("MicroMsg.AppBrand.AppBrandRuntimeAudioOfVideoBackgroundPlayManager", "disableAppBrandBackgroundRun");
        AppBrandBackgroundRunningOperationEvent appBrandBackgroundRunningOperationEvent = new AppBrandBackgroundRunningOperationEvent();
        AppBrandBackgroundRunningOperationEvent.C83126a aVar = appBrandBackgroundRunningOperationEvent.f242920d;
        aVar.f242921a = this.f234609e;
        aVar.f242922b = 8;
        aVar.f242923c = 2;
        appBrandBackgroundRunningOperationEvent.publish();
    }

    /* renamed from: e */
    public void mo110367e(C91418n nVar) {
        boolean z;
        boolean z2;
        Log.m105924i("MicroMsg.AppBrand.AppBrandRuntimeAudioOfVideoBackgroundPlayManager", "disableBackgroundPlayAudio, videoPlayer:" + nVar.getName());
        synchronized (this.f234615n) {
            ((ArrayMap) this.f234616o).remove(nVar);
            C91418n o = mo110370o();
            z = true;
            z2 = false;
            if (!this.f234619r.contains(nVar)) {
                if (o != nVar) {
                    ((ArrayList) this.f234617p).remove(nVar);
                    z = false;
                }
            }
            this.f234619r.remove(nVar);
            if (o != nVar) {
                z = false;
                z2 = true;
            }
        }
        if (z) {
            mo110364Q();
            mo110366d();
            this.f234610f.mo110378a();
            this.f234614j = null;
        }
        if (z2) {
            mo110361M(nVar);
        }
    }

    /* renamed from: k */
    public final void mo110368k() {
        Log.m105924i("MicroMsg.AppBrand.AppBrandRuntimeAudioOfVideoBackgroundPlayManager", "enableAppBrandBackgroundRun");
        AppBrandBackgroundRunningOperationEvent appBrandBackgroundRunningOperationEvent = new AppBrandBackgroundRunningOperationEvent();
        AppBrandBackgroundRunningOperationEvent.C83126a aVar = appBrandBackgroundRunningOperationEvent.f242920d;
        aVar.f242921a = this.f234609e;
        aVar.f242922b = 8;
        aVar.f242923c = 1;
        appBrandBackgroundRunningOperationEvent.publish();
    }

    /* renamed from: l */
    public boolean mo110369l(C91418n nVar, boolean z) {
        boolean z2 = false;
        Log.m105925i("MicroMsg.AppBrand.AppBrandRuntimeAudioOfVideoBackgroundPlayManager", "enableBackgroundPlayAudio, videoPlayer: %s, playAudioImmediate: %b", nVar.getName(), Boolean.valueOf(z));
        if (this.f234611g) {
            Log.m105928w("MicroMsg.AppBrand.AppBrandRuntimeAudioOfVideoBackgroundPlayManager", "enableBackgroundPlayAudio, current is in background");
            return false;
        }
        synchronized (this.f234615n) {
            ((ArrayMap) this.f234616o).put(nVar, Boolean.valueOf(z));
            if (((ArrayList) this.f234618q).contains(nVar)) {
                ((ArrayList) this.f234618q).remove(nVar);
                this.f234619r.remove(nVar);
                this.f234619r.addFirst(nVar);
                z2 = true;
            } else {
                ((ArrayList) this.f234617p).remove(nVar);
                ((ArrayList) this.f234617p).add(nVar);
            }
        }
        if (z2 && z) {
            mo110360J(nVar);
        }
        return true;
    }

    /* renamed from: o */
    public C91418n mo110370o() {
        C91418n nVar = this.f234614j;
        if (nVar == null || !this.f234621t.get()) {
            return nVar;
        }
        Log.m105924i("MicroMsg.AppBrand.AppBrandRuntimeAudioOfVideoBackgroundPlayManager", "getBackgroundAudioPlayer, ignore");
        return null;
    }

    /* renamed from: q */
    public String mo110371q() {
        C91418n o = mo110370o();
        if (o == null) {
            return null;
        }
        Log.m105924i("MicroMsg.AppBrand.AppBrandRuntimeAudioOfVideoBackgroundPlayManager", "getTitle, videoPlayer:" + o.getName());
        C91421q qVar = (C91421q) o.mo109509c(C91421q.class);
        if (qVar != null) {
            return qVar.getTitle();
        }
        Log.m105928w("MicroMsg.AppBrand.AppBrandRuntimeAudioOfVideoBackgroundPlayManager", "getTitle, playerAddOnInfo is null");
        return null;
    }

    /* renamed from: s */
    public final boolean mo110372s(C91418n nVar) {
        Boolean bool;
        synchronized (this.f234615n) {
            bool = (Boolean) ((ArrayMap) this.f234616o).get(nVar);
        }
        return bool != null && bool.booleanValue();
    }

    /* renamed from: u */
    public void mo110373u(C91418n nVar) {
        Log.m105924i("MicroMsg.AppBrand.AppBrandRuntimeAudioOfVideoBackgroundPlayManager", "markVideoPlayPauseOrStop, videoPlayer:" + nVar.getName());
        synchronized (this.f234615n) {
            if (this.f234619r.contains(nVar)) {
                this.f234619r.remove(nVar);
                ((ArrayList) this.f234617p).add(nVar);
            } else {
                ((ArrayList) this.f234618q).remove(nVar);
            }
        }
        if (mo110370o() == nVar) {
            Log.m105924i("MicroMsg.AppBrand.AppBrandRuntimeAudioOfVideoBackgroundPlayManager", "markVideoPlayPauseOrStop, disableAppBrandBackgroundRun");
            mo110366d();
            if (!this.f234613i) {
                this.f234610f.mo110378a();
                this.f234614j = null;
            }
        }
    }

    /* renamed from: w */
    public void mo110374w(C91418n nVar) {
        boolean z;
        Log.m105924i("MicroMsg.AppBrand.AppBrandRuntimeAudioOfVideoBackgroundPlayManager", "markVideoPlayStart, videoPlayer:" + nVar.getName());
        synchronized (this.f234615n) {
            if (((ArrayList) this.f234617p).contains(nVar)) {
                ((ArrayList) this.f234617p).remove(nVar);
                z = true;
                this.f234619r.remove(nVar);
                this.f234619r.addFirst(nVar);
            } else {
                ((ArrayList) this.f234618q).remove(nVar);
                ((ArrayList) this.f234618q).add(nVar);
                z = false;
            }
        }
        if (z && mo110372s(nVar)) {
            mo110360J(nVar);
        }
        if (this.f234611g && mo110370o() != null) {
            mo110368k();
        }
    }

    /* renamed from: x */
    public void mo110375x(C91418n nVar) {
        Log.m105924i("MicroMsg.AppBrand.AppBrandRuntimeAudioOfVideoBackgroundPlayManager", "markVideoPlayerRelease, videoPlayer:" + nVar.getName());
        synchronized (this.f234615n) {
            ((ArrayList) this.f234617p).remove(nVar);
            ((ArrayList) this.f234618q).remove(nVar);
            this.f234619r.remove(nVar);
        }
        if (mo110370o() == nVar) {
            Log.m105924i("MicroMsg.AppBrand.AppBrandRuntimeAudioOfVideoBackgroundPlayManager", "markVideoPlayerRelease, disableAppBrandBackgroundRun");
            mo110366d();
            if (!this.f234613i) {
                this.f234610f.mo110378a();
                this.f234614j = null;
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0051, code lost:
        r6.f234614j = r1;
        r0 = (lo0.C88615f) r6.f234608d.mo113032U(lo0.C88615f.class);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0060, code lost:
        if (r0 != null) goto L_0x0069;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0062, code lost:
        com.tencent.p014mm.sdk.platformtools.Log.m105928w("MicroMsg.AppBrand.AppBrandRuntimeAudioOfVideoBackgroundPlayManager", "getBanBackgroundRunHint, helper is null");
        r7 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0069, code lost:
        r0 = r0.mo117459W(r6.f234608d.f238147j, r6.f234608d.f238149o.f239365g);
        com.tencent.p014mm.sdk.platformtools.Log.m105925i("MicroMsg.AppBrand.AppBrandRuntimeAudioOfVideoBackgroundPlayManager", "getBanBackgroundRunHint, banHint: ", r0);
        r7 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0085, code lost:
        if (com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil(r7) != false) goto L_0x009e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0087, code lost:
        com.tencent.p014mm.sdk.platformtools.Log.m105924i("MicroMsg.AppBrand.AppBrandRuntimeAudioOfVideoBackgroundPlayManager", "onRuntimeBackground, ban");
        mo110364Q();
        ((zt3.C119157j) zt3.C119157j.f356862d).mo183895z(new co0.C80123a.C80125b(r6, r7));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x009d, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x009e, code lost:
        r6.f234610f.f234630b.requestFocus();
        r6.f234613i = false;
        mo110360J(r1);
        com.tencent.p014mm.sdk.platformtools.Log.m105924i("MicroMsg.AppBrand.AppBrandRuntimeAudioOfVideoBackgroundPlayManager", "onRuntimeBackground, enableAppBrandBackgroundRun");
        mo110368k();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x00b4, code lost:
        return;
     */
    /* renamed from: y */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo110376y(com.tencent.p014mm.plugin.appbrand.C83231l.C83235e r7) {
        /*
            r6 = this;
            java.lang.String r0 = "MicroMsg.AppBrand.AppBrandRuntimeAudioOfVideoBackgroundPlayManager"
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "onRuntimeBackground, pauseType: "
            r1.append(r2)
            r1.append(r7)
            java.lang.String r7 = r1.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r7)
            r7 = 1
            r6.f234611g = r7
            yc.n r0 = r6.mo110370o()
            if (r0 == 0) goto L_0x003a
            java.lang.String r7 = "MicroMsg.AppBrand.AppBrandRuntimeAudioOfVideoBackgroundPlayManager"
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "onRuntimeBackground, backgroundAudioPlayer: "
            r1.append(r2)
            java.lang.String r0 = r0.getName()
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r7, r0)
            return
        L_0x003a:
            java.lang.Object r0 = r6.f234615n
            monitor-enter(r0)
            java.util.LinkedList<yc.n> r1 = r6.f234619r     // Catch:{ all -> 0x00be }
            boolean r1 = r1.isEmpty()     // Catch:{ all -> 0x00be }
            if (r1 != 0) goto L_0x00b5
            java.util.LinkedList<yc.n> r1 = r6.f234619r     // Catch:{ all -> 0x00be }
            java.lang.Object r1 = r1.getFirst()     // Catch:{ all -> 0x00be }
            yc.n r1 = (p1066yc.C91418n) r1     // Catch:{ all -> 0x00be }
            if (r1 != 0) goto L_0x0050
            goto L_0x00b5
        L_0x0050:
            monitor-exit(r0)     // Catch:{ all -> 0x00be }
            r6.f234614j = r1
            com.tencent.mm.plugin.appbrand.AppBrandRuntime r0 = r6.f234608d
            java.lang.Class<lo0.f> r2 = lo0.C88615f.class
            com.tencent.mm.plugin.appbrand.jsapi.n r0 = r0.mo113032U(r2)
            lo0.f r0 = (lo0.C88615f) r0
            java.lang.String r2 = "MicroMsg.AppBrand.AppBrandRuntimeAudioOfVideoBackgroundPlayManager"
            r3 = 0
            if (r0 != 0) goto L_0x0069
            java.lang.String r7 = "getBanBackgroundRunHint, helper is null"
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r2, r7)
            r7 = 0
            goto L_0x0081
        L_0x0069:
            com.tencent.mm.plugin.appbrand.AppBrandRuntime r4 = r6.f234608d
            java.lang.String r4 = r4.f238147j
            com.tencent.mm.plugin.appbrand.AppBrandRuntime r5 = r6.f234608d
            com.tencent.mm.plugin.appbrand.config.AppBrandInitConfig r5 = r5.f238149o
            int r5 = r5.f239365g
            java.lang.String r0 = r0.mo117459W(r4, r5)
            java.lang.Object[] r7 = new java.lang.Object[r7]
            r7[r3] = r0
            java.lang.String r4 = "getBanBackgroundRunHint, banHint: "
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r2, r4, r7)
            r7 = r0
        L_0x0081:
            boolean r0 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r7)
            if (r0 != 0) goto L_0x009e
            java.lang.String r0 = "MicroMsg.AppBrand.AppBrandRuntimeAudioOfVideoBackgroundPlayManager"
            java.lang.String r1 = "onRuntimeBackground, ban"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r1)
            r6.mo110364Q()
            zt3.t r0 = zt3.C119157j.f356862d
            co0.a$b r1 = new co0.a$b
            r1.<init>(r6, r7)
            zt3.j r0 = (zt3.C119157j) r0
            r0.mo183895z(r1)
            return
        L_0x009e:
            co0.c r7 = r6.f234610f
            com.tencent.mm.plugin.appbrand.jsapi.media.i2 r7 = r7.f234630b
            r7.requestFocus()
            r6.f234613i = r3
            r6.mo110360J(r1)
            java.lang.String r7 = "MicroMsg.AppBrand.AppBrandRuntimeAudioOfVideoBackgroundPlayManager"
            java.lang.String r0 = "onRuntimeBackground, enableAppBrandBackgroundRun"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r7, r0)
            r6.mo110368k()
            return
        L_0x00b5:
            java.lang.String r7 = "MicroMsg.AppBrand.AppBrandRuntimeAudioOfVideoBackgroundPlayManager"
            java.lang.String r1 = "onRuntimeBackground, backgroundAudioPlayer is null"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r7, r1)     // Catch:{ all -> 0x00be }
            monitor-exit(r0)     // Catch:{ all -> 0x00be }
            return
        L_0x00be:
            r7 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x00be }
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: co0.C80123a.mo110376y(com.tencent.mm.plugin.appbrand.l$e):void");
    }
}

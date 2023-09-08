package p328cz;

import android.content.Context;
import b72.C16755c;
import b72.C16756d;
import bb0.C113158c;
import bb0.C16782a;
import c72.C16867c;
import com.tencent.mapsdk.internal.C0949kl;
import com.tencent.p014mm.app.C80617t0;
import com.tencent.p014mm.app.C80625v0;
import com.tencent.p014mm.plugin.thumbplayer.downloader.CdnVideoResourceDownloader;
import com.tencent.p014mm.sdk.platformtools.BuildInfo;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.storage.C72994y1;
import com.tencent.p014mm.vfs.C86013q1;
import com.tencent.p014mm.xlog.app.XLogSetup;
import com.tencent.thumbplayer.api.TPPlayerMgr;
import com.tencent.thumbplayer.api.capability.TPCapability;
import com.tencent.thumbplayer.api.capability.TPHDRVersionRange;
import com.tencent.thumbplayer.core.downloadproxy.jni.TPDownloadProxyNative;
import com.tencent.thumbplayer.datatransport.config.TPProxyConfig;
import com.tencent.thumbplayer.datatransport.config.TPProxyServiceConfig;
import d72.C20446a;
import di3.C86301e;
import di3.C86312j;
import e03.C20486c;
import ei3.C86522b;
import f03.C97785g;
import f03.C97787h;
import f40.C86709a0;
import fy3.C32224a;
import gy3.C87412m;
import gy3.C87413o;
import h81.C32735h;
import ht1.C60200t1;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Result;
import kotlin.ResultKt;
import org.json.JSONObject;
import p1081gi.C98119b;
import p501dz.C58463e;
import p501dz.C58466h;
import p663qo.C101211h;
import rx3.C13598b0;
import rx3.C13601g;
import rx3.C36568h;
import rx3.C36570n;
import sx3.C36907w;
import t62.C118386b;
import t62.C22438a;
import u62.C22595e;
import z62.C66734b;
import zh3.C91753f;

@C86522b(onProcess = {C80625v0.MATCH_MM})
/* renamed from: cz.i */
public final class C20373i extends C86301e implements C58466h, C80617t0.C80620c {

    /* renamed from: d */
    public Log.LogInstance f57090d;

    /* renamed from: e */
    public int f57091e;

    /* renamed from: f */
    public final C13601g f57092f = C36568h.m40985a(C20374a.f57098d);

    /* renamed from: g */
    public final C13601g f57093g = C36568h.m40985a(C20375b.f57099d);

    /* renamed from: h */
    public volatile C91753f f57094h;

    /* renamed from: i */
    public final byte[] f57095i = new byte[0];

    /* renamed from: j */
    public C113158c f57096j;

    /* renamed from: n */
    public Boolean f57097n;

    /* renamed from: cz.i$a */
    public static final class C20374a extends C87413o implements C32224a<C20486c> {

        /* renamed from: d */
        public static final C20374a f57098d = new C20374a();

        public C20374a() {
            super(0);
        }

        public Object invoke() {
            C20486c cVar = new C20486c();
            Class cls = C101211h.class;
            Log.m105924i(cVar.f57655a, "init cdn task controller");
            cVar.f57658d.clear();
            cVar.f57659e.clear();
            cVar.f57656b.clear();
            cVar.f57657c.clear();
            ((C101211h) C86312j.m106911c(cls)).Nw0(new C20486c.C20490b());
            ((C101211h) C86312j.m106911c(cls)).y10(new C20486c.C20487a());
            return cVar;
        }
    }

    /* renamed from: cz.i$b */
    public static final class C20375b extends C87413o implements C32224a<C16756d> {

        /* renamed from: d */
        public static final C20375b f57099d = new C20375b();

        public C20375b() {
            super(0);
        }

        public Object invoke() {
            C16756d dVar = new C16756d();
            Class cls = C101211h.class;
            Log.m105924i("MMMarsTaskDistributor", "bindCdnEngineService");
            ((C101211h) C86312j.m106911c(cls)).mo140277K1(new C16756d.C16758c());
            ((C101211h) C86312j.m106911c(cls)).mo140274B2(new C16756d.C16757a());
            return dVar;
        }
    }

    /* renamed from: cz.i$c */
    public static final class C20376c implements C91753f.C66827b {

        /* renamed from: a */
        public static final C20376c f57100a = new C20376c();

        /* renamed from: a */
        public final String[] mo6410a() {
            String[] strArr = C113158c.f338579e;
            return C113158c.f338579e;
        }
    }

    public static final boolean vx0(C20373i iVar, int i) {
        iVar.getClass();
        return !BuildInfo.DEBUG && i == 0 && iVar.f57090d != null;
    }

    /* renamed from: J0 */
    public void mo31867J0(String str) {
        if (TPDownloadProxyNative.getInstance().isReadyForWork()) {
            try {
                TPDownloadProxyNative.getInstance().pushEvent(13);
            } catch (Throwable th) {
                Log.m105920e("MicroMsg.ThumbPlayerService", "pushEvent failed, error: " + th);
            }
        }
    }

    /* renamed from: LF */
    public boolean mo31868LF() {
        if (this.f57097n == null) {
            this.f57097n = Boolean.valueOf(((C32735h) C86312j.m106911c(C32735h.class)).mo58779Qe(C32735h.C32737c.clicfg_open_tp_play_flag, 1) == 1);
        }
        Boolean bool = this.f57097n;
        if (bool != null) {
            return bool.booleanValue();
        }
        return true;
    }

    /* renamed from: LK */
    public C22438a mo31869LK(C22595e eVar, C66734b bVar, String str, String str2) {
        C87412m.m108594g(eVar, "onePlayContext");
        C87412m.m108594g(bVar, "mediaSource");
        C87412m.m108594g(str, "originMediaId");
        C87412m.m108594g(str2, "playMediaId");
        return new C118386b(eVar, bVar, str, str2);
    }

    public C58463e Qi0() {
        return xx0();
    }

    /* renamed from: h2 */
    public void mo31871h2(String str) {
        if (TPDownloadProxyNative.getInstance().isReadyForWork()) {
            try {
                TPDownloadProxyNative.getInstance().pushEvent(14);
            } catch (Throwable th) {
                Log.m105920e("MicroMsg.ThumbPlayerService", "pushEvent failed, error: " + th);
            }
        }
    }

    public C97787h mr0(C97785g gVar) {
        C87412m.m108594g(gVar, "task");
        return new CdnVideoResourceDownloader(gVar);
    }

    public void onAccountInitialized(Context context) {
        C87412m.m108594g(context, "context");
        wx0();
        Class cls = C32735h.class;
        int Qe = ((C32735h) C86312j.m106911c(cls)).mo58779Qe(C32735h.C32737c.clicfg_xlog_open_multi, 0);
        this.f57091e = Qe;
        if (Qe == 0 && this.f57090d == null) {
            Log.LogInstance openLogInstance = Log.openLogInstance(2, 0, XLogSetup.cachePath, XLogSetup.logPath, C0949kl.f2240j, 0);
            C87412m.m108593f(openLogInstance, "openLogInstance(Xlog.LEV…ogSetup.logPath, \"TP\", 0)");
            this.f57090d = openLogInstance;
        }
        TPPlayerMgr.setOnLogListener(new C86158j(this));
        long G = C86709a0.m107535s().mo121142i().mo119673G(C72994y1.C72995a.USERINFO_TP_PLAYER_LOCAL_SERVER_BUFFER_SIZE_LONG_SYNC, -1);
        long G2 = C86709a0.m107535s().mo121142i().mo119673G(C72994y1.C72995a.USERINFO_TP_PLAYER_LOCAL_SERVER_SEND_SOCKET_BUFFER_SIZE_LONG_SYNC, -1);
        TPProxyServiceConfig tPProxyServiceConfig = new TPProxyServiceConfig();
        tPProxyServiceConfig.serviceType = 100;
        tPProxyServiceConfig.dataDir = ((C60200t1) C86312j.m106911c(C60200t1.class)).lr0();
        JSONObject jSONObject = new JSONObject();
        if (G > 0) {
            jSONObject.put("key_localserver_buffer_size", G);
        }
        if (G2 > 0) {
            jSONObject.put("key_localserver_send_socket_buffer_size", G2);
        }
        tPProxyServiceConfig.initConfig = jSONObject.toString();
        TPProxyConfig.setProxyConfig(tPProxyServiceConfig);
        TPPlayerMgr.initSdk(MMApplicationContext.getContext(), "60303", 1);
        TPPlayerMgr.setProxyEnable(true);
        TPPlayerMgr.setProxyServiceType(100);
        boolean z = ((C32735h) C86312j.m106911c(cls)).mo58779Qe(C32735h.C32737c.clicfg_finder_is_enable_mediacodec_stuck_check, 1) == 1;
        boolean wf = ((C32735h) C86312j.m106911c(cls)).mo58784wf(C32735h.C32737c.clicfg_enable_tp_local_server_checker, false);
        Log.m105924i("MicroMsg.ThumbPlayerService", " enableLocalServerCheck: " + wf + " mediaCodecStuckCheck: " + z + " localserver_buffer_size:" + G + " localserver_send_socket_buffer_size:" + G2);
        if (wf) {
            TPPlayerMgr.setHost(new JSONObject().put("EnableCheckLocalServer", true).toString());
        }
        C80617t0.m98255d().mo112357c(this);
        TPCapability.addHDRWhiteList(4, new TPHDRVersionRange(9999999, 0, 99, 0));
    }

    public void onAccountReleased(Context context) {
        Class cls = C101211h.class;
        C87412m.m108594g(context, "context");
        C20486c xx02 = xx0();
        Log.m105924i(xx02.f57655a, "release cdn task controller");
        xx02.f57658d.clear();
        xx02.f57659e.clear();
        xx02.f57656b.clear();
        xx02.f57657c.clear();
        xx02.f57660f.clear();
        ((C101211h) C86312j.m106911c(cls)).Nw0((C101211h.C101212a) null);
        ((C101211h) C86312j.m106911c(cls)).y10((C98119b) null);
        C16756d dVar = (C16756d) ((C36570n) this.f57093g).getValue();
        dVar.getClass();
        Log.m105924i("MMMarsTaskDistributor", "release");
        StringBuilder sb = new StringBuilder();
        sb.append("cancelAllTask downloadTaskListSize:");
        sb.append(dVar.f45288c.size());
        sb.append(" downloadTaskList:");
        CopyOnWriteArrayList<C16867c> copyOnWriteArrayList = dVar.f45288c;
        ArrayList arrayList = new ArrayList(C36907w.m41090l(copyOnWriteArrayList, 10));
        Iterator<C16867c> it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            arrayList.add("taskId:" + it.next());
        }
        sb.append(arrayList);
        sb.append(" preloadTaskListSize:");
        sb.append(dVar.f45287b.size());
        sb.append(" preloadTaskList:");
        CopyOnWriteArrayList<C20446a> copyOnWriteArrayList2 = dVar.f45287b;
        ArrayList arrayList2 = new ArrayList(C36907w.m41090l(copyOnWriteArrayList2, 10));
        Iterator<C20446a> it4 = copyOnWriteArrayList2.iterator();
        while (it4.hasNext()) {
            arrayList2.add("taskId:" + it4.next());
        }
        sb.append(arrayList2);
        Log.m105924i("MMMarsTaskDistributor", sb.toString());
        Iterator<C16867c> it5 = dVar.f45288c.iterator();
        while (it5.hasNext()) {
            C16867c next = it5.next();
            C87412m.m108593f(next, "task");
            dVar.mo17766d(next);
        }
        Iterator<C20446a> it6 = dVar.f45287b.iterator();
        while (it6.hasNext()) {
            C20446a next2 = it6.next();
            C87412m.m108593f(next2, "task");
            dVar.mo17766d(next2);
        }
        C16755c cVar = dVar.f45286a;
        if (cVar != null) {
            cVar.mo17767B2((C98119b) null);
            C16755c cVar2 = dVar.f45286a;
            if (cVar2 != null) {
                cVar2.mo17768K1((C101211h.C101212a) null);
            }
        } else {
            ((C101211h) C86312j.m106911c(cls)).mo140277K1((C101211h.C101212a) null);
            ((C101211h) C86312j.m106911c(cls)).mo140274B2((C98119b) null);
        }
        if (this.f57094h != null) {
            C91753f fVar = this.f57094h;
            if (fVar != null) {
                fVar.mo124432b();
            }
            this.f57094h = null;
        }
        C80617t0.m98255d().mo112358f(this);
    }

    /* renamed from: pJ */
    public boolean mo31873pJ() {
        return true;
    }

    public final void wx0() {
        if (this.f57094h == null && C86709a0.m107522a()) {
            synchronized (this.f57095i) {
                Log.m105924i("MicroMsg.ThumbPlayerService", "checkResetDb  need reset DB now " + Thread.currentThread().getName() + ' ' + Thread.currentThread().getId() + ' ' + hashCode());
                if (this.f57094h == null) {
                    yx0();
                    Log.m105924i("MicroMsg.ThumbPlayerService", "resetDB done");
                }
                C13598b0 b0Var = C13598b0.f38549a;
            }
        }
    }

    public final C20486c xx0() {
        return (C20486c) ((C36570n) this.f57092f).getValue();
    }

    public final void yx0() {
        C91753f fVar;
        Boolean bool;
        Boolean bool2;
        Boolean bool3;
        if (this.f57094h == null) {
            this.f57094h = new C91753f();
            String str = C86709a0.m107535s().f251807e + "MMPlayerMediaInfo.db";
            HashMap hashMap = new HashMap();
            hashMap.put(1926226259, C20376c.f57100a);
            C91753f fVar2 = this.f57094h;
            C87412m.m108591d(fVar2);
            if (!fVar2.mo125626p(str, hashMap, true, true)) {
                C16782a.f45343a.getClass();
                C91753f fVar3 = new C91753f();
                try {
                    Result.Companion companion = Result.Companion;
                    bool = Result.m168114constructorimpl(Boolean.valueOf(fVar3.mo125626p(str, hashMap, true, true)));
                } catch (Throwable th) {
                    th = th;
                    fVar = fVar3;
                }
                Boolean bool4 = Boolean.FALSE;
                if (Result.m168120isFailureimpl(bool)) {
                    bool = bool4;
                }
                if (!((Boolean) bool).booleanValue()) {
                    boolean h = C86013q1.m106447h(str + "-wal");
                    fVar = new C91753f();
                    if (h) {
                        try {
                            bool3 = Result.m168114constructorimpl(Boolean.valueOf(fVar.mo125626p(str, hashMap, true, true)));
                        } catch (Throwable th4) {
                            th = th4;
                            Result.Companion companion2 = Result.Companion;
                            Result.m168114constructorimpl(ResultKt.createFailure(th));
                            fVar3 = fVar;
                            this.f57094h = fVar3;
                        }
                        Boolean bool5 = Boolean.FALSE;
                        if (Result.m168120isFailureimpl(bool3)) {
                            bool3 = bool5;
                        }
                        if (((Boolean) bool3).booleanValue()) {
                            fVar3 = fVar;
                        }
                    }
                    boolean h2 = C86013q1.m106447h(str);
                    C91753f fVar4 = new C91753f();
                    if (h2) {
                        try {
                            bool2 = Result.m168114constructorimpl(Boolean.valueOf(fVar4.mo125626p(str, hashMap, true, true)));
                        } catch (Throwable th5) {
                            th = th5;
                            fVar = fVar4;
                            Result.Companion companion22 = Result.Companion;
                            Result.m168114constructorimpl(ResultKt.createFailure(th));
                            fVar3 = fVar;
                            this.f57094h = fVar3;
                        }
                        Boolean bool6 = Boolean.FALSE;
                        if (Result.m168120isFailureimpl(bool2)) {
                            bool2 = bool6;
                        }
                        ((Boolean) bool2).booleanValue();
                    }
                    fVar3 = fVar4;
                }
                Result.m168114constructorimpl(C13598b0.f38549a);
                this.f57094h = fVar3;
            }
        }
    }
}

package com.tencent.p014mm.plugin.sns.model;

import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.Point;
import android.os.Looper;
import android.util.DisplayMetrics;
import android.view.WindowManager;
import ao2.C79617c;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.app.C80625v0;
import com.tencent.p014mm.memory.C92704c;
import com.tencent.p014mm.memory.C92708g;
import com.tencent.p014mm.memory.C92716o;
import com.tencent.p014mm.p136ui.C74942w4;
import com.tencent.p014mm.plugin.downloader.model.C40935l;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.plugin.sns.model.C5431p1;
import com.tencent.p014mm.plugin.sns.p106ui.C95790g2;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.MMHandler;
import com.tencent.p014mm.sdk.platformtools.MultiProcSharedPreferences;
import com.tencent.p014mm.sdk.platformtools.MultiProcessMMKV;
import com.tencent.p014mm.sdk.storage.IAutoDBItem;
import com.tencent.p014mm.storage.C44668u3;
import com.tencent.p014mm.vfs.C86001b0;
import com.tencent.p014mm.vfs.C86013q1;
import di3.C86301e;
import di3.C86312j;
import eb0.C97624e3;
import ei3.C86522b;
import f40.C86709a0;
import f62.C75700k0;
import h81.C32735h;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import jp2.C33615q;
import jq2.C88011l;
import jr2.C99015i;
import jr2.C99017s;
import js2.C60920c;
import js2.C99021b;
import kg3.C76577a;
import mr2.C99960a;
import os2.C100399d0;
import os2.C100400e0;
import os2.C100405h;
import os2.C100407j;
import os2.C100408j0;
import os2.C100411k0;
import os2.C100421x;
import os2.C100423z;
import os2.C11766m0;
import os2.C35287b0;
import os2.C35288c;
import os2.C35290e;
import os2.C35292h0;
import os2.C35294o0;
import os2.C35297q0;
import os2.C35300v0;
import os2.C77035g;
import p237sp.C13754y;
import p663qo.C101211h;
import ps2.C100853b;
import ps2.C100891r;
import vt2.C102279c;
import yn2.C91534e;
import zh3.C91753f;
import zr2.C66976a;
import zt3.C119157j;

@C86522b(onProcess = {C80625v0.MATCH_MM})
/* renamed from: com.tencent.mm.plugin.sns.model.e1 */
public final class C94866e1 extends C86301e implements C99017s {

    /* renamed from: V */
    public static int f274866V;

    /* renamed from: W */
    public static HashMap<Integer, C91753f.C66827b> f274867W = new HashMap<>();

    /* renamed from: X */
    public static MMHandler f274868X;

    /* renamed from: Y */
    public static int f274869Y = 103;

    /* renamed from: Z */
    public static int f274870Z = C74942w4.m89786c(MMApplicationContext.getContext(), C0966R.dimen.f4320kj);

    /* renamed from: p0 */
    public static Point f274871p0 = new Point();

    /* renamed from: x0 */
    public static boolean f274872x0 = false;

    /* renamed from: A */
    public C35297q0 f274873A;

    /* renamed from: B */
    public C35294o0 f274874B;

    /* renamed from: C */
    public C5431p1.C5432a f274875C;

    /* renamed from: D */
    public C94853e f274876D;

    /* renamed from: E */
    public C94928p2 f274877E;

    /* renamed from: F */
    public C95790g2 f274878F;

    /* renamed from: G */
    public C99021b f274879G;

    /* renamed from: H */
    public C60920c f274880H;

    /* renamed from: I */
    public C94974y1 f274881I;

    /* renamed from: J */
    public C94950t1 f274882J;

    /* renamed from: K */
    public C35292h0 f274883K;

    /* renamed from: L */
    public C33615q f274884L;

    /* renamed from: M */
    public C30414s1 f274885M = new C30414s1();

    /* renamed from: N */
    public C99960a f274886N;

    /* renamed from: P */
    public final byte[] f274887P = new byte[0];

    /* renamed from: Q */
    public volatile boolean f274888Q = false;

    /* renamed from: R */
    public final byte[] f274889R = new byte[0];

    /* renamed from: S */
    public C94869f2 f274890S;

    /* renamed from: T */
    public MultiProcessMMKV f274891T = MultiProcessMMKV.getMMKV("sns_core_db_damage_record");

    /* renamed from: U */
    public boolean f274892U = false;

    /* renamed from: d */
    public MMHandler f274893d = new MMHandler(Looper.getMainLooper());

    /* renamed from: e */
    public final ExecutorService[] f274894e = {null};

    /* renamed from: f */
    public final ExecutorService[] f274895f = {null};

    /* renamed from: g */
    public final ExecutorService[] f274896g = {null};

    /* renamed from: h */
    public final ExecutorService[] f274897h = {null};

    /* renamed from: i */
    public C100411k0 f274898i;

    /* renamed from: j */
    public C100408j0 f274899j;

    /* renamed from: n */
    public C100400e0 f274900n;

    /* renamed from: o */
    public C100407j f274901o;

    /* renamed from: p */
    public C35290e f274902p;

    /* renamed from: q */
    public C35300v0 f274903q;

    /* renamed from: r */
    public C35288c f274904r;

    /* renamed from: s */
    public C100405h f274905s;

    /* renamed from: t */
    public C94901o f274906t;

    /* renamed from: u */
    public C100399d0 f274907u;

    /* renamed from: v */
    public C100423z f274908v;

    /* renamed from: w */
    public C100421x f274909w;

    /* renamed from: x */
    public C11766m0 f274910x;

    /* renamed from: y */
    public C35287b0 f274911y;

    /* renamed from: z */
    public C94843b1 f274912z;

    static {
        f274867W.put(-838549946, new e1$$m());
        f274867W.put(657748297, new e1$$n());
        f274867W.put(936699413, new e1$$o());
        f274867W.put(2017039304, new e1$$p());
        f274867W.put(481637147, new e1$$q());
        f274867W.put(705018933, new e1$$r());
        f274867W.put(705018933, new e1$$s());
        f274867W.put(-106609422, new e1$$t());
        f274867W.put(-1101647464, new e1$$u());
        f274867W.put(1820255062, new e1$$c());
        f274867W.put(2010687871, new e1$$d());
        f274867W.put(1221165350, new e1$$e());
        f274867W.put(1091255064, new e1$$f());
        f274867W.put(658091182, new e1$$g());
        f274867W.put(584924793, new e1$$h());
        f274867W.put(297855733, new e1$$i());
    }

    public static C94866e1 Ax0() {
        SnsMethodCalculate.markStartTimeMs("getCore", "com.tencent.mm.plugin.sns.model.SnsCore");
        C94866e1 e1Var = (C94866e1) C86312j.m106911c(C94866e1.class);
        e1Var.oy0();
        SnsMethodCalculate.markEndTimeMs("getCore", "com.tencent.mm.plugin.sns.model.SnsCore");
        return e1Var;
    }

    public static C100411k0 Bx0() {
        SnsMethodCalculate.markStartTimeMs("getDataDB", "com.tencent.mm.plugin.sns.model.SnsCore");
        C94866e1 Ax0 = Ax0();
        SnsMethodCalculate.markStartTimeMs("initDbOnDemand", "com.tencent.mm.plugin.sns.model.SnsCore");
        if (!C86709a0.m107522a()) {
            SnsMethodCalculate.markEndTimeMs("initDbOnDemand", "com.tencent.mm.plugin.sns.model.SnsCore");
        } else {
            synchronized (Ax0.f274887P) {
                try {
                    if (Ax0.f274898i != null) {
                        SnsMethodCalculate.markEndTimeMs("initDbOnDemand", "com.tencent.mm.plugin.sns.model.SnsCore");
                    } else {
                        Log.m105924i("MicroMsg.SnsCore", "getCore need reset DB now " + Thread.currentThread().getName() + " " + Thread.currentThread().getId() + " " + Ax0.hashCode());
                        C102279c.f301242j.getClass();
                        SnsMethodCalculate.markStartTimeMs("triggerInit", "com.tencent.mm.plugin.sns.ui.improve.component.data.ImproveDataUIC$Companion");
                        SnsMethodCalculate.markEndTimeMs("triggerInit", "com.tencent.mm.plugin.sns.ui.improve.component.data.ImproveDataUIC$Companion");
                        Ax0.ty0();
                        Log.m105924i("MicroMsg.SnsCore", "resetdb done");
                        SnsMethodCalculate.markEndTimeMs("initDbOnDemand", "com.tencent.mm.plugin.sns.model.SnsCore");
                    }
                } catch (Throwable th) {
                    while (true) {
                        SnsMethodCalculate.markEndTimeMs("initDbOnDemand", "com.tencent.mm.plugin.sns.model.SnsCore");
                        throw th;
                    }
                }
            }
        }
        C100411k0 k0Var = Ax0().f274898i;
        SnsMethodCalculate.markEndTimeMs("getDataDB", "com.tencent.mm.plugin.sns.model.SnsCore");
        return k0Var;
    }

    public static ExecutorService Cx0() {
        SnsMethodCalculate.markStartTimeMs("getDecodeExecutor", "com.tencent.mm.plugin.sns.model.SnsCore");
        if (Ax0().f274895f[0] == null) {
            synchronized (Ax0().f274895f) {
                try {
                    if (Ax0().f274895f[0] == null) {
                        Ax0().f274895f[0] = ((C119157j) C119157j.f356862d).mo183882m("SnsCore_thumbDecode_handler", 6, 6, new LinkedBlockingQueue());
                    }
                } catch (Throwable th) {
                    SnsMethodCalculate.markEndTimeMs("getDecodeExecutor", "com.tencent.mm.plugin.sns.model.SnsCore");
                    throw th;
                }
            }
        }
        ExecutorService executorService = Ax0().f274895f[0];
        SnsMethodCalculate.markEndTimeMs("getDecodeExecutor", "com.tencent.mm.plugin.sns.model.SnsCore");
        return executorService;
    }

    public static ExecutorService Dx0() {
        SnsMethodCalculate.markStartTimeMs("getFileExecutor", "com.tencent.mm.plugin.sns.model.SnsCore");
        if (Ax0().f274894e[0] == null) {
            synchronized (Ax0().f274894e) {
                try {
                    if (Ax0().f274894e[0] == null) {
                        Ax0().f274894e[0] = ((C119157j) C119157j.f356862d).mo183883n("SnsCore#File");
                    }
                } catch (Throwable th) {
                    SnsMethodCalculate.markEndTimeMs("getFileExecutor", "com.tencent.mm.plugin.sns.model.SnsCore");
                    throw th;
                }
            }
        }
        ExecutorService executorService = Ax0().f274894e[0];
        SnsMethodCalculate.markEndTimeMs("getFileExecutor", "com.tencent.mm.plugin.sns.model.SnsCore");
        return executorService;
    }

    public static String Ex0() {
        SnsMethodCalculate.markStartTimeMs("getFileSys", "com.tencent.mm.plugin.sns.model.SnsCore");
        SnsMethodCalculate.markEndTimeMs("getFileSys", "com.tencent.mm.plugin.sns.model.SnsCore");
        return "";
    }

    public static C94901o Fx0() {
        SnsMethodCalculate.markStartTimeMs("getImageLoader", "com.tencent.mm.plugin.sns.model.SnsCore");
        C86709a0.m107523b().mo121108c();
        if (Ax0().f274906t == null) {
            Ax0().f274906t = new C94901o();
        }
        C94901o oVar = Ax0().f274906t;
        SnsMethodCalculate.markEndTimeMs("getImageLoader", "com.tencent.mm.plugin.sns.model.SnsCore");
        return oVar;
    }

    public static ExecutorService Gx0() {
        SnsMethodCalculate.markStartTimeMs("getMediaExecutor", "com.tencent.mm.plugin.sns.model.SnsCore");
        if (Ax0().f274896g[0] == null) {
            synchronized (Ax0().f274896g) {
                try {
                    if (Ax0().f274896g[0] == null) {
                        Ax0().f274896g[0] = ((C119157j) C119157j.f356862d).mo183882m("SnsCore_CDNDownload_handler", 6, 6, new LinkedBlockingQueue());
                    }
                } catch (Throwable th) {
                    SnsMethodCalculate.markEndTimeMs("getMediaExecutor", "com.tencent.mm.plugin.sns.model.SnsCore");
                    throw th;
                }
            }
        }
        ExecutorService executorService = Ax0().f274896g[0];
        SnsMethodCalculate.markEndTimeMs("getMediaExecutor", "com.tencent.mm.plugin.sns.model.SnsCore");
        return executorService;
    }

    public static int Hx0() {
        SnsMethodCalculate.markStartTimeMs("getMultiThumbDisplaySize", "com.tencent.mm.plugin.sns.model.SnsCore");
        int b = (Lx0().x - C76577a.m92151b(MMApplicationContext.getContext(), f274869Y)) / 3;
        int i = f274870Z;
        if (b > i) {
            b = i;
        }
        if (b <= 10) {
            Log.m105920e("MicroMsg.SnsCore", "can not get multiThumbDisplaySize or the multiThumbDisplaySize < 10");
            SnsMethodCalculate.markEndTimeMs("getMultiThumbDisplaySize", "com.tencent.mm.plugin.sns.model.SnsCore");
            return 150;
        }
        SnsMethodCalculate.markEndTimeMs("getMultiThumbDisplaySize", "com.tencent.mm.plugin.sns.model.SnsCore");
        return b;
    }

    public static C30414s1 Ix0() {
        SnsMethodCalculate.markStartTimeMs("getPreTimelineService", "com.tencent.mm.plugin.sns.model.SnsCore");
        C30414s1 s1Var = Ax0().f274885M;
        SnsMethodCalculate.markEndTimeMs("getPreTimelineService", "com.tencent.mm.plugin.sns.model.SnsCore");
        return s1Var;
    }

    public static C44668u3 Jx0() {
        SnsMethodCalculate.markStartTimeMs("getRcontactStg", "com.tencent.mm.plugin.sns.model.SnsCore");
        C86709a0.m107528h();
        C44668u3 Ni = ((C75700k0) C86709a0.m107533q(C75700k0.class)).mo96097Ni();
        SnsMethodCalculate.markEndTimeMs("getRcontactStg", "com.tencent.mm.plugin.sns.model.SnsCore");
        return Ni;
    }

    public static C95790g2 Kx0() {
        SnsMethodCalculate.markStartTimeMs("getResumeControl", "com.tencent.mm.plugin.sns.model.SnsCore");
        C86709a0.m107523b().mo121108c();
        if (Ax0().f274878F == null) {
            Ax0().f274878F = new C95790g2();
        }
        C95790g2 g2Var = Ax0().f274878F;
        SnsMethodCalculate.markEndTimeMs("getResumeControl", "com.tencent.mm.plugin.sns.model.SnsCore");
        return g2Var;
    }

    public static Point Lx0() {
        SnsMethodCalculate.markStartTimeMs("getScreenSize", "com.tencent.mm.plugin.sns.model.SnsCore");
        if (f274871p0.x == 0) {
            DisplayMetrics displayMetrics = new DisplayMetrics();
            ((WindowManager) MMApplicationContext.getContext().getSystemService("window")).getDefaultDisplay().getMetrics(displayMetrics);
            Point point = f274871p0;
            point.x = displayMetrics.widthPixels;
            point.y = displayMetrics.heightPixels;
        }
        Point point2 = f274871p0;
        SnsMethodCalculate.markEndTimeMs("getScreenSize", "com.tencent.mm.plugin.sns.model.SnsCore");
        return point2;
    }

    public static String Mx0() {
        SnsMethodCalculate.markStartTimeMs("getSelfName", "com.tencent.mm.plugin.sns.model.SnsCore");
        C86709a0.m107528h();
        String str = (String) C86709a0.m107535s().mo121142i().mo119684e(2, (Object) null);
        SnsMethodCalculate.markEndTimeMs("getSelfName", "com.tencent.mm.plugin.sns.model.SnsCore");
        return str;
    }

    public static int Nx0() {
        SnsMethodCalculate.markStartTimeMs("getSelfUin", "com.tencent.mm.plugin.sns.model.SnsCore");
        C86709a0.m107528h();
        int g = C86709a0.m107523b().mo121110g();
        SnsMethodCalculate.markEndTimeMs("getSelfUin", "com.tencent.mm.plugin.sns.model.SnsCore");
        return g;
    }

    public static int Ox0() {
        SnsMethodCalculate.markStartTimeMs("getSingleThumbDisplayMaxSize", "com.tencent.mm.plugin.sns.model.SnsCore");
        if (f274866V <= 0) {
            f274866V = 200;
            f274866V = C76577a.m92151b(MMApplicationContext.getContext(), f274866V);
        }
        int i = f274866V;
        SnsMethodCalculate.markEndTimeMs("getSingleThumbDisplayMaxSize", "com.tencent.mm.plugin.sns.model.SnsCore");
        return i;
    }

    public static C99021b Px0() {
        SnsMethodCalculate.markStartTimeMs("getSnsAbTestMgr", "com.tencent.mm.plugin.sns.model.SnsCore");
        C86709a0.m107523b().mo121108c();
        if (Ax0().f274879G == null) {
            Ax0().f274879G = new C99021b();
        }
        C99021b bVar = Ax0().f274879G;
        SnsMethodCalculate.markEndTimeMs("getSnsAbTestMgr", "com.tencent.mm.plugin.sns.model.SnsCore");
        return bVar;
    }

    public static C60920c Qx0() {
        SnsMethodCalculate.markStartTimeMs("getSnsAdAbTestMgr", "com.tencent.mm.plugin.sns.model.SnsCore");
        C86709a0.m107523b().mo121108c();
        if (Ax0().f274880H == null) {
            Ax0().f274880H = new C60920c();
        }
        C60920c cVar = Ax0().f274880H;
        SnsMethodCalculate.markEndTimeMs("getSnsAdAbTestMgr", "com.tencent.mm.plugin.sns.model.SnsCore");
        return cVar;
    }

    public static C94843b1 Rx0() {
        SnsMethodCalculate.markStartTimeMs("getSnsAsyncQueueMgr", "com.tencent.mm.plugin.sns.model.SnsCore");
        C86709a0.m107523b().mo121108c();
        if (Ax0().f274912z == null) {
            C94866e1 Ax0 = Ax0();
            StringBuilder sb = new StringBuilder();
            C86709a0.m107528h();
            sb.append(C86709a0.m107535s().f251807e);
            sb.append("snsAsyncQueue.data");
            Ax0.f274912z = new C94843b1(sb.toString());
        }
        C94843b1 b1Var = Ax0().f274912z;
        SnsMethodCalculate.markEndTimeMs("getSnsAsyncQueueMgr", "com.tencent.mm.plugin.sns.model.SnsCore");
        return b1Var;
    }

    public static C99960a Sx0() {
        SnsMethodCalculate.markStartTimeMs("getSnsCleanStorageManager", "com.tencent.mm.plugin.sns.model.SnsCore");
        C86709a0.m107523b().mo121108c();
        if (Ax0().f274886N == null) {
            Ax0().f274886N = new C99960a();
        }
        C99960a aVar = Ax0().f274886N;
        SnsMethodCalculate.markEndTimeMs("getSnsCleanStorageManager", "com.tencent.mm.plugin.sns.model.SnsCore");
        return aVar;
    }

    public static C100421x Tx0() {
        SnsMethodCalculate.markStartTimeMs("getSnsCommentStg", "com.tencent.mm.plugin.sns.model.SnsCore");
        C86709a0.m107523b().mo121108c();
        if (Ax0().f274909w == null) {
            C94866e1 Ax0 = Ax0();
            Ax0();
            Ax0.f274909w = new C100421x(Bx0());
        }
        C100421x xVar = Ax0().f274909w;
        SnsMethodCalculate.markEndTimeMs("getSnsCommentStg", "com.tencent.mm.plugin.sns.model.SnsCore");
        return xVar;
    }

    public static C100423z Ux0() {
        SnsMethodCalculate.markStartTimeMs("getSnsCoverStg", "com.tencent.mm.plugin.sns.model.SnsCore");
        C86709a0.m107523b().mo121108c();
        if (Ax0().f274908v == null) {
            C94866e1 Ax0 = Ax0();
            Ax0();
            Ax0.f274908v = new C100423z(Bx0());
        }
        C100423z zVar = Ax0().f274908v;
        SnsMethodCalculate.markEndTimeMs("getSnsCoverStg", "com.tencent.mm.plugin.sns.model.SnsCore");
        return zVar;
    }

    public static C94853e Vx0() {
        SnsMethodCalculate.markStartTimeMs("getSnsDownManager", "com.tencent.mm.plugin.sns.model.SnsCore");
        C86709a0.m107523b().mo121108c();
        if (Ax0().f274876D == null) {
            Ax0().f274876D = new C94853e();
        }
        C94853e eVar = Ax0().f274876D;
        SnsMethodCalculate.markEndTimeMs("getSnsDownManager", "com.tencent.mm.plugin.sns.model.SnsCore");
        return eVar;
    }

    public static C35287b0 Wx0() {
        SnsMethodCalculate.markStartTimeMs("getSnsDraftStg", "com.tencent.mm.plugin.sns.model.SnsCore");
        C86709a0.m107523b().mo121108c();
        if (Ax0().f274911y == null) {
            Ax0().f274911y = new C35287b0(Bx0());
        }
        C35287b0 b0Var = Ax0().f274911y;
        SnsMethodCalculate.markEndTimeMs("getSnsDraftStg", "com.tencent.mm.plugin.sns.model.SnsCore");
        return b0Var;
    }

    public static C100399d0 Xx0() {
        SnsMethodCalculate.markStartTimeMs("getSnsExtStg", "com.tencent.mm.plugin.sns.model.SnsCore");
        C86709a0.m107523b().mo121108c();
        if (Ax0().f274907u == null) {
            C94866e1 Ax0 = Ax0();
            Ax0();
            Ax0.f274907u = new C100399d0(Bx0(), new C30413l1());
        }
        C100399d0 d0Var = Ax0().f274907u;
        SnsMethodCalculate.markEndTimeMs("getSnsExtStg", "com.tencent.mm.plugin.sns.model.SnsCore");
        return d0Var;
    }

    /* renamed from: YO */
    public static String m120262YO() {
        SnsMethodCalculate.markStartTimeMs("getAccSnsPath", "com.tencent.mm.plugin.sns.model.SnsCore");
        String YO = ((C99015i) C86312j.m106911c(C99015i.class)).mo61935YO();
        SnsMethodCalculate.markEndTimeMs("getAccSnsPath", "com.tencent.mm.plugin.sns.model.SnsCore");
        return YO;
    }

    public static C100400e0 Yx0() {
        SnsMethodCalculate.markStartTimeMs("getSnsInfoStorage", "com.tencent.mm.plugin.sns.model.SnsCore");
        C86709a0.m107523b().mo121108c();
        if (Ax0().f274900n == null) {
            Ax0().f274900n = new C100400e0(Bx0());
        }
        C100400e0 e0Var = Ax0().f274900n;
        SnsMethodCalculate.markEndTimeMs("getSnsInfoStorage", "com.tencent.mm.plugin.sns.model.SnsCore");
        return e0Var;
    }

    public static C33615q Zx0() {
        SnsMethodCalculate.markStartTimeMs("getSnsLogMgr", "com.tencent.mm.plugin.sns.model.SnsCore");
        C86709a0.m107523b().mo121108c();
        if (Ax0().f274884L == null) {
            Ax0().f274884L = new C33615q();
        }
        C33615q qVar = Ax0().f274884L;
        SnsMethodCalculate.markEndTimeMs("getSnsLogMgr", "com.tencent.mm.plugin.sns.model.SnsCore");
        return qVar;
    }

    public static C100408j0 ay0() {
        SnsMethodCalculate.markStartTimeMs("getSnsMediaStorage", "com.tencent.mm.plugin.sns.model.SnsCore");
        C86709a0.m107523b().mo121108c();
        if (Ax0().f274899j == null) {
            C94866e1 Ax0 = Ax0();
            Ax0();
            Ax0.f274899j = new C100408j0(Bx0());
        }
        C100408j0 j0Var = Ax0().f274899j;
        SnsMethodCalculate.markEndTimeMs("getSnsMediaStorage", "com.tencent.mm.plugin.sns.model.SnsCore");
        return j0Var;
    }

    public static C35292h0 by0() {
        SnsMethodCalculate.markStartTimeMs("getSnsReportStg", "com.tencent.mm.plugin.sns.model.SnsCore");
        C86709a0.m107523b().mo121108c();
        if (Ax0().f274883K == null) {
            Ax0().f274883K = new C35292h0(Bx0());
        }
        C35292h0 h0Var = Ax0().f274883K;
        SnsMethodCalculate.markEndTimeMs("getSnsReportStg", "com.tencent.mm.plugin.sns.model.SnsCore");
        return h0Var;
    }

    public static C94950t1 cy0() {
        SnsMethodCalculate.markStartTimeMs("getSnsRetryEditTipManager", "com.tencent.mm.plugin.sns.model.SnsCore");
        C86709a0.m107523b().mo121108c();
        if (Ax0().f274882J == null) {
            Ax0().f274882J = new C94950t1();
        }
        C94950t1 t1Var = Ax0().f274882J;
        SnsMethodCalculate.markEndTimeMs("getSnsRetryEditTipManager", "com.tencent.mm.plugin.sns.model.SnsCore");
        return t1Var;
    }

    public static C5431p1.C5432a dy0() {
        SnsMethodCalculate.markStartTimeMs("getSnsServer", "com.tencent.mm.plugin.sns.model.SnsCore");
        C86709a0.m107523b().mo121108c();
        if (Ax0().f274875C == null) {
            Ax0().f274875C = new C5431p1.C5432a();
        }
        C5431p1.C5432a aVar = Ax0().f274875C;
        SnsMethodCalculate.markEndTimeMs("getSnsServer", "com.tencent.mm.plugin.sns.model.SnsCore");
        return aVar;
    }

    public static C11766m0 ey0() {
        SnsMethodCalculate.markStartTimeMs("getSnsTagInfoStg", "com.tencent.mm.plugin.sns.model.SnsCore");
        C86709a0.m107523b().mo121108c();
        if (Ax0().f274910x == null) {
            Ax0().f274910x = new C11766m0(Bx0());
        }
        C11766m0 m0Var = Ax0().f274910x;
        SnsMethodCalculate.markEndTimeMs("getSnsTagInfoStg", "com.tencent.mm.plugin.sns.model.SnsCore");
        return m0Var;
    }

    public static C94974y1 fy0() {
        SnsMethodCalculate.markStartTimeMs("getSnsUnreadTipManager", "com.tencent.mm.plugin.sns.model.SnsCore");
        C86709a0.m107523b().mo121108c();
        if (Ax0().f274881I == null) {
            Ax0().f274881I = new C94974y1();
        }
        C94974y1 y1Var = Ax0().f274881I;
        SnsMethodCalculate.markEndTimeMs("getSnsUnreadTipManager", "com.tencent.mm.plugin.sns.model.SnsCore");
        return y1Var;
    }

    public static C94928p2 gy0() {
        SnsMethodCalculate.markStartTimeMs("getSnsUploadManager", "com.tencent.mm.plugin.sns.model.SnsCore");
        C86709a0.m107523b().mo121108c();
        if (Ax0().f274877E == null) {
            Ax0().f274877E = new C94928p2();
        }
        C94928p2 p2Var = Ax0().f274877E;
        SnsMethodCalculate.markEndTimeMs("getSnsUploadManager", "com.tencent.mm.plugin.sns.model.SnsCore");
        return p2Var;
    }

    public static C94869f2 hy0() {
        SnsMethodCalculate.markStartTimeMs("getSnsVideoService", "com.tencent.mm.plugin.sns.model.SnsCore");
        C86709a0.m107523b().mo121108c();
        if (Ax0().f274890S == null) {
            Ax0().f274890S = new C94869f2();
        }
        C94869f2 f2Var = Ax0().f274890S;
        SnsMethodCalculate.markEndTimeMs("getSnsVideoService", "com.tencent.mm.plugin.sns.model.SnsCore");
        return f2Var;
    }

    /* renamed from: iU */
    public static String m120263iU() {
        SnsMethodCalculate.markStartTimeMs("getAccSnsTmpPath", "com.tencent.mm.plugin.sns.model.SnsCore");
        String iU = ((C99015i) C86312j.m106911c(C99015i.class)).mo61936iU();
        SnsMethodCalculate.markEndTimeMs("getAccSnsTmpPath", "com.tencent.mm.plugin.sns.model.SnsCore");
        return iU;
    }

    public static C35294o0 iy0() {
        SnsMethodCalculate.markStartTimeMs("getSnsWsFoldDetailStg", "com.tencent.mm.plugin.sns.model.SnsCore");
        C86709a0.m107523b().mo121108c();
        if (Ax0().f274874B == null) {
            Ax0().f274874B = new C35294o0(Bx0());
        }
        C35294o0 o0Var = Ax0().f274874B;
        SnsMethodCalculate.markEndTimeMs("getSnsWsFoldDetailStg", "com.tencent.mm.plugin.sns.model.SnsCore");
        return o0Var;
    }

    public static C35297q0 jy0() {
        SnsMethodCalculate.markStartTimeMs("getSnsWsFoldGroupStg", "com.tencent.mm.plugin.sns.model.SnsCore");
        C86709a0.m107523b().mo121108c();
        if (Ax0().f274873A == null) {
            Ax0().f274873A = new C35297q0(Bx0());
        }
        C35297q0 q0Var = Ax0().f274873A;
        SnsMethodCalculate.markEndTimeMs("getSnsWsFoldGroupStg", "com.tencent.mm.plugin.sns.model.SnsCore");
        return q0Var;
    }

    public static ExecutorService ky0() {
        SnsMethodCalculate.markStartTimeMs("getTaskExecutor", "com.tencent.mm.plugin.sns.model.SnsCore");
        if (Ax0().f274897h[0] == null) {
            synchronized (Ax0().f274897h) {
                try {
                    if (Ax0().f274897h[0] == null) {
                        Ax0().f274897h[0] = ((C119157j) C119157j.f356862d).mo183883n("SnsCore#Task");
                    }
                } catch (Throwable th) {
                    SnsMethodCalculate.markEndTimeMs("getTaskExecutor", "com.tencent.mm.plugin.sns.model.SnsCore");
                    throw th;
                }
            }
        }
        ExecutorService executorService = Ax0().f274897h[0];
        SnsMethodCalculate.markEndTimeMs("getTaskExecutor", "com.tencent.mm.plugin.sns.model.SnsCore");
        return executorService;
    }

    public static MMHandler ly0() {
        SnsMethodCalculate.markStartTimeMs("getUIHandler", "com.tencent.mm.plugin.sns.model.SnsCore");
        MMHandler mMHandler = Ax0().f274893d;
        SnsMethodCalculate.markEndTimeMs("getUIHandler", "com.tencent.mm.plugin.sns.model.SnsCore");
        return mMHandler;
    }

    public static MMHandler my0() {
        SnsMethodCalculate.markStartTimeMs("getWorkingHandler", "com.tencent.mm.plugin.sns.model.SnsCore");
        if (f274868X == null) {
            f274868X = new MMHandler("MicroMsg.SnsCore#WorkingHandler");
        }
        MMHandler mMHandler = f274868X;
        SnsMethodCalculate.markEndTimeMs("getWorkingHandler", "com.tencent.mm.plugin.sns.model.SnsCore");
        return mMHandler;
    }

    /* JADX WARNING: Removed duplicated region for block: B:29:0x01ef  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void ny0(android.app.Activity r22) {
        /*
            r0 = r22
            com.tencent.mm.storage.y1$a r1 = com.tencent.p014mm.storage.C72994y1.C72995a.USERINFO_SNS_USE_DB_DAMAGE_DIALOG_INT_SYNC
            java.lang.Class<h81.h> r2 = h81.C32735h.class
            java.lang.String r3 = "handleSnsDBDamage"
            java.lang.String r4 = "com.tencent.mm.plugin.sns.model.SnsCore"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r3, r4)
            di3.d r5 = di3.C86312j.m106911c(r2)
            h81.h r5 = (h81.C32735h) r5
            h81.h$c r6 = h81.C32735h.C32737c.clicfg_sns_db_damage_show_dialog
            r7 = 1
            boolean r5 = r5.mo58784wf(r6, r7)
            if (r5 != 0) goto L_0x0020
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r3, r4)
            return
        L_0x0020:
            boolean r5 = com.tencent.p014mm.sdk.platformtools.BuildInfo.DEBUG
            r6 = 2
            r8 = 0
            if (r5 != 0) goto L_0x002a
            boolean r5 = com.tencent.p014mm.sdk.platformtools.BuildInfo.IS_FLAVOR_RED
            if (r5 == 0) goto L_0x0042
        L_0x002a:
            com.tencent.mm.plugin.sns.model.e1 r5 = Ax0()
            boolean r5 = r5.f274892U
            if (r5 == 0) goto L_0x0042
            f40.o r5 = f40.C86709a0.m107535s()
            com.tencent.mm.storage.v1 r5 = r5.mo121142i()
            int r5 = r5.mo119689j(r1, r8)
            if (r5 != r6) goto L_0x0042
            r5 = 1
            goto L_0x0043
        L_0x0042:
            r5 = 0
        L_0x0043:
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            java.lang.String r10 = "BuildInfo.IS_FLAVOR_RED = "
            r9.append(r10)
            boolean r10 = com.tencent.p014mm.sdk.platformtools.BuildInfo.IS_FLAVOR_RED
            r9.append(r10)
            java.lang.String r9 = r9.toString()
            java.lang.String r10 = "MicroMsg.SnsCore"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r10, r9)
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            java.lang.String r11 = "BuildInfo.DEBUG = "
            r9.append(r11)
            boolean r11 = com.tencent.p014mm.sdk.platformtools.BuildInfo.DEBUG
            r9.append(r11)
            java.lang.String r9 = r9.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r10, r9)
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            java.lang.String r11 = "WeChatEnvironment.isCoolassistEnv() = "
            r9.append(r11)
            boolean r11 = com.tencent.p014mm.sdk.platformtools.WeChatEnvironment.isCoolassistEnv()
            r9.append(r11)
            java.lang.String r9 = r9.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r10, r9)
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            java.lang.String r11 = "getCore().isDBDamage = "
            r9.append(r11)
            com.tencent.mm.plugin.sns.model.e1 r11 = Ax0()
            boolean r11 = r11.f274892U
            r9.append(r11)
            java.lang.String r9 = r9.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r10, r9)
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            java.lang.String r11 = "USERINFO_SNS_USE_DB_DAMAGE_DIALOG_INT_SYNC = "
            r9.append(r11)
            f40.o r11 = f40.C86709a0.m107535s()
            com.tencent.mm.storage.v1 r11 = r11.mo121142i()
            int r1 = r11.mo119689j(r1, r8)
            r9.append(r1)
            java.lang.String r1 = r9.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r10, r1)
            long r11 = java.lang.System.currentTimeMillis()
            java.lang.String r1 = "isSnsDBDamage"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r1, r4)
            os2.k0 r9 = Bx0()
            boolean r9 = r9.mo125628r()
            r9 = r9 ^ r7
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r1, r4)
            long r13 = java.lang.System.currentTimeMillis()
            long r13 = r13 - r11
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r11 = "cost = "
            r1.append(r11)
            r1.append(r13)
            java.lang.String r11 = ", snsDbDamage = "
            r1.append(r11)
            r1.append(r9)
            java.lang.String r1 = r1.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r10, r1)
            if (r5 != 0) goto L_0x0101
            if (r9 == 0) goto L_0x00ff
            goto L_0x0101
        L_0x00ff:
            r1 = 0
            goto L_0x0102
        L_0x0101:
            r1 = 1
        L_0x0102:
            di3.d r2 = di3.C86312j.m106911c(r2)
            h81.h r2 = (h81.C32735h) r2
            h81.h$c r5 = h81.C32735h.C32737c.clicfg_sns_db_damage_init_max_try_count
            r9 = 3
            int r2 = r2.mo58779Qe(r5, r9)
            com.tencent.mm.plugin.sns.model.e1 r5 = Ax0()
            com.tencent.mm.sdk.platformtools.MultiProcessMMKV r5 = r5.f274891T
            java.lang.String r11 = "damage_is_fail_last_key"
            boolean r5 = r5.getBoolean(r11, r8)
            java.lang.String r12 = "damage_activity_key"
            java.lang.String r13 = ""
            if (r5 == 0) goto L_0x01ec
            com.tencent.mm.plugin.sns.model.e1 r5 = Ax0()
            com.tencent.mm.sdk.platformtools.MultiProcessMMKV r5 = r5.f274891T
            java.lang.String r14 = "damage_restart_count_key"
            int r5 = r5.getInt(r14, r8)
            com.tencent.mm.plugin.sns.model.e1 r15 = Ax0()
            com.tencent.mm.sdk.platformtools.MultiProcessMMKV r15 = r15.f274891T
            java.lang.String r15 = r15.getString(r12, r13)
            r16 = 6
            r17 = 5
            r18 = 4
            r9 = 7
            r6 = 27569(0x6bb1, float:3.8632E-41)
            if (r1 != 0) goto L_0x019a
            com.tencent.mm.plugin.report.service.n r2 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            java.lang.Object[] r9 = new java.lang.Object[r9]
            java.lang.Integer r21 = java.lang.Integer.valueOf(r5)
            r9[r8] = r21
            r9[r7] = r15
            java.lang.String r21 = "recovery_success"
            r20 = 2
            r9[r20] = r21
            r19 = 3
            r9[r19] = r13
            r9[r18] = r13
            r9[r17] = r13
            r9[r16] = r13
            r2.mo160131h(r6, r9)
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r6 = "db damage recovery, report and clear mmkv, atyName = "
            r2.append(r6)
            r2.append(r15)
            java.lang.String r6 = ", restartCount = "
            r2.append(r6)
            r2.append(r5)
            java.lang.String r2 = r2.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r10, r2)
            com.tencent.mm.plugin.sns.model.e1 r2 = Ax0()
            com.tencent.mm.sdk.platformtools.MultiProcessMMKV r2 = r2.f274891T
            r2.putInt(r14, r8)
            com.tencent.mm.plugin.sns.model.e1 r2 = Ax0()
            com.tencent.mm.sdk.platformtools.MultiProcessMMKV r2 = r2.f274891T
            r2.putString(r12, r13)
            com.tencent.mm.plugin.sns.model.e1 r2 = Ax0()
            com.tencent.mm.sdk.platformtools.MultiProcessMMKV r2 = r2.f274891T
            r2.putBoolean(r11, r8)
            goto L_0x01ec
        L_0x019a:
            java.lang.String r6 = "db damage un recovery"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r10, r6)
            if (r5 < r2) goto L_0x01ec
            com.tencent.mm.plugin.report.service.n r1 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            java.lang.Object[] r6 = new java.lang.Object[r9]
            java.lang.Integer r9 = java.lang.Integer.valueOf(r5)
            r6[r8] = r9
            r6[r7] = r15
            java.lang.String r9 = "restart over count"
            r15 = 2
            r6[r15] = r9
            java.lang.String r9 = java.lang.String.valueOf(r2)
            r15 = 3
            r6[r15] = r9
            r6[r18] = r13
            r6[r17] = r13
            r6[r16] = r13
            r9 = 27569(0x6bb1, float:3.8632E-41)
            r1.mo160131h(r9, r6)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r6 = "db damage restart over count, restartCount = "
            r1.append(r6)
            r1.append(r5)
            java.lang.String r6 = ", maxRestartCount = "
            r1.append(r6)
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r10, r1)
            com.tencent.mm.plugin.sns.model.e1 r1 = Ax0()
            com.tencent.mm.sdk.platformtools.MultiProcessMMKV r1 = r1.f274891T
            int r5 = r5 + r7
            r1.putInt(r14, r5)
            goto L_0x01ed
        L_0x01ec:
            r8 = r1
        L_0x01ed:
            if (r8 == 0) goto L_0x0264
            com.tencent.mm.plugin.sns.model.e1 r1 = Ax0()
            com.tencent.mm.sdk.platformtools.MultiProcessMMKV r1 = r1.f274891T
            java.lang.String r1 = r1.getString(r12, r13)
            boolean r2 = r1.equals(r13)
            if (r2 == 0) goto L_0x0204
            java.lang.String r1 = r22.getLocalClassName()
            goto L_0x021c
        L_0x0204:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r1)
            java.lang.String r1 = ", "
            r2.append(r1)
            java.lang.String r1 = r22.getLocalClassName()
            r2.append(r1)
            java.lang.String r1 = r2.toString()
        L_0x021c:
            com.tencent.mm.plugin.sns.model.e1 r2 = Ax0()
            com.tencent.mm.sdk.platformtools.MultiProcessMMKV r2 = r2.f274891T
            r2.putString(r12, r1)
            com.tencent.mm.plugin.sns.model.e1 r1 = Ax0()
            com.tencent.mm.sdk.platformtools.MultiProcessMMKV r1 = r1.f274891T
            r1.putBoolean(r11, r7)
            qo3.q r1 = new qo3.q
            r1.<init>(r0)
            r2 = 2131837049(0x7f114079, float:1.9307282E38)
            java.lang.String r2 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getString(r2)
            r1.mo107595g(r2)
            r2 = 2131822916(0x7f110944, float:1.9278617E38)
            java.lang.String r2 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getString(r2)
            r1.mo107598j(r2)
            com.tencent.mm.plugin.sns.model.e1$$a r2 = new com.tencent.mm.plugin.sns.model.e1$$a
            r2.<init>()
            r1.mo107597i(r2)
            r2 = 2131836879(0x7f113fcf, float:1.9306937E38)
            java.lang.String r2 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getString(r2)
            r1.mo107602n(r2)
            com.tencent.mm.plugin.sns.model.e1$$b r2 = new com.tencent.mm.plugin.sns.model.e1$$b
            r2.<init>(r0)
            r1.mo107600l(r2)
            r1.mo107603o()
        L_0x0264:
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r3, r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.sns.model.C94866e1.ny0(android.app.Activity):void");
    }

    public static boolean py0() {
        SnsMethodCalculate.markStartTimeMs("isDownloadUseWxamImg", "com.tencent.mm.plugin.sns.model.SnsCore");
        if (!((C101211h) C86312j.m106911c(C101211h.class)).mo140276It()) {
            Log.m105924i("MicroMsg.SnsCore", "isDownloadUseWxamImg: hevc not support");
            SnsMethodCalculate.markEndTimeMs("isDownloadUseWxamImg", "com.tencent.mm.plugin.sns.model.SnsCore");
            return false;
        }
        boolean wf = ((C32735h) C86312j.m106911c(C32735h.class)).mo58784wf(C32735h.C32737c.clicfg_sns_download_use_wxam, false);
        SnsMethodCalculate.markEndTimeMs("isDownloadUseWxamImg", "com.tencent.mm.plugin.sns.model.SnsCore");
        return wf;
    }

    public static boolean qy0() {
        SnsMethodCalculate.markStartTimeMs("isInValid", "com.tencent.mm.plugin.sns.model.SnsCore");
        Ax0();
        SnsMethodCalculate.markStartTimeMs("isValid", "com.tencent.mm.plugin.sns.model.SnsCore");
        boolean l = C86709a0.m107523b().mo121114l();
        SnsMethodCalculate.markEndTimeMs("isValid", "com.tencent.mm.plugin.sns.model.SnsCore");
        boolean z = !l;
        SnsMethodCalculate.markEndTimeMs("isInValid", "com.tencent.mm.plugin.sns.model.SnsCore");
        return z;
    }

    public static boolean ry0() {
        boolean z;
        SnsMethodCalculate.markStartTimeMs("isUseHevcImg", "com.tencent.mm.plugin.sns.model.SnsCore");
        if (!((C101211h) C86312j.m106911c(C101211h.class)).mo140276It()) {
            Log.m105924i("MicroMsg.SnsCore", "isUseHevcImg: hevc not support");
            SnsMethodCalculate.markEndTimeMs("isUseHevcImg", "com.tencent.mm.plugin.sns.model.SnsCore");
            return false;
        }
        SharedPreferences sharedPreferences = MultiProcSharedPreferences.getSharedPreferences(MMApplicationContext.getContext(), "sp_sns_dynswitch_stg", 4, false);
        if (sharedPreferences.contains("st_sw_use_vcodec_img")) {
            z = sharedPreferences.getBoolean("st_sw_use_vcodec_img", false);
            Log.m105929w("MicroMsg.SnsCore", "isUseVCodecImg: %b (set statically outside)", Boolean.valueOf(z));
        } else {
            z = sharedPreferences.getBoolean("sw_use_vcodec_img", false);
            Log.m105919d("MicroMsg.SnsCore", "isUseVCodecImg: %b", Boolean.valueOf(z));
        }
        SnsMethodCalculate.markEndTimeMs("isUseHevcImg", "com.tencent.mm.plugin.sns.model.SnsCore");
        return z;
    }

    public static boolean sy0() {
        boolean z;
        SnsMethodCalculate.markStartTimeMs("isUseWxpcImg", "com.tencent.mm.plugin.sns.model.SnsCore");
        if (!((C101211h) C86312j.m106911c(C101211h.class)).mo140276It()) {
            Log.m105924i("MicroMsg.SnsCore", "isUseWxpcImg: hevc not support");
            SnsMethodCalculate.markEndTimeMs("isUseWxpcImg", "com.tencent.mm.plugin.sns.model.SnsCore");
            return false;
        }
        SharedPreferences sharedPreferences = MultiProcSharedPreferences.getSharedPreferences(MMApplicationContext.getContext(), "sp_sns_dynswitch_stg", 4, false);
        if (sharedPreferences.contains("st_sw_use_wxpc_img")) {
            z = sharedPreferences.getBoolean("st_sw_use_wxpc_img", false);
            Log.m105929w("MicroMsg.SnsCore", "isUseWxpcImg: %b (set statically outside)", Boolean.valueOf(z));
        } else {
            z = sharedPreferences.getBoolean("sw_use_wxpc_img", false);
            Log.m105919d("MicroMsg.SnsCore", "isUseWxpcImg: %b", Boolean.valueOf(z));
        }
        SnsMethodCalculate.markEndTimeMs("isUseWxpcImg", "com.tencent.mm.plugin.sns.model.SnsCore");
        return z;
    }

    public static void uy0(Point point) {
        SnsMethodCalculate.markStartTimeMs("setScreenSize", "com.tencent.mm.plugin.sns.model.SnsCore");
        f274871p0 = point;
        SnsMethodCalculate.markEndTimeMs("setScreenSize", "com.tencent.mm.plugin.sns.model.SnsCore");
    }

    public static String xx0() {
        SnsMethodCalculate.markStartTimeMs("getAccPath", "com.tencent.mm.plugin.sns.model.SnsCore");
        C86709a0.m107523b().mo121108c();
        C86709a0.m107528h();
        String str = C86709a0.m107535s().f251806d;
        SnsMethodCalculate.markEndTimeMs("getAccPath", "com.tencent.mm.plugin.sns.model.SnsCore");
        return str;
    }

    public static C100405h yx0() {
        SnsMethodCalculate.markStartTimeMs("getAdPullRecordsInfoStorage", "com.tencent.mm.plugin.sns.model.SnsCore");
        C86709a0.m107523b().mo121108c();
        if (Ax0().f274905s == null) {
            C94866e1 Ax0 = Ax0();
            C100411k0 Bx0 = Bx0();
            IAutoDBItem.MAutoDBInfo mAutoDBInfo = C77035g.f225046B;
            SnsMethodCalculate.markStartTimeMs("getInfo", "com.tencent.mm.plugin.sns.storage.AdPullRecordsInfo$Companion");
            SnsMethodCalculate.markStartTimeMs("access$getInfo$cp", "com.tencent.mm.plugin.sns.storage.AdPullRecordsInfo");
            IAutoDBItem.MAutoDBInfo mAutoDBInfo2 = C77035g.f225046B;
            SnsMethodCalculate.markEndTimeMs("access$getInfo$cp", "com.tencent.mm.plugin.sns.storage.AdPullRecordsInfo");
            SnsMethodCalculate.markEndTimeMs("getInfo", "com.tencent.mm.plugin.sns.storage.AdPullRecordsInfo$Companion");
            Ax0.f274905s = new C100405h(Bx0, mAutoDBInfo2, "AdPullRecordsInfo", (String[]) null);
        }
        C100405h hVar = Ax0().f274905s;
        SnsMethodCalculate.markEndTimeMs("getAdPullRecordsInfoStorage", "com.tencent.mm.plugin.sns.model.SnsCore");
        return hVar;
    }

    public static C100407j zx0() {
        SnsMethodCalculate.markStartTimeMs("getAdSnsInfoStorage", "com.tencent.mm.plugin.sns.model.SnsCore");
        C86709a0.m107523b().mo121108c();
        if (Ax0().f274901o == null) {
            Ax0().f274901o = new C100407j(Bx0());
        }
        C100407j jVar = Ax0().f274901o;
        SnsMethodCalculate.markEndTimeMs("getAdSnsInfoStorage", "com.tencent.mm.plugin.sns.model.SnsCore");
        return jVar;
    }

    public void Jt0(C97624e3 e3Var) {
        SnsMethodCalculate.markStartTimeMs("removeNotifyListener", "com.tencent.mm.plugin.sns.model.SnsCore");
        List<C97624e3> list = C94886k0.f274960h;
        SnsMethodCalculate.markStartTimeMs("removeNotifyListener", "com.tencent.mm.plugin.sns.model.NetSceneSnsSync");
        ((LinkedList) C94886k0.f274960h).remove(e3Var);
        SnsMethodCalculate.markEndTimeMs("removeNotifyListener", "com.tencent.mm.plugin.sns.model.NetSceneSnsSync");
        SnsMethodCalculate.markEndTimeMs("removeNotifyListener", "com.tencent.mm.plugin.sns.model.SnsCore");
    }

    /* renamed from: f0 */
    public void mo131020f0(C97624e3 e3Var) {
        SnsMethodCalculate.markStartTimeMs("addNotifyListener", "com.tencent.mm.plugin.sns.model.SnsCore");
        List<C97624e3> list = C94886k0.f274960h;
        SnsMethodCalculate.markStartTimeMs("addNotifyListener", "com.tencent.mm.plugin.sns.model.NetSceneSnsSync");
        if (!((LinkedList) C94886k0.f274960h).contains(e3Var)) {
            ((LinkedList) C94886k0.f274960h).add(e3Var);
        }
        SnsMethodCalculate.markEndTimeMs("addNotifyListener", "com.tencent.mm.plugin.sns.model.NetSceneSnsSync");
        SnsMethodCalculate.markEndTimeMs("addNotifyListener", "com.tencent.mm.plugin.sns.model.SnsCore");
    }

    /* JADX WARNING: Removed duplicated region for block: B:22:0x0161  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0163  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onAccountInitialized(android.content.Context r22) {
        /*
            r21 = this;
            r1 = r21
            java.lang.String r2 = "onAccountInitialized"
            java.lang.String r3 = "com.tencent.mm.plugin.sns.model.SnsCore"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r2, r3)
            super.onAccountInitialized(r22)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r4 = "onAccountInitialized "
            r0.append(r4)
            java.lang.Thread r4 = java.lang.Thread.currentThread()
            long r4 = r4.getId()
            r0.append(r4)
            java.lang.String r4 = " isAccInit: "
            r0.append(r4)
            boolean r4 = r1.f274888Q
            r0.append(r4)
            java.lang.String r0 = r0.toString()
            java.lang.String r4 = "MicroMsg.SnsCore"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r4, r0)
            r21.oy0()
            java.lang.Class<h81.h> r0 = h81.C32735h.class
            di3.d r0 = di3.C86312j.m106911c(r0)
            h81.h r0 = (h81.C32735h) r0
            h81.h$c r5 = h81.C32735h.C32737c.clicfg_bitmap_pool_undo_preload
            r6 = 0
            int r0 = r0.mo58779Qe(r5, r6)
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r7 = "undoPreload = "
            r5.append(r7)
            r5.append(r0)
            java.lang.String r5 = r5.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r4, r5)
            if (r0 != 0) goto L_0x0091
            java.lang.String r0 = "do SnsCore preload"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r4, r0)
            boolean r0 = com.tencent.p014mm.memory.C92712l.m116839a()
            if (r0 == 0) goto L_0x0077
            com.tencent.mm.memory.c r0 = com.tencent.p014mm.memory.C92704c.f266809e
            com.tencent.mm.plugin.sns.model.e1$$j r5 = new com.tencent.mm.plugin.sns.model.e1$$j
            java.util.Objects.requireNonNull(r0)
            r5.<init>(r1, r0)
            r0.mo126890a(r5)
        L_0x0077:
            com.tencent.mm.memory.o r0 = com.tencent.p014mm.memory.C92716o.f266827d
            com.tencent.mm.plugin.sns.model.e1$$k r5 = new com.tencent.mm.plugin.sns.model.e1$$k
            java.util.Objects.requireNonNull(r0)
            r5.<init>(r1, r0)
            r0.mo126890a(r5)
            com.tencent.mm.memory.g r0 = com.tencent.p014mm.memory.C92708g.f266813d
            com.tencent.mm.plugin.sns.model.e1$$l r5 = new com.tencent.mm.plugin.sns.model.e1$$l
            java.util.Objects.requireNonNull(r0)
            r5.<init>(r1, r0)
            r0.mo126890a(r5)
        L_0x0091:
            java.lang.String r0 = "prepare-ts"
            java.lang.String r5 = "thumb-url"
            java.lang.String r7 = "media-url"
            java.lang.String r8 = "ts"
            java.lang.String r9 = "type"
            java.lang.String r10 = "path"
            java.lang.String r11 = ""
            java.lang.String r12 = "videoCrashKvReport"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r12, r3)
            java.lang.String r15 = "TrackDataSource"
            com.tencent.mm.sdk.platformtools.MultiProcessMMKV r15 = com.tencent.p014mm.sdk.platformtools.MultiProcessMMKV.getMMKV(r15)     // Catch:{ all -> 0x0132 }
            java.lang.String r16 = r15.getString(r10, r11)     // Catch:{ all -> 0x0132 }
            boolean r16 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r16)     // Catch:{ all -> 0x0132 }
            if (r16 != 0) goto L_0x012e
            com.tencent.mm.plugin.report.service.n r13 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE     // Catch:{ all -> 0x0132 }
            r14 = 150(0x96, float:2.1E-43)
            r6 = 74
            r13.mo175911u(r14, r6)     // Catch:{ all -> 0x0132 }
            r6 = 7
            java.lang.Object[] r6 = new java.lang.Object[r6]     // Catch:{ all -> 0x0132 }
            r14 = 0
            int r17 = r15.getInt(r9, r14)     // Catch:{ all -> 0x0132 }
            java.lang.Integer r17 = java.lang.Integer.valueOf(r17)     // Catch:{ all -> 0x0132 }
            r6[r14] = r17     // Catch:{ all -> 0x0132 }
            java.lang.String r14 = r15.getString(r10, r11)     // Catch:{ all -> 0x0132 }
            r16 = 1
            r6[r16] = r14     // Catch:{ all -> 0x0132 }
            r14 = 2
            r18 = r2
            r1 = 0
            long r19 = r15.getLong(r8, r1)     // Catch:{ all -> 0x012c }
            java.lang.Long r19 = java.lang.Long.valueOf(r19)     // Catch:{ all -> 0x012c }
            r6[r14] = r19     // Catch:{ all -> 0x012c }
            r14 = 3
            java.lang.String r19 = r15.getString(r7, r11)     // Catch:{ all -> 0x012c }
            r6[r14] = r19     // Catch:{ all -> 0x012c }
            java.lang.String r14 = r15.getString(r5, r11)     // Catch:{ all -> 0x012c }
            r19 = 4
            r6[r19] = r14     // Catch:{ all -> 0x012c }
            long r19 = r15.getLong(r0, r1)     // Catch:{ all -> 0x012c }
            java.lang.Long r14 = java.lang.Long.valueOf(r19)     // Catch:{ all -> 0x012c }
            r19 = 5
            r6[r19] = r14     // Catch:{ all -> 0x012c }
            r14 = 6
            java.lang.String r1 = "prepare-path"
            java.lang.String r1 = r15.getString(r1, r11)     // Catch:{ all -> 0x012c }
            r6[r14] = r1     // Catch:{ all -> 0x012c }
            r1 = 17832(0x45a8, float:2.4988E-41)
            r13.mo160131h(r1, r6)     // Catch:{ all -> 0x012c }
            r1 = 0
            r15.putInt(r9, r1)     // Catch:{ all -> 0x012c }
            r15.putString(r10, r11)     // Catch:{ all -> 0x012c }
            r1 = 0
            r15.putLong(r8, r1)     // Catch:{ all -> 0x012c }
            r15.putString(r7, r11)     // Catch:{ all -> 0x012c }
            r15.putString(r5, r11)     // Catch:{ all -> 0x012c }
            r15.putLong(r0, r1)     // Catch:{ all -> 0x012c }
            r15.commit()     // Catch:{ all -> 0x012c }
            goto L_0x0130
        L_0x012c:
            r0 = move-exception
            goto L_0x0135
        L_0x012e:
            r18 = r2
        L_0x0130:
            r1 = 0
            goto L_0x013b
        L_0x0132:
            r0 = move-exception
            r18 = r2
        L_0x0135:
            r1 = 0
            java.lang.Object[] r2 = new java.lang.Object[r1]
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r4, r0, r12, r2)
        L_0x013b:
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r12, r3)
            zr2.a r0 = zr2.C66976a.f192427a
            java.lang.String r0 = "start"
            java.lang.String r2 = "com.tencent.mm.plugin.sns.keywords.SnsKeywordMatcher"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r0, r2)
            oa1.d r4 = oa1.C117731d.m166007c()
            java.lang.String r5 = "clicfg_sns_keyword"
            java.lang.String r6 = "0"
            r7 = 1
            java.lang.String r4 = r4.mo182444f(r5, r6, r1, r7)
            int r4 = com.tencent.p014mm.sdk.platformtools.Util.getInt((java.lang.String) r4, (int) r1)
            int r5 = com.tencent.p014mm.plugin.sns.model.C5431p1.C5432a.m5339j()
            r6 = 4
            r5 = r5 & r6
            if (r5 <= 0) goto L_0x0163
            r6 = 1
            goto L_0x0164
        L_0x0163:
            r6 = 0
        L_0x0164:
            if (r4 <= 0) goto L_0x0182
            if (r6 == 0) goto L_0x0169
            goto L_0x0182
        L_0x0169:
            r10 = 0
            java.lang.String r1 = "startInner"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r1, r2)
            zr2.e r9 = zr2.C66984e.f192447d
            r8 = 0
            r12 = 2
            r13 = 0
            java.lang.String r7 = "SnsKeywordMatcher_Thread"
            o40.C61926c.m72663H(r7, r8, r9, r10, r12, r13)
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r1, r2)
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r2)
            goto L_0x01a4
        L_0x0182:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r5 = "switch not enable. switch:"
            r1.append(r5)
            r1.append(r4)
            java.lang.String r4 = ", isFlagClose:"
            r1.append(r4)
            r1.append(r6)
            java.lang.String r1 = r1.toString()
            java.lang.String r4 = "MicroMsg.SnsKeywordMatcher"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r4, r1)
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r2)
        L_0x01a4:
            yn2.e r0 = yn2.C91534e.f262355e
            java.lang.String r0 = "init"
            java.lang.String r1 = "com.tencent.mm.plugin.sns.CleanSnsDB"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r0, r1)
            qh3.b$b<java.lang.Boolean> r2 = yn2.C91534e.f262356f
            yn2.e r4 = yn2.C91534e.f262355e
            qh3.a r2 = (qh3.C89660a) r2
            r2.mo123986c(r4)
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r1)
            r1 = r18
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r1, r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.sns.model.C94866e1.onAccountInitialized(android.content.Context):void");
    }

    public void onAccountReleased(Context context) {
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        SnsMethodCalculate.markStartTimeMs("onAccountReleased", "com.tencent.mm.plugin.sns.model.SnsCore");
        super.onAccountReleased(context);
        C100853b e = C100853b.m132142e();
        e.getClass();
        SnsMethodCalculate.markStartTimeMs("clearCallback", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdDownloadApkMgr");
        if (e.f295369b) {
            try {
                Log.m105928w("MicroMsg.AdDownloadApkMgr", "clearCallback, unregister package receiver");
                MMApplicationContext.getContext().unregisterReceiver(e.f295368a);
                e.f295369b = false;
            } catch (IllegalArgumentException e2) {
                Log.m105921e("MicroMsg.AdDownloadApkMgr", "unregister install receiver exception", e2.getMessage());
            }
        }
        ((C40935l) ((C13754y) C86312j.m106911c(C13754y.class)).Ds0()).mo63969q(e.f295374g);
        SnsMethodCalculate.markEndTimeMs("clearCallback", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdDownloadApkMgr");
        SnsMethodCalculate.markStartTimeMs("reset", "com.tencent.mm.plugin.sns.model.SnsCore");
        Log.m105918d("MicroMsg.SnsCore", "SnsCore close db");
        wx0();
        synchronized (this.f274896g) {
            try {
                ExecutorService executorService = this.f274896g[0];
                if (executorService != null) {
                    executorService.shutdownNow();
                    this.f274896g[0] = null;
                }
            } finally {
                while (true) {
                    str = "reset";
                    str2 = "com.tencent.mm.plugin.sns.model.SnsCore";
                    SnsMethodCalculate.markEndTimeMs(str, str2);
                }
            }
        }
        synchronized (this.f274895f) {
            try {
                ExecutorService executorService2 = this.f274895f[0];
                if (executorService2 != null) {
                    executorService2.shutdownNow();
                    this.f274895f[0] = null;
                }
            } finally {
                while (true) {
                    str3 = "reset";
                    str4 = "com.tencent.mm.plugin.sns.model.SnsCore";
                    SnsMethodCalculate.markEndTimeMs(str3, str4);
                }
            }
        }
        synchronized (this.f274894e) {
            try {
                ExecutorService executorService3 = this.f274894e[0];
                if (executorService3 != null) {
                    executorService3.shutdownNow();
                    this.f274894e[0] = null;
                }
            } finally {
                while (true) {
                    str5 = "reset";
                    str6 = "com.tencent.mm.plugin.sns.model.SnsCore";
                    SnsMethodCalculate.markEndTimeMs(str5, str6);
                }
            }
        }
        synchronized (this.f274897h) {
            try {
                ExecutorService executorService4 = this.f274897h[0];
                if (executorService4 != null) {
                    executorService4.shutdownNow();
                    this.f274897h[0] = null;
                }
            } catch (Throwable th) {
                while (true) {
                    throw th;
                }
            }
        }
        SnsMethodCalculate.markEndTimeMs("reset", "com.tencent.mm.plugin.sns.model.SnsCore");
        C92708g.f266813d.mo126892c();
        C92704c.f266809e.mo126892c();
        C92716o.f266827d.mo126892c();
        hy0().mo131029o();
        C66976a.m79135g();
        C91534e.m114871b();
        SnsMethodCalculate.markStartTimeMs("onAccountRelease", "com.tencent.mm.plugin.sns.ad.timeline.helper.AdAccountChangeHelper");
        Log.m105924i("AdAccountChangeHelper", "onAccountRelease");
        try {
            C79617c.m96683b();
            C88011l.m109539a();
        } catch (Throwable th4) {
            Log.m105920e("AdAccountChangeHelper", "onAccountRelease, exp=" + th4.toString());
        }
        SnsMethodCalculate.markEndTimeMs("onAccountRelease", "com.tencent.mm.plugin.sns.ad.timeline.helper.AdAccountChangeHelper");
        SnsMethodCalculate.markEndTimeMs("onAccountReleased", "com.tencent.mm.plugin.sns.model.SnsCore");
    }

    public final void oy0() {
        SnsMethodCalculate.markStartTimeMs("initDirOnDemand", "com.tencent.mm.plugin.sns.model.SnsCore");
        if (!C86709a0.m107522a()) {
            SnsMethodCalculate.markEndTimeMs("initDirOnDemand", "com.tencent.mm.plugin.sns.model.SnsCore");
        } else if (this.f274888Q) {
            SnsMethodCalculate.markEndTimeMs("initDirOnDemand", "com.tencent.mm.plugin.sns.model.SnsCore");
        } else {
            synchronized (this.f274889R) {
                try {
                    if (!this.f274888Q) {
                        Log.m105924i("MicroMsg.SnsCore", "init dir");
                        vx0();
                        this.f274888Q = true;
                    }
                } catch (Throwable th) {
                    while (true) {
                        SnsMethodCalculate.markEndTimeMs("initDirOnDemand", "com.tencent.mm.plugin.sns.model.SnsCore");
                        throw th;
                    }
                }
            }
            SnsMethodCalculate.markEndTimeMs("initDirOnDemand", "com.tencent.mm.plugin.sns.model.SnsCore");
        }
    }

    public final void ty0() {
        SnsMethodCalculate.markStartTimeMs("resetDb", "com.tencent.mm.plugin.sns.model.SnsCore");
        if (this.f274898i != null) {
            SnsMethodCalculate.markEndTimeMs("resetDb", "com.tencent.mm.plugin.sns.model.SnsCore");
            return;
        }
        this.f274898i = new C100411k0();
        C86709a0.m107528h();
        String str = C86709a0.m107535s().f251807e + "SnsMicroMsg.db";
        if (!this.f274898i.mo125626p(str, f274867W, true, true)) {
            C115669n.INSTANCE.mo175911u(150, 82);
            SnsMethodCalculate.markStartTimeMs("removeDirtyDB", "com.tencent.mm.plugin.sns.model.SnsCore");
            Log.m105924i("MicroMsg.SnsCore", "removeDirtyDB.");
            C86709a0.m107528h();
            Iterable<C86001b0> t = C86013q1.m106459t(C86709a0.m107535s().f251807e, false);
            if (t == null) {
                Log.m105920e("MicroMsg.SnsCore", "removeDirtyDB files null");
                SnsMethodCalculate.markEndTimeMs("removeDirtyDB", "com.tencent.mm.plugin.sns.model.SnsCore");
            } else {
                for (C86001b0 next : t) {
                    if (!next.f250476f && next.f250472b.contains("SnsMicroMsg")) {
                        Log.m105925i("MicroMsg.SnsCore", "removeDirtyDB will delete:%s", next.f250471a);
                        next.mo119954a();
                    }
                }
                SnsMethodCalculate.markEndTimeMs("removeDirtyDB", "com.tencent.mm.plugin.sns.model.SnsCore");
            }
            C100411k0 k0Var = new C100411k0();
            this.f274898i = k0Var;
            boolean p = k0Var.mo125626p(str, f274867W, true, true);
            Log.m105925i("MicroMsg.SnsCore", "one more time result:%s:", Boolean.valueOf(p));
            if (p) {
                C115669n.INSTANCE.mo175911u(150, 83);
            }
        }
        SnsMethodCalculate.markEndTimeMs("resetDb", "com.tencent.mm.plugin.sns.model.SnsCore");
    }

    public void vx0() {
        Class cls = C99015i.class;
        SnsMethodCalculate.markStartTimeMs("checkDir", "com.tencent.mm.plugin.sns.model.SnsCore");
        C86013q1.m106461v(((C99015i) C86312j.m106911c(cls)).mo61935YO());
        C86013q1.m106461v(((C99015i) C86312j.m106911c(cls)).mo61936iU());
        C86013q1.m106460u(C100891r.m132212g());
        SnsMethodCalculate.markEndTimeMs("checkDir", "com.tencent.mm.plugin.sns.model.SnsCore");
    }

    public final void wx0() {
        SnsMethodCalculate.markStartTimeMs("closeDB", "com.tencent.mm.plugin.sns.model.SnsCore");
        synchronized (this.f274887P) {
            try {
                C100411k0 k0Var = this.f274898i;
                if (k0Var != null) {
                    k0Var.mo124433c((String) null);
                    this.f274898i = null;
                }
            } catch (Throwable th) {
                while (true) {
                    SnsMethodCalculate.markEndTimeMs("closeDB", "com.tencent.mm.plugin.sns.model.SnsCore");
                    throw th;
                }
            }
        }
        SnsMethodCalculate.markEndTimeMs("closeDB", "com.tencent.mm.plugin.sns.model.SnsCore");
    }
}

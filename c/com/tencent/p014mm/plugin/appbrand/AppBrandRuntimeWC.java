package com.tencent.p014mm.plugin.appbrand;

import a14.C53930o0;
import ai0.C27903c;
import ai0.C79575q;
import ak0.C79584a;
import al0.C79587a;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.MutableContextWrapper;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.os.Build;
import android.os.Process;
import android.text.TextUtils;
import android.util.LongSparseArray;
import android.util.SparseArray;
import android.view.View;
import android.view.accessibility.AccessibilityManager;
import android.widget.FrameLayout;
import bi0.C79706a;
import bk0.C79709a;
import br0.C79774c;
import br0.C79781f;
import br0.C79782g;
import ci0.C0506a;
import ci0.C0507b;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.tencent.luggage.sdk.config.AppBrandInitConfigLU;
import com.tencent.luggage.sdk.launching.C80245f;
import com.tencent.luggage.sdk.launching.C80247h;
import com.tencent.luggage.sdk.processes.main.LuggagePopRuntimeTask;
import com.tencent.luggage.sdk.processes.main.LuggageRemoveTask;
import com.tencent.midas.api.APMidasPayAPI;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.app.C40008f;
import com.tencent.p014mm.autogen.mmdata.rpt.WeAppQualityCloseBeforeReadyStruct;
import com.tencent.p014mm.autogen.mmdata.rpt.WeAppQualityFinishLoadingStruct;
import com.tencent.p014mm.autogen.mmdata.rpt.wxa_expt_hitStruct;
import com.tencent.p014mm.hardcoder.C40318k;
import com.tencent.p014mm.ipcinvoker.C1256g;
import com.tencent.p014mm.ipcinvoker.type.IPCBoolean;
import com.tencent.p014mm.ipcinvoker.type.IPCString;
import com.tencent.p014mm.ipcinvoker.type.IPCVoid;
import com.tencent.p014mm.plugin.appbrand.RuntimeMigrateRestartHelper;
import com.tencent.p014mm.plugin.appbrand.app.C81207z0;
import com.tencent.p014mm.plugin.appbrand.appcache.C81247g3;
import com.tencent.p014mm.plugin.appbrand.appcache.C81289m;
import com.tencent.p014mm.plugin.appbrand.appcache.C81301p0;
import com.tencent.p014mm.plugin.appbrand.appcache.ModulePkgInfo;
import com.tencent.p014mm.plugin.appbrand.appcache.NotifyWxaCommLibUpdatedEvent;
import com.tencent.p014mm.plugin.appbrand.appcache.WxaPkg;
import com.tencent.p014mm.plugin.appbrand.appstorage.C29320c;
import com.tencent.p014mm.plugin.appbrand.appstorage.C81415h0;
import com.tencent.p014mm.plugin.appbrand.appstorage.C81417i0;
import com.tencent.p014mm.plugin.appbrand.appstorage.ICommLibReader;
import com.tencent.p014mm.plugin.appbrand.backgroundfetch.C81559o;
import com.tencent.p014mm.plugin.appbrand.backgroundrunning.AppBrandBackgroundRunningMonitor;
import com.tencent.p014mm.plugin.appbrand.backgroundrunning.C81580f;
import com.tencent.p014mm.plugin.appbrand.backgroundrunning.C81581g;
import com.tencent.p014mm.plugin.appbrand.backgroundrunning.C81582h;
import com.tencent.p014mm.plugin.appbrand.backgroundrunning.C81590r;
import com.tencent.p014mm.plugin.appbrand.complaint.C81607h;
import com.tencent.p014mm.plugin.appbrand.config.AppBrandGlobalSystemConfig;
import com.tencent.p014mm.plugin.appbrand.config.AppBrandInitConfig;
import com.tencent.p014mm.plugin.appbrand.config.AppBrandInitConfigWC;
import com.tencent.p014mm.plugin.appbrand.config.AppBrandLaunchReferrer;
import com.tencent.p014mm.plugin.appbrand.config.AppBrandSysConfigWC;
import com.tencent.p014mm.plugin.appbrand.config.C81634a;
import com.tencent.p014mm.plugin.appbrand.config.C81647b;
import com.tencent.p014mm.plugin.appbrand.config.C81649e;
import com.tencent.p014mm.plugin.appbrand.config.HalfScreenConfig;
import com.tencent.p014mm.plugin.appbrand.debugger.C81733f0;
import com.tencent.p014mm.plugin.appbrand.debugger.C81734g;
import com.tencent.p014mm.plugin.appbrand.debugger.C81738h0;
import com.tencent.p014mm.plugin.appbrand.debugger.DebuggerShell;
import com.tencent.p014mm.plugin.appbrand.floatball.C81840a;
import com.tencent.p014mm.plugin.appbrand.floatball.C81845c;
import com.tencent.p014mm.plugin.appbrand.floatball.C81849e;
import com.tencent.p014mm.plugin.appbrand.floatball.C81851f;
import com.tencent.p014mm.plugin.appbrand.floatball.C81855i;
import com.tencent.p014mm.plugin.appbrand.floatball.C81858k;
import com.tencent.p014mm.plugin.appbrand.floatball.C81862l;
import com.tencent.p014mm.plugin.appbrand.floatball.C81869m;
import com.tencent.p014mm.plugin.appbrand.game.preload.C81887c;
import com.tencent.p014mm.plugin.appbrand.game.preload.C81889e;
import com.tencent.p014mm.plugin.appbrand.game.preload.C81891f;
import com.tencent.p014mm.plugin.appbrand.ipc.C1537g;
import com.tencent.p014mm.plugin.appbrand.ipc.MMToClientEvent;
import com.tencent.p014mm.plugin.appbrand.jsapi.C1704j3;
import com.tencent.p014mm.plugin.appbrand.jsapi.C1727m;
import com.tencent.p014mm.plugin.appbrand.jsapi.auth.JsApiOperateWXData;
import com.tencent.p014mm.plugin.appbrand.jsapi.bluetooth.C82229d0;
import com.tencent.p014mm.plugin.appbrand.jsapi.bluetooth.C82260t;
import com.tencent.p014mm.plugin.appbrand.jsapi.bluetooth.C82262v;
import com.tencent.p014mm.plugin.appbrand.jsapi.fakenative.OpenBusinessViewUtil;
import com.tencent.p014mm.plugin.appbrand.jsapi.file.C82409b;
import com.tencent.p014mm.plugin.appbrand.jsapi.file.C82419d1;
import com.tencent.p014mm.plugin.appbrand.jsapi.h5_interact.C82526a;
import com.tencent.p014mm.plugin.appbrand.jsapi.h5_interact.C82527b;
import com.tencent.p014mm.plugin.appbrand.jsapi.lbs.C82604q;
import com.tencent.p014mm.plugin.appbrand.jsapi.media.C115249m;
import com.tencent.p014mm.plugin.appbrand.jsapi.media.C1737l0;
import com.tencent.p014mm.plugin.appbrand.jsapi.media.C82781y1;
import com.tencent.p014mm.plugin.appbrand.jsapi.miniprogram_navigator.C82816p;
import com.tencent.p014mm.plugin.appbrand.jsapi.msgchannel.C1754c;
import com.tencent.p014mm.plugin.appbrand.jsapi.share.C1862l;
import com.tencent.p014mm.plugin.appbrand.keylogger.C83226n;
import com.tencent.p014mm.plugin.appbrand.launching.AppBrandCgiPrefetchApi;
import com.tencent.p014mm.plugin.appbrand.launching.AppBrandPrepareTask;
import com.tencent.p014mm.plugin.appbrand.launching.AppBrandTaskUsageRecorder;
import com.tencent.p014mm.plugin.appbrand.launching.AppStartupPerformanceReportBundle;
import com.tencent.p014mm.plugin.appbrand.launching.C83291b1;
import com.tencent.p014mm.plugin.appbrand.launching.C83402p;
import com.tencent.p014mm.plugin.appbrand.launching.WeAppOpenUICallbackIPCProxy;
import com.tencent.p014mm.plugin.appbrand.launching.report.AppBrandRuntimeReloadReportBundle;
import com.tencent.p014mm.plugin.appbrand.luggage.customize.C83535c;
import com.tencent.p014mm.plugin.appbrand.media.music.AppBrandMusicClientService;
import com.tencent.p014mm.plugin.appbrand.media.record.C83626f;
import com.tencent.p014mm.plugin.appbrand.menu.C83664d0;
import com.tencent.p014mm.plugin.appbrand.networking.lib_server_mode.WxAppLibServerMode;
import com.tencent.p014mm.plugin.appbrand.p026ui.AppBrandUI;
import com.tencent.p014mm.plugin.appbrand.p026ui.C84524e3;
import com.tencent.p014mm.plugin.appbrand.p026ui.C84537h4;
import com.tencent.p014mm.plugin.appbrand.p026ui.C84543i2;
import com.tencent.p014mm.plugin.appbrand.p026ui.C84560k4;
import com.tencent.p014mm.plugin.appbrand.p026ui.C84567n4;
import com.tencent.p014mm.plugin.appbrand.p026ui.C84583r2;
import com.tencent.p014mm.plugin.appbrand.p026ui.C84684v;
import com.tencent.p014mm.plugin.appbrand.p026ui.C84686v0;
import com.tencent.p014mm.plugin.appbrand.p026ui.C84706x0;
import com.tencent.p014mm.plugin.appbrand.page.AppBrandPageContainerWC;
import com.tencent.p014mm.plugin.appbrand.page.C83768b4;
import com.tencent.p014mm.plugin.appbrand.page.C83780d1;
import com.tencent.p014mm.plugin.appbrand.page.C83781d2;
import com.tencent.p014mm.plugin.appbrand.page.C83782d3;
import com.tencent.p014mm.plugin.appbrand.page.C83797e3;
import com.tencent.p014mm.plugin.appbrand.page.C83818i;
import com.tencent.p014mm.plugin.appbrand.page.C83820i0;
import com.tencent.p014mm.plugin.appbrand.page.C83834k;
import com.tencent.p014mm.plugin.appbrand.page.C83849m0;
import com.tencent.p014mm.plugin.appbrand.page.C83907r4;
import com.tencent.p014mm.plugin.appbrand.page.C83928t1;
import com.tencent.p014mm.plugin.appbrand.page.C83966x;
import com.tencent.p014mm.plugin.appbrand.page.C83981z1;
import com.tencent.p014mm.plugin.appbrand.performance.AppBrandPerformanceManager;
import com.tencent.p014mm.plugin.appbrand.performance.C83992a;
import com.tencent.p014mm.plugin.appbrand.performance.C83994c;
import com.tencent.p014mm.plugin.appbrand.performance.C83997d;
import com.tencent.p014mm.plugin.appbrand.pip.C84025a0;
import com.tencent.p014mm.plugin.appbrand.pip.C84037e0;
import com.tencent.p014mm.plugin.appbrand.pip.C84042g;
import com.tencent.p014mm.plugin.appbrand.pip.C84059t;
import com.tencent.p014mm.plugin.appbrand.report.AppBrandStatObject;
import com.tencent.p014mm.plugin.appbrand.report.C84110d0;
import com.tencent.p014mm.plugin.appbrand.report.C84116i0;
import com.tencent.p014mm.plugin.appbrand.report.C84134l0;
import com.tencent.p014mm.plugin.appbrand.report.C84176o;
import com.tencent.p014mm.plugin.appbrand.report.C84177p;
import com.tencent.p014mm.plugin.appbrand.report.C84240s;
import com.tencent.p014mm.plugin.appbrand.report.model.C84170q;
import com.tencent.p014mm.plugin.appbrand.report.model.C84174u;
import com.tencent.p014mm.plugin.appbrand.report.model.kv_14609;
import com.tencent.p014mm.plugin.appbrand.report.quality.C84185b;
import com.tencent.p014mm.plugin.appbrand.report.quality.C84186b0;
import com.tencent.p014mm.plugin.appbrand.report.quality.C84191e;
import com.tencent.p014mm.plugin.appbrand.report.quality.C84196g;
import com.tencent.p014mm.plugin.appbrand.report.quality.C84201i;
import com.tencent.p014mm.plugin.appbrand.report.quality.C84217q;
import com.tencent.p014mm.plugin.appbrand.report.quality.C84218r;
import com.tencent.p014mm.plugin.appbrand.report.quality.C84223s;
import com.tencent.p014mm.plugin.appbrand.report.quality.C84228v;
import com.tencent.p014mm.plugin.appbrand.report.quality.QualitySession;
import com.tencent.p014mm.plugin.appbrand.report.quality.QualitySessionRuntime;
import com.tencent.p014mm.plugin.appbrand.step.KSProcessWeAppLaunch;
import com.tencent.p014mm.plugin.appbrand.task.C1971b;
import com.tencent.p014mm.plugin.appbrand.task.C29633a;
import com.tencent.p014mm.plugin.appbrand.task.C84342x;
import com.tencent.p014mm.plugin.appbrand.task.C84343y;
import com.tencent.p014mm.plugin.appbrand.task.checkdemo.C84276a;
import com.tencent.p014mm.plugin.appbrand.task.ipc.AppBrandNotifyPauseTask;
import com.tencent.p014mm.plugin.appbrand.task.ipc.AppBrandRegisterTask;
import com.tencent.p014mm.plugin.appbrand.task.ipc.AppBrandRuntimeCheckResetToTopOfStackMessage;
import com.tencent.p014mm.plugin.appbrand.task.ipc.AppBrandUpdateTask;
import com.tencent.p014mm.plugin.appbrand.task.ipc.C84307b;
import com.tencent.p014mm.plugin.appbrand.utils.C2039g2;
import com.tencent.p014mm.plugin.appbrand.utils.C29678o1;
import com.tencent.p014mm.plugin.appbrand.utils.C84738g0;
import com.tencent.p014mm.plugin.appbrand.utils.C84782s1;
import com.tencent.p014mm.plugin.appbrand.utils.C84788u;
import com.tencent.p014mm.plugin.appbrand.widget.AppBrandGlobalNativeWidgetContainerView;
import com.tencent.p014mm.plugin.appbrand.widget.C84923d;
import com.tencent.p014mm.plugin.appbrand.widget.C84927e;
import com.tencent.p014mm.plugin.appbrand.widget.C85008l;
import com.tencent.p014mm.plugin.appbrand.widget.C85010m;
import com.tencent.p014mm.plugin.appbrand.widget.halfscreen.HalfScreenManger;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.crash.CrashReportFactory;
import com.tencent.p014mm.sdk.event.IEvent;
import com.tencent.p014mm.sdk.event.IListener;
import com.tencent.p014mm.sdk.http.HttpWrapperBase;
import com.tencent.p014mm.sdk.platformtools.BuildInfo;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.MMHandlerThread;
import com.tencent.p014mm.sdk.platformtools.MTimerHandler;
import com.tencent.p014mm.sdk.platformtools.MultiProcessMMKV;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.sdk.platformtools.WeChatEnvironment;
import com.tencent.p014mm.sdk.system.AndroidContextUtil;
import com.tencent.p014mm.vfs.C86013q1;
import com.tencent.rtmp.TXLiveConstants;
import com.tencent.soter.core.biometric.FaceManager;
import com.tencent.tav.coremedia.TimeUtil;
import com.tencent.thumbplayer.tmediacodec.codec.CodecError;
import com.tencent.xweb.file.XVFSFile;
import cr0.C86127t;
import di3.C86312j;
import es0.C86666i;
import fo0.C87027l;
import fy3.C32224a;
import gy3.C87412m;
import h81.C32735h;
import in3.C87771d;
import it0.C87795a;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.Queue;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentLinkedDeque;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import jk0.C87985i;
import jp3.C9486a;
import jp3.C9487b;
import js0.C88016e;
import js0.C9514m;
import junit.framework.Assert;
import km0.C88224a;
import kr0.C76630x0;
import kr0.C88267e;
import li0.C88507a;
import mi0.C34574b;
import mj0.C88734d;
import nm0.C89018a;
import o40.C61926c;
import op0.C89251a;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p1010nc.C88926i;
import p1013nf.C88938b;
import p1042u.C111059i;
import p1042u.C90590d;
import p1044ub.C90630c;
import p156gj.C87203t;
import p170ic.C87690d;
import p194lc.C88435b0;
import p194lc.C88454p;
import p194lc.C88470y;
import p206nj.C117627q;
import p224ra.C89909e;
import p284zb.C91635f;
import p284zb.C91640i;
import p385u2.C111105a;
import p547hb.C87465d;
import p823sg.C77710q;
import p936cc.C79994a;
import p959ec.C86499a;
import p963fc.C86812g;
import p963fc.C86813h;
import p963fc.C86814i;
import p992kb.C88127c;
import pe3.C89349b;
import qe3.C89625d;
import qm0.C89717d;
import qp0.C89784b;
import qp0.C89785c;
import qp0.C89787d;
import qq0.C89797e;
import qq0.C89805k;
import qq0.C89811p;
import rx3.C13598b0;
import rx3.C36570n;
import sf0.C90188n0;
import sl0.C90223g;
import sp0.C90272a;
import sp0.C90283e;
import sp0.C90309m;
import sp0.C90321p;
import sp0.C90322q;
import sq0.C90327a;
import sq0.C90328b;
import sq0.C90339i;
import te3.C49473fu2;
import te3.C51173ry;
import tm0.C90537f;
import u24.C90595a;
import u24.C90599h;
import uj0.C90670e;
import wi0.C53171h;
import wi0.C53172t;
import wi0.C53173v;
import wi0.C90987k;
import wq0.C91077n;
import wq0.C91078o;
import wq0.C91080q;
import wq0.C91082s;
import wq0.C91083t;
import x20.C15618a;
import yi0.C91452a;
import yi0.C91456b;
import yn0.C91521g;
import yr0.C91577a;
import zd2.C91667a;
import zp0.C16377l;
import zp0.C91831m;
import zp0.C91833o;
import zp0.C91838s;
import zt3.C119157j;

/* renamed from: com.tencent.mm.plugin.appbrand.AppBrandRuntimeWC */
public class AppBrandRuntimeWC extends C86812g implements C83291b1, C87690d.C87691a {

    /* renamed from: Q1 */
    public static final boolean f238264Q1;

    /* renamed from: A1 */
    public final C84923d f238265A1 = new C84923d(this);

    /* renamed from: B1 */
    public final C85036x2 f238266B1 = new C85036x2(this);

    /* renamed from: C1 */
    public C83818i f238267C1;

    /* renamed from: D1 */
    public C84174u f238268D1;

    /* renamed from: E1 */
    public IListener<NotifyWxaCommLibUpdatedEvent> f238269E1;

    /* renamed from: F1 */
    public C84090r1 f238270F1;

    /* renamed from: G1 */
    public final LongSparseArray<Object> f238271G1 = new LongSparseArray<>();

    /* renamed from: H1 */
    public C84228v f238272H1;

    /* renamed from: I1 */
    public final Object f238273I1 = new byte[0];

    /* renamed from: J1 */
    public volatile C89717d f238274J1;

    /* renamed from: K1 */
    public boolean f238275K1;

    /* renamed from: L1 */
    public C79709a f238276L1;

    /* renamed from: M1 */
    public final C84342x f238277M1;

    /* renamed from: N1 */
    public final Queue<Runnable> f238278N1;

    /* renamed from: O1 */
    public C79781f f238279O1;

    /* renamed from: P1 */
    public C88926i f238280P1;

    /* renamed from: i1 */
    public final AppBrandCgiPrefetchApi f238281i1 = new AppBrandCgiPrefetchApi();

    /* renamed from: j1 */
    public final C89018a f238282j1 = new C89018a();

    /* renamed from: k1 */
    public volatile C84170q f238283k1;

    /* renamed from: l1 */
    public final C83606m1 f238284l1;

    /* renamed from: m1 */
    public boolean f238285m1;

    /* renamed from: n1 */
    public int f238286n1 = 0;

    /* renamed from: o1 */
    public boolean f238287o1;

    /* renamed from: p1 */
    public final List<C81691d3> f238288p1 = new LinkedList();

    /* renamed from: q1 */
    public MTimerHandler f238289q1 = null;

    /* renamed from: r1 */
    public volatile C81688d0 f238290r1;

    /* renamed from: s1 */
    public Configuration f238291s1;

    /* renamed from: t1 */
    public C81855i f238292t1;

    /* renamed from: u1 */
    public C89787d f238293u1;

    /* renamed from: v1 */
    public C79575q f238294v1;

    /* renamed from: w1 */
    public C81546b f238295w1;

    /* renamed from: x1 */
    public C86814i<AppBrandInitConfigWC> f238296x1;

    /* renamed from: y1 */
    public final C84110d0 f238297y1;

    /* renamed from: z1 */
    public HalfScreenManger f238298z1 = new HalfScreenManger(this);

    static {
        boolean z = true;
        if (!C91452a.f262180e.getAndSet(true)) {
            CrashReportFactory.addCrashReportExtraMessageGetter(C91452a.f262179d);
        }
        if (!BuildInfo.DEBUG && !WeChatEnvironment.hasDebugger() && !DebuggerShell.f239772d && !C89625d.f257845k && !C89625d.f257846l) {
            z = false;
        }
        f238264Q1 = z;
    }

    public AppBrandRuntimeWC(AppBrandRuntimeContainerWC appBrandRuntimeContainerWC) {
        super((C81820e3) appBrandRuntimeContainerWC);
        Assert.assertTrue("AppBrandRuntimeWC's initial context should be AppBrandRuntimePersistentContextWrapper", mo113010G() instanceof C84543i2);
        this.f238284l1 = new C83606m1();
        this.f238297y1 = new C84110d0();
        mo113031T0(f238264Q1);
        this.f238277M1 = new AppBrandRuntimeWC$$m(this);
        this.f238278N1 = new LinkedBlockingQueue();
        mo113033U0(appBrandRuntimeContainerWC);
    }

    /* renamed from: F1 */
    public static void m99215F1(AppBrandInitConfigWC appBrandInitConfigWC) {
        try {
            C80245f.m97632b(appBrandInitConfigWC.f234822V);
            C80245f.m97632b(appBrandInitConfigWC.f234820U);
            C80245f.m97632b(appBrandInitConfigWC.f234824W);
            WeAppOpenUICallbackIPCProxy weAppOpenUICallbackIPCProxy = appBrandInitConfigWC.f239392w1;
            if (weAppOpenUICallbackIPCProxy != null) {
                C80245f.m97632b(weAppOpenUICallbackIPCProxy.f243386d);
                C80245f.m97632b(weAppOpenUICallbackIPCProxy.f243387e);
                C80245f.m97632b(weAppOpenUICallbackIPCProxy.f243388f);
            }
            appBrandInitConfigWC.f234815R0.f157953p = null;
        } finally {
            appBrandInitConfigWC.f234822V = null;
            appBrandInitConfigWC.f234820U = null;
            appBrandInitConfigWC.f239392w1 = null;
        }
    }

    /* renamed from: d */
    public static void m99217d(AppBrandRuntimeWC appBrandRuntimeWC) {
        appBrandRuntimeWC.getClass();
        appBrandRuntimeWC.f251968f1 = new C91083t(appBrandRuntimeWC);
    }

    /* renamed from: z */
    public static AppBrandPrepareTask m99219z(AppBrandRuntimeWC appBrandRuntimeWC, AppBrandRuntime$$z appBrandRuntime$$z) {
        C83226n.m102130g(appBrandRuntimeWC.f238147j, KSProcessWeAppLaunch.stepPrepareResourceGroup);
        C83226n.m102130g(appBrandRuntimeWC.f238147j, KSProcessWeAppLaunch.stepPrepareResourceWaitForResult);
        appBrandRuntimeWC.f238107E.mo117039b();
        long currentTimeMillis = System.currentTimeMillis();
        AppBrandPrepareTask appBrandPrepareTask = new AppBrandPrepareTask(appBrandRuntimeWC.mo113026R(), appBrandRuntimeWC);
        appBrandPrepareTask.f243157c = new C83402p(appBrandPrepareTask, appBrandRuntimeWC, new C81108a2(appBrandRuntimeWC, appBrandPrepareTask, currentTimeMillis, appBrandRuntime$$z));
        appBrandRuntimeWC.mo113052e("before startPrepare(), task[%d]", Integer.valueOf(appBrandPrepareTask.hashCode()));
        appBrandPrepareTask.mo115501d();
        return appBrandPrepareTask;
    }

    /*  JADX ERROR: IndexOutOfBoundsException in pass: RegionMakerVisitor
        java.lang.IndexOutOfBoundsException: Index 0 out of bounds for length 0
        	at java.base/jdk.internal.util.Preconditions.outOfBounds(Preconditions.java:64)
        	at java.base/jdk.internal.util.Preconditions.outOfBoundsCheckIndex(Preconditions.java:70)
        	at java.base/jdk.internal.util.Preconditions.checkIndex(Preconditions.java:248)
        	at java.base/java.util.Objects.checkIndex(Objects.java:372)
        	at java.base/java.util.ArrayList.get(ArrayList.java:458)
        	at jadx.core.dex.nodes.InsnNode.getArg(InsnNode.java:101)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:611)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:698)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    /* renamed from: A0 */
    public void mo113001A0() {
        /*
            r39 = this;
            r1 = r39
            super.mo113001A0()
            java.lang.String r0 = r1.f238147j
            com.tencent.mm.plugin.appbrand.q1 r0 = com.tencent.p014mm.plugin.appbrand.C84072q1.m103586a(r0)
            long r2 = java.lang.System.currentTimeMillis()
            r0.f245470n = r2
            com.tencent.mm.plugin.appbrand.l1 r0 = com.tencent.p014mm.plugin.appbrand.C83237l1.f243102b
            r0.mo115473d(r1)
            java.lang.String r0 = "onReady"
            r2 = 0
            java.lang.Object[] r3 = new java.lang.Object[r2]
            r1.mo113052e(r0, r3)
            int r0 = r1.f238286n1
            if (r0 == 0) goto L_0x0035
            com.tencent.mm.hardcoder.WXHardCoderJNI r0 = com.tencent.p014mm.hardcoder.C40318k.m43492a()
            com.tencent.mm.hardcoder.WXHardCoderJNI r3 = com.tencent.p014mm.hardcoder.C40318k.m43492a()
            boolean r3 = r3.getHcMiniProgramLaunchEnable()
            int r4 = r1.f238286n1
            r0.stopPerformance(r3, r4)
            r1.f238286n1 = r2
        L_0x0035:
            long r3 = java.lang.System.currentTimeMillis()
            com.tencent.mm.plugin.appbrand.config.AppBrandInitConfigWC r0 = r39.mo113210l1()
            long r5 = r0.f234800D
            long r3 = r3 - r5
            boolean r0 = r1.f238285m1
            boolean r5 = r39.mo121254q1()
            if (r5 == 0) goto L_0x004b
            r6 = 775(0x307, float:1.086E-42)
            goto L_0x004d
        L_0x004b:
            r6 = 367(0x16f, float:5.14E-43)
        L_0x004d:
            r7 = 2000(0x7d0, double:9.88E-321)
            r12 = 2
            r13 = 4
            r14 = 5
            r11 = 3
            r15 = 1
            int r23 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            if (r23 > 0) goto L_0x0061
            if (r0 == 0) goto L_0x005e
            r5 = 8
            goto L_0x00e2
        L_0x005e:
            r5 = 1
            goto L_0x00e2
        L_0x0061:
            r7 = 3000(0xbb8, double:1.482E-320)
            int r23 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            if (r23 > 0) goto L_0x0070
            if (r0 == 0) goto L_0x006d
            r5 = 9
            goto L_0x00e2
        L_0x006d:
            r5 = 2
            goto L_0x00e2
        L_0x0070:
            r7 = 4000(0xfa0, double:1.9763E-320)
            int r23 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            if (r23 > 0) goto L_0x007f
            if (r0 == 0) goto L_0x007c
            r5 = 10
            goto L_0x00e2
        L_0x007c:
            r5 = 3
            goto L_0x00e2
        L_0x007f:
            r7 = 5000(0x1388, double:2.4703E-320)
            int r23 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            if (r23 > 0) goto L_0x008d
            if (r0 == 0) goto L_0x008b
            r5 = 11
            goto L_0x00e2
        L_0x008b:
            r5 = 4
            goto L_0x00e2
        L_0x008d:
            r7 = 6000(0x1770, double:2.9644E-320)
            int r23 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            if (r23 > 0) goto L_0x009a
            if (r0 == 0) goto L_0x0098
            r5 = 12
            goto L_0x00e2
        L_0x0098:
            r5 = 5
            goto L_0x00e2
        L_0x009a:
            if (r5 == 0) goto L_0x00dc
            r7 = 7000(0x1b58, double:3.4585E-320)
            int r5 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            if (r5 > 0) goto L_0x00aa
            if (r0 == 0) goto L_0x00a7
            r5 = 19
            goto L_0x00e2
        L_0x00a7:
            r5 = 14
            goto L_0x00e2
        L_0x00aa:
            r7 = 8000(0x1f40, double:3.9525E-320)
            int r5 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            if (r5 > 0) goto L_0x00b8
            if (r0 == 0) goto L_0x00b5
            r5 = 20
            goto L_0x00e2
        L_0x00b5:
            r5 = 15
            goto L_0x00e2
        L_0x00b8:
            r7 = 9000(0x2328, double:4.4466E-320)
            int r5 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            if (r5 > 0) goto L_0x00c6
            if (r0 == 0) goto L_0x00c3
            r5 = 21
            goto L_0x00e2
        L_0x00c3:
            r5 = 16
            goto L_0x00e2
        L_0x00c6:
            r7 = 10000(0x2710, double:4.9407E-320)
            int r5 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            if (r5 > 0) goto L_0x00d4
            if (r0 == 0) goto L_0x00d1
            r5 = 22
            goto L_0x00e2
        L_0x00d1:
            r5 = 17
            goto L_0x00e2
        L_0x00d4:
            if (r0 == 0) goto L_0x00d9
            r5 = 23
            goto L_0x00e2
        L_0x00d9:
            r5 = 18
            goto L_0x00e2
        L_0x00dc:
            if (r0 == 0) goto L_0x00e1
            r5 = 13
            goto L_0x00e2
        L_0x00e1:
            r5 = 6
        L_0x00e2:
            com.tencent.mm.plugin.report.service.n r7 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            long r9 = (long) r6
            long r5 = (long) r5
            r28 = 1
            r30 = 0
            r23 = r7
            r24 = r9
            r26 = r5
            r23.idkeyStat(r24, r26, r28, r30)
            if (r0 == 0) goto L_0x0103
            r26 = 7
            r28 = 1
            r30 = 0
            r23 = r7
            r24 = r9
            r23.idkeyStat(r24, r26, r28, r30)
            goto L_0x0110
        L_0x0103:
            r26 = 0
            r28 = 1
            r30 = 0
            r23 = r7
            r24 = r9
            r23.idkeyStat(r24, r26, r28, r30)
        L_0x0110:
            java.lang.Object[] r5 = new java.lang.Object[r12]
            java.lang.Long r6 = java.lang.Long.valueOf(r3)
            r5[r2] = r6
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r5[r15] = r0
            java.lang.String r0 = "MicroMsg.AppBrandReporterManager"
            java.lang.String r6 = "startApp cost %s msec(hasDownload : %b)."
            com.tencent.p014mm.sdk.platformtools.Log.m105927v(r0, r6, r5)
            java.lang.String r0 = "MicroMsg.AppBrandRuntimeWC"
            java.lang.String r5 = "onReady reportStartupTime: appId:%s, nickname:%s, cost:%dms, download:%b, isGame:%b"
            java.lang.Object[] r6 = new java.lang.Object[r14]
            java.lang.String r7 = r1.f238147j
            r6[r2] = r7
            com.tencent.mm.plugin.appbrand.config.AppBrandInitConfigWC r7 = r39.mo113210l1()
            java.lang.String r7 = r7.f239363e
            r6[r15] = r7
            java.lang.Long r3 = java.lang.Long.valueOf(r3)
            r6[r12] = r3
            boolean r3 = r1.f238285m1
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r3)
            r6[r11] = r3
            boolean r3 = r39.mo121254q1()
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r3)
            r6[r13] = r3
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r0, r5, r6)
            long r3 = java.lang.System.currentTimeMillis()
            com.tencent.mm.plugin.appbrand.config.AppBrandInitConfigWC r0 = r39.mo113210l1()
            long r5 = r0.f234800D
            long r3 = r3 - r5
            com.tencent.mm.plugin.appbrand.m1 r0 = r1.f238284l1
            r0.mo115918e(r14, r3)
            com.tencent.mm.plugin.appbrand.m1 r0 = r1.f238284l1
            boolean r5 = r1.f238285m1
            com.tencent.mm.plugin.appbrand.config.AppBrandInitConfigWC r6 = r39.mo113210l1()
            boolean r6 = r6.f234825W0
            java.lang.Class<com.tencent.mm.plugin.appbrand.launching.AppStartupPerformanceReportBundle> r7 = com.tencent.p014mm.plugin.appbrand.launching.AppStartupPerformanceReportBundle.class
            com.tencent.mm.plugin.appbrand.jsapi.m r7 = r1.mo113018M(r7)
            com.tencent.mm.plugin.appbrand.launching.AppStartupPerformanceReportBundle r7 = (com.tencent.p014mm.plugin.appbrand.launching.AppStartupPerformanceReportBundle) r7
            boolean r7 = r7.f243301u
            r0.getClass()
            java.lang.String r9 = r1.f238147j
            r0.f244176b = r2
            r0.f244177c = r2
            com.tencent.mm.plugin.appbrand.config.AppBrandSysConfigWC r10 = r39.mo113213o1()
            if (r10 == 0) goto L_0x019b
            com.tencent.mm.plugin.appbrand.config.AppBrandSysConfigWC r10 = r39.mo113213o1()
            com.tencent.mm.plugin.appbrand.appcache.WxaPkgWrappingInfo r10 = r10.f261072r
            int r10 = r10.pkgVersion
            r0.f244176b = r10
            com.tencent.mm.plugin.appbrand.config.AppBrandSysConfigWC r10 = r39.mo113213o1()
            com.tencent.mm.plugin.appbrand.appcache.WxaPkgWrappingInfo r10 = r10.f261072r
            int r10 = r10.f238585d
            int r10 = r10 + r15
            r0.f244177c = r10
        L_0x019b:
            r0.f244178d = r5
            boolean r10 = r39.mo121254q1()
            r0.f244184j = r10
            int r10 = r39.mo113208k1()
            r0.f244179e = r10
            r0.f244182h = r6
            r0.f244183i = r7
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            r7 = 0
        L_0x01b3:
            long[] r10 = r0.f244175a
            int r8 = r10.length
            java.lang.String r13 = "MicroMsg.AppBrandRuntimeStartupReporter"
            r14 = 0
            if (r7 >= r8) goto L_0x01f3
            r31 = r3
            r2 = r10[r7]
            int r4 = (r2 > r14 ? 1 : (r2 == r14 ? 0 : -1))
            if (r4 >= 0) goto L_0x01e2
            java.lang.Object[] r2 = new java.lang.Object[r12]
            java.lang.Integer r3 = java.lang.Integer.valueOf(r7)
            r4 = 0
            r2[r4] = r3
            long[] r0 = r0.f244175a
            r3 = r0[r7]
            java.lang.Long r0 = java.lang.Long.valueOf(r3)
            r3 = 1
            r2[r3] = r0
            java.lang.String r0 = "Report Startup Time: abort, illegal value: %d, %d"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r13, r0, r2)
            r3 = 6
            r5 = 9
            goto L_0x02bb
        L_0x01e2:
            r6.append(r2)
            java.lang.String r2 = ","
            r6.append(r2)
            int r7 = r7 + 1
            r3 = r31
            r2 = 0
            r13 = 4
            r14 = 5
            r15 = 1
            goto L_0x01b3
        L_0x01f3:
            r31 = r3
            com.tencent.mm.plugin.appbrand.config.AppBrandInitConfigWC r2 = r39.mo113210l1()
            if (r2 == 0) goto L_0x01ff
            int r2 = r2.f234841u
            r7 = 0
            goto L_0x0212
        L_0x01ff:
            int r2 = com.tencent.p014mm.plugin.appbrand.report.C84241t.m103848b(r9)
            r3 = 1
            java.lang.Object[] r4 = new java.lang.Object[r3]
            java.lang.Integer r3 = java.lang.Integer.valueOf(r2)
            r7 = 0
            r4[r7] = r3
            java.lang.String r3 = "getServiceTypeForReport null = initConfig! appServiceType:%s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r13, r3, r4)
        L_0x0212:
            int r2 = r2 + 1000
            boolean r3 = r39.mo121254q1()
            com.tencent.mm.plugin.appbrand.task.y r3 = com.tencent.p014mm.plugin.appbrand.task.C84343y.m103969a(r3)
            boolean r3 = com.tencent.p014mm.plugin.appbrand.task.C84331q.m103957l(r3)
            r4 = 5
            java.lang.Object[] r8 = new java.lang.Object[r4]
            r8[r7] = r9
            java.lang.String r4 = r6.toString()
            r6 = 1
            r8[r6] = r4
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r5)
            r8[r12] = r4
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r3)
            r8[r11] = r3
            java.lang.Integer r3 = java.lang.Integer.valueOf(r2)
            r4 = 4
            r8[r4] = r3
            java.lang.String r3 = "Report Startup Time: %s, %s, Download: %s, Preload: %s, appServiceType: %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r13, r3, r8)
            r0.mo115917d(r9, r6, r7, r2)
            r0.mo115917d(r9, r12, r6, r2)
            r0.mo115917d(r9, r11, r12, r2)
            r0.mo115917d(r9, r4, r11, r2)
            r3 = 6
            r0.mo115917d(r9, r3, r4, r2)
            r4 = 7
            r5 = 5
            r0.mo115917d(r9, r4, r5, r2)
            r5 = 23
            r0.mo115917d(r9, r5, r3, r2)
            r5 = 24
            r0.mo115917d(r9, r5, r4, r2)
            r4 = 25
            r5 = 8
            r0.mo115917d(r9, r4, r5, r2)
            r4 = 26
            r5 = 9
            r0.mo115917d(r9, r4, r5, r2)
            r4 = 27
            r6 = 10
            r0.mo115917d(r9, r4, r6, r2)
            r4 = 28
            r6 = 11
            r0.mo115917d(r9, r4, r6, r2)
            r4 = 29
            r6 = 12
            r0.mo115917d(r9, r4, r6, r2)
            r4 = 30
            r6 = 13
            r0.mo115917d(r9, r4, r6, r2)
            r4 = 31
            r6 = 14
            r0.mo115917d(r9, r4, r6, r2)
            int r2 = r0.f244184j
            r4 = 1
            if (r2 != r4) goto L_0x029c
            int r4 = r0.f244181g
            goto L_0x029e
        L_0x029c:
            int r4 = r0.f244180f
        L_0x029e:
            r26 = r4
            r23 = 4
            long[] r4 = r0.f244175a
            r6 = 5
            r24 = r4[r6]
            int r0 = r0.f244178d
            r4 = 0
            com.tencent.mm.plugin.appbrand.appstorage.ICommLibReader r6 = r1.mo113184O1(r4)
            int r30 = r6.mo113371a()
            r27 = r9
            r28 = r0
            r29 = r2
            p774zg.C39348q0.m42097c(r23, r24, r26, r27, r28, r29, r30)
        L_0x02bb:
            r0 = 202(0xca, float:2.83E-43)
            r6 = r31
            com.tencent.p014mm.plugin.appbrand.performance.AppBrandPerformanceManager.m103495d(r1, r0, r6)
            com.tencent.mm.plugin.appbrand.config.AppBrandInitConfigWC r0 = r39.mo113210l1()
            long r6 = r0.f234800D
            com.tencent.p014mm.plugin.appbrand.performance.C83997d.f245230a = r6
            java.lang.String r2 = r1.f238147j
            r4 = 1
            com.tencent.mm.plugin.appbrand.report.quality.QualitySessionRuntime r6 = com.tencent.p014mm.plugin.appbrand.report.quality.C84185b.m103770c(r2, r4)
            r7 = 0
            if (r6 != 0) goto L_0x02e2
            java.lang.String r0 = "MicroMsg.AppBrandQualitySystem"
            java.lang.String r5 = "onAppBrandInitReady appId[%s] NULL session"
            java.lang.Object[] r6 = new java.lang.Object[r4]
            r8 = 0
            r6[r8] = r2
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r0, r5, r6)
            goto L_0x0706
        L_0x02e2:
            r8 = 0
            java.lang.String r0 = "MicroMsg.AppBrandQualitySystem"
            java.lang.String r9 = "onAppBrandInitReady appId[%s]"
            java.lang.Object[] r10 = new java.lang.Object[r4]
            r10[r8] = r2
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r0, r9, r10)
            r6.f245848I = r7
            com.tencent.mm.autogen.mmdata.rpt.WeAppQualityLaunchWebviewStruct r4 = new com.tencent.mm.autogen.mmdata.rpt.WeAppQualityLaunchWebviewStruct
            r4.<init>()
            com.tencent.mm.plugin.appbrand.report.quality.QualitySessionRuntime r9 = com.tencent.p014mm.plugin.appbrand.report.quality.C84185b.m103768a(r39)
            java.util.Objects.requireNonNull(r9)
            com.tencent.tinker.entry.ApplicationLike r0 = com.tencent.p014mm.app.C80589e.f235760a
            boolean r0 = iv3.C87824b.m109281c(r0)
            r22 = r6
            r5 = 1
            if (r0 == 0) goto L_0x030a
            r7 = r5
            goto L_0x030c
        L_0x030a:
            r7 = 2
        L_0x030c:
            r4.f236888H = r7
            java.lang.String r0 = r9.f245833e
            java.lang.String r7 = "AppId"
            r8 = 1
            java.lang.String r0 = r4.mo86045b(r7, r0, r8)
            r4.f236891e = r0
            java.lang.String r0 = r39.mo113177I1()
            java.lang.String r0 = com.tencent.p014mm.sdk.platformtools.Util.nullAsNil((java.lang.String) r0)
            java.lang.String r0 = p206nj.C117627q.m165908a(r0)
            java.lang.String r7 = "NickName"
            java.lang.String r0 = r4.mo86045b(r7, r0, r8)
            r4.f236889I = r0
            java.lang.String r0 = r9.f245832d
            java.lang.String r7 = "InstanceId"
            java.lang.String r0 = r4.mo86045b(r7, r0, r8)
            r4.f236890d = r0
            int r0 = r9.f245834f
            if (r0 == r8) goto L_0x0347
            if (r0 == r12) goto L_0x0344
            if (r0 == r11) goto L_0x0341
            r0 = 0
            goto L_0x0349
        L_0x0341:
            com.tencent.mm.autogen.mmdata.rpt.WeAppQualityLaunchWebviewStruct$a r0 = com.tencent.p014mm.autogen.mmdata.rpt.WeAppQualityLaunchWebviewStruct.C80768a.demo
            goto L_0x0349
        L_0x0344:
            com.tencent.mm.autogen.mmdata.rpt.WeAppQualityLaunchWebviewStruct$a r0 = com.tencent.p014mm.autogen.mmdata.rpt.WeAppQualityLaunchWebviewStruct.C80768a.debug
            goto L_0x0349
        L_0x0347:
            com.tencent.mm.autogen.mmdata.rpt.WeAppQualityLaunchWebviewStruct$a r0 = com.tencent.p014mm.autogen.mmdata.rpt.WeAppQualityLaunchWebviewStruct.C80768a.release
        L_0x0349:
            r4.f236893g = r0
            int r0 = r9.f245835g
            long r7 = (long) r0
            r4.f236894h = r7
            int r0 = r9.f245837i
            long r7 = (long) r0
            r4.f236892f = r7
            int r0 = r9.f245836h
            long r7 = (long) r0
            r4.f236896j = r7
            long r7 = r9.f245855p
            r4.f236897k = r7
            java.lang.String r0 = "StartTimeStampMs"
            r4.mo86048e(r0, r7)
            long r7 = com.tencent.p014mm.sdk.platformtools.Util.nowMilliSecond()
            r4.f236898l = r7
            java.lang.String r0 = "EndTimeStampMs"
            r4.mo86048e(r0, r7)
            long r7 = r4.f236898l
            long r10 = r4.f236897k
            long r7 = r7 - r10
            r4.f236895i = r7
            java.lang.String r0 = "CostTimeMs"
            r4.mo86046c(r0, r7)
            com.tencent.mm.plugin.appbrand.page.AppBrandPageContainerWC r0 = r39.mo113212m1()     // Catch:{ Exception -> 0x0395 }
            java.lang.String r0 = r0.getCurrentUrl()     // Catch:{ Exception -> 0x0395 }
            java.lang.String r0 = com.tencent.p014mm.sdk.platformtools.Util.nullAsNil((java.lang.String) r0)     // Catch:{ Exception -> 0x0395 }
            java.lang.String r0 = p206nj.C117627q.m165908a(r0)     // Catch:{ Exception -> 0x0395 }
            java.lang.String r7 = "path"
            r8 = 1
            java.lang.String r0 = r4.mo86045b(r7, r0, r8)     // Catch:{ Exception -> 0x0395 }
            r4.f236899m = r0     // Catch:{ Exception -> 0x0395 }
            goto L_0x03a5
        L_0x0395:
            r0 = move-exception
            java.lang.String r7 = "MicroMsg.AppBrandQualitySystem"
            java.lang.String r8 = "launchToInitReady appId %s getCurrentUrl npe = %s"
            java.lang.Object[] r10 = new java.lang.Object[r12]
            r11 = 0
            r10[r11] = r2
            r13 = 1
            r10[r13] = r0
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r7, r8, r10)
        L_0x03a5:
            boolean r0 = r9.f245850K
            if (r0 == 0) goto L_0x03ab
            r7 = r5
            goto L_0x03ac
        L_0x03ab:
            r7 = r14
        L_0x03ac:
            r4.f236900n = r7
            com.tencent.mm.plugin.appbrand.launching.AppStartupPerformanceReportBundle r0 = r9.f245861v
            if (r0 == 0) goto L_0x03c0
            com.tencent.mm.plugin.appbrand.launching.AppStartupPerformanceReportBundle r0 = r9.f245861v
            boolean r0 = r0.mo115530a()
            if (r0 == 0) goto L_0x03bc
            r7 = r5
            goto L_0x03bd
        L_0x03bc:
            r7 = r14
        L_0x03bd:
            r4.f236901o = r7
            goto L_0x03c4
        L_0x03c0:
            boolean r0 = com.tencent.p014mm.sdk.platformtools.BuildInfo.DEBUG
            if (r0 != 0) goto L_0x090d
        L_0x03c4:
            long r7 = r9.mo116871a()
            r4.f236902p = r7
            java.lang.Class<h81.h> r0 = h81.C32735h.class
            di3.d r0 = di3.C86312j.m106911c(r0)
            h81.h r0 = (h81.C32735h) r0
            h81.h$c r7 = h81.C32735h.C32737c.clicfg_android_appbrand_preload_so
            r8 = 0
            int r0 = r0.mo58779Qe(r7, r8)
            long r10 = (long) r0
            r4.f236881A = r10
            r4.f236903q = r14
            android.content.Context r0 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            java.lang.String r0 = com.tencent.p014mm.plugin.appbrand.report.C84116i0.m103659b(r0)
            java.lang.String r8 = "networkType"
            r10 = 1
            java.lang.String r0 = r4.mo86045b(r8, r0, r10)
            r4.f236904r = r0
            com.tencent.mm.plugin.appbrand.config.AppBrandSysConfigWC r0 = r39.mo113213o1()
            com.tencent.mm.plugin.appbrand.appcache.WxaPkgWrappingInfo r0 = r0.f261072r
            com.tencent.mm.plugin.appbrand.appcache.WxaRuntimeModulePluginListMap r0 = r0.f238590i
            if (r0 == 0) goto L_0x0408
            java.util.List r0 = r0.mo113465c()
            if (r0 == 0) goto L_0x040a
            int r0 = r0.size()
            if (r0 <= 0) goto L_0x040a
            r4.f236905s = r5
            goto L_0x040a
        L_0x0408:
            r4.f236905s = r14
        L_0x040a:
            long r10 = r9.f245846G
            r4.f236906t = r10
            boolean r0 = r9.mo116873c()
            if (r0 == 0) goto L_0x0416
            r10 = r5
            goto L_0x0417
        L_0x0416:
            r10 = r14
        L_0x0417:
            r4.f236907u = r10
            ai0.q r0 = r1.f238294v1
            if (r0 == 0) goto L_0x0420
            int r11 = r0.f233334e
            goto L_0x0422
        L_0x0420:
            r11 = 9
        L_0x0422:
            long r10 = (long) r11
            r4.f236908v = r10
            com.tencent.mm.plugin.appbrand.config.AppBrandInitConfigWC r0 = r39.mo113210l1()
            boolean r0 = r0.f239380k1
            if (r0 == 0) goto L_0x042f
            r10 = r5
            goto L_0x0430
        L_0x042f:
            r10 = r14
        L_0x0430:
            r4.f236910x = r10
            r7 = 0
            com.tencent.mm.plugin.appbrand.appstorage.ICommLibReader r0 = r1.mo113184O1(r7)
            if (r0 == 0) goto L_0x0447
            java.lang.String r0 = r0.mo113377i()
            java.lang.String r8 = "libVersion"
            r10 = 1
            java.lang.String r0 = r4.mo86045b(r8, r0, r10)
            r4.f236909w = r0
            goto L_0x0455
        L_0x0447:
            r10 = 1
            java.lang.String r0 = "MicroMsg.AppBrandQualitySystem"
            java.lang.String r8 = "launchToInitReady report with NULL libReader, appId[%s]"
            java.lang.Object[] r11 = new java.lang.Object[r10]
            java.lang.String r13 = r1.f238147j
            r11[r7] = r13
            com.tencent.p014mm.sdk.platformtools.Log.m105929w(r0, r8, r11)
        L_0x0455:
            long r7 = r9.f245860u
            r4.f236911y = r7
            long r7 = r9.mo116872b()
            r4.f236912z = r7
            int r0 = com.tencent.p014mm.sdk.platformtools.Log.getLogLevel()
            if (r0 > r10) goto L_0x0476
            java.lang.String r0 = "MicroMsg.AppBrandQualitySystem"
            java.lang.String r7 = "report kv_16009 %s"
            java.lang.Object[] r8 = new java.lang.Object[r10]
            java.lang.String r13 = r4.mo1005p()
            r11 = 0
            r8[r11] = r13
            com.tencent.p014mm.sdk.platformtools.Log.m105919d(r0, r7, r8)
        L_0x0476:
            com.tencent.mm.plugin.appbrand.page.t1 r0 = r39.mo113178J1()
            if (r0 == 0) goto L_0x04a7
            com.tencent.mm.plugin.appbrand.report.b0 r0 = com.tencent.p014mm.plugin.appbrand.report.C84106b0.m103652a(r0)
            int r0 = r0.ordinal()
            if (r0 == 0) goto L_0x04a2
            if (r0 == r10) goto L_0x049d
            if (r0 == r12) goto L_0x0498
            r7 = 3
            if (r0 == r7) goto L_0x0493
            r7 = 2147483647(0x7fffffff, double:1.060997895E-314)
            r4.f236882B = r7
            goto L_0x04a7
        L_0x0493:
            r7 = 5
            r4.f236882B = r7
            goto L_0x04a7
        L_0x0498:
            r7 = 3
            r4.f236882B = r7
            goto L_0x04a7
        L_0x049d:
            r7 = 4
            r4.f236882B = r7
            goto L_0x04a7
        L_0x04a2:
            r7 = 2
            r4.f236882B = r7
            goto L_0x04a9
        L_0x04a7:
            r7 = 2
        L_0x04a9:
            int r0 = r9.f245844E
            int r0 = com.tencent.p014mm.plugin.appbrand.report.C84116i0.m103658a(r0)
            long r7 = (long) r0
            r4.f236883C = r7
            java.lang.String r0 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getProcessName()
            java.lang.String r7 = "processName"
            r8 = 1
            java.lang.String r0 = r4.mo86045b(r7, r0, r8)
            r4.f236884D = r0
            android.util.SparseIntArray r7 = com.tencent.p014mm.plugin.appbrand.C81682d.f239734d
            monitor-enter(r7)
            int r0 = r39.hashCode()     // Catch:{ all -> 0x090a }
            r8 = 0
            int r0 = r7.get(r0, r8)     // Catch:{ all -> 0x090a }
            monitor-exit(r7)     // Catch:{ all -> 0x090a }
            long r10 = (long) r0
            r4.f236885E = r10
            boolean r0 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.isMainProcess()
            if (r0 == 0) goto L_0x04d8
            r0 = 3
            goto L_0x04ee
        L_0x04d8:
            boolean r0 = com.tencent.p014mm.plugin.appbrand.p026ui.C84566n2.m104161j()
            if (r0 == 0) goto L_0x04ed
            int r0 = com.tencent.xweb.XWebSdk.getMultiProcessType()
            r7 = 1
            if (r0 == r7) goto L_0x04eb
            if (r0 == r12) goto L_0x04e9
            r0 = 1
            goto L_0x04ee
        L_0x04e9:
            r0 = 4
            goto L_0x04ee
        L_0x04eb:
            r0 = 2
            goto L_0x04ee
        L_0x04ed:
            r0 = 0
        L_0x04ee:
            long r10 = (long) r0
            r4.f236886F = r10
            java.lang.Class<com.tencent.mm.plugin.appbrand.page.c1> r0 = com.tencent.p014mm.plugin.appbrand.page.C83773c1.class
            com.tencent.mm.plugin.appbrand.jsapi.m r0 = r1.mo113018M(r0)
            com.tencent.mm.plugin.appbrand.page.c1 r0 = (com.tencent.p014mm.plugin.appbrand.page.C83773c1) r0
            boolean r0 = r0.mo116114a()
            if (r0 == 0) goto L_0x0501
            r10 = r5
            goto L_0x0503
        L_0x0501:
            r10 = 2
        L_0x0503:
            r4.f236887G = r10
            r4.mo86054n()
            boolean r0 = com.tencent.p014mm.plugin.appbrand.debugger.DebuggerShell.f239772d
            if (r0 == 0) goto L_0x053c
            java.lang.String r0 = "{ \"appMd5\": \"%s\", \"isDownloadCode\": %d }"
            java.lang.Object[] r7 = new java.lang.Object[r12]
            java.lang.String r10 = ""
            r8 = 0
            r7[r8] = r10
            boolean r8 = r9.f245850K
            if (r8 == 0) goto L_0x051c
            r8 = r5
            goto L_0x051d
        L_0x051c:
            r8 = r14
        L_0x051d:
            java.lang.Long r8 = java.lang.Long.valueOf(r8)
            r9 = 1
            r7[r9] = r8
            java.lang.String r38 = java.lang.String.format(r0, r7)
            java.lang.String r0 = r4.f236891e
            java.lang.String r32 = "Native"
            java.lang.String r33 = "startupDone"
            long r7 = r4.f236897k
            long r9 = r4.f236898l
            r31 = r0
            r34 = r7
            r36 = r9
            com.tencent.p014mm.plugin.appbrand.performance.C83997d.m103518a(r31, r32, r33, r34, r36, r38)
        L_0x053c:
            com.tencent.mm.autogen.mmdata.rpt.WeAppQualityWebviewReadyStruct r0 = new com.tencent.mm.autogen.mmdata.rpt.WeAppQualityWebviewReadyStruct
            r0.<init>()
            r4 = 1
            com.tencent.mm.plugin.appbrand.report.quality.QualitySessionRuntime r7 = com.tencent.p014mm.plugin.appbrand.report.quality.C84185b.m103770c(r2, r4)
            if (r7 != 0) goto L_0x054a
            goto L_0x061d
        L_0x054a:
            long r8 = java.lang.System.currentTimeMillis()
            r7.f245859t = r8
            java.lang.String r8 = r7.f245833e
            java.lang.String r9 = "AppId"
            java.lang.String r8 = r0.mo86045b(r9, r8, r4)
            r0.f237336e = r8
            java.lang.String r8 = r7.f245832d
            java.lang.String r9 = "InstanceId"
            java.lang.String r8 = r0.mo86045b(r9, r8, r4)
            r0.f237335d = r8
            int r8 = r7.f245834f
            if (r8 == r4) goto L_0x0575
            if (r8 == r12) goto L_0x0572
            r4 = 3
            if (r8 == r4) goto L_0x056f
            r4 = 0
            goto L_0x0577
        L_0x056f:
            com.tencent.mm.autogen.mmdata.rpt.WeAppQualityWebviewReadyStruct$a r4 = com.tencent.p014mm.autogen.mmdata.rpt.WeAppQualityWebviewReadyStruct.C80793a.demo
            goto L_0x0577
        L_0x0572:
            com.tencent.mm.autogen.mmdata.rpt.WeAppQualityWebviewReadyStruct$a r4 = com.tencent.p014mm.autogen.mmdata.rpt.WeAppQualityWebviewReadyStruct.C80793a.debug
            goto L_0x0577
        L_0x0575:
            com.tencent.mm.autogen.mmdata.rpt.WeAppQualityWebviewReadyStruct$a r4 = com.tencent.p014mm.autogen.mmdata.rpt.WeAppQualityWebviewReadyStruct.C80793a.release
        L_0x0577:
            r0.f237338g = r4
            int r4 = r7.f245835g
            long r8 = (long) r4
            r0.f237339h = r8
            int r4 = r7.f245837i
            long r8 = (long) r4
            r0.f237337f = r8
            int r4 = r7.f245836h
            long r8 = (long) r4
            r0.f237341j = r8
            com.tencent.mm.plugin.appbrand.report.AppBrandStatObject r4 = r39.mo121253n1()
            if (r4 != 0) goto L_0x0590
            r4 = 0
            goto L_0x0596
        L_0x0590:
            com.tencent.mm.plugin.appbrand.report.AppBrandStatObject r4 = r39.mo121253n1()
            java.lang.String r4 = r4.f245534g
        L_0x0596:
            java.lang.String r8 = "SceneNote"
            r9 = 1
            java.lang.String r4 = r0.mo86045b(r8, r4, r9)
            r0.f237351t = r4
            long r8 = r7.f245857r
            r0.f237342k = r8
            java.lang.String r4 = "StartTimeStampMs"
            r0.mo86048e(r4, r8)
            long r8 = com.tencent.p014mm.sdk.platformtools.Util.nowMilliSecond()
            r0.f237343l = r8
            java.lang.String r4 = "EndTimeStampMs"
            r0.mo86048e(r4, r8)
            long r8 = r0.f237343l
            long r10 = r7.f245857r
            long r8 = r8 - r10
            r0.f237340i = r8
            java.lang.String r4 = "CostTimeMs"
            r0.mo86046c(r4, r8)
            long r8 = r7.mo116871a()
            r0.f237345n = r8
            com.tencent.mm.plugin.appbrand.page.AppBrandPageContainerWC r4 = r39.mo113212m1()     // Catch:{ Exception -> 0x05dc }
            java.lang.String r4 = r4.getCurrentUrl()     // Catch:{ Exception -> 0x05dc }
            java.lang.String r4 = p206nj.C117627q.m165908a(r4)     // Catch:{ Exception -> 0x05dc }
            java.lang.String r8 = "path"
            r9 = 1
            java.lang.String r4 = r0.mo86045b(r8, r4, r9)     // Catch:{ Exception -> 0x05dc }
            r0.f237344m = r4     // Catch:{ Exception -> 0x05dc }
            goto L_0x05dd
        L_0x05dc:
        L_0x05dd:
            r0.f237346o = r14
            android.content.Context r4 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            java.lang.String r4 = com.tencent.p014mm.plugin.appbrand.report.C84116i0.m103659b(r4)
            java.lang.String r8 = "networkType"
            r9 = 1
            java.lang.String r4 = r0.mo86045b(r8, r4, r9)
            r0.f237347p = r4
            long r8 = r7.f245846G
            r0.f237348q = r8
            boolean r4 = r7.mo116873c()
            if (r4 == 0) goto L_0x05fc
            r8 = r5
            goto L_0x05fd
        L_0x05fc:
            r8 = r14
        L_0x05fd:
            r0.f237349r = r8
            long r7 = r7.mo116872b()
            r0.f237350s = r7
            r0.mo86054n()
            boolean r4 = com.tencent.p014mm.plugin.appbrand.debugger.DebuggerShell.f239772d
            if (r4 == 0) goto L_0x061d
            java.lang.String r4 = r0.f237336e
            long r7 = r0.f237342k
            long r9 = r0.f237343l
            java.lang.String r17 = "ResourcePrepareToStartUpDone"
            r16 = r4
            r18 = r7
            r20 = r9
            com.tencent.p014mm.plugin.appbrand.performance.C83997d.m103521d(r16, r17, r18, r20)
        L_0x061d:
            com.tencent.mm.autogen.mmdata.rpt.WeAppQualityFirstRenderStruct r0 = new com.tencent.mm.autogen.mmdata.rpt.WeAppQualityFirstRenderStruct
            r0.<init>()
            r4 = 1
            com.tencent.mm.plugin.appbrand.report.quality.QualitySessionRuntime r7 = com.tencent.p014mm.plugin.appbrand.report.quality.C84185b.m103770c(r2, r4)
            if (r7 != 0) goto L_0x062b
            goto L_0x06e1
        L_0x062b:
            java.lang.String r8 = r7.f245833e
            java.lang.String r9 = "AppId"
            java.lang.String r8 = r0.mo86045b(r9, r8, r4)
            r0.f236819e = r8
            java.lang.String r8 = r7.f245832d
            java.lang.String r9 = "InstanceId"
            java.lang.String r8 = r0.mo86045b(r9, r8, r4)
            r0.f236818d = r8
            int r8 = r7.f245834f
            if (r8 == r4) goto L_0x0650
            if (r8 == r12) goto L_0x064d
            r4 = 3
            if (r8 == r4) goto L_0x064a
            r4 = 0
            goto L_0x0652
        L_0x064a:
            com.tencent.mm.autogen.mmdata.rpt.WeAppQualityFirstRenderStruct$a r4 = com.tencent.p014mm.autogen.mmdata.rpt.WeAppQualityFirstRenderStruct.C80766a.demo
            goto L_0x0652
        L_0x064d:
            com.tencent.mm.autogen.mmdata.rpt.WeAppQualityFirstRenderStruct$a r4 = com.tencent.p014mm.autogen.mmdata.rpt.WeAppQualityFirstRenderStruct.C80766a.debug
            goto L_0x0652
        L_0x0650:
            com.tencent.mm.autogen.mmdata.rpt.WeAppQualityFirstRenderStruct$a r4 = com.tencent.p014mm.autogen.mmdata.rpt.WeAppQualityFirstRenderStruct.C80766a.release
        L_0x0652:
            r0.f236821g = r4
            int r4 = r7.f245835g
            long r8 = (long) r4
            r0.f236822h = r8
            int r4 = r7.f245837i
            long r8 = (long) r4
            r0.f236820f = r8
            int r4 = r7.f245836h
            long r8 = (long) r4
            r0.f236824j = r8
            long r8 = r7.f245858s
            r0.f236825k = r8
            java.lang.String r4 = "StartTimeStampMs"
            r0.mo86048e(r4, r8)
            long r8 = com.tencent.p014mm.sdk.platformtools.Util.nowMilliSecond()
            r0.f236826l = r8
            java.lang.String r4 = "EndTimeStampMs"
            r0.mo86048e(r4, r8)
            long r8 = r0.f236826l
            long r10 = r7.f245858s
            long r8 = r8 - r10
            r0.f236823i = r8
            java.lang.String r4 = "CostTimeMs"
            r0.mo86046c(r4, r8)
            long r8 = r7.mo116871a()
            r0.f236828n = r8
            com.tencent.mm.plugin.appbrand.page.AppBrandPageContainerWC r4 = r39.mo113212m1()     // Catch:{ Exception -> 0x06a0 }
            java.lang.String r4 = r4.getCurrentUrl()     // Catch:{ Exception -> 0x06a0 }
            java.lang.String r4 = p206nj.C117627q.m165908a(r4)     // Catch:{ Exception -> 0x06a0 }
            java.lang.String r8 = "path"
            r9 = 1
            java.lang.String r4 = r0.mo86045b(r8, r4, r9)     // Catch:{ Exception -> 0x06a0 }
            r0.f236827m = r4     // Catch:{ Exception -> 0x06a0 }
            goto L_0x06a1
        L_0x06a0:
        L_0x06a1:
            r0.f236829o = r14
            android.content.Context r4 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            java.lang.String r4 = com.tencent.p014mm.plugin.appbrand.report.C84116i0.m103659b(r4)
            java.lang.String r8 = "networkType"
            r9 = 1
            java.lang.String r4 = r0.mo86045b(r8, r4, r9)
            r0.f236830p = r4
            com.tencent.mm.plugin.appbrand.config.AppBrandSysConfigWC r4 = r39.mo113213o1()
            com.tencent.mm.plugin.appbrand.appcache.WxaPkgWrappingInfo r4 = r4.f261072r
            com.tencent.mm.plugin.appbrand.appcache.WxaRuntimeModulePluginListMap r4 = r4.f238590i
            if (r4 == 0) goto L_0x06cf
            java.lang.String r8 = "__APP__"
            java.util.List r4 = r4.mo113464b(r8)
            if (r4 == 0) goto L_0x06d1
            int r4 = r4.size()
            if (r4 <= 0) goto L_0x06d1
            r0.f236831q = r5
            goto L_0x06d1
        L_0x06cf:
            r0.f236831q = r14
        L_0x06d1:
            long r8 = r7.f245846G
            r0.f236832r = r8
            boolean r4 = r7.mo116873c()
            if (r4 == 0) goto L_0x06dc
            r14 = r5
        L_0x06dc:
            r0.f236833s = r14
            r0.mo86054n()
        L_0x06e1:
            long r4 = com.tencent.p014mm.sdk.platformtools.Util.nowMilliSecond()
            boolean r0 = com.tencent.p014mm.plugin.appbrand.debugger.DebuggerShell.f239772d
            r6 = r22
            if (r0 == 0) goto L_0x06f8
            long r7 = r6.f245858s
            java.lang.String r17 = "FirstRender"
            r16 = r2
            r18 = r7
            r20 = r4
            com.tencent.p014mm.plugin.appbrand.performance.C83997d.m103521d(r16, r17, r18, r20)
        L_0x06f8:
            int r0 = r6.f245835g
            r2 = 1004(0x3ec, float:1.407E-42)
            if (r0 != r2) goto L_0x0706
            r0 = 205(0xcd, float:2.87E-43)
            long r6 = r6.f245858s
            long r4 = r4 - r6
            com.tencent.p014mm.plugin.appbrand.performance.AppBrandPerformanceManager.m103495d(r1, r0, r4)
        L_0x0706:
            boolean r0 = com.tencent.p014mm.plugin.appbrand.debugger.DebuggerShell.f239772d
            if (r0 == 0) goto L_0x0746
            com.tencent.mm.sdk.platformtools.MTimerHandler r0 = r1.f238289q1
            if (r0 != 0) goto L_0x0746
            com.tencent.mm.sdk.platformtools.MTimerHandler r0 = new com.tencent.mm.sdk.platformtools.MTimerHandler
            com.tencent.mm.plugin.appbrand.performance.c$a r2 = com.tencent.p014mm.plugin.appbrand.performance.C83994c.C83995a.INST
            android.os.HandlerThread r4 = r2.f245229d
            if (r4 != 0) goto L_0x0730
            monitor-enter(r2)
            android.os.HandlerThread r4 = r2.f245229d     // Catch:{ all -> 0x072d }
            if (r4 != 0) goto L_0x072b
            java.lang.String r4 = "MicroMsg.AppBrandPerformanceManager.DumpTraceThread"
            int r5 = eu3.C58834h.f168432b     // Catch:{ all -> 0x072d }
            r5 = 5
            android.os.HandlerThread r4 = eu3.C97749e.m126093a(r4, r5)     // Catch:{ all -> 0x072d }
            r2.f245229d = r4     // Catch:{ all -> 0x072d }
            android.os.HandlerThread r4 = r2.f245229d     // Catch:{ all -> 0x072d }
            r4.start()     // Catch:{ all -> 0x072d }
        L_0x072b:
            monitor-exit(r2)     // Catch:{ all -> 0x072d }
            goto L_0x0730
        L_0x072d:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x072d }
            throw r0
        L_0x0730:
            android.os.HandlerThread r2 = r2.f245229d
            android.os.Looper r2 = r2.getLooper()
            com.tencent.mm.plugin.appbrand.c2 r4 = new com.tencent.mm.plugin.appbrand.c2
            r4.<init>(r1)
            r5 = 1
            r0.<init>((android.os.Looper) r2, (com.tencent.p014mm.sdk.platformtools.MTimerHandler.CallBack) r4, (boolean) r5)
            r1.f238289q1 = r0
            r4 = 1000(0x3e8, double:4.94E-321)
            r0.startTimer(r4)
        L_0x0746:
            boolean r0 = r39.mo121254q1()
            if (r0 == 0) goto L_0x076a
            com.tencent.mm.plugin.appbrand.game.preload.e r0 = com.tencent.p014mm.plugin.appbrand.game.preload.C81889e.m100570d()
            r0.getClass()
            long r4 = com.tencent.p014mm.sdk.platformtools.Util.nowMilliSecond()
            com.tencent.mm.plugin.appbrand.AppBrandRuntimeWC r0 = r0.f240194a
            com.tencent.mm.plugin.appbrand.config.AppBrandInitConfigWC r0 = r0.mo113210l1()
            long r6 = r0.f234800D
            long r4 = r4 - r6
            com.tencent.mm.plugin.appbrand.game.preload.f r0 = com.tencent.p014mm.plugin.appbrand.game.preload.C81891f.m100578a()
            int r2 = (int) r4
            r4 = 2001(0x7d1, float:2.804E-42)
            r0.mo114291b(r4, r2)
        L_0x076a:
            java.lang.String r0 = r1.f238147j
            com.tencent.mm.plugin.appbrand.config.AppBrandInitConfig r2 = r1.f238149o
            int r2 = r2.f239365g
            boolean r0 = es0.C86666i.m107491a(r0, r2)
            if (r0 == 0) goto L_0x077f
            com.tencent.mm.plugin.report.service.n r0 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            r2 = 1089(0x441, float:1.526E-42)
            r4 = 50
            r0.mo175911u(r2, r4)
        L_0x077f:
            com.tencent.mm.plugin.appbrand.config.AppBrandInitConfigWC r0 = r39.mo113210l1()
            com.tencent.luggage.sdk.launching.h r0 = r0.f234829Y0
            boolean r0 = r0.mo111351b()
            if (r0 != 0) goto L_0x079e
            boolean r0 = r39.mo121254q1()
            if (r0 == 0) goto L_0x0794
            com.tencent.luggage.sdk.processes.LuggageServiceType r0 = com.tencent.luggage.sdk.processes.LuggageServiceType.WAGAME
            goto L_0x0796
        L_0x0794:
            com.tencent.luggage.sdk.processes.LuggageServiceType r0 = com.tencent.luggage.sdk.processes.LuggageServiceType.WASERVICE
        L_0x0796:
            com.tencent.mm.plugin.appbrand.task.ipc.AppBrandRuntimePreloadNextInvoke r2 = new com.tencent.mm.plugin.appbrand.task.ipc.AppBrandRuntimePreloadNextInvoke
            r2.<init>(r0)
            r2.mo114395c()
        L_0x079e:
            com.tencent.mm.plugin.appbrand.appstorage.h0 r0 = r1.f238163z
            com.tencent.mm.plugin.appbrand.jsapi.file.d1 r0 = (com.tencent.p014mm.plugin.appbrand.jsapi.file.C82419d1) r0
            if (r0 == 0) goto L_0x07b3
            com.tencent.mm.plugin.appbrand.appstorage.h0 r0 = r1.f238163z
            com.tencent.mm.plugin.appbrand.jsapi.file.d1 r0 = (com.tencent.p014mm.plugin.appbrand.jsapi.file.C82419d1) r0
            java.lang.Class<com.tencent.mm.plugin.appbrand.appstorage.f0> r2 = com.tencent.p014mm.plugin.appbrand.appstorage.C81413f0.class
            com.tencent.mm.plugin.appbrand.appstorage.h0 r0 = r0.mo113748b(r2)
            com.tencent.mm.plugin.appbrand.appstorage.f0 r0 = (com.tencent.p014mm.plugin.appbrand.appstorage.C81413f0) r0
            r0.mo113733c()
        L_0x07b3:
            java.lang.String r0 = r1.f238147j
            r2 = 1
            com.tencent.mm.plugin.appbrand.report.quality.QualitySessionRuntime r0 = com.tencent.p014mm.plugin.appbrand.report.quality.C84185b.m103770c(r0, r2)
            if (r0 == 0) goto L_0x0848
            boolean r4 = r39.mo121254q1()
            if (r4 != 0) goto L_0x0848
            com.tencent.mm.plugin.appbrand.report.quality.e r4 = com.tencent.p014mm.plugin.appbrand.report.quality.C84185b.f245912a
            com.tencent.mm.autogen.mmdata.rpt.WeAppQualityWebviewUsageStruct r5 = new com.tencent.mm.autogen.mmdata.rpt.WeAppQualityWebviewUsageStruct
            r5.<init>()
            java.lang.String r6 = r1.f238147j
            com.tencent.mm.plugin.appbrand.report.quality.QualitySessionRuntime r6 = com.tencent.p014mm.plugin.appbrand.report.quality.C84185b.m103770c(r6, r2)
            if (r6 == 0) goto L_0x0828
            java.lang.String r7 = r6.f245832d
            java.lang.String r8 = "InstanceId"
            java.lang.String r7 = r5.mo86045b(r8, r7, r2)
            r5.f237357d = r7
            java.lang.String r7 = r6.f245833e
            java.lang.String r8 = "AppId"
            java.lang.String r7 = r5.mo86045b(r8, r7, r2)
            r5.f237358e = r7
            int r7 = r6.f245837i
            long r7 = (long) r7
            r5.f237359f = r7
            int r7 = r6.f245834f
            if (r7 == r2) goto L_0x07fb
            if (r7 == r12) goto L_0x07f8
            r2 = 3
            if (r7 == r2) goto L_0x07f5
            r2 = 0
            goto L_0x07fd
        L_0x07f5:
            com.tencent.mm.autogen.mmdata.rpt.WeAppQualityWebviewUsageStruct$a r2 = com.tencent.p014mm.autogen.mmdata.rpt.WeAppQualityWebviewUsageStruct.C80794a.demo
            goto L_0x07fd
        L_0x07f8:
            com.tencent.mm.autogen.mmdata.rpt.WeAppQualityWebviewUsageStruct$a r2 = com.tencent.p014mm.autogen.mmdata.rpt.WeAppQualityWebviewUsageStruct.C80794a.debug
            goto L_0x07fd
        L_0x07fb:
            com.tencent.mm.autogen.mmdata.rpt.WeAppQualityWebviewUsageStruct$a r2 = com.tencent.p014mm.autogen.mmdata.rpt.WeAppQualityWebviewUsageStruct.C80794a.release
        L_0x07fd:
            r5.f237360g = r2
            int r2 = r6.f245835g
            long r7 = (long) r2
            r5.f237361h = r7
            int r2 = r6.f245836h
            long r7 = (long) r2
            r5.f237362i = r7
            com.tencent.mm.plugin.appbrand.page.AppBrandPageContainerWC r2 = r39.mo113212m1()
            com.tencent.mm.plugin.appbrand.page.i0 r2 = r2.getCurrentPage()
            if (r2 == 0) goto L_0x0818
            com.tencent.mm.plugin.appbrand.page.d1 r2 = r2.getCurrentPageView()
            goto L_0x0819
        L_0x0818:
            r2 = 0
        L_0x0819:
            boolean r7 = r2 instanceof com.tencent.p014mm.plugin.appbrand.page.C83928t1
            if (r7 == 0) goto L_0x0820
            com.tencent.mm.plugin.appbrand.page.t1 r2 = (com.tencent.p014mm.plugin.appbrand.page.C83928t1) r2
            goto L_0x0821
        L_0x0820:
            r2 = 0
        L_0x0821:
            long r7 = r4.mo116901e(r2)
            r5.f237364k = r7
            goto L_0x0829
        L_0x0828:
            r6 = 0
        L_0x0829:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r7 = "Null session with "
            r2.append(r7)
            java.lang.String r7 = r1.f238147j
            r2.append(r7)
            java.lang.String r2 = r2.toString()
            r4.mo116897a(r6, r2)
            long r6 = r0.mo116871a()
            r5.f237363j = r6
            r5.mo86054n()
        L_0x0848:
            if (r0 == 0) goto L_0x08e9
            com.tencent.mm.plugin.appbrand.report.quality.e r2 = com.tencent.p014mm.plugin.appbrand.report.quality.C84185b.f245912a
            com.tencent.mm.autogen.mmdata.rpt.WeAppQualityAppServiceUSageStruct r4 = new com.tencent.mm.autogen.mmdata.rpt.WeAppQualityAppServiceUSageStruct
            r4.<init>()
            java.lang.String r5 = r1.f238147j
            r6 = 1
            com.tencent.mm.plugin.appbrand.report.quality.QualitySessionRuntime r5 = com.tencent.p014mm.plugin.appbrand.report.quality.C84185b.m103770c(r5, r6)
            if (r5 == 0) goto L_0x08c9
            java.lang.String r7 = r5.f245832d
            java.lang.String r8 = "InstanceId"
            java.lang.String r7 = r4.mo86045b(r8, r7, r6)
            r4.f236748d = r7
            java.lang.String r7 = r5.f245833e
            java.lang.String r8 = "AppId"
            java.lang.String r7 = r4.mo86045b(r8, r7, r6)
            r4.f236749e = r7
            int r7 = r5.f245837i
            long r7 = (long) r7
            r4.f236750f = r7
            int r7 = r5.f245834f
            if (r7 == r6) goto L_0x0884
            if (r7 == r12) goto L_0x0881
            r6 = 3
            if (r7 == r6) goto L_0x087e
            r6 = 0
            goto L_0x0886
        L_0x087e:
            com.tencent.mm.autogen.mmdata.rpt.WeAppQualityAppServiceUSageStruct$a r6 = com.tencent.p014mm.autogen.mmdata.rpt.WeAppQualityAppServiceUSageStruct.C80763a.demo
            goto L_0x0886
        L_0x0881:
            com.tencent.mm.autogen.mmdata.rpt.WeAppQualityAppServiceUSageStruct$a r6 = com.tencent.p014mm.autogen.mmdata.rpt.WeAppQualityAppServiceUSageStruct.C80763a.debug
            goto L_0x0886
        L_0x0884:
            com.tencent.mm.autogen.mmdata.rpt.WeAppQualityAppServiceUSageStruct$a r6 = com.tencent.p014mm.autogen.mmdata.rpt.WeAppQualityAppServiceUSageStruct.C80763a.release
        L_0x0886:
            r4.f236751g = r6
            int r6 = r5.f245835g
            long r6 = (long) r6
            r4.f236752h = r6
            int r6 = r5.f245836h
            long r6 = (long) r6
            r4.f236753i = r6
            com.tencent.mm.plugin.appbrand.i2 r6 = r1.f238150p
            kr0.e r6 = (kr0.C88267e) r6
            if (r6 == 0) goto L_0x089d
            com.tencent.mm.plugin.appbrand.jsruntime.i r7 = r6.getJsRuntime()
            goto L_0x089e
        L_0x089d:
            r7 = 0
        L_0x089e:
            com.tencent.mm.plugin.appbrand.report.m r6 = com.tencent.p014mm.plugin.appbrand.report.C84136m.m103674a(r7)
            int r6 = r6.ordinal()
            if (r6 == 0) goto L_0x08c3
            r7 = 1
            if (r6 == r7) goto L_0x08c1
            r7 = 3
            if (r6 == r12) goto L_0x08bf
            if (r6 == r7) goto L_0x08bc
            r7 = 4
            if (r6 == r7) goto L_0x08ba
            r7 = 5
            if (r6 == r7) goto L_0x08b8
            r10 = -1
            goto L_0x08c4
        L_0x08b8:
            r10 = 5
            goto L_0x08c4
        L_0x08ba:
            r10 = 6
            goto L_0x08c4
        L_0x08bc:
            r7 = 4
            r10 = 4
            goto L_0x08c4
        L_0x08bf:
            r10 = 3
            goto L_0x08c4
        L_0x08c1:
            r10 = 2
            goto L_0x08c4
        L_0x08c3:
            r10 = 1
        L_0x08c4:
            long r6 = (long) r10
            r4.f236755k = r6
            r7 = r5
            goto L_0x08ca
        L_0x08c9:
            r7 = 0
        L_0x08ca:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r5 = "Null session with "
            r3.append(r5)
            java.lang.String r5 = r1.f238147j
            r3.append(r5)
            java.lang.String r3 = r3.toString()
            r2.mo116897a(r7, r3)
            long r2 = r0.mo116871a()
            r4.f236754j = r2
            r4.mo86054n()
        L_0x08e9:
            java.lang.String r0 = r1.f238147j
            uo0.a r2 = com.tencent.p014mm.plugin.appbrand.step.KSProcessWeAppLaunch.stepInitRuntimeGroup
            com.tencent.p014mm.plugin.appbrand.keylogger.C83226n.m102128e(r0, r2)
            java.lang.String r0 = r1.f238147j
            uo0.a r2 = com.tencent.p014mm.plugin.appbrand.step.KSProcessWeAppLaunch.stepInitRuntimeGroup_Game
            com.tencent.p014mm.plugin.appbrand.keylogger.C83226n.m102128e(r0, r2)
            java.lang.Class<com.tencent.mm.plugin.appbrand.step.KSProcessWeAppLaunch> r0 = com.tencent.p014mm.plugin.appbrand.step.KSProcessWeAppLaunch.class
            java.lang.String r2 = r1.f238147j
            com.tencent.p014mm.plugin.appbrand.keylogger.C83226n.m102132i(r0, r2)
            java.lang.String r0 = r1.f238147j
            r2 = 1
            com.tencent.p014mm.plugin.appbrand.report.quality.C84218r.m103813c(r0, r2)
            com.tencent.mm.plugin.appbrand.widget.halfscreen.HalfScreenManger r0 = r1.f238298z1
            r0.mo117787j()
            return
        L_0x090a:
            r0 = move-exception
            monitor-exit(r7)     // Catch:{ all -> 0x090a }
            throw r0
        L_0x090d:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r2 = "StartupBundle not registered."
            r0.<init>(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.appbrand.AppBrandRuntimeWC.mo113001A0():void");
    }

    /* renamed from: B1 */
    public void mo113171B1(Runnable runnable) {
        AppBrandRuntimeWC$$l appBrandRuntimeWC$$l = new AppBrandRuntimeWC$$l(this, runnable);
        this.f238278N1.add(appBrandRuntimeWC$$l);
        mo113020N0(appBrandRuntimeWC$$l);
    }

    /* renamed from: C1 */
    public final void mo113172C1() {
        Log.m105925i("MicroMsg.AppBrandRuntimeWC", "callSuperClose appId:%s", this.f238147j);
        mo113066m((Object) null, (Runnable) null);
    }

    /* renamed from: D0 */
    public void mo113005D0() {
        super.mo113005D0();
        String appBrandRuntimeWC = toString();
        ConcurrentLinkedQueue<AppBrandRuntime$$z> concurrentLinkedQueue = this.f238131W0;
        if (concurrentLinkedQueue == null || concurrentLinkedQueue.size() <= 0) {
            Log.m105925i("MicroMsg.AppBrandRuntime", "%s onResourcePrepareTimeout, no pending processes", appBrandRuntimeWC);
        } else {
            for (AppBrandRuntime$$z obj : concurrentLinkedQueue) {
                Log.m105925i("MicroMsg.AppBrandRuntime", "%s onResourcePrepareTimeout, process[%s]", appBrandRuntimeWC, obj.toString());
            }
        }
        C83606m1.m102638b(11, mo113210l1());
        C83226n.m102125b(this.f238147j, KSProcessWeAppLaunch.stepPrepareResourceTimeout);
    }

    /* renamed from: D1 */
    public Bitmap mo113173D1() {
        Bitmap bitmap;
        C89797e eVar = this.f238159x;
        if (eVar != null) {
            if (eVar.f258187b != null) {
                eVar.f258190e = eVar.mo124089b().getVisibility();
            }
            C89797e eVar2 = this.f238159x;
            if (eVar2.f258187b != null) {
                eVar2.mo124089b().setVisibility(4);
            }
        }
        if (mo113054f0().shouldInLargeScreenCompatMode()) {
            C84927e eVar3 = this.f238153r;
            int width = mo113212m1().getWidth();
            int height = mo113212m1().getHeight();
            if (eVar3.getWidth() <= 0 || eVar3.getHeight() <= 0) {
                bitmap = null;
            } else {
                bitmap = Bitmap.createBitmap(width, height, Bitmap.Config.ARGB_8888);
                Canvas canvas = new Canvas(bitmap);
                int childCount = eVar3.getChildCount();
                for (int i = 0; i < childCount; i++) {
                    C83907r4.m103301a(eVar3.getChildAt(i), eVar3.getChildAt(i), canvas);
                }
            }
        } else {
            bitmap = C83907r4.m103302b(this.f238153r);
        }
        C89797e eVar4 = this.f238159x;
        if (!(eVar4 == null || eVar4.f258187b == null)) {
            eVar4.mo124089b().setVisibility(eVar4.f258190e);
        }
        return bitmap;
    }

    /* renamed from: E */
    public final void mo113006E() {
        boolean z;
        Log.m105925i("MicroMsg.AppBrandRuntimeWC", "finish appId[%s] type[%d] hash[%d] stacktrace=%s", this.f238147j, Integer.valueOf(this.f238149o.f239365g), Integer.valueOf(hashCode()), android.util.Log.getStackTraceString(new Throwable()));
        OpenBusinessViewUtil.m101148b(this);
        ConcurrentHashMap<String, AppBrandRuntimeWC> concurrentHashMap = C84803v.f247240a;
        Log.m105924i("MicroMsg.AppBrandProcessSharedPersistentRuntimeStore", "remove: " + this);
        if (Build.VERSION.SDK_INT >= 24) {
            z = C84803v.f247240a.remove(this.f238147j, this);
        } else {
            ConcurrentHashMap<String, AppBrandRuntimeWC> concurrentHashMap2 = C84803v.f247240a;
            if (concurrentHashMap2.containsValue(this)) {
                concurrentHashMap2.remove(this.f238147j);
                z = true;
            } else {
                z = false;
            }
        }
        if (z) {
            ConcurrentHashMap<String, AppBrandRuntimeWC> concurrentHashMap3 = C84803v.f247240a;
            new LuggagePopRuntimeTask(C86499a.m107251a(this)).mo114396f();
        }
        if (z || this.f238142e == null) {
            mo113024P0(new AppBrandRuntimeWC$$v(this));
            return;
        }
        super.mo113006E();
        C81855i iVar = this.f238292t1;
        if (iVar != null) {
            iVar.mo114251b(this);
            this.f238292t1 = null;
        }
        if (this.f238293u1 != null) {
            Log.m105925i("MicroMsg.AppBrandMultiTaskLogic", "destroy, runtime:%s", this.f238147j);
        }
    }

    /* renamed from: E0 */
    public void mo113007E0() {
        AppBrandGlobalNativeWidgetContainerView appBrandGlobalNativeWidgetContainerView;
        super.mo113007E0();
        C84072q1.m103586a(this.f238147j).f245470n = System.currentTimeMillis();
        C81855i iVar = this.f238292t1;
        boolean z = true;
        if (iVar != null) {
            Log.m105925i("MicroMsg.AppBrandFloatBallLogic", "resume, runtime:%s", this.f238147j);
            C81849e eVar = iVar.f240135b;
            if (eVar != null) {
                eVar.mo64003o();
            }
            C81858k kVar = iVar.f240136c;
            if (kVar != null) {
                kVar.mo64003o();
            }
            C81862l lVar = iVar.f240137d;
            if (lVar != null) {
                lVar.mo64003o();
            }
            C81840a aVar = iVar.f240139f;
            if (aVar != null) {
                aVar.mo64003o();
            }
            C81869m mVar = iVar.f240138e;
            if (mVar != null) {
                mVar.mo64003o();
            }
            C81845c e = C82229d0.m100955e(iVar.f240134a);
            if (e != null) {
                e.mo64003o();
            }
        }
        C89787d dVar = this.f238293u1;
        if (dVar != null) {
            Log.m105925i("MicroMsg.AppBrandMultiTaskLogic", "resume, runtime:%s", this.f238147j);
            C89784b bVar = dVar.f258168a;
            if (bVar != null) {
                bVar.mo74188E();
                if (mo113210l1().f239394y1 != null) {
                    dVar.f258168a.mo160099Y(mo113210l1().f239394y1.f238428d);
                    Log.m105924i("MicroMsg.AppBrandMultiTaskLogic", "setMultiTaskCommonInfo not null");
                } else {
                    dVar.f258168a.mo160099Y((C51173ry) null);
                    Log.m105925i("MicroMsg.AppBrandMultiTaskLogic", "setMultiTaskCommonInfo null enter scene:%d", Integer.valueOf(mo113208k1()));
                    if (mo113208k1() == 1089 || mo113208k1() == 1104) {
                        dVar.f258168a.f326432n = true;
                    } else {
                        dVar.f258168a.f326432n = false;
                    }
                }
            }
        }
        C82816p.m101561a(this.f238147j, mo113030T(), mo121253n1());
        C81682d.m100226f(this);
        C91452a.m114755a(this);
        ICommLibReader O1 = mo113184O1(false);
        new AppBrandUpdateTask(C86499a.m107251a(this), O1 != null ? O1.mo113371a() : -1).mo114395c();
        if (this.f238130W) {
            mo113212m1().getReporter().mo115887d();
        }
        C84134l0.C84135a.f245612a.invoke().mo116791b(this.f238147j, mo113208k1());
        C29678o1 a = C29678o1.m38854a(this, new C84261t1(this));
        keep(a);
        ((C119157j) C119157j.f356862d).mo183876g(a, "getCopyPathMenuExpireTime");
        C1537g.m1524a((C32224a<C13598b0>) null, (C9487b<? super C9486a>) null);
        if (mo113178J1() != null) {
            mo113181L1().mo109823a(mo113178J1().mo116162Q0());
        } else {
            Log.m105929w("MicroMsg.AppBrandRuntimeWC", "onResume, try upsertHandOff but get NULL PageView, appId:%s", this.f238147j);
        }
        HalfScreenManger halfScreenManger = this.f238298z1;
        halfScreenManger.getClass();
        Log.m105924i("MicroMsg.HalfScreenManger", "[onRuntimeResume]");
        if (!C79584a.f233382a.mo109700c(halfScreenManger.f247568a) && (appBrandGlobalNativeWidgetContainerView = halfScreenManger.f247568a.f238123S0) != null) {
            appBrandGlobalNativeWidgetContainerView.setCapsuleBarBackgroundRenderer((AppBrandGlobalNativeWidgetContainerView.C84915a) null);
        }
        halfScreenManger.mo117796s();
        C85036x2 x2Var = this.f238266B1;
        boolean z2 = x2Var.f247807a.f238130W;
        Log.m105924i("MicroMsg.EmbedHalfScreenWxaManager", "[onRuntimeResume] check willRelaunch [" + z2 + ']');
        if (z2) {
            x2Var.f247808b = "";
            x2Var.f247809c = 0;
            x2Var.f247810d.set(false);
        }
        if (x2Var.f247808b.length() <= 0) {
            z = false;
        }
        if (z) {
            C83928t1 J1 = x2Var.f247807a.mo113178J1();
            if ((J1 != null ? J1.hashCode() : 0) == x2Var.f247809c && x2Var.f247810d.getAndSet(false)) {
                C81820e3 e3Var = x2Var.f247807a.f238142e;
                C87412m.m108592e(e3Var, "null cannot be cast to non-null type com.tencent.mm.plugin.appbrand.AppBrandRuntimeContainerWC");
                C86812g gVar = (C86812g) ((AppBrandRuntimeContainerWC) e3Var).mo113118S(x2Var.f247808b);
                if (gVar != null) {
                    AppBrandRuntimeWC appBrandRuntimeWC = (AppBrandRuntimeWC) gVar;
                    HalfScreenConfig halfScreenConfig = appBrandRuntimeWC.mo113210l1().f234815R0;
                    C87412m.m108593f(halfScreenConfig, "initConfig.halfScreenConfig");
                    if (halfScreenConfig.mo76931c() && halfScreenConfig.f157932C == HalfScreenConfig.C55455e.EMBED) {
                        Log.m105924i("MicroMsg.EmbedHalfScreenWxaManager", "re-show embedded wxa");
                        x2Var.f247807a.mo121255t1(appBrandRuntimeWC.mo113210l1(), appBrandRuntimeWC.mo113210l1().f234834c1);
                    }
                }
                x2Var.f247808b = "";
                x2Var.f247809c = 0;
                x2Var.f247810d.set(false);
            }
        }
    }

    /* renamed from: E1 */
    public final void mo113174E1() {
        if ((mo113210l1().f234815R0.mo76931c() || mo113210l1().f234817S0) && mo113026R() != null) {
            this.f238296x1 = new C87795a(this, mo113026R(), super.mo113054f0());
            if (((C88267e) this.f238150p) != null) {
                ((C88267e) this.f238150p).mo114328C0(mo113054f0());
            }
            C83928t1 J1 = mo113178J1();
            if (J1 != null) {
                J1.mo116203w1(mo113054f0());
            }
        }
    }

    /* renamed from: F0 */
    public void mo113009F0() {
        MMToClientEvent.m100656t((C88267e) this.f238150p);
        if (!TextUtils.isEmpty("Common_IPC_appid")) {
            MMToClientEvent mMToClientEvent = new MMToClientEvent();
            MMToClientEvent.f240339q.put("Common_IPC_appid", mMToClientEvent);
            mMToClientEvent.f240341f = 1;
            mMToClientEvent.f240342g = "Common_IPC_appid";
            mMToClientEvent.mo114395c();
        }
        mo113195Z1();
    }

    /* renamed from: G0 */
    public void mo113011G0() {
        C84191e eVar = C84185b.f245912a;
        QualitySessionRuntime c = C84185b.m103770c(this.f238147j, true);
        if (c == null) {
            Log.m105921e("MicroMsg.AppBrandQualitySystem", "onAppBrandSplashViewRemoved appId[%s] NULL session", this.f238147j);
            return;
        }
        WeAppQualityFinishLoadingStruct weAppQualityFinishLoadingStruct = new WeAppQualityFinishLoadingStruct();
        weAppQualityFinishLoadingStruct.f236799d = weAppQualityFinishLoadingStruct.mo86045b("InstanceId", c.f245832d, true);
        weAppQualityFinishLoadingStruct.f236800e = weAppQualityFinishLoadingStruct.mo86045b("AppId", c.f245833e, true);
        weAppQualityFinishLoadingStruct.f236801f = (long) c.f245837i;
        int i = c.f245834f;
        weAppQualityFinishLoadingStruct.f236802g = i != 1 ? i != 2 ? i != 3 ? null : WeAppQualityFinishLoadingStruct.C80765a.demo : WeAppQualityFinishLoadingStruct.C80765a.debug : WeAppQualityFinishLoadingStruct.C80765a.release;
        weAppQualityFinishLoadingStruct.f236803h = (long) c.f245835g;
        long j = mo113210l1().f234800D;
        weAppQualityFinishLoadingStruct.f236805j = j;
        weAppQualityFinishLoadingStruct.mo86048e("StartTimeStampMs", j);
        long nowMilliSecond = Util.nowMilliSecond();
        weAppQualityFinishLoadingStruct.f236806k = nowMilliSecond;
        weAppQualityFinishLoadingStruct.mo86048e("EndTimeStampMs", nowMilliSecond);
        long j2 = weAppQualityFinishLoadingStruct.f236806k - weAppQualityFinishLoadingStruct.f236805j;
        weAppQualityFinishLoadingStruct.f236804i = j2;
        weAppQualityFinishLoadingStruct.mo86046c("CostTimeMs", j2);
        weAppQualityFinishLoadingStruct.f236807l = weAppQualityFinishLoadingStruct.mo86045b("path", C117627q.m165908a(Util.nullAsNil(mo113030T())), true);
        long j3 = 1;
        weAppQualityFinishLoadingStruct.f236808m = c.f245850K ? 1 : 0;
        if (c.f245861v == null || !c.f245861v.mo115530a()) {
            j3 = 0;
        }
        weAppQualityFinishLoadingStruct.f236809n = j3;
        weAppQualityFinishLoadingStruct.f236810o = c.mo116871a();
        weAppQualityFinishLoadingStruct.f236811p = c.f245846G;
        long nowMilliSecond2 = Util.nowMilliSecond();
        long j4 = c.f245860u;
        if (j4 <= 0) {
            weAppQualityFinishLoadingStruct.f236812q = 0;
        } else if (nowMilliSecond2 > j4) {
            weAppQualityFinishLoadingStruct.f236812q = nowMilliSecond2;
        } else {
            weAppQualityFinishLoadingStruct.f236812q = 0;
        }
        weAppQualityFinishLoadingStruct.mo86054n();
    }

    /* renamed from: G1 */
    public final void mo113175G1() {
        this.f238136Z = false;
        C81820e3 e3Var = this.f238142e;
        if (e3Var != null) {
            try {
                e3Var.mo113137q(this);
            } catch (Throwable th) {
                if (e3Var instanceof AppBrandRuntimeContainerWC) {
                    ((AppBrandRuntimeContainerWC) e3Var).mo113152n0();
                }
                throw th;
            }
        }
        mo113006E();
        if (e3Var instanceof AppBrandRuntimeContainerWC) {
            ((AppBrandRuntimeContainerWC) e3Var).mo113152n0();
        }
    }

    /* renamed from: H1 */
    public final void mo113176H1(Runnable runnable) {
        if (runnable != null) {
            this.f238113K.mo122978a(new AppBrandRuntimeWC$$u(this, runnable));
        }
        mo113006E();
    }

    /* renamed from: I1 */
    public String mo113177I1() {
        return mo113210l1() == null ? "NULL" : mo113210l1().f239363e;
    }

    /* renamed from: J0 */
    public final void mo113015J0(AppBrandInitConfig appBrandInitConfig, String str) {
        if (appBrandInitConfig == null) {
            mo113210l1().mo111299j();
            mo113210l1().f234800D = Util.nowMilliSecond();
            mo113210l1().f234801E = TimeUnit.MILLISECONDS.toNanos(System.currentTimeMillis()) + (System.nanoTime() % TimeUtil.SECOND_TO_US);
            mo113210l1().f234833b1 = new AppBrandRuntimeReloadReportBundle(mo113210l1().f239379j1.f245832d, str);
            mo113210l1().f239379j1 = new QualitySession(C84788u.m104467a(mo113210l1().f234818T), mo113210l1(), mo121253n1());
            mo113210l1().mo111298i(mo113210l1().f239379j1.f245832d);
        }
        this.f238111I.mo122506c(ICommLibReader.class);
        super.mo113015J0(appBrandInitConfig, str);
    }

    /* renamed from: J1 */
    public C83928t1 mo113178J1() {
        if (mo113212m1() == null || mo113212m1().getCurrentPage() == null) {
            return null;
        }
        return (C83928t1) mo113212m1().getCurrentPage().getCurrentPageView();
    }

    /* renamed from: K */
    public void mo113179K(int i) {
        C84560k4 k4Var = this.f238154s;
        if (k4Var instanceof C83291b1) {
            ((C83291b1) k4Var).mo113179K(i);
        }
    }

    /* renamed from: K1 */
    public final C83818i mo113028S() {
        if (this.f238267C1 == null) {
            ConcurrentHashMap<C84343y, C83818i> concurrentHashMap = C83834k.f244700a;
            C84343y a = C84343y.m103969a(mo121254q1());
            C87412m.m108594g(a, "type");
            C83818i iVar = C83834k.f244700a.get(a);
            if (iVar == null) {
                Log.m105925i("MicroMsg.AppBrandDecorWidgetPreLoader", "obtainInstance: no preloaded, create it [%s]", a.name());
                iVar = new C83818i();
            }
            this.f238267C1 = iVar;
        }
        return this.f238267C1;
    }

    /* renamed from: L0 */
    public final void mo113017L0(boolean z, String str, WxaPkg wxaPkg) {
        if (z) {
            C83606m1.m102638b(53, mo113210l1());
            return;
        }
        AppBrandInitConfigWC M1 = mo113210l1();
        C87412m.m108594g(M1, "initConfig");
        C115669n.INSTANCE.mo175911u(1906, 53);
        C84240s.m103843i(M1.f239362d, C81289m.C81290a.m99664b(M1.f239365g) ? M1.f234804H.f239452d : 0, M1.f239365g, 1906, 53, 1);
    }

    /* renamed from: L1 */
    public C79709a mo113181L1() {
        if (this.f238276L1 == null && !mo113064k0()) {
            this.f238276L1 = new AppBrandRuntimeWC$$r(this);
        }
        return this.f238276L1;
    }

    /* renamed from: M0 */
    public void mo113019M0() {
        if (!C84583r2.m104183g(this)) {
            super.mo113019M0();
        }
    }

    /* renamed from: M1 */
    public AppBrandInitConfigWC mo113210l1() {
        return (AppBrandInitConfigWC) ((AppBrandInitConfigLU) this.f238149o);
    }

    /* renamed from: N1 */
    public final ICommLibReader mo113183N1() {
        return mo113184O1(false);
    }

    /* renamed from: O1 */
    public final ICommLibReader mo113184O1(boolean z) {
        ICommLibReader iCommLibReader = (ICommLibReader) mo113027R0(ICommLibReader.class);
        if (iCommLibReader != null || !z) {
            return iCommLibReader;
        }
        throw new ICommLibReader.C81403a();
    }

    /* renamed from: P1 */
    public AppBrandPageContainerWC mo113212m1() {
        return (AppBrandPageContainerWC) ((C79994a) this.f238152q);
    }

    /* renamed from: Q1 */
    public final C89717d mo113186Q1() {
        if (this.f238274J1 == null) {
            if (mo113064k0() || this.f238117P) {
                return null;
            }
            synchronized (this.f238273I1) {
                if (this.f238274J1 == null) {
                    this.f238274J1 = new C89717d(this);
                }
            }
        }
        return this.f238274J1;
    }

    /* renamed from: R1 */
    public C79575q mo113187R1() {
        return this.f238294v1;
    }

    /* renamed from: S1 */
    public AppBrandSysConfigWC mo113213o1() {
        return (AppBrandSysConfigWC) mo113021O(AppBrandSysConfigWC.class, false);
    }

    /* renamed from: T1 */
    public final C84223s mo113189T1() {
        C84228v vVar = this.f238272H1;
        if (vVar == null) {
            return null;
        }
        return vVar.f246041d;
    }

    /* renamed from: U0 */
    public void mo113033U0(C81820e3 e3Var) {
        Context context;
        C83780d1 currentPageView;
        super.mo113033U0(e3Var);
        Activity activity = null;
        if (e3Var == null) {
            this.f238132X = null;
            ((C84543i2) this.f238141d).setBaseContext(MMApplicationContext.getContext());
            if (((C88267e) this.f238150p) != null) {
                ((C88267e) this.f238150p).mo114328C0((C79774c) null);
            }
            if (mo113212m1() != null) {
                AppBrandPageContainerWC P1 = mo113212m1();
                C87412m.m108594g(P1, "<this>");
                ListIterator<C83820i0> listIterator = P1.f244745p.listIterator();
                while (listIterator.hasNext()) {
                    C83820i0 next = listIterator.next();
                    if (next instanceof C87465d ? true : next instanceof C83781d2) {
                        next.getCurrentPageView().mo116203w1((C79774c) null);
                    } else if (next instanceof C83966x) {
                        C83966x xVar = (C83966x) next;
                        xVar.getClass();
                        for (C83780d1 w1 : ((HashMap) xVar.f245126T).values()) {
                            w1.mo116203w1((C79774c) null);
                        }
                    }
                }
                List<C83780d1> preloadedPageView = P1.getPreloadedPageView();
                if (preloadedPageView != null) {
                    for (C83780d1 w15 : preloadedPageView) {
                        w15.mo116203w1((C79774c) null);
                    }
                }
                C83820i0 currentPage = P1.getCurrentPage();
                if (!(currentPage == null || (currentPageView = currentPage.getCurrentPageView()) == null)) {
                    P1.mo116336a0(currentPageView);
                }
                AppBrandPageContainerWC P12 = mo113212m1();
                Context context2 = MMApplicationContext.getContext();
                if (context2 == null) {
                    P12.getClass();
                    context2 = MMApplicationContext.getContext();
                }
                if (P12.getContext() instanceof MutableContextWrapper) {
                    ((MutableContextWrapper) P12.getContext()).setBaseContext(context2);
                }
            }
            C84059t tVar = this.f238119Q0;
            if (tVar != null) {
                C84042g.m103550a(tVar, (C79774c) null);
            }
            C89797e eVar = this.f238159x;
            if (eVar != null) {
                eVar.mo124092e(MMApplicationContext.getContext());
            }
            this.f238296x1 = new C86813h();
            if (this.f238113K != null) {
                mo113083u0();
                return;
            }
            return;
        }
        if (e3Var instanceof C86127t) {
            activity = ((C86127t) e3Var).mo120548w();
        } else if (e3Var instanceof C81812e1) {
            activity = AndroidContextUtil.castActivityOrNull(e3Var.getContext());
        }
        ((C84543i2) this.f238141d).setBaseContext(activity);
        C89797e eVar2 = this.f238159x;
        if (eVar2 != null) {
            Objects.requireNonNull(activity);
            eVar2.mo124092e(activity);
        }
        boolean nullAs = Util.nullAs((Boolean) C87690d.m109090a("AppBrandRuntimeProfile|isFoldableDevice", new C84886w1(this)), false);
        if ((mo113054f0().isLargeScreenWindow() || nullAs) && !C84684v.isBlackListing()) {
            Activity R = mo113026R();
            Objects.requireNonNull(R);
            this.f238296x1 = new C84684v(this, R, mo113054f0().getOrientationHandler(), super.mo113054f0());
        } else {
            this.f238296x1 = new C86813h();
        }
        if (((C88267e) this.f238150p) != null) {
            ((C88267e) this.f238150p).mo114328C0(mo113054f0());
        }
        C83928t1 J1 = mo113178J1();
        if (J1 != null) {
            J1.mo116203w1(mo113054f0());
            mo113212m1().mo116336a0(J1);
        }
        C84059t tVar2 = this.f238119Q0;
        if (tVar2 != null) {
            C84042g.m103550a(tVar2, mo113054f0());
        }
        if (mo113212m1() != null) {
            AppBrandPageContainerWC P13 = mo113212m1();
            if (activity == null) {
                P13.getClass();
                context = MMApplicationContext.getContext();
            } else {
                context = activity;
            }
            if (P13.getContext() instanceof MutableContextWrapper) {
                ((MutableContextWrapper) P13.getContext()).setBaseContext(context);
            }
        }
        Configuration configuration = new Configuration(AppBrandUI.m104035Z7(activity));
        Configuration configuration2 = this.f238291s1;
        if (configuration2 == null) {
            this.f238291s1 = configuration;
        } else {
            if (C91577a.m114917a(this, configuration2, configuration)) {
                mo113035V0();
            }
            this.f238291s1 = configuration;
        }
        if (this.f238292t1 == null && this.f238116N) {
            Log.m105925i("MicroMsg.AppBrandRuntimeWC", "setRuntimeContainer != NULL, appId:%s, retry initFloatBallHelper", this.f238147j);
            mo113191V1();
        }
        if (this.f238293u1 == null && this.f238116N) {
            Log.m105925i("MicroMsg.AppBrandRuntimeWC", "setRuntimeContainer != NULL, appId:%s, retry initMultiTaskHelper", this.f238147j);
            mo113192W1();
        }
    }

    /* renamed from: U1 */
    public final void mo113190U1(String str) {
        C87412m.m108594g(str, "targetAppId");
        if (mo121251g1()) {
            Log.m105920e("MicroMsg.AppBrand.RuntimeMigrateRestartHelper", "handleStartMigrateTargetApp(" + this.f238147j + "), finish directly because prerender-ing");
            mo113175G1();
        } else if (C81289m.C81290a.m99663a(this.f238149o.f239365g)) {
            Log.m105920e("MicroMsg.AppBrand.RuntimeMigrateRestartHelper", "handleStartMigrateTargetApp(" + this.f238147j + "), finish directly because versionType:" + this.f238149o.f239365g);
            mo113175G1();
        } else {
            String str2 = mo113210l1().f234838r;
            C87412m.m108593f(str2, "this.initConfig.wxaLaunchInstanceId");
            C15618a.m14626b(new RuntimeMigrateRestartHelper.MigrateRestartPreLaunchArgs(str2, str), C81110a4.f238381d, new C81600c4(this, str));
        }
    }

    /* renamed from: V1 */
    public final void mo113191V1() {
        if (mo113194Y1() || C83608m4.m102642a(this)) {
            Log.m105929w("MicroMsg.AppBrandRuntimeWC", "initFloatBallHelper appId[%s], skip fakeNative", this.f238147j);
            return;
        }
        if (this.f238292t1 != null) {
            Log.m105924i("MicroMsg.AppBrandRuntimeWC", "initFloatBallHelper, destroy");
            this.f238292t1.mo114251b(this);
        }
        C81855i iVar = new C81855i(this);
        this.f238292t1 = iVar;
        Log.m105925i("MicroMsg.AppBrandFloatBallLogic", "init, runtime:%s", this.f238147j);
        ((C119157j) C119157j.f356862d).mo183876g(new C81851f(iVar, this), "FloatBallHelperThread");
    }

    /* renamed from: W0 */
    public boolean mo113037W0() {
        C81820e3 e3Var;
        if (!mo113194Y1() || (e3Var = this.f238142e) == null || !e3Var.mo113124e(this)) {
            return true;
        }
        Log.m105925i("MicroMsg.AppBrandRuntimeWC", "shouldHandleSuspendTimeout skip for in stack fakeNative, appId:%s", this.f238147j);
        return false;
    }

    /* renamed from: W1 */
    public final void mo113192W1() {
        if (mo113194Y1() || C83608m4.m102642a(this)) {
            Log.m105929w("MicroMsg.AppBrandRuntimeWC", "initMultiTaskHelper appId[%s], skip fakeNative", this.f238147j);
            return;
        }
        if (this.f238293u1 != null) {
            Log.m105924i("MicroMsg.AppBrandRuntimeWC", "initMultiTaskHelper, destroy");
            this.f238293u1.getClass();
            Log.m105925i("MicroMsg.AppBrandMultiTaskLogic", "destroy, runtime:%s", this.f238147j);
        }
        C89787d dVar = new C89787d();
        this.f238293u1 = dVar;
        Log.m105925i("MicroMsg.AppBrandMultiTaskLogic", "init, runtime:%s", this.f238147j);
        ((C119157j) C119157j.f356862d).mo183876g(new C89785c(dVar, this), "MultiTaskHelperThread");
    }

    /* renamed from: X0 */
    public boolean mo113039X0() {
        return !mo121254q1();
    }

    /* renamed from: X1 */
    public final void mo113193X1() {
        Class<C91831m> cls = C91831m.class;
        mo113014I0(C16377l.class, C91838s.f262955d);
        mo113014I0(C91077n.class, new C91080q(this));
        mo113014I0(C91078o.class, C91082s.f261266g);
        mo113014I0(C1737l0.class, C82781y1.f242137d);
        this.f238111I.mo122506c(cls);
        mo113014I0(cls, new C91833o(this));
        mo113014I0(C87985i.class, new C84348u2());
        mo113014I0(C85008l.class, C85010m.f247735d);
        mo113014I0(C90537f.class, C83535c.f244059d);
        mo113014I0(C83782d3.class, new C83981z1(this));
        mo113014I0(C115249m.C1742c.class, new AppBrandRuntimeWC$$w(this));
        C84072q1.m103586a(this.f238147j);
        mo113014I0(C0507b.class, new C0506a(C77710q.m93738a(((C34574b) C86312j.m106911c(C34574b.class)).mo56629LU(this.f238147j)), this.f238147j));
        mo113014I0(C79706a.class, new C79706a());
    }

    /* renamed from: Y0 */
    public boolean mo113041Y0(Runnable runnable) {
        if (this.f238154s instanceof C84537h4) {
            mo113025Q0(runnable, 3000);
            return true;
        } else if (!((C32735h) C86312j.m106911c(C32735h.class)).mo58784wf(C32735h.C32737c.clicfg_appbrand_game_splashscreen, false)) {
            return false;
        } else {
            boolean z = mo113008F().f239617w;
            Log.m105929w("MicroMsg.AppBrandRuntimeWC", "manualHideSplash:%b", Boolean.valueOf(z));
            return z;
        }
    }

    /* renamed from: Y1 */
    public boolean mo113194Y1() {
        return mo113210l1().f239373d1;
    }

    /* renamed from: Z1 */
    public final void mo113195Z1() {
        int i = -1;
        if (mo121250f1() || mo121251g1()) {
            mo113210l1().f234812Q = true;
            ICommLibReader O1 = mo113184O1(false);
            if (O1 != null) {
                i = O1.mo113371a();
            }
            new AppBrandRegisterTask((C86812g) this, i).mo114396f();
            return;
        }
        ICommLibReader O12 = mo113184O1(false);
        if (O12 != null) {
            i = O12.mo113371a();
        }
        new AppBrandRegisterTask((C86812g) this, i).mo114395c();
    }

    /* renamed from: a1 */
    public void mo113046a1(AppBrandInitConfig appBrandInitConfig) {
        AppBrandInitConfigWC M1 = mo113210l1();
        AppBrandInitConfigWC appBrandInitConfigWC = (AppBrandInitConfigWC) appBrandInitConfig;
        if (M1 != appBrandInitConfig && appBrandInitConfigWC.mo111295f().f245533f == 1038) {
            appBrandInitConfigWC.f234808L = null;
        }
        if (M1.f234817S0) {
            appBrandInitConfigWC.f234817S0 = true;
        }
        AppBrandRuntimeCheckResetToTopOfStackMessage.m103926d(this, M1, appBrandInitConfigWC);
        super.mo113046a1(appBrandInitConfig);
        boolean z = mo113210l1().f234813Q0 != M1.f234813Q0 && (mo113210l1().f234813Q0 == 1 || M1.f234813Q0 == 1);
        if (z) {
            mo113035V0();
        }
        Log.m105925i("MicroMsg.AppBrandRuntimeWC", "updateConfig %s, willRestart[%b], willRelaunch[%b], destroyed[%b], scene[%d], lastLaunchMode[%d], currentLaunchMode[%d], instanceId[%s], sessionId[%s]", this, Boolean.valueOf(mo113050c1()), Boolean.valueOf(mo113048b1()), Boolean.valueOf(mo113064k0()), Integer.valueOf(mo113208k1()), Integer.valueOf(M1.f234813Q0), Integer.valueOf(mo113210l1().f234813Q0), appBrandInitConfigWC.mo111297h(), appBrandInitConfigWC.mo111296g());
        OpenBusinessViewUtil.m101151e(this);
        if (!mo113050c1() && !mo113064k0()) {
            if (!C90599h.m113509b(appBrandInitConfigWC.mo111297h(), M1.mo111297h())) {
                if (BuildInfo.DEBUG || BuildInfo.IS_FLAVOR_RED) {
                    Assert.fail(String.format("updateConfig %s instanceId should not have been changed[%s]->[%s]", new Object[]{this, M1.mo111297h(), appBrandInitConfigWC.mo111297h()}));
                } else {
                    Log.m105921e("MicroMsg.AppBrandRuntimeWC", "updateConfig %s, newConfig.instanceId changed, reset [%s]->[%s]", this, appBrandInitConfigWC.mo111297h(), M1.mo111297h());
                    appBrandInitConfigWC.mo111298i(M1.mo111297h());
                }
            }
            QualitySessionRuntime b = C84185b.m103769b(mo113012H());
            Objects.requireNonNull(b);
            QualitySessionRuntime qualitySessionRuntime = b;
            b.f245839n = false;
            C84201i.m103807d(this, true, C84788u.m104468b(mo113210l1().f239376g1));
            C91667a.m115205a(mo113012H(), mo113210l1().f234809M);
            for (C81691d3 a : this.f238288p1) {
                a.mo113277a(mo113210l1());
            }
            if (mo113212m1() != null) {
                mo113212m1().mo116044p0();
            }
            AppBrandTaskUsageRecorder.m102194a(this);
            mo113207j2();
            mo113174E1();
            AppBrandInitConfigWC M12 = mo113210l1();
            if (M12 != null) {
                this.f238296x1.onInitConfigUpdated(M12);
                this.f238265A1.mo117750c(M12);
            }
            this.f238266B1.mo118005c(M12);
            this.f238297y1.mo116784b(appBrandInitConfigWC, z);
        }
    }

    /* renamed from: a2 */
    public final void mo113196a2(boolean z) {
        boolean z2 = false;
        Log.m105925i("MicroMsg.AppBrandRuntimeWC", "notifyRemovedToMMTaskManager(isForDestroy:%b), appId:%s", Boolean.valueOf(z), this.f238147j);
        if (z || !mo113064k0()) {
            new LuggageRemoveTask(C86499a.m107251a(this), z || mo113064k0()).mo114395c();
            AppBrandInitConfigWC M1 = mo113210l1();
            if (M1 != null) {
                AppBrandLaunchReferrer appBrandLaunchReferrer = M1.f234846y;
                if (appBrandLaunchReferrer.f239396d == 1) {
                    String str = appBrandLaunchReferrer.f239397e;
                    if (str == null || str.length() == 0) {
                        z2 = true;
                    }
                    if (!z2) {
                        String str2 = M1.f234846y.f239397e;
                        C87412m.m108593f(str2, "initConfig.referrer.appId");
                        C15618a.m14626b(new IPCString(str2), new C84307b(), (C1256g) null);
                    }
                }
            }
        }
    }

    /* renamed from: b0 */
    public C81925i2 mo113047b0() {
        return (C88267e) this.f238150p;
    }

    /* renamed from: b2 */
    public void mo113197b2() {
        if (C81289m.C81290a.m99664b(this.f238149o.f239365g)) {
            C84090r1 r1Var = this.f238270F1;
            if (!r1Var.f245504a.getAndSet(true) && r1Var.f245505b.get()) {
                ((r1$$a) r1Var.f245507d).run();
            }
        }
    }

    /* renamed from: c0 */
    public final C84560k4 mo113049c0() {
        return this.f238154s;
    }

    /* renamed from: c2 */
    public void mo113198c2(Intent intent) {
        C90630c cVar;
        mo113212m1().getReporter().mo115886c(intent);
        if (C87203t.m108279o() && (cVar = (C90630c) mo113212m1().getCurrentPage().getCurrentPageView()) != null) {
            FrameLayout frameLayout = (FrameLayout) cVar.f244555G.findViewById(C0966R.C0970id.f5955t_);
            if (!((frameLayout == null || frameLayout.getVisibility() != 0 || frameLayout.getBackground() == null) ? false : true)) {
                C83797e3 e3Var = mo113212m1().getCurrentPage().getCurrentPageView().f244558J;
                if (e3Var instanceof C88470y) {
                    C88454p pVar = (C88454p) e3Var.getContentView();
                    if (pVar.f255525g) {
                        pVar.f255527i.removeCallbacks(pVar.f255528j);
                        if (C2039g2.m1987a()) {
                            ((C88454p.C88458c) pVar.f255530o).run();
                        } else {
                            pVar.f255527i.post(pVar.f255530o);
                        }
                    }
                }
            }
        }
    }

    /* renamed from: d2 */
    public void mo113199d2() {
        if (!mo113064k0() && !this.f238117P) {
            mo113020N0(new AppBrandRuntimeWC$$a(this, Util.nowMilliSecond()));
            C84560k4 k4Var = this.f238154s;
            if (k4Var instanceof C84567n4) {
                ((C84567n4) k4Var).setCanShowHideAnimation(true);
            }
            if (k4Var instanceof C84706x0) {
                ((C84706x0) k4Var).setLoadingIconVisibility(true);
            }
            if (mo113026R() != null) {
                C87771d.m109203b(mo113026R()).mo122181e();
            }
            if (mo113210l1().f239392w1 != null) {
                mo113210l1().f239392w1.f243386d.mo111345a(new IPCVoid());
            }
        }
    }

    /* renamed from: e2 */
    public void mo113200e2() {
        C81688d0 d0Var = this.f238290r1;
        if (d0Var != null) {
            d0Var.getClass();
            d0$$a d0__a = new d0$$a(d0Var);
            synchronized (d0Var.f239746l) {
                if (!d0Var.f239745k.get()) {
                    d0Var.f239746l.addLast(d0__a);
                } else {
                    d0__a.run();
                }
            }
        }
    }

    /* renamed from: f0 */
    public C79774c mo113054f0() {
        C79774c windowAndroid;
        C81820e3 e3Var = this.f238142e;
        if (e3Var == null || (windowAndroid = e3Var.getWindowAndroid()) == null) {
            return super.mo113054f0();
        }
        C86814i<AppBrandInitConfigWC> iVar = this.f238296x1;
        if (iVar == null || !(iVar instanceof C79782g)) {
            return windowAndroid;
        }
        if (!((C79782g) iVar).shouldInLargeScreenCompatMode() && !(this.f238296x1 instanceof C87795a)) {
            return windowAndroid;
        }
        C79781f fVar = this.f238279O1;
        if (!(fVar != null && fVar.f233806d == windowAndroid && fVar.f233807e == this.f238296x1)) {
            this.f238279O1 = new C79781f(windowAndroid, (C79782g) this.f238296x1);
        }
        return this.f238279O1;
    }

    /* renamed from: f2 */
    public void mo113201f2(C81925i2 i2Var) {
        Log.m105925i("MicroMsg.AppBrandRuntimeWC", "onServiceProvidedBeforeRealInit, appId:%s, preloadedService:%s", this.f238147j, i2Var);
        if (i2Var instanceof C88267e) {
            ((C88267e) i2Var).f255132R = mo113210l1().f234823V0;
        }
        AppBrandRuntimeWC$$n appBrandRuntimeWC$$n = new AppBrandRuntimeWC$$n(this);
        synchronized (i2Var.f240283B) {
            if (i2Var.f240284C != null) {
                appBrandRuntimeWC$$n.mo113226a(i2Var.f240284C);
                return;
            }
            synchronized (i2Var.f240287F) {
                i2Var.f240287F.add(appBrandRuntimeWC$$n);
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:21:0x003e  */
    /* renamed from: g2 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo113202g2(java.lang.Runnable r8) {
        /*
            r7 = this;
            boolean r0 = r7.mo113069n0()
            r1 = 1
            r2 = 0
            if (r0 != 0) goto L_0x0025
            java.util.LinkedHashMap<java.lang.String, com.tencent.mm.plugin.appbrand.AppBrandRuntimeWC> r0 = com.tencent.p014mm.plugin.appbrand.C81682d.f239733c
            monitor-enter(r0)
            java.util.LinkedHashMap<java.lang.String, com.tencent.mm.plugin.appbrand.AppBrandRuntimeWC> r3 = com.tencent.p014mm.plugin.appbrand.C81682d.f239732b     // Catch:{ all -> 0x0022 }
            boolean r3 = r3.containsValue(r7)     // Catch:{ all -> 0x0022 }
            monitor-exit(r0)     // Catch:{ all -> 0x0022 }
            if (r3 != 0) goto L_0x0025
            li0.c r0 = r7.f238113K
            if (r0 != 0) goto L_0x001a
            r0 = 0
            goto L_0x001e
        L_0x001a:
            boolean r0 = r0.mo122983f()
        L_0x001e:
            if (r0 != 0) goto L_0x0025
            r0 = 1
            goto L_0x0026
        L_0x0022:
            r8 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0022 }
            throw r8
        L_0x0025:
            r0 = 0
        L_0x0026:
            java.lang.String r3 = "MicroMsg.AppBrandRuntimeWC"
            java.lang.String r4 = "[wxa_reload]recycleRuntime %s, recycle[%b]"
            r5 = 2
            java.lang.Object[] r5 = new java.lang.Object[r5]
            java.lang.String r6 = r7.toString()
            r5[r2] = r6
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r0)
            r5[r1] = r2
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r3, r4, r5)
            if (r0 == 0) goto L_0x0041
            r7.mo113176H1(r8)
        L_0x0041:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.appbrand.AppBrandRuntimeWC.mo113202g2(java.lang.Runnable):boolean");
    }

    /* renamed from: h1 */
    public final boolean mo113203h1() {
        return super.mo113203h1() || (WeChatEnvironment.hasDebugger() && C90188n0.f258949q);
    }

    /* renamed from: h2 */
    public void mo113204h2() {
        AppBrandSysConfigWC S1 = mo113213o1();
        if (S1 != null) {
            S1.f234856A.f234898g = true;
            IListener<NotifyWxaCommLibUpdatedEvent> iListener = this.f238269E1;
            if (iListener != null) {
                iListener.dead();
            }
            C2688725 r0 = new IListener<NotifyWxaCommLibUpdatedEvent>(C40008f.f107254d) {
                {
                    Class<NotifyWxaCommLibUpdatedEvent> cls = NotifyWxaCommLibUpdatedEvent.class;
                    this.__eventId = -1441357655;
                }

                public boolean callback(IEvent iEvent) {
                    AppBrandRuntimeWC.this.mo113024P0(new C26889x4(this, (NotifyWxaCommLibUpdatedEvent) iEvent));
                    return false;
                }
            };
            this.f238269E1 = r0;
            r0.alive();
        }
    }

    /* renamed from: i1 */
    public C84524e3 mo113205i1() {
        int i = C83994c.f245226b;
        String str = this.f238147j;
        Log.m105919d("MicroMsg.AppBrandPerformanceManagerWC", "startMonitoring, appId: %s", str);
        SparseArray<AppBrandPerformanceManager.C83989b> sparseArray = AppBrandPerformanceManager.f245206a;
        AppBrandPerformanceManager.C83989b bVar = sparseArray.get(str.hashCode());
        if (!(bVar instanceof C83994c.C83996b)) {
            if (bVar != null) {
                bVar.mo116637h();
            }
            bVar = new C83994c.C83996b(this);
            sparseArray.put(str.hashCode(), bVar);
        }
        bVar.mo116636g();
        List<kv_14609> list = ((AppStartupPerformanceReportBundle) mo113018M(AppStartupPerformanceReportBundle.class)).f243289f;
        if (!Util.isNullOrNil((List) list)) {
            long j = 0;
            for (kv_14609 kv_14609 : list) {
                j = Math.max(j, kv_14609.f245673o);
            }
            AppBrandPerformanceManager.m103495d(this, 201, j);
        }
        if (DebuggerShell.f239772d) {
            return null;
        }
        return super.mo113205i1();
    }

    /* renamed from: i2 */
    public void mo113206i2(AppBrandRuntimeWC$$z appBrandRuntimeWC$$z) {
        AppBrandInitConfigWC M1 = mo113210l1();
        if (M1 != null) {
            if (AppBrandRuntimeWC$$z.OnDestroy == appBrandRuntimeWC$$z) {
                m99215F1(M1);
            } else {
                MMHandlerThread.postToMainThread(new AppBrandRuntimeWC$$p(this, M1));
            }
        }
    }

    /* renamed from: j2 */
    public final void mo113207j2() {
        if (f238264Q1) {
            try {
                AccessibilityManager accessibilityManager = (AccessibilityManager) C111105a.m151502d(this.f238141d, AccessibilityManager.class);
                if (accessibilityManager == null) {
                    return;
                }
                if (!accessibilityManager.isTouchExplorationEnabled()) {
                    this.f238153r.setContentDescription(this.f238147j + XVFSFile.PATH_SEPARATOR + mo113210l1().f239363e);
                }
            } catch (Exception unused) {
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:36:0x00ed  */
    /* JADX WARNING: Removed duplicated region for block: B:42:? A[RETURN, SYNTHETIC] */
    /* renamed from: k */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo113063k() {
        /*
            r13 = this;
            r0 = 2
            java.lang.Object[] r0 = new java.lang.Object[r0]
            java.lang.String r1 = r13.f238147j
            r2 = 0
            r0[r2] = r1
            java.lang.Throwable r1 = new java.lang.Throwable
            r1.<init>()
            java.lang.String r1 = android.util.Log.getStackTraceString(r1)
            r3 = 1
            r0[r3] = r1
            java.lang.String r1 = "MicroMsg.AppBrandRuntimeWC"
            java.lang.String r4 = "close() appId:%s, stack:%s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r1, r4, r0)
            java.lang.String r0 = r13.f238147j     // Catch:{ Exception -> 0x0045 }
            com.tencent.mm.plugin.appbrand.l$e r0 = com.tencent.p014mm.plugin.appbrand.C83231l.m102143d(r0)     // Catch:{ Exception -> 0x0045 }
            com.tencent.mm.plugin.appbrand.l$e r4 = com.tencent.p014mm.plugin.appbrand.C83231l.C83235e.CLOSE     // Catch:{ Exception -> 0x0045 }
            if (r0 != r4) goto L_0x004d
            com.tencent.mm.plugin.appbrand.page.AppBrandPageContainerWC r0 = r13.mo113212m1()     // Catch:{ Exception -> 0x0045 }
            com.tencent.mm.plugin.appbrand.page.d1 r0 = r0.getPageView()     // Catch:{ Exception -> 0x0045 }
            java.lang.Class<uj0.a> r4 = uj0.C90665a.class
            java.lang.Object r0 = r0.mo116150E0(r4)     // Catch:{ Exception -> 0x0045 }
            uj0.a r0 = (uj0.C90665a) r0     // Catch:{ Exception -> 0x0045 }
            if (r0 == 0) goto L_0x004d
            uj0.d r4 = r0.mo124807V()     // Catch:{ Exception -> 0x0045 }
            if (r4 == 0) goto L_0x004d
            uj0.d r0 = r0.mo124807V()     // Catch:{ Exception -> 0x0045 }
            r0.mo124814f()     // Catch:{ Exception -> 0x0045 }
            goto L_0x004d
        L_0x0045:
            r0 = move-exception
            java.lang.Object[] r4 = new java.lang.Object[r2]
            java.lang.String r5 = "hy: triggerMakeCanvasBitmap error!"
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r1, r0, r5, r4)
        L_0x004d:
            com.tencent.p014mm.plugin.appbrand.jsapi.fakenative.OpenBusinessViewUtil.m101148b(r13)
            com.tencent.mm.plugin.appbrand.config.AppBrandInitConfigWC r0 = r13.mo113210l1()
            com.tencent.mm.plugin.appbrand.launching.WeAppOpenUICallbackIPCProxy r0 = r0.f239392w1
            if (r0 == 0) goto L_0x0062
            li0.c r0 = r13.f238113K
            com.tencent.mm.plugin.appbrand.AppBrandRuntimeWC$$s r1 = new com.tencent.mm.plugin.appbrand.AppBrandRuntimeWC$$s
            r1.<init>(r13)
            r0.mo122978a(r1)
        L_0x0062:
            boolean r0 = r13.mo113194Y1()
            if (r0 != 0) goto L_0x00f5
            boolean r0 = com.tencent.p014mm.plugin.appbrand.C81552b3.m100042a(r13)
            if (r0 == 0) goto L_0x0070
            goto L_0x00f5
        L_0x0070:
            com.tencent.mm.plugin.appbrand.AppBrandRuntimeWC$$t r0 = new com.tencent.mm.plugin.appbrand.AppBrandRuntimeWC$$t
            r0.<init>(r13)
            java.lang.Class<os.d> r1 = p635os.C89291d.class
            di3.d r1 = di3.C86312j.m106911c(r1)
            os.d r1 = (p635os.C89291d) r1
            java.lang.String r4 = r13.f238147j
            com.tencent.mm.plugin.appbrand.config.AppBrandInitConfigWC r5 = r13.mo113210l1()
            int r5 = r5.f239365g
            java.lang.Boolean r1 = r1.Qq0(r4, r5)
            boolean r1 = r1.booleanValue()
            if (r1 == 0) goto L_0x00a5
            java.lang.Class<kz1.l> r1 = kz1.C88349l.class
            di3.d r1 = di3.C86312j.m106911c(r1)
            kz1.l r1 = (kz1.C88349l) r1
            android.app.Activity r2 = r13.mo113026R()
            java.lang.String r3 = r13.f238147j
            com.tencent.mm.plugin.appbrand.config.AppBrandInitConfig r4 = r13.f238149o
            int r4 = r4.f239365g
            r1.mo118257sG(r2, r3, r4, r0)
            return
        L_0x00a5:
            com.tencent.mm.plugin.appbrand.i2 r1 = r13.f238150p
            kr0.e r1 = (kr0.C88267e) r1
            if (r1 == 0) goto L_0x00f1
            com.tencent.mm.plugin.appbrand.widget.dialog.a r1 = new com.tencent.mm.plugin.appbrand.widget.dialog.a
            com.tencent.mm.plugin.appbrand.i2 r4 = r13.f238150p
            kr0.e r4 = (kr0.C88267e) r4
            r1.<init>(r4)
            java.lang.String r4 = "MicroMsg.AppBrand.Evaluate.AppBrandEvaluateDialogHelper"
            boolean r5 = r1.mo117757d(r13)     // Catch:{ BadTokenException -> 0x00e0 }
            boolean r6 = r1.mo117759f(r13, r0)     // Catch:{ BadTokenException -> 0x00e0 }
            if (r6 == 0) goto L_0x00d5
            if (r5 == 0) goto L_0x00d3
            java.lang.String r1 = "no need show game evaluate dialog: WA dialog first"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r4, r1)     // Catch:{ BadTokenException -> 0x00e0 }
            com.tencent.mm.plugin.report.service.n r5 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE     // Catch:{ BadTokenException -> 0x00e0 }
            r6 = 1237(0x4d5, double:6.11E-321)
            r8 = 2
            r10 = 1
            r12 = 0
            r5.idkeyStat(r6, r8, r10, r12)     // Catch:{ BadTokenException -> 0x00e0 }
        L_0x00d3:
            r2 = 1
            goto L_0x00eb
        L_0x00d5:
            if (r5 == 0) goto L_0x00eb
            java.lang.String r5 = "need show game evaluate dialog"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r4, r5)     // Catch:{ BadTokenException -> 0x00e0 }
            r1.mo117758e(r13, r0)     // Catch:{ BadTokenException -> 0x00e0 }
            goto L_0x00d3
        L_0x00e0:
            r1 = move-exception
            java.lang.Object[] r3 = new java.lang.Object[r3]
            r3[r2] = r1
            java.lang.String r1 = "showEvaluateDialogIfNeed get exception:%s"
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r4, r1, r3)
        L_0x00eb:
            if (r2 != 0) goto L_0x00f0
            r0.run()
        L_0x00f0:
            return
        L_0x00f1:
            r0.run()
            return
        L_0x00f5:
            r0 = 0
            r13.mo113066m(r0, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.appbrand.AppBrandRuntimeWC.mo113063k():void");
    }

    /* renamed from: k1 */
    public int mo113208k1() {
        return mo121253n1().f245533f;
    }

    /* renamed from: k2 */
    public final void mo113209k2() {
        boolean z;
        AppBrandGlobalSystemConfig.HttpSetting httpSetting;
        ArrayList<String> arrayList;
        AppBrandSysConfigWC S1 = mo113213o1();
        String str = this.f238147j;
        int i = S1.f234891x0;
        C81649e.C81651b bVar = C81649e.f239670d;
        bVar.getClass();
        if (!TextUtils.isEmpty(str)) {
            synchronized (bVar.f239673a) {
                bVar.f239673a.put(str.hashCode(), i);
            }
        }
        String str2 = this.f238147j;
        int i2 = S1.f234893y0;
        C81649e.C81651b bVar2 = C81649e.f239671e;
        bVar2.getClass();
        if (!TextUtils.isEmpty(str2)) {
            synchronized (bVar2.f239673a) {
                bVar2.f239673a.put(str2.hashCode(), i2);
            }
        }
        ConcurrentLinkedDeque<C1727m> concurrentLinkedDeque = this.f238104B;
        String str3 = C81647b.f239668a;
        AppBrandInitConfigWC M1 = mo113210l1();
        AppBrandSysConfigWC S12 = mo113213o1();
        C81634a F = mo113008F();
        C90272a aVar = new C90272a();
        Boolean bool = M1.f234842v;
        boolean z2 = true;
        if (bool != null) {
            z = bool.booleanValue();
        } else {
            if (Util.isNullOrNil(M1.f234804H.f239463r)) {
                M1.f234842v = Boolean.FALSE;
            } else {
                try {
                    JSONArray optJSONArray = new JSONObject(M1.f234804H.f239463r).optJSONArray("call_plugin_info");
                    Boolean valueOf = Boolean.valueOf(optJSONArray != null && optJSONArray.length() > 0);
                    M1.f234842v = valueOf;
                    z = valueOf.booleanValue();
                } catch (Exception unused) {
                }
            }
            z = false;
        }
        aVar.f259127d = z || M1.mo111300k();
        boolean z3 = S12.f261072r.f238585d == 1 || S12.f261072r.f238585d == 2;
        aVar.f259128e = !S12.f234894z ? !z3 || !S12.f234889w : !z3 || !S12.f234892y;
        C81634a.C81638d dVar = F.f239610p;
        int i3 = dVar.f239623a;
        if (i3 > 0) {
            aVar.f259129f = i3;
        }
        int i4 = dVar.f239624b;
        if (i4 > 0) {
            aVar.f259130g = i4;
        }
        int i5 = dVar.f239625c;
        if (i5 > 0) {
            aVar.f259131h = i5;
        }
        int i6 = dVar.f239626d;
        if (i6 > 0) {
            aVar.f259132i = i6;
        }
        aVar.f259133j = S12.f234861F;
        aVar.f259134n = S12.f234864I;
        aVar.f259135o = S12.f234862G;
        aVar.f259136p = S12.f234863H;
        aVar.f259137q = S12.f234877T;
        aVar.f259138r = S12.f234879U;
        aVar.f259139s = S12.f234881V;
        aVar.f259140t = S12.f234883W;
        aVar.f259141u = S12.f234884X;
        aVar.f259142v = S12.f234885Y;
        AppBrandGlobalSystemConfig.HttpSetting httpSetting2 = S12.f234876S0.f239315s;
        int i7 = httpSetting2.f239329d;
        if (i7 == 1) {
            ArrayList<String> arrayList2 = httpSetting2.f239330e;
            if (arrayList2 != null) {
                aVar.f259143w = arrayList2;
            }
        } else if (i7 == 2 && (arrayList = httpSetting2.f239331f) != null) {
            aVar.f259144x = arrayList;
        }
        aVar.f259123E = i7;
        ArrayList<byte[]> arrayList3 = new ArrayList<>();
        C9514m mVar = new C9514m();
        ((C82419d1) this.f238163z).readFile("cer", mVar);
        String str4 = "";
        if (mVar.f29691a != null) {
            byte[] a = C88016e.m109544a((ByteBuffer) mVar.f29691a);
            try {
                C49473fu2 fu22 = new C49473fu2();
                fu22.parseFrom(a);
                LinkedList<C89349b> linkedList = fu22.f133688d;
                if (linkedList != null) {
                    Iterator<C89349b> it = linkedList.iterator();
                    while (it.hasNext()) {
                        arrayList3.add(it.next().f257327a);
                    }
                }
            } catch (Exception e) {
                Log.m105920e(str4, "readPkgCertificate, parse error: " + e);
            }
        }
        aVar.f259145y = arrayList3;
        aVar.f259146z = M1.mo111300k() ? S12.f234876S0.f239282E : S12.f234876S0.f239307h;
        aVar.f259119A = S12.f234866K;
        aVar.f259125G = S12.f234867L;
        aVar.f259120B = C53172t.m59584a(MMApplicationContext.getContext(), C53171h.m59583a());
        Log.m105925i("Luggage.FULL.AppBrandConfigAdapter", "runtime(%s).getNetworkConfig.userAgentString = [ %s ]", this.f238147j, aVar.f259120B);
        C88224a aVar2 = (C88224a) C89909e.m112436a(C88224a.class);
        if (aVar2 != null) {
            aVar.f259121C = aVar2.mo117494kn(F.f239600H);
        } else {
            Log.m105928w(str4, "getNetworkConfig, referrerHelper is null");
        }
        AppBrandGlobalSystemConfig appBrandGlobalSystemConfig = S12.f234876S0;
        if (!(appBrandGlobalSystemConfig == null || (httpSetting = appBrandGlobalSystemConfig.f239315s) == null)) {
            str4 = httpSetting.f239336n;
        }
        if (Util.isNullOrNil(str4)) {
            str4 = C81647b.f239668a;
        }
        aVar.f259122D = HttpWrapperBase.PROTOCAL_HTTPS + str4 + "/" + S12.f261062e + "/" + S12.f261072r.pkgVersion + "/page-frame.html";
        aVar.f259124F = M1.f234798B;
        boolean a2 = C81289m.C81290a.m99663a(S12.f261072r.f238585d);
        aVar.f259126H = a2;
        if (a2 || !Util.isNullOrNil((List) aVar.f259145y)) {
            C90309m.m113082q(aVar);
        }
        ((AppBrandRuntime$$h) concurrentLinkedDeque).add(aVar);
        ((AppBrandRuntime$$h) this.f238104B).add(C81647b.m100143a(S1));
        ConcurrentLinkedDeque<C1727m> concurrentLinkedDeque2 = this.f238104B;
        C84782s1.C84783a aVar3 = new C84782s1.C84783a();
        aVar3.f247210h = S1.f234876S0.f239279B;
        ((AppBrandRuntime$$h) concurrentLinkedDeque2).add(aVar3);
        ConcurrentLinkedDeque<C1727m> concurrentLinkedDeque3 = this.f238104B;
        AppBrandSysConfigWC S13 = mo113213o1();
        C81634a F2 = mo113008F();
        C88507a aVar4 = new C88507a();
        if (!(S13 == null || F2 == null)) {
            if (C81289m.C81290a.m99663a(S13.f261072r.f238585d)) {
                aVar4.f255657d = ((HashSet) F2.f239614t).contains("audio");
                aVar4.f255658e = ((HashSet) F2.f239614t).contains(FirebaseAnalytics.C113379b.LOCATION);
                aVar4.f255659f = ((HashSet) F2.f239614t).contains("bluetooth");
            } else {
                aVar4.f255657d = S13.f261065h;
                aVar4.f255658e = S13.f261066i;
                aVar4.f255659f = S13.f261067j;
            }
        }
        ((AppBrandRuntime$$h) concurrentLinkedDeque3).add(aVar4);
        C83992a aVar5 = new C83992a();
        aVar5.f245221d = S1.f234890x && (S1.f261072r.f238585d == 1 || S1.f261072r.f238585d == 2 || WeChatEnvironment.hasDebugger());
        boolean z4 = S1.f261072r.f238585d != 0;
        aVar5.f245222e = z4;
        aVar5.f245223f = S1.f234889w;
        aVar5.f245221d |= DebuggerShell.f239772d;
        if (!BuildInfo.DEBUG && !BuildInfo.IS_FLAVOR_RED && !WeChatEnvironment.hasDebugger()) {
            z2 = false;
        }
        aVar5.f245222e = z4 | z2;
        ((AppBrandRuntime$$h) this.f238104B).add(aVar5);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0008, code lost:
        r0 = (p194lc.C88435b0) mo113021O(p194lc.C88435b0.class, false);
     */
    /* renamed from: l2 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo113211l2() {
        /*
            r4 = this;
            com.tencent.mm.plugin.appbrand.config.a r0 = r4.mo113008F()
            r1 = 0
            if (r0 != 0) goto L_0x0008
            return r1
        L_0x0008:
            java.lang.Class<lc.b0> r0 = p194lc.C88435b0.class
            com.tencent.mm.plugin.appbrand.jsapi.m r0 = r4.mo113021O(r0, r1)
            lc.b0 r0 = (p194lc.C88435b0) r0
            if (r0 != 0) goto L_0x0013
            return r1
        L_0x0013:
            com.tencent.mm.plugin.appbrand.appstorage.ICommLibReader r2 = r4.mo113184O1(r1)
            java.lang.String r3 = "globalConsole"
            java.lang.String r2 = r2.Yk0(r3)
            boolean r2 = java.lang.Boolean.parseBoolean(r2)
            if (r2 == 0) goto L_0x0024
            return r1
        L_0x0024:
            boolean r0 = r0.mo122836a()
            if (r0 == 0) goto L_0x0037
            java.lang.Class<com.tencent.mm.plugin.appbrand.performance.a> r0 = com.tencent.p014mm.plugin.appbrand.performance.C83992a.class
            com.tencent.mm.plugin.appbrand.jsapi.m r0 = r4.mo113018M(r0)
            com.tencent.mm.plugin.appbrand.performance.a r0 = (com.tencent.p014mm.plugin.appbrand.performance.C83992a) r0
            boolean r0 = r0.f245223f
            if (r0 == 0) goto L_0x0037
            r1 = 1
        L_0x0037:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.appbrand.AppBrandRuntimeWC.mo113211l2():boolean");
    }

    /* renamed from: m0 */
    public boolean mo113067m0() {
        AppBrandInitConfigWC M1 = mo113210l1();
        if (M1 != null) {
            return M1.f234815R0.mo76931c();
        }
        return false;
    }

    /* renamed from: n */
    public C89797e mo113068n() {
        C89797e eVar = new C89797e(this);
        eVar.f258189d = new C89811p() {

            /* renamed from: a */
            public C89805k f238299a = null;
        };
        return eVar;
    }

    /* renamed from: o */
    public C81415h0 mo113070o() {
        C89909e.m112441f(C81417i0.class, new C82409b.C82410a());
        return new C82409b(this, C81647b.m100143a(mo113213o1()));
    }

    /* renamed from: p */
    public C84560k4 mo113072p() {
        if (mo121254q1()) {
            C81891f a = C81891f.m100578a();
            a.getClass();
            Class cls = C32735h.class;
            int i = ((C32735h) C86312j.m106911c(cls)).mo58784wf(C32735h.C32737c.clicfg_appbrand_game_predownload, false) ? 1 : 0;
            a.f240215f = i;
            Log.m105925i("MicroMsg.WAGamePreloadStatisManager", "misPreload:%d", Integer.valueOf(i));
            AppBrandInitConfigWC M1 = mo113210l1();
            a.f240210a = M1.f239362d;
            a.f240211b = M1.f234802F;
            a.f240212c = M1.f239365g;
            a.f240213d = M1.f234841u + 1000;
            a.f240214e = M1.f239379j1.f245832d;
            int i2 = a.f240212c;
            if (i2 == 0) {
                a.f240212c = 1;
            } else if (i2 == 1) {
                a.f240212c = 2;
            } else if (i2 == 2) {
                a.f240212c = 3;
            }
            if (mo121253n1() != null) {
                a.f240216g = mo121253n1().f245533f;
            }
            int i3 = ((C32735h) C86312j.m106911c(cls)).mo58784wf(C32735h.C32737c.clicfg_appbrand_game_splashscreen, false) ? 1 : 0;
            a.f240218i = i3;
            Log.m105925i("MicroMsg.WAGamePreloadStatisManager", "mHasSplashScreen:%d", Integer.valueOf(i3));
        }
        C84560k4 a2 = C84686v0.m104332a(mo113026R(), this);
        a2.mo1912q(mo113210l1().f239364f, mo113210l1().f239363e);
        if (a2 instanceof C84567n4) {
            ((C84567n4) a2).setCanShowHideAnimation(false);
        }
        if (a2 instanceof C84706x0) {
            if (TextUtils.isEmpty(mo113210l1().f239376g1)) {
                ((C84706x0) a2).setLoadingIconVisibility(false);
            } else {
                ((C84706x0) a2).setLoadingIconVisibility(true);
            }
        }
        return a2;
    }

    /* renamed from: p1 */
    public WxAppLibServerMode mo113214p1() {
        return this.f251969g1;
    }

    /* renamed from: q */
    public C89251a mo113074q() {
        return super.mo113074q();
    }

    /* renamed from: r */
    public C83849m0 mo113076r() {
        Context context = this.f238141d;
        try {
            C84185b.m103770c(this.f238147j, true).f245845F = Util.nowMilliSecond();
        } catch (Throwable unused) {
        }
        AppBrandPageContainerWC eVar = mo121254q1() ? new C90670e(context, this) : new AppBrandPageContainerWC(context, this);
        eVar.setDecorWidgetFactory(mo113028S());
        if (!mo121254q1()) {
            eVar.mo116334Y(C90339i.WITH_CONFIRM_DIALOG, new C90327a());
        }
        eVar.mo116334Y(C90339i.SILENT, new C90328b());
        if (this.f238290r1 != null) {
            C81688d0 d0Var = this.f238290r1;
            C83928t1 t1Var = d0Var.f239741g;
            d0Var.f239741g = null;
            if (t1Var != null) {
                if (!(t1Var == null || eVar.getRuntime() == null)) {
                    if (t1Var.mo114272k().compareTo(eVar.getRuntime().mo113184O1(false)) == 0) {
                        synchronized (eVar.f244417V) {
                            ((LinkedList) eVar.f244417V).addLast(t1Var);
                        }
                    } else {
                        throw new IllegalStateException(String.format(Locale.ENGLISH, "stashPreloadedPageView appId[%s] mismatch libReader, runtime[%s] page[%s]", new Object[]{eVar.getAppId(), eVar.getRuntime().mo113184O1(false).mo113377i(), t1Var.mo114272k().mo113377i()}));
                    }
                }
                if (t1Var instanceof C83768b4) {
                    eVar.setWAAutoWebViewJs(((C83768b4) t1Var).f244513p1);
                }
            }
        }
        return eVar;
    }

    /* renamed from: r0 */
    public void mo113077r0(Configuration configuration) {
        super.mo113077r0(configuration);
        this.f238291s1 = new Configuration(configuration);
        this.f238296x1.onConfigurationChanged(configuration);
    }

    /* renamed from: r1 */
    public boolean mo113215r1() {
        return super.mo113215r1();
    }

    /* renamed from: s */
    public C84927e mo113078s(Context context) {
        boolean z = true;
        if (((C32735h) C86312j.m106911c(C32735h.class)).mo58779Qe(C32735h.C32737c.clicfg_android_appbrand_resizable_user_custom_layout, 1) != 1) {
            z = false;
        }
        return (!z || C84684v.isBlackListing() || mo113067m0()) ? new C84927e(context) : super.mo113078s(context);
    }

    /* renamed from: s0 */
    public void mo113079s0() {
        C83226n.m102130g(this.f238147j, KSProcessWeAppLaunch.stepPrepareRuntime);
        C83237l1 l1Var = C83237l1.f243102b;
        l1Var.getClass();
        if (((Boolean) ((C36570n) C83237l1.f243105e).getValue()).booleanValue()) {
            C90590d<AppBrandRuntime> dVar = C83237l1.f243106f;
            dVar.add(this);
            if (dVar.f260295f == 1) {
                C88938b bVar = C88938b.f256497y;
                if (bVar.f256515x) {
                    bVar.mo123321b(l1Var);
                }
            }
        }
        C87690d.m109091b("clearDuplicatedInstanceOnAppCreate", new C84249s1(this));
        C84191e eVar = C84185b.f245912a;
        AppBrandInitConfigWC M1 = mo113210l1();
        QualitySession qualitySession = M1 != null ? M1.f239379j1 : null;
        if (qualitySession != null) {
            C61926c.m72656A((String) null, new C84196g(C81682d.m100223c(), qualitySession, M1));
        }
        C81682d.m100226f(this);
        C91452a.m114755a(this);
        C91456b.f262190a.mo125391b(365, 28);
        mo113207j2();
        this.f238286n1 = C40318k.m43492a().startPerformance(C40318k.m43492a().getHcMiniProgramLaunchEnable(), C40318k.m43492a().getHcMiniProgramLaunchDelay(), C40318k.m43492a().getHcMiniProgramLaunchCPU(), C40318k.m43492a().getHcMiniProgramLaunchIO(), C40318k.m43492a().getHcMiniProgramLaunchThr() ? Process.myTid() : 0, C40318k.m43492a().getHcMiniProgramLaunchTimeout(), C1862l.CTRL_INDEX, C40318k.m43492a().getHcMiniProgramLaunchAction(), "MicroMsg.AppBrandRuntimeWC");
        Log.m105925i("MicroMsg.AppBrandRuntimeWC", "AppBrandRuntimeProfile|onCreate %s, scene:%d, instanceId:%s, sessionId:%s", this, Integer.valueOf(mo113208k1()), mo113210l1().f234838r, mo113210l1().f234837q);
        super.mo113079s0();
        mo113193X1();
        if (mo121254q1()) {
            C81889e d = C81889e.m100570d();
            d.f240194a = this;
            d.f240198e = new C81887c(this);
            d.f240199f = true;
            d.f240201h = ((C32735h) C86312j.m106911c(C32735h.class)).mo58784wf(C32735h.C32737c.clicfg_appbrand_game_predownload, false);
            d.f240195b = new C90322q(d.f240198e, true);
            d.f240202i = new AtomicInteger(0);
            d.f240203j = new AtomicInteger(0);
            d.f240204k = new AtomicInteger(0);
            d.f240205l = new AtomicInteger(0);
            C81889e d2 = C81889e.m100570d();
            List<String> list = mo113210l1().f239390u1;
            d2.getClass();
            if (list != null) {
                ArrayList arrayList = (ArrayList) list;
                if (!arrayList.isEmpty()) {
                    d2.f240200g.addAll(list);
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        String str = (String) it.next();
                        C90322q qVar = d2.f240195b;
                        StringBuilder sb = new StringBuilder();
                        AtomicInteger atomicInteger = C90283e.f259174b;
                        C90283e.C90285b.f259176a.getClass();
                        sb.append(C90283e.f259174b.incrementAndGet());
                        sb.append("");
                        String sb4 = sb.toString();
                        qVar.getClass();
                        JSONObject jSONObject = new JSONObject();
                        Log.m105925i("MicroMsg.AppBrandPreloadNetworkDownload", "doDownloadFileNoCheck taskId:%s url:%s", sb4, str);
                        try {
                            jSONObject.put("url", str);
                        } catch (JSONException unused) {
                        }
                        qVar.mo124552b(jSONObject, CodecError.DEQUEUEOUTPUTBUFFER_ILLEGAL, new HashMap(), (ArrayList<String>) null, 50, new C90321p(qVar, str), sb4, APMidasPayAPI.ENV_TEST);
                    }
                }
            }
        }
        C84185b.m103775h(this);
        C84186b0.f245919a.mo116883k(this.f238147j, C84185b.m103770c(this.f238147j, true).f245832d);
        C84201i.m103807d(this, false, C84788u.m104468b(mo113210l1().f239376g1));
        C88127c a = C88127c.m109723a(this.f238147j);
        String str2 = this.f238147j;
        boolean q1 = mo121254q1();
        a.f254888d = str2;
        Log.m105925i("MicroMsg.MBNiReporter", "hy: appId:%s,isGame:%s", str2, Boolean.valueOf(q1));
        if (q1) {
            C83231l.m102140a(str2, a.f254895k);
        }
        new ArrayList();
        C91667a.m115206b("onCreate", this.f238147j, mo113210l1().f234809M);
        new AppBrandRuntimeSuspendingWatchDog$watch$1(this, C40008f.f107254d).alive();
        mo113013H0(new AppBrandRuntimeWC$$x(this));
        mo113013H0(new AppBrandRuntimeWC$$y(this));
        mo113013H0(new AppBrandRuntimeWC$$a0(this, (C84886w1) null));
        C81688d0 d0Var = new C81688d0(this);
        this.f238290r1 = d0Var;
        mo113013H0(d0Var);
        mo113013H0(new AppBrandRuntimeWC$$c0(this, (C84886w1) null));
        mo113195Z1();
        Map<String, IListener> map = C83626f.f244216a;
        String str3 = this.f238147j;
        C82526a aVar = new C82526a();
        MMToClientEvent.m100655q(str3, aVar);
        this.f238113K.mo122978a(new C82527b(aVar));
        C81559o.m100046s(this);
        mo113059i(C84738g0.C84740b.f247140a);
        OpenBusinessViewUtil.m101151e(this);
        MMToClientEvent.C81947d dVar2 = AppBrandBackgroundRunningMonitor.f239216a;
        Log.m105924i("MicroMsg.AppBrandBackgroundRunningMonitor", "startRuntimeStateMonitor");
        if (!((HashSet) AppBrandBackgroundRunningMonitor.f239219d).add(this.f238147j)) {
            Log.m105924i("MicroMsg.AppBrandBackgroundRunningMonitor", "startRuntimeStateMonitor, already start, return");
        } else {
            Class cls = C81590r.class;
            Log.m105924i("MicroMsg.AppBrandBackgroundRunningMonitor", "startListeningOperationReceivedIfNeed");
            if (AppBrandBackgroundRunningMonitor.f239217b == null) {
                AppBrandBackgroundRunningMonitor.f239217b = new C81581g();
                if (C86312j.m106911c(cls) != null) {
                    ((C81590r) C86312j.m106911c(cls)).mo56708jr(AppBrandBackgroundRunningMonitor.f239217b);
                }
            }
            String str4 = this.f238147j;
            Log.m105925i("MicroMsg.AppBrandBackgroundRunningMonitor", "startListeningOperationEvent, appId:%s", str4);
            if (AppBrandBackgroundRunningMonitor.f239216a == null) {
                AppBrandBackgroundRunningMonitor.f239216a = new C81582h();
            }
            MMToClientEvent.m100655q(str4, AppBrandBackgroundRunningMonitor.f239216a);
            if (1 == ((HashSet) AppBrandBackgroundRunningMonitor.f239219d).size()) {
                Log.m105924i("MicroMsg.AppBrandBackgroundRunningMonitor", "startRuntimeStateMonitor, first start, alive listener");
                AppBrandBackgroundRunningMonitor.f239218c.alive();
            }
            this.f238113K.mo122978a(new C81580f());
        }
        this.f238283k1 = new C84170q();
        C84170q qVar2 = this.f238283k1;
        qVar2.getClass();
        qVar2.f245768a = Util.currentTicks();
        C84174u uVar = new C84174u();
        this.f238268D1 = uVar;
        String str5 = C84185b.m103770c(this.f238147j, true).f245832d;
        String str6 = this.f238147j;
        C87412m.m108594g(str5, "instanceId");
        C87412m.m108594g(str6, "appId");
        uVar.f245825d = Long.valueOf(System.currentTimeMillis());
        uVar.f245824c = str5;
        uVar.f245823b = str6;
        uVar.f245822a = Long.valueOf((long) (mo113210l1().f234841u + 1000));
        C82816p.m101561a(this.f238147j, mo113030T(), mo121253n1());
        this.f238287o1 = mo121253n1().f245533f == 1099;
        if (mo113194Y1()) {
            ((LinkedList) this.f238288p1).add(new C81109a3(mo113210l1()));
        }
        ((LinkedList) this.f238288p1).add(new C84252s3(mo113210l1(), this));
        this.f238113K.mo122978a(new AppBrandRuntimeWC$$f(this));
        if (this.f238142e != null) {
            mo113191V1();
        } else {
            Log.m105929w("MicroMsg.AppBrandRuntimeWC", "onCreate appId:%s, skip initFloatBallHelper(), maybe under preRender mode", this.f238147j);
        }
        if (this.f238142e != null) {
            mo113192W1();
        } else {
            Log.m105929w("MicroMsg.AppBrandRuntimeWC", "onCreate appId:%s, skip initMultiTaskHelper(), maybe under preRender mode", this.f238147j);
        }
        if (mo121254q1()) {
            mo113013H0(new AppBrandRuntimeWC$$g(this));
        }
        QualitySessionRuntime c = C84185b.m103770c(this.f238147j, true);
        if (c != null) {
            c.f245838j = Util.nowMilliSecond();
        }
        if (C81289m.C81290a.m99664b(this.f238149o.f239365g)) {
            C84276a.m103898a(this.f238147j);
        }
        if (!mo113194Y1()) {
            C29633a.m38842a(this.f238147j);
        }
        MultiProcessMMKV.getMMKV("" + this.f238147j + "_wxa_voip").putBoolean("isCameraStart", false);
        Log.m105925i("MicroMsg.AppBrandRuntimeWC", "reset appId:%s isCameraStart false", this.f238147j);
        this.f238270F1 = new C84090r1(this);
        this.f238272H1 = new C84228v(this);
        mo113020N0(new C1754c(this));
        this.f238275K1 = mo113210l1().f234827X0;
    }

    /* renamed from: s1 */
    public boolean mo113216s1() {
        return ((C76630x0) C86312j.m106911c(C76630x0.class)).fn0();
    }

    /* renamed from: t */
    public C81925i2 mo113080t() {
        boolean z = false;
        C88267e eVar = null;
        if (super.mo113215r1()) {
            if (mo121254q1()) {
                C81688d0 d0Var = this.f238290r1;
                C88267e eVar2 = d0Var.f239742h;
                d0Var.f239742h = null;
                if (eVar2 == null) {
                    return new C88734d();
                }
                C84185b.m103770c(this.f238147j, true).f245842C = C84217q.PreloadOnProcessCreated;
                return eVar2;
            }
            if (C81738h0.m100299e(mo113210l1().f234797A).f239909g == 1) {
                z = true;
            }
            return z ? new C88267e() : new C88267e((Class<? extends C91640i<? extends C91635f>>) C81733f0.class);
        } else if (mo113211l2()) {
            C88267e eVar3 = new C88267e(true);
            eVar3.mo114269d0(mo113184O1(false));
            eVar3.mo125518K0(C84217q.CreateOnRuntimeInit);
            return eVar3;
        } else {
            if (this.f238290r1 != null) {
                C81688d0 d0Var2 = this.f238290r1;
                C88267e eVar4 = d0Var2.f239742h;
                d0Var2.f239742h = null;
                eVar = eVar4;
            }
            String str = "WAGame";
            if (eVar != null) {
                Object[] objArr = new Object[3];
                objArr[0] = this.f238147j;
                objArr[1] = mo121254q1() ? str : "WAService";
                objArr[2] = C84185b.m103770c(this.f238147j, true).f245842C.name();
                Log.m105925i("MicroMsg.AppBrandRuntimeWC", "[%s][%s] [applaunch] [preload] createService preloaded, reason=%s", objArr);
            }
            if (eVar != null) {
                return eVar;
            }
            Object[] objArr2 = new Object[2];
            objArr2[0] = this.f238147j;
            if (!mo121254q1()) {
                str = "WAService";
            }
            objArr2[1] = str;
            Log.m105925i("MicroMsg.AppBrandRuntimeWC", "[%s][%s] [applaunch] [preload] createService got no preloaded", objArr2);
            if ((!BuildInfo.IS_FLAVOR_RED && !BuildInfo.DEBUG && !DebuggerShell.f239772d) || !C1971b.m1957c()) {
                return mo121254q1() ? new C88734d() : new C88267e();
            }
            throw new IllegalStateException("[ForcePreload] enabled, but not preload");
        }
    }

    /* renamed from: t0 */
    public void mo113081t0() {
        C81855i iVar;
        C84228v vVar;
        WeAppQualityCloseBeforeReadyStruct weAppQualityCloseBeforeReadyStruct;
        Class cls = C81607h.class;
        C84218r.m103813c(this.f238147j, 5);
        if (mo113210l1().f239392w1 != null) {
            WeAppOpenUICallbackIPCProxy weAppOpenUICallbackIPCProxy = mo113210l1().f239392w1;
            boolean z = mo113026R() != null && mo113026R().isFinishing();
            if (!weAppOpenUICallbackIPCProxy.f243390h) {
                weAppOpenUICallbackIPCProxy.f243387e.mo111345a(new IPCBoolean(z));
            }
        }
        super.mo113081t0();
        C88267e eVar = (C88267e) this.f238150p;
        HashMap<String, MMToClientEvent> hashMap = MMToClientEvent.f240339q;
        if (eVar != null) {
            MMToClientEvent.m100658v(eVar.getAppId());
        }
        MMToClientEvent.m100658v("Common_IPC_appid");
        LinkedHashMap<C91452a.C91454b, Boolean> linkedHashMap = C91452a.f262181f;
        synchronized (linkedHashMap) {
            Boolean remove = linkedHashMap.remove(C91452a.C91454b.f262183j.mo125389a(this));
        }
        C84191e eVar2 = C84185b.f245912a;
        QualitySessionRuntime c = C84185b.m103770c(this.f238147j, false);
        if (!(c == null || (weAppQualityCloseBeforeReadyStruct = c.f245848I) == null)) {
            weAppQualityCloseBeforeReadyStruct.f236774d = weAppQualityCloseBeforeReadyStruct.mo86045b("InstanceId", c.f245832d, true);
            weAppQualityCloseBeforeReadyStruct.f236775e = weAppQualityCloseBeforeReadyStruct.mo86045b("AppId", c.f245833e, true);
            weAppQualityCloseBeforeReadyStruct.f236776f = (long) c.f245837i;
            int i = c.f245834f;
            weAppQualityCloseBeforeReadyStruct.f236777g = i != 1 ? i != 2 ? i != 3 ? null : WeAppQualityCloseBeforeReadyStruct.C80764a.demo : WeAppQualityCloseBeforeReadyStruct.C80764a.debug : WeAppQualityCloseBeforeReadyStruct.C80764a.release;
            weAppQualityCloseBeforeReadyStruct.f236778h = (long) c.f245835g;
            weAppQualityCloseBeforeReadyStruct.f236780j = (long) c.f245836h;
            weAppQualityCloseBeforeReadyStruct.f236783m = weAppQualityCloseBeforeReadyStruct.mo86045b("username", mo113210l1().f234839s, true);
            weAppQualityCloseBeforeReadyStruct.f236784n = c.f245850K ? 1 : 0;
            weAppQualityCloseBeforeReadyStruct.f236785o = c.mo116871a();
            weAppQualityCloseBeforeReadyStruct.f236786p = weAppQualityCloseBeforeReadyStruct.mo86045b("networkType", C84116i0.m103659b(MMApplicationContext.getContext()), true);
            weAppQualityCloseBeforeReadyStruct.f236787q = mo113210l1().f234825W0 ? 1 : 0;
            weAppQualityCloseBeforeReadyStruct.f236788r = c.f245849J ? 1 : 0;
            long j = c.f245855p;
            weAppQualityCloseBeforeReadyStruct.f236781k = j;
            weAppQualityCloseBeforeReadyStruct.mo86048e("StartTimeStampMs", j);
            long nowMilliSecond = Util.nowMilliSecond();
            weAppQualityCloseBeforeReadyStruct.f236782l = nowMilliSecond;
            weAppQualityCloseBeforeReadyStruct.mo86048e("EndTimeStampMs", nowMilliSecond);
            long j2 = weAppQualityCloseBeforeReadyStruct.f236782l - weAppQualityCloseBeforeReadyStruct.f236781k;
            weAppQualityCloseBeforeReadyStruct.f236779i = j2;
            weAppQualityCloseBeforeReadyStruct.mo86046c("CostTimeMs", j2);
            weAppQualityCloseBeforeReadyStruct.f236792v = c.f245851L ? 1 : 0;
            weAppQualityCloseBeforeReadyStruct.f236793w = c.f245852M ? 1 : 0;
            if (c.f245861v != null) {
                weAppQualityCloseBeforeReadyStruct.f236789s = 1;
            } else {
                weAppQualityCloseBeforeReadyStruct.f236789s = 0;
            }
            C79575q qVar = this.f238294v1;
            weAppQualityCloseBeforeReadyStruct.f236790t = (long) (qVar != null ? qVar.f233334e : 9);
            weAppQualityCloseBeforeReadyStruct.f236791u = (long) C27903c.m38029b();
            weAppQualityCloseBeforeReadyStruct.mo86054n();
            if (Log.getLogLevel() >= 2) {
                Log.m105924i("MicroMsg.AppBrandQualitySystem", "onRuntimeDestroy report 18033 " + weAppQualityCloseBeforeReadyStruct.mo1006q());
            }
        }
        C83237l1 l1Var = C83237l1.f243102b;
        l1Var.getClass();
        if (((Boolean) ((C36570n) C83237l1.f243105e).getValue()).booleanValue()) {
            l1Var.mo115473d(this);
        }
        if (this.f238286n1 != 0) {
            C40318k.m43492a().stopPerformance(C40318k.m43492a().getHcMiniProgramLaunchEnable(), this.f238286n1);
            this.f238286n1 = 0;
        }
        if (DebuggerShell.f239772d) {
            MTimerHandler mTimerHandler = this.f238289q1;
            if (mTimerHandler != null) {
                mTimerHandler.stopTimer();
            }
            ((C119157j) C119157j.f356862d).mo183875f(new AppBrandRuntimeWC$$k(this));
            AppBrandPerformanceManager.m103498g(this.f238147j);
            String str = this.f238147j;
            String[] strArr = C81734g.f239854a;
            for (int i2 = 0; i2 < 3; i2++) {
                String str2 = str + "-" + strArr[i2];
                String string = MultiProcessMMKV.getMMKV("MicroMsg.AppBrand.ForceOpenAppNotify.TestInjectJsPath", 2).getString(str2, (String) null);
                if (!TextUtils.isEmpty(string)) {
                    C86013q1.m106447h(string);
                }
                MultiProcessMMKV.getMMKV("MicroMsg.AppBrand.ForceOpenAppNotify.TestInjectJsPath", 2).remove(str2);
            }
        }
        if (mo121254q1()) {
            synchronized (C81889e.class) {
                if (C81889e.f240193m != null && C81889e.f240193m.f240194a == this) {
                    if (C81889e.f240193m.f240195b != null) {
                        C81889e.f240193m.f240195b.mo124553c();
                        C81889e.f240193m.f240195b = null;
                        C81889e.f240193m.f240198e = null;
                        C81889e.f240193m.f240196c = null;
                        C81889e.f240193m.f240197d = null;
                        C81889e.f240193m.f240194a = null;
                    }
                    C81889e.f240193m.f240199f = false;
                }
            }
        }
        AppBrandMusicClientService appBrandMusicClientService = AppBrandMusicClientService.f244185c;
        appBrandMusicClientService.f244186a.clear();
        appBrandMusicClientService.f244187b = "";
        String str3 = this.f238147j;
        Map<String, C84072q1> map = C84072q1.f245455s;
        if (!Util.isNullOrNil(str3)) {
            Map<String, C84072q1> map2 = C84072q1.f245455s;
            synchronized (map2) {
                ((C111059i) map2).remove(str3);
            }
        }
        C83626f.m102664a();
        mo113196a2(true);
        C83818i iVar2 = this.f238267C1;
        if (iVar2 != null) {
            C83818i.C83819a aVar = iVar2.f244674c;
            Collection<LinkedList<View>> values = aVar.f244675a.values();
            C87412m.m108593f(values, "mMap.values");
            for (LinkedList clear : values) {
                clear.clear();
            }
            aVar.f244675a.clear();
        }
        C81682d.m100221a(this);
        C84170q qVar2 = this.f238283k1;
        if (qVar2 != null) {
            qVar2.f245775h = mo113210l1().f234837q;
            C84072q1.m103587b(this.f238147j);
            qVar2.f245770c = C84116i0.m103659b(MMApplicationContext.getContext());
            qVar2.f245771d = this.f238147j;
            qVar2.f245772e = mo113213o1() == null ? mo113210l1().f234802F : mo113213o1().f261072r.pkgVersion;
            qVar2.f245773f = this.f238149o.f239365g + 1;
            qVar2.f245774g = mo113208k1();
            qVar2.f245776i = qVar2.f245769b ? 1 : 0;
            qVar2.f245777j = Util.ticksToNow(qVar2.f245768a);
            qVar2.f245778k = Util.nowMilliSecond();
            qVar2.f245779l = mo113210l1().f234839s;
            QualitySessionRuntime c2 = C84185b.m103770c(this.f238147j, true);
            qVar2.f245780m = (long) c2.f245835g;
            qVar2.f245781n = c2.f245832d;
            qVar2.mo116844a();
            if (C86666i.m107491a(this.f238147j, this.f238149o.f239365g)) {
                C115669n.INSTANCE.mo175911u(C82260t.CTRL_INDEX, 51);
            }
        }
        this.f238283k1 = null;
        this.f238285m1 = false;
        if (this.f238290r1 != null) {
            C81688d0 d0Var = this.f238290r1;
            C88267e eVar3 = d0Var.f239742h;
            if (eVar3 != null) {
                eVar3.mo114329F();
                d0Var.f239742h = null;
            }
            C83928t1 t1Var = d0Var.f239741g;
            if (t1Var != null) {
                t1Var.mo114329F();
                d0Var.f239741g = null;
            }
        }
        this.f238290r1 = null;
        C79575q qVar3 = this.f238294v1;
        if (qVar3 != null) {
            Log.m105924i("MicroMsg.AppBrandSplashAdLogic[AppBrandSplashAd]", "onDestroy");
            qVar3.mo109694m("onDestroy");
            this.f238294v1 = null;
        }
        C88127c.m109724b(this.f238147j);
        ((LinkedBlockingQueue) this.f238278N1).clear();
        ((LinkedList) this.f238288p1).clear();
        IListener<NotifyWxaCommLibUpdatedEvent> iListener = this.f238269E1;
        if (iListener != null) {
            iListener.dead();
            iVar = null;
            this.f238269E1 = null;
        } else {
            iVar = null;
        }
        C81855i iVar3 = this.f238292t1;
        if (iVar3 != null) {
            iVar3.mo114251b(this);
            this.f238292t1 = iVar;
        }
        this.f238282j1.mo123388a();
        boolean z2 = C87027l.f252546a;
        C81546b bVar = this.f238295w1;
        if (bVar != null) {
            bVar.mo113815d(this);
        }
        this.f238265A1.mo117751d();
        HalfScreenManger halfScreenManger = this.f238298z1;
        halfScreenManger.getClass();
        Log.m105924i("MicroMsg.HalfScreenManger", "[onRuntimeDestroy] setCapsuleBarBackgroundRenderer null");
        halfScreenManger.mo117790m((AppBrandGlobalNativeWidgetContainerView.C84915a) null);
        if (halfScreenManger.mo117782e().mo76931c()) {
            halfScreenManger.mo117789l();
        }
        this.f238270F1 = null;
        this.f238271G1.clear();
        try {
            C84228v vVar2 = this.f238272H1;
            if (vVar2 != null) {
                C84223s sVar = vVar2.f246041d;
                if (sVar.f246013b) {
                    try {
                        C53930o0.m60558e(sVar.f246020i, (CancellationException) null, 1, (Object) null);
                    } catch (Throwable th) {
                        th = th;
                        vVar = null;
                        this.f238272H1 = vVar;
                        throw th;
                    }
                }
                C91456b.f262191b.remove(vVar2);
            }
            this.f238272H1 = null;
            synchronized (this.f238273I1) {
                try {
                    if (this.f238274J1 != null) {
                        C89717d dVar = this.f238274J1;
                        dVar.getClass();
                        Log.m105924i("MicroMsg.AppBrand.SecuritySnapshotContext", "destroy for " + dVar.f258002a.f238147j);
                        dVar.mo124025b(true);
                    }
                    this.f238274J1 = null;
                } catch (Throwable th4) {
                    this.f238274J1 = null;
                    throw th4;
                }
            }
            JsApiOperateWXData.m100836B(this.f238147j);
            C79706a aVar2 = (C79706a) mo113027R0(C79706a.class);
            if (aVar2 != null) {
                aVar2.mo109819a();
            }
            if (C86312j.m106911c(cls) != null) {
                ((C81607h) C86312j.m106911c(cls)).mo56718bl();
            }
            C29320c.f80053i.mo56599a(new C77710q(mo113210l1().f234818T).longValue(), this.f238147j);
            AppBrandGlobalNativeWidgetContainerView appBrandGlobalNativeWidgetContainerView = this.f238123S0;
            if (appBrandGlobalNativeWidgetContainerView != null) {
                C91521g.f262330p.mo125435a(appBrandGlobalNativeWidgetContainerView);
            }
            mo113206i2(AppBrandRuntimeWC$$z.OnDestroy);
        } catch (Throwable th5) {
            th = th5;
            vVar = null;
        }
    }

    public String toString() {
        return String.format(Locale.ENGLISH, "[AppBrandRuntimeWC::%s::%s::%d::@%d]", new Object[]{this.f238147j, mo113177I1(), Integer.valueOf(this.f238149o.f239365g), Integer.valueOf(hashCode())});
    }

    /* renamed from: v0 */
    public void mo113085v0() {
        super.mo113085v0();
        Log.m105925i("MicroMsg.AppBrandRuntimeWC", "[ILaunchWxaAppInfoNotify] onInitBeforeComponentsInstalled, appId[%s] mPendingPermissionUpdateTasks.size=%d", this.f238147j, Integer.valueOf(this.f238278N1.size()));
        while (!this.f238278N1.isEmpty()) {
            this.f238278N1.remove().run();
        }
        if (this.f238117P || mo113064k0()) {
            Log.m105929w("MicroMsg.AppBrandRuntimeWC", "[ILaunchWxaAppInfoNotify] onInitBeforeComponentsInstalled, appId[%s], may be finish by launch", this.f238147j);
            return;
        }
        if (mo113213o1().f234856A.f234899h) {
            mo113197b2();
        }
        C83226n.m102128e(this.f238147j, KSProcessWeAppLaunch.stepPrepareRuntime);
        C83226n.m102130g(this.f238147j, KSProcessWeAppLaunch.stepInitRuntimeGroup);
        C83226n.m102130g(this.f238147j, KSProcessWeAppLaunch.stepInitRuntimeGroup_Game);
        if (mo113211l2()) {
            this.f238280P1 = new C88926i();
        }
    }

    /* renamed from: v1 */
    public void mo113218v1() {
        C88435b0.C34216b bVar;
        boolean z;
        C81634a F = mo113008F();
        mo113052e("provideAppConfig", new Object[0]);
        String l = C81247g3.m99556l(this, "/app-config.json");
        if (Util.isNullOrNil(l)) {
            Iterator<ModulePkgInfo> it = mo113213o1().f261072r.f238588g.iterator();
            while (it.hasNext()) {
                ModulePkgInfo next = it.next();
                if (next.independent) {
                    StringBuilder sb = new StringBuilder();
                    sb.append(next.name);
                    sb.append(next.name.endsWith("/") ? "" : "/");
                    sb.append("app-config.json");
                    l = C81247g3.m99556l(this, sb.toString());
                    if (!Util.isNullOrNil(l)) {
                        break;
                    }
                }
            }
        }
        String l2 = C81247g3.m99556l(this, "/app-config-darkmode.json");
        if (TextUtils.isEmpty(l) && TextUtils.isEmpty(l2)) {
            C83606m1.m102638b(51, mo113210l1());
        }
        if (TextUtils.isEmpty(l2)) {
            l2 = "{}";
        }
        C81634a h = C81634a.m100133h(this.f238147j, l, l2, Boolean.parseBoolean(mo113184O1(true).Yk0("pruneWxConfigByPage")), mo121254q1());
        C90987k kVar = (C90987k) mo113021O(C90987k.class, false);
        if (kVar != null) {
            C81301p0 k = C81247g3.m99555k(this, false);
            C87412m.m108594g(k, "reader");
            LinkedList<String> linkedList = new LinkedList<>();
            synchronized (kVar.f261058d) {
                kVar.f261059e = h;
                kVar.f261060f = k;
                linkedList.addAll(kVar.f261058d);
            }
            for (String a : linkedList) {
                kVar.mo125061a(h, k, a);
            }
        }
        if (!mo121254q1()) {
            h.f239611q.f239621a = mo113210l1().f239366h;
            h.f239611q.f239622b = true;
        } else if (!h.f239613s.booleanValue()) {
            h.f239611q.f239621a = mo113210l1().f234804H.f239456h;
        }
        if (C83608m4.m102642a(this)) {
            h.f239611q.f239621a = "portrait";
        }
        ((AppBrandRuntime$$h) this.f238104B).add(h);
        mo113209k2();
        if (mo121254q1()) {
            C81889e d = C81889e.m100570d();
            Class cls = C90272a.class;
            if (d.f240199f) {
                d.f240198e.f240190e.addAll(d.f240194a.f238104B);
                d.f240196c = (C90272a) d.f240194a.mo113018M(cls);
                d.f240197d = (C82419d1) d.f240194a.f238163z;
                C90322q qVar = d.f240195b;
                C90272a aVar = (C90272a) qVar.f259289g.mo109671p(cls);
                qVar.f259283a = aVar.f259136p;
                qVar.f259287e = aVar.f259120B;
                qVar.f259286d = C90309m.m113081p(aVar);
            }
            mo113022O0(new C84805v1(this));
        }
        int i = 3;
        if (Util.isNullOrNil(this.f238147j) || mo113008F() == null) {
            Log.m105924i("MicroMsg.AppBrandBackgroundConfigStorage", "updateBackgroundConfigs, runtime or appId or appConfig is null");
        } else {
            String str = this.f238147j;
            C81634a F2 = mo113008F();
            boolean a2 = C81289m.C81290a.m99663a(mo113213o1().f261072r.f238585d);
            boolean contains = ((HashSet) F2.f239614t).contains(FirebaseAnalytics.C113379b.LOCATION);
            MultiProcessMMKV.getMMKV("appbrand_background_config").encode(String.format("%s_location_background_required", new Object[]{str}), contains);
            MultiProcessMMKV.getMMKV("appbrand_background_config").encode(String.format("%s_bluetooth_background_required", new Object[]{str}), ((HashSet) F2.f239614t).contains("bluetooth"));
            C81634a.C81640f fVar = (C81634a.C81640f) ((HashMap) F2.f239607j).get("scope.userLocation");
            if (fVar == null || Util.isNullOrNil(fVar.f239629b)) {
                MultiProcessMMKV.getMMKV("appbrand_background_config").remove(String.format("%s_permission_location_desc", new Object[]{str}));
                z = false;
            } else {
                MultiProcessMMKV.getMMKV("appbrand_background_config").encode(String.format("%s_permission_location_desc", new Object[]{str}), fVar.f239629b);
                z = true;
            }
            Log.m105925i("MicroMsg.AppBrandBackgroundConfigStorage", "updateBackgroundConfigs, appId:%s, isDebug:%s, isLocationBackgroundRequired:%s, hasPermissionLocationDesc:%s", str, Boolean.valueOf(a2), Boolean.valueOf(contains), Boolean.valueOf(z));
        }
        C53173v vVar = C53173v.f148355a;
        if (Util.isNullOrNil(this.f238147j) || mo113008F() == null) {
            Log.m105924i("Luggage.RequirePrivateInfoLogic", "updatePrivateInfos, runtime or appId or appConfig is null");
        } else {
            String str2 = this.f238147j;
            C81634a F3 = mo113008F();
            Set<String> set = F3.f239620z;
            C87412m.m108593f(set, "appConfig.requiredPrivateInfos");
            if (!(!((HashSet) set).isEmpty())) {
                i = 0;
            } else if (!((HashSet) F3.f239620z).contains(C82604q.NAME)) {
                i = 2;
            }
            Log.m105919d("Luggage.RequirePrivateInfoLogic", "updatePrivateInfos %d %s", Integer.valueOf(((HashSet) F3.f239620z).size()), F3.f239620z.toString());
            Log.m105925i("Luggage.RequirePrivateInfoLogic", "updatePrivateInfos %s, %d", str2, Integer.valueOf(i));
            String format = String.format(C53173v.f148357c, Arrays.copyOf(new Object[]{str2}, 1));
            C87412m.m108593f(format, "format(format, *args)");
            ((MultiProcessMMKV) ((C36570n) C53173v.f148356b).getValue()).encode(format, i);
        }
        if (!(F == null || ((C88267e) this.f238150p) == null)) {
            Log.m105924i("MicroMsg.AppBrandRuntimeWC", "resetAppConfig, onUpdateWXConfig");
            C79587a aVar2 = new C79587a();
            aVar2.f242407f = ((C88267e) this.f238150p).mo114340k0().toString();
            aVar2.mo115161k((C88267e) this.f238150p);
            aVar2.mo115158h();
        }
        if (!mo121254q1() && C90595a.m113498b(mo113008F().f239619y.f239631b, "skyline")) {
            int i2 = C81207z0.f238545a;
            Log.m105924i("MicroMsg.MMSkylineBootGuard", "<clinit>");
            C88435b0 b0Var = new C88435b0(this, mo113008F(), BuildInfo.IS_FLAVOR_RED || BuildInfo.DEBUG || ("wxb1320569c2a2b6d2".equals(this.f238147j) && 1190 == mo113208k1() && C29611p4.m38833a()));
            ((AppBrandRuntime$$h) this.f238104B).add(b0Var);
            if (b0Var.f255443e && b0Var.f255445g && b0Var.f255446h && (bVar = b0Var.f255444f) != null && bVar.f92266c != null) {
                QualitySessionRuntime a3 = C84185b.m103768a(this);
                ICommLibReader O1 = mo113184O1(false);
                if (a3 != null && O1 != null) {
                    for (C88435b0.C34217c next2 : bVar.f92266c) {
                        wxa_expt_hitStruct wxa_expt_hitstruct = new wxa_expt_hitStruct();
                        wxa_expt_hitstruct.f237501d = wxa_expt_hitstruct.mo86045b("AppId", this.f238147j, true);
                        wxa_expt_hitstruct.f237502e = (long) a3.f245837i;
                        wxa_expt_hitstruct.f237503f = (long) a3.f245834f;
                        wxa_expt_hitstruct.f237504g = wxa_expt_hitstruct.mo86045b("libVersion", O1.mo113377i(), true);
                        wxa_expt_hitstruct.f237505h = wxa_expt_hitstruct.mo86045b("libUpdateTime", O1.mo113378ld(), true);
                        wxa_expt_hitstruct.f237506i = next2.f92268b;
                        String str3 = next2.f92269c;
                        wxa_expt_hitstruct.f237507j = wxa_expt_hitstruct.mo86045b("exptParam", str3 != null ? C117627q.m165908a(str3) : null, true);
                        wxa_expt_hitstruct.f237508k = 3;
                        wxa_expt_hitstruct.f237509l = a3.f245849J ? 1 : 2;
                        wxa_expt_hitstruct.mo86054n();
                    }
                }
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:29:0x0171  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x019b  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x01b7  */
    /* JADX WARNING: Removed duplicated region for block: B:54:? A[RETURN, SYNTHETIC] */
    /* renamed from: w0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo113087w0() {
        /*
            r13 = this;
            super.mo113087w0()
            r13.mo113174E1()
            com.tencent.mm.plugin.appbrand.config.AppBrandInitConfigWC r0 = r13.mo113210l1()
            if (r0 == 0) goto L_0x0011
            fc.i<com.tencent.mm.plugin.appbrand.config.AppBrandInitConfigWC> r1 = r13.f238296x1
            r1.init(r0)
        L_0x0011:
            com.tencent.mm.plugin.appbrand.b r1 = new com.tencent.mm.plugin.appbrand.b
            r1.<init>()
            r13.f238295w1 = r1
            ai0.q r9 = new ai0.q
            r9.<init>(r13, r1)
            r13.f238294v1 = r9
            com.tencent.mm.plugin.appbrand.AppBrandRuntimeWC r1 = r9.f233331b
            boolean r1 = r1.mo113038X()
            java.lang.String r2 = "MicroMsg.AppBrandSplashAdLogic[AppBrandSplashAd]"
            r10 = 0
            r11 = 1
            r12 = 0
            if (r1 == 0) goto L_0x0135
            com.tencent.mm.plugin.appbrand.AppBrandRuntimeWC r1 = r9.f233331b
            ai0.o$a r3 = ai0.C79570o.f233322c
            r3.mo109681a(r1)
            com.tencent.mm.plugin.appbrand.AppBrandRuntimeWC r1 = r9.f233331b
            com.tencent.mm.plugin.appbrand.config.AppBrandInitConfigWC r1 = r1.mo113210l1()
            boolean r1 = r1.mo111300k()
            com.tencent.mm.plugin.appbrand.task.y r1 = com.tencent.p014mm.plugin.appbrand.task.C84343y.m103969a(r1)
            kr0.e r1 = com.tencent.p014mm.plugin.appbrand.task.C84331q.m103952g(r1)
            r9.f233332c = r1
            r1 = 2
            java.lang.Object[] r4 = new java.lang.Object[r1]
            com.tencent.mm.plugin.appbrand.AppBrandRuntimeWC r5 = r9.f233331b
            java.lang.String r5 = r5.f238147j
            r4[r12] = r5
            kr0.e r5 = r9.f233332c
            r4[r11] = r5
            java.lang.String r5 = "sendShouldShowAdWhenLaunchIfNeed, appId:%s, may show ad, preloadedService:%s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r2, r5, r4)
            com.tencent.mm.autogen.mmdata.rpt.AppBrandSplashAdWorkerReportStruct r4 = new com.tencent.mm.autogen.mmdata.rpt.AppBrandSplashAdWorkerReportStruct
            r4.<init>()
            long r5 = com.tencent.p014mm.sdk.platformtools.Util.nowMilliSecond()
            r4.f236346f = r5
            com.tencent.mm.plugin.appbrand.AppBrandRuntimeWC r5 = r9.f233331b
            java.lang.String r5 = r5.f238147j
            java.lang.String r6 = "Appid"
            java.lang.String r5 = r4.mo86045b(r6, r5, r11)
            r4.f236344d = r5
            com.tencent.mm.plugin.appbrand.AppBrandRuntimeWC r5 = r9.f233331b
            java.lang.String r6 = "runtime"
            gy3.C87412m.m108594g(r5, r6)
            ai0.o r3 = r3.mo109681a(r5)
            r3.f233326b = r4
            kr0.e r3 = r9.f233332c
            if (r3 == 0) goto L_0x0101
            com.tencent.mm.plugin.appbrand.AppBrandRuntimeWC r3 = r9.f233331b
            ai0.d r3 = ai0.C79570o.m96621a(r3)
            r3.f233285s = r1
            kr0.e r1 = r9.f233332c
            com.tencent.mm.plugin.appbrand.q2 r1 = r1.mo114347r0()
            gu0.b r1 = r1.f245481f
            com.tencent.mm.appbrand.v8.j r3 = r1.f253237b
            if (r3 != 0) goto L_0x0098
            r1 = r10
        L_0x0098:
            if (r1 == 0) goto L_0x009f
            com.tencent.mm.plugin.appbrand.b r3 = r9.f233333d
            r3.mo113818g(r1)
        L_0x009f:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r5 = "sendShouldShowAdWhenLaunchIfNeed, obtainWorkerAsync when preloaded launch adWorker isnull="
            r3.append(r5)
            if (r1 != 0) goto L_0x00ae
            r5 = 1
            goto L_0x00af
        L_0x00ae:
            r5 = 0
        L_0x00af:
            r3.append(r5)
            java.lang.String r3 = r3.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r3)
            if (r1 != 0) goto L_0x00cd
            long r1 = com.tencent.p014mm.sdk.platformtools.Util.nowMilliSecond()
            com.tencent.mm.plugin.appbrand.b r3 = r9.f233333d
            ai0.r r5 = new ai0.r
            r5.<init>(r9, r4, r1)
            r3.mo113817f(r5)
            r9.mo109693l()
            goto L_0x00ed
        L_0x00cd:
            r9.mo109693l()
            com.tencent.mm.appbrand.v8.j r2 = r1.f253237b
            java.lang.String r3 = "engine"
            gy3.C87412m.m108594g(r2, r3)
            com.tencent.mm.plugin.appbrand.a r3 = new com.tencent.mm.plugin.appbrand.a
            r3.<init>(r2)
            kr0.e r2 = r9.f233332c
            com.tencent.mm.plugin.appbrand.AppBrandRuntimeWC r5 = r9.f233331b
            r9.mo109691j(r3, r2, r5)
            rx3.l<java.lang.Long, java.lang.Long> r3 = r1.f253238c
            r5 = 1
            r6 = 0
            r8 = 0
            r2 = r9
            r2.mo109685c(r3, r4, r5, r6, r8)
        L_0x00ed:
            com.tencent.mm.plugin.appbrand.AppBrandRuntimeWC r1 = r9.f233331b
            boolean r2 = r1.mo121254q1()
            com.tencent.mm.plugin.appbrand.task.y r2 = com.tencent.p014mm.plugin.appbrand.task.C84343y.m103969a(r2)
            com.tencent.mm.plugin.appbrand.task.q$$f r3 = com.tencent.p014mm.plugin.appbrand.task.C84331q.f246221a
            com.tencent.mm.plugin.appbrand.task.q$$h r2 = r3.mo117027a(r2)
            ai0.C79553f.m96595b(r1, r2, r11)
            goto L_0x015b
        L_0x0101:
            boolean r1 = r9.f233330a
            if (r1 == 0) goto L_0x0121
            java.lang.String r1 = "sendShouldShowAdWhenLaunchIfNeed, [not preload] waiting ad worker ready"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r1)
            long r5 = com.tencent.p014mm.sdk.platformtools.Util.nowMilliSecond()
            com.tencent.mm.plugin.appbrand.AppBrandRuntimeWC r1 = r9.f233331b
            ai0.d r1 = ai0.C79570o.m96621a(r1)
            r1.f233285s = r11
            com.tencent.mm.plugin.appbrand.b r1 = r9.f233333d
            ai0.s r3 = new ai0.s
            r3.<init>(r9, r4, r5)
            r1.mo113817f(r3)
        L_0x0121:
            com.tencent.mm.plugin.appbrand.AppBrandRuntimeWC r1 = r9.f233331b
            boolean r3 = r1.mo121254q1()
            com.tencent.mm.plugin.appbrand.task.y r3 = com.tencent.p014mm.plugin.appbrand.task.C84343y.m103969a(r3)
            com.tencent.mm.plugin.appbrand.task.q$$f r4 = com.tencent.p014mm.plugin.appbrand.task.C84331q.f246221a
            com.tencent.mm.plugin.appbrand.task.q$$h r3 = r4.mo117027a(r3)
            ai0.C79553f.m96595b(r1, r3, r12)
            goto L_0x0148
        L_0x0135:
            com.tencent.mm.plugin.appbrand.AppBrandRuntimeWC r1 = r9.f233331b
            boolean r3 = r1.mo121254q1()
            com.tencent.mm.plugin.appbrand.task.y r3 = com.tencent.p014mm.plugin.appbrand.task.C84343y.m103969a(r3)
            com.tencent.mm.plugin.appbrand.task.q$$f r4 = com.tencent.p014mm.plugin.appbrand.task.C84331q.f246221a
            com.tencent.mm.plugin.appbrand.task.q$$h r3 = r4.mo117027a(r3)
            ai0.C79553f.m96595b(r1, r3, r12)
        L_0x0148:
            r9.mo109693l()
            java.lang.Object[] r1 = new java.lang.Object[r11]
            com.tencent.mm.plugin.appbrand.AppBrandRuntimeWC r3 = r9.f233331b
            java.lang.String r3 = r3.f238147j
            r1[r12] = r3
            java.lang.String r3 = "sendShouldShowAdWhenLaunchIfNeed, appId:%s, can not show ad"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r2, r3, r1)
            r9.f233334e = r12
        L_0x015b:
            com.tencent.mm.plugin.appbrand.report.d0 r1 = r13.f238297y1
            com.tencent.mm.plugin.appbrand.config.AppBrandInitConfigWC r2 = r13.mo113210l1()
            r1.getClass()
            java.lang.String r3 = "initConfig"
            gy3.C87412m.m108594g(r2, r3)
            com.tencent.mm.plugin.appbrand.config.HalfScreenConfig r3 = r2.f234815R0
            boolean r3 = r3.mo76931c()
            if (r3 == 0) goto L_0x017e
            r1.mo116783a(r12)
            com.tencent.luggage.sdk.launching.h r3 = r2.f234829Y0
            com.tencent.luggage.sdk.launching.h r4 = com.tencent.luggage.sdk.launching.C80247h.PRE_RENDER
            if (r3 == r4) goto L_0x017e
            r3 = 5
            r1.mo116783a(r3)
        L_0x017e:
            com.tencent.mm.plugin.appbrand.config.HalfScreenConfig r2 = r2.f234815R0
            boolean r2 = r2.mo76931c()
            r1.f245577b = r2
            com.tencent.mm.plugin.appbrand.widget.halfscreen.HalfScreenManger r1 = r13.f238298z1
            r1.getClass()
            java.lang.String r2 = "MicroMsg.HalfScreenManger"
            java.lang.String r3 = "[onRuntimeLaunch]"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r3)
            r1.mo117796s()
            boolean r1 = r13.mo113038X()
            if (r1 == 0) goto L_0x01a3
            ai0.q r1 = r13.f238294v1
            if (r1 == 0) goto L_0x01a0
            goto L_0x01a1
        L_0x01a0:
            r11 = 0
        L_0x01a1:
            if (r11 == 0) goto L_0x01cc
        L_0x01a3:
            if (r0 == 0) goto L_0x01cc
            boolean r1 = r0.mo111300k()
            if (r1 == 0) goto L_0x01cc
            java.lang.String r1 = r0.f239366h
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            if (r1 != 0) goto L_0x01cc
            com.tencent.mm.plugin.appbrand.e3 r1 = r13.f238142e
            if (r1 == 0) goto L_0x01cc
            java.lang.String r0 = r0.f239366h
            br0.e$b r0 = br0.C79778e.C79780b.m96933b(r0)
            br0.c r1 = r13.mo113054f0()
            br0.e r1 = r1.getOrientationHandler()
            if (r0 != 0) goto L_0x01c9
            br0.e$b r0 = br0.C79778e.C79780b.PORTRAIT
        L_0x01c9:
            r1.mo109918b(r0, r10)
        L_0x01cc:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.appbrand.AppBrandRuntimeWC.mo113087w0():void");
    }

    /* renamed from: w1 */
    public boolean mo113219w1(AppBrandInitConfig appBrandInitConfig) {
        AppBrandInitConfigWC appBrandInitConfigWC = (AppBrandInitConfigWC) appBrandInitConfig;
        AppBrandStatObject f = appBrandInitConfigWC.mo111295f();
        boolean z = false;
        if (this.f238287o1 || f.f245533f == 1099) {
            Log.m105925i("MicroMsg.AppBrandRuntimeWC", "shouldRelaunch return true. appId[%s] mShouldRelaunchCausedByFunctionalPageOpen[%b] newScene[%d]", mo113012H(), Boolean.valueOf(this.f238287o1), Integer.valueOf(f.f245533f));
            if (f.f245533f == 1099) {
                z = true;
            }
            this.f238287o1 = z;
            return true;
        } else if (TextUtils.isEmpty(appBrandInitConfigWC.f239367i) && C81552b3.m100042a(this)) {
            Log.m105925i("MicroMsg.AppBrandRuntimeWC", "shouldRelaunch return true. appId[%s] enterPath[%s], old is gameFunctionalPage", mo113012H(), appBrandInitConfigWC.f239367i);
            return true;
        } else if (1038 == f.f245533f) {
            Log.m105925i("MicroMsg.AppBrandRuntimeWC", "shouldRelaunch return false. appId[%s], reason=1038 back from other MiniProgram", mo113012H());
            return false;
        } else {
            if (appBrandInitConfigWC.f234816S) {
                AppBrandInitConfigWC M1 = mo113210l1();
                Objects.requireNonNull(M1);
                String currentUrl = mo113212m1().getCurrentUrl();
                if (((Boolean) new AppBrandRuntimeWC$$c(appBrandInitConfigWC, currentUrl, M1).invoke()).booleanValue()) {
                    Log.m105925i("MicroMsg.AppBrandRuntimeWC", "shouldRelaunch return false. appId:%s, by forceIndexNoReLaunch, newUrl:%s, oldUrl:%s, currentUrl:%s, newMode:%d, oldMode:%d", mo113012H(), appBrandInitConfigWC.f239367i, M1.f239367i, currentUrl, Integer.valueOf(appBrandInitConfigWC.f234813Q0), Integer.valueOf(M1.f234813Q0));
                    return false;
                }
            }
            Assert.assertNotSame(C80247h.HEADLESS, appBrandInitConfigWC.f234829Y0);
            if (mo113212m1() == null || !mo113212m1().mo116047v()) {
                for (C81691d3 b : this.f238288p1) {
                    Boolean b2 = b.mo113278b(appBrandInitConfigWC);
                    if (b2 != null) {
                        return b2.booleanValue();
                    }
                }
                if (!TextUtils.isEmpty(appBrandInitConfigWC.f239367i)) {
                    Log.m105925i("MicroMsg.AppBrandRuntimeWC", "shouldRelaunch return true. appId[%s] enterPath[%s]", mo113012H(), appBrandInitConfigWC.f239367i);
                    return true;
                } else if (mo113210l1().f234815R0.mo76931c() != appBrandInitConfigWC.f234815R0.mo76931c()) {
                    Log.m105925i("MicroMsg.AppBrandRuntimeWC", "shouldRelaunch return true. appId[%s] halfScreenConfig enable change to:%b", mo113012H(), Boolean.valueOf(appBrandInitConfigWC.f234815R0.mo76931c()));
                    return true;
                } else if (C90595a.m113497a(new int[]{1001, 1003, 1023, 1038, C90223g.CTRL_INDEX, 1080, C1704j3.CTRL_INDEX, C82260t.CTRL_INDEX, C82262v.CTRL_INDEX, 1103, 1104, FaceManager.FACE_ACQUIRED_LEFT, FaceManager.FACE_ACQUIRED_RIGHT, 1117, 1131, TXLiveConstants.PUSH_EVT_ROOM_OUT, 1112, 1127, 1134, 1187, 1223}, f.f245533f)) {
                    Log.m105925i("MicroMsg.AppBrandRuntimeWC", "shouldRelaunch return false. keepNoRelaunch appId[%s] newScene[%d]", mo113012H(), Integer.valueOf(f.f245533f));
                    return false;
                } else if (1030 != f.f245533f || !TextUtils.isEmpty(appBrandInitConfigWC.f239367i)) {
                    Log.m105925i("MicroMsg.AppBrandRuntimeWC", "shouldRelaunch return true. appId[%s] fallback logic", mo113012H());
                    return true;
                } else {
                    Log.m105925i("MicroMsg.AppBrandRuntimeWC", "shouldRelaunch return false. special for monkey test appId[%s]", mo113012H());
                    return false;
                }
            } else {
                Log.m105925i("MicroMsg.AppBrandRuntimeWC", "shouldRelaunch return true, appId[%s], coldStartMode:%s, hasHeadlessPage:true", mo113012H(), appBrandInitConfigWC.f234829Y0);
                return true;
            }
        }
    }

    /* renamed from: x0 */
    public void mo113089x0() {
        new AppBrandNotifyPauseTask(C86499a.m107251a(this)).mo114395c();
        C81855i iVar = this.f238292t1;
        if (iVar != null) {
            iVar.getClass();
            Log.m105925i("MicroMsg.AppBrandFloatBallLogic", "pause, runtime:%s", this.f238147j);
            C81849e eVar = iVar.f240135b;
            if (eVar != null) {
                eVar.mo64001C();
            }
            C81858k kVar = iVar.f240136c;
            if (kVar != null) {
                kVar.mo64001C();
            }
            C81862l lVar = iVar.f240137d;
            if (lVar != null) {
                lVar.mo64001C();
            }
            C81840a aVar = iVar.f240139f;
            if (aVar != null) {
                aVar.mo64001C();
            }
            C81869m mVar = iVar.f240138e;
            if (mVar != null) {
                mVar.mo64001C();
            }
            C81845c e = C82229d0.m100955e(iVar.f240134a);
            if (e != null) {
                e.mo64001C();
            }
        }
        C89787d dVar = this.f238293u1;
        if (dVar != null) {
            dVar.getClass();
            Log.m105925i("MicroMsg.AppBrandMultiTaskLogic", "pause, runtime:%s", this.f238147j);
            C89784b bVar = dVar.f258168a;
            if (bVar != null) {
                bVar.mo74189F();
            }
        }
        C79709a L1 = mo113181L1();
        if (L1 != null) {
            L1.mo109825c();
        }
        this.f238298z1.getClass();
    }

    /* renamed from: y0 */
    public void mo113091y0() {
        C115669n.INSTANCE.mo175911u(1761, 20);
        C84240s.m103843i(this.f238147j, mo121252j1(), this.f238149o.f239365g, 1761, 20, 1);
        super.mo113091y0();
    }

    /* renamed from: z0 */
    public void mo113092z0() {
        mo113052e("onPostInit", new Object[0]);
        MMToClientEvent.m100656t((C88267e) this.f238150p);
        if (!TextUtils.isEmpty("Common_IPC_appid")) {
            MMToClientEvent mMToClientEvent = new MMToClientEvent();
            MMToClientEvent.f240339q.put("Common_IPC_appid", mMToClientEvent);
            mMToClientEvent.f240341f = 1;
            mMToClientEvent.f240342g = "Common_IPC_appid";
            mMToClientEvent.mo114395c();
        }
        C84134l0.C84135a.f245612a.invoke().mo116791b(this.f238147j, mo113208k1());
        if (((C88267e) this.f238150p).mo114272k().compareTo(mo113184O1(false)) == 0) {
            AppBrandInitConfigWC M1 = mo113210l1();
            this.f238284l1.mo115918e(0, System.currentTimeMillis() - M1.f234800D);
            C83997d.m103521d(this.f238147j, "ActivityCreate", mo113210l1().f234800D, System.currentTimeMillis());
            C84110d0 d0Var = this.f238297y1;
            d0Var.getClass();
            if (!d0Var.f245576a && M1.f234829Y0 == C80247h.PRE_RENDER) {
                d0Var.f245576a = true;
            }
            MMToClientEvent.m100655q(this.f238147j, new AppBrandRuntimeWC$$h(this));
            MMToClientEvent.m100655q("Common_IPC_appid", new AppBrandRuntimeWC$$i(this));
            MMToClientEvent.m100655q(this.f238147j, new AppBrandRuntimeWC$$j(this));
            new C84177p(this, (C84176o) null);
            this.f238284l1.mo115918e(8, System.currentTimeMillis() - M1.f234800D);
            C83606m1.m102638b(2, mo113210l1());
            C84059t tVar = this.f238119Q0;
            if (tVar != null) {
                tVar.f245440z = C84037e0.f245374a;
                tVar.mo116710g();
                tVar.f245413B = C84025a0.INSTANCE;
            }
            ((C88267e) this.f238150p).mo114328C0(mo113054f0());
            C83928t1 J1 = mo113178J1();
            if (J1 != null) {
                J1.mo116203w1(mo113054f0());
            }
            C84923d dVar = this.f238265A1;
            dVar.getClass();
            dVar.mo117749b(M1);
            C83664d0 d0Var2 = C83664d0.f244290a;
            return;
        }
        throw new IllegalStateException(String.format(Locale.ENGLISH, "onPostInit appId[%s] mismatch libReader, self[%s] service[%s]", new Object[]{this.f238147j, mo113184O1(false).mo113377i(), ((C88267e) this.f238150p).mo114272k().mo113377i()}));
    }

    /* renamed from: l */
    public String mo63320l() {
        return "AppBrandRuntimeWC@" + hashCode();
    }

    public AppBrandRuntimeWC(C81812e1<AppBrandRuntimeWC> e1Var) {
        super((C81820e3) e1Var);
        Assert.assertTrue("AppBrandRuntimeWC's initial context should be AppBrandRuntimePersistentContextWrapper", mo113010G() instanceof C84543i2);
        this.f238284l1 = new C83606m1();
        this.f238297y1 = new C84110d0();
        mo113031T0(f238264Q1);
        this.f238277M1 = new AppBrandRuntimeWC$$m(this);
        this.f238278N1 = new LinkedBlockingQueue();
        mo113033U0(e1Var);
    }

    public AppBrandRuntimeWC(C79774c cVar) {
        super(cVar);
        Assert.assertTrue("AppBrandRuntimeWC's initial context should be AppBrandRuntimePersistentContextWrapper", mo113010G() instanceof C84543i2);
        this.f238284l1 = new C83606m1();
        this.f238297y1 = new C84110d0();
        mo113031T0(f238264Q1);
        this.f238277M1 = new AppBrandRuntimeWC$$m(this);
        this.f238278N1 = new LinkedBlockingQueue();
        mo113033U0((C81820e3) null);
    }
}

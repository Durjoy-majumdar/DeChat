package com.tencent.p014mm.plugin.voip.model;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Build;
import android.os.Looper;
import android.telephony.TelephonyManager;
import android.widget.RemoteViews;
import bd2.C79690d;
import bh3.C113177k;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.app.AppForegroundDelegate;
import com.tencent.p014mm.autogen.events.VoipEvent;
import com.tencent.p014mm.booter.notification.MMNotification;
import com.tencent.p014mm.network.C29060q;
import com.tencent.p014mm.plugin.appbrand.jsapi.appdownload.JsApiInstallDownloadTask;
import com.tencent.p014mm.plugin.appbrand.jsapi.appdownload.JsApiQueryDownloadTask;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.plugin.voip.model.C106331a0;
import com.tencent.p014mm.plugin.voip.model.C106359m0;
import com.tencent.p014mm.plugin.voip.p475ui.C106448g;
import com.tencent.p014mm.plugin.voip.p475ui.VideoActivity;
import com.tencent.p014mm.plugin.voip.widget.VoipForegroundService;
import com.tencent.p014mm.pointers.PBool;
import com.tencent.p014mm.pointers.PInt;
import com.tencent.p014mm.pointers.PLong;
import com.tencent.p014mm.pointers.PString;
import com.tencent.p014mm.sdk.platformtools.FileProviderHelper;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.MTimerHandler;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C72963f4;
import com.tencent.p014mm.vfs.C86009m1;
import com.tencent.xweb.file.XVFSFile;
import d62.C75339i;
import di3.C86312j;
import eb0.C75592q0;
import f40.C86709a0;
import f62.C75700k0;
import h43.C108077f0;
import h81.C32735h;
import java.io.File;
import java.lang.ref.WeakReference;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import l33.C109246a;
import l33.C109247e;
import nj2.C61767o;
import nj2.C61768p;
import nj3.C76879j;
import o90.C100308d;
import p196ln.C76708i;
import p206nj.C11171e;
import p206nj.C76861g;
import p206nj.C76866m;
import p33.C110152e;
import p385u2.C111105a;
import p447aw.C103918d;
import p645pj.C77091b;
import p657pz.C89445b;
import p823sg.C101611g;
import pe3.C89349b;
import pu0.C110248b;
import q62.C101048b;
import q90.C101062d;
import qo3.C77426q;
import s33.C110724b;
import s33.C110728c;
import te3.np4;
import te3.yu4;
import te3.zt4;
import uu1.C111222b;
import w33.C111720c0;
import w33.C111730z;
import w33.C65925a0;
import y33.C112393b;
import z33.C112586d;
import z33.C112592e;
import z33.C112593f;
import z33.C112594g;
import z33.C112595h;
import z33.C112597j;
import z33.C112598k;
import z33.C112604l;
import zt3.C119157j;
import zt3.C119179t;

/* renamed from: com.tencent.mm.plugin.voip.model.h0 */
public class C106350h0 {

    /* renamed from: G */
    public static final C101611g<Integer, C106331a0.C106332a> f317325G = new C100308d(5);

    /* renamed from: A */
    public C29060q f317326A = new h0$$d(this);

    /* renamed from: B */
    public C101048b.C35768a f317327B = new h0$$e(this);

    /* renamed from: C */
    public MTimerHandler f317328C = new MTimerHandler(Looper.getMainLooper(), (MTimerHandler.CallBack) new h0$$f(this), true);

    /* renamed from: D */
    public HashMap<Long, Boolean> f317329D = new HashMap<>();

    /* renamed from: E */
    public C112592e f317330E;

    /* renamed from: F */
    public C108077f0 f317331F;

    /* renamed from: a */
    public C106359m0 f317332a;

    /* renamed from: b */
    public C109246a f317333b;

    /* renamed from: c */
    public boolean f317334c = false;

    /* renamed from: d */
    public boolean f317335d = false;

    /* renamed from: e */
    public boolean f317336e = false;

    /* renamed from: f */
    public boolean f317337f = false;

    /* renamed from: g */
    public String f317338g = null;

    /* renamed from: h */
    public long f317339h = 0;

    /* renamed from: i */
    public Map<Integer, Long> f317340i = new HashMap();

    /* renamed from: j */
    public int f317341j = -1;

    /* renamed from: k */
    public long f317342k = 0;

    /* renamed from: l */
    public long f317343l = 0;

    /* renamed from: m */
    public volatile C112393b f317344m;

    /* renamed from: n */
    public boolean f317345n = false;

    /* renamed from: o */
    public boolean f317346o = false;

    /* renamed from: p */
    public boolean f317347p = false;

    /* renamed from: q */
    public boolean f317348q = false;

    /* renamed from: r */
    public yu4 f317349r = null;

    /* renamed from: s */
    public long f317350s = 0;

    /* renamed from: t */
    public String f317351t = null;

    /* renamed from: u */
    public boolean f317352u = false;

    /* renamed from: v */
    public long f317353v = 0;

    /* renamed from: w */
    public long f317354w = 0;

    /* renamed from: x */
    public C110152e f317355x = new C110152e();

    /* renamed from: y */
    public boolean f317356y = true;

    /* renamed from: z */
    public VoipIncomingCallManager f317357z;

    public C106350h0() {
        C106359m0 m0Var = new C106359m0();
        this.f317332a = m0Var;
        this.f317353v = 0;
        this.f317334c = false;
        this.f317335d = false;
        this.f317336e = false;
        this.f317338g = null;
        this.f317337f = false;
        this.f317351t = null;
        this.f317357z = new VoipIncomingCallManager(this.f317355x, m0Var);
        C86709a0.m107529k().mo121126a(this.f317326A);
        ((C101048b) C86312j.m106911c(C101048b.class)).mo60593th(2, this.f317327B);
    }

    /* renamed from: l */
    public static boolean m143252l(Context context, boolean z) {
        Class cls = C113177k.class;
        boolean Jn = ((C103918d) C86312j.m106911c(C103918d.class)).mo125772Jn(context);
        boolean z2 = C111105a.m151499a(context, "android.permission.RECORD_AUDIO") == 0 && (!z || C111105a.m151499a(context, "android.permission.CAMERA") == 0);
        C113177k.C113179b bVar = C113177k.C113179b.CAMERA;
        C113177k.C113178a aVar = C113177k.C113178a.CHATTING;
        boolean z3 = ((C113177k) C86312j.m106911c(cls)).w00(bVar, aVar) && ((C113177k) C86312j.m106911c(cls)).w00(C113177k.C113179b.MICRO_PHONE, aVar) && ((C113177k) C86312j.m106911c(cls)).w00(C113177k.C113179b.OVERLAY, aVar);
        if (!Jn || !z2 || !z3) {
            int i = 2;
            int i2 = z ? 2 : 1;
            C65925a0 a0Var = C65925a0.f189525a;
            C65925a0.C65926a aVar2 = C65925a0.f189527c;
            aVar2.f189530c = i2;
            if (!z2) {
                i = 3;
            } else if (Jn) {
                i = -1;
            }
            aVar2.f189531d = i;
        }
        return Jn && z2 && z3;
    }

    /* renamed from: A */
    public void mo152587A() {
        this.f317344m = null;
        ((MMNotification) ((C79690d) C86312j.m106911c(C79690d.class)).mo109806kA()).mo93207e(41);
    }

    /* renamed from: B */
    public void mo152588B() {
        C112393b bVar = this.f317344m;
        if (bVar != null) {
            Log.m105924i("MicroMsg.Voip.VoipService", "resetFullscreenIntent ");
            C106359m0 m0Var = this.f317332a;
            String str = m0Var.f317413r;
            boolean z = m0Var.f317415t;
            boolean z2 = m0Var.f317414s;
            long j = bVar.f336523d;
            mo152587A();
            mo152595I(MMApplicationContext.getContext(), str, j, z, z2, true);
            return;
        }
        Log.m105924i("MicroMsg.Voip.VoipService", "do not need voip resume");
    }

    /* renamed from: C */
    public void mo152589C(int i) {
        Log.m105919d("MicroMsg.Voip.VoipService", "devin: setCallResult: %d", Integer.valueOf(i));
        this.f317332a.f317396a.f317500x.f317568G1.f317784m = i;
    }

    /* renamed from: D */
    public void mo152590D(boolean z, boolean z2, String str) {
        Log.m105924i("MicroMsg.Voip.VoipService", "setCalling " + z + "  videoCall " + z2 + "username " + str);
        this.f317334c = z;
        if (z2) {
            this.f317335d = z;
            this.f317332a.f317396a.f317500x.f317569H = 0;
        } else {
            this.f317332a.f317396a.f317500x.f317569H = 1;
            this.f317336e = z;
        }
        this.f317338g = str;
        this.f317332a.f317396a.f317500x.f317568G1.getClass();
    }

    /* renamed from: E */
    public void mo152591E(int i) {
        Log.m105919d("MicroMsg.Voip.VoipService", "devin: camera errcode: %d", Integer.valueOf(i));
        this.f317332a.f317396a.f317500x.f317572I = Math.abs(i);
    }

    /* renamed from: F */
    public void mo152592F(boolean z) {
        Log.printInfoStack("MicroMsg.Voip.VoipService", "setEngineHeadsetPlugged, %s", Boolean.valueOf(z));
        byte[] bArr = {z ? (byte) 1 : 0};
        this.f317332a.f317396a.f317500x.setAppCmd(425, bArr, 1);
        if (z) {
            if (C110248b.zx0()) {
                this.f317332a.f317396a.f317500x.setAppCmd(JsApiQueryDownloadTask.CTRL_INDEX, bArr, 1);
            }
            if (C110248b.Jh0()) {
                this.f317332a.f317396a.f317500x.setAppCmd(JsApiInstallDownloadTask.CTRL_INDEX, bArr, 1);
                return;
            }
            return;
        }
        this.f317332a.f317396a.f317500x.setAppCmd(JsApiQueryDownloadTask.CTRL_INDEX, bArr, 1);
        this.f317332a.f317396a.f317500x.setAppCmd(JsApiInstallDownloadTask.CTRL_INDEX, bArr, 1);
    }

    /* renamed from: G */
    public void mo152593G(boolean z, boolean z2) {
        this.f317346o = z;
        this.f317347p = z2;
        Log.m105919d("MicroMsg.Voip.VoipService", "isMinimize: %b, miniOnlyHideVoip: %b", Boolean.valueOf(z), Boolean.valueOf(z2));
    }

    /* renamed from: H */
    public void mo152594H(Context context, String str) {
        Class cls = C75700k0.class;
        Log.m105924i("MicroMsg.Voip.VoipService", "startVideoCall, toUser:" + str);
        if (Util.isNullOrNil(str)) {
            return;
        }
        if (System.currentTimeMillis() - this.f317339h < 2000 && System.currentTimeMillis() - this.f317339h > 0) {
            return;
        }
        if (System.currentTimeMillis() - this.f317342k >= this.f317343l || System.currentTimeMillis() - this.f317342k <= 0) {
            this.f317339h = System.currentTimeMillis();
            if (((C75700k0) C86709a0.m107533q(cls)).mo96097Ni().get(str) != null) {
                if (((C75700k0) C86709a0.m107533q(cls)).mo96097Ni().get(str).mo62920o3()) {
                    C77426q qVar = new C77426q(MMApplicationContext.getContext());
                    qVar.mo107595g(context.getString(C0966R.string.mzg));
                    qVar.mo107602n(context.getString(C0966R.string.f8028zq));
                    qVar.mo107600l(new h0$$c());
                    qVar.mo107603o();
                    return;
                }
                mo152595I(context, str, mo152616o(), true, true, false);
                VoipEvent voipEvent = new VoipEvent();
                voipEvent.f194019d.f194022b = 7;
                voipEvent.publish();
                return;
            }
            return;
        }
        Log.m105924i("MicroMsg.Voip.VoipService", "fail! cuz overloadInterval fail!");
        C76879j.m92742m(context, C0966R.string.kip, C0966R.string.kjt, (DialogInterface.OnClickListener) null);
    }

    /* renamed from: I */
    public final void mo152595I(Context context, String str, long j, boolean z, boolean z2, boolean z3) {
        AppForegroundDelegate appForegroundDelegate;
        Class cls;
        String str2;
        RemoteViews remoteViews;
        boolean z4;
        long j2;
        String str3;
        Intent intent;
        int i;
        String str4;
        RemoteViews remoteViews2;
        String str5 = str;
        long j3 = j;
        boolean z5 = z;
        boolean z6 = z2;
        Class cls2 = C111222b.class;
        Context context2 = context == null ? MMApplicationContext.getContext() : context;
        C112595h.m153926m();
        C106359m0 m0Var = this.f317332a;
        m0Var.f317413r = str5;
        m0Var.f317415t = z5;
        m0Var.f317414s = z6;
        if (C112595h.f337171f && z6 && this.f317331F == null) {
            C109247e.vx0().mo163051e();
            this.f317331F = new C108077f0(z5);
        }
        mo152587A();
        long currentTimeMillis = System.currentTimeMillis();
        AppForegroundDelegate appForegroundDelegate2 = AppForegroundDelegate.INSTANCE;
        Log.printInfoStack("MicroMsg.Voip.VoipService", "start VideoActivity in foreground,%s", Boolean.valueOf(appForegroundDelegate2.f343454n));
        boolean z7 = C11171e.m11045b(28) || Build.VERSION.CODENAME.equals("Q");
        Intent r8 = C112595h.f337167b ? ((C111222b) C86312j.m106911c(cls2)).mo161937r8(context2, str5, z6) : new Intent(context2, VideoActivity.class);
        if (r8 != null) {
            if (C112595h.m153918b()) {
                this.f317330E = new C112598k();
            } else {
                this.f317330E = new C112586d();
            }
            C106357m.m143315m(mo152624w());
            r8.putExtra("Voip_User", str5);
            r8.putExtra("Voip_Outcall", z5);
            r8.putExtra("Voip_VideoCall", z6);
            String str6 = "Voip_User";
            r8.putExtra("Voip_LastPage_Hash", currentTimeMillis);
            r8.putExtra("Voip_CallRoomKey", j3);
            if (z5 || !z7 || appForegroundDelegate2.f343454n) {
                str3 = "MicroMsg.Voip.VoipService";
                appForegroundDelegate = appForegroundDelegate2;
                j2 = currentTimeMillis;
                cls = cls2;
                z4 = false;
                intent = r8;
                str2 = "";
                remoteViews = null;
            } else {
                cls = cls2;
                C112393b bVar = r0;
                str3 = "MicroMsg.Voip.VoipService";
                appForegroundDelegate = appForegroundDelegate2;
                j2 = currentTimeMillis;
                C112393b bVar2 = new C112393b(false, z2, str, z3, j);
                this.f317344m = bVar;
                intent = r8;
                String displayName = ((C75339i) C86312j.m106911c(C75339i.class)).getDisplayName(((C75700k0) C86709a0.m107533q(C75700k0.class)).mo96097Ni().get(intent.getStringExtra(str6)).getUsername());
                if (C77091b.m93019a()) {
                    remoteViews2 = new RemoteViews(MMApplicationContext.getPackageName(), C0966R.C0971layout.ccu);
                    remoteViews2.setTextViewText(C0966R.C0970id.hju, displayName);
                    if (intent.getBooleanExtra("Voip_VideoCall", true)) {
                        str4 = MMApplicationContext.getResources().getString(C0966R.string.kh7);
                        remoteViews2.setImageViewResource(C0966R.C0970id.hjp, C0966R.C0969drawable.bs_);
                    } else {
                        str4 = MMApplicationContext.getResources().getString(C0966R.string.kh6);
                        remoteViews2.setImageViewResource(C0966R.C0970id.hjp, C0966R.C0969drawable.bsa);
                    }
                    remoteViews2.setTextViewText(C0966R.C0970id.f358873hk0, str4);
                    z4 = false;
                    remoteViews2.setImageViewBitmap(C0966R.C0970id.hjk, ((C76708i) C86312j.m106911c(C76708i.class)).mo106840jC(str5, false, 20));
                    remoteViews2.setImageViewResource(C0966R.C0970id.lnr, C0966R.C0969drawable.bsd);
                } else {
                    z4 = false;
                    remoteViews2 = new RemoteViews(MMApplicationContext.getPackageName(), C0966R.C0971layout.ccv);
                    str4 = intent.getBooleanExtra("Voip_VideoCall", true) ? MMApplicationContext.getResources().getString(C0966R.string.kh7) : MMApplicationContext.getResources().getString(C0966R.string.kh6);
                    remoteViews2.setTextViewText(C0966R.C0970id.lns, MMApplicationContext.getResources().getString(C0966R.string.a0u));
                    remoteViews2.setTextViewText(C0966R.C0970id.hjo, str4);
                }
                str2 = displayName + str4;
                remoteViews = remoteViews2;
            }
            if (z3) {
                intent.setFlags(603979776);
                intent.addFlags(268435456);
            }
            AppForegroundDelegate appForegroundDelegate3 = appForegroundDelegate;
            if (Build.VERSION.SDK_INT >= 29 && !appForegroundDelegate3.f343454n) {
                this.f317354w = j2;
                Log.m105924i(str3, "start channel ring, now:" + this.f317354w);
            }
            mo152603b(str, z2, false, j);
            if (remoteViews == null) {
                C112594g.f337164c = Util.currentTicks();
                Log.m105924i("MicroMsg.VoipActivityReport", "markStartActivityNormal");
                C115669n.INSTANCE.mo175913w(1433, 4, 1);
            } else {
                C112594g.f337163b = Util.currentTicks();
                Log.m105924i("MicroMsg.VoipActivityReport", "markStartActivityFromVoipService");
                C115669n.INSTANCE.mo175913w(1433, 3, 1);
            }
            boolean z8 = z;
            if (!z8) {
                boolean z9 = z2;
                if (m143252l(context2, z9) && this.f317356y && appForegroundDelegate3.f343454n) {
                    if (C86709a0.m107522a()) {
                        mo152593G(z4, z4);
                    }
                    PString pString = new PString();
                    PBool pBool = new PBool();
                    PBool pBool2 = new PBool();
                    PInt pInt = new PInt();
                    PLong pLong = new PLong();
                    pString.value = str5;
                    pBool.value = z8;
                    pBool2.value = z9;
                    pInt.value = C112604l.m153980c(pBool.value, z9);
                    pLong.value = j;
                    int n = C109247e.xx0().mo152615n();
                    Context context3 = context2;
                    C109246a t = C109247e.xx0().mo152621t(context2, pString, pBool, pBool2, pInt, pLong, ((C111222b) C86312j.m106911c(cls)).mo161938rz(intent));
                    if (t != null) {
                        C110152e eVar = this.f317355x;
                        WeakReference<C106448g> weakReference = new WeakReference<>(t);
                        eVar.getClass();
                        eVar.f329554w = weakReference;
                        i = 1;
                        ((C119157j) C119157j.f356862d).mo183895z(new C106352j0(this, context3, intent, j, n, z2, str));
                    } else {
                        i = 1;
                    }
                    if (C61767o.m72471g() && C76866m.m92676e()) {
                        MMApplicationContext.getContext().grantUriPermission("com.android.systemui", FileProviderHelper.getUriForFile(MMApplicationContext.getContext(), C86009m1.m106378c(new File(C61768p.m72482j(str).mo90177h()))), i);
                    }
                    C111720c0.f334432a.mo163401c(z4, z8);
                }
            }
            i = 1;
            this.f317356y = z4;
            ((C89445b) C86312j.m106911c(C89445b.class)).mo123648UT(context2, intent, remoteViews, str2, intent.getComponent().getClassName(), true, C61768p.m72480h(str), true, true);
            MMApplicationContext.getContext().grantUriPermission("com.android.systemui", FileProviderHelper.getUriForFile(MMApplicationContext.getContext(), C86009m1.m106378c(new File(C61768p.m72482j(str).mo90177h()))), i);
            C111720c0.f334432a.mo163401c(z4, z8);
        }
    }

    /* renamed from: J */
    public boolean mo152596J(boolean z) {
        C106400y yVar = this.f317332a.f317396a.f317450A;
        if (yVar.f317708a != null) {
            return yVar.f317708a.mo152552k(z);
        }
        return false;
    }

    /* renamed from: K */
    public void mo152597K(int i) {
        this.f317332a.f317396a.mo152693G(i);
    }

    /* renamed from: L */
    public int mo152598L(boolean z) {
        C106377r rVar = this.f317332a.f317396a;
        int z2 = z ? rVar.f317500x.mo152852z(412) : rVar.f317500x.mo152852z(413);
        if (z2 < 0) {
            C112597j.m153937b("MicroMsg.Voip.VoipContext", "voipContext tryMuteMicrophone ret:" + z2);
        }
        return z2;
    }

    /* renamed from: M */
    public int mo152599M(boolean z) {
        C106377r rVar = this.f317332a.f317396a;
        int z2 = z ? rVar.f317500x.mo152852z(401) : rVar.f317500x.mo152852z(402);
        if (z2 < 0) {
            C112597j.m153938c("MicroMsg.Voip.VoipContext", "voipContext trySwitchSpeakerPhone ret:" + z2);
        }
        return z2;
    }

    /* renamed from: N */
    public void mo152600N() {
        Log.m105924i("MicroMsg.Voip.VoipService", "unRegister and remove all notification and voip foreground service");
        boolean z = true;
        this.f317356y = true;
        C65925a0 a0Var = C65925a0.f189525a;
        C65925a0.C65926a aVar = C65925a0.f189527c;
        if (aVar.f189531d == 1) {
            aVar.f189528a = 1;
            aVar.f189532e = System.currentTimeMillis() - C65925a0.f189526b;
        }
        ((C119157j) C119157j.f356862d).mo183895z(new h0$$a(this));
        this.f317337f = false;
        this.f317354w = 0;
        Log.printInfoStack("MicroMsg.Voip.VoipService", "unbindVoiceServiceIfNeed", new Object[0]);
        if (C11171e.m11046c(26)) {
            try {
                Intent intent = new Intent();
                intent.setClass(MMApplicationContext.getContext(), VoipForegroundService.class);
                MMApplicationContext.getContext().stopService(intent);
            } catch (Exception e) {
                Log.printErrStackTrace("MicroMsg.Voip.VoipService", e, "unBind vidoeforeground error: %s", e.getMessage());
                z = false;
            }
            if (z) {
                this.f317348q = false;
            }
        }
        mo152587A();
        ((MMNotification) ((C79690d) C86312j.m106911c(C79690d.class)).mo109806kA()).mo93207e(40);
    }

    /* renamed from: O */
    public int mo152601O(byte[] bArr, int i, int i2, int i3, int i4, byte[] bArr2, int i5, int i6, int i7, int i8) {
        C106400y yVar = this.f317332a.f317396a.f317450A;
        if (yVar.f317710c == 3) {
            return -1;
        }
        C106377r rVar = yVar.f317711d;
        if (!rVar.f317500x.f317580K1) {
            return -1;
        }
        if (!rVar.mo152717t()) {
            return -2;
        }
        return yVar.f317711d.f317500x.videoRorate90D(bArr, i, i2, i3, i4, bArr2, i5, i6, i7, i8);
    }

    /* renamed from: a */
    public int mo152602a(boolean z, boolean z2) {
        C106359m0 m0Var = this.f317332a;
        if (m0Var.f317416u != null) {
            C112597j.m153938c("MicroMsg.Voip.VoipServiceEx", "devincdai: voip reset timecount");
            m0Var.f317416u.stopTimer();
            m0Var.f317416u.startTimer(60000);
        }
        if (!m0Var.f317420y.stopped()) {
            m0Var.f317420y.stopTimer();
        }
        C106401z zVar = m0Var.f317396a.f317500x.f317568G1;
        zVar.getClass();
        zVar.f317763R = System.currentTimeMillis();
        C112597j.m153936a("MicroMsg.VoipDailReport", "devin:acceptCallTime:" + zVar.f317763R);
        Log.m105924i("MicroMsg.Voip.VoipServiceEx", "accept onlyAudio:" + z);
        C106377r rVar = m0Var.f317396a;
        if (!(rVar.f317476a == 3)) {
            C112597j.m153937b("MicroMsg.Voip.VoipServiceEx", "Failed to accept with calling, status =" + m0Var.f317396a.f317476a);
        } else if (rVar.f317500x.f317656n == 0) {
            C112597j.m153937b("MicroMsg.Voip.VoipServiceEx", "Failed to accept with roomid = 0. ");
        } else {
            LinkedList linkedList = new LinkedList();
            m0Var.f317396a.mo152704f(linkedList);
            v2protocal v2protocal = m0Var.f317396a.f317500x;
            v2protocal.f317657n0 = m0Var.f317396a.f317500x.f317657n0 + "|answer:" + m0Var.f317396a.f317500x.f317642i0 + XVFSFile.PATH_SEPARATOR + m0Var.f317396a.f317500x.f317645j0;
            C112597j.m153936a("MicroMsg.Voip.VoipServiceEx", C76861g.m92660c() + "accept invite, roomid:" + m0Var.f317396a.f317500x.f317656n + " nic list size:" + linkedList.size());
            m0Var.f317419x.startTimer(50000);
            m0Var.f317396a.f317500x.f317568G1.mo152869a();
            v2protocal v2protocal2 = m0Var.f317396a.f317500x;
            C110724b bVar = new C110724b(1, v2protocal2.f317629e, v2protocal2.f317656n, v2protocal2.field_peerId, v2protocal2.field_capInfo, v2protocal2.f317665q, z, z2, linkedList);
            C106401z zVar2 = m0Var.f317396a.f317500x.f317568G1;
            zVar2.getClass();
            zVar2.f317757L = System.currentTimeMillis();
            bVar.mo88544n1();
            m0Var.f317396a.mo152688B(4);
            C106377r rVar2 = m0Var.f317396a;
            rVar2.f317450A.f317710c = 1;
            rVar2.f317482f = true;
            return 0;
        }
        return -1;
    }

    /* renamed from: b */
    public void mo152603b(String str, boolean z, boolean z2, long j) {
        boolean z3 = false;
        Log.printInfoStack("MicroMsg.Voip.VoipService", "bindVoipForegroundIfNeed", new Object[0]);
        if (C11171e.m11046c(26) && !this.f317348q) {
            Intent intent = new Intent();
            intent.putExtra("isRecalled", z2);
            intent.putExtra("Voip_User", str);
            intent.putExtra("Voip_CallRoomKey", j);
            intent.putExtra("Voip_VideoCall", z);
            intent.setClass(MMApplicationContext.getContext(), VoipForegroundService.class);
            try {
                MMApplicationContext.getContext().startService(intent);
                z3 = true;
            } catch (Exception e) {
                Log.printErrStackTrace("MicroMsg.Voip.VoipService", e, "using start service to bindVoipForegroundIfNeed error: %s", e.getMessage());
                try {
                    MMApplicationContext.getContext().startForegroundService(intent);
                } catch (Exception e2) {
                    Log.printErrStackTrace("MicroMsg.Voip.VoipService", e2, "using start foreground service to bindVoipForegroundIfNeed error: %s", e2.getMessage());
                }
            }
            if (z3) {
                this.f317348q = true;
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0041, code lost:
        if ((r14 == 2) != false) goto L_0x0043;
     */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo152604c(java.lang.String r13, int r14) {
        /*
            r12 = this;
            java.lang.Class<h81.h> r0 = h81.C32735h.class
            di3.d r0 = di3.C86312j.m106911c(r0)
            h81.h r0 = (h81.C32735h) r0
            h81.h$c r1 = h81.C32735h.C32737c.clicfg_voip_newsimulcall_switch
            r2 = 0
            boolean r0 = r0.mo58784wf(r1, r2)
            r1 = 1
            java.lang.Object[] r3 = new java.lang.Object[r1]
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r0)
            r3[r2] = r4
            java.lang.String r4 = "MicroMsg.Voip.VoipService"
            java.lang.String r5 = "danial:[simucall]checkSimulBeforeCall bNewSimulCallSwitch:%b "
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r4, r5, r3)
            if (r0 == 0) goto L_0x007e
            com.tencent.mm.plugin.voip.model.m0 r0 = r12.f317332a
            r7 = 0
            r9 = -1
            r10 = -1
            r5 = r12
            r6 = r13
            r8 = r14
            int r13 = r5.mo152610h(r6, r7, r8, r9, r10)
            r0.f317402g = r13
            com.tencent.mm.plugin.voip.model.m0 r13 = r12.f317332a
            int r14 = r13.f317402g
            if (r14 != r1) goto L_0x0038
            r0 = 1
            goto L_0x0039
        L_0x0038:
            r0 = 0
        L_0x0039:
            r3 = 2
            if (r0 != 0) goto L_0x0043
            if (r14 != r3) goto L_0x0040
            r14 = 1
            goto L_0x0041
        L_0x0040:
            r14 = 0
        L_0x0041:
            if (r14 == 0) goto L_0x007e
        L_0x0043:
            java.lang.Object[] r14 = new java.lang.Object[r3]
            int r13 = r13.f317403h
            java.lang.Integer r13 = java.lang.Integer.valueOf(r13)
            r14[r2] = r13
            com.tencent.mm.plugin.voip.model.m0 r13 = r12.f317332a
            int r13 = r13.f317402g
            java.lang.Integer r13 = java.lang.Integer.valueOf(r13)
            r14[r1] = r13
            java.lang.String r13 = "danial[simucall]giveup call-out, turn to auto-accept call-in! finalroomType:%d, simuCallRole:%d"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r4, r13, r14)
            com.tencent.mm.plugin.voip.model.m0 r13 = r12.f317332a
            com.tencent.mm.plugin.voip.model.r r13 = r13.f317396a
            com.tencent.mm.plugin.voip.model.v2protocal r13 = r13.f317500x
            boolean r14 = r13.f317580K1
            if (r14 != 0) goto L_0x0072
            int r13 = r13.mo152849w()
            if (r13 >= 0) goto L_0x0072
            java.lang.String r13 = "Failed to init v2protocol."
            z33.C112597j.m153937b(r4, r13)
            return r2
        L_0x0072:
            com.tencent.mm.plugin.voip.model.m0 r13 = r12.f317332a
            com.tencent.mm.plugin.voip.model.r r14 = r13.f317396a
            com.tencent.mm.plugin.voip.model.s0 r14 = r14.f317502z
            int r13 = r13.f317403h
            r14.mo152477l0(r13)
            return r1
        L_0x007e:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.voip.model.C106350h0.mo152604c(java.lang.String, int):boolean");
    }

    /* renamed from: d */
    public int mo152605d(int i, long j, int i2) {
        Object obj;
        int i3 = i;
        C106359m0 m0Var = this.f317332a;
        if (!m0Var.f317396a.mo152713p()) {
            C112597j.m153937b("MicroMsg.Voip.VoipServiceEx", "steve:[simucall]Failed to cancel call ,as not in calling.");
            return -1;
        }
        Log.m105925i("MicroMsg.Voip.VoipServiceEx", "steve:[simucall] try to cancel my invite due to Simulcall(callee), roomId:%s, roomKey:%s, roomType:%d, inviteId:%d", Integer.valueOf(i), Long.valueOf(j), Integer.valueOf(i2), Integer.valueOf(m0Var.f317396a.f317500x.f317668r));
        Object obj2 = m0Var.f317397b;
        synchronized (obj2) {
            if (i3 != 0) {
                try {
                    if (m0Var.f317396a.f317500x.f317668r != 0) {
                        int currentTimeMillis = (int) (System.currentTimeMillis() - C106357m.m143312g((long) i3));
                        v2protocal v2protocal = m0Var.f317396a.f317500x;
                        String str = v2protocal.f317635g;
                        int i4 = v2protocal.f317668r;
                        int i5 = v2protocal.f317569H;
                        obj = obj2;
                        C110728c cVar = new C110728c(i, j, str, "", i4, 2, currentTimeMillis, i5);
                        cVar.mo88544n1();
                        C115669n.INSTANCE.mo160140o(11521, true, true, Integer.valueOf(i), Long.valueOf(j), Integer.valueOf(i2), 2, Long.valueOf(System.currentTimeMillis()), Long.valueOf(System.currentTimeMillis()));
                        Log.m105924i("MicroMsg.Voip.VoipServiceEx", "steve:[simucall] voipcancelinvite sent!");
                        return 0;
                    }
                } catch (Throwable th) {
                    th = th;
                    while (true) {
                        break;
                    }
                    throw th;
                }
            }
            Object obj3 = obj2;
            C112597j.m153937b("MicroMsg.Voip.VoipServiceEx", "steve:[simucall] Failed to cancel call with roomid = 0 and inviteId = 0 ");
            return -1;
        }
    }

    /* renamed from: e */
    public void mo152606e() {
        Log.m105924i("MicroMsg.Voip.VoipService", "cleanMgr");
        this.f317353v = 0;
        if (this.f317333b == null) {
            C109247e.vx0().mo163051e();
        }
        this.f317333b = null;
        this.f317345n = false;
        this.f317352u = false;
        C112592e eVar = this.f317330E;
        if (eVar != null) {
            eVar.mo164328B();
            this.f317330E = null;
        }
        C108077f0 f0Var = this.f317331F;
        if (f0Var != null) {
            f0Var.mo158495j();
            this.f317331F = null;
        }
        C109247e.wx0().mo153005a(true);
    }

    /* renamed from: f */
    public void mo152607f(Context context, C106393s0 s0Var) {
        C106377r rVar = this.f317332a.f317396a;
        if (context == rVar.f317501y && s0Var == rVar.f317502z) {
            rVar.f317501y = null;
            rVar.f317502z = C106393s0.f317524q0;
            C112597j.m153936a("MicroMsg.Voip.VoipServiceEx", "detach ui........");
            return;
        }
        C112597j.m153936a("MicroMsg.Voip.VoipServiceEx", "cannot detach other's ui.");
    }

    public void finalize() {
        C112592e eVar = this.f317330E;
        if (eVar != null) {
            eVar.mo164353v();
            this.f317330E.mo164328B();
            this.f317330E = null;
        }
        C108077f0 f0Var = this.f317331F;
        if (f0Var != null) {
            f0Var.mo158495j();
            this.f317331F = null;
        }
        C106359m0 m0Var = this.f317332a;
        m0Var.getClass();
        Log.m105924i("MicroMsg.Voip.VoipServiceEx", "stop");
        m0Var.mo152669n();
        m0Var.f317396a.getClass();
        this.f317332a = null;
        this.f317337f = false;
        C86709a0.m107529k().mo121129d(this.f317326A);
        ((C101048b) C86312j.m106911c(C101048b.class)).mo60589AS(2, this.f317327B);
        super.finalize();
    }

    /* renamed from: g */
    public void mo152609g() {
        C106400y yVar = this.f317332a.f317396a.f317450A;
        if (yVar.f317730w == 1) {
            v2protocal v2protocal = yVar.f317711d.f317500x;
            v2protocal.f317578K = v2protocal.OpenSLDisableMute();
            C112597j.m153938c("MicroMsg.Voip.VoipDeviceHandler", "seenli, opensl disableMute");
        } else if (yVar.f317709b != null) {
            yVar.f317709b.mo161909n(false);
            Log.m105924i("MicroMsg.Voip.VoipDeviceHandler", "qipeng, disableMute.");
        }
    }

    /* renamed from: h */
    public int mo152610h(String str, boolean z, int i, int i2, long j) {
        C106359m0.C106366g gVar;
        String str2;
        String str3;
        boolean z2;
        int i3;
        String str4 = str;
        int i4 = i;
        int i5 = i2;
        long j2 = j;
        String s = C75592q0.m90789s();
        C106359m0 m0Var = this.f317332a;
        C106359m0.C106366g gVar2 = m0Var.f317405j;
        int i6 = -1;
        if (!(gVar2 == null || (gVar = m0Var.f317404i) == null)) {
            if (z) {
                gVar2.mo152674a();
                C106359m0.C106366g gVar3 = this.f317332a.f317405j;
                gVar3.f317427a = str4;
                gVar3.f317428b = s;
                gVar3.f317429c = i4;
                gVar3.f317430d = i5;
                gVar3.f317431e = j2;
            } else {
                gVar.mo152674a();
                C106359m0.C106366g gVar4 = this.f317332a.f317404i;
                gVar4.f317427a = s;
                gVar4.f317428b = str4;
                gVar4.f317429c = i4;
                gVar4.f317430d = i5;
                gVar4.f317431e = j2;
            }
            if (z) {
                str2 = this.f317332a.f317404i.f317428b;
                str3 = str4;
            } else {
                str3 = this.f317332a.f317405j.f317427a;
                str2 = str4;
            }
            Log.m105925i("MicroMsg.Voip.VoipService", "danial:[simucall] isCallin %b, myname:%s, remoteName:%s, inviteType:%d, roomid:%d", Boolean.valueOf(z), s, str4, Integer.valueOf(i), Integer.valueOf(i2));
            if (str3 == null || str2 == null) {
                Log.m105921e("MicroMsg.Voip.VoipService", "steve:[simucall] name null! myname:%s, remoteInviteName:%s, myInviteName:%s", s, str3, str2);
            } else {
                boolean equals = str2.equals(str3);
                if (this.f317332a.f317396a != null) {
                    Log.m105925i("MicroMsg.Voip.VoipService", "steve:[simucall]  mutualCalling:%s", Boolean.valueOf(equals));
                    if (equals) {
                        this.f317332a.f317401f = true;
                        int i7 = (str2.compareTo(s) < 0 || str2.contains("@")) ? 1 : 2;
                        if (!z) {
                            Log.m105924i("MicroMsg.Voip.VoipService", "danialguo: callout and setmyself callee");
                            i6 = 2;
                        } else {
                            i6 = i7;
                        }
                        C106359m0 m0Var2 = this.f317332a;
                        m0Var2.f317396a.f317500x.f317571H1 |= 2;
                        if (z) {
                            z2 = !this.f317333b.mo152460a0();
                        } else {
                            int i8 = m0Var2.f317405j.f317429c;
                            z2 = i4;
                            i4 = i8;
                        }
                        boolean z3 = i4 == 1 || z2 == 1;
                        if (this.f317333b.mo152460a0() && z3) {
                            Log.m105925i("MicroMsg.Voip.VoipService", "steve:[simucall]audio room, close camera first! myInviteType:%d, finalRoomType:%d", Integer.valueOf(z2), Integer.valueOf(z3));
                            this.f317332a.f317414s = false;
                            mo152588B();
                            this.f317332a.f317396a.f317502z.mo152420B0(1);
                        }
                        C106359m0 m0Var3 = this.f317332a;
                        m0Var3.f317403h = z3 ? 1 : 0;
                        m0Var3.f317396a.f317500x.f317569H = z3;
                        Log.m105925i("MicroMsg.Voip.VoipService", "steve:[simucall]myInviteName:%s, mutualCalling:%s,caller:%d,myInviteType:%d,finalType:%d", str2, Boolean.valueOf(equals), Integer.valueOf(i6), Integer.valueOf((int) z2), Integer.valueOf(z3));
                        if (i6 == 2) {
                            Log.m105924i("MicroMsg.Voip.VoipService", "steve:[simucall] i'm callee, cancel my previous invite!");
                            v2protocal v2protocal = this.f317332a.f317396a.f317500x;
                            if (!(v2protocal == null || (i3 = v2protocal.f317656n) == 0)) {
                                long j3 = v2protocal.f317665q;
                                if (!(j3 == 0 || i3 == i5)) {
                                    mo152605d(i3, j3, z2);
                                }
                            }
                            this.f317333b.mo152465d0(false, !z3);
                        } else {
                            Log.m105924i("MicroMsg.Voip.VoipService", "steve:[simucall] i'm caller, do NOT answer others' invite!");
                        }
                    } else {
                        Log.m105925i("MicroMsg.Voip.VoipService", "steve:[simucall] myInviteName:%s, mutualCalling:%s", str2, Boolean.valueOf(equals));
                    }
                }
                return i6;
            }
        }
        return -1;
    }

    /* renamed from: i */
    public void mo152611i(yu4 yu4) {
        String str;
        yu4 yu42 = yu4;
        if (this.f317332a.f317396a.f317500x.f317571H1 != 0) {
            Log.m105925i("MicroMsg.Voip.VoipService", "steve:[simucall]doTaskCallin simulcall already processed, return! VoipGetRoomInfoResp roomid:%d, roomType:%d, mProtocol.roomId:%d, iSimulCallStatus:%d ", Integer.valueOf(yu42.f145520d), Integer.valueOf(yu42.f145526j), Integer.valueOf(this.f317332a.f317396a.f317500x.f317656n), Integer.valueOf(this.f317332a.f317396a.f317500x.f317571H1));
            return;
        }
        int i = yu42.f145526j;
        boolean wf = ((C32735h) C86312j.m106911c(C32735h.class)).mo58784wf(C32735h.C32737c.clicfg_voip_newsimulcall_switch, false);
        Log.m105925i("MicroMsg.Voip.VoipService", "steve:[simucall]doTaskCallin bNewSimulCallSwitch:%b ", Boolean.valueOf(wf));
        if (wf) {
            this.f317332a.f317402g = mo152610h(yu42.f145525i, true, yu42.f145526j, yu42.f145520d, yu42.f145521e);
            C106359m0 m0Var = this.f317332a;
            if (m0Var.f317401f) {
                yu42.f145526j = m0Var.f317403h;
            }
        }
        C106359m0 m0Var2 = this.f317332a;
        if (m0Var2.f317402g == 1) {
            if (!m0Var2.f317396a.f317454E) {
                m0Var2.mo152658d(yu42.f145520d, yu42.f145521e, 5, (byte[]) null, (byte[]) null, yu42.f145525i);
                Log.m105925i("MicroMsg.Voip.VoipService", "steve:[simucall]doTaskCallin simulcall caller send ack roomid:%d, finalRoomType:%d, orgRoomType:%d ", Integer.valueOf(yu42.f145520d), Integer.valueOf(yu42.f145526j), Integer.valueOf(i));
            }
            C115669n.INSTANCE.mo160140o(11525, true, true, Integer.valueOf(yu42.f145520d), Long.valueOf(yu42.f145521e), Integer.valueOf(i), 6, Integer.valueOf(C112597j.m153940e(MMApplicationContext.getContext())), Long.valueOf(System.currentTimeMillis()));
            return;
        }
        if (!C77091b.m93035q()) {
            MMApplicationContext.getContext();
            if (!AppForegroundDelegate.INSTANCE.f343454n) {
                Log.m105924i("MicroMsg.Voip.VoipService", "NotificationConfig.isNewVoipMsgNotification() is false and is not in foreground, now return.");
                if (this.f317349r == null && this.f317328C.stopped()) {
                    Log.m105924i("MicroMsg.Voip.VoipService", "voipGetRoomInfoResp is null and time is stopped.");
                    this.f317349r = yu42;
                    this.f317332a.f317396a.f317453D = yu42;
                    this.f317328C.startTimer(2000);
                    this.f317350s = System.currentTimeMillis();
                    Log.m105925i("MicroMsg.Voip.VoipService", "steve:voip roominfo stored!! roomid:%d, roomkey:%s, time:%d", Integer.valueOf(this.f317349r.f145520d), Long.valueOf(this.f317349r.f145521e), Integer.valueOf(this.f317349r.f145522f));
                    C115669n.INSTANCE.idkeyStat(500, 4, 1, false);
                    C112597j.m153944i(0);
                    return;
                }
                return;
            }
        }
        String str2 = yu42.f145525i;
        String s = C75592q0.m90789s();
        int i2 = yu42.f145526j;
        Log.m105925i("MicroMsg.Voip.VoipService", "doTaskCallin self:%s talker:%s type:%d roomid:%d, roomkey:%s, time:%d", s, str2, Integer.valueOf(i2), Integer.valueOf(yu42.f145520d), Long.valueOf(yu42.f145521e), Integer.valueOf(yu42.f145522f));
        if (this.f317332a.mo152664i()) {
            C106359m0 m0Var3 = this.f317332a;
            if (!m0Var3.f317401f) {
                if (m0Var3.mo152659e() != yu42.f145520d) {
                    long f = this.f317332a.mo152660f();
                    long j = yu42.f145521e;
                    if (f != j) {
                        yu4 yu43 = this.f317357z.f317150o;
                        int i3 = yu43 != null ? yu43.f145520d : 0;
                        int i4 = yu42.f145520d;
                        if (i3 != i4) {
                            if ((yu43 != null ? yu43.f145521e : 0) != j) {
                                Log.m105925i("MicroMsg.Voip.VoipService", "doTaskCallIn processing, response busy, %s %s", Integer.valueOf(i4), Long.valueOf(yu42.f145521e));
                                this.f317332a.mo152658d(yu42.f145520d, yu42.f145521e, 2, (byte[]) null, (byte[]) null, str2);
                            }
                        }
                    }
                }
                Log.m105924i("MicroMsg.Voip.VoipService", "doTaskCallin invite ignor because voip busy:roomid " + yu42.f145520d);
                C115669n nVar = C115669n.INSTANCE;
                nVar.mo160140o(11525, true, true, Integer.valueOf(yu42.f145520d), Long.valueOf(yu42.f145521e), Integer.valueOf(yu42.f145526j), 2, Integer.valueOf(C112597j.m153940e(MMApplicationContext.getContext())), Long.valueOf(System.currentTimeMillis()));
                nVar.mo160140o(11526, true, true, Integer.valueOf(C109247e.xx0().mo152615n()), Long.valueOf(C109247e.xx0().mo152616o()), Long.valueOf(C109247e.xx0().mo152617p()), 7);
                C112597j.m153944i(0);
                return;
            }
        }
        this.f317332a.getClass();
        if (((TelephonyManager) MMApplicationContext.getContext().getSystemService("phone")).getCallState() != 0) {
            this.f317332a.mo152658d(yu42.f145520d, yu42.f145521e, 3, (byte[]) null, (byte[]) null, str2);
            C106359m0 m0Var4 = this.f317332a;
            m0Var4.f317396a.f317500x.f317568G1.f317790s = 4;
            m0Var4.mo152667l(6, 0, "", 0);
            Log.m105920e("MicroMsg.Voip.VoipService", "doTaskCallin invite ignor because telephone busy:roomid " + yu42.f145520d);
            C115669n nVar2 = C115669n.INSTANCE;
            nVar2.mo160140o(11525, true, true, Integer.valueOf(yu42.f145520d), Long.valueOf(yu42.f145521e), Integer.valueOf(yu42.f145526j), 3, Integer.valueOf(C112597j.m153940e(MMApplicationContext.getContext())), Long.valueOf(System.currentTimeMillis()));
            nVar2.mo160140o(11526, true, true, Integer.valueOf(C109247e.xx0().mo152615n()), Long.valueOf(C109247e.xx0().mo152616o()), Long.valueOf(C109247e.xx0().mo152617p()), 7);
            C112597j.m153944i(0);
            return;
        }
        this.f317332a.mo152657c();
        C106359m0 m0Var5 = this.f317332a;
        if (m0Var5.f317402g == 2) {
            C106377r rVar = m0Var5.f317396a;
            v2protocal v2protocal = rVar.f317500x;
            if (v2protocal.f317656n != yu42.f145520d) {
                rVar.f317483g = true;
                rVar.f317485i = false;
                rVar.f317484h = false;
                v2protocal.f317564F0 = 0;
                v2protocal.f317561E0 = 0;
                rVar.mo152688B(3);
                C106377r rVar2 = this.f317332a.f317396a;
                v2protocal v2protocal2 = rVar2.f317500x;
                v2protocal2.f317656n = yu42.f145520d;
                v2protocal2.f317665q = yu42.f145521e;
                v2protocal2.f317569H = yu42.f145526j;
                v2protocal2.f317662p = 1;
                rVar2.f317453D = yu42;
                if (!rVar2.f317454E) {
                    rVar2.f317502z.mo152477l0(i2);
                    Log.m105925i("MicroMsg.Voip.VoipService", "steve:[simucall]doTaskCallin simulcall callee, auto accept! mProtocol.roomId=%d, roomInfo.roomId=%d", Integer.valueOf(this.f317332a.f317396a.f317500x.f317656n), Integer.valueOf(yu42.f145520d));
                }
            }
        } else if (!m0Var5.mo152671p(yu42)) {
            Log.m105920e("MicroMsg.Voip.VoipService", "doTaskCallin setInviteContent failed!");
            C115669n nVar3 = C115669n.INSTANCE;
            nVar3.mo160140o(11525, true, true, Integer.valueOf(yu42.f145520d), Long.valueOf(yu42.f145521e), Integer.valueOf(yu42.f145526j), 5, Integer.valueOf(C112597j.m153940e(MMApplicationContext.getContext())), Long.valueOf(System.currentTimeMillis()));
            nVar3.mo160140o(11526, true, true, Integer.valueOf(C109247e.xx0().mo152615n()), Long.valueOf(C109247e.xx0().mo152616o()), Long.valueOf(C109247e.xx0().mo152617p()), 7);
            C112597j.m153944i(0);
        } else {
            Context context = MMApplicationContext.getContext();
            if (((C75700k0) C86709a0.m107533q(C75700k0.class)).mo96097Ni().get(str2) == null) {
                this.f317332a.mo152658d(yu42.f145520d, yu42.f145521e, 4, (byte[]) null, (byte[]) null, str2);
                Log.m105918d("MicroMsg.Voip.VoipService", "doTaskCallin invite ignor because talker nil:roomid " + yu42.f145520d);
                C115669n nVar4 = C115669n.INSTANCE;
                nVar4.mo160140o(11525, true, true, Integer.valueOf(yu42.f145520d), Long.valueOf(yu42.f145521e), Integer.valueOf(yu42.f145526j), 4, Integer.valueOf(C112597j.m153940e(MMApplicationContext.getContext())), Long.valueOf(System.currentTimeMillis()));
                nVar4.mo160140o(11526, true, true, Integer.valueOf(C109247e.xx0().mo152615n()), Long.valueOf(C109247e.xx0().mo152616o()), Long.valueOf(C109247e.xx0().mo152617p()), 7);
                C112597j.m153944i(0);
                return;
            }
            if (1 == i2 || i2 == 0) {
                try {
                    str = str2;
                    try {
                        mo152595I(context, str2, this.f317332a.mo152660f(), false, i2 == 0, true);
                        C106359m0 m0Var6 = this.f317332a;
                        if (m0Var6 != null) {
                            m0Var6.f317398c = yu42.f145520d;
                            if (!m0Var6.f317420y.stopped()) {
                                m0Var6.f317420y.stopTimer();
                            }
                            m0Var6.f317420y.startTimer(70000);
                        }
                        Log.m105918d("MicroMsg.Voip.VoipService", "doTaskCallin invite startActivity VideoActivity");
                    } catch (Exception unused) {
                        C112597j.m153944i(2);
                        C106359m0 m0Var7 = this.f317332a;
                        int i5 = yu42.f145520d;
                        long j2 = yu42.f145521e;
                        v2protocal v2protocal3 = m0Var7.f317396a.f317500x;
                        m0Var7.mo152658d(i5, j2, 1, v2protocal3.field_peerId, v2protocal3.field_capInfo, str);
                        C115669n.INSTANCE.mo160140o(11525, true, true, Integer.valueOf(yu42.f145520d), Long.valueOf(yu42.f145521e), Integer.valueOf(yu42.f145526j), 1, Integer.valueOf(C112597j.m153940e(MMApplicationContext.getContext())), Long.valueOf(System.currentTimeMillis()));
                    }
                } catch (Exception unused2) {
                    str = str2;
                    C112597j.m153944i(2);
                    C106359m0 m0Var72 = this.f317332a;
                    int i54 = yu42.f145520d;
                    long j25 = yu42.f145521e;
                    v2protocal v2protocal32 = m0Var72.f317396a.f317500x;
                    m0Var72.mo152658d(i54, j25, 1, v2protocal32.field_peerId, v2protocal32.field_capInfo, str);
                    C115669n.INSTANCE.mo160140o(11525, true, true, Integer.valueOf(yu42.f145520d), Long.valueOf(yu42.f145521e), Integer.valueOf(yu42.f145526j), 1, Integer.valueOf(C112597j.m153940e(MMApplicationContext.getContext())), Long.valueOf(System.currentTimeMillis()));
                }
            } else {
                str = str2;
            }
            C106359m0 m0Var722 = this.f317332a;
            int i542 = yu42.f145520d;
            long j252 = yu42.f145521e;
            v2protocal v2protocal322 = m0Var722.f317396a.f317500x;
            m0Var722.mo152658d(i542, j252, 1, v2protocal322.field_peerId, v2protocal322.field_capInfo, str);
            C115669n.INSTANCE.mo160140o(11525, true, true, Integer.valueOf(yu42.f145520d), Long.valueOf(yu42.f145521e), Integer.valueOf(yu42.f145526j), 1, Integer.valueOf(C112597j.m153940e(MMApplicationContext.getContext())), Long.valueOf(System.currentTimeMillis()));
        }
    }

    /* renamed from: j */
    public void mo152612j() {
        C106400y yVar = this.f317332a.f317396a.f317450A;
        if (yVar.f317730w == 1) {
            v2protocal v2protocal = yVar.f317711d.f317500x;
            v2protocal.f317578K = v2protocal.OpenSLEnableMute();
            C112597j.m153938c("MicroMsg.Voip.VoipDeviceHandler", "seenli, opensl enableMute");
        } else if (yVar.f317709b != null) {
            yVar.f317709b.mo161909n(true);
            Log.m105924i("MicroMsg.Voip.VoipDeviceHandler", "qipeng, enableMute.");
        }
    }

    /* renamed from: k */
    public int mo152613k(ByteBuffer byteBuffer, int i, int i2, int i3, int i4, int i5, boolean z) {
        ByteBuffer byteBuffer2;
        int i6;
        int i7;
        int i8;
        int i9;
        int i15;
        int i16 = i3;
        int i17 = i4;
        int i18 = i5;
        C106400y yVar = this.f317332a.f317396a.f317450A;
        if (yVar.f317710c == 2 && yVar.f317711d.mo152717t()) {
            if (i16 == 1 || i17 == 1) {
                Log.m105920e("MicroMsg.Voip.VoipDeviceHandler", "error w and h param! w: " + i16 + ", h: " + i17);
            } else {
                yVar.f317711d.f317500x.f317679u1++;
                if (yVar.f317718k) {
                    Log.m105924i("MicroMsg.Voip.VoipDeviceHandler", "steve: StopHWEnc!!!");
                    C106377r rVar = yVar.f317711d;
                    rVar.f317500x.f317598Q1 = false;
                    yVar.f317717j = false;
                    yVar.f317718k = false;
                    if (rVar.f317463N) {
                        rVar.mo152721x(1);
                    }
                    yVar.f317711d.mo152700b(8, true, false, true);
                    yVar.f317711d.mo152700b(4, true, false, true);
                }
                boolean z2 = yVar.f317717j;
                v2protocal v2protocal = yVar.f317711d.f317500x;
                if (!v2protocal.f317598Q1 || v2protocal.f317583L1 == null) {
                    yVar.f317717j = false;
                } else {
                    if (!z) {
                        yVar.f317711d.f317500x.f317583L1.mo152562b();
                    }
                    boolean equalsIgnoreCase = yVar.f317711d.f317500x.f317583L1.f317259c.equalsIgnoreCase("video/avc");
                    boolean equalsIgnoreCase2 = yVar.f317711d.f317500x.f317583L1.f317259c.equalsIgnoreCase("video/hevc");
                    boolean z3 = 1 == (yVar.f317711d.f317500x.f317583L1.f317251C.f317292j & 1);
                    yVar.f317717j = (equalsIgnoreCase2 && z3) || (equalsIgnoreCase && z3 && yVar.f317711d.f317500x.f317583L1.f317251C.f317291i >= 6);
                }
                C112593f.f337156a.mo164365c(!yVar.f317717j);
                if (z2 && !yVar.f317717j && yVar.f317711d.f317500x.f317583L1 != null) {
                    yVar.f317711d.f317500x.f317583L1.mo152566f();
                }
                Log.m105918d("MicroMsg.Voip.VoipDeviceHandler", "steve: put video capture in, time:" + System.currentTimeMillis() + ", len:" + i + ", cnt:" + yVar.f317711d.f317500x.f317679u1 + ", mIsHWEncEnable:" + yVar.f317711d.f317500x.f317598Q1 + ", mIsHWEncUsing:" + yVar.f317717j);
                if (yVar.f317717j && yVar.f317711d.f317500x.f317583L1 != null) {
                    int i19 = yVar.f317719l;
                    if (1 != (i19 >> 8)) {
                        int i25 = i19 | 256;
                        yVar.f317719l = i25;
                        yVar.f317711d.f317502z.mo152475k0(i25);
                    }
                    if (yVar.f317711d.f317500x.f317583L1 != null) {
                        if (i18 == 1) {
                            if (z) {
                                i15 = yVar.f317711d.f317500x.f317583L1.f317254F;
                                i9 = yVar.f317711d.f317500x.f317583L1.f317255G;
                            } else if (i16 <= 1 || i17 <= 1) {
                                Log.m105920e("MicroMsg.Voip.VoipDeviceHandler", "error w and h param! w: " + i16 + ", h: " + i17);
                            } else {
                                i15 = i16;
                                i9 = i17;
                            }
                            i6 = yVar.f317711d.f317500x.f317583L1.mo152561a(byteBuffer, i15, i9, i2, false);
                        } else if (i18 == 2) {
                            i6 = 0;
                        } else {
                            if (z) {
                                i8 = yVar.f317711d.f317500x.f317583L1.f317254F;
                                i7 = yVar.f317711d.f317500x.f317583L1.f317255G;
                            } else if (i16 <= 1 || i17 <= 1) {
                                Log.m105920e("MicroMsg.Voip.VoipDeviceHandler", "error w and h param! w: " + i16 + ", h: " + i17);
                            } else {
                                i8 = i16;
                                i7 = i17;
                            }
                            i6 = yVar.f317711d.f317500x.f317583L1.mo152561a(byteBuffer, i8, i7, i2, true);
                        }
                        yVar.f317707K = null;
                        if (i6 >= 0) {
                            return 1;
                        }
                        Log.m105924i("MicroMsg.Voip.VoipDeviceHandler", "StopHWEnc!! hw encoder error: " + i6 + "old:" + yVar.f317711d.f317463N);
                        C106377r rVar2 = yVar.f317711d;
                        if (rVar2.f317463N) {
                            rVar2.mo152721x(1);
                        }
                        Log.m105924i("MicroMsg.Voip.VoipDeviceHandler", "steve: StopHWEnc!!!");
                        C106377r rVar3 = yVar.f317711d;
                        rVar3.f317500x.f317598Q1 = false;
                        yVar.f317717j = false;
                        yVar.f317718k = false;
                        rVar3.mo152700b(8, true, false, true);
                        yVar.f317711d.mo152700b(4, true, false, true);
                    }
                } else if (i16 <= 1 || i17 <= 1) {
                    Log.m105920e("MicroMsg.Voip.VoipDeviceHandler", "error w and h param! w: " + i16 + ", h: " + i17);
                } else {
                    int i26 = yVar.f317719l;
                    if ((i26 >> 8) != 0) {
                        int i27 = i26 & -257;
                        yVar.f317719l = i27;
                        yVar.f317711d.f317502z.mo152475k0(i27);
                    }
                    Util.currentTicks();
                    if (i18 == 2) {
                        ByteBuffer byteBuffer3 = yVar.f317707K;
                        if (byteBuffer3 == null || byteBuffer3.capacity() < byteBuffer.capacity()) {
                            yVar.f317707K = ByteBuffer.allocateDirect(byteBuffer.capacity());
                        }
                        yVar.f317707K.clear();
                        byteBuffer.clear();
                        yVar.f317707K.put(byteBuffer).rewind();
                        byteBuffer2 = yVar.f317707K;
                    } else {
                        byteBuffer2 = byteBuffer;
                    }
                    if (byteBuffer2 != null) {
                        return yVar.f317711d.f317500x.videoEncodeToSend2(byteBuffer2, i, i3, i4, i2);
                    }
                    Log.m105920e("MicroMsg.Voip.VoipDeviceHandler", "in put buffer is null!");
                }
            }
        }
        return 0;
    }

    /* renamed from: m */
    public void mo152614m() {
        this.f317332a.f317396a.f317450A.mo152854a();
    }

    /* renamed from: n */
    public int mo152615n() {
        return this.f317332a.mo152659e();
    }

    /* renamed from: o */
    public long mo152616o() {
        return this.f317332a.mo152660f();
    }

    /* renamed from: p */
    public long mo152617p() {
        return (long) this.f317332a.f317396a.f317500x.f317569H;
    }

    /* renamed from: q */
    public float mo152618q(boolean z) {
        float f = 0.74766356f;
        try {
            C106350h0 xx02 = C109247e.xx0();
            byte[] bArr = z ? xx02.f317332a.f317396a.f317500x.field_capInfo : xx02.f317332a.f317396a.f317500x.f317674t;
            if (bArr != null) {
                ByteBuffer wrap = ByteBuffer.wrap(bArr);
                if (wrap.getInt() > 65535) {
                    wrap.order(ByteOrder.LITTLE_ENDIAN);
                }
                wrap.getShort();
                wrap.getShort();
                float f2 = ((float) wrap.getInt()) / 100.0f;
                if (f2 != 0.0f) {
                    f = f2;
                }
                Log.m105919d("MicroMsg.Voip.VoipService", "use rate: %s, changed: %s", Float.valueOf(f), Boolean.valueOf(z));
            }
        } catch (Exception e) {
            Log.m105920e("MicroMsg.Voip.VoipService", "update failed: " + e.getMessage());
        }
        return f;
    }

    /* renamed from: r */
    public C109246a mo152619r() {
        return this.f317333b;
    }

    /* renamed from: s */
    public int mo152620s() {
        int i;
        C111730z zVar = C111730z.f334576a;
        C111730z.f334579d = C111730z.C111731a.HANGUP;
        C111720c0 c0Var = C111720c0.f334432a;
        C111720c0.f334439h = System.currentTimeMillis();
        C106359m0 m0Var = this.f317332a;
        m0Var.getClass();
        Log.m105924i("MicroMsg.Voip.VoipServiceEx", "hangUp");
        C106377r rVar = m0Var.f317396a;
        v2protocal v2protocal = rVar.f317500x;
        if (v2protocal.f317656n == 0) {
            rVar.f317450A.mo152863j();
            m0Var.f317396a.mo152707i();
            m0Var.mo152669n();
        } else {
            C106401z zVar2 = v2protocal.f317568G1;
            int i2 = rVar.f317476a;
            if (i2 == 1) {
                i = 0;
            } else {
                i = 2;
                if (i2 == 2 || i2 == 3) {
                    i = 1;
                } else if (i2 != 4) {
                    i = 3;
                }
            }
            zVar2.f317772a = i;
            m0Var.mo152662g(1);
        }
        return 0;
    }

    /* renamed from: t */
    public C109246a mo152621t(Context context, PString pString, PBool pBool, PBool pBool2, PInt pInt, PLong pLong, String str) {
        String str2;
        PString pString2 = pString;
        PBool pBool3 = pBool;
        PBool pBool4 = pBool2;
        if (this.f317333b != null) {
            Log.m105924i("MicroMsg.Voip.VoipService", "voipMgr is not null");
            pString2.value = this.f317333b.mo152445S();
            pBool3.value = this.f317333b.mo152457Z();
            pBool4.value = this.f317333b.mo152460a0();
            pInt.value = this.f317333b.mo152441Q();
            return this.f317333b;
        }
        Log.m105925i("MicroMsg.Voip.VoipService", "pToUser before is %s and after is %s", pString2.value, this.f317332a.f317413r);
        if (!pString2.value.equals(this.f317332a.f317413r)) {
            Log.m105924i("MicroMsg.VoipActivityReport", "markDiffServiceWithIntent");
            C115669n.INSTANCE.mo175913w(1433, 26, 1);
        }
        if (((C32735h) C86312j.m106911c(C32735h.class)).mo58784wf(C32735h.C32737c.clicfg_voip_use_local_params_check_voip, true)) {
            pString2.value = this.f317332a.f317413r;
        }
        C106359m0 m0Var = this.f317332a;
        String str3 = m0Var.f317413r;
        pString2.value = str3;
        pBool4.value = m0Var.f317414s;
        if (str3 == null) {
            Log.m105920e("MicroMsg.Voip.VoipService", "username is null, can't start voip");
            return null;
        } else if (pBool3.value || m0Var.mo152664i()) {
            if (C112595h.f337167b) {
                ((C111222b) C86312j.m106911c(C111222b.class)).E90(str);
                if (this.f317333b == null) {
                    throw new IllegalStateException("setMgr() should be called in createVoIPMgr()");
                }
            } else {
                this.f317333b = new NewVoipMgr();
            }
            this.f317333b.mo152470g0(context, pString2.value, pBool3.value, pBool4.value, pLong.value);
            return this.f317333b;
        } else {
            Log.m105920e("MicroMsg.Voip.VoipService", "is out call, but kenerl is not working");
            String str4 = pString2.value;
            if (pBool4.value) {
                int i = C72963f4.f212661I1;
                str2 = "voip_content_video";
            } else {
                int i2 = C72963f4.f212661I1;
                str2 = "voip_content_voice";
            }
            boolean z = pBool3.value;
            C106348g0.m143243d(str4, str2, z ? 1 : 0, 4, MMApplicationContext.getContext().getString(C0966R.string.kew));
            return null;
        }
    }

    /* renamed from: u */
    public boolean mo152622u() {
        C106377r rVar;
        C106359m0 m0Var = this.f317332a;
        if (m0Var == null || (rVar = m0Var.f317396a) == null) {
            return false;
        }
        return rVar.f317473X;
    }

    /* renamed from: v */
    public boolean mo152623v() {
        C112592e eVar = this.f317330E;
        if (eVar != null) {
            return !eVar.mo164335K();
        }
        return true;
    }

    /* renamed from: w */
    public C106369n mo152624w() {
        long n = (long) mo152615n();
        long o = mo152616o();
        C106359m0 m0Var = this.f317332a;
        v2protocal v2protocal = m0Var.f317396a.f317500x;
        return new C106369n(n, o, v2protocal.f317668r, v2protocal.f317635g, m0Var.f317414s, m0Var.f317415t);
    }

    /* renamed from: x */
    public void mo152625x(int i, int i2) {
        C106377r rVar = this.f317332a.f317396a;
        if (i == 1) {
            int i3 = rVar.f317456G;
            if (i3 == 0) {
                rVar.f317456G = 1;
            } else if (i3 == 2) {
                rVar.f317456G = 3;
            }
        } else if (i == 2) {
            int i4 = rVar.f317456G;
            if (i4 == 1) {
                rVar.f317456G = 0;
            } else if (i4 == 3) {
                rVar.f317456G = 2;
            }
        } else {
            rVar.getClass();
        }
        C112597j.m153938c("MicroMsg.Voip.VoipContext", "zhengxue: audio device occupied stat sync stat " + i + " app " + i2);
        try {
            byte[] bArr = new byte[4];
            bArr[0] = (byte) i;
            rVar.f317500x.setJNIAppCmd(2, bArr, 4);
            zt4 zt4 = new zt4();
            zt4.f186874d = i;
            zt4.f186875e = i2;
            np4 np4 = new np4();
            np4.f332185d = 4;
            np4.f332186e = new C89349b(zt4.toByteArray());
            rVar.f317500x.SendRUDP(np4.toByteArray(), np4.toByteArray().length);
        } catch (Exception unused) {
            C112597j.m153938c("MicroMsg.Voip.VoipContext", "onAudioDevOccupiedStat Error");
        }
    }

    /* renamed from: y */
    public C106331a0.C106332a mo152626y(String str) {
        if (str == null || str.length() == 0) {
            return null;
        }
        int hashCode = str.hashCode();
        C101611g<Integer, C106331a0.C106332a> gVar = f317325G;
        C106331a0.C106332a aVar = (C106331a0.C106332a) ((C101062d) gVar).get(Integer.valueOf(hashCode));
        if (aVar != null) {
            return aVar;
        }
        C106331a0.C106332a aVar2 = new C106331a0.C106332a();
        if (!aVar2.mo152539a(str)) {
            return null;
        }
        ((C101062d) gVar).mo139557c(Integer.valueOf(hashCode), aVar2);
        return aVar2;
    }

    /* renamed from: z */
    public int mo152627z() {
        String str = this.f317332a.f317413r;
        C119179t tVar = C119157j.f356862d;
        h0$$b h0__b = new h0$$b(this, str);
        C119157j jVar = (C119157j) tVar;
        jVar.getClass();
        jVar.mo183892w(h0__b, 300, false);
        C111730z zVar = C111730z.f334576a;
        C111730z.f334579d = C111730z.C111731a.REJECT;
        return this.f317332a.mo152668m();
    }
}

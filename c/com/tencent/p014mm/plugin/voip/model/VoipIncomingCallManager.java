package com.tencent.p014mm.plugin.voip.model;

import android.app.Activity;
import android.app.KeyguardManager;
import android.app.Notification;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Build;
import android.os.PowerManager;
import android.view.Window;
import android.widget.RemoteViews;
import bp3.C104160f;
import bp3.C79758p;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.app.AppForegroundDelegate;
import com.tencent.p014mm.app.C40008f;
import com.tencent.p014mm.autogen.mmdata.rpt.VoipNewCallWhenInCallReportStruct;
import com.tencent.p014mm.booter.notification.MMNotification;
import com.tencent.p014mm.p136ui.C85975v4;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.plugin.voip.p475ui.C106448g;
import com.tencent.p014mm.plugin.voip.p475ui.C106468o0;
import com.tencent.p014mm.plugin.voip.p475ui.VideoActivity;
import com.tencent.p014mm.pointers.PBool;
import com.tencent.p014mm.pointers.PInt;
import com.tencent.p014mm.pointers.PLong;
import com.tencent.p014mm.pointers.PString;
import com.tencent.p014mm.sdk.platformtools.FileProviderHelper;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C72963f4;
import com.tencent.p014mm.vfs.C86009m1;
import d03.C58010a;
import d62.C75339i;
import di3.C86312j;
import fy3.C32224a;
import gy3.C87412m;
import gy3.C87413o;
import h43.C108077f0;
import h81.C32735h;
import java.io.File;
import java.lang.ref.WeakReference;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.Set;
import kg3.C76577a;
import l33.C109246a;
import l33.C109247e;
import lu3.C34379c;
import nj2.C61767o;
import nj2.C61768p;
import p13.C62189a;
import p196ln.C76708i;
import p206nj.C11171e;
import p206nj.C76866m;
import p33.C110140b;
import p33.C110152e;
import p657pz.C89445b;
import p918s2.C90116e;
import q13.C62579a;
import qo3.C47883u;
import qo3.C77398g;
import qo3.C77426q;
import rx3.C13598b0;
import s33.C110724b;
import te3.C101864x23;
import te3.yu4;
import uu1.C111222b;
import vc3.C78382a;
import w33.C111720c0;
import wj2.C66130c;
import wj2.C66131d;
import wj2.C66132f;
import wj2.C66135h;
import z33.C112586d;
import z33.C112594g;
import z33.C112595h;
import z33.C112597j;
import z33.C112604l;
import zc2.C91661e;
import zj2.C23496a;
import zj2.C66857b;
import zj2.C66868i;
import zt3.C119157j;
import zt3.C119179t;

/* renamed from: com.tencent.mm.plugin.voip.model.VoipIncomingCallManager */
public final class VoipIncomingCallManager extends C106468o0 {

    /* renamed from: d */
    public final C110152e f317142d;

    /* renamed from: e */
    public final C106359m0 f317143e;

    /* renamed from: f */
    public C77398g f317144f;
    private byte[] field_capInfo;
    private byte[] field_peerId;

    /* renamed from: g */
    public final C66132f f317145g;

    /* renamed from: h */
    public final C66857b f317146h;

    /* renamed from: i */
    public final C62189a f317147i;

    /* renamed from: j */
    public C34379c<?> f317148j;

    /* renamed from: n */
    public C34379c<?> f317149n;

    /* renamed from: o */
    public yu4 f317150o;

    /* renamed from: p */
    public boolean f317151p;

    /* renamed from: q */
    public boolean f317152q;

    /* renamed from: r */
    public boolean f317153r;

    /* renamed from: s */
    public Set<Integer> f317154s;

    /* renamed from: com.tencent.mm.plugin.voip.model.VoipIncomingCallManager$a */
    public static final class C106324a implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ VoipIncomingCallManager f317155d;

        public C106324a(VoipIncomingCallManager voipIncomingCallManager) {
            this.f317155d = voipIncomingCallManager;
        }

        public final void run() {
            this.f317155d.mo152523I();
        }
    }

    /* renamed from: com.tencent.mm.plugin.voip.model.VoipIncomingCallManager$b */
    public static final class C106325b implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ VoipIncomingCallManager f317156d;

        public C106325b(VoipIncomingCallManager voipIncomingCallManager) {
            this.f317156d = voipIncomingCallManager;
        }

        public final void run() {
            Log.m105924i("MicroMsg.VoipIncomingCallManager", "on timeout, dismiss incoming card");
            C110140b.m149726c(this.f317156d.f317142d, false, false, false, 3, (Object) null);
            this.f317156d.mo152520D(3);
            this.f317156d.mo152519B();
        }
    }

    /* renamed from: com.tencent.mm.plugin.voip.model.VoipIncomingCallManager$c */
    public static final class C106326c extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ VoipIncomingCallManager f317157d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C106326c(VoipIncomingCallManager voipIncomingCallManager) {
            super(0);
            this.f317157d = voipIncomingCallManager;
        }

        public Object invoke() {
            this.f317157d.mo152520D(4);
            return C13598b0.f38549a;
        }
    }

    /* renamed from: com.tencent.mm.plugin.voip.model.VoipIncomingCallManager$d */
    public static final class C106327d implements C47883u {

        /* renamed from: a */
        public final /* synthetic */ VoipIncomingCallManager f317158a;

        public C106327d(VoipIncomingCallManager voipIncomingCallManager) {
            this.f317158a = voipIncomingCallManager;
        }

        /* renamed from: a */
        public final void mo353a(boolean z, String str) {
            this.f317158a.mo152520D(8);
        }
    }

    /* renamed from: com.tencent.mm.plugin.voip.model.VoipIncomingCallManager$e */
    public static final class C106328e implements C47883u {

        /* renamed from: a */
        public final /* synthetic */ VoipIncomingCallManager f317159a;

        /* renamed from: b */
        public final /* synthetic */ yu4 f317160b;

        public C106328e(VoipIncomingCallManager voipIncomingCallManager, yu4 yu4) {
            this.f317159a = voipIncomingCallManager;
            this.f317160b = yu4;
        }

        /* renamed from: a */
        public final void mo353a(boolean z, String str) {
            C110140b.m149726c(this.f317159a.f317142d, false, false, false, 3, (Object) null);
            this.f317159a.mo152520D(2);
            this.f317159a.mo152523I();
            if (C109247e.xx0().f317332a.mo152663h()) {
                Log.m105924i("MicroMsg.VoipIncomingCallManager", "click accept, hangup and waiting for accept");
                VoipIncomingCallManager voipIncomingCallManager = this.f317159a;
                voipIncomingCallManager.f317153r = true;
                voipIncomingCallManager.f317151p = false;
                voipIncomingCallManager.f317152q = true ^ C109247e.xx0().f317335d;
                C109246a aVar = C109247e.xx0().f317333b;
                if (aVar != null) {
                    ((NewVoipMgr) aVar).mo152484p();
                    return;
                }
                return;
            }
            Log.m105924i("MicroMsg.VoipIncomingCallManager", "click accept, directly accept");
            this.f317159a.mo152522H(this.f317160b);
            this.f317159a.mo152519B();
        }
    }

    public VoipIncomingCallManager(C110152e eVar, C106359m0 m0Var) {
        C87412m.m108594g(eVar, "floatCardManager");
        C87412m.m108594g(m0Var, "implVoip");
        this.f317142d = eVar;
        this.f317143e = m0Var;
        C66130c cVar = new C66130c(C66131d.START_SOUND, 0, true);
        C66132f b = C66135h.f190107E.mo90187b();
        C58010a aVar = b.f190078a;
        if (aVar != null) {
            aVar.f165940l = true;
        }
        this.f317145g = b;
        C87412m.m108591d(aVar);
        Log.m105924i("MicroMsg.RingtonePlayer", "create ringtonePlayer, mediaInfo:" + aVar + ", soundInfo:" + cVar + ", isOutCall:" + false);
        this.f317146h = aVar.f165933e ? new C23496a(aVar, cVar, false) : new C66868i(aVar, cVar, false);
        this.f317147i = new C62189a();
        C40008f fVar = C40008f.f107254d;
        VoipIncomingCallManager$voipListener$1 voipIncomingCallManager$voipListener$1 = new VoipIncomingCallManager$voipListener$1(this, fVar);
        VoipIncomingCallManager$renderListener$1 voipIncomingCallManager$renderListener$1 = new VoipIncomingCallManager$renderListener$1(this, fVar);
        voipIncomingCallManager$voipListener$1.alive();
        voipIncomingCallManager$renderListener$1.alive();
        this.f317154s = new LinkedHashSet();
    }

    /* renamed from: c */
    public static final void m143176c(VoipIncomingCallManager voipIncomingCallManager) {
        yu4 yu4 = voipIncomingCallManager.f317150o;
        Log.m105924i("MicroMsg.VoipIncomingCallManager", "checkStartAcceptVoIP, roomInfo:" + yu4 + ", hasCleanVoipMgr:" + voipIncomingCallManager.f317151p + ", hasReleaseCamera:" + voipIncomingCallManager.f317152q);
        if (yu4 != null && voipIncomingCallManager.f317153r && voipIncomingCallManager.f317151p && voipIncomingCallManager.f317152q) {
            voipIncomingCallManager.mo152522H(yu4);
            voipIncomingCallManager.mo152519B();
        }
    }

    /* renamed from: B */
    public final void mo152519B() {
        Log.m105924i("MicroMsg.VoipIncomingCallManager", "release");
        this.f317150o = null;
        this.field_capInfo = null;
        this.field_peerId = null;
        this.f317153r = false;
        this.f317151p = false;
        this.f317152q = false;
        C77398g gVar = this.f317144f;
        if (gVar != null) {
            gVar.dismiss();
        }
        this.f317144f = null;
        C34379c<?> cVar = this.f317148j;
        if (cVar != null) {
            cVar.cancel(true);
        }
        this.f317148j = null;
        C34379c<?> cVar2 = this.f317149n;
        if (cVar2 != null) {
            cVar2.cancel(true);
        }
        this.f317149n = null;
        ((MMNotification) C91661e.f262638a).mo93207e(49);
    }

    /* renamed from: C */
    public boolean mo152421C() {
        mo152527t();
        return true;
    }

    /* renamed from: D */
    public final void mo152520D(int i) {
        yu4 yu4 = this.f317150o;
        if (yu4 != null) {
            mo152521G(i, yu4);
        }
    }

    /* renamed from: F */
    public boolean mo152425F() {
        mo152527t();
        return true;
    }

    /* renamed from: G */
    public final void mo152521G(int i, yu4 yu4) {
        C87412m.m108594g(yu4, "roomInfo");
        if (mo152526r()) {
            if (i == 9) {
                if (!this.f317154s.contains(Integer.valueOf(yu4.f145520d))) {
                    this.f317154s.add(Integer.valueOf(yu4.f145520d));
                } else {
                    return;
                }
            }
            long o = C109247e.xx0().mo152616o();
            int n = C109247e.xx0().mo152615n();
            long j = yu4.f145521e;
            int i2 = yu4.f145520d;
            VoipNewCallWhenInCallReportStruct voipNewCallWhenInCallReportStruct = new VoipNewCallWhenInCallReportStruct();
            voipNewCallWhenInCallReportStruct.f310425d = o;
            voipNewCallWhenInCallReportStruct.f310426e = (long) n;
            voipNewCallWhenInCallReportStruct.f310427f = j;
            voipNewCallWhenInCallReportStruct.f310428g = (long) i2;
            voipNewCallWhenInCallReportStruct.f310429h = (long) i;
            voipNewCallWhenInCallReportStruct.mo86054n();
        }
    }

    /* renamed from: H */
    public final void mo152522H(yu4 yu4) {
        yu4 yu42 = yu4;
        Log.m105924i("MicroMsg.VoipIncomingCallManager", "startAcceptVoIP, roomInfo:" + C43276e0.m46845a(yu4));
        if (!this.f317143e.mo152671p(yu42)) {
            Log.m105920e("MicroMsg.VoipIncomingCallManager", "startAcceptVoIP setInviteContent failed!");
            C115669n nVar = C115669n.INSTANCE;
            nVar.mo160140o(11525, true, true, Integer.valueOf(yu42.f145520d), Long.valueOf(yu42.f145521e), Integer.valueOf(yu42.f145526j), 5, Integer.valueOf(C112597j.m153940e(MMApplicationContext.getContext())), Long.valueOf(System.currentTimeMillis()));
            nVar.mo160140o(11526, true, true, Integer.valueOf(C109247e.xx0().mo152615n()), Long.valueOf(C109247e.xx0().mo152616o()), Long.valueOf(C109247e.xx0().mo152617p()), 7);
            C112597j.m153944i(0);
            return;
        }
        boolean z = yu42.f145526j == 0;
        C106350h0 xx02 = C109247e.xx0();
        String str = yu42.f145525i;
        long j = yu42.f145521e;
        xx02.getClass();
        Class cls = C111222b.class;
        Context context = MMApplicationContext.getContext();
        C112595h.m153926m();
        C106359m0 m0Var = xx02.f317332a;
        m0Var.f317413r = str;
        m0Var.f317415t = false;
        m0Var.f317414s = z;
        if (C112595h.f337171f && z && xx02.f317331F == null) {
            C109247e.vx0().mo163051e();
            xx02.f317331F = new C108077f0(false);
        }
        xx02.mo152587A();
        long currentTimeMillis = System.currentTimeMillis();
        AppForegroundDelegate appForegroundDelegate = AppForegroundDelegate.INSTANCE;
        Log.printInfoStack("MicroMsg.Voip.VoipService", "start VideoActivity in foreground,%s", Boolean.valueOf(appForegroundDelegate.f343454n));
        if (!C11171e.m11045b(28)) {
            Build.VERSION.CODENAME.equals("Q");
        }
        Intent r8 = C112595h.f337167b ? ((C111222b) C86312j.m106911c(cls)).mo161937r8(context, str, z) : new Intent(context, VideoActivity.class);
        if (r8 != null) {
            PString pString = new PString();
            PBool pBool = new PBool();
            PBool pBool2 = new PBool();
            PInt pInt = new PInt();
            AppForegroundDelegate appForegroundDelegate2 = appForegroundDelegate;
            PLong pLong = new PLong();
            pString.value = str;
            pBool.value = false;
            pBool2.value = z;
            pInt.value = C112604l.m153980c(pBool.value, z);
            pLong.value = j;
            String str2 = "MicroMsg.Voip.VoipService";
            long j2 = j;
            long j3 = currentTimeMillis;
            C109246a t = C109247e.xx0().mo152621t(context, pString, pBool, pBool2, pInt, pLong, ((C111222b) C86312j.m106911c(cls)).mo161938rz(r8));
            if (z) {
                ((NewVoipMgr) t).mo152421C();
            } else {
                ((NewVoipMgr) t).mo152425F();
            }
            if (xx02.f317330E == null) {
                xx02.f317330E = new C112586d();
            }
            C106357m.m143315m(xx02.mo152624w());
            r8.putExtra("Voip_User", str);
            r8.putExtra("Voip_Outcall", false);
            r8.putExtra("Voip_VideoCall", z);
            r8.putExtra("Voip_LastPage_Hash", j3);
            long j4 = j2;
            r8.putExtra("Voip_CallRoomKey", j4);
            r8.setFlags(603979776);
            r8.addFlags(268435456);
            if (Build.VERSION.SDK_INT >= 29 && !appForegroundDelegate2.f343454n) {
                xx02.f317354w = j3;
                Log.m105924i(str2, "start channel ring, now:" + xx02.f317354w);
            }
            Intent intent = r8;
            xx02.mo152603b(str, z, false, j4);
            C112594g.f337164c = Util.currentTicks();
            Log.m105924i("MicroMsg.VoipActivityReport", "markStartActivityNormal");
            C115669n.INSTANCE.mo175913w(1433, 4, 1);
            ((C89445b) C86312j.m106911c(C89445b.class)).mo123648UT(context, intent, (RemoteViews) null, "", intent.getComponent().getClassName(), true, C61768p.m72480h(str), true, true);
            if (C61767o.m72471g() && C76866m.m92676e()) {
                MMApplicationContext.getContext().grantUriPermission("com.android.systemui", FileProviderHelper.getUriForFile(MMApplicationContext.getContext(), C86009m1.m106378c(new File(C61768p.m72482j(str).mo90177h()))), 1);
            }
            C111720c0.f334432a.mo163401c(false, false);
        }
    }

    /* renamed from: I */
    public final void mo152523I() {
        this.f317146h.mo36981k();
        this.f317147i.mo87248c();
    }

    /* renamed from: K */
    public boolean mo152432K() {
        mo152529z();
        return true;
    }

    /* renamed from: b */
    public final boolean mo152524b(yu4 yu4) {
        boolean z;
        Activity activity;
        v2protocal v2protocal;
        v2protocal v2protocal2;
        yu4 yu42 = yu4;
        C87412m.m108594g(yu42, "roomInfo");
        if (this.f317150o != null) {
            return false;
        }
        Log.m105924i("MicroMsg.VoipIncomingCallManager", "acceptIncomingCal, roomInfo:" + C43276e0.m46845a(yu4));
        String str = yu42.f145525i;
        boolean z2 = yu42.f145526j == 0;
        C106377r rVar = this.f317143e.f317396a;
        this.field_capInfo = (rVar == null || (v2protocal2 = rVar.f317500x) == null) ? null : v2protocal2.field_capInfo;
        this.field_peerId = (rVar == null || (v2protocal = rVar.f317500x) == null) ? null : v2protocal.field_peerId;
        C34379c<?> cVar = this.f317149n;
        if (cVar != null) {
            cVar.cancel(true);
        }
        this.f317146h.mo36977g(0);
        this.f317146h.mo36976f();
        this.f317147i.mo87246a(this.f317145g.mo90178i(), (C62579a) null);
        this.f317147i.mo87247b();
        C119179t tVar = C119157j.f356862d;
        C106324a aVar = new C106324a(this);
        C119157j jVar = (C119157j) tVar;
        jVar.getClass();
        this.f317149n = jVar.mo183892w(aVar, 8000, false);
        C34379c<?> cVar2 = this.f317148j;
        if (cVar2 != null) {
            cVar2.cancel(true);
        }
        C119179t tVar2 = C119157j.f356862d;
        C106325b bVar = new C106325b(this);
        C119157j jVar2 = (C119157j) tVar2;
        jVar2.getClass();
        this.f317148j = jVar2.mo183892w(bVar, 70000, false);
        Intent intent = new Intent();
        Context context = MMApplicationContext.getContext();
        C110152e eVar = this.f317142d;
        WeakReference<C106448g> weakReference = new WeakReference<>(this);
        eVar.getClass();
        eVar.f329554w = weakReference;
        this.f317142d.f329555x = new C106326c(this);
        C110152e eVar2 = this.f317142d;
        C87412m.m108593f(context, "context");
        long j = yu42.f145521e;
        int i = yu42.f145520d;
        C87412m.m108593f(str, "talker");
        Context context2 = context;
        C110152e.m149748u(eVar2, context, intent, j, i, z2, str, false, 3, 64, (Object) null);
        Object systemService = context2.getSystemService("keyguard");
        C87412m.m108592e(systemService, "null cannot be cast to non-null type android.app.KeyguardManager");
        Object systemService2 = context2.getSystemService("power");
        C87412m.m108592e(systemService2, "null cannot be cast to non-null type android.os.PowerManager");
        WeakReference<Activity> e = AppForegroundDelegate.INSTANCE.mo174211e();
        boolean isKeyguardLocked = ((KeyguardManager) systemService).isKeyguardLocked();
        boolean isInteractive = ((PowerManager) systemService2).isInteractive();
        boolean z3 = (e != null ? e.get() : null) instanceof VideoActivity;
        boolean hasWindowFocus = (e == null || (activity = e.get()) == null) ? false : activity.hasWindowFocus();
        Log.m105924i("MicroMsg.VoipIncomingCallManager", "check if show notification, isKeyguardLocked:" + isKeyguardLocked + ", isScreenOn:" + isInteractive + ", isVideoActivityForeground:" + z3 + ", hasWindowFocus:" + hasWindowFocus);
        if (!isKeyguardLocked || isInteractive || z3) {
            z = true;
        } else {
            Log.m105924i("MicroMsg.VoipIncomingCallManager", "show incoming call notification");
            Intent intent2 = new Intent();
            intent2.setClassName(context2, "com.tencent.mm.ui.LauncherUI");
            intent2.addFlags(536870912);
            intent2.addFlags(67108864);
            PendingIntent activity2 = PendingIntent.getActivity(context2, 0, intent2, 134217728);
            Bitmap jC = ((C76708i) C86312j.m106911c(C76708i.class)).mo106840jC(str, false, 20);
            String displayName = ((C75339i) C86312j.m106911c(C75339i.class)).getDisplayName(str);
            if (displayName == null) {
                displayName = "";
            }
            z = true;
            String string = context2.getResources().getString(z2 ? C0966R.string.kj9 : C0966R.string.kjg, new Object[]{displayName});
            C87412m.m108593f(string, "context.resources.getStr…       talkerDisplayName)");
            C90116e.C90121c cVar3 = new C90116e.C90121c(context2, C78382a.m94651c());
            cVar3.f258798j = 1;
            cVar3.f258806r = "call";
            long currentTimeMillis = System.currentTimeMillis();
            Notification notification = cVar3.f258814z;
            notification.when = currentTimeMillis;
            cVar3.f258795g = activity2;
            notification.icon = C0966R.C0969drawable.c9k;
            cVar3.mo124385j(jC);
            cVar3.mo124383h(displayName);
            cVar3.mo124382g(string);
            cVar3.mo124384i(2, true);
            cVar3.mo124384i(16, true);
            Notification b = cVar3.mo124378b();
            C87412m.m108593f(b, "builder.build()");
            ((MMNotification) C91661e.f262638a).mo93215l(49, b, true);
        }
        this.f317143e.mo152658d(yu42.f145520d, yu42.f145521e, 1, this.field_peerId, this.field_capInfo, str);
        this.f317150o = yu42;
        return z;
    }

    /* renamed from: k */
    public final boolean mo152525k(boolean z) {
        if (!mo152526r()) {
            return false;
        }
        boolean l = C106350h0.m143252l(MMApplicationContext.getContext(), z);
        StringBuilder sb = new StringBuilder();
        sb.append("canAcceptIncomingCall, isVideoCalling:");
        sb.append(z);
        sb.append(", hasPermission:");
        sb.append(l);
        sb.append(", inviteInfo:");
        yu4 yu4 = this.f317150o;
        sb.append(yu4 != null ? C43276e0.m46845a(yu4) : null);
        Log.m105924i("MicroMsg.VoipIncomingCallManager", sb.toString());
        return this.f317150o == null && l;
    }

    /* renamed from: q */
    public boolean mo152486q() {
        mo152529z();
        return true;
    }

    /* renamed from: r */
    public final boolean mo152526r() {
        int e = C79758p.f233760a.mo109882e(C104160f.RepairerConfig_VOIP_UIFrameWork_Int, 0);
        Log.m105924i("MicroMsg.VoipIncomingCallManager", "RepairerConfig_VOIP_UIFrameWork_Int value:" + e);
        if (e == -1) {
            Log.m105924i("MicroMsg.VoipIncomingCallManager", "RepairerConfig_VOIP_UIFrameWork_Int is -1, disable incoming call feature");
            return false;
        }
        boolean wf = ((C32735h) C86312j.m106911c(C32735h.class)).mo58784wf(C32735h.C32738b.clicfg_voip_allow_incoming_call_when_connected, false);
        Log.m105924i("MicroMsg.VoipIncomingCallManager", "clicfg_voip_allow_incoming_call_when_connected value:" + wf);
        return e == 1 || wf;
    }

    /* renamed from: t */
    public final void mo152527t() {
        yu4 yu4 = this.f317150o;
        if (yu4 != null) {
            Log.m105924i("MicroMsg.VoipIncomingCallManager", "onAccept, roomInfo:" + C43276e0.m46845a(yu4));
            if (C109247e.xx0().f317332a.mo152663h()) {
                C77426q qVar = new C77426q(MMApplicationContext.getContext());
                qVar.mo107606r(C76577a.m92166q(MMApplicationContext.getContext(), C0966R.string.f361510ng3));
                qVar.mo107598j(C76577a.m92166q(MMApplicationContext.getContext(), C0966R.string.f7926wf));
                qVar.mo107597i(new C106327d(this));
                qVar.mo107601m(C0966R.string.f361509ng2);
                qVar.mo107599k(C76577a.m92153d(MMApplicationContext.getContext(), C0966R.color.a1d));
                qVar.mo107600l(new C106328e(this, yu4));
                if (qVar.f225839c == null) {
                    qVar.f225839c = qVar.f225837a.mo107548a();
                }
                Window window = qVar.f225839c.getWindow();
                if (window != null) {
                    if (Build.VERSION.SDK_INT >= 26) {
                        window.setType(2038);
                    } else {
                        window.setType(2002);
                    }
                    window.addFlags(524288);
                    C85975v4.m106304a("dialog", "show top window not null!!", new Object[0]);
                }
                qVar.f225839c.show();
                this.f317144f = qVar.f225839c;
                mo152520D(7);
                return;
            }
            Log.m105924i("MicroMsg.VoipIncomingCallManager", "directly accept");
            C110140b.m149726c(this.f317142d, false, false, false, 3, (Object) null);
            mo152523I();
            mo152522H(yu4);
            mo152520D(2);
            mo152519B();
        }
    }

    /* renamed from: w */
    public final void mo152528w(int i) {
        yu4 yu4 = this.f317150o;
        if (yu4 != null) {
            Log.m105924i("MicroMsg.VoipIncomingCallManager", "onCancelInvite, roomId:" + i);
            if (yu4.f145520d == i) {
                mo152523I();
                C110140b.m149726c(this.f317142d, false, false, false, 3, (Object) null);
                mo152519B();
            }
        }
    }

    /* renamed from: z */
    public final void mo152529z() {
        String str;
        yu4 yu4 = this.f317150o;
        if (yu4 != null) {
            Log.m105924i("MicroMsg.VoipIncomingCallManager", "onReject, roomInfo:" + C43276e0.m46845a(yu4));
            mo152523I();
            long j = yu4.f145521e;
            int i = yu4.f145520d;
            boolean z = yu4.f145526j == 0;
            new C110724b(2, C112597j.m153940e(MMApplicationContext.getContext()), i, new byte[0], new byte[0], j, false, false, (LinkedList<C101864x23>) null).mo88544n1();
            String str2 = yu4.f145525i;
            if (z) {
                int i2 = C72963f4.f212661I1;
                str = "voip_content_video";
            } else {
                int i3 = C72963f4.f212661I1;
                str = "voip_content_voice";
            }
            C106348g0.m143243d(str2, str, 0, 6, MMApplicationContext.getContext().getString(C0966R.string.kf6));
            mo152520D(1);
            mo152519B();
        }
    }
}

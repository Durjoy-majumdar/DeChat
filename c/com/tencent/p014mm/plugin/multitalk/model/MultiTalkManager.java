package com.tencent.p014mm.plugin.multitalk.model;

import android.app.Activity;
import android.app.ActivityManager;
import android.app.KeyguardManager;
import android.app.Notification;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Looper;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import android.view.View;
import androidx.lifecycle.C54219z;
import as3.C103860b1;
import as3.C103896q0;
import as3.C103900s0;
import bd2.C79690d;
import bs3.C104161b;
import bs3.C104166f;
import bs3.C28416g;
import c82.C104323b;
import c92.C104328f;
import c92.C104329g;
import c92.C104331h;
import com.tencent.mars.smc.IDKey;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.app.C40008f;
import com.tencent.p014mm.autogen.events.ExitMultiTalkRoomEvent;
import com.tencent.p014mm.autogen.events.MultiTalkActionEvent;
import com.tencent.p014mm.autogen.events.RefreshMainUIMultitalkIconEvent;
import com.tencent.p014mm.autogen.mmdata.rpt.MultitalkFeatureReportStruct;
import com.tencent.p014mm.booter.notification.MMNotification;
import com.tencent.p014mm.p136ui.C85861e4;
import com.tencent.p014mm.plugin.multi.talk;
import com.tencent.p014mm.plugin.multitalk.ilinkservice.C105597a2;
import com.tencent.p014mm.plugin.multitalk.ilinkservice.C105598b;
import com.tencent.p014mm.plugin.multitalk.ilinkservice.C105607c2;
import com.tencent.p014mm.plugin.multitalk.ilinkservice.C105630g1;
import com.tencent.p014mm.plugin.multitalk.ilinkservice.C105660m0;
import com.tencent.p014mm.plugin.multitalk.ilinkservice.C105683r;
import com.tencent.p014mm.plugin.multitalk.ilinkservice.C105712v1;
import com.tencent.p014mm.plugin.multitalk.ilinkservice.C105713v2;
import com.tencent.p014mm.plugin.multitalk.ilinkservice.C105714w;
import com.tencent.p014mm.plugin.multitalk.ilinkservice.C105716w1;
import com.tencent.p014mm.plugin.multitalk.ilinkservice.C105724z;
import com.tencent.p014mm.plugin.multitalk.model.C105806i0;
import com.tencent.p014mm.plugin.multitalk.model.C105817m0;
import com.tencent.p014mm.plugin.multitalk.p078ui.C105873a;
import com.tencent.p014mm.plugin.multitalk.p078ui.C105880b;
import com.tencent.p014mm.plugin.multitalk.p078ui.MultiTalkMainUI;
import com.tencent.p014mm.plugin.multitalk.service.MultiTalkingForegroundService;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.plugin.voip.model.v2protocal;
import com.tencent.p014mm.plugin.voip.p475ui.C106443e;
import com.tencent.p014mm.plugin.voip.widget.BaseSmallView;
import com.tencent.p014mm.sdk.event.IEvent;
import com.tencent.p014mm.sdk.event.IListener;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.MMHandler;
import com.tencent.p014mm.sdk.platformtools.MMHandlerThread;
import com.tencent.p014mm.sdk.platformtools.MTimerHandler;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C44660i2;
import com.tencent.p014mm.storage.C72963f4;
import com.tencent.p014mm.storage.C72972g4;
import com.tencent.p014mm.storage.C72976h2;
import com.tencent.p014mm.storage.C72996z1;
import com.tencent.p1102pb.talkroom.sdk.MultiTalkGroup;
import com.tencent.p1102pb.talkroom.sdk.MultiTalkGroupMember;
import com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys;
import com.tencent.tinker.loader.hotplug.EnvConsts;
import com.tencent.wecall.talkroom.model.TalkRoom;
import com.tencent.xweb.IXWebBroadcastListener;
import d62.C75339i;
import dd0.C75346e;
import di3.C86312j;
import ds3.C107061a;
import ds3.C107064d;
import ds3.C107065e;
import eb0.C31519v2;
import eb0.C75568c3;
import eb0.C75592q0;
import eb0.C75597w2;
import f40.C86709a0;
import f62.C75700k0;
import f82.C107496d;
import f82.C107506f;
import fy3.C32226l;
import gy3.C87412m;
import j20.C117292a;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.TimerTask;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import k20.C9556a;
import lc3.C10485b;
import lu3.C34379c;
import nj2.C109749c;
import nw3.C109770a;
import nw3.C109772b;
import nw3.C109774c;
import nw3.C109777d;
import nw3.C109779e;
import nw3.C109782f;
import nw3.C109804j;
import nw3.C109821x;
import ow3.C110088l;
import p182kk.C61104a;
import p206nj.C11171e;
import p212oe.C117770m;
import p33.C110140b;
import p447aw.C103918d;
import p447aw.C54369c;
import p629ny.C76979h;
import p645pj.C77091b;
import p740wo.C53193b;
import p910lj.C76701a;
import p918s2.C90116e;
import pu0.C110248b;
import rx3.C13598b0;
import sx3.C110818d0;
import v82.C111425d1;
import v82.C111451g1;
import v82.C111452h1;
import vc3.C78382a;
import w33.C111720c0;
import z33.C112581a;
import z33.C91617n;
import zr3.C112675e;
import zt3.C119157j;

/* renamed from: com.tencent.mm.plugin.multitalk.model.MultiTalkManager */
public class MultiTalkManager implements C107061a, ServiceConnection {

    /* renamed from: A */
    public boolean f314459A = false;

    /* renamed from: B */
    public long f314460B = 0;

    /* renamed from: C */
    public long f314461C = 30000;

    /* renamed from: D */
    public C105805i f314462D;

    /* renamed from: E */
    public C34379c<?> f314463E = null;

    /* renamed from: F */
    public C105806i0.C105807a f314464F;

    /* renamed from: G */
    public boolean f314465G;

    /* renamed from: H */
    public MultiTalkGroup f314466H = null;

    /* renamed from: I */
    public long f314467I = 0;

    /* renamed from: J */
    public boolean f314468J = false;

    /* renamed from: K */
    public C104323b f314469K;

    /* renamed from: L */
    public C105799g0 f314470L;

    /* renamed from: M */
    public C105798e1 f314471M;

    /* renamed from: N */
    public C105857z0 f314472N;

    /* renamed from: P */
    public C105770a f314473P;

    /* renamed from: Q */
    public C105783b0 f314474Q;

    /* renamed from: Q0 */
    public C54219z f314475Q0;

    /* renamed from: R */
    public final C105873a f314476R;

    /* renamed from: R0 */
    public boolean f314477R0;

    /* renamed from: S */
    public Object f314478S;

    /* renamed from: S0 */
    public boolean f314479S0;

    /* renamed from: T */
    public Object f314480T;

    /* renamed from: T0 */
    public int f314481T0;

    /* renamed from: U */
    public final Map<String, Object> f314482U;

    /* renamed from: U0 */
    public MMHandler f314483U0;

    /* renamed from: V */
    public HashMap<String, Integer> f314484V;

    /* renamed from: V0 */
    public BroadcastReceiver f314485V0;

    /* renamed from: W */
    public C105841u0 f314486W;

    /* renamed from: W0 */
    public IListener f314487W0;

    /* renamed from: X */
    public C117770m f314488X;

    /* renamed from: X0 */
    public IListener f314489X0;

    /* renamed from: Y */
    public CopyOnWriteArrayList<String> f314490Y;

    /* renamed from: Z */
    public MTimerHandler f314491Z;

    /* renamed from: d */
    public boolean f314492d;

    /* renamed from: e */
    public boolean f314493e;

    /* renamed from: f */
    public boolean f314494f;

    /* renamed from: g */
    public boolean f314495g;

    /* renamed from: h */
    public int f314496h;

    /* renamed from: i */
    public boolean f314497i = true;

    /* renamed from: j */
    public boolean f314498j = false;

    /* renamed from: n */
    public boolean f314499n = false;

    /* renamed from: o */
    public Bundle f314500o;

    /* renamed from: p */
    public boolean f314501p = false;

    /* renamed from: p0 */
    public C105769o f314502p0;

    /* renamed from: q */
    public HashSet<String> f314503q = new HashSet<>();

    /* renamed from: r */
    public List<C103900s0> f314504r = new ArrayList();

    /* renamed from: s */
    public C111452h1 f314505s = C111452h1.Init;

    /* renamed from: t */
    public MultiTalkGroup f314506t = null;

    /* renamed from: u */
    public C105817m0 f314507u;

    /* renamed from: v */
    public boolean f314508v = false;

    /* renamed from: w */
    public boolean f314509w = false;

    /* renamed from: x */
    public long f314510x = 0;

    /* renamed from: x0 */
    public boolean f314511x0;

    /* renamed from: y */
    public int f314512y = 0;

    /* renamed from: y0 */
    public C105844v0 f314513y0;

    /* renamed from: z */
    public boolean f314514z = false;

    /* renamed from: com.tencent.mm.plugin.multitalk.model.MultiTalkManager$a */
    public class C105749a implements C75597w2.C31525a {
        public C105749a(MultiTalkManager multiTalkManager) {
        }

        /* renamed from: a */
        public void mo1109a(String str, boolean z) {
        }
    }

    /* renamed from: com.tencent.mm.plugin.multitalk.model.MultiTalkManager$b */
    public class C105750b implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ MultiTalkGroup f314517d;

        public C105750b(MultiTalkManager multiTalkManager, MultiTalkGroup multiTalkGroup) {
            this.f314517d = multiTalkGroup;
        }

        public void run() {
            String str = this.f314517d.f320042d;
            if (Util.isNullOrNil(str)) {
                str = this.f314517d.f320043e;
            }
            ((C109779e) C105851w0.xx0().f314798d).mo161031b(str);
        }
    }

    /* renamed from: com.tencent.mm.plugin.multitalk.model.MultiTalkManager$c */
    public class C105751c implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ MultiTalkGroup f314518d;

        /* renamed from: e */
        public final /* synthetic */ Intent f314519e;

        /* renamed from: f */
        public final /* synthetic */ String f314520f;

        public C105751c(MultiTalkGroup multiTalkGroup, Intent intent, String str) {
            this.f314518d = multiTalkGroup;
            this.f314519e = intent;
            this.f314520f = str;
        }

        public void run() {
            C105873a aVar = MultiTalkManager.this.f314476R;
            aVar.f314912w = this.f314518d;
            Context context = MMApplicationContext.getContext();
            Intent intent = this.f314519e;
            String str = this.f314520f;
            aVar.getClass();
            C87412m.m108594g(context, "context");
            C87412m.m108594g(intent, "intent");
            C87412m.m108594g(str, "toUser");
            aVar.mo161552s(context, intent, 0, 0, str, false);
            MultiTalkManager.this.mo150645V(false);
        }
    }

    /* renamed from: com.tencent.mm.plugin.multitalk.model.MultiTalkManager$d */
    public class C105752d implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ Notification f314522d;

        /* renamed from: e */
        public final /* synthetic */ boolean f314523e;

        /* renamed from: com.tencent.mm.plugin.multitalk.model.MultiTalkManager$d$a */
        public class C105753a implements C106443e {
            public C105753a() {
            }

            /* renamed from: a */
            public boolean mo150077a() {
                return MultiTalkManager.this.mo150683y() || MultiTalkManager.this.mo150684z();
            }

            /* renamed from: b */
            public void mo150078b() {
                String e = C105806i0.m142152e(C105851w0.zx0().f314506t);
                boolean B = C105851w0.zx0().mo150625B();
                boolean z = C105752d.this.f314523e;
                if (B && z) {
                    C115669n.INSTANCE.mo160131h(12917, e, 2, 1);
                } else if (B) {
                    C115669n.INSTANCE.mo160131h(12917, e, 2, 2);
                } else if (z) {
                    C115669n.INSTANCE.mo160131h(12917, e, 1, 1);
                } else {
                    C115669n.INSTANCE.mo160131h(12917, e, 1, 2);
                }
                C76701a.makeText(MMApplicationContext.getContext(), (int) C0966R.string.h06, 0).show();
                ((MMNotification) ((C79690d) C86312j.m106911c(C79690d.class)).mo109806kA()).mo93215l(43, C105752d.this.f314522d, false);
                C105805i iVar = MultiTalkManager.this.f314462D;
                if (iVar != null) {
                    iVar.mo150754L1();
                }
                MultiTalkManager multiTalkManager = MultiTalkManager.this;
                C105798e1 e1Var = multiTalkManager.f314471M;
                if (e1Var != null) {
                    e1Var.f314608b = true;
                    e1Var.f314609c = null;
                    multiTalkManager.f314471M = null;
                }
                multiTalkManager.mo150652b(true);
                MultiTalkManager multiTalkManager2 = MultiTalkManager.this;
                multiTalkManager2.getClass();
                try {
                    Log.m105924i("MicroMsg.MT.MultiTalkManager", "bindSmallServiceIfNeed");
                    if (C11171e.m11046c(26)) {
                        multiTalkManager2.f314468J = true;
                        Intent intent = new Intent();
                        if (multiTalkManager2.f314499n) {
                            intent.putExtra("enterMainUIScreenProjectOnline", true);
                            intent.putExtra("enterMainUIScreenProjectParams", multiTalkManager2.f314500o);
                        }
                        intent.setClass(MMApplicationContext.getContext(), MultiTalkingForegroundService.class);
                        MMApplicationContext.getContext().bindService(intent, multiTalkManager2, 1);
                    }
                } catch (Exception e2) {
                    Log.printErrStackTrace("MicroMsg.MT.MultiTalkManager", e2, "bindSmallServiceIfNeed error: %s", e2.getMessage());
                }
            }

            /* renamed from: c */
            public void mo150079c() {
                MultiTalkManager.this.f314477R0 = false;
            }

            /* renamed from: d */
            public void mo150080d(Intent intent, BaseSmallView baseSmallView) {
                if (!MultiTalkManager.this.mo150684z()) {
                    baseSmallView.mo153027l(MMApplicationContext.getContext().getString(C0966R.string.h1e));
                    return;
                }
                int i = MultiTalkManager.this.f314512y;
                baseSmallView.mo153028m(String.format("%02d:%02d", new Object[]{Integer.valueOf(i / 60), Integer.valueOf(i % 60)}));
            }
        }

        public C105752d(Notification notification, boolean z) {
            this.f314522d = notification;
            this.f314523e = z;
        }

        public void run() {
            boolean z = true;
            MultiTalkManager.this.f314477R0 = true;
            Intent intent = new Intent();
            if (MultiTalkManager.this.f314499n) {
                intent.putExtra("enterMainUIScreenProjectOnline", true);
                intent.putExtra("enterMainUIScreenProjectParams", MultiTalkManager.this.f314500o);
            }
            intent.setFlags(268435456);
            MultiTalkGroup multiTalkGroup = MultiTalkManager.this.f314506t;
            intent.putExtra("enterMainUiWxGroupId", multiTalkGroup != null ? multiTalkGroup.f320044f : "");
            intent.setClass(MMApplicationContext.getContext(), MultiTalkMainUI.class);
            intent.putExtra("notification", this.f314522d);
            intent.putExtra("enterMainUiSource", 1);
            C111425d1 Cx0 = C105851w0.Cx0();
            C105753a aVar = new C105753a();
            C105851w0.zx0().getClass();
            if (C105851w0.zx0().f314503q.size() <= C105851w0.zx0().f314503q.contains(C75592q0.m90789s())) {
                z = false;
            }
            Cx0.getClass();
            Cx0.f333588f = intent;
            Cx0.f333587e = aVar;
            if (!((C103918d) C86312j.m106911c(C103918d.class)).mo125776TW(MMApplicationContext.getContext(), 9)) {
                Log.m105920e("MicroMsg.MultiTalkSmallWindow", "mini, permission denied");
                Context context = MMApplicationContext.getContext();
                ((C54369c) C86312j.m106911c(C54369c.class)).xh0(context, 9, context.getString(C0966R.string.kgq), new C111451g1(aVar, Cx0, intent, z), C78382a.m94650b());
                return;
            }
            aVar.mo150078b();
            Cx0.mo163096f(intent, z);
        }
    }

    /* renamed from: com.tencent.mm.plugin.multitalk.model.MultiTalkManager$e */
    public class C105754e extends BroadcastReceiver {

        /* renamed from: com.tencent.mm.plugin.multitalk.model.MultiTalkManager$e$a */
        public class C105755a implements Runnable {
            public C105755a() {
            }

            public void run() {
                C105806i0.C105807a c = C105806i0.m142150c();
                MultiTalkManager multiTalkManager = MultiTalkManager.this;
                C105806i0.C105807a aVar = multiTalkManager.f314464F;
                if (c != aVar) {
                    multiTalkManager.f314464F = c;
                    Log.m105925i("MicroMsg.MT.MultiTalkManager", "steve: network change: %s -> %s", aVar.name(), MultiTalkManager.this.f314464F.name());
                    MultiTalkManager multiTalkManager2 = MultiTalkManager.this;
                    multiTalkManager2.mo150655c0(multiTalkManager2.f314496h, C105851w0.zx0().f314498j);
                    MultiTalkManager multiTalkManager3 = MultiTalkManager.this;
                    C105805i iVar = multiTalkManager3.f314462D;
                    if (iVar != null) {
                        iVar.mo150758U4(aVar, multiTalkManager3.f314464F);
                        return;
                    }
                    return;
                }
                multiTalkManager.mo150655c0(multiTalkManager.f314496h, multiTalkManager.f314479S0);
                Log.m105925i("MicroMsg.MT.MultiTalkManager", "network not change: %s", MultiTalkManager.this.f314464F.name());
            }
        }

        /* renamed from: com.tencent.mm.plugin.multitalk.model.MultiTalkManager$e$b */
        public class C105756b implements Runnable {

            /* renamed from: d */
            public final /* synthetic */ boolean f314528d;

            public C105756b(boolean z) {
                this.f314528d = z;
            }

            public void run() {
                if (this.f314528d) {
                    C105724z.INSTANCE.mo150616z(true);
                } else {
                    ((C109779e) C105851w0.xx0().f314798d).mo161033d(false);
                    C104323b bVar = MultiTalkManager.this.f314469K;
                    if (bVar != null) {
                        bVar.mo146016h0();
                    }
                }
                if (!C110248b.Jh0()) {
                    MultiTalkManager.this.mo150642S(C105851w0.zx0().f314494f);
                }
            }
        }

        /* renamed from: com.tencent.mm.plugin.multitalk.model.MultiTalkManager$e$c */
        public class C105757c implements Runnable {

            /* renamed from: d */
            public final /* synthetic */ boolean f314530d;

            public C105757c(C105754e eVar, boolean z) {
                this.f314530d = z;
            }

            public void run() {
                if (this.f314530d) {
                    C105724z.INSTANCE.mo150616z(false);
                } else {
                    ((C109779e) C105851w0.xx0().f314798d).mo161033d(true);
                }
            }
        }

        public C105754e() {
        }

        /* JADX WARNING: Removed duplicated region for block: B:20:0x007e  */
        /* JADX WARNING: Removed duplicated region for block: B:21:0x0087  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void onReceive(android.content.Context r5, android.content.Intent r6) {
            /*
                r4 = this;
                com.tencent.mm.plugin.multitalk.model.MultiTalkManager r0 = com.tencent.p014mm.plugin.multitalk.model.MultiTalkManager.this
                boolean r0 = r0.mo150682x()
                if (r0 != 0) goto L_0x0009
                return
            L_0x0009:
                java.lang.String r0 = r6.getAction()
                java.lang.String r1 = "android.net.conn.CONNECTIVITY_CHANGE"
                boolean r0 = r0.equals(r1)
                if (r0 == 0) goto L_0x002c
                com.tencent.mm.plugin.multitalk.model.MultiTalkManager r5 = com.tencent.p014mm.plugin.multitalk.model.MultiTalkManager.this
                com.tencent.mm.sdk.platformtools.MMHandler r5 = r5.f314483U0
                r6 = 0
                r5.removeCallbacksAndMessages(r6)
                com.tencent.mm.plugin.multitalk.model.MultiTalkManager r5 = com.tencent.p014mm.plugin.multitalk.model.MultiTalkManager.this
                com.tencent.mm.sdk.platformtools.MMHandler r5 = r5.f314483U0
                com.tencent.mm.plugin.multitalk.model.MultiTalkManager$e$a r6 = new com.tencent.mm.plugin.multitalk.model.MultiTalkManager$e$a
                r6.<init>()
                r0 = 8000(0x1f40, double:3.9525E-320)
                r5.postDelayed(r6, r0)
                goto L_0x008f
            L_0x002c:
                java.lang.String r0 = "state"
                java.lang.String r6 = r6.getStringExtra(r0)
                r0 = 2
                r1 = 1
                r2 = 0
                if (r6 == 0) goto L_0x0055
                java.lang.String r3 = "IDLE"
                boolean r3 = r6.equals(r3)
                if (r3 == 0) goto L_0x0041
                r5 = 0
                goto L_0x0061
            L_0x0041:
                java.lang.String r3 = "RINGING"
                boolean r3 = r6.equals(r3)
                if (r3 == 0) goto L_0x004b
                r5 = 1
                goto L_0x0061
            L_0x004b:
                java.lang.String r3 = "OFFHOOK"
                boolean r6 = r6.equals(r3)
                if (r6 == 0) goto L_0x0055
                r5 = 2
                goto L_0x0061
            L_0x0055:
                java.lang.String r6 = "phone"
                java.lang.Object r5 = r5.getSystemService(r6)
                android.telephony.TelephonyManager r5 = (android.telephony.TelephonyManager) r5
                int r5 = r5.getCallState()
            L_0x0061:
                com.tencent.mm.plugin.multitalk.model.MultiTalkManager r6 = com.tencent.p014mm.plugin.multitalk.model.MultiTalkManager.this
                boolean r6 = r6.mo150680v()
                java.lang.Object[] r0 = new java.lang.Object[r0]
                java.lang.Integer r3 = java.lang.Integer.valueOf(r5)
                r0[r2] = r3
                java.lang.Boolean r2 = java.lang.Boolean.valueOf(r6)
                r0[r1] = r2
                java.lang.String r1 = "MicroMsg.MT.MultiTalkManager"
                java.lang.String r2 = "phone state %d, isILinkMode:%b"
                com.tencent.p014mm.sdk.platformtools.Log.m105925i(r1, r2, r0)
                if (r5 != 0) goto L_0x0087
                com.tencent.mm.plugin.multitalk.model.MultiTalkManager$e$b r5 = new com.tencent.mm.plugin.multitalk.model.MultiTalkManager$e$b
                r5.<init>(r6)
                com.tencent.p014mm.sdk.platformtools.MMHandlerThread.postToMainThread(r5)
                goto L_0x008f
            L_0x0087:
                com.tencent.mm.plugin.multitalk.model.MultiTalkManager$e$c r5 = new com.tencent.mm.plugin.multitalk.model.MultiTalkManager$e$c
                r5.<init>(r4, r6)
                com.tencent.p014mm.sdk.platformtools.MMHandlerThread.postToMainThread(r5)
            L_0x008f:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.multitalk.model.MultiTalkManager.C105754e.onReceive(android.content.Context, android.content.Intent):void");
        }
    }

    /* renamed from: com.tencent.mm.plugin.multitalk.model.MultiTalkManager$f */
    public class C105758f extends TimerTask {

        /* renamed from: com.tencent.mm.plugin.multitalk.model.MultiTalkManager$f$a */
        public class C105759a implements Runnable {
            public C105759a() {
            }

            public void run() {
                MultiTalkManager.this.mo150660f(false, true);
            }
        }

        /* renamed from: com.tencent.mm.plugin.multitalk.model.MultiTalkManager$f$b */
        public class C105760b implements Runnable {
            public C105760b() {
            }

            /* JADX WARNING: Removed duplicated region for block: B:47:0x01d9 A[SYNTHETIC, Splitter:B:47:0x01d9] */
            /* JADX WARNING: Removed duplicated region for block: B:54:0x01f6 A[SYNTHETIC, Splitter:B:54:0x01f6] */
            /* JADX WARNING: Removed duplicated region for block: B:79:0x01fe A[SYNTHETIC] */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public void run() {
                /*
                    r13 = this;
                    com.tencent.mm.plugin.multitalk.model.MultiTalkManager$f r0 = com.tencent.p014mm.plugin.multitalk.model.MultiTalkManager.C105758f.this
                    com.tencent.mm.plugin.multitalk.model.MultiTalkManager r0 = com.tencent.p014mm.plugin.multitalk.model.MultiTalkManager.this
                    v82.h1 r0 = r0.f314505s
                    v82.h1 r1 = v82.C111452h1.Talking
                    if (r0 != r1) goto L_0x0270
                    v82.d1 r0 = com.tencent.p014mm.plugin.multitalk.model.C105851w0.Cx0()
                    com.tencent.mm.plugin.multitalk.model.MultiTalkManager$f r1 = com.tencent.p014mm.plugin.multitalk.model.MultiTalkManager.C105758f.this
                    com.tencent.mm.plugin.multitalk.model.MultiTalkManager r1 = com.tencent.p014mm.plugin.multitalk.model.MultiTalkManager.this
                    int r1 = r1.f314512y
                    v82.c1 r0 = r0.f333586d
                    r2 = 1
                    r3 = 0
                    if (r0 == 0) goto L_0x003f
                    r4 = 2
                    java.lang.Object[] r5 = new java.lang.Object[r4]
                    int r6 = r1 / 60
                    java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
                    r5[r3] = r6
                    int r1 = r1 % 60
                    java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
                    r5[r2] = r1
                    java.lang.Object[] r1 = java.util.Arrays.copyOf(r5, r4)
                    java.lang.String r4 = "%02d:%02d"
                    java.lang.String r1 = java.lang.String.format(r4, r1)
                    java.lang.String r4 = "format(format, *args)"
                    gy3.C87412m.m108593f(r1, r4)
                    r0.mo153028m(r1)
                L_0x003f:
                    com.tencent.mm.plugin.multitalk.ilinkservice.z r0 = com.tencent.p014mm.plugin.multitalk.ilinkservice.C105724z.INSTANCE
                    r0.getClass()
                    r1 = 4
                    byte[] r4 = new byte[r1]
                    com.tencent.wxmm.v2conference r5 = com.tencent.p014mm.plugin.multitalk.ilinkservice.C105714w.f314302c
                    r6 = 54
                    r5.SetAppCmd(r6, r4, r2)
                    java.lang.Object[] r5 = new java.lang.Object[r2]
                    byte r6 = r4[r3]
                    java.lang.Byte r6 = java.lang.Byte.valueOf(r6)
                    r5[r3] = r6
                    java.lang.String r6 = "MicroMsg.Multitalk.ILinkNativeEngine"
                    java.lang.String r7 = "checkUsingMultiPathCellularConn: %d"
                    com.tencent.p014mm.sdk.platformtools.Log.m105919d(r6, r7, r5)
                    byte r4 = r4[r3]
                    java.lang.String r5 = "MicroMsg.MT.MultiTalkManager"
                    if (r4 <= 0) goto L_0x00a5
                    int r4 = r0.f314414t
                    int r4 = r4 + r2
                    r0.f314414t = r4
                    com.tencent.mm.plugin.multitalk.model.MultiTalkManager$f r0 = com.tencent.p014mm.plugin.multitalk.model.MultiTalkManager.C105758f.this
                    com.tencent.mm.plugin.multitalk.model.MultiTalkManager r0 = com.tencent.p014mm.plugin.multitalk.model.MultiTalkManager.this
                    com.tencent.mm.plugin.multitalk.model.i r4 = r0.f314462D
                    if (r4 == 0) goto L_0x00a5
                    boolean r4 = r0.f314501p
                    if (r4 != 0) goto L_0x008a
                    boolean r4 = l33.C109247e.zx0()
                    if (r4 == 0) goto L_0x008a
                    r0.f314501p = r2
                    java.lang.String r4 = "onNetWorkChangeToMobileNet"
                    com.tencent.p014mm.sdk.platformtools.Log.m105924i(r5, r4)
                    com.tencent.mm.plugin.multitalk.model.i r0 = r0.f314462D
                    if (r0 == 0) goto L_0x008a
                    r0.mo150768w()
                L_0x008a:
                    com.tencent.mm.plugin.multitalk.model.MultiTalkManager$f r0 = com.tencent.p014mm.plugin.multitalk.model.MultiTalkManager.C105758f.this
                    com.tencent.mm.plugin.multitalk.model.MultiTalkManager r0 = com.tencent.p014mm.plugin.multitalk.model.MultiTalkManager.this
                    r0.getClass()
                    boolean r4 = l33.C109247e.zx0()
                    if (r4 == 0) goto L_0x00a5
                    r0.f314501p = r2
                    java.lang.String r2 = "onNetWorkCostMax"
                    com.tencent.p014mm.sdk.platformtools.Log.m105924i(r5, r2)
                    com.tencent.mm.plugin.multitalk.model.i r0 = r0.f314462D
                    if (r0 == 0) goto L_0x00a5
                    r0.mo150765r()
                L_0x00a5:
                    com.tencent.mm.plugin.multitalk.model.MultiTalkManager$f r0 = com.tencent.p014mm.plugin.multitalk.model.MultiTalkManager.C105758f.this
                    com.tencent.mm.plugin.multitalk.model.MultiTalkManager r0 = com.tencent.p014mm.plugin.multitalk.model.MultiTalkManager.this
                    com.tencent.mm.plugin.multitalk.model.i r0 = r0.f314462D
                    if (r0 == 0) goto L_0x00b0
                    r0.mo150755M2()
                L_0x00b0:
                    android.content.Context r0 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
                    int r0 = p981ie.C117159b.m165207h(r0)
                    java.nio.ByteBuffer r2 = java.nio.ByteBuffer.allocate(r1)
                    java.nio.ByteOrder r4 = java.nio.ByteOrder.LITTLE_ENDIAN
                    java.nio.ByteBuffer r2 = r2.order(r4)
                    java.nio.ByteBuffer r2 = r2.putInt(r0)
                    byte[] r2 = r2.array()
                    r6 = 85
                    int r7 = r2.length
                    com.tencent.p014mm.plugin.multitalk.ilinkservice.C105714w.m141918c(r6, r2, r7)
                    java.lang.StringBuilder r2 = new java.lang.StringBuilder
                    r2.<init>()
                    java.lang.String r6 = "batTemp = "
                    r2.append(r6)
                    r2.append(r0)
                    java.lang.String r0 = r2.toString()
                    com.tencent.p014mm.sdk.platformtools.Log.m105924i(r5, r0)
                    android.content.Context r0 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
                    int r0 = p981ie.C117159b.m165205f(r0)
                    java.nio.ByteBuffer r2 = java.nio.ByteBuffer.allocate(r1)
                    java.nio.ByteBuffer r2 = r2.order(r4)
                    java.nio.ByteBuffer r2 = r2.putInt(r0)
                    byte[] r2 = r2.array()
                    r6 = 86
                    int r7 = r2.length
                    com.tencent.p014mm.plugin.multitalk.ilinkservice.C105714w.m141918c(r6, r2, r7)
                    java.lang.StringBuilder r2 = new java.lang.StringBuilder
                    r2.<init>()
                    java.lang.String r6 = "batQuan = "
                    r2.append(r6)
                    r2.append(r0)
                    java.lang.String r0 = r2.toString()
                    com.tencent.p014mm.sdk.platformtools.Log.m105924i(r5, r0)
                    android.content.Context r0 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
                    java.lang.String r2 = "power"
                    java.lang.Object r0 = r0.getSystemService(r2)
                    android.os.PowerManager r0 = (android.os.PowerManager) r0
                    if (r0 == 0) goto L_0x0129
                    boolean r0 = r0.isPowerSaveMode()
                    goto L_0x012a
                L_0x0129:
                    r0 = 0
                L_0x012a:
                    java.nio.ByteBuffer r2 = java.nio.ByteBuffer.allocate(r1)
                    java.nio.ByteBuffer r2 = r2.order(r4)
                    java.nio.ByteBuffer r2 = r2.putInt(r0)
                    byte[] r2 = r2.array()
                    r6 = 87
                    int r7 = r2.length
                    com.tencent.p014mm.plugin.multitalk.ilinkservice.C105714w.m141918c(r6, r2, r7)
                    java.lang.StringBuilder r2 = new java.lang.StringBuilder
                    r2.<init>()
                    java.lang.String r6 = "lowBat = "
                    r2.append(r6)
                    r2.append(r0)
                    java.lang.String r0 = r2.toString()
                    com.tencent.p014mm.sdk.platformtools.Log.m105924i(r5, r0)
                    be.b r0 = p933be.C113159b.m154842h()
                    be.b$c r0 = r0.mo165664a()
                    boolean r0 = r0.mo165678c()
                    java.nio.ByteBuffer r2 = java.nio.ByteBuffer.allocate(r1)
                    java.nio.ByteBuffer r2 = r2.order(r4)
                    java.nio.ByteBuffer r2 = r2.putInt(r0)
                    byte[] r2 = r2.array()
                    r4 = 96
                    int r6 = r2.length
                    com.tencent.p014mm.plugin.multitalk.ilinkservice.C105714w.m141918c(r4, r2, r6)
                    java.lang.StringBuilder r2 = new java.lang.StringBuilder
                    r2.<init>()
                    java.lang.String r4 = "batteryCharge = "
                    r2.append(r4)
                    r2.append(r0)
                    java.lang.String r0 = r2.toString()
                    com.tencent.p014mm.sdk.platformtools.Log.m105918d(r5, r0)
                    int[] r0 = p981ie.C117159b.m165211l()
                    int r2 = p156gj.C87201q.m108260d()
                    int[] r4 = new int[r2]
                    r6 = 0
                L_0x0195:
                    if (r6 >= r2) goto L_0x021c
                    r4[r6] = r3
                    java.lang.StringBuilder r7 = new java.lang.StringBuilder
                    r7.<init>()
                    java.lang.String r8 = "/sys/devices/system/cpu/cpu"
                    r7.append(r8)
                    r7.append(r6)
                    java.lang.String r8 = "/cpufreq/cpuinfo_max_freq"
                    r7.append(r8)
                    java.lang.String r7 = r7.toString()
                    java.lang.String r8 = "e = "
                    java.lang.String r9 = "MicroMsg.CpuChecker"
                    boolean r10 = android.text.TextUtils.isEmpty(r7)
                    r11 = 0
                    if (r10 == 0) goto L_0x01bb
                    goto L_0x01f0
                L_0x01bb:
                    java.io.RandomAccessFile r10 = new java.io.RandomAccessFile     // Catch:{ all -> 0x01d1 }
                    java.lang.String r12 = "r"
                    r10.<init>(r7, r12)     // Catch:{ all -> 0x01d1 }
                    java.lang.String r11 = r10.readLine()     // Catch:{ all -> 0x01d2 }
                    r10.close()     // Catch:{ Exception -> 0x01ca }
                    goto L_0x01f0
                L_0x01ca:
                    r7 = move-exception
                    java.lang.StringBuilder r10 = new java.lang.StringBuilder
                    r10.<init>()
                    goto L_0x01e3
                L_0x01d1:
                    r10 = r11
                L_0x01d2:
                    java.lang.String r7 = "cat file fail"
                    com.tencent.p014mm.sdk.platformtools.Log.m105920e(r9, r7)     // Catch:{ all -> 0x0201 }
                    if (r10 == 0) goto L_0x01f0
                    r10.close()     // Catch:{ Exception -> 0x01dd }
                    goto L_0x01f0
                L_0x01dd:
                    r7 = move-exception
                    java.lang.StringBuilder r10 = new java.lang.StringBuilder
                    r10.<init>()
                L_0x01e3:
                    r10.append(r8)
                    r10.append(r7)
                    java.lang.String r7 = r10.toString()
                    com.tencent.p014mm.sdk.platformtools.Log.m105924i(r9, r7)
                L_0x01f0:
                    boolean r7 = android.text.TextUtils.isEmpty(r11)
                    if (r7 != 0) goto L_0x01fe
                    int r7 = java.lang.Integer.parseInt(r11)     // Catch:{ Exception -> 0x01fe }
                    int r7 = r7 / 1000
                    r4[r6] = r7     // Catch:{ Exception -> 0x01fe }
                L_0x01fe:
                    int r6 = r6 + 1
                    goto L_0x0195
                L_0x0201:
                    r0 = move-exception
                    if (r10 == 0) goto L_0x021b
                    r10.close()     // Catch:{ Exception -> 0x0208 }
                    goto L_0x021b
                L_0x0208:
                    r1 = move-exception
                    java.lang.StringBuilder r2 = new java.lang.StringBuilder
                    r2.<init>()
                    r2.append(r8)
                    r2.append(r1)
                    java.lang.String r1 = r2.toString()
                    com.tencent.p014mm.sdk.platformtools.Log.m105924i(r9, r1)
                L_0x021b:
                    throw r0
                L_0x021c:
                    r6 = 1065353216(0x3f800000, float:1.0)
                    int r7 = p156gj.C87201q.m108260d()
                    float r7 = (float) r7
                    float r6 = r6 / r7
                    r7 = 0
                    int r8 = r0.length
                    if (r8 <= 0) goto L_0x023f
                    if (r2 <= 0) goto L_0x023f
                L_0x022a:
                    int r2 = r0.length
                    if (r3 >= r2) goto L_0x023e
                    r2 = r0[r3]     // Catch:{ Exception -> 0x023b }
                    r8 = r4[r3]     // Catch:{ Exception -> 0x023b }
                    r9 = 1120403456(0x42c80000, float:100.0)
                    float r9 = r9 * r6
                    float r2 = (float) r2
                    float r9 = r9 * r2
                    float r2 = (float) r8
                    float r9 = r9 / r2
                    float r7 = r7 + r9
                L_0x023b:
                    int r3 = r3 + 1
                    goto L_0x022a
                L_0x023e:
                    int r3 = (int) r7
                L_0x023f:
                    java.nio.ByteBuffer r0 = java.nio.ByteBuffer.allocate(r1)
                    java.nio.ByteOrder r1 = java.nio.ByteOrder.LITTLE_ENDIAN
                    java.nio.ByteBuffer r0 = r0.order(r1)
                    java.nio.ByteBuffer r0 = r0.putInt(r3)
                    byte[] r0 = r0.array()
                    com.tencent.mm.plugin.multitalk.ilinkservice.z r1 = com.tencent.p014mm.plugin.multitalk.ilinkservice.C105724z.INSTANCE
                    r2 = 91
                    int r4 = r0.length
                    r1.getClass()
                    com.tencent.p014mm.plugin.multitalk.ilinkservice.C105714w.m141918c(r2, r0, r4)
                    java.lang.StringBuilder r0 = new java.lang.StringBuilder
                    r0.<init>()
                    java.lang.String r1 = "totalCpuUsage = "
                    r0.append(r1)
                    r0.append(r3)
                    java.lang.String r0 = r0.toString()
                    com.tencent.p014mm.sdk.platformtools.Log.m105918d(r5, r0)
                L_0x0270:
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.multitalk.model.MultiTalkManager.C105758f.C105760b.run():void");
            }
        }

        public C105758f() {
        }

        public void run() {
            C111452h1 h1Var = C111452h1.Talking;
            MultiTalkManager multiTalkManager = MultiTalkManager.this;
            multiTalkManager.getClass();
            if (System.currentTimeMillis() - multiTalkManager.f314510x >= 45000 && MultiTalkManager.this.f314505s != h1Var) {
                MMHandlerThread.postToMainThread(new C105759a());
            }
            MultiTalkManager multiTalkManager2 = MultiTalkManager.this;
            if (multiTalkManager2.f314505s == h1Var) {
                multiTalkManager2.f314512y++;
                ((C119157j) C119157j.f356862d).mo183895z(new C105760b());
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.multitalk.model.MultiTalkManager$g */
    public class C105761g implements C105873a.C105874a {
        public C105761g() {
        }
    }

    /* renamed from: com.tencent.mm.plugin.multitalk.model.MultiTalkManager$h */
    public class C105762h implements Comparator<MultiTalkGroupMember> {
        public C105762h(MultiTalkManager multiTalkManager) {
        }

        public int compare(Object obj, Object obj2) {
            return -((MultiTalkGroupMember) obj).f320048d.compareTo(((MultiTalkGroupMember) obj2).f320048d);
        }
    }

    /* renamed from: com.tencent.mm.plugin.multitalk.model.MultiTalkManager$i */
    public class C105763i implements Comparator<MultiTalkGroupMember> {
        public C105763i(MultiTalkManager multiTalkManager) {
        }

        public int compare(Object obj, Object obj2) {
            int i = ((MultiTalkGroupMember) obj).f320052h;
            int i2 = ((MultiTalkGroupMember) obj2).f320052h;
            if (i > i2) {
                return -1;
            }
            return i < i2 ? 1 : 0;
        }
    }

    /* renamed from: com.tencent.mm.plugin.multitalk.model.MultiTalkManager$j */
    public class C105764j implements Comparator<MultiTalkGroupMember> {
        public C105764j(MultiTalkManager multiTalkManager) {
        }

        public int compare(Object obj, Object obj2) {
            MultiTalkGroupMember multiTalkGroupMember = (MultiTalkGroupMember) obj2;
            int i = ((MultiTalkGroupMember) obj).f320050f;
            if (i == 10 && multiTalkGroupMember.f320050f == 10) {
                return 0;
            }
            if (i == 10) {
                return -1;
            }
            return i == 10 ? 1 : 0;
        }
    }

    /* renamed from: com.tencent.mm.plugin.multitalk.model.MultiTalkManager$k */
    public class C105765k implements Runnable {
        public C105765k() {
        }

        public void run() {
            C105873a aVar = MultiTalkManager.this.f314476R;
            aVar.getClass();
            C110140b.m149726c(aVar, false, false, false, 7, (Object) null);
        }
    }

    /* renamed from: com.tencent.mm.plugin.multitalk.model.MultiTalkManager$l */
    public class C105766l implements C75597w2.C31525a {
        public C105766l(MultiTalkManager multiTalkManager) {
        }

        /* renamed from: a */
        public void mo1109a(String str, boolean z) {
        }
    }

    /* renamed from: com.tencent.mm.plugin.multitalk.model.MultiTalkManager$m */
    public class C105767m implements MTimerHandler.CallBack {
        public C105767m() {
        }

        public boolean onTimerExpired() {
            Log.m105926v("MicroMsg.MT.MultiTalkManager", "voip repeat check is foreground");
            MultiTalkManager multiTalkManager = MultiTalkManager.this;
            if (multiTalkManager.f314466H == null) {
                multiTalkManager.f314467I = 0;
                multiTalkManager.f314491Z.stopTimer();
                return false;
            } else if (MultiTalkManager.m142009u(MMApplicationContext.getContext())) {
                MultiTalkManager multiTalkManager2 = MultiTalkManager.this;
                multiTalkManager2.mo150632I(multiTalkManager2.f314466H);
                MultiTalkManager multiTalkManager3 = MultiTalkManager.this;
                multiTalkManager3.f314466H = null;
                multiTalkManager3.f314467I = 0;
                multiTalkManager3.f314491Z.stopTimer();
                C115669n.INSTANCE.idkeyStat(500, 7, 1, false);
                return false;
            } else {
                long currentTimeMillis = System.currentTimeMillis();
                MultiTalkManager multiTalkManager4 = MultiTalkManager.this;
                if (currentTimeMillis - multiTalkManager4.f314467I < 60000) {
                    return true;
                }
                multiTalkManager4.f314466H = null;
                multiTalkManager4.f314467I = 0;
                multiTalkManager4.f314491Z.stopTimer();
                return false;
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.multitalk.model.MultiTalkManager$n */
    public class C105768n implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ MultiTalkGroup f314537d;

        public C105768n(MultiTalkManager multiTalkManager, MultiTalkGroup multiTalkGroup) {
            this.f314537d = multiTalkGroup;
        }

        public void run() {
            String str = this.f314537d.f320042d;
            if (Util.isNullOrNil(str)) {
                str = this.f314537d.f320043e;
            }
            ((C109779e) C105851w0.xx0().f314798d).mo161031b(str);
        }
    }

    /* renamed from: com.tencent.mm.plugin.multitalk.model.MultiTalkManager$o */
    public class C105769o {

        /* renamed from: a */
        public MultiTalkGroup f314538a;

        /* renamed from: b */
        public Boolean f314539b;

        public C105769o(MultiTalkManager multiTalkManager, MultiTalkGroup multiTalkGroup, Boolean bool) {
            this.f314538a = multiTalkGroup;
            this.f314539b = bool;
        }
    }

    public MultiTalkManager() {
        C105873a aVar = new C105873a();
        this.f314476R = aVar;
        C105761g gVar = new C105761g();
        this.f314478S = new Object();
        this.f314480T = new Object();
        this.f314482U = new HashMap();
        this.f314484V = new HashMap<>();
        this.f314486W = new C105841u0(MMApplicationContext.getContext());
        this.f314490Y = new CopyOnWriteArrayList<>();
        this.f314491Z = new MTimerHandler(Looper.getMainLooper(), (MTimerHandler.CallBack) new C105767m(), true);
        this.f314511x0 = false;
        this.f314475Q0 = new C54219z();
        this.f314479S0 = false;
        this.f314481T0 = -1;
        this.f314483U0 = new MMHandler(Looper.getMainLooper());
        this.f314485V0 = new C105754e();
        C40008f fVar = C40008f.f107254d;
        this.f314487W0 = new IListener<RefreshMainUIMultitalkIconEvent>(fVar) {
            {
                this.__eventId = -893558668;
            }

            public boolean callback(IEvent iEvent) {
                RefreshMainUIMultitalkIconEvent refreshMainUIMultitalkIconEvent = (RefreshMainUIMultitalkIconEvent) iEvent;
                if (refreshMainUIMultitalkIconEvent != null) {
                    int i = refreshMainUIMultitalkIconEvent.f310010d.f310011a;
                    if (i == 1) {
                        IntentFilter intentFilter = new IntentFilter();
                        intentFilter.addAction("android.intent.action.PHONE_STATE");
                        intentFilter.addAction("android.intent.action.PHONE_STATE_2");
                        intentFilter.addAction("android.intent.action.PHONE_STATE2");
                        intentFilter.addAction("android.intent.action.PHONE_STATE_EXT");
                        intentFilter.addAction("android.intent.action.DUAL_PHONE_STATE");
                        intentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
                        try {
                            MMApplicationContext.getContext().registerReceiver(MultiTalkManager.this.f314485V0, intentFilter);
                        } catch (Exception e) {
                            Log.m105921e("MicroMsg.MT.MultiTalkManager", "phoneStatusReceiver register error %s", e.fillInStackTrace());
                        }
                    } else if (i == 2) {
                        try {
                            MMApplicationContext.getContext().unregisterReceiver(MultiTalkManager.this.f314485V0);
                        } catch (Exception e2) {
                            Log.m105921e("MicroMsg.MT.MultiTalkManager", "phoneStatusReceiver unregister error %s", e2.fillInStackTrace());
                        }
                    }
                }
                return false;
            }
        };
        C10574818 r0 = new IListener<MultiTalkActionEvent>(fVar) {
            {
                this.__eventId = 1177822575;
            }

            public boolean callback(IEvent iEvent) {
                MultiTalkActionEvent multiTalkActionEvent = (MultiTalkActionEvent) iEvent;
                if (multiTalkActionEvent instanceof MultiTalkActionEvent) {
                    int i = multiTalkActionEvent.f154837d.f107635a;
                    if (i == 1) {
                        multiTalkActionEvent.f154838e.f154839a = MultiTalkManager.this.mo150682x();
                    } else if (i == 2) {
                        MultiTalkActionEvent.C55145b bVar = multiTalkActionEvent.f154838e;
                        C105805i iVar = MultiTalkManager.this.f314462D;
                        bVar.f154839a = iVar != null ? iVar.mo150766u6() : false;
                    }
                }
                return false;
            }
        };
        this.f314489X0 = r0;
        r0.alive();
        this.f314487W0.alive();
        this.f314465G = false;
        aVar.f314911v = gVar;
    }

    /* renamed from: u */
    public static boolean m142009u(Context context) {
        List<ActivityManager.RunningTaskInfo> runningTasks = ((ActivityManager) context.getSystemService(EnvConsts.ACTIVITY_MANAGER_SRVNAME)).getRunningTasks(1);
        if (runningTasks != null && !runningTasks.isEmpty()) {
            ComponentName componentName = runningTasks.get(0).topActivity;
            Log.m105918d("MicroMsg.MT.MultiTalkManager", "topActivity:" + componentName.flattenToString());
            if (!componentName.getPackageName().equals(context.getPackageName())) {
                Log.m105924i("MicroMsg.MT.MultiTalkManager", "is in backGround.");
                return false;
            }
        }
        if (((KeyguardManager) MMApplicationContext.getContext().getSystemService("keyguard")).inKeyguardRestrictedInputMode()) {
            return false;
        }
        Log.m105924i("MicroMsg.MT.MultiTalkManager", "is in foreGround.");
        return true;
    }

    /* renamed from: A */
    public boolean mo150624A() {
        C104323b bVar = this.f314469K;
        if (bVar == null) {
            return true;
        }
        bVar.getClass();
        return ((C109749c) C86312j.m106911c(C109749c.class)).mo86666SI() == 9;
    }

    /* renamed from: B */
    public boolean mo150625B() {
        return C105806i0.m142154g(this.f314496h);
    }

    /* renamed from: C */
    public void mo150626C(boolean z) {
        if (mo150682x() && !this.f314477R0) {
            String string = MMApplicationContext.getContext().getString(C0966R.string.gyg);
            String string2 = MMApplicationContext.getContext().getString(C0966R.string.h0h);
            Intent intent = new Intent();
            if (this.f314499n) {
                intent.putExtra("enterMainUIScreenProjectOnline", true);
                intent.putExtra("enterMainUIScreenProjectParams", this.f314500o);
            }
            intent.setClass(MMApplicationContext.getContext(), MultiTalkMainUI.class);
            PendingIntent activity = PendingIntent.getActivity(MMApplicationContext.getContext(), 43, intent, 134217728);
            int i = C0966R.C0969drawable.c9k;
            if (C11171e.m11044a(19)) {
                i = C0966R.C0969drawable.c9j;
            }
            C90116e.C90121c cVar = new C90116e.C90121c(MMApplicationContext.getContext(), "reminder_channel_id");
            cVar.mo124390o(string2);
            cVar.f258814z.when = System.currentTimeMillis();
            cVar.mo124383h(string);
            cVar.mo124382g(string2);
            cVar.f258795g = activity;
            Notification e = C91617n.m114967e(cVar);
            e.icon = i;
            e.flags |= 32;
            MMHandlerThread.postToMainThread(new C105752d(e, z));
        }
    }

    /* renamed from: D */
    public void mo150627D(C111452h1 h1Var) {
        C111452h1 h1Var2 = h1Var;
        C111452h1 h1Var3 = this.f314505s;
        this.f314505s = h1Var2;
        if (h1Var3 != h1Var2) {
            if (h1Var2 == C111452h1.Talking) {
                RefreshMainUIMultitalkIconEvent refreshMainUIMultitalkIconEvent = new RefreshMainUIMultitalkIconEvent();
                boolean z = true;
                refreshMainUIMultitalkIconEvent.f310010d.f310011a = 1;
                refreshMainUIMultitalkIconEvent.publish();
                boolean equals = this.f314506t.f320046h.equals(C75592q0.m90789s());
                long currentTimeMillis = System.currentTimeMillis() - this.f314510x;
                String e = C105806i0.m142152e(this.f314506t);
                Log.m105927v("MicroMsg.MT.MultiTalkKvReportUtil", "reportMultiTalkConnectSuccess %b %d %s", Boolean.valueOf(equals), Long.valueOf(currentTimeMillis), e);
                C115669n nVar = C115669n.INSTANCE;
                nVar.idkeyStat(220, 34, 1, false);
                nVar.mo160131h(12725, 1, Integer.valueOf(equals ? 1 : 2), Long.valueOf(currentTimeMillis), e);
                C105851w0.zx0().mo150648Y();
                C110248b.f329777h.mo161669n(3);
                if (C110248b.zx0() || C110248b.Jh0()) {
                    z = false;
                }
                mo150642S(z);
                C105851w0.xx0().mo150827g(z);
            }
            C105805i iVar = this.f314462D;
            if (iVar != null) {
                iVar.mo150770y3(h1Var3, h1Var2);
            }
        }
    }

    /* renamed from: E */
    public void mo150628E(MultiTalkGroup multiTalkGroup) {
        Log.m105925i("MicroMsg.MT.MultiTalkManager", "onCreateMultiTalk: %s", C105806i0.m142149b(multiTalkGroup));
        C105853x.m142233d(true);
        if (mo150663g0(multiTalkGroup)) {
            C104328f fVar = C104328f.f308805a;
            fVar.mo146024a(mo150680v());
            if (!TextUtils.isEmpty(multiTalkGroup.f320042d)) {
                String str = multiTalkGroup.f320042d;
                C87412m.m108594g(str, "groupId");
                C104328f.f308812h = str;
            }
            List<MultiTalkGroupMember> list = multiTalkGroup.f320047i;
            if (list != null) {
                fVar.mo146026c(list);
            }
            mo150634K();
        }
    }

    /* renamed from: F */
    public void mo150629F(String str, int i, int i2) {
        boolean z = false;
        Log.m105925i("MicroMsg.MT.MultiTalkManager", "onDoScreenSharingSecurityCheck filemd5:%s ret:%d checkRet:%d", str, Integer.valueOf(i), Integer.valueOf(i2));
        ((C119157j) C119157j.f356862d).mo183894y("delayChecking");
        C105844v0 v0Var = this.f314513y0;
        if (v0Var == null) {
            Log.m105928w("MicroMsg.MT.MultiTalkManager", "mFileSecurity is null");
            return;
        }
        if (i2 == 0) {
            z = true;
        }
        v0Var.f314796b = Boolean.valueOf(z);
        v0Var.f314795a = str;
        C54219z zVar = this.f314475Q0;
        if (zVar != null) {
            zVar.postValue(v0Var);
        }
    }

    /* renamed from: G */
    public void mo150630G(MultiTalkGroup multiTalkGroup) {
        Log.m105925i("MicroMsg.MT.MultiTalkManager", "onEnterMultiTalk: %s", C105806i0.m142149b(multiTalkGroup));
        RefreshMainUIMultitalkIconEvent refreshMainUIMultitalkIconEvent = new RefreshMainUIMultitalkIconEvent();
        refreshMainUIMultitalkIconEvent.f310010d.f310011a = 1;
        refreshMainUIMultitalkIconEvent.publish();
        C105853x.m142234e(true);
        if (this.f314505s != C111452h1.Inviting) {
            mo150627D(C111452h1.Starting);
            mo150658e(multiTalkGroup, Boolean.TRUE);
        }
        if (mo150682x() && mo150663g0(multiTalkGroup)) {
            C104328f fVar = C104328f.f308805a;
            fVar.mo146024a(mo150680v());
            String str = multiTalkGroup.f320042d;
            C87412m.m108594g(str, "groupId");
            C104328f.f308812h = str;
            List<MultiTalkGroupMember> list = multiTalkGroup.f320047i;
            if (list != null) {
                fVar.mo146026c(list);
            }
            mo150634K();
        }
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x0141, code lost:
        r9 = r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x01e0, code lost:
        r6 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x01e7, code lost:
        r6 = false;
        r9 = com.tencent.p014mm.C0966R.string.f361060gz2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x01eb, code lost:
        r1 = r11.f314462D;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x01ed, code lost:
        if (r1 == null) goto L_0x01f2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x01ef, code lost:
        r1.mo150760d(r12);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x01f4, code lost:
        if (r12 == -800) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x01f8, code lost:
        if (r12 == -500) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x01fc, code lost:
        if (r12 == -1700) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x01fe, code lost:
        p910lj.C76701a.makeText(com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext(), (java.lang.CharSequence) com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext().getString(r9, r3.toArray()), 0).show();
        mo150662g(false, false, false, true, true, r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:?, code lost:
        return;
     */
    /* renamed from: H */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo150631H(int r12, java.lang.Object r13) {
        /*
            r11 = this;
            r2 = 1
            java.lang.Object[] r3 = new java.lang.Object[r2]
            java.lang.Integer r4 = java.lang.Integer.valueOf(r12)
            r5 = 0
            r3[r5] = r4
            java.lang.String r4 = "MicroMsg.MT.MultiTalkManager"
            java.lang.String r6 = "onErr: %d"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r4, r6, r3)
            java.util.LinkedList r3 = new java.util.LinkedList
            r3.<init>()
            f40.o r6 = f40.C86709a0.m107535s()
            com.tencent.mm.storage.v1 r6 = r6.mo121142i()
            com.tencent.mm.storage.y1$a r7 = com.tencent.p014mm.storage.C72994y1.C72995a.USERINFO_MULTITALK_DISABLE_TIME_INT_SYNC
            r8 = -1
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)
            r6.mo119677K(r7, r8)
            f40.o r6 = f40.C86709a0.m107535s()
            com.tencent.mm.storage.v1 r6 = r6.mo121142i()
            com.tencent.mm.storage.y1$a r8 = com.tencent.p014mm.storage.C72994y1.C72995a.USERINFO_MULTITALK_DISABLE_TIMESTAMP_LONG_SYNC
            r9 = -1
            java.lang.Long r9 = java.lang.Long.valueOf(r9)
            r6.mo119677K(r8, r9)
            r6 = 2131833175(0x7f113157, float:1.9299425E38)
            r9 = 2131833183(0x7f11315f, float:1.929944E38)
            r10 = 2131833178(0x7f11315a, float:1.929943E38)
            switch(r12) {
                case -14287: goto L_0x01e2;
                case -14256: goto L_0x01cc;
                case -14255: goto L_0x0144;
                case -1700: goto L_0x00e0;
                case -1601: goto L_0x00da;
                case -1400: goto L_0x00d4;
                case -1300: goto L_0x0097;
                case -1200: goto L_0x0092;
                case -1100: goto L_0x008d;
                case -1000: goto L_0x0088;
                case -900: goto L_0x0083;
                case -800: goto L_0x007e;
                case -700: goto L_0x0079;
                case -600: goto L_0x01e0;
                case -500: goto L_0x0074;
                case -401: goto L_0x006a;
                case -400: goto L_0x0065;
                case -301: goto L_0x005e;
                case -300: goto L_0x0059;
                case -200: goto L_0x0051;
                case -100: goto L_0x0049;
                default: goto L_0x0047;
            }
        L_0x0047:
            goto L_0x01e0
        L_0x0049:
            com.tencent.p014mm.plugin.multitalk.model.C105853x.m142233d(r5)
            r9 = 2131833170(0x7f113152, float:1.9299415E38)
            goto L_0x01e0
        L_0x0051:
            com.tencent.p014mm.plugin.multitalk.model.C105853x.m142234e(r5)
            r9 = 2131833179(0x7f11315b, float:1.9299433E38)
            goto L_0x01e0
        L_0x0059:
            r9 = 2131833180(0x7f11315c, float:1.9299435E38)
            goto L_0x01e0
        L_0x005e:
            java.lang.String r1 = "onErr, add fail over limited"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r4, r1)
            goto L_0x01e7
        L_0x0065:
            r9 = 2131833181(0x7f11315d, float:1.9299437E38)
            goto L_0x01e0
        L_0x006a:
            java.lang.String r1 = "onErr, MULTITALK_ERRORCODE_ENGINE_NETWORK_FAIL"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r4, r1)
            r9 = 2131833225(0x7f113189, float:1.9299526E38)
            goto L_0x01e0
        L_0x0074:
            r9 = 2131833182(0x7f11315e, float:1.9299439E38)
            goto L_0x01e0
        L_0x0079:
            r9 = 2131833184(0x7f113160, float:1.9299443E38)
            goto L_0x01e0
        L_0x007e:
            r9 = 2131833185(0x7f113161, float:1.9299445E38)
            goto L_0x01e0
        L_0x0083:
            r9 = 2131833186(0x7f113162, float:1.9299447E38)
            goto L_0x01e0
        L_0x0088:
            r9 = 2131833171(0x7f113153, float:1.9299417E38)
            goto L_0x01e0
        L_0x008d:
            r9 = 2131833172(0x7f113154, float:1.9299419E38)
            goto L_0x01e0
        L_0x0092:
            r9 = 2131833173(0x7f113155, float:1.929942E38)
            goto L_0x01e0
        L_0x0097:
            r9 = 2131833174(0x7f113156, float:1.9299423E38)
            r11.f314459A = r2
            long r7 = java.lang.System.currentTimeMillis()
            r11.f314460B = r7
            if (r13 == 0) goto L_0x01e0
            r1 = r13
            as3.b0 r1 = (as3.C103859b0) r1
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r7 = "ErrorCode : -1300, now try set retrySeconds:"
            r2.append(r7)
            int r7 = r1.f306872p
            r2.append(r7)
            java.lang.String r2 = r2.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r4, r2)
            int r1 = r1.f306872p
            if (r1 == 0) goto L_0x00d0
            long r7 = (long) r1
            r9 = 1000(0x3e8, double:4.94E-321)
            long r7 = r7 * r9
            r11.f314461C = r7
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r3.add(r1)
            goto L_0x0141
        L_0x00d0:
            r6 = 2131833174(0x7f113156, float:1.9299423E38)
            goto L_0x0141
        L_0x00d4:
            r9 = 2131833176(0x7f113158, float:1.9299427E38)
            r6 = 1
            goto L_0x01eb
        L_0x00da:
            java.lang.String r0 = "onErr, skip MULTITALK_ERRORCODE_SUBSCRIBEGENERALVEDIO_FAIL! "
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r4, r0)
            return
        L_0x00e0:
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r2[r5] = r13
            java.lang.String r9 = "onErr, MULTITALK_ERRORCODE_SWITCHVIDEO_FAIL_DISABLE, disableTime: %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r4, r9, r2)
            r2 = 2131833166(0x7f11314e, float:1.9299406E38)
            if (r13 == 0) goto L_0x0127
            boolean r4 = r13 instanceof java.lang.Integer
            if (r4 == 0) goto L_0x00fa
            r1 = r13
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r1 = r1.intValue()
            goto L_0x00fb
        L_0x00fa:
            r1 = 0
        L_0x00fb:
            if (r1 <= 0) goto L_0x0127
            f40.o r2 = f40.C86709a0.m107535s()
            com.tencent.mm.storage.v1 r2 = r2.mo121142i()
            java.lang.Integer r4 = java.lang.Integer.valueOf(r1)
            r2.mo119677K(r7, r4)
            f40.o r2 = f40.C86709a0.m107535s()
            com.tencent.mm.storage.v1 r2 = r2.mo121142i()
            long r9 = com.tencent.p014mm.sdk.platformtools.Util.nowMilliSecond()
            java.lang.Long r4 = java.lang.Long.valueOf(r9)
            r2.mo119677K(r8, r4)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r3.add(r1)
            goto L_0x012a
        L_0x0127:
            r6 = 2131833166(0x7f11314e, float:1.9299406E38)
        L_0x012a:
            android.content.Context r1 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            android.content.Context r2 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            java.lang.Object[] r4 = r3.toArray()
            java.lang.String r2 = r2.getString(r6, r4)
            android.widget.Toast r1 = p910lj.C76701a.makeText((android.content.Context) r1, (java.lang.CharSequence) r2, (int) r5)
            r1.show()
        L_0x0141:
            r9 = r6
            goto L_0x01e0
        L_0x0144:
            r6 = 3
            java.lang.Object[] r6 = new java.lang.Object[r6]
            java.lang.Integer r7 = java.lang.Integer.valueOf(r12)
            r6[r5] = r7
            com.tencent.pb.talkroom.sdk.MultiTalkGroup r7 = r11.f314506t
            r6[r2] = r7
            r2 = 2
            if (r7 == 0) goto L_0x0157
            java.lang.String r7 = r7.f320044f
            goto L_0x0159
        L_0x0157:
            java.lang.String r7 = ""
        L_0x0159:
            r6[r2] = r7
            java.lang.String r2 = "onErr:MULTITALK_E_Talk_Enter_BannerClear  %d, currentMultiTalkGroup=%s,wxGroupId=%s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r4, r2, r6)
            if (r13 == 0) goto L_0x01c8
            r1 = r13
            as3.c0 r1 = (as3.C103862c0) r1
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r6 = "ErrorCode :-14255,now exitMultiTalk for groupId : "
            r2.append(r6)
            java.lang.String r6 = r1.f306915b
            r2.append(r6)
            java.lang.String r2 = r2.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r4, r2)
            as3.z0 r2 = r1.f306925l
            if (r2 == 0) goto L_0x01a2
            com.tencent.mm.plugin.multitalk.model.e0 r2 = com.tencent.p014mm.plugin.multitalk.model.C105851w0.Bx0()
            as3.z0 r6 = r1.f306925l
            java.lang.String r6 = r6.f307250m
            r2.mo96147oW(r6)
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r6 = "cleanBanner for wxGroupId :"
            r2.append(r6)
            as3.z0 r6 = r1.f306925l
            java.lang.String r6 = r6.f307250m
            r2.append(r6)
            java.lang.String r2 = r2.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r4, r2)
        L_0x01a2:
            com.tencent.mm.plugin.multitalk.model.w r2 = com.tencent.p014mm.plugin.multitalk.model.C105851w0.xx0()
            ds3.d r2 = r2.f314798d
            java.lang.String r6 = r1.f306915b
            nw3.e r2 = (nw3.C109779e) r2
            boolean r2 = r2.mo161031b(r6)
            if (r2 != 0) goto L_0x01c8
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r6 = "exit fail!!,now cleanBanner for groupId :"
            r2.append(r6)
            java.lang.String r1 = r1.f306915b
            r2.append(r1)
            java.lang.String r1 = r2.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r4, r1)
        L_0x01c8:
            r9 = 2131833251(0x7f1131a3, float:1.9299579E38)
            goto L_0x01e0
        L_0x01cc:
            java.lang.String r2 = "14256,other device has handle this!"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r4, r2)
            r9 = 2131833177(0x7f113159, float:1.9299429E38)
            if (r13 == 0) goto L_0x01e0
            r1 = r13
            as3.c0 r1 = (as3.C103862c0) r1
            nw3.f r1 = nw3.C109770a.m149092a()
            r1.mo161092Y(r5)
        L_0x01e0:
            r6 = 0
            goto L_0x01eb
        L_0x01e2:
            java.lang.String r1 = "onErr, skip the talking case old version in group and over limited"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r4, r1)
        L_0x01e7:
            r6 = 0
            r9 = 2131833178(0x7f11315a, float:1.929943E38)
        L_0x01eb:
            com.tencent.mm.plugin.multitalk.model.i r1 = r11.f314462D
            if (r1 == 0) goto L_0x01f2
            r1.mo150760d(r12)
        L_0x01f2:
            r1 = -800(0xfffffffffffffce0, float:NaN)
            if (r12 == r1) goto L_0x021e
            r1 = -500(0xfffffffffffffe0c, float:NaN)
            if (r12 == r1) goto L_0x021e
            r1 = -1700(0xfffffffffffff95c, float:NaN)
            if (r12 == r1) goto L_0x021e
            android.content.Context r0 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            android.content.Context r1 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            java.lang.Object[] r2 = r3.toArray()
            java.lang.String r1 = r1.getString(r9, r2)
            android.widget.Toast r0 = p910lj.C76701a.makeText((android.content.Context) r0, (java.lang.CharSequence) r1, (int) r5)
            r0.show()
            r1 = 0
            r2 = 0
            r3 = 0
            r4 = 1
            r5 = 1
            r0 = r11
            r0.mo150662g(r1, r2, r3, r4, r5, r6)
        L_0x021e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.multitalk.model.MultiTalkManager.mo150631H(int, java.lang.Object):void");
    }

    /* renamed from: I */
    public void mo150632I(MultiTalkGroup multiTalkGroup) {
        MultiTalkGroup multiTalkGroup2 = multiTalkGroup;
        Class cls = C53193b.class;
        Object[] objArr = new Object[5];
        objArr[0] = Boolean.valueOf(this.f314493e);
        objArr[1] = Boolean.valueOf(this.f314494f);
        objArr[2] = Boolean.valueOf(this.f314497i);
        objArr[3] = this.f314505s.toString();
        objArr[4] = Boolean.valueOf(this.f314506t == null);
        Log.m105925i("MicroMsg.MT.MultiTalkManager", "onInviteMultiTalk All Var Value:\n isMute: %b isHandsFree: %b isCameraFace: %b multiTalkStatus: %s groupIsNull: %b", objArr);
        C115669n nVar = C115669n.INSTANCE;
        nVar.idkeyStat(220, 1, 1, false);
        if (C77091b.m93035q() || m142009u(MMApplicationContext.getContext())) {
            String d = C105806i0.m142151d(multiTalkGroup);
            C72996z1 z1Var = ((C75700k0) C86709a0.m107533q(C75700k0.class)).mo96097Ni().get(d);
            if (!(((C10485b) C86709a0.m107533q(C10485b.class)).vh0().mo107404b("MultitalkBlockReceiver", 0) == 0) || z1Var == null || z1Var.mo62920o3()) {
                Log.m105924i("MicroMsg.MT.MultiTalkManager", "not open multitalk receiver or black user");
                MMHandlerThread.postToMainThreadDelayed(new C105768n(this, multiTalkGroup2), 1000);
                C105853x.m142235f(3, C105806i0.m142152e(multiTalkGroup));
                return;
            }
            if (!mo150682x() && !C91617n.m114970h() && !C91617n.m114968f() && !C75346e.m90355a()) {
                if (!(((TelephonyManager) MMApplicationContext.getContext().getSystemService("phone")).getCallState() != 0) && !C91617n.m114969g() && z1Var.mo62927s3()) {
                    if (!((C53193b) C86312j.m106911c(cls)).mo73730sj(multiTalkGroup2.f320044f)) {
                        Log.m105925i("MicroMsg.MT.MultiTalkManager", "Get Chatroom When chatroom not in conversation %s", multiTalkGroup2.f320044f);
                        C31519v2.m39436a().mo55988e(multiTalkGroup2.f320044f, "", (C75597w2.C31525a) null);
                    }
                    Log.m105925i("MicroMsg.MT.MultiTalkManager", "onInviteMultiTalk: %s", C105806i0.m142149b(multiTalkGroup));
                    mo150627D(C111452h1.Inviting);
                    C105853x.m142235f(1, C105806i0.m142152e(multiTalkGroup));
                    if (!z1Var.mo62927s3() || C61104a.m71662r()) {
                        Log.m105925i("MicroMsg.MT.MultiTalkManager", "onInviteMultiTalk nofriend do not show invitingUI  inviter=%s,currentuser=%s", d, C75592q0.m90789s());
                        if (mo150663g0(multiTalkGroup)) {
                            this.f314492d = false;
                            mo150679t();
                            mo150646W();
                            return;
                        }
                        return;
                    }
                    Log.m105925i("MicroMsg.MT.MultiTalkManager", "onInviteMultiTalk friend show invitingUI inviter=%s,currentuser=%s", d, C75592q0.m90789s());
                    MultiTalkActionEvent multiTalkActionEvent = new MultiTalkActionEvent();
                    multiTalkActionEvent.f154837d.f107635a = 3;
                    multiTalkActionEvent.publish();
                    mo150658e(multiTalkGroup2, Boolean.FALSE);
                    return;
                }
            }
            Log.m105925i("MicroMsg.MT.MultiTalkManager", "onInviteMultiTalk: exit multitalk: %s", C105806i0.m142149b(multiTalkGroup));
            if (!((C53193b) C86312j.m106911c(cls)).mo73730sj(multiTalkGroup2.f320044f)) {
                Log.m105925i("MicroMsg.MT.MultiTalkManager", "Get Chatroom When chatroom not in conversation %s", multiTalkGroup2.f320044f);
                C31519v2.m39436a().mo55988e(multiTalkGroup2.f320044f, "", new C105749a(this));
            }
            MMHandlerThread.postToMainThreadDelayed(new C105750b(this, multiTalkGroup2), 1000);
            C105853x.m142235f(3, C105806i0.m142152e(multiTalkGroup));
            return;
        }
        Log.m105924i("MicroMsg.MT.MultiTalkManager", "NotificationConfig.isNewVoipMsgNotification() is false and is not in foreground, now return.");
        if (this.f314466H == null && this.f314491Z.stopped()) {
            this.f314466H = multiTalkGroup2;
            this.f314491Z.startTimer(2000);
            this.f314467I = System.currentTimeMillis();
            nVar.idkeyStat(500, 6, 1, false);
        }
    }

    /* renamed from: J */
    public void mo150633J(MultiTalkGroup multiTalkGroup) {
        List<MultiTalkGroupMember> list;
        C111452h1 h1Var = C111452h1.Inviting;
        boolean z = true;
        Log.m105925i("MicroMsg.MT.MultiTalkManager", "onMemberChange: %s", C105806i0.m142149b(multiTalkGroup));
        if (mo150682x() && mo150663g0(multiTalkGroup)) {
            int i = 0;
            for (MultiTalkGroupMember multiTalkGroupMember : this.f314506t.f320047i) {
                int i2 = multiTalkGroupMember.f320050f;
                if (i2 == 10 || i2 == 1) {
                    i++;
                }
            }
            if (i > 1) {
                if (!(multiTalkGroup == null || (list = multiTalkGroup.f320047i) == null)) {
                    C104328f.f308805a.mo146026c(list);
                }
                C111452h1 h1Var2 = this.f314505s;
                C111452h1 h1Var3 = C111452h1.Talking;
                if (h1Var2 != h1Var3 && C105806i0.m142153f(multiTalkGroup)) {
                    mo150627D(h1Var3);
                }
                C105805i iVar = this.f314462D;
                if (iVar != null) {
                    C111452h1 h1Var4 = this.f314505s;
                    if (!(h1Var4 == C111452h1.Starting || h1Var4 == h1Var3 || h1Var4 == h1Var)) {
                        z = false;
                    }
                    if (z) {
                        iVar.mo150759X6();
                    }
                }
                if (this.f314505s == h1Var) {
                    C105873a aVar = this.f314476R;
                    aVar.getClass();
                    C87412m.m108594g(multiTalkGroup, "multiTalkGroup");
                    aVar.f314912w = multiTalkGroup;
                    View view = aVar.f329509e;
                    if (view != null) {
                        view.post(new C105880b(aVar));
                    }
                }
                String s = C75592q0.m90789s();
                C104328f fVar = C104328f.f308805a;
                C104328f.f308814j = C104331h.m139311c(s);
            } else if (this.f314505s == h1Var) {
                mo150660f(false, true);
            } else {
                mo150660f(false, false);
            }
        }
    }

    /* renamed from: K */
    public final void mo150634K() {
        ((HashMap) this.f314482U).clear();
        if (C105806i0.m142153f(this.f314506t)) {
            mo150627D(C111452h1.Talking);
            C111720c0 c0Var = C111720c0.f334432a;
            C111720c0.f334438g = System.currentTimeMillis();
        } else {
            mo150627D(C111452h1.Starting);
        }
        C105805i iVar = this.f314462D;
        if (iVar != null) {
            iVar.mo150753I();
            C105806i0.C105807a c = C105806i0.m142150c();
            if (c != this.f314464F) {
                this.f314464F = c;
                return;
            }
            return;
        }
        Intent intent = new Intent(MMApplicationContext.getContext(), MultiTalkMainUI.class);
        intent.addFlags(268435456);
        C85861e4.m106117d(MultiTalkMainUI.class, 0);
        Context context = MMApplicationContext.getContext();
        C9556a aVar = new C9556a();
        aVar.mo10233c(intent);
        Context context2 = context;
        C117292a.m165358d(context2, aVar.mo10232b(), "com/tencent/mm/plugin/multitalk/model/MultiTalkManager", "onMySelfEnterMultiTalk", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        context.startActivity((Intent) aVar.mo10231a(0));
        C117292a.m165359e(context2, "com/tencent/mm/plugin/multitalk/model/MultiTalkManager", "onMySelfEnterMultiTalk", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
    }

    /* renamed from: L */
    public void mo150635L(List<C103900s0> list) {
        if (mo150682x()) {
            this.f314503q.clear();
            Log.m105919d("MicroMsg.MT.MultiTalkManager", "onVideoGroupMemberChange: %s", list);
            C105783b0 n = mo150671n();
            boolean z = false;
            for (C103900s0 next : list) {
                int i = next.f307158e;
                if (i == 2 || i == 3) {
                    this.f314503q.add(next.f307156c);
                }
                if (n != null && next.f307159f == 101) {
                    n.mo150728j(next.f307156c);
                    this.f314503q.add(next.f307156c);
                    z = true;
                }
            }
            C104328f fVar = C104328f.f308805a;
            C104328f.f308818n = Math.max(C104328f.f308818n, this.f314503q.size());
            if (this.f314470L == null) {
                this.f314470L = new C105799g0();
            }
            C105799g0 g0Var = this.f314470L;
            if (g0Var != null) {
                ArrayList<String> arrayList = new ArrayList<>();
                Log.m105924i("MicroMsg.MultiTalkScreenCastManager", "memberList is " + list);
                ArrayList arrayList2 = new ArrayList();
                for (T next2 : list) {
                    if (!C87412m.m108589b(((C103900s0) next2).f307156c, C75592q0.m90789s())) {
                        arrayList2.add(next2);
                    }
                }
                Iterator it = arrayList2.iterator();
                while (it.hasNext()) {
                    C103900s0 s0Var = (C103900s0) it.next();
                    C32226l lVar = g0Var.f314618h.get(Integer.valueOf(s0Var.f307159f));
                    if (lVar != null) {
                        String str = s0Var.f307156c;
                        C87412m.m108593f(str, "it.wxUserName");
                        lVar.invoke(str);
                    }
                    int i2 = s0Var.f307159f;
                    if (i2 == 101 || i2 == 102) {
                        arrayList.add(s0Var.f307156c);
                    }
                }
                g0Var.f314613c = arrayList;
                C104328f fVar2 = C104328f.f308805a;
                C104328f.f308820p = Math.max(C104328f.f308820p, arrayList.size());
            }
            ((ArrayList) this.f314504r).clear();
            ((ArrayList) this.f314504r).addAll(list);
            if (n != null && !z) {
                n.mo150729k();
            }
            Log.m105925i("MicroMsg.MT.MultiTalkManager", "onVideoGroupMemberChange %s", this.f314503q);
            C105805i iVar = this.f314462D;
            if (iVar != null) {
                iVar.mo150767v6();
            } else {
                Log.m105920e("MicroMsg.MT.MultiTalkManager", "uiCallback is NULL !!!");
            }
        }
    }

    /* renamed from: M */
    public void mo150636M(String str) {
        ArrayList arrayList = new ArrayList();
        Iterator<String> it = this.f314490Y.iterator();
        while (it.hasNext()) {
            String next = it.next();
            if (!next.equals(str)) {
                arrayList.add(next);
            }
        }
        this.f314490Y = new CopyOnWriteArrayList<>(arrayList);
    }

    /* renamed from: N */
    public void mo150637N(String str) {
        Log.m105925i("MicroMsg.MT.MultiTalkManager", "removeCurrentMTSDKMode groupid:%s", str);
        HashMap<String, Integer> hashMap = this.f314484V;
        if (hashMap != null && hashMap.containsKey(str)) {
            this.f314484V.remove(str);
        }
    }

    /* renamed from: O */
    public void mo150638O() {
        this.f314502p0 = null;
        this.f314514z = false;
        ((MMNotification) ((C79690d) C86312j.m106911c(C79690d.class)).mo109806kA()).mo93207e(41);
    }

    /* renamed from: P */
    public void mo150639P(String str, int i) {
        Log.m105925i("MicroMsg.MT.MultiTalkManager", "setCurrentMTSDKMode groupid:%s, mode:%d", str, Integer.valueOf(i));
        HashMap<String, Integer> hashMap = this.f314484V;
        if (hashMap != null) {
            if (!hashMap.containsKey(str) || this.f314484V.get(str).intValue() != i) {
                this.f314484V.put(str, Integer.valueOf(i));
            }
        }
    }

    /* renamed from: Q */
    public void mo150640Q(boolean z) {
        this.f314494f = z;
        if (C105851w0.zx0().mo150683y() && this.f314462D != null) {
            Log.m105925i("MicroMsg.MT.MultiTalkManager", "setHandFreeEnable: %s", Boolean.valueOf(z));
            this.f314462D.mo150763l2(z);
        }
    }

    /* renamed from: R */
    public void mo150641R(boolean z) {
        if (mo150680v()) {
            C105724z zVar = C105724z.INSTANCE;
            zVar.getClass();
            Log.m105925i("MicroMsg.Multitalk.ILinkService", "hy: set mute record: %b", Boolean.valueOf(z));
            zVar.mo150614x(new C105597a2(zVar, (C105598b) null, z));
        } else {
            ((C109779e) C105851w0.xx0().f314798d).getClass();
            C109782f a = C109770a.m149092a();
            a.getClass();
            C104161b.m138997f("TalkRoomService", "setMute isMute: ", Boolean.valueOf(z));
            a.f328570Q0 = z;
            C109804j jVar = a.f328573S;
            jVar.getClass();
            C28416g.m38191a(new C109821x(jVar, z));
        }
        this.f314493e = z;
        C105805i iVar = this.f314462D;
        if (iVar != null) {
            iVar.mo150762l(z);
        }
    }

    /* renamed from: S */
    public void mo150642S(boolean z) {
        boolean z2;
        C104323b bVar;
        Log.printInfoStack("MicroMsg.MT.MultiTalkManager", "set multitalk speaker %s", Boolean.valueOf(z));
        if (!mo150680v()) {
            ((C109779e) C105851w0.xx0().f314798d).getClass();
            C109782f a = C109770a.m149092a();
            a.getClass();
            C107065e eVar = C109782f.f328551V0;
            if (eVar != null) {
                Log.printInfoStack("MicroMsg.MT.MultiTalkEngine", "setMultiTalkSpeaker %b", Boolean.valueOf(z));
                if (C105851w0.zx0().f314469K != null) {
                    C105851w0.zx0().f314469K.mo146012d0(z);
                }
                z2 = true;
            } else {
                z2 = false;
            }
            C104161b.m138993b("TalkRoomService", "switchSpeakerPhone", Boolean.valueOf(z), " ret: ", Boolean.valueOf(z2), " realret: ", Boolean.valueOf(a.mo161079K()), " wxCallBack: ", eVar);
        } else if (!(C105724z.INSTANCE.f314390g.f314153a == null || (bVar = C105851w0.zx0().f314469K) == null)) {
            bVar.mo146012d0(z);
        }
        Log.m105925i("MicroMsg.MT.MultiTalkManager", "onSpeakerStateChange %b, status=%s", Boolean.valueOf(z), this.f314505s.toString());
        this.f314494f = z;
        C105805i iVar = this.f314462D;
        if (iVar != null) {
            iVar.mo150769x0(z);
        }
        C104323b bVar2 = this.f314469K;
        if (z || (bVar2 != null && bVar2.mo146014f0())) {
            C105841u0 u0Var = this.f314486W;
            u0Var.getClass();
            Log.m105924i("MicroMsg.ScreenSensorController", "disable()");
            u0Var.f314790b.removeSensorCallBack();
            u0Var.mo150820a();
        } else if (this.f314505s == C111452h1.Talking) {
            C105841u0 u0Var2 = this.f314486W;
            u0Var2.f314790b.setSensorCallBack(u0Var2.f314791c);
            Log.m105924i("MicroMsg.ScreenSensorController", "enable()");
        }
    }

    /* renamed from: T */
    public final void mo150643T() {
        Log.m105927v("MicroMsg.MT.MultiTalkManager", "before sort: %s", this.f314506t.f320047i);
        LinkedList linkedList = new LinkedList();
        MultiTalkGroupMember multiTalkGroupMember = null;
        for (MultiTalkGroupMember next : this.f314506t.f320047i) {
            if (!next.f320048d.equals(C75592q0.m90789s())) {
                linkedList.add(next);
            } else {
                multiTalkGroupMember = next;
            }
        }
        Collections.sort(linkedList, new C105762h(this));
        Collections.sort(linkedList, new C105763i(this));
        Collections.sort(linkedList, new C105764j(this));
        if (multiTalkGroupMember != null) {
            linkedList.add(multiTalkGroupMember);
        }
        this.f314506t.f320047i = linkedList;
        Log.m105927v("MicroMsg.MT.MultiTalkManager", "after sort: %s", linkedList);
    }

    /* renamed from: U */
    public void mo150644U() {
        Log.m105924i("MicroMsg.MT.MultiTalkManager", "try to startNetworkReceiver");
        if (mo150680v() && !C104331h.m139314g()) {
            Log.m105924i("MicroMsg.MT.MultiTalkManager", "startNetworkReceiver exit due to ILINK mode!!!");
        } else if (this.f314462D == null) {
            Log.m105920e("MicroMsg.MT.MultiTalkManager", "ui callback is null");
        } else if (this.f314503q.size() == 0) {
            Log.m105924i("MicroMsg.MT.MultiTalkManager", "currentVideoUserSet.size() is 0,just return.");
        } else {
            boolean z = true;
            if (C104331h.m139314g()) {
                C105783b0 n = mo150671n();
                if (n != null) {
                    Log.printInfoStack("MicroMsg.MTR.MultiTalkRenderLogic", "startDecodeVideo", new Object[0]);
                    n.mo150724f();
                    C107496d dVar = n.f314574b;
                    if (dVar != null) {
                        C105793d0 d0Var = new C105793d0(n);
                        Log.m105924i("MicroMsg.MTR.MultiTalkEngineOp", "startDecodeVideo");
                        if (C105851w0.zx0().mo150680v()) {
                            Log.m105924i("MicroMsg.MTR.MultiTalkEngineOp", "startDecodeVideo: ilink callback mode");
                            C105724z.INSTANCE.mo150586B(dVar.f321619f);
                        } else if (dVar.f321616c) {
                            Log.m105928w("MicroMsg.MTR.MultiTalkEngineOp", "video decode runner is working");
                        } else {
                            dVar.f321616c = true;
                            d0Var.invoke(new C107506f(new C107496d.C107500b(dVar, d0Var)));
                        }
                    }
                }
            } else {
                if (this.f314507u == null) {
                    Log.m105925i("MicroMsg.MT.MultiTalkManager", "startNetworkDataSource: NetworkDataSource is null %d", Integer.valueOf(this.f314503q.size()));
                    this.f314507u = new C105817m0();
                }
                C105817m0 m0Var = this.f314507u;
                C105857z0 q = mo150676q();
                m0Var.getClass();
                C87412m.m108594g(q, "handler");
                m0Var.f314596a = q;
                C105817m0 m0Var2 = this.f314507u;
                if (!m0Var2.f314677c) {
                    Log.m105924i("NetworkDataSource", IXWebBroadcastListener.STAGE_START);
                    m0Var2.f314677c = true;
                    for (C105817m0.C105818a aVar : m0Var2.f314676b) {
                        synchronized (Boolean.valueOf(aVar.f314684e)) {
                            if (!aVar.f314684e) {
                                aVar.f314684e = true;
                                new Thread(aVar).start();
                            }
                            C13598b0 b0Var = C13598b0.f38549a;
                        }
                    }
                    if (m0Var2.f314679e < 0) {
                        z = false;
                    }
                    if (z) {
                        m0Var2.mo150790c(m0Var2.f314680f);
                    }
                }
            }
            if (mo150670m().mo150708j()) {
                mo150653b0(mo150670m().mo150705g(), false);
            }
        }
    }

    /* renamed from: V */
    public void mo150645V(boolean z) {
        C104323b bVar;
        if (!this.f314492d && (bVar = this.f314469K) != null) {
            bVar.mo146015g0(z, 0);
            this.f314492d = true;
        }
    }

    /* renamed from: W */
    public final void mo150646W() {
        Log.m105924i("MicroMsg.MT.MultiTalkManager", "startTimeCount");
        C34379c<?> cVar = this.f314463E;
        if (cVar != null) {
            cVar.cancel(false);
        }
        this.f314510x = System.currentTimeMillis();
        this.f314512y = 0;
        C112581a.m153848a();
        this.f314463E = ((C119157j) C119157j.f356862d).mo183872c(new C105758f(), 1000, 1000);
    }

    /* renamed from: X */
    public void mo150647X() {
        Log.m105924i("MicroMsg.MT.MultiTalkManager", "try to stopNetworkDataSource");
        C105817m0 m0Var = this.f314507u;
        if (m0Var != null) {
            m0Var.mo150791d();
            m0Var.mo150792e();
            this.f314507u = null;
        }
        if (mo150671n() != null) {
            C105783b0 n = mo150671n();
            n.getClass();
            Log.printInfoStack("MicroMsg.MTR.MultiTalkRenderLogic", "stopDecodeVideo", new Object[0]);
            C107496d dVar = n.f314574b;
            if (dVar != null) {
                Log.m105924i("MicroMsg.MTR.MultiTalkEngineOp", "stopDecodeVideo");
                C105724z.INSTANCE.mo150586B((C105713v2) null);
                dVar.f321616c = false;
            }
        }
    }

    /* renamed from: Y */
    public void mo150648Y() {
        C104323b bVar;
        if (this.f314492d && (bVar = this.f314469K) != null) {
            bVar.f329360j = null;
            Bundle bundle = new Bundle();
            bundle.putString(TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE, "close");
            ((C109749c) C86312j.m106911c(C109749c.class)).mo86672vo(C109749c.C61756a.MULTITALK, bundle);
            this.f314492d = false;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:23:0x00ce A[LOOP:1: B:21:0x00c8->B:23:0x00ce, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x00e5  */
    /* renamed from: Z */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo150649Z(java.util.List<as3.C103898r0> r14) {
        /*
            r13 = this;
            boolean r0 = r13.mo150683y()
            r1 = 0
            if (r0 == 0) goto L_0x0147
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r2 = "memberListInfo : "
            r0.append(r2)
            r0.append(r14)
            java.lang.String r0 = r0.toString()
            java.lang.String r2 = "MicroMsg.MT.MultiTalkManager"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r0)
            int r0 = r13.f314481T0
            r3 = -1
            if (r0 == r3) goto L_0x0040
            r0 = 0
            java.util.Iterator r3 = r14.iterator()
        L_0x0027:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L_0x003b
            java.lang.Object r4 = r3.next()
            as3.r0 r4 = (as3.C103898r0) r4
            int r5 = r4.f307152b
            int r6 = r13.f314481T0
            if (r5 != r6) goto L_0x0027
            r0 = r4
            goto L_0x0027
        L_0x003b:
            if (r0 == 0) goto L_0x0040
            r14.remove(r0)
        L_0x0040:
            com.tencent.mm.plugin.multitalk.model.w r0 = com.tencent.p014mm.plugin.multitalk.model.C105851w0.xx0()
            ds3.d r0 = r0.f314798d
            nw3.e r0 = (nw3.C109779e) r0
            r0.getClass()
            nw3.f r0 = nw3.C109770a.m149092a()
            boolean r0 = r0.mo161080L()
            java.lang.String r3 = "TalkRoomSdkApi"
            r4 = 1
            if (r0 != 0) goto L_0x0062
            java.lang.Object[] r0 = new java.lang.Object[r4]
            java.lang.String r5 = "subscribeGeneralVideo isWorking is false"
            r0[r1] = r5
            bs3.C104161b.m138997f(r3, r0)
            goto L_0x0085
        L_0x0062:
            r0 = 2
            java.lang.Object[] r5 = new java.lang.Object[r0]
            java.lang.String r6 = "subscribeGeneralVideo memberListInfo: "
            r5[r1] = r6
            r5[r4] = r14
            bs3.C104161b.m138993b(r3, r5)
            nw3.f r3 = nw3.C109770a.m149092a()
            java.lang.String r5 = r3.f328593p
            boolean r5 = android.text.TextUtils.isEmpty(r5)
            java.lang.String r6 = "TalkRoomService"
            if (r5 == 0) goto L_0x0087
            java.lang.Object[] r0 = new java.lang.Object[r4]
            java.lang.String r3 = "subscribeGeneralVideo mGroupId null "
            r0[r1] = r3
            bs3.C104161b.m138997f(r6, r0)
        L_0x0085:
            r3 = 0
            goto L_0x00ab
        L_0x0087:
            ow3.k r5 = new ow3.k
            java.lang.String r8 = r3.f328593p
            int r9 = r3.f328597s
            long r10 = r3.f328598t
            r7 = r5
            r12 = r14
            r7.<init>(r8, r9, r10, r12)
            zr3.e r3 = zr3.C112675e.m154053e()
            boolean r3 = r3.mo164407c(r5)
            java.lang.Object[] r0 = new java.lang.Object[r0]
            java.lang.String r5 = "subscribeGeneralVideo ret: "
            r0[r1] = r5
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r3)
            r0[r4] = r5
            bs3.C104161b.m138993b(r6, r0)
        L_0x00ab:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r5 = "result of subscribeGeneralVideoForUserList: "
            r0.append(r5)
            r0.append(r3)
            java.lang.String r0 = r0.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r0)
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.Iterator r14 = r14.iterator()
        L_0x00c8:
            boolean r5 = r14.hasNext()
            if (r5 == 0) goto L_0x00de
            java.lang.Object r5 = r14.next()
            as3.r0 r5 = (as3.C103898r0) r5
            int r5 = r5.f307152b
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            r0.add(r5)
            goto L_0x00c8
        L_0x00de:
            int r14 = r0.size()
            if (r14 >= r4) goto L_0x00e5
            goto L_0x0146
        L_0x00e5:
            int r14 = r0.size()
            int[] r5 = new int[r14]
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            r7 = 0
        L_0x00f1:
            if (r7 >= r14) goto L_0x010a
            java.lang.Object r8 = r0.get(r7)
            java.lang.Integer r8 = (java.lang.Integer) r8
            int r8 = r8.intValue()
            r6.append(r8)
            java.lang.String r9 = ","
            r6.append(r9)
            r5[r7] = r8
            int r7 = r7 + 1
            goto L_0x00f1
        L_0x010a:
            java.lang.Object[] r0 = new java.lang.Object[r4]
            java.lang.String r4 = r6.toString()
            r0[r1] = r4
            java.lang.String r1 = "steve: engineDoMemberSelectForView: selected id list: %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r2, r1, r0)
            int r0 = r14 * 4
            java.nio.ByteBuffer r0 = java.nio.ByteBuffer.allocate(r0)
            java.nio.ByteOrder r1 = java.nio.ByteOrder.LITTLE_ENDIAN
            java.nio.ByteBuffer r1 = r0.order(r1)
            java.nio.IntBuffer r1 = r1.asIntBuffer()
            r1.put(r5)
            byte[] r0 = r0.array()
            com.tencent.mm.plugin.multitalk.model.w r1 = com.tencent.p014mm.plugin.multitalk.model.C105851w0.xx0()
            ds3.d r1 = r1.f314798d
            r4 = 23
            nw3.e r1 = (nw3.C109779e) r1
            int r14 = r1.mo161038i(r4, r0, r14)
            if (r14 >= 0) goto L_0x0146
            java.lang.String r14 = "steve:engineDoMemberSelectForView failed!!"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r2, r14)
            com.tencent.p014mm.plugin.multitalk.model.C105853x.m142231b()
        L_0x0146:
            return r3
        L_0x0147:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.multitalk.model.MultiTalkManager.mo150649Z(java.util.List):boolean");
    }

    /* renamed from: a */
    public void mo150650a() {
        if (mo150682x()) {
            boolean w = mo150681w(this.f314506t.f320044f);
            Log.m105925i("MicroMsg.MT.MultiTalkManager", "acceptCurrentMultiTalk: %s, wifigateway:%s, isILink:%b", C105806i0.m142149b(this.f314506t), v2protocal.m143438u(), Boolean.valueOf(w));
            if (w) {
                synchronized (this.f314480T) {
                    C105724z.INSTANCE.mo150597c();
                }
                return;
            }
            C107064d dVar = C105851w0.xx0().f314798d;
            MultiTalkGroup multiTalkGroup = this.f314506t;
            String str = multiTalkGroup.f320042d;
            int i = multiTalkGroup.f320045g;
            String str2 = multiTalkGroup.f320044f;
            String u = v2protocal.m143438u();
            ((C109779e) dVar).getClass();
            C109782f a = C109770a.m149092a();
            a.f328554A = u;
            C104161b.m138997f("TalkRoomSdkApi", "enterMultiTalk multiTalkGroupid:", str, " isAccept: ", Boolean.TRUE, " routId: ", Integer.valueOf(i), " ret: ", a.mo161102m((Activity) null, str, a.f328597s, a.f328598t, i, 1, false, str2, u));
            C104329g.f308829a.mo146030d();
            return;
        }
        Log.m105920e("MicroMsg.MT.MultiTalkManager", "acceptCurrentMultiTalk: Not in MultiTalking");
    }

    /* renamed from: a0 */
    public boolean mo150651a0(String str) {
        boolean z = false;
        if (mo150683y()) {
            Log.m105924i("MicroMsg.MT.MultiTalkManager", "ownerUserName : " + str);
            if (mo150680v()) {
                if (str.equals("")) {
                    this.f314462D.mo150761f3();
                    Log.m105924i("MicroMsg.MT.MultiTalkManager", " ilink subscribe small video of visiable region OK!");
                } else {
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(str);
                    C105724z zVar = C105724z.INSTANCE;
                    zVar.getClass();
                    zVar.mo150614x(new C105716w1(zVar, arrayList, true));
                    Log.m105924i("MicroMsg.MT.MultiTalkManager", " ilink subscribe large video OK, mems:" + arrayList);
                }
                return true;
            }
            ((C109779e) C105851w0.xx0().f314798d).getClass();
            if (!C109770a.m149092a().mo161080L()) {
                C104161b.m138997f("TalkRoomSdkApi", "subscribeLargeVideo isWorking is false");
            } else {
                C104161b.m138993b("TalkRoomSdkApi", "subscribeLargeVideo ownerUserName: ", str);
                C109782f a = C109770a.m149092a();
                if (TextUtils.isEmpty(a.f328593p)) {
                    C104161b.m138997f("TalkRoomService", "subscribeLargeVideo mGroupId null ");
                } else {
                    boolean c = C112675e.m154053e().mo164407c(new C110088l(a.f328593p, a.f328597s, a.f328598t, str));
                    C104161b.m138993b("TalkRoomService", "subscribeLargeVideo ret: ", Boolean.valueOf(c));
                    z = c;
                }
            }
            Log.m105924i("MicroMsg.MT.MultiTalkManager", "result of old subscribeLargeVideo: " + z);
        }
        return z;
    }

    /* renamed from: b */
    public void mo150652b(boolean z) {
        C105857z0 z0Var = this.f314472N;
        if (z0Var != null) {
            ArrayList<C105810k> arrayList = z0Var.f314837a;
            if (arrayList != null) {
                arrayList.clear();
            }
            z0Var.f314837a = null;
            z0Var.mo150844h(0, "");
            if (!z) {
                z0Var.f314841e.clear();
            }
            z0Var.f314840d.f314850d = null;
            z0Var.mo150837a();
            if (!z) {
                this.f314472N = null;
            }
        }
    }

    /* renamed from: b0 */
    public void mo150653b0(String str, boolean z) {
        if (mo150680v()) {
            Log.m105924i("MicroMsg.MT.MultiTalkManager", "subscribeScreenCast exit due to ILINK mode!!!");
            ArrayList arrayList = new ArrayList();
            if (!TextUtils.isEmpty(str)) {
                arrayList.add(str);
            }
            if (z) {
                C105724z zVar = C105724z.INSTANCE;
                ArrayList arrayList2 = new ArrayList(this.f314503q);
                zVar.getClass();
                zVar.mo150614x(new C105712v1(zVar, arrayList2, arrayList));
                return;
            }
            C105724z zVar2 = C105724z.INSTANCE;
            ArrayList arrayList3 = new ArrayList();
            zVar2.getClass();
            zVar2.mo150614x(new C105712v1(zVar2, arrayList3, arrayList));
            return;
        }
        if (C104331h.m139314g()) {
            int c = C104331h.m139311c(str);
            this.f314481T0 = c;
            if (c == -1) {
                C105805i iVar = this.f314462D;
                if (iVar != null) {
                    iVar.mo150761f3();
                }
                ByteBuffer allocate = ByteBuffer.allocate(4);
                allocate.order(ByteOrder.LITTLE_ENDIAN).putInt(-1);
                ((C109779e) C105851w0.xx0().f314798d).mo161038i(55, allocate.array(), 4);
                ((C109779e) C105851w0.xx0().f314798d).mo161041l(new ArrayList());
            } else {
                mo150649Z(new ArrayList());
                ((C109779e) C105851w0.xx0().f314798d).mo161038i(23, new byte[1], 0);
                ByteBuffer allocate2 = ByteBuffer.allocate(4);
                allocate2.order(ByteOrder.LITTLE_ENDIAN).putInt(c);
                ((C109779e) C105851w0.xx0().f314798d).mo161038i(55, allocate2.array(), 4);
                ArrayList arrayList4 = new ArrayList();
                C103896q0 q0Var = new C103896q0();
                q0Var.f307131b = c;
                arrayList4.add(q0Var);
                ((C109779e) C105851w0.xx0().f314798d).mo161041l(arrayList4);
            }
        }
        if (C104331h.m139314g()) {
            Log.m105924i("MicroMsg.MT.MultiTalkManager", "new render mode, ret");
            return;
        }
        if (this.f314507u == null) {
            this.f314507u = new C105817m0();
        }
        C105817m0 m0Var = this.f314507u;
        C105857z0 q = mo150676q();
        m0Var.getClass();
        C87412m.m108594g(q, "handler");
        m0Var.f314596a = q;
        if (TextUtils.isEmpty(str)) {
            this.f314507u.mo150791d();
            return;
        }
        Log.m105924i("MicroMsg.MT.MultiTalkManager", "subscribeScreenCast ownerUserName : " + str);
        this.f314507u.mo150790c(str);
        Log.m105924i("MicroMsg.MT.MultiTalkManager", "subscribeScreenCast error");
    }

    /* renamed from: c */
    public final void mo150654c(String str, String str2, int i) {
        boolean z;
        C111452h1 h1Var = C111452h1.Creating;
        ArrayList<String> stringsToList = Util.stringsToList(str.split(","));
        synchronized (this.f314478S) {
            C111452h1 h1Var2 = this.f314505s;
            if (h1Var2 != C111452h1.Init) {
                Log.m105925i("MicroMsg.MT.MultiTalkManager", "already in multitalk! cannot start again, status:%s", h1Var2.toString());
                return;
            }
            if (i == 2) {
                ArrayList arrayList = new ArrayList();
                for (String str3 : stringsToList) {
                    C105683r rVar = new C105683r();
                    rVar.f314239c = str3;
                    rVar.f314241e = 2;
                    arrayList.add(rVar);
                }
                C105724z zVar = C105724z.INSTANCE;
                zVar.mo150615y((long) Util.nullAsNil((Integer) C86709a0.m107535s().f251803a.mo119660a(1)), C75592q0.m90789s());
                zVar.getClass();
                Log.m105925i("MicroMsg.Multitalk.ILinkService", "steve:  enter newMultiTalkInvite. %s, %s", arrayList, str2);
                zVar.f314366S0 = str2;
                zVar.mo150614x(new C105630g1(zVar, arrayList, str2));
                mo150639P(str2, 2);
                mo150627D(h1Var);
                z = true;
            } else {
                MultiTalkGroup multiTalkGroup = new MultiTalkGroup();
                multiTalkGroup.f320043e = ((C109779e) C105851w0.xx0().f314798d).mo161032c();
                multiTalkGroup.f320044f = str2;
                for (String next : stringsToList) {
                    MultiTalkGroupMember multiTalkGroupMember = new MultiTalkGroupMember();
                    multiTalkGroupMember.f320048d = next;
                    if (next.equals(C75592q0.m90789s())) {
                        multiTalkGroupMember.f320050f = 10;
                    } else {
                        multiTalkGroupMember.f320050f = 1;
                    }
                    multiTalkGroup.f320047i.add(multiTalkGroupMember);
                }
                ((C109779e) C105851w0.xx0().f314798d).mo161040k(Util.nullAsNil((Integer) C86709a0.m107535s().f251803a.mo119660a(1)), C75592q0.m90789s());
                z = ((C109779e) C105851w0.xx0().f314798d).mo161030a(multiTalkGroup.f320043e, str2, stringsToList, v2protocal.m143438u());
                mo150639P(str2, 1);
                mo150627D(h1Var);
                mo150658e(multiTalkGroup, Boolean.TRUE);
            }
            if (z) {
                Log.m105926v("MicroMsg.MT.MultiTalkKvReportUtil", "reportMultiTalkDailSuccess");
                C115669n.INSTANCE.mo160131h(12722, 1);
            } else {
                Log.m105926v("MicroMsg.MT.MultiTalkKvReportUtil", "reportMultiTalkDailFail");
                C115669n.INSTANCE.mo160131h(12722, 2);
            }
            C104329g.f308829a.mo146030d();
        }
    }

    /* renamed from: c0 */
    public boolean mo150655c0(int i, boolean z) {
        boolean z2;
        if (z) {
            if (!mo150683y()) {
                return false;
            }
            this.f314479S0 = true;
            this.f314496h = i;
            if (!C105851w0.zx0().mo150680v()) {
                return ((C109779e) C105851w0.xx0().f314798d).mo161042m(i);
            }
            return true;
        } else if (!mo150683y()) {
            return false;
        } else {
            this.f314479S0 = false;
            boolean v = C105851w0.zx0().mo150680v();
            Log.m105924i("MicroMsg.MT.MultiTalkManager", "try switch to action : " + i + ", isILink:" + v);
            if (!v) {
                z2 = ((C109779e) C105851w0.xx0().f314798d).mo161042m(i);
                int i2 = this.f314496h;
                if (i2 == 1 || i2 == 3) {
                    mo150644U();
                } else {
                    mo150647X();
                }
            } else {
                z2 = false;
            }
            Log.m105925i("MicroMsg.MT.MultiTalkManager", "switchMultiTalkVideo result: %b", Boolean.valueOf(z2));
            int i3 = this.f314496h;
            this.f314496h = i;
            C105805i iVar = this.f314462D;
            if (!(iVar == null || i3 == i)) {
                iVar.mo150764p4(i3, i);
            }
            return z2;
        }
    }

    /* renamed from: d */
    public void mo150656d(boolean z) {
        this.f314477R0 = false;
        if (z) {
            C105851w0.Cx0().mo163097g();
        } else {
            C105851w0.Cx0().mo163095e(false);
        }
        ((NotificationManager) MMApplicationContext.getContext().getSystemService("notification")).cancel(43);
        mo150661f0();
    }

    /* renamed from: d0 */
    public boolean mo150657d0(int i) {
        if (!C105851w0.zx0().mo150680v()) {
            return ((C109779e) C105851w0.xx0().f314798d).mo161042m(i);
        }
        C105724z zVar = C105724z.INSTANCE;
        zVar.getClass();
        zVar.mo150614x(new C105607c2(zVar, i));
        return true;
    }

    /* JADX WARNING: Removed duplicated region for block: B:52:0x01b9  */
    /* JADX WARNING: Removed duplicated region for block: B:55:? A[RETURN, SYNTHETIC] */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo150658e(com.tencent.p1102pb.talkroom.sdk.MultiTalkGroup r17, java.lang.Boolean r18) {
        /*
            r16 = this;
            r0 = r16
            r1 = r17
            r2 = 0
            java.lang.Object[] r3 = new java.lang.Object[r2]
            java.lang.String r4 = "MicroMsg.MT.MultiTalkManager"
            java.lang.String r5 = "enterNewMultiTalk"
            com.tencent.p014mm.sdk.platformtools.Log.printInfoStack(r4, r5, r3)
            boolean r3 = r16.mo150663g0(r17)
            if (r3 == 0) goto L_0x01c0
            boolean r3 = r16.mo150680v()
            if (r3 == 0) goto L_0x0036
            com.tencent.mm.plugin.multitalk.ilinkservice.z r3 = com.tencent.p014mm.plugin.multitalk.ilinkservice.C105724z.INSTANCE
            com.tencent.mm.plugin.multitalk.ilinkservice.m r3 = r3.f314390g
            c82.a r4 = r3.f314156d
            if (r4 != 0) goto L_0x0031
            c82.a r4 = new c82.a
            r4.<init>()
            r3.f314156d = r4
            com.tencent.mm.plugin.multitalk.model.MultiTalkManager r4 = com.tencent.p014mm.plugin.multitalk.model.C105851w0.zx0()
            c82.a r5 = r3.f314156d
            r4.f314469K = r5
        L_0x0031:
            c82.a r3 = r3.f314156d
            r0.f314469K = r3
            goto L_0x0041
        L_0x0036:
            c82.b r3 = r0.f314469K
            if (r3 != 0) goto L_0x0041
            c82.b r3 = new c82.b
            r3.<init>()
            r0.f314469K = r3
        L_0x0041:
            c82.b r3 = r0.f314469K
            r4 = 3
            boolean r4 = r3.mo161474P(r4)
            r5 = 1
            if (r4 != 0) goto L_0x005b
            r4 = 4
            boolean r3 = r3.mo161474P(r4)
            if (r3 == 0) goto L_0x0053
            goto L_0x005b
        L_0x0053:
            com.tencent.mm.plugin.multitalk.model.MultiTalkManager r3 = com.tencent.p014mm.plugin.multitalk.model.C105851w0.zx0()
            r3.mo150640Q(r5)
            goto L_0x0062
        L_0x005b:
            com.tencent.mm.plugin.multitalk.model.MultiTalkManager r3 = com.tencent.p014mm.plugin.multitalk.model.C105851w0.zx0()
            r3.mo150640Q(r2)
        L_0x0062:
            c82.b r3 = r0.f314469K
            boolean r4 = r0.f314494f
            r3.mo18028n(r4)
            r0.f314492d = r2
            r16.mo150679t()
            r16.mo150646W()
            android.content.Intent r10 = new android.content.Intent
            r10.<init>()
            r3 = 0
            java.lang.String r4 = com.tencent.p014mm.plugin.multitalk.model.C105806i0.m142151d(r17)
            boolean r6 = r18.booleanValue()
            java.lang.String r7 = ""
            if (r6 != 0) goto L_0x0114
            r3 = 28
            boolean r3 = p206nj.C11171e.m11045b(r3)
            if (r3 != 0) goto L_0x0098
            java.lang.String r3 = android.os.Build.VERSION.CODENAME
            java.lang.String r6 = "Q"
            boolean r3 = r3.equals(r6)
            if (r3 == 0) goto L_0x0096
            goto L_0x0098
        L_0x0096:
            r3 = 0
            goto L_0x0099
        L_0x0098:
            r3 = 1
        L_0x0099:
            if (r3 == 0) goto L_0x00a4
            com.tencent.mm.plugin.multitalk.model.MultiTalkManager$o r3 = new com.tencent.mm.plugin.multitalk.model.MultiTalkManager$o
            java.lang.Boolean r6 = java.lang.Boolean.FALSE
            r3.<init>(r0, r1, r6)
            r0.f314502p0 = r3
        L_0x00a4:
            android.content.res.Resources r3 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getResources()
            r6 = 2131833195(0x7f11316b, float:1.9299465E38)
            java.lang.String r3 = r3.getString(r6)
            java.lang.String r6 = "Voip_User"
            r10.putExtra(r6, r4)
            java.lang.Class<d62.i> r8 = d62.C75339i.class
            di3.d r8 = di3.C86312j.m106911c(r8)
            d62.i r8 = (d62.C75339i) r8
            java.lang.Class<f62.k0> r9 = f62.C75700k0.class
            k40.a r9 = f40.C86709a0.m107533q(r9)
            f62.k0 r9 = (f62.C75700k0) r9
            com.tencent.mm.storage.u3 r9 = r9.mo96097Ni()
            java.lang.String r6 = r10.getStringExtra(r6)
            com.tencent.mm.storage.z1 r6 = r9.get(r6)
            java.lang.String r6 = r6.getUsername()
            java.lang.String r6 = r8.getDisplayName(r6)
            android.widget.RemoteViews r8 = new android.widget.RemoteViews
            java.lang.String r9 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getPackageName()
            r11 = 2131496716(0x7f0c0f0c, float:1.8617005E38)
            r8.<init>(r9, r11)
            r9 = 2131310445(0x7f09376d, float:1.8239202E38)
            r8.setTextViewText(r9, r3)
            r9 = 2131310439(0x7f093767, float:1.823919E38)
            r8.setTextViewText(r9, r6)
            r9 = 2131317001(0x7f095109, float:1.82525E38)
            r11 = 2131235671(0x7f081357, float:1.8087543E38)
            r8.setImageViewResource(r9, r11)
            r9 = 2131310429(0x7f09375d, float:1.823917E38)
            r11 = 2131235429(0x7f081265, float:1.8087052E38)
            r8.setImageViewResource(r9, r11)
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            r9.append(r6)
            r9.append(r3)
            java.lang.String r3 = r9.toString()
            r12 = r3
            r11 = r8
            goto L_0x0116
        L_0x0114:
            r11 = r3
            r12 = r7
        L_0x0116:
            boolean r3 = r18.booleanValue()
            if (r3 != 0) goto L_0x015a
            boolean r3 = r0.f314511x0
            if (r3 != 0) goto L_0x015a
            android.content.Context r3 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            java.lang.Class<aw.d> r6 = p447aw.C103918d.class
            di3.d r6 = di3.C86312j.m106911c(r6)
            aw.d r6 = (p447aw.C103918d) r6
            boolean r6 = r6.mo125772Jn(r3)
            if (r6 == 0) goto L_0x013b
            java.lang.String r6 = "android.permission.RECORD_AUDIO"
            int r3 = p385u2.C111105a.m151499a(r3, r6)
            if (r3 != 0) goto L_0x013b
            r2 = 1
        L_0x013b:
            if (r2 == 0) goto L_0x015a
            com.tencent.mm.app.AppForegroundDelegate r2 = com.tencent.p014mm.app.AppForegroundDelegate.INSTANCE
            boolean r2 = r2.f343454n
            if (r2 == 0) goto L_0x015a
            boolean r2 = r16.mo150682x()
            if (r2 == 0) goto L_0x015a
            r0.f314511x0 = r5
            zt3.t r2 = zt3.C119157j.f356862d
            com.tencent.mm.plugin.multitalk.model.MultiTalkManager$c r3 = new com.tencent.mm.plugin.multitalk.model.MultiTalkManager$c
            r3.<init>(r1, r10, r4)
            zt3.j r2 = (zt3.C119157j) r2
            r2.mo183895z(r3)
            r2 = r18
            goto L_0x01af
        L_0x015a:
            java.lang.String r1 = "Voip_Outcall"
            r2 = r18
            r10.putExtra(r1, r2)
            r1 = 268435456(0x10000000, float:2.5243549E-29)
            r10.addFlags(r1)
            boolean r1 = nj2.C61767o.m72471g()
            if (r1 == 0) goto L_0x0194
            boolean r1 = p206nj.C76866m.m92676e()
            if (r1 == 0) goto L_0x0194
            android.content.Context r1 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            java.io.File r3 = new java.io.File
            wj2.f r4 = nj2.C61768p.m72482j(r7)
            java.lang.String r4 = r4.mo90177h()
            r3.<init>(r4)
            com.tencent.mm.vfs.m1 r3 = com.tencent.p014mm.vfs.C86009m1.m106378c(r3)
            android.net.Uri r1 = com.tencent.p014mm.sdk.platformtools.FileProviderHelper.getUriForFile(r1, r3)
            android.content.Context r3 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            java.lang.String r4 = "com.android.systemui"
            r3.grantUriPermission(r4, r1, r5)
        L_0x0194:
            java.lang.Class<pz.b> r1 = p657pz.C89445b.class
            di3.d r1 = di3.C86312j.m106911c(r1)
            r6 = r1
            pz.b r6 = (p657pz.C89445b) r6
            android.content.Context r1 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            r13 = 1
            java.lang.String r14 = nj2.C61768p.m72480h(r7)
            r15 = 1
            java.lang.String r8 = "multitalk"
            java.lang.String r9 = ".ui.MultiTalkMainUI"
            r7 = r1
            r6.mo123646Kt(r7, r8, r9, r10, r11, r12, r13, r14, r15)
        L_0x01af:
            w33.c0 r1 = w33.C111720c0.f334432a
            long r3 = w33.C111720c0.f334437f
            r6 = 0
            int r8 = (r3 > r6 ? 1 : (r3 == r6 ? 0 : -1))
            if (r8 != 0) goto L_0x01c0
            boolean r2 = r18.booleanValue()
            r1.mo163401c(r5, r2)
        L_0x01c0:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.multitalk.model.MultiTalkManager.mo150658e(com.tencent.pb.talkroom.sdk.MultiTalkGroup, java.lang.Boolean):void");
    }

    /* renamed from: e0 */
    public final void mo150659e0(String str) {
        C76701a.makeText(MMApplicationContext.getContext(), (CharSequence) ((C76979h) C86312j.m106911c(C76979h.class)).mo107057T1(MMApplicationContext.getContext(), MMApplicationContext.getContext().getString(C0966R.string.h0y, new Object[]{((C75339i) C86312j.m106911c(C75339i.class)).getDisplayName(str)})), 0).show();
    }

    /* renamed from: f */
    public void mo150660f(boolean z, boolean z2) {
        mo150662g(z, z2, false, false, true, false);
    }

    /* renamed from: f0 */
    public final void mo150661f0() {
        try {
            Log.m105924i("MicroMsg.MT.MultiTalkManager", "unBindSmallServiceIfNeed");
            if (C11171e.m11046c(26) && this.f314468J) {
                MMApplicationContext.getContext().unbindService(this);
                this.f314468J = false;
            }
        } catch (Exception e) {
            Log.printErrStackTrace("MicroMsg.MT.MultiTalkManager", e, "unBind VoipSmallService error: %s", e.getMessage());
        }
    }

    /* JADX WARNING: type inference failed for: r1v12, types: [com.tencent.pb.talkroom.sdk.MultiTalkGroup, c82.b, z33.a$b] */
    /* JADX WARNING: type inference failed for: r1v15 */
    /* JADX WARNING: type inference failed for: r1v16 */
    /* JADX WARNING: type inference failed for: r1v19, types: [lu3.c<?>, com.tencent.mm.plugin.multitalk.model.a, z33.a$b] */
    /* JADX WARNING: type inference failed for: r1v30 */
    /* JADX WARNING: type inference failed for: r1v31 */
    /* renamed from: g */
    public void mo150662g(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6) {
        ? r1;
        ? r15;
        C111452h1 h1Var = C111452h1.Init;
        C117770m mVar = this.f314488X;
        if (mVar != null) {
            mVar.mo182518a();
            this.f314488X = null;
        }
        int i = 2;
        Log.m105925i("MicroMsg.MT.MultiTalkManager", "exitCurrentMultiTalk: isReject %b isMissCall %b isPhoneCall %b isNetworkError %b", Boolean.valueOf(z), Boolean.valueOf(z2), Boolean.valueOf(z3), Boolean.valueOf(z4));
        ((C119157j) C119157j.f356862d).mo183895z(new C105765k());
        C105841u0 u0Var = this.f314486W;
        u0Var.getClass();
        Log.m105924i("MicroMsg.ScreenSensorController", "disable()");
        u0Var.f314790b.removeSensorCallBack();
        u0Var.mo150820a();
        this.f314511x0 = false;
        if (this.f314470L == null) {
            this.f314470L = new C105799g0();
        }
        C105799g0 g0Var = this.f314470L;
        g0Var.f314612b.clear();
        g0Var.f314611a = null;
        ArrayList<String> arrayList = g0Var.f314613c;
        if (arrayList != null) {
            arrayList.clear();
        }
        g0Var.f314613c = null;
        ((C119157j) C119157j.f356862d).mo183894y("delayChecking");
        this.f314513y0 = null;
        C54219z zVar = this.f314475Q0;
        if (zVar != null) {
            zVar.postValue(null);
            this.f314475Q0 = null;
        }
        ((MMNotification) ((C79690d) C86312j.m106911c(C79690d.class)).mo109806kA()).mo93207e(41);
        C105851w0.zx0().mo150648Y();
        if (mo150682x()) {
            RefreshMainUIMultitalkIconEvent refreshMainUIMultitalkIconEvent = new RefreshMainUIMultitalkIconEvent();
            refreshMainUIMultitalkIconEvent.f310010d.f310011a = 2;
            refreshMainUIMultitalkIconEvent.publish();
            MultiTalkGroup multiTalkGroup = this.f314506t;
            Object e = C105806i0.m142152e(multiTalkGroup);
            Object obj = multiTalkGroup.f320044f;
            Log.m105927v("MicroMsg.MT.MultiTalkKvReportUtil", "reportMultiTalkTalkGroupId %s %s", e, obj);
            C115669n nVar = C115669n.INSTANCE;
            nVar.mo160131h(17771, 0, 0, e, obj);
            int i2 = 10;
            Log.m105927v("MicroMsg.MT.MultiTalkKvReportUtil", "reportMultiTalkTalkFunction %s %d %d %d %d %d,%d,%d,%d,%d", e, Integer.valueOf(C105853x.f314823a), Integer.valueOf(C105853x.f314824b), Integer.valueOf(C105853x.f314825c), Integer.valueOf(C105853x.f314826d), Integer.valueOf(C105853x.f314827e), Integer.valueOf(C105853x.f314828f), Integer.valueOf(C105853x.f314829g), Integer.valueOf(C105853x.f314830h), Integer.valueOf(C105853x.f314831i));
            nVar.mo160131h(12729, e, Integer.valueOf(C105853x.f314823a), Integer.valueOf(C105853x.f314824b), Integer.valueOf(C105853x.f314825c), Integer.valueOf(C105853x.f314826d), Integer.valueOf(C105853x.f314827e), Integer.valueOf(C105853x.f314828f), Integer.valueOf(C105853x.f314829g), Integer.valueOf(C105853x.f314830h), Integer.valueOf(C105853x.f314831i));
            C105853x.m142232c(9, C105853x.f314823a);
            C105853x.m142232c(10, C105853x.f314827e);
            C105853x.m142232c(11, C105853x.f314824b);
            C105853x.m142232c(12, C105853x.f314825c);
            C105853x.m142232c(13, C105853x.f314826d);
            C105853x.f314823a = 0;
            C105853x.f314824b = 0;
            C105853x.f314825c = 0;
            C105853x.f314826d = 0;
            C105853x.f314827e = 0;
            C105853x.f314828f = 0;
            C105853x.f314829g = 0;
            C105853x.f314830h = 0;
            C105853x.f314831i = 0;
            if (this.f314505s != C111452h1.Talking) {
                boolean equals = this.f314506t.f320046h.equals(C75592q0.m90789s());
                long currentTimeMillis = System.currentTimeMillis() - this.f314510x;
                if (equals) {
                    i2 = z2 ? 4 : z ? 1 : z3 ? 3 : z4 ? 5 : 2;
                } else if (z2) {
                    i2 = currentTimeMillis >= 45 ? 6 : 8;
                } else if (z) {
                    i2 = 7;
                } else if (z3) {
                    i2 = 9;
                } else if (!z4) {
                    i2 = 0;
                }
                Log.m105927v("MicroMsg.MT.MultiTalkKvReportUtil", "reportMultiTalkConnectFail %b %d %s %d", Boolean.valueOf(equals), Long.valueOf(currentTimeMillis), e, Integer.valueOf(i2));
                nVar.mo160131h(12725, 2, Integer.valueOf(equals ? 1 : 2), Long.valueOf(currentTimeMillis), e, Integer.valueOf(i2));
            } else {
                int i3 = this.f314512y;
                ArrayList arrayList2 = new ArrayList();
                IDKey iDKey = new IDKey();
                iDKey.SetID(220);
                iDKey.SetKey(7);
                iDKey.SetValue((long) i3);
                arrayList2.add(iDKey);
                IDKey iDKey2 = new IDKey();
                iDKey2.SetID(220);
                iDKey2.SetKey(8);
                iDKey2.SetValue(1);
                arrayList2.add(iDKey2);
                nVar.mo160124a(arrayList2, false);
                long j = (long) this.f314512y;
                Log.m105927v("MicroMsg.MT.MultiTalkKvReportUtil", "reportMutliTalkDuration %d %s", Long.valueOf(j), e);
                nVar.mo160131h(12726, Long.valueOf(j), e);
                List<MultiTalkGroupMember> list = multiTalkGroup.f320047i;
                if (list != null) {
                    int size = list.size();
                    C115669n nVar2 = nVar;
                    nVar2.idkeyStat(220, 35, 1, false);
                    nVar2.idkeyStat(220, 36, (long) size, false);
                }
            }
            C104328f fVar = C104328f.f308805a;
            if (System.currentTimeMillis() - C104328f.f308810f < 200) {
                Log.m105928w("MultitalkFeatureReportH", "has reported");
            } else {
                int i4 = z2 ? 4 : (!z || !C104328f.f308813i) ? (!z || C104328f.f308813i) ? (z || !C104328f.f308813i) ? -1 : 2 : 3 : 1;
                C104328f.C0438a aVar = C104328f.f308824t;
                aVar.mo480c();
                C104328f.C0438a aVar2 = C104328f.f308825u;
                aVar2.mo480c();
                C104328f.C0438a aVar3 = C104328f.f308826v;
                aVar3.mo480c();
                C104328f.C0438a aVar4 = C104328f.f308827w;
                aVar4.mo480c();
                MultitalkFeatureReportStruct multitalkFeatureReportStruct = new MultitalkFeatureReportStruct();
                multitalkFeatureReportStruct.f310238d = multitalkFeatureReportStruct.mo86045b("multiTalkGroupId", C104328f.f308812h, true);
                multitalkFeatureReportStruct.f310239e = C104328f.f308811g ? 1 : -1;
                multitalkFeatureReportStruct.f310240f = multitalkFeatureReportStruct.mo86045b("memberUins", C110818d0.m150921S(C104328f.f308817m, ";", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (C32226l) null, 62, (Object) null), true);
                multitalkFeatureReportStruct.f310241g = C104328f.f308809e;
                C104328f.C0438a aVar5 = aVar;
                multitalkFeatureReportStruct.f310242h = (System.currentTimeMillis() - multitalkFeatureReportStruct.f310241g) / ((long) 1000);
                multitalkFeatureReportStruct.f310243i = (long) C104328f.f308818n;
                multitalkFeatureReportStruct.f310244j = C104328f.f308821q ? 1 : -1;
                multitalkFeatureReportStruct.f310245k = (long) C104328f.f308819o;
                multitalkFeatureReportStruct.f310246l = C104328f.f308822r ? 1 : -1;
                multitalkFeatureReportStruct.f310247m = aVar2.mo482e();
                multitalkFeatureReportStruct.f310248n = (long) C104328f.f308820p;
                multitalkFeatureReportStruct.f310249o = aVar3.mo482e();
                multitalkFeatureReportStruct.f310250p = multitalkFeatureReportStruct.mo86045b("subscribeScreenCastOp", aVar3.mo481d(), true);
                multitalkFeatureReportStruct.f310251q = multitalkFeatureReportStruct.mo86045b("clickScreenCastBtnOp", C110818d0.m150921S(C104328f.f308828x, ";", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (C32226l) null, 62, (Object) null), true);
                multitalkFeatureReportStruct.f310252r = aVar5.mo482e();
                multitalkFeatureReportStruct.f310253s = multitalkFeatureReportStruct.mo86045b("openCameraOp", aVar5.mo481d(), true);
                multitalkFeatureReportStruct.f310254t = aVar4.mo482e();
                multitalkFeatureReportStruct.f310255u = multitalkFeatureReportStruct.mo86045b("subscribeBigVideoOp", aVar4.mo481d(), true);
                multitalkFeatureReportStruct.f310256v = C104328f.f308811g ? C104328f.f308806b : C104328f.f308807c;
                multitalkFeatureReportStruct.f310257w = i4;
                multitalkFeatureReportStruct.f310258x = C104328f.f308814j;
                if (C104331h.m139314g()) {
                    i = 1;
                }
                multitalkFeatureReportStruct.f310259y = i;
                multitalkFeatureReportStruct.f310260z = C104328f.f308823s;
                int i5 = C104328f.f308816l;
                if (i5 != 0) {
                    multitalkFeatureReportStruct.f310237A = C104328f.f308815k / i5;
                }
                multitalkFeatureReportStruct.mo86054n();
                C104328f.f308810f = System.currentTimeMillis();
                C104328f.f308807c = 0;
                C104328f.f308806b = 0;
                C104328f.f308813i = false;
            }
            C111452h1 h1Var2 = this.f314505s;
            C105805i iVar = this.f314462D;
            if (iVar != null) {
                iVar.mo150757T5();
            }
            this.f314501p = false;
            this.f314508v = false;
            this.f314509w = false;
            this.f314505s = h1Var;
            mo150647X();
            C105798e1 e1Var = this.f314471M;
            if (e1Var == null) {
                r15 = 0;
            } else {
                e1Var.f314608b = true;
                r15 = 0;
                e1Var.f314609c = null;
                this.f314471M = null;
            }
            mo150652b(false);
            this.f314473P = r15;
            mo150656d(true);
            C34379c<?> cVar = this.f314463E;
            if (cVar != null) {
                cVar.cancel(false);
                this.f314463E = r15;
            }
            if (C112581a.f337113a != null) {
                MMApplicationContext.getContext().unregisterReceiver(C112581a.f337113a);
            }
            C112581a.f337113a = r15;
            C104323b bVar = this.f314469K;
            if (bVar != null) {
                bVar.mo146011B();
                this.f314469K.getClass();
                C110248b.f329777h.mo161670o("multitalke");
                this.f314469K = null;
            }
            C105804h0 Dx0 = C105851w0.Dx0();
            Dx0.f314624b = false;
            Dx0.f314623a = false;
            MultiTalkGroup multiTalkGroup2 = this.f314506t;
            if (multiTalkGroup2 != null) {
                mo150667j(multiTalkGroup2, h1Var2, z, z2, z5, z6);
                String str = this.f314506t.f320042d;
                if (Util.isNullOrNil(str)) {
                    str = this.f314506t.f320043e;
                }
                Log.m105925i("MicroMsg.MT.MultiTalkManager", "exitCurrentMultiTalk: isILinkMode %b", Boolean.valueOf(mo150680v()));
                C105724z zVar2 = C105724z.INSTANCE;
                zVar2.getClass();
                zVar2.mo150614x(new C105660m0(zVar2, 1));
                ((C109779e) C105851w0.xx0().f314798d).mo161031b(str);
                this.f314506t = null;
            } else {
                Log.m105924i("MicroMsg.MT.MultiTalkManager", "exitCurrentMultiTalk: currentMultiTalkGroup null");
            }
            this.f314496h = 0;
            this.f314494f = true;
            this.f314493e = false;
            this.f314497i = true;
            this.f314510x = 0;
            this.f314512y = 0;
            this.f314503q.clear();
            new ExitMultiTalkRoomEvent().publish();
            this.f314514z = true;
            C111720c0.f334432a.mo163399a();
        } else {
            Log.m105925i("MicroMsg.MT.MultiTalkManager", "exitCurrentMultiTalk: not connecting, isHangupMultitalk %b, isOverLoadFail %b", Boolean.valueOf(this.f314514z), Boolean.valueOf(this.f314459A));
            if (!this.f314514z || this.f314459A) {
                mo150647X();
                mo150656d(false);
                C34379c<?> cVar2 = this.f314463E;
                if (cVar2 != null) {
                    cVar2.cancel(false);
                    r1 = 0;
                    this.f314463E = null;
                } else {
                    r1 = 0;
                }
                if (C112581a.f337113a != null) {
                    MMApplicationContext.getContext().unregisterReceiver(C112581a.f337113a);
                }
                C112581a.f337113a = r1;
                C104323b bVar2 = this.f314469K;
                if (bVar2 != null) {
                    bVar2.mo146011B();
                    this.f314469K = r1;
                }
                this.f314506t = r1;
                this.f314496h = 0;
                this.f314514z = false;
                this.f314510x = 0;
                this.f314512y = 0;
                this.f314503q.clear();
            }
            this.f314505s = h1Var;
        }
        C105851w0.vx0().mo150813i(true);
        ((ArrayList) this.f314504r).clear();
        C105783b0 b0Var = this.f314474Q;
        if (b0Var == null) {
            Log.m105924i("MicroMsg.MT.MultiTalkManager", "closeMultiTalkRenderLogic null");
        } else {
            b0Var.mo150720b();
            this.f314474Q = null;
        }
        this.f314490Y.clear();
        C104329g gVar = C104329g.f308829a;
        C104329g.C104330a[] aVarArr = C104329g.f308830b;
        ArrayList arrayList3 = new ArrayList();
        for (int i6 = 0; i6 < 5; i6++) {
            C104329g.C104330a aVar6 = aVarArr[i6];
            if (aVar6.f308840c > 5) {
                arrayList3.add(aVar6);
            }
        }
        Iterator it = arrayList3.iterator();
        while (it.hasNext()) {
            C104329g.C104330a aVar7 = (C104329g.C104330a) it.next();
            Integer num = C104329g.f308831c.get(Integer.valueOf(aVar7.f308838a));
            if (num != null) {
                C104329g.f308829a.mo146029c(num.intValue(), aVar7.f308839b / ((long) aVar7.f308840c));
            }
        }
        if (C104329g.f308834f > 0) {
            int[] iArr = C104329g.f308832d;
            gVar.mo146029c(15, (long) iArr[0]);
            gVar.mo146029c(18, (long) iArr[1]);
            float f = (float) 100;
            gVar.mo146029c(21, (long) ((((float) C104329g.f308835g) / ((float) C104329g.f308834f)) * f));
            gVar.mo146029c(24, (long) ((((float) C104329g.f308836h) / ((float) C104329g.f308834f)) * f));
        }
        gVar.mo146030d();
        mo150661f0();
        ((HashMap) this.f314482U).clear();
    }

    /* renamed from: g0 */
    public boolean mo150663g0(MultiTalkGroup multiTalkGroup) {
        if (!mo150682x()) {
            Log.m105925i("MicroMsg.MT.MultiTalkManager", "first time update multitalk group: %s", C105806i0.m142149b(multiTalkGroup));
            this.f314506t = multiTalkGroup;
            this.f314512y = 0;
            this.f314496h = 1;
            this.f314503q.clear();
            mo150665h0();
            mo150643T();
            return true;
        }
        MultiTalkGroup multiTalkGroup2 = this.f314506t;
        if ((multiTalkGroup == null || multiTalkGroup2 == null || ((Util.isNullOrNil(multiTalkGroup.f320042d) || Util.isNullOrNil(multiTalkGroup2.f320042d) || !multiTalkGroup.f320042d.equals(multiTalkGroup2.f320042d)) && (Util.isNullOrNil(multiTalkGroup.f320043e) || Util.isNullOrNil(multiTalkGroup2.f320043e) || !multiTalkGroup.f320043e.equals(multiTalkGroup2.f320043e)))) ? false : true) {
            Log.m105925i("MicroMsg.MT.MultiTalkManager", "update multitalk group: %s", C105806i0.m142149b(multiTalkGroup));
            MultiTalkGroup multiTalkGroup3 = this.f314506t;
            HashMap hashMap = new HashMap();
            for (MultiTalkGroupMember next : multiTalkGroup.f320047i) {
                hashMap.put(next.f320048d, next);
            }
            for (MultiTalkGroupMember next2 : multiTalkGroup3.f320047i) {
                if (!C75592q0.m90789s().equals(next2.f320048d) && C75592q0.m90789s().equals(next2.f320049e) && next2.f320050f == 1) {
                    if (!hashMap.containsKey(next2.f320048d)) {
                        mo150659e0(next2.f320048d);
                    } else if (((MultiTalkGroupMember) hashMap.get(next2.f320048d)).f320050f == 20) {
                        mo150659e0(next2.f320048d);
                    }
                }
            }
            this.f314506t = multiTalkGroup;
            mo150665h0();
            mo150643T();
            return true;
        }
        Log.m105921e("MicroMsg.MT.MultiTalkManager", "updateCurrentMultiTalkGroup: not same multitalk\ncurrentGroup=%s\nchangeGroup=%s", C105806i0.m142149b(this.f314506t), C105806i0.m142149b(multiTalkGroup));
        return false;
    }

    /* renamed from: h */
    public void mo150664h() {
        if (C105851w0.zx0().mo150683y() && this.f314462D != null) {
            Log.m105924i("MicroMsg.MT.MultiTalkManager", "exitProjectScreen");
            this.f314462D.mo150750B4();
        }
    }

    /* renamed from: h0 */
    public final void mo150665h0() {
        for (MultiTalkGroupMember next : this.f314506t.f320047i) {
            if (next.f320050f != 10 && this.f314503q.remove(next.f320048d)) {
                Log.m105925i("MicroMsg.MT.MultiTalkManager", "remove video user according group %s", next.f320048d);
            }
        }
    }

    /* renamed from: i */
    public void mo150666i(String str) {
        Log.m105924i("MicroMsg.MT.MultiTalkManager", "generateMsgExitMsg");
        C72963f4 f4Var = new C72963f4();
        f4Var.setType(64);
        f4Var.mo108733M2(System.currentTimeMillis());
        f4Var.mo100991d(6);
        f4Var.mo108732L2(MMApplicationContext.getContext().getString(C0966R.string.f361070h14));
        if (((C53193b) C86312j.m106911c(C53193b.class)).i90(str)) {
            f4Var.mo108749c3(str);
            f4Var.mo108732L2(f4Var.getContent());
            ((C72972g4) ((C75700k0) C86709a0.m107533q(C75700k0.class)).mo96095LE()).my0(f4Var);
        }
    }

    /* renamed from: j */
    public final void mo150667j(MultiTalkGroup multiTalkGroup, C111452h1 h1Var, boolean z, boolean z2, boolean z3, boolean z4) {
        Log.m105924i("MicroMsg.MT.MultiTalkManager", "generateMsgExitMsg");
        if (h1Var == C111452h1.Inviting && z2) {
            C72963f4 f4Var = new C72963f4();
            f4Var.setType(64);
            f4Var.mo108733M2(System.currentTimeMillis());
            f4Var.mo100991d(6);
            f4Var.mo108732L2(MMApplicationContext.getContext().getString(C0966R.string.f361070h14));
            if (((C53193b) C86312j.m106911c(C53193b.class)).i90(multiTalkGroup.f320044f)) {
                f4Var.mo108749c3(multiTalkGroup.f320044f);
                f4Var.mo108732L2(f4Var.getContent());
                ((C72972g4) ((C75700k0) C86709a0.m107533q(C75700k0.class)).mo96095LE()).my0(f4Var);
            }
        }
    }

    /* renamed from: k */
    public void mo150668k(String str) {
        C72963f4 f4Var = new C72963f4();
        f4Var.setType(64);
        f4Var.mo108733M2(System.currentTimeMillis());
        f4Var.mo100991d(6);
        f4Var.mo108732L2(MMApplicationContext.getContext().getString(C0966R.string.f361067h11));
        if (((C53193b) C86312j.m106911c(C53193b.class)).i90(str)) {
            f4Var.mo108749c3(str);
            f4Var.mo108732L2(f4Var.getContent());
            ((C72972g4) ((C75700k0) C86709a0.m107533q(C75700k0.class)).mo96095LE()).my0(f4Var);
        }
        MultiTalkGroup multiTalkGroup = this.f314466H;
        if (multiTalkGroup != null && str.equals(multiTalkGroup.f320044f) && !this.f314491Z.stopped()) {
            Log.m105924i("MicroMsg.MT.MultiTalkManager", "multiTalkGroupTmp wxGroupId equals this wxGroupId.");
            this.f314466H = null;
            this.f314467I = 0;
            this.f314491Z.stopTimer();
        }
    }

    /* renamed from: l */
    public void mo150669l(String str, String str2, boolean z, boolean z2) {
        Class cls = C79690d.class;
        Class cls2 = C53193b.class;
        Class cls3 = C75700k0.class;
        if (!((C53193b) C86312j.m106911c(cls2)).mo73730sj(str)) {
            Log.m105925i("MicroMsg.MT.MultiTalkManager", "Get Chatroom When chatroom not in conversation %s", str);
            C31519v2.m39436a().mo55988e(str, "", new C105766l(this));
        }
        C72963f4 f4Var = new C72963f4();
        f4Var.setType(64);
        f4Var.mo108733M2(System.currentTimeMillis());
        f4Var.mo100991d(6);
        f4Var.mo108740T2(2);
        String displayName = ((C75339i) C86312j.m106911c(C75339i.class)).getDisplayName(str2);
        if (displayName != null && !displayName.equals("")) {
            str2 = displayName;
        }
        String str3 = str2 + MMApplicationContext.getContext().getString(C0966R.string.f361068h12);
        f4Var.mo108732L2(str3);
        if (((C53193b) C86312j.m106911c(cls2)).i90(str)) {
            f4Var.mo108749c3(str);
            ((C72972g4) ((C75700k0) C86709a0.m107533q(cls3)).mo96095LE()).my0(f4Var);
            C72976h2 j = ((C44660i2) ((C75700k0) C86709a0.m107533q(cls3)).mo96094Ku()).mo69771j(str);
            if (j != null) {
                if (z) {
                    j.mo108812g3(j.mo108786G2() + 1);
                }
                j.mo108792M2(str3);
                if (((C44660i2) ((C75700k0) C86709a0.m107533q(cls3)).mo96094Ku()).mo69775m0(j, str, true, true) == -1) {
                    Log.m105920e("MicroMsg.MT.MultiTalkManager", "update cvs fail!!! for :" + str);
                }
                if (z2) {
                    ((C75568c3) ((C79690d) C86312j.m106911c(cls)).mo109806kA()).mo93204a(f4Var);
                    return;
                }
                return;
            }
            C72976h2 h2Var = new C72976h2();
            h2Var.setUsername(str);
            if (z) {
                h2Var.mo108812g3(1);
            }
            h2Var.mo108792M2(str3);
            ((C44660i2) ((C75700k0) C86709a0.m107533q(cls3)).mo96094Ku()).mo69751W(h2Var);
            if (z2) {
                ((C75568c3) ((C79690d) C86312j.m106911c(cls)).mo109806kA()).mo93204a(f4Var);
            }
        }
    }

    /* renamed from: m */
    public C105770a mo150670m() {
        if (this.f314473P == null) {
            this.f314473P = new C105770a();
        }
        return this.f314473P;
    }

    /* renamed from: n */
    public C105783b0 mo150671n() {
        if (this.f314474Q == null && C104331h.m139314g()) {
            this.f314474Q = new C105783b0();
        }
        return this.f314474Q;
    }

    /* renamed from: o */
    public C105799g0 mo150672o() {
        if (this.f314470L == null) {
            this.f314470L = new C105799g0();
        }
        return this.f314470L;
    }

    public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
    }

    public void onServiceDisconnected(ComponentName componentName) {
    }

    /* renamed from: p */
    public List<String> mo150675p() {
        talk talk;
        MultiTalkGroup multiTalkGroup = this.f314506t;
        if (multiTalkGroup == null) {
            return null;
        }
        String str = multiTalkGroup.f320042d;
        if (Util.isNullOrNil(str)) {
            str = this.f314506t.f320043e;
        }
        boolean w = mo150681w(this.f314506t.f320044f);
        Log.m105919d("MicroMsg.MT.MultiTalkManager", "getTalkingMember: %s, groupid:%s, isILink:%b", C105806i0.m142149b(this.f314506t), this.f314506t.f320044f, Boolean.valueOf(w));
        new ArrayList();
        if (w) {
            C105724z zVar = C105724z.INSTANCE;
            ArrayList<C105683r> a = zVar.f314388f.mo150549a();
            ArrayList arrayList = new ArrayList();
            if (a == null || a.size() == 0 || zVar.f314401n != 1) {
                return null;
            }
            Iterator<C105683r> it = a.iterator();
            while (it.hasNext()) {
                C105683r next = it.next();
                if (C105714w.f314302c.GetVoiceActivity(next.f314237a) > 0) {
                    Log.m105919d("MicroMsg.Multitalk.ILinkService", "getTalkingMember, memberId:%d,memberName:%s", Integer.valueOf(next.f314237a), next.f314239c);
                    arrayList.add(next.f314239c);
                }
            }
            return arrayList;
        }
        ((C109779e) C105851w0.xx0().f314798d).getClass();
        if (!C104166f.m139003c(str, C109770a.m149092a().f328593p)) {
            C104161b.m138997f("TalkRoomSdkApi", "getTalkingMember groupid is not same; multiTalkGroupid: ", str, C109770a.m149092a().f328593p);
            return null;
        }
        TalkRoom h = C109774c.m149103b().mo161020h(str);
        if (h == null) {
            C104161b.m138997f("TalkRoomManager", "getTalkingMember talkroom is null: groupId: ", str);
            return null;
        }
        ArrayList arrayList2 = new ArrayList(((ConcurrentHashMap) h.f320125n).values());
        ArrayList arrayList3 = new ArrayList();
        Iterator it4 = arrayList2.iterator();
        while (it4.hasNext()) {
            C109777d dVar = (C109777d) it4.next();
            if (dVar != null) {
                C109782f a2 = C109770a.m149092a();
                C103860b1 b1Var = dVar.f328542a;
                int i = b1Var == null ? -1 : b1Var.f306893f;
                C109772b bVar = a2.f328564K;
                if ((bVar == null || (talk = bVar.f328532a) == null || talk.GetVoiceActivity(i) <= 0) ? false : true) {
                    arrayList3.add(dVar.mo161024a());
                }
            }
        }
        return arrayList3;
    }

    /* renamed from: q */
    public C105857z0 mo150676q() {
        if (this.f314472N == null) {
            this.f314472N = new C105857z0();
        }
        return this.f314472N;
    }

    /* renamed from: r */
    public C105794d1 mo150677r() {
        if (this.f314471M == null) {
            this.f314471M = new C105798e1(C105851w0.xx0().f314798d);
        }
        return this.f314471M;
    }

    /* renamed from: s */
    public List<String> mo150678s() {
        ArrayList arrayList;
        int i;
        String str = this.f314506t.f320042d;
        if (Util.isNullOrNil(str)) {
            str = this.f314506t.f320043e;
        }
        boolean w = mo150681w(this.f314506t.f320044f);
        Log.m105919d("MicroMsg.MT.MultiTalkManager", "getWeakNetworkMember: %s, groupid:%s, isILink:%b", C105806i0.m142149b(this.f314506t), this.f314506t.f320044f, Boolean.valueOf(w));
        new ArrayList();
        if (w) {
            C105724z zVar = C105724z.INSTANCE;
            ArrayList<C105683r> a = zVar.f314388f.mo150549a();
            arrayList = new ArrayList();
            if (a != null && a.size() > 0 && zVar.f314401n == 1) {
                Iterator<C105683r> it = a.iterator();
                while (it.hasNext()) {
                    C105683r next = it.next();
                    byte[] bArr = new byte[4];
                    if (C105714w.f314302c.SetAppCmd(10, bArr, next.f314237a) >= 0) {
                        int byteArrayToInt = Util.byteArrayToInt(bArr);
                        Log.m105919d("MicroMsg.Multitalk.ILinkService", "netStatus: %d", Integer.valueOf(byteArrayToInt));
                        if (byteArrayToInt != -1 && byteArrayToInt <= 3) {
                            arrayList.add(next.f314239c);
                        }
                    }
                }
            }
        } else {
            if (C105809j0.f314630a == null) {
                C105809j0.f314630a = new C105809j0();
            }
            C105809j0.f314630a.getClass();
            arrayList = new ArrayList();
            TalkRoom h = C109774c.m149103b().mo161020h(str);
            if (h != null) {
                Iterator it4 = ((ArrayList) h.mo157174c()).iterator();
                while (it4.hasNext()) {
                    C103860b1 b1Var = (C103860b1) it4.next();
                    int i2 = b1Var.f306893f;
                    if (i2 >= 0) {
                        byte[] bArr2 = new byte[4];
                        if (((C109779e) C105851w0.xx0().f314798d).mo161038i(10, bArr2, i2) < 0) {
                            Log.m105919d("MicroMsg.Multitalk.VoipNetStatusChecker", "get netStatus failed memberId :%d", Integer.valueOf(i2));
                            i = -1;
                        } else {
                            i = Util.byteArrayToInt(bArr2);
                            Log.m105919d("MicroMsg.Multitalk.VoipNetStatusChecker", "netStatus: %d", Integer.valueOf(i));
                        }
                        if (i != -1 && i <= 3) {
                            arrayList.add(b1Var.f306906s);
                        }
                    }
                }
            }
        }
        return arrayList;
    }

    /* renamed from: t */
    public final void mo150679t() {
        if (this.f314505s == C111452h1.Creating) {
            this.f314494f = false;
        } else {
            this.f314494f = !C110248b.zx0() && !C110248b.Jh0();
        }
        this.f314493e = false;
        this.f314464F = C105806i0.m142150c();
    }

    /* renamed from: v */
    public boolean mo150680v() {
        MultiTalkGroup multiTalkGroup = this.f314506t;
        if (multiTalkGroup != null) {
            return mo150681w(multiTalkGroup.f320044f);
        }
        return false;
    }

    /* renamed from: w */
    public boolean mo150681w(String str) {
        if (Util.isNullOrNil(str)) {
            str = this.f314506t.f320042d;
            if (Util.isNullOrNil(str)) {
                str = this.f314506t.f320043e;
            }
        }
        return (this.f314484V.containsKey(str) ? this.f314484V.get(str).intValue() : 0) == 2;
    }

    /* renamed from: x */
    public boolean mo150682x() {
        boolean z = (this.f314505s == C111452h1.Init || this.f314506t == null) ? false : true;
        Log.m105919d("MicroMsg.MT.MultiTalkManager", "isMultiTalkConnecting %b", Boolean.valueOf(z));
        return z;
    }

    /* renamed from: y */
    public boolean mo150683y() {
        C111452h1 h1Var = this.f314505s;
        boolean z = h1Var == C111452h1.Starting || h1Var == C111452h1.Talking;
        Log.m105919d("MicroMsg.MT.MultiTalkManager", "isMultiTalkStarting %b", Boolean.valueOf(z));
        return z;
    }

    /* renamed from: z */
    public boolean mo150684z() {
        boolean z = this.f314505s == C111452h1.Talking;
        Log.m105919d("MicroMsg.MT.MultiTalkManager", "isMultiTalkTalking %b", Boolean.valueOf(z));
        return z;
    }
}

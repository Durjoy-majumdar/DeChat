package com.tencent.p014mm.plugin.ipcall;

import a70.C112760b;
import android.app.Notification;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Intent;
import android.os.Build;
import android.os.Looper;
import android.telephony.PhoneStateListener;
import android.telephony.TelephonyManager;
import android.view.Display;
import android.view.View;
import android.view.WindowManager;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.app.C40008f;
import com.tencent.p014mm.autogen.events.BackupProcessMgrExitEvent;
import com.tencent.p014mm.autogen.events.VoipCheckIsDeviceUsingEvent;
import com.tencent.p014mm.booter.notification.MMNotification;
import com.tencent.p014mm.plugin.ipcall.model.C105382f;
import com.tencent.p014mm.plugin.ipcall.model.C105385g;
import com.tencent.p014mm.plugin.ipcall.model.IPCallForegroundService;
import com.tencent.p014mm.plugin.ipcall.p065ui.C105406e2;
import com.tencent.p014mm.plugin.ipcall.p065ui.C105420i2;
import com.tencent.p014mm.plugin.ipcall.p065ui.IPCallTalkUI;
import com.tencent.p014mm.plugin.voip.model.C106343f0;
import com.tencent.p014mm.plugin.voip.model.v2protocal;
import com.tencent.p014mm.plugin.voip.p475ui.C106443e;
import com.tencent.p014mm.plugin.voip.p475ui.C106453j0;
import com.tencent.p014mm.plugin.voip.p475ui.VoipViewFragment;
import com.tencent.p014mm.plugin.voip.video.OpenGlRender;
import com.tencent.p014mm.plugin.voip.widget.BaseSmallView;
import com.tencent.p014mm.sdk.event.IEvent;
import com.tencent.p014mm.sdk.event.IListener;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.MMHandler;
import com.tencent.p014mm.sdk.platformtools.MTimerHandler;
import com.tencent.p014mm.sdk.platformtools.Util;
import eb0.C97625j3;
import f40.C86709a0;
import j20.C117292a;
import k12.C108828c;
import k20.C60958c;
import k20.C9556a;
import l12.C109123c;
import l33.C109247e;
import m12.C109468b;
import m12.C109470c;
import nj3.C76879j;
import p156gj.C107842p;
import p206nj.C11171e;
import p910lj.C76701a;
import p918s2.C90116e;
import s12.C13612c;
import s12.C13614k;
import z33.C112597j;

/* renamed from: com.tencent.mm.plugin.ipcall.IPCallManager */
public class IPCallManager implements C105382f.C105384b, C109468b.C109469a, C106343f0.C106347d {

    /* renamed from: v */
    public static MMHandler f313218v = new MMHandler(Looper.getMainLooper());

    /* renamed from: d */
    public C105379e f313219d;

    /* renamed from: e */
    public C13614k f313220e;

    /* renamed from: f */
    public boolean f313221f = false;

    /* renamed from: g */
    public TelephonyManager f313222g;

    /* renamed from: h */
    public boolean f313223h = false;

    /* renamed from: i */
    public Object f313224i = new Object();

    /* renamed from: j */
    public PhoneStateListener f313225j = new C105373a();

    /* renamed from: n */
    public IListener<BackupProcessMgrExitEvent> f313226n;

    /* renamed from: o */
    public IListener f313227o;

    /* renamed from: p */
    public Runnable f313228p;

    /* renamed from: q */
    public Runnable f313229q;

    /* renamed from: r */
    public boolean f313230r;

    /* renamed from: s */
    public C106443e f313231s;

    /* renamed from: t */
    public long f313232t;

    /* renamed from: u */
    public MTimerHandler f313233u;

    /* renamed from: com.tencent.mm.plugin.ipcall.IPCallManager$a */
    public class C105373a extends PhoneStateListener {
        public C105373a() {
        }

        public void onCallStateChanged(int i, String str) {
            super.onCallStateChanged(i, str);
            Log.m105918d("MicroMsg.IPCallManager", "onCallStateChanged " + i);
            if (i == 2) {
                Log.m105924i("MicroMsg.IPCallManager", "system phone call state offhook, stop call");
                IPCallManager.this.mo150067j(0, 0);
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.ipcall.IPCallManager$b */
    public class C105374b implements Runnable {
        public C105374b() {
        }

        public void run() {
            if (!C105385g.Fx0().mo150085c()) {
                Log.m105924i("MicroMsg.IPCallManager", "timeout! still not accept!");
                if (IPCallManager.this.mo150067j(9, 12)) {
                    IPCallManager.this.mo150066i(9, (String) null, MMApplicationContext.getContext().getString(C0966R.string.aud), 2);
                }
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.ipcall.IPCallManager$c */
    public class C105375c implements Runnable {
        public C105375c(IPCallManager iPCallManager) {
        }

        /* JADX WARNING: Removed duplicated region for block: B:16:0x006f A[SYNTHETIC, Splitter:B:16:0x006f] */
        /* JADX WARNING: Removed duplicated region for block: B:26:? A[RETURN, SYNTHETIC] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void run() {
            /*
                r11 = this;
                a43.i r6 = com.tencent.p014mm.plugin.ipcall.model.C105385g.Ex0()
                java.lang.String r1 = "ipcall_phonering"
                r0 = 0
                r6.f304602f = r0
                java.lang.String r7 = "MicroMsg.RingPlayer"
                r2 = 2
                r8 = 1
                boolean r3 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.isMMProcess()     // Catch:{ Exception -> 0x004c }
                if (r3 == 0) goto L_0x002b
                f40.o r3 = f40.C86709a0.m107535s()     // Catch:{ Exception -> 0x004c }
                com.tencent.mm.storage.v1 r3 = r3.mo121142i()     // Catch:{ Exception -> 0x004c }
                r4 = 73218(0x11e02, float:1.026E-40)
                java.lang.Boolean r5 = java.lang.Boolean.TRUE     // Catch:{ Exception -> 0x004c }
                java.lang.Object r3 = r3.mo119684e(r4, r5)     // Catch:{ Exception -> 0x004c }
                java.lang.Boolean r3 = (java.lang.Boolean) r3     // Catch:{ Exception -> 0x004c }
                boolean r3 = r3.booleanValue()     // Catch:{ Exception -> 0x004c }
                goto L_0x002c
            L_0x002b:
                r3 = 1
            L_0x002c:
                boolean r4 = p645pj.C77091b.m93020b()     // Catch:{ Exception -> 0x004a }
                java.lang.String r5 = "startPlayCustomRingWithCustomInterval, voipSound: %s, msgSound: %s, isCallingParty: %s"
                r9 = 3
                java.lang.Object[] r9 = new java.lang.Object[r9]     // Catch:{ Exception -> 0x004a }
                java.lang.Boolean r10 = java.lang.Boolean.valueOf(r3)     // Catch:{ Exception -> 0x004a }
                r9[r0] = r10     // Catch:{ Exception -> 0x004a }
                java.lang.Boolean r4 = java.lang.Boolean.valueOf(r4)     // Catch:{ Exception -> 0x004a }
                r9[r8] = r4     // Catch:{ Exception -> 0x004a }
                java.lang.Boolean r4 = java.lang.Boolean.TRUE     // Catch:{ Exception -> 0x004a }
                r9[r2] = r4     // Catch:{ Exception -> 0x004a }
                com.tencent.p014mm.sdk.platformtools.Log.m105925i(r7, r5, r9)     // Catch:{ Exception -> 0x004a }
                r3 = 1
                goto L_0x0067
            L_0x004a:
                r4 = move-exception
                goto L_0x004f
            L_0x004c:
                r3 = move-exception
                r4 = r3
                r3 = 1
            L_0x004f:
                java.lang.StringBuilder r5 = new java.lang.StringBuilder
                r5.<init>()
                java.lang.String r9 = "get voip sound failed: "
                r5.append(r9)
                java.lang.String r4 = r4.getMessage()
                r5.append(r4)
                java.lang.String r4 = r5.toString()
                com.tencent.p014mm.sdk.platformtools.Log.m105920e(r7, r4)
            L_0x0067:
                if (r3 != 0) goto L_0x006a
                goto L_0x00c7
            L_0x006a:
                boolean r3 = r6.f304601e
                if (r3 == 0) goto L_0x006f
                goto L_0x00c7
            L_0x006f:
                long r3 = java.lang.System.currentTimeMillis()     // Catch:{ Exception -> 0x00ae }
                r6.f304603g = r3     // Catch:{ Exception -> 0x00ae }
                dj.g r3 = new dj.g     // Catch:{ Exception -> 0x00ae }
                r3.<init>()     // Catch:{ Exception -> 0x00ae }
                r6.f304599c = r3     // Catch:{ Exception -> 0x00ae }
                boolean r3 = pu0.C110248b.Jh0()     // Catch:{ Exception -> 0x00ae }
                boolean r4 = pu0.C110248b.zx0()     // Catch:{ Exception -> 0x00ae }
                java.lang.String r5 = "isBluetoothOn: %b, isHeadsetPlugged: %b"
                java.lang.Object[] r2 = new java.lang.Object[r2]     // Catch:{ Exception -> 0x00ae }
                java.lang.Boolean r9 = java.lang.Boolean.valueOf(r3)     // Catch:{ Exception -> 0x00ae }
                r2[r0] = r9     // Catch:{ Exception -> 0x00ae }
                java.lang.Boolean r9 = java.lang.Boolean.valueOf(r4)     // Catch:{ Exception -> 0x00ae }
                r2[r8] = r9     // Catch:{ Exception -> 0x00ae }
                com.tencent.p014mm.sdk.platformtools.Log.m105919d(r7, r5, r2)     // Catch:{ Exception -> 0x00ae }
                r2 = -1
                gj.c r3 = p156gj.C107835h0.f322846c     // Catch:{ Exception -> 0x00ae }
                int r3 = r3.f322698K     // Catch:{ Exception -> 0x00ae }
                if (r3 <= r2) goto L_0x00a0
                r5 = r3
                goto L_0x00a1
            L_0x00a0:
                r5 = 0
            L_0x00a1:
                r6.mo143088d(r0)     // Catch:{ Exception -> 0x00ae }
                r2 = 3500(0xdac, double:1.729E-320)
                r4 = 1
                r0 = r6
                r0.mo143089e(r1, r2, r4, r5)     // Catch:{ Exception -> 0x00ae }
                r6.f304601e = r8     // Catch:{ Exception -> 0x00ae }
                goto L_0x00c7
            L_0x00ae:
                r0 = move-exception
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = "new MediaPlayer failed, "
                r1.append(r2)
                java.lang.String r0 = r0.toString()
                r1.append(r0)
                java.lang.String r0 = r1.toString()
                com.tencent.p014mm.sdk.platformtools.Log.m105920e(r7, r0)
            L_0x00c7:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.ipcall.IPCallManager.C105375c.run():void");
        }
    }

    /* renamed from: com.tencent.mm.plugin.ipcall.IPCallManager$d */
    public class C105376d implements C106443e {
        public C105376d() {
        }

        /* renamed from: a */
        public boolean mo150077a() {
            return C105385g.Fx0().mo150086d();
        }

        /* renamed from: b */
        public void mo150078b() {
        }

        /* renamed from: c */
        public void mo150079c() {
        }

        /* renamed from: d */
        public void mo150080d(Intent intent, BaseSmallView baseSmallView) {
            if (!C105385g.Fx0().mo150085c()) {
                baseSmallView.mo153027l(MMApplicationContext.getContext().getString(C0966R.string.h1e));
                return;
            }
            int secondsToNow = (int) Util.secondsToNow(IPCallManager.this.f313232t);
            if (secondsToNow <= 0) {
                secondsToNow = 0;
            }
            baseSmallView.mo153028m(String.format("%02d:%02d", new Object[]{Integer.valueOf(secondsToNow / 60), Integer.valueOf(secondsToNow % 60)}));
        }
    }

    /* renamed from: com.tencent.mm.plugin.ipcall.IPCallManager$e */
    public class C105377e implements MTimerHandler.CallBack {
        public C105377e() {
        }

        public boolean onTimerExpired() {
            C105379e eVar;
            IPCallManager.this.mo150068k();
            if (!C105385g.Fx0().mo150085c() || (eVar = IPCallManager.this.f313219d) == null) {
                return true;
            }
            C105420i2 i2Var = (C105420i2) eVar;
            int secondsToNow = (int) Util.secondsToNow(C105385g.xx0().f313271i.f313232t);
            if (secondsToNow <= 0) {
                secondsToNow = 0;
            }
            i2Var.f313422A = (long) secondsToNow;
            i2Var.mo150165g(5);
            return true;
        }
    }

    public IPCallManager() {
        C40008f fVar = C40008f.f107254d;
        this.f313226n = new IListener<BackupProcessMgrExitEvent>(fVar) {
            {
                this.__eventId = 176812961;
            }

            public boolean callback(IEvent iEvent) {
                BackupProcessMgrExitEvent backupProcessMgrExitEvent = (BackupProcessMgrExitEvent) iEvent;
                Log.m105924i("MicroMsg.IPCallManager", "recevive BackupProcessMgrExitEvent");
                IPCallManager.this.mo150067j(0, 0);
                return false;
            }
        };
        this.f313227o = new IListener<VoipCheckIsDeviceUsingEvent>(this, fVar) {
            {
                this.__eventId = 1403859438;
            }

            public boolean callback(IEvent iEvent) {
                VoipCheckIsDeviceUsingEvent voipCheckIsDeviceUsingEvent = (VoipCheckIsDeviceUsingEvent) iEvent;
                if (voipCheckIsDeviceUsingEvent instanceof VoipCheckIsDeviceUsingEvent) {
                    VoipCheckIsDeviceUsingEvent.C67817a aVar = voipCheckIsDeviceUsingEvent.f194014d;
                    aVar.f194015a = false;
                    aVar.f194016b = false;
                    aVar.f194017c = true;
                    aVar.f194018d = "";
                }
                return false;
            }
        };
        this.f313228p = new C105374b();
        this.f313229q = new C105375c(this);
        this.f313231s = new C105376d();
        this.f313232t = 0;
    }

    /* renamed from: H */
    public void mo150057H(boolean z) {
        if (C105385g.Fx0().f313245a != 5) {
            Log.m105925i("MicroMsg.IPCallManager", "onBadNetStatus currentState != accept:%d", Integer.valueOf(C105385g.Fx0().f313245a));
            return;
        }
        C109123c yx02 = C105385g.yx0();
        yx02.getClass();
        Log.m105924i("MicroMsg.IPCallDeviceManager", "onBadNetStatus");
        C105420i2 i2Var = yx02.f326760d;
        if (i2Var != null) {
            TextView textView = i2Var.f313438k;
            if (textView != null) {
                textView.setVisibility(0);
            }
            View view = i2Var.f313439l;
            if (view != null) {
                C9556a aVar = new C9556a();
                ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                aVar.mo10233c(0);
                View view2 = view;
                C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/plugin/ipcall/ui/TalkUIController", "tryShowNetStatusWarning", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
                C117292a.m165359e(view2, "com/tencent/mm/plugin/ipcall/ui/TalkUIController", "tryShowNetStatusWarning", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
        }
        if (!yx02.f326758b.mo161485s()) {
            long currentTimeMillis = System.currentTimeMillis();
            if (currentTimeMillis - yx02.f326762f > 30000) {
                yx02.f326762f = currentTimeMillis;
                C109247e.xx0().f317332a.getClass();
            }
        }
    }

    /* renamed from: a */
    public void mo150058a(boolean z) {
        synchronized (this.f313224i) {
            this.f313230r = false;
            C109247e.wx0().mo153005a(z);
            ((NotificationManager) MMApplicationContext.getContext().getSystemService("notification")).cancel(42);
        }
    }

    /* renamed from: b */
    public void mo150059b() {
        if (C105385g.Fx0().f313245a != 5) {
            Log.m105925i("MicroMsg.IPCallManager", "onResumeGoodNetStatus currentState != accept:%d", Integer.valueOf(C105385g.Fx0().f313245a));
            return;
        }
        C109123c yx02 = C105385g.yx0();
        yx02.getClass();
        Log.m105924i("MicroMsg.IPCallDeviceManager", "onResumeGoodNetStatus");
        C105420i2 i2Var = yx02.f326760d;
        if (i2Var != null) {
            i2Var.mo150160b();
        }
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
    /* JADX WARNING: Removed duplicated region for block: B:22:0x012a A[Catch:{ all -> 0x012e }] */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x0168  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x016b  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x0170  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x0184  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x01a7  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x01ac  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x01c0  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x01cf  */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x01d2  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x01d4  */
    /* renamed from: c */
    public boolean mo150060c(int r22, int r23, int r24) {
        /*
            r21 = this;
            r1 = r21
            r2 = r22
            r3 = r23
            com.tencent.mm.plugin.ipcall.model.f r0 = com.tencent.p014mm.plugin.ipcall.model.C105385g.Gx0()
            k12.c r0 = r0.f313260u
            com.tencent.mm.plugin.ipcall.model.e r4 = com.tencent.p014mm.plugin.ipcall.model.C105385g.Fx0()
            boolean r4 = r4.mo150087f(r2)
            r5 = 2
            r6 = 3
            r7 = 5
            r8 = 1
            r9 = 0
            r10 = 4
            if (r4 != 0) goto L_0x005d
            java.lang.String r4 = "MicroMsg.IPCallManager"
            java.lang.String r11 = "finishIPCall, cannot finish now, currentState: %s"
            java.lang.Object[] r12 = new java.lang.Object[r8]
            com.tencent.mm.plugin.ipcall.model.e r13 = com.tencent.p014mm.plugin.ipcall.model.C105385g.Fx0()
            java.lang.String r13 = r13.mo150083a()
            r12[r9] = r13
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r4, r11, r12)
            if (r0 == 0) goto L_0x005c
            java.lang.String r4 = "MicroMsg.IPCallManager"
            java.lang.String r11 = "finishIPCall, cannot finish now inviteId:%d, roomId:%d, state:%d,errStatus:%d, pstnErrCode:%d"
            java.lang.Object[] r7 = new java.lang.Object[r7]
            int r12 = r0.f325899d
            java.lang.Integer r12 = java.lang.Integer.valueOf(r12)
            r7[r9] = r12
            int r0 = r0.f325896a
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r7[r8] = r0
            java.lang.Integer r0 = java.lang.Integer.valueOf(r22)
            r7[r5] = r0
            java.lang.Integer r0 = java.lang.Integer.valueOf(r23)
            r7[r6] = r0
            java.lang.Integer r0 = java.lang.Integer.valueOf(r24)
            r7[r10] = r0
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r4, r11, r7)
        L_0x005c:
            return r9
        L_0x005d:
            if (r0 == 0) goto L_0x008a
            java.lang.String r4 = "MicroMsg.IPCallManager"
            java.lang.String r11 = "finishIPCall inviteId:%d, roomId:%d, state:%d, errStatus:%d, pstnErrCode:%d"
            java.lang.Object[] r12 = new java.lang.Object[r7]
            int r13 = r0.f325899d
            java.lang.Integer r13 = java.lang.Integer.valueOf(r13)
            r12[r9] = r13
            int r0 = r0.f325896a
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r12[r8] = r0
            java.lang.Integer r0 = java.lang.Integer.valueOf(r22)
            r12[r5] = r0
            java.lang.Integer r0 = java.lang.Integer.valueOf(r23)
            r12[r6] = r0
            java.lang.Integer r0 = java.lang.Integer.valueOf(r24)
            r12[r10] = r0
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r4, r11, r12)
        L_0x008a:
            a43.i r0 = com.tencent.p014mm.plugin.ipcall.model.C105385g.Ex0()
            r0.mo143090f()
            a43.i r4 = com.tencent.p014mm.plugin.ipcall.model.C105385g.Ex0()
            java.lang.String r0 = "close_lower_volume"
            l12.c r10 = com.tencent.p014mm.plugin.ipcall.model.C105385g.yx0()
            j12.a r10 = r10.f326758b
            boolean r10 = r10.mo161485s()
            android.content.Context r11 = r4.f304598b
            java.lang.String r12 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getDefaultPreferencePath()
            android.content.SharedPreferences r11 = r11.getSharedPreferences(r12, r9)
            java.lang.String r12 = "settings_shake"
            r11.getBoolean(r12, r8)
            java.lang.String r11 = "voip"
            ou0.a r11 = pu0.C110248b.wx0(r11)
            r11.mo18028n(r10)
            if (r10 == 0) goto L_0x00c2
            pu0.b$a r11 = pu0.C110248b.f329777h
            r11.mo161669n(r9)
            goto L_0x00c7
        L_0x00c2:
            pu0.b$a r11 = pu0.C110248b.f329777h
            r11.mo161669n(r5)
        L_0x00c7:
            java.lang.Object[] r11 = new java.lang.Object[r6]
            java.lang.Boolean r12 = java.lang.Boolean.FALSE
            r11[r9] = r12
            java.lang.Boolean r12 = java.lang.Boolean.valueOf(r10)
            r11[r8] = r12
            java.lang.Integer r12 = java.lang.Integer.valueOf(r5)
            r11[r5] = r12
            java.lang.String r12 = "MicroMsg.RingPlayer"
            java.lang.String r13 = "playSound, shake: %s, isSpeakerOn: %s, type: %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r12, r13, r11)
            long r13 = java.lang.System.currentTimeMillis()
            r4.f304604h = r13
            dj.g r11 = new dj.g
            r11.<init>()
            r13 = 6
            android.net.Uri r0 = r4.mo143087c(r0)     // Catch:{ all -> 0x012e }
            android.content.Context r14 = r4.f304598b     // Catch:{ all -> 0x012e }
            r11.setDataSource(r14, r0)     // Catch:{ all -> 0x012e }
            a43.j r0 = new a43.j     // Catch:{ all -> 0x012e }
            r0.<init>(r4)     // Catch:{ all -> 0x012e }
            r11.setOnCompletionListener(r0)     // Catch:{ all -> 0x012e }
            a43.k r0 = new a43.k     // Catch:{ all -> 0x012e }
            r0.<init>(r4)     // Catch:{ all -> 0x012e }
            r11.setOnErrorListener(r0)     // Catch:{ all -> 0x012e }
            boolean r0 = pu0.C110248b.Jh0()     // Catch:{ all -> 0x012e }
            if (r0 != 0) goto L_0x0110
            if (r10 != 0) goto L_0x010e
            goto L_0x0110
        L_0x010e:
            r0 = 2
            goto L_0x0111
        L_0x0110:
            r0 = 0
        L_0x0111:
            r11.setAudioStreamType(r0)     // Catch:{ all -> 0x012e }
            r11.prepare()     // Catch:{ all -> 0x012e }
            r11.setLooping(r9)     // Catch:{ all -> 0x012e }
            r11.start()     // Catch:{ all -> 0x012e }
            long r14 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x012e }
            long r6 = r4.f304604h     // Catch:{ all -> 0x012e }
            long r14 = r14 - r6
            r6 = 2000(0x7d0, double:9.88E-321)
            int r0 = (r14 > r6 ? 1 : (r14 == r6 ? 0 : -1))
            if (r0 <= 0) goto L_0x0140
            r0 = 7
            r4.f304602f = r0     // Catch:{ all -> 0x012e }
            goto L_0x0140
        L_0x012e:
            r0 = move-exception
            java.lang.Object[] r6 = new java.lang.Object[r8]
            r6[r9] = r0
            java.lang.String r0 = "playSound Failed Throwable t = "
            com.tencent.p014mm.sdk.platformtools.Log.m105929w(r12, r0, r6)
            r4.f304602f = r13
            r11.stop()
            r11.release()
        L_0x0140:
            java.lang.String r0 = "MicroMsg.IPCallManager"
            java.lang.String r4 = "closeDeviceEngine"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r4)
            com.tencent.mm.plugin.voip.model.f0 r0 = com.tencent.p014mm.plugin.voip.model.C106343f0.m143231a()
            r0.mo152578e()
            com.tencent.mm.plugin.voip.model.f0 r0 = com.tencent.p014mm.plugin.voip.model.C106343f0.m143231a()
            r4 = 0
            r0.mo152575b(r4)
            m12.c r0 = com.tencent.p014mm.plugin.ipcall.model.C105385g.Dx0()
            l12.c r6 = com.tencent.p014mm.plugin.ipcall.model.C105385g.yx0()
            j12.a r6 = r6.f326758b
            l12.d r6 = r6.f324869n
            if (r6 == 0) goto L_0x016b
            qh.f r6 = r6.f326763a
            if (r6 == 0) goto L_0x016b
            int r6 = r6.f330222a
            goto L_0x016c
        L_0x016b:
            r6 = 0
        L_0x016c:
            int r7 = r0.f327649D
            if (r7 != 0) goto L_0x0172
            r0.f327649D = r6
        L_0x0172:
            m12.c r0 = com.tencent.p014mm.plugin.ipcall.model.C105385g.Dx0()
            l12.c r6 = com.tencent.p014mm.plugin.ipcall.model.C105385g.yx0()
            j12.a r6 = r6.f326758b
            l12.b r6 = r6.f324868m
            if (r6 == 0) goto L_0x01a7
            com.tencent.mm.plugin.voip.model.d r7 = r6.f326750a
            if (r7 == 0) goto L_0x01a7
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.String r11 = "AudioPlayer  mAudioPlayErrState:"
            r7.append(r11)
            com.tencent.mm.plugin.voip.model.d r11 = r6.f326750a
            int r11 = r11.mo152549h()
            r7.append(r11)
            java.lang.String r7 = r7.toString()
            java.lang.String r11 = "MicroMsg.IPCallAudioPlayer"
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r11, r7)
            com.tencent.mm.plugin.voip.model.d r6 = r6.f326750a
            int r6 = r6.mo152549h()
            goto L_0x01a8
        L_0x01a7:
            r6 = 0
        L_0x01a8:
            int r7 = r0.f327650E
            if (r7 != 0) goto L_0x01ae
            r0.f327650E = r6
        L_0x01ae:
            l12.c r0 = com.tencent.p014mm.plugin.ipcall.model.C105385g.yx0()
            r0.getClass()
            m12.b r6 = com.tencent.p014mm.plugin.ipcall.model.C105385g.zx0()
            j12.a r7 = r0.f326758b
            l12.b r11 = r7.f324868m
            r12 = -1
            if (r11 == 0) goto L_0x01cf
            com.tencent.mm.plugin.voip.model.d r14 = r11.f326750a
            if (r14 == 0) goto L_0x01cd
            boolean r11 = r11.f326752c
            if (r11 == 0) goto L_0x01cd
            int r11 = r14.mo152548g()
            goto L_0x01d0
        L_0x01cd:
            r11 = -1
            goto L_0x01d0
        L_0x01cf:
            r11 = 0
        L_0x01d0:
            if (r11 != r12) goto L_0x01d4
            r7 = 0
            goto L_0x01e5
        L_0x01d4:
            int r14 = r7.mo157507d(r11)
            float r14 = (float) r14
            int r7 = r7.mo157506c(r11)
            float r7 = (float) r7
            float r7 = r7 / r14
            r11 = 100
            float r11 = (float) r11
            float r7 = r7 * r11
            int r7 = (int) r7
        L_0x01e5:
            com.tencent.mm.plugin.voip.model.v2protocal r6 = r6.f327640a
            r6.f317633f0 = r7
            r0.f326761e = r4
            j12.a r6 = r0.f326758b
            l12.b r7 = r6.f324868m
            if (r7 == 0) goto L_0x0214
            boolean r11 = r7.f326752c
            if (r11 == 0) goto L_0x0214
            java.lang.String r11 = "MicroMsg.IPCallAudioPlayer"
            java.lang.String r14 = "stopPlay"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r11, r14)
            java.lang.Object r11 = r7.f326751b
            monitor-enter(r11)
            l12.b$a r14 = new l12.b$a     // Catch:{ all -> 0x0211 }
            com.tencent.mm.plugin.voip.model.d r15 = r7.f326750a     // Catch:{ all -> 0x0211 }
            r14.<init>(r7, r15)     // Catch:{ all -> 0x0211 }
            java.lang.String r15 = "IPCallAudioPlayer_stop"
            com.tencent.p014mm.sdk.thread.ThreadPool.post(r14, r15)     // Catch:{ all -> 0x0211 }
            r7.f326752c = r9     // Catch:{ all -> 0x0211 }
            r7.f326750a = r4     // Catch:{ all -> 0x0211 }
            monitor-exit(r11)     // Catch:{ all -> 0x0211 }
            goto L_0x0214
        L_0x0211:
            r0 = move-exception
            monitor-exit(r11)     // Catch:{ all -> 0x0211 }
            throw r0
        L_0x0214:
            java.lang.String r7 = "ipcall"
            r6.mo161477T(r7)
            r6.f324867l = r4
            nj.c r6 = r6.f324870o
            r6.mo139414a()
            r0.f326760d = r4
            l12.c r0 = com.tencent.p014mm.plugin.ipcall.model.C105385g.yx0()
            j12.a r6 = r0.f326758b
            l12.d r6 = r6.f324869n
            if (r6 == 0) goto L_0x0253
            boolean r7 = r6.f326765c
            if (r7 == 0) goto L_0x0253
            java.lang.String r7 = "MicroMsg.IPCallRecorder"
            java.lang.String r11 = "stop record"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r7, r11)
            java.lang.Object r7 = r6.f326764b
            monitor-enter(r7)
            qh.f r11 = r6.f326763a     // Catch:{ all -> 0x0250 }
            if (r11 == 0) goto L_0x024e
            l12.d$b r14 = new l12.d$b     // Catch:{ all -> 0x0250 }
            r14.<init>(r6, r11)     // Catch:{ all -> 0x0250 }
            java.lang.String r11 = "IPCallRecorder_stopRecord"
            com.tencent.p014mm.sdk.thread.ThreadPool.post(r14, r11)     // Catch:{ all -> 0x0250 }
            r6.f326763a = r4     // Catch:{ all -> 0x0250 }
            r6.f326765c = r9     // Catch:{ all -> 0x0250 }
            r6.f326766d = r9     // Catch:{ all -> 0x0250 }
        L_0x024e:
            monitor-exit(r7)     // Catch:{ all -> 0x0250 }
            goto L_0x0253
        L_0x0250:
            r0 = move-exception
            monitor-exit(r7)     // Catch:{ all -> 0x0250 }
            throw r0
        L_0x0253:
            r0.f326761e = r4
            m12.b r0 = com.tencent.p014mm.plugin.ipcall.model.C105385g.zx0()
            r0.getClass()
            java.lang.String r6 = "MicroMsg.IPCallEngineManager"
            java.lang.String r7 = "close engine"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r6, r7)
            com.tencent.mm.plugin.voip.model.v2protocal r6 = r0.f327640a
            r6.mo152850x(r8)
            m12.c r6 = com.tencent.p014mm.plugin.ipcall.model.C105385g.Dx0()
            java.lang.String r7 = r6.f327676x
            boolean r7 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r7)
            if (r7 == 0) goto L_0x0337
            java.lang.String r7 = r6.f327675w
            boolean r7 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r7)
            if (r7 == 0) goto L_0x0337
            com.tencent.mm.plugin.ipcall.model.f r7 = com.tencent.p014mm.plugin.ipcall.model.C105385g.Gx0()
            k12.c r7 = r7.f313260u
            m12.b r11 = com.tencent.p014mm.plugin.ipcall.model.C105385g.zx0()
            com.tencent.mm.plugin.voip.model.v2protocal r11 = r11.f327640a
            int r14 = r6.f327660h
            if (r14 != r8) goto L_0x028e
            r14 = 1
            goto L_0x028f
        L_0x028e:
            r14 = 0
        L_0x028f:
            int r7 = r7.f325921z
            byte[] r15 = r11.f317559D1
            int r10 = r15.length
            r11.getPstnChannelInfo(r15, r10, r14, r7)
            java.lang.Object[] r7 = new java.lang.Object[r8]
            int r10 = r11.field_pstnChannelInfoLength
            java.lang.Integer r10 = java.lang.Integer.valueOf(r10)
            r7[r9] = r10
            java.lang.String r10 = "MicroMsg.Voip"
            java.lang.String r14 = "field_pstnChannelInfoLength: %d"
            com.tencent.p014mm.sdk.platformtools.Log.m105919d(r10, r14, r7)
            java.lang.String r7 = new java.lang.String
            byte[] r14 = r11.f317559D1
            int r11 = r11.field_pstnChannelInfoLength
            r7.<init>(r14, r9, r11)
            r6.f327676x = r7
            m12.b r7 = com.tencent.p014mm.plugin.ipcall.model.C105385g.zx0()
            com.tencent.mm.plugin.voip.model.v2protocal r7 = r7.f327640a
            byte[] r11 = r7.f317562E1
            int r14 = r11.length
            r7.getPstnEngineInfo(r11, r14)
            java.lang.Object[] r11 = new java.lang.Object[r8]
            int r14 = r7.field_pstnEngineInfoLength
            java.lang.Integer r14 = java.lang.Integer.valueOf(r14)
            r11[r9] = r14
            java.lang.String r14 = "field_pstnEngineInfoLength: %d"
            com.tencent.p014mm.sdk.platformtools.Log.m105919d(r10, r14, r11)
            java.lang.String r10 = new java.lang.String
            byte[] r11 = r7.f317562E1
            int r7 = r7.field_pstnEngineInfoLength
            r10.<init>(r11, r9, r7)
            r6.f327675w = r10
            m12.b r7 = com.tencent.p014mm.plugin.ipcall.model.C105385g.zx0()
            com.tencent.mm.plugin.voip.model.v2protocal r7 = r7.f327640a
            int r10 = com.tencent.p014mm.plugin.voip.model.v2protocal.f317531R1
            r10 = r10 & 255(0xff, float:3.57E-43)
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            java.lang.String r14 = r7.mo152803j()
            r11.append(r14)
            java.lang.String r14 = ","
            r11.append(r14)
            int r15 = r7.f317558D0
            r11.append(r15)
            r11.append(r14)
            r11.append(r10)
            java.lang.String r10 = r7.mo152771g()
            r11.append(r10)
            r11.append(r14)
            int r7 = r7.f317633f0
            r11.append(r7)
            java.lang.String r7 = r11.toString()
            r6.f327677y = r7
            java.lang.Object[] r7 = new java.lang.Object[r8]
            java.lang.String r10 = r6.f327676x
            r7[r9] = r10
            java.lang.String r10 = "MicroMsg.IPCallReportHelper"
            java.lang.String r11 = "nativeChannelReportString: %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105919d(r10, r11, r7)
            java.lang.Object[] r7 = new java.lang.Object[r8]
            java.lang.String r11 = r6.f327675w
            r7[r9] = r11
            java.lang.String r11 = "nativeEngineReportString: %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105919d(r10, r11, r7)
            java.lang.Object[] r7 = new java.lang.Object[r8]
            java.lang.String r6 = r6.f327677y
            r7[r9] = r6
            java.lang.String r6 = "clientReportExString: %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105919d(r10, r6, r7)
        L_0x0337:
            com.tencent.mm.plugin.voip.model.v2protocal r6 = r0.f327640a
            r6.mo152851y()
            r0.f327643d = r9
            r0.f327642c = r9
            r0.f327644e = r9
            com.tencent.mm.sdk.platformtools.MMHandler r0 = f313218v
            java.lang.Runnable r6 = r1.f313229q
            r0.removeCallbacks(r6)
            com.tencent.mm.sdk.platformtools.MMHandler r0 = f313218v
            java.lang.Runnable r6 = r1.f313228p
            r0.removeCallbacks(r6)
            com.tencent.mm.sdk.platformtools.MTimerHandler r0 = r1.f313233u
            if (r0 == 0) goto L_0x0359
            r0.stopTimer()
            r1.f313233u = r4
        L_0x0359:
            m12.c r0 = com.tencent.p014mm.plugin.ipcall.model.C105385g.Dx0()
            r6 = r24
            r0.f327662j = r6
            m12.c r0 = com.tencent.p014mm.plugin.ipcall.model.C105385g.Dx0()
            r0.getClass()
            java.lang.String r6 = "MicroMsg.IPCallReportHelper"
            java.lang.String r7 = "markEndTalk"
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r6, r7)
            long r10 = r0.f327674v
            r14 = 0
            int r7 = (r10 > r14 ? 1 : (r10 == r14 ? 0 : -1))
            if (r7 != 0) goto L_0x0398
            long r10 = r0.f327673u
            int r7 = (r10 > r14 ? 1 : (r10 == r14 ? 0 : -1))
            if (r7 == 0) goto L_0x0398
            long r10 = java.lang.System.currentTimeMillis()
            r0.f327674v = r10
            long r14 = r0.f327673u
            long r10 = r10 - r14
            r14 = 1000(0x3e8, double:4.94E-321)
            long r10 = r10 / r14
            r0.f327661i = r10
            java.lang.Object[] r0 = new java.lang.Object[r8]
            java.lang.Long r7 = java.lang.Long.valueOf(r10)
            r0[r9] = r7
            java.lang.String r7 = "callTime: %d"
            com.tencent.p014mm.sdk.platformtools.Log.m105919d(r6, r7, r0)
        L_0x0398:
            r0 = 8
            r6 = -1
            if (r2 != r0) goto L_0x03d4
            com.tencent.mm.plugin.ipcall.model.f r0 = com.tencent.p014mm.plugin.ipcall.model.C105385g.Gx0()
            r0.mo150088c()
            m12.c r0 = com.tencent.p014mm.plugin.ipcall.model.C105385g.Dx0()
            r0.mo160706b()
            s12.k r0 = r1.f313220e
            if (r0 != 0) goto L_0x03b2
            goto L_0x04d3
        L_0x03b2:
            java.lang.Object[] r2 = new java.lang.Object[r8]
            long r10 = r0.systemRowid
            java.lang.Long r3 = java.lang.Long.valueOf(r10)
            r2[r9] = r3
            java.lang.String r3 = "MicroMsg.IPCallRecordStorageLogic"
            java.lang.String r10 = "recordCancelCall, localId: %d"
            com.tencent.p014mm.sdk.platformtools.Log.m105919d(r3, r10, r2)
            long r2 = r0.systemRowid
            int r10 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1))
            if (r10 == 0) goto L_0x04d3
            r0.field_status = r5
            s12.l r2 = com.tencent.p014mm.plugin.ipcall.model.C105385g.Cx0()
            r2.mo13011Lo(r0)
            goto L_0x04d3
        L_0x03d4:
            r0 = 12
            r10 = 11
            if (r2 != r0) goto L_0x0419
            com.tencent.mm.plugin.ipcall.model.f r0 = com.tencent.p014mm.plugin.ipcall.model.C105385g.Gx0()
            r0.mo150088c()
            m12.c r0 = com.tencent.p014mm.plugin.ipcall.model.C105385g.Dx0()
            r0.mo160706b()
            if (r3 != r10) goto L_0x03f1
            s12.k r0 = r1.f313220e
            s12.C13616m.m12922a(r0)
            goto L_0x04d3
        L_0x03f1:
            s12.k r0 = r1.f313220e
            if (r0 != 0) goto L_0x03f7
            goto L_0x04d3
        L_0x03f7:
            java.lang.Object[] r2 = new java.lang.Object[r8]
            long r10 = r0.systemRowid
            java.lang.Long r3 = java.lang.Long.valueOf(r10)
            r2[r9] = r3
            java.lang.String r3 = "MicroMsg.IPCallRecordStorageLogic"
            java.lang.String r5 = "recordCallFailed, localId: %d"
            com.tencent.p014mm.sdk.platformtools.Log.m105919d(r3, r5, r2)
            long r2 = r0.systemRowid
            int r5 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1))
            if (r5 == 0) goto L_0x04d3
            r0.field_status = r13
            s12.l r2 = com.tencent.p014mm.plugin.ipcall.model.C105385g.Cx0()
            r2.mo13011Lo(r0)
            goto L_0x04d3
        L_0x0419:
            r0 = 9
            if (r2 != r0) goto L_0x0441
            com.tencent.mm.plugin.ipcall.model.f r0 = com.tencent.p014mm.plugin.ipcall.model.C105385g.Gx0()
            r0.mo150098m(r8)
            m12.c r0 = com.tencent.p014mm.plugin.ipcall.model.C105385g.Dx0()
            r0.getClass()
            java.lang.String r2 = "MicroMsg.IPCallReportHelper"
            java.lang.String r3 = "selfShutdown"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r3)
            r0.f327657e = r8
            s12.k r0 = r1.f313220e
            m12.c r2 = com.tencent.p014mm.plugin.ipcall.model.C105385g.Dx0()
            long r2 = r2.f327661i
            s12.C13616m.m12923b(r0, r2)
            goto L_0x04d3
        L_0x0441:
            r0 = 10
            if (r2 != r0) goto L_0x0491
            com.tencent.mm.plugin.ipcall.model.f r0 = com.tencent.p014mm.plugin.ipcall.model.C105385g.Gx0()
            r0.mo150098m(r8)
            m12.c r0 = com.tencent.p014mm.plugin.ipcall.model.C105385g.Dx0()
            r0.getClass()
            java.lang.String r2 = "MicroMsg.IPCallReportHelper"
            java.lang.String r3 = "otherSideUserShutdown"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r3)
            r0.f327655c = r8
            s12.k r0 = r1.f313220e
            m12.c r2 = com.tencent.p014mm.plugin.ipcall.model.C105385g.Dx0()
            long r2 = r2.f327661i
            if (r0 != 0) goto L_0x0467
            goto L_0x04d3
        L_0x0467:
            java.lang.Object[] r5 = new java.lang.Object[r5]
            long r10 = r0.systemRowid
            java.lang.Long r10 = java.lang.Long.valueOf(r10)
            r5[r9] = r10
            java.lang.Long r10 = java.lang.Long.valueOf(r2)
            r5[r8] = r10
            java.lang.String r10 = "MicroMsg.IPCallRecordStorageLogic"
            java.lang.String r11 = "recordOthersideShutdownCall, localId: %d, talkTime: %d"
            com.tencent.p014mm.sdk.platformtools.Log.m105919d(r10, r11, r5)
            long r10 = r0.systemRowid
            int r5 = (r10 > r6 ? 1 : (r10 == r6 ? 0 : -1))
            if (r5 == 0) goto L_0x04d3
            r6 = 5
            r0.field_status = r6
            r0.field_duration = r2
            s12.l r2 = com.tencent.p014mm.plugin.ipcall.model.C105385g.Cx0()
            r2.mo13011Lo(r0)
            goto L_0x04d3
        L_0x0491:
            r6 = 5
            if (r2 != r10) goto L_0x04d3
            if (r3 != r6) goto L_0x049f
            com.tencent.mm.plugin.ipcall.model.f r0 = com.tencent.p014mm.plugin.ipcall.model.C105385g.Gx0()
            r2 = 3
            r0.mo150098m(r2)
            goto L_0x04b0
        L_0x049f:
            if (r3 != r10) goto L_0x04a9
            com.tencent.mm.plugin.ipcall.model.f r0 = com.tencent.p014mm.plugin.ipcall.model.C105385g.Gx0()
            r0.mo150098m(r8)
            goto L_0x04b0
        L_0x04a9:
            com.tencent.mm.plugin.ipcall.model.f r0 = com.tencent.p014mm.plugin.ipcall.model.C105385g.Gx0()
            r0.mo150098m(r5)
        L_0x04b0:
            m12.c r0 = com.tencent.p014mm.plugin.ipcall.model.C105385g.Dx0()
            r0.getClass()
            java.lang.String r2 = "MicroMsg.IPCallReportHelper"
            java.lang.String r5 = "selfShutdown"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r5)
            r0.f327657e = r8
            if (r3 != r10) goto L_0x04c8
            s12.k r0 = r1.f313220e
            s12.C13616m.m12922a(r0)
            goto L_0x04d3
        L_0x04c8:
            s12.k r0 = r1.f313220e
            m12.c r2 = com.tencent.p014mm.plugin.ipcall.model.C105385g.Dx0()
            long r2 = r2.f327661i
            s12.C13616m.m12923b(r0, r2)
        L_0x04d3:
            com.tencent.mm.plugin.ipcall.model.f r0 = com.tencent.p014mm.plugin.ipcall.model.C105385g.Gx0()
            boolean r0 = r0.f313262w
            if (r0 == 0) goto L_0x05cf
            boolean r0 = r1.f313230r
            if (r0 != 0) goto L_0x05c8
            com.tencent.mm.plugin.ipcall.model.f r0 = com.tencent.p014mm.plugin.ipcall.model.C105385g.Gx0()
            k12.c r0 = r0.f313260u
            int r0 = r0.f325896a
            if (r0 == 0) goto L_0x05c8
            com.tencent.mm.plugin.ipcall.model.f r0 = com.tencent.p014mm.plugin.ipcall.model.C105385g.Gx0()
            k12.c r0 = r0.f313260u
            long r2 = r0.f325898c
            r5 = 0
            int r0 = (r2 > r5 ? 1 : (r2 == r5 ? 0 : -1))
            if (r0 == 0) goto L_0x05c8
            android.content.Context r0 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            com.tencent.mm.plugin.ipcall.model.f r2 = com.tencent.p014mm.plugin.ipcall.model.C105385g.Gx0()
            k12.c r2 = r2.f313260u
            int r2 = r2.f325896a
            com.tencent.mm.plugin.ipcall.model.f r3 = com.tencent.p014mm.plugin.ipcall.model.C105385g.Gx0()
            k12.c r3 = r3.f313260u
            long r5 = r3.f325898c
            java.lang.String r3 = "MicroMsg.IPCallPluginUtil"
            java.lang.String r7 = "tryShowFeedbackDialog"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r3, r7)
            boolean r7 = com.tencent.p014mm.plugin.ipcall.C4611d.m4902a()
            if (r7 == 0) goto L_0x05cf
            java.lang.Class<lc3.b> r7 = lc3.C10485b.class
            k40.a r7 = f40.C86709a0.m107533q(r7)
            lc3.b r7 = (lc3.C10485b) r7
            pj.f r7 = r7.vh0()
            java.lang.String r10 = "WCOMaxTimesForShowFeedback"
            int r7 = r7.mo107404b(r10, r9)
            eb0.c r10 = eb0.C97625j3.m125812b()
            com.tencent.mm.storage.v1 r10 = r10.mo105906u()
            com.tencent.mm.storage.y1$a r11 = com.tencent.p014mm.storage.C72994y1.C72995a.USERFINO_IPCALL_SHOW_FEEDBACK_TIME_COUNT_INT
            java.lang.Integer r13 = java.lang.Integer.valueOf(r9)
            java.lang.Object r10 = r10.mo119685f(r11, r13)
            java.lang.Integer r10 = (java.lang.Integer) r10
            int r10 = r10.intValue()
            eb0.c r13 = eb0.C97625j3.m125812b()
            com.tencent.mm.storage.v1 r13 = r13.mo105906u()
            com.tencent.mm.storage.y1$a r14 = com.tencent.p014mm.storage.C72994y1.C72995a.USERFINO_IPCALL_SHOW_FEEDBACK_LAST_TIME_LONG
            r15 = 0
            java.lang.Long r15 = java.lang.Long.valueOf(r15)
            java.lang.Object r13 = r13.mo119685f(r14, r15)
            java.lang.Long r13 = (java.lang.Long) r13
            long r15 = r13.longValue()
            long r17 = com.tencent.p014mm.sdk.platformtools.Util.nowSecond()
            long r15 = r17 - r15
            r19 = 86400(0x15180, double:4.26873E-319)
            int r13 = (r15 > r19 ? 1 : (r15 == r19 ? 0 : -1))
            if (r13 <= 0) goto L_0x056f
            java.lang.String r10 = "tryShowFeedbackDialog reset time"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r3, r10)
            r10 = 0
        L_0x056f:
            if (r10 < r7) goto L_0x0586
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r2 = "tryShowFeedbackDialog reach max time"
            r0.append(r2)
            r0.append(r7)
            java.lang.String r0 = r0.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r3, r0)
            goto L_0x05cf
        L_0x0586:
            r19 = 1800(0x708, double:8.893E-321)
            int r7 = (r15 > r19 ? 1 : (r15 == r19 ? 0 : -1))
            if (r7 >= 0) goto L_0x0592
            java.lang.String r0 = "tryShowFeedbackDialog not reach INTERVAL_TIMES_TRY_SHOW_WCO_FEEDBACK_MAIN"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r3, r0)
            goto L_0x05cf
        L_0x0592:
            int r10 = r10 + r8
            eb0.c r3 = eb0.C97625j3.m125812b()
            com.tencent.mm.storage.v1 r3 = r3.mo105906u()
            java.lang.Integer r7 = java.lang.Integer.valueOf(r10)
            r3.mo119677K(r11, r7)
            eb0.c r3 = eb0.C97625j3.m125812b()
            com.tencent.mm.storage.v1 r3 = r3.mo105906u()
            java.lang.Long r7 = java.lang.Long.valueOf(r17)
            r3.mo119677K(r14, r7)
            android.content.Intent r3 = new android.content.Intent
            r3.<init>()
            java.lang.String r7 = "IPCallFeedbackDialogUI_KRoomId"
            r3.putExtra(r7, r2)
            java.lang.String r2 = "IPCallFeedbackDialogUI_KCallseq"
            r3.putExtra(r2, r5)
            java.lang.String r2 = "ipcall"
            java.lang.String r5 = ".ui.IPCallFeedbackDialogUI"
            ke3.C88144b.m109791i(r0, r2, r5, r3, r4)
            goto L_0x05cf
        L_0x05c8:
            java.lang.String r0 = "MicroMsg.IPCallManager"
            java.lang.String r2 = "roomId = 0,ignore feedback"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r0, r2)
        L_0x05cf:
            com.tencent.mm.plugin.ipcall.model.f r0 = com.tencent.p014mm.plugin.ipcall.model.C105385g.Gx0()
            r0.f313251i = r4
            m12.b r0 = com.tencent.p014mm.plugin.ipcall.model.C105385g.zx0()
            r0.f327645f = r4
            com.tencent.mm.plugin.ipcall.model.e r0 = com.tencent.p014mm.plugin.ipcall.model.C105385g.Fx0()
            r0.f313245a = r12
            com.tencent.mm.plugin.ipcall.model.g r0 = com.tencent.p014mm.plugin.ipcall.model.C105385g.xx0()
            l12.c r0 = r0.f313269g
            boolean r2 = r0.f326759c
            if (r2 == 0) goto L_0x05f9
            j12.a r2 = r0.f326758b
            r2.getClass()
            pu0.b$a r2 = pu0.C110248b.f329777h
            java.lang.String r3 = "ipcall"
            r2.mo161670o(r3)
            r0.f326759c = r9
        L_0x05f9:
            zt3.t r0 = zt3.C119157j.f356862d
            com.tencent.mm.plugin.ipcall.c r2 = new com.tencent.mm.plugin.ipcall.c
            r2.<init>(r1)
            zt3.j r0 = (zt3.C119157j) r0
            r0.mo183895z(r2)
            r21.mo150069l()
            java.lang.Object[] r0 = new java.lang.Object[r9]
            java.lang.String r2 = "MicroMsg.IPCallManager"
            java.lang.String r3 = "unbindIPCallForegroundIfNeed"
            com.tencent.p014mm.sdk.platformtools.Log.printInfoStack(r2, r3, r0)
            r0 = 26
            boolean r0 = p206nj.C11171e.m11046c(r0)
            if (r0 == 0) goto L_0x0643
            android.content.Intent r0 = new android.content.Intent     // Catch:{ Exception -> 0x0630 }
            r0.<init>()     // Catch:{ Exception -> 0x0630 }
            android.content.Context r3 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()     // Catch:{ Exception -> 0x0630 }
            java.lang.Class<com.tencent.mm.plugin.ipcall.model.IPCallForegroundService> r4 = com.tencent.p014mm.plugin.ipcall.model.IPCallForegroundService.class
            r0.setClass(r3, r4)     // Catch:{ Exception -> 0x0630 }
            android.content.Context r3 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()     // Catch:{ Exception -> 0x0630 }
            r3.stopService(r0)     // Catch:{ Exception -> 0x0630 }
            r0 = 1
            goto L_0x063f
        L_0x0630:
            r0 = move-exception
            java.lang.Object[] r3 = new java.lang.Object[r8]
            java.lang.String r4 = r0.getMessage()
            r3[r9] = r4
            java.lang.String r4 = "unbindIPCallForegroundIfNeed error: %s"
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r2, r0, r4, r3)
            r0 = 0
        L_0x063f:
            if (r0 == 0) goto L_0x0643
            r1.f313223h = r9
        L_0x0643:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.ipcall.IPCallManager.mo150060c(int, int, int):boolean");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0058, code lost:
        return;
     */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo150061d() {
        /*
            r6 = this;
            java.lang.Object r0 = r6.f313224i
            monitor-enter(r0)
            com.tencent.mm.plugin.ipcall.model.e r1 = com.tencent.p014mm.plugin.ipcall.model.C105385g.Fx0()     // Catch:{ all -> 0x0059 }
            boolean r1 = r1.mo150086d()     // Catch:{ all -> 0x0059 }
            if (r1 == 0) goto L_0x0057
            boolean r1 = r6.f313230r     // Catch:{ all -> 0x0059 }
            if (r1 == 0) goto L_0x0016
            r6.mo150068k()     // Catch:{ all -> 0x0059 }
            monitor-exit(r0)     // Catch:{ all -> 0x0059 }
            return
        L_0x0016:
            r1 = 1
            r6.f313230r = r1     // Catch:{ all -> 0x0059 }
            android.content.Context r2 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()     // Catch:{ all -> 0x0059 }
            r3 = 2131833219(0x7f113183, float:1.9299514E38)
            r4 = 0
            android.widget.Toast r2 = p910lj.C76701a.makeText((android.content.Context) r2, (int) r3, (int) r4)     // Catch:{ all -> 0x0059 }
            r2.show()     // Catch:{ all -> 0x0059 }
            android.content.Intent r2 = new android.content.Intent     // Catch:{ all -> 0x0059 }
            r2.<init>()     // Catch:{ all -> 0x0059 }
            r3 = 268435456(0x10000000, float:2.5243549E-29)
            r2.setFlags(r3)     // Catch:{ all -> 0x0059 }
            android.content.Context r3 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()     // Catch:{ all -> 0x0059 }
            java.lang.Class<com.tencent.mm.plugin.ipcall.ui.IPCallTalkUI> r5 = com.tencent.p014mm.plugin.ipcall.p065ui.IPCallTalkUI.class
            r2.setClass(r3, r5)     // Catch:{ all -> 0x0059 }
            java.lang.String r3 = "IPCallTalkUI_isFromMiniNotification"
            r2.putExtra(r3, r1)     // Catch:{ all -> 0x0059 }
            com.tencent.mm.plugin.voip.ui.j0 r3 = l33.C109247e.wx0()     // Catch:{ all -> 0x0059 }
            com.tencent.mm.plugin.voip.ui.e r5 = r6.f313231s     // Catch:{ all -> 0x0059 }
            r3.mo153008d(r2, r4, r1, r5)     // Catch:{ all -> 0x0059 }
            r6.mo150068k()     // Catch:{ all -> 0x0059 }
            com.tencent.mm.plugin.ipcall.e r1 = r6.f313219d     // Catch:{ all -> 0x0059 }
            if (r1 == 0) goto L_0x0057
            com.tencent.mm.plugin.ipcall.ui.i2 r1 = (com.tencent.p014mm.plugin.ipcall.p065ui.C105420i2) r1     // Catch:{ all -> 0x0059 }
            com.tencent.mm.plugin.ipcall.ui.IPCallTalkUI r1 = r1.f313450w     // Catch:{ all -> 0x0059 }
            r1.finish()     // Catch:{ all -> 0x0059 }
        L_0x0057:
            monitor-exit(r0)     // Catch:{ all -> 0x0059 }
            return
        L_0x0059:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0059 }
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.ipcall.IPCallManager.mo150061d():void");
    }

    /* renamed from: e */
    public void mo150062e(int i, String str, String str2, int i2) {
        Log.m105925i("MicroMsg.IPCallManager", "onAccountOverdue, currentState: %s", C105385g.Fx0().mo150083a());
        if (mo150067j(8, 9)) {
            mo150066i(8, str, str2, i2);
        }
    }

    /* renamed from: f */
    public void mo150063f(int i, String str, String str2, int i2) {
        Log.m105925i("MicroMsg.IPCallManager", "onCallPhoneNumberInvalid, currentState: %s", C105385g.Fx0().mo150083a());
        if (mo150067j(11, 0)) {
            mo150066i(11, str, str2, i2);
        }
    }

    /* renamed from: g */
    public void mo150064g(int i) {
        Log.m105925i("MicroMsg.IPCallManager", "onChannelConnectFailed, currentState: %s", C105385g.Fx0().mo150083a());
        if (C105385g.zx0().f327643d) {
            Log.m105924i("MicroMsg.IPCallManager", "onChannelConnectFailed, channel already connected");
            if (mo150067j(5, i)) {
                mo150066i(5, (String) null, MMApplicationContext.getContext().getString(C0966R.string.au8), 1);
                return;
            }
            return;
        }
        Log.m105924i("MicroMsg.IPCallManager", "onChannelConnectFailed, channel not connet, may be request connect failed");
        if (mo150067j(4, i)) {
            mo150066i(4, (String) null, MMApplicationContext.getContext().getString(C0966R.string.au8), 1);
        }
    }

    /* renamed from: h */
    public void mo150065h(int i, String str, String str2, int i2, int i3) {
        Log.m105925i("MicroMsg.IPCallManager", "onDisasterHappen, currentState: %s", C105385g.Fx0().mo150083a());
        if (mo150067j(12, 0)) {
            mo150065h(12, str, str2, i2, i3);
        }
    }

    /* renamed from: i */
    public void mo150066i(int i, String str, String str2, int i2) {
        C105379e eVar = this.f313219d;
        if (eVar != null) {
            C105420i2 i2Var = (C105420i2) eVar;
            i2Var.getClass();
            Log.m105919d("MicroMsg.TalkUIController", "onError, error: %d", Integer.valueOf(i));
            if (i2 == 1) {
                i2Var.f313425D = false;
            }
            if (i == 8) {
                if (i2 == 1) {
                    if (Util.isNullOrNil(str)) {
                        str = i2Var.f313450w.getString(C0966R.string.fts);
                    }
                    IPCallTalkUI iPCallTalkUI = i2Var.f313450w;
                    C76879j.m92711E(iPCallTalkUI, str2, str, iPCallTalkUI.getString(C0966R.string.ftt), false, new C105406e2(i2Var));
                    i2Var.mo150169k(8);
                    return;
                }
                i2Var.mo150168j(str, str2, i2, i2Var.f313450w.getString(C0966R.string.ftr));
                i2Var.mo150169k(8);
            } else if (i == 10) {
                i2Var.mo150168j(str, str2, i2, (String) null);
                i2Var.mo150169k(10);
            } else if (i == 11) {
                i2Var.mo150168j(str, str2, i2, (String) null);
                i2Var.mo150169k(11);
            } else {
                i2Var.mo150168j(str, str2, i2, (String) null);
                if (i == 5) {
                    i2Var.mo150169k(3);
                } else {
                    i2Var.mo150169k(2);
                }
            }
        } else {
            C76701a.makeText(MMApplicationContext.getContext(), (CharSequence) str2, 1).show();
        }
    }

    /* renamed from: j */
    public boolean mo150067j(int i, int i2) {
        return C105385g.Fx0().mo150085c() ? i == 0 ? mo150060c(9, i, i2) : mo150060c(11, i, i2) : i == 0 ? mo150060c(8, i, i2) : mo150060c(12, i, i2);
    }

    /* renamed from: k */
    public void mo150068k() {
        String str;
        if (C11171e.m11044a(26)) {
            if (C105385g.Fx0().mo150085c()) {
                str = MMApplicationContext.getContext().getString(C0966R.string.fui, new Object[]{String.format("%02d:%02d", new Object[]{Long.valueOf(Util.secondsToNow(this.f313232t) / 60), Long.valueOf(Util.secondsToNow(this.f313232t) % 60)})});
            } else {
                str = MMApplicationContext.getContext().getString(C0966R.string.fuh);
            }
            Intent intent = new Intent(MMApplicationContext.getContext(), IPCallTalkUI.class);
            intent.putExtra("IPCallTalkUI_isFromMiniNotification", true);
            PendingIntent activity = PendingIntent.getActivity(MMApplicationContext.getContext(), 42, intent, 134217728);
            int i = C0966R.C0969drawable.c9k;
            if (C11171e.m11044a(19)) {
                i = C0966R.C0969drawable.c9j;
            }
            C90116e.C90121c cVar = new C90116e.C90121c(MMApplicationContext.getContext(), "reminder_channel_id");
            cVar.mo124390o(MMApplicationContext.getContext().getString(C0966R.string.fuh));
            cVar.f258814z.when = System.currentTimeMillis();
            cVar.mo124383h(MMApplicationContext.getContext().getString(C0966R.string.fu8));
            cVar.mo124382g(str);
            cVar.f258795g = activity;
            Notification b = cVar.mo124378b();
            b.icon = i;
            b.flags |= 32;
            ((MMNotification) C97625j3.m125816f()).mo93215l(42, b, false);
        }
        if (!C105385g.Fx0().mo150085c()) {
            C106453j0 wx02 = C109247e.wx0();
            String string = MMApplicationContext.getContext().getString(C0966R.string.h1e);
            VoipViewFragment voipViewFragment = wx02.f317987a;
            if (voipViewFragment != null) {
                voipViewFragment.mo152990e(string);
                return;
            }
            return;
        }
        C106453j0 wx03 = C109247e.wx0();
        int secondsToNow = (int) Util.secondsToNow(this.f313232t);
        if (secondsToNow <= 0) {
            secondsToNow = 0;
        }
        if (wx03.f317987a != null) {
            wx03.f317987a.mo152991f(String.format("%02d:%02d", new Object[]{Integer.valueOf(secondsToNow / 60), Integer.valueOf(secondsToNow % 60)}));
        }
    }

    /* renamed from: l */
    public final void mo150069l() {
        TelephonyManager telephonyManager = this.f313222g;
        if (telephonyManager != null) {
            PhoneStateListener phoneStateListener = this.f313225j;
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(0);
            aVar.mo10233c(phoneStateListener);
            C117292a.m165358d(telephonyManager, aVar.mo10232b(), "com/tencent/mm/plugin/ipcall/IPCallManager", "removeListener", "()V", "android/telephony/TelephonyManager_EXEC_", "listen", "(Landroid/telephony/PhoneStateListener;I)V");
            telephonyManager.listen((PhoneStateListener) aVar.mo10231a(0), ((Integer) aVar.mo10231a(1)).intValue());
            C117292a.m165359e(telephonyManager, "com/tencent/mm/plugin/ipcall/IPCallManager", "removeListener", "()V", "android/telephony/TelephonyManager_EXEC_", "listen", "(Landroid/telephony/PhoneStateListener;I)V");
            this.f313222g = null;
        }
        this.f313227o.dead();
        this.f313226n.dead();
    }

    /* renamed from: m */
    public boolean mo150070m(String str, String str2, String str3, String str4, String str5, int i, int i2, int i3) {
        boolean z;
        boolean z2;
        String str6 = str3;
        String str7 = str4;
        String str8 = str5;
        int i4 = i;
        if (C105385g.Fx0().mo150086d()) {
            Log.m105924i("MicroMsg.IPCallManager", "startIPCall, already start!");
            return false;
        }
        Log.m105924i("MicroMsg.IPCallManager", "startIPCall");
        C105385g.Gx0().f313251i = this;
        C105385g.zx0().f327645f = this;
        C105385g.Fx0().f313245a = -1;
        mo150069l();
        TelephonyManager telephonyManager = (TelephonyManager) MMApplicationContext.getContext().getSystemService("phone");
        this.f313222g = telephonyManager;
        PhoneStateListener phoneStateListener = this.f313225j;
        C9556a aVar = new C9556a();
        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
        aVar.mo10233c(32);
        aVar.mo10233c(phoneStateListener);
        C9556a aVar2 = aVar;
        C117292a.m165358d(telephonyManager, aVar.mo10232b(), "com/tencent/mm/plugin/ipcall/IPCallManager", "addListener", "()V", "android/telephony/TelephonyManager_EXEC_", "listen", "(Landroid/telephony/PhoneStateListener;I)V");
        telephonyManager.listen((PhoneStateListener) aVar2.mo10231a(0), ((Integer) aVar2.mo10231a(1)).intValue());
        C117292a.m165359e(telephonyManager, "com/tencent/mm/plugin/ipcall/IPCallManager", "addListener", "()V", "android/telephony/TelephonyManager_EXEC_", "listen", "(Landroid/telephony/PhoneStateListener;I)V");
        this.f313227o.alive();
        this.f313226n.alive();
        Log.m105919d("MicroMsg.IPCallRecordStorageLogic", "recordStartCall, phoneNumber: %s, contactId: %s", str7, str8);
        C13614k kVar = new C13614k();
        kVar.field_phonenumber = str7;
        if (!Util.isNullOrNil(str5)) {
            C13612c qq = C105385g.vx0().mo13010qq(str8);
            if (qq != null) {
                long j = qq.systemRowid;
                if (j != -1) {
                    kVar.field_addressId = j;
                }
            }
            kVar.field_addressId = -1;
        } else {
            kVar.field_addressId = -1;
        }
        if (i4 != -1) {
            kVar.field_phoneType = i4;
        } else {
            kVar.field_phoneType = -1;
        }
        kVar.field_calltime = Util.nowMilliSecond();
        kVar.field_status = 1;
        if (!C105385g.Cx0().insert(kVar)) {
            kVar = null;
        }
        this.f313220e = kVar;
        f313218v.postDelayed(this.f313229q, 1754);
        this.f313221f = false;
        C109470c Dx0 = C105385g.Dx0();
        Dx0.getClass();
        Log.m105918d("MicroMsg.IPCallReportHelper", "reset");
        Dx0.f327653a = 0;
        Dx0.f327654b = 0;
        Dx0.f327655c = 0;
        Dx0.f327656d = 0;
        Dx0.f327657e = 0;
        Dx0.f327658f = 0;
        Dx0.f327659g = 0;
        Dx0.f327660h = 0;
        Dx0.f327661i = 0;
        Dx0.f327662j = 0;
        Dx0.f327664l = 0;
        Dx0.f327665m = 0;
        Dx0.f327666n = 0;
        Dx0.f327667o = "";
        Dx0.f327668p = 0;
        Dx0.f327669q = "";
        Dx0.f327671s = 0;
        Dx0.f327670r = 0;
        Dx0.f327672t = 0;
        Dx0.f327673u = 0;
        Dx0.f327674v = 0;
        Dx0.f327646A = 0;
        Dx0.f327678z = 0;
        Dx0.f327675w = "";
        Dx0.f327676x = "";
        Dx0.f327647B = "";
        Dx0.f327648C = 0;
        Dx0.f327649D = 0;
        Dx0.f327650E = 0;
        Dx0.f327651F = 0;
        Dx0.f327652G = 0;
        C105385g.Fx0().f313245a = -1;
        Log.m105919d("MicroMsg.IPCallManager", "startIPCall, username: %s, phoneNumber: %s", str6, str7);
        C105382f Gx0 = C105385g.Gx0();
        Gx0.getClass();
        Log.m105919d("MicroMsg.IPCallSvrLogic", "startIPCall, toUsername: %s, toPhoneNumber: %s", str6, str7);
        Gx0.f313262w = false;
        Gx0.f313261v = false;
        Gx0.f313246d = 0;
        Gx0.f313247e = 0;
        Gx0.f313248f = 0;
        Gx0.f313249g = false;
        Gx0.f313250h = false;
        Gx0.f313263x = false;
        C108828c cVar = new C108828c();
        Gx0.f313260u = cVar;
        cVar.f325888F = str;
        cVar.f325889G = str2;
        cVar.f325890H = str8;
        cVar.f325892J = str7;
        cVar.f325891I = str6;
        cVar.f325899d = (int) System.currentTimeMillis();
        C108828c cVar2 = Gx0.f313260u;
        cVar2.f325900e = i2;
        cVar2.f325901f = i3;
        cVar2.f325894L = i4;
        Gx0.f313252j.mo85903j(cVar2);
        Gx0.f313257r.mo85903j(Gx0.f313260u);
        Log.m105925i("MicroMsg.IPCallSvrLogic", "startIPCallInternal, inviteId: %d", Integer.valueOf(Gx0.f313260u.f325899d));
        C105385g.Fx0().mo150087f(1);
        C109468b zx02 = C105385g.zx0();
        if (zx02.f327644e) {
            Log.m105918d("MicroMsg.IPCallEngineManager", "already start engine");
        } else {
            zx02.f327643d = false;
            zx02.f327642c = false;
            zx02.f327644e = false;
            Log.m105924i("MicroMsg.IPCallEngineManager", "start engine");
            v2protocal v2protocal = zx02.f327640a;
            if (v2protocal.f317580K1) {
                v2protocal.mo152850x(false);
                zx02.f327640a.mo152851y();
            }
            zx02.f327640a.f317653m = 1;
            long currentTimeMillis = System.currentTimeMillis();
            v2protocal v2protocal2 = zx02.f327640a;
            v2protocal2.getClass();
            int e = C112597j.m153940e(MMApplicationContext.getContext());
            v2protocal2.f317629e = e;
            int i5 = 4;
            if (e == 5 || e == 6 || e == 7) {
                v2protocal2.f317629e = 4;
            }
            v2protocal2.f317610W0 = new int[(v2protocal2.f317623c * v2protocal2.f317626d)];
            v2protocal2.f317632f = C86709a0.m107523b().mo121110g();
            int a = C107842p.m146108a();
            int i6 = Build.VERSION.SDK_INT;
            int e2 = OpenGlRender.m143736e();
            Display defaultDisplay = ((WindowManager) MMApplicationContext.getContext().getSystemService("window")).getDefaultDisplay();
            int width = defaultDisplay.getWidth();
            int height = defaultDisplay.getHeight();
            if (e2 != 1) {
                i5 = 1;
            }
            int i7 = v2protocal2.f317629e;
            int i8 = (v2protocal2.f317623c << 16) | v2protocal2.f317626d;
            int i9 = v2protocal2.f317632f;
            int i15 = (i6 << 16) | (e2 << 24) | a;
            int i16 = i7;
            int i17 = i9;
            int i18 = i8;
            int i19 = i5;
            int init = v2protocal2.init(i16, 65538, i18, (width << 16) | height, i17, i15, C112760b.m154216X() + "lib/", 4, 0, 0, 0, 0, i19);
            C112597j.m153936a("MicroMsg.Voip", "protocalInitForPstn protocal init ret :" + init + ",uin= " + v2protocal2.f317632f + ", groupRsCap = " + 0 + ", x_vcodec2_paras = " + 0 + ", static_cab = " + 0 + ", outfmt = " + i19);
            v2protocal2.f317580K1 = true;
            if (init < 0) {
                v2protocal2.mo152851y();
            }
            Log.m105919d("MicroMsg.IPCallEngineManager", "protocal init finish, ret: %d, used %dms", Integer.valueOf(init), Long.valueOf(System.currentTimeMillis() - currentTimeMillis));
            v2protocal v2protocal3 = zx02.f327640a;
            byte[] bArr = v2protocal3.field_capInfo;
            if (bArr != null && v2protocal3.exchangeCabInfo(bArr, bArr.length) < 0) {
                Log.m105920e("MicroMsg.IPCallEngineManager", "exchangeCabInfo failed");
                C105385g.Dx0().f327662j = 24;
            }
            if (init < 0) {
                Log.m105920e("MicroMsg.IPCallEngineManager", "engine init failed!");
            }
            zx02.f327640a.f317653m = 1;
            zx02.f327644e = true;
        }
        f313218v.removeCallbacks(this.f313228p);
        f313218v.postDelayed(this.f313228p, 60000);
        Log.printInfoStack("MicroMsg.IPCallManager", "bindIPCallForegroundIfNeed", new Object[0]);
        if (!C11171e.m11046c(26) || this.f313223h) {
            return true;
        }
        Intent intent = new Intent();
        intent.setClass(MMApplicationContext.getContext(), IPCallForegroundService.class);
        try {
            MMApplicationContext.getContext().startService(intent);
            z2 = true;
            z = true;
        } catch (Exception e3) {
            Log.printErrStackTrace("MicroMsg.IPCallManager", e3, "using start service to bindIPCallForegroundIfNeed error: %s", e3.getMessage());
            try {
                MMApplicationContext.getContext().startForegroundService(intent);
                z2 = true;
            } catch (Exception e4) {
                z2 = true;
                Log.printErrStackTrace("MicroMsg.IPCallManager", e4, "using start foreground service to bindIPCallForegroundIfNeed error: %s", e4.getMessage());
            }
            z = false;
        }
        if (!z) {
            return z2;
        }
        this.f313223h = z2;
        return z2;
    }

    /* renamed from: n */
    public final void mo150071n() {
        Log.m105924i("MicroMsg.IPCallManager", "startTimeCount");
        MTimerHandler mTimerHandler = this.f313233u;
        if (mTimerHandler != null) {
            mTimerHandler.stopTimer();
            return;
        }
        if (mTimerHandler == null) {
            this.f313233u = new MTimerHandler(Looper.getMainLooper(), (MTimerHandler.CallBack) new C105377e(), true);
        }
        this.f313233u.startTimer(1000);
    }

    /* renamed from: r */
    public void mo150072r() {
    }

    /* renamed from: w */
    public void mo150073w() {
    }
}

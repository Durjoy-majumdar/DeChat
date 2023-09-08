package com.tencent.p014mm.p136ui.conversation;

import android.app.Activity;
import android.app.ProgressDialog;
import android.os.PowerManager;
import com.tencent.p014mm.app.C40008f;
import com.tencent.p014mm.autogen.events.DoingInitContactEvent;
import com.tencent.p014mm.autogen.events.QueryDoingInitEvent;
import com.tencent.p014mm.autogen.events.TriggerInitEvent;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.sdk.event.IEvent;
import com.tencent.p014mm.sdk.event.IListener;
import com.tencent.p014mm.sdk.platformtools.FLock;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandlerThread;
import eb0.C97625j3;
import j20.C117292a;
import java.lang.ref.WeakReference;
import jr2.C99019x;
import ob0.C11385n;
import ob0.C117747y;
import ob0.C47355o;
import os2.C100399d0;
import p206nj.C76861g;
import pc0.C47457o;
import qo3.C77398g;

/* renamed from: com.tencent.mm.ui.conversation.InitHelper */
public class InitHelper implements C47355o, C11385n {

    /* renamed from: w */
    public static boolean f219438w;

    /* renamed from: d */
    public C77398g f219439d = null;

    /* renamed from: e */
    public C77398g f219440e = null;

    /* renamed from: f */
    public boolean f219441f = false;

    /* renamed from: g */
    public C76861g.C47263a f219442g = new C76861g.C47263a();

    /* renamed from: h */
    public PowerManager.WakeLock f219443h = null;

    /* renamed from: i */
    public boolean f219444i = false;

    /* renamed from: j */
    public C47457o f219445j = null;

    /* renamed from: n */
    public ProgressDialog f219446n = null;

    /* renamed from: o */
    public Activity f219447o;

    /* renamed from: p */
    public WeakReference<Activity> f219448p;

    /* renamed from: q */
    public BannerHelper f219449q;

    /* renamed from: r */
    public FolderHelper f219450r;

    /* renamed from: s */
    public InitHelper$$h f219451s;

    /* renamed from: t */
    public IListener f219452t;

    /* renamed from: u */
    public IListener f219453u;

    /* renamed from: v */
    public FLock f219454v;

    public InitHelper() {
        C40008f fVar = C40008f.f107254d;
        this.f219452t = new IListener<QueryDoingInitEvent>(fVar) {
            {
                this.__eventId = 1192037483;
            }

            public boolean callback(IEvent iEvent) {
                ((QueryDoingInitEvent) iEvent).f193857d.f193858a = InitHelper.this.f219445j != null;
                return false;
            }
        };
        this.f219453u = new IListener<TriggerInitEvent>(fVar) {
            {
                this.__eventId = -1308291390;
            }

            public boolean callback(IEvent iEvent) {
                TriggerInitEvent triggerInitEvent = (TriggerInitEvent) iEvent;
                InitHelper initHelper = InitHelper.this;
                if (initHelper.f219447o == null) {
                    Log.m105924i("MicroMsg.InitHelper", "inithelper hasn't initialized");
                } else {
                    initHelper.f219441f = false;
                    initHelper.mo103805b();
                }
                return false;
            }
        };
    }

    /* JADX WARNING: Removed duplicated region for block: B:20:0x00ac  */
    /* JADX WARNING: Removed duplicated region for block: B:28:? A[ORIG_RETURN, RETURN, SYNTHETIC] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo103804a(int r20, int r21, int r22) {
        /*
            r19 = this;
            r0 = r19
            r1 = r20
            r2 = r21
            boolean r3 = f40.C86709a0.m107522a()
            java.lang.String r4 = "MicroMsg.InitHelper"
            r5 = 0
            if (r3 != 0) goto L_0x0015
            java.lang.String r1 = "account not ready"
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r4, r1)
            return r5
        L_0x0015:
            eb0.c r3 = eb0.C97625j3.m125812b()
            com.tencent.mm.storage.v1 r3 = r3.mo105906u()
            com.tencent.mm.storage.y1$a r6 = com.tencent.p014mm.storage.C72994y1.C72995a.USERINFO_UPDATE_UPDATE_FLAG_LONG
            r7 = 0
            java.lang.Object r3 = r3.mo119685f(r6, r7)
            java.lang.Long r3 = (java.lang.Long) r3
            r8 = 0
            long r10 = com.tencent.p014mm.sdk.platformtools.Util.nullAs((java.lang.Long) r3, (long) r8)
            eb0.c r3 = eb0.C97625j3.m125812b()
            com.tencent.mm.storage.v1 r3 = r3.mo105906u()
            com.tencent.mm.storage.y1$a r12 = com.tencent.p014mm.storage.C72994y1.C72995a.USERINFO_UPDATE_UPDATE_TIME_LONG
            java.lang.Object r3 = r3.mo119685f(r12, r7)
            java.lang.Long r3 = (java.lang.Long) r3
            long r12 = com.tencent.p014mm.sdk.platformtools.Util.nullAs((java.lang.Long) r3, (long) r8)
            eb0.c r3 = eb0.C97625j3.m125812b()
            com.tencent.mm.storage.v1 r3 = r3.mo105906u()
            com.tencent.mm.storage.y1$a r14 = com.tencent.p014mm.storage.C72994y1.C72995a.USERINFO_UPDATE_UPDATE_VERION_LONG
            java.lang.Object r3 = r3.mo119685f(r14, r7)
            java.lang.Long r3 = (java.lang.Long) r3
            long r15 = com.tencent.p014mm.sdk.platformtools.Util.nullAs((java.lang.Long) r3, (long) r8)
            eb0.c r3 = eb0.C97625j3.m125812b()
            com.tencent.mm.storage.v1 r3 = r3.mo105906u()
            java.lang.Long r5 = java.lang.Long.valueOf(r8)
            r3.mo119677K(r6, r5)
            eb0.c r3 = eb0.C97625j3.m125812b()
            com.tencent.mm.storage.v1 r3 = r3.mo105906u()
            java.lang.Long r5 = java.lang.Long.valueOf(r8)
            r3.mo119677K(r14, r5)
            int r3 = qe3.C89625d.f257841g
            long r5 = (long) r3
            r3 = -17
            r8 = 1
            r14 = 4
            r17 = 1
            int r18 = (r15 > r5 ? 1 : (r15 == r5 ? 0 : -1))
            if (r18 != 0) goto L_0x00a8
            long r5 = com.tencent.p014mm.sdk.platformtools.Util.secondsToNow(r12)
            r12 = 3600(0xe10, double:1.7786E-320)
            int r15 = (r5 > r12 ? 1 : (r5 == r12 ? 0 : -1))
            if (r15 >= 0) goto L_0x00a8
            int r5 = (r10 > r8 ? 1 : (r10 == r8 ? 0 : -1))
            if (r5 != 0) goto L_0x0097
            android.app.Activity r5 = r0.f219447o
            boolean r5 = com.tencent.p014mm.p136ui.C74785j2.m89539b(r5, r14, r3, r7)
            if (r5 == 0) goto L_0x00a8
            return r17
        L_0x0097:
            r5 = 2
            int r12 = (r10 > r5 ? 1 : (r10 == r5 ? 0 : -1))
            if (r12 != 0) goto L_0x00a8
            android.app.Activity r5 = r0.f219447o
            r6 = -16
            boolean r5 = com.tencent.p014mm.p136ui.C74785j2.m89539b(r5, r14, r6, r7)
            if (r5 == 0) goto L_0x00aa
            return r17
        L_0x00a8:
            r6 = -16
        L_0x00aa:
            if (r1 != r14) goto L_0x00f4
            if (r2 == r6) goto L_0x00b0
            if (r2 != r3) goto L_0x00f4
        L_0x00b0:
            r3 = 2
            java.lang.Object[] r3 = new java.lang.Object[r3]
            java.lang.Integer r5 = java.lang.Integer.valueOf(r21)
            r6 = 0
            r3[r6] = r5
            java.lang.Integer r5 = java.lang.Integer.valueOf(r22)
            r3[r17] = r5
            java.lang.String r5 = "trigger check update: errCode:%d, sceneType:%d"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r4, r5, r3)
            boolean r3 = sf0.C90188n0.f258940h
            if (r3 == 0) goto L_0x00eb
            android.content.Context r3 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            java.lang.String r4 = "system_config_prefs"
            android.content.SharedPreferences r3 = r3.getSharedPreferences(r4, r6)
            android.content.SharedPreferences$Editor r3 = r3.edit()
            long r4 = com.tencent.p014mm.sdk.platformtools.Util.nowSecond()
            r10 = 86400(0x15180, double:4.26873E-319)
            long r4 = r4 - r10
            long r4 = r4 - r8
            java.lang.String r6 = "recomended_update_ignore"
            android.content.SharedPreferences$Editor r3 = r3.putLong(r6, r4)
            r3.commit()
        L_0x00eb:
            android.app.Activity r3 = r0.f219447o
            boolean r1 = com.tencent.p014mm.p136ui.C74785j2.m89539b(r3, r1, r2, r7)
            if (r1 == 0) goto L_0x00f4
            return r17
        L_0x00f4:
            r1 = 0
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.p136ui.conversation.InitHelper.mo103804a(int, int, int):boolean");
    }

    /* renamed from: b */
    public final void mo103805b() {
        if (this.f219441f) {
            Log.m105924i("MicroMsg.InitHelper", "summerinit doPreCreate but hasTryDoInitButFailed true ret");
            return;
        }
        if (!this.f219443h.isHeld()) {
            Log.m105928w("MicroMsg.InitHelper", "tryDoInit wakelock.acquire!");
            PowerManager.WakeLock wakeLock = this.f219443h;
            PowerManager.WakeLock wakeLock2 = wakeLock;
            C117292a.m165357c(wakeLock2, "com/tencent/mm/ui/conversation/InitHelper", "doInit", "()V", "android/os/PowerManager$WakeLock_EXEC_", "acquire", "()V");
            wakeLock.acquire();
            C117292a.m165359e(wakeLock2, "com/tencent/mm/ui/conversation/InitHelper", "doInit", "()V", "android/os/PowerManager$WakeLock_EXEC_", "acquire", "()V");
        }
        C74720p pVar = ((MainUI) this.f219451s).f219483v;
        if (pVar != null) {
            pVar.f219704S0 = true;
        }
        DoingInitContactEvent doingInitContactEvent = new DoingInitContactEvent();
        doingInitContactEvent.f9047d.f9048a = 1;
        doingInitContactEvent.publish();
        if (this.f219445j == null) {
            if (C99019x.m128971c() != null) {
                C100399d0 d0Var = (C100399d0) C99019x.m128971c();
                d0Var.getClass();
                SnsMethodCalculate.markStartTimeMs("attachCache", "com.tencent.mm.plugin.sns.storage.SnsExtStorage");
                Log.m105918d("MicroMsg.SnsExtStorage", "attachCache");
                d0Var.f294084d = true;
                SnsMethodCalculate.markEndTimeMs("attachCache", "com.tencent.mm.plugin.sns.storage.SnsExtStorage");
            }
            this.f219445j = new C47457o(this);
            Log.m105919d("MicroMsg.InitHelper", "dkinit doPreCreate t:%d initScene:%d", Long.valueOf(this.f219442g.mo72288a()), Integer.valueOf(this.f219445j.hashCode()));
            this.f219442g.mo72289b();
            C97625j3.m125815e().mo123460f(this.f219445j);
        }
        MMHandlerThread.postToMainThread(new InitHelper$$d(this));
    }

    /* renamed from: c */
    public void mo103806c() {
        PowerManager.WakeLock wakeLock = this.f219443h;
        if (wakeLock != null && wakeLock.isHeld()) {
            Log.m105928w("MicroMsg.InitHelper", "onTabPause wakelock.release!");
            PowerManager.WakeLock wakeLock2 = this.f219443h;
            PowerManager.WakeLock wakeLock3 = wakeLock2;
            C117292a.m165357c(wakeLock3, "com/tencent/mm/ui/conversation/InitHelper", "onTabPause", "()V", "android/os/PowerManager$WakeLock_EXEC_", "release", "()V");
            wakeLock2.release();
            C117292a.m165359e(wakeLock3, "com/tencent/mm/ui/conversation/InitHelper", "onTabPause", "()V", "android/os/PowerManager$WakeLock_EXEC_", "release", "()V");
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:24:0x00a3  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x00fd  */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo103807d() {
        /*
            r8 = this;
            boolean r0 = pc0.C100769w.m131943b()
            r1 = 0
            if (r0 != 0) goto L_0x0008
            return r1
        L_0x0008:
            qo3.g r0 = r8.f219440e
            if (r0 == 0) goto L_0x0013
            boolean r0 = r0.isShowing()
            if (r0 == 0) goto L_0x0013
            return r1
        L_0x0013:
            f40.C86709a0.m107528h()
            f40.o r0 = f40.C86709a0.m107535s()
            r0.getClass()
            f40.C86709a0.m107528h()
            f40.e r2 = f40.C86709a0.m107523b()
            r2.mo121108c()
            com.tencent.mm.storage.v1 r2 = r0.f251812j
            r3 = 89
            r4 = 0
            java.lang.Object r2 = r2.mo119684e(r3, r4)
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = com.tencent.p014mm.sdk.platformtools.Util.nullAsNil((java.lang.Integer) r2)
            java.lang.String r5 = "MMKernel.CoreStorage"
            r6 = 1
            if (r2 == 0) goto L_0x0051
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r3 = "isDBCorrupted: false, recoveryState: "
            r0.append(r3)
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r5, r0)
        L_0x004f:
            r0 = 0
            goto L_0x00a1
        L_0x0051:
            pc0.d0$a r2 = pc0.C118000d0.f352701a
            byte[] r2 = r2.mo182756a()
            int r2 = r2.length
            if (r2 <= 0) goto L_0x006d
            com.tencent.mm.storage.v1 r2 = r0.f251812j
            r7 = 15
            java.lang.Object r2 = r2.mo119684e(r7, r4)
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = com.tencent.p014mm.sdk.platformtools.Util.nullAsNil((java.lang.Integer) r2)
            if (r2 != 0) goto L_0x006b
            goto L_0x006d
        L_0x006b:
            r2 = 0
            goto L_0x006e
        L_0x006d:
            r2 = 1
        L_0x006e:
            if (r2 == 0) goto L_0x007e
            java.lang.String r4 = r0.mo121148o()
            if (r4 != 0) goto L_0x0077
            goto L_0x007e
        L_0x0077:
            java.lang.String r0 = "isDBCorrupted: true"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r5, r0)
            r0 = 1
            goto L_0x00a1
        L_0x007e:
            com.tencent.mm.storage.v1 r4 = r0.f251812j
            java.lang.Integer r7 = java.lang.Integer.valueOf(r6)
            r4.mo119676J(r3, r7)
            com.tencent.mm.storage.v1 r0 = r0.f251812j
            r0.mo119681a(r1)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r3 = "isDBCorrupted: false, needInit: "
            r0.append(r3)
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r5, r0)
            goto L_0x004f
        L_0x00a1:
            if (r0 == 0) goto L_0x00fd
            android.app.Activity r0 = r8.f219447o
            qo3.a r2 = new qo3.a
            r2.<init>()
            r3 = 2131824566(0x7f110fb6, float:1.9281964E38)
            android.content.res.Resources r4 = al3.C0086a.m38a(r0)
            java.lang.String r3 = r4.getString(r3)
            r2.f225644a = r3
            android.app.Activity r3 = r8.f219447o
            r4 = 2131824565(0x7f110fb5, float:1.9281961E38)
            java.lang.String r3 = r3.getString(r4)
            r2.f225660q = r3
            r2.f225668y = r1
            r1 = 2131824567(0x7f110fb7, float:1.9281966E38)
            android.content.res.Resources r3 = al3.C0086a.m38a(r0)
            java.lang.String r1 = r3.getString(r1)
            r2.f225663t = r1
            com.tencent.mm.ui.conversation.InitHelper$$c r1 = new com.tencent.mm.ui.conversation.InitHelper$$c
            r1.<init>(r8)
            r2.f225620C = r1
            r1 = 2131824564(0x7f110fb4, float:1.928196E38)
            android.content.res.Resources r3 = al3.C0086a.m38a(r0)
            java.lang.String r1 = r3.getString(r1)
            r2.f225664u = r1
            com.tencent.mm.ui.conversation.InitHelper$$b r1 = new com.tencent.mm.ui.conversation.InitHelper$$b
            r1.<init>(r8)
            r2.f225621D = r1
            qo3.g r1 = new qo3.g
            r3 = 2131887328(0x7f1204e0, float:1.940926E38)
            r1.<init>(r0, r3)
            r1.mo107525e(r2)
            r8.f219440e = r1
            r1.show()
            goto L_0x0100
        L_0x00fd:
            r8.mo103805b()
        L_0x0100:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.p136ui.conversation.InitHelper.mo103807d():boolean");
    }

    /* renamed from: m */
    public void mo26221m(int i, int i2, C117747y yVar) {
        if (yVar != null && yVar.getType() == 139) {
            MMHandlerThread.postToMainThread(new InitHelper$$e(this, (int) (i2 != 0 ? (((long) i) * 100) / ((long) i2) : 0)));
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:46:0x01f8  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onSceneEnd(int r27, int r28, java.lang.String r29, ob0.C117747y r30) {
        /*
            r26 = this;
            r0 = r26
            r1 = r27
            r2 = r28
            r3 = r29
            int r4 = r30.getType()
            r5 = 138(0x8a, float:1.93E-43)
            r6 = 139(0x8b, float:1.95E-43)
            java.lang.String r7 = "MicroMsg.InitHelper"
            if (r4 == r5) goto L_0x0036
            int r4 = r30.getType()
            if (r4 == r6) goto L_0x0036
            int r3 = r30.getType()
            r4 = 113(0x71, float:1.58E-43)
            if (r3 == r4) goto L_0x0030
            int r3 = r30.getType()
            if (r3 == 0) goto L_0x0030
            int r3 = r30.getType()
            r0.mo103804a(r1, r2, r3)
            goto L_0x0035
        L_0x0030:
            java.lang.String r1 = "onSceneEnd from GetUpdateInfo, ignore it."
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r7, r1)
        L_0x0035:
            return
        L_0x0036:
            r4 = 6
            java.lang.Object[] r4 = new java.lang.Object[r4]
            java.lang.Integer r8 = java.lang.Integer.valueOf(r27)
            r9 = 0
            r4[r9] = r8
            java.lang.Integer r8 = java.lang.Integer.valueOf(r28)
            r10 = 1
            r4[r10] = r8
            r8 = 2
            r4[r8] = r3
            int r11 = r30.getType()
            java.lang.Integer r11 = java.lang.Integer.valueOf(r11)
            r12 = 3
            r4[r12] = r11
            int r11 = r26.hashCode()
            java.lang.Integer r11 = java.lang.Integer.valueOf(r11)
            r13 = 4
            r4[r13] = r11
            pc0.o r11 = r0.f219445j
            if (r11 != 0) goto L_0x0066
            r11 = -2
            goto L_0x006a
        L_0x0066:
            int r11 = r11.hashCode()
        L_0x006a:
            java.lang.Integer r11 = java.lang.Integer.valueOf(r11)
            r14 = 5
            r4[r14] = r11
            java.lang.String r11 = "dkinit onSceneEnd:[%d,%d,%s] type:%d hash:%d init:%d "
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r7, r11, r4)
            pc0.o r4 = r0.f219445j
            r11 = 0
            if (r4 == 0) goto L_0x0275
            int r4 = r30.getType()
            if (r4 != r6) goto L_0x0275
            r0.f219445j = r11
            java.lang.Object[] r4 = new java.lang.Object[r10]
            nj.g$a r15 = r0.f219442g
            long r15 = r15.mo72288a()
            java.lang.Long r15 = java.lang.Long.valueOf(r15)
            r4[r9] = r15
            java.lang.String r15 = "summerinit dkinit Kevin init FINISH : %d "
            com.tencent.p014mm.sdk.platformtools.Log.m105929w(r7, r15, r4)
            eb0.w2 r4 = eb0.C31519v2.m39436a()
            r4.mo55985a()
            jr2.n r4 = jr2.C99019x.m128971c()
            if (r4 == 0) goto L_0x00ad
            jr2.n r4 = jr2.C99019x.m128971c()
            os2.d0 r4 = (os2.C100399d0) r4
            r4.mo139791qq()
        L_0x00ad:
            com.tencent.mm.ui.conversation.InitHelper$$h r4 = r0.f219451s
            com.tencent.mm.ui.conversation.MainUI r4 = (com.tencent.p014mm.p136ui.conversation.MainUI) r4
            com.tencent.mm.ui.conversation.p r4 = r4.f219483v
            if (r4 == 0) goto L_0x00c5
            r4.f219704S0 = r9
            r4.mo104618q(r11, r10)
            com.tencent.mm.ui.LauncherUI r4 = com.tencent.p014mm.p136ui.LauncherUI.getInstance()
            com.tencent.mm.ui.MainTabUI r4 = r4.mo101375O7()
            r4.mo101427k()
        L_0x00c5:
            com.tencent.mm.autogen.events.DoingInitContactEvent r4 = new com.tencent.mm.autogen.events.DoingInitContactEvent
            r4.<init>()
            com.tencent.mm.autogen.events.DoingInitContactEvent$a r15 = r4.f9047d
            r15.f9048a = r8
            r4.publish()
            android.os.PowerManager$WakeLock r4 = r0.f219443h
            boolean r4 = r4.isHeld()
            if (r4 == 0) goto L_0x0102
            java.lang.String r4 = "onSceneEnd wakelock.release!"
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r7, r4)
            android.os.PowerManager$WakeLock r4 = r0.f219443h
            java.lang.String r16 = "com/tencent/mm/ui/conversation/InitHelper"
            java.lang.String r17 = "onSceneEnd"
            java.lang.String r18 = "(IILjava/lang/String;Lcom/tencent/mm/modelbase/NetSceneBase;)V"
            java.lang.String r19 = "android/os/PowerManager$WakeLock_EXEC_"
            java.lang.String r20 = "release"
            java.lang.String r21 = "()V"
            r15 = r4
            j20.C117292a.m165357c(r15, r16, r17, r18, r19, r20, r21)
            r4.release()
            java.lang.String r16 = "com/tencent/mm/ui/conversation/InitHelper"
            java.lang.String r17 = "onSceneEnd"
            java.lang.String r18 = "(IILjava/lang/String;Lcom/tencent/mm/modelbase/NetSceneBase;)V"
            java.lang.String r19 = "android/os/PowerManager$WakeLock_EXEC_"
            java.lang.String r20 = "release"
            java.lang.String r21 = "()V"
            j20.C117292a.m165359e(r15, r16, r17, r18, r19, r20, r21)
        L_0x0102:
            com.tencent.mm.sdk.platformtools.MMHandlerThread r4 = f40.C86709a0.m107525e()
            r4.setLowPriority()
            android.app.ProgressDialog r4 = r0.f219446n
            if (r4 == 0) goto L_0x0112
            r4.dismiss()
            r0.f219446n = r11
        L_0x0112:
            java.lang.ref.WeakReference<android.app.Activity> r4 = r0.f219448p
            java.lang.Object r4 = r4.get()
            android.app.Activity r4 = (android.app.Activity) r4
            boolean r8 = f40.C86709a0.m107522a()
            java.lang.String r15 = "_fontScaleTip"
            if (r8 == 0) goto L_0x01f5
            f40.e r8 = f40.C86709a0.m107523b()
            boolean r8 = r8.f251765p
            if (r8 == 0) goto L_0x01f5
            if (r4 == 0) goto L_0x01f5
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            java.lang.String r5 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getDefaultPreferencePath()
            r8.append(r5)
            r8.append(r15)
            java.lang.String r5 = r8.toString()
            com.tencent.mm.sdk.platformtools.MultiProcessMMKV r5 = com.tencent.p014mm.sdk.platformtools.MultiProcessMMKV.getMMKV(r5)
            java.lang.String r8 = "font_scale_tip_login"
            boolean r5 = r5.getBoolean(r8, r9)
            if (r5 != 0) goto L_0x01f5
            android.app.Activity r5 = r0.f219447o
            float r5 = kg3.C76577a.m92165p(r5)
            r17 = 1065353216(0x3f800000, float:1.0)
            int r5 = (r17 > r5 ? 1 : (r17 == r5 ? 0 : -1))
            if (r5 != 0) goto L_0x01d9
            android.app.Activity r5 = r0.f219447o
            android.content.res.Resources r5 = r5.getResources()
            android.content.res.Configuration r5 = r5.getConfiguration()
            float r5 = r5.fontScale
            int r5 = (r17 > r5 ? 1 : (r17 == r5 ? 0 : -1))
            if (r5 == 0) goto L_0x01f5
            com.tencent.mm.plugin.report.service.n r5 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            r12 = 15181(0x3b4d, float:2.1273E-41)
            java.lang.Object[] r6 = new java.lang.Object[r10]
            java.lang.Integer r19 = java.lang.Integer.valueOf(r10)
            r6[r9] = r19
            r5.mo160131h(r12, r6)
            qo3.q r5 = new qo3.q
            r5.<init>(r4)
            android.content.res.Resources r6 = r4.getResources()
            r12 = 2131830407(0x7f112687, float:1.929381E38)
            java.lang.String r6 = r6.getString(r12)
            r5.mo107606r(r6)
            android.content.res.Resources r6 = r4.getResources()
            r12 = 2131830404(0x7f112684, float:1.9293804E38)
            java.lang.String r6 = r6.getString(r12)
            r5.mo107595g(r6)
            android.content.res.Resources r6 = r4.getResources()
            r12 = 2131830406(0x7f112686, float:1.9293808E38)
            java.lang.String r6 = r6.getString(r12)
            r5.mo107602n(r6)
            android.content.res.Resources r6 = r4.getResources()
            r12 = 2131830405(0x7f112685, float:1.9293806E38)
            java.lang.String r6 = r6.getString(r12)
            r5.mo107598j(r6)
            com.tencent.mm.ui.conversation.InitHelper$$f r6 = new com.tencent.mm.ui.conversation.InitHelper$$f
            r6.<init>(r0, r4)
            r5.mo107590b(r6)
            r5.mo107603o()
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getDefaultPreferencePath()
            r4.append(r5)
            r4.append(r15)
            java.lang.String r4 = r4.toString()
            com.tencent.mm.sdk.platformtools.MultiProcessMMKV r4 = com.tencent.p014mm.sdk.platformtools.MultiProcessMMKV.getMMKV(r4)
            r4.putBoolean(r8, r10)
            goto L_0x01f3
        L_0x01d9:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getDefaultPreferencePath()
            r4.append(r5)
            r4.append(r15)
            java.lang.String r4 = r4.toString()
            com.tencent.mm.sdk.platformtools.MultiProcessMMKV r4 = com.tencent.p014mm.sdk.platformtools.MultiProcessMMKV.getMMKV(r4)
            r4.putBoolean(r8, r10)
        L_0x01f3:
            r4 = 1
            goto L_0x01f6
        L_0x01f5:
            r4 = 0
        L_0x01f6:
            if (r4 != 0) goto L_0x021e
            android.app.Activity r4 = r0.f219447o
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r6 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getDefaultPreferencePath()
            r5.append(r6)
            r5.append(r15)
            java.lang.String r5 = r5.toString()
            android.content.SharedPreferences r4 = r4.getSharedPreferences(r5, r9)
            android.content.SharedPreferences$Editor r4 = r4.edit()
            java.lang.String r5 = "font_scale_tip"
            android.content.SharedPreferences$Editor r4 = r4.putBoolean(r5, r9)
            r4.apply()
        L_0x021e:
            if (r1 != 0) goto L_0x0275
            if (r2 != 0) goto L_0x0275
            eb0.c r4 = eb0.C97625j3.m125812b()
            com.tencent.mm.storage.u3 r4 = r4.mo105907v()
            java.lang.String r5 = eb0.C75592q0.m90789s()
            com.tencent.mm.storage.z1 r4 = r4.get(r5)
            if (r4 == 0) goto L_0x0275
            boolean r5 = r4.mo62927s3()
            if (r5 == 0) goto L_0x0258
            java.lang.String r5 = r4.mo73969n2()
            boolean r5 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r5)
            if (r5 == 0) goto L_0x0258
            java.lang.String r5 = r4.mo73970o2()
            boolean r5 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r5)
            if (r5 == 0) goto L_0x0258
            java.lang.String r5 = r4.mo73971p2()
            boolean r5 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r5)
            if (r5 != 0) goto L_0x0275
        L_0x0258:
            r4.mo62868O3()
            java.lang.String r5 = ""
            r4.mo62860K2(r5)
            r4.mo62862L2(r5)
            r4.mo62864M2(r5)
            eb0.c r5 = eb0.C97625j3.m125812b()
            com.tencent.mm.storage.u3 r5 = r5.mo105907v()
            java.lang.String r6 = eb0.C75592q0.m90789s()
            r5.mo69719p3(r6, r4)
        L_0x0275:
            android.app.Activity r4 = r0.f219447o
            android.content.Intent r5 = new android.content.Intent
            r5.<init>()
            android.app.Activity r6 = r0.f219447o
            java.lang.Class<com.tencent.mm.ui.LauncherUI> r8 = com.tencent.p014mm.p136ui.LauncherUI.class
            android.content.Intent r5 = r5.setClass(r6, r8)
            java.lang.String r6 = "Intro_Switch"
            android.content.Intent r5 = r5.putExtra(r6, r10)
            java.lang.String r6 = "animation_pop_in"
            android.content.Intent r5 = r5.putExtra(r6, r10)
            r6 = 67108864(0x4000000, float:1.5046328E-36)
            android.content.Intent r5 = r5.addFlags(r6)
            boolean r4 = com.tencent.p014mm.plugin.account.p024ui.C1468a.m1500a(r4, r1, r2, r5, r3)
            if (r4 == 0) goto L_0x02a3
            java.lang.String r1 = "summerinit onSceneEnd accountExpired ret"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r7, r1)
            return
        L_0x02a3:
            boolean r4 = eb0.C97625j3.m125811a()
            if (r4 != 0) goto L_0x02b0
            java.lang.String r1 = "summerinit onSceneEnd not set uin"
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r7, r1)
            return
        L_0x02b0:
            boolean r4 = r0.f219444i
            if (r4 != 0) goto L_0x0320
            r0.f219444i = r10
            eb0.c r4 = eb0.C97625j3.m125812b()
            com.tencent.mm.storage.v1 r4 = r4.mo105906u()
            java.lang.Object r4 = r4.mo119684e(r14, r11)
            java.lang.String r4 = (java.lang.String) r4
            eb0.c r5 = eb0.C97625j3.m125812b()
            com.tencent.mm.storage.v1 r5 = r5.mo105906u()
            r6 = 57
            java.lang.Integer r8 = java.lang.Integer.valueOf(r9)
            java.lang.Object r5 = r5.mo119684e(r6, r8)
            java.lang.Integer r5 = (java.lang.Integer) r5
            int r5 = r5.intValue()
            if (r5 == 0) goto L_0x02e0
            r5 = 1
            goto L_0x02e1
        L_0x02e0:
            r5 = 0
        L_0x02e1:
            if (r5 == 0) goto L_0x0320
            if (r4 == 0) goto L_0x0320
            android.app.Activity r5 = r0.f219447o
            r6 = 2131834562(0x7f1136c2, float:1.9302238E38)
            java.lang.Object[] r8 = new java.lang.Object[r10]
            r8[r9] = r4
            java.lang.String r20 = r5.getString(r6, r8)
            android.app.Activity r4 = r0.f219447o
            r6 = 2131821704(0x7f110488, float:1.9276159E38)
            java.lang.String r21 = r4.getString(r6)
            android.app.Activity r4 = r0.f219447o
            r6 = 2131834564(0x7f1136c4, float:1.9302242E38)
            java.lang.String r22 = r4.getString(r6)
            android.app.Activity r4 = r0.f219447o
            r6 = 2131834563(0x7f1136c3, float:1.930224E38)
            java.lang.String r23 = r4.getString(r6)
            com.tencent.mm.ui.conversation.o0 r4 = new com.tencent.mm.ui.conversation.o0
            r4.<init>(r0)
            com.tencent.mm.ui.conversation.p0 r6 = new com.tencent.mm.ui.conversation.p0
            r6.<init>(r0)
            r19 = r5
            r24 = r4
            r25 = r6
            nj3.C76879j.m92707A(r19, r20, r21, r22, r23, r24, r25)
        L_0x0320:
            if (r1 != r13) goto L_0x0334
            r4 = -17
            if (r2 != r4) goto L_0x0334
            boolean r4 = f219438w
            if (r4 != 0) goto L_0x0334
            pc0.e0 r4 = pc0.C77064b0.yn0()
            r5 = 7
            r4.mo182766j(r5)
            f219438w = r10
        L_0x0334:
            int r4 = r30.getType()
            boolean r4 = r0.mo103804a(r1, r2, r4)
            if (r4 == 0) goto L_0x0345
            java.lang.String r1 = "summerinit onSceneEnd checkUpdate ret"
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r7, r1)
            return
        L_0x0345:
            int r4 = r30.getType()
            r5 = 139(0x8b, float:1.95E-43)
            if (r4 != r5) goto L_0x0373
            com.tencent.mm.autogen.events.InitEndEvent r4 = new com.tencent.mm.autogen.events.InitEndEvent
            r4.<init>()
            r5 = 3
            if (r1 != r5) goto L_0x036c
            r5 = -1
            if (r2 != r5) goto L_0x036c
            r0.f219441f = r10
            com.tencent.mm.autogen.events.InitEndEvent$a r5 = r4.f78840d
            r5.f78841a = r9
            r4.publish()
            com.tencent.mm.ui.conversation.BannerHelper r4 = r0.f219449q
            r4.mo103670h()
            com.tencent.mm.ui.conversation.FolderHelper r4 = r0.f219450r
            r4.mo103778B(r10)
            goto L_0x0373
        L_0x036c:
            com.tencent.mm.autogen.events.InitEndEvent$a r5 = r4.f78840d
            r5.f78841a = r10
            r4.publish()
        L_0x0373:
            android.app.Activity r4 = r0.f219447o
            boolean r1 = com.tencent.p014mm.p136ui.C74785j2.C6981a.m7247a(r4, r1, r2, r3, r13)
            if (r1 == 0) goto L_0x037c
            return
        L_0x037c:
            int r1 = r30.getType()
            r2 = 139(0x8b, float:1.95E-43)
            if (r1 != r2) goto L_0x03fa
            com.tencent.mm.sdk.platformtools.MMHandler r1 = new com.tencent.mm.sdk.platformtools.MMHandler
            r1.<init>()
            com.tencent.mm.ui.conversation.InitHelper$$g r2 = new com.tencent.mm.ui.conversation.InitHelper$$g
            r2.<init>(r0)
            r1.post(r2)
            int r1 = eb0.C75592q0.m90786p()
            r1 = r1 & 128(0x80, float:1.794E-43)
            if (r1 == 0) goto L_0x03fa
            eb0.c r1 = eb0.C97625j3.m125812b()
            com.tencent.mm.storage.v3 r1 = r1.mo105908w()
            com.tencent.mm.storage.i2 r1 = (com.tencent.p014mm.storage.C44660i2) r1
            java.lang.String r2 = "masssendapp"
            com.tencent.mm.storage.h2 r1 = r1.mo69771j(r2)
            if (r1 == 0) goto L_0x03ac
            goto L_0x03fa
        L_0x03ac:
            com.tencent.mm.storage.h2 r1 = new com.tencent.mm.storage.h2
            r1.<init>()
            r1.setUsername(r2)
            android.content.Context r2 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            android.content.res.Resources r2 = r2.getResources()
            r3 = 2131824196(0x7f110e44, float:1.9281213E38)
            java.lang.String r2 = r2.getString(r3)
            r1.mo108792M2(r2)
            long r2 = com.tencent.p014mm.sdk.platformtools.Util.nowMilliSecond()
            r4 = 2000(0x7d0, double:9.88E-321)
            long r2 = r2 + r4
            r1.mo108793N2(r2)
            r1.mo108803Y2(r9)
            r1.mo108812g3(r9)
            eb0.c r2 = eb0.C97625j3.m125812b()
            com.tencent.mm.storage.v3 r2 = r2.mo105908w()
            com.tencent.mm.storage.i2 r2 = (com.tencent.p014mm.storage.C44660i2) r2
            r2.mo69751W(r1)
            int r1 = eb0.C75592q0.m90786p()
            r1 = r1 & -129(0xffffffffffffff7f, float:NaN)
            eb0.c r2 = eb0.C97625j3.m125812b()
            com.tencent.mm.storage.v1 r2 = r2.mo105906u()
            r3 = 40
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r2.mo119676J(r3, r1)
        L_0x03fa:
            int r1 = r30.getType()
            r2 = 138(0x8a, float:1.93E-43)
            if (r1 == r2) goto L_0x040a
            int r1 = r30.getType()
            r2 = 139(0x8b, float:1.95E-43)
            if (r1 != r2) goto L_0x041c
        L_0x040a:
            com.tencent.mm.ui.conversation.n0 r1 = new com.tencent.mm.ui.conversation.n0
            r1.<init>(r0)
            com.tencent.p014mm.sdk.platformtools.MMHandlerThread.postToMainThread(r1)
            com.tencent.mm.ui.conversation.BannerHelper r1 = r0.f219449q
            r1.mo103670h()
            com.tencent.mm.ui.conversation.FolderHelper r1 = r0.f219450r
            r1.mo103778B(r10)
        L_0x041c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.p136ui.conversation.InitHelper.onSceneEnd(int, int, java.lang.String, ob0.y):void");
    }
}

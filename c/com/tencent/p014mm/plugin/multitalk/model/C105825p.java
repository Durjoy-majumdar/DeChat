package com.tencent.p014mm.plugin.multitalk.model;

import a14.C0000n0;
import a14.C0002w;
import a14.C53872d1;
import a14.C53884f2;
import a14.C53895h;
import a14.C53896h0;
import a14.C53930o0;
import a14.C53934p0;
import a14.C53959v2;
import a14.C53973z1;
import android.graphics.SurfaceTexture;
import android.os.HandlerThread;
import android.os.Looper;
import android.util.Size;
import b43.C104034c;
import b43.C104035d;
import c92.C104331h;
import com.tencent.p014mm.app.AppForegroundDelegate;
import com.tencent.p014mm.app.C114660c0;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandler;
import com.tencent.p014mm.sdk.platformtools.Util;
import eu3.C58834h;
import eu3.C97749e;
import f14.C58901s;
import fy3.C32224a;
import gy3.C87413o;
import java.util.HashSet;
import l33.C109247e;
import p80.C110194c;
import rx3.C13601g;
import rx3.C36568h;
import rx3.C36570n;
import w80.C111742d;
import wx3.C15601d;
import wx3.C66212f;
import z33.C112595h;

/* renamed from: com.tencent.mm.plugin.multitalk.model.p */
public final class C105825p implements C104034c {

    /* renamed from: d */
    public HandlerThread f314742d;

    /* renamed from: e */
    public MMHandler f314743e;

    /* renamed from: f */
    public C111742d.C65942b f314744f;

    /* renamed from: g */
    public C110194c f314745g;

    /* renamed from: h */
    public C105805i f314746h;

    /* renamed from: i */
    public long f314747i;

    /* renamed from: j */
    public C105811k0 f314748j;

    /* renamed from: n */
    public final C0000n0 f314749n;

    /* renamed from: o */
    public SurfaceTexture f314750o;

    /* renamed from: p */
    public C110194c f314751p;

    /* renamed from: q */
    public volatile Size f314752q = new Size(0, 0);

    /* renamed from: r */
    public volatile boolean f314753r = true;

    /* renamed from: s */
    public final C114660c0 f314754s = new C105828c(this);

    /* renamed from: t */
    public boolean f314755t = C104331h.m139314g();

    /* renamed from: u */
    public C105826a f314756u = new C105826a();

    /* renamed from: v */
    public byte[] f314757v;

    /* renamed from: w */
    public final C13601g f314758w = C36568h.m40985a(C105829d.f314764d);

    /* renamed from: com.tencent.mm.plugin.multitalk.model.p$a */
    public static final class C105826a {

        /* renamed from: a */
        public int f314759a;

        /* renamed from: b */
        public int f314760b;

        /* renamed from: c */
        public int[] f314761c;
    }

    /* renamed from: com.tencent.mm.plugin.multitalk.model.p$b */
    public static final class C105827b implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ C32224a f314762d;

        public C105827b(C32224a aVar) {
            this.f314762d = aVar;
        }

        public final /* synthetic */ void run() {
            this.f314762d.invoke();
        }
    }

    /* renamed from: com.tencent.mm.plugin.multitalk.model.p$c */
    public static final class C105828c implements C114660c0 {

        /* renamed from: d */
        public final /* synthetic */ C105825p f314763d;

        public C105828c(C105825p pVar) {
            this.f314763d = pVar;
        }

        /* renamed from: b */
        public final void mo112345b(boolean z) {
            Log.m105924i("MicroMsg.MultiTalkCameraManager", "onScreen: " + z);
            this.f314763d.f314753r = z ^ true;
        }
    }

    /* renamed from: com.tencent.mm.plugin.multitalk.model.p$d */
    public static final class C105829d extends C87413o implements C32224a<Long> {

        /* renamed from: d */
        public static final C105829d f314764d = new C105829d();

        public C105829d() {
            super(0);
        }

        public Object invoke() {
            return Long.valueOf((long) C112595h.m153917a());
        }
    }

    public C105825p() {
        C0002w a = C53959v2.m60598a((C53973z1) null, 1, (Object) null);
        C53896h0 h0Var = C53872d1.f151117a;
        this.f314749n = C53930o0.m60554a(((C53884f2) a).plus(C58901s.f168555a));
    }

    /* renamed from: h */
    public static void m142196h(C105825p pVar, boolean z, int i, Object obj) {
        MMHandler mMHandler;
        boolean z2 = true;
        if ((i & 1) != 0) {
            z = true;
        }
        pVar.getClass();
        boolean g = C104331h.m139314g();
        pVar.f314755t = g;
        Looper looper = null;
        if (g) {
            C53895h.m60466d(pVar.f314749n, (C66212f) null, (C53934p0) null, new C105839u(pVar, z, (C15601d<? super C105839u>) null), 3, (Object) null);
            return;
        }
        C105843v vVar = new C105843v(pVar, z);
        int i2 = C58834h.f168432b;
        HandlerThread a = C97749e.m126093a("MultiTalkCameraManager_Thread" + pVar.hashCode(), 5);
        pVar.f314742d = a;
        a.start();
        HandlerThread handlerThread = pVar.f314742d;
        if (handlerThread != null) {
            looper = handlerThread.getLooper();
        }
        pVar.f314743e = new MMHandler(looper);
        C105831q qVar = new C105831q(pVar, vVar);
        HandlerThread handlerThread2 = pVar.f314742d;
        if (handlerThread2 == null || !handlerThread2.isAlive()) {
            z2 = false;
        }
        if (z2 && (mMHandler = pVar.f314743e) != null) {
            mMHandler.post(new C105827b(qVar));
        }
    }

    /* renamed from: D */
    public /* synthetic */ void mo145645D(int i) {
    }

    /* JADX WARNING: Removed duplicated region for block: B:121:0x02dc  */
    /* JADX WARNING: Removed duplicated region for block: B:122:0x02de  */
    /* JADX WARNING: Removed duplicated region for block: B:131:0x0316  */
    /* JADX WARNING: Removed duplicated region for block: B:157:0x0429  */
    /* renamed from: I */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo145646I(byte[] r33, long r34, int r36, int r37, int r38, int r39, double r40) {
        /*
            r32 = this;
            r1 = r32
            r9 = r33
            r10 = r34
            r12 = r36
            r13 = r37
            com.tencent.mm.plugin.multitalk.model.MultiTalkManager r0 = com.tencent.p014mm.plugin.multitalk.model.C105851w0.zx0()
            boolean r0 = r0.mo150683y()
            r14 = 1
            if (r0 != 0) goto L_0x0019
            r1.mo150813i(r14)
            return
        L_0x0019:
            if (r9 != 0) goto L_0x001c
            return
        L_0x001c:
            com.tencent.mm.plugin.multitalk.model.k0 r0 = r1.f314748j
            if (r0 != 0) goto L_0x0021
            return
        L_0x0021:
            java.lang.Boolean r0 = r0.f314634b
            if (r0 != 0) goto L_0x0026
            return
        L_0x0026:
            boolean r0 = r1.f314753r
            if (r0 != 0) goto L_0x002b
            return
        L_0x002b:
            boolean r0 = r1.f314755t
            if (r0 == 0) goto L_0x0030
            return
        L_0x0030:
            com.tencent.mm.plugin.multitalk.model.MultiTalkManager r0 = com.tencent.p014mm.plugin.multitalk.model.C105851w0.zx0()
            boolean r0 = r0.mo150680v()
            com.tencent.mm.plugin.multitalk.model.MultiTalkManager r2 = com.tencent.p014mm.plugin.multitalk.model.C105851w0.zx0()
            boolean r2 = r2.mo150625B()
            r15 = 3
            if (r2 != 0) goto L_0x0050
            com.tencent.mm.plugin.multitalk.model.MultiTalkManager r2 = com.tencent.p014mm.plugin.multitalk.model.C105851w0.zx0()
            com.tencent.mm.plugin.multitalk.model.MultiTalkManager r3 = com.tencent.p014mm.plugin.multitalk.model.C105851w0.zx0()
            boolean r3 = r3.f314498j
            r2.mo150655c0(r15, r3)
        L_0x0050:
            long r16 = java.lang.System.currentTimeMillis()
            com.tencent.mm.plugin.multitalk.model.MultiTalkManager r2 = com.tencent.p014mm.plugin.multitalk.model.C105851w0.zx0()
            com.tencent.mm.plugin.multitalk.model.k0 r3 = r1.f314748j
            gy3.C87412m.m108591d(r3)
            boolean r3 = r3.f314633a
            r2.f314497i = r3
            com.tencent.mm.plugin.multitalk.model.k0 r2 = r1.f314748j
            gy3.C87412m.m108591d(r2)
            boolean r2 = r2.f314633a
            r18 = 0
            if (r2 == 0) goto L_0x0071
            int r2 = com.tencent.p014mm.plugin.voip.video.OpenGlRender.f318118B
            r7 = 16
            goto L_0x0072
        L_0x0071:
            r7 = 0
        L_0x0072:
            com.tencent.mm.plugin.multitalk.model.k0 r2 = r1.f314748j
            gy3.C87412m.m108591d(r2)
            java.lang.Boolean r2 = r2.f314634b
            java.lang.Boolean r3 = java.lang.Boolean.TRUE
            boolean r2 = gy3.C87412m.m108589b(r2, r3)
            r19 = 4
            if (r2 == 0) goto L_0x008a
            int r2 = com.tencent.p014mm.plugin.voip.video.OpenGlRender.f318118B
            r2 = 12
            r20 = 12
            goto L_0x008e
        L_0x008a:
            int r2 = com.tencent.p014mm.plugin.voip.video.OpenGlRender.f318118B
            r20 = 4
        L_0x008e:
            java.lang.String r6 = "MicroMsg.MultiTalkCameraManager"
            r5 = 5
            r4 = 2
            if (r0 == 0) goto L_0x01d4
            if (r12 <= r13) goto L_0x0099
            int r0 = r12 - r13
            goto L_0x009a
        L_0x0099:
            r0 = 0
        L_0x009a:
            java.lang.String r8 = "ilink mv trans ret: %d"
            if (r0 <= 0) goto L_0x0163
            byte[] r0 = r1.f314757v
            if (r0 != 0) goto L_0x00ab
            int r0 = r13 * r13
            int r0 = r0 * 3
            int r0 = r0 / r4
            byte[] r0 = new byte[r0]
            r1.f314757v = r0
        L_0x00ab:
            com.tencent.mm.plugin.multitalk.ilinkservice.z r0 = com.tencent.p014mm.plugin.multitalk.ilinkservice.C105724z.INSTANCE
            byte[] r3 = r1.f314757v
            r10 = 0
            r0.getClass()
            com.tencent.wxmm.v2conference r2 = com.tencent.p014mm.plugin.multitalk.ilinkservice.C105714w.f314302c
            if (r2 == 0) goto L_0x00ce
            r11 = 2
            r4 = r37
            r5 = r37
            r15 = r6
            r6 = r33
            r9 = r7
            r7 = r36
            r12 = r8
            r8 = r37
            r28 = r9
            r9 = r38
            int r2 = r2.imgClip(r3, r4, r5, r6, r7, r8, r9, r10)
            goto L_0x00ec
        L_0x00ce:
            r15 = r6
            r28 = r7
            r12 = r8
            r11 = 2
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "steve:imgClip null,  engine:"
            r2.append(r3)
            com.tencent.wxmm.v2conference r3 = com.tencent.p014mm.plugin.multitalk.ilinkservice.C105714w.f314302c
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            java.lang.String r3 = "MicroMsg.Multitalk.ILinkNativeEngine"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r3, r2)
            r2 = -1
        L_0x00ec:
            if (r2 < 0) goto L_0x0155
            byte[] r3 = r1.f314757v
            if (r3 != 0) goto L_0x00f3
            goto L_0x0155
        L_0x00f3:
            com.tencent.mm.plugin.multitalk.model.p$a r2 = r1.f314756u
            int[] r4 = r2.f314761c
            if (r4 != 0) goto L_0x0103
            r2.f314759a = r13
            r2.f314760b = r13
            int r4 = r13 * r13
            int[] r4 = new int[r4]
            r2.f314761c = r4
        L_0x0103:
            int r4 = r3.length
            int r5 = r2.f314759a
            int r6 = r2.f314760b
            int r7 = r38 + r39
            r26 = r7 & 31
            int[] r2 = r2.f314761c
            r21 = r0
            r22 = r3
            r23 = r4
            r24 = r5
            r25 = r6
            r27 = r2
            com.tencent.mm.plugin.multitalk.ilinkservice.t2 r2 = r21.mo150594J(r22, r23, r24, r25, r26, r27)
            int r3 = r2.f314284d
            if (r3 < 0) goto L_0x0149
            com.tencent.mm.plugin.multitalk.model.p$a r4 = r1.f314756u
            int[] r4 = r4.f314761c
            if (r4 == 0) goto L_0x0149
            int r4 = r2.f314282b
            if (r4 == 0) goto L_0x0149
            int r2 = r2.f314283c
            if (r2 != 0) goto L_0x0131
            goto L_0x0149
        L_0x0131:
            com.tencent.mm.plugin.multitalk.ilinkservice.s2 r5 = r0.f314392h
            monitor-enter(r5)
            boolean r3 = r5.f314275f     // Catch:{ all -> 0x0146 }
            monitor-exit(r5)     // Catch:{ all -> 0x0146 }
            if (r3 != 0) goto L_0x013a
            return
        L_0x013a:
            long r5 = java.lang.System.currentTimeMillis()
            byte[] r3 = r1.f314757v
            int r0 = r0.mo150609s(r3, r13, r13, r7)
            goto L_0x01b7
        L_0x0146:
            r0 = move-exception
            monitor-exit(r5)     // Catch:{ all -> 0x0146 }
            throw r0
        L_0x0149:
            java.lang.Object[] r0 = new java.lang.Object[r14]
            java.lang.Integer r2 = java.lang.Integer.valueOf(r3)
            r0[r18] = r2
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r15, r12, r0)
            return
        L_0x0155:
            java.lang.Object[] r0 = new java.lang.Object[r14]
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r0[r18] = r2
            java.lang.String r2 = "ilink mv clip ret: %d"
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r15, r2, r0)
            return
        L_0x0163:
            r15 = r6
            r28 = r7
            r0 = r8
            r8 = 2
            com.tencent.mm.plugin.multitalk.model.p$a r2 = r1.f314756u
            int[] r3 = r2.f314761c
            if (r3 != 0) goto L_0x0178
            r2.f314759a = r12
            r2.f314760b = r13
            int r3 = r12 * r13
            int[] r3 = new int[r3]
            r2.f314761c = r3
        L_0x0178:
            com.tencent.mm.plugin.multitalk.ilinkservice.z r7 = com.tencent.p014mm.plugin.multitalk.ilinkservice.C105724z.INSTANCE
            int r4 = (int) r10
            int r5 = r2.f314759a
            int r6 = r2.f314760b
            int r10 = r38 + r39
            r11 = r10 & 31
            int[] r3 = r2.f314761c
            r2 = r7
            r21 = r3
            r3 = r33
            r14 = r7
            r7 = r11
            r11 = 2
            r8 = r21
            com.tencent.mm.plugin.multitalk.ilinkservice.t2 r2 = r2.mo150594J(r3, r4, r5, r6, r7, r8)
            int r3 = r2.f314284d
            if (r3 < 0) goto L_0x01c7
            com.tencent.mm.plugin.multitalk.model.p$a r4 = r1.f314756u
            int[] r4 = r4.f314761c
            if (r4 == 0) goto L_0x01c7
            int r4 = r2.f314282b
            if (r4 == 0) goto L_0x01c7
            int r2 = r2.f314283c
            if (r2 != 0) goto L_0x01a6
            goto L_0x01c7
        L_0x01a6:
            com.tencent.mm.plugin.multitalk.ilinkservice.s2 r5 = r14.f314392h
            monitor-enter(r5)
            boolean r0 = r5.f314275f     // Catch:{ all -> 0x01c4 }
            monitor-exit(r5)     // Catch:{ all -> 0x01c4 }
            if (r0 != 0) goto L_0x01af
            return
        L_0x01af:
            long r5 = java.lang.System.currentTimeMillis()
            int r0 = r14.mo150609s(r9, r12, r13, r10)
        L_0x01b7:
            r26 = r4
            r25 = r28
            r9 = 5
            r14 = 2
            r31 = r2
            r2 = r0
            r0 = r31
            goto L_0x03ad
        L_0x01c4:
            r0 = move-exception
            monitor-exit(r5)     // Catch:{ all -> 0x01c4 }
            throw r0
        L_0x01c7:
            r2 = 1
            java.lang.Object[] r2 = new java.lang.Object[r2]
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r2[r18] = r3
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r15, r0, r2)
            return
        L_0x01d4:
            r15 = r6
            r28 = r7
            r14 = 2
            com.tencent.mm.plugin.multitalk.model.p$a r0 = r1.f314756u
            int[] r2 = r0.f314761c
            if (r2 != 0) goto L_0x01e8
            r0.f314759a = r12
            r0.f314760b = r13
            int r2 = r12 * r13
            int[] r2 = new int[r2]
            r0.f314761c = r2
        L_0x01e8:
            com.tencent.mm.plugin.multitalk.model.w r0 = com.tencent.p014mm.plugin.multitalk.model.C105851w0.xx0()
            ds3.d r0 = r0.f314798d
            int r7 = (int) r10
            com.tencent.mm.plugin.multitalk.model.p$a r2 = r1.f314756u
            int r6 = r2.f314759a
            int r5 = r2.f314760b
            int r21 = r38 + r39
            r22 = r21 & 31
            int[] r4 = r2.f314761c
            nw3.e r0 = (nw3.C109779e) r0
            r0.getClass()
            nw3.f r3 = nw3.C109770a.m149092a()
            r3.getClass()
            ds3.g r23 = new ds3.g
            r23.<init>()
            boolean r0 = r3.f328591n
            java.lang.String r2 = "TalkRoomService"
            if (r0 == 0) goto L_0x026f
            nw3.b r0 = r3.f328564K
            if (r0 == 0) goto L_0x026f
            r8 = 3
            java.lang.Object[] r0 = new java.lang.Object[r8]     // Catch:{ Exception -> 0x0253 }
            java.lang.String r8 = "videoTrans "
            r0[r18] = r8     // Catch:{ Exception -> 0x0253 }
            java.lang.Integer r8 = java.lang.Integer.valueOf(r6)     // Catch:{ Exception -> 0x0253 }
            r25 = 1
            r0[r25] = r8     // Catch:{ Exception -> 0x0253 }
            java.lang.Integer r8 = java.lang.Integer.valueOf(r5)     // Catch:{ Exception -> 0x0253 }
            r0[r14] = r8     // Catch:{ Exception -> 0x0253 }
            bs3.C104161b.m138993b(r2, r0)     // Catch:{ Exception -> 0x0253 }
            nw3.b r0 = r3.f328564K     // Catch:{ Exception -> 0x0253 }
            r8 = r2
            r2 = r0
            r29 = r3
            r3 = r33
            r38 = r4
            r4 = r7
            r25 = r5
            r5 = r6
            r26 = r6
            r6 = r25
            r27 = r7
            r7 = r22
            r30 = r8
            r8 = r38
            ds3.g r23 = r2.mo161012j(r3, r4, r5, r6, r7, r8)     // Catch:{ Exception -> 0x0251 }
            r0 = r23
            r3 = r30
            goto L_0x027c
        L_0x0251:
            r0 = move-exception
            goto L_0x0260
        L_0x0253:
            r0 = move-exception
            r30 = r2
            r29 = r3
            r38 = r4
            r25 = r5
            r26 = r6
            r27 = r7
        L_0x0260:
            java.lang.Object[] r2 = new java.lang.Object[r14]
            java.lang.String r3 = "videoTrans error: "
            r2[r18] = r3
            r3 = 1
            r2[r3] = r0
            r3 = r30
            bs3.C104161b.m138997f(r3, r2)
            goto L_0x027a
        L_0x026f:
            r29 = r3
            r38 = r4
            r25 = r5
            r26 = r6
            r27 = r7
            r3 = r2
        L_0x027a:
            r0 = r23
        L_0x027c:
            r2 = 9
            java.lang.Object[] r4 = new java.lang.Object[r2]
            java.lang.String r5 = "videoTrans finished, "
            r4[r18] = r5
            java.lang.Integer r5 = java.lang.Integer.valueOf(r26)
            r6 = 1
            r4[r6] = r5
            java.lang.Integer r5 = java.lang.Integer.valueOf(r25)
            r4[r14] = r5
            java.lang.Integer r5 = java.lang.Integer.valueOf(r22)
            r6 = 3
            r4[r6] = r5
            r5 = r29
            boolean r6 = r5.f328591n
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r6)
            r4[r19] = r6
            java.lang.String r6 = " multiTalkVideoRGBinfo: "
            r8 = 5
            r4[r8] = r6
            r7 = 6
            r4[r7] = r0
            r23 = 7
            java.lang.String r24 = " engine: "
            r4[r23] = r24
            nw3.b r5 = r5.f328564K
            r24 = 8
            r4[r24] = r5
            bs3.C104161b.m138993b(r3, r4)
            r3 = 11
            java.lang.Object[] r3 = new java.lang.Object[r3]
            java.lang.String r4 = "videoTrans recordData size: "
            r3[r18] = r4
            int r4 = r9.length
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r5 = 1
            r3[r5] = r4
            java.lang.String r4 = " len: "
            r3[r14] = r4
            java.lang.Integer r4 = java.lang.Integer.valueOf(r27)
            r5 = 3
            r3[r5] = r4
            java.lang.String r4 = " localImg size: "
            r3[r19] = r4
            r4 = r38
            if (r4 != 0) goto L_0x02de
            r4 = 0
            goto L_0x02df
        L_0x02de:
            int r4 = r4.length
        L_0x02df:
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r3[r8] = r4
            java.lang.Integer r4 = java.lang.Integer.valueOf(r26)
            r3[r7] = r4
            java.lang.Integer r4 = java.lang.Integer.valueOf(r25)
            r3[r23] = r4
            java.lang.Integer r4 = java.lang.Integer.valueOf(r22)
            r3[r24] = r4
            r3[r2] = r6
            r2 = 10
            r3[r2] = r0
            java.lang.String r2 = "TalkRoomSdkApi"
            bs3.C104161b.m138993b(r2, r3)
            int r2 = r0.f320484d
            if (r2 < 0) goto L_0x0429
            com.tencent.mm.plugin.multitalk.model.p$a r3 = r1.f314756u
            int[] r3 = r3.f314761c
            if (r3 == 0) goto L_0x0429
            int r7 = r0.f320482b
            if (r7 == 0) goto L_0x0429
            int r0 = r0.f320483c
            if (r0 != 0) goto L_0x0316
            goto L_0x0429
        L_0x0316:
            long r22 = java.lang.System.currentTimeMillis()
            int r2 = com.tencent.p014mm.plugin.voip.video.OpenGlRender.f318118B
            r6 = r28
            r2 = 16
            if (r6 != r2) goto L_0x0325
            r3 = 257(0x101, float:3.6E-43)
            goto L_0x0326
        L_0x0325:
            r3 = 1
        L_0x0326:
            com.tencent.mm.plugin.multitalk.model.MultiTalkManager r4 = com.tencent.p014mm.plugin.multitalk.model.C105851w0.zx0()
            boolean r4 = r4.f314465G
            if (r4 == 0) goto L_0x0337
            if (r6 != r2) goto L_0x0333
            r2 = 259(0x103, float:3.63E-43)
            goto L_0x0334
        L_0x0333:
            r2 = 3
        L_0x0334:
            r24 = r2
            goto L_0x0339
        L_0x0337:
            r24 = r3
        L_0x0339:
            com.tencent.mm.plugin.multitalk.model.MultiTalkManager r2 = com.tencent.p014mm.plugin.multitalk.model.C105851w0.zx0()
            com.tencent.mm.plugin.multitalk.model.d1 r2 = r2.mo150677r()
            com.tencent.mm.plugin.multitalk.model.e1 r2 = (com.tencent.p014mm.plugin.multitalk.model.C105798e1) r2
            r2.getClass()
            boolean r3 = r2.f314608b
            if (r3 == 0) goto L_0x0398
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "onCameraFrame sendToVideo: "
            r3.append(r4)
            boolean r4 = r2.f314608b
            r3.append(r4)
            r4 = 32
            r3.append(r4)
            boolean r4 = com.tencent.p014mm.plugin.appbrand.utils.C2039g2.m1987a()
            r3.append(r4)
            java.lang.String r4 = " w: "
            r3.append(r4)
            r3.append(r12)
            java.lang.String r4 = ", h: "
            r3.append(r4)
            r3.append(r13)
            java.lang.String r3 = r3.toString()
            java.lang.String r4 = "VideoTransOutDataMuxer"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r4, r3)
            ds3.d r2 = r2.f314607a
            nw3.e r2 = (nw3.C109779e) r2
            r3 = r33
            r4 = r27
            r5 = r36
            r25 = r6
            r6 = r37
            r26 = r7
            r7 = r21
            r9 = 5
            r8 = r24
            int r2 = r2.mo161037h(r3, r4, r5, r6, r7, r8)
            goto L_0x03ab
        L_0x0398:
            r25 = r6
            r26 = r7
            r3 = r33
            r4 = r34
            r6 = r36
            r7 = r37
            r9 = 5
            r8 = r21
            r2.mo150746a(r3, r4, r6, r7, r8)
            r2 = 0
        L_0x03ab:
            r5 = r22
        L_0x03ad:
            long r3 = java.lang.System.currentTimeMillis()
            long r7 = r3 - r16
            r10 = 30
            int r12 = (r7 > r10 ? 1 : (r7 == r10 ? 0 : -1))
            if (r12 <= 0) goto L_0x03e3
            java.lang.Object[] r9 = new java.lang.Object[r9]
            java.lang.Integer r10 = java.lang.Integer.valueOf(r26)
            r9[r18] = r10
            java.lang.Integer r10 = java.lang.Integer.valueOf(r0)
            r11 = 1
            r9[r11] = r10
            java.lang.Long r7 = java.lang.Long.valueOf(r7)
            r9[r14] = r7
            long r7 = r5 - r16
            java.lang.Long r7 = java.lang.Long.valueOf(r7)
            r8 = 3
            r9[r8] = r7
            long r3 = r3 - r5
            java.lang.Long r3 = java.lang.Long.valueOf(r3)
            r9[r19] = r3
            java.lang.String r3 = "steve: trans size:%dx%d, total: %d, trans: %d, enc: %d"
            com.tencent.p014mm.sdk.platformtools.Log.m105919d(r15, r3, r9)
        L_0x03e3:
            if (r2 > 0) goto L_0x03f3
            r3 = 1
            java.lang.Object[] r3 = new java.lang.Object[r3]
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r3[r18] = r2
            java.lang.String r2 = "send ret = %d"
            com.tencent.p014mm.sdk.platformtools.Log.m105927v(r15, r2, r3)
        L_0x03f3:
            com.tencent.mm.plugin.multitalk.model.p$a r2 = r1.f314756u
            int[] r2 = r2.f314761c
            if (r2 == 0) goto L_0x0422
            com.tencent.mm.plugin.multitalk.model.MultiTalkManager r2 = com.tencent.p014mm.plugin.multitalk.model.C105851w0.zx0()
            com.tencent.mm.plugin.multitalk.model.z0 r2 = r2.mo150676q()
            java.lang.String r3 = eb0.C75592q0.m90789s()
            java.lang.String r4 = "getUsernameFromUserInfo()"
            gy3.C87412m.m108593f(r3, r4)
            com.tencent.mm.plugin.multitalk.model.p$a r4 = r1.f314756u
            int[] r4 = r4.f314761c
            gy3.C87412m.m108591d(r4)
            r33 = r2
            r34 = r3
            r35 = r4
            r36 = r26
            r37 = r0
            r38 = r25
            r39 = r20
            r33.mo150840d(r34, r35, r36, r37, r38, r39)
        L_0x0422:
            long r2 = com.tencent.p014mm.sdk.platformtools.Util.currentTicks()
            r1.f314747i = r2
            return
        L_0x0429:
            r3 = 1
            java.lang.Object[] r0 = new java.lang.Object[r3]
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r0[r18] = r2
            java.lang.String r2 = "mv ret: %d"
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r15, r2, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.multitalk.model.C105825p.mo145646I(byte[], long, int, int, int, int, double):void");
    }

    /* renamed from: a */
    public final void mo150807a() {
        this.f314747i = 0;
        this.f314752q = new Size(0, 0);
        C105811k0 k0Var = this.f314748j;
        boolean z = true;
        if (k0Var != null) {
            if (C104035d.f307670a.f308688b < 2) {
                Log.m105920e("MicroMsg.Voip.CaptureRender", "ExchangeCapture...gCameraNum= " + C104035d.f307670a.f308688b);
            } else {
                Log.m105924i("MicroMsg.Voip.CaptureRender", "ExchangeCapture start, gCameraNum= " + C104035d.f307670a.f308688b);
                k0Var.mo150779e();
                k0Var.mo150776b(k0Var.f314641i, k0Var.f314633a ^ true);
                k0Var.mo150778d();
                C109247e.xx0().mo152591E(k0Var.f314635c);
            }
        }
        MultiTalkManager zx02 = C105851w0.zx0();
        C105811k0 k0Var2 = this.f314748j;
        if (k0Var2 != null) {
            z = k0Var2.f314633a;
        }
        zx02.f314497i = z;
    }

    /* renamed from: b */
    public final boolean mo150808b() {
        long j = this.f314747i;
        if (j == 0 || Util.ticksToNow(j) <= ((Number) ((C36570n) this.f314758w).getValue()).longValue()) {
            return false;
        }
        Log.m105924i("MicroMsg.MultiTalkCameraManager", "current camera is open but has no video ");
        return true;
    }

    /* renamed from: c */
    public /* synthetic */ void mo145647c(int i) {
    }

    /* renamed from: d */
    public final boolean mo150809d() {
        return this.f314748j != null;
    }

    /* renamed from: e */
    public final boolean mo150810e() {
        C105811k0 k0Var = this.f314748j;
        if (k0Var != null) {
            return k0Var.f314633a;
        }
        return true;
    }

    /* renamed from: f */
    public final void mo150811f() {
        Log.m105924i("MicroMsg.MultiTalkCameraManager", "release");
        this.f314747i = 0;
        if (this.f314755t) {
            C105811k0 k0Var = this.f314748j;
            if (k0Var != null) {
                k0Var.mo150779e();
            }
            this.f314748j = null;
            this.f314750o = null;
        } else {
            SurfaceTexture surfaceTexture = this.f314750o;
            if (surfaceTexture != null) {
                surfaceTexture.release();
            }
            this.f314750o = null;
            C110194c cVar = this.f314745g;
            if (cVar != null) {
                cVar.close();
            }
            this.f314745g = null;
            C111742d.C65942b bVar = this.f314744f;
            if (bVar != null) {
                C111742d.f334647a.mo163471q(bVar);
            }
            C105811k0 k0Var2 = this.f314748j;
            if (k0Var2 != null) {
                k0Var2.mo150779e();
            }
            this.f314748j = null;
            MMHandler mMHandler = this.f314743e;
            if (mMHandler != null) {
                mMHandler.quitSafely();
            }
            this.f314743e = null;
            HandlerThread handlerThread = this.f314742d;
            if (handlerThread != null) {
                handlerThread.quitSafely();
            }
        }
        C105826a aVar = this.f314756u;
        aVar.f314759a = 0;
        aVar.f314760b = 0;
        aVar.f314761c = null;
    }

    /* renamed from: g */
    public final void mo150812g() {
        C105811k0 k0Var = this.f314748j;
        if (k0Var != null) {
            k0Var.mo150779e();
        }
        C105811k0 k0Var2 = new C105811k0(640, 480);
        this.f314748j = k0Var2;
        k0Var2.f314650r = !this.f314755t;
        k0Var2.mo150776b(this, C105851w0.zx0().f314497i);
        C105811k0 k0Var3 = this.f314748j;
        if (k0Var3 != null) {
            k0Var3.f314648p = this.f314750o;
        }
        if (k0Var3 != null) {
            k0Var3.mo150778d();
        }
        Object[] objArr = new Object[3];
        C105811k0 k0Var4 = this.f314748j;
        Boolean bool = null;
        objArr[0] = k0Var4 != null ? Boolean.valueOf(k0Var4.f314633a) : null;
        C105811k0 k0Var5 = this.f314748j;
        if (k0Var5 != null) {
            bool = k0Var5.f314634b;
        }
        objArr[1] = bool;
        objArr[2] = this.f314750o;
        Log.m105925i("MicroMsg.MultiTalkCameraManager", "captureRender.mIsCurrentFaceCamera=%b captureRender.mIsCameraRemote180=%b, texture %s", objArr);
    }

    /* renamed from: i */
    public final void mo150813i(boolean z) {
        if (z) {
            AppForegroundDelegate appForegroundDelegate = AppForegroundDelegate.INSTANCE;
            C114660c0 c0Var = this.f314754s;
            synchronized (appForegroundDelegate.f343453j) {
                ((HashSet) appForegroundDelegate.f343453j).remove(c0Var);
            }
        }
        C105783b0 n = C105851w0.zx0().mo150671n();
        if (n != null) {
            n.mo150721c();
        }
        mo150811f();
        C105851w0.zx0().mo150655c0(1, C105851w0.zx0().f314498j);
    }

    /* renamed from: k */
    public void mo145648k() {
        C105805i iVar = this.f314746h;
        if (iVar != null) {
            iVar.mo150751E6();
        }
    }

    /* renamed from: t */
    public void mo145649t(int i, int i2) {
        this.f314752q = new Size(i, i2);
        if (this.f314755t) {
            C105783b0 n = C105851w0.zx0().mo150671n();
            if (n != null) {
                n.mo150725g(i, i2);
            }
            Log.m105924i("MicroMsg.MultiTalkCameraManager", "camera preview size applye is " + i + " and " + i2);
        }
    }
}

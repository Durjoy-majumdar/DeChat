package com.tencent.p014mm.plugin.voip.model;

import android.media.AudioRecord;
import bp3.C104160f;
import bp3.C79758p;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandler;
import di3.C7335d;
import di3.C86312j;
import gy3.C87412m;
import java.nio.ByteBuffer;
import l33.C109247e;
import ou0.C110066a;
import ou0.C110071c;
import p156gj.C107823c;
import p156gj.C107835h0;
import p206nj.C76866m;
import p375qh.C110390f;
import pu0.C110248b;
import z33.C112595h;
import z33.C112597j;

/* renamed from: com.tencent.mm.plugin.voip.model.y */
public class C106400y {

    /* renamed from: A */
    public int f317697A = 16;

    /* renamed from: B */
    public int f317698B = 0;

    /* renamed from: C */
    public int f317699C = 0;

    /* renamed from: D */
    public int f317700D = 0;

    /* renamed from: E */
    public boolean f317701E = C112595h.m153919e();

    /* renamed from: F */
    public C110390f.C89659b f317702F = new y$$d(this);

    /* renamed from: G */
    public y$$e f317703G;

    /* renamed from: H */
    public int f317704H = 640;

    /* renamed from: I */
    public int f317705I = 480;

    /* renamed from: J */
    public final int f317706J = C79758p.f233760a.mo109882e(C104160f.RepairerConfig_VOIP_ForceHardEncode_Int, 0);

    /* renamed from: K */
    public ByteBuffer f317707K;

    /* renamed from: a */
    public volatile C106336d f317708a = null;

    /* renamed from: b */
    public volatile C110390f f317709b = null;

    /* renamed from: c */
    public int f317710c = 1;

    /* renamed from: d */
    public C106377r f317711d;

    /* renamed from: e */
    public long f317712e = 0;

    /* renamed from: f */
    public long f317713f = 0;

    /* renamed from: g */
    public int f317714g = 1;

    /* renamed from: h */
    public final Object f317715h = new Object();

    /* renamed from: i */
    public int f317716i = 0;

    /* renamed from: j */
    public boolean f317717j = false;

    /* renamed from: k */
    public boolean f317718k = false;

    /* renamed from: l */
    public int f317719l = 0;

    /* renamed from: m */
    public int f317720m = 1;

    /* renamed from: n */
    public int f317721n = 1;

    /* renamed from: o */
    public long f317722o = 0;

    /* renamed from: p */
    public long f317723p = 0;

    /* renamed from: q */
    public MMHandler f317724q;

    /* renamed from: r */
    public long f317725r = 0;

    /* renamed from: s */
    public int f317726s = 0;

    /* renamed from: t */
    public int f317727t = 0;

    /* renamed from: u */
    public int f317728u = 0;

    /* renamed from: v */
    public int f317729v = 0;

    /* renamed from: w */
    public int f317730w = 0;

    /* renamed from: x */
    public int f317731x = -1;

    /* renamed from: y */
    public int f317732y = -1;

    /* renamed from: z */
    public int f317733z = 44100;

    public C106400y(C106377r rVar) {
        this.f317711d = rVar;
        MMHandler mMHandler = this.f317724q;
        if (mMHandler == null || mMHandler.isQuit()) {
            this.f317724q = new MMHandler("VoipDeviceHandler_stopDev");
        }
    }

    /* renamed from: a */
    public void mo152854a() {
        Log.printInfoStack("MicroMsg.Voip.VoipDeviceHandler", "forceCleanRecord, recorder %s", this.f317709b);
        if (this.f317724q != null) {
            synchronized (this.f317715h) {
                if (!(this.f317708a == null && this.f317709b == null)) {
                    Log.m105924i("MicroMsg.Voip.VoipDeviceHandler", "forceCleanRecord process post runnable");
                    MMHandler mMHandler = this.f317724q;
                    if (mMHandler != null) {
                        mMHandler.removeCallbacksAndMessages((Object) null);
                        this.f317724q.post(new y$$a(this));
                    }
                }
            }
            return;
        }
        Log.m105924i("MicroMsg.Voip.VoipDeviceHandler", "forceCleanRecord failed but mDevHandler is null");
    }

    /* renamed from: b */
    public int mo152855b() {
        if (this.f317708a == null || this.f317711d.f317500x.f317568G1.f317781j != 1) {
            return 0;
        }
        C106336d dVar = this.f317708a;
        dVar.getClass();
        Log.m105918d("MicroMsg.Voip.AudioPlayer", "AudioPlayer  mAudioPlayNum:" + dVar.f317190M);
        return dVar.f317190M;
    }

    /* renamed from: c */
    public int mo152856c() {
        Class cls = C110248b.class;
        int g = (this.f317708a == null || this.f317711d.f317500x.f317568G1.f317781j != 1) ? 0 : this.f317708a.mo152548g();
        C7335d c = C86312j.m106911c(cls);
        C87412m.m108593f(c, "getService(SubCoreAudio::class.java)");
        C110066a aVar = ((C110248b) c).f329779e;
        if (aVar == null) {
            aVar = new C110071c();
            C7335d c2 = C86312j.m106911c(cls);
            C87412m.m108593f(c2, "getService(SubCoreAudio::class.java)");
            ((C110248b) c2).f329781g[0] = "music";
        }
        return (int) ((((float) C110248b.yx0(g)) / ((float) aVar.mo157507d(g))) * 100.0f);
    }

    /* renamed from: d */
    public int mo152857d() {
        if (this.f317708a == null || this.f317711d.f317500x.f317568G1.f317781j != 1) {
            return 0;
        }
        return this.f317708a.mo152549h();
    }

    /* renamed from: e */
    public int mo152858e() {
        int i;
        if (this.f317709b == null || this.f317711d.f317500x.f317568G1.f317781j != 1 || (i = this.f317709b.f330222a) == 6) {
            return 0;
        }
        return i;
    }

    /* renamed from: f */
    public final void mo152859f() {
        C112597j.m153938c("MicroMsg.Voip.VoipDeviceHandler", "seenli, player=" + this.f317708a);
        if (this.f317708a != null) {
            this.f317732y = this.f317708a.mo152551j(false);
        } else {
            C112597j.m153938c("MicroMsg.Voip.VoipDeviceHandler", "player == null, return...");
            this.f317732y = -1;
        }
        C110248b.vx0().mo161473O();
        this.f317700D = C110248b.vx0().mo161473O();
        C107823c cVar = C107835h0.f322846c;
        if (!cVar.f322730a) {
            this.f317700D = 3;
            if (C76866m.m92676e() && 2 == C107835h0.f322856m.f322905l) {
                this.f317700D = 2;
            }
            int i = C107835h0.f322846c.f322688F;
            if (i > -1) {
                this.f317700D = i;
            }
        } else if (cVar.mo158228b()) {
            C107823c cVar2 = C107835h0.f322846c;
            int i2 = cVar2.f322735c;
            if (i2 >= 0) {
                this.f317700D = i2;
            } else if (cVar2.f322737d >= 0) {
                this.f317700D = 2;
            }
        } else if (C107835h0.f322846c.mo158227a()) {
            if (C107835h0.f322846c.mo158233g() >= 0) {
                C107835h0.f322846c.mo158233g();
            }
            if (C107835h0.f322846c.mo158232f() >= 0) {
                this.f317700D = C107835h0.f322846c.mo158232f();
            }
        }
        int i3 = this.f317700D;
        if (i3 == 3) {
            if (this.f317732y != 0) {
                this.f317732y = -1;
            }
        } else if (i3 != 0) {
            this.f317732y = -1;
        } else if (this.f317732y != 3) {
            this.f317732y = -1;
        }
    }

    /* renamed from: g */
    public void mo152860g(int i, int i2) {
        this.f317698B = i;
        this.f317699C = i2;
        C112597j.m153938c("MicroMsg.Voip.VoipDeviceHandler", "seenli, setOpenslParams setOpenslNativeFs=" + this.f317698B + ", setOpenslPcmFormat=" + this.f317699C);
    }

    /* JADX WARNING: Removed duplicated region for block: B:107:0x029f A[Catch:{ Exception -> 0x030b }] */
    /* JADX WARNING: Removed duplicated region for block: B:108:0x02a0 A[Catch:{ Exception -> 0x030b }] */
    /* JADX WARNING: Removed duplicated region for block: B:111:0x02a5 A[Catch:{ Exception -> 0x030b }] */
    /* JADX WARNING: Removed duplicated region for block: B:113:0x02c7 A[SYNTHETIC, Splitter:B:113:0x02c7] */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x0213 A[Catch:{ Exception -> 0x030b }] */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x0236 A[Catch:{ Exception -> 0x030b }] */
    /* JADX WARNING: Removed duplicated region for block: B:86:0x027b A[Catch:{ Exception -> 0x030b }] */
    /* JADX WARNING: Removed duplicated region for block: B:87:0x027d A[Catch:{ Exception -> 0x030b }] */
    /* JADX WARNING: Removed duplicated region for block: B:90:0x0282 A[Catch:{ Exception -> 0x030b }] */
    /* JADX WARNING: Removed duplicated region for block: B:93:0x0286 A[Catch:{ Exception -> 0x030b }] */
    /* JADX WARNING: Removed duplicated region for block: B:94:0x0287 A[Catch:{ Exception -> 0x030b }] */
    /* renamed from: h */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo152861h() {
        /*
            r19 = this;
            r1 = r19
            int r0 = r1.f317710c
            r2 = 2
            if (r0 != r2) goto L_0x000f
            java.lang.String r0 = "MicroMsg.Voip.VoipDeviceHandler"
            java.lang.String r2 = "dev start already..."
            z33.C112597j.m153937b(r0, r2)
            return
        L_0x000f:
            java.lang.String r0 = "MicroMsg.Voip.VoipDeviceHandler"
            java.lang.String r3 = "start device......"
            z33.C112597j.m153938c(r0, r3)
            r1.f317710c = r2
            r0 = 0
            r1.f317718k = r0
            r1.f317719l = r0
            com.tencent.mm.sdk.platformtools.MMHandler r3 = r1.f317724q
            r4 = 0
            if (r3 == 0) goto L_0x003d
            java.lang.String r3 = "MicroMsg.Voip.VoipDeviceHandler"
            java.lang.String r5 = "mDevHandlerThread is not null"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r3, r5)
            com.tencent.mm.sdk.platformtools.MMHandler r3 = r1.f317724q
            boolean r3 = r3.isQuit()
            if (r3 != 0) goto L_0x0038
            java.lang.String r3 = "MicroMsg.Voip.VoipDeviceHandler"
            java.lang.String r5 = "mDevHandlerThread is alive"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r3, r5)
        L_0x0038:
            com.tencent.mm.sdk.platformtools.MMHandler r3 = r1.f317724q
            r3.removeCallbacksAndMessages(r4)
        L_0x003d:
            boolean r3 = z33.C112595h.m153919e()
            r1.f317701E = r3
            com.tencent.mm.plugin.voip.model.y$$e r3 = r1.f317703G
            java.lang.String r5 = "MicroMsg.Voip.VoipDeviceHandler"
            r6 = 1
            if (r3 == 0) goto L_0x006f
            java.lang.String r3 = "stop videodecode thread.."
            z33.C112597j.m153936a(r5, r3)
            com.tencent.mm.plugin.voip.model.y$$e r3 = r1.f317703G
            r3.getClass()
            com.tencent.mm.plugin.voip.model.y r7 = r3.f317745o     // Catch:{ Exception -> 0x0068 }
            com.tencent.mm.plugin.voip.model.r r7 = r7.f317711d     // Catch:{ Exception -> 0x0068 }
            if (r7 == 0) goto L_0x0061
            com.tencent.mm.plugin.voip.model.s0 r7 = r7.f317502z     // Catch:{ Exception -> 0x0068 }
            if (r7 == 0) goto L_0x0061
            r7.mo152488r0()     // Catch:{ Exception -> 0x0068 }
        L_0x0061:
            r3.f317740g = r6     // Catch:{ Exception -> 0x0068 }
            android.os.ConditionVariable r3 = r3.f317738e     // Catch:{ Exception -> 0x0068 }
            r3.open()     // Catch:{ Exception -> 0x0068 }
        L_0x0068:
            com.tencent.mm.plugin.voip.model.y$$e r3 = r1.f317703G
            r3.mo97819a()
            r1.f317703G = r4
        L_0x006f:
            com.tencent.mm.plugin.voip.model.y$$e r3 = new com.tencent.mm.plugin.voip.model.y$$e
            r3.<init>(r1)
            r1.f317703G = r3
            boolean r3 = r1.f317701E
            r7 = 3
            if (r3 == 0) goto L_0x0096
            v33.b r3 = l33.C109247e.vx0()
            u33.b r3 = r3.mo163047a(r7)
            if (r3 == 0) goto L_0x0096
            v33.b r3 = l33.C109247e.vx0()
            u33.b r3 = r3.mo163047a(r7)
            java.util.Objects.requireNonNull(r3)
            com.tencent.mm.plugin.voip.model.y$$e r8 = r1.f317703G
            r3.mo162868b(r8)
            goto L_0x00ba
        L_0x0096:
            v33.b r3 = l33.C109247e.vx0()
            u33.b r3 = r3.mo163047a(r6)
            if (r3 == 0) goto L_0x00b1
            v33.b r3 = l33.C109247e.vx0()
            u33.b r3 = r3.mo163047a(r6)
            java.util.Objects.requireNonNull(r3)
            com.tencent.mm.plugin.voip.model.y$$e r8 = r1.f317703G
            r3.mo162868b(r8)
            goto L_0x00ba
        L_0x00b1:
            zt3.t r3 = zt3.C119157j.f356862d
            com.tencent.mm.plugin.voip.model.y$$e r8 = r1.f317703G
            zt3.j r3 = (zt3.C119157j) r3
            r3.mo183875f(r8)
        L_0x00ba:
            java.lang.String r3 = "start video decode thread.."
            z33.C112597j.m153936a(r5, r3)
            gj.c r3 = p156gj.C107835h0.f322846c
            r3.mo158230d()
            r1.f317726s = r0
            r1.f317727t = r0
            r1.f317728u = r0
            android.content.Context r3 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            android.content.pm.PackageManager r3 = r3.getPackageManager()
            java.lang.String r5 = "android.hardware.audio.low_latency"
            boolean r3 = r3.hasSystemFeature(r5)
            java.lang.String r5 = "MicroMsg.Voip.VoipDeviceHandler"
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            java.lang.String r9 = "seenli, low_latency_flag="
            r8.append(r9)
            r8.append(r3)
            java.lang.String r9 = ", Build.VERSION.SDK_INT="
            r8.append(r9)
            int r9 = android.os.Build.VERSION.SDK_INT
            r8.append(r9)
            java.lang.String r9 = ", mOpenslFlag="
            r8.append(r9)
            int r9 = r1.f317730w
            r8.append(r9)
            java.lang.String r8 = r8.toString()
            z33.C112597j.m153938c(r5, r8)
            int r5 = r1.f317730w
            r8 = -1
            if (r5 != r6) goto L_0x03c9
            r5 = 25
            boolean r5 = p206nj.C11171e.m11046c(r5)
            if (r5 == 0) goto L_0x03c9
            if (r3 == 0) goto L_0x03c9
            java.lang.String r3 = "MicroMsg.Voip.VoipDeviceHandler"
            java.lang.String r5 = "seenli, try use opensles..."
            z33.C112597j.m153938c(r3, r5)
            r1.f317726s = r6
            r1.f317729v = r0
            r1.f317728u = r0
            java.lang.Object r3 = r1.f317715h
            monitor-enter(r3)
            int r5 = r1.f317710c     // Catch:{ all -> 0x03c6 }
            if (r5 != r7) goto L_0x0131
            java.lang.String r5 = "MicroMsg.Voip.VoipDeviceHandler"
            java.lang.String r9 = "current is not allowed to start dev"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r5, r9)     // Catch:{ all -> 0x03c6 }
            r1.f317730w = r0     // Catch:{ all -> 0x03c6 }
            monitor-exit(r3)     // Catch:{ all -> 0x03c6 }
            goto L_0x031b
        L_0x0131:
            com.tencent.mm.plugin.voip.model.a r5 = new com.tencent.mm.plugin.voip.model.a     // Catch:{ all -> 0x03c6 }
            r5.<init>()     // Catch:{ all -> 0x03c6 }
            com.tencent.mm.plugin.voip.model.r r9 = r1.f317711d     // Catch:{ all -> 0x03c6 }
            com.tencent.mm.plugin.voip.model.v2protocal r9 = r9.f317500x     // Catch:{ all -> 0x03c6 }
            int r9 = r9.mo152761b(r5)     // Catch:{ all -> 0x03c6 }
            java.lang.String r10 = "MicroMsg.Voip.VoipDeviceHandler"
            java.lang.StringBuilder r11 = new java.lang.StringBuilder     // Catch:{ all -> 0x03c6 }
            r11.<init>()     // Catch:{ all -> 0x03c6 }
            java.lang.String r12 = "VoipDeivceHandler.GetAudioDeviceFmt, devFmt.freq:"
            r11.append(r12)     // Catch:{ all -> 0x03c6 }
            int r12 = r5.f317170b     // Catch:{ all -> 0x03c6 }
            r11.append(r12)     // Catch:{ all -> 0x03c6 }
            java.lang.String r12 = ", devFmt.framelen: "
            r11.append(r12)     // Catch:{ all -> 0x03c6 }
            int r12 = r5.f317171c     // Catch:{ all -> 0x03c6 }
            r11.append(r12)     // Catch:{ all -> 0x03c6 }
            java.lang.String r12 = ", devFmt.channels="
            r11.append(r12)     // Catch:{ all -> 0x03c6 }
            int r12 = r5.f317169a     // Catch:{ all -> 0x03c6 }
            r11.append(r12)     // Catch:{ all -> 0x03c6 }
            java.lang.String r12 = ", ret:"
            r11.append(r12)     // Catch:{ all -> 0x03c6 }
            r11.append(r9)     // Catch:{ all -> 0x03c6 }
            java.lang.String r9 = r11.toString()     // Catch:{ all -> 0x03c6 }
            z33.C112597j.m153938c(r10, r9)     // Catch:{ all -> 0x03c6 }
            int r9 = r5.f317169a     // Catch:{ all -> 0x03c6 }
            if (r9 == r6) goto L_0x0182
            java.lang.String r5 = "MicroMsg.Voip.VoipDeviceHandler"
            java.lang.String r9 = "devFmt.channels must equal 1"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r5, r9)     // Catch:{ all -> 0x03c6 }
            r1.f317730w = r0     // Catch:{ all -> 0x03c6 }
            monitor-exit(r3)     // Catch:{ all -> 0x03c6 }
            goto L_0x031b
        L_0x0182:
            com.tencent.mm.plugin.voip.model.r r9 = r1.f317711d     // Catch:{ all -> 0x03c6 }
            com.tencent.mm.plugin.voip.model.v2protocal r9 = r9.f317500x     // Catch:{ all -> 0x03c6 }
            r9.releaseAudioDevice()     // Catch:{ all -> 0x03c6 }
            android.content.Context r9 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()     // Catch:{ all -> 0x03c6 }
            java.lang.String r10 = "audio"
            java.lang.Object r9 = r9.getSystemService(r10)     // Catch:{ all -> 0x03c6 }
            android.media.AudioManager r9 = (android.media.AudioManager) r9     // Catch:{ all -> 0x03c6 }
            java.lang.String r10 = "android.media.property.OUTPUT_SAMPLE_RATE"
            java.lang.String r9 = r9.getProperty(r10)     // Catch:{ all -> 0x03c6 }
            int r9 = java.lang.Integer.parseInt(r9)     // Catch:{ all -> 0x03c6 }
            r10 = 16000(0x3e80, float:2.2421E-41)
            r11 = 44100(0xac44, float:6.1797E-41)
            r12 = 48000(0xbb80, float:6.7262E-41)
            if (r9 == r12) goto L_0x01be
            if (r9 != r11) goto L_0x01ac
            goto L_0x01be
        L_0x01ac:
            r13 = 8000(0x1f40, float:1.121E-41)
            if (r9 == r13) goto L_0x01bb
            if (r9 == r10) goto L_0x01bb
            r13 = 96000(0x17700, float:1.34525E-40)
            if (r9 != r13) goto L_0x01b8
            goto L_0x01bb
        L_0x01b8:
            r1.f317733z = r11     // Catch:{ all -> 0x03c6 }
            goto L_0x01c0
        L_0x01bb:
            r1.f317733z = r12     // Catch:{ all -> 0x03c6 }
            goto L_0x01c0
        L_0x01be:
            r1.f317733z = r9     // Catch:{ all -> 0x03c6 }
        L_0x01c0:
            int r9 = r1.f317698B     // Catch:{ all -> 0x03c6 }
            if (r9 == r12) goto L_0x01c8
            if (r9 == r11) goto L_0x01c8
            if (r9 != r10) goto L_0x01ca
        L_0x01c8:
            r1.f317733z = r9     // Catch:{ all -> 0x03c6 }
        L_0x01ca:
            int r9 = r1.f317699C     // Catch:{ all -> 0x03c6 }
            r10 = 16
            if (r9 == r10) goto L_0x01d4
            r10 = 24
            if (r9 != r10) goto L_0x01d6
        L_0x01d4:
            r1.f317697A = r9     // Catch:{ all -> 0x03c6 }
        L_0x01d6:
            java.lang.String r9 = "MicroMsg.Voip.VoipDeviceHandler"
            java.lang.StringBuilder r10 = new java.lang.StringBuilder     // Catch:{ all -> 0x03c6 }
            r10.<init>()     // Catch:{ all -> 0x03c6 }
            java.lang.String r11 = "seenli, final mOpenslNativeFs="
            r10.append(r11)     // Catch:{ all -> 0x03c6 }
            int r11 = r1.f317733z     // Catch:{ all -> 0x03c6 }
            r10.append(r11)     // Catch:{ all -> 0x03c6 }
            java.lang.String r11 = ", final mOpenslPcmFormat="
            r10.append(r11)     // Catch:{ all -> 0x03c6 }
            int r11 = r1.f317697A     // Catch:{ all -> 0x03c6 }
            r10.append(r11)     // Catch:{ all -> 0x03c6 }
            java.lang.String r10 = r10.toString()     // Catch:{ all -> 0x03c6 }
            z33.C112597j.m153938c(r9, r10)     // Catch:{ all -> 0x03c6 }
            com.tencent.mm.plugin.voip.model.d r9 = new com.tencent.mm.plugin.voip.model.d     // Catch:{ all -> 0x03c6 }
            r9.<init>()     // Catch:{ all -> 0x03c6 }
            r1.f317708a = r9     // Catch:{ all -> 0x03c6 }
            com.tencent.mm.plugin.voip.model.d r9 = r1.f317708a     // Catch:{ all -> 0x03c6 }
            long r10 = r1.f317725r     // Catch:{ all -> 0x03c6 }
            r9.getClass()     // Catch:{ all -> 0x03c6 }
            java.lang.String r10 = java.lang.String.valueOf(r10)     // Catch:{ all -> 0x03c6 }
            r9.f317215t = r10     // Catch:{ all -> 0x03c6 }
            r19.mo152859f()     // Catch:{ all -> 0x03c6 }
            int r9 = r1.f317732y     // Catch:{ all -> 0x03c6 }
            if (r9 >= 0) goto L_0x0236
            java.lang.String r5 = "MicroMsg.Voip.VoipDeviceHandler"
            java.lang.StringBuilder r9 = new java.lang.StringBuilder     // Catch:{ all -> 0x03c6 }
            r9.<init>()     // Catch:{ all -> 0x03c6 }
            java.lang.String r10 = "seenli, mOpenslStreamType="
            r9.append(r10)     // Catch:{ all -> 0x03c6 }
            int r10 = r1.f317732y     // Catch:{ all -> 0x03c6 }
            r9.append(r10)     // Catch:{ all -> 0x03c6 }
            java.lang.String r9 = r9.toString()     // Catch:{ all -> 0x03c6 }
            z33.C112597j.m153937b(r5, r9)     // Catch:{ all -> 0x03c6 }
            r1.f317716i = r6     // Catch:{ all -> 0x03c6 }
            r5 = 100
            r1.f317728u = r5     // Catch:{ all -> 0x03c6 }
            r1.f317730w = r0     // Catch:{ all -> 0x03c6 }
            monitor-exit(r3)     // Catch:{ all -> 0x03c6 }
            goto L_0x031b
        L_0x0236:
            com.tencent.mm.plugin.voip.model.r r10 = r1.f317711d     // Catch:{ all -> 0x03c6 }
            com.tencent.mm.plugin.voip.model.v2protocal r10 = r10.f317500x     // Catch:{ all -> 0x03c6 }
            r10.f317621b0 = r9     // Catch:{ all -> 0x03c6 }
            int r9 = pu0.C110248b.xx0()     // Catch:{ all -> 0x03c6 }
            r10.f317611X = r9     // Catch:{ all -> 0x03c6 }
            com.tencent.mm.plugin.voip.model.h0 r9 = l33.C109247e.xx0()     // Catch:{ all -> 0x03c6 }
            boolean r10 = pu0.C110248b.zx0()     // Catch:{ all -> 0x03c6 }
            if (r10 != 0) goto L_0x0255
            boolean r10 = pu0.C110248b.Jh0()     // Catch:{ all -> 0x03c6 }
            if (r10 == 0) goto L_0x0253
            goto L_0x0255
        L_0x0253:
            r10 = 0
            goto L_0x0256
        L_0x0255:
            r10 = 1
        L_0x0256:
            r9.mo152592F(r10)     // Catch:{ all -> 0x03c6 }
            qh.f r9 = new qh.f     // Catch:{ all -> 0x03c6 }
            int r10 = r5.f317170b     // Catch:{ all -> 0x03c6 }
            int r11 = r5.f317169a     // Catch:{ all -> 0x03c6 }
            r9.<init>(r10, r11, r6)     // Catch:{ all -> 0x03c6 }
            r1.f317709b = r9     // Catch:{ all -> 0x03c6 }
            qh.f r9 = r1.f317709b     // Catch:{ all -> 0x03c6 }
            com.tencent.mm.plugin.voip.model.h0 r10 = l33.C109247e.xx0()     // Catch:{ all -> 0x03c6 }
            long r10 = r10.mo152616o()     // Catch:{ all -> 0x03c6 }
            java.lang.String r10 = java.lang.String.valueOf(r10)     // Catch:{ all -> 0x03c6 }
            r9.f330218E = r10     // Catch:{ all -> 0x03c6 }
            gj.c r9 = p156gj.C107835h0.f322846c     // Catch:{ all -> 0x03c6 }
            boolean r10 = r9.f322730a     // Catch:{ all -> 0x03c6 }
            r11 = 7
            if (r10 == 0) goto L_0x027d
            r10 = 1
            goto L_0x027e
        L_0x027d:
            r10 = 7
        L_0x027e:
            int r9 = r9.f322684D     // Catch:{ all -> 0x03c6 }
            if (r9 <= r8) goto L_0x0283
            r10 = r9
        L_0x0283:
            r9 = 5
            if (r10 >= 0) goto L_0x0287
            goto L_0x0294
        L_0x0287:
            if (r10 == r6) goto L_0x029c
            r12 = 9
            if (r10 == r12) goto L_0x029d
            if (r10 == r9) goto L_0x029a
            r9 = 6
            if (r10 == r9) goto L_0x0298
            if (r10 == r11) goto L_0x0296
        L_0x0294:
            r9 = -1
            goto L_0x029d
        L_0x0296:
            r9 = 4
            goto L_0x029d
        L_0x0298:
            r9 = 3
            goto L_0x029d
        L_0x029a:
            r9 = 2
            goto L_0x029d
        L_0x029c:
            r9 = 1
        L_0x029d:
            if (r9 <= 0) goto L_0x02a0
            goto L_0x02a1
        L_0x02a0:
            r9 = -1
        L_0x02a1:
            r1.f317731x = r9     // Catch:{ all -> 0x03c6 }
            if (r9 >= 0) goto L_0x02c7
            java.lang.String r5 = "MicroMsg.Voip.VoipDeviceHandler"
            java.lang.StringBuilder r9 = new java.lang.StringBuilder     // Catch:{ all -> 0x03c6 }
            r9.<init>()     // Catch:{ all -> 0x03c6 }
            java.lang.String r10 = "seenli, mOpenslRecPreset="
            r9.append(r10)     // Catch:{ all -> 0x03c6 }
            int r10 = r1.f317731x     // Catch:{ all -> 0x03c6 }
            r9.append(r10)     // Catch:{ all -> 0x03c6 }
            java.lang.String r9 = r9.toString()     // Catch:{ all -> 0x03c6 }
            z33.C112597j.m153937b(r5, r9)     // Catch:{ all -> 0x03c6 }
            r1.f317716i = r6     // Catch:{ all -> 0x03c6 }
            r5 = 101(0x65, float:1.42E-43)
            r1.f317728u = r5     // Catch:{ all -> 0x03c6 }
            r1.f317730w = r0     // Catch:{ all -> 0x03c6 }
            monitor-exit(r3)     // Catch:{ all -> 0x03c6 }
            goto L_0x031b
        L_0x02c7:
            com.tencent.mm.plugin.voip.model.r r10 = r1.f317711d     // Catch:{ Exception -> 0x030b }
            com.tencent.mm.plugin.voip.model.v2protocal r10 = r10.f317500x     // Catch:{ Exception -> 0x030b }
            int r11 = r1.f317733z     // Catch:{ Exception -> 0x030b }
            int r15 = r5.f317171c     // Catch:{ Exception -> 0x030b }
            int r12 = r11 * r15
            int r12 = r12 / 1000
            int r13 = r5.f317169a     // Catch:{ Exception -> 0x030b }
            int r14 = r5.f317170b     // Catch:{ Exception -> 0x030b }
            int r5 = r1.f317732y     // Catch:{ Exception -> 0x030b }
            int r8 = r1.f317697A     // Catch:{ Exception -> 0x030b }
            r16 = r9
            r17 = r5
            r18 = r8
            int r5 = r10.startAudioDevice(r11, r12, r13, r14, r15, r16, r17, r18)     // Catch:{ Exception -> 0x030b }
            r1.f317729v = r5     // Catch:{ Exception -> 0x030b }
            com.tencent.mm.plugin.voip.model.r r5 = r1.f317711d     // Catch:{ all -> 0x03c6 }
            com.tencent.mm.plugin.voip.model.v2protocal r5 = r5.f317500x     // Catch:{ all -> 0x03c6 }
            int r5 = r5.getOpenslErrorCode()     // Catch:{ all -> 0x03c6 }
            r1.f317728u = r5     // Catch:{ all -> 0x03c6 }
            int r8 = r1.f317729v     // Catch:{ all -> 0x03c6 }
            if (r8 != 0) goto L_0x02f7
            if (r5 == 0) goto L_0x0302
        L_0x02f7:
            java.lang.String r5 = "MicroMsg.Voip.VoipDeviceHandler"
            java.lang.String r8 = "seenli, opensl startAudioDevice return failed"
            z33.C112597j.m153937b(r5, r8)     // Catch:{ all -> 0x03c6 }
            r1.f317716i = r6     // Catch:{ all -> 0x03c6 }
            r1.f317730w = r0     // Catch:{ all -> 0x03c6 }
        L_0x0302:
            java.lang.String r5 = "MicroMsg.Voip.VoipDeviceHandler"
            java.lang.String r8 = "seenli, startOpenslDevice done!"
            z33.C112597j.m153938c(r5, r8)     // Catch:{ all -> 0x03c6 }
            monitor-exit(r3)     // Catch:{ all -> 0x03c6 }
            goto L_0x031b
        L_0x030b:
            java.lang.String r5 = "MicroMsg.Voip.VoipDeviceHandler"
            java.lang.String r8 = "seenli, try opensl startAudioDevice failed"
            z33.C112597j.m153937b(r5, r8)     // Catch:{ all -> 0x03c6 }
            r1.f317716i = r6     // Catch:{ all -> 0x03c6 }
            r5 = 102(0x66, float:1.43E-43)
            r1.f317728u = r5     // Catch:{ all -> 0x03c6 }
            r1.f317730w = r0     // Catch:{ all -> 0x03c6 }
            monitor-exit(r3)     // Catch:{ all -> 0x03c6 }
        L_0x031b:
            int r3 = r1.f317730w
            if (r3 != 0) goto L_0x0327
            java.lang.String r3 = "MicroMsg.Voip.VoipDeviceHandler"
            java.lang.String r5 = "startOpenslPlayer, some errors occurred during opensl startup, just return"
            z33.C112597j.m153937b(r3, r5)
            goto L_0x036f
        L_0x0327:
            java.lang.Object r5 = r1.f317715h
            monitor-enter(r5)
            com.tencent.mm.plugin.voip.model.r r3 = r1.f317711d     // Catch:{ all -> 0x03c3 }
            com.tencent.mm.plugin.voip.model.v2protocal r3 = r3.f317500x     // Catch:{ all -> 0x03c3 }
            boolean r8 = r3.f317580K1     // Catch:{ all -> 0x03c3 }
            if (r8 == 0) goto L_0x0367
            int r3 = r3.startAudioPlayer()     // Catch:{ Exception -> 0x0356 }
            r1.f317729v = r3     // Catch:{ Exception -> 0x0356 }
            com.tencent.mm.plugin.voip.model.r r8 = r1.f317711d     // Catch:{ all -> 0x03c3 }
            com.tencent.mm.plugin.voip.model.v2protocal r8 = r8.f317500x     // Catch:{ all -> 0x03c3 }
            r8.f317581L = r3     // Catch:{ all -> 0x03c3 }
            int r3 = r8.getOpenslErrorCode()     // Catch:{ all -> 0x03c3 }
            r1.f317728u = r3     // Catch:{ all -> 0x03c3 }
            int r8 = r1.f317729v     // Catch:{ all -> 0x03c3 }
            if (r8 != 0) goto L_0x034a
            if (r3 == 0) goto L_0x0367
        L_0x034a:
            java.lang.String r3 = "MicroMsg.Voip.VoipDeviceHandler"
            java.lang.String r8 = "seenli, opensl startAudioPlayer return failed"
            z33.C112597j.m153937b(r3, r8)     // Catch:{ all -> 0x03c3 }
            r1.f317716i = r6     // Catch:{ all -> 0x03c3 }
            r1.f317730w = r0     // Catch:{ all -> 0x03c3 }
            goto L_0x0367
        L_0x0356:
            java.lang.String r3 = "MicroMsg.Voip.VoipDeviceHandler"
            java.lang.String r8 = "seenli, try opensl startAudioPlayer failed"
            z33.C112597j.m153937b(r3, r8)     // Catch:{ all -> 0x03c3 }
            r1.f317716i = r6     // Catch:{ all -> 0x03c3 }
            r3 = 103(0x67, float:1.44E-43)
            r1.f317728u = r3     // Catch:{ all -> 0x03c3 }
            r1.f317730w = r0     // Catch:{ all -> 0x03c3 }
            monitor-exit(r5)     // Catch:{ all -> 0x03c3 }
            goto L_0x036f
        L_0x0367:
            monitor-exit(r5)     // Catch:{ all -> 0x03c3 }
            java.lang.String r3 = "MicroMsg.Voip.VoipDeviceHandler"
            java.lang.String r5 = "seenli, startOpenslPlayer done!"
            z33.C112597j.m153938c(r3, r5)
        L_0x036f:
            int r3 = r1.f317730w
            if (r3 != 0) goto L_0x037b
            java.lang.String r3 = "MicroMsg.Voip.VoipDeviceHandler"
            java.lang.String r5 = "startOpenslRecorder, some errors occurred during opensl startup, just return"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r3, r5)
            goto L_0x03d4
        L_0x037b:
            java.lang.Object r3 = r1.f317715h
            monitor-enter(r3)
            com.tencent.mm.plugin.voip.model.r r5 = r1.f317711d     // Catch:{ Exception -> 0x03b0 }
            com.tencent.mm.plugin.voip.model.v2protocal r5 = r5.f317500x     // Catch:{ Exception -> 0x03b0 }
            int r5 = r5.startAudioRecorder()     // Catch:{ Exception -> 0x03b0 }
            r1.f317729v = r5     // Catch:{ Exception -> 0x03b0 }
            com.tencent.mm.plugin.voip.model.r r8 = r1.f317711d     // Catch:{ all -> 0x03ae }
            com.tencent.mm.plugin.voip.model.v2protocal r8 = r8.f317500x     // Catch:{ all -> 0x03ae }
            r8.f317578K = r5     // Catch:{ all -> 0x03ae }
            int r5 = r8.getOpenslErrorCode()     // Catch:{ all -> 0x03ae }
            r1.f317728u = r5     // Catch:{ all -> 0x03ae }
            int r8 = r1.f317729v     // Catch:{ all -> 0x03ae }
            if (r8 != 0) goto L_0x039a
            if (r5 == 0) goto L_0x03a5
        L_0x039a:
            java.lang.String r5 = "MicroMsg.Voip.VoipDeviceHandler"
            java.lang.String r8 = "seenli, opensl startAudioRecorder return failed"
            z33.C112597j.m153937b(r5, r8)     // Catch:{ all -> 0x03ae }
            r1.f317716i = r6     // Catch:{ all -> 0x03ae }
            r1.f317730w = r0     // Catch:{ all -> 0x03ae }
        L_0x03a5:
            monitor-exit(r3)     // Catch:{ all -> 0x03ae }
            java.lang.String r3 = "MicroMsg.Voip.VoipDeviceHandler"
            java.lang.String r5 = "seenli, startOpenslRecorder done!"
            z33.C112597j.m153938c(r3, r5)
            goto L_0x03d4
        L_0x03ae:
            r0 = move-exception
            goto L_0x03c1
        L_0x03b0:
            java.lang.String r5 = "MicroMsg.Voip.VoipDeviceHandler"
            java.lang.String r8 = "seenli, try opensl startAudioRecorder failed"
            z33.C112597j.m153937b(r5, r8)     // Catch:{ all -> 0x03ae }
            r1.f317716i = r6     // Catch:{ all -> 0x03ae }
            r5 = 104(0x68, float:1.46E-43)
            r1.f317728u = r5     // Catch:{ all -> 0x03ae }
            r1.f317730w = r0     // Catch:{ all -> 0x03ae }
            monitor-exit(r3)     // Catch:{ all -> 0x03ae }
            goto L_0x03d4
        L_0x03c1:
            monitor-exit(r3)     // Catch:{ all -> 0x03ae }
            throw r0
        L_0x03c3:
            r0 = move-exception
            monitor-exit(r5)     // Catch:{ all -> 0x03c3 }
            throw r0
        L_0x03c6:
            r0 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x03c6 }
            throw r0
        L_0x03c9:
            r1.f317730w = r0
            r1.f317726s = r0
            java.lang.String r3 = "MicroMsg.Voip.VoipDeviceHandler"
            java.lang.String r5 = "direct use audiotrack..."
            z33.C112597j.m153938c(r3, r5)
        L_0x03d4:
            int r3 = r1.f317726s
            if (r3 != r6) goto L_0x0414
            int r3 = r1.f317729v
            if (r3 != 0) goto L_0x03e4
            int r3 = r1.f317728u
            if (r3 != 0) goto L_0x03e4
            int r3 = r1.f317730w
            if (r3 != 0) goto L_0x0414
        L_0x03e4:
            r1.f317730w = r0
            com.tencent.mm.plugin.voip.model.r r3 = r1.f317711d
            com.tencent.mm.plugin.voip.model.v2protocal r3 = r3.f317500x
            r3.releaseAudioDevice()
            com.tencent.mm.plugin.voip.model.d r3 = r1.f317708a
            java.lang.String r5 = "MicroMsg.Voip.VoipDeviceHandler"
            if (r3 == 0) goto L_0x0404
            com.tencent.mm.plugin.voip.model.d r3 = r1.f317708a
            r3.mo152546e()
            com.tencent.mm.plugin.voip.model.d r3 = r1.f317708a
            r3.mo152547f()
            r1.f317708a = r4
            java.lang.String r3 = "seenli, releasePlayer..."
            z33.C112597j.m153938c(r5, r3)
        L_0x0404:
            qh.f r3 = r1.f317709b
            if (r3 == 0) goto L_0x0414
            qh.f r3 = r1.f317709b
            r3.mo161907l()
            r1.f317709b = r4
            java.lang.String r3 = "seenli, releaseRecorder..."
            z33.C112597j.m153938c(r5, r3)
        L_0x0414:
            int r3 = r1.f317730w
            if (r3 != 0) goto L_0x0540
            java.lang.String r3 = "MicroMsg.Voip.VoipDeviceHandler"
            java.lang.String r4 = "seenli, opensles init error or not used, let us start audiotrack"
            z33.C112597j.m153938c(r3, r4)
            int r3 = r1.f317726s
            if (r3 != r6) goto L_0x0425
            r1.f317727t = r2
        L_0x0425:
            java.lang.Object r2 = r1.f317715h
            monitor-enter(r2)
            int r3 = r1.f317710c     // Catch:{ all -> 0x053d }
            if (r3 != r7) goto L_0x0436
            java.lang.String r0 = "MicroMsg.Voip.VoipDeviceHandler"
            java.lang.String r3 = "current is not allowed to start dev"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r0, r3)     // Catch:{ all -> 0x053d }
            monitor-exit(r2)     // Catch:{ all -> 0x053d }
            goto L_0x050b
        L_0x0436:
            com.tencent.mm.plugin.voip.model.d r3 = new com.tencent.mm.plugin.voip.model.d     // Catch:{ all -> 0x053d }
            r3.<init>()     // Catch:{ all -> 0x053d }
            r1.f317708a = r3     // Catch:{ all -> 0x053d }
            com.tencent.mm.plugin.voip.model.d r3 = r1.f317708a     // Catch:{ all -> 0x053d }
            long r4 = r1.f317725r     // Catch:{ all -> 0x053d }
            r3.getClass()     // Catch:{ all -> 0x053d }
            java.lang.String r4 = java.lang.String.valueOf(r4)     // Catch:{ all -> 0x053d }
            r3.f317215t = r4     // Catch:{ all -> 0x053d }
            com.tencent.mm.plugin.voip.model.a r3 = new com.tencent.mm.plugin.voip.model.a     // Catch:{ all -> 0x053d }
            r3.<init>()     // Catch:{ all -> 0x053d }
            com.tencent.mm.plugin.voip.model.r r4 = r1.f317711d     // Catch:{ all -> 0x053d }
            com.tencent.mm.plugin.voip.model.v2protocal r4 = r4.f317500x     // Catch:{ all -> 0x053d }
            int r4 = r4.mo152761b(r3)     // Catch:{ all -> 0x053d }
            java.lang.String r5 = "MicroMsg.Voip.VoipDeviceHandler"
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ all -> 0x053d }
            r7.<init>()     // Catch:{ all -> 0x053d }
            java.lang.String r8 = "  VoipDeivceHandler.GetAudioDeviceFmt, play samplerate:"
            r7.append(r8)     // Catch:{ all -> 0x053d }
            int r8 = r3.f317170b     // Catch:{ all -> 0x053d }
            r7.append(r8)     // Catch:{ all -> 0x053d }
            java.lang.String r8 = ", framelen: "
            r7.append(r8)     // Catch:{ all -> 0x053d }
            int r8 = r3.f317171c     // Catch:{ all -> 0x053d }
            r7.append(r8)     // Catch:{ all -> 0x053d }
            java.lang.String r8 = ", ret:"
            r7.append(r8)     // Catch:{ all -> 0x053d }
            r7.append(r4)     // Catch:{ all -> 0x053d }
            java.lang.String r4 = r7.toString()     // Catch:{ all -> 0x053d }
            z33.C112597j.m153938c(r5, r4)     // Catch:{ all -> 0x053d }
            com.tencent.mm.plugin.voip.model.d r4 = r1.f317708a     // Catch:{ all -> 0x053d }
            int r5 = r3.f317170b     // Catch:{ all -> 0x053d }
            int r7 = r3.f317169a     // Catch:{ all -> 0x053d }
            int r3 = r3.f317171c     // Catch:{ all -> 0x053d }
            r4.mo152544c(r5, r7, r3, r0)     // Catch:{ all -> 0x053d }
            nj.g$a r3 = new nj.g$a     // Catch:{ all -> 0x053d }
            r3.<init>()     // Catch:{ all -> 0x053d }
            r3.mo72289b()     // Catch:{ all -> 0x053d }
            com.tencent.mm.plugin.voip.model.d r4 = r1.f317708a     // Catch:{ all -> 0x053d }
            com.tencent.mm.plugin.voip.model.r r5 = r1.f317711d     // Catch:{ all -> 0x053d }
            android.content.Context r5 = r5.f317501y     // Catch:{ all -> 0x053d }
            int r4 = r4.mo152543b(r5, r6)     // Catch:{ all -> 0x053d }
            long r7 = r3.mo72288a()     // Catch:{ all -> 0x053d }
            r3.mo72289b()     // Catch:{ all -> 0x053d }
            com.tencent.mm.plugin.voip.model.r r3 = r1.f317711d     // Catch:{ all -> 0x053d }
            com.tencent.mm.plugin.voip.model.v2protocal r3 = r3.f317500x     // Catch:{ all -> 0x053d }
            int r5 = (int) r7     // Catch:{ all -> 0x053d }
            r3.f317607V = r5     // Catch:{ all -> 0x053d }
            com.tencent.mm.plugin.voip.model.d r5 = r1.f317708a     // Catch:{ all -> 0x053d }
            int r5 = r5.mo152548g()     // Catch:{ all -> 0x053d }
            r3.f317621b0 = r5     // Catch:{ all -> 0x053d }
            com.tencent.mm.plugin.voip.model.r r3 = r1.f317711d     // Catch:{ all -> 0x053d }
            com.tencent.mm.plugin.voip.model.v2protocal r3 = r3.f317500x     // Catch:{ all -> 0x053d }
            int r5 = pu0.C110248b.xx0()     // Catch:{ all -> 0x053d }
            r3.f317611X = r5     // Catch:{ all -> 0x053d }
            com.tencent.mm.plugin.voip.model.r r3 = r1.f317711d     // Catch:{ all -> 0x053d }
            com.tencent.mm.plugin.voip.model.v2protocal r3 = r3.f317500x     // Catch:{ all -> 0x053d }
            com.tencent.mm.plugin.voip.model.d r5 = r1.f317708a     // Catch:{ all -> 0x053d }
            int r5 = r5.f317199d     // Catch:{ all -> 0x053d }
            r3.f317636g0 = r5     // Catch:{ all -> 0x053d }
            com.tencent.mm.plugin.voip.model.d r3 = r1.f317708a     // Catch:{ all -> 0x053d }
            boolean r3 = r3.f317197b     // Catch:{ all -> 0x053d }
            byte[] r5 = new byte[r6]     // Catch:{ all -> 0x053d }
            if (r3 == 0) goto L_0x04d2
            r3 = 1
            goto L_0x04d3
        L_0x04d2:
            r3 = 0
        L_0x04d3:
            byte r3 = (byte) r3     // Catch:{ all -> 0x053d }
            r5[r0] = r3     // Catch:{ all -> 0x053d }
            com.tencent.mm.plugin.voip.model.r r3 = r1.f317711d     // Catch:{ all -> 0x053d }
            com.tencent.mm.plugin.voip.model.v2protocal r3 = r3.f317500x     // Catch:{ all -> 0x053d }
            r7 = 502(0x1f6, float:7.03E-43)
            r3.setAppCmd(r7, r5, r6)     // Catch:{ all -> 0x053d }
            if (r4 > 0) goto L_0x04e3
            r1.f317716i = r6     // Catch:{ all -> 0x053d }
        L_0x04e3:
            com.tencent.mm.plugin.voip.model.h0 r3 = l33.C109247e.xx0()     // Catch:{ all -> 0x053d }
            boolean r4 = pu0.C110248b.zx0()     // Catch:{ all -> 0x053d }
            if (r4 != 0) goto L_0x04f3
            boolean r4 = pu0.C110248b.Jh0()     // Catch:{ all -> 0x053d }
            if (r4 == 0) goto L_0x04f4
        L_0x04f3:
            r0 = 1
        L_0x04f4:
            r3.mo152592F(r0)     // Catch:{ all -> 0x053d }
            com.tencent.mm.plugin.voip.model.d r0 = r1.f317708a     // Catch:{ all -> 0x053d }
            com.tencent.mm.plugin.voip.model.y$$c r3 = new com.tencent.mm.plugin.voip.model.y$$c     // Catch:{ all -> 0x053d }
            r3.<init>(r1)     // Catch:{ all -> 0x053d }
            r0.f317212q = r3     // Catch:{ all -> 0x053d }
            com.tencent.mm.plugin.voip.model.d r0 = r1.f317708a     // Catch:{ all -> 0x053d }
            int r0 = r0.mo152545d()     // Catch:{ all -> 0x053d }
            if (r0 > 0) goto L_0x050a
            r1.f317716i = r6     // Catch:{ all -> 0x053d }
        L_0x050a:
            monitor-exit(r2)     // Catch:{ all -> 0x053d }
        L_0x050b:
            java.lang.Object r3 = r1.f317715h
            monitor-enter(r3)
            com.tencent.mm.sdk.platformtools.MMHandler r0 = r1.f317724q     // Catch:{ all -> 0x053a }
            com.tencent.mm.plugin.voip.model.y$$b r2 = new com.tencent.mm.plugin.voip.model.y$$b     // Catch:{ all -> 0x053a }
            r2.<init>(r1)     // Catch:{ all -> 0x053a }
            r0.post(r2)     // Catch:{ all -> 0x053a }
            monitor-exit(r3)     // Catch:{ all -> 0x053a }
            int r0 = r1.f317716i
            if (r0 != r6) goto L_0x051f
            r1.f317727t = r6
        L_0x051f:
            com.tencent.mm.plugin.voip.model.r r7 = r1.f317711d
            int r8 = r1.f317726s
            int r9 = r1.f317727t
            int r10 = r1.f317728u
            int r11 = r19.mo152858e()
            int r12 = r19.mo152857d()
            r7.mo152722y(r8, r9, r10, r11, r12)
            java.lang.String r0 = "MicroMsg.Voip.VoipDeviceHandler"
            java.lang.String r2 = "seenli, audiotrack was started successfully."
            z33.C112597j.m153938c(r0, r2)
            goto L_0x05a8
        L_0x053a:
            r0 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x053a }
            throw r0
        L_0x053d:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x053d }
            throw r0
        L_0x0540:
            com.tencent.mm.plugin.voip.model.r r2 = r1.f317711d
            com.tencent.mm.plugin.voip.model.v2protocal r2 = r2.f317500x
            int r3 = r1.f317731x
            int r3 = r1.mo152864k(r3)
            r2.f317615Z = r3
            com.tencent.mm.plugin.voip.model.r r2 = r1.f317711d
            com.tencent.mm.plugin.voip.model.v2protocal r2 = r2.f317500x
            int r3 = pu0.C110248b.xx0()
            r2.f317611X = r3
            com.tencent.mm.plugin.voip.model.r r2 = r1.f317711d
            com.tencent.mm.plugin.voip.model.v2protocal r2 = r2.f317500x
            r3 = -1
            r2.f317636g0 = r3
            r2.f317639h0 = r3
            int r3 = r2.OpenslPlayerCostInitTime()
            r2.f317607V = r3
            com.tencent.mm.plugin.voip.model.r r2 = r1.f317711d
            com.tencent.mm.plugin.voip.model.v2protocal r2 = r2.f317500x
            int r3 = r2.OpenslRecorderCostInitTime()
            r2.f317609W = r3
            r1.f317716i = r0
            com.tencent.mm.plugin.voip.model.r r2 = r1.f317711d
            com.tencent.mm.plugin.voip.model.v2protocal r2 = r2.f317500x
            int r0 = java.lang.Math.abs(r0)
            r2.f317575J = r0
            com.tencent.mm.plugin.voip.model.r r7 = r1.f317711d
            int r8 = r1.f317726s
            int r9 = r1.f317727t
            int r10 = r1.f317728u
            r11 = 0
            r12 = 0
            r7.mo152722y(r8, r9, r10, r11, r12)
            com.tencent.mm.plugin.voip.model.r r0 = r1.f317711d
            com.tencent.mm.plugin.voip.model.v2protocal r0 = r0.f317500x
            com.tencent.mm.plugin.voip.model.z r0 = r0.f317568G1
            r0.f317781j = r6
            java.lang.Class<dn.k> r0 = p492dn.C107053k.class
            di3.d r0 = di3.C86312j.m106911c(r0)
            dn.k r0 = (p492dn.C107053k) r0
            int r2 = r1.f317731x
            int r2 = r1.mo152864k(r2)
            r0.mo146065oS(r6, r2)
            java.lang.String r0 = "MicroMsg.Voip.VoipDeviceHandler"
            java.lang.String r2 = "seenli, opensl was started successfully."
            z33.C112597j.m153938c(r0, r2)
        L_0x05a8:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.voip.model.C106400y.mo152861h():void");
    }

    /* renamed from: i */
    public final void mo152862i() {
        C106330a aVar = new C106330a();
        int b = this.f317711d.f317500x.mo152761b(aVar);
        C112597j.m153938c("MicroMsg.Voip.VoipDeviceHandler", "  VoipDeivceHandler.GetAudioDeviceFmt, record samplerate:" + aVar.f317170b + ", framelen: " + aVar.f317171c + ", ret:" + b);
        this.f317709b = new C110390f(aVar.f317170b, aVar.f317169a, 1);
        this.f317709b.mo161902g(aVar.f317171c);
        this.f317709b.f330218E = String.valueOf(C109247e.xx0().mo152616o());
        this.f317709b.mo161905j(true);
        this.f317709b.mo161901f(true);
        this.f317709b.f330234m = -19;
        this.f317709b.mo161903h(1, false);
        this.f317709b.mo161904i(true);
        this.f317709b.f330245x = this.f317702F;
        if (!this.f317709b.mo161906k() && this.f317709b.f330222a != 13) {
            this.f317716i = 1;
        }
        v2protocal v2protocal = this.f317711d.f317500x;
        AudioRecord audioRecord = this.f317709b.f330244w;
        v2protocal.f317615Z = audioRecord != null ? audioRecord.getAudioSource() : -1;
        this.f317711d.f317500x.f317609W = (int) this.f317709b.f330219F;
        this.f317711d.f317500x.f317611X = C110248b.xx0();
        C112597j.m153936a("MicroMsg.Voip.VoipDeviceHandler", "  VoipDeivceHandler.m_iAudioDevErr:" + this.f317716i);
        C106377r rVar = this.f317711d;
        int i = this.f317716i;
        rVar.f317500x.f317575J = Math.abs(i);
        if (i != 0) {
            rVar.f317502z.mo152419B();
        }
        this.f317711d.f317500x.f317568G1.f317781j = 1;
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(7:15|16|17|(1:21)|22|23|24) */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x0148, code lost:
        return;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:23:0x0059 */
    /* renamed from: j */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized void mo152863j() {
        /*
            r6 = this;
            monitor-enter(r6)
            java.lang.String r0 = "MicroMsg.Voip.VoipDeviceHandler"
            java.lang.String r1 = "stopDev, recorder: %s"
            r2 = 1
            java.lang.Object[] r3 = new java.lang.Object[r2]     // Catch:{ all -> 0x0149 }
            qh.f r4 = r6.f317709b     // Catch:{ all -> 0x0149 }
            r5 = 0
            r3[r5] = r4     // Catch:{ all -> 0x0149 }
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r0, r1, r3)     // Catch:{ all -> 0x0149 }
            int r0 = r6.f317710c     // Catch:{ all -> 0x0149 }
            r1 = 3
            if (r0 != r1) goto L_0x002c
            java.lang.String r0 = "MicroMsg.Voip.VoipDeviceHandler"
            java.lang.String r1 = "devcie stoped already."
            z33.C112597j.m153937b(r0, r1)     // Catch:{ all -> 0x0149 }
            int r0 = r6.f317730w     // Catch:{ all -> 0x0149 }
            if (r0 != r2) goto L_0x0027
            com.tencent.mm.plugin.voip.model.r r0 = r6.f317711d     // Catch:{ all -> 0x0149 }
            com.tencent.mm.plugin.voip.model.v2protocal r0 = r0.f317500x     // Catch:{ all -> 0x0149 }
            r0.releaseAudioDevice()     // Catch:{ all -> 0x0149 }
        L_0x0027:
            r6.mo152854a()     // Catch:{ all -> 0x0149 }
            monitor-exit(r6)
            return
        L_0x002c:
            java.lang.String r0 = "MicroMsg.Voip.VoipDeviceHandler"
            java.lang.String r3 = "stop device.."
            z33.C112597j.m153938c(r0, r3)     // Catch:{ all -> 0x0149 }
            r6.f317710c = r1     // Catch:{ all -> 0x0149 }
            com.tencent.mm.plugin.voip.model.y$$e r0 = r6.f317703G     // Catch:{ all -> 0x0149 }
            if (r0 == 0) goto L_0x0061
            java.lang.String r0 = "MicroMsg.Voip.VoipDeviceHandler"
            java.lang.String r1 = "stop videodecode thread.."
            z33.C112597j.m153936a(r0, r1)     // Catch:{ all -> 0x0149 }
            com.tencent.mm.plugin.voip.model.y$$e r0 = r6.f317703G     // Catch:{ all -> 0x0149 }
            r0.getClass()     // Catch:{ all -> 0x0149 }
            com.tencent.mm.plugin.voip.model.y r1 = r0.f317745o     // Catch:{ Exception -> 0x0059 }
            com.tencent.mm.plugin.voip.model.r r1 = r1.f317711d     // Catch:{ Exception -> 0x0059 }
            if (r1 == 0) goto L_0x0052
            com.tencent.mm.plugin.voip.model.s0 r1 = r1.f317502z     // Catch:{ Exception -> 0x0059 }
            if (r1 == 0) goto L_0x0052
            r1.mo152488r0()     // Catch:{ Exception -> 0x0059 }
        L_0x0052:
            r0.f317740g = r2     // Catch:{ Exception -> 0x0059 }
            android.os.ConditionVariable r0 = r0.f317738e     // Catch:{ Exception -> 0x0059 }
            r0.open()     // Catch:{ Exception -> 0x0059 }
        L_0x0059:
            com.tencent.mm.plugin.voip.model.y$$e r0 = r6.f317703G     // Catch:{ all -> 0x0149 }
            r0.mo97819a()     // Catch:{ all -> 0x0149 }
            r0 = 0
            r6.f317703G = r0     // Catch:{ all -> 0x0149 }
        L_0x0061:
            boolean r0 = z33.C112595h.m153919e()     // Catch:{ all -> 0x0149 }
            r6.f317701E = r0     // Catch:{ all -> 0x0149 }
            r6.f317720m = r2     // Catch:{ all -> 0x0149 }
            r6.f317721n = r2     // Catch:{ all -> 0x0149 }
            r0 = 0
            r6.f317722o = r0     // Catch:{ all -> 0x0149 }
            r6.f317723p = r0     // Catch:{ all -> 0x0149 }
            r6.f317712e = r0     // Catch:{ all -> 0x0149 }
            r6.f317713f = r0     // Catch:{ all -> 0x0149 }
            r6.f317714g = r2     // Catch:{ all -> 0x0149 }
            r6.f317716i = r5     // Catch:{ all -> 0x0149 }
            int r0 = r6.f317730w     // Catch:{ all -> 0x0149 }
            if (r0 != r2) goto L_0x00c8
            com.tencent.mm.plugin.voip.model.r r0 = r6.f317711d     // Catch:{ all -> 0x0149 }
            com.tencent.mm.plugin.voip.model.v2protocal r0 = r0.f317500x     // Catch:{ all -> 0x0149 }
            int r1 = r6.f317731x     // Catch:{ all -> 0x0149 }
            int r1 = r6.mo152864k(r1)     // Catch:{ all -> 0x0149 }
            r0.f317618a0 = r1     // Catch:{ all -> 0x0149 }
            com.tencent.mm.plugin.voip.model.r r0 = r6.f317711d     // Catch:{ all -> 0x0149 }
            com.tencent.mm.plugin.voip.model.v2protocal r0 = r0.f317500x     // Catch:{ all -> 0x0149 }
            int r1 = r6.f317732y     // Catch:{ all -> 0x0149 }
            r0.f317627d0 = r1     // Catch:{ all -> 0x0149 }
            int r1 = r0.OpenslPlayCallBackNum()     // Catch:{ all -> 0x0149 }
            r0.f317593P = r1     // Catch:{ all -> 0x0149 }
            com.tencent.mm.plugin.voip.model.r r0 = r6.f317711d     // Catch:{ all -> 0x0149 }
            com.tencent.mm.plugin.voip.model.v2protocal r0 = r0.f317500x     // Catch:{ all -> 0x0149 }
            int r1 = r0.OpenslRecordCallBackNum()     // Catch:{ all -> 0x0149 }
            r0.f317590O = r1     // Catch:{ all -> 0x0149 }
            com.tencent.mm.plugin.voip.model.r r0 = r6.f317711d     // Catch:{ all -> 0x0149 }
            com.tencent.mm.plugin.voip.model.v2protocal r0 = r0.f317500x     // Catch:{ all -> 0x0149 }
            int r1 = r6.mo152856c()     // Catch:{ all -> 0x0149 }
            r0.f317633f0 = r1     // Catch:{ all -> 0x0149 }
            com.tencent.mm.plugin.voip.model.r r0 = r6.f317711d     // Catch:{ all -> 0x0149 }
            com.tencent.mm.plugin.voip.model.v2protocal r0 = r0.f317500x     // Catch:{ all -> 0x0149 }
            int r1 = pu0.C110248b.xx0()     // Catch:{ all -> 0x0149 }
            r0.f317613Y = r1     // Catch:{ all -> 0x0149 }
            com.tencent.mm.plugin.voip.model.r r0 = r6.f317711d     // Catch:{ all -> 0x0149 }
            com.tencent.mm.plugin.voip.model.v2protocal r0 = r0.f317500x     // Catch:{ all -> 0x0149 }
            r0.releaseAudioDevice()     // Catch:{ all -> 0x0149 }
            r6.mo152854a()     // Catch:{ all -> 0x0149 }
            java.lang.String r0 = "MicroMsg.Voip.VoipDeviceHandler"
            java.lang.String r1 = "opensl stopDev finished"
            z33.C112597j.m153938c(r0, r1)     // Catch:{ all -> 0x0149 }
            goto L_0x0147
        L_0x00c8:
            com.tencent.mm.plugin.voip.model.r r0 = r6.f317711d     // Catch:{ all -> 0x0149 }
            com.tencent.mm.plugin.voip.model.v2protocal r0 = r0.f317500x     // Catch:{ all -> 0x0149 }
            int r1 = r6.mo152858e()     // Catch:{ all -> 0x0149 }
            r0.f317578K = r1     // Catch:{ all -> 0x0149 }
            com.tencent.mm.plugin.voip.model.r r0 = r6.f317711d     // Catch:{ all -> 0x0149 }
            com.tencent.mm.plugin.voip.model.v2protocal r0 = r0.f317500x     // Catch:{ all -> 0x0149 }
            int r1 = r6.mo152857d()     // Catch:{ all -> 0x0149 }
            r0.f317581L = r1     // Catch:{ all -> 0x0149 }
            com.tencent.mm.plugin.voip.model.r r0 = r6.f317711d     // Catch:{ all -> 0x0149 }
            com.tencent.mm.plugin.voip.model.v2protocal r0 = r0.f317500x     // Catch:{ all -> 0x0149 }
            qh.f r1 = r6.f317709b     // Catch:{ all -> 0x0149 }
            if (r1 == 0) goto L_0x00f5
            com.tencent.mm.plugin.voip.model.r r1 = r6.f317711d     // Catch:{ all -> 0x0149 }
            com.tencent.mm.plugin.voip.model.v2protocal r1 = r1.f317500x     // Catch:{ all -> 0x0149 }
            com.tencent.mm.plugin.voip.model.z r1 = r1.f317568G1     // Catch:{ all -> 0x0149 }
            byte r1 = r1.f317781j     // Catch:{ all -> 0x0149 }
            if (r1 != r2) goto L_0x00f5
            qh.f r1 = r6.f317709b     // Catch:{ all -> 0x0149 }
            int r1 = r1.mo161897b()     // Catch:{ all -> 0x0149 }
            goto L_0x00f6
        L_0x00f5:
            r1 = -2
        L_0x00f6:
            r0.f317590O = r1     // Catch:{ all -> 0x0149 }
            com.tencent.mm.plugin.voip.model.r r0 = r6.f317711d     // Catch:{ all -> 0x0149 }
            com.tencent.mm.plugin.voip.model.v2protocal r0 = r0.f317500x     // Catch:{ all -> 0x0149 }
            int r1 = r6.mo152855b()     // Catch:{ all -> 0x0149 }
            r0.f317593P = r1     // Catch:{ all -> 0x0149 }
            com.tencent.mm.plugin.voip.model.r r0 = r6.f317711d     // Catch:{ all -> 0x0149 }
            com.tencent.mm.plugin.voip.model.v2protocal r0 = r0.f317500x     // Catch:{ all -> 0x0149 }
            qh.f r1 = r6.f317709b     // Catch:{ all -> 0x0149 }
            r2 = -1
            if (r1 == 0) goto L_0x0116
            qh.f r1 = r6.f317709b     // Catch:{ all -> 0x0149 }
            android.media.AudioRecord r1 = r1.f330244w     // Catch:{ all -> 0x0149 }
            if (r1 == 0) goto L_0x0116
            int r1 = r1.getAudioSource()     // Catch:{ all -> 0x0149 }
            goto L_0x0117
        L_0x0116:
            r1 = -1
        L_0x0117:
            r0.f317618a0 = r1     // Catch:{ all -> 0x0149 }
            com.tencent.mm.plugin.voip.model.r r0 = r6.f317711d     // Catch:{ all -> 0x0149 }
            com.tencent.mm.plugin.voip.model.v2protocal r0 = r0.f317500x     // Catch:{ all -> 0x0149 }
            com.tencent.mm.plugin.voip.model.d r1 = r6.f317708a     // Catch:{ all -> 0x0149 }
            if (r1 == 0) goto L_0x0127
            com.tencent.mm.plugin.voip.model.d r1 = r6.f317708a     // Catch:{ all -> 0x0149 }
            int r2 = r1.mo152548g()     // Catch:{ all -> 0x0149 }
        L_0x0127:
            r0.f317627d0 = r2     // Catch:{ all -> 0x0149 }
            com.tencent.mm.plugin.voip.model.r r0 = r6.f317711d     // Catch:{ all -> 0x0149 }
            com.tencent.mm.plugin.voip.model.v2protocal r0 = r0.f317500x     // Catch:{ all -> 0x0149 }
            int r1 = r6.mo152856c()     // Catch:{ all -> 0x0149 }
            r0.f317633f0 = r1     // Catch:{ all -> 0x0149 }
            com.tencent.mm.plugin.voip.model.r r0 = r6.f317711d     // Catch:{ all -> 0x0149 }
            com.tencent.mm.plugin.voip.model.v2protocal r0 = r0.f317500x     // Catch:{ all -> 0x0149 }
            int r1 = pu0.C110248b.xx0()     // Catch:{ all -> 0x0149 }
            r0.f317613Y = r1     // Catch:{ all -> 0x0149 }
            r6.mo152854a()     // Catch:{ all -> 0x0149 }
            java.lang.String r0 = "MicroMsg.Voip.VoipDeviceHandler"
            java.lang.String r1 = "audiotrack stopDev finished"
            z33.C112597j.m153938c(r0, r1)     // Catch:{ all -> 0x0149 }
        L_0x0147:
            monitor-exit(r6)
            return
        L_0x0149:
            r0 = move-exception
            monitor-exit(r6)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.voip.model.C106400y.mo152863j():void");
    }

    /* renamed from: k */
    public final int mo152864k(int i) {
        if (i < 0) {
            return -1;
        }
        if (i == 1) {
            return 1;
        }
        if (i == 2) {
            return 5;
        }
        if (i == 3) {
            return 6;
        }
        if (i != 4) {
            return i != 5 ? -1 : 9;
        }
        return 7;
    }
}

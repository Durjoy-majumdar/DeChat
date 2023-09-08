package s50;

import android.opengl.GLES20;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MTimerHandler;
import com.tencent.p014mm.xeffect.IWeJsonMessageCallback;
import fy3.C32226l;
import gy3.C8480h;
import gy3.C87412m;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;
import java.util.ArrayList;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.opengles.GL10;
import p80.C110194c;
import q00.C110264g;
import rx3.C13598b0;
import s80.C110780c;
import u80.C111139a;
import u80.C111141c;
import u80.C111143e;
import u80.C111144f;
import w80.C111742d;

/* renamed from: s50.u */
public final class C110760u extends C110780c {

    /* renamed from: A */
    public int f331271A;

    /* renamed from: B */
    public int f331272B;

    /* renamed from: C */
    public int f331273C;

    /* renamed from: D */
    public IWeJsonMessageCallback f331274D;

    /* renamed from: E */
    public C110743c0 f331275E;

    /* renamed from: F */
    public FloatBuffer f331276F;

    /* renamed from: G */
    public FloatBuffer f331277G;

    /* renamed from: H */
    public C36624a f331278H;

    /* renamed from: I */
    public C63699b f331279I;

    /* renamed from: J */
    public int f331280J;

    /* renamed from: K */
    public C32226l<? super Integer, C13598b0> f331281K;

    /* renamed from: L */
    public C32226l<? super Integer, C13598b0> f331282L;

    /* renamed from: M */
    public MTimerHandler f331283M;

    /* renamed from: N */
    public int f331284N;

    /* renamed from: t */
    public boolean f331285t;

    /* renamed from: u */
    public ArrayList<C111139a> f331286u = new ArrayList<>();

    /* renamed from: v */
    public C110754q f331287v;

    /* renamed from: w */
    public C110194c f331288w;

    /* renamed from: x */
    public int f331289x;

    /* renamed from: y */
    public int f331290y;

    /* renamed from: z */
    public int f331291z;

    public C110760u(boolean z) {
        super(2, 0, 2, (C8480h) null);
        this.f331285t = z;
        C111742d.C111743a aVar = C111742d.f334647a;
        FloatBuffer asFloatBuffer = ByteBuffer.allocateDirect(32).order(ByteOrder.nativeOrder()).asFloatBuffer();
        C87412m.m108593f(asFloatBuffer, "allocateDirect(GLEnviron…eOrder()).asFloatBuffer()");
        this.f331276F = asFloatBuffer;
        C111742d.C111743a aVar2 = C111742d.f334647a;
        FloatBuffer asFloatBuffer2 = ByteBuffer.allocateDirect(32).order(ByteOrder.nativeOrder()).asFloatBuffer();
        C87412m.m108593f(asFloatBuffer2, "allocateDirect(GLEnviron…eOrder()).asFloatBuffer()");
        this.f331277G = asFloatBuffer2;
        this.f331284N = 1;
    }

    /* renamed from: f */
    public C111139a mo157952f() {
        C110264g gVar;
        C110743c0 c0Var = new C110743c0();
        IWeJsonMessageCallback iWeJsonMessageCallback = this.f331274D;
        c0Var.f331222h = iWeJsonMessageCallback;
        C110742c cVar = c0Var.f331216b;
        if (!(cVar == null || (gVar = cVar.f331212e) == null)) {
            gVar.mo143236d(iWeJsonMessageCallback);
        }
        this.f331275E = c0Var;
        return this.f331285t ? new C111144f(this.f331376a, this.f331377b, this.f331291z, this.f331271A, this.f331380e, this.f331381f) : new C111141c(this.f331376a, this.f331377b, this.f331291z, this.f331271A, this.f331380e, this.f331381f);
    }

    /* renamed from: g */
    public C110194c mo157953g() {
        C110194c cVar = this.f331288w;
        if (cVar != null) {
            int i = this.f331272B;
            int i2 = this.f331273C;
            cVar.f329657j = i;
            cVar.f329658n = i2;
        }
        return cVar;
    }

    /* renamed from: m */
    public void mo159588m(boolean z) {
        Log.m105924i("MicroMsg.LiveTexEditRenderer", "mirror mirrorMode:" + this.f331284N + " mirror:" + z);
        C110754q qVar = this.f331287v;
        if (qVar != null) {
            qVar.f332760o = false;
        }
        super.mo159588m(false);
        C110743c0 c0Var = this.f331275E;
        if (c0Var != null) {
            Log.m105924i("MicroMsg.LiveYTFaceBeautyRendererProgram", "setMirror " + z);
            c0Var.f331221g = z;
            C110742c cVar = c0Var.f331216b;
            if (cVar != null) {
                Log.m105924i("MicroMsg.LiveFilterProcessTex", "setMirror " + z);
                cVar.f331214g = z;
            }
        }
    }

    /* renamed from: n */
    public void mo157956n(boolean z) {
        super.mo157956n(z);
        for (C111139a l : this.f331286u) {
            l.mo158471l();
        }
        C110194c cVar = this.f331288w;
        if (cVar != null) {
            cVar.close();
        }
        C110754q qVar = this.f331287v;
        if (qVar != null) {
            qVar.mo158471l();
        }
        C110743c0 c0Var = this.f331275E;
        if (c0Var != null) {
            C111143e eVar = c0Var.f331217c;
            if (eVar != null) {
                eVar.mo158471l();
            }
            C110194c cVar2 = c0Var.f331215a;
            if (cVar2 != null) {
                cVar2.close();
            }
            C110742c cVar3 = c0Var.f331216b;
            if (cVar3 != null) {
                Log.m105925i("MicroMsg.LiveFilterProcessTex", "clear %s %d", cVar3, Long.valueOf(Thread.currentThread().getId()));
                try {
                    C110194c cVar4 = cVar3.f331209b;
                    if (cVar4 != null) {
                        cVar4.close();
                    }
                    C110264g gVar = cVar3.f331212e;
                    if (gVar != null) {
                        gVar.destroy();
                        cVar3.f331212e = null;
                    }
                } catch (Exception e) {
                    Log.printErrStackTrace("MicroMsg.LiveFilterProcessTex", e, "clear error: %s", e.getMessage());
                }
            }
            GLES20.glDeleteProgram(c0Var.f331218d);
        }
        MTimerHandler mTimerHandler = this.f331283M;
        if (mTimerHandler != null) {
            mTimerHandler.stopTimer();
        }
        MTimerHandler mTimerHandler2 = this.f331283M;
        if (mTimerHandler2 != null) {
            mTimerHandler2.quit();
        }
    }

    public void onSurfaceChanged(GL10 gl10, int i, int i2) {
        this.f331291z = i;
        this.f331271A = i2;
        C110754q qVar = this.f331287v;
        if (qVar != null) {
            qVar.mo158522s(i, i2);
        }
        mo162277v();
        C111139a aVar = this.f331382g;
        if (aVar != null) {
            aVar.f332759n = true;
        }
    }

    public void onSurfaceCreated(GL10 gl10, EGLConfig eGLConfig) {
        super.onSurfaceCreated(gl10, eGLConfig);
        this.f331287v = new C110754q(this.f331376a, this.f331377b, this.f331291z, this.f331271A);
    }

    /* JADX WARNING: Removed duplicated region for block: B:102:0x0217  */
    /* JADX WARNING: Removed duplicated region for block: B:122:0x02de  */
    /* JADX WARNING: Removed duplicated region for block: B:129:0x02fb  */
    /* JADX WARNING: Removed duplicated region for block: B:135:0x0307  */
    /* JADX WARNING: Removed duplicated region for block: B:138:0x0313  */
    /* JADX WARNING: Removed duplicated region for block: B:143:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x01a0  */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x01b2  */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x01c4  */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x01d6  */
    /* renamed from: p */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo157957p() {
        /*
            r43 = this;
            r1 = r43
            long r2 = com.tencent.p014mm.sdk.platformtools.Util.currentTicks()
            super.mo157957p()
            s50.c0 r4 = r1.f331275E
            r5 = -1
            java.lang.Integer r0 = java.lang.Integer.valueOf(r5)
            r6 = 1
            r7 = 0
            if (r4 == 0) goto L_0x02cd
            int r8 = r1.f331378c
            int r9 = r1.f331379d
            java.nio.FloatBuffer r10 = r1.f331277G
            java.nio.FloatBuffer r11 = r1.f331276F
            u80.a r12 = r1.f331382g
            gy3.C87412m.m108591d(r12)
            p80.c r12 = r12.f332754i
            gy3.C87412m.m108591d(r12)
            s50.a r13 = r1.f331278H
            r15 = 2
            r5 = 0
            if (r13 != 0) goto L_0x006a
            s50.a r13 = new s50.a
            r13.<init>(r7, r6, r7)
            java.util.HashMap<java.lang.Integer, java.lang.Integer> r7 = r13.f97362a
            java.lang.Integer r14 = java.lang.Integer.valueOf(r5)
            r7.put(r14, r0)
            java.util.HashMap<java.lang.Integer, java.lang.Integer> r7 = r13.f97362a
            java.lang.Integer r14 = java.lang.Integer.valueOf(r6)
            r7.put(r14, r0)
            java.util.HashMap<java.lang.Integer, java.lang.Integer> r7 = r13.f97362a
            r14 = 4
            java.lang.Integer r14 = java.lang.Integer.valueOf(r14)
            r7.put(r14, r0)
            java.util.HashMap<java.lang.Integer, java.lang.Integer> r7 = r13.f97362a
            java.lang.Integer r14 = java.lang.Integer.valueOf(r15)
            r7.put(r14, r0)
            java.util.HashMap<java.lang.Integer, java.lang.Integer> r7 = r13.f97362a
            r14 = 5
            java.lang.Integer r14 = java.lang.Integer.valueOf(r14)
            r7.put(r14, r0)
            java.util.HashMap<java.lang.Integer, java.lang.Integer> r7 = r13.f97362a
            r14 = 3
            java.lang.Integer r15 = java.lang.Integer.valueOf(r14)
            r7.put(r15, r0)
        L_0x006a:
            s50.b r0 = r1.f331279I
            if (r0 != 0) goto L_0x0077
            s50.b r0 = new s50.b
            java.lang.String r7 = ""
            r14 = -1
            r0.<init>(r14, r7, r14)
            goto L_0x0078
        L_0x0077:
            r14 = -1
        L_0x0078:
            java.lang.String r7 = "cubeBuffer"
            gy3.C87412m.m108594g(r10, r7)
            java.lang.String r7 = "textureCoordBuff"
            gy3.C87412m.m108594g(r11, r7)
            int r7 = r12.f329652e
            if (r7 == r14) goto L_0x02c8
            int r10 = r4.f331219e
            java.lang.String r11 = "MicroMsg.LiveFilterProcessTex"
            if (r10 == 0) goto L_0x0096
            int r14 = r4.f331220f
            if (r14 != 0) goto L_0x0091
            goto L_0x0096
        L_0x0091:
            r17 = r2
            r13 = -1
            goto L_0x0213
        L_0x0096:
            p80.c r14 = r4.f331215a
            r17 = r2
            r2 = 18
            if (r14 != 0) goto L_0x01f4
            p80.c r2 = p80.C110193b.m149776b(r6, r2)
            r4.f331215a = r2
            s50.c r2 = new s50.c
            r2.<init>()
            r4.f331216b = r2
            s50.c r2 = r4.f331216b
            if (r2 == 0) goto L_0x019b
            p80.c r3 = r4.f331215a
            gy3.C87412m.m108591d(r3)
            boolean r10 = r4.f331221g
            java.lang.StringBuilder r14 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0191 }
            r14.<init>()     // Catch:{ Exception -> 0x0191 }
            java.lang.String r15 = "initial isMirror:"
            r14.append(r15)     // Catch:{ Exception -> 0x0191 }
            r14.append(r10)     // Catch:{ Exception -> 0x0191 }
            java.lang.String r15 = ", %s, %d, beauytParams:%s"
            r14.append(r15)     // Catch:{ Exception -> 0x0191 }
            java.lang.String r14 = r14.toString()     // Catch:{ Exception -> 0x0191 }
            r15 = 3
            java.lang.Object[] r15 = new java.lang.Object[r15]     // Catch:{ Exception -> 0x0191 }
            r15[r5] = r2     // Catch:{ Exception -> 0x0191 }
            java.lang.Thread r16 = java.lang.Thread.currentThread()     // Catch:{ Exception -> 0x0191 }
            long r19 = r16.getId()     // Catch:{ Exception -> 0x0191 }
            java.lang.Long r16 = java.lang.Long.valueOf(r19)     // Catch:{ Exception -> 0x0191 }
            r15[r6] = r16     // Catch:{ Exception -> 0x0191 }
            r16 = 2
            r15[r16] = r13     // Catch:{ Exception -> 0x0191 }
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r11, r14, r15)     // Catch:{ Exception -> 0x0191 }
            r2.f331214g = r10     // Catch:{ Exception -> 0x0191 }
            q00.g r10 = r2.f331212e     // Catch:{ Exception -> 0x0191 }
            if (r10 == 0) goto L_0x00f9
            java.lang.String r10 = "initial xLabEffect: again"
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r11, r10)     // Catch:{ Exception -> 0x0191 }
            q00.g r10 = r2.f331212e     // Catch:{ Exception -> 0x0191 }
            gy3.C87412m.m108591d(r10)     // Catch:{ Exception -> 0x0191 }
            r10.destroy()     // Catch:{ Exception -> 0x0191 }
        L_0x00f9:
            boolean r10 = r13.f97363b     // Catch:{ Exception -> 0x0191 }
            if (r10 == 0) goto L_0x0100
            q00.g$a r10 = q00.C110264g.C47730a.APP_LIVEVLOG_HIGHRANK     // Catch:{ Exception -> 0x0191 }
            goto L_0x0102
        L_0x0100:
            q00.g$a r10 = q00.C110264g.C47730a.APP_LIVEVLOG     // Catch:{ Exception -> 0x0191 }
        L_0x0102:
            java.lang.Class<q00.i> r14 = q00.C62571i.class
            di3.d r14 = di3.C86312j.m106911c(r14)     // Catch:{ Exception -> 0x0191 }
            q00.i r14 = (q00.C62571i) r14     // Catch:{ Exception -> 0x0191 }
            q00.g r10 = r14.eo0(r6, r10)     // Catch:{ Exception -> 0x0191 }
            r2.f331212e = r10     // Catch:{ Exception -> 0x0191 }
            if (r10 != 0) goto L_0x0113
            goto L_0x0116
        L_0x0113:
            r10.mo143256w(r6)     // Catch:{ Exception -> 0x0191 }
        L_0x0116:
            q00.g r10 = r2.f331212e     // Catch:{ Exception -> 0x0191 }
            gy3.C87412m.m108591d(r10)     // Catch:{ Exception -> 0x0191 }
            r10.mo143233a(r5)     // Catch:{ Exception -> 0x0191 }
            r2.mo162264b(r13)     // Catch:{ Exception -> 0x0191 }
            java.lang.StringBuilder r10 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0191 }
            r10.<init>()     // Catch:{ Exception -> 0x0191 }
            java.lang.String r14 = "#initial Beauty "
            r10.append(r14)     // Catch:{ Exception -> 0x0191 }
            r10.append(r13)     // Catch:{ Exception -> 0x0191 }
            java.lang.String r10 = r10.toString()     // Catch:{ Exception -> 0x0191 }
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r11, r10)     // Catch:{ Exception -> 0x0191 }
            int r10 = r0.f180568c     // Catch:{ Exception -> 0x0191 }
            if (r10 < 0) goto L_0x0143
            java.lang.String r10 = r0.f180567b     // Catch:{ Exception -> 0x0191 }
            boolean r10 = com.tencent.p014mm.vfs.C86013q1.m106450k(r10)     // Catch:{ Exception -> 0x0191 }
            if (r10 == 0) goto L_0x0143
            r10 = 1
            goto L_0x0144
        L_0x0143:
            r10 = 0
        L_0x0144:
            java.lang.StringBuilder r13 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0191 }
            r13.<init>()     // Catch:{ Exception -> 0x0191 }
            java.lang.String r14 = "#initial Filter "
            r13.append(r14)     // Catch:{ Exception -> 0x0191 }
            java.lang.String r14 = r0.f180567b     // Catch:{ Exception -> 0x0191 }
            r13.append(r14)     // Catch:{ Exception -> 0x0191 }
            java.lang.String r14 = ", "
            r13.append(r14)     // Catch:{ Exception -> 0x0191 }
            int r14 = r0.f180568c     // Catch:{ Exception -> 0x0191 }
            r13.append(r14)     // Catch:{ Exception -> 0x0191 }
            java.lang.String r13 = r13.toString()     // Catch:{ Exception -> 0x0191 }
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r11, r13)     // Catch:{ Exception -> 0x0191 }
            if (r10 == 0) goto L_0x0179
            q00.g r10 = r2.f331212e     // Catch:{ Exception -> 0x0191 }
            gy3.C87412m.m108591d(r10)     // Catch:{ Exception -> 0x0191 }
            java.lang.String r13 = r0.f180567b     // Catch:{ Exception -> 0x0191 }
            int r0 = r0.f180568c     // Catch:{ Exception -> 0x0191 }
            float r0 = (float) r0     // Catch:{ Exception -> 0x0191 }
            r14 = 1120403456(0x42c80000, float:100.0)
            float r0 = r0 / r14
            r10.mo143239f(r13, r0)     // Catch:{ Exception -> 0x0191 }
            goto L_0x0179
        L_0x0177:
            r13 = -1
            goto L_0x0193
        L_0x0179:
            r2.f331208a = r7     // Catch:{ Exception -> 0x0191 }
            r2.f331209b = r3     // Catch:{ Exception -> 0x0191 }
            int r0 = r2.f331213f     // Catch:{ Exception -> 0x0191 }
            r13 = -1
            if (r0 == r13) goto L_0x0185
            r2.mo162263a(r0)     // Catch:{ Exception -> 0x018f }
        L_0x0185:
            java.lang.String r0 = "initial end %s"
            java.lang.Object[] r3 = new java.lang.Object[r6]     // Catch:{ Exception -> 0x018f }
            r3[r5] = r2     // Catch:{ Exception -> 0x018f }
            com.tencent.p014mm.sdk.platformtools.Log.m105919d(r11, r0, r3)     // Catch:{ Exception -> 0x018f }
            goto L_0x019c
        L_0x018f:
            r0 = move-exception
            goto L_0x0193
        L_0x0191:
            r0 = move-exception
            goto L_0x0177
        L_0x0193:
            java.lang.Object[] r2 = new java.lang.Object[r5]
            java.lang.String r3 = "initial error"
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r11, r0, r3, r2)
            goto L_0x019c
        L_0x019b:
            r13 = -1
        L_0x019c:
            ac3.p r0 = r4.f331223i
            if (r0 == 0) goto L_0x01ae
            s50.c r2 = r4.f331216b
            if (r2 == 0) goto L_0x01ab
            q00.g r2 = r2.f331212e
            if (r2 == 0) goto L_0x01ab
            r0.mo74671d(r2)
        L_0x01ab:
            r0.reload()
        L_0x01ae:
            ac3.o r0 = r4.f331224j
            if (r0 == 0) goto L_0x01c0
            s50.c r2 = r4.f331216b
            if (r2 == 0) goto L_0x01bd
            q00.g r2 = r2.f331212e
            if (r2 == 0) goto L_0x01bd
            r0.mo74671d(r2)
        L_0x01bd:
            r0.reload()
        L_0x01c0:
            ac3.m r0 = r4.f331225k
            if (r0 == 0) goto L_0x01d2
            s50.c r2 = r4.f331216b
            if (r2 == 0) goto L_0x01cf
            q00.g r2 = r2.f331212e
            if (r2 == 0) goto L_0x01cf
            r0.mo74671d(r2)
        L_0x01cf:
            r0.reload()
        L_0x01d2:
            ac3.n r0 = r4.f331226l
            if (r0 == 0) goto L_0x01e4
            s50.c r2 = r4.f331216b
            if (r2 == 0) goto L_0x01e1
            q00.g r2 = r2.f331212e
            if (r2 == 0) goto L_0x01e1
            r0.mo74671d(r2)
        L_0x01e1:
            r0.reload()
        L_0x01e4:
            com.tencent.mm.xeffect.IWeJsonMessageCallback r0 = r4.f331222h
            if (r0 == 0) goto L_0x020f
            s50.c r2 = r4.f331216b
            if (r2 == 0) goto L_0x020f
            q00.g r2 = r2.f331212e
            if (r2 == 0) goto L_0x020f
            r2.mo143236d(r0)
            goto L_0x020f
        L_0x01f4:
            r13 = -1
            if (r10 != r8) goto L_0x01fb
            int r0 = r4.f331220f
            if (r0 == r9) goto L_0x020f
        L_0x01fb:
            r14.close()
            p80.c r0 = p80.C110193b.m149776b(r6, r2)
            r4.f331215a = r0
            s50.c r0 = r4.f331216b
            if (r0 == 0) goto L_0x020f
            p80.c r2 = r4.f331215a
            gy3.C87412m.m108591d(r2)
            r0.f331209b = r2
        L_0x020f:
            r4.f331219e = r8
            r4.f331220f = r9
        L_0x0213:
            s50.c r0 = r4.f331216b
            if (r0 == 0) goto L_0x02c5
            int r2 = r4.f331219e
            int r3 = r4.f331220f
            int r7 = r0.f331211d
            if (r3 != r7) goto L_0x0223
            int r7 = r0.f331210c
            if (r2 == r7) goto L_0x0237
        L_0x0223:
            r7 = 2
            java.lang.Object[] r7 = new java.lang.Object[r7]
            java.lang.Integer r8 = java.lang.Integer.valueOf(r2)
            r7[r5] = r8
            java.lang.Integer r8 = java.lang.Integer.valueOf(r3)
            r7[r6] = r8
            java.lang.String r8 = "updateTextureSize:%s, %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r11, r8, r7)
        L_0x0237:
            r0.f331210c = r2
            r0.f331211d = r3
            q00.g r7 = r0.f331212e
            if (r7 == 0) goto L_0x0242
            r7.mo143224C(r2, r3)
        L_0x0242:
            int r2 = r12.f329652e
            r0.f331208a = r2
            long r2 = com.tencent.p014mm.sdk.platformtools.Util.currentTicks()
            q00.g r7 = r0.f331212e     // Catch:{ Exception -> 0x02ac }
            gy3.C87412m.m108591d(r7)     // Catch:{ Exception -> 0x02ac }
            boolean r8 = r0.f331214g     // Catch:{ Exception -> 0x02ac }
            r7.mo143245l(r8)     // Catch:{ Exception -> 0x02ac }
            q00.g r7 = r0.f331212e     // Catch:{ Exception -> 0x02ac }
            gy3.C87412m.m108591d(r7)     // Catch:{ Exception -> 0x02ac }
            int r8 = r0.f331208a     // Catch:{ Exception -> 0x02ac }
            r21 = 0
            r22 = 0
            r23 = 6
            r24 = 0
            r19 = r7
            r20 = r8
            q00.C110264g.C110265b.m149906a(r19, r20, r21, r22, r23, r24)     // Catch:{ Exception -> 0x02ac }
            p80.c r7 = r0.f331209b     // Catch:{ Exception -> 0x02ac }
            gy3.C87412m.m108591d(r7)     // Catch:{ Exception -> 0x02ac }
            int r8 = r0.f331210c     // Catch:{ Exception -> 0x02ac }
            int r9 = r0.f331211d     // Catch:{ Exception -> 0x02ac }
            r28 = 6408(0x1908, float:8.98E-42)
            r29 = 0
            r30 = 9729(0x2601, float:1.3633E-41)
            r31 = 10497(0x2901, float:1.471E-41)
            r25 = r7
            r26 = r8
            r27 = r9
            r25.mo161594a(r26, r27, r28, r29, r30, r31)     // Catch:{ Exception -> 0x02ac }
            q00.g r7 = r0.f331212e     // Catch:{ Exception -> 0x02ac }
            gy3.C87412m.m108591d(r7)     // Catch:{ Exception -> 0x02ac }
            int r8 = r0.f331208a     // Catch:{ Exception -> 0x02ac }
            p80.c r9 = r0.f331209b     // Catch:{ Exception -> 0x02ac }
            gy3.C87412m.m108591d(r9)     // Catch:{ Exception -> 0x02ac }
            int r9 = r9.f329652e     // Catch:{ Exception -> 0x02ac }
            r35 = 0
            r37 = 0
            r38 = 0
            r39 = 0
            boolean r0 = r0.f331214g     // Catch:{ Exception -> 0x02ac }
            r41 = 8
            r42 = 0
            r32 = r7
            r33 = r8
            r34 = r9
            r40 = r0
            q00.C110264g.C110265b.m149907b(r32, r33, r34, r35, r37, r38, r39, r40, r41, r42)     // Catch:{ Exception -> 0x02ac }
            goto L_0x02b4
        L_0x02ac:
            r0 = move-exception
            java.lang.Object[] r7 = new java.lang.Object[r5]
            java.lang.String r8 = "filterProcess error"
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r11, r0, r8, r7)
        L_0x02b4:
            java.lang.Object[] r0 = new java.lang.Object[r6]
            long r2 = com.tencent.p014mm.sdk.platformtools.Util.ticksToNow(r2)
            java.lang.Long r2 = java.lang.Long.valueOf(r2)
            r0[r5] = r2
            java.lang.String r2 = "filterProcess: cost %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105919d(r11, r2, r0)
        L_0x02c5:
            p80.c r7 = r4.f331215a
            goto L_0x02d0
        L_0x02c8:
            r17 = r2
            r13 = -1
            r7 = r12
            goto L_0x02d0
        L_0x02cd:
            r17 = r2
            r13 = -1
        L_0x02d0:
            r1.f331288w = r7
            java.util.ArrayList<u80.a> r0 = r1.f331286u
            java.util.Iterator r0 = r0.iterator()
        L_0x02d8:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L_0x02f7
            java.lang.Object r2 = r0.next()
            u80.a r2 = (u80.C111139a) r2
            p80.c r3 = r1.f331288w
            if (r3 == 0) goto L_0x02eb
            int r14 = r3.f329652e
            goto L_0x02ec
        L_0x02eb:
            r14 = -1
        L_0x02ec:
            r2.mo159578p(r14)
            r2.mo162879m()
            p80.c r2 = r2.f332754i
            r1.f331288w = r2
            goto L_0x02d8
        L_0x02f7:
            s50.q r0 = r1.f331287v
            if (r0 == 0) goto L_0x0305
            p80.c r2 = r1.f331288w
            if (r2 == 0) goto L_0x0302
            int r5 = r2.f329652e
            goto L_0x0303
        L_0x0302:
            r5 = -1
        L_0x0303:
            r0.f332822G = r5
        L_0x0305:
            if (r0 == 0) goto L_0x030a
            r0.mo162879m()
        L_0x030a:
            int r0 = r1.f331280J
            int r0 = r0 + r6
            r1.f331280J = r0
            fy3.l<? super java.lang.Integer, rx3.b0> r0 = r1.f331282L
            if (r0 == 0) goto L_0x0322
            long r2 = com.tencent.p014mm.sdk.platformtools.Util.ticksToNow(r17)
            int r3 = (int) r2
            java.lang.Integer r2 = java.lang.Integer.valueOf(r3)
            java.lang.Object r0 = r0.invoke(r2)
            rx3.b0 r0 = (rx3.C13598b0) r0
        L_0x0322:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: s50.C110760u.mo157957p():void");
    }

    /* renamed from: r */
    public void mo159589r(int i) {
        super.mo159589r(i);
        mo162277v();
    }

    /* renamed from: t */
    public void mo159590t(int i, int i2) {
        C110754q qVar = this.f331287v;
        if (qVar != null) {
            qVar.mo158522s(i, i2);
        }
    }

    /* renamed from: u */
    public void mo159591u(int i, int i2) {
        super.mo159591u(i, i2);
        mo162277v();
    }

    /* renamed from: v */
    public final void mo162277v() {
        int i;
        int i2 = this.f331291z;
        if (i2 > 0 && (i = this.f331376a) > 0) {
            int i3 = this.f331389n;
            boolean z = i3 == 90 || i3 == 270;
            int i4 = z ? this.f331377b : i;
            this.f331272B = i4;
            if (!z) {
                i = this.f331377b;
            }
            this.f331273C = i;
            float f = ((float) i2) / ((float) i4);
            int i5 = this.f331271A;
            float f2 = ((float) i5) / ((float) i);
            if (f < f2) {
                this.f331289x = i4 - (i4 - ((int) (((float) i2) / f2)));
                this.f331290y = i;
            } else if (f > f2) {
                this.f331290y = i - (i - ((int) (((float) i5) / f)));
                this.f331289x = i4;
            } else {
                this.f331290y = i;
                this.f331289x = i4;
            }
            Log.m105924i("MicroMsg.LiveTexEditRenderer", "calculate crop texture width:" + this.f331289x + " height:" + this.f331290y);
            for (C111139a aVar : this.f331286u) {
                aVar.mo143263u(this.f331289x, this.f331290y);
                aVar.mo143263u(this.f331289x, this.f331290y);
            }
            super.mo159590t(this.f331272B, this.f331273C);
            C110754q qVar = this.f331287v;
            if (qVar != null) {
                qVar.mo143263u(this.f331272B, this.f331273C);
            }
        }
    }
}

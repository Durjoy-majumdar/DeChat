package rh2;

import android.graphics.Rect;
import android.opengl.EGLContext;
import android.os.Bundle;
import com.tencent.p014mm.plugin.recordvideo.jumper.RecordConfigProvider;
import com.tencent.p014mm.plugin.sight.base.C94554a;
import com.tencent.p014mm.plugin.sight.base.C94555d;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.vfs.C86013q1;
import di3.C86312j;
import g80.C107766b;
import gy3.C8480h;
import gy3.C87412m;
import h81.C32735h;
import h90.C98324b;
import java.util.ArrayList;
import kotlin.Result;
import m90.C109557d;
import p80.C110194c;
import rx3.C13598b0;
import rx3.C13604l;
import wx3.C15601d;
import wx3.C66218h;
import xx3.C66447b;
import yx3.C66704d;
import yx3.C91590f;

/* renamed from: rh2.b */
public final class C110563b extends C107766b {

    /* renamed from: j */
    public boolean f330697j;

    /* renamed from: n */
    public final boolean f330698n;

    /* renamed from: o */
    public C109557d f330699o;

    /* renamed from: p */
    public RecordConfigProvider f330700p;

    /* renamed from: q */
    public EGLContext f330701q;

    /* renamed from: r */
    public int f330702r;

    /* renamed from: s */
    public int f330703s;

    /* renamed from: t */
    public boolean f330704t;

    /* renamed from: u */
    public long f330705u;

    /* renamed from: v */
    public long f330706v;

    @C91590f(mo125468c = "com.tencent.mm.plugin.recordvideo.recorder.CameraKitRecorder", mo125469f = "CameraKitRecorder.kt", mo125470l = {89}, mo125471m = "glCreate")
    /* renamed from: rh2.b$a */
    public static final class C110564a extends C66704d {

        /* renamed from: d */
        public Object f330707d;

        /* renamed from: e */
        public /* synthetic */ Object f330708e;

        /* renamed from: f */
        public final /* synthetic */ C110563b f330709f;

        /* renamed from: g */
        public int f330710g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C110564a(C110563b bVar, C15601d<? super C110564a> dVar) {
            super(dVar);
            this.f330709f = bVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f330708e = obj;
            this.f330710g |= Integer.MIN_VALUE;
            return this.f330709f.mo149731i(this);
        }
    }

    @C91590f(mo125468c = "com.tencent.mm.plugin.recordvideo.recorder.CameraKitRecorder", mo125469f = "CameraKitRecorder.kt", mo125470l = {160}, mo125471m = "glRelease")
    /* renamed from: rh2.b$b */
    public static final class C110565b extends C66704d {

        /* renamed from: d */
        public Object f330711d;

        /* renamed from: e */
        public /* synthetic */ Object f330712e;

        /* renamed from: f */
        public final /* synthetic */ C110563b f330713f;

        /* renamed from: g */
        public int f330714g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C110565b(C110563b bVar, C15601d<? super C110565b> dVar) {
            super(dVar);
            this.f330713f = bVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f330712e = obj;
            this.f330714g |= Integer.MIN_VALUE;
            return this.f330713f.mo149730b(this);
        }
    }

    @C91590f(mo125468c = "com.tencent.mm.plugin.recordvideo.recorder.CameraKitRecorder", mo125469f = "CameraKitRecorder.kt", mo125470l = {119, 135}, mo125471m = "glRender")
    /* renamed from: rh2.b$c */
    public static final class C110566c extends C66704d {

        /* renamed from: d */
        public Object f330715d;

        /* renamed from: e */
        public Object f330716e;

        /* renamed from: f */
        public /* synthetic */ Object f330717f;

        /* renamed from: g */
        public final /* synthetic */ C110563b f330718g;

        /* renamed from: h */
        public int f330719h;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C110566c(C110563b bVar, C15601d<? super C110566c> dVar) {
            super(dVar);
            this.f330718g = bVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f330717f = obj;
            this.f330719h |= Integer.MIN_VALUE;
            return this.f330718g.mo149729a((C110194c) null, this);
        }
    }

    /* renamed from: rh2.b$d */
    public static final class C110567d implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ boolean f330720d;

        /* renamed from: e */
        public final /* synthetic */ C110563b f330721e;

        public C110567d(boolean z, C110563b bVar) {
            this.f330720d = z;
            this.f330721e = bVar;
        }

        public final void run() {
            Log.m105924i("MicroMsg.CameraKitRecorder", "initProvider reCreate:" + this.f330720d + " mediaRecorder:" + this.f330721e.f330699o);
            if (this.f330720d || this.f330721e.f330699o == null) {
                C109557d dVar = this.f330721e.f330699o;
                if (dVar != null) {
                    dVar.cancel();
                }
                C109557d dVar2 = this.f330721e.f330699o;
                if (dVar2 != null) {
                    dVar2.clear();
                }
                this.f330721e.mo162056g();
            }
        }
    }

    /* renamed from: rh2.b$e */
    public static final class C110568e implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ C110563b f330722d;

        public C110568e(C110563b bVar) {
            this.f330722d = bVar;
        }

        public final void run() {
            this.f330722d.mo162056g();
        }
    }

    /* renamed from: rh2.b$f */
    public static final class C110569f implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ C110563b f330723d;

        /* renamed from: e */
        public final /* synthetic */ long f330724e;

        /* renamed from: f */
        public final /* synthetic */ C15601d<C13604l<Integer, C98324b>> f330725f;

        public C110569f(C110563b bVar, long j, C15601d<? super C13604l<Integer, C98324b>> dVar) {
            this.f330723d = bVar;
            this.f330724e = j;
            this.f330725f = dVar;
        }

        public final void run() {
            StringBuilder sb = new StringBuilder();
            sb.append("media recorder stop file exist:");
            C109557d dVar = this.f330723d.f330699o;
            String str = null;
            sb.append(C86013q1.m106450k(dVar != null ? dVar.f327963c : null));
            sb.append(" cost:");
            sb.append(System.currentTimeMillis() - this.f330724e);
            Log.m105924i("MicroMsg.CameraKitRecorder", sb.toString());
            C109557d dVar2 = this.f330723d.f330699o;
            if (C86013q1.m106450k(dVar2 != null ? dVar2.f327963c : null)) {
                C109557d dVar3 = this.f330723d.f330699o;
                C94554a c = C94555d.m119567c(dVar3 != null ? dVar3.f327963c : null, true);
                Log.m105924i("MicroMsg.CameraKitRecorder", "media result info:" + c);
                if (c == null) {
                    C15601d<C13604l<Integer, C98324b>> dVar4 = this.f330725f;
                    Result.Companion companion = Result.Companion;
                    dVar4.resumeWith(Result.m168114constructorimpl(new C13604l(-3, null)));
                    return;
                }
                C98324b bVar = new C98324b((String) null, (String) null, false, 0, 0, (String) null, (String) null, 0, 0, (String) null, (ArrayList) null, (ArrayList) null, false, (Bundle) null, (Rect) null, 0, 65535, (C8480h) null);
                bVar.f288182c = true;
                C109557d dVar5 = this.f330723d.f330699o;
                C87412m.m108591d(dVar5);
                String str2 = dVar5.f327963c;
                C87412m.m108593f(str2, "mediaRecorder!!.filePath");
                bVar.f288180a = str2;
                C109557d dVar6 = this.f330723d.f330699o;
                if (dVar6 != null) {
                    str = dVar6.f327980t;
                }
                if (str == null) {
                    str = "";
                }
                bVar.f288181b = str;
                bVar.f288183d = 0;
                bVar.f288184e = c.f273443a;
                C15601d<C13604l<Integer, C98324b>> dVar7 = this.f330725f;
                Result.Companion companion2 = Result.Companion;
                dVar7.resumeWith(Result.m168114constructorimpl(new C13604l(0, bVar)));
                return;
            }
            C15601d<C13604l<Integer, C98324b>> dVar8 = this.f330725f;
            Result.Companion companion3 = Result.Companion;
            dVar8.resumeWith(Result.m168114constructorimpl(new C13604l(-2, null)));
        }
    }

    public C110563b() {
        this(false, 1, (C8480h) null);
    }

    public C110563b(boolean z) {
        super(false, 1, (C8480h) null);
        this.f330697j = z;
        boolean wf = ((C32735h) C86312j.m106911c(C32735h.class)).mo58784wf(C32735h.C32738b.clicfg_camerakit_record_glfence, false);
        this.f330698n = wf;
        this.f330705u = 1500;
        Log.m105924i("MicroMsg.CameraKitRecorder", "enableGlFence:" + wf);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:28:0x006d, code lost:
        if ((r15 != null && r14.f329652e == r15.f327946L) != false) goto L_0x00b3;
     */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0043  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x006a  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x006c  */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x0102  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x0109  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0022  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object mo149729a(p80.C110194c r14, wx3.C15601d<? super p80.C110194c> r15) {
        /*
            r13 = this;
            boolean r0 = r15 instanceof rh2.C110563b.C110566c
            if (r0 == 0) goto L_0x0013
            r0 = r15
            rh2.b$c r0 = (rh2.C110563b.C110566c) r0
            int r1 = r0.f330719h
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f330719h = r1
            goto L_0x0018
        L_0x0013:
            rh2.b$c r0 = new rh2.b$c
            r0.<init>(r13, r15)
        L_0x0018:
            java.lang.Object r15 = r0.f330717f
            xx3.a r1 = xx3.C15911a.COROUTINE_SUSPENDED
            int r2 = r0.f330719h
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L_0x0043
            if (r2 == r4) goto L_0x0037
            if (r2 != r3) goto L_0x002f
            java.lang.Object r14 = r0.f330715d
            p80.c r14 = (p80.C110194c) r14
            kotlin.ResultKt.throwOnFailure(r15)
            goto L_0x012f
        L_0x002f:
            java.lang.IllegalStateException r14 = new java.lang.IllegalStateException
            java.lang.String r15 = "call to 'resume' before 'invoke' with coroutine"
            r14.<init>(r15)
            throw r14
        L_0x0037:
            java.lang.Object r14 = r0.f330716e
            p80.c r14 = (p80.C110194c) r14
            java.lang.Object r2 = r0.f330715d
            rh2.b r2 = (rh2.C110563b) r2
            kotlin.ResultKt.throwOnFailure(r15)
            goto L_0x0053
        L_0x0043:
            kotlin.ResultKt.throwOnFailure(r15)
            r0.f330715d = r13
            r0.f330716e = r14
            r0.f330719h = r4
            r13.mo158192c()
            if (r14 != r1) goto L_0x0052
            return r1
        L_0x0052:
            r2 = r13
        L_0x0053:
            int r15 = r2.f330702r
            int r5 = r14.f329657j
            r6 = 0
            if (r15 != r5) goto L_0x006f
            int r15 = r2.f330703s
            int r5 = r14.f329658n
            if (r15 != r5) goto L_0x006f
            m90.d r15 = r2.f330699o
            if (r15 == 0) goto L_0x006c
            int r5 = r14.f329652e
            int r15 = r15.f327946L
            if (r5 != r15) goto L_0x006c
            r15 = 1
            goto L_0x006d
        L_0x006c:
            r15 = 0
        L_0x006d:
            if (r15 != 0) goto L_0x00b3
        L_0x006f:
            java.lang.StringBuilder r15 = new java.lang.StringBuilder
            r15.<init>()
            java.lang.String r5 = "input tex:"
            r15.append(r5)
            int r5 = r14.f329652e
            r15.append(r5)
            java.lang.String r5 = " width:"
            r15.append(r5)
            int r5 = r14.f329657j
            r15.append(r5)
            java.lang.String r5 = " height:"
            r15.append(r5)
            int r5 = r14.f329658n
            r15.append(r5)
            java.lang.String r15 = r15.toString()
            java.lang.String r5 = "MicroMsg.CameraKitRecorder"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r5, r15)
            int r15 = r14.f329657j
            r2.f330702r = r15
            int r5 = r14.f329658n
            r2.f330703s = r5
            m90.d r7 = r2.f330699o
            if (r7 == 0) goto L_0x00aa
            r7.mo159612i(r15, r5, r15, r5)
        L_0x00aa:
            m90.d r15 = r2.f330699o
            if (r15 != 0) goto L_0x00af
            goto L_0x00b3
        L_0x00af:
            int r5 = r14.f329652e
            r15.f327946L = r5
        L_0x00b3:
            r0.f330715d = r14
            r15 = 0
            r0.f330716e = r15
            r0.f330719h = r3
            a14.m r15 = new a14.m
            wx3.d r0 = xx3.C66447b.m78392b(r0)
            r15.<init>(r0, r4)
            r15.mo74609p()
            m90.d r0 = r2.f330699o
            if (r0 == 0) goto L_0x00d1
            boolean r0 = r0.mo160783B()
            if (r0 != r4) goto L_0x00d1
            goto L_0x00d2
        L_0x00d1:
            r4 = 0
        L_0x00d2:
            if (r4 == 0) goto L_0x0118
            boolean r0 = r2.f330698n
            r3 = 0
            if (r0 == 0) goto L_0x00fd
            int r0 = w80.C111742d.f334648b
            r5 = -1
            r7 = 3
            if (r0 != r5) goto L_0x00f0
            java.lang.String r0 = "mmkv_gl_key"
            com.tencent.mm.sdk.platformtools.MultiProcessMMKV r0 = com.tencent.p014mm.sdk.platformtools.MultiProcessMMKV.getMMKV(r0)
            java.lang.String r5 = "support_egl_context_client_version"
            int r0 = r0.decodeInt(r5, r7)
            w80.C111742d.f334648b = r0
        L_0x00f0:
            int r0 = w80.C111742d.f334648b
            if (r0 < r7) goto L_0x00fd
            r0 = 37143(0x9117, float:5.2048E-41)
            long r5 = android.opengl.GLES30.glFenceSync(r0, r6)
            r11 = r5
            goto L_0x00fe
        L_0x00fd:
            r11 = r3
        L_0x00fe:
            int r0 = (r11 > r3 ? 1 : (r11 == r3 ? 0 : -1))
            if (r0 != 0) goto L_0x0105
            android.opengl.GLES20.glFinish()
        L_0x0105:
            m90.d r7 = r2.f330699o
            if (r7 == 0) goto L_0x0123
            boolean r10 = r2.f330698n
            rh2.c r0 = new rh2.c
            r0.<init>(r15)
            r7.f327958X = r0
            r8 = 0
            r9 = 0
            r7.mo160787F(r8, r9, r10, r11)
            goto L_0x0123
        L_0x0118:
            kotlin.Result$Companion r0 = kotlin.Result.Companion
            rx3.b0 r0 = rx3.C13598b0.f38549a
            java.lang.Object r0 = kotlin.Result.m168114constructorimpl(r0)
            r15.resumeWith(r0)
        L_0x0123:
            java.lang.Object r15 = r15.mo74608o()
            if (r15 != r1) goto L_0x012a
            goto L_0x012c
        L_0x012a:
            rx3.b0 r15 = rx3.C13598b0.f38549a
        L_0x012c:
            if (r15 != r1) goto L_0x012f
            return r1
        L_0x012f:
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: rh2.C110563b.mo149729a(p80.c, wx3.d):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0033  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0056  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x005d  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0021  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object mo149730b(wx3.C15601d<? super rx3.C13598b0> r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof rh2.C110563b.C110565b
            if (r0 == 0) goto L_0x0013
            r0 = r5
            rh2.b$b r0 = (rh2.C110563b.C110565b) r0
            int r1 = r0.f330714g
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f330714g = r1
            goto L_0x0018
        L_0x0013:
            rh2.b$b r0 = new rh2.b$b
            r0.<init>(r4, r5)
        L_0x0018:
            java.lang.Object r5 = r0.f330712e
            xx3.a r1 = xx3.C15911a.COROUTINE_SUSPENDED
            int r2 = r0.f330714g
            r3 = 1
            if (r2 == 0) goto L_0x0033
            if (r2 != r3) goto L_0x002b
            java.lang.Object r0 = r0.f330711d
            rh2.b r0 = (rh2.C110563b) r0
            kotlin.ResultKt.throwOnFailure(r5)
            goto L_0x004a
        L_0x002b:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L_0x0033:
            kotlin.ResultKt.throwOnFailure(r5)
            java.lang.String r5 = "MicroMsg.CameraKitRecorder"
            java.lang.String r2 = "release"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r5, r2)
            r0.f330711d = r4
            r0.f330714g = r3
            java.lang.Object r5 = super.mo149730b(r0)
            if (r5 != r1) goto L_0x0049
            return r1
        L_0x0049:
            r0 = r4
        L_0x004a:
            r5 = 0
            r0.f330701q = r5
            r5 = 0
            r0.f330702r = r5
            r0.f330703s = r5
            m90.d r5 = r0.f330699o
            if (r5 == 0) goto L_0x0059
            r5.cancel()
        L_0x0059:
            m90.d r5 = r0.f330699o
            if (r5 == 0) goto L_0x0060
            r5.clear()
        L_0x0060:
            rx3.b0 r5 = rx3.C13598b0.f38549a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: rh2.C110563b.mo149730b(wx3.d):java.lang.Object");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x001b, code lost:
        r0 = r0.f272926n;
     */
    /* renamed from: g */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo162056g() {
        /*
            r6 = this;
            com.tencent.mm.plugin.recordvideo.jumper.RecordConfigProvider r0 = r6.f330700p
            if (r0 == 0) goto L_0x0086
            android.opengl.EGLContext r0 = r6.f330701q
            if (r0 == 0) goto L_0x0086
            java.lang.String r0 = "MicroMsg.CameraKitRecorder"
            java.lang.String r1 = "create recorder"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r1)
            m90.d r0 = r6.f330699o
            if (r0 == 0) goto L_0x0016
            r0.cancel()
        L_0x0016:
            com.tencent.mm.plugin.recordvideo.jumper.RecordConfigProvider r0 = r6.f330700p
            r1 = 0
            if (r0 == 0) goto L_0x0024
            com.tencent.mm.modelcontrol.VideoTransPara r0 = r0.f272926n
            if (r0 == 0) goto L_0x0024
            java.lang.Object r0 = r0.clone()
            goto L_0x0025
        L_0x0024:
            r0 = r1
        L_0x0025:
            com.tencent.mm.modelcontrol.VideoTransPara r0 = (com.tencent.p014mm.modelcontrol.VideoTransPara) r0
            if (r0 != 0) goto L_0x002a
            return
        L_0x002a:
            int r2 = r0.f267169g
            com.tencent.mm.plugin.recordvideo.jumper.RecordConfigProvider r3 = r6.f330700p
            r4 = 2
            if (r3 == 0) goto L_0x003b
            android.os.Bundle r3 = r3.f272912M
            if (r3 == 0) goto L_0x003b
            java.lang.String r5 = "key_record_bitrate_ratio"
            int r4 = r3.getInt(r5, r4)
        L_0x003b:
            int r2 = r2 * r4
            r0.f267169g = r2
            m90.d r2 = new m90.d
            rh2.a r3 = new rh2.a
            r3.<init>()
            android.opengl.EGLContext r4 = r6.f330701q
            r5 = -1
            r2.<init>(r0, r3, r4, r5)
            r6.f330699o = r2
            boolean r0 = r6.f330704t
            r2.f327941G = r0
            r0 = 0
            r2.mo159618p(r0)
            m90.d r0 = r6.f330699o
            if (r0 != 0) goto L_0x005b
            goto L_0x0071
        L_0x005b:
            boolean r2 = r6.f330697j
            if (r2 == 0) goto L_0x0067
            hi2.e r2 = hi2.C32925e.f89499a
            r3 = 3
            java.lang.String r2 = hi2.C32925e.m39859d(r2, r1, r1, r3, r1)
            goto L_0x006f
        L_0x0067:
            com.tencent.mm.plugin.recordvideo.jumper.RecordConfigProvider r2 = r6.f330700p
            if (r2 == 0) goto L_0x006e
            java.lang.String r2 = r2.f272900A
            goto L_0x006f
        L_0x006e:
            r2 = r1
        L_0x006f:
            r0.f327963c = r2
        L_0x0071:
            hi2.e r0 = hi2.C32925e.f89499a
            boolean r0 = r0.mo58865f()
            if (r0 != 0) goto L_0x0086
            m90.d r0 = r6.f330699o
            if (r0 != 0) goto L_0x007e
            goto L_0x0086
        L_0x007e:
            com.tencent.mm.plugin.recordvideo.jumper.RecordConfigProvider r2 = r6.f330700p
            if (r2 == 0) goto L_0x0084
            java.lang.String r1 = r2.f272902C
        L_0x0084:
            r0.f327980t = r1
        L_0x0086:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: rh2.C110563b.mo162056g():void");
    }

    /* renamed from: h */
    public final void mo162057h(RecordConfigProvider recordConfigProvider, boolean z) {
        C87412m.m108594g(recordConfigProvider, "configProvider");
        this.f330700p = recordConfigProvider;
        mo158193d(true, new C110567d(z, this));
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0033  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0021  */
    /* renamed from: i */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object mo149731i(wx3.C15601d<? super rx3.C13598b0> r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof rh2.C110563b.C110564a
            if (r0 == 0) goto L_0x0013
            r0 = r5
            rh2.b$a r0 = (rh2.C110563b.C110564a) r0
            int r1 = r0.f330710g
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f330710g = r1
            goto L_0x0018
        L_0x0013:
            rh2.b$a r0 = new rh2.b$a
            r0.<init>(r4, r5)
        L_0x0018:
            java.lang.Object r5 = r0.f330708e
            xx3.a r1 = xx3.C15911a.COROUTINE_SUSPENDED
            int r2 = r0.f330710g
            r3 = 1
            if (r2 == 0) goto L_0x0033
            if (r2 != r3) goto L_0x002b
            java.lang.Object r0 = r0.f330707d
            rh2.b r0 = (rh2.C110563b) r0
            kotlin.ResultKt.throwOnFailure(r5)
            goto L_0x0049
        L_0x002b:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L_0x0033:
            kotlin.ResultKt.throwOnFailure(r5)
            java.lang.String r5 = "MicroMsg.CameraKitRecorder"
            java.lang.String r2 = "create"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r5, r2)
            r0.f330707d = r4
            r0.f330710g = r3
            java.lang.Object r5 = super.mo149731i(r0)
            if (r5 != r1) goto L_0x0048
            return r1
        L_0x0048:
            r0 = r4
        L_0x0049:
            android.opengl.EGLContext r5 = android.opengl.EGL14.eglGetCurrentContext()
            r0.f330701q = r5
            r0.mo162056g()
            rx3.b0 r5 = rx3.C13598b0.f38549a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: rh2.C110563b.mo149731i(wx3.d):java.lang.Object");
    }

    /* renamed from: j */
    public final void mo162058j(boolean z) {
        Log.m105924i("MicroMsg.CameraKitRecorder", "setMute " + z);
        this.f330704t = z;
        C109557d dVar = this.f330699o;
        if (dVar != null) {
            dVar.f327941G = z;
        }
    }

    /* renamed from: k */
    public final boolean mo162059k(int i, boolean z) {
        this.f330706v = System.currentTimeMillis();
        Log.m105924i("MicroMsg.CameraKitRecorder", "startRecord >> " + i + ", " + z + ", " + this.f330706v);
        C109557d dVar = this.f330699o;
        if (dVar == null) {
            return true;
        }
        dVar.mo159632z(0, z, i);
        return true;
    }

    /* renamed from: l */
    public final Object mo162060l(C15601d<? super C13604l<Integer, C98324b>> dVar) {
        C13598b0 b0Var;
        C66218h hVar = new C66218h(C66447b.m78392b(dVar));
        Log.m105924i("MicroMsg.CameraKitRecorder", "stopRecord >> startTime >> " + this.f330706v);
        long currentTimeMillis = System.currentTimeMillis();
        long j = this.f330706v;
        if (currentTimeMillis - j <= this.f330705u || j == 0) {
            this.f330706v = 0;
            reset();
            Result.Companion companion = Result.Companion;
            hVar.resumeWith(Result.m168114constructorimpl(new C13604l(new Integer(-4), null)));
        } else {
            this.f330706v = 0;
            long currentTimeMillis2 = System.currentTimeMillis();
            C109557d dVar2 = this.f330699o;
            if (dVar2 != null) {
                dVar2.mo159616n(new C110569f(this, currentTimeMillis2, hVar));
                b0Var = C13598b0.f38549a;
            } else {
                b0Var = null;
            }
            if (b0Var == null) {
                Result.Companion companion2 = Result.Companion;
                hVar.resumeWith(Result.m168114constructorimpl(new C13604l(new Integer(-1), null)));
            }
        }
        return hVar.mo90314b();
    }

    public final void reset() {
        Log.m105924i("MicroMsg.CameraKitRecorder", "reset");
        this.f330702r = 0;
        this.f330703s = 0;
        C109557d dVar = this.f330699o;
        if (dVar != null && dVar.f327986z) {
            if (dVar != null) {
                dVar.cancel();
            }
            C109557d dVar2 = this.f330699o;
            if (dVar2 != null) {
                dVar2.clear();
            }
            this.f330699o = null;
            synchronized (this.f322532i) {
                this.f322528e.clear();
                C13598b0 b0Var = C13598b0.f38549a;
            }
            C107766b.m146002f(this, false, new C110568e(this), 1, (Object) null);
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C110563b(boolean z, int i, C8480h hVar) {
        this((i & 1) != 0 ? false : z);
    }
}

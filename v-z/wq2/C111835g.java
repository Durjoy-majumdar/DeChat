package wq2;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.opengl.GLES20;
import android.opengl.GLUtils;
import c14.C54624g;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.sns.p104ad.widget.alphavideo.C106152a;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import d14.C58017a1;
import d14.C58085t0;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;
import java.nio.ShortBuffer;
import zt3.C119157j;

/* renamed from: wq2.g */
public class C111835g extends C106152a implements SurfaceTexture.OnFrameAvailableListener {

    /* renamed from: G */
    public static final float[] f334853G = {-1.0f, 1.0f, 0.0f, -1.0f, -1.0f, 0.0f, 1.0f, -1.0f, 0.0f, 1.0f, 1.0f, 0.0f};

    /* renamed from: H */
    public static final short[] f334854H = {0, 1, 2, 0, 2, 3};

    /* renamed from: I */
    public static final float[] f334855I = {0.0f, 1.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.75f, 0.0f, 0.0f, 1.0f, 0.75f, 1.0f, 0.0f, 1.0f};

    /* renamed from: J */
    public static final float[] f334856J = {0.0f, 1.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.5f, 0.0f, 0.0f, 1.0f, 0.5f, 1.0f, 0.0f, 1.0f};

    /* renamed from: A */
    public boolean f334857A = false;

    /* renamed from: B */
    public final int f334858B;

    /* renamed from: C */
    public C58085t0<Boolean> f334859C = C58017a1.m67172a(0, 1, C54624g.DROP_OLDEST);

    /* renamed from: D */
    public long f334860D = 0;

    /* renamed from: E */
    public int f334861E;

    /* renamed from: F */
    public long f334862F = 0;

    /* renamed from: r */
    public final Context f334863r;

    /* renamed from: s */
    public FloatBuffer f334864s;

    /* renamed from: t */
    public final int[] f334865t = new int[1];

    /* renamed from: u */
    public int f334866u;

    /* renamed from: v */
    public FloatBuffer f334867v;

    /* renamed from: w */
    public ShortBuffer f334868w;

    /* renamed from: x */
    public SurfaceTexture f334869x;

    /* renamed from: y */
    public final float[] f334870y;

    /* renamed from: z */
    public boolean f334871z = false;

    public C111835g(Context context, SurfaceTexture surfaceTexture, int i, int i2, int i3) {
        super(surfaceTexture, i, i2);
        this.f334863r = context;
        this.f334870y = new float[16];
        this.f334858B = i3;
        ((C119157j) C119157j.f356862d).mo183870a(this);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:33:?, code lost:
        mo163550f("gl draw texture");
        android.opengl.GLES20.glClearColor(0.0f, 0.0f, 0.0f, 0.0f);
        android.opengl.GLES20.glClear(16384);
        mo163550f("gl draw texture");
        android.opengl.GLES20.glUseProgram(r13.f334866u);
        mo163550f("gl draw texture");
        r1 = android.opengl.GLES20.glGetUniformLocation(r13.f334866u, "texture");
        r2 = android.opengl.GLES20.glGetAttribLocation(r13.f334866u, "vTexCoordinate");
        r3 = android.opengl.GLES20.glGetAttribLocation(r13.f334866u, "vPosition");
        r12 = android.opengl.GLES20.glGetUniformLocation(r13.f334866u, "textureTransform");
        android.opengl.GLES20.glUniform2f(android.opengl.GLES20.glGetUniformLocation(r13.f334866u, "vSurfaceWidth"), (float) r13.f316195i, (float) r13.f316196j);
        android.opengl.GLES20.glEnableVertexAttribArray(r3);
        android.opengl.GLES20.glVertexAttribPointer(r3, 3, 5126, false, 0, r13.f334867v);
        mo163550f("gl draw texture");
        android.opengl.GLES20.glBindTexture(36197, r13.f334865t[0]);
        android.opengl.GLES20.glActiveTexture(33984);
        android.opengl.GLES20.glUniform1i(r1, 0);
        android.opengl.GLES20.glEnableVertexAttribArray(r2);
        android.opengl.GLES20.glVertexAttribPointer(r2, 4, 5126, false, 0, r13.f334864s);
        android.opengl.GLES20.glUniformMatrix4fv(r12, 1, false, r13.f334870y, 0);
        mo163550f("gl draw texture");
        android.opengl.GLES20.glDrawElements(4, 6, 5123, r13.f334868w);
        mo163550f("gl draw texture");
        android.opengl.GLES20.glDisableVertexAttribArray(r3);
        android.opengl.GLES20.glDisableVertexAttribArray(r2);
        android.opengl.GLES20.glEnable(3042);
        android.opengl.GLES20.glBlendFunc(1, 771);
        mo163550f("gl draw texture");
        r13.f334862F = java.lang.System.currentTimeMillis();
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo151901a() {
        /*
            r13 = this;
            java.lang.String r0 = "draw"
            java.lang.String r1 = "com.tencent.mm.plugin.sns.ad.widget.alphavideo.AlphaTextureRenderer"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r0, r1)
            r0 = 1
            monitor-enter(r13)     // Catch:{ all -> 0x0150 }
            boolean r1 = r13.f334871z     // Catch:{ all -> 0x0146 }
            r2 = 16384(0x4000, float:2.2959E-41)
            r3 = 0
            r4 = 0
            if (r1 != 0) goto L_0x006d
            d14.t0<java.lang.Boolean> r1 = r13.f334859C     // Catch:{ all -> 0x0146 }
            if (r1 == 0) goto L_0x001c
            java.lang.Boolean r5 = java.lang.Boolean.FALSE     // Catch:{ all -> 0x0146 }
            d14.z0 r1 = (d14.C58100z0) r1     // Catch:{ all -> 0x0146 }
            r1.mo82832d(r5)     // Catch:{ all -> 0x0146 }
        L_0x001c:
            android.content.Context r1 = r13.f334863r     // Catch:{ all -> 0x0146 }
            boolean r5 = r1 instanceof com.tencent.p014mm.p136ui.MMActivity     // Catch:{ all -> 0x0146 }
            if (r5 == 0) goto L_0x0029
            com.tencent.mm.ui.MMActivity r1 = (com.tencent.p014mm.p136ui.MMActivity) r1     // Catch:{ all -> 0x0146 }
            boolean r1 = r1.isPaused()     // Catch:{ all -> 0x0146 }
            goto L_0x002a
        L_0x0029:
            r1 = 0
        L_0x002a:
            long r5 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x0146 }
            long r7 = r13.f334862F     // Catch:{ all -> 0x0146 }
            long r5 = r5 - r7
            r7 = 500(0x1f4, double:2.47E-321)
            int r9 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r9 < 0) goto L_0x0064
            if (r1 != 0) goto L_0x0064
            java.lang.String r1 = "AlphaTextureRenderer"
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ all -> 0x0146 }
            r5.<init>()     // Catch:{ all -> 0x0146 }
            java.lang.String r6 = "flush without input! mFrameHasAvailabled = "
            r5.append(r6)     // Catch:{ all -> 0x0146 }
            boolean r6 = r13.f334857A     // Catch:{ all -> 0x0146 }
            r5.append(r6)     // Catch:{ all -> 0x0146 }
            java.lang.String r5 = r5.toString()     // Catch:{ all -> 0x0146 }
            wq2.C111836h.m152498e(r1, r5)     // Catch:{ all -> 0x0146 }
            boolean r1 = r13.f334857A     // Catch:{ all -> 0x0146 }
            if (r1 != 0) goto L_0x007e
            android.opengl.GLES20.glClearColor(r3, r3, r3, r3)     // Catch:{ all -> 0x0146 }
            android.opengl.GLES20.glClear(r2)     // Catch:{ all -> 0x0146 }
            monitor-exit(r13)     // Catch:{ all -> 0x0146 }
            java.lang.String r1 = "draw"
            java.lang.String r2 = "com.tencent.mm.plugin.sns.ad.widget.alphavideo.AlphaTextureRenderer"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r1, r2)
            return r0
        L_0x0064:
            monitor-exit(r13)     // Catch:{ all -> 0x0146 }
            java.lang.String r0 = "draw"
            java.lang.String r1 = "com.tencent.mm.plugin.sns.ad.widget.alphavideo.AlphaTextureRenderer"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r1)
            return r4
        L_0x006d:
            android.graphics.SurfaceTexture r1 = r13.f334869x     // Catch:{ Exception -> 0x0137 }
            r1.updateTexImage()     // Catch:{ Exception -> 0x0137 }
            android.graphics.SurfaceTexture r1 = r13.f334869x     // Catch:{ Exception -> 0x0137 }
            float[] r5 = r13.f334870y     // Catch:{ Exception -> 0x0137 }
            r1.getTransformMatrix(r5)     // Catch:{ Exception -> 0x0137 }
            r13.mo163551g()     // Catch:{ all -> 0x0146 }
            r13.f334871z = r4     // Catch:{ all -> 0x0146 }
        L_0x007e:
            monitor-exit(r13)     // Catch:{ all -> 0x0146 }
            java.lang.String r1 = "gl draw texture"
            r13.mo163550f(r1)     // Catch:{ all -> 0x0150 }
            android.opengl.GLES20.glClearColor(r3, r3, r3, r3)     // Catch:{ all -> 0x0150 }
            android.opengl.GLES20.glClear(r2)     // Catch:{ all -> 0x0150 }
            java.lang.String r1 = "gl draw texture"
            r13.mo163550f(r1)     // Catch:{ all -> 0x0150 }
            int r1 = r13.f334866u     // Catch:{ all -> 0x0150 }
            android.opengl.GLES20.glUseProgram(r1)     // Catch:{ all -> 0x0150 }
            java.lang.String r1 = "gl draw texture"
            r13.mo163550f(r1)     // Catch:{ all -> 0x0150 }
            int r1 = r13.f334866u     // Catch:{ all -> 0x0150 }
            java.lang.String r2 = "texture"
            int r1 = android.opengl.GLES20.glGetUniformLocation(r1, r2)     // Catch:{ all -> 0x0150 }
            int r2 = r13.f334866u     // Catch:{ all -> 0x0150 }
            java.lang.String r3 = "vTexCoordinate"
            int r2 = android.opengl.GLES20.glGetAttribLocation(r2, r3)     // Catch:{ all -> 0x0150 }
            int r3 = r13.f334866u     // Catch:{ all -> 0x0150 }
            java.lang.String r5 = "vPosition"
            int r3 = android.opengl.GLES20.glGetAttribLocation(r3, r5)     // Catch:{ all -> 0x0150 }
            int r5 = r13.f334866u     // Catch:{ all -> 0x0150 }
            java.lang.String r6 = "textureTransform"
            int r12 = android.opengl.GLES20.glGetUniformLocation(r5, r6)     // Catch:{ all -> 0x0150 }
            int r5 = r13.f334866u     // Catch:{ all -> 0x0150 }
            java.lang.String r6 = "vSurfaceWidth"
            int r5 = android.opengl.GLES20.glGetUniformLocation(r5, r6)     // Catch:{ all -> 0x0150 }
            int r6 = r13.f316195i     // Catch:{ all -> 0x0150 }
            float r6 = (float) r6     // Catch:{ all -> 0x0150 }
            int r7 = r13.f316196j     // Catch:{ all -> 0x0150 }
            float r7 = (float) r7     // Catch:{ all -> 0x0150 }
            android.opengl.GLES20.glUniform2f(r5, r6, r7)     // Catch:{ all -> 0x0150 }
            android.opengl.GLES20.glEnableVertexAttribArray(r3)     // Catch:{ all -> 0x0150 }
            r7 = 3
            r8 = 5126(0x1406, float:7.183E-42)
            r9 = 0
            r10 = 0
            java.nio.FloatBuffer r11 = r13.f334867v     // Catch:{ all -> 0x0150 }
            r6 = r3
            android.opengl.GLES20.glVertexAttribPointer(r6, r7, r8, r9, r10, r11)     // Catch:{ all -> 0x0150 }
            java.lang.String r5 = "gl draw texture"
            r13.mo163550f(r5)     // Catch:{ all -> 0x0150 }
            r5 = 36197(0x8d65, float:5.0723E-41)
            int[] r6 = r13.f334865t     // Catch:{ all -> 0x0150 }
            r6 = r6[r4]     // Catch:{ all -> 0x0150 }
            android.opengl.GLES20.glBindTexture(r5, r6)     // Catch:{ all -> 0x0150 }
            r5 = 33984(0x84c0, float:4.7622E-41)
            android.opengl.GLES20.glActiveTexture(r5)     // Catch:{ all -> 0x0150 }
            android.opengl.GLES20.glUniform1i(r1, r4)     // Catch:{ all -> 0x0150 }
            android.opengl.GLES20.glEnableVertexAttribArray(r2)     // Catch:{ all -> 0x0150 }
            r6 = 4
            r7 = 5126(0x1406, float:7.183E-42)
            r8 = 0
            r9 = 0
            java.nio.FloatBuffer r10 = r13.f334864s     // Catch:{ all -> 0x0150 }
            r5 = r2
            android.opengl.GLES20.glVertexAttribPointer(r5, r6, r7, r8, r9, r10)     // Catch:{ all -> 0x0150 }
            float[] r1 = r13.f334870y     // Catch:{ all -> 0x0150 }
            android.opengl.GLES20.glUniformMatrix4fv(r12, r0, r4, r1, r4)     // Catch:{ all -> 0x0150 }
            java.lang.String r1 = "gl draw texture"
            r13.mo163550f(r1)     // Catch:{ all -> 0x0150 }
            r1 = 4
            r4 = 6
            r5 = 5123(0x1403, float:7.179E-42)
            java.nio.ShortBuffer r6 = r13.f334868w     // Catch:{ all -> 0x0150 }
            android.opengl.GLES20.glDrawElements(r1, r4, r5, r6)     // Catch:{ all -> 0x0150 }
            java.lang.String r1 = "gl draw texture"
            r13.mo163550f(r1)     // Catch:{ all -> 0x0150 }
            android.opengl.GLES20.glDisableVertexAttribArray(r3)     // Catch:{ all -> 0x0150 }
            android.opengl.GLES20.glDisableVertexAttribArray(r2)     // Catch:{ all -> 0x0150 }
            r1 = 3042(0xbe2, float:4.263E-42)
            android.opengl.GLES20.glEnable(r1)     // Catch:{ all -> 0x0150 }
            r1 = 771(0x303, float:1.08E-42)
            android.opengl.GLES20.glBlendFunc(r0, r1)     // Catch:{ all -> 0x0150 }
            java.lang.String r1 = "gl draw texture"
            r13.mo163550f(r1)     // Catch:{ all -> 0x0150 }
            long r1 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x0150 }
            r13.f334862F = r1     // Catch:{ all -> 0x0150 }
            goto L_0x0158
        L_0x0137:
            r1 = move-exception
            java.lang.String r2 = "AlphaTextureRenderer"
            wq2.C111836h.m152497d(r2, r1)     // Catch:{ all -> 0x0146 }
            monitor-exit(r13)     // Catch:{ all -> 0x0146 }
            java.lang.String r0 = "draw"
            java.lang.String r1 = "com.tencent.mm.plugin.sns.ad.widget.alphavideo.AlphaTextureRenderer"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r1)
            return r4
        L_0x0146:
            r1 = move-exception
            monitor-exit(r13)     // Catch:{ all -> 0x0146 }
            java.lang.String r2 = "draw"
            java.lang.String r3 = "com.tencent.mm.plugin.sns.ad.widget.alphavideo.AlphaTextureRenderer"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r2, r3)     // Catch:{ all -> 0x0150 }
            throw r1     // Catch:{ all -> 0x0150 }
        L_0x0150:
            r1 = move-exception
            java.lang.String r2 = "AlphaTextureRenderer"
            java.lang.String r3 = "draw called error"
            wq2.C111836h.m152496c(r2, r3, r1)
        L_0x0158:
            d14.t0<java.lang.Boolean> r1 = r13.f334859C
            if (r1 == 0) goto L_0x0163
            java.lang.Boolean r2 = java.lang.Boolean.TRUE
            d14.z0 r1 = (d14.C58100z0) r1
            r1.mo82832d(r2)
        L_0x0163:
            java.lang.String r1 = "draw"
            java.lang.String r2 = "com.tencent.mm.plugin.sns.ad.widget.alphavideo.AlphaTextureRenderer"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r1, r2)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: wq2.C111835g.mo151901a():boolean");
    }

    /* renamed from: b */
    public void mo151902b() {
        SnsMethodCalculate.markStartTimeMs("initGLComponents", "com.tencent.mm.plugin.sns.ad.widget.alphavideo.AlphaTextureRenderer");
        SnsMethodCalculate.markStartTimeMs("setupVertexBuffer", "com.tencent.mm.plugin.sns.ad.widget.alphavideo.AlphaTextureRenderer");
        short[] sArr = f334854H;
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(12);
        allocateDirect.order(ByteOrder.nativeOrder());
        ShortBuffer asShortBuffer = allocateDirect.asShortBuffer();
        this.f334868w = asShortBuffer;
        asShortBuffer.put(sArr);
        this.f334868w.position(0);
        float[] fArr = f334853G;
        ByteBuffer allocateDirect2 = ByteBuffer.allocateDirect(48);
        allocateDirect2.order(ByteOrder.nativeOrder());
        FloatBuffer asFloatBuffer = allocateDirect2.asFloatBuffer();
        this.f334867v = asFloatBuffer;
        asFloatBuffer.put(fArr);
        this.f334867v.position(0);
        SnsMethodCalculate.markEndTimeMs("setupVertexBuffer", "com.tencent.mm.plugin.sns.ad.widget.alphavideo.AlphaTextureRenderer");
        SnsMethodCalculate.markStartTimeMs("setupTexture", "com.tencent.mm.plugin.sns.ad.widget.alphavideo.AlphaTextureRenderer");
        boolean z = this.f334858B == 0;
        ByteBuffer allocateDirect3 = ByteBuffer.allocateDirect((z ? f334855I : f334856J).length * 4);
        allocateDirect3.order(ByteOrder.nativeOrder());
        FloatBuffer asFloatBuffer2 = allocateDirect3.asFloatBuffer();
        this.f334864s = asFloatBuffer2;
        asFloatBuffer2.put(z ? f334855I : f334856J);
        this.f334864s.position(0);
        GLES20.glActiveTexture(33984);
        GLES20.glGenTextures(1, this.f334865t, 0);
        mo163550f("gl generate texture");
        GLES20.glBindTexture(36197, this.f334865t[0]);
        mo163550f("gl bind texture");
        SurfaceTexture surfaceTexture = new SurfaceTexture(this.f334865t[0]);
        this.f334869x = surfaceTexture;
        surfaceTexture.setOnFrameAvailableListener(this);
        SnsMethodCalculate.markEndTimeMs("setupTexture", "com.tencent.mm.plugin.sns.ad.widget.alphavideo.AlphaTextureRenderer");
        SnsMethodCalculate.markStartTimeMs("loadShaders", "com.tencent.mm.plugin.sns.ad.widget.alphavideo.AlphaTextureRenderer");
        boolean z2 = this.f334858B == 0;
        String a = C53195j.m59611a(this.f334863r, z2 ? C0966R.raw.montage_horizontal_vertext_3_to_1 : C0966R.raw.montage_horizontal_vertext_1_to_1);
        String a2 = C53195j.m59611a(this.f334863r, z2 ? C0966R.raw.montage_alpha_shader_3_to_1 : C0966R.raw.montage_alpha_shader_1_to_1);
        SnsMethodCalculate.markStartTimeMs("loadProgram", "com.tencent.mm.plugin.sns.ad.widget.alphavideo.OpenGLUtils");
        int glCreateShader = GLES20.glCreateShader(35633);
        GLES20.glShaderSource(glCreateShader, a);
        GLES20.glCompileShader(glCreateShader);
        int[] iArr = new int[1];
        GLES20.glGetShaderiv(glCreateShader, 35713, iArr, 0);
        if (iArr[0] == 1) {
            int glCreateShader2 = GLES20.glCreateShader(35632);
            GLES20.glShaderSource(glCreateShader2, a2);
            GLES20.glCompileShader(glCreateShader2);
            GLES20.glGetShaderiv(glCreateShader2, 35713, iArr, 0);
            if (iArr[0] == 1) {
                int glCreateProgram = GLES20.glCreateProgram();
                GLES20.glAttachShader(glCreateProgram, glCreateShader);
                GLES20.glAttachShader(glCreateProgram, glCreateShader2);
                GLES20.glLinkProgram(glCreateProgram);
                GLES20.glGetProgramiv(glCreateProgram, 35714, iArr, 0);
                if (iArr[0] == 1) {
                    GLES20.glDeleteShader(glCreateShader);
                    GLES20.glDeleteShader(glCreateShader2);
                    SnsMethodCalculate.markEndTimeMs("loadProgram", "com.tencent.mm.plugin.sns.ad.widget.alphavideo.OpenGLUtils");
                    this.f334866u = glCreateProgram;
                    SnsMethodCalculate.markEndTimeMs("loadShaders", "com.tencent.mm.plugin.sns.ad.widget.alphavideo.AlphaTextureRenderer");
                    C111836h.m152494a("AlphaTextureRenderer", "initGLComponents");
                    SnsMethodCalculate.markEndTimeMs("initGLComponents", "com.tencent.mm.plugin.sns.ad.widget.alphavideo.AlphaTextureRenderer");
                    return;
                }
                IllegalStateException illegalStateException = new IllegalStateException("link program:" + GLES20.glGetProgramInfoLog(glCreateProgram));
                SnsMethodCalculate.markEndTimeMs("loadProgram", "com.tencent.mm.plugin.sns.ad.widget.alphavideo.OpenGLUtils");
                throw illegalStateException;
            }
            IllegalStateException illegalStateException2 = new IllegalStateException("load fragment shader:" + GLES20.glGetShaderInfoLog(glCreateShader));
            SnsMethodCalculate.markEndTimeMs("loadProgram", "com.tencent.mm.plugin.sns.ad.widget.alphavideo.OpenGLUtils");
            throw illegalStateException2;
        }
        IllegalStateException illegalStateException3 = new IllegalStateException("load vertex shader:" + GLES20.glGetShaderInfoLog(glCreateShader));
        SnsMethodCalculate.markEndTimeMs("loadProgram", "com.tencent.mm.plugin.sns.ad.widget.alphavideo.OpenGLUtils");
        throw illegalStateException3;
    }

    /* renamed from: f */
    public void mo163550f(String str) {
        SnsMethodCalculate.markStartTimeMs("checkOpenGLError", "com.tencent.mm.plugin.sns.ad.widget.alphavideo.AlphaTextureRenderer");
        while (true) {
            int glGetError = GLES20.glGetError();
            if (glGetError != 0) {
                C111836h.m152495b("AlphaTextureRenderer", str + ": glError " + GLUtils.getEGLErrorString(glGetError));
            } else {
                SnsMethodCalculate.markEndTimeMs("checkOpenGLError", "com.tencent.mm.plugin.sns.ad.widget.alphavideo.AlphaTextureRenderer");
                return;
            }
        }
    }

    /* renamed from: g */
    public final void mo163551g() {
        SnsMethodCalculate.markStartTimeMs("pingFps", "com.tencent.mm.plugin.sns.ad.widget.alphavideo.AlphaTextureRenderer");
        if (this.f334860D == 0) {
            this.f334860D = System.currentTimeMillis();
        }
        this.f334861E++;
        if (System.currentTimeMillis() - this.f334860D > 1000) {
            C111836h.m152494a("AlphaTextureRenderer", "FPS: " + this.f334861E);
            this.f334860D = System.currentTimeMillis();
            this.f334861E = 0;
        }
        SnsMethodCalculate.markEndTimeMs("pingFps", "com.tencent.mm.plugin.sns.ad.widget.alphavideo.AlphaTextureRenderer");
    }

    /* JADX WARNING: CFG modification limit reached, blocks count: 114 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onFrameAvailable(android.graphics.SurfaceTexture r3) {
        /*
            r2 = this;
            java.lang.String r0 = "onFrameAvailable"
            java.lang.String r1 = "com.tencent.mm.plugin.sns.ad.widget.alphavideo.AlphaTextureRenderer"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r0, r1)
            monitor-enter(r2)
            java.util.Objects.toString(r3)     // Catch:{ all -> 0x0025 }
            r3 = 1
            r2.f334871z = r3     // Catch:{ all -> 0x0025 }
            r2.f334857A = r3     // Catch:{ all -> 0x0025 }
            monitor-exit(r2)     // Catch:{ all -> 0x0025 }
            java.lang.String r3 = "onFrameAvailable"
            java.lang.String r0 = "com.tencent.mm.plugin.sns.ad.widget.alphavideo.AlphaTextureRenderer"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r3, r0)
            return
        L_0x001b:
            monitor-exit(r2)     // Catch:{ all -> 0x0025 }
            java.lang.String r0 = "onFrameAvailable"
            java.lang.String r1 = "com.tencent.mm.plugin.sns.ad.widget.alphavideo.AlphaTextureRenderer"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r1)
            throw r3
        L_0x0025:
            r3 = move-exception
            goto L_0x001b
        */
        throw new UnsupportedOperationException("Method not decompiled: wq2.C111835g.onFrameAvailable(android.graphics.SurfaceTexture):void");
    }
}

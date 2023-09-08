package g50;

import android.content.Context;
import android.graphics.RectF;
import android.graphics.SurfaceTexture;
import android.hardware.Sensor;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.opengl.GLES20;
import android.opengl.Matrix;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.view.TextureView;
import android.view.WindowManager;
import bc3.C104079c;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandler;
import com.tencent.rtmp.ITXLivePlayListener;
import com.tencent.rtmp.TXLivePlayer;
import com.tencent.rtmp.p899ui.TXCloudVideoView;
import h50.C108144a;
import h50.C108146b;
import h50.C108148d;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;
import java.nio.ShortBuffer;

/* renamed from: g50.f */
public class C107747f implements TXLivePlayer.ITXLivePlayVideoRenderListener, MMHandler.Callback {

    /* renamed from: A */
    public ITXLivePlayListener f322453A = null;

    /* renamed from: B */
    public boolean f322454B = false;

    /* renamed from: C */
    public boolean f322455C = false;

    /* renamed from: D */
    public RectF f322456D = new RectF(-1.0f, -1.0f, -1.0f, -1.0f);

    /* renamed from: E */
    public int f322457E = 0;

    /* renamed from: d */
    public boolean f322458d = false;

    /* renamed from: e */
    public HandlerThread f322459e = null;

    /* renamed from: f */
    public C107748a f322460f = null;

    /* renamed from: g */
    public TXCloudVideoView f322461g = null;

    /* renamed from: h */
    public TextureView f322462h = null;

    /* renamed from: i */
    public C107752j f322463i = null;

    /* renamed from: j */
    public SurfaceTexture f322464j = null;

    /* renamed from: n */
    public int f322465n = 0;

    /* renamed from: o */
    public int f322466o = 0;

    /* renamed from: p */
    public int f322467p = 0;

    /* renamed from: q */
    public int f322468q = 0;

    /* renamed from: r */
    public C104079c f322469r = null;

    /* renamed from: s */
    public SurfaceTexture f322470s = null;

    /* renamed from: t */
    public boolean f322471t = false;

    /* renamed from: u */
    public C107744b f322472u = null;

    /* renamed from: v */
    public int f322473v = 1;

    /* renamed from: w */
    public int f322474w = 0;

    /* renamed from: x */
    public boolean f322475x = false;

    /* renamed from: y */
    public boolean f322476y = false;

    /* renamed from: z */
    public Context f322477z;

    /* renamed from: g50.f$a */
    public static class C107748a extends Handler {
        public C107748a(Looper looper, Handler.Callback callback) {
            super(looper, callback);
        }
    }

    public C107747f(Context context) {
        this.f322477z = context;
        this.f322471t = true;
        this.f322472u = new C107744b();
    }

    /* renamed from: a */
    public final void mo158168a() {
        String str = "sensor";
        if (this.f322457E == 1) {
            C107744b bVar = this.f322472u;
            Context context = this.f322477z;
            if (bVar.f322447w == null) {
                bVar.f322447w = new C108148d();
            }
            if (bVar.f322448x == null) {
                bVar.f322448x = new C108144a(context);
            }
            C108148d dVar = bVar.f322447w;
            dVar.getClass();
            float[] fArr = new float[8103];
            float[] fArr2 = new float[5402];
            short[] sArr = new short[16206];
            float f = (float) 72;
            double d = 6.283185307179586d / ((double) f);
            float f2 = (float) 36;
            Context context2 = context;
            double d2 = 3.141592653589793d / ((double) f2);
            double d3 = (double) (1.0f / f);
            double d4 = (double) (1.0f / f2);
            int i = 0;
            int i2 = 0;
            int i3 = 0;
            for (int i4 = 36; i <= i4; i4 = 36) {
                int i5 = 0;
                for (int i6 = 72; i5 <= i6; i6 = 72) {
                    int i7 = i5;
                    double d5 = d;
                    double d6 = (double) i7;
                    fArr2[i2 + 0] = (float) (d6 * d3);
                    double d7 = d3;
                    double d8 = (double) i;
                    fArr2[i2 + 1] = (float) (d8 * d4);
                    double d9 = d8 * d2;
                    double d15 = (d6 * d5) - 3.141592653589793d;
                    fArr[i3 + 0] = ((float) (Math.sin(d9) * Math.cos(d15))) * 10.0f;
                    fArr[i3 + 1] = ((float) Math.cos(d9)) * 10.0f;
                    fArr[i3 + 2] = ((float) (Math.sin(d9) * Math.sin(d15))) * 10.0f;
                    i2 += 2;
                    i3 += 3;
                    i5 = i7 + 1;
                    str = str;
                    d = d5;
                    bVar = bVar;
                    d3 = d7;
                    d4 = d4;
                }
                C107744b bVar2 = bVar;
                String str2 = str;
                double d16 = d3;
                double d17 = d4;
                double d18 = d;
                i++;
            }
            C107744b bVar3 = bVar;
            String str3 = str;
            int i8 = 0;
            for (int i9 = 0; i9 < 36; i9++) {
                for (int i15 = 0; i15 < 72; i15++) {
                    int i16 = (i9 * 73) + i15;
                    short s = (short) i16;
                    sArr[i8 + 0] = s;
                    int i17 = ((i9 + 1) * 73) + i15;
                    sArr[i8 + 1] = (short) i17;
                    short s2 = (short) (i17 + 1);
                    sArr[i8 + 2] = s2;
                    sArr[i8 + 3] = s2;
                    sArr[i8 + 4] = (short) (i16 + 1);
                    sArr[i8 + 5] = s;
                    i8 += 6;
                }
            }
            ByteBuffer allocateDirect = ByteBuffer.allocateDirect(32412);
            allocateDirect.order(ByteOrder.nativeOrder());
            FloatBuffer asFloatBuffer = allocateDirect.asFloatBuffer();
            asFloatBuffer.put(fArr);
            asFloatBuffer.position(0);
            ByteBuffer allocateDirect2 = ByteBuffer.allocateDirect(21608);
            allocateDirect2.order(ByteOrder.nativeOrder());
            FloatBuffer asFloatBuffer2 = allocateDirect2.asFloatBuffer();
            asFloatBuffer2.put(fArr2);
            asFloatBuffer2.position(0);
            ByteBuffer allocateDirect3 = ByteBuffer.allocateDirect(32412);
            allocateDirect3.order(ByteOrder.nativeOrder());
            ShortBuffer asShortBuffer = allocateDirect3.asShortBuffer();
            asShortBuffer.put(sArr);
            asShortBuffer.position(0);
            dVar.f323866b.put(0, asShortBuffer);
            dVar.f323866b.put(1, asShortBuffer);
            int[] iArr = dVar.f323865a;
            iArr[0] = i8;
            iArr[1] = i8;
            dVar.f323867c.put(0, asFloatBuffer2);
            dVar.f323867c.put(1, asFloatBuffer2);
            dVar.f323868d.put(0, asFloatBuffer);
            dVar.f323868d.put(1, asFloatBuffer);
            C107744b bVar4 = bVar3;
            C108144a aVar = bVar4.f322448x;
            aVar.f323835m = 0.0f;
            aVar.f323836n = 0.0f;
            Matrix.setIdentityM(aVar.f323828f, 0);
            Matrix.setIdentityM(aVar.f323825c, 0);
            Matrix.setLookAtM(aVar.f323826d, 0, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f);
            aVar.f323841s = 0.0f;
            aVar.f323842t = 0.0f;
            C108144a aVar2 = bVar4.f322448x;
            if (!aVar2.f323833k) {
                Context context3 = context2;
                WindowManager windowManager = (WindowManager) context3.getSystemService("window");
                SensorManager sensorManager = (SensorManager) context3.getSystemService(str3);
                Sensor defaultSensor = sensorManager.getDefaultSensor(4);
                if (defaultSensor == null) {
                    Log.m105920e("CustomVrRender.RotationControl", "registerSensor but sensorGravity is null!");
                } else {
                    C108146b bVar5 = new C108146b(aVar2);
                    aVar2.f323834l = bVar5;
                    boolean registerListener = sensorManager.registerListener(bVar5, defaultSensor, 1);
                    Log.m105924i("CustomVrRender.RotationControl", "registerSensor success:" + registerListener);
                    aVar2.f323833k = true;
                }
            }
            return;
        }
        String str4 = str;
        C107744b bVar6 = this.f322472u;
        Context context4 = this.f322477z;
        C108144a aVar3 = bVar6.f322448x;
        if (aVar3 != null && aVar3.f323833k) {
            SensorManager sensorManager2 = (SensorManager) context4.getSystemService(str4);
            SensorEventListener sensorEventListener = aVar3.f323834l;
            if (sensorEventListener != null) {
                sensorManager2.unregisterListener(sensorEventListener);
            }
            aVar3.f323833k = false;
        }
    }

    /* renamed from: b */
    public void mo158169b() {
        C107744b bVar;
        Context context;
        C108144a aVar;
        C107744b bVar2 = this.f322472u;
        if (bVar2 != null && bVar2.f322436l) {
            try {
                bVar2.mo158161k();
                C104079c cVar = this.f322469r;
                if (cVar != null) {
                    cVar.mo145682a();
                    this.f322469r = null;
                }
                C107744b bVar3 = this.f322472u;
                bVar3.f322427c = 30;
                if (bVar3.f322437m || bVar3.f322438n == null) {
                    try {
                        bVar3.mo158161k();
                        int i = bVar3.f322428d;
                        if (i != 0) {
                            GLES20.glDeleteProgram(i);
                            bVar3.f322428d = 0;
                        }
                        bVar3.mo158156f();
                    } catch (Exception unused) {
                        Log.m105920e("CustomRender.CustomGLRenderImp", "uninitGlComponent14 error");
                    }
                } else {
                    try {
                        bVar3.mo158161k();
                        int i2 = bVar3.f322428d;
                        if (i2 != 0) {
                            GLES20.glDeleteProgram(i2);
                            bVar3.f322428d = 0;
                        }
                        bVar3.mo158155e();
                        bVar3.f322438n = null;
                    } catch (Exception unused2) {
                        Log.m105920e("CustomRender.CustomGLRenderImp", "uninitGlComponent error");
                    }
                }
                bVar3.f322442r = null;
                bVar3.f322446v = null;
                bVar3.f322436l = false;
                Log.m105924i("CustomRender.CustomGLRenderImp", "uninitGLComponet isEGL14:" + bVar3.f322437m);
                if (!(this.f322457E != 1 || (bVar = this.f322472u) == null || (context = this.f322477z) == null || (aVar = bVar.f322448x) == null || !aVar.f323833k)) {
                    SensorManager sensorManager = (SensorManager) context.getSystemService("sensor");
                    SensorEventListener sensorEventListener = aVar.f323834l;
                    if (sensorEventListener != null) {
                        sensorManager.unregisterListener(sensorEventListener);
                    }
                    aVar.f323833k = false;
                }
                this.f322472u = null;
                this.f322476y = false;
            } catch (Exception unused3) {
                Log.m105920e("CustomRender.CustomRender", "destroyInternal error");
                if (this.f322464j == null) {
                    this.f322472u = null;
                    this.f322476y = false;
                }
            }
        }
    }

    /* renamed from: c */
    public final void mo158170c() {
        synchronized (this) {
            HandlerThread handlerThread = this.f322459e;
            if (handlerThread != null && handlerThread.isAlive()) {
                this.f322459e.quitSafely();
                Log.m105924i("CustomRender.CustomRender", "CustomRender mGLThread quit");
            }
            this.f322460f = null;
            this.f322459e = null;
        }
    }

    public void finalize() {
        mo158170c();
        this.f322477z = null;
        this.f322453A = null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:42:0x00af, code lost:
        if (r1.f322472u.f322436l == false) goto L_0x04bb;
     */
    /* JADX WARNING: Removed duplicated region for block: B:102:0x01e2 A[Catch:{ Exception -> 0x020b }] */
    /* JADX WARNING: Removed duplicated region for block: B:103:0x01e3 A[Catch:{ Exception -> 0x020b }] */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x005e  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean handleMessage(android.os.Message r33) {
        /*
            r32 = this;
            r1 = r32
            r0 = r33
            int r2 = r0.what
            r3 = 3
            r4 = 2
            r5 = 0
            java.lang.String r6 = "CustomRender.CustomRender"
            if (r2 == r4) goto L_0x001b
            if (r2 == r3) goto L_0x0011
            goto L_0x04bb
        L_0x0011:
            r32.mo158169b()
            java.lang.String r0 = "MSG_DESTROY"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r6, r0)
            goto L_0x04bb
        L_0x001b:
            java.lang.Object r0 = r0.obj
            r8 = r0
            com.tencent.rtmp.TXLivePlayer$TXLiteAVTexture r8 = (com.tencent.rtmp.TXLivePlayer.TXLiteAVTexture) r8
            boolean r0 = r1.f322475x
            if (r0 == 0) goto L_0x04bb
            android.graphics.SurfaceTexture r0 = r1.f322464j
            if (r0 != 0) goto L_0x002a
            goto L_0x04bb
        L_0x002a:
            java.lang.Object r0 = r8.eglContext
            boolean r2 = r1.f322455C
            if (r2 == 0) goto L_0x0037
            r32.mo158169b()
            r1.f322476y = r5
            r1.f322455C = r5
        L_0x0037:
            g50.b r2 = r1.f322472u
            r15 = 1
            if (r2 == 0) goto L_0x0068
            boolean r7 = r2.f322436l
            if (r7 != r15) goto L_0x0068
            boolean r7 = r0 instanceof android.opengl.EGLContext
            if (r7 == 0) goto L_0x004d
            android.opengl.EGLContext r7 = r2.f322446v
            if (r7 == 0) goto L_0x004d
            boolean r2 = r7.equals(r0)
            goto L_0x0059
        L_0x004d:
            boolean r7 = r0 instanceof javax.microedition.khronos.egl.EGLContext
            if (r7 == 0) goto L_0x005b
            javax.microedition.khronos.egl.EGLContext r2 = r2.f322442r
            if (r2 == 0) goto L_0x005b
            boolean r2 = r2.equals(r0)
        L_0x0059:
            r2 = r2 ^ r15
            goto L_0x005c
        L_0x005b:
            r2 = 1
        L_0x005c:
            if (r2 == 0) goto L_0x0068
            java.lang.String r2 = "shared eglcontext changed!"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r6, r2)
            r32.mo158169b()
            r1.f322476y = r5
        L_0x0068:
            g50.b r2 = r1.f322472u
            if (r2 != 0) goto L_0x0092
            g50.b r2 = new g50.b
            r2.<init>()
            r1.f322472u = r2
            r32.mo158168a()
            g50.b r2 = r1.f322472u
            android.graphics.RectF r7 = r1.f322456D
            if (r7 == 0) goto L_0x008f
            float[] r2 = r2.f322450z
            float r9 = r7.left
            r2[r5] = r9
            float r9 = r7.right
            r2[r15] = r9
            float r9 = r7.top
            r2[r4] = r9
            float r7 = r7.bottom
            r2[r3] = r7
            goto L_0x0092
        L_0x008f:
            r2.getClass()
        L_0x0092:
            g50.b r2 = r1.f322472u
            boolean r3 = r2.f322436l
            if (r3 != 0) goto L_0x00b3
            android.view.Surface r3 = new android.view.Surface     // Catch:{ Exception -> 0x00a3 }
            android.graphics.SurfaceTexture r7 = r1.f322464j     // Catch:{ Exception -> 0x00a3 }
            r3.<init>(r7)     // Catch:{ Exception -> 0x00a3 }
            r2.mo158159i(r0, r3)     // Catch:{ Exception -> 0x00a3 }
            goto L_0x00ab
        L_0x00a3:
            r0 = move-exception
            java.lang.Object[] r2 = new java.lang.Object[r5]
            java.lang.String r3 = "CustomGLRenderImp create failed!"
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r6, r0, r3, r2)
        L_0x00ab:
            g50.b r0 = r1.f322472u
            boolean r0 = r0.f322436l
            if (r0 != 0) goto L_0x00b3
            goto L_0x04bb
        L_0x00b3:
            g50.b r0 = r1.f322472u     // Catch:{ Exception -> 0x04b6 }
            r0.mo158160j()     // Catch:{ Exception -> 0x04b6 }
            boolean r0 = r1.f322476y
            r2 = -1
            if (r0 != 0) goto L_0x019c
            int r0 = r1.f322457E
            if (r0 != r4) goto L_0x00c8
            g50.b r0 = r1.f322472u
            r0.mo158154d()
            goto L_0x019a
        L_0x00c8:
            if (r0 != r15) goto L_0x0195
            g50.b r0 = r1.f322472u
            r3 = 35633(0x8b31, float:4.9932E-41)
            java.lang.String r7 = "uniform mat4 u_MVPMatrix;\n                            \n                                                     attribute vec4 position;\n                             attribute vec4 inputTextureCoordinate;\n               \n                                                     varying vec2 textureCoordinate;\n                      \n                                                     // The entry point for our vertex shader.\n            void main()\n                                          {\n                                                        textureCoordinate = inputTextureCoordinate.xy;\n       gl_Position = u_MVPMatrix * position;\n            }\n                                                    "
            int r3 = r0.mo158153c(r7, r3)
            if (r3 != 0) goto L_0x00d9
            goto L_0x019a
        L_0x00d9:
            r7 = 35632(0x8b30, float:4.9931E-41)
            java.lang.String r9 = "varying highp vec2 textureCoordinate;\n \nuniform sampler2D inputImageTexture;\n \nvoid main()\n{\n     gl_FragColor = texture2D(inputImageTexture, textureCoordinate);\n}"
            int r7 = r0.mo158153c(r9, r7)
            if (r7 != 0) goto L_0x00e6
            goto L_0x019a
        L_0x00e6:
            int r9 = android.opengl.GLES20.glCreateProgram()
            r0.f322428d = r9
            java.lang.String r9 = "glCreateProgram"
            int r9 = r0.mo158152b(r9)
            if (r9 == 0) goto L_0x00f6
            goto L_0x019a
        L_0x00f6:
            int r9 = r0.f322428d
            android.opengl.GLES20.glAttachShader(r9, r3)
            java.lang.String r3 = "glAttachShader"
            int r9 = r0.mo158152b(r3)
            if (r9 == 0) goto L_0x0105
            goto L_0x019a
        L_0x0105:
            int r9 = r0.f322428d
            android.opengl.GLES20.glAttachShader(r9, r7)
            int r3 = r0.mo158152b(r3)
            if (r3 == 0) goto L_0x0112
            goto L_0x019a
        L_0x0112:
            int r3 = r0.f322428d
            android.opengl.GLES20.glLinkProgram(r3)
            int[] r3 = new int[r15]
            int r7 = r0.f322428d
            r9 = 35714(0x8b82, float:5.0046E-41)
            android.opengl.GLES20.glGetProgramiv(r7, r9, r3, r5)
            r3 = r3[r5]
            if (r3 == r15) goto L_0x013d
            java.lang.String r3 = "CustomRender.CustomGLRenderImp"
            java.lang.String r7 = "Could not link program: "
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r3, r7)
            int r7 = r0.f322428d
            java.lang.String r7 = android.opengl.GLES20.glGetProgramInfoLog(r7)
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r3, r7)
            int r3 = r0.f322428d
            android.opengl.GLES20.glDeleteProgram(r3)
            r0.f322428d = r5
            goto L_0x019a
        L_0x013d:
            int r3 = r0.f322428d
            android.opengl.GLES20.glUseProgram(r3)
            int r3 = r0.f322428d
            java.lang.String r7 = "position"
            int r3 = android.opengl.GLES20.glGetAttribLocation(r3, r7)
            r0.f322429e = r3
            int r3 = r0.f322428d
            java.lang.String r7 = "inputImageTexture"
            int r3 = android.opengl.GLES20.glGetUniformLocation(r3, r7)
            r0.f322430f = r3
            int r3 = r0.f322428d
            java.lang.String r7 = "inputTextureCoordinate"
            int r3 = android.opengl.GLES20.glGetAttribLocation(r3, r7)
            r0.f322432h = r3
            int r3 = r0.f322428d
            java.lang.String r7 = "u_MVPMatrix"
            int r3 = android.opengl.GLES20.glGetUniformLocation(r3, r7)
            r0.f322431g = r3
            int r3 = r0.f322429e
            android.opengl.GLES20.glEnableVertexAttribArray(r3)
            int r3 = r0.f322432h
            android.opengl.GLES20.glEnableVertexAttribArray(r3)
            int r3 = r0.f322429e
            if (r3 == r2) goto L_0x018d
            int r3 = r0.f322430f
            if (r3 == r2) goto L_0x018d
            int r3 = r0.f322432h
            if (r3 == r2) goto L_0x018d
            int r3 = r0.f322431g
            if (r3 == r2) goto L_0x018d
            java.lang.String r3 = "AdjustResidueFilter"
            int r0 = r0.mo158152b(r3)
            if (r0 != 0) goto L_0x018d
            goto L_0x019a
        L_0x018d:
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            java.lang.String r2 = "Shaders create failed"
            r0.<init>(r2)
            throw r0
        L_0x0195:
            g50.b r0 = r1.f322472u
            r0.mo158154d()
        L_0x019a:
            r1.f322476y = r15
        L_0x019c:
            boolean r0 = r1.f322458d
            if (r0 == 0) goto L_0x0210
            int r0 = r1.f322457E
            if (r0 != r4) goto L_0x0210
            bc3.c r0 = r1.f322469r
            if (r0 != 0) goto L_0x01b7
            bc3.c r0 = new bc3.c     // Catch:{ Exception -> 0x01b0 }
            r0.<init>()     // Catch:{ Exception -> 0x01b0 }
            r1.f322469r = r0     // Catch:{ Exception -> 0x01b0 }
            goto L_0x01b7
        L_0x01b0:
            java.lang.String r0 = "create sharpen surface failed!"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r6, r0)
            r1.f322458d = r5
        L_0x01b7:
            bc3.c r0 = r1.f322469r
            if (r0 == 0) goto L_0x0210
            int r3 = r1.f322465n
            r7 = 640(0x280, float:8.97E-43)
            if (r3 >= r7) goto L_0x01c2
            goto L_0x01d8
        L_0x01c2:
            int r3 = r1.f322467p
            int r7 = r1.f322468q
            int r3 = r3 * r7
            r7 = 953856(0xe8e00, float:1.336637E-39)
            if (r3 <= r7) goto L_0x01d0
            r23 = 2
            goto L_0x01da
        L_0x01d0:
            r7 = 246656(0x3c380, float:3.45639E-40)
            if (r3 <= r7) goto L_0x01d8
            r23 = 1
            goto L_0x01da
        L_0x01d8:
            r23 = 0
        L_0x01da:
            int r3 = r8.textureId     // Catch:{ Exception -> 0x020b }
            int r7 = r8.width     // Catch:{ Exception -> 0x020b }
            int r9 = r8.height     // Catch:{ Exception -> 0x020b }
            if (r23 != 0) goto L_0x01e3
            goto L_0x0208
        L_0x01e3:
            bc3.b r10 = r0.f307847a     // Catch:{ Exception -> 0x020b }
            int r3 = r10.mo145681d(r3, r7, r9, r15)     // Catch:{ Exception -> 0x020b }
            bc3.a r10 = r0.f307849c     // Catch:{ Exception -> 0x020b }
            r10.mo145677d(r3, r7, r9, r4)     // Catch:{ Exception -> 0x020b }
            bc3.d r10 = r0.f307848b     // Catch:{ Exception -> 0x020b }
            bc3.a r0 = r0.f307849c     // Catch:{ Exception -> 0x020b }
            int[] r0 = r0.f307819f     // Catch:{ Exception -> 0x020b }
            r18 = r0[r5]     // Catch:{ Exception -> 0x020b }
            r19 = r0[r15]     // Catch:{ Exception -> 0x020b }
            r20 = r0[r4]     // Catch:{ Exception -> 0x020b }
            r24 = 0
            r16 = r10
            r17 = r3
            r21 = r7
            r22 = r9
            int r3 = r16.mo145687d(r17, r18, r19, r20, r21, r22, r23, r24)     // Catch:{ Exception -> 0x020b }
        L_0x0208:
            r8.textureId = r3     // Catch:{ Exception -> 0x020b }
            goto L_0x0210
        L_0x020b:
            java.lang.String r0 = "sharpen filter failed!"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r6, r0)
        L_0x0210:
            int r0 = r1.f322457E
            if (r0 != r4) goto L_0x0227
            g50.b r7 = r1.f322472u
            int r9 = r1.f322465n
            int r10 = r1.f322466o
            int r11 = r1.f322467p
            int r12 = r1.f322468q
            int r13 = r1.f322473v
            int r14 = r1.f322474w
            r7.mo158162l(r8, r9, r10, r11, r12, r13, r14)
            goto L_0x048a
        L_0x0227:
            if (r0 != r15) goto L_0x0479
            g50.b r0 = r1.f322472u
            int r3 = r1.f322465n
            int r4 = r1.f322466o
            int r6 = r1.f322474w
            h50.a r7 = r0.f322448x
            if (r7 == 0) goto L_0x048a
            h50.d r9 = r0.f322447w
            if (r9 != 0) goto L_0x023b
            goto L_0x048a
        L_0x023b:
            int r9 = r0.f322434j
            if (r3 != r9) goto L_0x0248
            int r9 = r0.f322435k
            if (r4 != r9) goto L_0x0248
            if (r6 == r2) goto L_0x0246
            goto L_0x0248
        L_0x0246:
            r2 = 0
            goto L_0x0249
        L_0x0248:
            r2 = 1
        L_0x0249:
            r6 = 1101004800(0x41a00000, float:20.0)
            r9 = 1115815936(0x42820000, float:65.0)
            r10 = 1127481344(0x43340000, float:180.0)
            r11 = 1078530011(0x40490fdb, float:3.1415927)
            if (r2 == 0) goto L_0x02db
            r0.f322434j = r3
            r0.f322435k = r4
            r2 = 1108082688(0x420c0000, float:35.0)
            if (r3 <= r4) goto L_0x029c
            r7.f323839q = r3
            r7.f323840r = r4
            float r2 = java.lang.Math.max(r2, r6)
            float r2 = java.lang.Math.min(r2, r9)
            float r3 = (float) r3
            float r4 = (float) r4
            float r3 = r3 / r4
            float r4 = r2 / r10
            float r4 = r4 * r11
            double r12 = (double) r4
            double r12 = java.lang.Math.tan(r12)
            float r4 = (float) r12
            float r3 = r3 * r4
            float r12 = -r3
            float r13 = -r4
            r22 = 1065353216(0x3f800000, float:1.0)
            r23 = 1140457472(0x43fa0000, float:500.0)
            float[] r14 = r7.f323827e
            r17 = 0
            r16 = r14
            r18 = r12
            r19 = r3
            r20 = r13
            r21 = r4
            android.opengl.Matrix.frustumM(r16, r17, r18, r19, r20, r21, r22, r23)
            double r3 = (double) r3
            double r3 = java.lang.Math.atan(r3)
            float r3 = (float) r3
            float r3 = r3 / r11
            float r3 = r3 * r10
            r7.f323831i = r3
            r7.f323832j = r2
            goto L_0x02db
        L_0x029c:
            r7.f323839q = r3
            r7.f323840r = r4
            float r2 = java.lang.Math.max(r2, r6)
            float r2 = java.lang.Math.min(r2, r9)
            float r4 = (float) r4
            float r3 = (float) r3
            float r4 = r4 / r3
            float r3 = r2 / r10
            float r3 = r3 * r11
            double r12 = (double) r3
            double r12 = java.lang.Math.tan(r12)
            float r3 = (float) r12
            float r4 = r4 * r3
            float r12 = -r3
            float r13 = -r4
            r22 = 1065353216(0x3f800000, float:1.0)
            r23 = 1140457472(0x43fa0000, float:500.0)
            float[] r14 = r7.f323827e
            r17 = 0
            r16 = r14
            r18 = r12
            r19 = r3
            r20 = r13
            r21 = r4
            android.opengl.Matrix.frustumM(r16, r17, r18, r19, r20, r21, r22, r23)
            r7.f323831i = r2
            double r2 = (double) r4
            double r2 = java.lang.Math.atan(r2)
            float r2 = (float) r2
            float r2 = r2 / r11
            float r2 = r2 * r10
            r7.f323832j = r2
        L_0x02db:
            android.util.Size r2 = r0.mo158157g()
            int r3 = r2.getWidth()
            int r2 = r2.getHeight()
            android.opengl.GLES20.glViewport(r5, r5, r3, r2)
            r2 = 36160(0x8d40, float:5.0671E-41)
            android.opengl.GLES20.glBindFramebuffer(r2, r5)
            r2 = 1065353216(0x3f800000, float:1.0)
            r3 = 0
            android.opengl.GLES20.glClearColor(r3, r3, r3, r2)
            r2 = 16640(0x4100, float:2.3318E-41)
            android.opengl.GLES20.glClear(r2)
            h50.d r2 = r0.f322447w
            android.util.SparseArray<java.nio.FloatBuffer> r2 = r2.f323868d
            java.lang.Object r2 = r2.get(r5)
            java.nio.FloatBuffer r2 = (java.nio.FloatBuffer) r2
            h50.d r3 = r0.f322447w
            android.util.SparseArray<java.nio.FloatBuffer> r3 = r3.f323867c
            java.lang.Object r3 = r3.get(r5)
            java.nio.FloatBuffer r3 = (java.nio.FloatBuffer) r3
            if (r3 == 0) goto L_0x048a
            if (r2 != 0) goto L_0x0315
            goto L_0x048a
        L_0x0315:
            r2.position(r5)
            r3.position(r5)
            h50.a r4 = r0.f322448x
            float r7 = r4.f323836n
            float r12 = r4.f323841s
            r13 = 1119092736(0x42b40000, float:90.0)
            float r13 = r13 - r12
            float r7 = java.lang.Math.min(r7, r13)
            r4.f323836n = r7
            float r12 = r4.f323841s
            r13 = -1028390912(0xffffffffc2b40000, float:-90.0)
            float r13 = r13 - r12
            float r7 = java.lang.Math.max(r7, r13)
            r4.f323836n = r7
            float r12 = r4.f323841s
            float r12 = -r12
            float r7 = -r7
            float r18 = r12 + r7
            float r7 = r4.f323842t
            float r7 = -r7
            float r12 = r4.f323835m
            float r12 = -r12
            float r7 = r7 + r12
            float[] r12 = r4.f323826d
            r20 = 0
            r13 = 0
            r14 = 0
            r23 = 0
            r24 = 1065353216(0x3f800000, float:1.0)
            r25 = 0
            r26 = 0
            r27 = 0
            r28 = 1065353216(0x3f800000, float:1.0)
            r29 = 0
            r22 = 0
            r21 = 0
            r19 = r12
            android.opengl.Matrix.setLookAtM(r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29)
            float[] r12 = r4.f323826d
            r17 = 0
            r19 = 0
            r20 = 0
            r21 = 1065353216(0x3f800000, float:1.0)
            r16 = r12
            android.opengl.Matrix.rotateM(r16, r17, r18, r19, r20, r21)
            float[] r12 = r4.f323826d
            r25 = 0
            r23 = 1065353216(0x3f800000, float:1.0)
            r20 = 0
            r19 = r12
            r21 = r7
            r22 = r14
            r24 = r13
            android.opengl.Matrix.rotateM(r19, r20, r21, r22, r23, r24)
            int r7 = r4.f323839q
            float r7 = (float) r7
            int r12 = r4.f323840r
            float r12 = (float) r12
            float r7 = r7 / r12
            float r12 = r4.f323837o
            float r13 = r4.f323832j
            float r13 = r13 * r12
            float r6 = java.lang.Math.max(r13, r6)
            float r6 = java.lang.Math.min(r6, r9)
            float r6 = r6 / r10
            float r6 = r6 * r11
            double r9 = (double) r6
            double r9 = java.lang.Math.tan(r9)
            float r6 = (float) r9
            float r7 = r7 * r6
            float r9 = -r7
            float r10 = -r6
            r22 = 1065353216(0x3f800000, float:1.0)
            r23 = 1140457472(0x43fa0000, float:500.0)
            float[] r11 = r4.f323827e
            r17 = 0
            r16 = r11
            r18 = r9
            r19 = r7
            r20 = r10
            r21 = r6
            android.opengl.Matrix.frustumM(r16, r17, r18, r19, r20, r21, r22, r23)
            float[] r6 = r4.f323824b
            r17 = 0
            float[] r7 = r4.f323826d
            float[] r9 = r4.f323825c
            r21 = 0
            r16 = r6
            r18 = r7
            r19 = r25
            r20 = r9
            android.opengl.Matrix.multiplyMM(r16, r17, r18, r19, r20, r21)
            float[] r6 = r4.f323823a
            r27 = 0
            float[] r7 = r4.f323827e
            r29 = 0
            float[] r9 = r4.f323824b
            r31 = 0
            r26 = r6
            r28 = r7
            r30 = r9
            android.opengl.Matrix.multiplyMM(r26, r27, r28, r29, r30, r31)
            float[] r4 = r4.f323823a
            if (r4 != 0) goto L_0x03e8
            goto L_0x048a
        L_0x03e8:
            int r6 = r0.f322428d
            android.opengl.GLES20.glUseProgram(r6)
            int r6 = r0.f322429e
            android.opengl.GLES20.glEnableVertexAttribArray(r6)
            int r6 = r0.f322432h
            android.opengl.GLES20.glEnableVertexAttribArray(r6)
            int r6 = r0.f322429e
            r17 = 3
            r7 = 5126(0x1406, float:7.183E-42)
            r9 = 0
            r10 = 0
            r18 = 5126(0x1406, float:7.183E-42)
            r19 = 0
            r20 = 0
            r16 = r6
            r21 = r2
            android.opengl.GLES20.glVertexAttribPointer(r16, r17, r18, r19, r20, r21)
            int r2 = r0.f322432h
            r17 = 2
            r16 = r2
            r18 = r7
            r19 = r9
            r20 = r10
            r21 = r3
            android.opengl.GLES20.glVertexAttribPointer(r16, r17, r18, r19, r20, r21)
            int r2 = r0.f322431g
            android.opengl.GLES20.glUniformMatrix4fv(r2, r15, r5, r4, r5)
            r2 = 33984(0x84c0, float:4.7622E-41)
            android.opengl.GLES20.glActiveTexture(r2)
            int r2 = r8.textureId
            r3 = 3553(0xde1, float:4.979E-42)
            android.opengl.GLES20.glBindTexture(r3, r2)
            int r2 = r0.f322430f
            android.opengl.GLES20.glUniform1i(r2, r5)
            h50.d r2 = r0.f322447w
            android.util.SparseArray<java.nio.ShortBuffer> r2 = r2.f323866b
            java.lang.Object r2 = r2.get(r5)
            java.nio.ShortBuffer r2 = (java.nio.ShortBuffer) r2
            r4 = 4
            if (r2 == 0) goto L_0x0462
            h50.d r2 = r0.f322447w
            android.util.SparseArray<java.nio.ShortBuffer> r2 = r2.f323866b
            java.lang.Object r2 = r2.get(r5)
            java.nio.ShortBuffer r2 = (java.nio.ShortBuffer) r2
            r2.position(r5)
            h50.d r2 = r0.f322447w
            int[] r6 = r2.f323865a
            r6 = r6[r5]
            r7 = 5123(0x1403, float:7.179E-42)
            android.util.SparseArray<java.nio.ShortBuffer> r2 = r2.f323866b
            java.lang.Object r2 = r2.get(r5)
            java.nio.ShortBuffer r2 = (java.nio.ShortBuffer) r2
            android.opengl.GLES20.glDrawElements(r4, r6, r7, r2)
            goto L_0x046b
        L_0x0462:
            h50.d r2 = r0.f322447w
            int[] r2 = r2.f323865a
            r2 = r2[r5]
            android.opengl.GLES20.glDrawArrays(r4, r5, r2)
        L_0x046b:
            int r2 = r0.f322429e
            android.opengl.GLES20.glDisableVertexAttribArray(r2)
            int r0 = r0.f322432h
            android.opengl.GLES20.glDisableVertexAttribArray(r0)
            android.opengl.GLES20.glBindTexture(r3, r5)
            goto L_0x048a
        L_0x0479:
            g50.b r7 = r1.f322472u
            int r9 = r1.f322465n
            int r10 = r1.f322466o
            int r11 = r1.f322467p
            int r12 = r1.f322468q
            int r13 = r1.f322473v
            int r14 = r1.f322474w
            r7.mo158162l(r8, r9, r10, r11, r12, r13, r14)
        L_0x048a:
            g50.b r0 = r1.f322472u
            boolean r2 = r0.f322437m
            if (r2 != 0) goto L_0x049c
            javax.microedition.khronos.egl.EGL10 r2 = r0.f322438n
            if (r2 == 0) goto L_0x04a3
            javax.microedition.khronos.egl.EGLDisplay r3 = r0.f322439o
            javax.microedition.khronos.egl.EGLSurface r0 = r0.f322441q
            r2.eglSwapBuffers(r3, r0)
            goto L_0x04a3
        L_0x049c:
            android.opengl.EGLDisplay r2 = r0.f322443s
            android.opengl.EGLSurface r0 = r0.f322445u
            android.opengl.EGL14.eglSwapBuffers(r2, r0)
        L_0x04a3:
            boolean r0 = r1.f322454B
            if (r0 != 0) goto L_0x04bb
            com.tencent.rtmp.ITXLivePlayListener r0 = r1.f322453A
            if (r0 == 0) goto L_0x04bb
            g50.e r0 = new g50.e
            r0.<init>(r1)
            com.tencent.p014mm.sdk.platformtools.MMHandlerThread.postToMainThread(r0)
            r1.f322454B = r15
            goto L_0x04bb
        L_0x04b6:
            java.lang.String r0 = "renderInternal makeCurrent error"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r6, r0)
        L_0x04bb:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: g50.C107747f.handleMessage(android.os.Message):boolean");
    }

    public void onRenderVideoFrame(TXLivePlayer.TXLiteAVTexture tXLiteAVTexture) {
        int i = tXLiteAVTexture.width;
        int i2 = tXLiteAVTexture.height;
        if (!(this.f322467p == i && this.f322468q == i2)) {
            this.f322467p = i;
            this.f322468q = i2;
            C107752j jVar = this.f322463i;
            if (!(jVar == null || this.f322457E == 1)) {
                jVar.mo158178d(i, i2);
            }
        }
        GLES20.glFinish();
        synchronized (this) {
            C107748a aVar = this.f322460f;
            if (aVar != null) {
                aVar.obtainMessage(2, tXLiteAVTexture).sendToTarget();
            }
        }
    }
}

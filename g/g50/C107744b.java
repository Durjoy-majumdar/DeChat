package g50;

import android.graphics.PointF;
import android.opengl.EGL14;
import android.opengl.EGLConfig;
import android.opengl.GLES20;
import android.opengl.Matrix;
import android.util.Size;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.Surface;
import com.tencent.p014mm.sdk.platformtools.BuildInfo;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.rtmp.TXLivePlayer;
import com.tencent.xweb.file.XVFSFile;
import h50.C108144a;
import h50.C108147c;
import h50.C108148d;
import j20.C117292a;
import java.math.BigDecimal;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;
import javax.microedition.khronos.egl.EGL10;
import javax.microedition.khronos.egl.EGLContext;
import javax.microedition.khronos.egl.EGLDisplay;
import javax.microedition.khronos.egl.EGLSurface;
import k20.C9556a;
import org.webrtc.EglBase;

/* renamed from: g50.b */
public class C107744b implements C59363a {

    /* renamed from: A */
    public static final float[] f322423A = {-1.0f, -1.0f, 1.0f, -1.0f, -1.0f, 1.0f, 1.0f, 1.0f};

    /* renamed from: B */
    public static final float[] f322424B = {0.0f, 1.0f, 1.0f, 1.0f, 0.0f, 0.0f, 1.0f, 0.0f};

    /* renamed from: a */
    public FloatBuffer f322425a;

    /* renamed from: b */
    public FloatBuffer f322426b;

    /* renamed from: c */
    public int f322427c = 30;

    /* renamed from: d */
    public int f322428d = 0;

    /* renamed from: e */
    public int f322429e;

    /* renamed from: f */
    public int f322430f;

    /* renamed from: g */
    public int f322431g;

    /* renamed from: h */
    public int f322432h;

    /* renamed from: i */
    public int f322433i;

    /* renamed from: j */
    public int f322434j = 0;

    /* renamed from: k */
    public int f322435k = 0;

    /* renamed from: l */
    public boolean f322436l;

    /* renamed from: m */
    public boolean f322437m;

    /* renamed from: n */
    public EGL10 f322438n;

    /* renamed from: o */
    public EGLDisplay f322439o = null;

    /* renamed from: p */
    public EGLContext f322440p = null;

    /* renamed from: q */
    public EGLSurface f322441q = null;

    /* renamed from: r */
    public EGLContext f322442r = null;

    /* renamed from: s */
    public android.opengl.EGLDisplay f322443s = null;

    /* renamed from: t */
    public android.opengl.EGLContext f322444t = null;

    /* renamed from: u */
    public android.opengl.EGLSurface f322445u = null;

    /* renamed from: v */
    public android.opengl.EGLContext f322446v = null;

    /* renamed from: w */
    public C108148d f322447w;

    /* renamed from: x */
    public C108144a f322448x;

    /* renamed from: y */
    public C108147c f322449y;

    /* renamed from: z */
    public float[] f322450z = {-1.0f, -1.0f, -1.0f, -1.0f};

    public C107744b() {
        float[] fArr = f322423A;
        FloatBuffer asFloatBuffer = ByteBuffer.allocateDirect(32).order(ByteOrder.nativeOrder()).asFloatBuffer();
        this.f322425a = asFloatBuffer;
        asFloatBuffer.put(fArr).position(0);
        float[] fArr2 = f322424B;
        FloatBuffer asFloatBuffer2 = ByteBuffer.allocateDirect(32).order(ByteOrder.nativeOrder()).asFloatBuffer();
        this.f322426b = asFloatBuffer2;
        asFloatBuffer2.put(fArr2).position(0);
        this.f322449y = new C108147c();
    }

    /* renamed from: a */
    public final boolean mo158151a(String str) {
        boolean z = false;
        if (!this.f322437m && this.f322438n != null) {
            while (true) {
                int eglGetError = this.f322438n.eglGetError();
                if (eglGetError == 12288) {
                    break;
                }
                Log.m105920e("CustomRender.CustomGLRenderImp", str + ": EGL error: 0x" + Integer.toHexString(eglGetError));
                z = true;
            }
        } else {
            while (true) {
                int eglGetError2 = EGL14.eglGetError();
                if (eglGetError2 == 12288) {
                    break;
                }
                Log.m105920e("CustomRender.CustomGLRenderImp", str + ": EGL14 error: 0x" + Integer.toHexString(eglGetError2));
                z = true;
            }
        }
        return z;
    }

    /* renamed from: b */
    public final int mo158152b(String str) {
        int glGetError = GLES20.glGetError();
        if (glGetError == 0) {
            return 0;
        }
        Log.m105920e("CustomRender.CustomGLRenderImp", str + ": EGL error: 0x" + Integer.toHexString(glGetError));
        return glGetError;
    }

    /* renamed from: c */
    public int mo158153c(String str, int i) {
        int glCreateShader = GLES20.glCreateShader(i);
        GLES20.glShaderSource(glCreateShader, str);
        GLES20.glCompileShader(glCreateShader);
        int[] iArr = new int[1];
        GLES20.glGetShaderiv(glCreateShader, 35713, iArr, 0);
        if (iArr[0] != 0) {
            return glCreateShader;
        }
        Log.m105920e("CustomRender.CustomGLRenderImp", "Could not compile shader " + i + XVFSFile.PATH_SEPARATOR);
        StringBuilder sb = new StringBuilder();
        sb.append(" ");
        sb.append(GLES20.glGetShaderInfoLog(glCreateShader));
        Log.m105920e("CustomRender.CustomGLRenderImp", sb.toString());
        GLES20.glDeleteShader(glCreateShader);
        return 0;
    }

    /* renamed from: d */
    public boolean mo158154d() {
        int c;
        int c2 = mo158153c("uniform mat4 u_MVPMatrix;\n                            attribute vec4 position;\nattribute vec4 inputTextureCoordinate;\n \nvarying vec2 textureCoordinate;\n \nvoid main()\n{\n    gl_Position = u_MVPMatrix * position;\n    textureCoordinate = inputTextureCoordinate.xy;\n}", 35633);
        if (c2 == 0 || (c = mo158153c("varying highp vec2 textureCoordinate;\n \nuniform sampler2D inputImageTexture;\nuniform highp float rect[4];\n \nvoid main()\n{\n     gl_FragColor = texture2D(inputImageTexture, textureCoordinate);\n     if (textureCoordinate.x>rect[0] && textureCoordinate.x<rect[1] && textureCoordinate.y>rect[2] && textureCoordinate.y<rect[3]) gl_FragColor.a = 0.0;\n}", 35632)) == 0) {
            return false;
        }
        this.f322428d = GLES20.glCreateProgram();
        if (mo158152b("glCreateProgram") != 0) {
            return false;
        }
        GLES20.glAttachShader(this.f322428d, c2);
        if (mo158152b("glAttachShader") != 0) {
            return false;
        }
        GLES20.glAttachShader(this.f322428d, c);
        if (mo158152b("glAttachShader") != 0) {
            return false;
        }
        GLES20.glLinkProgram(this.f322428d);
        int[] iArr = new int[1];
        GLES20.glGetProgramiv(this.f322428d, 35714, iArr, 0);
        if (iArr[0] != 1) {
            Log.m105920e("CustomRender.CustomGLRenderImp", "Could not link program: ");
            Log.m105920e("CustomRender.CustomGLRenderImp", GLES20.glGetProgramInfoLog(this.f322428d));
            GLES20.glDeleteProgram(this.f322428d);
            this.f322428d = 0;
            return false;
        }
        GLES20.glUseProgram(this.f322428d);
        this.f322429e = GLES20.glGetAttribLocation(this.f322428d, "position");
        this.f322430f = GLES20.glGetUniformLocation(this.f322428d, "inputImageTexture");
        this.f322432h = GLES20.glGetAttribLocation(this.f322428d, "inputTextureCoordinate");
        this.f322431g = GLES20.glGetUniformLocation(this.f322428d, "u_MVPMatrix");
        this.f322433i = GLES20.glGetUniformLocation(this.f322428d, "rect");
        GLES20.glEnableVertexAttribArray(this.f322429e);
        GLES20.glEnableVertexAttribArray(this.f322432h);
        if (this.f322429e != -1 && this.f322430f != -1 && this.f322432h != -1 && mo158152b("AdjustResidueFilter") == 0) {
            return true;
        }
        throw new RuntimeException("Shaders create failed");
    }

    /* renamed from: e */
    public void mo158155e() {
        EGLDisplay eGLDisplay = this.f322439o;
        if (eGLDisplay != null) {
            EGL10 egl10 = this.f322438n;
            EGLSurface eGLSurface = EGL10.EGL_NO_SURFACE;
            egl10.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, EGL10.EGL_NO_CONTEXT);
            EGLSurface eGLSurface2 = this.f322441q;
            if (eGLSurface2 != null) {
                this.f322438n.eglDestroySurface(this.f322439o, eGLSurface2);
            }
            EGLContext eGLContext = this.f322440p;
            if (eGLContext != null) {
                this.f322438n.eglDestroyContext(this.f322439o, eGLContext);
            }
            this.f322438n.eglTerminate(this.f322439o);
            this.f322441q = null;
            this.f322439o = null;
        }
    }

    /* renamed from: f */
    public void mo158156f() {
        android.opengl.EGLDisplay eGLDisplay = this.f322443s;
        if (eGLDisplay != null) {
            android.opengl.EGLSurface eGLSurface = EGL14.EGL_NO_SURFACE;
            EGL14.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, EGL14.EGL_NO_CONTEXT);
            android.opengl.EGLSurface eGLSurface2 = this.f322445u;
            if (eGLSurface2 != null) {
                EGL14.eglDestroySurface(this.f322443s, eGLSurface2);
            }
            android.opengl.EGLContext eGLContext = this.f322444t;
            if (eGLContext != null) {
                EGL14.eglDestroyContext(this.f322443s, eGLContext);
            }
            EGL14.eglTerminate(this.f322443s);
            this.f322445u = null;
            this.f322443s = null;
        }
    }

    /* renamed from: g */
    public Size mo158157g() {
        boolean z;
        boolean z2;
        int[] iArr = new int[1];
        int[] iArr2 = new int[1];
        if (!this.f322437m) {
            z2 = this.f322438n.eglQuerySurface(this.f322439o, this.f322441q, 12375, iArr);
            z = this.f322438n.eglQuerySurface(this.f322439o, this.f322441q, 12374, iArr2);
        } else {
            z2 = EGL14.eglQuerySurface(this.f322443s, this.f322445u, 12375, iArr, 0);
            z = EGL14.eglQuerySurface(this.f322443s, this.f322445u, 12374, iArr2, 0);
        }
        return (!z2 || !z) ? new Size(0, 0) : new Size(iArr[0], iArr2[0]);
    }

    /* renamed from: h */
    public void mo158158h(MotionEvent motionEvent) {
        C107754k kVar;
        MotionEvent motionEvent2 = motionEvent;
        C108144a aVar = this.f322448x;
        if (aVar != null) {
            int action = motionEvent.getAction() & 255;
            if (action == 1 || action == 3) {
                aVar.f323838p = -1.0f;
            } else if (action == 5) {
                aVar.f323838p = C108144a.m146484a(motionEvent2.getX(0), motionEvent2.getY(0), motionEvent2.getX(1), motionEvent2.getY(1));
            } else if (action == 6) {
                if (motionEvent.getPointerCount() <= 2) {
                    aVar.f323838p = -1.0f;
                } else if ((motionEvent.getAction() >> 8) == 0) {
                    aVar.f323838p = C108144a.m146484a(motionEvent2.getX(1), motionEvent2.getY(1), motionEvent2.getX(2), motionEvent2.getY(2));
                } else if ((motionEvent.getAction() >> 8) == 1) {
                    aVar.f323838p = C108144a.m146484a(motionEvent2.getX(0), motionEvent2.getY(0), motionEvent2.getX(2), motionEvent2.getY(2));
                }
            } else if (action == 2 && motionEvent.getPointerCount() >= 2) {
                float a = C108144a.m146484a(motionEvent2.getX(0), motionEvent2.getY(0), motionEvent2.getX(1), motionEvent2.getY(1));
                if (a != 0.0f) {
                    if (aVar.f323838p == -1.0f) {
                        aVar.f323838p = a;
                    }
                    float f = aVar.f323837o + (((aVar.f323838p / a) - 1.0f) * 1.0f);
                    aVar.f323837o = f;
                    float min = Math.min(f, 2.0f);
                    aVar.f323837o = min;
                    float max = Math.max(min, 0.5f);
                    aVar.f323837o = max;
                    float min2 = Math.min(max, 65.0f / aVar.f323832j);
                    aVar.f323837o = min2;
                    float min3 = Math.min(min2, 65.0f / aVar.f323831i);
                    aVar.f323837o = min3;
                    float max2 = Math.max(min3, 20.0f / aVar.f323832j);
                    aVar.f323837o = max2;
                    aVar.f323837o = Math.max(max2, 20.0f / aVar.f323831i);
                }
                aVar.f323838p = a;
            }
            GestureDetector gestureDetector = aVar.f323830h;
            C9556a aVar2 = new C9556a();
            aVar2.mo10233c(motionEvent2);
            GestureDetector gestureDetector2 = gestureDetector;
            C117292a.m165358d(gestureDetector2, aVar2.mo10232b(), "com/tencent/mm/live/core/core/postprocessor/customrender/vrrendertool/RotationControl", "handleGesturesOperation", "(Landroid/view/MotionEvent;)V", "android/view/GestureDetector_EXEC_", "onTouchEvent", "(Landroid/view/MotionEvent;)Z");
            C117292a.m165360f(gestureDetector2, gestureDetector.onTouchEvent((MotionEvent) aVar2.mo10231a(0)), "com/tencent/mm/live/core/core/postprocessor/customrender/vrrendertool/RotationControl", "handleGesturesOperation", "(Landroid/view/MotionEvent;)V", "android/view/GestureDetector_EXEC_", "onTouchEvent", "(Landroid/view/MotionEvent;)Z");
            return;
        }
        C108147c cVar = this.f322449y;
        if (cVar != null && cVar.f323845a) {
            int action2 = motionEvent.getAction() & 255;
            if (motionEvent.getPointerCount() == 1) {
                if (action2 == 0) {
                    cVar.f323851g.set(motionEvent2.getX(0), motionEvent2.getY(0));
                    cVar.f323853i = 1;
                    if (BuildInfo.DEBUG) {
                        Log.m105924i("CustomRender.ScaleControl", "livescale onefinger began: mTransPrevPoint.x = " + cVar.f323851g.x + ", mTransPrevPoint.y = " + cVar.f323851g.y + ", mTransPrevTouchNum = " + cVar.f323853i);
                    }
                } else if (action2 == 2) {
                    PointF pointF = new PointF(motionEvent2.getX(0), motionEvent2.getY(0));
                    Log.m105924i("CustomRender.ScaleControl", "livescale onefinger curlocatoin " + pointF.x + ", " + pointF.y);
                    float f2 = pointF.x;
                    if (f2 >= 0.0f) {
                        float f3 = pointF.y;
                        if (f3 >= 0.0f && cVar.f323853i == 1) {
                            PointF pointF2 = cVar.f323851g;
                            cVar.f323857m = f2 - pointF2.x;
                            cVar.f323858n = f3 - pointF2.y;
                            if (BuildInfo.DEBUG) {
                                Log.m105924i("CustomRender.ScaleControl", "livescale onefinger change: mTransX = " + cVar.f323857m + ", mTransY = " + cVar.f323858n + ", mViewWidth = " + cVar.f323863s + ", mViewHeight = " + cVar.f323864t);
                            }
                            cVar.mo158554d();
                            cVar.f323851g.set(pointF.x, pointF.y);
                            cVar.f323853i = 1;
                            return;
                        }
                    }
                    if (BuildInfo.DEBUG) {
                        Log.m105924i("CustomRender.ScaleControl", "livescale onefinger break: x = " + cVar.f323851g.x + " " + pointF.x + ", y = " + cVar.f323851g.y + " " + pointF.y + ", TouchNum = " + cVar.f323853i + " 1");
                    }
                    cVar.f323851g.set(pointF.x, pointF.y);
                    cVar.f323853i = 1;
                } else if (action2 == 1 || action2 == 3) {
                    if (BuildInfo.DEBUG) {
                        Log.m105924i("CustomRender.ScaleControl", "livescale onefinger stop");
                    }
                    cVar.f323851g.set(-1.0f, -1.0f);
                    cVar.f323853i = 1;
                }
            } else if (motionEvent.getPointerCount() >= 2) {
                String str = ", mViewHeight = ";
                if (action2 == 5) {
                    PointF pointF3 = new PointF((motionEvent2.getX(0) + motionEvent2.getX(1)) / 2.0f, (motionEvent2.getY(0) + motionEvent2.getY(1)) / 2.0f);
                    cVar.f323852h.set(pointF3.x, pointF3.y);
                    float x = motionEvent2.getX(0);
                    float y = motionEvent2.getY(0);
                    cVar.f323854j = (float) Math.sqrt(Math.pow((double) (x - motionEvent2.getX(1)), 2.0d) + Math.pow((double) (y - motionEvent2.getY(1)), 2.0d));
                    cVar.f323855k = 1.0f;
                    cVar.f323853i = 2;
                    if (BuildInfo.DEBUG) {
                        Log.m105924i("CustomRender.ScaleControl", "livescale twofinger began: mScalePrevVal = " + cVar.f323855k + ", mScalePrevPoint.x = " + cVar.f323852h.x + ", mScalePrevPoint.y = " + cVar.f323852h.y);
                    }
                    cVar.f323847c = true;
                } else if (action2 == 2) {
                    float x2 = motionEvent2.getX(0);
                    float y2 = motionEvent2.getY(0);
                    float x3 = motionEvent2.getX(1);
                    float f4 = x2 - x3;
                    float sqrt = ((float) Math.sqrt(Math.pow((double) f4, 2.0d) + Math.pow((double) (y2 - motionEvent2.getY(1)), 2.0d))) / cVar.f323854j;
                    cVar.f323856l = (sqrt - cVar.f323855k) + 1.0f;
                    PointF pointF4 = new PointF((motionEvent2.getX(0) + motionEvent2.getX(1)) / 2.0f, (motionEvent2.getY(0) + motionEvent2.getY(1)) / 2.0f);
                    String str2 = "CustomRender.ScaleControl";
                    Log.m105924i(str2, "livescale twofinger curlocatoin " + pointF4.x + ", " + pointF4.y);
                    PointF pointF5 = cVar.f323852h;
                    if (pointF5.x < 0.0f || pointF5.y < 0.0f) {
                        if (BuildInfo.DEBUG) {
                            Log.m105924i(str2, "livescale twofinger break: scaleVal = " + sqrt + ", mScalePrevVal = " + cVar.f323855k + ", mScalePrevPoint.x = " + cVar.f323852h.x + ", mScalePrevPoint.y = " + cVar.f323852h.y);
                        }
                        cVar.f323855k = sqrt;
                        cVar.f323852h.set(pointF4.x, pointF4.y);
                        return;
                    }
                    if (cVar.f323855k > 1.0f && !cVar.f323849e && (kVar = cVar.f323850f) != null) {
                        kVar.mo88086p();
                        cVar.f323849e = true;
                    }
                    float f5 = cVar.f323846b[0];
                    float f6 = cVar.f323856l;
                    if (f5 * f6 > 3.0f) {
                        f6 = 3.0f / f5;
                    }
                    cVar.f323856l = f6;
                    if (f5 * f6 < 0.85f) {
                        f6 = 0.85f / f5;
                    }
                    cVar.f323856l = f6;
                    float f7 = pointF4.x;
                    PointF pointF6 = cVar.f323852h;
                    cVar.f323857m = f7 - pointF6.x;
                    float f8 = pointF4.y;
                    cVar.f323858n = f8 - pointF6.y;
                    float f9 = (float) cVar.f323863s;
                    cVar.f323859o = f7 - (((((((f7 / f9) - 0.5f) * 2.0f) * f6) / 2.0f) + 0.5f) * f9);
                    float f15 = (float) cVar.f323864t;
                    cVar.f323860p = f8 - (((((((f8 / f15) - 0.5f) * 2.0f) * f6) / 2.0f) + 0.5f) * f15);
                    if (BuildInfo.DEBUG) {
                        Log.m105924i(str2, "livescale twofinger change: mScaleVal = " + cVar.f323856l + ", mScaleTransX = " + cVar.f323859o + ", mScaleTransY = " + cVar.f323860p + ", mViewWidth = " + cVar.f323863s + str + cVar.f323864t);
                    }
                    cVar.mo158554d();
                    cVar.f323852h.set(pointF4.x, pointF4.y);
                    cVar.f323855k = sqrt;
                    cVar.f323853i = 2;
                } else {
                    String str3 = "CustomRender.ScaleControl";
                    if (action2 == 6 || action2 == 3) {
                        if (BuildInfo.DEBUG) {
                            Log.m105924i(str3, "livescale twofinger stop: mScaleVal = " + cVar.f323856l + ", mScalePrevVal = " + cVar.f323855k);
                        }
                        cVar.f323849e = false;
                        cVar.f323854j = -1.0f;
                        cVar.f323855k = -1.0f;
                        PointF pointF7 = cVar.f323852h;
                        pointF7.x = -1.0f;
                        pointF7.y = -1.0f;
                        cVar.f323853i = 2;
                        float f16 = cVar.f323846b[0];
                        if (f16 > 2.0f) {
                            cVar.f323856l = 2.0f / f16;
                        } else if (f16 < 1.0f) {
                            cVar.f323856l = 1.0f / f16;
                        }
                        cVar.mo158554d();
                        if (cVar.f323847c && new BigDecimal((double) cVar.f323846b[0]).setScale(4, 4).floatValue() == 1.0f && !cVar.f323848d) {
                            cVar.f323848d = true;
                            C107754k kVar2 = cVar.f323850f;
                            if (kVar2 != null) {
                                kVar2.mo88081T();
                            }
                        }
                    }
                }
            }
        }
    }

    /* renamed from: i */
    public void mo158159i(Object obj, Surface surface) {
        Object obj2 = obj;
        Surface surface2 = surface;
        int i = this.f322427c;
        if (i > 0) {
            this.f322427c = i - 1;
            if (obj2 instanceof android.opengl.EGLContext) {
                this.f322437m = true;
                Log.m105924i("CustomRender.CustomGLRenderImp", "init use android.opengl.EGLContext: " + obj2 + " remaining create time: " + this.f322427c);
                android.opengl.EGLContext eGLContext = (android.opengl.EGLContext) obj2;
                Log.m105924i("CustomRender.CustomGLRenderImp", "init egl14");
                android.opengl.EGLDisplay eglGetDisplay = EGL14.eglGetDisplay(0);
                this.f322443s = eglGetDisplay;
                if (this.f322439o != EGL10.EGL_NO_DISPLAY) {
                    int[] iArr = new int[2];
                    if (EGL14.eglInitialize(eglGetDisplay, iArr, 0, iArr, 1)) {
                        EGLConfig[] eGLConfigArr = new EGLConfig[1];
                        if (EGL14.eglChooseConfig(this.f322443s, new int[]{12339, 4, 12324, 8, 12323, 8, 12322, 8, 12321, 8, 12352, 4, EglBase.EGL_RECORDABLE_ANDROID, 1, 12344}, 0, eGLConfigArr, 0, 1, new int[1], 0)) {
                            android.opengl.EGLContext eglCreateContext = EGL14.eglCreateContext(this.f322443s, eGLConfigArr[0], eGLContext, new int[]{12440, 2, 12344}, 0);
                            this.f322444t = eglCreateContext;
                            if (eglCreateContext == null || mo158151a("eglCreateContext14")) {
                                mo158156f();
                                throw new RuntimeException("eglcontext14 create failed");
                            }
                            android.opengl.EGLSurface eglCreateWindowSurface = EGL14.eglCreateWindowSurface(this.f322443s, eGLConfigArr[0], surface2, new int[]{12344}, 0);
                            this.f322445u = eglCreateWindowSurface;
                            if (eglCreateWindowSurface == null || mo158151a("eglCreateWindowSurface14")) {
                                mo158156f();
                                throw new RuntimeException("eglsurface14 create failed");
                            }
                            this.f322446v = eGLContext;
                            this.f322436l = true;
                            return;
                        }
                        throw new RuntimeException("unable to find RGB888+recordable ES2 EGL config");
                    }
                    this.f322443s = null;
                    throw new RuntimeException("unable to initialize EGL14");
                }
                throw new RuntimeException("unable to get EGL14 display");
            } else if (obj2 instanceof EGLContext) {
                this.f322437m = false;
                Log.m105924i("CustomRender.CustomGLRenderImp", "init use javax.microedition.khronos.egl.EGLContext: " + obj2 + " remaining create time: " + this.f322427c);
                EGLContext eGLContext2 = (EGLContext) obj2;
                Log.m105924i("CustomRender.CustomGLRenderImp", "init egl");
                EGL10 egl10 = (EGL10) EGLContext.getEGL();
                this.f322438n = egl10;
                EGLDisplay eglGetDisplay2 = egl10.eglGetDisplay(EGL10.EGL_DEFAULT_DISPLAY);
                this.f322439o = eglGetDisplay2;
                EGL10 egl102 = this.f322438n;
                if (eglGetDisplay2 == EGL10.EGL_NO_DISPLAY) {
                    throw new RuntimeException("unable to get EGL14 display");
                } else if (egl102.eglInitialize(eglGetDisplay2, new int[2])) {
                    int[] iArr2 = {12339, 4, 12324, 8, 12323, 8, 12322, 8, 12321, 8, 12352, 4, EglBase.EGL_RECORDABLE_ANDROID, 1, 12344};
                    javax.microedition.khronos.egl.EGLConfig[] eGLConfigArr2 = new javax.microedition.khronos.egl.EGLConfig[1];
                    if (this.f322438n.eglChooseConfig(this.f322439o, iArr2, eGLConfigArr2, 1, new int[1])) {
                        EGLContext eglCreateContext2 = this.f322438n.eglCreateContext(this.f322439o, eGLConfigArr2[0], eGLContext2, new int[]{12440, 2, 12344});
                        this.f322440p = eglCreateContext2;
                        if (eglCreateContext2 == null || mo158151a("eglCreateContext")) {
                            mo158155e();
                            throw new RuntimeException("eglcontext create failed");
                        }
                        EGLSurface eglCreateWindowSurface2 = this.f322438n.eglCreateWindowSurface(this.f322439o, eGLConfigArr2[0], surface2, new int[]{12344});
                        this.f322441q = eglCreateWindowSurface2;
                        if (eglCreateWindowSurface2 == null || mo158151a("eglCreateWindowSurface")) {
                            mo158155e();
                            throw new RuntimeException("eglsurface create failed");
                        }
                        this.f322442r = eGLContext2;
                        this.f322436l = true;
                        return;
                    }
                    throw new RuntimeException("unable to find RGB888+recordable ES2 EGL config");
                } else {
                    this.f322439o = null;
                    throw new RuntimeException("unable to initialize EGL14");
                }
            } else {
                Log.m105924i("CustomRender.CustomGLRenderImp", "not support eglContext");
                this.f322436l = false;
            }
        }
    }

    /* renamed from: j */
    public void mo158160j() {
        EGL10 egl10;
        EGLDisplay eGLDisplay;
        if (!(this.f322437m || (egl10 = this.f322438n) == null || (eGLDisplay = this.f322439o) == null)) {
            EGLSurface eGLSurface = this.f322441q;
            if (!egl10.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, this.f322440p)) {
                if (mo158151a("makeCurrent")) {
                    throw new RuntimeException("makeCurrent error");
                }
                return;
            }
        }
        android.opengl.EGLDisplay eGLDisplay2 = this.f322443s;
        if (eGLDisplay2 != null) {
            android.opengl.EGLSurface eGLSurface2 = this.f322445u;
            if (!EGL14.eglMakeCurrent(eGLDisplay2, eGLSurface2, eGLSurface2, this.f322444t) && mo158151a("makeCurrent14")) {
                throw new RuntimeException("makeCurrent14 error");
            }
        }
    }

    /* renamed from: k */
    public void mo158161k() {
        EGL10 egl10;
        EGLDisplay eGLDisplay;
        if (!(this.f322437m || (egl10 = this.f322438n) == null || (eGLDisplay = this.f322439o) == null)) {
            EGLSurface eGLSurface = EGL10.EGL_NO_SURFACE;
            if (!egl10.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, this.f322440p)) {
                if (mo158151a("makeCurrentnoSurface")) {
                    throw new RuntimeException("makeCurrentnoSurface error");
                }
                return;
            }
        }
        android.opengl.EGLDisplay eGLDisplay2 = this.f322443s;
        if (eGLDisplay2 != null) {
            android.opengl.EGLSurface eGLSurface2 = EGL14.EGL_NO_SURFACE;
            if (!EGL14.eglMakeCurrent(eGLDisplay2, eGLSurface2, eGLSurface2, this.f322444t) && mo158151a("makeCurrentnoSurface14")) {
                throw new RuntimeException("makeCurrentnoSurface14 error");
            }
        }
    }

    /* renamed from: l */
    public void mo158162l(TXLivePlayer.TXLiteAVTexture tXLiteAVTexture, int i, int i2, int i3, int i4, int i5, int i6) {
        int i7 = i;
        int i8 = i2;
        Size g = mo158157g();
        GLES20.glBindFramebuffer(36160, 0);
        GLES20.glUseProgram(this.f322428d);
        GLES20.glViewport(0, 0, g.getWidth(), g.getHeight());
        GLES20.glClearColor(0.0f, 0.0f, 0.0f, 0.0f);
        GLES20.glClear(16640);
        float[] fArr = this.f322450z;
        if ((fArr[0] == -1.0f && fArr[1] == -1.0f && fArr[2] == -1.0f && fArr[3] == -1.0f) || this.f322433i == -1) {
            GLES20.glDisable(3042);
        } else {
            GLES20.glEnable(3042);
            GLES20.glBlendFunc(770, 0);
        }
        GLES20.glUniform1fv(this.f322433i, 4, this.f322450z, 0);
        GLES20.glEnableVertexAttribArray(this.f322429e);
        GLES20.glEnableVertexAttribArray(this.f322432h);
        GLES20.glVertexAttribPointer(this.f322429e, 2, 5126, false, 0, this.f322425a);
        GLES20.glVertexAttribPointer(this.f322432h, 2, 5126, false, 0, this.f322426b);
        C108147c cVar = this.f322449y;
        if (cVar != null) {
            if ((i7 == this.f322434j && i8 == this.f322435k) ? false : true) {
                this.f322434j = i7;
                this.f322435k = i8;
                cVar.f323863s = i7;
                cVar.f323864t = i8;
            }
            cVar.mo158551a();
            GLES20.glUniformMatrix4fv(this.f322431g, 1, false, cVar.f323846b, 0);
        } else {
            float[] fArr2 = new float[16];
            Matrix.setIdentityM(fArr2, 0);
            GLES20.glUniformMatrix4fv(this.f322431g, 1, false, fArr2, 0);
        }
        GLES20.glActiveTexture(33984);
        GLES20.glBindTexture(3553, tXLiteAVTexture.textureId);
        GLES20.glUniform1i(this.f322430f, 0);
        GLES20.glDrawArrays(5, 0, 4);
        GLES20.glDisableVertexAttribArray(this.f322429e);
        GLES20.glDisableVertexAttribArray(this.f322432h);
        GLES20.glBindTexture(3553, 0);
    }
}

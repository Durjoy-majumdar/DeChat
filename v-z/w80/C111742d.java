package w80;

import android.app.ActivityManager;
import android.content.Context;
import android.content.pm.ConfigurationInfo;
import android.graphics.Bitmap;
import android.graphics.SurfaceTexture;
import android.opengl.EGL14;
import android.opengl.EGLConfig;
import android.opengl.EGLContext;
import android.opengl.EGLDisplay;
import android.opengl.EGLSurface;
import android.opengl.GLES20;
import android.view.Surface;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import com.github.henryye.nativeiv.bitmap.NativeBitmapStruct;
import com.google.android.gms.gcm.Task;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.MultiProcessMMKV;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.tinker.loader.hotplug.EnvConsts;
import gy3.C8480h;
import gy3.C87412m;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import kj2.C117407d;
import oa1.C117731d;
import org.webrtc.EglBase;
import p80.C110192a;
import p80.C110194c;
import z04.C112550d0;

/* renamed from: w80.d */
public final class C111742d {

    /* renamed from: a */
    public static final C111743a f334647a = new C111743a((C8480h) null);

    /* renamed from: b */
    public static int f334648b = -1;

    /* renamed from: c */
    public static final float[] f334649c = {-1.0f, -1.0f, 1.0f, -1.0f, -1.0f, 1.0f, 1.0f, 1.0f};

    /* renamed from: d */
    public static final float[] f334650d = {0.0f, 1.0f, 1.0f, 1.0f, 0.0f, 0.0f, 1.0f, 0.0f};

    /* renamed from: e */
    public static final float[] f334651e = {0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 1.0f, 1.0f, 1.0f};

    /* renamed from: f */
    public static final int[] f334652f = {12324, 8, 12323, 8, 12322, 8, 12321, 8, 12352, 4, EglBase.EGL_RECORDABLE_ANDROID, 1, 12344};

    /* renamed from: g */
    public static final int[] f334653g = {12324, 8, 12323, 8, 12322, 8, 12321, 8, 12352, 4, 12344};

    /* renamed from: w80.d$b */
    public static final class C65942b {

        /* renamed from: a */
        public EGLDisplay f189591a;

        /* renamed from: b */
        public EGLSurface f189592b;

        /* renamed from: c */
        public EGLContext f189593c;

        public C65942b(EGLDisplay eGLDisplay, EGLSurface eGLSurface, EGLContext eGLContext) {
            C87412m.m108594g(eGLDisplay, "disPlay");
            C87412m.m108594g(eGLContext, "eglContext");
            this.f189591a = eGLDisplay;
            this.f189592b = eGLSurface;
            this.f189593c = eGLContext;
        }
    }

    /* renamed from: w80.d$a */
    public static final class C111743a {
        public C111743a(C8480h hVar) {
        }

        /* renamed from: i */
        public static C65942b m152351i(C111743a aVar, int i, int i2, EGLContext eGLContext, int i3, Object obj) {
            C111743a aVar2 = aVar;
            int i4 = (i3 & 1) != 0 ? 0 : i;
            int i5 = (i3 & 2) != 0 ? 0 : i2;
            EGLContext eGLContext2 = (i3 & 4) != 0 ? EGL14.EGL_NO_CONTEXT : eGLContext;
            aVar.getClass();
            Log.m105924i("MicroMsg.GLEnvironmentUtil", "eglSetupByPbufferSurface, width:" + i4 + ", height:" + i5);
            EGLDisplay eglGetDisplay = EGL14.eglGetDisplay(0);
            if (eglGetDisplay != EGL14.EGL_NO_DISPLAY) {
                int[] iArr = new int[2];
                if (EGL14.eglInitialize(eglGetDisplay, iArr, 0, iArr, 1)) {
                    EGLConfig[] eGLConfigArr = new EGLConfig[1];
                    EGLConfig[] eGLConfigArr2 = eGLConfigArr;
                    EGL14.eglChooseConfig(eglGetDisplay, C111742d.f334652f, 0, eGLConfigArr, 0, 1, new int[1], 0);
                    aVar2.mo163460c("eglCreateContext RGB888+recordable ES2", "MicroMsg.GLEnvironmentUtil");
                    EGLContext eglCreateContext = EGL14.eglCreateContext(eglGetDisplay, eGLConfigArr2[0], eGLContext2, new int[]{12440, MultiProcessMMKV.getMMKV("mmkv_gl_key").decodeInt("support_egl_context_client_version", 3), 12344}, 0);
                    aVar2.mo163460c("eglCreateContext", "MicroMsg.GLEnvironmentUtil");
                    Log.m105924i("MicroMsg.GLEnvironmentUtil", "create eglContext: " + eglCreateContext.getNativeHandle() + ", stack:" + Util.getStack());
                    EGLSurface eglCreatePbufferSurface = EGL14.eglCreatePbufferSurface(eglGetDisplay, eGLConfigArr2[0], (i4 <= 0 || i5 <= 0) ? new int[]{12344} : new int[]{12375, i4, 12374, i5, 12344}, 0);
                    aVar2.mo163460c("eglCreatePbufferSurface", "MicroMsg.GLEnvironmentUtil");
                    if (eglCreatePbufferSurface != null) {
                        EGL14.eglMakeCurrent(eglGetDisplay, eglCreatePbufferSurface, eglCreatePbufferSurface, eglCreateContext);
                        aVar2.mo163460c("eglMakeCurrent", "MicroMsg.GLEnvironmentUtil");
                    }
                    C87412m.m108593f(eglGetDisplay, "mEGLDisplay");
                    return new C65942b(eglGetDisplay, eglCreatePbufferSurface, eglCreateContext);
                }
                throw new RuntimeException("unable to initialize EGL14");
            }
            throw new RuntimeException("unable to get EGL14 display");
        }

        /* renamed from: k */
        public static /* synthetic */ C65942b m152352k(C111743a aVar, Surface surface, SurfaceTexture surfaceTexture, int i, int i2, EGLContext eGLContext, int i3, Object obj) {
            if ((i3 & 2) != 0) {
                surfaceTexture = null;
            }
            SurfaceTexture surfaceTexture2 = surfaceTexture;
            int i4 = (i3 & 4) != 0 ? 0 : i;
            int i5 = (i3 & 8) != 0 ? 0 : i2;
            if ((i3 & 16) != 0) {
                eGLContext = EGL14.EGL_NO_CONTEXT;
            }
            return aVar.mo163466j(surface, surfaceTexture2, i4, i5, eGLContext);
        }

        /* renamed from: l */
        public static C65942b m152353l(C111743a aVar, EGLContext eGLContext, int i, Object obj) {
            if ((i & 1) != 0) {
                eGLContext = EGL14.EGL_NO_CONTEXT;
            }
            aVar.getClass();
            Log.m105924i("MicroMsg.GLEnvironmentUtil", "eglSetupWithoutSurface");
            EGLDisplay eglGetDisplay = EGL14.eglGetDisplay(0);
            if (eglGetDisplay != EGL14.EGL_NO_DISPLAY) {
                int[] iArr = new int[2];
                if (EGL14.eglInitialize(eglGetDisplay, iArr, 0, iArr, 1)) {
                    EGLConfig[] eGLConfigArr = new EGLConfig[1];
                    EGLDisplay eGLDisplay = eglGetDisplay;
                    EGL14.eglChooseConfig(eGLDisplay, C111742d.f334653g, 0, eGLConfigArr, 0, 1, new int[1], 0);
                    aVar.mo163460c("eglCreateContext RGB888+recordable ES2", "MicroMsg.GLEnvironmentUtil");
                    EGLContext eglCreateContext = EGL14.eglCreateContext(eglGetDisplay, eGLConfigArr[0], eGLContext, new int[]{12440, MultiProcessMMKV.getMMKV("mmkv_gl_key").decodeInt("support_egl_context_client_version", 3), 12344}, 0);
                    aVar.mo163460c("eglCreateContext", "MicroMsg.GLEnvironmentUtil");
                    Log.m105924i("MicroMsg.GLEnvironmentUtil", "create eglContext: " + eglCreateContext.getNativeHandle() + ", stack:" + Util.getStack());
                    EGLSurface eGLSurface = EGL14.EGL_NO_SURFACE;
                    EGL14.eglMakeCurrent(eglGetDisplay, eGLSurface, eGLSurface, eglCreateContext);
                    aVar.mo163460c("eglMakeCurrent", "MicroMsg.GLEnvironmentUtil");
                    C87412m.m108593f(eglGetDisplay, "mEGLDisplay");
                    return new C65942b(eglGetDisplay, EGL14.EGL_NO_SURFACE, eglCreateContext);
                }
                throw new RuntimeException("unable to initialize EGL14");
            }
            throw new RuntimeException("unable to get EGL14 display");
        }

        /* renamed from: a */
        public final C65942b mo163458a(EGLContext eGLContext, Object obj, int i, int i2) {
            EGLSurface eGLSurface;
            EGLContext eGLContext2 = eGLContext;
            Object obj2 = obj;
            C87412m.m108594g(eGLContext2, "eglContext");
            Log.m105924i("MicroMsg.GLEnvironmentUtil", "bindContextAndSurface");
            if (obj2 == null || (obj2 instanceof SurfaceView) || (obj2 instanceof Surface) || (obj2 instanceof SurfaceHolder) || (obj2 instanceof SurfaceTexture)) {
                EGLDisplay eglGetDisplay = EGL14.eglGetDisplay(0);
                if (eglGetDisplay != EGL14.EGL_NO_DISPLAY) {
                    int[] iArr = new int[2];
                    if (EGL14.eglInitialize(eglGetDisplay, iArr, 0, iArr, 1)) {
                        EGLConfig[] eGLConfigArr = new EGLConfig[1];
                        EGLConfig[] eGLConfigArr2 = eGLConfigArr;
                        EGL14.eglChooseConfig(eglGetDisplay, C111742d.f334652f, 0, eGLConfigArr, 0, 1, new int[1], 0);
                        if (eGLConfigArr2[0] != null) {
                            EGLContext eglCreateContext = EGL14.eglCreateContext(eglGetDisplay, eGLConfigArr2[0], eGLContext2, new int[]{12440, MultiProcessMMKV.getMMKV("mmkv_gl_key").decodeInt("support_egl_context_client_version", 3), 12344}, 0);
                            if (!C87412m.m108589b(eglCreateContext, EGL14.EGL_NO_CONTEXT)) {
                                mo163460c("eglCreateContext", "MicroMsg.GLEnvironmentUtil");
                                Log.m105924i("MicroMsg.GLEnvironmentUtil", "create eglContext: " + eglCreateContext.getNativeHandle() + ", stack:" + Util.getStack());
                                int[] iArr2 = (i <= 0 || i2 <= 0) ? new int[]{12344} : new int[]{12375, i, 12374, i2, 12344};
                                EGLSurface eGLSurface2 = null;
                                if (obj2 != null) {
                                    try {
                                        eGLSurface = EGL14.eglCreateWindowSurface(eglGetDisplay, eGLConfigArr2[0], obj2, iArr2, 0);
                                    } catch (IllegalArgumentException e) {
                                        Log.m105921e("MicroMsg.GLEnvironmentUtil", "eglCreateWindowSurface", e);
                                    }
                                } else {
                                    eGLSurface = EGL14.eglCreatePbufferSurface(eglGetDisplay, eGLConfigArr2[0], iArr2, 0);
                                }
                                eGLSurface2 = eGLSurface;
                                if (obj2 != null) {
                                    mo163460c("eglCreateWindowSurface", "MicroMsg.GLEnvironmentUtil");
                                } else {
                                    mo163460c("eglCreatePbufferSurface", "MicroMsg.GLEnvironmentUtil");
                                }
                                if ((eGLSurface2 == null || eGLSurface2 == EGL14.EGL_NO_SURFACE) && EGL14.eglGetError() == 12299) {
                                    Log.m105920e("MicroMsg.GLEnvironmentUtil", "makeMyEGLCurrentSurface:returned EGL_BAD_NATIVE_WINDOW.");
                                }
                                if (eGLSurface2 != null) {
                                    EGL14.eglMakeCurrent(eglGetDisplay, eGLSurface2, eGLSurface2, eglCreateContext);
                                    mo163460c("eglMakeCurrent", "MicroMsg.GLEnvironmentUtil");
                                }
                                C87412m.m108593f(eglGetDisplay, "eglDisplay");
                                C87412m.m108591d(eGLSurface2);
                                return new C65942b(eglGetDisplay, eGLSurface2, eglCreateContext);
                            }
                            throw new RuntimeException("EGL error " + EGL14.eglGetError());
                        }
                        throw new RuntimeException("chooseConfig failed");
                    }
                    throw new RuntimeException("eglInitialize failed");
                }
                throw new RuntimeException("unable to get EGL14 display");
            }
            throw new IllegalArgumentException("unsupported surface");
        }

        /* renamed from: b */
        public final void mo163459b(C110192a aVar, C110194c cVar, int i, int i2) {
            if (aVar == null) {
                Log.m105920e("MicroMsg.GLEnvironmentUtil", "fbo is null !");
            } else if (cVar == null) {
                Log.m105920e("MicroMsg.GLEnvironmentUtil", "texture is null");
            } else {
                GLES20.glBindFramebuffer(36160, aVar.f329644e);
                if (i > 0 && i2 > 0) {
                    C110194c.m149779b(cVar, i, i2, 0, (Buffer) null, 0, 0, 60, (Object) null);
                }
                GLES20.glFramebufferTexture2D(36160, 36064, 3553, cVar.f329652e, 0);
                GLES20.glBindTexture(3553, 0);
            }
        }

        /* renamed from: c */
        public final boolean mo163460c(String str, String str2) {
            C87412m.m108594g(str, "msg");
            C87412m.m108594g(str2, "tag");
            int eglGetError = EGL14.eglGetError();
            if (eglGetError == 12288) {
                return false;
            }
            Log.printInfoStack(str2, str + ": EGL error: 0x" + Integer.toHexString(eglGetError), new Object[0]);
            return true;
        }

        /* renamed from: d */
        public final boolean mo163461d(String str) {
            C87412m.m108594g(str, "extension");
            String str2 = "";
            String string = C111744e.f334654d.mo163481d().getString("gl_extension_support_list", str2);
            if (string != null) {
                str2 = string;
            }
            return C112550d0.m153801u(str2, str, false);
        }

        /* renamed from: e */
        public final void mo163462e(String str) {
            int glGetError = GLES20.glGetError();
            if (glGetError != 0) {
                Log.printInfoStack("MicroMsg.GLEnvironmentUtil", str + ": GL error: 0x" + Integer.toHexString(glGetError), new Object[0]);
            }
        }

        /* renamed from: f */
        public final void mo163463f() {
            GLES20.glClear(16640);
            GLES20.glClearColor(0.0f, 0.0f, 0.0f, 0.0f);
            GLES20.glBindFramebuffer(36160, 0);
        }

        /* renamed from: g */
        public final C65942b mo163464g(EGLContext eGLContext, EGLDisplay eGLDisplay, Object obj) {
            C87412m.m108594g(eGLContext, "mEGLContext");
            C87412m.m108594g(eGLDisplay, "mEGLDisplay");
            Log.m105924i("MicroMsg.GLEnvironmentUtil", "eglBind Surface");
            EGLConfig[] eGLConfigArr = new EGLConfig[1];
            EGLDisplay eGLDisplay2 = eGLDisplay;
            EGL14.eglChooseConfig(eGLDisplay2, C111742d.f334652f, 0, eGLConfigArr, 0, 1, new int[1], 0);
            EGLSurface eglCreateWindowSurface = EGL14.eglCreateWindowSurface(eGLDisplay, eGLConfigArr[0], obj, new int[]{12344}, 0);
            mo163460c("eglCreateWindowSurface", "MicroMsg.GLEnvironmentUtil");
            EGL14.eglMakeCurrent(eGLDisplay, eglCreateWindowSurface, eglCreateWindowSurface, eGLContext);
            mo163460c("eglMakeCurrent", "MicroMsg.GLEnvironmentUtil");
            return new C65942b(eGLDisplay, eglCreateWindowSurface, eGLContext);
        }

        /* renamed from: h */
        public final EGLSurface mo163465h(EGLDisplay eGLDisplay, Object obj) {
            C87412m.m108594g(eGLDisplay, "mEGLDisplay");
            EGLConfig[] eGLConfigArr = new EGLConfig[1];
            EGLDisplay eGLDisplay2 = eGLDisplay;
            EGL14.eglChooseConfig(eGLDisplay2, C111742d.f334652f, 0, eGLConfigArr, 0, 1, new int[1], 0);
            EGLSurface eglCreateWindowSurface = EGL14.eglCreateWindowSurface(eGLDisplay, eGLConfigArr[0], obj, new int[]{12344}, 0);
            C87412m.m108593f(eglCreateWindowSurface, "eglCreateWindowSurface(m…rayOf(EGL14.EGL_NONE), 0)");
            return eglCreateWindowSurface;
        }

        /* renamed from: j */
        public final C65942b mo163466j(Surface surface, SurfaceTexture surfaceTexture, int i, int i2, EGLContext eGLContext) {
            EGLConfig[] eGLConfigArr;
            EGLDisplay eGLDisplay;
            int i3;
            int[] iArr;
            Surface surface2 = surface;
            SurfaceTexture surfaceTexture2 = surfaceTexture;
            int i4 = i;
            int i5 = i2;
            EGLContext eGLContext2 = eGLContext;
            Log.m105924i("MicroMsg.GLEnvironmentUtil", "eglSetupBySurface, surface:" + surface2 + ", surfaceTexture:" + surfaceTexture2 + ", width:" + i4 + ", height:" + i5);
            EGLDisplay eglGetDisplay = EGL14.eglGetDisplay(0);
            if (eglGetDisplay != EGL14.EGL_NO_DISPLAY) {
                int[] iArr2 = new int[2];
                if (EGL14.eglInitialize(eglGetDisplay, iArr2, 0, iArr2, 1)) {
                    EGLConfig[] eGLConfigArr2 = new EGLConfig[1];
                    int[] iArr3 = new int[1];
                    if (surface2 == null && surfaceTexture2 == null) {
                        eGLConfigArr = eGLConfigArr2;
                        i3 = 2;
                        eGLDisplay = eglGetDisplay;
                        EGL14.eglChooseConfig(eglGetDisplay, C111742d.f334652f, 0, eGLConfigArr2, 0, 1, iArr3, 0);
                    } else {
                        eGLConfigArr = eGLConfigArr2;
                        eGLDisplay = eglGetDisplay;
                        i3 = 2;
                        EGL14.eglChooseConfig(eGLDisplay, C111742d.f334652f, 0, eGLConfigArr, 0, 1, iArr3, 0);
                    }
                    mo163460c("eglCreateContext RGB888+recordable ES2", "MicroMsg.GLEnvironmentUtil");
                    int decodeInt = MultiProcessMMKV.getMMKV("mmkv_gl_key").decodeInt("support_egl_context_client_version", 3);
                    int[] iArr4 = new int[3];
                    iArr4[0] = 12440;
                    iArr4[1] = decodeInt;
                    iArr4[i3] = 12344;
                    EGLDisplay eGLDisplay2 = eGLDisplay;
                    EGLContext eglCreateContext = EGL14.eglCreateContext(eGLDisplay2, eGLConfigArr[0], eGLContext2, iArr4, 0);
                    mo163460c("eglCreateContext", "MicroMsg.GLEnvironmentUtil");
                    StringBuilder sb = new StringBuilder();
                    sb.append("create eglContext: ");
                    String str = "create eglContext: ";
                    sb.append(eglCreateContext.getNativeHandle());
                    sb.append(", stack:");
                    sb.append(Util.getStack());
                    Log.m105924i("MicroMsg.GLEnvironmentUtil", sb.toString());
                    if (C87412m.m108589b(eglCreateContext, EGL14.EGL_NO_CONTEXT)) {
                        Log.m105920e("MicroMsg.GLEnvironmentUtil", "create " + decodeInt + " EGL context failed");
                        if (decodeInt == 3) {
                            Log.m105924i("MicroMsg.GLEnvironmentUtil", "retry create EGL 2.0 context");
                            iArr4[1] = i3;
                            eglCreateContext = EGL14.eglCreateContext(eGLDisplay2, eGLConfigArr[0], eGLContext2, iArr4, 0);
                            mo163460c("eglCreateContext fallback", "MicroMsg.GLEnvironmentUtil");
                            Log.m105924i("MicroMsg.GLEnvironmentUtil", str + eglCreateContext.getNativeHandle() + ", stack:" + Util.getStack());
                        }
                    }
                    if (!C87412m.m108589b(eglCreateContext, EGL14.EGL_NO_CONTEXT)) {
                        C117407d.INSTANCE.mo182089r(985, 189, 1);
                    }
                    if (i4 <= 0 || i5 <= 0) {
                        iArr = new int[]{12344};
                    } else {
                        iArr = new int[5];
                        iArr[0] = 12375;
                        iArr[1] = i4;
                        iArr[i3] = 12374;
                        iArr[3] = i5;
                        iArr[4] = 12344;
                    }
                    EGLSurface eglCreateWindowSurface = surface2 != null ? EGL14.eglCreateWindowSurface(eGLDisplay2, eGLConfigArr[0], surface2, iArr, 0) : surfaceTexture2 != null ? EGL14.eglCreateWindowSurface(eGLDisplay2, eGLConfigArr[0], surfaceTexture2, iArr, 0) : EGL14.eglCreatePbufferSurface(eGLDisplay2, eGLConfigArr[0], iArr, 0);
                    if (surface2 != null) {
                        mo163460c("eglCreateWindowSurface", "MicroMsg.GLEnvironmentUtil");
                    } else {
                        mo163460c("eglCreatePbufferSurface", "MicroMsg.GLEnvironmentUtil");
                    }
                    if (eglCreateWindowSurface != null) {
                        EGL14.eglMakeCurrent(eGLDisplay2, eglCreateWindowSurface, eglCreateWindowSurface, eglCreateContext);
                        mo163460c("eglMakeCurrent", "MicroMsg.GLEnvironmentUtil");
                    }
                    C87412m.m108593f(eGLDisplay2, "mEGLDisplay");
                    return new C65942b(eGLDisplay2, eglCreateWindowSurface, eglCreateContext);
                }
                throw new RuntimeException("unable to initialize EGL14");
            }
            throw new RuntimeException("unable to get EGL14 display");
        }

        /* renamed from: m */
        public final void mo163467m(C65942b bVar, EGLSurface eGLSurface) {
            C87412m.m108594g(eGLSurface, "backupSurface");
            if (bVar != null) {
                Log.m105924i("MicroMsg.GLEnvironmentUtil", "eglUnbindSurface");
                EGL14.eglDestroySurface(bVar.f189591a, bVar.f189592b);
                EGL14.eglMakeCurrent(bVar.f189591a, eGLSurface, eGLSurface, bVar.f189593c);
            }
        }

        /* renamed from: n */
        public final int mo163468n() {
            int[] iArr = new int[1];
            GLES20.glGenTextures(1, iArr, 0);
            GLES20.glBindTexture(3553, iArr[0]);
            GLES20.glTexParameteri(3553, 10241, 9729);
            GLES20.glTexParameteri(3553, Task.EXTRAS_LIMIT_BYTES, 9728);
            GLES20.glTexParameteri(3553, 10242, 33071);
            GLES20.glTexParameteri(3553, 10243, 33071);
            GLES20.glBindTexture(3553, 0);
            mo163462e("genTexture");
            return iArr[0];
        }

        /* renamed from: o */
        public final int mo163469o(String str, int i) {
            C87412m.m108594g(str, "shaderSource");
            int[] iArr = new int[1];
            int glCreateShader = GLES20.glCreateShader(i);
            GLES20.glShaderSource(glCreateShader, str);
            GLES20.glCompileShader(glCreateShader);
            GLES20.glGetShaderiv(glCreateShader, 35713, iArr, 0);
            if (iArr[0] != 0) {
                return glCreateShader;
            }
            Log.m105920e("MicroMsg.GLEnvironmentUtil", "loadShader error, infoLog: " + GLES20.glGetShaderInfoLog(glCreateShader));
            return 0;
        }

        /* renamed from: p */
        public final int mo163470p(String str, String str2) {
            C87412m.m108594g(str, "vertexShaderSource");
            C87412m.m108594g(str2, "fragmentShaderSource");
            int[] iArr = new int[1];
            int o = mo163469o(str, 35633);
            if (o == 0) {
                Log.m105920e("MicroMsg.GLEnvironmentUtil", "load vertex shader failed");
                return 0;
            }
            int o2 = mo163469o(str2, 35632);
            if (o2 == 0) {
                Log.m105920e("MicroMsg.GLEnvironmentUtil", "load fragment shader failed");
                return 0;
            }
            int glCreateProgram = GLES20.glCreateProgram();
            GLES20.glAttachShader(glCreateProgram, o);
            GLES20.glAttachShader(glCreateProgram, o2);
            GLES20.glLinkProgram(glCreateProgram);
            GLES20.glGetProgramiv(glCreateProgram, 35714, iArr, 0);
            if (iArr[0] <= 0) {
                Log.m105920e("MicroMsg.GLEnvironmentUtil", "link program failed");
                return 0;
            }
            GLES20.glDeleteShader(o);
            GLES20.glDeleteShader(o2);
            return glCreateProgram;
        }

        /* renamed from: q */
        public final void mo163471q(C65942b bVar) {
            if (bVar != null) {
                if (bVar.f189592b != EGL14.EGL_NO_DISPLAY) {
                    EGLDisplay eGLDisplay = bVar.f189591a;
                    EGLSurface eGLSurface = EGL14.EGL_NO_SURFACE;
                    EGL14.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, EGL14.EGL_NO_CONTEXT);
                    EGL14.eglDestroySurface(bVar.f189591a, bVar.f189592b);
                    Log.m105924i("MicroMsg.GLEnvironmentUtil", "destroy eglContext: " + bVar.f189593c.getNativeHandle() + ", stack:" + Util.getStack());
                    EGL14.eglDestroyContext(bVar.f189591a, bVar.f189593c);
                    EGL14.eglReleaseThread();
                    EGL14.eglTerminate(bVar.f189591a);
                }
                EGLDisplay eGLDisplay2 = EGL14.EGL_NO_DISPLAY;
                C87412m.m108593f(eGLDisplay2, "EGL_NO_DISPLAY");
                bVar.f189591a = eGLDisplay2;
                EGLContext eGLContext = EGL14.EGL_NO_CONTEXT;
                C87412m.m108593f(eGLContext, "EGL_NO_CONTEXT");
                bVar.f189593c = eGLContext;
                bVar.f189592b = EGL14.EGL_NO_SURFACE;
            }
        }

        /* renamed from: r */
        public final Bitmap mo163472r(int i, int i2, int i3) {
            int[] iArr = new int[1];
            GLES20.glGenFramebuffers(1, iArr, 0);
            GLES20.glBindFramebuffer(36160, iArr[0]);
            GLES20.glFramebufferTexture2D(36160, 36064, 3553, i, 0);
            ByteBuffer allocate = ByteBuffer.allocate(i2 * i3 * 4);
            GLES20.glReadPixels(0, 0, i2, i3, NativeBitmapStruct.GLFormat.GL_RGBA, NativeBitmapStruct.GLType.GL_UNSIGNED_BYTE, allocate);
            Bitmap createBitmap = Bitmap.createBitmap(i2, i3, Bitmap.Config.ARGB_8888);
            createBitmap.copyPixelsFromBuffer(allocate);
            GLES20.glBindFramebuffer(36160, 0);
            GLES20.glDeleteFramebuffers(1, iArr, 0);
            return createBitmap;
        }

        /* renamed from: s */
        public final void mo163473s(float[] fArr, int i, int i2) {
            C87412m.m108594g(fArr, "textureCoords");
            float f = fArr[i];
            fArr[i] = fArr[i2];
            fArr[i2] = f;
        }

        /* renamed from: t */
        public final boolean mo163474t(EGLDisplay eGLDisplay, EGLSurface eGLSurface) {
            if (eGLDisplay == null || eGLSurface == null) {
                return false;
            }
            boolean eglSwapBuffers = EGL14.eglSwapBuffers(eGLDisplay, eGLSurface);
            mo163460c("eglSwapBuffers", "MicroMsg.GLEnvironmentUtil");
            return eglSwapBuffers;
        }
    }

    static {
        ConfigurationInfo configurationInfo = null;
        Context context = MMApplicationContext.getContext();
        C87412m.m108593f(context, "getContext()");
        try {
            ActivityManager activityManager = (ActivityManager) context.getSystemService(EnvConsts.ACTIVITY_MANAGER_SRVNAME);
            if (activityManager != null) {
                configurationInfo = activityManager.getDeviceConfigurationInfo();
            }
            if (configurationInfo != null) {
                int i = (configurationInfo.reqGlEsVersion & -65536) >> 16;
                MultiProcessMMKV mmkv = MultiProcessMMKV.getMMKV("mmkv_gl_key");
                int decodeInt = mmkv.decodeInt("support_egl_context_client_version", 3);
                Log.m105924i("MicroMsg.GLEnvironmentUtil", "egl support version " + configurationInfo.getGlEsVersion() + "   configurationInfo.reqGlEsVersion : " + configurationInfo.reqGlEsVersion + "   major:" + i + "  curVersion:" + decodeInt);
                int i2 = 2;
                if (decodeInt >= 3 && i == 2) {
                    Log.m105924i("MicroMsg.GLEnvironmentUtil", "markEglVersion2");
                    C117407d.INSTANCE.mo182089r(985, 11, 1);
                }
                if (!mmkv.decodeBool("has_reported_egl_version", false)) {
                    Log.m105924i("MicroMsg.GLEnvironmentUtil", "markEglVersion3");
                    C117407d.INSTANCE.mo182089r(985, 12, 1);
                    mmkv.encode("has_reported_egl_version", true);
                }
                if (i >= 3) {
                    i = 3;
                }
                if (i > 2) {
                    i2 = i;
                }
                mmkv.encode("support_egl_context_client_version", i2);
            }
            if (configurationInfo == null) {
                Log.m105920e("MicroMsg.GLEnvironmentUtil", "configurationInfo == null");
            }
            if (!C117731d.m166007c().mo182445g("clicfg_gles_version_enable", true, true)) {
                MultiProcessMMKV.getMMKV("mmkv_gl_key").encode("support_egl_context_client_version", 3);
            }
        } catch (Exception e) {
            Log.printErrStackTrace("MicroMsg.GLEnvironmentUtil", e, "", new Object[0]);
        }
    }
}

package j71;

import android.graphics.SurfaceTexture;
import android.opengl.GLES20;
import android.opengl.GLUtils;
import android.os.HandlerThread;
import android.view.Surface;
import com.tencent.mapsdk.internal.C0947jz;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandler;
import eu3.C58834h;
import eu3.C97749e;
import fy3.C32224a;
import gy3.C87412m;
import j71.C108585b;
import javax.microedition.khronos.egl.EGL;
import javax.microedition.khronos.egl.EGL10;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.egl.EGLContext;
import javax.microedition.khronos.egl.EGLDisplay;
import javax.microedition.khronos.egl.EGLSurface;
import javax.microedition.khronos.opengles.GL;
import javax.microedition.khronos.opengles.GL10;
import p80.C110193b;
import p80.C110194c;
import rh3.C101383g;
import rx3.C13598b0;

/* renamed from: j71.c */
public final class C108587c {

    /* renamed from: a */
    public final boolean f325052a;

    /* renamed from: b */
    public final C101383g f325053b;

    /* renamed from: c */
    public final EGL10 f325054c;

    /* renamed from: d */
    public EGLDisplay f325055d = EGL10.EGL_NO_DISPLAY;

    /* renamed from: e */
    public EGLContext f325056e = EGL10.EGL_NO_CONTEXT;

    /* renamed from: f */
    public EGLSurface f325057f = EGL10.EGL_NO_SURFACE;

    /* renamed from: g */
    public EGLConfig f325058g;

    /* renamed from: h */
    public GL10 f325059h;

    /* renamed from: i */
    public C108591i f325060i;

    /* renamed from: j */
    public Surface f325061j;

    /* renamed from: k */
    public MMHandler f325062k;

    /* renamed from: l */
    public HandlerThread f325063l;

    /* renamed from: m */
    public C32224a<C13598b0> f325064m;

    /* renamed from: j71.c$a */
    public static final class C108588a implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ C108587c f325065d;

        public C108588a(C108587c cVar) {
            this.f325065d = cVar;
        }

        public final void run() {
            EGLConfig eGLConfig;
            int i;
            C108587c cVar = this.f325065d;
            EGLDisplay eglGetDisplay = cVar.f325054c.eglGetDisplay(EGL10.EGL_DEFAULT_DISPLAY);
            cVar.f325055d = eglGetDisplay;
            int i2 = 0;
            if (eglGetDisplay == EGL10.EGL_NO_DISPLAY) {
                Log.m105921e("MicroMsg.EmojiCaptureEGLPixelBuffer", "egl get display error: %s", GLUtils.getEGLErrorString(cVar.f325054c.eglGetError()));
            }
            if (!cVar.f325054c.eglInitialize(cVar.f325055d, new int[2])) {
                Log.m105921e("MicroMsg.EmojiCaptureEGLPixelBuffer", "egl init error: %s", GLUtils.getEGLErrorString(cVar.f325054c.eglGetError()));
                Log.m105924i("MicroMsg.EmojiCaptureDetailIDKeyStat", "markPixelBufferInitFailed");
                C115669n.INSTANCE.mo175913w(1012, 25, 1);
            } else {
                EGL10 egl10 = cVar.f325054c;
                EGLDisplay eGLDisplay = cVar.f325055d;
                C87412m.m108593f(eGLDisplay, "eGLDisplay");
                C87412m.m108594g(egl10, "eGL");
                int[] iArr = new int[1];
                EGL10 egl102 = egl10;
                EGLDisplay eGLDisplay2 = eGLDisplay;
                int[] iArr2 = {12324, 8, 12323, 8, 12322, 8, 12321, 8, 12325, 0, 12326, 0, 12352, 4, 12344};
                int[] iArr3 = iArr;
                egl102.eglChooseConfig(eGLDisplay2, iArr2, (EGLConfig[]) null, 0, iArr3);
                int i3 = iArr[0];
                EGLConfig[] eGLConfigArr = new EGLConfig[i3];
                if (!egl102.eglChooseConfig(eGLDisplay2, iArr2, eGLConfigArr, i3, iArr3)) {
                    Log.m105921e("MicroMsg.EmojiCaptureGLUtil", "egl choose config failed: %s", GLUtils.getEGLErrorString(egl10.eglGetError()));
                    eGLConfig = null;
                } else {
                    eGLConfig = eGLConfigArr[0];
                }
                cVar.f325058g = eGLConfig;
                if (eGLConfig != null) {
                    cVar.f325056e = cVar.f325054c.eglCreateContext(cVar.f325055d, eGLConfig, EGL10.EGL_NO_CONTEXT, new int[]{12440, 2, 12344});
                    EGLSurface eglCreatePbufferSurface = cVar.f325054c.eglCreatePbufferSurface(cVar.f325055d, eGLConfig, new int[]{12375, C0947jz.f2205e, 12374, C0947jz.f2205e, 12344});
                    cVar.f325057f = eglCreatePbufferSurface;
                    if (eglCreatePbufferSurface == EGL10.EGL_NO_SURFACE || cVar.f325056e == EGL10.EGL_NO_CONTEXT) {
                        i = -1;
                        if (cVar.f325054c.eglGetError() == 12299) {
                            Log.m105920e("MicroMsg.EmojiCaptureEGLPixelBuffer", "eglCreateWindowSurface returned EGL_BAD_NATIVE_WINDOW. ");
                        } else {
                            Log.m105921e("MicroMsg.EmojiCaptureEGLPixelBuffer", "eglCreateWindowSurface failed : %s", GLUtils.getEGLErrorString(cVar.f325054c.eglGetError()));
                        }
                    } else {
                        i = 0;
                    }
                    if (i < 0) {
                        Log.m105920e("MicroMsg.EmojiCaptureEGLPixelBuffer", "createEGLContext failed " + i);
                        Log.m105924i("MicroMsg.EmojiCaptureDetailIDKeyStat", "markPixelBufferInitFailed");
                        C115669n.INSTANCE.mo175913w(1012, 25, 1);
                    } else {
                        EGL10 egl103 = cVar.f325054c;
                        EGLDisplay eGLDisplay3 = cVar.f325055d;
                        EGLSurface eGLSurface = cVar.f325057f;
                        if (!egl103.eglMakeCurrent(eGLDisplay3, eGLSurface, eGLSurface, cVar.f325056e)) {
                            Log.m105920e("MicroMsg.EmojiCaptureEGLPixelBuffer", "eglMakeCurrent failed : " + GLUtils.getEGLErrorString(cVar.f325054c.eglGetError()));
                            Log.m105924i("MicroMsg.EmojiCaptureDetailIDKeyStat", "markPixelBufferInitFailed");
                            C115669n.INSTANCE.mo175913w(1012, 25, 1);
                        }
                        GL gl = cVar.f325056e.getGL();
                        C87412m.m108592e(gl, "null cannot be cast to non-null type javax.microedition.khronos.opengles.GL10");
                        cVar.f325059h = (GL10) gl;
                    }
                }
            }
            C108591i iVar = new C108591i(cVar.f325052a, cVar.f325053b);
            cVar.f325060i = iVar;
            if (!iVar.f325077H) {
                Log.m105924i("MicroMsg.EmojiCaptureMixRenderer", "init: ");
                C108585b.C108586a aVar = C108585b.f325048a;
                C110194c b = C110193b.m149776b(false, -1);
                iVar.f325086g = new SurfaceTexture(b.f329652e);
                iVar.f325085f = b;
                iVar.f325087h = C110193b.m149776b(true, -1);
                int b2 = aVar.mo159580b("\n        attribute vec4 a_position;\n        attribute vec2 a_texCoord;\n        varying vec2 v_texCoord;\n        uniform mat4 uMatrix;\n        void main() {\n            gl_Position = uMatrix * a_position;\n            v_texCoord = a_texCoord;\n        }\n        ", "\n        #extension GL_OES_EGL_image_external : require\n        #ifdef GL_ES\n        precision highp float;\n        #endif\n\n        varying vec2 v_texCoord;\n        uniform samplerExternalOES videoExternalTexture;\n        uniform sampler2D videoNormalTexture;\n        uniform sampler2D emojiTexture;\n        uniform vec2 size;\n        uniform float radius;\n        uniform int hasEmojiTexture;\n        uniform int useNormalVideoTexture;\n        uniform int enableAlpha;\n\n        vec4 blendTexture(vec4 source, vec4 blend) {\n            if (blend.a <= 0.0) {\n                return source;\n            }\n            float sourceAlpha = 1.0 - blend.a;\n            float alpha = max(source.a, blend.a);\n            float r = max(0.0, min(sourceAlpha * source.r + blend.r, 1.0));\n            float g = max(0.0, min(sourceAlpha * source.g + blend.g, 1.0));\n            float b = max(0.0, min(sourceAlpha * source.b + blend.b, 1.0));\n            vec4 result = vec4(r, g, b, alpha);\n            if (alpha != 1.0) {\n                r = r + (1.0 - alpha) * 0.95;\n                g = g + (1.0 - alpha) * 0.95;\n                b = b + (1.0 - alpha) * 0.95;\n                r = max(0.0, min(r, 1.0));\n                g = max(0.0, min(g, 1.0));\n                b = max(0.0, min(b, 1.0));\n                return vec4(r, g, b, 1.0);\n            } else {\n                return vec4(r, g, b, alpha);\n            }\n        }\n\n        void main () {\n            vec2 bottomLeftCenter = vec2(radius, radius);\n            vec2 bottomRightCenter = vec2(size.x - radius, radius);\n            vec2 topLeftCenter = vec2(radius, size.y - radius);\n            vec2 topRightCenter = vec2(size.x - radius, size.y - radius);\n            if ((gl_FragCoord.x < bottomLeftCenter.x && gl_FragCoord.y < bottomLeftCenter.y && distance(gl_FragCoord.xy, bottomLeftCenter) > radius) ||\n                    (gl_FragCoord.x > bottomRightCenter.x && gl_FragCoord.y < bottomRightCenter.y && distance(gl_FragCoord.xy, bottomRightCenter) > radius) ||\n                    (gl_FragCoord.x < topLeftCenter.x && gl_FragCoord.y > topLeftCenter.y && distance(gl_FragCoord.xy, topLeftCenter) > radius) ||\n                    (gl_FragCoord.x > topRightCenter.x && gl_FragCoord.y > topRightCenter.y && distance(gl_FragCoord.xy, topRightCenter) > radius))  {\n                gl_FragColor = vec4(0.0, 0.0, 0.0, 0.0);\n                return;\n            } else {\n                vec4 videoColor;\n                if (useNormalVideoTexture == 1) {\n                    videoColor = texture2D(videoNormalTexture, v_texCoord);\n                } else {\n                    videoColor = texture2D(videoExternalTexture, v_texCoord);\n                }\n                if (enableAlpha == 0) {\n                    if (videoColor.a < 0.3) {\n                        videoColor = vec4(0.0, 0.0, 0.0, 0.0);\n                    } else {\n                        videoColor.a = 1.0;\n                    }\n                } else {\n                    if (videoColor.a == 0.0) {\n                        videoColor = vec4(0.0, 0.0, 0.0, 0.0);\n                    }\n                }\n                if (hasEmojiTexture == 1) {\n                    gl_FragColor = blendTexture(videoColor, texture2D(emojiTexture, v_texCoord));\n                } else {\n                    gl_FragColor = videoColor;\n                }\n            }\n        }\n        ");
                iVar.f325089j = b2;
                iVar.f325090k = GLES20.glGetAttribLocation(b2, "a_position");
                iVar.f325091l = GLES20.glGetAttribLocation(iVar.f325089j, "a_texCoord");
                iVar.f325092m = GLES20.glGetUniformLocation(iVar.f325089j, "videoExternalTexture");
                iVar.f325093n = GLES20.glGetUniformLocation(iVar.f325089j, "videoNormalTexture");
                iVar.f325094o = GLES20.glGetUniformLocation(iVar.f325089j, "emojiTexture");
                iVar.f325095p = GLES20.glGetUniformLocation(iVar.f325089j, "size");
                iVar.f325096q = GLES20.glGetUniformLocation(iVar.f325089j, "radius");
                iVar.f325097r = GLES20.glGetUniformLocation(iVar.f325089j, "hasEmojiTexture");
                iVar.f325099t = GLES20.glGetUniformLocation(iVar.f325089j, "uMatrix");
                iVar.f325098s = GLES20.glGetUniformLocation(iVar.f325089j, "useNormalVideoTexture");
                iVar.f325100u = GLES20.glGetUniformLocation(iVar.f325089j, "enableAlpha");
                int b3 = aVar.mo159580b("\n        attribute vec4 a_position;\n        attribute vec2 a_texCoord;\n        varying vec2 v_texCoord;\n        void main() {\n            gl_Position = a_position;\n            v_texCoord = a_texCoord;\n        }\n        ", "\n        #extension GL_OES_EGL_image_external : require\n        #ifdef GL_ES\n        precision highp float;\n        #endif\n\n        varying vec2 v_texCoord;\n        uniform samplerExternalOES texture;\n\n        void main () {\n            gl_FragColor = texture2D(texture, v_texCoord);\n        }\n        ");
                iVar.f325101v = b3;
                iVar.f325102w = GLES20.glGetAttribLocation(b3, "a_position");
                iVar.f325103x = GLES20.glGetAttribLocation(iVar.f325101v, "a_texCoord");
                iVar.f325104y = GLES20.glGetUniformLocation(iVar.f325101v, "texture");
                iVar.f325073D.put(C108585b.f325049b);
                iVar.f325074E.put(C108585b.f325050c);
                int[] iArr4 = new int[1];
                GLES20.glGenFramebuffers(1, iArr4, 0);
                int i4 = iArr4[0];
                if (i4 == 0) {
                    Log.m105920e("MicroMsg.EmojiCaptureGLUtil", "gen frame buffer error");
                } else {
                    i2 = i4;
                }
                iVar.f325070A = i2;
                iVar.f325071B = C110193b.m149776b(true, -1);
                iVar.f325072C = C110193b.m149776b(true, -1);
                iVar.f325077H = true;
            }
            C108591i iVar2 = cVar.f325060i;
            if (iVar2 != null) {
                SurfaceTexture surfaceTexture = iVar2.f325086g;
                if (surfaceTexture != null) {
                    surfaceTexture.setOnFrameAvailableListener(new C98912f(cVar));
                    C108591i iVar3 = cVar.f325060i;
                    if (iVar3 != null) {
                        SurfaceTexture surfaceTexture2 = iVar3.f325086g;
                        if (surfaceTexture2 != null) {
                            cVar.f325061j = new Surface(surfaceTexture2);
                        } else {
                            C87412m.m108603p("videoDecodeSurfaceTexture");
                            throw null;
                        }
                    } else {
                        C87412m.m108603p("renderer");
                        throw null;
                    }
                } else {
                    C87412m.m108603p("videoDecodeSurfaceTexture");
                    throw null;
                }
            } else {
                C87412m.m108603p("renderer");
                throw null;
            }
        }
    }

    public C108587c(int i, int i2, boolean z, C101383g gVar) {
        this.f325052a = z;
        this.f325053b = gVar;
        EGL egl = EGLContext.getEGL();
        C87412m.m108592e(egl, "null cannot be cast to non-null type javax.microedition.khronos.egl.EGL10");
        this.f325054c = (EGL10) egl;
        int i3 = C58834h.f168432b;
        HandlerThread a = C97749e.m126093a("EmojiCaptureMixEGLPixelBuffer_GLThread", 5);
        this.f325063l = a;
        a.start();
        MMHandler mMHandler = new MMHandler(this.f325063l.getLooper());
        this.f325062k = mMHandler;
        mMHandler.post(new C108588a(this));
    }
}

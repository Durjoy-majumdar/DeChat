package com.tencent.p014mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.SphereImageView;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.opengl.GLDebugHelper;
import android.util.AttributeSet;
import android.view.TextureView;
import android.view.View;
import com.tencent.midas.data.APMidasPluginInfo;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.xweb.IXWebBroadcastListener;
import java.io.Writer;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import javax.microedition.khronos.egl.EGL10;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.egl.EGLContext;
import javax.microedition.khronos.egl.EGLDisplay;
import javax.microedition.khronos.egl.EGLSurface;
import javax.microedition.khronos.opengles.GL;
import javax.microedition.khronos.opengles.GL10;

/* renamed from: com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.SphereImageView.GLTextureView */
public class GLTextureView extends TextureView implements TextureView.SurfaceTextureListener, View.OnLayoutChangeListener {

    /* renamed from: r */
    public static final C115747k f347194r = new C115747k((C115737a) null);

    /* renamed from: d */
    public final WeakReference<GLTextureView> f347195d = new WeakReference<>(this);

    /* renamed from: e */
    public C115746j f347196e;

    /* renamed from: f */
    public C115748n f347197f;

    /* renamed from: g */
    public boolean f347198g;

    /* renamed from: h */
    public C115742f f347199h;

    /* renamed from: i */
    public C115743g f347200i;

    /* renamed from: j */
    public C115744h f347201j;

    /* renamed from: n */
    public int f347202n;

    /* renamed from: o */
    public int f347203o;

    /* renamed from: p */
    public boolean f347204p;

    /* renamed from: q */
    public List<TextureView.SurfaceTextureListener> f347205q = new ArrayList();

    /* renamed from: com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.SphereImageView.GLTextureView$l */
    public interface C71194l {
        /* renamed from: a */
        GL mo97898a(GL gl);
    }

    /* renamed from: com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.SphereImageView.GLTextureView$m */
    public static class C71195m extends Writer {

        /* renamed from: d */
        public StringBuilder f206062d = new StringBuilder();

        /* renamed from: a */
        public final void mo97899a() {
            SnsMethodCalculate.markStartTimeMs("flushBuilder", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.SphereImageView.GLTextureView$LogWriter");
            if (this.f206062d.length() > 0) {
                this.f206062d.toString();
                StringBuilder sb = this.f206062d;
                sb.delete(0, sb.length());
            }
            SnsMethodCalculate.markEndTimeMs("flushBuilder", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.SphereImageView.GLTextureView$LogWriter");
        }

        public void close() {
            SnsMethodCalculate.markStartTimeMs("close", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.SphereImageView.GLTextureView$LogWriter");
            mo97899a();
            SnsMethodCalculate.markEndTimeMs("close", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.SphereImageView.GLTextureView$LogWriter");
        }

        public void flush() {
            SnsMethodCalculate.markStartTimeMs("flush", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.SphereImageView.GLTextureView$LogWriter");
            mo97899a();
            SnsMethodCalculate.markEndTimeMs("flush", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.SphereImageView.GLTextureView$LogWriter");
        }

        public void write(char[] cArr, int i, int i2) {
            SnsMethodCalculate.markStartTimeMs("write", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.SphereImageView.GLTextureView$LogWriter");
            for (int i3 = 0; i3 < i2; i3++) {
                char c = cArr[i + i3];
                if (c == 10) {
                    mo97899a();
                } else {
                    this.f206062d.append(c);
                }
            }
            SnsMethodCalculate.markEndTimeMs("write", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.SphereImageView.GLTextureView$LogWriter");
        }
    }

    /* renamed from: com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.SphereImageView.GLTextureView$b */
    public abstract class C115738b implements C115742f {

        /* renamed from: a */
        public int[] f347206a;

        public C115738b(int[] iArr) {
            SnsMethodCalculate.markStartTimeMs("filterConfigSpec", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.SphereImageView.GLTextureView$BaseConfigChooser");
            C115747k kVar = GLTextureView.f347194r;
            SnsMethodCalculate.markStartTimeMs("access$200", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.SphereImageView.GLTextureView");
            int i = GLTextureView.this.f347203o;
            SnsMethodCalculate.markEndTimeMs("access$200", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.SphereImageView.GLTextureView");
            if (i != 2) {
                SnsMethodCalculate.markEndTimeMs("filterConfigSpec", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.SphereImageView.GLTextureView$BaseConfigChooser");
            } else {
                int length = iArr.length;
                int[] iArr2 = new int[(length + 2)];
                int i2 = length - 1;
                System.arraycopy(iArr, 0, iArr2, 0, i2);
                iArr2[i2] = 12352;
                iArr2[length] = 4;
                iArr2[length + 1] = 12344;
                SnsMethodCalculate.markEndTimeMs("filterConfigSpec", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.SphereImageView.GLTextureView$BaseConfigChooser");
                iArr = iArr2;
            }
            this.f347206a = iArr;
        }
    }

    /* renamed from: com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.SphereImageView.GLTextureView$c */
    public class C115739c extends C115738b {

        /* renamed from: c */
        public int[] f347208c = new int[1];

        /* renamed from: d */
        public int f347209d;

        /* renamed from: e */
        public int f347210e;

        /* renamed from: f */
        public int f347211f;

        /* renamed from: g */
        public int f347212g;

        /* renamed from: h */
        public int f347213h;

        /* renamed from: i */
        public int f347214i;

        public C115739c(int i, int i2, int i3, int i4, int i5, int i6) {
            super(new int[]{12324, i, 12323, i2, 12322, i3, 12321, i4, 12325, i5, 12326, i6, 12344});
            this.f347209d = i;
            this.f347210e = i2;
            this.f347211f = i3;
            this.f347212g = i4;
            this.f347213h = i5;
            this.f347214i = i6;
        }

        /* renamed from: a */
        public final int mo176067a(EGL10 egl10, EGLDisplay eGLDisplay, EGLConfig eGLConfig, int i, int i2) {
            SnsMethodCalculate.markStartTimeMs("findConfigAttrib", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.SphereImageView.GLTextureView$ComponentSizeChooser");
            if (egl10.eglGetConfigAttrib(eGLDisplay, eGLConfig, i, this.f347208c)) {
                int i3 = this.f347208c[0];
                SnsMethodCalculate.markEndTimeMs("findConfigAttrib", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.SphereImageView.GLTextureView$ComponentSizeChooser");
                return i3;
            }
            SnsMethodCalculate.markEndTimeMs("findConfigAttrib", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.SphereImageView.GLTextureView$ComponentSizeChooser");
            return i2;
        }
    }

    /* renamed from: com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.SphereImageView.GLTextureView$d */
    public class C115740d implements C115743g {
        public C115740d(C115737a aVar) {
        }
    }

    /* renamed from: com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.SphereImageView.GLTextureView$e */
    public static class C115741e implements C115744h {
        public C115741e(C115737a aVar) {
        }
    }

    /* renamed from: com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.SphereImageView.GLTextureView$f */
    public interface C115742f {
    }

    /* renamed from: com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.SphereImageView.GLTextureView$g */
    public interface C115743g {
    }

    /* renamed from: com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.SphereImageView.GLTextureView$h */
    public interface C115744h {
    }

    /* renamed from: com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.SphereImageView.GLTextureView$i */
    public static class C115745i {

        /* renamed from: a */
        public WeakReference<GLTextureView> f347217a;

        /* renamed from: b */
        public EGL10 f347218b;

        /* renamed from: c */
        public EGLDisplay f347219c;

        /* renamed from: d */
        public EGLSurface f347220d;

        /* renamed from: e */
        public EGLConfig f347221e;

        /* renamed from: f */
        public EGLContext f347222f;

        public C115745i(WeakReference<GLTextureView> weakReference) {
            this.f347217a = weakReference;
        }

        /* renamed from: d */
        public static String m162780d(String str, int i) {
            SnsMethodCalculate.markStartTimeMs("formatEglError", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.SphereImageView.GLTextureView$EglHelper");
            String str2 = str + " failed: " + i;
            SnsMethodCalculate.markEndTimeMs("formatEglError", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.SphereImageView.GLTextureView$EglHelper");
            return str2;
        }

        /* renamed from: a */
        public GL mo176068a() {
            SnsMethodCalculate.markStartTimeMs("createGL", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.SphereImageView.GLTextureView$EglHelper");
            GL gl = this.f347222f.getGL();
            GLTextureView gLTextureView = this.f347217a.get();
            if (gLTextureView != null) {
                C115747k kVar = GLTextureView.f347194r;
                SnsMethodCalculate.markStartTimeMs("access$700", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.SphereImageView.GLTextureView");
                gLTextureView.getClass();
                SnsMethodCalculate.markEndTimeMs("access$700", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.SphereImageView.GLTextureView");
                SnsMethodCalculate.markStartTimeMs("access$800", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.SphereImageView.GLTextureView");
                int i = gLTextureView.f347202n;
                SnsMethodCalculate.markEndTimeMs("access$800", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.SphereImageView.GLTextureView");
                if ((i & 3) != 0) {
                    int i2 = 0;
                    C71195m mVar = null;
                    SnsMethodCalculate.markStartTimeMs("access$800", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.SphereImageView.GLTextureView");
                    int i3 = gLTextureView.f347202n;
                    SnsMethodCalculate.markEndTimeMs("access$800", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.SphereImageView.GLTextureView");
                    if ((i3 & 1) != 0) {
                        i2 = 1;
                    }
                    SnsMethodCalculate.markStartTimeMs("access$800", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.SphereImageView.GLTextureView");
                    int i4 = gLTextureView.f347202n;
                    SnsMethodCalculate.markEndTimeMs("access$800", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.SphereImageView.GLTextureView");
                    if ((i4 & 2) != 0) {
                        mVar = new C71195m();
                    }
                    gl = GLDebugHelper.wrap(gl, i2, mVar);
                }
            }
            SnsMethodCalculate.markEndTimeMs("createGL", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.SphereImageView.GLTextureView$EglHelper");
            return gl;
        }

        /* renamed from: b */
        public boolean mo176069b() {
            SnsMethodCalculate.markStartTimeMs("createSurface", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.SphereImageView.GLTextureView$EglHelper");
            if (this.f347218b == null) {
                RuntimeException runtimeException = new RuntimeException("egl not initialized");
                SnsMethodCalculate.markEndTimeMs("createSurface", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.SphereImageView.GLTextureView$EglHelper");
                throw runtimeException;
            } else if (this.f347219c == null) {
                RuntimeException runtimeException2 = new RuntimeException("eglDisplay not initialized");
                SnsMethodCalculate.markEndTimeMs("createSurface", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.SphereImageView.GLTextureView$EglHelper");
                throw runtimeException2;
            } else if (this.f347221e != null) {
                mo176070c();
                GLTextureView gLTextureView = this.f347217a.get();
                EGLSurface eGLSurface = null;
                if (gLTextureView != null) {
                    C115747k kVar = GLTextureView.f347194r;
                    SnsMethodCalculate.markStartTimeMs("access$600", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.SphereImageView.GLTextureView");
                    C115744h hVar = gLTextureView.f347201j;
                    SnsMethodCalculate.markEndTimeMs("access$600", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.SphereImageView.GLTextureView");
                    EGL10 egl10 = this.f347218b;
                    EGLDisplay eGLDisplay = this.f347219c;
                    EGLConfig eGLConfig = this.f347221e;
                    SurfaceTexture surfaceTexture = gLTextureView.getSurfaceTexture();
                    ((C115741e) hVar).getClass();
                    SnsMethodCalculate.markStartTimeMs("createWindowSurface", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.SphereImageView.GLTextureView$DefaultWindowSurfaceFactory");
                    try {
                        eGLSurface = egl10.eglCreateWindowSurface(eGLDisplay, eGLConfig, surfaceTexture, (int[]) null);
                    } catch (IllegalArgumentException unused) {
                        C115747k kVar2 = GLTextureView.f347194r;
                        SnsMethodCalculate.markStartTimeMs("access$300", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.SphereImageView.GLTextureView");
                        SnsMethodCalculate.markEndTimeMs("access$300", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.SphereImageView.GLTextureView");
                    }
                    SnsMethodCalculate.markEndTimeMs("createWindowSurface", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.SphereImageView.GLTextureView$DefaultWindowSurfaceFactory");
                    this.f347220d = eGLSurface;
                } else {
                    this.f347220d = null;
                }
                EGLSurface eGLSurface2 = this.f347220d;
                if (eGLSurface2 == null || eGLSurface2 == EGL10.EGL_NO_SURFACE) {
                    this.f347218b.eglGetError();
                    SnsMethodCalculate.markEndTimeMs("createSurface", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.SphereImageView.GLTextureView$EglHelper");
                    return false;
                } else if (!this.f347218b.eglMakeCurrent(this.f347219c, eGLSurface2, eGLSurface2, this.f347222f)) {
                    int eglGetError = this.f347218b.eglGetError();
                    SnsMethodCalculate.markStartTimeMs("logEglErrorAsWarning", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.SphereImageView.GLTextureView$EglHelper");
                    m162780d("eglMakeCurrent", eglGetError);
                    SnsMethodCalculate.markEndTimeMs("logEglErrorAsWarning", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.SphereImageView.GLTextureView$EglHelper");
                    SnsMethodCalculate.markEndTimeMs("createSurface", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.SphereImageView.GLTextureView$EglHelper");
                    return false;
                } else {
                    SnsMethodCalculate.markEndTimeMs("createSurface", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.SphereImageView.GLTextureView$EglHelper");
                    return true;
                }
            } else {
                RuntimeException runtimeException3 = new RuntimeException("eglConfig not initialized");
                SnsMethodCalculate.markEndTimeMs("createSurface", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.SphereImageView.GLTextureView$EglHelper");
                throw runtimeException3;
            }
        }

        /* renamed from: c */
        public final void mo176070c() {
            EGLSurface eGLSurface;
            SnsMethodCalculate.markStartTimeMs("destroySurfaceImp", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.SphereImageView.GLTextureView$EglHelper");
            EGLSurface eGLSurface2 = this.f347220d;
            if (!(eGLSurface2 == null || eGLSurface2 == (eGLSurface = EGL10.EGL_NO_SURFACE))) {
                this.f347218b.eglMakeCurrent(this.f347219c, eGLSurface, eGLSurface, EGL10.EGL_NO_CONTEXT);
                GLTextureView gLTextureView = this.f347217a.get();
                if (gLTextureView != null) {
                    C115747k kVar = GLTextureView.f347194r;
                    SnsMethodCalculate.markStartTimeMs("access$600", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.SphereImageView.GLTextureView");
                    C115744h hVar = gLTextureView.f347201j;
                    SnsMethodCalculate.markEndTimeMs("access$600", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.SphereImageView.GLTextureView");
                    EGL10 egl10 = this.f347218b;
                    EGLDisplay eGLDisplay = this.f347219c;
                    EGLSurface eGLSurface3 = this.f347220d;
                    ((C115741e) hVar).getClass();
                    SnsMethodCalculate.markStartTimeMs("destroySurface", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.SphereImageView.GLTextureView$DefaultWindowSurfaceFactory");
                    egl10.eglDestroySurface(eGLDisplay, eGLSurface3);
                    SnsMethodCalculate.markEndTimeMs("destroySurface", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.SphereImageView.GLTextureView$DefaultWindowSurfaceFactory");
                }
                this.f347220d = null;
            }
            SnsMethodCalculate.markEndTimeMs("destroySurfaceImp", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.SphereImageView.GLTextureView$EglHelper");
        }

        /* renamed from: e */
        public void mo176071e() {
            String str;
            String str2;
            EGLConfig eGLConfig;
            EGL10 egl10;
            String str3 = "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.SphereImageView.GLTextureView$EglHelper";
            SnsMethodCalculate.markStartTimeMs(IXWebBroadcastListener.STAGE_START, str3);
            EGL10 egl102 = (EGL10) EGLContext.getEGL();
            this.f347218b = egl102;
            EGLDisplay eglGetDisplay = egl102.eglGetDisplay(EGL10.EGL_DEFAULT_DISPLAY);
            this.f347219c = eglGetDisplay;
            if (eglGetDisplay != EGL10.EGL_NO_DISPLAY) {
                if (this.f347218b.eglInitialize(eglGetDisplay, new int[2])) {
                    GLTextureView gLTextureView = this.f347217a.get();
                    if (gLTextureView == null) {
                        this.f347221e = null;
                        this.f347222f = null;
                        str2 = IXWebBroadcastListener.STAGE_START;
                        str = str3;
                    } else {
                        C115747k kVar = GLTextureView.f347194r;
                        SnsMethodCalculate.markStartTimeMs("access$400", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.SphereImageView.GLTextureView");
                        C115742f fVar = gLTextureView.f347199h;
                        SnsMethodCalculate.markEndTimeMs("access$400", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.SphereImageView.GLTextureView");
                        EGL10 egl103 = this.f347218b;
                        EGLDisplay eGLDisplay = this.f347219c;
                        C115738b bVar = (C115738b) fVar;
                        bVar.getClass();
                        SnsMethodCalculate.markStartTimeMs("chooseConfig", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.SphereImageView.GLTextureView$BaseConfigChooser");
                        int[] iArr = new int[1];
                        String str4 = "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.SphereImageView.GLTextureView$BaseConfigChooser";
                        String str5 = "chooseConfig";
                        EGLDisplay eGLDisplay2 = eGLDisplay;
                        if (egl103.eglChooseConfig(eGLDisplay, bVar.f347206a, (EGLConfig[]) null, 0, iArr)) {
                            int i = iArr[0];
                            if (i > 0) {
                                EGLConfig[] eGLConfigArr = new EGLConfig[i];
                                EGL10 egl104 = egl103;
                                EGLDisplay eGLDisplay3 = eGLDisplay2;
                                EGLConfig[] eGLConfigArr2 = eGLConfigArr;
                                str2 = IXWebBroadcastListener.STAGE_START;
                                int i2 = i;
                                if (egl104.eglChooseConfig(eGLDisplay3, bVar.f347206a, eGLConfigArr, i, iArr)) {
                                    C115739c cVar = (C115739c) bVar;
                                    String str6 = "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.SphereImageView.GLTextureView$ComponentSizeChooser";
                                    SnsMethodCalculate.markStartTimeMs(str5, str6);
                                    int i3 = 0;
                                    while (true) {
                                        if (i3 >= i2) {
                                            str = str3;
                                            SnsMethodCalculate.markEndTimeMs(str5, str6);
                                            eGLConfig = null;
                                            break;
                                        }
                                        EGLConfig eGLConfig2 = eGLConfigArr2[i3];
                                        C115739c cVar2 = cVar;
                                        EGL10 egl105 = egl103;
                                        EGLDisplay eGLDisplay4 = eGLDisplay2;
                                        EGLConfig eGLConfig3 = eGLConfig2;
                                        int i4 = i3;
                                        int i5 = i2;
                                        String str7 = str6;
                                        str = str3;
                                        int a = cVar2.mo176067a(egl105, eGLDisplay4, eGLConfig3, 12325, 0);
                                        int a2 = cVar2.mo176067a(egl105, eGLDisplay4, eGLConfig3, 12326, 0);
                                        if (a >= cVar.f347213h && a2 >= cVar.f347214i) {
                                            C115739c cVar3 = cVar;
                                            EGL10 egl106 = egl103;
                                            EGLDisplay eGLDisplay5 = eGLDisplay2;
                                            EGLConfig eGLConfig4 = eGLConfig2;
                                            int a3 = cVar3.mo176067a(egl106, eGLDisplay5, eGLConfig4, 12324, 0);
                                            int a4 = cVar3.mo176067a(egl106, eGLDisplay5, eGLConfig4, 12323, 0);
                                            egl10 = egl103;
                                            int a5 = cVar3.mo176067a(egl106, eGLDisplay5, eGLConfig4, 12322, 0);
                                            int a6 = cVar3.mo176067a(egl106, eGLDisplay5, eGLConfig4, 12321, 0);
                                            if (a3 == cVar.f347209d && a4 == cVar.f347210e && a5 == cVar.f347211f && a6 == cVar.f347212g) {
                                                SnsMethodCalculate.markEndTimeMs(str5, str7);
                                                eGLConfig = eGLConfig2;
                                                break;
                                            }
                                        } else {
                                            egl10 = egl103;
                                        }
                                        i3 = i4 + 1;
                                        str6 = str7;
                                        i2 = i5;
                                        egl103 = egl10;
                                        str3 = str;
                                    }
                                    if (eGLConfig != null) {
                                        SnsMethodCalculate.markEndTimeMs(str5, str4);
                                        this.f347221e = eGLConfig;
                                        SnsMethodCalculate.markStartTimeMs("access$500", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.SphereImageView.GLTextureView");
                                        C115743g gVar = gLTextureView.f347200i;
                                        SnsMethodCalculate.markEndTimeMs("access$500", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.SphereImageView.GLTextureView");
                                        EGL10 egl107 = this.f347218b;
                                        EGLDisplay eGLDisplay6 = this.f347219c;
                                        EGLConfig eGLConfig5 = this.f347221e;
                                        C115740d dVar = (C115740d) gVar;
                                        dVar.getClass();
                                        SnsMethodCalculate.markStartTimeMs("createContext", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.SphereImageView.GLTextureView$DefaultContextFactory");
                                        GLTextureView gLTextureView2 = GLTextureView.this;
                                        SnsMethodCalculate.markStartTimeMs("access$200", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.SphereImageView.GLTextureView");
                                        int i6 = gLTextureView2.f347203o;
                                        SnsMethodCalculate.markEndTimeMs("access$200", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.SphereImageView.GLTextureView");
                                        int[] iArr2 = {12440, i6, 12344};
                                        EGLContext eGLContext = EGL10.EGL_NO_CONTEXT;
                                        GLTextureView gLTextureView3 = GLTextureView.this;
                                        SnsMethodCalculate.markStartTimeMs("access$200", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.SphereImageView.GLTextureView");
                                        int i7 = gLTextureView3.f347203o;
                                        SnsMethodCalculate.markEndTimeMs("access$200", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.SphereImageView.GLTextureView");
                                        if (i7 == 0) {
                                            iArr2 = null;
                                        }
                                        EGLContext eglCreateContext = egl107.eglCreateContext(eGLDisplay6, eGLConfig5, eGLContext, iArr2);
                                        SnsMethodCalculate.markEndTimeMs("createContext", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.SphereImageView.GLTextureView$DefaultContextFactory");
                                        this.f347222f = eglCreateContext;
                                    } else {
                                        IllegalArgumentException illegalArgumentException = new IllegalArgumentException("No config chosen");
                                        SnsMethodCalculate.markEndTimeMs(str5, str4);
                                        throw illegalArgumentException;
                                    }
                                } else {
                                    IllegalArgumentException illegalArgumentException2 = new IllegalArgumentException("eglChooseConfig#2 failed");
                                    SnsMethodCalculate.markEndTimeMs(str5, str4);
                                    throw illegalArgumentException2;
                                }
                            } else {
                                IllegalArgumentException illegalArgumentException3 = new IllegalArgumentException("No configs match configSpec");
                                SnsMethodCalculate.markEndTimeMs(str5, str4);
                                throw illegalArgumentException3;
                            }
                        } else {
                            IllegalArgumentException illegalArgumentException4 = new IllegalArgumentException("eglChooseConfig failed");
                            SnsMethodCalculate.markEndTimeMs(str5, str4);
                            throw illegalArgumentException4;
                        }
                    }
                    EGLContext eGLContext2 = this.f347222f;
                    if (eGLContext2 == null || eGLContext2 == EGL10.EGL_NO_CONTEXT) {
                        String str8 = str;
                        this.f347222f = null;
                        SnsMethodCalculate.markStartTimeMs("throwEglException", str8);
                        int eglGetError = this.f347218b.eglGetError();
                        SnsMethodCalculate.markStartTimeMs("throwEglException", str8);
                        RuntimeException runtimeException = new RuntimeException(m162780d("createContext", eglGetError));
                        SnsMethodCalculate.markEndTimeMs("throwEglException", str8);
                        throw runtimeException;
                    }
                    this.f347220d = null;
                    SnsMethodCalculate.markEndTimeMs(str2, str);
                    return;
                }
                RuntimeException runtimeException2 = new RuntimeException("eglInitialize failed");
                SnsMethodCalculate.markEndTimeMs(IXWebBroadcastListener.STAGE_START, str3);
                throw runtimeException2;
            }
            RuntimeException runtimeException3 = new RuntimeException("eglGetDisplay failed");
            SnsMethodCalculate.markEndTimeMs(IXWebBroadcastListener.STAGE_START, str3);
            throw runtimeException3;
        }
    }

    /* renamed from: com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.SphereImageView.GLTextureView$j */
    public static class C115746j extends Thread {

        /* renamed from: x */
        public static final /* synthetic */ int f347223x = 0;

        /* renamed from: d */
        public boolean f347224d;

        /* renamed from: e */
        public boolean f347225e;

        /* renamed from: f */
        public boolean f347226f;

        /* renamed from: g */
        public boolean f347227g;

        /* renamed from: h */
        public boolean f347228h;

        /* renamed from: i */
        public boolean f347229i;

        /* renamed from: j */
        public boolean f347230j;

        /* renamed from: n */
        public boolean f347231n;

        /* renamed from: o */
        public int f347232o = 0;

        /* renamed from: p */
        public int f347233p = 0;

        /* renamed from: q */
        public int f347234q = 1;

        /* renamed from: r */
        public boolean f347235r = true;

        /* renamed from: s */
        public boolean f347236s;

        /* renamed from: t */
        public ArrayList<Runnable> f347237t = new ArrayList<>();

        /* renamed from: u */
        public boolean f347238u = true;

        /* renamed from: v */
        public C115745i f347239v;

        /* renamed from: w */
        public WeakReference<GLTextureView> f347240w;

        public C115746j(WeakReference<GLTextureView> weakReference) {
            this.f347240w = weakReference;
        }

        /* renamed from: a */
        public int mo176072a() {
            int i;
            SnsMethodCalculate.markStartTimeMs("getRenderMode", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.SphereImageView.GLTextureView$GLThread");
            GLTextureView.m162774a();
            synchronized (GLTextureView.f347194r) {
                try {
                    i = this.f347234q;
                } catch (Throwable th) {
                    while (true) {
                        SnsMethodCalculate.markEndTimeMs("getRenderMode", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.SphereImageView.GLTextureView$GLThread");
                        throw th;
                    }
                }
            }
            SnsMethodCalculate.markEndTimeMs("getRenderMode", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.SphereImageView.GLTextureView$GLThread");
            return i;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:100:0x017f, code lost:
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs("access$1100", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.SphereImageView.GLTextureView");
            r7 = r7.f347197f;
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs("access$1100", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.SphereImageView.GLTextureView");
            r2 = r1.f347239v.f347221e;
            ((com.tencent.p014mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.SphereImageView.C106164b) r7).getClass();
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs("onSurfaceCreated", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.SphereImageView.SphereRender");
            com.tencent.p014mm.sdk.platformtools.Log.m105924i("SphereImageView.SphereRender", "onSurfaceCreated");
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs("onSurfaceCreated", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.SphereImageView.SphereRender");
         */
        /* JADX WARNING: Code restructure failed: missing block: B:101:0x01a4, code lost:
            r7 = false;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:102:0x01a5, code lost:
            if (r10 == false) goto L_0x01c3;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:103:0x01a7, code lost:
            r2 = r1.f347240w.get();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:104:0x01af, code lost:
            if (r2 == null) goto L_0x01c2;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:105:0x01b1, code lost:
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs("access$1100", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.SphereImageView.GLTextureView");
            r2 = r2.f347197f;
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs("access$1100", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.SphereImageView.GLTextureView");
            ((com.tencent.p014mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.SphereImageView.C106164b) r2).mo151985b(r6, r11, r12);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:106:0x01c2, code lost:
            r10 = false;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:107:0x01c3, code lost:
            r2 = r1.f347240w.get();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:108:0x01cb, code lost:
            if (r2 == null) goto L_0x01de;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:109:0x01cd, code lost:
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs("access$1100", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.SphereImageView.GLTextureView");
            r2 = r2.f347197f;
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs("access$1100", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.SphereImageView.GLTextureView");
            ((com.tencent.p014mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.SphereImageView.C106164b) r2).mo151984a(r6);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:110:0x01de, code lost:
            java.lang.System.currentTimeMillis();
            r0 = r1.f347239v;
            r0.getClass();
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs("swap", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.SphereImageView.GLTextureView$EglHelper");
            r18 = r3;
            r19 = r4;
            r20 = r5;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:111:0x0200, code lost:
            if (r0.f347218b.eglSwapBuffers(r0.f347219c, r0.f347220d) != false) goto L_0x020c;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:112:0x0202, code lost:
            r0 = r0.f347218b.eglGetError();
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs("swap", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.SphereImageView.GLTextureView$EglHelper");
         */
        /* JADX WARNING: Code restructure failed: missing block: B:113:0x020c, code lost:
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs("swap", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.SphereImageView.GLTextureView$EglHelper");
            r0 = 12288;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:114:0x0211, code lost:
            java.lang.System.currentTimeMillis();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:115:0x0214, code lost:
            if (r0 == 12288) goto L_0x0248;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:117:0x0218, code lost:
            if (r0 == 12302) goto L_0x0245;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:118:0x021a, code lost:
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs("logEglErrorAsWarning", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.SphereImageView.GLTextureView$EglHelper");
            com.tencent.p014mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.SphereImageView.GLTextureView.C115745i.m162780d("eglSwapBuffers", r0);
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs("logEglErrorAsWarning", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.SphereImageView.GLTextureView$EglHelper");
            com.tencent.p014mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.SphereImageView.GLTextureView.m162774a();
            r2 = com.tencent.p014mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.SphereImageView.GLTextureView.f347194r;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:119:0x022f, code lost:
            monitor-enter(r2);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:120:0x0230, code lost:
            r0 = true;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:122:?, code lost:
            r1.f347227g = true;
            com.tencent.p014mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.SphereImageView.GLTextureView.m162774a();
            r2.notifyAll();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:123:0x0239, code lost:
            monitor-exit(r2);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:131:0x0245, code lost:
            r0 = true;
            r3 = true;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:132:0x0248, code lost:
            r0 = true;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:133:0x0249, code lost:
            r3 = r18;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:134:0x024b, code lost:
            if (r14 == false) goto L_0x024e;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:135:0x024e, code lost:
            r0 = r19;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:136:0x0250, code lost:
            r4 = r0;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:137:0x0251, code lost:
            r5 = r20;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:76:0x012f, code lost:
            if (r13 == null) goto L_0x0138;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:78:?, code lost:
            r13.run();
            r13 = null;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:79:0x0138, code lost:
            if (r8 == false) goto L_0x0160;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:81:0x0140, code lost:
            if (r1.f347239v.mo176069b() != false) goto L_0x015f;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:82:0x0142, code lost:
            com.tencent.p014mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.SphereImageView.GLTextureView.m162774a();
            r15 = com.tencent.p014mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.SphereImageView.GLTextureView.f347194r;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:83:0x0147, code lost:
            monitor-enter(r15);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:85:?, code lost:
            r1.f347227g = true;
            com.tencent.p014mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.SphereImageView.GLTextureView.m162774a();
            r15.notifyAll();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:86:0x0150, code lost:
            monitor-exit(r15);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:87:0x0151, code lost:
            r20 = r5;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:94:0x015f, code lost:
            r8 = false;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:95:0x0160, code lost:
            if (r9 == false) goto L_0x0173;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:96:0x0162, code lost:
            r6 = (javax.microedition.khronos.opengles.GL10) r1.f347239v.mo176068a();
            com.tencent.p014mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.SphereImageView.GLTextureView.m162774a();
            com.tencent.p014mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.SphereImageView.GLTextureView.f347194r.mo176080a(r6);
            r9 = false;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:97:0x0173, code lost:
            if (r7 == false) goto L_0x01a5;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:98:0x0175, code lost:
            r7 = r1.f347240w.get();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:99:0x017d, code lost:
            if (r7 == null) goto L_0x01a4;
         */
        /* JADX WARNING: Removed duplicated region for block: B:163:0x0114 A[SYNTHETIC] */
        /* renamed from: b */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void mo176073b() {
            /*
                r21 = this;
                r1 = r21
                java.lang.String r0 = "guardedRun"
                java.lang.String r2 = "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.SphereImageView.GLTextureView$GLThread"
                com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r0, r2)
                com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.SphereImageView.GLTextureView$i r0 = new com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.SphereImageView.GLTextureView$i
                java.lang.ref.WeakReference<com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.SphereImageView.GLTextureView> r2 = r1.f347240w
                r0.<init>(r2)
                r1.f347239v = r0
                r0 = 0
                r1.f347229i = r0
                r1.f347230j = r0
                r3 = 0
                r4 = 0
                r5 = 0
                r6 = 0
                r7 = 0
                r8 = 0
                r9 = 0
                r10 = 0
                r11 = 0
                r12 = 0
                r13 = 0
                r14 = 0
            L_0x0023:
                com.tencent.p014mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.SphereImageView.GLTextureView.m162774a()     // Catch:{ all -> 0x026b }
                com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.SphereImageView.GLTextureView$k r15 = com.tencent.p014mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.SphereImageView.GLTextureView.f347194r     // Catch:{ all -> 0x026b }
                monitor-enter(r15)     // Catch:{ all -> 0x026b }
            L_0x0029:
                boolean r2 = r1.f347224d     // Catch:{ all -> 0x0261 }
                if (r2 == 0) goto L_0x004d
                monitor-exit(r15)     // Catch:{ all -> 0x0261 }
                com.tencent.p014mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.SphereImageView.GLTextureView.m162774a()
                com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.SphereImageView.GLTextureView$k r2 = com.tencent.p014mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.SphereImageView.GLTextureView.f347194r
                monitor-enter(r2)
                r21.mo176078g()     // Catch:{ all -> 0x0043 }
                r21.mo176077f()     // Catch:{ all -> 0x0043 }
                monitor-exit(r2)     // Catch:{ all -> 0x0043 }
                java.lang.String r0 = "guardedRun"
                java.lang.String r2 = "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.SphereImageView.GLTextureView$GLThread"
                com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r2)
                return
            L_0x0043:
                r0 = move-exception
                monitor-exit(r2)     // Catch:{ all -> 0x0043 }
                java.lang.String r2 = "guardedRun"
                java.lang.String r3 = "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.SphereImageView.GLTextureView$GLThread"
                com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r2, r3)
                throw r0
            L_0x004d:
                java.util.ArrayList<java.lang.Runnable> r2 = r1.f347237t     // Catch:{ all -> 0x0261 }
                boolean r2 = r2.isEmpty()     // Catch:{ all -> 0x0261 }
                r0 = 1
                if (r2 != 0) goto L_0x0063
                java.util.ArrayList<java.lang.Runnable> r2 = r1.f347237t     // Catch:{ all -> 0x0261 }
                r13 = 0
                java.lang.Object r2 = r2.remove(r13)     // Catch:{ all -> 0x0261 }
                r13 = r2
                java.lang.Runnable r13 = (java.lang.Runnable) r13     // Catch:{ all -> 0x0261 }
                r2 = 0
                goto L_0x012e
            L_0x0063:
                boolean r2 = r1.f347231n     // Catch:{ all -> 0x0261 }
                if (r2 == 0) goto L_0x0071
                r21.mo176078g()     // Catch:{ all -> 0x0261 }
                r21.mo176077f()     // Catch:{ all -> 0x0261 }
                r2 = 0
                r1.f347231n = r2     // Catch:{ all -> 0x0261 }
                r5 = 1
            L_0x0071:
                if (r3 == 0) goto L_0x007a
                r21.mo176078g()     // Catch:{ all -> 0x0261 }
                r21.mo176077f()     // Catch:{ all -> 0x0261 }
                r3 = 0
            L_0x007a:
                boolean r2 = r1.f347226f     // Catch:{ all -> 0x0261 }
                if (r2 != 0) goto L_0x0096
                boolean r2 = r1.f347228h     // Catch:{ all -> 0x0261 }
                if (r2 != 0) goto L_0x0096
                boolean r2 = r1.f347230j     // Catch:{ all -> 0x0261 }
                if (r2 == 0) goto L_0x0089
                r21.mo176078g()     // Catch:{ all -> 0x0261 }
            L_0x0089:
                r1.f347228h = r0     // Catch:{ all -> 0x0261 }
                r2 = 0
                r1.f347227g = r2     // Catch:{ all -> 0x0261 }
                com.tencent.p014mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.SphereImageView.GLTextureView.m162774a()     // Catch:{ all -> 0x0261 }
                com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.SphereImageView.GLTextureView$k r2 = com.tencent.p014mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.SphereImageView.GLTextureView.f347194r     // Catch:{ all -> 0x0261 }
                r2.notifyAll()     // Catch:{ all -> 0x0261 }
            L_0x0096:
                boolean r2 = r1.f347226f     // Catch:{ all -> 0x0261 }
                if (r2 == 0) goto L_0x00a9
                boolean r2 = r1.f347228h     // Catch:{ all -> 0x0261 }
                if (r2 == 0) goto L_0x00a9
                r2 = 0
                r1.f347228h = r2     // Catch:{ all -> 0x0261 }
                com.tencent.p014mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.SphereImageView.GLTextureView.m162774a()     // Catch:{ all -> 0x0261 }
                com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.SphereImageView.GLTextureView$k r2 = com.tencent.p014mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.SphereImageView.GLTextureView.f347194r     // Catch:{ all -> 0x0261 }
                r2.notifyAll()     // Catch:{ all -> 0x0261 }
            L_0x00a9:
                if (r4 == 0) goto L_0x00b7
                r1.f347236s = r0     // Catch:{ all -> 0x0261 }
                com.tencent.p014mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.SphereImageView.GLTextureView.m162774a()     // Catch:{ all -> 0x0261 }
                com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.SphereImageView.GLTextureView$k r2 = com.tencent.p014mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.SphereImageView.GLTextureView.f347194r     // Catch:{ all -> 0x0261 }
                r2.notifyAll()     // Catch:{ all -> 0x0261 }
                r4 = 0
                r14 = 0
            L_0x00b7:
                boolean r2 = r21.mo176074c()     // Catch:{ all -> 0x0261 }
                if (r2 == 0) goto L_0x0256
                boolean r2 = r1.f347229i     // Catch:{ all -> 0x0261 }
                if (r2 != 0) goto L_0x0102
                if (r5 == 0) goto L_0x00c5
                r5 = 0
                goto L_0x0103
            L_0x00c5:
                com.tencent.p014mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.SphereImageView.GLTextureView.m162774a()     // Catch:{ all -> 0x0261 }
                com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.SphereImageView.GLTextureView$k r2 = com.tencent.p014mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.SphereImageView.GLTextureView.f347194r     // Catch:{ all -> 0x0261 }
                boolean r17 = r2.mo176083d(r1)     // Catch:{ all -> 0x0261 }
                if (r17 == 0) goto L_0x0102
                com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.SphereImageView.GLTextureView$i r7 = r1.f347239v     // Catch:{ RuntimeException -> 0x00df }
                r7.mo176071e()     // Catch:{ RuntimeException -> 0x00df }
                r1.f347229i = r0     // Catch:{ all -> 0x0261 }
                com.tencent.p014mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.SphereImageView.GLTextureView.m162774a()     // Catch:{ all -> 0x0261 }
                r2.notifyAll()     // Catch:{ all -> 0x0261 }
                r7 = 1
                goto L_0x0103
            L_0x00df:
                r0 = move-exception
                com.tencent.p014mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.SphereImageView.GLTextureView.m162774a()     // Catch:{ all -> 0x0261 }
                com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.SphereImageView.GLTextureView$k r2 = com.tencent.p014mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.SphereImageView.GLTextureView.f347194r     // Catch:{ all -> 0x0261 }
                java.lang.String r3 = "releaseEglContextLocked"
                java.lang.String r4 = "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.SphereImageView.GLTextureView$GLThreadManager"
                com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r3, r4)     // Catch:{ all -> 0x0261 }
                com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.SphereImageView.GLTextureView$j r5 = r2.f347244d     // Catch:{ all -> 0x0261 }
                if (r5 != r1) goto L_0x00f4
                r5 = 0
                r2.f347244d = r5     // Catch:{ all -> 0x0261 }
            L_0x00f4:
                r2.notifyAll()     // Catch:{ all -> 0x0261 }
                com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r3, r4)     // Catch:{ all -> 0x0261 }
                java.lang.String r2 = "guardedRun"
                java.lang.String r3 = "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.SphereImageView.GLTextureView$GLThread"
                com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r2, r3)     // Catch:{ all -> 0x0261 }
                throw r0     // Catch:{ all -> 0x0261 }
            L_0x0102:
                r2 = 0
            L_0x0103:
                boolean r2 = r1.f347229i     // Catch:{ all -> 0x0261 }
                if (r2 == 0) goto L_0x0110
                boolean r2 = r1.f347230j     // Catch:{ all -> 0x0261 }
                if (r2 != 0) goto L_0x0110
                r1.f347230j = r0     // Catch:{ all -> 0x0261 }
                r8 = 1
                r9 = 1
                r10 = 1
            L_0x0110:
                boolean r2 = r1.f347230j     // Catch:{ all -> 0x0261 }
                if (r2 == 0) goto L_0x0256
                boolean r2 = r1.f347238u     // Catch:{ all -> 0x0261 }
                if (r2 == 0) goto L_0x0123
                int r11 = r1.f347232o     // Catch:{ all -> 0x0261 }
                int r12 = r1.f347233p     // Catch:{ all -> 0x0261 }
                r2 = 0
                r1.f347238u = r2     // Catch:{ all -> 0x0261 }
                r8 = 1
                r10 = 1
                r14 = 1
                goto L_0x0124
            L_0x0123:
                r2 = 0
            L_0x0124:
                r1.f347235r = r2     // Catch:{ all -> 0x0261 }
                com.tencent.p014mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.SphereImageView.GLTextureView.m162774a()     // Catch:{ all -> 0x0261 }
                com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.SphereImageView.GLTextureView$k r16 = com.tencent.p014mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.SphereImageView.GLTextureView.f347194r     // Catch:{ all -> 0x0261 }
                r16.notifyAll()     // Catch:{ all -> 0x0261 }
            L_0x012e:
                monitor-exit(r15)     // Catch:{ all -> 0x0261 }
                if (r13 == 0) goto L_0x0138
                r13.run()     // Catch:{ all -> 0x026b }
                r0 = 0
                r13 = 0
                goto L_0x0023
            L_0x0138:
                if (r8 == 0) goto L_0x0160
                com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.SphereImageView.GLTextureView$i r15 = r1.f347239v     // Catch:{ all -> 0x026b }
                boolean r15 = r15.mo176069b()     // Catch:{ all -> 0x026b }
                if (r15 != 0) goto L_0x015f
                com.tencent.p014mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.SphereImageView.GLTextureView.m162774a()     // Catch:{ all -> 0x026b }
                com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.SphereImageView.GLTextureView$k r15 = com.tencent.p014mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.SphereImageView.GLTextureView.f347194r     // Catch:{ all -> 0x026b }
                monitor-enter(r15)     // Catch:{ all -> 0x026b }
                r1.f347227g = r0     // Catch:{ all -> 0x0155 }
                com.tencent.p014mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.SphereImageView.GLTextureView.m162774a()     // Catch:{ all -> 0x0155 }
                r15.notifyAll()     // Catch:{ all -> 0x0155 }
                monitor-exit(r15)     // Catch:{ all -> 0x0155 }
                r20 = r5
                goto L_0x0251
            L_0x0155:
                r0 = move-exception
                monitor-exit(r15)     // Catch:{ all -> 0x0155 }
                java.lang.String r2 = "guardedRun"
                java.lang.String r3 = "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.SphereImageView.GLTextureView$GLThread"
                com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r2, r3)     // Catch:{ all -> 0x026b }
                throw r0     // Catch:{ all -> 0x026b }
            L_0x015f:
                r8 = 0
            L_0x0160:
                if (r9 == 0) goto L_0x0173
                com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.SphereImageView.GLTextureView$i r6 = r1.f347239v     // Catch:{ all -> 0x026b }
                javax.microedition.khronos.opengles.GL r6 = r6.mo176068a()     // Catch:{ all -> 0x026b }
                javax.microedition.khronos.opengles.GL10 r6 = (javax.microedition.khronos.opengles.GL10) r6     // Catch:{ all -> 0x026b }
                com.tencent.p014mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.SphereImageView.GLTextureView.m162774a()     // Catch:{ all -> 0x026b }
                com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.SphereImageView.GLTextureView$k r9 = com.tencent.p014mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.SphereImageView.GLTextureView.f347194r     // Catch:{ all -> 0x026b }
                r9.mo176080a(r6)     // Catch:{ all -> 0x026b }
                r9 = 0
            L_0x0173:
                if (r7 == 0) goto L_0x01a5
                java.lang.ref.WeakReference<com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.SphereImageView.GLTextureView> r7 = r1.f347240w     // Catch:{ all -> 0x026b }
                java.lang.Object r7 = r7.get()     // Catch:{ all -> 0x026b }
                com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.SphereImageView.GLTextureView r7 = (com.tencent.p014mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.SphereImageView.GLTextureView) r7     // Catch:{ all -> 0x026b }
                if (r7 == 0) goto L_0x01a4
                java.lang.String r15 = "access$1100"
                java.lang.String r2 = "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.SphereImageView.GLTextureView"
                com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r15, r2)     // Catch:{ all -> 0x026b }
                com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.SphereImageView.GLTextureView$n r7 = r7.f347197f     // Catch:{ all -> 0x026b }
                com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r15, r2)     // Catch:{ all -> 0x026b }
                com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.SphereImageView.GLTextureView$i r2 = r1.f347239v     // Catch:{ all -> 0x026b }
                javax.microedition.khronos.egl.EGLConfig r2 = r2.f347221e     // Catch:{ all -> 0x026b }
                com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.SphereImageView.b r7 = (com.tencent.p014mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.SphereImageView.C106164b) r7     // Catch:{ all -> 0x026b }
                r7.getClass()     // Catch:{ all -> 0x026b }
                java.lang.String r2 = "onSurfaceCreated"
                java.lang.String r7 = "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.SphereImageView.SphereRender"
                com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r2, r7)     // Catch:{ all -> 0x026b }
                java.lang.String r15 = "SphereImageView.SphereRender"
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r15, r2)     // Catch:{ all -> 0x026b }
                com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r2, r7)     // Catch:{ all -> 0x026b }
            L_0x01a4:
                r7 = 0
            L_0x01a5:
                if (r10 == 0) goto L_0x01c3
                java.lang.ref.WeakReference<com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.SphereImageView.GLTextureView> r2 = r1.f347240w     // Catch:{ all -> 0x026b }
                java.lang.Object r2 = r2.get()     // Catch:{ all -> 0x026b }
                com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.SphereImageView.GLTextureView r2 = (com.tencent.p014mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.SphereImageView.GLTextureView) r2     // Catch:{ all -> 0x026b }
                if (r2 == 0) goto L_0x01c2
                java.lang.String r10 = "access$1100"
                java.lang.String r15 = "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.SphereImageView.GLTextureView"
                com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r10, r15)     // Catch:{ all -> 0x026b }
                com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.SphereImageView.GLTextureView$n r2 = r2.f347197f     // Catch:{ all -> 0x026b }
                com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r10, r15)     // Catch:{ all -> 0x026b }
                com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.SphereImageView.b r2 = (com.tencent.p014mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.SphereImageView.C106164b) r2     // Catch:{ all -> 0x026b }
                r2.mo151985b(r6, r11, r12)     // Catch:{ all -> 0x026b }
            L_0x01c2:
                r10 = 0
            L_0x01c3:
                java.lang.ref.WeakReference<com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.SphereImageView.GLTextureView> r2 = r1.f347240w     // Catch:{ all -> 0x026b }
                java.lang.Object r2 = r2.get()     // Catch:{ all -> 0x026b }
                com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.SphereImageView.GLTextureView r2 = (com.tencent.p014mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.SphereImageView.GLTextureView) r2     // Catch:{ all -> 0x026b }
                if (r2 == 0) goto L_0x01de
                java.lang.String r15 = "access$1100"
                java.lang.String r0 = "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.SphereImageView.GLTextureView"
                com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r15, r0)     // Catch:{ all -> 0x026b }
                com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.SphereImageView.GLTextureView$n r2 = r2.f347197f     // Catch:{ all -> 0x026b }
                com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r15, r0)     // Catch:{ all -> 0x026b }
                com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.SphereImageView.b r2 = (com.tencent.p014mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.SphereImageView.C106164b) r2     // Catch:{ all -> 0x026b }
                r2.mo151984a(r6)     // Catch:{ all -> 0x026b }
            L_0x01de:
                java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x026b }
                com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.SphereImageView.GLTextureView$i r0 = r1.f347239v     // Catch:{ all -> 0x026b }
                r0.getClass()     // Catch:{ all -> 0x026b }
                java.lang.String r2 = "swap"
                java.lang.String r15 = "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.SphereImageView.GLTextureView$EglHelper"
                com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r2, r15)     // Catch:{ all -> 0x026b }
                r18 = r3
                javax.microedition.khronos.egl.EGL10 r3 = r0.f347218b     // Catch:{ all -> 0x026b }
                r19 = r4
                javax.microedition.khronos.egl.EGLDisplay r4 = r0.f347219c     // Catch:{ all -> 0x026b }
                r20 = r5
                javax.microedition.khronos.egl.EGLSurface r5 = r0.f347220d     // Catch:{ all -> 0x026b }
                boolean r3 = r3.eglSwapBuffers(r4, r5)     // Catch:{ all -> 0x026b }
                r4 = 12288(0x3000, float:1.7219E-41)
                if (r3 != 0) goto L_0x020c
                javax.microedition.khronos.egl.EGL10 r0 = r0.f347218b     // Catch:{ all -> 0x026b }
                int r0 = r0.eglGetError()     // Catch:{ all -> 0x026b }
                com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r2, r15)     // Catch:{ all -> 0x026b }
                goto L_0x0211
            L_0x020c:
                com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r2, r15)     // Catch:{ all -> 0x026b }
                r0 = 12288(0x3000, float:1.7219E-41)
            L_0x0211:
                java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x026b }
                if (r0 == r4) goto L_0x0248
                r2 = 12302(0x300e, float:1.7239E-41)
                if (r0 == r2) goto L_0x0245
                java.lang.String r2 = "eglSwapBuffers"
                java.lang.String r3 = "logEglErrorAsWarning"
                java.lang.String r4 = "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.SphereImageView.GLTextureView$EglHelper"
                com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r3, r4)     // Catch:{ all -> 0x026b }
                com.tencent.p014mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.SphereImageView.GLTextureView.C115745i.m162780d(r2, r0)     // Catch:{ all -> 0x026b }
                com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r3, r4)     // Catch:{ all -> 0x026b }
                com.tencent.p014mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.SphereImageView.GLTextureView.m162774a()     // Catch:{ all -> 0x026b }
                com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.SphereImageView.GLTextureView$k r2 = com.tencent.p014mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.SphereImageView.GLTextureView.f347194r     // Catch:{ all -> 0x026b }
                monitor-enter(r2)     // Catch:{ all -> 0x026b }
                r0 = 1
                r1.f347227g = r0     // Catch:{ all -> 0x023b }
                com.tencent.p014mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.SphereImageView.GLTextureView.m162774a()     // Catch:{ all -> 0x023b }
                r2.notifyAll()     // Catch:{ all -> 0x023b }
                monitor-exit(r2)     // Catch:{ all -> 0x023b }
                goto L_0x0249
            L_0x023b:
                r0 = move-exception
                monitor-exit(r2)     // Catch:{ all -> 0x023b }
                java.lang.String r2 = "guardedRun"
                java.lang.String r3 = "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.SphereImageView.GLTextureView$GLThread"
                com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r2, r3)     // Catch:{ all -> 0x026b }
                throw r0     // Catch:{ all -> 0x026b }
            L_0x0245:
                r0 = 1
                r3 = 1
                goto L_0x024b
            L_0x0248:
                r0 = 1
            L_0x0249:
                r3 = r18
            L_0x024b:
                if (r14 == 0) goto L_0x024e
                goto L_0x0250
            L_0x024e:
                r0 = r19
            L_0x0250:
                r4 = r0
            L_0x0251:
                r5 = r20
                r0 = 0
                goto L_0x0023
            L_0x0256:
                com.tencent.p014mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.SphereImageView.GLTextureView.m162774a()     // Catch:{ all -> 0x0261 }
                com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.SphereImageView.GLTextureView$k r0 = com.tencent.p014mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.SphereImageView.GLTextureView.f347194r     // Catch:{ all -> 0x0261 }
                r0.wait()     // Catch:{ all -> 0x0261 }
                r0 = 0
                goto L_0x0029
            L_0x0261:
                r0 = move-exception
                monitor-exit(r15)     // Catch:{ all -> 0x0261 }
                java.lang.String r2 = "guardedRun"
                java.lang.String r3 = "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.SphereImageView.GLTextureView$GLThread"
                com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r2, r3)     // Catch:{ all -> 0x026b }
                throw r0     // Catch:{ all -> 0x026b }
            L_0x026b:
                r0 = move-exception
                com.tencent.p014mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.SphereImageView.GLTextureView.m162774a()
                com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.SphereImageView.GLTextureView$k r2 = com.tencent.p014mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.SphereImageView.GLTextureView.f347194r
                monitor-enter(r2)
                r21.mo176078g()     // Catch:{ all -> 0x0281 }
                r21.mo176077f()     // Catch:{ all -> 0x0281 }
                monitor-exit(r2)     // Catch:{ all -> 0x0281 }
                java.lang.String r2 = "guardedRun"
                java.lang.String r3 = "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.SphereImageView.GLTextureView$GLThread"
                com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r2, r3)
                throw r0
            L_0x0281:
                r0 = move-exception
                monitor-exit(r2)     // Catch:{ all -> 0x0281 }
                java.lang.String r2 = "guardedRun"
                java.lang.String r3 = "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.SphereImageView.GLTextureView$GLThread"
                com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r2, r3)
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.SphereImageView.GLTextureView.C115746j.mo176073b():void");
        }

        /* renamed from: c */
        public final boolean mo176074c() {
            SnsMethodCalculate.markStartTimeMs("readyToDraw", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.SphereImageView.GLTextureView$GLThread");
            boolean z = true;
            if (!this.f347226f || this.f347227g || this.f347232o <= 0 || this.f347233p <= 0 || (!this.f347235r && this.f347234q != 1)) {
                z = false;
            }
            SnsMethodCalculate.markEndTimeMs("readyToDraw", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.SphereImageView.GLTextureView$GLThread");
            return z;
        }

        /* JADX WARNING: Can't wrap try/catch for region: R(7:7|8|9|10|22|19|5) */
        /* JADX WARNING: Code restructure failed: missing block: B:21:0x0017, code lost:
            continue;
         */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0024 */
        /* renamed from: d */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void mo176075d() {
            /*
                r3 = this;
                java.lang.String r0 = "requestExitAndWait"
                java.lang.String r1 = "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.SphereImageView.GLTextureView$GLThread"
                com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r0, r1)
                com.tencent.p014mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.SphereImageView.GLTextureView.m162774a()
                com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.SphereImageView.GLTextureView$k r0 = com.tencent.p014mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.SphereImageView.GLTextureView.f347194r
                monitor-enter(r0)
                r1 = 1
                r3.f347224d = r1     // Catch:{ all -> 0x0036 }
                com.tencent.p014mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.SphereImageView.GLTextureView.m162774a()     // Catch:{ all -> 0x0036 }
                r0.notifyAll()     // Catch:{ all -> 0x0036 }
            L_0x0017:
                boolean r1 = r3.f347225e     // Catch:{ all -> 0x0036 }
                if (r1 != 0) goto L_0x002c
                com.tencent.p014mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.SphereImageView.GLTextureView.m162774a()     // Catch:{ InterruptedException -> 0x0024 }
                com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.SphereImageView.GLTextureView$k r1 = com.tencent.p014mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.SphereImageView.GLTextureView.f347194r     // Catch:{ InterruptedException -> 0x0024 }
                r1.wait()     // Catch:{ InterruptedException -> 0x0024 }
                goto L_0x0017
            L_0x0024:
                java.lang.Thread r1 = java.lang.Thread.currentThread()     // Catch:{ all -> 0x0036 }
                r1.interrupt()     // Catch:{ all -> 0x0036 }
                goto L_0x0017
            L_0x002c:
                monitor-exit(r0)     // Catch:{ all -> 0x0036 }
                java.lang.String r0 = "requestExitAndWait"
                java.lang.String r1 = "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.SphereImageView.GLTextureView$GLThread"
                com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r1)
                return
            L_0x0036:
                r1 = move-exception
                monitor-exit(r0)     // Catch:{ all -> 0x0036 }
                java.lang.String r0 = "requestExitAndWait"
                java.lang.String r2 = "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.SphereImageView.GLTextureView$GLThread"
                com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r2)
                throw r1
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.SphereImageView.GLTextureView.C115746j.mo176075d():void");
        }

        /* renamed from: e */
        public void mo176076e(int i) {
            SnsMethodCalculate.markStartTimeMs("setRenderMode", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.SphereImageView.GLTextureView$GLThread");
            if (i < 0 || i > 1) {
                IllegalArgumentException illegalArgumentException = new IllegalArgumentException("renderMode");
                SnsMethodCalculate.markEndTimeMs("setRenderMode", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.SphereImageView.GLTextureView$GLThread");
                throw illegalArgumentException;
            }
            GLTextureView.m162774a();
            C115747k kVar = GLTextureView.f347194r;
            synchronized (kVar) {
                try {
                    this.f347234q = i;
                    GLTextureView.m162774a();
                    kVar.notifyAll();
                } catch (Throwable th) {
                    while (true) {
                        SnsMethodCalculate.markEndTimeMs("setRenderMode", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.SphereImageView.GLTextureView$GLThread");
                        throw th;
                    }
                }
            }
            SnsMethodCalculate.markEndTimeMs("setRenderMode", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.SphereImageView.GLTextureView$GLThread");
        }

        /* renamed from: f */
        public final void mo176077f() {
            SnsMethodCalculate.markStartTimeMs("stopEglContextLocked", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.SphereImageView.GLTextureView$GLThread");
            if (this.f347229i) {
                C115745i iVar = this.f347239v;
                iVar.getClass();
                SnsMethodCalculate.markStartTimeMs("finish", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.SphereImageView.GLTextureView$EglHelper");
                if (iVar.f347222f != null) {
                    GLTextureView gLTextureView = iVar.f347217a.get();
                    if (gLTextureView != null) {
                        C115747k kVar = GLTextureView.f347194r;
                        SnsMethodCalculate.markStartTimeMs("access$500", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.SphereImageView.GLTextureView");
                        C115743g gVar = gLTextureView.f347200i;
                        SnsMethodCalculate.markEndTimeMs("access$500", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.SphereImageView.GLTextureView");
                        EGL10 egl10 = iVar.f347218b;
                        EGLDisplay eGLDisplay = iVar.f347219c;
                        EGLContext eGLContext = iVar.f347222f;
                        ((C115740d) gVar).getClass();
                        SnsMethodCalculate.markStartTimeMs("destroyContext", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.SphereImageView.GLTextureView$DefaultContextFactory");
                        if (egl10.eglDestroyContext(eGLDisplay, eGLContext)) {
                            SnsMethodCalculate.markEndTimeMs("destroyContext", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.SphereImageView.GLTextureView$DefaultContextFactory");
                        } else {
                            Objects.toString(eGLDisplay);
                            Objects.toString(eGLContext);
                            int eglGetError = egl10.eglGetError();
                            SnsMethodCalculate.markStartTimeMs("throwEglException", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.SphereImageView.GLTextureView$EglHelper");
                            RuntimeException runtimeException = new RuntimeException(C115745i.m162780d("eglDestroyContex", eglGetError));
                            SnsMethodCalculate.markEndTimeMs("throwEglException", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.SphereImageView.GLTextureView$EglHelper");
                            throw runtimeException;
                        }
                    }
                    iVar.f347222f = null;
                }
                EGLDisplay eGLDisplay2 = iVar.f347219c;
                if (eGLDisplay2 != null) {
                    iVar.f347218b.eglTerminate(eGLDisplay2);
                    iVar.f347219c = null;
                }
                SnsMethodCalculate.markEndTimeMs("finish", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.SphereImageView.GLTextureView$EglHelper");
                this.f347229i = false;
                GLTextureView.m162774a();
                C115747k kVar2 = GLTextureView.f347194r;
                SnsMethodCalculate.markStartTimeMs("releaseEglContextLocked", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.SphereImageView.GLTextureView$GLThreadManager");
                if (kVar2.f347244d == this) {
                    kVar2.f347244d = null;
                }
                kVar2.notifyAll();
                SnsMethodCalculate.markEndTimeMs("releaseEglContextLocked", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.SphereImageView.GLTextureView$GLThreadManager");
            }
            SnsMethodCalculate.markEndTimeMs("stopEglContextLocked", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.SphereImageView.GLTextureView$GLThread");
        }

        /* renamed from: g */
        public final void mo176078g() {
            SnsMethodCalculate.markStartTimeMs("stopEglSurfaceLocked", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.SphereImageView.GLTextureView$GLThread");
            if (this.f347230j) {
                this.f347230j = false;
                C115745i iVar = this.f347239v;
                iVar.getClass();
                SnsMethodCalculate.markStartTimeMs("destroySurface", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.SphereImageView.GLTextureView$EglHelper");
                iVar.mo176070c();
                SnsMethodCalculate.markEndTimeMs("destroySurface", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.SphereImageView.GLTextureView$EglHelper");
            }
            SnsMethodCalculate.markEndTimeMs("stopEglSurfaceLocked", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.SphereImageView.GLTextureView$GLThread");
        }

        public void run() {
            SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.SphereImageView.GLTextureView$GLThread");
            setName("GLThread " + getId());
            try {
                mo176073b();
            } catch (InterruptedException unused) {
            } catch (Throwable th) {
                GLTextureView.m162774a();
                GLTextureView.f347194r.mo176082c(this);
                SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.SphereImageView.GLTextureView$GLThread");
                throw th;
            }
            GLTextureView.m162774a();
            GLTextureView.f347194r.mo176082c(this);
            SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.SphereImageView.GLTextureView$GLThread");
        }
    }

    /* renamed from: com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.SphereImageView.GLTextureView$k */
    public static class C115747k {

        /* renamed from: a */
        public boolean f347241a;

        /* renamed from: b */
        public boolean f347242b;

        /* renamed from: c */
        public boolean f347243c;

        /* renamed from: d */
        public C115746j f347244d;

        public C115747k(C115737a aVar) {
        }

        /* renamed from: a */
        public synchronized void mo176080a(GL10 gl10) {
            SnsMethodCalculate.markStartTimeMs("checkGLDriver", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.SphereImageView.GLTextureView$GLThreadManager");
            if (!this.f347242b) {
                mo176081b();
                this.f347243c = !gl10.glGetString(7937).startsWith("Q3Dimension MSM7500 ");
                notifyAll();
                this.f347242b = true;
            }
            SnsMethodCalculate.markEndTimeMs("checkGLDriver", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.SphereImageView.GLTextureView$GLThreadManager");
        }

        /* renamed from: b */
        public final void mo176081b() {
            SnsMethodCalculate.markStartTimeMs("checkGLESVersion", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.SphereImageView.GLTextureView$GLThreadManager");
            if (!this.f347241a) {
                this.f347241a = true;
            }
            SnsMethodCalculate.markEndTimeMs("checkGLESVersion", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.SphereImageView.GLTextureView$GLThreadManager");
        }

        /* renamed from: c */
        public synchronized void mo176082c(C115746j jVar) {
            SnsMethodCalculate.markStartTimeMs("threadExiting", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.SphereImageView.GLTextureView$GLThreadManager");
            int i = C115746j.f347223x;
            SnsMethodCalculate.markStartTimeMs("access$1202", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.SphereImageView.GLTextureView$GLThread");
            jVar.f347225e = true;
            SnsMethodCalculate.markEndTimeMs("access$1202", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.SphereImageView.GLTextureView$GLThread");
            if (this.f347244d == jVar) {
                this.f347244d = null;
            }
            notifyAll();
            SnsMethodCalculate.markEndTimeMs("threadExiting", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.SphereImageView.GLTextureView$GLThreadManager");
        }

        /* renamed from: d */
        public boolean mo176083d(C115746j jVar) {
            SnsMethodCalculate.markStartTimeMs("tryAcquireEglContextLocked", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.SphereImageView.GLTextureView$GLThreadManager");
            C115746j jVar2 = this.f347244d;
            if (jVar2 == jVar || jVar2 == null) {
                this.f347244d = jVar;
                notifyAll();
                SnsMethodCalculate.markEndTimeMs("tryAcquireEglContextLocked", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.SphereImageView.GLTextureView$GLThreadManager");
                return true;
            }
            mo176081b();
            if (this.f347243c) {
                SnsMethodCalculate.markEndTimeMs("tryAcquireEglContextLocked", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.SphereImageView.GLTextureView$GLThreadManager");
                return true;
            }
            C115746j jVar3 = this.f347244d;
            if (jVar3 != null) {
                jVar3.getClass();
                SnsMethodCalculate.markStartTimeMs("requestReleaseEglContextLocked", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.SphereImageView.GLTextureView$GLThread");
                jVar3.f347231n = true;
                GLTextureView.m162774a();
                GLTextureView.f347194r.notifyAll();
                SnsMethodCalculate.markEndTimeMs("requestReleaseEglContextLocked", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.SphereImageView.GLTextureView$GLThread");
            }
            SnsMethodCalculate.markEndTimeMs("tryAcquireEglContextLocked", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.SphereImageView.GLTextureView$GLThreadManager");
            return false;
        }
    }

    /* renamed from: com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.SphereImageView.GLTextureView$n */
    public interface C115748n {
    }

    /* renamed from: com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.SphereImageView.GLTextureView$o */
    public class C115749o extends C115739c {
        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C115749o(boolean z) {
            super(8, 8, 8, 0, z ? 16 : 0, 0);
        }
    }

    static {
        Class<GLTextureView> cls = GLTextureView.class;
    }

    public GLTextureView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        SnsMethodCalculate.markStartTimeMs(APMidasPluginInfo.LAUNCH_INTERFACE_INIT, "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.SphereImageView.GLTextureView");
        setSurfaceTextureListener(this);
        SnsMethodCalculate.markEndTimeMs(APMidasPluginInfo.LAUNCH_INTERFACE_INIT, "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.SphereImageView.GLTextureView");
    }

    /* renamed from: a */
    public static /* synthetic */ C115747k m162774a() {
        SnsMethodCalculate.markStartTimeMs("access$900", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.SphereImageView.GLTextureView");
        C115747k kVar = f347194r;
        SnsMethodCalculate.markEndTimeMs("access$900", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.SphereImageView.GLTextureView");
        return kVar;
    }

    /* renamed from: b */
    public final void mo176042b() {
        SnsMethodCalculate.markStartTimeMs("checkRenderThreadState", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.SphereImageView.GLTextureView");
        if (this.f347196e == null) {
            SnsMethodCalculate.markEndTimeMs("checkRenderThreadState", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.SphereImageView.GLTextureView");
            return;
        }
        IllegalStateException illegalStateException = new IllegalStateException("setRenderer has already been called for this instance.");
        SnsMethodCalculate.markEndTimeMs("checkRenderThreadState", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.SphereImageView.GLTextureView");
        throw illegalStateException;
    }

    /* renamed from: c */
    public void mo176043c(Runnable runnable) {
        SnsMethodCalculate.markStartTimeMs("queueEvent", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.SphereImageView.GLTextureView");
        C115746j jVar = this.f347196e;
        jVar.getClass();
        SnsMethodCalculate.markStartTimeMs("queueEvent", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.SphereImageView.GLTextureView$GLThread");
        if (runnable != null) {
            m162774a();
            C115747k kVar = f347194r;
            synchronized (kVar) {
                try {
                    jVar.f347237t.add(runnable);
                    m162774a();
                    kVar.notifyAll();
                } catch (Throwable th) {
                    while (true) {
                        SnsMethodCalculate.markEndTimeMs("queueEvent", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.SphereImageView.GLTextureView$GLThread");
                        throw th;
                    }
                }
            }
            SnsMethodCalculate.markEndTimeMs("queueEvent", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.SphereImageView.GLTextureView$GLThread");
            SnsMethodCalculate.markEndTimeMs("queueEvent", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.SphereImageView.GLTextureView");
            return;
        }
        IllegalArgumentException illegalArgumentException = new IllegalArgumentException("r must not be null");
        SnsMethodCalculate.markEndTimeMs("queueEvent", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.SphereImageView.GLTextureView$GLThread");
        throw illegalArgumentException;
    }

    /* renamed from: d */
    public void mo176044d() {
        SnsMethodCalculate.markStartTimeMs("requestRender", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.SphereImageView.GLTextureView");
        C115746j jVar = this.f347196e;
        jVar.getClass();
        SnsMethodCalculate.markStartTimeMs("requestRender", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.SphereImageView.GLTextureView$GLThread");
        m162774a();
        C115747k kVar = f347194r;
        synchronized (kVar) {
            try {
                jVar.f347235r = true;
                m162774a();
                kVar.notifyAll();
            } catch (Throwable th) {
                while (true) {
                    SnsMethodCalculate.markEndTimeMs("requestRender", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.SphereImageView.GLTextureView$GLThread");
                    throw th;
                }
            }
        }
        SnsMethodCalculate.markEndTimeMs("requestRender", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.SphereImageView.GLTextureView$GLThread");
        SnsMethodCalculate.markEndTimeMs("requestRender", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.SphereImageView.GLTextureView");
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(6:18|19|20|21|35|30) */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x002d, code lost:
        continue;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:20:0x005b */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo176045e(android.graphics.SurfaceTexture r4, int r5, int r6, int r7) {
        /*
            r3 = this;
            java.lang.String r4 = "surfaceChanged"
            java.lang.String r5 = "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.SphereImageView.GLTextureView"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r4, r5)
            com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.SphereImageView.GLTextureView$j r4 = r3.f347196e
            r4.getClass()
            java.lang.String r5 = "onWindowResize"
            java.lang.String r0 = "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.SphereImageView.GLTextureView$GLThread"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r5, r0)
            m162774a()
            com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.SphereImageView.GLTextureView$k r5 = f347194r
            monitor-enter(r5)
            r4.f347232o = r6     // Catch:{ all -> 0x0075 }
            r4.f347233p = r7     // Catch:{ all -> 0x0075 }
            r6 = 1
            r4.f347238u = r6     // Catch:{ all -> 0x0075 }
            r4.f347235r = r6     // Catch:{ all -> 0x0075 }
            r7 = 0
            r4.f347236s = r7     // Catch:{ all -> 0x0075 }
            m162774a()     // Catch:{ all -> 0x0075 }
            r5.notifyAll()     // Catch:{ all -> 0x0075 }
        L_0x002d:
            boolean r0 = r4.f347225e     // Catch:{ all -> 0x0075 }
            if (r0 != 0) goto L_0x0063
            boolean r0 = r4.f347236s     // Catch:{ all -> 0x0075 }
            if (r0 != 0) goto L_0x0063
            java.lang.String r0 = "ableToDraw"
            java.lang.String r1 = "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.SphereImageView.GLTextureView$GLThread"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r0, r1)     // Catch:{ all -> 0x0075 }
            boolean r2 = r4.f347229i     // Catch:{ all -> 0x0075 }
            if (r2 == 0) goto L_0x004c
            boolean r2 = r4.f347230j     // Catch:{ all -> 0x0075 }
            if (r2 == 0) goto L_0x004c
            boolean r2 = r4.mo176074c()     // Catch:{ all -> 0x0075 }
            if (r2 == 0) goto L_0x004c
            r2 = 1
            goto L_0x004d
        L_0x004c:
            r2 = 0
        L_0x004d:
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r1)     // Catch:{ all -> 0x0075 }
            if (r2 == 0) goto L_0x0063
            m162774a()     // Catch:{ InterruptedException -> 0x005b }
            com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.SphereImageView.GLTextureView$k r0 = f347194r     // Catch:{ InterruptedException -> 0x005b }
            r0.wait()     // Catch:{ InterruptedException -> 0x005b }
            goto L_0x002d
        L_0x005b:
            java.lang.Thread r0 = java.lang.Thread.currentThread()     // Catch:{ all -> 0x0075 }
            r0.interrupt()     // Catch:{ all -> 0x0075 }
            goto L_0x002d
        L_0x0063:
            monitor-exit(r5)     // Catch:{ all -> 0x0075 }
            java.lang.String r4 = "onWindowResize"
            java.lang.String r5 = "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.SphereImageView.GLTextureView$GLThread"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r4, r5)
            java.lang.String r4 = "surfaceChanged"
            java.lang.String r5 = "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.SphereImageView.GLTextureView"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r4, r5)
            return
        L_0x0075:
            r4 = move-exception
            monitor-exit(r5)     // Catch:{ all -> 0x0075 }
            java.lang.String r5 = "onWindowResize"
            java.lang.String r6 = "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.SphereImageView.GLTextureView$GLThread"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r5, r6)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.SphereImageView.GLTextureView.mo176045e(android.graphics.SurfaceTexture, int, int, int):void");
    }

    public void finalize() {
        SnsMethodCalculate.markStartTimeMs("finalize", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.SphereImageView.GLTextureView");
        try {
            C115746j jVar = this.f347196e;
            if (jVar != null) {
                jVar.mo176075d();
            }
        } finally {
            super.finalize();
            SnsMethodCalculate.markEndTimeMs("finalize", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.SphereImageView.GLTextureView");
        }
    }

    public int getDebugFlags() {
        SnsMethodCalculate.markStartTimeMs("getDebugFlags", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.SphereImageView.GLTextureView");
        int i = this.f347202n;
        SnsMethodCalculate.markEndTimeMs("getDebugFlags", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.SphereImageView.GLTextureView");
        return i;
    }

    public boolean getPreserveEGLContextOnPause() {
        SnsMethodCalculate.markStartTimeMs("getPreserveEGLContextOnPause", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.SphereImageView.GLTextureView");
        boolean z = this.f347204p;
        SnsMethodCalculate.markEndTimeMs("getPreserveEGLContextOnPause", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.SphereImageView.GLTextureView");
        return z;
    }

    public int getRenderMode() {
        SnsMethodCalculate.markStartTimeMs("getRenderMode", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.SphereImageView.GLTextureView");
        int a = this.f347196e.mo176072a();
        SnsMethodCalculate.markEndTimeMs("getRenderMode", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.SphereImageView.GLTextureView");
        return a;
    }

    public void onAttachedToWindow() {
        SnsMethodCalculate.markStartTimeMs("onAttachedToWindow", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.SphereImageView.GLTextureView");
        super.onAttachedToWindow();
        if (this.f347198g && this.f347197f != null) {
            C115746j jVar = this.f347196e;
            int a = jVar != null ? jVar.mo176072a() : 1;
            C115746j jVar2 = new C115746j(this.f347195d);
            this.f347196e = jVar2;
            if (a != 1) {
                jVar2.mo176076e(a);
            }
            this.f347196e.start();
        }
        this.f347198g = false;
        SnsMethodCalculate.markEndTimeMs("onAttachedToWindow", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.SphereImageView.GLTextureView");
    }

    public void onDetachedFromWindow() {
        SnsMethodCalculate.markStartTimeMs("onDetachedFromWindow", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.SphereImageView.GLTextureView");
        C115746j jVar = this.f347196e;
        if (jVar != null) {
            jVar.mo176075d();
        }
        this.f347198g = true;
        super.onDetachedFromWindow();
        SnsMethodCalculate.markEndTimeMs("onDetachedFromWindow", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.SphereImageView.GLTextureView");
    }

    public void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        SnsMethodCalculate.markStartTimeMs("onLayoutChange", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.SphereImageView.GLTextureView");
        mo176045e(getSurfaceTexture(), 0, i3 - i, i4 - i2);
        SnsMethodCalculate.markEndTimeMs("onLayoutChange", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.SphereImageView.GLTextureView");
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(7:9|10|11|12|29|25|5) */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x002c, code lost:
        continue;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x003d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onSurfaceTextureAvailable(android.graphics.SurfaceTexture r4, int r5, int r6) {
        /*
            r3 = this;
            java.lang.String r0 = "onSurfaceTextureAvailable"
            java.lang.String r1 = "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.SphereImageView.GLTextureView"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r0, r1)
            java.lang.String r0 = "surfaceCreated"
            java.lang.String r1 = "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.SphereImageView.GLTextureView"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r0, r1)
            com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.SphereImageView.GLTextureView$j r0 = r3.f347196e
            r0.getClass()
            java.lang.String r1 = "surfaceCreated"
            java.lang.String r2 = "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.SphereImageView.GLTextureView$GLThread"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r1, r2)
            m162774a()
            com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.SphereImageView.GLTextureView$k r1 = f347194r
            monitor-enter(r1)
            r2 = 1
            r0.f347226f = r2     // Catch:{ all -> 0x007b }
            m162774a()     // Catch:{ all -> 0x007b }
            r1.notifyAll()     // Catch:{ all -> 0x007b }
        L_0x002c:
            boolean r2 = r0.f347228h     // Catch:{ all -> 0x007b }
            if (r2 == 0) goto L_0x0045
            boolean r2 = r0.f347225e     // Catch:{ all -> 0x007b }
            if (r2 != 0) goto L_0x0045
            m162774a()     // Catch:{ InterruptedException -> 0x003d }
            com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.SphereImageView.GLTextureView$k r2 = f347194r     // Catch:{ InterruptedException -> 0x003d }
            r2.wait()     // Catch:{ InterruptedException -> 0x003d }
            goto L_0x002c
        L_0x003d:
            java.lang.Thread r2 = java.lang.Thread.currentThread()     // Catch:{ all -> 0x007b }
            r2.interrupt()     // Catch:{ all -> 0x007b }
            goto L_0x002c
        L_0x0045:
            monitor-exit(r1)     // Catch:{ all -> 0x007b }
            java.lang.String r0 = "surfaceCreated"
            java.lang.String r1 = "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.SphereImageView.GLTextureView$GLThread"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r1)
            java.lang.String r0 = "surfaceCreated"
            java.lang.String r1 = "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.SphereImageView.GLTextureView"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r1)
            r0 = 0
            r3.mo176045e(r4, r0, r5, r6)
            java.util.List<android.view.TextureView$SurfaceTextureListener> r0 = r3.f347205q
            java.util.ArrayList r0 = (java.util.ArrayList) r0
            java.util.Iterator r0 = r0.iterator()
        L_0x0062:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x0072
            java.lang.Object r1 = r0.next()
            android.view.TextureView$SurfaceTextureListener r1 = (android.view.TextureView.SurfaceTextureListener) r1
            r1.onSurfaceTextureAvailable(r4, r5, r6)
            goto L_0x0062
        L_0x0072:
            java.lang.String r4 = "onSurfaceTextureAvailable"
            java.lang.String r5 = "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.SphereImageView.GLTextureView"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r4, r5)
            return
        L_0x007b:
            r4 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x007b }
            java.lang.String r5 = "surfaceCreated"
            java.lang.String r6 = "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.SphereImageView.GLTextureView$GLThread"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r5, r6)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.SphereImageView.GLTextureView.onSurfaceTextureAvailable(android.graphics.SurfaceTexture, int, int):void");
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(7:9|10|11|12|29|25|5) */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x002c, code lost:
        continue;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x003d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onSurfaceTextureDestroyed(android.graphics.SurfaceTexture r4) {
        /*
            r3 = this;
            java.lang.String r0 = "onSurfaceTextureDestroyed"
            java.lang.String r1 = "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.SphereImageView.GLTextureView"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r0, r1)
            java.lang.String r0 = "surfaceDestroyed"
            java.lang.String r1 = "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.SphereImageView.GLTextureView"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r0, r1)
            com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.SphereImageView.GLTextureView$j r0 = r3.f347196e
            r0.getClass()
            java.lang.String r1 = "surfaceDestroyed"
            java.lang.String r2 = "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.SphereImageView.GLTextureView$GLThread"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r1, r2)
            m162774a()
            com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.SphereImageView.GLTextureView$k r1 = f347194r
            monitor-enter(r1)
            r2 = 0
            r0.f347226f = r2     // Catch:{ all -> 0x0078 }
            m162774a()     // Catch:{ all -> 0x0078 }
            r1.notifyAll()     // Catch:{ all -> 0x0078 }
        L_0x002c:
            boolean r2 = r0.f347228h     // Catch:{ all -> 0x0078 }
            if (r2 != 0) goto L_0x0045
            boolean r2 = r0.f347225e     // Catch:{ all -> 0x0078 }
            if (r2 != 0) goto L_0x0045
            m162774a()     // Catch:{ InterruptedException -> 0x003d }
            com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.SphereImageView.GLTextureView$k r2 = f347194r     // Catch:{ InterruptedException -> 0x003d }
            r2.wait()     // Catch:{ InterruptedException -> 0x003d }
            goto L_0x002c
        L_0x003d:
            java.lang.Thread r2 = java.lang.Thread.currentThread()     // Catch:{ all -> 0x0078 }
            r2.interrupt()     // Catch:{ all -> 0x0078 }
            goto L_0x002c
        L_0x0045:
            monitor-exit(r1)     // Catch:{ all -> 0x0078 }
            java.lang.String r0 = "surfaceDestroyed"
            java.lang.String r1 = "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.SphereImageView.GLTextureView$GLThread"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r1)
            java.lang.String r0 = "surfaceDestroyed"
            java.lang.String r1 = "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.SphereImageView.GLTextureView"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r1)
            java.util.List<android.view.TextureView$SurfaceTextureListener> r0 = r3.f347205q
            java.util.ArrayList r0 = (java.util.ArrayList) r0
            java.util.Iterator r0 = r0.iterator()
        L_0x005e:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x006e
            java.lang.Object r1 = r0.next()
            android.view.TextureView$SurfaceTextureListener r1 = (android.view.TextureView.SurfaceTextureListener) r1
            r1.onSurfaceTextureDestroyed(r4)
            goto L_0x005e
        L_0x006e:
            r4 = 1
            java.lang.String r0 = "onSurfaceTextureDestroyed"
            java.lang.String r1 = "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.SphereImageView.GLTextureView"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r1)
            return r4
        L_0x0078:
            r4 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x0078 }
            java.lang.String r0 = "surfaceDestroyed"
            java.lang.String r1 = "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.SphereImageView.GLTextureView$GLThread"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r1)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.SphereImageView.GLTextureView.onSurfaceTextureDestroyed(android.graphics.SurfaceTexture):boolean");
    }

    public void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
        SnsMethodCalculate.markStartTimeMs("onSurfaceTextureSizeChanged", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.SphereImageView.GLTextureView");
        mo176045e(surfaceTexture, 0, i, i2);
        Iterator it = ((ArrayList) this.f347205q).iterator();
        while (it.hasNext()) {
            ((TextureView.SurfaceTextureListener) it.next()).onSurfaceTextureSizeChanged(surfaceTexture, i, i2);
        }
        SnsMethodCalculate.markEndTimeMs("onSurfaceTextureSizeChanged", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.SphereImageView.GLTextureView");
    }

    public void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        SnsMethodCalculate.markStartTimeMs("onSurfaceTextureUpdated", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.SphereImageView.GLTextureView");
        Iterator it = ((ArrayList) this.f347205q).iterator();
        while (it.hasNext()) {
            ((TextureView.SurfaceTextureListener) it.next()).onSurfaceTextureUpdated(surfaceTexture);
        }
        SnsMethodCalculate.markEndTimeMs("onSurfaceTextureUpdated", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.SphereImageView.GLTextureView");
    }

    public void setDebugFlags(int i) {
        SnsMethodCalculate.markStartTimeMs("setDebugFlags", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.SphereImageView.GLTextureView");
        this.f347202n = i;
        SnsMethodCalculate.markEndTimeMs("setDebugFlags", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.SphereImageView.GLTextureView");
    }

    public void setEGLConfigChooser(C115742f fVar) {
        SnsMethodCalculate.markStartTimeMs("setEGLConfigChooser", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.SphereImageView.GLTextureView");
        mo176042b();
        this.f347199h = fVar;
        SnsMethodCalculate.markEndTimeMs("setEGLConfigChooser", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.SphereImageView.GLTextureView");
    }

    public void setEGLContextClientVersion(int i) {
        SnsMethodCalculate.markStartTimeMs("setEGLContextClientVersion", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.SphereImageView.GLTextureView");
        mo176042b();
        this.f347203o = i;
        SnsMethodCalculate.markEndTimeMs("setEGLContextClientVersion", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.SphereImageView.GLTextureView");
    }

    public void setEGLContextFactory(C115743g gVar) {
        SnsMethodCalculate.markStartTimeMs("setEGLContextFactory", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.SphereImageView.GLTextureView");
        mo176042b();
        this.f347200i = gVar;
        SnsMethodCalculate.markEndTimeMs("setEGLContextFactory", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.SphereImageView.GLTextureView");
    }

    public void setEGLWindowSurfaceFactory(C115744h hVar) {
        SnsMethodCalculate.markStartTimeMs("setEGLWindowSurfaceFactory", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.SphereImageView.GLTextureView");
        mo176042b();
        this.f347201j = hVar;
        SnsMethodCalculate.markEndTimeMs("setEGLWindowSurfaceFactory", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.SphereImageView.GLTextureView");
    }

    public void setGLWrapper(C71194l lVar) {
        SnsMethodCalculate.markStartTimeMs("setGLWrapper", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.SphereImageView.GLTextureView");
        SnsMethodCalculate.markEndTimeMs("setGLWrapper", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.SphereImageView.GLTextureView");
    }

    public void setPreserveEGLContextOnPause(boolean z) {
        SnsMethodCalculate.markStartTimeMs("setPreserveEGLContextOnPause", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.SphereImageView.GLTextureView");
        this.f347204p = z;
        SnsMethodCalculate.markEndTimeMs("setPreserveEGLContextOnPause", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.SphereImageView.GLTextureView");
    }

    public void setRenderMode(int i) {
        SnsMethodCalculate.markStartTimeMs("setRenderMode", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.SphereImageView.GLTextureView");
        this.f347196e.mo176076e(i);
        SnsMethodCalculate.markEndTimeMs("setRenderMode", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.SphereImageView.GLTextureView");
    }

    public void setRenderer(C115748n nVar) {
        SnsMethodCalculate.markStartTimeMs("setRenderer", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.SphereImageView.GLTextureView");
        mo176042b();
        if (this.f347199h == null) {
            this.f347199h = new C115749o(true);
        }
        if (this.f347200i == null) {
            this.f347200i = new C115740d((C115737a) null);
        }
        if (this.f347201j == null) {
            this.f347201j = new C115741e((C115737a) null);
        }
        this.f347197f = nVar;
        C115746j jVar = new C115746j(this.f347195d);
        this.f347196e = jVar;
        jVar.start();
        SnsMethodCalculate.markEndTimeMs("setRenderer", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.SphereImageView.GLTextureView");
    }

    public void setEGLConfigChooser(boolean z) {
        SnsMethodCalculate.markStartTimeMs("setEGLConfigChooser", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.SphereImageView.GLTextureView");
        setEGLConfigChooser((C115742f) new C115749o(z));
        SnsMethodCalculate.markEndTimeMs("setEGLConfigChooser", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.SphereImageView.GLTextureView");
    }
}

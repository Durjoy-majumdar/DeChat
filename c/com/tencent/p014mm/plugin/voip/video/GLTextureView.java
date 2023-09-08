package com.tencent.p014mm.plugin.voip.video;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.util.AttributeSet;
import android.view.TextureView;
import android.view.View;
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

/* renamed from: com.tencent.mm.plugin.voip.video.GLTextureView */
public class GLTextureView extends TextureView implements TextureView.SurfaceTextureListener, View.OnLayoutChangeListener {

    /* renamed from: r */
    public static final C106494k f318057r = new C106494k((C106484a) null);

    /* renamed from: d */
    public final WeakReference<GLTextureView> f318058d = new WeakReference<>(this);

    /* renamed from: e */
    public C106493j f318059e;

    /* renamed from: f */
    public C106495n f318060f;

    /* renamed from: g */
    public boolean f318061g;

    /* renamed from: h */
    public C106489f f318062h;

    /* renamed from: i */
    public C106490g f318063i;

    /* renamed from: j */
    public C106491h f318064j;

    /* renamed from: n */
    public int f318065n;

    /* renamed from: o */
    public int f318066o;

    /* renamed from: p */
    public boolean f318067p;

    /* renamed from: q */
    public List<TextureView.SurfaceTextureListener> f318068q = new ArrayList();

    /* renamed from: com.tencent.mm.plugin.voip.video.GLTextureView$l */
    public interface C71602l {
        /* renamed from: a */
        GL mo98761a(GL gl);
    }

    /* renamed from: com.tencent.mm.plugin.voip.video.GLTextureView$m */
    public static class C71603m extends Writer {

        /* renamed from: d */
        public StringBuilder f207502d = new StringBuilder();

        /* renamed from: a */
        public final void mo98762a() {
            if (this.f207502d.length() > 0) {
                this.f207502d.toString();
                StringBuilder sb = this.f207502d;
                sb.delete(0, sb.length());
            }
        }

        public void close() {
            mo98762a();
        }

        public void flush() {
            mo98762a();
        }

        public void write(char[] cArr, int i, int i2) {
            for (int i3 = 0; i3 < i2; i3++) {
                char c = cArr[i + i3];
                if (c == 10) {
                    mo98762a();
                } else {
                    this.f207502d.append(c);
                }
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.voip.video.GLTextureView$b */
    public abstract class C106485b implements C106489f {

        /* renamed from: a */
        public int[] f318069a;

        public C106485b(int[] iArr) {
            if (GLTextureView.this.f318066o == 2) {
                int length = iArr.length;
                int[] iArr2 = new int[(length + 2)];
                int i = length - 1;
                System.arraycopy(iArr, 0, iArr2, 0, i);
                iArr2[i] = 12352;
                iArr2[length] = 4;
                iArr2[length + 1] = 12344;
                iArr = iArr2;
            }
            this.f318069a = iArr;
        }

        public EGLConfig chooseConfig(EGL10 egl10, EGLDisplay eGLDisplay) {
            EGLConfig eGLConfig;
            int[] iArr = new int[1];
            if (egl10.eglChooseConfig(eGLDisplay, this.f318069a, (EGLConfig[]) null, 0, iArr)) {
                int i = 0;
                int i2 = iArr[0];
                if (i2 > 0) {
                    EGLConfig[] eGLConfigArr = new EGLConfig[i2];
                    if (egl10.eglChooseConfig(eGLDisplay, this.f318069a, eGLConfigArr, i2, iArr)) {
                        C106486c cVar = (C106486c) this;
                        while (true) {
                            if (i >= i2) {
                                eGLConfig = null;
                                break;
                            }
                            eGLConfig = eGLConfigArr[i];
                            C106486c cVar2 = cVar;
                            EGL10 egl102 = egl10;
                            EGLDisplay eGLDisplay2 = eGLDisplay;
                            EGLConfig eGLConfig2 = eGLConfig;
                            int a = cVar2.mo153082a(egl102, eGLDisplay2, eGLConfig2, 12325, 0);
                            int a2 = cVar2.mo153082a(egl102, eGLDisplay2, eGLConfig2, 12326, 0);
                            if (a >= cVar.f318076h && a2 >= cVar.f318077i) {
                                C106486c cVar3 = cVar;
                                EGL10 egl103 = egl10;
                                EGLDisplay eGLDisplay3 = eGLDisplay;
                                EGLConfig eGLConfig3 = eGLConfig;
                                int a3 = cVar3.mo153082a(egl103, eGLDisplay3, eGLConfig3, 12324, 0);
                                int a4 = cVar3.mo153082a(egl103, eGLDisplay3, eGLConfig3, 12323, 0);
                                int a5 = cVar3.mo153082a(egl103, eGLDisplay3, eGLConfig3, 12322, 0);
                                int a6 = cVar3.mo153082a(egl103, eGLDisplay3, eGLConfig3, 12321, 0);
                                if (a3 == cVar.f318072d && a4 == cVar.f318073e && a5 == cVar.f318074f && a6 == cVar.f318075g) {
                                    break;
                                }
                            }
                            i++;
                        }
                        if (eGLConfig != null) {
                            return eGLConfig;
                        }
                        throw new IllegalArgumentException("No config chosen");
                    }
                    throw new IllegalArgumentException("eglChooseConfig#2 failed");
                }
                throw new IllegalArgumentException("No configs match configSpec");
            }
            throw new IllegalArgumentException("eglChooseConfig failed");
        }
    }

    /* renamed from: com.tencent.mm.plugin.voip.video.GLTextureView$c */
    public class C106486c extends C106485b {

        /* renamed from: c */
        public int[] f318071c = new int[1];

        /* renamed from: d */
        public int f318072d;

        /* renamed from: e */
        public int f318073e;

        /* renamed from: f */
        public int f318074f;

        /* renamed from: g */
        public int f318075g;

        /* renamed from: h */
        public int f318076h;

        /* renamed from: i */
        public int f318077i;

        public C106486c(int i, int i2, int i3, int i4, int i5, int i6) {
            super(new int[]{12324, i, 12323, i2, 12322, i3, 12321, i4, 12325, i5, 12326, i6, 12344});
            this.f318072d = i;
            this.f318073e = i2;
            this.f318074f = i3;
            this.f318075g = i4;
            this.f318076h = i5;
            this.f318077i = i6;
        }

        /* renamed from: a */
        public final int mo153082a(EGL10 egl10, EGLDisplay eGLDisplay, EGLConfig eGLConfig, int i, int i2) {
            return egl10.eglGetConfigAttrib(eGLDisplay, eGLConfig, i, this.f318071c) ? this.f318071c[0] : i2;
        }
    }

    /* renamed from: com.tencent.mm.plugin.voip.video.GLTextureView$d */
    public class C106487d implements C106490g {
        public C106487d(C106484a aVar) {
        }

        public EGLContext createContext(EGL10 egl10, EGLDisplay eGLDisplay, EGLConfig eGLConfig) {
            int i = GLTextureView.this.f318066o;
            int[] iArr = {12440, i, 12344};
            EGLContext eGLContext = EGL10.EGL_NO_CONTEXT;
            if (i == 0) {
                iArr = null;
            }
            return egl10.eglCreateContext(eGLDisplay, eGLConfig, eGLContext, iArr);
        }

        public void destroyContext(EGL10 egl10, EGLDisplay eGLDisplay, EGLContext eGLContext) {
            if (!egl10.eglDestroyContext(eGLDisplay, eGLContext)) {
                Objects.toString(eGLDisplay);
                Objects.toString(eGLContext);
                Thread.currentThread().getId();
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.voip.video.GLTextureView$e */
    public static class C106488e implements C106491h {
        public C106488e(C106484a aVar) {
        }
    }

    /* renamed from: com.tencent.mm.plugin.voip.video.GLTextureView$f */
    public interface C106489f {
        EGLConfig chooseConfig(EGL10 egl10, EGLDisplay eGLDisplay);
    }

    /* renamed from: com.tencent.mm.plugin.voip.video.GLTextureView$g */
    public interface C106490g {
        EGLContext createContext(EGL10 egl10, EGLDisplay eGLDisplay, EGLConfig eGLConfig);

        void destroyContext(EGL10 egl10, EGLDisplay eGLDisplay, EGLContext eGLContext);
    }

    /* renamed from: com.tencent.mm.plugin.voip.video.GLTextureView$h */
    public interface C106491h {
    }

    /* renamed from: com.tencent.mm.plugin.voip.video.GLTextureView$i */
    public static class C106492i {

        /* renamed from: a */
        public WeakReference<GLTextureView> f318080a;

        /* renamed from: b */
        public EGL10 f318081b;

        /* renamed from: c */
        public EGLDisplay f318082c;

        /* renamed from: d */
        public EGLSurface f318083d;

        /* renamed from: e */
        public EGLConfig f318084e;

        /* renamed from: f */
        public EGLContext f318085f;

        public C106492i(WeakReference<GLTextureView> weakReference) {
            this.f318080a = weakReference;
        }

        /* renamed from: c */
        public static String m143722c(String str, int i) {
            return str + " failed: " + i;
        }

        /* renamed from: a */
        public boolean mo153085a() {
            Thread.currentThread().getId();
            if (this.f318081b == null) {
                throw new RuntimeException("egl not initialized");
            } else if (this.f318082c == null) {
                throw new RuntimeException("eglDisplay not initialized");
            } else if (this.f318084e != null) {
                mo153086b();
                GLTextureView gLTextureView = this.f318080a.get();
                EGLSurface eGLSurface = null;
                if (gLTextureView == null || gLTextureView.getSurfaceTexture() == null) {
                    this.f318083d = null;
                } else {
                    C106491h hVar = gLTextureView.f318064j;
                    EGL10 egl10 = this.f318081b;
                    EGLDisplay eGLDisplay = this.f318082c;
                    EGLConfig eGLConfig = this.f318084e;
                    SurfaceTexture surfaceTexture = gLTextureView.getSurfaceTexture();
                    ((C106488e) hVar).getClass();
                    try {
                        eGLSurface = egl10.eglCreateWindowSurface(eGLDisplay, eGLConfig, surfaceTexture, (int[]) null);
                    } catch (IllegalArgumentException unused) {
                        C106494k kVar = GLTextureView.f318057r;
                    }
                    this.f318083d = eGLSurface;
                }
                EGLSurface eGLSurface2 = this.f318083d;
                if (eGLSurface2 == null || eGLSurface2 == EGL10.EGL_NO_SURFACE) {
                    this.f318081b.eglGetError();
                    return false;
                } else if (this.f318081b.eglMakeCurrent(this.f318082c, eGLSurface2, eGLSurface2, this.f318085f)) {
                    return true;
                } else {
                    m143722c("eglMakeCurrent", this.f318081b.eglGetError());
                    return false;
                }
            } else {
                throw new RuntimeException("eglConfig not initialized");
            }
        }

        /* renamed from: b */
        public final void mo153086b() {
            EGLSurface eGLSurface;
            EGLSurface eGLSurface2 = this.f318083d;
            if (eGLSurface2 != null && eGLSurface2 != (eGLSurface = EGL10.EGL_NO_SURFACE)) {
                this.f318081b.eglMakeCurrent(this.f318082c, eGLSurface, eGLSurface, EGL10.EGL_NO_CONTEXT);
                GLTextureView gLTextureView = this.f318080a.get();
                if (gLTextureView != null) {
                    C106491h hVar = gLTextureView.f318064j;
                    EGL10 egl10 = this.f318081b;
                    EGLDisplay eGLDisplay = this.f318082c;
                    EGLSurface eGLSurface3 = this.f318083d;
                    ((C106488e) hVar).getClass();
                    egl10.eglDestroySurface(eGLDisplay, eGLSurface3);
                }
                this.f318083d = null;
            }
        }

        /* renamed from: d */
        public void mo153087d() {
            Thread.currentThread().getId();
            EGL10 egl10 = (EGL10) EGLContext.getEGL();
            this.f318081b = egl10;
            EGLDisplay eglGetDisplay = egl10.eglGetDisplay(EGL10.EGL_DEFAULT_DISPLAY);
            this.f318082c = eglGetDisplay;
            if (eglGetDisplay != EGL10.EGL_NO_DISPLAY) {
                if (this.f318081b.eglInitialize(eglGetDisplay, new int[2])) {
                    GLTextureView gLTextureView = this.f318080a.get();
                    if (gLTextureView == null) {
                        this.f318084e = null;
                        this.f318085f = null;
                    } else {
                        EGLConfig chooseConfig = gLTextureView.f318062h.chooseConfig(this.f318081b, this.f318082c);
                        this.f318084e = chooseConfig;
                        this.f318085f = gLTextureView.f318063i.createContext(this.f318081b, this.f318082c, chooseConfig);
                    }
                    EGLContext eGLContext = this.f318085f;
                    if (eGLContext == null || eGLContext == EGL10.EGL_NO_CONTEXT) {
                        this.f318085f = null;
                        String c = m143722c("createContext", this.f318081b.eglGetError());
                        Thread.currentThread().getId();
                        throw new RuntimeException(c);
                    }
                    Objects.toString(this.f318085f);
                    Thread.currentThread().getId();
                    this.f318083d = null;
                    return;
                }
                throw new RuntimeException("eglInitialize failed");
            }
            throw new RuntimeException("eglGetDisplay failed");
        }
    }

    /* renamed from: com.tencent.mm.plugin.voip.video.GLTextureView$j */
    public static class C106493j extends Thread {

        /* renamed from: d */
        public boolean f318086d;

        /* renamed from: e */
        public boolean f318087e;

        /* renamed from: f */
        public boolean f318088f;

        /* renamed from: g */
        public boolean f318089g;

        /* renamed from: h */
        public boolean f318090h;

        /* renamed from: i */
        public boolean f318091i;

        /* renamed from: j */
        public boolean f318092j;

        /* renamed from: n */
        public boolean f318093n;

        /* renamed from: o */
        public int f318094o = 0;

        /* renamed from: p */
        public int f318095p = 0;

        /* renamed from: q */
        public int f318096q = 1;

        /* renamed from: r */
        public boolean f318097r = true;

        /* renamed from: s */
        public boolean f318098s;

        /* renamed from: t */
        public ArrayList<Runnable> f318099t = new ArrayList<>();

        /* renamed from: u */
        public boolean f318100u = true;

        /* renamed from: v */
        public C106492i f318101v;

        /* renamed from: w */
        public WeakReference<GLTextureView> f318102w;

        public C106493j(WeakReference<GLTextureView> weakReference) {
            this.f318102w = weakReference;
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v37, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v42, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v29, resolved type: com.tencent.mm.plugin.voip.video.GLTextureView$m} */
        /* JADX WARNING: type inference failed for: r14v8, types: [java.io.Writer] */
        /* JADX WARNING: type inference failed for: r0v36 */
        /* JADX WARNING: type inference failed for: r14v28 */
        /* JADX WARNING: Code restructure failed: missing block: B:100:?, code lost:
            r1.f318089g = true;
            r13.notifyAll();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:101:0x0146, code lost:
            monitor-exit(r13);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:107:0x014c, code lost:
            r6 = false;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:108:0x014d, code lost:
            if (r7 == false) goto L_0x0188;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:109:0x014f, code lost:
            r4 = r1.f318101v;
            r7 = r4.f318085f.getGL();
            r4 = r4.f318080a.get();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:110:0x015f, code lost:
            if (r4 == null) goto L_0x017e;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:111:0x0161, code lost:
            r4.getClass();
            r4 = r4.f318065n;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:112:0x0168, code lost:
            if ((r4 & 3) == 0) goto L_0x017e;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:114:0x016c, code lost:
            if ((r4 & 1) == 0) goto L_0x0170;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:115:0x016e, code lost:
            r13 = 1;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:116:0x0170, code lost:
            r13 = 0;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:117:0x0171, code lost:
            r14 = r14;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:118:0x0173, code lost:
            if ((r4 & 2) == 0) goto L_0x017a;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:119:0x0175, code lost:
            r14 = new com.tencent.p014mm.plugin.voip.video.GLTextureView.C71603m();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:120:0x017a, code lost:
            r7 = android.opengl.GLDebugHelper.wrap(r7, r13, r14);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:121:0x017e, code lost:
            r7 = (javax.microedition.khronos.opengles.GL10) r7;
            com.tencent.p014mm.plugin.voip.video.GLTextureView.f318057r.mo153094a(r7);
            r4 = r7;
            r7 = false;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:122:0x0188, code lost:
            if (r5 == false) goto L_0x01a0;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:123:0x018a, code lost:
            r5 = r1.f318102w.get();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:124:0x0192, code lost:
            if (r5 == null) goto L_0x019f;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:125:0x0194, code lost:
            ((com.tencent.p014mm.plugin.voip.video.OpenGlRender) r5.f318060f).mo153108i(r4, r1.f318101v.f318084e);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:126:0x019f, code lost:
            r5 = false;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:127:0x01a0, code lost:
            if (r8 == false) goto L_0x01b4;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:128:0x01a2, code lost:
            r8 = r1.f318102w.get();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:129:0x01aa, code lost:
            if (r8 == null) goto L_0x01b3;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:130:0x01ac, code lost:
            ((com.tencent.p014mm.plugin.voip.video.OpenGlRender) r8.f318060f).mo153107h(r4, r9, r10);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:131:0x01b3, code lost:
            r8 = false;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:132:0x01b4, code lost:
            getId();
            r13 = r1.f318102w.get();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:133:0x01bf, code lost:
            if (r13 == null) goto L_0x01c8;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:134:0x01c1, code lost:
            ((com.tencent.p014mm.plugin.voip.video.OpenGlRender) r13.f318060f).mo153105f(r4);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:135:0x01c8, code lost:
            r13 = r1.f318101v;
            r16 = r0;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:136:0x01d8, code lost:
            if (r13.f318081b.eglSwapBuffers(r13.f318082c, r13.f318083d) != false) goto L_0x01e1;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:137:0x01da, code lost:
            r0 = r13.f318081b.eglGetError();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:138:0x01e1, code lost:
            r0 = 12288;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:139:0x01e3, code lost:
            if (r0 == 12288) goto L_0x0201;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:141:0x01e7, code lost:
            if (r0 == 12302) goto L_0x01fc;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:142:0x01e9, code lost:
            com.tencent.p014mm.plugin.voip.video.GLTextureView.C106492i.m143722c("eglSwapBuffers", r0);
            r13 = com.tencent.p014mm.plugin.voip.video.GLTextureView.f318057r;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:143:0x01f0, code lost:
            monitor-enter(r13);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:146:?, code lost:
            r1.f318089g = true;
            r13.notifyAll();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:147:0x01f7, code lost:
            monitor-exit(r13);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:153:0x01fc, code lost:
            getId();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:154:0x01ff, code lost:
            r0 = true;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:155:0x0201, code lost:
            r0 = r16;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:156:0x0203, code lost:
            if (r11 == false) goto L_0x001b;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:157:0x0205, code lost:
            r2 = true;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:90:0x012b, code lost:
            if (r12 == null) goto L_0x0133;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:92:?, code lost:
            r12.run();
            r12 = r14;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:93:0x0133, code lost:
            if (r6 == false) goto L_0x014d;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:95:0x013b, code lost:
            if (r1.f318101v.mo153085a() != false) goto L_0x014c;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:96:0x013d, code lost:
            r13 = com.tencent.p014mm.plugin.voip.video.GLTextureView.f318057r;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:97:0x013f, code lost:
            monitor-enter(r13);
         */
        /* JADX WARNING: Multi-variable type inference failed */
        /* JADX WARNING: Removed duplicated region for block: B:182:0x010d A[SYNTHETIC] */
        /* JADX WARNING: Removed duplicated region for block: B:63:0x00db A[SYNTHETIC, Splitter:B:63:0x00db] */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void mo153088a() {
            /*
                r17 = this;
                r1 = r17
                com.tencent.mm.plugin.voip.video.GLTextureView$i r0 = new com.tencent.mm.plugin.voip.video.GLTextureView$i
                java.lang.ref.WeakReference<com.tencent.mm.plugin.voip.video.GLTextureView> r2 = r1.f318102w
                r0.<init>(r2)
                r1.f318101v = r0
                r0 = 0
                r1.f318091i = r0
                r1.f318092j = r0
                r2 = 0
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
            L_0x001b:
                com.tencent.mm.plugin.voip.video.GLTextureView$k r13 = com.tencent.p014mm.plugin.voip.video.GLTextureView.f318057r     // Catch:{ all -> 0x0216 }
                monitor-enter(r13)     // Catch:{ all -> 0x0216 }
            L_0x001e:
                boolean r14 = r1.f318086d     // Catch:{ all -> 0x0213 }
                if (r14 == 0) goto L_0x0031
                monitor-exit(r13)     // Catch:{ all -> 0x0213 }
                com.tencent.mm.plugin.voip.video.GLTextureView$k r2 = com.tencent.p014mm.plugin.voip.video.GLTextureView.f318057r
                monitor-enter(r2)
                r17.mo153092e()     // Catch:{ all -> 0x002e }
                r17.mo153091d()     // Catch:{ all -> 0x002e }
                monitor-exit(r2)     // Catch:{ all -> 0x002e }
                return
            L_0x002e:
                r0 = move-exception
                monitor-exit(r2)     // Catch:{ all -> 0x002e }
                throw r0
            L_0x0031:
                java.util.ArrayList<java.lang.Runnable> r14 = r1.f318099t     // Catch:{ all -> 0x0213 }
                boolean r14 = r14.isEmpty()     // Catch:{ all -> 0x0213 }
                r15 = 1
                if (r14 != 0) goto L_0x0046
                java.util.ArrayList<java.lang.Runnable> r12 = r1.f318099t     // Catch:{ all -> 0x0213 }
                r14 = 0
                java.lang.Object r12 = r12.remove(r14)     // Catch:{ all -> 0x0213 }
                java.lang.Runnable r12 = (java.lang.Runnable) r12     // Catch:{ all -> 0x0213 }
                r14 = 0
                goto L_0x012a
            L_0x0046:
                boolean r14 = r1.f318093n     // Catch:{ all -> 0x0213 }
                if (r14 == 0) goto L_0x0057
                r17.getId()     // Catch:{ all -> 0x0213 }
                r17.mo153092e()     // Catch:{ all -> 0x0213 }
                r17.mo153091d()     // Catch:{ all -> 0x0213 }
                r3 = 0
                r1.f318093n = r3     // Catch:{ all -> 0x0213 }
                r3 = 1
            L_0x0057:
                if (r0 == 0) goto L_0x0060
                r17.mo153092e()     // Catch:{ all -> 0x0213 }
                r17.mo153091d()     // Catch:{ all -> 0x0213 }
                r0 = 0
            L_0x0060:
                boolean r14 = r1.f318088f     // Catch:{ all -> 0x0213 }
                if (r14 != 0) goto L_0x007c
                boolean r14 = r1.f318090h     // Catch:{ all -> 0x0213 }
                if (r14 != 0) goto L_0x007c
                r17.getId()     // Catch:{ all -> 0x0213 }
                boolean r14 = r1.f318092j     // Catch:{ all -> 0x0213 }
                if (r14 == 0) goto L_0x0072
                r17.mo153092e()     // Catch:{ all -> 0x0213 }
            L_0x0072:
                r1.f318090h = r15     // Catch:{ all -> 0x0213 }
                r14 = 0
                r1.f318089g = r14     // Catch:{ all -> 0x0213 }
                com.tencent.mm.plugin.voip.video.GLTextureView$k r14 = com.tencent.p014mm.plugin.voip.video.GLTextureView.f318057r     // Catch:{ all -> 0x0213 }
                r14.notifyAll()     // Catch:{ all -> 0x0213 }
            L_0x007c:
                boolean r14 = r1.f318088f     // Catch:{ all -> 0x0213 }
                if (r14 == 0) goto L_0x008f
                boolean r14 = r1.f318090h     // Catch:{ all -> 0x0213 }
                if (r14 == 0) goto L_0x008f
                r17.getId()     // Catch:{ all -> 0x0213 }
                r14 = 0
                r1.f318090h = r14     // Catch:{ all -> 0x0213 }
                com.tencent.mm.plugin.voip.video.GLTextureView$k r14 = com.tencent.p014mm.plugin.voip.video.GLTextureView.f318057r     // Catch:{ all -> 0x0213 }
                r14.notifyAll()     // Catch:{ all -> 0x0213 }
            L_0x008f:
                if (r2 == 0) goto L_0x009d
                r17.getId()     // Catch:{ all -> 0x0213 }
                r1.f318098s = r15     // Catch:{ all -> 0x0213 }
                com.tencent.mm.plugin.voip.video.GLTextureView$k r2 = com.tencent.p014mm.plugin.voip.video.GLTextureView.f318057r     // Catch:{ all -> 0x0213 }
                r2.notifyAll()     // Catch:{ all -> 0x0213 }
                r2 = 0
                r11 = 0
            L_0x009d:
                boolean r14 = r17.mo153089b()     // Catch:{ all -> 0x0213 }
                if (r14 == 0) goto L_0x0208
                boolean r14 = r1.f318091i     // Catch:{ all -> 0x0213 }
                if (r14 != 0) goto L_0x00f7
                if (r3 == 0) goto L_0x00b0
                r3 = 0
                r14 = 0
                r16 = r0
                r14 = r3
                r3 = 0
                goto L_0x00fb
            L_0x00b0:
                com.tencent.mm.plugin.voip.video.GLTextureView$k r14 = com.tencent.p014mm.plugin.voip.video.GLTextureView.f318057r     // Catch:{ all -> 0x0213 }
                com.tencent.mm.plugin.voip.video.GLTextureView$j r15 = r14.f318106d     // Catch:{ all -> 0x0213 }
                if (r15 == r1) goto L_0x00d1
                if (r15 != 0) goto L_0x00b9
                goto L_0x00d1
            L_0x00b9:
                r16 = r0
                boolean r0 = r14.f318103a     // Catch:{ all -> 0x0213 }
                if (r0 != 0) goto L_0x00c2
                r0 = 1
                r14.f318103a = r0     // Catch:{ all -> 0x0213 }
            L_0x00c2:
                boolean r0 = r14.f318105c     // Catch:{ all -> 0x0213 }
                if (r0 == 0) goto L_0x00c7
                goto L_0x00d8
            L_0x00c7:
                if (r15 == 0) goto L_0x00cf
                r0 = 1
                r15.f318093n = r0     // Catch:{ all -> 0x0213 }
                r14.notifyAll()     // Catch:{ all -> 0x0213 }
            L_0x00cf:
                r0 = 0
                goto L_0x00d9
            L_0x00d1:
                r16 = r0
                r14.f318106d = r1     // Catch:{ all -> 0x0213 }
                r14.notifyAll()     // Catch:{ all -> 0x0213 }
            L_0x00d8:
                r0 = 1
            L_0x00d9:
                if (r0 == 0) goto L_0x00f9
                com.tencent.mm.plugin.voip.video.GLTextureView$i r0 = r1.f318101v     // Catch:{ RuntimeException -> 0x00e9 }
                r0.mo153087d()     // Catch:{ RuntimeException -> 0x00e9 }
                r0 = 1
                r1.f318091i = r0     // Catch:{ all -> 0x0213 }
                r14.notifyAll()     // Catch:{ all -> 0x0213 }
                r0 = 0
                r5 = 1
                goto L_0x00fa
            L_0x00e9:
                r0 = move-exception
                com.tencent.mm.plugin.voip.video.GLTextureView$k r2 = com.tencent.p014mm.plugin.voip.video.GLTextureView.f318057r     // Catch:{ all -> 0x0213 }
                com.tencent.mm.plugin.voip.video.GLTextureView$j r3 = r2.f318106d     // Catch:{ all -> 0x0213 }
                if (r3 != r1) goto L_0x00f3
                r3 = 0
                r2.f318106d = r3     // Catch:{ all -> 0x0213 }
            L_0x00f3:
                r2.notifyAll()     // Catch:{ all -> 0x0213 }
                throw r0     // Catch:{ all -> 0x0213 }
            L_0x00f7:
                r16 = r0
            L_0x00f9:
                r0 = 0
            L_0x00fa:
                r14 = r0
            L_0x00fb:
                boolean r0 = r1.f318091i     // Catch:{ all -> 0x0213 }
                if (r0 == 0) goto L_0x0109
                boolean r0 = r1.f318092j     // Catch:{ all -> 0x0213 }
                if (r0 != 0) goto L_0x0109
                r0 = 1
                r1.f318092j = r0     // Catch:{ all -> 0x0213 }
                r6 = 1
                r7 = 1
                r8 = 1
            L_0x0109:
                boolean r0 = r1.f318092j     // Catch:{ all -> 0x0213 }
                if (r0 == 0) goto L_0x020a
                boolean r0 = r1.f318100u     // Catch:{ all -> 0x0213 }
                if (r0 == 0) goto L_0x0120
                int r9 = r1.f318094o     // Catch:{ all -> 0x0213 }
                int r10 = r1.f318095p     // Catch:{ all -> 0x0213 }
                r17.getId()     // Catch:{ all -> 0x0213 }
                r0 = 0
                r1.f318100u = r0     // Catch:{ all -> 0x0213 }
                r0 = 0
                r6 = 1
                r8 = 1
                r11 = 1
                goto L_0x0121
            L_0x0120:
                r0 = 0
            L_0x0121:
                r1.f318097r = r0     // Catch:{ all -> 0x0213 }
                com.tencent.mm.plugin.voip.video.GLTextureView$k r0 = com.tencent.p014mm.plugin.voip.video.GLTextureView.f318057r     // Catch:{ all -> 0x0213 }
                r0.notifyAll()     // Catch:{ all -> 0x0213 }
                r0 = r16
            L_0x012a:
                monitor-exit(r13)     // Catch:{ all -> 0x0213 }
                if (r12 == 0) goto L_0x0133
                r12.run()     // Catch:{ all -> 0x0216 }
                r12 = r14
                goto L_0x001b
            L_0x0133:
                if (r6 == 0) goto L_0x014d
                com.tencent.mm.plugin.voip.video.GLTextureView$i r13 = r1.f318101v     // Catch:{ all -> 0x0216 }
                boolean r13 = r13.mo153085a()     // Catch:{ all -> 0x0216 }
                if (r13 != 0) goto L_0x014c
                com.tencent.mm.plugin.voip.video.GLTextureView$k r13 = com.tencent.p014mm.plugin.voip.video.GLTextureView.f318057r     // Catch:{ all -> 0x0216 }
                monitor-enter(r13)     // Catch:{ all -> 0x0216 }
                r14 = 1
                r1.f318089g = r14     // Catch:{ all -> 0x0149 }
                r13.notifyAll()     // Catch:{ all -> 0x0149 }
                monitor-exit(r13)     // Catch:{ all -> 0x0149 }
                goto L_0x001b
            L_0x0149:
                r0 = move-exception
                monitor-exit(r13)     // Catch:{ all -> 0x0149 }
                throw r0     // Catch:{ all -> 0x0216 }
            L_0x014c:
                r6 = 0
            L_0x014d:
                if (r7 == 0) goto L_0x0188
                com.tencent.mm.plugin.voip.video.GLTextureView$i r4 = r1.f318101v     // Catch:{ all -> 0x0216 }
                javax.microedition.khronos.egl.EGLContext r7 = r4.f318085f     // Catch:{ all -> 0x0216 }
                javax.microedition.khronos.opengles.GL r7 = r7.getGL()     // Catch:{ all -> 0x0216 }
                java.lang.ref.WeakReference<com.tencent.mm.plugin.voip.video.GLTextureView> r4 = r4.f318080a     // Catch:{ all -> 0x0216 }
                java.lang.Object r4 = r4.get()     // Catch:{ all -> 0x0216 }
                com.tencent.mm.plugin.voip.video.GLTextureView r4 = (com.tencent.p014mm.plugin.voip.video.GLTextureView) r4     // Catch:{ all -> 0x0216 }
                if (r4 == 0) goto L_0x017e
                r4.getClass()     // Catch:{ all -> 0x0216 }
                int r4 = r4.f318065n     // Catch:{ all -> 0x0216 }
                r13 = r4 & 3
                if (r13 == 0) goto L_0x017e
                r13 = r4 & 1
                if (r13 == 0) goto L_0x0170
                r13 = 1
                goto L_0x0171
            L_0x0170:
                r13 = 0
            L_0x0171:
                r4 = r4 & 2
                if (r4 == 0) goto L_0x017a
                com.tencent.mm.plugin.voip.video.GLTextureView$m r14 = new com.tencent.mm.plugin.voip.video.GLTextureView$m     // Catch:{ all -> 0x0216 }
                r14.<init>()     // Catch:{ all -> 0x0216 }
            L_0x017a:
                javax.microedition.khronos.opengles.GL r7 = android.opengl.GLDebugHelper.wrap(r7, r13, r14)     // Catch:{ all -> 0x0216 }
            L_0x017e:
                javax.microedition.khronos.opengles.GL10 r7 = (javax.microedition.khronos.opengles.GL10) r7     // Catch:{ all -> 0x0216 }
                com.tencent.mm.plugin.voip.video.GLTextureView$k r4 = com.tencent.p014mm.plugin.voip.video.GLTextureView.f318057r     // Catch:{ all -> 0x0216 }
                r4.mo153094a(r7)     // Catch:{ all -> 0x0216 }
                r4 = 0
                r4 = r7
                r7 = 0
            L_0x0188:
                if (r5 == 0) goto L_0x01a0
                java.lang.ref.WeakReference<com.tencent.mm.plugin.voip.video.GLTextureView> r5 = r1.f318102w     // Catch:{ all -> 0x0216 }
                java.lang.Object r5 = r5.get()     // Catch:{ all -> 0x0216 }
                com.tencent.mm.plugin.voip.video.GLTextureView r5 = (com.tencent.p014mm.plugin.voip.video.GLTextureView) r5     // Catch:{ all -> 0x0216 }
                if (r5 == 0) goto L_0x019f
                com.tencent.mm.plugin.voip.video.GLTextureView$n r5 = r5.f318060f     // Catch:{ all -> 0x0216 }
                com.tencent.mm.plugin.voip.video.GLTextureView$i r13 = r1.f318101v     // Catch:{ all -> 0x0216 }
                javax.microedition.khronos.egl.EGLConfig r13 = r13.f318084e     // Catch:{ all -> 0x0216 }
                com.tencent.mm.plugin.voip.video.OpenGlRender r5 = (com.tencent.p014mm.plugin.voip.video.OpenGlRender) r5     // Catch:{ all -> 0x0216 }
                r5.mo153108i(r4, r13)     // Catch:{ all -> 0x0216 }
            L_0x019f:
                r5 = 0
            L_0x01a0:
                if (r8 == 0) goto L_0x01b4
                java.lang.ref.WeakReference<com.tencent.mm.plugin.voip.video.GLTextureView> r8 = r1.f318102w     // Catch:{ all -> 0x0216 }
                java.lang.Object r8 = r8.get()     // Catch:{ all -> 0x0216 }
                com.tencent.mm.plugin.voip.video.GLTextureView r8 = (com.tencent.p014mm.plugin.voip.video.GLTextureView) r8     // Catch:{ all -> 0x0216 }
                if (r8 == 0) goto L_0x01b3
                com.tencent.mm.plugin.voip.video.GLTextureView$n r8 = r8.f318060f     // Catch:{ all -> 0x0216 }
                com.tencent.mm.plugin.voip.video.OpenGlRender r8 = (com.tencent.p014mm.plugin.voip.video.OpenGlRender) r8     // Catch:{ all -> 0x0216 }
                r8.mo153107h(r4, r9, r10)     // Catch:{ all -> 0x0216 }
            L_0x01b3:
                r8 = 0
            L_0x01b4:
                r17.getId()     // Catch:{ all -> 0x0216 }
                java.lang.ref.WeakReference<com.tencent.mm.plugin.voip.video.GLTextureView> r13 = r1.f318102w     // Catch:{ all -> 0x0216 }
                java.lang.Object r13 = r13.get()     // Catch:{ all -> 0x0216 }
                com.tencent.mm.plugin.voip.video.GLTextureView r13 = (com.tencent.p014mm.plugin.voip.video.GLTextureView) r13     // Catch:{ all -> 0x0216 }
                if (r13 == 0) goto L_0x01c8
                com.tencent.mm.plugin.voip.video.GLTextureView$n r13 = r13.f318060f     // Catch:{ all -> 0x0216 }
                com.tencent.mm.plugin.voip.video.OpenGlRender r13 = (com.tencent.p014mm.plugin.voip.video.OpenGlRender) r13     // Catch:{ all -> 0x0216 }
                r13.mo153105f(r4)     // Catch:{ all -> 0x0216 }
            L_0x01c8:
                com.tencent.mm.plugin.voip.video.GLTextureView$i r13 = r1.f318101v     // Catch:{ all -> 0x0216 }
                javax.microedition.khronos.egl.EGL10 r14 = r13.f318081b     // Catch:{ all -> 0x0216 }
                javax.microedition.khronos.egl.EGLDisplay r15 = r13.f318082c     // Catch:{ all -> 0x0216 }
                r16 = r0
                javax.microedition.khronos.egl.EGLSurface r0 = r13.f318083d     // Catch:{ all -> 0x0216 }
                boolean r0 = r14.eglSwapBuffers(r15, r0)     // Catch:{ all -> 0x0216 }
                r14 = 12288(0x3000, float:1.7219E-41)
                if (r0 != 0) goto L_0x01e1
                javax.microedition.khronos.egl.EGL10 r0 = r13.f318081b     // Catch:{ all -> 0x0216 }
                int r0 = r0.eglGetError()     // Catch:{ all -> 0x0216 }
                goto L_0x01e3
            L_0x01e1:
                r0 = 12288(0x3000, float:1.7219E-41)
            L_0x01e3:
                if (r0 == r14) goto L_0x0201
                r13 = 12302(0x300e, float:1.7239E-41)
                if (r0 == r13) goto L_0x01fc
                java.lang.String r13 = "eglSwapBuffers"
                com.tencent.p014mm.plugin.voip.video.GLTextureView.C106492i.m143722c(r13, r0)     // Catch:{ all -> 0x0216 }
                com.tencent.mm.plugin.voip.video.GLTextureView$k r13 = com.tencent.p014mm.plugin.voip.video.GLTextureView.f318057r     // Catch:{ all -> 0x0216 }
                monitor-enter(r13)     // Catch:{ all -> 0x0216 }
                r0 = 1
                r1.f318089g = r0     // Catch:{ all -> 0x01f9 }
                r13.notifyAll()     // Catch:{ all -> 0x01f9 }
                monitor-exit(r13)     // Catch:{ all -> 0x01f9 }
                goto L_0x0201
            L_0x01f9:
                r0 = move-exception
                monitor-exit(r13)     // Catch:{ all -> 0x01f9 }
                throw r0     // Catch:{ all -> 0x0216 }
            L_0x01fc:
                r17.getId()     // Catch:{ all -> 0x0216 }
                r0 = 1
                goto L_0x0203
            L_0x0201:
                r0 = r16
            L_0x0203:
                if (r11 == 0) goto L_0x001b
                r2 = 1
                goto L_0x001b
            L_0x0208:
                r16 = r0
            L_0x020a:
                com.tencent.mm.plugin.voip.video.GLTextureView$k r0 = com.tencent.p014mm.plugin.voip.video.GLTextureView.f318057r     // Catch:{ all -> 0x0213 }
                r0.wait()     // Catch:{ all -> 0x0213 }
                r0 = r16
                goto L_0x001e
            L_0x0213:
                r0 = move-exception
                monitor-exit(r13)     // Catch:{ all -> 0x0213 }
                throw r0     // Catch:{ all -> 0x0216 }
            L_0x0216:
                r0 = move-exception
                com.tencent.mm.plugin.voip.video.GLTextureView$k r2 = com.tencent.p014mm.plugin.voip.video.GLTextureView.f318057r
                monitor-enter(r2)
                r17.mo153092e()     // Catch:{ all -> 0x0222 }
                r17.mo153091d()     // Catch:{ all -> 0x0222 }
                monitor-exit(r2)     // Catch:{ all -> 0x0222 }
                throw r0
            L_0x0222:
                r0 = move-exception
                monitor-exit(r2)     // Catch:{ all -> 0x0222 }
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.voip.video.GLTextureView.C106493j.mo153088a():void");
        }

        /* renamed from: b */
        public final boolean mo153089b() {
            return this.f318088f && !this.f318089g && this.f318094o > 0 && this.f318095p > 0 && (this.f318097r || this.f318096q == 1);
        }

        /* JADX WARNING: Can't wrap try/catch for region: R(7:7|8|9|10|19|16|5) */
        /* JADX WARNING: Code restructure failed: missing block: B:18:0x0009, code lost:
            continue;
         */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0013 */
        /* renamed from: c */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void mo153090c() {
            /*
                r2 = this;
                com.tencent.mm.plugin.voip.video.GLTextureView$k r0 = com.tencent.p014mm.plugin.voip.video.GLTextureView.f318057r
                monitor-enter(r0)
                r1 = 1
                r2.f318086d = r1     // Catch:{ all -> 0x001d }
                r0.notifyAll()     // Catch:{ all -> 0x001d }
            L_0x0009:
                boolean r1 = r2.f318087e     // Catch:{ all -> 0x001d }
                if (r1 != 0) goto L_0x001b
                com.tencent.mm.plugin.voip.video.GLTextureView$k r1 = com.tencent.p014mm.plugin.voip.video.GLTextureView.f318057r     // Catch:{ InterruptedException -> 0x0013 }
                r1.wait()     // Catch:{ InterruptedException -> 0x0013 }
                goto L_0x0009
            L_0x0013:
                java.lang.Thread r1 = java.lang.Thread.currentThread()     // Catch:{ all -> 0x001d }
                r1.interrupt()     // Catch:{ all -> 0x001d }
                goto L_0x0009
            L_0x001b:
                monitor-exit(r0)     // Catch:{ all -> 0x001d }
                return
            L_0x001d:
                r1 = move-exception
                monitor-exit(r0)     // Catch:{ all -> 0x001d }
                throw r1
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.voip.video.GLTextureView.C106493j.mo153090c():void");
        }

        /* renamed from: d */
        public final void mo153091d() {
            if (this.f318091i) {
                C106492i iVar = this.f318101v;
                iVar.getClass();
                Thread.currentThread().getId();
                if (iVar.f318085f != null) {
                    GLTextureView gLTextureView = iVar.f318080a.get();
                    if (gLTextureView != null) {
                        gLTextureView.f318063i.destroyContext(iVar.f318081b, iVar.f318082c, iVar.f318085f);
                    }
                    iVar.f318085f = null;
                }
                EGLDisplay eGLDisplay = iVar.f318082c;
                if (eGLDisplay != null) {
                    iVar.f318081b.eglTerminate(eGLDisplay);
                    iVar.f318082c = null;
                }
                this.f318091i = false;
                C106494k kVar = GLTextureView.f318057r;
                if (kVar.f318106d == this) {
                    kVar.f318106d = null;
                }
                kVar.notifyAll();
            }
        }

        /* renamed from: e */
        public final void mo153092e() {
            if (this.f318092j) {
                this.f318092j = false;
                C106492i iVar = this.f318101v;
                iVar.getClass();
                Thread.currentThread().getId();
                iVar.mo153086b();
            }
        }

        public void run() {
            setName("GLThread " + getId());
            getId();
            try {
                mo153088a();
            } catch (InterruptedException | RuntimeException unused) {
            } catch (Throwable th) {
                C106494k kVar = GLTextureView.f318057r;
                GLTextureView.f318057r.mo153095b(this);
                throw th;
            }
            GLTextureView.f318057r.mo153095b(this);
        }
    }

    /* renamed from: com.tencent.mm.plugin.voip.video.GLTextureView$k */
    public static class C106494k {

        /* renamed from: a */
        public boolean f318103a;

        /* renamed from: b */
        public boolean f318104b;

        /* renamed from: c */
        public boolean f318105c;

        /* renamed from: d */
        public C106493j f318106d;

        public C106494k(C106484a aVar) {
        }

        /* renamed from: a */
        public synchronized void mo153094a(GL10 gl10) {
            if (!this.f318104b) {
                if (!this.f318103a) {
                    this.f318103a = true;
                }
                this.f318105c = !gl10.glGetString(7937).startsWith("Q3Dimension MSM7500 ");
                notifyAll();
                this.f318104b = true;
            }
        }

        /* renamed from: b */
        public synchronized void mo153095b(C106493j jVar) {
            jVar.getId();
            jVar.f318087e = true;
            if (this.f318106d == jVar) {
                this.f318106d = null;
            }
            notifyAll();
        }
    }

    /* renamed from: com.tencent.mm.plugin.voip.video.GLTextureView$n */
    public interface C106495n {
    }

    /* renamed from: com.tencent.mm.plugin.voip.video.GLTextureView$o */
    public class C106496o extends C106486c {
        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C106496o(boolean z) {
            super(8, 8, 8, 0, z ? 16 : 0, 0);
        }
    }

    static {
        Class<GLTextureView> cls = GLTextureView.class;
    }

    public GLTextureView(Context context) {
        super(context);
        setSurfaceTextureListener(this);
    }

    /* renamed from: a */
    public final void mo153055a() {
        if (this.f318059e != null) {
            throw new IllegalStateException("setRenderer has already been called for this instance.");
        }
    }

    /* renamed from: b */
    public void mo153056b(Runnable runnable) {
        C106493j jVar = this.f318059e;
        jVar.getClass();
        if (runnable != null) {
            C106494k kVar = f318057r;
            synchronized (kVar) {
                jVar.f318099t.add(runnable);
                kVar.notifyAll();
            }
            return;
        }
        throw new IllegalArgumentException("r must not be null");
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(7:17|18|19|20|21|32|27) */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0017, code lost:
        continue;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:20:0x003b */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo153057c(android.graphics.SurfaceTexture r2, int r3, int r4, int r5) {
        /*
            r1 = this;
            com.tencent.mm.plugin.voip.video.GLTextureView$j r2 = r1.f318059e
            r2.getClass()
            com.tencent.mm.plugin.voip.video.GLTextureView$k r3 = f318057r
            monitor-enter(r3)
            r2.f318094o = r4     // Catch:{ all -> 0x0045 }
            r2.f318095p = r5     // Catch:{ all -> 0x0045 }
            r4 = 1
            r2.f318100u = r4     // Catch:{ all -> 0x0045 }
            r2.f318097r = r4     // Catch:{ all -> 0x0045 }
            r5 = 0
            r2.f318098s = r5     // Catch:{ all -> 0x0045 }
            r3.notifyAll()     // Catch:{ all -> 0x0045 }
        L_0x0017:
            boolean r0 = r2.f318087e     // Catch:{ all -> 0x0045 }
            if (r0 != 0) goto L_0x0043
            boolean r0 = r2.f318098s     // Catch:{ all -> 0x0045 }
            if (r0 != 0) goto L_0x0043
            boolean r0 = r2.f318091i     // Catch:{ all -> 0x0045 }
            if (r0 == 0) goto L_0x002f
            boolean r0 = r2.f318092j     // Catch:{ all -> 0x0045 }
            if (r0 == 0) goto L_0x002f
            boolean r0 = r2.mo153089b()     // Catch:{ all -> 0x0045 }
            if (r0 == 0) goto L_0x002f
            r0 = 1
            goto L_0x0030
        L_0x002f:
            r0 = 0
        L_0x0030:
            if (r0 == 0) goto L_0x0043
            r2.getId()     // Catch:{ all -> 0x0045 }
            com.tencent.mm.plugin.voip.video.GLTextureView$k r0 = f318057r     // Catch:{ InterruptedException -> 0x003b }
            r0.wait()     // Catch:{ InterruptedException -> 0x003b }
            goto L_0x0017
        L_0x003b:
            java.lang.Thread r0 = java.lang.Thread.currentThread()     // Catch:{ all -> 0x0045 }
            r0.interrupt()     // Catch:{ all -> 0x0045 }
            goto L_0x0017
        L_0x0043:
            monitor-exit(r3)     // Catch:{ all -> 0x0045 }
            return
        L_0x0045:
            r2 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x0045 }
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.voip.video.GLTextureView.mo153057c(android.graphics.SurfaceTexture, int, int, int):void");
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(7:8|9|10|11|21|17|4) */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0011, code lost:
        continue;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:10:0x001f */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo153058d(android.graphics.SurfaceTexture r3) {
        /*
            r2 = this;
            com.tencent.mm.plugin.voip.video.GLTextureView$j r3 = r2.f318059e
            r3.getClass()
            com.tencent.mm.plugin.voip.video.GLTextureView$k r0 = f318057r
            monitor-enter(r0)
            r3.getId()     // Catch:{ all -> 0x0029 }
            r1 = 1
            r3.f318088f = r1     // Catch:{ all -> 0x0029 }
            r0.notifyAll()     // Catch:{ all -> 0x0029 }
        L_0x0011:
            boolean r1 = r3.f318090h     // Catch:{ all -> 0x0029 }
            if (r1 == 0) goto L_0x0027
            boolean r1 = r3.f318087e     // Catch:{ all -> 0x0029 }
            if (r1 != 0) goto L_0x0027
            com.tencent.mm.plugin.voip.video.GLTextureView$k r1 = f318057r     // Catch:{ InterruptedException -> 0x001f }
            r1.wait()     // Catch:{ InterruptedException -> 0x001f }
            goto L_0x0011
        L_0x001f:
            java.lang.Thread r1 = java.lang.Thread.currentThread()     // Catch:{ all -> 0x0029 }
            r1.interrupt()     // Catch:{ all -> 0x0029 }
            goto L_0x0011
        L_0x0027:
            monitor-exit(r0)     // Catch:{ all -> 0x0029 }
            return
        L_0x0029:
            r3 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0029 }
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.voip.video.GLTextureView.mo153058d(android.graphics.SurfaceTexture):void");
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(7:8|9|10|11|21|17|4) */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0011, code lost:
        continue;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:10:0x001f */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo153059e(android.graphics.SurfaceTexture r3) {
        /*
            r2 = this;
            com.tencent.mm.plugin.voip.video.GLTextureView$j r3 = r2.f318059e
            r3.getClass()
            com.tencent.mm.plugin.voip.video.GLTextureView$k r0 = f318057r
            monitor-enter(r0)
            r3.getId()     // Catch:{ all -> 0x0029 }
            r1 = 0
            r3.f318088f = r1     // Catch:{ all -> 0x0029 }
            r0.notifyAll()     // Catch:{ all -> 0x0029 }
        L_0x0011:
            boolean r1 = r3.f318090h     // Catch:{ all -> 0x0029 }
            if (r1 != 0) goto L_0x0027
            boolean r1 = r3.f318087e     // Catch:{ all -> 0x0029 }
            if (r1 != 0) goto L_0x0027
            com.tencent.mm.plugin.voip.video.GLTextureView$k r1 = f318057r     // Catch:{ InterruptedException -> 0x001f }
            r1.wait()     // Catch:{ InterruptedException -> 0x001f }
            goto L_0x0011
        L_0x001f:
            java.lang.Thread r1 = java.lang.Thread.currentThread()     // Catch:{ all -> 0x0029 }
            r1.interrupt()     // Catch:{ all -> 0x0029 }
            goto L_0x0011
        L_0x0027:
            monitor-exit(r0)     // Catch:{ all -> 0x0029 }
            return
        L_0x0029:
            r3 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0029 }
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.voip.video.GLTextureView.mo153059e(android.graphics.SurfaceTexture):void");
    }

    public void finalize() {
        try {
            C106493j jVar = this.f318059e;
            if (jVar != null) {
                jVar.mo153090c();
            }
        } finally {
            super.finalize();
        }
    }

    public int getDebugFlags() {
        return this.f318065n;
    }

    public boolean getPreserveEGLContextOnPause() {
        return this.f318067p;
    }

    public int getRenderMode() {
        int i;
        C106493j jVar = this.f318059e;
        jVar.getClass();
        synchronized (f318057r) {
            i = jVar.f318096q;
        }
        return i;
    }

    public void onAttachedToWindow() {
        int i;
        super.onAttachedToWindow();
        if (this.f318061g && this.f318060f != null) {
            C106493j jVar = this.f318059e;
            if (jVar != null) {
                synchronized (f318057r) {
                    i = jVar.f318096q;
                }
            } else {
                i = 1;
            }
            C106493j jVar2 = new C106493j(this.f318058d);
            this.f318059e = jVar2;
            if (i != 1) {
                if (i < 0 || i > 1) {
                    throw new IllegalArgumentException("renderMode");
                }
                C106494k kVar = f318057r;
                synchronized (kVar) {
                    jVar2.f318096q = i;
                    kVar.notifyAll();
                }
            }
            this.f318059e.start();
        }
        this.f318061g = false;
    }

    public void onDetachedFromWindow() {
        mo153059e(getSurfaceTexture());
        C106493j jVar = this.f318059e;
        if (jVar != null) {
            jVar.mo153090c();
        }
        this.f318061g = true;
        super.onDetachedFromWindow();
    }

    public void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        mo153057c(getSurfaceTexture(), 0, i3 - i, i4 - i2);
    }

    public void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
        mo153058d(surfaceTexture);
        mo153057c(surfaceTexture, 0, i, i2);
        Iterator it = ((ArrayList) this.f318068q).iterator();
        while (it.hasNext()) {
            ((TextureView.SurfaceTextureListener) it.next()).onSurfaceTextureAvailable(surfaceTexture, i, i2);
        }
    }

    public boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        for (TextureView.SurfaceTextureListener onSurfaceTextureDestroyed : this.f318068q) {
            onSurfaceTextureDestroyed.onSurfaceTextureDestroyed(surfaceTexture);
        }
        return true;
    }

    public void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
        mo153057c(surfaceTexture, 0, i, i2);
        Iterator it = ((ArrayList) this.f318068q).iterator();
        while (it.hasNext()) {
            ((TextureView.SurfaceTextureListener) it.next()).onSurfaceTextureSizeChanged(surfaceTexture, i, i2);
        }
    }

    public void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        for (TextureView.SurfaceTextureListener onSurfaceTextureUpdated : this.f318068q) {
            onSurfaceTextureUpdated.onSurfaceTextureUpdated(surfaceTexture);
        }
    }

    public void setDebugFlags(int i) {
        this.f318065n = i;
    }

    public void setEGLConfigChooser(C106489f fVar) {
        mo153055a();
        this.f318062h = fVar;
    }

    public void setEGLContextClientVersion(int i) {
        mo153055a();
        this.f318066o = i;
    }

    public void setEGLContextFactory(C106490g gVar) {
        mo153055a();
        this.f318063i = gVar;
    }

    public void setEGLWindowSurfaceFactory(C106491h hVar) {
        mo153055a();
        this.f318064j = hVar;
    }

    public void setGLWrapper(C71602l lVar) {
    }

    public void setPreserveEGLContextOnPause(boolean z) {
        this.f318067p = z;
    }

    public void setRenderMode(int i) {
        C106493j jVar = this.f318059e;
        jVar.getClass();
        if (i < 0 || i > 1) {
            throw new IllegalArgumentException("renderMode");
        }
        C106494k kVar = f318057r;
        synchronized (kVar) {
            jVar.f318096q = i;
            kVar.notifyAll();
        }
    }

    public void setRenderer(C106495n nVar) {
        mo153055a();
        if (this.f318062h == null) {
            this.f318062h = new C106496o(true);
        }
        if (this.f318063i == null) {
            this.f318063i = new C106487d((C106484a) null);
        }
        if (this.f318064j == null) {
            this.f318064j = new C106488e((C106484a) null);
        }
        this.f318060f = nVar;
        C106493j jVar = new C106493j(this.f318058d);
        this.f318059e = jVar;
        jVar.start();
    }

    public void setEGLConfigChooser(boolean z) {
        setEGLConfigChooser((C106489f) new C106496o(z));
    }

    public GLTextureView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setSurfaceTextureListener(this);
    }
}

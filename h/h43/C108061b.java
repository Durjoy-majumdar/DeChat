package h43;

import android.graphics.SurfaceTexture;
import android.media.ImageReader;
import android.opengl.EGLContext;
import android.opengl.EGLSurface;
import android.os.Handler;
import android.util.Size;
import android.view.Surface;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandler;
import fy3.C32224a;
import fy3.C32226l;
import fy3.C32228q;
import gy3.C8480h;
import gy3.C87412m;
import gy3.C87413o;
import java.nio.ByteBuffer;
import l33.C109247e;
import p80.C110194c;
import rx3.C13598b0;
import u33.C111130b;
import w80.C111742d;
import z33.C112595h;

/* renamed from: h43.b */
public final class C108061b extends C108128y0 {

    /* renamed from: v */
    public boolean f323584v;

    /* renamed from: w */
    public ImageReader f323585w;

    /* renamed from: x */
    public MMHandler f323586x;

    /* renamed from: y */
    public C108091j f323587y;

    /* renamed from: z */
    public Size f323588z;

    /* renamed from: h43.b$a */
    public static final class C108062a extends C87413o implements C32226l<C110194c, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C108061b f323589d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C108062a(C108061b bVar) {
            super(1);
            this.f323589d = bVar;
        }

        public Object invoke(Object obj) {
            C110194c cVar = (C110194c) obj;
            if (cVar != null) {
                C108109r0 r0Var = this.f323589d.f323617j;
                if (r0Var != null) {
                    r0Var.mo158469C(!cVar.f329653f);
                }
                C108061b bVar = this.f323589d;
                bVar.getClass();
                bVar.mo158464d(new C108085g(bVar, cVar));
                this.f323589d.mo158485h(cVar);
            }
            return C13598b0.f38549a;
        }
    }

    /* renamed from: h43.b$b */
    public static final class C108063b extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C108061b f323590d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C108063b(C108061b bVar) {
            super(0);
            this.f323590d = bVar;
        }

        public Object invoke() {
            EGLSurface eGLSurface;
            C108091j jVar;
            C111130b a;
            Log.m105924i("MicroMsg.EncodeWindowSurfaceRenderer", "createEGLContext create surface");
            C108061b bVar = this.f323590d;
            if (bVar.f323584v) {
                C111742d.C111743a aVar = C111742d.f334647a;
                EGLContext eGLContext = bVar.f323786t;
                C87412m.m108591d(eGLContext);
                bVar.f323616i = aVar.mo163466j((Surface) null, (SurfaceTexture) null, 1, 1, eGLContext);
                C111742d.C65942b bVar2 = this.f323590d.f323616i;
                if (!(bVar2 == null || (a = C109247e.vx0().mo163047a(2)) == null)) {
                    a.f332737d = bVar2;
                }
            } else {
                C111130b a2 = C109247e.vx0().mo163047a(0);
                bVar.f323616i = a2 != null ? a2.f332737d : null;
            }
            this.f323590d.f323615h = new C108091j(0, 0, 1, 1);
            C108061b bVar3 = this.f323590d;
            C111742d.C65942b bVar4 = bVar3.f323616i;
            if (!(bVar4 == null || (eGLSurface = bVar4.f189592b) == null || (jVar = bVar3.f323615h) == null)) {
                jVar.f323686c = eGLSurface;
            }
            C108061b bVar5 = this.f323590d;
            bVar3.f323617j = new C108068c0(bVar5.f323619l, bVar5.f323620m, 0, 0, 0, 1, true, 28, (C8480h) null);
            if (!C112595h.f337170e) {
                C108061b bVar6 = this.f323590d;
                C108109r0 r0Var = bVar6.f323617j;
                if (r0Var != null) {
                    r0Var.f332763r = new C108067c(bVar6);
                }
            } else {
                C108061b bVar7 = this.f323590d;
                C108061b bVar8 = this.f323590d;
                C108061b.m146365m(bVar7, new Size(bVar8.f323619l, bVar8.f323620m));
            }
            C108061b bVar9 = this.f323590d;
            C108061b bVar10 = this.f323590d;
            bVar9.f323588z = new Size(bVar10.f323619l, bVar10.f323620m);
            return C13598b0.f38549a;
        }
    }

    /* renamed from: h43.b$c */
    public static final class C108064c extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C108061b f323591d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C108064c(C108061b bVar) {
            super(0);
            this.f323591d = bVar;
        }

        /* JADX WARNING: Removed duplicated region for block: B:105:0x0170  */
        /* JADX WARNING: Removed duplicated region for block: B:38:0x006c  */
        /* JADX WARNING: Removed duplicated region for block: B:39:0x006e  */
        /* JADX WARNING: Removed duplicated region for block: B:44:0x0076  */
        /* JADX WARNING: Removed duplicated region for block: B:45:0x0078  */
        /* JADX WARNING: Removed duplicated region for block: B:48:0x007c  */
        /* JADX WARNING: Removed duplicated region for block: B:88:0x0127  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public java.lang.Object invoke() {
            /*
                r9 = this;
                h43.b r0 = r9.f323591d
                h43.r0 r1 = r0.f323617j
                r2 = 1
                r3 = 0
                if (r1 == 0) goto L_0x000e
                int r4 = r1.f332758m
                if (r4 != 0) goto L_0x000e
                r4 = 1
                goto L_0x000f
            L_0x000e:
                r4 = 0
            L_0x000f:
                if (r4 != 0) goto L_0x0034
                if (r1 == 0) goto L_0x001b
                int r1 = r1.f332758m
                r4 = 180(0xb4, float:2.52E-43)
                if (r1 != r4) goto L_0x001b
                r1 = 1
                goto L_0x001c
            L_0x001b:
                r1 = 0
            L_0x001c:
                if (r1 == 0) goto L_0x001f
                goto L_0x0034
            L_0x001f:
                android.util.Size r0 = r0.f323588z
                if (r0 == 0) goto L_0x0028
                int r0 = r0.getWidth()
                goto L_0x0029
            L_0x0028:
                r0 = 0
            L_0x0029:
                h43.b r1 = r9.f323591d
                android.util.Size r1 = r1.f323588z
                if (r1 == 0) goto L_0x0049
                int r1 = r1.getHeight()
                goto L_0x004a
            L_0x0034:
                android.util.Size r0 = r0.f323588z
                if (r0 == 0) goto L_0x003d
                int r0 = r0.getHeight()
                goto L_0x003e
            L_0x003d:
                r0 = 0
            L_0x003e:
                h43.b r1 = r9.f323591d
                android.util.Size r1 = r1.f323588z
                if (r1 == 0) goto L_0x0049
                int r1 = r1.getWidth()
                goto L_0x004a
            L_0x0049:
                r1 = 0
            L_0x004a:
                h43.b r4 = r9.f323591d
                w80.d$b r4 = r4.f323616i
                if (r4 != 0) goto L_0x0052
                goto L_0x01b4
            L_0x0052:
                android.opengl.EGLDisplay r5 = r4.f189591a
                android.opengl.EGLDisplay r6 = android.opengl.EGL14.EGL_NO_DISPLAY
                boolean r5 = gy3.C87412m.m108589b(r5, r6)
                if (r5 == 0) goto L_0x005e
                goto L_0x01b4
            L_0x005e:
                z33.h r5 = z33.C112595h.f337166a
                int r5 = z33.C112593f.f337158c
                if (r5 == 0) goto L_0x006e
                int r5 = z33.C112593f.f337157b
                if (r5 == 0) goto L_0x006e
                boolean r5 = z33.C112593f.f337160e
                if (r5 == 0) goto L_0x006e
                r5 = 1
                goto L_0x006f
            L_0x006e:
                r5 = 0
            L_0x006f:
                r6 = 2
                if (r5 == 0) goto L_0x0078
                int r5 = z33.C112593f.f337159d
                if (r5 != r6) goto L_0x0078
                r5 = 1
                goto L_0x0079
            L_0x0078:
                r5 = 0
            L_0x0079:
                r7 = 0
                if (r5 != 0) goto L_0x0127
                boolean r3 = z33.C112595h.f337170e
                if (r3 == 0) goto L_0x00d2
                h43.b r3 = r9.f323591d
                h43.r0 r5 = r3.f323617j
                if (r5 == 0) goto L_0x0088
                r5.f332751f = r2
            L_0x0088:
                android.util.Size r5 = new android.util.Size
                r5.<init>(r0, r1)
                h43.C108061b.m146365m(r3, r5)
                h43.b r3 = r9.f323591d
                h43.j r3 = r3.f323587y
                if (r3 == 0) goto L_0x01b4
                android.opengl.EGLSurface r5 = r3.mo158508a()
                android.opengl.EGLSurface r6 = android.opengl.EGL14.EGL_NO_SURFACE
                boolean r5 = gy3.C87412m.m108589b(r5, r6)
                r2 = r2 ^ r5
                if (r2 == 0) goto L_0x00a4
                r7 = r3
            L_0x00a4:
                if (r7 == 0) goto L_0x01b4
                h43.b r2 = r9.f323591d
                h43.r0 r3 = r2.f323617j
                if (r3 == 0) goto L_0x00af
                r3.mo158522s(r0, r1)
            L_0x00af:
                android.opengl.EGLDisplay r0 = r4.f189591a
                android.opengl.EGLSurface r1 = r7.mo158508a()
                android.opengl.EGLSurface r3 = r7.mo158508a()
                android.opengl.EGLContext r5 = r4.f189593c
                android.opengl.EGL14.eglMakeCurrent(r0, r1, r3, r5)
                h43.r0 r0 = r2.f323617j
                if (r0 == 0) goto L_0x00c5
                r0.mo162879m()
            L_0x00c5:
                w80.d$a r0 = w80.C111742d.f334647a
                android.opengl.EGLDisplay r1 = r4.f189591a
                android.opengl.EGLSurface r2 = r7.mo158508a()
                r0.mo163474t(r1, r2)
                goto L_0x01b4
            L_0x00d2:
                h43.b r3 = r9.f323591d
                h43.r0 r5 = r3.f323617j
                if (r5 == 0) goto L_0x00da
                r5.f332751f = r2
            L_0x00da:
                h43.j r3 = r3.f323615h
                if (r3 == 0) goto L_0x01b4
                android.opengl.EGLSurface r5 = r3.mo158508a()
                android.opengl.EGLSurface r6 = android.opengl.EGL14.EGL_NO_SURFACE
                boolean r5 = gy3.C87412m.m108589b(r5, r6)
                r5 = r5 ^ r2
                if (r5 == 0) goto L_0x00ec
                r7 = r3
            L_0x00ec:
                if (r7 == 0) goto L_0x01b4
                h43.b r3 = r9.f323591d
                h43.r0 r5 = r3.f323617j
                if (r5 == 0) goto L_0x00f7
                r5.mo158522s(r0, r1)
            L_0x00f7:
                h43.r0 r5 = r3.f323617j
                if (r5 == 0) goto L_0x00fe
                r5.mo162881r(r0, r1)
            L_0x00fe:
                h43.r0 r0 = r3.f323617j
                if (r0 == 0) goto L_0x0104
                r0.f332766u = r2
            L_0x0104:
                android.opengl.EGLDisplay r0 = r4.f189591a
                android.opengl.EGLSurface r1 = r7.mo158508a()
                android.opengl.EGLSurface r2 = r7.mo158508a()
                android.opengl.EGLContext r5 = r4.f189593c
                android.opengl.EGL14.eglMakeCurrent(r0, r1, r2, r5)
                h43.r0 r0 = r3.f323617j
                if (r0 == 0) goto L_0x011a
                r0.mo162879m()
            L_0x011a:
                w80.d$a r0 = w80.C111742d.f334647a
                android.opengl.EGLDisplay r1 = r4.f189591a
                android.opengl.EGLSurface r2 = r7.mo158508a()
                r0.mo163474t(r1, r2)
                goto L_0x01b4
            L_0x0127:
                h43.b r0 = r9.f323591d
                h43.j r0 = r0.f323614g
                if (r0 == 0) goto L_0x01b4
                android.opengl.EGLSurface r1 = r0.mo158508a()
                android.opengl.EGLSurface r5 = android.opengl.EGL14.EGL_NO_SURFACE
                boolean r1 = gy3.C87412m.m108589b(r1, r5)
                if (r1 != 0) goto L_0x0171
                com.tencent.mm.plugin.voip.model.h0 r1 = l33.C109247e.xx0()
                com.tencent.mm.plugin.voip.model.m0 r1 = r1.f317332a
                if (r1 == 0) goto L_0x016d
                com.tencent.mm.plugin.voip.model.r r1 = r1.f317396a
                if (r1 != 0) goto L_0x0146
                goto L_0x016d
            L_0x0146:
                com.tencent.mm.plugin.voip.model.y r1 = r1.f317450A
                if (r1 != 0) goto L_0x014b
                goto L_0x016d
            L_0x014b:
                com.tencent.mm.plugin.voip.model.r r5 = r1.f317711d
                com.tencent.mm.plugin.voip.model.v2protocal r5 = r5.f317500x
                com.tencent.mm.plugin.voip.model.f r5 = r5.f317583L1
                if (r5 != 0) goto L_0x0154
                goto L_0x016d
            L_0x0154:
                com.tencent.mm.plugin.voip.model.r r1 = r1.f317711d
                com.tencent.mm.plugin.voip.model.v2protocal r1 = r1.f317500x
                com.tencent.mm.plugin.voip.model.f r1 = r1.f317583L1
                r1.mo152562b()
                com.tencent.mm.plugin.voip.model.f$b r1 = r1.f317251C
                byte r1 = r1.f317294l
                if (r1 != r2) goto L_0x016d
                java.lang.String r1 = "MicroMsg.AvcEncoder"
                java.lang.String r5 = "weiranli: skip surfaceRenderEncode frame"
                com.tencent.p014mm.sdk.platformtools.Log.m105918d(r1, r5)
                r1 = 1
                goto L_0x016e
            L_0x016d:
                r1 = 0
            L_0x016e:
                if (r1 != 0) goto L_0x0171
                r3 = 1
            L_0x0171:
                if (r3 == 0) goto L_0x0174
                goto L_0x0175
            L_0x0174:
                r0 = r7
            L_0x0175:
                if (r0 == 0) goto L_0x01b4
                h43.b r1 = r9.f323591d
                h43.r0 r3 = r1.f323617j
                if (r3 == 0) goto L_0x017f
                r3.f332751f = r6
            L_0x017f:
                if (r3 == 0) goto L_0x018a
                h43.j$a r5 = r0.f323687d
                int r6 = r5.f323691b
                int r5 = r5.f323690a
                r3.mo158522s(r6, r5)
            L_0x018a:
                android.opengl.EGLDisplay r3 = r4.f189591a
                android.opengl.EGLSurface r5 = r0.mo158508a()
                android.opengl.EGLSurface r6 = r0.mo158508a()
                android.opengl.EGLContext r8 = r4.f189593c
                android.opengl.EGL14.eglMakeCurrent(r3, r5, r6, r8)
                h43.r0 r3 = r1.f323617j
                if (r3 == 0) goto L_0x01a0
                r3.mo162879m()
            L_0x01a0:
                w80.d$a r3 = w80.C111742d.f334647a
                android.opengl.EGLDisplay r4 = r4.f189591a
                android.opengl.EGLSurface r5 = r0.mo158508a()
                r3.mo163474t(r4, r5)
                h43.j$a r0 = r0.f323687d
                int r3 = r0.f323691b
                int r0 = r0.f323690a
                h43.C108061b.m146366n(r1, r7, r3, r0, r2)
            L_0x01b4:
                rx3.b0 r0 = rx3.C13598b0.f38549a
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: h43.C108061b.C108064c.invoke():java.lang.Object");
        }
    }

    public C108061b() {
        super(true);
    }

    /* renamed from: m */
    public static final void m146365m(C108061b bVar, Size size) {
        boolean z;
        Object obj;
        bVar.getClass();
        if (C112595h.f337170e && size.getWidth() > 1 && size.getHeight() > 1) {
            ImageReader imageReader = bVar.f323585w;
            if (imageReader != null) {
                if (imageReader.getWidth() == size.getWidth()) {
                    return;
                }
            }
            ImageReader imageReader2 = bVar.f323585w;
            if (imageReader2 != null) {
                imageReader2.close();
            }
            ImageReader newInstance = ImageReader.newInstance(size.getWidth(), size.getHeight(), 1, 1);
            if (newInstance != null) {
                bVar.f323585w = newInstance;
                Surface surface = newInstance.getSurface();
                C87412m.m108593f(surface, "mImageReaderWrapper!!.surface");
                bVar.f323587y = new C108091j(surface, size.getWidth(), size.getHeight());
                C111130b a = bVar.f323584v ? C109247e.vx0().mo163047a(2) : C109247e.vx0().mo163047a(0);
                C108091j jVar = bVar.f323587y;
                C87412m.m108591d(jVar);
                C111742d.C65942b bVar2 = a != null ? a.f332737d : null;
                Log.m105924i("MicroMsg.RenderTools", "createSurface:" + jVar);
                if (jVar.mo158509b()) {
                    synchronized (jVar.f323689f) {
                        z = jVar.f323688e;
                    }
                    if (!(z || (obj = jVar.f323685b) == null || bVar2 == null)) {
                        Log.m105924i("MicroMsg.RenderTools", "start createEGLSurface:" + obj.hashCode());
                        jVar.f323686c = C111742d.f334647a.mo163465h(bVar2.f189591a, obj);
                        jVar.mo158510c(false);
                        Log.m105924i("MicroMsg.RenderTools", "createSurface finished:" + obj.hashCode() + ", " + jVar.mo158508a().hashCode());
                    }
                }
                ImageReader imageReader3 = bVar.f323585w;
                if (imageReader3 != null) {
                    imageReader3.setOnImageAvailableListener(new C108069d(bVar), (Handler) null);
                }
            }
        }
    }

    /* renamed from: n */
    public static final void m146366n(C108061b bVar, ByteBuffer byteBuffer, int i, int i2, boolean z) {
        int i3;
        bVar.getClass();
        if (z) {
            i3 = C109247e.xx0().mo152613k((ByteBuffer) null, 0, 0, i, i2, 1, true);
        } else if (byteBuffer == null) {
            Log.m105920e("MicroMsg.EncodeWindowSurfaceRenderer", "send data is null and should not allowed to send");
            return;
        } else {
            i3 = C109247e.xx0().mo152613k(byteBuffer, byteBuffer.capacity(), 4, i, i2, 0, false);
        }
        C32228q<? super Size, ? super Integer, ? super Integer, C13598b0> qVar = bVar.f323624q;
        if (qVar != null) {
            C13598b0 invoke = qVar.invoke(null, 2, Integer.valueOf(i3));
        }
    }

    /* renamed from: b */
    public void mo158463b(C32226l<? super C108073f, C13598b0> lVar, C108115u uVar, boolean z) {
        if (uVar != null) {
            C111742d.C65942b bVar = uVar.f323740c;
            EGLContext eGLContext = bVar != null ? bVar.f189593c : null;
            if (eGLContext != null) {
                this.f323786t = eGLContext;
                mo158468l(true);
            }
            C108062a aVar = new C108062a(this);
            if (!uVar.f323750m.contains(aVar)) {
                uVar.f323750m.add(aVar);
            }
            int i = uVar.f323738a;
            this.f323619l = i;
            int i2 = uVar.f323739b;
            this.f323620m = i2;
            C108109r0 r0Var = this.f323617j;
            if (r0Var != null) {
                r0Var.mo143263u(i, i2);
            }
            this.f323785s = lVar;
        }
    }

    /* renamed from: d */
    public void mo158464d(C32224a<C13598b0> aVar) {
        C87412m.m108594g(aVar, "callback");
        if (this.f323584v) {
            C111130b a = C109247e.vx0().mo163047a(2);
            if (a != null) {
                a.mo162869c(aVar);
                return;
            }
            return;
        }
        C111130b a2 = C109247e.vx0().mo163047a(0);
        if (a2 != null) {
            a2.mo162869c(aVar);
        }
    }

    /* renamed from: e */
    public void mo158465e() {
        super.mo158465e();
        MMHandler mMHandler = this.f323586x;
        if (mMHandler != null) {
            mMHandler.removeCallbacksAndMessages((Object) null);
        }
        this.f323586x = null;
        ImageReader imageReader = this.f323585w;
        if (imageReader != null) {
            imageReader.close();
        }
    }

    /* renamed from: g */
    public void mo158466g() {
        mo158464d(new C108064c(this));
    }

    /* renamed from: k */
    public void mo158467k(Size size) {
        C87412m.m108594g(size, "renderSize");
        super.mo158467k(size);
        this.f323588z = size;
    }

    /* renamed from: l */
    public void mo158468l(boolean z) {
        boolean f = C112595h.m153920f();
        this.f323584v = f;
        if (!f) {
            MMHandler mMHandler = new MMHandler("encodeVoipHandler");
            this.f323586x = mMHandler;
            mMHandler.setLogging(false);
        }
        if (!this.f323784r) {
            Log.m105924i("MicroMsg.EncodeWindowSurfaceRenderer", "createEGLContext, isUseShareContext:" + z + ", shareGLContext:" + this.f323786t);
            if (this.f323786t != null) {
                mo158464d(new C108063b(this));
                this.f323784r = true;
            }
        }
    }
}

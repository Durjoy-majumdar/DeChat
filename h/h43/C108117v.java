package h43;

import android.graphics.SurfaceTexture;
import android.opengl.EGLContext;
import android.util.Size;
import android.view.Surface;
import com.tencent.p014mm.sdk.platformtools.Log;
import fy3.C32224a;
import fy3.C32226l;
import gy3.C8480h;
import gy3.C87412m;
import gy3.C87413o;
import l33.C109247e;
import p80.C110193b;
import p80.C110194c;
import rx3.C13598b0;
import t33.C110901b;
import u33.C111130b;
import w80.C111742d;

/* renamed from: h43.v */
public final class C108117v extends C108073f {

    /* renamed from: u */
    public static final C108118a f323756u = new C108118a((C8480h) null);

    /* renamed from: r */
    public boolean f323757r;

    /* renamed from: s */
    public C32226l<? super C108073f, C13598b0> f323758s;

    /* renamed from: t */
    public C110901b f323759t;

    /* renamed from: h43.v$a */
    public static final class C108118a {
        public C108118a(C8480h hVar) {
        }
    }

    /* renamed from: h43.v$b */
    public static final class C108119b extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C108117v f323760d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C108119b(C108117v vVar) {
            super(0);
            this.f323760d = vVar;
        }

        public Object invoke() {
            C111130b a;
            this.f323760d.f323616i = C111742d.C111743a.m152352k(C111742d.f334647a, (Surface) null, (SurfaceTexture) null, 1, 1, (EGLContext) null, 16, (Object) null);
            C111742d.C65942b bVar = this.f323760d.f323616i;
            if (!(bVar == null || (a = C109247e.vx0().mo163047a(1)) == null)) {
                a.f332737d = bVar;
            }
            this.f323760d.f323617j = new C108072e0(0, 0, 0, 0, 1, 2, 8, (C8480h) null);
            this.f323760d.f323618k = C110193b.m149776b(false, 14);
            C108117v vVar = this.f323760d;
            C110194c cVar = vVar.f323618k;
            if (cVar != null) {
                vVar.mo158464d(new C108085g(vVar, cVar));
                vVar.f323621n = new SurfaceTexture(cVar.f329652e);
                vVar.f323622o = new Surface(vVar.f323621n);
                SurfaceTexture surfaceTexture = vVar.f323621n;
                if (surfaceTexture != null) {
                    surfaceTexture.setOnFrameAvailableListener(new C108122w(vVar, cVar));
                }
            }
            C108117v vVar2 = this.f323760d;
            C32226l<? super C108073f, C13598b0> lVar = vVar2.f323758s;
            if (lVar != null) {
                lVar.invoke(vVar2);
            }
            return C13598b0.f38549a;
        }
    }

    /* renamed from: h43.v$c */
    public static final class C108120c extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C108117v f323761d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C108120c(C108117v vVar) {
            super(0);
            this.f323761d = vVar;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:50:0x00de, code lost:
            if (r7 != 3) goto L_0x00e5;
         */
        /* JADX WARNING: Removed duplicated region for block: B:58:0x00ee  */
        /* JADX WARNING: Removed duplicated region for block: B:59:0x00f0  */
        /* JADX WARNING: Removed duplicated region for block: B:63:0x00fb  */
        /* JADX WARNING: Removed duplicated region for block: B:64:0x00fd  */
        /* JADX WARNING: Removed duplicated region for block: B:67:0x010a  */
        /* JADX WARNING: Removed duplicated region for block: B:68:0x010d  */
        /* JADX WARNING: Removed duplicated region for block: B:72:0x0114  */
        /* JADX WARNING: Removed duplicated region for block: B:73:0x0116  */
        /* JADX WARNING: Removed duplicated region for block: B:75:0x0119  */
        /* JADX WARNING: Removed duplicated region for block: B:80:0x0124  */
        /* JADX WARNING: Removed duplicated region for block: B:81:0x0126  */
        /* JADX WARNING: Removed duplicated region for block: B:83:0x0129  */
        /* JADX WARNING: Removed duplicated region for block: B:85:0x012d  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public java.lang.Object invoke() {
            /*
                r9 = this;
                h43.v r0 = r9.f323761d
                boolean r1 = r0.f323608a
                if (r1 == 0) goto L_0x0009
                h43.j r0 = r0.f323612e
                goto L_0x000b
            L_0x0009:
                h43.j r0 = r0.f323613f
            L_0x000b:
                v33.b r1 = l33.C109247e.vx0()
                boolean r1 = r1.f333452l
                java.lang.String r2 = "MicroMsg.RemoteWindowSurfaceRenderer"
                r3 = 0
                r4 = 1
                r5 = 0
                if (r0 == 0) goto L_0x0196
                h43.v r6 = r9.f323761d
                boolean r6 = r6.f323610c
                if (r6 != 0) goto L_0x0025
                java.lang.String r0 = "pause rendering now"
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r0)
                goto L_0x01b5
            L_0x0025:
                android.opengl.EGLSurface r6 = r0.mo158508a()
                android.opengl.EGLSurface r7 = android.opengl.EGL14.EGL_NO_SURFACE
                boolean r6 = gy3.C87412m.m108589b(r6, r7)
                if (r6 == 0) goto L_0x0047
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r3 = "render error egl surface:"
                r1.append(r3)
                r1.append(r0)
                java.lang.String r0 = r1.toString()
                com.tencent.p014mm.sdk.platformtools.Log.m105920e(r2, r0)
                goto L_0x01b5
            L_0x0047:
                boolean r2 = z33.C112595h.f337167b
                if (r2 == 0) goto L_0x004f
                if (r1 == 0) goto L_0x004f
                r1 = 1
                goto L_0x0050
            L_0x004f:
                r1 = 0
            L_0x0050:
                if (r1 == 0) goto L_0x00a1
                h43.v r1 = r9.f323761d
                h43.r0 r1 = r1.f323617j
                if (r1 == 0) goto L_0x01b5
                android.util.Size r1 = r1.mo158476x()
                if (r1 != 0) goto L_0x0060
                goto L_0x01b5
            L_0x0060:
                h43.v r2 = r9.f323761d
                h43.r0 r2 = r2.f323617j
                if (r2 == 0) goto L_0x0071
                int r6 = r1.getHeight()
                int r7 = r1.getWidth()
                r2.mo158522s(r6, r7)
            L_0x0071:
                h43.v r2 = r9.f323761d
                fy3.q<? super android.util.Size, ? super java.lang.Integer, ? super java.lang.Integer, rx3.b0> r2 = r2.f323624q
                if (r2 == 0) goto L_0x0097
                android.util.Size r6 = new android.util.Size
                int r7 = r1.getHeight()
                int r1 = r1.getWidth()
                r6.<init>(r7, r1)
                h43.v r1 = r9.f323761d
                boolean r1 = r1.f323608a
                r1 = r1 ^ r4
                java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
                java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
                java.lang.Object r1 = r2.invoke(r6, r1, r5)
                rx3.b0 r1 = (rx3.C13598b0) r1
            L_0x0097:
                h43.v r1 = r9.f323761d
                h43.r0 r1 = r1.f323617j
                if (r1 == 0) goto L_0x015c
                r1.f332751f = r4
                goto L_0x015c
            L_0x00a1:
                h43.v r1 = r9.f323761d
                boolean r1 = r1.f323608a
                r2 = 2
                if (r1 != 0) goto L_0x0130
                boolean r1 = z33.C112595h.f337172g
                if (r1 == 0) goto L_0x00b2
                boolean r1 = z33.C112595h.f337174i
                if (r1 == 0) goto L_0x00b2
                r1 = 1
                goto L_0x00b3
            L_0x00b2:
                r1 = 0
            L_0x00b3:
                if (r1 == 0) goto L_0x0130
                v33.b r1 = l33.C109247e.vx0()
                boolean r6 = r1.mo163050d()
                if (r6 == 0) goto L_0x00c6
                boolean r6 = z33.C112595h.f337172g
                if (r6 == 0) goto L_0x00c6
                int r1 = r1.f333448h
                goto L_0x00c7
            L_0x00c6:
                r1 = 1
            L_0x00c7:
                v33.b r6 = l33.C109247e.vx0()
                int r6 = r6.f333441a
                int r6 = r6 / 90
                android.content.Context r7 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
                int r7 = com.tencent.p014mm.p136ui.C75044y4.m89998j(r7)
                r8 = 3
                if (r7 == 0) goto L_0x00e5
                if (r7 == r4) goto L_0x00e3
                if (r7 == r2) goto L_0x00e1
                if (r7 == r8) goto L_0x00e6
                goto L_0x00e5
            L_0x00e1:
                r8 = 2
                goto L_0x00e6
            L_0x00e3:
                r8 = 1
                goto L_0x00e6
            L_0x00e5:
                r8 = 0
            L_0x00e6:
                boolean r7 = z33.C112595h.f337172g
                if (r7 == 0) goto L_0x00f0
                boolean r7 = z33.C112595h.f337173h
                if (r7 == 0) goto L_0x00f0
                r7 = 1
                goto L_0x00f1
            L_0x00f0:
                r7 = 0
            L_0x00f1:
                if (r7 == 0) goto L_0x00fd
                v33.b r7 = l33.C109247e.vx0()
                boolean r7 = r7.f333446f
                if (r7 == 0) goto L_0x00fd
                r6 = 0
                goto L_0x00fe
            L_0x00fd:
                int r6 = r6 + r8
            L_0x00fe:
                int r1 = r1 - r4
                int r1 = r1 + r6
                int r1 = r1 % 4
                int r1 = r1 * 90
                h43.v r6 = r9.f323761d
                h43.r0 r6 = r6.f323617j
                if (r6 == 0) goto L_0x010d
                int r7 = r6.f332758m
                goto L_0x010e
            L_0x010d:
                r7 = 0
            L_0x010e:
                if (r6 == 0) goto L_0x0116
                int r8 = r6.f332750e
                if (r8 != r2) goto L_0x0116
                r8 = 1
                goto L_0x0117
            L_0x0116:
                r8 = 0
            L_0x0117:
                if (r8 != 0) goto L_0x011b
                int r1 = 360 - r1
            L_0x011b:
                int r7 = r7 + r1
                int r7 = r7 % 360
                if (r6 == 0) goto L_0x0126
                int r1 = r6.f332750e
                if (r1 != r2) goto L_0x0126
                r1 = 1
                goto L_0x0127
            L_0x0126:
                r1 = 0
            L_0x0127:
                if (r1 == 0) goto L_0x012b
                int r7 = r7 + -180
            L_0x012b:
                if (r6 == 0) goto L_0x0130
                r6.mo143262q(r7)
            L_0x0130:
                h43.v r1 = r9.f323761d
                h43.r0 r1 = r1.f323617j
                if (r1 == 0) goto L_0x013f
                h43.j$a r6 = r0.f323687d
                int r7 = r6.f323690a
                int r6 = r6.f323691b
                r1.mo158522s(r7, r6)
            L_0x013f:
                h43.v r1 = r9.f323761d
                h43.r0 r6 = r1.f323617j
                if (r6 == 0) goto L_0x0147
                r6.f332751f = r2
            L_0x0147:
                fy3.q<? super android.util.Size, ? super java.lang.Integer, ? super java.lang.Integer, rx3.b0> r2 = r1.f323624q
                if (r2 == 0) goto L_0x015c
                boolean r1 = r1.f323608a
                r1 = r1 ^ r4
                java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
                java.lang.Integer r4 = java.lang.Integer.valueOf(r5)
                java.lang.Object r1 = r2.invoke(r3, r1, r4)
                rx3.b0 r1 = (rx3.C13598b0) r1
            L_0x015c:
                h43.v r1 = r9.f323761d
                w80.d$b r1 = r1.f323616i
                if (r1 == 0) goto L_0x0165
                android.opengl.EGLDisplay r1 = r1.f189591a
                goto L_0x0166
            L_0x0165:
                r1 = r3
            L_0x0166:
                android.opengl.EGLSurface r2 = r0.mo158508a()
                android.opengl.EGLSurface r4 = r0.mo158508a()
                h43.v r5 = r9.f323761d
                w80.d$b r5 = r5.f323616i
                if (r5 == 0) goto L_0x0177
                android.opengl.EGLContext r5 = r5.f189593c
                goto L_0x0178
            L_0x0177:
                r5 = r3
            L_0x0178:
                android.opengl.EGL14.eglMakeCurrent(r1, r2, r4, r5)
                h43.v r1 = r9.f323761d
                h43.r0 r1 = r1.f323617j
                if (r1 == 0) goto L_0x0184
                r1.mo162879m()
            L_0x0184:
                w80.d$a r1 = w80.C111742d.f334647a
                h43.v r2 = r9.f323761d
                w80.d$b r2 = r2.f323616i
                if (r2 == 0) goto L_0x018e
                android.opengl.EGLDisplay r3 = r2.f189591a
            L_0x018e:
                android.opengl.EGLSurface r0 = r0.mo158508a()
                r1.mo163474t(r3, r0)
                goto L_0x01b5
            L_0x0196:
                if (r1 != 0) goto L_0x01b0
                h43.v r0 = r9.f323761d
                fy3.q<? super android.util.Size, ? super java.lang.Integer, ? super java.lang.Integer, rx3.b0> r1 = r0.f323624q
                if (r1 == 0) goto L_0x01b5
                boolean r0 = r0.f323608a
                r0 = r0 ^ r4
                java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
                java.lang.Integer r2 = java.lang.Integer.valueOf(r5)
                java.lang.Object r0 = r1.invoke(r3, r0, r2)
                rx3.b0 r0 = (rx3.C13598b0) r0
                goto L_0x01b5
            L_0x01b0:
                java.lang.String r0 = "error on render surface null"
                com.tencent.p014mm.sdk.platformtools.Log.m105920e(r2, r0)
            L_0x01b5:
                rx3.b0 r0 = rx3.C13598b0.f38549a
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: h43.C108117v.C108120c.invoke():java.lang.Object");
        }
    }

    public C108117v() {
        super(false, f323756u.hashCode());
    }

    /* renamed from: b */
    public void mo158463b(C32226l<? super C108073f, C13598b0> lVar, C108115u uVar, boolean z) {
        this.f323758s = lVar;
        mo158526l(false);
    }

    /* renamed from: d */
    public void mo158464d(C32224a<C13598b0> aVar) {
        C87412m.m108594g(aVar, "callback");
        C111130b a = C109247e.vx0().mo163047a(1);
        if (a != null) {
            a.mo162869c(aVar);
        }
    }

    /* renamed from: g */
    public void mo158466g() {
        mo158464d(new C108120c(this));
    }

    /* renamed from: k */
    public void mo158467k(Size size) {
        C87412m.m108594g(size, "renderSize");
        super.mo158467k(size);
        C108109r0 r0Var = this.f323617j;
        if (r0Var != null) {
            r0Var.mo143263u(size.getWidth(), size.getHeight());
        }
        C109247e.vx0().f333457q = size;
    }

    /* renamed from: l */
    public void mo158526l(boolean z) {
        if (!this.f323757r) {
            Log.printInfoStack("MicroMsg.RemoteWindowSurfaceRenderer", "createEGLContext", new Object[0]);
            mo158464d(new C108119b(this));
            this.f323757r = true;
            this.f323759t = new C110901b();
        }
    }
}

package vp3;

import android.graphics.Bitmap;
import android.graphics.SurfaceTexture;
import android.opengl.GLES20;
import android.opengl.GLUtils;
import com.google.android.gms.gcm.Task;
import com.tencent.tav.decoder.RenderContext;
import fy3.C32224a;
import gy3.C8480h;
import gy3.C87412m;
import gy3.C87413o;
import rx3.C13598b0;
import yp3.C112478a;
import yp3.C91542c;

/* renamed from: vp3.c */
public final class C111580c extends C111592h {

    /* renamed from: A */
    public C111581a f334010A;

    /* renamed from: t */
    public final String f334011t = ("EffectRenderController@" + hashCode());

    /* renamed from: u */
    public C111582b f334012u = new C111582b(0, false, 0, 0, 0, 31, (C8480h) null);

    /* renamed from: v */
    public SurfaceTexture f334013v;

    /* renamed from: w */
    public volatile boolean f334014w;

    /* renamed from: x */
    public long f334015x;

    /* renamed from: y */
    public int f334016y = 1;

    /* renamed from: z */
    public boolean f334017z;

    /* renamed from: vp3.c$a */
    public interface C111581a {
        /* renamed from: a */
        void mo81095a(SurfaceTexture surfaceTexture);

        /* renamed from: b */
        void mo81096b(SurfaceTexture surfaceTexture, int i, int i2);

        /* renamed from: c */
        void mo81097c(SurfaceTexture surfaceTexture);
    }

    /* renamed from: vp3.c$b */
    public static final class C111582b {

        /* renamed from: a */
        public int f334018a;

        /* renamed from: b */
        public boolean f334019b;

        /* renamed from: c */
        public int f334020c;

        /* renamed from: d */
        public int f334021d;

        /* renamed from: e */
        public int f334022e;

        public C111582b() {
            this(0, false, 0, 0, 0, 31, (C8480h) null);
        }

        public C111582b(int i, boolean z, int i2, int i3, int i4, int i5, C8480h hVar) {
            i = (i5 & 1) != 0 ? 0 : i;
            z = (i5 & 2) != 0 ? false : z;
            i2 = (i5 & 4) != 0 ? 0 : i2;
            i3 = (i5 & 8) != 0 ? 0 : i3;
            i4 = (i5 & 16) != 0 ? 0 : i4;
            this.f334018a = i;
            this.f334019b = z;
            this.f334020c = i2;
            this.f334021d = i3;
            this.f334022e = i4;
        }

        public boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof C111582b) {
                    C111582b bVar = (C111582b) obj;
                    if (this.f334018a == bVar.f334018a) {
                        if (this.f334019b == bVar.f334019b) {
                            if (this.f334020c == bVar.f334020c) {
                                if (this.f334021d == bVar.f334021d) {
                                    if (this.f334022e == bVar.f334022e) {
                                        return true;
                                    }
                                }
                            }
                        }
                    }
                }
                return false;
            }
            return true;
        }

        public int hashCode() {
            int i = this.f334018a * 31;
            boolean z = this.f334019b;
            if (z) {
                z = true;
            }
            return ((((((i + (z ? 1 : 0)) * 31) + this.f334020c) * 31) + this.f334021d) * 31) + this.f334022e;
        }

        public String toString() {
            return "ExternInputTextureInfo(textureId=" + this.f334018a + ", isOES=" + this.f334019b + ", width=" + this.f334020c + ", height=" + this.f334021d + ", rotate=" + this.f334022e + ")";
        }
    }

    /* renamed from: vp3.c$c */
    public static final class C111583c extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C111580c f334023d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C111583c(C111580c cVar) {
            super(0);
            this.f334023d = cVar;
        }

        public Object invoke() {
            C111580c cVar = this.f334023d;
            if (cVar.f334012u.f334018a > 0) {
                String str = cVar.f334011t;
                C112478a.m153625c(str, "destroy extern input textureId:" + this.f334023d.f334012u.f334018a, new Object[0]);
                GLES20.glDeleteTextures(1, new int[]{this.f334023d.f334012u.f334018a}, 0);
            }
            return C13598b0.f38549a;
        }
    }

    /* renamed from: vp3.c$d */
    public static final class C111584d extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C111580c f334024d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C111584d(C111580c cVar) {
            super(0);
            this.f334024d = cVar;
        }

        public Object invoke() {
            C111580c cVar = this.f334024d;
            C111581a aVar = cVar.f334010A;
            if (aVar != null) {
                aVar.mo81095a(cVar.f334013v);
            }
            return C13598b0.f38549a;
        }
    }

    /* renamed from: vp3.c$e */
    public static final class C111585e extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C111580c f334025d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C111585e(C111580c cVar) {
            super(0);
            this.f334025d = cVar;
        }

        public Object invoke() {
            if (this.f334025d.f334014w) {
                C111580c.m152106j(this.f334025d);
            }
            return C13598b0.f38549a;
        }
    }

    /* renamed from: vp3.c$f */
    public static final class C111586f extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C111580c f334026d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C111586f(C111580c cVar) {
            super(0);
            this.f334026d = cVar;
        }

        public Object invoke() {
            C111580c cVar = this.f334026d;
            C111581a aVar = cVar.f334010A;
            if (aVar != null) {
                aVar.mo81097c(cVar.f334013v);
            }
            return C13598b0.f38549a;
        }
    }

    /* renamed from: vp3.c$g */
    public static final class C111587g extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C111580c f334027d;

        /* renamed from: e */
        public final /* synthetic */ Bitmap f334028e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C111587g(C111580c cVar, Bitmap bitmap) {
            super(0);
            this.f334027d = cVar;
            this.f334028e = bitmap;
        }

        public Object invoke() {
            int i = this.f334027d.f334012u.f334018a;
            if (i > 0) {
                GLES20.glDeleteTextures(1, new int[i], 0);
            }
            this.f334027d.f334012u.f334018a = RenderContext.createTexture(3553);
            String str = this.f334027d.f334011t;
            C112478a.m153625c(str, "create input textureId:" + this.f334027d.f334012u.f334018a, new Object[0]);
            C111582b bVar = this.f334027d.f334012u;
            bVar.f334019b = false;
            GLES20.glBindTexture(3553, bVar.f334018a);
            GLUtils.texImage2D(3553, 0, this.f334028e, 0);
            float f = (float) 9729;
            GLES20.glTexParameterf(3553, 10241, f);
            GLES20.glTexParameterf(3553, Task.EXTRAS_LIMIT_BYTES, f);
            float f2 = (float) 10497;
            GLES20.glTexParameterf(3553, 10242, f2);
            GLES20.glTexParameterf(3553, 10243, f2);
            GLES20.glBindTexture(3553, 0);
            this.f334027d.f334012u.f334020c = this.f334028e.getWidth();
            this.f334027d.f334012u.f334021d = this.f334028e.getHeight();
            this.f334027d.f334012u.f334022e = 0;
            return C13598b0.f38549a;
        }
    }

    /* renamed from: vp3.c$h */
    public static final class C111588h extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C111580c f334029d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C111588h(C111580c cVar) {
            super(0);
            this.f334029d = cVar;
        }

        public Object invoke() {
            C111580c.m152106j(this.f334029d);
            return C13598b0.f38549a;
        }
    }

    /* renamed from: j */
    public static final void m152106j(C111580c cVar) {
        int i;
        String str = cVar.f334011t;
        C112478a.m153625c(str, "createExternInputTexture, size:[" + cVar.f334012u.f334020c + ", " + cVar.f334012u.f334021d + ']', new Object[0]);
        int createTexture = RenderContext.createTexture(36197);
        C111582b bVar = cVar.f334012u;
        bVar.f334018a = createTexture;
        bVar.f334019b = true;
        cVar.f334017z = false;
        SurfaceTexture surfaceTexture = new SurfaceTexture(createTexture);
        surfaceTexture.setOnFrameAvailableListener(new C90859g(new C111589d(cVar)));
        C111582b bVar2 = cVar.f334012u;
        int i2 = bVar2.f334020c;
        if (i2 > 0 && (i = bVar2.f334021d) > 0) {
            try {
                surfaceTexture.setDefaultBufferSize(i2, i);
            } catch (Exception e) {
                String str2 = cVar.f334011t;
                C112478a.m153626d(str2, e, "setDefaultBufferSize error:" + e.getMessage(), new Object[0]);
            }
        }
        cVar.f334013v = surfaceTexture;
        C91542c.m114881b(new C111590e(cVar));
    }

    /* JADX WARNING: Removed duplicated region for block: B:20:0x0043  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0047  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x004c  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.util.List<qr3.C110469c> mo163258a(long r11) {
        /*
            r10 = this;
            vp3.c$b r11 = r10.f334012u
            int r1 = r11.f334018a
            r12 = 0
            if (r1 <= 0) goto L_0x0054
            int r2 = r11.f334020c
            if (r2 <= 0) goto L_0x0054
            int r3 = r11.f334021d
            if (r3 > 0) goto L_0x0010
            goto L_0x0054
        L_0x0010:
            int r0 = r11.f334022e
            r6 = 3
            r7 = 2
            r8 = 1
            if (r0 == 0) goto L_0x002a
            r4 = 90
            if (r0 == r4) goto L_0x0028
            r4 = 180(0xb4, float:2.52E-43)
            if (r0 == r4) goto L_0x0026
            r4 = 270(0x10e, float:3.78E-43)
            if (r0 == r4) goto L_0x0024
            goto L_0x002a
        L_0x0024:
            r5 = 3
            goto L_0x002b
        L_0x0026:
            r5 = 2
            goto L_0x002b
        L_0x0028:
            r5 = 1
            goto L_0x002b
        L_0x002a:
            r5 = 0
        L_0x002b:
            qr3.c r9 = new qr3.c
            boolean r4 = r11.f334019b
            r0 = r9
            r0.<init>(r1, r2, r3, r4, r5)
            com.tencent.mm.xeffect.LayoutInfo r11 = r9.f330360i
            int r0 = r10.f334034c
            int r0 = r0 / r7
            r11.f319976b = r0
            int r0 = r10.f334035d
            int r0 = r0 / r7
            r11.f319977c = r0
            int r0 = r10.f334016y
            if (r0 == r7) goto L_0x0047
            if (r0 == r6) goto L_0x0048
            r6 = 1
            goto L_0x0048
        L_0x0047:
            r6 = 4
        L_0x0048:
            r11.f319979e = r6
            if (r0 == r8) goto L_0x004d
            r12 = 1
        L_0x004d:
            r9.f330357f = r12
            java.util.List r11 = sx3.C26236u.m33719b(r9)
            return r11
        L_0x0054:
            java.lang.String r11 = r10.f334011t
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "error externInput id:"
            r0.append(r1)
            vp3.c$b r1 = r10.f334012u
            int r1 = r1.f334018a
            r0.append(r1)
            java.lang.String r1 = " width:"
            r0.append(r1)
            vp3.c$b r1 = r10.f334012u
            int r1 = r1.f334020c
            r0.append(r1)
            java.lang.String r1 = " height:"
            r0.append(r1)
            vp3.c$b r1 = r10.f334012u
            int r1 = r1.f334021d
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.Object[] r12 = new java.lang.Object[r12]
            yp3.C112478a.m153628f(r11, r0, r12)
            sx3.f0 r11 = sx3.C64186f0.f181907d
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: vp3.C111580c.mo163258a(long):java.util.List");
    }

    /* renamed from: b */
    public void mo163259b() {
        mo163269e(new C111583c(this));
        super.mo163259b();
        C91542c.m114881b(new C111584d(this));
    }

    /* renamed from: c */
    public String mo163260c() {
        return this.f334011t;
    }

    /* renamed from: d */
    public void mo163261d() {
        super.mo163261d();
        mo163269e(new C111585e(this));
    }

    /* renamed from: g */
    public void mo163262g(long j) {
        super.mo163262g(j);
        if (this.f334034c <= 0 || this.f334035d <= 0) {
            String str = this.f334011t;
            C112478a.m153628f(str, "render with size error " + this.f334034c + ", " + this.f334035d, new Object[0]);
            return;
        }
        C91542c.m114881b(new C111586f(this));
    }

    /* renamed from: k */
    public final void mo163263k(Bitmap bitmap) {
        C87412m.m108595h(bitmap, "bitmap");
        String str = this.f334011t;
        C112478a.m153625c(str, "setInputBitmap: " + bitmap + ", size:[" + bitmap.getWidth() + ',' + bitmap.getHeight() + ']', new Object[0]);
        if (this.f334012u.f334018a > 0) {
            C112478a.m153625c(this.f334011t, "already set a inputTexture, will override the old one", new Object[0]);
            SurfaceTexture surfaceTexture = this.f334013v;
            if (surfaceTexture != null) {
                surfaceTexture.setOnFrameAvailableListener((SurfaceTexture.OnFrameAvailableListener) null);
            }
        }
        this.f334015x = 0;
        mo163269e(new C111587g(this, bitmap));
    }

    /* renamed from: l */
    public final void mo163264l(int i, int i2, int i3) {
        String str = this.f334011t;
        C112478a.m153625c(str, "setInputContentInfo, size:[" + i + ',' + i2 + "], rotate:" + i3, new Object[0]);
        C111582b bVar = this.f334012u;
        bVar.f334020c = i;
        bVar.f334021d = i2;
        bVar.f334022e = i3;
        try {
            SurfaceTexture surfaceTexture = this.f334013v;
            if (surfaceTexture != null) {
                surfaceTexture.setDefaultBufferSize(i, i2);
            }
        } catch (Exception e) {
            String str2 = this.f334011t;
            C112478a.m153626d(str2, e, "setDefaultBufferSize error:" + e.getMessage(), new Object[0]);
        }
    }

    /* renamed from: m */
    public final void mo163265m(C111581a aVar) {
        this.f334010A = aVar;
        this.f334014w = true;
        if (this.f334041j && this.f334012u.f334018a <= 0) {
            mo163269e(new C111588h(this));
        }
    }
}

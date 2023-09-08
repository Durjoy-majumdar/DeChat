package j71;

import ac3.C103355g1;
import android.graphics.Rect;
import gy3.C8480h;
import gy3.C87412m;
import p80.C110193b;
import p80.C110194c;
import q00.C110264g;
import rh3.C101383g;
import s80.C110777a;
import u80.C111139a;
import u80.C111141c;

/* renamed from: j71.r */
public final class C108598r extends C110777a {

    /* renamed from: A */
    public int f325138A;

    /* renamed from: B */
    public final Rect f325139B;

    /* renamed from: t */
    public int f325140t;

    /* renamed from: u */
    public C111139a f325141u;

    /* renamed from: v */
    public C108597q f325142v;

    /* renamed from: w */
    public C103355g1 f325143w;

    /* renamed from: x */
    public C101383g f325144x;

    /* renamed from: y */
    public C110194c f325145y;

    /* renamed from: z */
    public int f325146z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C108598r(int i, int i2, C8480h hVar) {
        super(0, 0, 0, 0, 1, 2, 15, (C8480h) null);
        i = (i2 & 1) != 0 ? 0 : i;
        this.f325140t = i;
        this.f325139B = new Rect();
    }

    /* renamed from: f */
    public C111139a mo157952f() {
        this.f325145y = C110193b.m149776b(true, 8);
        C111139a aVar = this.f325141u;
        if (aVar != null) {
            aVar.mo158471l();
        }
        C111141c cVar = new C111141c(this.f331376a, this.f331377b, this.f325146z, this.f325138A, 2, 2);
        this.f325141u = cVar;
        cVar.f332759n = true;
        C108597q qVar = this.f325142v;
        if (qVar != null) {
            qVar.mo158471l();
        }
        C108597q qVar2 = new C108597q(this.f325146z, this.f325138A, this.f331378c, this.f331379d, 1, 0, 32, (C8480h) null);
        this.f325142v = qVar2;
        C110194c cVar2 = this.f325145y;
        C87412m.m108591d(cVar2);
        qVar2.f325133J = cVar2.f329652e;
        C103355g1 g1Var = this.f325143w;
        if (g1Var != null) {
            g1Var.destroy();
        }
        C103355g1 g1Var2 = new C103355g1(0, false, false, false, false, false, C110264g.C47730a.APP_ZPBQ, 61, (C8480h) null);
        this.f325143w = g1Var2;
        g1Var2.mo143229I(true);
        C103355g1 g1Var3 = this.f325143w;
        if (g1Var3 != null) {
            g1Var3.mo143233a(false);
        }
        C103355g1 g1Var4 = this.f325143w;
        if (g1Var4 != null) {
            g1Var4.mo143257x(this.f325144x);
        }
        C103355g1 g1Var5 = this.f325143w;
        if (g1Var5 != null) {
            g1Var5.mo143224C(this.f325146z, this.f325138A);
        }
        return cVar;
    }

    /* renamed from: n */
    public void mo157956n(boolean z) {
        super.mo157956n(z);
        C108597q qVar = this.f325142v;
        if (qVar != null) {
            qVar.mo158471l();
        }
        C103355g1 g1Var = this.f325143w;
        if (g1Var != null) {
            g1Var.destroy();
        }
        this.f325143w = null;
        C110194c cVar = this.f325145y;
        if (cVar != null) {
            cVar.close();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0007, code lost:
        r0 = r0.f332754i;
     */
    /* renamed from: p */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo157957p() {
        /*
            r12 = this;
            super.mo157957p()
            u80.a r0 = r12.f325141u
            if (r0 == 0) goto L_0x000e
            p80.c r0 = r0.f332754i
            if (r0 == 0) goto L_0x000e
            int r0 = r0.f329652e
            goto L_0x000f
        L_0x000e:
            r0 = -1
        L_0x000f:
            ac3.g1 r1 = r12.f325143w
            if (r1 == 0) goto L_0x001b
            r3 = 0
            r4 = 0
            r5 = 6
            r6 = 0
            r2 = r0
            q00.C110264g.C110265b.m149906a(r1, r2, r3, r4, r5, r6)
        L_0x001b:
            p80.c r1 = r12.f325145y
            gy3.C87412m.m108591d(r1)
            int r1 = r1.f329652e
            int r5 = r12.f325146z
            int r6 = r12.f325138A
            r11 = 3553(0xde1, float:4.979E-42)
            android.opengl.GLES20.glBindTexture(r11, r1)
            r2 = 3553(0xde1, float:4.979E-42)
            r3 = 0
            r4 = 6408(0x1908, float:8.98E-42)
            r7 = 0
            r8 = 6408(0x1908, float:8.98E-42)
            r9 = 5121(0x1401, float:7.176E-42)
            r10 = 0
            android.opengl.GLES20.glTexImage2D(r2, r3, r4, r5, r6, r7, r8, r9, r10)
            r1 = 0
            android.opengl.GLES20.glBindTexture(r11, r1)
            ac3.g1 r1 = r12.f325143w
            if (r1 == 0) goto L_0x0055
            p80.c r2 = r12.f325145y
            gy3.C87412m.m108591d(r2)
            int r3 = r2.f329652e
            r4 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            r10 = 124(0x7c, float:1.74E-43)
            r11 = 0
            r2 = r0
            q00.C110264g.C110265b.m149907b(r1, r2, r3, r4, r6, r7, r8, r9, r10, r11)
        L_0x0055:
            j71.q r0 = r12.f325142v
            if (r0 == 0) goto L_0x005c
            r0.mo162879m()
        L_0x005c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: j71.C108598r.mo157957p():void");
    }

    /* renamed from: t */
    public void mo159590t(int i, int i2) {
        super.mo159590t(i, i2);
        mo159594w();
        C111139a aVar = this.f325141u;
        if (aVar != null) {
            aVar.mo158522s(this.f325146z, this.f325138A);
        }
        C108597q qVar = this.f325142v;
        if (qVar != null) {
            qVar.mo143263u(this.f325146z, this.f325138A);
        }
        C108597q qVar2 = this.f325142v;
        if (qVar2 != null) {
            qVar2.mo158522s(this.f331378c, this.f331379d);
        }
        mo159593v();
    }

    /* renamed from: v */
    public final void mo159593v() {
        C108597q qVar;
        int i = this.f325140t;
        if (i == 0) {
            C108597q qVar2 = this.f325142v;
            if (qVar2 != null) {
                qVar2.f325134K = true;
                qVar2.f325135L = ((float) this.f325146z) * 0.06666667f;
            }
        } else if (i == 2 && (qVar = this.f325142v) != null) {
            qVar.f325134K = false;
            qVar.f325135L = 0.0f;
        }
        if (this.f325139B.isEmpty()) {
            C108597q qVar3 = this.f325142v;
            if (qVar3 != null) {
                qVar3.f325137N.set(0, 0, this.f331378c, this.f331379d);
                return;
            }
            return;
        }
        C108597q qVar4 = this.f325142v;
        if (qVar4 != null) {
            Rect rect = this.f325139B;
            qVar4.f325137N.set(rect.left, rect.top, rect.right, rect.bottom);
        }
    }

    /* renamed from: w */
    public final void mo159594w() {
        int i = this.f325140t;
        if (i == 0) {
            this.f325146z = 640;
            this.f325138A = 640;
        } else if (i == 1) {
            this.f325146z = 640;
            this.f325138A = 1137;
        } else if (i == 2) {
            int i2 = this.f331378c;
            if (i2 > 640) {
                this.f325146z = 640;
                this.f325138A = (this.f331379d * 640) / i2;
            } else {
                this.f325146z = i2;
                this.f325138A = this.f331379d;
            }
        }
        int i3 = (this.f325138A * 160) / this.f325146z;
    }
}

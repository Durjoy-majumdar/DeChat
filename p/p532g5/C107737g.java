package p532g5;

import a14.C0000n0;
import a14.C53872d1;
import a14.C53896h0;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import androidx.compose.p002ui.platform.C103616d1;
import f14.C58901s;
import fy3.C32227p;
import gy3.C8480h;
import gy3.C87412m;
import gy3.C87413o;
import p1104d1.C106967a;
import p1104d1.C106968b;
import p1104d1.C106969c;
import p1105d5.C106994f;
import p175j0.C108494d2;
import p175j0.C108504h;
import p175j0.C108515x;
import p175j0.C60655g0;
import p259w6.C111735b;
import p436a1.C103229d0;
import p436a1.C103230e;
import p436a1.C103276y;
import p503e1.C107082c;
import p532g5.C59349d;
import p632o5.C109956h;
import rx3.C13598b0;

/* renamed from: g5.g */
public final class C107737g {

    /* renamed from: g5.g$a */
    public static final class C107738a extends C87413o implements C32227p<C108504h, Integer, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C59349d f322405d;

        /* renamed from: e */
        public final /* synthetic */ C109956h f322406e;

        /* renamed from: f */
        public final /* synthetic */ C106994f f322407f;

        /* renamed from: g */
        public final /* synthetic */ int f322408g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C107738a(C59349d dVar, C109956h hVar, C106994f fVar, int i) {
            super(2);
            this.f322405d = dVar;
            this.f322406e = hVar;
            this.f322407f = fVar;
            this.f322408g = i;
        }

        public Object invoke(Object obj, Object obj2) {
            ((Number) obj2).intValue();
            C107737g.m145940d(this.f322405d, this.f322406e, this.f322407f, (C108504h) obj, this.f322408g | 1);
            return C13598b0.f38549a;
        }
    }

    /* renamed from: g5.g$b */
    public static final class C107739b extends C87413o implements C32227p<C108504h, Integer, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C59349d f322409d;

        /* renamed from: e */
        public final /* synthetic */ C109956h f322410e;

        /* renamed from: f */
        public final /* synthetic */ C106994f f322411f;

        /* renamed from: g */
        public final /* synthetic */ int f322412g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C107739b(C59349d dVar, C109956h hVar, C106994f fVar, int i) {
            super(2);
            this.f322409d = dVar;
            this.f322410e = hVar;
            this.f322411f = fVar;
            this.f322412g = i;
        }

        public Object invoke(Object obj, Object obj2) {
            ((Number) obj2).intValue();
            C107737g.m145940d(this.f322409d, this.f322410e, this.f322411f, (C108504h) obj, this.f322412g | 1);
            return C13598b0.f38549a;
        }
    }

    /* renamed from: g5.g$c */
    public static final class C107740c extends C87413o implements C32227p<C108504h, Integer, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C59349d f322413d;

        /* renamed from: e */
        public final /* synthetic */ C109956h f322414e;

        /* renamed from: f */
        public final /* synthetic */ C106994f f322415f;

        /* renamed from: g */
        public final /* synthetic */ int f322416g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C107740c(C59349d dVar, C109956h hVar, C106994f fVar, int i) {
            super(2);
            this.f322413d = dVar;
            this.f322414e = hVar;
            this.f322415f = fVar;
            this.f322416g = i;
        }

        public Object invoke(Object obj, Object obj2) {
            ((Number) obj2).intValue();
            C107737g.m145940d(this.f322413d, this.f322414e, this.f322415f, (C108504h) obj, this.f322416g | 1);
            return C13598b0.f38549a;
        }
    }

    /* renamed from: g5.g$d */
    public static final class C107741d extends C87413o implements C32227p<C108504h, Integer, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C59349d f322417d;

        /* renamed from: e */
        public final /* synthetic */ C109956h f322418e;

        /* renamed from: f */
        public final /* synthetic */ C106994f f322419f;

        /* renamed from: g */
        public final /* synthetic */ int f322420g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C107741d(C59349d dVar, C109956h hVar, C106994f fVar, int i) {
            super(2);
            this.f322417d = dVar;
            this.f322418e = hVar;
            this.f322419f = fVar;
            this.f322420g = i;
        }

        public Object invoke(Object obj, Object obj2) {
            ((Number) obj2).intValue();
            C107737g.m145940d(this.f322417d, this.f322418e, this.f322419f, (C108504h) obj, this.f322420g | 1);
            return C13598b0.f38549a;
        }
    }

    /* renamed from: a */
    public static final C59349d m145937a(C109956h hVar, C106994f fVar, C59349d.C59350a aVar, C108504h hVar2, int i, int i2) {
        C87412m.m108594g(hVar, "request");
        C87412m.m108594g(fVar, "imageLoader");
        hVar2.mo51557H(604402625);
        if ((i2 & 4) != 0) {
            int i3 = C59349d.C59350a.f169658a;
            aVar = C59349d.C59350a.C59351a.f169659b;
        }
        Object obj = hVar.f328993b;
        if (obj instanceof C103229d0) {
            m145939c("ImageBitmap");
            throw null;
        } else if (obj instanceof C107082c) {
            m145939c("ImageVector");
            throw null;
        } else if (!(obj instanceof C106969c)) {
            if (hVar.f328994c == null) {
                hVar2.mo51557H(-723524056);
                hVar2.mo51557H(-3687241);
                Object q = hVar2.mo51606q();
                int i4 = C108504h.f324828a;
                Object obj2 = C108504h.C60656a.f172772a;
                if (q == obj2) {
                    C53896h0 h0Var = C53872d1.f151117a;
                    C108515x xVar = new C108515x(C60655g0.m70937h(C58901s.f168555a.mo74590i0(), hVar2));
                    hVar2.mo51553F(xVar);
                    q = xVar;
                }
                hVar2.mo51565P();
                C0000n0 n0Var = ((C108515x) q).f324838d;
                hVar2.mo51565P();
                hVar2.mo51557H(-3686930);
                boolean x = hVar2.mo51619x(n0Var);
                Object q2 = hVar2.mo51606q();
                if (x || q2 == obj2) {
                    q2 = new C59349d(n0Var, hVar, fVar);
                    hVar2.mo51553F(q2);
                }
                hVar2.mo51565P();
                C59349d dVar = (C59349d) q2;
                dVar.getClass();
                ((C108494d2) dVar.f169656v).setValue(hVar);
                ((C108494d2) dVar.f169657w).setValue(fVar);
                C87412m.m108594g(aVar, "<set-?>");
                dVar.f169653s = aVar;
                dVar.f169654t = ((Boolean) hVar2.mo51598m(C103616d1.f306070a)).booleanValue();
                m145940d(dVar, hVar, fVar, hVar2, 576);
                hVar2.mo51565P();
                return dVar;
            }
            throw new IllegalArgumentException("request.target must be null.".toString());
        } else {
            m145939c("Painter");
            throw null;
        }
    }

    /* renamed from: b */
    public static final C106969c m145938b(Drawable drawable) {
        if (drawable instanceof BitmapDrawable) {
            Bitmap bitmap = ((BitmapDrawable) drawable).getBitmap();
            C87412m.m108593f(bitmap, "bitmap");
            return new C106967a(C103230e.m136642b(bitmap), 0, 0, 6, (C8480h) null);
        } else if (drawable instanceof ColorDrawable) {
            return new C106968b(C103276y.m136791b(((ColorDrawable) drawable).getColor()), (C8480h) null);
        } else {
            Drawable mutate = drawable.mutate();
            C87412m.m108593f(mutate, "mutate()");
            return new C111735b(mutate);
        }
    }

    /* renamed from: c */
    public static final Void m145939c(String str) {
        throw new IllegalArgumentException("Unsupported type: " + str + ". If you wish to display this " + str + ", use androidx.compose.foundation.Image.");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v0, resolved type: d1.c} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v10, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v17, resolved type: g5.a} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v5, resolved type: g5.a} */
    /* JADX WARNING: type inference failed for: r1v11 */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x00f2, code lost:
        if (r1 == p175j0.C108504h.C60656a.f172772a) goto L_0x00f4;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void m145940d(p532g5.C59349d r11, p632o5.C109956h r12, p1105d5.C106994f r13, p175j0.C108504h r14, int r15) {
        /*
            r0 = -234146095(0xfffffffff20b36d1, float:-2.75742E30)
            j0.h r14 = r14.mo51623z(r0)
            boolean r0 = r11.f169654t
            r1 = 0
            if (r0 == 0) goto L_0x0036
            android.graphics.drawable.Drawable r0 = r12.f328985B
            java.lang.Integer r2 = r12.f328984A
            o5.c r3 = r12.f328991H
            android.graphics.drawable.Drawable r3 = r3.f328961g
            android.graphics.drawable.Drawable r0 = p864t5.C110906e.m151212c(r12, r0, r2, r3)
            if (r0 != 0) goto L_0x001b
            goto L_0x001f
        L_0x001b:
            d1.c r1 = m145938b(r0)
        L_0x001f:
            j0.y0 r0 = r11.f169652r
            j0.d2 r0 = (p175j0.C108494d2) r0
            r0.setValue(r1)
            j0.v1 r14 = r14.mo51596l()
            if (r14 != 0) goto L_0x002d
            goto L_0x0035
        L_0x002d:
            g5.g$a r0 = new g5.g$a
            r0.<init>(r11, r12, r13, r15)
            r14.mo51650a(r0)
        L_0x0035:
            return
        L_0x0036:
            j0.y0 r0 = r11.f169655u
            j0.d2 r0 = (p175j0.C108494d2) r0
            java.lang.Object r0 = r0.getValue()
            g5.d$c r0 = (p532g5.C59349d.C59353c) r0
            r2 = -3686930(0xffffffffffc7bdee, float:NaN)
            r14.mo51557H(r2)
            boolean r3 = r14.mo51619x(r0)
            java.lang.Object r4 = r14.mo51606q()
            if (r3 != 0) goto L_0x0054
            java.lang.Object r3 = p175j0.C108504h.C60656a.f172772a
            if (r4 != r3) goto L_0x005b
        L_0x0054:
            d1.c r4 = r0.mo84464a()
            r14.mo51553F(r4)
        L_0x005b:
            r14.mo51565P()
            r7 = r4
            d1.c r7 = (p1104d1.C106969c) r7
            o5.d r3 = r12.f328990G
            s5.c r3 = r3.f328971e
            if (r3 != 0) goto L_0x006d
            o5.c r3 = r13.mo157445c()
            s5.c r3 = r3.f328956b
        L_0x006d:
            boolean r4 = r3 instanceof p1152s5.C110736a
            if (r4 != 0) goto L_0x0088
            j0.y0 r0 = r11.f169652r
            j0.d2 r0 = (p175j0.C108494d2) r0
            r0.setValue(r7)
            j0.v1 r14 = r14.mo51596l()
            if (r14 != 0) goto L_0x007f
            goto L_0x0087
        L_0x007f:
            g5.g$b r0 = new g5.g$b
            r0.<init>(r11, r12, r13, r15)
            r14.mo51650a(r0)
        L_0x0087:
            return
        L_0x0088:
            r14.mo51557H(r2)
            boolean r4 = r14.mo51619x(r12)
            java.lang.Object r5 = r14.mo51606q()
            if (r4 != 0) goto L_0x0099
            java.lang.Object r4 = p175j0.C108504h.C60656a.f172772a
            if (r5 != r4) goto L_0x00a1
        L_0x0099:
            g5.i r5 = new g5.i
            r5.<init>(r1)
            r14.mo51553F(r5)
        L_0x00a1:
            r14.mo51565P()
            g5.i r5 = (p532g5.C107743i) r5
            boolean r1 = r0 instanceof p532g5.C59349d.C59353c.C59356c
            if (r1 == 0) goto L_0x00b0
            d1.c r1 = r0.mo84464a()
            r5.f322422a = r1
        L_0x00b0:
            boolean r1 = r0 instanceof p532g5.C59349d.C59353c.C59357d
            if (r1 == 0) goto L_0x011c
            r1 = r0
            g5.d$c$d r1 = (p532g5.C59349d.C59353c.C59357d) r1
            o5.m r1 = r1.f169668b
            o5.i$a r1 = r1.f329061c
            h5.b r4 = r1.f329056c
            h5.b r6 = p972h5.C108136b.MEMORY_CACHE
            if (r4 != r6) goto L_0x00c2
            goto L_0x011c
        L_0x00c2:
            T r4 = r5.f322422a
            r6 = r4
            d1.c r6 = (p1104d1.C106969c) r6
            o5.d r4 = r12.f328990G
            p5.e r4 = r4.f328969c
            if (r4 != 0) goto L_0x00cf
            p5.e r4 = p643p5.C110168e.FIT
        L_0x00cf:
            r8 = r4
            s5.a r3 = (p1152s5.C110736a) r3
            int r9 = r3.f331195b
            boolean r1 = r1.f329057d
            r10 = r1 ^ 1
            java.lang.String r1 = "key"
            gy3.C87412m.m108594g(r0, r1)
            r1 = -1764073009(0xffffffff96da61cf, float:-3.5281525E-25)
            r14.mo51557H(r1)
            r14.mo51557H(r2)
            boolean r0 = r14.mo51619x(r0)
            java.lang.Object r1 = r14.mo51606q()
            if (r0 != 0) goto L_0x00f4
            java.lang.Object r0 = p175j0.C108504h.C60656a.f172772a
            if (r1 != r0) goto L_0x00fd
        L_0x00f4:
            g5.a r1 = new g5.a
            r5 = r1
            r5.<init>(r6, r7, r8, r9, r10)
            r14.mo51553F(r1)
        L_0x00fd:
            r14.mo51565P()
            g5.a r1 = (p532g5.C107733a) r1
            r14.mo51565P()
            j0.y0 r0 = r11.f169652r
            j0.d2 r0 = (p175j0.C108494d2) r0
            r0.setValue(r1)
            j0.v1 r14 = r14.mo51596l()
            if (r14 != 0) goto L_0x0113
            goto L_0x011b
        L_0x0113:
            g5.g$d r0 = new g5.g$d
            r0.<init>(r11, r12, r13, r15)
            r14.mo51650a(r0)
        L_0x011b:
            return
        L_0x011c:
            j0.y0 r0 = r11.f169652r
            j0.d2 r0 = (p175j0.C108494d2) r0
            r0.setValue(r7)
            j0.v1 r14 = r14.mo51596l()
            if (r14 != 0) goto L_0x012a
            goto L_0x0132
        L_0x012a:
            g5.g$c r0 = new g5.g$c
            r0.<init>(r11, r12, r13, r15)
            r14.mo51650a(r0)
        L_0x0132:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p532g5.C107737g.m145940d(g5.d, o5.h, d5.f, j0.h, int):void");
    }
}

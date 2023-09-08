package p503e1;

import fy3.C32224a;
import fy3.C32226l;
import gy3.C87412m;
import gy3.C87413o;
import p1166z0.C112545k;
import p175j0.C108497e2;
import p175j0.C108500f2;
import p175j0.C60690y0;
import p436a1.C103274x;
import p835c1.C104231f;
import rx3.C13598b0;

/* renamed from: e1.i */
public final class C107089i extends C107087g {

    /* renamed from: b */
    public final C107081b f320595b;

    /* renamed from: c */
    public boolean f320596c = true;

    /* renamed from: d */
    public final C107080a f320597d = new C107080a();

    /* renamed from: e */
    public C32224a<C13598b0> f320598e = C107091b.f320605d;

    /* renamed from: f */
    public final C60690y0 f320599f = C108500f2.m146996c((Object) null, (C108497e2) null, 2, (Object) null);

    /* renamed from: g */
    public float f320600g;

    /* renamed from: h */
    public float f320601h;

    /* renamed from: i */
    public long f320602i = C112545k.f336974c;

    /* renamed from: j */
    public final C32226l<C104231f, C13598b0> f320603j = new C107090a(this);

    /* renamed from: e1.i$a */
    public static final class C107090a extends C87413o implements C32226l<C104231f, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C107089i f320604d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C107090a(C107089i iVar) {
            super(1);
            this.f320604d = iVar;
        }

        public Object invoke(Object obj) {
            C104231f fVar = (C104231f) obj;
            C87412m.m108594g(fVar, "$this$null");
            this.f320604d.f320595b.mo157535a(fVar);
            return C13598b0.f38549a;
        }
    }

    /* renamed from: e1.i$b */
    public static final class C107091b extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public static final C107091b f320605d = new C107091b();

        public C107091b() {
            super(0);
        }

        public /* bridge */ /* synthetic */ Object invoke() {
            return C13598b0.f38549a;
        }
    }

    /* renamed from: e1.i$c */
    public static final class C107092c extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C107089i f320606d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C107092c(C107089i iVar) {
            super(0);
            this.f320606d = iVar;
        }

        public Object invoke() {
            C107089i iVar = this.f320606d;
            iVar.f320596c = true;
            iVar.f320598e.invoke();
            return C13598b0.f38549a;
        }
    }

    public C107089i() {
        C107081b bVar = new C107081b();
        bVar.f320536k = 0.0f;
        bVar.f320542q = true;
        bVar.mo157547c();
        bVar.f320537l = 0.0f;
        bVar.f320542q = true;
        bVar.mo157547c();
        bVar.mo157537d(new C107092c(this));
        this.f320595b = bVar;
    }

    /* renamed from: a */
    public void mo157535a(C104231f fVar) {
        C87412m.m108594g(fVar, "<this>");
        mo157549e(fVar, 1.0f, (C103274x) null);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x00ad, code lost:
        if (p560i2.C33181m.m39966b(r5) > r14.getHeight()) goto L_0x00af;
     */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo157549e(p835c1.C104231f r28, float r29, p436a1.C103274x r30) {
        /*
            r27 = this;
            r0 = r27
            r1 = r28
            java.lang.String r2 = "<this>"
            gy3.C87412m.m108594g(r1, r2)
            if (r30 == 0) goto L_0x000e
            r13 = r30
            goto L_0x0019
        L_0x000e:
            j0.y0 r2 = r0.f320599f
            j0.d2 r2 = (p175j0.C108494d2) r2
            java.lang.Object r2 = r2.getValue()
            a1.x r2 = (p436a1.C103274x) r2
            r13 = r2
        L_0x0019:
            boolean r2 = r0.f320596c
            r4 = 1
            if (r2 != 0) goto L_0x002e
            long r5 = r0.f320602i
            long r7 = r28.mo145819e()
            boolean r2 = p1166z0.C112545k.m153755a(r5, r7)
            if (r2 != 0) goto L_0x002b
            goto L_0x002e
        L_0x002b:
            r2 = 0
            goto L_0x0142
        L_0x002e:
            e1.b r2 = r0.f320595b
            long r5 = r28.mo145819e()
            float r5 = p1166z0.C112545k.m153758d(r5)
            float r6 = r0.f320600g
            float r5 = r5 / r6
            r2.f320538m = r5
            r2.f320542q = r4
            r2.mo157547c()
            e1.b r2 = r0.f320595b
            long r5 = r28.mo145819e()
            float r5 = p1166z0.C112545k.m153756b(r5)
            float r6 = r0.f320601h
            float r5 = r5 / r6
            r2.f320539n = r5
            r2.f320542q = r4
            r2.mo157547c()
            e1.a r2 = r0.f320597d
            long r5 = r28.mo145819e()
            float r5 = p1166z0.C112545k.m153758d(r5)
            double r5 = (double) r5
            double r5 = java.lang.Math.ceil(r5)
            float r5 = (float) r5
            int r5 = (int) r5
            long r6 = r28.mo145819e()
            float r6 = p1166z0.C112545k.m153756b(r6)
            double r6 = (double) r6
            double r6 = java.lang.Math.ceil(r6)
            float r6 = (float) r6
            int r6 = (int) r6
            long r5 = p560i2.C108329n.m146743a(r5, r6)
            i2.o r7 = r28.getLayoutDirection()
            fy3.l<c1.f, rx3.b0> r8 = r0.f320603j
            r2.getClass()
            java.lang.String r9 = "layoutDirection"
            gy3.C87412m.m108594g(r7, r9)
            java.lang.String r9 = "block"
            gy3.C87412m.m108594g(r8, r9)
            r2.f320524c = r1
            a1.d0 r9 = r2.f320522a
            a1.s r10 = r2.f320523b
            r11 = 32
            if (r9 == 0) goto L_0x00af
            if (r10 == 0) goto L_0x00af
            long r14 = r5 >> r11
            int r12 = (int) r14
            r14 = r9
            a1.d r14 = (p436a1.C103228d) r14
            int r15 = r14.getWidth()
            if (r12 > r15) goto L_0x00af
            int r12 = p560i2.C33181m.m39966b(r5)
            int r14 = r14.getHeight()
            if (r12 <= r14) goto L_0x00da
        L_0x00af:
            long r9 = r5 >> r11
            int r14 = (int) r9
            int r15 = p560i2.C33181m.m39966b(r5)
            r16 = 0
            r17 = 0
            r18 = 0
            r19 = 28
            r20 = 0
            a1.d0 r9 = p436a1.C103231e0.m136644a(r14, r15, r16, r17, r18, r19, r20)
            android.graphics.Canvas r10 = p436a1.C103226c.f304431a
            a1.b r10 = new a1.b
            r10.<init>()
            android.graphics.Canvas r11 = new android.graphics.Canvas
            android.graphics.Bitmap r12 = p436a1.C103230e.m136641a(r9)
            r11.<init>(r12)
            r10.f304427a = r11
            r2.f320522a = r9
            r2.f320523b = r10
        L_0x00da:
            r2.f320525d = r5
            c1.a r2 = r2.f320526e
            long r5 = p560i2.C108329n.m146744b(r5)
            c1.a$a r11 = r2.f308517d
            i2.d r12 = r11.f308521a
            i2.o r15 = r11.f308522b
            a1.s r14 = r11.f308523c
            long r3 = r11.f308524d
            r11.f308521a = r1
            r11.f308522b = r7
            r11.f308523c = r10
            r11.f308524d = r5
            a1.b r10 = (p436a1.C103223b) r10
            r10.mo142944c()
            long r5 = p436a1.C103272w.f304510b
            r17 = 0
            r19 = 0
            r21 = 0
            r22 = 0
            r23 = 0
            r24 = 0
            r25 = 62
            r26 = 0
            r7 = r14
            r14 = r2
            r11 = r15
            r15 = r5
            p835c1.C104231f.C104232a.m139087f(r14, r15, r17, r19, r21, r22, r23, r24, r25, r26)
            e1.i$a r8 = (p503e1.C107089i.C107090a) r8
            r8.invoke(r2)
            r10.mo142943b()
            c1.a$a r2 = r2.f308517d
            r2.getClass()
            java.lang.String r5 = "<set-?>"
            gy3.C87412m.m108594g(r12, r5)
            r2.f308521a = r12
            gy3.C87412m.m108594g(r11, r5)
            r2.f308522b = r11
            gy3.C87412m.m108594g(r7, r5)
            r2.f308523c = r7
            r2.f308524d = r3
            a1.d r9 = (p436a1.C103228d) r9
            android.graphics.Bitmap r2 = r9.f304433a
            r2.prepareToDraw()
            r2 = 0
            r0.f320596c = r2
            long r3 = r28.mo145819e()
            r0.f320602i = r3
        L_0x0142:
            e1.a r5 = r0.f320597d
            r5.getClass()
            a1.d0 r11 = r5.f320522a
            if (r11 == 0) goto L_0x014d
            r3 = 1
            goto L_0x014e
        L_0x014d:
            r3 = 0
        L_0x014e:
            if (r3 == 0) goto L_0x0168
            r3 = 0
            long r5 = r5.f320525d
            r7 = 0
            r9 = 0
            r12 = 0
            r14 = 0
            r15 = 0
            r16 = 858(0x35a, float:1.202E-42)
            r17 = 0
            r1 = r28
            r2 = r11
            r11 = r29
            p835c1.C104231f.C104232a.m139083b(r1, r2, r3, r5, r7, r9, r11, r12, r13, r14, r15, r16, r17)
            return
        L_0x0168:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "drawCachedImage must be invoked first before attempting to draw the result into another destination"
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p503e1.C107089i.mo157549e(c1.f, float, a1.x):void");
    }

    public String toString() {
        String str = "Params: " + "\tname: " + this.f320595b.f320534i + "\n" + "\tviewportWidth: " + this.f320600g + "\n" + "\tviewportHeight: " + this.f320601h + "\n";
        C87412m.m108593f(str, "StringBuilder().apply(builderAction).toString()");
        return str;
    }
}

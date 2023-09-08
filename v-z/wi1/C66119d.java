package wi1;

import android.content.Context;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.view.animation.AccelerateDecelerateInterpolator;
import fy3.C32224a;
import gy3.C87412m;
import gy3.C87413o;
import il1.C46255f;
import nh1.C61740j;
import nj3.C76901s0;
import o40.C61926c;
import rx3.C13598b0;
import rx3.C13601g;

/* renamed from: wi1.d */
public final class C66119d extends C46255f<Boolean> {

    /* renamed from: f */
    public final View f190041f;

    /* renamed from: g */
    public final Context f190042g;

    /* renamed from: h */
    public final C61740j f190043h;

    /* renamed from: i */
    public final C13601g f190044i;

    /* renamed from: j */
    public int f190045j;

    /* renamed from: n */
    public int f190046n;

    /* renamed from: o */
    public long f190047o;

    /* renamed from: p */
    public boolean f190048p;

    /* renamed from: q */
    public boolean f190049q;

    /* renamed from: r */
    public boolean f190050r;

    /* renamed from: wi1.d$a */
    public static final class C66120a extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C32224a<C13598b0> f190051d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C66120a(C32224a<C13598b0> aVar) {
            super(0);
            this.f190051d = aVar;
        }

        public Object invoke() {
            this.f190051d.invoke();
            return C13598b0.f38549a;
        }
    }

    /* renamed from: wi1.d$b */
    public static final class C66121b extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C66119d f190052d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C66121b(C66119d dVar) {
            super(0);
            this.f190052d = dVar;
        }

        public Object invoke() {
            this.f190052d.f190043h.f175463d.animate().cancel();
            this.f190052d.f190043h.f175462c.animate().translationY((float) this.f190052d.f190045j).setDuration(300).setInterpolator(new AccelerateDecelerateInterpolator()).setListener(new C66123e(this.f190052d)).start();
            ViewPropertyAnimator animate = this.f190052d.f190043h.f175463d.animate();
            C66119d dVar = this.f190052d;
            animate.translationY((float) (dVar.f190046n + dVar.f190045j)).setDuration(300).setInterpolator(new AccelerateDecelerateInterpolator()).start();
            return C13598b0.f38549a;
        }
    }

    /* renamed from: wi1.d$c */
    public static final class C66122c extends C87413o implements C32224a<C76901s0> {

        /* renamed from: d */
        public final /* synthetic */ C66119d f190053d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C66122c(C66119d dVar) {
            super(0);
            this.f190053d = dVar;
        }

        public Object invoke() {
            C76901s0 s0Var = new C76901s0(this.f190053d.f190043h.f175460a, -1, -1, true);
            s0Var.setOnDismissListener(C66126h.f190057d);
            return s0Var;
        }
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C66119d(android.view.View r23, android.content.Context r24, androidx.lifecycle.C0125s r25) {
        /*
            r22 = this;
            r0 = r22
            r1 = r23
            r2 = r24
            r3 = r25
            java.lang.String r4 = "root"
            gy3.C87412m.m108594g(r1, r4)
            java.lang.String r4 = "context"
            gy3.C87412m.m108594g(r2, r4)
            java.lang.String r4 = "owner"
            gy3.C87412m.m108594g(r3, r4)
            r0.<init>(r3)
            r0.f190041f = r1
            r0.f190042g = r2
            android.view.LayoutInflater r1 = com.tencent.p014mm.p136ui.C85868k2.m106137b(r24)
            r3 = 2131495065(0x7f0c0899, float:1.8613656E38)
            r4 = 0
            r5 = 0
            android.view.View r1 = r1.inflate(r3, r4, r5)
            r3 = 2131304858(0x7f09219a, float:1.822787E38)
            android.view.View r4 = p192l4.C10462b.m10395a(r1, r3)
            if (r4 == 0) goto L_0x013d
            r3 = 2131304859(0x7f09219b, float:1.8227872E38)
            android.view.View r6 = p192l4.C10462b.m10395a(r1, r3)
            r17 = r6
            android.widget.FrameLayout r17 = (android.widget.FrameLayout) r17
            if (r17 == 0) goto L_0x013d
            r3 = 2131304860(0x7f09219c, float:1.8227875E38)
            android.view.View r6 = p192l4.C10462b.m10395a(r1, r3)
            r18 = r6
            android.widget.FrameLayout r18 = (android.widget.FrameLayout) r18
            if (r18 == 0) goto L_0x013d
            r3 = 2131308034(0x7f092e02, float:1.8234312E38)
            android.view.View r6 = p192l4.C10462b.m10395a(r1, r3)
            r15 = r6
            android.widget.RelativeLayout r15 = (android.widget.RelativeLayout) r15
            if (r15 == 0) goto L_0x013d
            r3 = 2131309332(0x7f093314, float:1.8236945E38)
            android.view.View r6 = p192l4.C10462b.m10395a(r1, r3)
            r12 = r6
            android.widget.ProgressBar r12 = (android.widget.ProgressBar) r12
            if (r12 == 0) goto L_0x013d
            r3 = 2131310204(0x7f09367c, float:1.8238713E38)
            android.view.View r6 = p192l4.C10462b.m10395a(r1, r3)
            r14 = r6
            com.tencent.mm.ui.widget.imageview.WeImageView r14 = (com.tencent.p014mm.p136ui.widget.imageview.WeImageView) r14
            if (r14 == 0) goto L_0x013d
            r3 = 2131310205(0x7f09367d, float:1.8238715E38)
            android.view.View r16 = p192l4.C10462b.m10395a(r1, r3)
            if (r16 == 0) goto L_0x013d
            r3 = 2131314933(0x7f0948f5, float:1.8248305E38)
            android.view.View r6 = p192l4.C10462b.m10395a(r1, r3)
            r13 = r6
            android.widget.RelativeLayout r13 = (android.widget.RelativeLayout) r13
            if (r13 == 0) goto L_0x013d
            r3 = 2131316403(0x7f094eb3, float:1.8251287E38)
            android.view.View r6 = p192l4.C10462b.m10395a(r1, r3)
            r19 = r6
            com.tencent.mm.ui.widget.imageview.WeImageView r19 = (com.tencent.p014mm.p136ui.widget.imageview.WeImageView) r19
            if (r19 == 0) goto L_0x013d
            nh1.j r3 = new nh1.j
            r7 = r1
            androidx.constraintlayout.widget.ConstraintLayout r7 = (androidx.constraintlayout.widget.ConstraintLayout) r7
            r6 = r3
            r8 = r4
            r9 = r17
            r10 = r18
            r11 = r15
            r1 = r13
            r13 = r14
            r20 = r14
            r14 = r16
            r21 = r15
            r15 = r1
            r16 = r19
            r6.<init>(r7, r8, r9, r10, r11, r12, r13, r14, r15, r16)
            r0.f190043h = r3
            wi1.d$c r3 = new wi1.d$c
            r3.<init>(r0)
            rx3.g r3 = rx3.C36568h.m40985a(r3)
            r0.f190044i = r3
            r3 = 1
            r0.f190048p = r3
            android.view.ViewGroup$LayoutParams r6 = r17.getLayoutParams()
            int r7 = r6.height
            r0.f190046n = r7
            int r8 = com.tencent.p014mm.p136ui.C75054z4.m90004b(r24)
            int r7 = r7 + r8
            r6.height = r7
            r0.f190045j = r7
            android.view.ViewGroup$LayoutParams r6 = r18.getLayoutParams()
            int r7 = r0.f190046n
            r8 = 2
            int r7 = r7 * 2
            int r2 = com.tencent.p014mm.p136ui.C75054z4.m90004b(r24)
            int r7 = r7 + r2
            r6.height = r7
            android.graphics.drawable.GradientDrawable r2 = new android.graphics.drawable.GradientDrawable
            android.graphics.drawable.GradientDrawable$Orientation r6 = android.graphics.drawable.GradientDrawable.Orientation.TOP_BOTTOM
            r7 = 8
            int[] r9 = new int[r7]
            java.lang.String r10 = "#003B3B3B"
            int r10 = android.graphics.Color.parseColor(r10)
            r9[r5] = r10
            java.lang.String r10 = "#80383838"
            int r10 = android.graphics.Color.parseColor(r10)
            r9[r3] = r10
            java.lang.String r3 = "#CC3B3B3B"
            int r3 = android.graphics.Color.parseColor(r3)
            r9[r8] = r3
            r3 = 3
            java.lang.String r8 = "#E63B3B3B"
            int r8 = android.graphics.Color.parseColor(r8)
            r9[r3] = r8
            r3 = 4
            java.lang.String r8 = "#3B3B3B"
            int r10 = android.graphics.Color.parseColor(r8)
            r9[r3] = r10
            r3 = 5
            int r10 = android.graphics.Color.parseColor(r8)
            r9[r3] = r10
            r3 = 6
            int r10 = android.graphics.Color.parseColor(r8)
            r9[r3] = r10
            r3 = 7
            int r8 = android.graphics.Color.parseColor(r8)
            r9[r3] = r8
            r2.<init>(r6, r9)
            r4.setBackground(r2)
            r22.mo90160c()
            r6 = r21
            r6.setVisibility(r5)
            r1.setVisibility(r7)
            r6 = r20
            r6.setVisibility(r5)
            return
        L_0x013d:
            android.content.res.Resources r1 = r1.getResources()
            java.lang.String r1 = r1.getResourceName(r3)
            java.lang.NullPointerException r2 = new java.lang.NullPointerException
            java.lang.String r3 = "Missing required view with ID: "
            java.lang.String r1 = r3.concat(r1)
            r2.<init>(r1)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: wi1.C66119d.<init>(android.view.View, android.content.Context, androidx.lifecycle.s):void");
    }

    /* renamed from: b */
    public final void mo90159b() {
        this.f190050r = false;
        C66121b bVar = new C66121b(this);
        if (System.currentTimeMillis() - this.f190047o > 300) {
            bVar.invoke();
        } else {
            C61926c.m72666K(300, new C66120a(bVar));
        }
    }

    /* renamed from: c */
    public final void mo90160c() {
        this.f190048p = true;
        this.f190049q = false;
        this.f190043h.f175462c.setTranslationY((float) this.f190045j);
        this.f190043h.f175463d.setTranslationY((float) (this.f190046n + this.f190045j));
    }

    public void onChanged(Object obj) {
        if (C87412m.m108589b((Boolean) obj, Boolean.TRUE)) {
            this.f190043h.f175464e.setVisibility(8);
            this.f190043h.f175467h.setVisibility(0);
            this.f190043h.f175465f.setVisibility(8);
            return;
        }
        this.f190043h.f175464e.setVisibility(0);
        this.f190043h.f175467h.setVisibility(8);
        this.f190043h.f175465f.setVisibility(0);
    }
}

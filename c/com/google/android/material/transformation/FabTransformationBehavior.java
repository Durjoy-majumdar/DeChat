package com.google.android.material.transformation;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.TimeInterpolator;
import android.content.Context;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import j20.C117292a;
import k20.C60958c;
import k20.C9556a;
import p161h8.C108164a;
import p161h8.C108168h;
import p161h8.C108169i;
import p161h8.C108170j;

public abstract class FabTransformationBehavior extends ExpandableTransformationBehavior {

    /* renamed from: f */
    public final Rect f309647f = new Rect();

    /* renamed from: g */
    public final RectF f309648g = new RectF();

    /* renamed from: h */
    public final RectF f309649h = new RectF();

    /* renamed from: i */
    public final int[] f309650i = new int[2];

    /* renamed from: com.google.android.material.transformation.FabTransformationBehavior$a */
    public class C0914a extends AnimatorListenerAdapter {

        /* renamed from: d */
        public final /* synthetic */ boolean f2126d;

        /* renamed from: e */
        public final /* synthetic */ View f2127e;

        /* renamed from: f */
        public final /* synthetic */ View f2128f;

        public C0914a(FabTransformationBehavior fabTransformationBehavior, boolean z, View view, View view2) {
            this.f2126d = z;
            this.f2127e = view;
            this.f2128f = view2;
        }

        public void onAnimationEnd(Animator animator) {
            if (!this.f2126d) {
                View view = this.f2127e;
                C9556a aVar = new C9556a();
                ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                aVar.mo10233c(4);
                C117292a.m165358d(view, aVar.mo10232b(), "com/google/android/material/transformation/FabTransformationBehavior$1", "onAnimationEnd", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
                C117292a.m165359e(view, "com/google/android/material/transformation/FabTransformationBehavior$1", "onAnimationEnd", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                View view2 = this.f2128f;
                C9556a aVar2 = new C9556a();
                aVar2.mo10233c(Float.valueOf(1.0f));
                View view3 = view2;
                C117292a.m165358d(view3, aVar2.mo10232b(), "com/google/android/material/transformation/FabTransformationBehavior$1", "onAnimationEnd", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
                view2.setAlpha(((Float) aVar2.mo10231a(0)).floatValue());
                C117292a.m165359e(view3, "com/google/android/material/transformation/FabTransformationBehavior$1", "onAnimationEnd", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
                View view4 = this.f2128f;
                C9556a aVar3 = new C9556a();
                aVar3.mo10233c(0);
                C117292a.m165358d(view4, aVar3.mo10232b(), "com/google/android/material/transformation/FabTransformationBehavior$1", "onAnimationEnd", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view4.setVisibility(((Integer) aVar3.mo10231a(0)).intValue());
                C117292a.m165359e(view4, "com/google/android/material/transformation/FabTransformationBehavior$1", "onAnimationEnd", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
        }

        public void onAnimationStart(Animator animator) {
            if (this.f2126d) {
                View view = this.f2127e;
                C9556a aVar = new C9556a();
                ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                aVar.mo10233c(0);
                C117292a.m165358d(view, aVar.mo10232b(), "com/google/android/material/transformation/FabTransformationBehavior$1", "onAnimationStart", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
                C117292a.m165359e(view, "com/google/android/material/transformation/FabTransformationBehavior$1", "onAnimationStart", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                View view2 = this.f2128f;
                C9556a aVar2 = new C9556a();
                aVar2.mo10233c(Float.valueOf(0.0f));
                View view3 = view2;
                C117292a.m165358d(view3, aVar2.mo10232b(), "com/google/android/material/transformation/FabTransformationBehavior$1", "onAnimationStart", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
                view2.setAlpha(((Float) aVar2.mo10231a(0)).floatValue());
                C117292a.m165359e(view3, "com/google/android/material/transformation/FabTransformationBehavior$1", "onAnimationStart", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
                View view4 = this.f2128f;
                C9556a aVar3 = new C9556a();
                aVar3.mo10233c(4);
                C117292a.m165358d(view4, aVar3.mo10232b(), "com/google/android/material/transformation/FabTransformationBehavior$1", "onAnimationStart", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view4.setVisibility(((Integer) aVar3.mo10231a(0)).intValue());
                C117292a.m165359e(view4, "com/google/android/material/transformation/FabTransformationBehavior$1", "onAnimationStart", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
        }
    }

    /* renamed from: com.google.android.material.transformation.FabTransformationBehavior$b */
    public static class C104486b {

        /* renamed from: a */
        public C108168h f309651a;

        /* renamed from: b */
        public C108170j f309652b;
    }

    public FabTransformationBehavior() {
    }

    /* renamed from: A */
    public final float mo147068A(C104486b bVar, C108169i iVar, float f, float f2) {
        long j = iVar.f323898a;
        long j2 = iVar.f323899b;
        C108169i d = bVar.f309651a.mo158568d("expansion");
        float interpolation = iVar.mo158573b().getInterpolation(((float) (((d.f323898a + d.f323899b) + 17) - j)) / ((float) j2));
        TimeInterpolator timeInterpolator = C108164a.f323890a;
        return f + (interpolation * (f2 - f));
    }

    /* renamed from: B */
    public final void mo147069B(View view, RectF rectF) {
        rectF.set(0.0f, 0.0f, (float) view.getWidth(), (float) view.getHeight());
        int[] iArr = this.f309650i;
        view.getLocationInWindow(iArr);
        rectF.offsetTo((float) iArr[0], (float) iArr[1]);
        rectF.offset((float) ((int) (-view.getTranslationX())), (float) ((int) (-view.getTranslationY())));
    }

    /* renamed from: C */
    public abstract C104486b mo147070C(Context context, boolean z);

    /* renamed from: b */
    public boolean mo842b(CoordinatorLayout coordinatorLayout, View view, View view2) {
        if (view.getVisibility() == 8) {
            throw new IllegalStateException("This behavior cannot be attached to a GONE view. Set the view to INVISIBLE instead.");
        } else if (!(view2 instanceof FloatingActionButton)) {
            return false;
        } else {
            int expandedComponentIdHint = ((FloatingActionButton) view2).getExpandedComponentIdHint();
            return expandedComponentIdHint == 0 || expandedComponentIdHint == view.getId();
        }
    }

    /* renamed from: c */
    public void mo144926c(CoordinatorLayout.C103717e eVar) {
        if (eVar.f306335h == 0) {
            eVar.f306335h = 80;
        }
    }

    /* JADX WARNING: type inference failed for: r0v11, types: [android.view.View] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x0179  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x0180  */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x02ac  */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x02b1  */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x030c  */
    /* JADX WARNING: Removed duplicated region for block: B:99:0x0392 A[LOOP:1: B:98:0x0390->B:99:0x0392, LOOP_END] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: x */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.animation.AnimatorSet mo844x(android.view.View r27, android.view.View r28, boolean r29, boolean r30) {
        /*
            r26 = this;
            r0 = r26
            r1 = r27
            r2 = r28
            r3 = r29
            android.content.Context r4 = r28.getContext()
            com.google.android.material.transformation.FabTransformationBehavior$b r4 = r0.mo147070C(r4, r3)
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            java.util.WeakHashMap<android.view.View, e3.a0> r7 = p849e3.C107207u.f320808a
            float r7 = p849e3.C107207u.C107213g.m145224i(r28)
            float r8 = p849e3.C107207u.C107213g.m145224i(r27)
            float r7 = r7 - r8
            r8 = 0
            r9 = 1
            r10 = 0
            if (r3 == 0) goto L_0x003b
            if (r30 != 0) goto L_0x0030
            float r7 = -r7
            r2.setTranslationZ(r7)
        L_0x0030:
            android.util.Property r7 = android.view.View.TRANSLATION_Z
            float[] r11 = new float[r9]
            r11[r10] = r8
            android.animation.ObjectAnimator r7 = android.animation.ObjectAnimator.ofFloat(r2, r7, r11)
            goto L_0x0046
        L_0x003b:
            android.util.Property r11 = android.view.View.TRANSLATION_Z
            float[] r12 = new float[r9]
            float r7 = -r7
            r12[r10] = r7
            android.animation.ObjectAnimator r7 = android.animation.ObjectAnimator.ofFloat(r2, r11, r12)
        L_0x0046:
            h8.h r11 = r4.f309651a
            java.lang.String r12 = "elevation"
            h8.i r11 = r11.mo158568d(r12)
            r11.mo158572a(r7)
            r5.add(r7)
            android.graphics.RectF r7 = r0.f309648g
            h8.j r11 = r4.f309652b
            float r11 = r0.mo147071y(r1, r2, r11)
            h8.j r12 = r4.f309652b
            float r12 = r0.mo147072z(r1, r2, r12)
            int r13 = (r11 > r8 ? 1 : (r11 == r8 ? 0 : -1))
            if (r13 == 0) goto L_0x0097
            int r13 = (r12 > r8 ? 1 : (r12 == r8 ? 0 : -1))
            if (r13 != 0) goto L_0x006b
            goto L_0x0097
        L_0x006b:
            if (r3 == 0) goto L_0x0071
            int r14 = (r12 > r8 ? 1 : (r12 == r8 ? 0 : -1))
            if (r14 < 0) goto L_0x0075
        L_0x0071:
            if (r3 != 0) goto L_0x0086
            if (r13 <= 0) goto L_0x0086
        L_0x0075:
            h8.h r13 = r4.f309651a
            java.lang.String r14 = "translationXCurveUpwards"
            h8.i r13 = r13.mo158568d(r14)
            h8.h r14 = r4.f309651a
            java.lang.String r15 = "translationYCurveUpwards"
            h8.i r14 = r14.mo158568d(r15)
            goto L_0x00a7
        L_0x0086:
            h8.h r13 = r4.f309651a
            java.lang.String r14 = "translationXCurveDownwards"
            h8.i r13 = r13.mo158568d(r14)
            h8.h r14 = r4.f309651a
            java.lang.String r15 = "translationYCurveDownwards"
            h8.i r14 = r14.mo158568d(r15)
            goto L_0x00a7
        L_0x0097:
            h8.h r13 = r4.f309651a
            java.lang.String r14 = "translationXLinear"
            h8.i r13 = r13.mo158568d(r14)
            h8.h r14 = r4.f309651a
            java.lang.String r15 = "translationYLinear"
            h8.i r14 = r14.mo158568d(r15)
        L_0x00a7:
            if (r3 == 0) goto L_0x00f1
            if (r30 != 0) goto L_0x00b3
            float r15 = -r11
            r2.setTranslationX(r15)
            float r15 = -r12
            r2.setTranslationY(r15)
        L_0x00b3:
            android.util.Property r15 = android.view.View.TRANSLATION_X
            r16 = r6
            float[] r6 = new float[r9]
            r6[r10] = r8
            android.animation.ObjectAnimator r6 = android.animation.ObjectAnimator.ofFloat(r2, r15, r6)
            android.util.Property r15 = android.view.View.TRANSLATION_Y
            r17 = r6
            float[] r6 = new float[r9]
            r6[r10] = r8
            android.animation.ObjectAnimator r6 = android.animation.ObjectAnimator.ofFloat(r2, r15, r6)
            float r11 = -r11
            float r12 = -r12
            float r11 = r0.mo147068A(r4, r13, r11, r8)
            float r12 = r0.mo147068A(r4, r14, r12, r8)
            android.graphics.Rect r15 = r0.f309647f
            r2.getWindowVisibleDisplayFrame(r15)
            android.graphics.RectF r8 = r0.f309648g
            r8.set(r15)
            android.graphics.RectF r15 = r0.f309649h
            r0.mo147069B(r2, r15)
            r15.offset(r11, r12)
            r15.intersect(r8)
            r7.set(r15)
            r8 = r6
            r6 = r17
            goto L_0x0109
        L_0x00f1:
            r16 = r6
            android.util.Property r6 = android.view.View.TRANSLATION_X
            float[] r8 = new float[r9]
            float r11 = -r11
            r8[r10] = r11
            android.animation.ObjectAnimator r6 = android.animation.ObjectAnimator.ofFloat(r2, r6, r8)
            android.util.Property r8 = android.view.View.TRANSLATION_Y
            float[] r11 = new float[r9]
            float r12 = -r12
            r11[r10] = r12
            android.animation.ObjectAnimator r8 = android.animation.ObjectAnimator.ofFloat(r2, r8, r11)
        L_0x0109:
            r13.mo158572a(r6)
            r14.mo158572a(r8)
            r5.add(r6)
            r5.add(r8)
            float r22 = r7.width()
            float r23 = r7.height()
            boolean r6 = r2 instanceof com.google.android.material.circularreveal.C104444c
            if (r6 == 0) goto L_0x0175
            boolean r7 = r1 instanceof android.widget.ImageView
            if (r7 != 0) goto L_0x0126
            goto L_0x0175
        L_0x0126:
            r7 = r2
            com.google.android.material.circularreveal.c r7 = (com.google.android.material.circularreveal.C104444c) r7
            r8 = r1
            android.widget.ImageView r8 = (android.widget.ImageView) r8
            android.graphics.drawable.Drawable r8 = r8.getDrawable()
            if (r8 != 0) goto L_0x0133
            goto L_0x0175
        L_0x0133:
            r8.mutate()
            r11 = 255(0xff, float:3.57E-43)
            if (r3 == 0) goto L_0x014a
            if (r30 != 0) goto L_0x013f
            r8.setAlpha(r11)
        L_0x013f:
            android.util.Property<android.graphics.drawable.Drawable, java.lang.Integer> r11 = p161h8.C108166e.f323895a
            int[] r12 = new int[r9]
            r12[r10] = r10
            android.animation.ObjectAnimator r11 = android.animation.ObjectAnimator.ofInt(r8, r11, r12)
            goto L_0x0154
        L_0x014a:
            android.util.Property<android.graphics.drawable.Drawable, java.lang.Integer> r12 = p161h8.C108166e.f323895a
            int[] r13 = new int[r9]
            r13[r10] = r11
            android.animation.ObjectAnimator r11 = android.animation.ObjectAnimator.ofInt(r8, r12, r13)
        L_0x0154:
            com.google.android.material.transformation.a r12 = new com.google.android.material.transformation.a
            r12.<init>(r0, r2)
            r11.addUpdateListener(r12)
            h8.h r12 = r4.f309651a
            java.lang.String r13 = "iconFade"
            h8.i r12 = r12.mo158568d(r13)
            r12.mo158572a(r11)
            r5.add(r11)
            com.google.android.material.transformation.b r11 = new com.google.android.material.transformation.b
            r11.<init>(r0, r7, r8)
            r7 = r16
            r7.add(r11)
            goto L_0x0177
        L_0x0175:
            r7 = r16
        L_0x0177:
            if (r6 != 0) goto L_0x0180
            r22 = r4
            r18 = r6
            r1 = r7
            goto L_0x02aa
        L_0x0180:
            r8 = r2
            com.google.android.material.circularreveal.c r8 = (com.google.android.material.circularreveal.C104444c) r8
            h8.j r11 = r4.f309652b
            android.graphics.RectF r12 = r0.f309648g
            android.graphics.RectF r13 = r0.f309649h
            r0.mo147069B(r1, r12)
            r0.mo147069B(r2, r13)
            float r11 = r0.mo147071y(r1, r2, r11)
            float r11 = -r11
            r14 = 0
            r13.offset(r11, r14)
            float r11 = r12.centerX()
            float r12 = r13.left
            float r11 = r11 - r12
            h8.j r12 = r4.f309652b
            android.graphics.RectF r13 = r0.f309648g
            android.graphics.RectF r15 = r0.f309649h
            r0.mo147069B(r1, r13)
            r0.mo147069B(r2, r15)
            float r12 = r0.mo147072z(r1, r2, r12)
            float r12 = -r12
            r15.offset(r14, r12)
            float r12 = r13.centerY()
            float r13 = r15.top
            float r12 = r12 - r13
            r13 = r1
            com.google.android.material.floatingactionbutton.FloatingActionButton r13 = (com.google.android.material.floatingactionbutton.FloatingActionButton) r13
            android.graphics.Rect r14 = r0.f309647f
            r13.mo146707f(r14)
            android.graphics.Rect r13 = r0.f309647f
            int r13 = r13.width()
            float r13 = (float) r13
            r14 = 1073741824(0x40000000, float:2.0)
            float r13 = r13 / r14
            h8.h r14 = r4.f309651a
            java.lang.String r15 = "expansion"
            h8.i r14 = r14.mo158568d(r15)
            if (r3 == 0) goto L_0x0220
            if (r30 != 0) goto L_0x01e0
            com.google.android.material.circularreveal.c$d r15 = new com.google.android.material.circularreveal.c$d
            r15.<init>(r11, r12, r13)
            r8.setRevealInfo(r15)
        L_0x01e0:
            if (r30 == 0) goto L_0x01e8
            com.google.android.material.circularreveal.c$d r13 = r8.getRevealInfo()
            float r13 = r13.f309367c
        L_0x01e8:
            r20 = 0
            r21 = 0
            r18 = r11
            r19 = r12
            float r15 = p1142p8.C110191a.m149775a(r18, r19, r20, r21, r22, r23)
            android.animation.Animator r15 = com.google.android.material.circularreveal.C104441a.m139619a(r8, r11, r12, r15)
            com.google.android.material.transformation.c r9 = new com.google.android.material.transformation.c
            r9.<init>(r0, r8)
            r15.addListener(r9)
            long r9 = r14.f323898a
            int r11 = (int) r11
            int r12 = (int) r12
            r0 = 0
            int r18 = (r9 > r0 ? 1 : (r9 == r0 ? 0 : -1))
            if (r18 <= 0) goto L_0x0217
            android.animation.Animator r11 = android.view.ViewAnimationUtils.createCircularReveal(r2, r11, r12, r13, r13)
            r11.setStartDelay(r0)
            r11.setDuration(r9)
            r5.add(r11)
        L_0x0217:
            r22 = r4
            r18 = r6
            r20 = r7
            r0 = r14
            goto L_0x029a
        L_0x0220:
            com.google.android.material.circularreveal.c$d r0 = r8.getRevealInfo()
            float r0 = r0.f309367c
            android.animation.Animator r15 = com.google.android.material.circularreveal.C104441a.m139619a(r8, r11, r12, r13)
            long r9 = r14.f323898a
            int r1 = (int) r11
            int r11 = (int) r12
            r12 = r6
            r20 = r7
            r6 = 0
            int r18 = (r9 > r6 ? 1 : (r9 == r6 ? 0 : -1))
            if (r18 <= 0) goto L_0x0244
            android.animation.Animator r0 = android.view.ViewAnimationUtils.createCircularReveal(r2, r1, r11, r0, r0)
            r0.setStartDelay(r6)
            r0.setDuration(r9)
            r5.add(r0)
        L_0x0244:
            long r9 = r14.f323898a
            long r6 = r14.f323899b
            h8.h r0 = r4.f309651a
            r21 = r15
            u.i<java.lang.String, h8.i> r15 = r0.f323897a
            int r15 = r15.f332583f
            r22 = r4
            r18 = r12
            r3 = 0
            r12 = 0
        L_0x0257:
            if (r12 >= r15) goto L_0x027d
            r19 = r15
            u.i<java.lang.String, h8.i> r15 = r0.f323897a
            java.lang.Object r15 = r15.mo162791l(r12)
            h8.i r15 = (p161h8.C108169i) r15
            r24 = r0
            r23 = r1
            long r0 = r15.f323898a
            r25 = r14
            long r14 = r15.f323899b
            long r0 = r0 + r14
            long r3 = java.lang.Math.max(r3, r0)
            int r12 = r12 + 1
            r15 = r19
            r1 = r23
            r0 = r24
            r14 = r25
            goto L_0x0257
        L_0x027d:
            r23 = r1
            r25 = r14
            long r9 = r9 + r6
            int r0 = (r9 > r3 ? 1 : (r9 == r3 ? 0 : -1))
            if (r0 >= 0) goto L_0x0296
            r0 = r23
            android.animation.Animator r0 = android.view.ViewAnimationUtils.createCircularReveal(r2, r0, r11, r13, r13)
            r0.setStartDelay(r9)
            long r3 = r3 - r9
            r0.setDuration(r3)
            r5.add(r0)
        L_0x0296:
            r15 = r21
            r0 = r25
        L_0x029a:
            r0.mo158572a(r15)
            r5.add(r15)
            l8.a r0 = new l8.a
            r0.<init>(r8)
            r1 = r20
            r1.add(r0)
        L_0x02aa:
            if (r18 != 0) goto L_0x02b1
            r6 = r29
            r3 = r22
            goto L_0x0305
        L_0x02b1:
            r0 = r2
            com.google.android.material.circularreveal.c r0 = (com.google.android.material.circularreveal.C104444c) r0
            java.util.WeakHashMap<android.view.View, e3.a0> r3 = p849e3.C107207u.f320808a
            android.content.res.ColorStateList r3 = p849e3.C107207u.C107213g.m145222g(r27)
            if (r3 == 0) goto L_0x02c9
            int[] r4 = r27.getDrawableState()
            int r6 = r3.getDefaultColor()
            int r3 = r3.getColorForState(r4, r6)
            goto L_0x02ca
        L_0x02c9:
            r3 = 0
        L_0x02ca:
            r4 = 16777215(0xffffff, float:2.3509886E-38)
            r4 = r4 & r3
            r6 = r29
            if (r6 == 0) goto L_0x02e4
            if (r30 != 0) goto L_0x02d7
            r0.setCircularRevealScrimColor(r3)
        L_0x02d7:
            android.util.Property<com.google.android.material.circularreveal.c, java.lang.Integer> r3 = com.google.android.material.circularreveal.C104444c.C104447c.f309364a
            r7 = 1
            int[] r8 = new int[r7]
            r9 = 0
            r8[r9] = r4
            android.animation.ObjectAnimator r0 = android.animation.ObjectAnimator.ofInt(r0, r3, r8)
            goto L_0x02f0
        L_0x02e4:
            r7 = 1
            r9 = 0
            android.util.Property<com.google.android.material.circularreveal.c, java.lang.Integer> r4 = com.google.android.material.circularreveal.C104444c.C104447c.f309364a
            int[] r8 = new int[r7]
            r8[r9] = r3
            android.animation.ObjectAnimator r0 = android.animation.ObjectAnimator.ofInt(r0, r4, r8)
        L_0x02f0:
            h8.c r3 = p161h8.C76146c.f223051a
            r0.setEvaluator(r3)
            r3 = r22
            h8.h r4 = r3.f309651a
            java.lang.String r7 = "color"
            h8.i r4 = r4.mo158568d(r7)
            r4.mo158572a(r0)
            r5.add(r0)
        L_0x0305:
            boolean r0 = r2 instanceof android.view.ViewGroup
            if (r0 != 0) goto L_0x030c
        L_0x0309:
            r9 = 0
            goto L_0x0377
        L_0x030c:
            r4 = 2131309627(0x7f09343b, float:1.8237543E38)
            android.view.View r4 = r2.findViewById(r4)
            r7 = 0
            if (r4 == 0) goto L_0x031e
            boolean r0 = r4 instanceof android.view.ViewGroup
            if (r0 == 0) goto L_0x033c
            r7 = r4
            android.view.ViewGroup r7 = (android.view.ViewGroup) r7
            goto L_0x033c
        L_0x031e:
            boolean r4 = r2 instanceof com.google.android.material.transformation.TransformationChildLayout
            if (r4 != 0) goto L_0x032d
            boolean r4 = r2 instanceof com.google.android.material.transformation.TransformationChildCard
            if (r4 == 0) goto L_0x0327
            goto L_0x032d
        L_0x0327:
            if (r0 == 0) goto L_0x033c
            r7 = r2
            android.view.ViewGroup r7 = (android.view.ViewGroup) r7
            goto L_0x033c
        L_0x032d:
            r0 = r2
            android.view.ViewGroup r0 = (android.view.ViewGroup) r0
            r4 = 0
            android.view.View r0 = r0.getChildAt(r4)
            boolean r4 = r0 instanceof android.view.ViewGroup
            if (r4 == 0) goto L_0x033c
            r7 = r0
            android.view.ViewGroup r7 = (android.view.ViewGroup) r7
        L_0x033c:
            if (r7 != 0) goto L_0x033f
            goto L_0x0309
        L_0x033f:
            if (r6 == 0) goto L_0x035c
            if (r30 != 0) goto L_0x034d
            android.util.Property<android.view.ViewGroup, java.lang.Float> r0 = p161h8.C8495d.f27510a
            r4 = 0
            java.lang.Float r4 = java.lang.Float.valueOf(r4)
            r0.set(r7, r4)
        L_0x034d:
            android.util.Property<android.view.ViewGroup, java.lang.Float> r0 = p161h8.C8495d.f27510a
            r4 = 1
            float[] r4 = new float[r4]
            r8 = 1065353216(0x3f800000, float:1.0)
            r9 = 0
            r4[r9] = r8
            android.animation.ObjectAnimator r0 = android.animation.ObjectAnimator.ofFloat(r7, r0, r4)
            goto L_0x0369
        L_0x035c:
            r4 = 1
            r9 = 0
            android.util.Property<android.view.ViewGroup, java.lang.Float> r0 = p161h8.C8495d.f27510a
            float[] r4 = new float[r4]
            r8 = 0
            r4[r9] = r8
            android.animation.ObjectAnimator r0 = android.animation.ObjectAnimator.ofFloat(r7, r0, r4)
        L_0x0369:
            h8.h r3 = r3.f309651a
            java.lang.String r4 = "contentFade"
            h8.i r3 = r3.mo158568d(r4)
            r3.mo158572a(r0)
            r5.add(r0)
        L_0x0377:
            android.animation.AnimatorSet r0 = new android.animation.AnimatorSet
            r0.<init>()
            p161h8.C108165b.m146494a(r0, r5)
            com.google.android.material.transformation.FabTransformationBehavior$a r3 = new com.google.android.material.transformation.FabTransformationBehavior$a
            r4 = r26
            r5 = r27
            r3.<init>(r4, r6, r2, r5)
            r0.addListener(r3)
            int r2 = r1.size()
            r10 = 0
        L_0x0390:
            if (r10 >= r2) goto L_0x039e
            java.lang.Object r3 = r1.get(r10)
            android.animation.Animator$AnimatorListener r3 = (android.animation.Animator.AnimatorListener) r3
            r0.addListener(r3)
            int r10 = r10 + 1
            goto L_0x0390
        L_0x039e:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.transformation.FabTransformationBehavior.mo844x(android.view.View, android.view.View, boolean, boolean):android.animation.AnimatorSet");
    }

    /* renamed from: y */
    public final float mo147071y(View view, View view2, C108170j jVar) {
        RectF rectF = this.f309648g;
        RectF rectF2 = this.f309649h;
        mo147069B(view, rectF);
        mo147069B(view2, rectF2);
        jVar.getClass();
        return (rectF2.centerX() - rectF.centerX()) + 0.0f;
    }

    /* renamed from: z */
    public final float mo147072z(View view, View view2, C108170j jVar) {
        RectF rectF = this.f309648g;
        RectF rectF2 = this.f309649h;
        mo147069B(view, rectF);
        mo147069B(view2, rectF2);
        jVar.getClass();
        return (rectF2.centerY() - rectF.centerY()) + 0.0f;
    }

    public FabTransformationBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}

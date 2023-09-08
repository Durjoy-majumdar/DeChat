package com.google.android.material.bottomappbar;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Paint;
import android.graphics.Rect;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.Toolbar;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.customview.view.AbsSavedState;
import com.google.android.material.behavior.HideBottomViewOnScrollBehavior;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.tencent.p014mm.C0966R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.WeakHashMap;
import p1114g8.C107764a;
import p1139o8.C109991k;
import p1145q8.C110368a;
import p1157t8.C110938c;
import p1157t8.C110943e;
import p161h8.C108164a;
import p849e3.C107168a0;
import p849e3.C107207u;

public class BottomAppBar extends Toolbar implements CoordinatorLayout.C54199b {

    /* renamed from: W0 */
    public static final /* synthetic */ int f309135W0 = 0;

    /* renamed from: Q0 */
    public Animator f309136Q0;

    /* renamed from: R0 */
    public Animator f309137R0;

    /* renamed from: S0 */
    public int f309138S0;

    /* renamed from: T0 */
    public boolean f309139T0;

    /* renamed from: U0 */
    public boolean f309140U0;

    /* renamed from: V0 */
    public AnimatorListenerAdapter f309141V0;

    /* renamed from: W */
    public final int f309142W;

    /* renamed from: p0 */
    public final C110938c f309143p0;

    /* renamed from: x0 */
    public final C104416f f309144x0;

    /* renamed from: y0 */
    public Animator f309145y0;

    public static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new C104408a();

        /* renamed from: f */
        public int f309147f;

        /* renamed from: g */
        public boolean f309148g;

        /* renamed from: com.google.android.material.bottomappbar.BottomAppBar$SavedState$a */
        public static class C104408a implements Parcelable.ClassLoaderCreator<SavedState> {
            public Object createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new SavedState(parcel, classLoader);
            }

            public Object[] newArray(int i) {
                return new SavedState[i];
            }

            public Object createFromParcel(Parcel parcel) {
                return new SavedState(parcel, (ClassLoader) null);
            }
        }

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeParcelable(this.f306434d, i);
            parcel.writeInt(this.f309147f);
            parcel.writeInt(this.f309148g ? 1 : 0);
        }

        public SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f309147f = parcel.readInt();
            this.f309148g = parcel.readInt() != 0;
        }
    }

    /* renamed from: com.google.android.material.bottomappbar.BottomAppBar$a */
    public class C104409a extends AnimatorListenerAdapter {
        public C104409a() {
        }

        public void onAnimationEnd(Animator animator) {
            BottomAppBar.this.f309137R0 = null;
        }
    }

    /* renamed from: com.google.android.material.bottomappbar.BottomAppBar$b */
    public class C104410b extends AnimatorListenerAdapter {
        public C104410b() {
        }

        public void onAnimationStart(Animator animator) {
            BottomAppBar bottomAppBar = BottomAppBar.this;
            BottomAppBar.m139493r(bottomAppBar, bottomAppBar.f309140U0);
            BottomAppBar bottomAppBar2 = BottomAppBar.this;
            bottomAppBar2.mo146288x(bottomAppBar2.f309138S0, bottomAppBar2.f309140U0);
        }
    }

    public BottomAppBar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C0966R.attr.f2675ck);
    }

    private ActionMenuView getActionMenuView() {
        for (int i = 0; i < getChildCount(); i++) {
            View childAt = getChildAt(i);
            if (childAt instanceof ActionMenuView) {
                return (ActionMenuView) childAt;
            }
        }
        return null;
    }

    private float getFabTranslationX() {
        return (float) mo146285t(this.f309138S0);
    }

    /* access modifiers changed from: private */
    public float getFabTranslationY() {
        return mo146286v(this.f309140U0);
    }

    /* renamed from: r */
    public static void m139493r(BottomAppBar bottomAppBar, boolean z) {
        bottomAppBar.getClass();
        WeakHashMap<View, C107168a0> weakHashMap = C107207u.f320808a;
        if (C107207u.C107211e.m145208c(bottomAppBar)) {
            Animator animator = bottomAppBar.f309145y0;
            if (animator != null) {
                animator.cancel();
            }
            ArrayList arrayList = new ArrayList();
            boolean z2 = z && bottomAppBar.mo146287w();
            if (z2) {
                bottomAppBar.f309144x0.f309164e = bottomAppBar.getFabTranslationX();
            }
            float[] fArr = new float[2];
            fArr[0] = bottomAppBar.f309143p0.f331815u;
            fArr[1] = z2 ? 1.0f : 0.0f;
            ValueAnimator ofFloat = ValueAnimator.ofFloat(fArr);
            ofFloat.addUpdateListener(new C104415e(bottomAppBar));
            ofFloat.setDuration(300);
            arrayList.add(ofFloat);
            FloatingActionButton s = bottomAppBar.mo146277s();
            if (s != null) {
                ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(s, "translationY", new float[]{bottomAppBar.mo146286v(z)});
                ofFloat2.setDuration(300);
                arrayList.add(ofFloat2);
            }
            AnimatorSet animatorSet = new AnimatorSet();
            animatorSet.playTogether(arrayList);
            bottomAppBar.f309145y0 = animatorSet;
            animatorSet.addListener(new C104414d(bottomAppBar));
            bottomAppBar.f309145y0.start();
        }
    }

    public ColorStateList getBackgroundTint() {
        return this.f309143p0.f331800D;
    }

    public CoordinatorLayout.Behavior<BottomAppBar> getBehavior() {
        return new Behavior();
    }

    public float getCradleVerticalOffset() {
        return this.f309144x0.f309163d;
    }

    public int getFabAlignmentMode() {
        return this.f309138S0;
    }

    public float getFabCradleMargin() {
        return this.f309144x0.f309161b;
    }

    public float getFabCradleRoundedCornerRadius() {
        return this.f309144x0.f309160a;
    }

    public boolean getHideOnScroll() {
        return this.f309139T0;
    }

    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        Animator animator = this.f309145y0;
        if (animator != null) {
            animator.cancel();
        }
        Animator animator2 = this.f309137R0;
        if (animator2 != null) {
            animator2.cancel();
        }
        Animator animator3 = this.f309136Q0;
        if (animator3 != null) {
            animator3.cancel();
        }
        mo146289y();
    }

    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.f306434d);
        this.f309138S0 = savedState.f309147f;
        this.f309140U0 = savedState.f309148g;
    }

    public Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.f309147f = this.f309138S0;
        savedState.f309148g = this.f309140U0;
        return savedState;
    }

    /* renamed from: s */
    public final FloatingActionButton mo146277s() {
        if (!(getParent() instanceof CoordinatorLayout)) {
            return null;
        }
        CoordinatorLayout coordinatorLayout = (CoordinatorLayout) getParent();
        List orDefault = coordinatorLayout.f306308e.f330088b.getOrDefault(this, null);
        ((ArrayList) coordinatorLayout.f306310g).clear();
        if (orDefault != null) {
            ((ArrayList) coordinatorLayout.f306310g).addAll(orDefault);
        }
        Iterator it = ((ArrayList) coordinatorLayout.f306310g).iterator();
        while (it.hasNext()) {
            View view = (View) it.next();
            if (view instanceof FloatingActionButton) {
                return (FloatingActionButton) view;
            }
        }
        return null;
    }

    public void setBackgroundTint(ColorStateList colorStateList) {
        this.f309143p0.setTintList(colorStateList);
    }

    public void setCradleVerticalOffset(float f) {
        if (f != getCradleVerticalOffset()) {
            this.f309144x0.f309163d = f;
            this.f309143p0.invalidateSelf();
        }
    }

    public void setFabAlignmentMode(int i) {
        if (this.f309138S0 != i) {
            WeakHashMap<View, C107168a0> weakHashMap = C107207u.f320808a;
            if (C107207u.C107211e.m145208c(this)) {
                Animator animator = this.f309136Q0;
                if (animator != null) {
                    animator.cancel();
                }
                ArrayList arrayList = new ArrayList();
                if (this.f309140U0) {
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{this.f309144x0.f309164e, (float) mo146285t(i)});
                    ofFloat.addUpdateListener(new C104412b(this));
                    ofFloat.setDuration(300);
                    arrayList.add(ofFloat);
                }
                ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(mo146277s(), "translationX", new float[]{(float) mo146285t(i)});
                ofFloat2.setDuration(300);
                arrayList.add(ofFloat2);
                AnimatorSet animatorSet = new AnimatorSet();
                animatorSet.playTogether(arrayList);
                this.f309136Q0 = animatorSet;
                animatorSet.addListener(new C104411a(this));
                this.f309136Q0.start();
            }
        }
        mo146288x(i, this.f309140U0);
        this.f309138S0 = i;
    }

    public void setFabCradleMargin(float f) {
        if (f != getFabCradleMargin()) {
            this.f309144x0.f309161b = f;
            this.f309143p0.invalidateSelf();
        }
    }

    public void setFabCradleRoundedCornerRadius(float f) {
        if (f != getFabCradleRoundedCornerRadius()) {
            this.f309144x0.f309160a = f;
            this.f309143p0.invalidateSelf();
        }
    }

    public void setFabDiameter(int i) {
        float f = (float) i;
        C104416f fVar = this.f309144x0;
        if (f != fVar.f309162c) {
            fVar.f309162c = f;
            this.f309143p0.invalidateSelf();
        }
    }

    public void setHideOnScroll(boolean z) {
        this.f309139T0 = z;
    }

    public void setSubtitle(CharSequence charSequence) {
    }

    public void setTitle(CharSequence charSequence) {
    }

    /* renamed from: t */
    public final int mo146285t(int i) {
        WeakHashMap<View, C107168a0> weakHashMap = C107207u.f320808a;
        int i2 = 1;
        boolean z = C107207u.C107209c.m145195d(this) == 1;
        if (i != 1) {
            return 0;
        }
        int measuredWidth = (getMeasuredWidth() / 2) - this.f309142W;
        if (z) {
            i2 = -1;
        }
        return measuredWidth * i2;
    }

    /* renamed from: v */
    public final float mo146286v(boolean z) {
        FloatingActionButton s = mo146277s();
        if (s == null) {
            return 0.0f;
        }
        Rect rect = new Rect();
        s.mo146707f(rect);
        float height = (float) rect.height();
        if (height == 0.0f) {
            height = (float) s.getMeasuredHeight();
        }
        float height2 = (float) (s.getHeight() - rect.height());
        float height3 = (-getCradleVerticalOffset()) + (height / 2.0f) + ((float) (s.getHeight() - rect.bottom));
        float paddingBottom = height2 - ((float) s.getPaddingBottom());
        float f = (float) (-getMeasuredHeight());
        if (!z) {
            height3 = paddingBottom;
        }
        return f + height3;
    }

    /* renamed from: w */
    public final boolean mo146287w() {
        FloatingActionButton s = mo146277s();
        return s != null && s.mo146729i();
    }

    /* renamed from: x */
    public final void mo146288x(int i, boolean z) {
        WeakHashMap<View, C107168a0> weakHashMap = C107207u.f320808a;
        if (C107207u.C107211e.m145208c(this)) {
            Animator animator = this.f309137R0;
            if (animator != null) {
                animator.cancel();
            }
            ArrayList arrayList = new ArrayList();
            if (!mo146287w()) {
                i = 0;
                z = false;
            }
            ActionMenuView actionMenuView = getActionMenuView();
            if (actionMenuView != null) {
                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(actionMenuView, "alpha", new float[]{1.0f});
                if ((this.f309140U0 || (z && mo146287w())) && (this.f309138S0 == 1 || i == 1)) {
                    ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(actionMenuView, "alpha", new float[]{0.0f});
                    ofFloat2.addListener(new C104413c(this, actionMenuView, i, z));
                    AnimatorSet animatorSet = new AnimatorSet();
                    animatorSet.setDuration(150);
                    animatorSet.playSequentially(new Animator[]{ofFloat2, ofFloat});
                    arrayList.add(animatorSet);
                } else if (actionMenuView.getAlpha() < 1.0f) {
                    arrayList.add(ofFloat);
                }
            }
            AnimatorSet animatorSet2 = new AnimatorSet();
            animatorSet2.playTogether(arrayList);
            this.f309137R0 = animatorSet2;
            animatorSet2.addListener(new C104409a());
            this.f309137R0.start();
        }
    }

    /* renamed from: y */
    public final void mo146289y() {
        this.f309144x0.f309164e = getFabTranslationX();
        FloatingActionButton s = mo146277s();
        C110938c cVar = this.f309143p0;
        cVar.f331815u = (!this.f309140U0 || !mo146287w()) ? 0.0f : 1.0f;
        cVar.invalidateSelf();
        if (s != null) {
            s.setTranslationY(getFabTranslationY());
            s.setTranslationX(getFabTranslationX());
        }
        ActionMenuView actionMenuView = getActionMenuView();
        if (actionMenuView != null) {
            actionMenuView.setAlpha(1.0f);
            if (!mo146287w()) {
                mo146290z(actionMenuView, 0, false);
            } else {
                mo146290z(actionMenuView, this.f309138S0, this.f309140U0);
            }
        }
    }

    /* renamed from: z */
    public final void mo146290z(ActionMenuView actionMenuView, int i, boolean z) {
        WeakHashMap<View, C107168a0> weakHashMap = C107207u.f320808a;
        boolean z2 = C107207u.C107209c.m145195d(this) == 1;
        int i2 = 0;
        for (int i3 = 0; i3 < getChildCount(); i3++) {
            View childAt = getChildAt(i3);
            if ((childAt.getLayoutParams() instanceof Toolbar.LayoutParams) && (((Toolbar.LayoutParams) childAt.getLayoutParams()).f192646a & 8388615) == 8388611) {
                i2 = Math.max(i2, z2 ? childAt.getLeft() : childAt.getRight());
            }
        }
        actionMenuView.setTranslationX((i != 1 || !z) ? 0.0f : (float) (i2 - (z2 ? actionMenuView.getRight() : actionMenuView.getLeft())));
    }

    public static class Behavior extends HideBottomViewOnScrollBehavior<BottomAppBar> {

        /* renamed from: g */
        public final Rect f309146g = new Rect();

        public Behavior() {
        }

        /* JADX WARNING: Code restructure failed: missing block: B:11:0x0056, code lost:
            r0 = r7.f309136Q0;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:7:0x004c, code lost:
            r0 = r7.f309137R0;
         */
        /* renamed from: f */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean mo94960f(androidx.coordinatorlayout.widget.CoordinatorLayout r6, android.view.View r7, int r8) {
            /*
                r5 = this;
                com.google.android.material.bottomappbar.BottomAppBar r7 = (com.google.android.material.bottomappbar.BottomAppBar) r7
                int r0 = com.google.android.material.bottomappbar.BottomAppBar.f309135W0
                com.google.android.material.floatingactionbutton.FloatingActionButton r0 = r7.mo146277s()
                r1 = 0
                if (r0 == 0) goto L_0x0042
                android.view.ViewGroup$LayoutParams r2 = r0.getLayoutParams()
                androidx.coordinatorlayout.widget.CoordinatorLayout$e r2 = (androidx.coordinatorlayout.widget.CoordinatorLayout.C103717e) r2
                r3 = 17
                r2.f306331d = r3
                android.animation.AnimatorListenerAdapter r2 = r7.f309141V0
                r0.mo146733l(r2)
                android.animation.AnimatorListenerAdapter r2 = r7.f309141V0
                r0.mo146734m(r2)
                android.animation.AnimatorListenerAdapter r2 = r7.f309141V0
                r0.mo146704d(r2)
                android.animation.AnimatorListenerAdapter r2 = r7.f309141V0
                r0.mo146706e(r2)
                android.graphics.Rect r2 = r5.f309146g
                int r3 = r0.getMeasuredWidth()
                int r4 = r0.getMeasuredHeight()
                r2.set(r1, r1, r3, r4)
                r0.mo146730j(r2)
                android.graphics.Rect r0 = r5.f309146g
                int r0 = r0.height()
                r7.setFabDiameter(r0)
            L_0x0042:
                android.animation.Animator r0 = r7.f309145y0
                if (r0 == 0) goto L_0x004c
                boolean r0 = r0.isRunning()
                if (r0 != 0) goto L_0x0060
            L_0x004c:
                android.animation.Animator r0 = r7.f309137R0
                if (r0 == 0) goto L_0x0056
                boolean r0 = r0.isRunning()
                if (r0 != 0) goto L_0x0060
            L_0x0056:
                android.animation.Animator r0 = r7.f309136Q0
                if (r0 == 0) goto L_0x0062
                boolean r0 = r0.isRunning()
                if (r0 == 0) goto L_0x0062
            L_0x0060:
                r0 = 1
                goto L_0x0063
            L_0x0062:
                r0 = 0
            L_0x0063:
                if (r0 != 0) goto L_0x0068
                r7.mo146289y()
            L_0x0068:
                r6.mo144913s(r7, r8)
                int r6 = r7.getMeasuredHeight()
                r5.f309118d = r6
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.bottomappbar.BottomAppBar.Behavior.mo94960f(androidx.coordinatorlayout.widget.CoordinatorLayout, android.view.View, int):boolean");
        }

        /* renamed from: s */
        public boolean mo5059s(CoordinatorLayout coordinatorLayout, View view, View view2, View view3, int i, int i2) {
            BottomAppBar bottomAppBar = (BottomAppBar) view;
            return bottomAppBar.getHideOnScroll() && super.mo5059s(coordinatorLayout, bottomAppBar, view2, view3, i, i2);
        }

        /* renamed from: x */
        public void mo146266x(View view) {
            BottomAppBar bottomAppBar = (BottomAppBar) view;
            super.mo146266x(bottomAppBar);
            int i = BottomAppBar.f309135W0;
            FloatingActionButton s = bottomAppBar.mo146277s();
            if (s != null) {
                s.mo146707f(this.f309146g);
                s.clearAnimation();
                s.animate().translationY(((float) (-s.getPaddingBottom())) + ((float) (s.getMeasuredHeight() - this.f309146g.height()))).setInterpolator(C108164a.f323892c).setDuration(175);
            }
        }

        /* renamed from: y */
        public void mo146267y(View view) {
            BottomAppBar bottomAppBar = (BottomAppBar) view;
            super.mo146267y(bottomAppBar);
            int i = BottomAppBar.f309135W0;
            FloatingActionButton s = bottomAppBar.mo146277s();
            if (s != null) {
                s.clearAnimation();
                s.animate().translationY(bottomAppBar.getFabTranslationY()).setInterpolator(C108164a.f323893d).setDuration(225);
            }
        }

        public Behavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }
    }

    public BottomAppBar(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f309140U0 = true;
        this.f309141V0 = new C104410b();
        TypedArray d = C109991k.m149511d(context, attributeSet, C107764a.f322503c, i, C0966R.style.a3q, new int[0]);
        ColorStateList a = C110368a.m150198a(context, d, 0);
        this.f309138S0 = d.getInt(1, 0);
        this.f309139T0 = d.getBoolean(5, false);
        d.recycle();
        this.f309142W = getResources().getDimensionPixelOffset(C0966R.dimen.f357054ah3);
        C104416f fVar = new C104416f((float) d.getDimensionPixelOffset(2, 0), (float) d.getDimensionPixelOffset(3, 0), (float) d.getDimensionPixelOffset(4, 0));
        this.f309144x0 = fVar;
        C110943e eVar = new C110943e();
        eVar.f331837a = fVar;
        C110938c cVar = new C110938c(eVar);
        this.f309143p0 = cVar;
        cVar.f331814t = true;
        cVar.invalidateSelf();
        cVar.f331797A = Paint.Style.FILL;
        cVar.invalidateSelf();
        cVar.setTintList(a);
        WeakHashMap<View, C107168a0> weakHashMap = C107207u.f320808a;
        C107207u.C107208b.m145189q(this, cVar);
    }
}

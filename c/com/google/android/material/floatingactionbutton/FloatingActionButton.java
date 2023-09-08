package com.google.android.material.floatingactionbutton;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Matrix;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.ImageView;
import androidx.appcompat.widget.C103527f;
import androidx.appcompat.widget.C103536h;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.floatingactionbutton.C104453c;
import com.google.android.material.internal.VisibilityAwareImageButton;
import com.google.android.material.stateful.ExtendableSavedState;
import com.tencent.p014mm.C0966R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.WeakHashMap;
import p1042u.C111059i;
import p1114g8.C107764a;
import p1133m8.C109534a;
import p1133m8.C109535b;
import p1138n8.C109693a;
import p1138n8.C109694b;
import p1139o8.C109965a;
import p1139o8.C109970d;
import p1139o8.C109991k;
import p1139o8.C109992l;
import p1145q8.C110368a;
import p1153s8.C110776b;
import p1162x2.C112019a;
import p161h8.C108168h;
import p849e3.C107168a0;
import p849e3.C107207u;

@CoordinatorLayout.C103715c(Behavior.class)
public class FloatingActionButton extends VisibilityAwareImageButton implements C109534a {

    /* renamed from: e */
    public ColorStateList f309370e;

    /* renamed from: f */
    public PorterDuff.Mode f309371f;

    /* renamed from: g */
    public ColorStateList f309372g;

    /* renamed from: h */
    public PorterDuff.Mode f309373h;

    /* renamed from: i */
    public int f309374i;

    /* renamed from: j */
    public ColorStateList f309375j;

    /* renamed from: n */
    public int f309376n;

    /* renamed from: o */
    public int f309377o;

    /* renamed from: p */
    public int f309378p;

    /* renamed from: q */
    public int f309379q;

    /* renamed from: r */
    public boolean f309380r;

    /* renamed from: s */
    public final Rect f309381s;

    /* renamed from: t */
    public final Rect f309382t;

    /* renamed from: u */
    public final C103536h f309383u;

    /* renamed from: v */
    public final C109535b f309384v;

    /* renamed from: w */
    public C104453c f309385w;

    public static class Behavior extends BaseBehavior<FloatingActionButton> {
        public Behavior() {
        }

        public Behavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }
    }

    /* renamed from: com.google.android.material.floatingactionbutton.FloatingActionButton$a */
    public static abstract class C104449a {
    }

    /* renamed from: com.google.android.material.floatingactionbutton.FloatingActionButton$b */
    public class C104450b implements C110776b {
        public C104450b() {
        }
    }

    public FloatingActionButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C0966R.attr.f2822mx);
    }

    private C104453c getImpl() {
        if (this.f309385w == null) {
            this.f309385w = new C109694b(this, new C104450b());
        }
        return this.f309385w;
    }

    /* renamed from: n */
    public static int m139640n(int i, int i2) {
        int mode = View.MeasureSpec.getMode(i2);
        int size = View.MeasureSpec.getSize(i2);
        if (mode == Integer.MIN_VALUE) {
            return Math.min(i, size);
        }
        if (mode == 0) {
            return i;
        }
        if (mode == 1073741824) {
            return size;
        }
        throw new IllegalArgumentException();
    }

    /* renamed from: a */
    public boolean mo146703a() {
        return this.f309384v.f327844b;
    }

    /* renamed from: d */
    public void mo146704d(Animator.AnimatorListener animatorListener) {
        C104453c impl = getImpl();
        if (impl.f309418r == null) {
            impl.f309418r = new ArrayList<>();
        }
        impl.f309418r.add(animatorListener);
    }

    public void drawableStateChanged() {
        super.drawableStateChanged();
        getImpl().mo146786j(getDrawableState());
    }

    /* renamed from: e */
    public void mo146706e(Animator.AnimatorListener animatorListener) {
        C104453c impl = getImpl();
        if (impl.f309417q == null) {
            impl.f309417q = new ArrayList<>();
        }
        impl.f309417q.add(animatorListener);
    }

    @Deprecated
    /* renamed from: f */
    public boolean mo146707f(Rect rect) {
        WeakHashMap<View, C107168a0> weakHashMap = C107207u.f320808a;
        if (!C107207u.C107211e.m145208c(this)) {
            return false;
        }
        rect.set(0, 0, getWidth(), getHeight());
        mo146730j(rect);
        return true;
    }

    /* renamed from: g */
    public final int mo146708g(int i) {
        int i2 = this.f309377o;
        if (i2 != 0) {
            return i2;
        }
        Resources resources = getResources();
        return i != -1 ? i != 1 ? resources.getDimensionPixelSize(C0966R.dimen.a0p) : resources.getDimensionPixelSize(C0966R.dimen.a0o) : Math.max(resources.getConfiguration().screenWidthDp, resources.getConfiguration().screenHeightDp) < 470 ? mo146708g(1) : mo146708g(0);
    }

    public ColorStateList getBackgroundTintList() {
        return this.f309370e;
    }

    public PorterDuff.Mode getBackgroundTintMode() {
        return this.f309371f;
    }

    public float getCompatElevation() {
        return getImpl().mo146781e();
    }

    public float getCompatHoveredFocusedTranslationZ() {
        return getImpl().f309413m;
    }

    public float getCompatPressedTranslationZ() {
        return getImpl().f309414n;
    }

    public Drawable getContentBackground() {
        return getImpl().f309411k;
    }

    public int getCustomSize() {
        return this.f309377o;
    }

    public int getExpandedComponentIdHint() {
        return this.f309384v.f327845c;
    }

    public C108168h getHideMotionSpec() {
        return getImpl().f309404d;
    }

    @Deprecated
    public int getRippleColor() {
        ColorStateList colorStateList = this.f309375j;
        if (colorStateList != null) {
            return colorStateList.getDefaultColor();
        }
        return 0;
    }

    public ColorStateList getRippleColorStateList() {
        return this.f309375j;
    }

    public C108168h getShowMotionSpec() {
        return getImpl().f309403c;
    }

    public int getSize() {
        return this.f309376n;
    }

    public int getSizeDimension() {
        return mo146708g(this.f309376n);
    }

    public ColorStateList getSupportBackgroundTintList() {
        return getBackgroundTintList();
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        return getBackgroundTintMode();
    }

    public ColorStateList getSupportImageTintList() {
        return this.f309372g;
    }

    public PorterDuff.Mode getSupportImageTintMode() {
        return this.f309373h;
    }

    public boolean getUseCompatPadding() {
        return this.f309380r;
    }

    /* renamed from: h */
    public void mo146728h(C104449a aVar, boolean z) {
        C104453c impl = getImpl();
        boolean z2 = false;
        if (!(impl.f309419s.getVisibility() != 0 ? impl.f309401a != 2 : impl.f309401a == 1)) {
            Animator animator = impl.f309402b;
            if (animator != null) {
                animator.cancel();
            }
            VisibilityAwareImageButton visibilityAwareImageButton = impl.f309419s;
            WeakHashMap<View, C107168a0> weakHashMap = C107207u.f320808a;
            if (C107207u.C107211e.m145208c(visibilityAwareImageButton) && !impl.f309419s.isInEditMode()) {
                z2 = true;
            }
            if (z2) {
                C108168h hVar = impl.f309404d;
                if (hVar == null) {
                    if (impl.f309406f == null) {
                        impl.f309406f = C108168h.m146496b(impl.f309419s.getContext(), C0966R.animator.f2547c);
                    }
                    hVar = impl.f309406f;
                }
                AnimatorSet b = impl.mo146778b(hVar, 0.0f, 0.0f, 0.0f);
                b.addListener(new C104451a(impl, z, (C104453c.C104457d) null));
                ArrayList<Animator.AnimatorListener> arrayList = impl.f309418r;
                if (arrayList != null) {
                    Iterator<Animator.AnimatorListener> it = arrayList.iterator();
                    while (it.hasNext()) {
                        b.addListener(it.next());
                    }
                }
                b.start();
                return;
            }
            impl.f309419s.mo146842b(z ? 8 : 4, z);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:4:0x0013 A[RETURN, SYNTHETIC] */
    /* renamed from: i */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo146729i() {
        /*
            r4 = this;
            com.google.android.material.floatingactionbutton.c r0 = r4.getImpl()
            com.google.android.material.internal.VisibilityAwareImageButton r1 = r0.f309419s
            int r1 = r1.getVisibility()
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L_0x0015
            int r0 = r0.f309401a
            r1 = 2
            if (r0 != r1) goto L_0x001a
        L_0x0013:
            r2 = 1
            goto L_0x001a
        L_0x0015:
            int r0 = r0.f309401a
            if (r0 == r3) goto L_0x001a
            goto L_0x0013
        L_0x001a:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.floatingactionbutton.FloatingActionButton.mo146729i():boolean");
    }

    /* renamed from: j */
    public final void mo146730j(Rect rect) {
        int i = rect.left;
        Rect rect2 = this.f309381s;
        rect.left = i + rect2.left;
        rect.top += rect2.top;
        rect.right -= rect2.right;
        rect.bottom -= rect2.bottom;
    }

    public void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        getImpl().mo146783g();
    }

    /* renamed from: k */
    public final void mo146732k() {
        Drawable drawable = getDrawable();
        if (drawable != null) {
            ColorStateList colorStateList = this.f309372g;
            if (colorStateList == null) {
                C112019a.m152743a(drawable);
                return;
            }
            int colorForState = colorStateList.getColorForState(getDrawableState(), 0);
            PorterDuff.Mode mode = this.f309373h;
            if (mode == null) {
                mode = PorterDuff.Mode.SRC_IN;
            }
            drawable.mutate().setColorFilter(C103527f.m137546j(colorForState, mode));
        }
    }

    /* renamed from: l */
    public void mo146733l(Animator.AnimatorListener animatorListener) {
        ArrayList<Animator.AnimatorListener> arrayList = getImpl().f309418r;
        if (arrayList != null) {
            arrayList.remove(animatorListener);
        }
    }

    /* renamed from: m */
    public void mo146734m(Animator.AnimatorListener animatorListener) {
        ArrayList<Animator.AnimatorListener> arrayList = getImpl().f309417q;
        if (arrayList != null) {
            arrayList.remove(animatorListener);
        }
    }

    /* renamed from: o */
    public void mo146735o(C104449a aVar, boolean z) {
        C104453c impl = getImpl();
        boolean z2 = true;
        if (!(impl.f309419s.getVisibility() == 0 ? impl.f309401a != 1 : impl.f309401a == 2)) {
            Animator animator = impl.f309402b;
            if (animator != null) {
                animator.cancel();
            }
            VisibilityAwareImageButton visibilityAwareImageButton = impl.f309419s;
            WeakHashMap<View, C107168a0> weakHashMap = C107207u.f320808a;
            if (!C107207u.C107211e.m145208c(visibilityAwareImageButton) || impl.f309419s.isInEditMode()) {
                z2 = false;
            }
            if (z2) {
                if (impl.f309419s.getVisibility() != 0) {
                    impl.f309419s.setAlpha(0.0f);
                    impl.f309419s.setScaleY(0.0f);
                    impl.f309419s.setScaleX(0.0f);
                    impl.f309416p = 0.0f;
                    Matrix matrix = impl.f309424x;
                    impl.mo146777a(0.0f, matrix);
                    impl.f309419s.setImageMatrix(matrix);
                }
                C108168h hVar = impl.f309403c;
                if (hVar == null) {
                    if (impl.f309405e == null) {
                        impl.f309405e = C108168h.m146496b(impl.f309419s.getContext(), C0966R.animator.f2548d);
                    }
                    hVar = impl.f309405e;
                }
                AnimatorSet b = impl.mo146778b(hVar, 1.0f, 1.0f, 1.0f);
                b.addListener(new C104452b(impl, z, (C104453c.C104457d) null));
                ArrayList<Animator.AnimatorListener> arrayList = impl.f309417q;
                if (arrayList != null) {
                    Iterator<Animator.AnimatorListener> it = arrayList.iterator();
                    while (it.hasNext()) {
                        b.addListener(it.next());
                    }
                }
                b.start();
                return;
            }
            impl.f309419s.mo146842b(0, z);
            impl.f309419s.setAlpha(1.0f);
            impl.f309419s.setScaleY(1.0f);
            impl.f309419s.setScaleX(1.0f);
            impl.f309416p = 1.0f;
            Matrix matrix2 = impl.f309424x;
            impl.mo146777a(1.0f, matrix2);
            impl.f309419s.setImageMatrix(matrix2);
        }
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        C104453c impl = getImpl();
        impl.getClass();
        if (!(impl instanceof C109694b)) {
            if (impl.f309425y == null) {
                impl.f309425y = new C109693a(impl);
            }
            impl.f309419s.getViewTreeObserver().addOnPreDrawListener(impl.f309425y);
        }
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        C104453c impl = getImpl();
        if (impl.f309425y != null) {
            impl.f309419s.getViewTreeObserver().removeOnPreDrawListener(impl.f309425y);
            impl.f309425y = null;
        }
    }

    public void onMeasure(int i, int i2) {
        int sizeDimension = getSizeDimension();
        this.f309378p = (sizeDimension - this.f309379q) / 2;
        getImpl().mo146791o();
        int min = Math.min(m139640n(sizeDimension, i), m139640n(sizeDimension, i2));
        Rect rect = this.f309381s;
        setMeasuredDimension(rect.left + min + rect.right, min + rect.top + rect.bottom);
    }

    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof ExtendableSavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        ExtendableSavedState extendableSavedState = (ExtendableSavedState) parcelable;
        super.onRestoreInstanceState(extendableSavedState.f306434d);
        C109535b bVar = this.f309384v;
        Bundle orDefault = extendableSavedState.f309476f.getOrDefault("expandableWidgetHelper", null);
        bVar.getClass();
        bVar.f327844b = orDefault.getBoolean("expanded", false);
        bVar.f327845c = orDefault.getInt("expandedComponentIdHint", 0);
        if (bVar.f327844b) {
            ViewParent parent = bVar.f327843a.getParent();
            if (parent instanceof CoordinatorLayout) {
                ((CoordinatorLayout) parent).mo144887h(bVar.f327843a);
            }
        }
    }

    public Parcelable onSaveInstanceState() {
        ExtendableSavedState extendableSavedState = new ExtendableSavedState(super.onSaveInstanceState());
        C111059i<String, Bundle> iVar = extendableSavedState.f309476f;
        C109535b bVar = this.f309384v;
        bVar.getClass();
        Bundle bundle = new Bundle();
        bundle.putBoolean("expanded", bVar.f327844b);
        bundle.putInt("expandedComponentIdHint", bVar.f327845c);
        iVar.put("expandableWidgetHelper", bundle);
        return extendableSavedState;
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() != 0 || !mo146707f(this.f309382t) || this.f309382t.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
            return super.onTouchEvent(motionEvent);
        }
        return false;
    }

    public void setBackgroundColor(int i) {
    }

    public void setBackgroundDrawable(Drawable drawable) {
    }

    public void setBackgroundResource(int i) {
    }

    public void setBackgroundTintList(ColorStateList colorStateList) {
        if (this.f309370e != colorStateList) {
            this.f309370e = colorStateList;
            C104453c impl = getImpl();
            Drawable drawable = impl.f309408h;
            if (drawable != null) {
                drawable.setTintList(colorStateList);
            }
            C109965a aVar = impl.f309410j;
            if (aVar != null) {
                if (colorStateList != null) {
                    aVar.f329073k = colorStateList.getColorForState(aVar.getState(), aVar.f329073k);
                }
                aVar.f329072j = colorStateList;
                aVar.f329074l = true;
                aVar.invalidateSelf();
            }
        }
    }

    public void setBackgroundTintMode(PorterDuff.Mode mode) {
        if (this.f309371f != mode) {
            this.f309371f = mode;
            Drawable drawable = getImpl().f309408h;
            if (drawable != null) {
                drawable.setTintMode(mode);
            }
        }
    }

    public void setCompatElevation(float f) {
        C104453c impl = getImpl();
        if (impl.f309412l != f) {
            impl.f309412l = f;
            impl.mo146787k(f, impl.f309413m, impl.f309414n);
        }
    }

    public void setCompatElevationResource(int i) {
        setCompatElevation(getResources().getDimension(i));
    }

    public void setCompatHoveredFocusedTranslationZ(float f) {
        C104453c impl = getImpl();
        if (impl.f309413m != f) {
            impl.f309413m = f;
            impl.mo146787k(impl.f309412l, f, impl.f309414n);
        }
    }

    public void setCompatHoveredFocusedTranslationZResource(int i) {
        setCompatHoveredFocusedTranslationZ(getResources().getDimension(i));
    }

    public void setCompatPressedTranslationZ(float f) {
        C104453c impl = getImpl();
        if (impl.f309414n != f) {
            impl.f309414n = f;
            impl.mo146787k(impl.f309412l, impl.f309413m, f);
        }
    }

    public void setCompatPressedTranslationZResource(int i) {
        setCompatPressedTranslationZ(getResources().getDimension(i));
    }

    public void setCustomSize(int i) {
        if (i >= 0) {
            this.f309377o = i;
            return;
        }
        throw new IllegalArgumentException("Custom size must be non-negative");
    }

    public void setExpandedComponentIdHint(int i) {
        this.f309384v.f327845c = i;
    }

    public void setHideMotionSpec(C108168h hVar) {
        getImpl().f309404d = hVar;
    }

    public void setHideMotionSpecResource(int i) {
        setHideMotionSpec(C108168h.m146496b(getContext(), i));
    }

    public void setImageDrawable(Drawable drawable) {
        super.setImageDrawable(drawable);
        C104453c impl = getImpl();
        float f = impl.f309416p;
        impl.f309416p = f;
        Matrix matrix = impl.f309424x;
        impl.mo146777a(f, matrix);
        impl.f309419s.setImageMatrix(matrix);
    }

    public void setImageResource(int i) {
        this.f309383u.mo144347c(i);
    }

    public void setRippleColor(int i) {
        setRippleColor(ColorStateList.valueOf(i));
    }

    public void setShowMotionSpec(C108168h hVar) {
        getImpl().f309403c = hVar;
    }

    public void setShowMotionSpecResource(int i) {
        setShowMotionSpec(C108168h.m146496b(getContext(), i));
    }

    public void setSize(int i) {
        this.f309377o = 0;
        if (i != this.f309376n) {
            this.f309376n = i;
            requestLayout();
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        setBackgroundTintList(colorStateList);
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        setBackgroundTintMode(mode);
    }

    public void setSupportImageTintList(ColorStateList colorStateList) {
        if (this.f309372g != colorStateList) {
            this.f309372g = colorStateList;
            mo146732k();
        }
    }

    public void setSupportImageTintMode(PorterDuff.Mode mode) {
        if (this.f309373h != mode) {
            this.f309373h = mode;
            mo146732k();
        }
    }

    public void setUseCompatPadding(boolean z) {
        if (this.f309380r != z) {
            this.f309380r = z;
            getImpl().mo146785i();
        }
    }

    public static class BaseBehavior<T extends FloatingActionButton> extends CoordinatorLayout.Behavior<T> {

        /* renamed from: d */
        public Rect f309386d;

        /* renamed from: e */
        public boolean f309387e;

        public BaseBehavior() {
            this.f309387e = true;
        }

        /* renamed from: a */
        public boolean mo144925a(CoordinatorLayout coordinatorLayout, View view, Rect rect) {
            FloatingActionButton floatingActionButton = (FloatingActionButton) view;
            Rect rect2 = floatingActionButton.f309381s;
            rect.set(floatingActionButton.getLeft() + rect2.left, floatingActionButton.getTop() + rect2.top, floatingActionButton.getRight() - rect2.right, floatingActionButton.getBottom() - rect2.bottom);
            return true;
        }

        /* renamed from: c */
        public void mo144926c(CoordinatorLayout.C103717e eVar) {
            if (eVar.f306335h == 0) {
                eVar.f306335h = 80;
            }
        }

        /* renamed from: d */
        public boolean mo133275d(CoordinatorLayout coordinatorLayout, View view, View view2) {
            FloatingActionButton floatingActionButton = (FloatingActionButton) view;
            if (view2 instanceof AppBarLayout) {
                mo146770x(coordinatorLayout, (AppBarLayout) view2, floatingActionButton);
            } else {
                ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
                if (layoutParams instanceof CoordinatorLayout.C103717e ? ((CoordinatorLayout.C103717e) layoutParams).f306328a instanceof BottomSheetBehavior : false) {
                    mo146771y(view2, floatingActionButton);
                }
            }
            return false;
        }

        /* renamed from: f */
        public boolean mo94960f(CoordinatorLayout coordinatorLayout, View view, int i) {
            FloatingActionButton floatingActionButton = (FloatingActionButton) view;
            ArrayList arrayList = (ArrayList) coordinatorLayout.mo144889l(floatingActionButton);
            int size = arrayList.size();
            int i2 = 0;
            for (int i3 = 0; i3 < size; i3++) {
                View view2 = (View) arrayList.get(i3);
                if (!(view2 instanceof AppBarLayout)) {
                    ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
                    if ((layoutParams instanceof CoordinatorLayout.C103717e ? ((CoordinatorLayout.C103717e) layoutParams).f306328a instanceof BottomSheetBehavior : false) && mo146771y(view2, floatingActionButton)) {
                        break;
                    }
                } else if (mo146770x(coordinatorLayout, (AppBarLayout) view2, floatingActionButton)) {
                    break;
                }
            }
            coordinatorLayout.mo144913s(floatingActionButton, i);
            Rect rect = floatingActionButton.f309381s;
            if (rect == null || rect.centerX() <= 0 || rect.centerY() <= 0) {
                return true;
            }
            CoordinatorLayout.C103717e eVar = (CoordinatorLayout.C103717e) floatingActionButton.getLayoutParams();
            int i4 = floatingActionButton.getRight() >= coordinatorLayout.getWidth() - eVar.rightMargin ? rect.right : floatingActionButton.getLeft() <= eVar.leftMargin ? -rect.left : 0;
            if (floatingActionButton.getBottom() >= coordinatorLayout.getHeight() - eVar.bottomMargin) {
                i2 = rect.bottom;
            } else if (floatingActionButton.getTop() <= eVar.topMargin) {
                i2 = -rect.top;
            }
            if (i2 != 0) {
                C107207u.m145166g(floatingActionButton, i2);
            }
            if (i4 == 0) {
                return true;
            }
            C107207u.m145165f(floatingActionButton, i4);
            return true;
        }

        /* renamed from: w */
        public final boolean mo146769w(View view, FloatingActionButton floatingActionButton) {
            return this.f309387e && ((CoordinatorLayout.C103717e) floatingActionButton.getLayoutParams()).f306333f == view.getId() && floatingActionButton.getUserSetVisibility() == 0;
        }

        /* renamed from: x */
        public final boolean mo146770x(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, FloatingActionButton floatingActionButton) {
            if (!mo146769w(appBarLayout, floatingActionButton)) {
                return false;
            }
            if (this.f309386d == null) {
                this.f309386d = new Rect();
            }
            Rect rect = this.f309386d;
            C109970d.m149490a(coordinatorLayout, appBarLayout, rect);
            if (rect.bottom <= appBarLayout.getMinimumHeightForVisibleOverlappingContent()) {
                floatingActionButton.mo146728h((C104449a) null, false);
                return true;
            }
            floatingActionButton.mo146735o((C104449a) null, false);
            return true;
        }

        /* renamed from: y */
        public final boolean mo146771y(View view, FloatingActionButton floatingActionButton) {
            if (!mo146769w(view, floatingActionButton)) {
                return false;
            }
            if (view.getTop() < (floatingActionButton.getHeight() / 2) + ((CoordinatorLayout.C103717e) floatingActionButton.getLayoutParams()).topMargin) {
                floatingActionButton.mo146728h((C104449a) null, false);
                return true;
            }
            floatingActionButton.mo146735o((C104449a) null, false);
            return true;
        }

        public BaseBehavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C107764a.f322511k);
            this.f309387e = obtainStyledAttributes.getBoolean(0, true);
            obtainStyledAttributes.recycle();
        }
    }

    public FloatingActionButton(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f309381s = new Rect();
        this.f309382t = new Rect();
        TypedArray d = C109991k.m149511d(context, attributeSet, C107764a.f322510j, i, C0966R.style.a3k, new int[0]);
        this.f309370e = C110368a.m150198a(context, d, 0);
        this.f309371f = C109992l.m149512a(d.getInt(1, -1), (PorterDuff.Mode) null);
        this.f309375j = C110368a.m150198a(context, d, 10);
        this.f309376n = d.getInt(5, -1);
        this.f309377o = d.getDimensionPixelSize(4, 0);
        this.f309374i = d.getDimensionPixelSize(2, 0);
        float dimension = d.getDimension(3, 0.0f);
        float dimension2 = d.getDimension(7, 0.0f);
        float dimension3 = d.getDimension(9, 0.0f);
        this.f309380r = d.getBoolean(12, false);
        this.f309379q = d.getDimensionPixelSize(8, 0);
        C108168h a = C108168h.m146495a(context, d, 11);
        C108168h a2 = C108168h.m146495a(context, d, 6);
        d.recycle();
        C103536h hVar = new C103536h(this);
        this.f309383u = hVar;
        hVar.mo144346b(attributeSet, i);
        this.f309384v = new C109535b(this);
        getImpl().mo146789m(this.f309370e, this.f309371f, this.f309375j, this.f309374i);
        C104453c impl = getImpl();
        if (impl.f309412l != dimension) {
            impl.f309412l = dimension;
            impl.mo146787k(dimension, impl.f309413m, impl.f309414n);
        }
        C104453c impl2 = getImpl();
        if (impl2.f309413m != dimension2) {
            impl2.f309413m = dimension2;
            impl2.mo146787k(impl2.f309412l, dimension2, impl2.f309414n);
        }
        C104453c impl3 = getImpl();
        if (impl3.f309414n != dimension3) {
            impl3.f309414n = dimension3;
            impl3.mo146787k(impl3.f309412l, impl3.f309413m, dimension3);
        }
        C104453c impl4 = getImpl();
        int i2 = this.f309379q;
        if (impl4.f309415o != i2) {
            impl4.f309415o = i2;
            float f = impl4.f309416p;
            impl4.f309416p = f;
            Matrix matrix = impl4.f309424x;
            impl4.mo146777a(f, matrix);
            impl4.f309419s.setImageMatrix(matrix);
        }
        getImpl().f309403c = a;
        getImpl().f309404d = a2;
        setScaleType(ImageView.ScaleType.MATRIX);
    }

    public void setRippleColor(ColorStateList colorStateList) {
        if (this.f309375j != colorStateList) {
            this.f309375j = colorStateList;
            getImpl().mo146790n(this.f309375j);
        }
    }
}

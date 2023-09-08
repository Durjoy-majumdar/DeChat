package com.google.android.material.appbar;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import androidx.appcompat.widget.Toolbar;
import com.google.android.material.appbar.AppBarLayout;
import com.tencent.p014mm.C0966R;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.WeakHashMap;
import p1114g8.C107764a;
import p1139o8.C109969c;
import p1139o8.C109970d;
import p1139o8.C109991k;
import p1162x2.C112019a;
import p161h8.C108164a;
import p282z2.C16095a;
import p385u2.C111105a;
import p849e3.C107168a0;
import p849e3.C107179f0;
import p849e3.C107204q;
import p849e3.C107207u;

public class CollapsingToolbarLayout extends FrameLayout {

    /* renamed from: A */
    public AppBarLayout.C67445c f309066A;

    /* renamed from: B */
    public int f309067B;

    /* renamed from: C */
    public C107179f0 f309068C;

    /* renamed from: d */
    public boolean f309069d;

    /* renamed from: e */
    public int f309070e;

    /* renamed from: f */
    public Toolbar f309071f;

    /* renamed from: g */
    public View f309072g;

    /* renamed from: h */
    public View f309073h;

    /* renamed from: i */
    public int f309074i;

    /* renamed from: j */
    public int f309075j;

    /* renamed from: n */
    public int f309076n;

    /* renamed from: o */
    public int f309077o;

    /* renamed from: p */
    public final Rect f309078p;

    /* renamed from: q */
    public final C109969c f309079q;

    /* renamed from: r */
    public boolean f309080r;

    /* renamed from: s */
    public boolean f309081s;

    /* renamed from: t */
    public Drawable f309082t;

    /* renamed from: u */
    public Drawable f309083u;

    /* renamed from: v */
    public int f309084v;

    /* renamed from: w */
    public boolean f309085w;

    /* renamed from: x */
    public ValueAnimator f309086x;

    /* renamed from: y */
    public long f309087y;

    /* renamed from: z */
    public int f309088z;

    /* renamed from: com.google.android.material.appbar.CollapsingToolbarLayout$a */
    public class C104398a implements C107204q {
        public C104398a() {
        }

        /* renamed from: a */
        public C107179f0 mo12075a(View view, C107179f0 f0Var) {
            CollapsingToolbarLayout collapsingToolbarLayout = CollapsingToolbarLayout.this;
            collapsingToolbarLayout.getClass();
            WeakHashMap<View, C107168a0> weakHashMap = C107207u.f320808a;
            C107179f0 f0Var2 = C107207u.C107208b.m145174b(collapsingToolbarLayout) ? f0Var : null;
            if (!Objects.equals(collapsingToolbarLayout.f309068C, f0Var2)) {
                collapsingToolbarLayout.f309068C = f0Var2;
                collapsingToolbarLayout.requestLayout();
            }
            return f0Var.f320766a.mo157654c();
        }
    }

    /* renamed from: com.google.android.material.appbar.CollapsingToolbarLayout$b */
    public class C104399b implements AppBarLayout.C67445c {
        public C104399b() {
        }

        /* renamed from: a */
        public void mo3128a(AppBarLayout appBarLayout, int i) {
            CollapsingToolbarLayout collapsingToolbarLayout = CollapsingToolbarLayout.this;
            collapsingToolbarLayout.f309067B = i;
            C107179f0 f0Var = collapsingToolbarLayout.f309068C;
            int d = f0Var != null ? f0Var.mo157632d() : 0;
            int childCount = CollapsingToolbarLayout.this.getChildCount();
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = CollapsingToolbarLayout.this.getChildAt(i2);
                LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
                C104403c b = CollapsingToolbarLayout.m139448b(childAt);
                int i3 = layoutParams.f309089a;
                if (i3 == 1) {
                    CollapsingToolbarLayout collapsingToolbarLayout2 = CollapsingToolbarLayout.this;
                    collapsingToolbarLayout2.getClass();
                    b.mo146263a(C16095a.m14980b(-i, 0, ((collapsingToolbarLayout2.getHeight() - CollapsingToolbarLayout.m139448b(childAt).f309114b) - childAt.getHeight()) - ((LayoutParams) childAt.getLayoutParams()).bottomMargin));
                } else if (i3 == 2) {
                    b.mo146263a(Math.round(((float) (-i)) * layoutParams.f309090b));
                }
            }
            CollapsingToolbarLayout.this.mo146200d();
            CollapsingToolbarLayout collapsingToolbarLayout3 = CollapsingToolbarLayout.this;
            if (collapsingToolbarLayout3.f309083u != null && d > 0) {
                WeakHashMap<View, C107168a0> weakHashMap = C107207u.f320808a;
                C107207u.C107208b.m145183k(collapsingToolbarLayout3);
            }
            int height = CollapsingToolbarLayout.this.getHeight();
            CollapsingToolbarLayout collapsingToolbarLayout4 = CollapsingToolbarLayout.this;
            WeakHashMap<View, C107168a0> weakHashMap2 = C107207u.f320808a;
            CollapsingToolbarLayout.this.f309079q.mo161315n(((float) Math.abs(i)) / ((float) ((height - C107207u.C107208b.m145176d(collapsingToolbarLayout4)) - d)));
        }
    }

    public CollapsingToolbarLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* renamed from: b */
    public static C104403c m139448b(View view) {
        C104403c cVar = (C104403c) view.getTag(C0966R.C0970id.l8h);
        if (cVar != null) {
            return cVar;
        }
        C104403c cVar2 = new C104403c(view);
        view.setTag(C0966R.C0970id.l8h, cVar2);
        return cVar2;
    }

    /* JADX WARNING: type inference failed for: r4v0, types: [android.view.View] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo146197a() {
        /*
            r6 = this;
            boolean r0 = r6.f309069d
            if (r0 != 0) goto L_0x0005
            return
        L_0x0005:
            r0 = 0
            r6.f309071f = r0
            r6.f309072g = r0
            int r1 = r6.f309070e
            r2 = -1
            if (r1 == r2) goto L_0x002f
            android.view.View r1 = r6.findViewById(r1)
            androidx.appcompat.widget.Toolbar r1 = (androidx.appcompat.widget.Toolbar) r1
            r6.f309071f = r1
            if (r1 == 0) goto L_0x002f
            android.view.ViewParent r2 = r1.getParent()
        L_0x001d:
            if (r2 == r6) goto L_0x002d
            if (r2 == 0) goto L_0x002d
            boolean r3 = r2 instanceof android.view.View
            if (r3 == 0) goto L_0x0028
            r1 = r2
            android.view.View r1 = (android.view.View) r1
        L_0x0028:
            android.view.ViewParent r2 = r2.getParent()
            goto L_0x001d
        L_0x002d:
            r6.f309072g = r1
        L_0x002f:
            androidx.appcompat.widget.Toolbar r1 = r6.f309071f
            r2 = 0
            if (r1 != 0) goto L_0x004c
            int r1 = r6.getChildCount()
            r3 = 0
        L_0x0039:
            if (r3 >= r1) goto L_0x004a
            android.view.View r4 = r6.getChildAt(r3)
            boolean r5 = r4 instanceof androidx.appcompat.widget.Toolbar
            if (r5 == 0) goto L_0x0047
            r0 = r4
            androidx.appcompat.widget.Toolbar r0 = (androidx.appcompat.widget.Toolbar) r0
            goto L_0x004a
        L_0x0047:
            int r3 = r3 + 1
            goto L_0x0039
        L_0x004a:
            r6.f309071f = r0
        L_0x004c:
            r6.mo146198c()
            r6.f309069d = r2
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.appbar.CollapsingToolbarLayout.mo146197a():void");
    }

    /* renamed from: c */
    public final void mo146198c() {
        View view;
        if (!this.f309080r && (view = this.f309073h) != null) {
            ViewParent parent = view.getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(this.f309073h);
            }
        }
        if (this.f309080r && this.f309071f != null) {
            if (this.f309073h == null) {
                this.f309073h = new View(getContext());
            }
            if (this.f309073h.getParent() == null) {
                this.f309071f.addView(this.f309073h, -1, -1);
            }
        }
    }

    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof LayoutParams;
    }

    /* renamed from: d */
    public final void mo146200d() {
        if (this.f309082t != null || this.f309083u != null) {
            setScrimsShown(getHeight() + this.f309067B < getScrimVisibleHeightTrigger());
        }
    }

    public void draw(Canvas canvas) {
        Drawable drawable;
        super.draw(canvas);
        mo146197a();
        if (this.f309071f == null && (drawable = this.f309082t) != null && this.f309084v > 0) {
            drawable.mutate().setAlpha(this.f309084v);
            this.f309082t.draw(canvas);
        }
        if (this.f309080r && this.f309081s) {
            this.f309079q.mo161306d(canvas);
        }
        if (this.f309083u != null && this.f309084v > 0) {
            C107179f0 f0Var = this.f309068C;
            int d = f0Var != null ? f0Var.mo157632d() : 0;
            if (d > 0) {
                this.f309083u.setBounds(0, -this.f309067B, getWidth(), d - this.f309067B);
                this.f309083u.mutate().setAlpha(this.f309084v);
                this.f309083u.draw(canvas);
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0018, code lost:
        r3 = true;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean drawChild(android.graphics.Canvas r5, android.view.View r6, long r7) {
        /*
            r4 = this;
            android.graphics.drawable.Drawable r0 = r4.f309082t
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L_0x002d
            int r3 = r4.f309084v
            if (r3 <= 0) goto L_0x002d
            android.view.View r3 = r4.f309072g
            if (r3 == 0) goto L_0x0014
            if (r3 != r4) goto L_0x0011
            goto L_0x0014
        L_0x0011:
            if (r6 != r3) goto L_0x001a
            goto L_0x0018
        L_0x0014:
            androidx.appcompat.widget.Toolbar r3 = r4.f309071f
            if (r6 != r3) goto L_0x001a
        L_0x0018:
            r3 = 1
            goto L_0x001b
        L_0x001a:
            r3 = 0
        L_0x001b:
            if (r3 == 0) goto L_0x002d
            android.graphics.drawable.Drawable r0 = r0.mutate()
            int r3 = r4.f309084v
            r0.setAlpha(r3)
            android.graphics.drawable.Drawable r0 = r4.f309082t
            r0.draw(r5)
            r0 = 1
            goto L_0x002e
        L_0x002d:
            r0 = 0
        L_0x002e:
            boolean r5 = super.drawChild(r5, r6, r7)
            if (r5 != 0) goto L_0x0038
            if (r0 == 0) goto L_0x0037
            goto L_0x0038
        L_0x0037:
            r1 = 0
        L_0x0038:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.appbar.CollapsingToolbarLayout.drawChild(android.graphics.Canvas, android.view.View, long):boolean");
    }

    public void drawableStateChanged() {
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        Drawable drawable = this.f309083u;
        boolean z = false;
        if (drawable != null && drawable.isStateful()) {
            z = false | drawable.setState(drawableState);
        }
        Drawable drawable2 = this.f309082t;
        if (drawable2 != null && drawable2.isStateful()) {
            z |= drawable2.setState(drawableState);
        }
        C109969c cVar = this.f309079q;
        if (cVar != null) {
            z |= cVar.mo161317p(drawableState);
        }
        if (z) {
            invalidate();
        }
    }

    public ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new LayoutParams(-1, -1);
    }

    public int getCollapsedTitleGravity() {
        return this.f309079q.f329099h;
    }

    public Typeface getCollapsedTitleTypeface() {
        Typeface typeface = this.f309079q.f329110s;
        return typeface != null ? typeface : Typeface.DEFAULT;
    }

    public Drawable getContentScrim() {
        return this.f309082t;
    }

    public int getExpandedTitleGravity() {
        return this.f309079q.f329098g;
    }

    public int getExpandedTitleMarginBottom() {
        return this.f309077o;
    }

    public int getExpandedTitleMarginEnd() {
        return this.f309076n;
    }

    public int getExpandedTitleMarginStart() {
        return this.f309074i;
    }

    public int getExpandedTitleMarginTop() {
        return this.f309075j;
    }

    public Typeface getExpandedTitleTypeface() {
        Typeface typeface = this.f309079q.f329111t;
        return typeface != null ? typeface : Typeface.DEFAULT;
    }

    public int getScrimAlpha() {
        return this.f309084v;
    }

    public long getScrimAnimationDuration() {
        return this.f309087y;
    }

    public int getScrimVisibleHeightTrigger() {
        int i = this.f309088z;
        if (i >= 0) {
            return i;
        }
        C107179f0 f0Var = this.f309068C;
        int d = f0Var != null ? f0Var.mo157632d() : 0;
        WeakHashMap<View, C107168a0> weakHashMap = C107207u.f320808a;
        int d2 = C107207u.C107208b.m145176d(this);
        return d2 > 0 ? Math.min((d2 * 2) + d, getHeight()) : getHeight() / 3;
    }

    public Drawable getStatusBarScrim() {
        return this.f309083u;
    }

    public CharSequence getTitle() {
        if (this.f309080r) {
            return this.f309079q.f329113v;
        }
        return null;
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        ViewParent parent = getParent();
        if (parent instanceof AppBarLayout) {
            WeakHashMap<View, C107168a0> weakHashMap = C107207u.f320808a;
            setFitsSystemWindows(C107207u.C107208b.m145174b((View) parent));
            if (this.f309066A == null) {
                this.f309066A = new C104399b();
            }
            ((AppBarLayout) parent).mo146159a(this.f309066A);
            C107207u.C107212f.m145215c(this);
        }
    }

    public void onDetachedFromWindow() {
        List<AppBarLayout.C67444b> list;
        ViewParent parent = getParent();
        AppBarLayout.C67445c cVar = this.f309066A;
        if (!(cVar == null || !(parent instanceof AppBarLayout) || (list = ((AppBarLayout) parent).f309049j) == null)) {
            ((ArrayList) list).remove(cVar);
        }
        super.onDetachedFromWindow();
    }

    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5;
        int i6;
        View view;
        super.onLayout(z, i, i2, i3, i4);
        C107179f0 f0Var = this.f309068C;
        if (f0Var != null) {
            int d = f0Var.mo157632d();
            int childCount = getChildCount();
            for (int i7 = 0; i7 < childCount; i7++) {
                View childAt = getChildAt(i7);
                WeakHashMap<View, C107168a0> weakHashMap = C107207u.f320808a;
                if (!C107207u.C107208b.m145174b(childAt) && childAt.getTop() < d) {
                    C107207u.m145166g(childAt, d);
                }
            }
        }
        if (this.f309080r && (view = this.f309073h) != null) {
            WeakHashMap<View, C107168a0> weakHashMap2 = C107207u.f320808a;
            boolean z2 = C107207u.C107211e.m145207b(view) && this.f309073h.getVisibility() == 0;
            this.f309081s = z2;
            if (z2) {
                boolean z3 = C107207u.C107209c.m145195d(this) == 1;
                View view2 = this.f309072g;
                if (view2 == null) {
                    view2 = this.f309071f;
                }
                int height = ((getHeight() - m139448b(view2).f309114b) - view2.getHeight()) - ((LayoutParams) view2.getLayoutParams()).bottomMargin;
                C109970d.m149490a(this, this.f309073h, this.f309078p);
                C109969c cVar = this.f309079q;
                int titleMarginEnd = this.f309078p.left + (z3 ? this.f309071f.getTitleMarginEnd() : this.f309071f.getTitleMarginStart());
                int titleMarginTop = this.f309078p.top + height + this.f309071f.getTitleMarginTop();
                int titleMarginStart = this.f309078p.right + (z3 ? this.f309071f.getTitleMarginStart() : this.f309071f.getTitleMarginEnd());
                int titleMarginBottom = (this.f309078p.bottom + height) - this.f309071f.getTitleMarginBottom();
                Rect rect = cVar.f329096e;
                if (!(rect.left == titleMarginEnd && rect.top == titleMarginTop && rect.right == titleMarginStart && rect.bottom == titleMarginBottom)) {
                    rect.set(titleMarginEnd, titleMarginTop, titleMarginStart, titleMarginBottom);
                    cVar.f329079C = true;
                    cVar.mo161309h();
                }
                C109969c cVar2 = this.f309079q;
                int i8 = z3 ? this.f309076n : this.f309074i;
                int i9 = this.f309078p.top + this.f309075j;
                int i15 = (i3 - i) - (z3 ? this.f309074i : this.f309076n);
                int i16 = (i4 - i2) - this.f309077o;
                Rect rect2 = cVar2.f329095d;
                if (!(rect2.left == i8 && rect2.top == i9 && rect2.right == i15 && rect2.bottom == i16)) {
                    rect2.set(i8, i9, i15, i16);
                    cVar2.f329079C = true;
                    cVar2.mo161309h();
                }
                this.f309079q.mo161311j();
            }
        }
        int childCount2 = getChildCount();
        for (int i17 = 0; i17 < childCount2; i17++) {
            C104403c b = m139448b(getChildAt(i17));
            b.f309114b = b.f309113a.getTop();
            b.f309115c = b.f309113a.getLeft();
            b.mo146264b();
        }
        if (this.f309071f != null) {
            if (this.f309080r && TextUtils.isEmpty(this.f309079q.f329113v)) {
                setTitle(this.f309071f.getTitle());
            }
            View view3 = this.f309072g;
            if (view3 == null || view3 == this) {
                Toolbar toolbar = this.f309071f;
                ViewGroup.LayoutParams layoutParams = toolbar.getLayoutParams();
                if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                    i5 = toolbar.getHeight() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin;
                } else {
                    i5 = toolbar.getHeight();
                }
                setMinimumHeight(i5);
            } else {
                ViewGroup.LayoutParams layoutParams2 = view3.getLayoutParams();
                if (layoutParams2 instanceof ViewGroup.MarginLayoutParams) {
                    ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams2;
                    i6 = view3.getHeight() + marginLayoutParams2.topMargin + marginLayoutParams2.bottomMargin;
                } else {
                    i6 = view3.getHeight();
                }
                setMinimumHeight(i6);
            }
        }
        mo146200d();
    }

    public void onMeasure(int i, int i2) {
        mo146197a();
        super.onMeasure(i, i2);
        int mode = View.MeasureSpec.getMode(i2);
        C107179f0 f0Var = this.f309068C;
        int d = f0Var != null ? f0Var.mo157632d() : 0;
        if (mode == 0 && d > 0) {
            super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(getMeasuredHeight() + d, 1073741824));
        }
    }

    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        Drawable drawable = this.f309082t;
        if (drawable != null) {
            drawable.setBounds(0, 0, i, i2);
        }
    }

    public void setCollapsedTitleGravity(int i) {
        C109969c cVar = this.f309079q;
        if (cVar.f329099h != i) {
            cVar.f329099h = i;
            cVar.mo161311j();
        }
    }

    public void setCollapsedTitleTextAppearance(int i) {
        this.f309079q.mo161312k(i);
    }

    public void setCollapsedTitleTextColor(int i) {
        setCollapsedTitleTextColor(ColorStateList.valueOf(i));
    }

    public void setCollapsedTitleTypeface(Typeface typeface) {
        C109969c cVar = this.f309079q;
        if (cVar.f329110s != typeface) {
            cVar.f329110s = typeface;
            cVar.mo161311j();
        }
    }

    public void setContentScrim(Drawable drawable) {
        Drawable drawable2 = this.f309082t;
        if (drawable2 != drawable) {
            Drawable drawable3 = null;
            if (drawable2 != null) {
                drawable2.setCallback((Drawable.Callback) null);
            }
            if (drawable != null) {
                drawable3 = drawable.mutate();
            }
            this.f309082t = drawable3;
            if (drawable3 != null) {
                drawable3.setBounds(0, 0, getWidth(), getHeight());
                this.f309082t.setCallback(this);
                this.f309082t.setAlpha(this.f309084v);
            }
            WeakHashMap<View, C107168a0> weakHashMap = C107207u.f320808a;
            C107207u.C107208b.m145183k(this);
        }
    }

    public void setContentScrimColor(int i) {
        setContentScrim(new ColorDrawable(i));
    }

    public void setContentScrimResource(int i) {
        Context context = getContext();
        Object obj = C111105a.f332697a;
        setContentScrim(C111105a.C111110c.m151511b(context, i));
    }

    public void setExpandedTitleColor(int i) {
        setExpandedTitleTextColor(ColorStateList.valueOf(i));
    }

    public void setExpandedTitleGravity(int i) {
        C109969c cVar = this.f309079q;
        if (cVar.f329098g != i) {
            cVar.f329098g = i;
            cVar.mo161311j();
        }
    }

    public void setExpandedTitleMarginBottom(int i) {
        this.f309077o = i;
        requestLayout();
    }

    public void setExpandedTitleMarginEnd(int i) {
        this.f309076n = i;
        requestLayout();
    }

    public void setExpandedTitleMarginStart(int i) {
        this.f309074i = i;
        requestLayout();
    }

    public void setExpandedTitleMarginTop(int i) {
        this.f309075j = i;
        requestLayout();
    }

    public void setExpandedTitleTextAppearance(int i) {
        this.f309079q.mo161314m(i);
    }

    public void setExpandedTitleTextColor(ColorStateList colorStateList) {
        C109969c cVar = this.f309079q;
        if (cVar.f329102k != colorStateList) {
            cVar.f329102k = colorStateList;
            cVar.mo161311j();
        }
    }

    public void setExpandedTitleTypeface(Typeface typeface) {
        C109969c cVar = this.f309079q;
        if (cVar.f329111t != typeface) {
            cVar.f329111t = typeface;
            cVar.mo161311j();
        }
    }

    public void setScrimAlpha(int i) {
        Toolbar toolbar;
        if (i != this.f309084v) {
            if (!(this.f309082t == null || (toolbar = this.f309071f) == null)) {
                WeakHashMap<View, C107168a0> weakHashMap = C107207u.f320808a;
                C107207u.C107208b.m145183k(toolbar);
            }
            this.f309084v = i;
            WeakHashMap<View, C107168a0> weakHashMap2 = C107207u.f320808a;
            C107207u.C107208b.m145183k(this);
        }
    }

    public void setScrimAnimationDuration(long j) {
        this.f309087y = j;
    }

    public void setScrimVisibleHeightTrigger(int i) {
        if (this.f309088z != i) {
            this.f309088z = i;
            mo146200d();
        }
    }

    public void setScrimsShown(boolean z) {
        WeakHashMap<View, C107168a0> weakHashMap = C107207u.f320808a;
        int i = 0;
        boolean z2 = C107207u.C107211e.m145208c(this) && !isInEditMode();
        if (this.f309085w != z) {
            int i2 = 255;
            if (z2) {
                if (!z) {
                    i2 = 0;
                }
                mo146197a();
                ValueAnimator valueAnimator = this.f309086x;
                if (valueAnimator == null) {
                    ValueAnimator valueAnimator2 = new ValueAnimator();
                    this.f309086x = valueAnimator2;
                    valueAnimator2.setDuration(this.f309087y);
                    this.f309086x.setInterpolator(i2 > this.f309084v ? C108164a.f323892c : C108164a.f323893d);
                    this.f309086x.addUpdateListener(new C104402b(this));
                } else if (valueAnimator.isRunning()) {
                    this.f309086x.cancel();
                }
                this.f309086x.setIntValues(new int[]{this.f309084v, i2});
                this.f309086x.start();
            } else {
                if (z) {
                    i = 255;
                }
                setScrimAlpha(i);
            }
            this.f309085w = z;
        }
    }

    public void setStatusBarScrim(Drawable drawable) {
        Drawable drawable2 = this.f309083u;
        if (drawable2 != drawable) {
            Drawable drawable3 = null;
            if (drawable2 != null) {
                drawable2.setCallback((Drawable.Callback) null);
            }
            if (drawable != null) {
                drawable3 = drawable.mutate();
            }
            this.f309083u = drawable3;
            if (drawable3 != null) {
                if (drawable3.isStateful()) {
                    this.f309083u.setState(getDrawableState());
                }
                Drawable drawable4 = this.f309083u;
                WeakHashMap<View, C107168a0> weakHashMap = C107207u.f320808a;
                C112019a.m152745c(drawable4, C107207u.C107209c.m145195d(this));
                this.f309083u.setVisible(getVisibility() == 0, false);
                this.f309083u.setCallback(this);
                this.f309083u.setAlpha(this.f309084v);
            }
            WeakHashMap<View, C107168a0> weakHashMap2 = C107207u.f320808a;
            C107207u.C107208b.m145183k(this);
        }
    }

    public void setStatusBarScrimColor(int i) {
        setStatusBarScrim(new ColorDrawable(i));
    }

    public void setStatusBarScrimResource(int i) {
        Context context = getContext();
        Object obj = C111105a.f332697a;
        setStatusBarScrim(C111105a.C111110c.m151511b(context, i));
    }

    public void setTitle(CharSequence charSequence) {
        C109969c cVar = this.f309079q;
        if (charSequence == null || !charSequence.equals(cVar.f329113v)) {
            cVar.f329113v = charSequence;
            cVar.f329114w = null;
            Bitmap bitmap = cVar.f329116y;
            if (bitmap != null) {
                bitmap.recycle();
                cVar.f329116y = null;
            }
            cVar.mo161311j();
        }
        setContentDescription(getTitle());
    }

    public void setTitleEnabled(boolean z) {
        if (z != this.f309080r) {
            this.f309080r = z;
            setContentDescription(getTitle());
            mo146198c();
            requestLayout();
        }
    }

    public void setVisibility(int i) {
        super.setVisibility(i);
        boolean z = i == 0;
        Drawable drawable = this.f309083u;
        if (!(drawable == null || drawable.isVisible() == z)) {
            this.f309083u.setVisible(z, false);
        }
        Drawable drawable2 = this.f309082t;
        if (drawable2 != null && drawable2.isVisible() != z) {
            this.f309082t.setVisible(z, false);
        }
    }

    public boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.f309082t || drawable == this.f309083u;
    }

    public CollapsingToolbarLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f309069d = true;
        this.f309078p = new Rect();
        this.f309088z = -1;
        C109969c cVar = new C109969c(this);
        this.f309079q = cVar;
        cVar.f329083G = C108164a.f323894e;
        cVar.mo161311j();
        TypedArray d = C109991k.m149511d(context, attributeSet, C107764a.f322508h, i, C0966R.style.a3j, new int[0]);
        int i2 = d.getInt(3, 8388691);
        if (cVar.f329098g != i2) {
            cVar.f329098g = i2;
            cVar.mo161311j();
        }
        int i3 = d.getInt(0, 8388627);
        if (cVar.f329099h != i3) {
            cVar.f329099h = i3;
            cVar.mo161311j();
        }
        int dimensionPixelSize = d.getDimensionPixelSize(4, 0);
        this.f309077o = dimensionPixelSize;
        this.f309076n = dimensionPixelSize;
        this.f309075j = dimensionPixelSize;
        this.f309074i = dimensionPixelSize;
        if (d.hasValue(7)) {
            this.f309074i = d.getDimensionPixelSize(7, 0);
        }
        if (d.hasValue(6)) {
            this.f309076n = d.getDimensionPixelSize(6, 0);
        }
        if (d.hasValue(8)) {
            this.f309075j = d.getDimensionPixelSize(8, 0);
        }
        if (d.hasValue(5)) {
            this.f309077o = d.getDimensionPixelSize(5, 0);
        }
        this.f309080r = d.getBoolean(14, true);
        setTitle(d.getText(13));
        cVar.mo161314m(C0966R.style.f8801wj);
        cVar.mo161312k(C0966R.style.f8793vu);
        if (d.hasValue(9)) {
            cVar.mo161314m(d.getResourceId(9, 0));
        }
        if (d.hasValue(1)) {
            cVar.mo161312k(d.getResourceId(1, 0));
        }
        this.f309088z = d.getDimensionPixelSize(11, -1);
        this.f309087y = (long) d.getInt(10, 600);
        setContentScrim(d.getDrawable(2));
        setStatusBarScrim(d.getDrawable(12));
        this.f309070e = d.getResourceId(15, -1);
        d.recycle();
        setWillNotDraw(false);
        C104398a aVar = new C104398a();
        WeakHashMap<View, C107168a0> weakHashMap = C107207u.f320808a;
        C107207u.C107213g.m145236u(this, aVar);
    }

    /* renamed from: generateDefaultLayoutParams  reason: collision with other method in class */
    public FrameLayout.LayoutParams m168894generateDefaultLayoutParams() {
        return new LayoutParams(-1, -1);
    }

    public FrameLayout.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new LayoutParams(getContext(), attributeSet);
    }

    public void setCollapsedTitleTextColor(ColorStateList colorStateList) {
        this.f309079q.mo161313l(colorStateList);
    }

    public ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new LayoutParams(layoutParams);
    }

    public static class LayoutParams extends FrameLayout.LayoutParams {

        /* renamed from: a */
        public int f309089a = 0;

        /* renamed from: b */
        public float f309090b = 0.5f;

        public LayoutParams(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C107764a.f322509i);
            this.f309089a = obtainStyledAttributes.getInt(0, 0);
            this.f309090b = obtainStyledAttributes.getFloat(1, 0.5f);
            obtainStyledAttributes.recycle();
        }

        public LayoutParams(int i, int i2) {
            super(i, i2);
        }

        public LayoutParams(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }
    }
}

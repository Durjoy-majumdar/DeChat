package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import android.view.Gravity;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.view.menu.C103448e;
import androidx.appcompat.view.menu.C103452g;
import androidx.appcompat.view.menu.C103456i;
import androidx.appcompat.view.menu.C103463l;
import androidx.appcompat.widget.ActionMenuView;
import androidx.customview.view.AbsSavedState;
import com.tencent.p014mm.C0966R;
import java.util.ArrayList;
import java.util.List;
import java.util.WeakHashMap;
import p1115h.C107922a;
import p433g.C107593a;
import p849e3.C107168a0;
import p849e3.C107207u;
import p990k.C108783b;
import p990k.C108787f;

public class Toolbar extends ViewGroup {

    /* renamed from: A */
    public int f305635A;

    /* renamed from: B */
    public int f305636B;

    /* renamed from: C */
    public int f305637C;

    /* renamed from: D */
    public CharSequence f305638D;

    /* renamed from: E */
    public CharSequence f305639E;

    /* renamed from: F */
    public int f305640F;

    /* renamed from: G */
    public int f305641G;

    /* renamed from: H */
    public boolean f305642H;

    /* renamed from: I */
    public boolean f305643I;

    /* renamed from: J */
    public final ArrayList<View> f305644J;

    /* renamed from: K */
    public final ArrayList<View> f305645K;

    /* renamed from: L */
    public final int[] f305646L;

    /* renamed from: M */
    public C103515d f305647M;

    /* renamed from: N */
    public final ActionMenuView.C103480d f305648N;

    /* renamed from: P */
    public C103539i0 f305649P;

    /* renamed from: Q */
    public ActionMenuPresenter f305650Q;

    /* renamed from: R */
    public C103514c f305651R;

    /* renamed from: S */
    public C103456i.C103457a f305652S;

    /* renamed from: T */
    public C103448e.C103449a f305653T;

    /* renamed from: U */
    public boolean f305654U;

    /* renamed from: V */
    public final Runnable f305655V;

    /* renamed from: d */
    public ActionMenuView f305656d;

    /* renamed from: e */
    public TextView f305657e;

    /* renamed from: f */
    public TextView f305658f;

    /* renamed from: g */
    public ImageButton f305659g;

    /* renamed from: h */
    public ImageView f305660h;

    /* renamed from: i */
    public Drawable f305661i;

    /* renamed from: j */
    public CharSequence f305662j;

    /* renamed from: n */
    public ImageButton f305663n;

    /* renamed from: o */
    public View f305664o;

    /* renamed from: p */
    public Context f305665p;

    /* renamed from: q */
    public int f305666q;

    /* renamed from: r */
    public int f305667r;

    /* renamed from: s */
    public int f305668s;

    /* renamed from: t */
    public int f305669t;

    /* renamed from: u */
    public int f305670u;

    /* renamed from: v */
    public int f305671v;

    /* renamed from: w */
    public int f305672w;

    /* renamed from: x */
    public int f305673x;

    /* renamed from: y */
    public int f305674y;

    /* renamed from: z */
    public C103568x f305675z;

    /* renamed from: androidx.appcompat.widget.Toolbar$a */
    public class C103512a implements ActionMenuView.C103480d {
        public C103512a() {
        }
    }

    /* renamed from: androidx.appcompat.widget.Toolbar$b */
    public class C103513b implements Runnable {
        public C103513b() {
        }

        public void run() {
            ActionMenuPresenter actionMenuPresenter;
            ActionMenuView actionMenuView = Toolbar.this.f305656d;
            if (actionMenuView != null && (actionMenuPresenter = actionMenuView.f305415z) != null) {
                actionMenuPresenter.mo143809o();
            }
        }
    }

    /* renamed from: androidx.appcompat.widget.Toolbar$c */
    public class C103514c implements C103456i {

        /* renamed from: d */
        public C103448e f305681d;

        /* renamed from: e */
        public C103452g f305682e;

        public C103514c() {
        }

        /* renamed from: a */
        public void mo143537a(C103448e eVar, boolean z) {
        }

        /* renamed from: b */
        public Parcelable mo143538b() {
            return null;
        }

        /* renamed from: c */
        public void mo143539c(boolean z) {
            if (this.f305682e != null) {
                C103448e eVar = this.f305681d;
                boolean z2 = false;
                if (eVar != null) {
                    int size = eVar.size();
                    int i = 0;
                    while (true) {
                        if (i >= size) {
                            break;
                        } else if (this.f305681d.getItem(i) == this.f305682e) {
                            z2 = true;
                            break;
                        } else {
                            i++;
                        }
                    }
                }
                if (!z2) {
                    mo143534g(this.f305681d, this.f305682e);
                }
            }
        }

        /* renamed from: d */
        public boolean mo143540d(C103463l lVar) {
            return false;
        }

        /* renamed from: e */
        public boolean mo143533e(C103448e eVar, C103452g gVar) {
            Toolbar toolbar = Toolbar.this;
            if (toolbar.f305663n == null) {
                AppCompatImageButton appCompatImageButton = new AppCompatImageButton(toolbar.getContext(), (AttributeSet) null, C0966R.attr.a5o);
                toolbar.f305663n = appCompatImageButton;
                appCompatImageButton.setImageDrawable(toolbar.f305661i);
                toolbar.f305663n.setContentDescription(toolbar.f305662j);
                LayoutParams f = toolbar.generateDefaultLayoutParams();
                f.f192646a = (toolbar.f305669t & 112) | 8388611;
                f.f305676b = 2;
                toolbar.f305663n.setLayoutParams(f);
                toolbar.f305663n.setOnClickListener(new C103535g0(toolbar));
            }
            ViewParent parent = Toolbar.this.f305663n.getParent();
            Toolbar toolbar2 = Toolbar.this;
            if (parent != toolbar2) {
                if (parent instanceof ViewGroup) {
                    ((ViewGroup) parent).removeView(toolbar2.f305663n);
                }
                Toolbar toolbar3 = Toolbar.this;
                toolbar3.addView(toolbar3.f305663n);
            }
            Toolbar.this.f305664o = gVar.getActionView();
            this.f305682e = gVar;
            ViewParent parent2 = Toolbar.this.f305664o.getParent();
            Toolbar toolbar4 = Toolbar.this;
            if (parent2 != toolbar4) {
                if (parent2 instanceof ViewGroup) {
                    ((ViewGroup) parent2).removeView(toolbar4.f305664o);
                }
                LayoutParams f2 = Toolbar.this.generateDefaultLayoutParams();
                Toolbar toolbar5 = Toolbar.this;
                f2.f192646a = 8388611 | (toolbar5.f305669t & 112);
                f2.f305676b = 2;
                toolbar5.f305664o.setLayoutParams(f2);
                Toolbar toolbar6 = Toolbar.this;
                toolbar6.addView(toolbar6.f305664o);
            }
            Toolbar toolbar7 = Toolbar.this;
            int childCount = toolbar7.getChildCount();
            while (true) {
                childCount--;
                if (childCount < 0) {
                    break;
                }
                View childAt = toolbar7.getChildAt(childCount);
                if (!(((LayoutParams) childAt.getLayoutParams()).f305676b == 2 || childAt == toolbar7.f305656d)) {
                    toolbar7.removeViewAt(childCount);
                    toolbar7.f305645K.add(childAt);
                }
            }
            Toolbar.this.requestLayout();
            gVar.f305266I = true;
            gVar.f305280t.mo143611p(false);
            View view = Toolbar.this.f305664o;
            if (view instanceof C108783b) {
                ((C108783b) view).mo144100b();
            }
            return true;
        }

        /* renamed from: f */
        public boolean mo143542f() {
            return false;
        }

        /* renamed from: g */
        public boolean mo143534g(C103448e eVar, C103452g gVar) {
            View view = Toolbar.this.f305664o;
            if (view instanceof C108783b) {
                ((C108783b) view).mo144099a();
            }
            Toolbar toolbar = Toolbar.this;
            toolbar.removeView(toolbar.f305664o);
            Toolbar toolbar2 = Toolbar.this;
            toolbar2.removeView(toolbar2.f305663n);
            Toolbar toolbar3 = Toolbar.this;
            toolbar3.f305664o = null;
            int size = toolbar3.f305645K.size();
            while (true) {
                size--;
                if (size >= 0) {
                    toolbar3.addView(toolbar3.f305645K.get(size));
                } else {
                    toolbar3.f305645K.clear();
                    this.f305682e = null;
                    Toolbar.this.requestLayout();
                    gVar.f305266I = false;
                    gVar.f305280t.mo143611p(false);
                    return true;
                }
            }
        }

        public int getId() {
            return 0;
        }

        /* renamed from: h */
        public void mo143564h(Context context, C103448e eVar) {
            C103452g gVar;
            C103448e eVar2 = this.f305681d;
            if (!(eVar2 == null || (gVar = this.f305682e) == null)) {
                eVar2.mo143595d(gVar);
            }
            this.f305681d = eVar;
        }

        /* renamed from: j */
        public void mo143545j(Parcelable parcelable) {
        }
    }

    /* renamed from: androidx.appcompat.widget.Toolbar$d */
    public interface C103515d {
    }

    public Toolbar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C0966R.attr.a5p);
    }

    private MenuInflater getMenuInflater() {
        return new C108787f(getContext());
    }

    /* renamed from: a */
    public final void mo144215a(List<View> list, int i) {
        WeakHashMap<View, C107168a0> weakHashMap = C107207u.f320808a;
        boolean z = C107207u.C107209c.m145195d(this) == 1;
        int childCount = getChildCount();
        int absoluteGravity = Gravity.getAbsoluteGravity(i, C107207u.C107209c.m145195d(this));
        list.clear();
        if (z) {
            for (int i2 = childCount - 1; i2 >= 0; i2--) {
                View childAt = getChildAt(i2);
                LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
                if (layoutParams.f305676b == 0 && mo144268p(childAt)) {
                    int i3 = layoutParams.f192646a;
                    WeakHashMap<View, C107168a0> weakHashMap2 = C107207u.f320808a;
                    int d = C107207u.C107209c.m145195d(this);
                    int absoluteGravity2 = Gravity.getAbsoluteGravity(i3, d) & 7;
                    if (!(absoluteGravity2 == 1 || absoluteGravity2 == 3 || absoluteGravity2 == 5)) {
                        absoluteGravity2 = d == 1 ? 5 : 3;
                    }
                    if (absoluteGravity2 == absoluteGravity) {
                        list.add(childAt);
                    }
                }
            }
            return;
        }
        for (int i4 = 0; i4 < childCount; i4++) {
            View childAt2 = getChildAt(i4);
            LayoutParams layoutParams2 = (LayoutParams) childAt2.getLayoutParams();
            if (layoutParams2.f305676b == 0 && mo144268p(childAt2)) {
                int i5 = layoutParams2.f192646a;
                WeakHashMap<View, C107168a0> weakHashMap3 = C107207u.f320808a;
                int d2 = C107207u.C107209c.m145195d(this);
                int absoluteGravity3 = Gravity.getAbsoluteGravity(i5, d2) & 7;
                if (!(absoluteGravity3 == 1 || absoluteGravity3 == 3 || absoluteGravity3 == 5)) {
                    absoluteGravity3 = d2 == 1 ? 5 : 3;
                }
                if (absoluteGravity3 == absoluteGravity) {
                    list.add(childAt2);
                }
            }
        }
    }

    /* renamed from: b */
    public final void mo144216b(View view, boolean z) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        LayoutParams f = layoutParams == null ? generateDefaultLayoutParams() : !checkLayoutParams(layoutParams) ? generateLayoutParams(layoutParams) : (LayoutParams) layoutParams;
        f.f305676b = 1;
        if (!z || this.f305664o == null) {
            addView(view, f);
            return;
        }
        view.setLayoutParams(f);
        this.f305645K.add(view);
    }

    /* renamed from: c */
    public final void mo144217c() {
        mo144219d();
        ActionMenuView actionMenuView = this.f305656d;
        if (actionMenuView.f305411v == null) {
            C103448e eVar = (C103448e) actionMenuView.getMenu();
            if (this.f305651R == null) {
                this.f305651R = new C103514c();
            }
            this.f305656d.setExpandedActionViewsExclusive(true);
            eVar.mo143590b(this.f305651R, this.f305665p);
        }
    }

    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return super.checkLayoutParams(layoutParams) && (layoutParams instanceof LayoutParams);
    }

    /* renamed from: d */
    public final void mo144219d() {
        if (this.f305656d == null) {
            ActionMenuView actionMenuView = new ActionMenuView(getContext(), (AttributeSet) null);
            this.f305656d = actionMenuView;
            actionMenuView.setPopupTheme(this.f305666q);
            this.f305656d.setOnMenuItemClickListener(this.f305648N);
            ActionMenuView actionMenuView2 = this.f305656d;
            C103456i.C103457a aVar = this.f305652S;
            C103448e.C103449a aVar2 = this.f305653T;
            actionMenuView2.f305404A = aVar;
            actionMenuView2.f305405B = aVar2;
            LayoutParams f = generateDefaultLayoutParams();
            f.f192646a = 8388613 | (this.f305669t & 112);
            this.f305656d.setLayoutParams(f);
            mo144216b(this.f305656d, false);
        }
    }

    /* renamed from: e */
    public final void mo144220e() {
        if (this.f305659g == null) {
            this.f305659g = new AppCompatImageButton(getContext(), (AttributeSet) null, C0966R.attr.a5o);
            LayoutParams f = generateDefaultLayoutParams();
            f.f192646a = 8388611 | (this.f305669t & 112);
            this.f305659g.setLayoutParams(f);
        }
    }

    /* renamed from: f */
    public LayoutParams generateDefaultLayoutParams() {
        return new LayoutParams(-2, -2);
    }

    /* renamed from: g */
    public LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof LayoutParams ? new LayoutParams((LayoutParams) layoutParams) : layoutParams instanceof ActionBar.LayoutParams ? new LayoutParams((ActionBar.LayoutParams) layoutParams) : layoutParams instanceof ViewGroup.MarginLayoutParams ? new LayoutParams((ViewGroup.MarginLayoutParams) layoutParams) : new LayoutParams(layoutParams);
    }

    public int getContentInsetEnd() {
        C103568x xVar = this.f305675z;
        if (xVar != null) {
            return xVar.f305862g ? xVar.f305856a : xVar.f305857b;
        }
        return 0;
    }

    public int getContentInsetEndWithActions() {
        int i = this.f305636B;
        return i != Integer.MIN_VALUE ? i : getContentInsetEnd();
    }

    public int getContentInsetLeft() {
        C103568x xVar = this.f305675z;
        if (xVar != null) {
            return xVar.f305856a;
        }
        return 0;
    }

    public int getContentInsetRight() {
        C103568x xVar = this.f305675z;
        if (xVar != null) {
            return xVar.f305857b;
        }
        return 0;
    }

    public int getContentInsetStart() {
        C103568x xVar = this.f305675z;
        if (xVar != null) {
            return xVar.f305862g ? xVar.f305857b : xVar.f305856a;
        }
        return 0;
    }

    public int getContentInsetStartWithNavigation() {
        int i = this.f305635A;
        return i != Integer.MIN_VALUE ? i : getContentInsetStart();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0005, code lost:
        r0 = r0.f305411v;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int getCurrentContentInsetEnd() {
        /*
            r3 = this;
            androidx.appcompat.widget.ActionMenuView r0 = r3.f305656d
            r1 = 0
            if (r0 == 0) goto L_0x0011
            androidx.appcompat.view.menu.e r0 = r0.f305411v
            if (r0 == 0) goto L_0x0011
            boolean r0 = r0.hasVisibleItems()
            if (r0 == 0) goto L_0x0011
            r0 = 1
            goto L_0x0012
        L_0x0011:
            r0 = 0
        L_0x0012:
            if (r0 == 0) goto L_0x0023
            int r0 = r3.getContentInsetEnd()
            int r2 = r3.f305636B
            int r1 = java.lang.Math.max(r2, r1)
            int r0 = java.lang.Math.max(r0, r1)
            goto L_0x0027
        L_0x0023:
            int r0 = r3.getContentInsetEnd()
        L_0x0027:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.Toolbar.getCurrentContentInsetEnd():int");
    }

    public int getCurrentContentInsetLeft() {
        WeakHashMap<View, C107168a0> weakHashMap = C107207u.f320808a;
        return C107207u.C107209c.m145195d(this) == 1 ? getCurrentContentInsetEnd() : getCurrentContentInsetStart();
    }

    public int getCurrentContentInsetRight() {
        WeakHashMap<View, C107168a0> weakHashMap = C107207u.f320808a;
        return C107207u.C107209c.m145195d(this) == 1 ? getCurrentContentInsetStart() : getCurrentContentInsetEnd();
    }

    public int getCurrentContentInsetStart() {
        return getNavigationIcon() != null ? Math.max(getContentInsetStart(), Math.max(this.f305635A, 0)) : getContentInsetStart();
    }

    public Drawable getLogo() {
        ImageView imageView = this.f305660h;
        if (imageView != null) {
            return imageView.getDrawable();
        }
        return null;
    }

    public CharSequence getLogoDescription() {
        ImageView imageView = this.f305660h;
        if (imageView != null) {
            return imageView.getContentDescription();
        }
        return null;
    }

    public Menu getMenu() {
        mo144217c();
        return this.f305656d.getMenu();
    }

    public CharSequence getNavigationContentDescription() {
        ImageButton imageButton = this.f305659g;
        if (imageButton != null) {
            return imageButton.getContentDescription();
        }
        return null;
    }

    public Drawable getNavigationIcon() {
        ImageButton imageButton = this.f305659g;
        if (imageButton != null) {
            return imageButton.getDrawable();
        }
        return null;
    }

    public ActionMenuPresenter getOuterActionMenuPresenter() {
        return this.f305650Q;
    }

    public Drawable getOverflowIcon() {
        mo144217c();
        return this.f305656d.getOverflowIcon();
    }

    public Context getPopupContext() {
        return this.f305665p;
    }

    public int getPopupTheme() {
        return this.f305666q;
    }

    public CharSequence getSubtitle() {
        return this.f305639E;
    }

    public CharSequence getTitle() {
        return this.f305638D;
    }

    public int getTitleMarginBottom() {
        return this.f305674y;
    }

    public int getTitleMarginEnd() {
        return this.f305672w;
    }

    public int getTitleMarginStart() {
        return this.f305671v;
    }

    public int getTitleMarginTop() {
        return this.f305673x;
    }

    public C103554o getWrapper() {
        if (this.f305649P == null) {
            this.f305649P = new C103539i0(this, true);
        }
        return this.f305649P;
    }

    /* renamed from: h */
    public final int mo144252h(View view, int i) {
        LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
        int measuredHeight = view.getMeasuredHeight();
        int i2 = i > 0 ? (measuredHeight - i) / 2 : 0;
        int i3 = layoutParams.f192646a & 112;
        if (!(i3 == 16 || i3 == 48 || i3 == 80)) {
            i3 = this.f305637C & 112;
        }
        if (i3 == 48) {
            return getPaddingTop() - i2;
        }
        if (i3 == 80) {
            return (((getHeight() - getPaddingBottom()) - measuredHeight) - layoutParams.bottomMargin) - i2;
        }
        int paddingTop = getPaddingTop();
        int paddingBottom = getPaddingBottom();
        int height = getHeight();
        int i4 = (((height - paddingTop) - paddingBottom) - measuredHeight) / 2;
        int i5 = layoutParams.topMargin;
        if (i4 < i5) {
            i4 = i5;
        } else {
            int i6 = (((height - paddingBottom) - measuredHeight) - i4) - paddingTop;
            int i7 = layoutParams.bottomMargin;
            if (i6 < i7) {
                i4 = Math.max(0, i4 - (i7 - i6));
            }
        }
        return paddingTop + i4;
    }

    /* renamed from: i */
    public final int mo144253i(View view) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        return marginLayoutParams.getMarginStart() + marginLayoutParams.getMarginEnd();
    }

    /* renamed from: j */
    public final int mo144254j(View view) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        return marginLayoutParams.topMargin + marginLayoutParams.bottomMargin;
    }

    /* renamed from: k */
    public final boolean mo144255k(View view) {
        return view.getParent() == this || this.f305645K.contains(view);
    }

    /* renamed from: l */
    public final int mo144256l(View view, int i, int[] iArr, int i2) {
        LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
        int i3 = layoutParams.leftMargin - iArr[0];
        int max = i + Math.max(0, i3);
        iArr[0] = Math.max(0, -i3);
        int h = mo144252h(view, i2);
        int measuredWidth = view.getMeasuredWidth();
        view.layout(max, h, max + measuredWidth, view.getMeasuredHeight() + h);
        return max + measuredWidth + layoutParams.rightMargin;
    }

    /* renamed from: m */
    public final int mo144257m(View view, int i, int[] iArr, int i2) {
        LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
        int i3 = layoutParams.rightMargin - iArr[1];
        int max = i - Math.max(0, i3);
        iArr[1] = Math.max(0, -i3);
        int h = mo144252h(view, i2);
        int measuredWidth = view.getMeasuredWidth();
        view.layout(max - measuredWidth, h, max, view.getMeasuredHeight() + h);
        return max - (measuredWidth + layoutParams.leftMargin);
    }

    /* renamed from: n */
    public final int mo144258n(View view, int i, int i2, int i3, int i4, int[] iArr) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        int i5 = marginLayoutParams.leftMargin - iArr[0];
        int i6 = marginLayoutParams.rightMargin - iArr[1];
        int max = Math.max(0, i5) + Math.max(0, i6);
        iArr[0] = Math.max(0, -i5);
        iArr[1] = Math.max(0, -i6);
        view.measure(ViewGroup.getChildMeasureSpec(i, getPaddingLeft() + getPaddingRight() + max + i2, marginLayoutParams.width), ViewGroup.getChildMeasureSpec(i3, getPaddingTop() + getPaddingBottom() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin + i4, marginLayoutParams.height));
        return view.getMeasuredWidth() + max;
    }

    /* renamed from: o */
    public final void mo144259o(View view, int i, int i2, int i3, int i4, int i5) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        int childMeasureSpec = ViewGroup.getChildMeasureSpec(i, getPaddingLeft() + getPaddingRight() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i2, marginLayoutParams.width);
        int childMeasureSpec2 = ViewGroup.getChildMeasureSpec(i3, getPaddingTop() + getPaddingBottom() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin + i4, marginLayoutParams.height);
        int mode = View.MeasureSpec.getMode(childMeasureSpec2);
        if (mode != 1073741824 && i5 >= 0) {
            if (mode != 0) {
                i5 = Math.min(View.MeasureSpec.getSize(childMeasureSpec2), i5);
            }
            childMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(i5, 1073741824);
        }
        view.measure(childMeasureSpec, childMeasureSpec2);
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        removeCallbacks(this.f305655V);
    }

    public boolean onHoverEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 9) {
            this.f305643I = false;
        }
        if (!this.f305643I) {
            boolean onHoverEvent = super.onHoverEvent(motionEvent);
            if (actionMasked == 9 && !onHoverEvent) {
                this.f305643I = true;
            }
        }
        if (actionMasked == 10 || actionMasked == 3) {
            this.f305643I = false;
        }
        return true;
    }

    /* JADX WARNING: Removed duplicated region for block: B:102:0x02a1 A[LOOP:0: B:101:0x029f->B:102:0x02a1, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:105:0x02c3 A[LOOP:1: B:104:0x02c1->B:105:0x02c3, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:108:0x02e7 A[LOOP:2: B:107:0x02e5->B:108:0x02e7, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:111:0x0328  */
    /* JADX WARNING: Removed duplicated region for block: B:116:0x0339 A[LOOP:3: B:115:0x0337->B:116:0x0339, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0061  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0078  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x00b5  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x00cc  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00e9  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x0102  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x0107  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x011f  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x012e  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x0131  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x0135  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x0138  */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x0169  */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x01a7  */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x01b8  */
    /* JADX WARNING: Removed duplicated region for block: B:87:0x0227  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onLayout(boolean r20, int r21, int r22, int r23, int r24) {
        /*
            r19 = this;
            r0 = r19
            java.util.WeakHashMap<android.view.View, e3.a0> r1 = p849e3.C107207u.f320808a
            int r1 = p849e3.C107207u.C107209c.m145195d(r19)
            r2 = 1
            r3 = 0
            if (r1 != r2) goto L_0x000e
            r1 = 1
            goto L_0x000f
        L_0x000e:
            r1 = 0
        L_0x000f:
            int r4 = r19.getWidth()
            int r5 = r19.getHeight()
            int r6 = r19.getPaddingLeft()
            int r7 = r19.getPaddingRight()
            int r8 = r19.getPaddingTop()
            int r9 = r19.getPaddingBottom()
            int r10 = r4 - r7
            int[] r11 = r0.f305646L
            r11[r2] = r3
            r11[r3] = r3
            int r12 = p849e3.C107207u.C107208b.m145176d(r19)
            if (r12 < 0) goto L_0x003c
            int r13 = r24 - r22
            int r12 = java.lang.Math.min(r12, r13)
            goto L_0x003d
        L_0x003c:
            r12 = 0
        L_0x003d:
            android.widget.ImageButton r13 = r0.f305659g
            boolean r13 = r0.mo144268p(r13)
            if (r13 == 0) goto L_0x0057
            if (r1 == 0) goto L_0x0050
            android.widget.ImageButton r13 = r0.f305659g
            int r13 = r0.mo144257m(r13, r10, r11, r12)
            r14 = r13
            r13 = r6
            goto L_0x0059
        L_0x0050:
            android.widget.ImageButton r13 = r0.f305659g
            int r13 = r0.mo144256l(r13, r6, r11, r12)
            goto L_0x0058
        L_0x0057:
            r13 = r6
        L_0x0058:
            r14 = r10
        L_0x0059:
            android.widget.ImageButton r15 = r0.f305663n
            boolean r15 = r0.mo144268p(r15)
            if (r15 == 0) goto L_0x0070
            if (r1 == 0) goto L_0x006a
            android.widget.ImageButton r15 = r0.f305663n
            int r14 = r0.mo144257m(r15, r14, r11, r12)
            goto L_0x0070
        L_0x006a:
            android.widget.ImageButton r15 = r0.f305663n
            int r13 = r0.mo144256l(r15, r13, r11, r12)
        L_0x0070:
            androidx.appcompat.widget.ActionMenuView r15 = r0.f305656d
            boolean r15 = r0.mo144268p(r15)
            if (r15 == 0) goto L_0x0087
            if (r1 == 0) goto L_0x0081
            androidx.appcompat.widget.ActionMenuView r15 = r0.f305656d
            int r13 = r0.mo144256l(r15, r13, r11, r12)
            goto L_0x0087
        L_0x0081:
            androidx.appcompat.widget.ActionMenuView r15 = r0.f305656d
            int r14 = r0.mo144257m(r15, r14, r11, r12)
        L_0x0087:
            int r15 = r19.getCurrentContentInsetLeft()
            int r16 = r19.getCurrentContentInsetRight()
            int r2 = r15 - r13
            int r2 = java.lang.Math.max(r3, r2)
            r11[r3] = r2
            int r2 = r10 - r14
            int r2 = r16 - r2
            int r2 = java.lang.Math.max(r3, r2)
            r17 = 1
            r11[r17] = r2
            int r2 = java.lang.Math.max(r13, r15)
            int r10 = r10 - r16
            int r10 = java.lang.Math.min(r14, r10)
            android.view.View r13 = r0.f305664o
            boolean r13 = r0.mo144268p(r13)
            if (r13 == 0) goto L_0x00c4
            if (r1 == 0) goto L_0x00be
            android.view.View r13 = r0.f305664o
            int r10 = r0.mo144257m(r13, r10, r11, r12)
            goto L_0x00c4
        L_0x00be:
            android.view.View r13 = r0.f305664o
            int r2 = r0.mo144256l(r13, r2, r11, r12)
        L_0x00c4:
            android.widget.ImageView r13 = r0.f305660h
            boolean r13 = r0.mo144268p(r13)
            if (r13 == 0) goto L_0x00db
            if (r1 == 0) goto L_0x00d5
            android.widget.ImageView r13 = r0.f305660h
            int r10 = r0.mo144257m(r13, r10, r11, r12)
            goto L_0x00db
        L_0x00d5:
            android.widget.ImageView r13 = r0.f305660h
            int r2 = r0.mo144256l(r13, r2, r11, r12)
        L_0x00db:
            android.widget.TextView r13 = r0.f305657e
            boolean r13 = r0.mo144268p(r13)
            android.widget.TextView r14 = r0.f305658f
            boolean r14 = r0.mo144268p(r14)
            if (r13 == 0) goto L_0x0102
            android.widget.TextView r15 = r0.f305657e
            android.view.ViewGroup$LayoutParams r15 = r15.getLayoutParams()
            androidx.appcompat.widget.Toolbar$LayoutParams r15 = (androidx.appcompat.widget.Toolbar.LayoutParams) r15
            int r3 = r15.topMargin
            r23 = r7
            android.widget.TextView r7 = r0.f305657e
            int r7 = r7.getMeasuredHeight()
            int r3 = r3 + r7
            int r7 = r15.bottomMargin
            int r3 = r3 + r7
            r7 = 0
            int r3 = r3 + r7
            goto L_0x0105
        L_0x0102:
            r23 = r7
            r3 = 0
        L_0x0105:
            if (r14 == 0) goto L_0x011f
            android.widget.TextView r7 = r0.f305658f
            android.view.ViewGroup$LayoutParams r7 = r7.getLayoutParams()
            androidx.appcompat.widget.Toolbar$LayoutParams r7 = (androidx.appcompat.widget.Toolbar.LayoutParams) r7
            int r15 = r7.topMargin
            r16 = r4
            android.widget.TextView r4 = r0.f305658f
            int r4 = r4.getMeasuredHeight()
            int r15 = r15 + r4
            int r4 = r7.bottomMargin
            int r15 = r15 + r4
            int r3 = r3 + r15
            goto L_0x0121
        L_0x011f:
            r16 = r4
        L_0x0121:
            if (r13 != 0) goto L_0x012c
            if (r14 == 0) goto L_0x0126
            goto L_0x012c
        L_0x0126:
            r18 = r6
            r22 = r12
            goto L_0x0291
        L_0x012c:
            if (r13 == 0) goto L_0x0131
            android.widget.TextView r4 = r0.f305657e
            goto L_0x0133
        L_0x0131:
            android.widget.TextView r4 = r0.f305658f
        L_0x0133:
            if (r14 == 0) goto L_0x0138
            android.widget.TextView r7 = r0.f305658f
            goto L_0x013a
        L_0x0138:
            android.widget.TextView r7 = r0.f305657e
        L_0x013a:
            android.view.ViewGroup$LayoutParams r4 = r4.getLayoutParams()
            androidx.appcompat.widget.Toolbar$LayoutParams r4 = (androidx.appcompat.widget.Toolbar.LayoutParams) r4
            android.view.ViewGroup$LayoutParams r7 = r7.getLayoutParams()
            androidx.appcompat.widget.Toolbar$LayoutParams r7 = (androidx.appcompat.widget.Toolbar.LayoutParams) r7
            if (r13 == 0) goto L_0x0150
            android.widget.TextView r15 = r0.f305657e
            int r15 = r15.getMeasuredWidth()
            if (r15 > 0) goto L_0x015a
        L_0x0150:
            if (r14 == 0) goto L_0x015d
            android.widget.TextView r15 = r0.f305658f
            int r15 = r15.getMeasuredWidth()
            if (r15 <= 0) goto L_0x015d
        L_0x015a:
            r17 = 1
            goto L_0x015f
        L_0x015d:
            r17 = 0
        L_0x015f:
            int r15 = r0.f305637C
            r15 = r15 & 112(0x70, float:1.57E-43)
            r18 = r6
            r6 = 48
            if (r15 == r6) goto L_0x01a7
            r6 = 80
            if (r15 == r6) goto L_0x0199
            int r6 = r5 - r8
            int r6 = r6 - r9
            int r6 = r6 - r3
            int r6 = r6 / 2
            int r15 = r4.topMargin
            r22 = r12
            int r12 = r0.f305673x
            r24 = r2
            int r2 = r15 + r12
            if (r6 >= r2) goto L_0x0182
            int r6 = r15 + r12
            goto L_0x0197
        L_0x0182:
            int r5 = r5 - r9
            int r5 = r5 - r3
            int r5 = r5 - r6
            int r5 = r5 - r8
            int r2 = r4.bottomMargin
            int r3 = r0.f305674y
            int r2 = r2 + r3
            if (r5 >= r2) goto L_0x0197
            int r2 = r7.bottomMargin
            int r2 = r2 + r3
            int r2 = r2 - r5
            int r6 = r6 - r2
            r2 = 0
            int r6 = java.lang.Math.max(r2, r6)
        L_0x0197:
            int r8 = r8 + r6
            goto L_0x01b6
        L_0x0199:
            r24 = r2
            r22 = r12
            int r5 = r5 - r9
            int r2 = r7.bottomMargin
            int r5 = r5 - r2
            int r2 = r0.f305674y
            int r5 = r5 - r2
            int r8 = r5 - r3
            goto L_0x01b6
        L_0x01a7:
            r24 = r2
            r22 = r12
            int r2 = r19.getPaddingTop()
            int r3 = r4.topMargin
            int r2 = r2 + r3
            int r3 = r0.f305673x
            int r8 = r2 + r3
        L_0x01b6:
            if (r1 == 0) goto L_0x0227
            if (r17 == 0) goto L_0x01bd
            int r1 = r0.f305671v
            goto L_0x01be
        L_0x01bd:
            r1 = 0
        L_0x01be:
            r2 = 1
            r3 = r11[r2]
            int r1 = r1 - r3
            r3 = 0
            int r4 = java.lang.Math.max(r3, r1)
            int r10 = r10 - r4
            int r1 = -r1
            int r1 = java.lang.Math.max(r3, r1)
            r11[r2] = r1
            if (r13 == 0) goto L_0x01f5
            android.widget.TextView r1 = r0.f305657e
            android.view.ViewGroup$LayoutParams r1 = r1.getLayoutParams()
            androidx.appcompat.widget.Toolbar$LayoutParams r1 = (androidx.appcompat.widget.Toolbar.LayoutParams) r1
            android.widget.TextView r2 = r0.f305657e
            int r2 = r2.getMeasuredWidth()
            int r2 = r10 - r2
            android.widget.TextView r3 = r0.f305657e
            int r3 = r3.getMeasuredHeight()
            int r3 = r3 + r8
            android.widget.TextView r4 = r0.f305657e
            r4.layout(r2, r8, r10, r3)
            int r4 = r0.f305672w
            int r2 = r2 - r4
            int r1 = r1.bottomMargin
            int r8 = r3 + r1
            goto L_0x01f6
        L_0x01f5:
            r2 = r10
        L_0x01f6:
            if (r14 == 0) goto L_0x021c
            android.widget.TextView r1 = r0.f305658f
            android.view.ViewGroup$LayoutParams r1 = r1.getLayoutParams()
            androidx.appcompat.widget.Toolbar$LayoutParams r1 = (androidx.appcompat.widget.Toolbar.LayoutParams) r1
            int r1 = r1.topMargin
            int r8 = r8 + r1
            android.widget.TextView r1 = r0.f305658f
            int r1 = r1.getMeasuredWidth()
            int r1 = r10 - r1
            android.widget.TextView r3 = r0.f305658f
            int r3 = r3.getMeasuredHeight()
            int r3 = r3 + r8
            android.widget.TextView r4 = r0.f305658f
            r4.layout(r1, r8, r10, r3)
            int r1 = r0.f305672w
            int r1 = r10 - r1
            goto L_0x021d
        L_0x021c:
            r1 = r10
        L_0x021d:
            if (r17 == 0) goto L_0x0224
            int r1 = java.lang.Math.min(r2, r1)
            r10 = r1
        L_0x0224:
            r2 = r24
            goto L_0x0291
        L_0x0227:
            if (r17 == 0) goto L_0x022c
            int r1 = r0.f305671v
            goto L_0x022d
        L_0x022c:
            r1 = 0
        L_0x022d:
            r2 = 0
            r3 = r11[r2]
            int r1 = r1 - r3
            int r3 = java.lang.Math.max(r2, r1)
            int r3 = r24 + r3
            int r1 = -r1
            int r1 = java.lang.Math.max(r2, r1)
            r11[r2] = r1
            if (r13 == 0) goto L_0x0263
            android.widget.TextView r1 = r0.f305657e
            android.view.ViewGroup$LayoutParams r1 = r1.getLayoutParams()
            androidx.appcompat.widget.Toolbar$LayoutParams r1 = (androidx.appcompat.widget.Toolbar.LayoutParams) r1
            android.widget.TextView r2 = r0.f305657e
            int r2 = r2.getMeasuredWidth()
            int r2 = r2 + r3
            android.widget.TextView r4 = r0.f305657e
            int r4 = r4.getMeasuredHeight()
            int r4 = r4 + r8
            android.widget.TextView r5 = r0.f305657e
            r5.layout(r3, r8, r2, r4)
            int r5 = r0.f305672w
            int r2 = r2 + r5
            int r1 = r1.bottomMargin
            int r8 = r4 + r1
            goto L_0x0264
        L_0x0263:
            r2 = r3
        L_0x0264:
            if (r14 == 0) goto L_0x0288
            android.widget.TextView r1 = r0.f305658f
            android.view.ViewGroup$LayoutParams r1 = r1.getLayoutParams()
            androidx.appcompat.widget.Toolbar$LayoutParams r1 = (androidx.appcompat.widget.Toolbar.LayoutParams) r1
            int r1 = r1.topMargin
            int r8 = r8 + r1
            android.widget.TextView r1 = r0.f305658f
            int r1 = r1.getMeasuredWidth()
            int r1 = r1 + r3
            android.widget.TextView r4 = r0.f305658f
            int r4 = r4.getMeasuredHeight()
            int r4 = r4 + r8
            android.widget.TextView r5 = r0.f305658f
            r5.layout(r3, r8, r1, r4)
            int r4 = r0.f305672w
            int r1 = r1 + r4
            goto L_0x0289
        L_0x0288:
            r1 = r3
        L_0x0289:
            if (r17 == 0) goto L_0x0290
            int r2 = java.lang.Math.max(r2, r1)
            goto L_0x0291
        L_0x0290:
            r2 = r3
        L_0x0291:
            java.util.ArrayList<android.view.View> r1 = r0.f305644J
            r3 = 3
            r0.mo144215a(r1, r3)
            java.util.ArrayList<android.view.View> r1 = r0.f305644J
            int r1 = r1.size()
            r3 = r2
            r2 = 0
        L_0x029f:
            if (r2 >= r1) goto L_0x02b2
            java.util.ArrayList<android.view.View> r4 = r0.f305644J
            java.lang.Object r4 = r4.get(r2)
            android.view.View r4 = (android.view.View) r4
            r12 = r22
            int r3 = r0.mo144256l(r4, r3, r11, r12)
            int r2 = r2 + 1
            goto L_0x029f
        L_0x02b2:
            r12 = r22
            java.util.ArrayList<android.view.View> r1 = r0.f305644J
            r2 = 5
            r0.mo144215a(r1, r2)
            java.util.ArrayList<android.view.View> r1 = r0.f305644J
            int r1 = r1.size()
            r2 = 0
        L_0x02c1:
            if (r2 >= r1) goto L_0x02d2
            java.util.ArrayList<android.view.View> r4 = r0.f305644J
            java.lang.Object r4 = r4.get(r2)
            android.view.View r4 = (android.view.View) r4
            int r10 = r0.mo144257m(r4, r10, r11, r12)
            int r2 = r2 + 1
            goto L_0x02c1
        L_0x02d2:
            java.util.ArrayList<android.view.View> r1 = r0.f305644J
            r2 = 1
            r0.mo144215a(r1, r2)
            java.util.ArrayList<android.view.View> r1 = r0.f305644J
            r4 = 0
            r5 = r11[r4]
            r2 = r11[r2]
            int r4 = r1.size()
            r6 = 0
            r7 = 0
        L_0x02e5:
            if (r7 >= r4) goto L_0x0318
            java.lang.Object r8 = r1.get(r7)
            android.view.View r8 = (android.view.View) r8
            android.view.ViewGroup$LayoutParams r9 = r8.getLayoutParams()
            androidx.appcompat.widget.Toolbar$LayoutParams r9 = (androidx.appcompat.widget.Toolbar.LayoutParams) r9
            int r13 = r9.leftMargin
            int r13 = r13 - r5
            int r5 = r9.rightMargin
            int r5 = r5 - r2
            r2 = 0
            int r9 = java.lang.Math.max(r2, r13)
            int r14 = java.lang.Math.max(r2, r5)
            int r13 = -r13
            int r13 = java.lang.Math.max(r2, r13)
            int r5 = -r5
            int r5 = java.lang.Math.max(r2, r5)
            int r8 = r8.getMeasuredWidth()
            int r9 = r9 + r8
            int r9 = r9 + r14
            int r6 = r6 + r9
            int r7 = r7 + 1
            r2 = r5
            r5 = r13
            goto L_0x02e5
        L_0x0318:
            r2 = 0
            int r4 = r16 - r18
            int r4 = r4 - r23
            int r4 = r4 / 2
            int r1 = r18 + r4
            int r4 = r6 / 2
            int r1 = r1 - r4
            int r6 = r6 + r1
            if (r1 >= r3) goto L_0x0328
            goto L_0x032f
        L_0x0328:
            if (r6 <= r10) goto L_0x032e
            int r6 = r6 - r10
            int r3 = r1 - r6
            goto L_0x032f
        L_0x032e:
            r3 = r1
        L_0x032f:
            java.util.ArrayList<android.view.View> r1 = r0.f305644J
            int r1 = r1.size()
            r2 = r3
            r3 = 0
        L_0x0337:
            if (r3 >= r1) goto L_0x0348
            java.util.ArrayList<android.view.View> r4 = r0.f305644J
            java.lang.Object r4 = r4.get(r3)
            android.view.View r4 = (android.view.View) r4
            int r2 = r0.mo144256l(r4, r2, r11, r12)
            int r3 = r3 + 1
            goto L_0x0337
        L_0x0348:
            java.util.ArrayList<android.view.View> r1 = r0.f305644J
            r1.clear()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.Toolbar.onLayout(boolean, int, int, int, int):void");
    }

    public void onMeasure(int i, int i2) {
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int[] iArr = this.f305646L;
        char a = C103553n0.m137647a(this);
        boolean z = true;
        int i15 = 0;
        char c = a ^ 1;
        if (mo144268p(this.f305659g)) {
            mo144259o(this.f305659g, i, 0, i2, 0, this.f305670u);
            i5 = this.f305659g.getMeasuredWidth() + mo144253i(this.f305659g);
            i4 = Math.max(0, this.f305659g.getMeasuredHeight() + mo144254j(this.f305659g));
            i3 = View.combineMeasuredStates(0, this.f305659g.getMeasuredState());
        } else {
            i5 = 0;
            i4 = 0;
            i3 = 0;
        }
        if (mo144268p(this.f305663n)) {
            mo144259o(this.f305663n, i, 0, i2, 0, this.f305670u);
            i5 = this.f305663n.getMeasuredWidth() + mo144253i(this.f305663n);
            i4 = Math.max(i4, this.f305663n.getMeasuredHeight() + mo144254j(this.f305663n));
            i3 = View.combineMeasuredStates(i3, this.f305663n.getMeasuredState());
        }
        int currentContentInsetStart = getCurrentContentInsetStart();
        int max = 0 + Math.max(currentContentInsetStart, i5);
        iArr[a] = Math.max(0, currentContentInsetStart - i5);
        if (mo144268p(this.f305656d)) {
            mo144259o(this.f305656d, i, max, i2, 0, this.f305670u);
            i6 = this.f305656d.getMeasuredWidth() + mo144253i(this.f305656d);
            i4 = Math.max(i4, this.f305656d.getMeasuredHeight() + mo144254j(this.f305656d));
            i3 = View.combineMeasuredStates(i3, this.f305656d.getMeasuredState());
        } else {
            i6 = 0;
        }
        int currentContentInsetEnd = getCurrentContentInsetEnd();
        int max2 = max + Math.max(currentContentInsetEnd, i6);
        iArr[c] = Math.max(0, currentContentInsetEnd - i6);
        if (mo144268p(this.f305664o)) {
            max2 += mo144258n(this.f305664o, i, max2, i2, 0, iArr);
            i4 = Math.max(i4, this.f305664o.getMeasuredHeight() + mo144254j(this.f305664o));
            i3 = View.combineMeasuredStates(i3, this.f305664o.getMeasuredState());
        }
        if (mo144268p(this.f305660h)) {
            max2 += mo144258n(this.f305660h, i, max2, i2, 0, iArr);
            i4 = Math.max(i4, this.f305660h.getMeasuredHeight() + mo144254j(this.f305660h));
            i3 = View.combineMeasuredStates(i3, this.f305660h.getMeasuredState());
        }
        int childCount = getChildCount();
        for (int i16 = 0; i16 < childCount; i16++) {
            View childAt = getChildAt(i16);
            if (((LayoutParams) childAt.getLayoutParams()).f305676b == 0 && mo144268p(childAt)) {
                View view = childAt;
                max2 += mo144258n(childAt, i, max2, i2, 0, iArr);
                View view2 = view;
                i4 = Math.max(i4, view.getMeasuredHeight() + mo144254j(view2));
                i3 = View.combineMeasuredStates(i3, view2.getMeasuredState());
            }
        }
        int i17 = this.f305673x + this.f305674y;
        int i18 = this.f305671v + this.f305672w;
        if (mo144268p(this.f305657e)) {
            mo144258n(this.f305657e, i, max2 + i18, i2, i17, iArr);
            int measuredWidth = this.f305657e.getMeasuredWidth() + mo144253i(this.f305657e);
            i7 = this.f305657e.getMeasuredHeight() + mo144254j(this.f305657e);
            i9 = View.combineMeasuredStates(i3, this.f305657e.getMeasuredState());
            i8 = measuredWidth;
        } else {
            i9 = i3;
            i8 = 0;
            i7 = 0;
        }
        if (mo144268p(this.f305658f)) {
            int i19 = i7 + i17;
            i8 = Math.max(i8, mo144258n(this.f305658f, i, max2 + i18, i2, i19, iArr));
            i7 += this.f305658f.getMeasuredHeight() + mo144254j(this.f305658f);
            i9 = View.combineMeasuredStates(i9, this.f305658f.getMeasuredState());
        } else {
            int i25 = i9;
        }
        int max3 = Math.max(i4, i7);
        int paddingLeft = max2 + i8 + getPaddingLeft() + getPaddingRight();
        int paddingTop = max3 + getPaddingTop() + getPaddingBottom();
        int resolveSizeAndState = View.resolveSizeAndState(Math.max(paddingLeft, getSuggestedMinimumWidth()), i, -16777216 & i9);
        int resolveSizeAndState2 = View.resolveSizeAndState(Math.max(paddingTop, getSuggestedMinimumHeight()), i2, i9 << 16);
        if (this.f305654U) {
            int childCount2 = getChildCount();
            int i26 = 0;
            while (true) {
                if (i26 >= childCount2) {
                    break;
                }
                View childAt2 = getChildAt(i26);
                if (mo144268p(childAt2) && childAt2.getMeasuredWidth() > 0 && childAt2.getMeasuredHeight() > 0) {
                    break;
                }
                i26++;
            }
        }
        z = false;
        if (!z) {
            i15 = resolveSizeAndState2;
        }
        setMeasuredDimension(resolveSizeAndState, i15);
    }

    public void onRestoreInstanceState(Parcelable parcelable) {
        MenuItem findItem;
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.f306434d);
        ActionMenuView actionMenuView = this.f305656d;
        C103448e eVar = actionMenuView != null ? actionMenuView.f305411v : null;
        int i = savedState.f305677f;
        if (!(i == 0 || this.f305651R == null || eVar == null || (findItem = eVar.findItem(i)) == null)) {
            findItem.expandActionView();
        }
        if (savedState.f305678g) {
            removeCallbacks(this.f305655V);
            post(this.f305655V);
        }
    }

    public void onRtlPropertiesChanged(int i) {
        super.onRtlPropertiesChanged(i);
        if (this.f305675z == null) {
            this.f305675z = new C103568x();
        }
        C103568x xVar = this.f305675z;
        boolean z = true;
        if (i != 1) {
            z = false;
        }
        if (z != xVar.f305862g) {
            xVar.f305862g = z;
            if (!xVar.f305863h) {
                xVar.f305856a = xVar.f305860e;
                xVar.f305857b = xVar.f305861f;
            } else if (z) {
                int i2 = xVar.f305859d;
                if (i2 == Integer.MIN_VALUE) {
                    i2 = xVar.f305860e;
                }
                xVar.f305856a = i2;
                int i3 = xVar.f305858c;
                if (i3 == Integer.MIN_VALUE) {
                    i3 = xVar.f305861f;
                }
                xVar.f305857b = i3;
            } else {
                int i4 = xVar.f305858c;
                if (i4 == Integer.MIN_VALUE) {
                    i4 = xVar.f305860e;
                }
                xVar.f305856a = i4;
                int i5 = xVar.f305859d;
                if (i5 == Integer.MIN_VALUE) {
                    i5 = xVar.f305861f;
                }
                xVar.f305857b = i5;
            }
        }
    }

    public Parcelable onSaveInstanceState() {
        C103452g gVar;
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        C103514c cVar = this.f305651R;
        if (!(cVar == null || (gVar = cVar.f305682e) == null)) {
            savedState.f305677f = gVar.f305267d;
        }
        ActionMenuView actionMenuView = this.f305656d;
        boolean z = false;
        if (actionMenuView != null) {
            ActionMenuPresenter actionMenuPresenter = actionMenuView.f305415z;
            if (actionMenuPresenter != null && actionMenuPresenter.mo143807m()) {
                z = true;
            }
        }
        savedState.f305678g = z;
        return savedState;
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.f305642H = false;
        }
        if (!this.f305642H) {
            boolean onTouchEvent = super.onTouchEvent(motionEvent);
            if (actionMasked == 0 && !onTouchEvent) {
                this.f305642H = true;
            }
        }
        if (actionMasked == 1 || actionMasked == 3) {
            this.f305642H = false;
        }
        return true;
    }

    /* renamed from: p */
    public final boolean mo144268p(View view) {
        return (view == null || view.getParent() != this || view.getVisibility() == 8) ? false : true;
    }

    public void setCollapsible(boolean z) {
        this.f305654U = z;
        requestLayout();
    }

    public void setContentInsetEndWithActions(int i) {
        if (i < 0) {
            i = Integer.MIN_VALUE;
        }
        if (i != this.f305636B) {
            this.f305636B = i;
            if (getNavigationIcon() != null) {
                requestLayout();
            }
        }
    }

    public void setContentInsetStartWithNavigation(int i) {
        if (i < 0) {
            i = Integer.MIN_VALUE;
        }
        if (i != this.f305635A) {
            this.f305635A = i;
            if (getNavigationIcon() != null) {
                requestLayout();
            }
        }
    }

    public void setLogo(int i) {
        setLogo(C107922a.m146228b(getContext(), i));
    }

    public void setLogoDescription(int i) {
        setLogoDescription(getContext().getText(i));
    }

    public void setNavigationContentDescription(int i) {
        setNavigationContentDescription(i != 0 ? getContext().getText(i) : null);
    }

    public void setNavigationIcon(int i) {
        setNavigationIcon(C107922a.m146228b(getContext(), i));
    }

    public void setNavigationOnClickListener(View.OnClickListener onClickListener) {
        mo144220e();
        this.f305659g.setOnClickListener(onClickListener);
    }

    public void setOnMenuItemClickListener(C103515d dVar) {
        this.f305647M = dVar;
    }

    public void setOverflowIcon(Drawable drawable) {
        mo144217c();
        this.f305656d.setOverflowIcon(drawable);
    }

    public void setPopupTheme(int i) {
        if (this.f305666q != i) {
            this.f305666q = i;
            if (i == 0) {
                this.f305665p = getContext();
            } else {
                this.f305665p = new ContextThemeWrapper(getContext(), i);
            }
        }
    }

    public void setSubtitle(int i) {
        setSubtitle(getContext().getText(i));
    }

    public void setSubtitleTextColor(int i) {
        this.f305641G = i;
        TextView textView = this.f305658f;
        if (textView != null) {
            textView.setTextColor(i);
        }
    }

    public void setTitle(int i) {
        setTitle(getContext().getText(i));
    }

    public void setTitleMarginBottom(int i) {
        this.f305674y = i;
        requestLayout();
    }

    public void setTitleMarginEnd(int i) {
        this.f305672w = i;
        requestLayout();
    }

    public void setTitleMarginStart(int i) {
        this.f305671v = i;
        requestLayout();
    }

    public void setTitleMarginTop(int i) {
        this.f305673x = i;
        requestLayout();
    }

    public void setTitleTextColor(int i) {
        this.f305640F = i;
        TextView textView = this.f305657e;
        if (textView != null) {
            textView.setTextColor(i);
        }
    }

    public static class LayoutParams extends ActionBar.LayoutParams {

        /* renamed from: b */
        public int f305676b = 0;

        public LayoutParams(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public LayoutParams(int i, int i2) {
            super(i, i2);
            this.f192646a = 8388627;
        }

        public LayoutParams(LayoutParams layoutParams) {
            super((ActionBar.LayoutParams) layoutParams);
            this.f305676b = layoutParams.f305676b;
        }

        public LayoutParams(ActionBar.LayoutParams layoutParams) {
            super(layoutParams);
        }

        public LayoutParams(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super((ViewGroup.LayoutParams) marginLayoutParams);
            this.leftMargin = marginLayoutParams.leftMargin;
            this.topMargin = marginLayoutParams.topMargin;
            this.rightMargin = marginLayoutParams.rightMargin;
            this.bottomMargin = marginLayoutParams.bottomMargin;
        }

        public LayoutParams(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }
    }

    public Toolbar(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f305637C = 8388627;
        this.f305644J = new ArrayList<>();
        this.f305645K = new ArrayList<>();
        this.f305646L = new int[2];
        this.f305648N = new C103512a();
        this.f305655V = new C103513b();
        C103533f0 l = C103533f0.m137562l(getContext(), attributeSet, C107593a.f321897C, i, 0);
        this.f305667r = l.mo144340i(27, 0);
        this.f305668s = l.mo144340i(18, 0);
        this.f305637C = l.f305736b.getInteger(0, this.f305637C);
        this.f305669t = l.f305736b.getInteger(2, 48);
        int c = l.mo144334c(21, 0);
        c = l.mo144342k(26) ? l.mo144334c(26, c) : c;
        this.f305674y = c;
        this.f305673x = c;
        this.f305672w = c;
        this.f305671v = c;
        int c2 = l.mo144334c(24, -1);
        if (c2 >= 0) {
            this.f305671v = c2;
        }
        int c3 = l.mo144334c(23, -1);
        if (c3 >= 0) {
            this.f305672w = c3;
        }
        int c4 = l.mo144334c(25, -1);
        if (c4 >= 0) {
            this.f305673x = c4;
        }
        int c5 = l.mo144334c(22, -1);
        if (c5 >= 0) {
            this.f305674y = c5;
        }
        this.f305670u = l.mo144335d(13, -1);
        int c6 = l.mo144334c(9, Integer.MIN_VALUE);
        int c7 = l.mo144334c(5, Integer.MIN_VALUE);
        int d = l.mo144335d(7, 0);
        int d2 = l.mo144335d(8, 0);
        if (this.f305675z == null) {
            this.f305675z = new C103568x();
        }
        C103568x xVar = this.f305675z;
        xVar.f305863h = false;
        if (d != Integer.MIN_VALUE) {
            xVar.f305860e = d;
            xVar.f305856a = d;
        }
        if (d2 != Integer.MIN_VALUE) {
            xVar.f305861f = d2;
            xVar.f305857b = d2;
        }
        if (!(c6 == Integer.MIN_VALUE && c7 == Integer.MIN_VALUE)) {
            xVar.mo144446a(c6, c7);
        }
        this.f305635A = l.mo144334c(10, Integer.MIN_VALUE);
        this.f305636B = l.mo144334c(6, Integer.MIN_VALUE);
        this.f305661i = l.mo144336e(4);
        this.f305662j = l.mo144341j(3);
        CharSequence j = l.mo144341j(20);
        if (!TextUtils.isEmpty(j)) {
            setTitle(j);
        }
        CharSequence j2 = l.mo144341j(17);
        if (!TextUtils.isEmpty(j2)) {
            setSubtitle(j2);
        }
        this.f305665p = getContext();
        setPopupTheme(l.mo144340i(16, 0));
        Drawable e = l.mo144336e(15);
        if (e != null) {
            setNavigationIcon(e);
        }
        CharSequence j3 = l.mo144341j(14);
        if (!TextUtils.isEmpty(j3)) {
            setNavigationContentDescription(j3);
        }
        Drawable e2 = l.mo144336e(11);
        if (e2 != null) {
            setLogo(e2);
        }
        CharSequence j4 = l.mo144341j(12);
        if (!TextUtils.isEmpty(j4)) {
            setLogoDescription(j4);
        }
        if (l.mo144342k(28)) {
            setTitleTextColor(l.f305736b.getColor(28, -1));
        }
        if (l.mo144342k(19)) {
            setSubtitleTextColor(l.f305736b.getColor(19, -1));
        }
        l.mo144343m();
    }

    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new LayoutParams(getContext(), attributeSet);
    }

    public void setLogo(Drawable drawable) {
        if (drawable != null) {
            if (this.f305660h == null) {
                this.f305660h = new AppCompatImageView(getContext(), (AttributeSet) null);
            }
            if (!mo144255k(this.f305660h)) {
                mo144216b(this.f305660h, true);
            }
        } else {
            ImageView imageView = this.f305660h;
            if (imageView != null && mo144255k(imageView)) {
                removeView(this.f305660h);
                this.f305645K.remove(this.f305660h);
            }
        }
        ImageView imageView2 = this.f305660h;
        if (imageView2 != null) {
            imageView2.setImageDrawable(drawable);
        }
    }

    public void setLogoDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence) && this.f305660h == null) {
            this.f305660h = new AppCompatImageView(getContext(), (AttributeSet) null);
        }
        ImageView imageView = this.f305660h;
        if (imageView != null) {
            imageView.setContentDescription(charSequence);
        }
    }

    public void setNavigationContentDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            mo144220e();
        }
        ImageButton imageButton = this.f305659g;
        if (imageButton != null) {
            imageButton.setContentDescription(charSequence);
        }
    }

    public void setNavigationIcon(Drawable drawable) {
        if (drawable != null) {
            mo144220e();
            if (!mo144255k(this.f305659g)) {
                mo144216b(this.f305659g, true);
            }
        } else {
            ImageButton imageButton = this.f305659g;
            if (imageButton != null && mo144255k(imageButton)) {
                removeView(this.f305659g);
                this.f305645K.remove(this.f305659g);
            }
        }
        ImageButton imageButton2 = this.f305659g;
        if (imageButton2 != null) {
            imageButton2.setImageDrawable(drawable);
        }
    }

    public void setSubtitle(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            if (this.f305658f == null) {
                Context context = getContext();
                AppCompatTextView appCompatTextView = new AppCompatTextView(context, (AttributeSet) null);
                this.f305658f = appCompatTextView;
                appCompatTextView.setSingleLine();
                this.f305658f.setEllipsize(TextUtils.TruncateAt.END);
                int i = this.f305668s;
                if (i != 0) {
                    this.f305658f.setTextAppearance(context, i);
                }
                int i2 = this.f305641G;
                if (i2 != 0) {
                    this.f305658f.setTextColor(i2);
                }
            }
            if (!mo144255k(this.f305658f)) {
                mo144216b(this.f305658f, true);
            }
        } else {
            TextView textView = this.f305658f;
            if (textView != null && mo144255k(textView)) {
                removeView(this.f305658f);
                this.f305645K.remove(this.f305658f);
            }
        }
        TextView textView2 = this.f305658f;
        if (textView2 != null) {
            textView2.setText(charSequence);
        }
        this.f305639E = charSequence;
    }

    public void setTitle(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            if (this.f305657e == null) {
                Context context = getContext();
                AppCompatTextView appCompatTextView = new AppCompatTextView(context, (AttributeSet) null);
                this.f305657e = appCompatTextView;
                appCompatTextView.setSingleLine();
                this.f305657e.setEllipsize(TextUtils.TruncateAt.END);
                int i = this.f305667r;
                if (i != 0) {
                    this.f305657e.setTextAppearance(context, i);
                }
                int i2 = this.f305640F;
                if (i2 != 0) {
                    this.f305657e.setTextColor(i2);
                }
            }
            if (!mo144255k(this.f305657e)) {
                mo144216b(this.f305657e, true);
            }
        } else {
            TextView textView = this.f305657e;
            if (textView != null && mo144255k(textView)) {
                removeView(this.f305657e);
                this.f305645K.remove(this.f305657e);
            }
        }
        TextView textView2 = this.f305657e;
        if (textView2 != null) {
            textView2.setText(charSequence);
        }
        this.f305638D = charSequence;
    }

    public static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new C103511a();

        /* renamed from: f */
        public int f305677f;

        /* renamed from: g */
        public boolean f305678g;

        /* renamed from: androidx.appcompat.widget.Toolbar$SavedState$a */
        public static class C103511a implements Parcelable.ClassLoaderCreator<SavedState> {
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

        public SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f305677f = parcel.readInt();
            this.f305678g = parcel.readInt() != 0;
        }

        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeParcelable(this.f306434d, i);
            parcel.writeInt(this.f305677f);
            parcel.writeInt(this.f305678g ? 1 : 0);
        }

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }
    }
}

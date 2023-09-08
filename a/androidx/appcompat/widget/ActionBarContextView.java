package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.view.menu.C103448e;
import androidx.appcompat.view.menu.C103458j;
import androidx.appcompat.widget.ActionMenuPresenter;
import com.tencent.p014mm.C0966R;
import java.util.WeakHashMap;
import p1115h.C107922a;
import p433g.C107593a;
import p849e3.C107168a0;
import p849e3.C107207u;
import p990k.C108781a;

public class ActionBarContextView extends C103516a {

    /* renamed from: o */
    public CharSequence f305335o;

    /* renamed from: p */
    public CharSequence f305336p;

    /* renamed from: q */
    public View f305337q;

    /* renamed from: r */
    public View f305338r;

    /* renamed from: s */
    public LinearLayout f305339s;

    /* renamed from: t */
    public TextView f305340t;

    /* renamed from: u */
    public TextView f305341u;

    /* renamed from: v */
    public int f305342v;

    /* renamed from: w */
    public int f305343w;

    /* renamed from: x */
    public boolean f305344x;

    /* renamed from: y */
    public int f305345y;

    /* renamed from: androidx.appcompat.widget.ActionBarContextView$a */
    public class C103464a implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ C108781a f305346d;

        public C103464a(ActionBarContextView actionBarContextView, C108781a aVar) {
            this.f305346d = aVar;
        }

        public void onClick(View view) {
            this.f305346d.mo143484a();
        }
    }

    public ActionBarContextView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C0966R.attr.f2647an);
    }

    /* renamed from: f */
    public void mo143733f(C108781a aVar) {
        View view = this.f305337q;
        if (view == null) {
            View inflate = LayoutInflater.from(getContext()).inflate(this.f305345y, this, false);
            this.f305337q = inflate;
            addView(inflate);
        } else if (view.getParent() == null) {
            addView(this.f305337q);
        }
        this.f305337q.findViewById(C0966R.C0970id.f5419em).setOnClickListener(new C103464a(this, aVar));
        C103448e eVar = (C103448e) aVar.mo143486e();
        ActionMenuPresenter actionMenuPresenter = this.f305687g;
        if (actionMenuPresenter != null) {
            actionMenuPresenter.mo143806l();
            ActionMenuPresenter.C103470a aVar2 = actionMenuPresenter.f305379B;
            if (aVar2 != null && aVar2.mo143697b()) {
                aVar2.f305297j.dismiss();
            }
        }
        ActionMenuPresenter actionMenuPresenter2 = new ActionMenuPresenter(getContext());
        this.f305687g = actionMenuPresenter2;
        actionMenuPresenter2.f305387s = true;
        actionMenuPresenter2.f305388t = true;
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-2, -1);
        eVar.mo143590b(this.f305687g, this.f305685e);
        ActionMenuPresenter actionMenuPresenter3 = this.f305687g;
        C103458j jVar = actionMenuPresenter3.f305178n;
        if (jVar == null) {
            C103458j jVar2 = (C103458j) actionMenuPresenter3.f305174g.inflate(actionMenuPresenter3.f305176i, this, false);
            actionMenuPresenter3.f305178n = jVar2;
            jVar2.mo143520f(actionMenuPresenter3.f305173f);
            actionMenuPresenter3.mo143539c(true);
        }
        C103458j jVar3 = actionMenuPresenter3.f305178n;
        if (jVar != jVar3) {
            ((ActionMenuView) jVar3).setPresenter(actionMenuPresenter3);
        }
        ActionMenuView actionMenuView = (ActionMenuView) jVar3;
        this.f305686f = actionMenuView;
        WeakHashMap<View, C107168a0> weakHashMap = C107207u.f320808a;
        C107207u.C107208b.m145189q(actionMenuView, (Drawable) null);
        addView(this.f305686f, layoutParams);
    }

    /* renamed from: g */
    public final void mo143734g() {
        if (this.f305339s == null) {
            LayoutInflater.from(getContext()).inflate(C0966R.C0971layout.f6270a8, this);
            LinearLayout linearLayout = (LinearLayout) getChildAt(getChildCount() - 1);
            this.f305339s = linearLayout;
            this.f305340t = (TextView) linearLayout.findViewById(C0966R.C0970id.f5390dv);
            this.f305341u = (TextView) this.f305339s.findViewById(C0966R.C0970id.f5389du);
            if (this.f305342v != 0) {
                this.f305340t.setTextAppearance(getContext(), this.f305342v);
            }
            if (this.f305343w != 0) {
                this.f305341u.setTextAppearance(getContext(), this.f305343w);
            }
        }
        this.f305340t.setText(this.f305335o);
        this.f305341u.setText(this.f305336p);
        boolean z = !TextUtils.isEmpty(this.f305335o);
        boolean z2 = !TextUtils.isEmpty(this.f305336p);
        int i = 0;
        this.f305341u.setVisibility(z2 ? 0 : 8);
        LinearLayout linearLayout2 = this.f305339s;
        if (!z && !z2) {
            i = 8;
        }
        linearLayout2.setVisibility(i);
        if (this.f305339s.getParent() == null) {
            addView(this.f305339s);
        }
    }

    public ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new ViewGroup.MarginLayoutParams(-1, -2);
    }

    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new ViewGroup.MarginLayoutParams(getContext(), attributeSet);
    }

    public /* bridge */ /* synthetic */ int getAnimatedVisibility() {
        return super.getAnimatedVisibility();
    }

    public /* bridge */ /* synthetic */ int getContentHeight() {
        return super.getContentHeight();
    }

    public CharSequence getSubtitle() {
        return this.f305336p;
    }

    public CharSequence getTitle() {
        return this.f305335o;
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        ActionMenuPresenter actionMenuPresenter = this.f305687g;
        if (actionMenuPresenter != null) {
            actionMenuPresenter.mo143806l();
            ActionMenuPresenter.C103470a aVar = this.f305687g.f305379B;
            if (aVar != null && aVar.mo143697b()) {
                aVar.f305297j.dismiss();
            }
        }
    }

    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        if (accessibilityEvent.getEventType() == 32) {
            accessibilityEvent.setSource(this);
            accessibilityEvent.setClassName(getClass().getName());
            accessibilityEvent.setPackageName(getContext().getPackageName());
            accessibilityEvent.setContentDescription(this.f305335o);
            return;
        }
        super.onInitializeAccessibilityEvent(accessibilityEvent);
    }

    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        boolean a = C103553n0.m137647a(this);
        int paddingRight = a ? (i3 - i) - getPaddingRight() : getPaddingLeft();
        int paddingTop = getPaddingTop();
        int paddingTop2 = ((i4 - i2) - getPaddingTop()) - getPaddingBottom();
        View view = this.f305337q;
        if (!(view == null || view.getVisibility() == 8)) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f305337q.getLayoutParams();
            int i5 = a ? marginLayoutParams.rightMargin : marginLayoutParams.leftMargin;
            int i6 = a ? marginLayoutParams.leftMargin : marginLayoutParams.rightMargin;
            int i7 = a ? paddingRight - i5 : paddingRight + i5;
            int d = i7 + mo144299d(this.f305337q, i7, paddingTop, paddingTop2, a);
            paddingRight = a ? d - i6 : d + i6;
        }
        int i8 = paddingRight;
        LinearLayout linearLayout = this.f305339s;
        if (!(linearLayout == null || this.f305338r != null || linearLayout.getVisibility() == 8)) {
            i8 += mo144299d(this.f305339s, i8, paddingTop, paddingTop2, a);
        }
        int i9 = i8;
        View view2 = this.f305338r;
        if (view2 != null) {
            mo144299d(view2, i9, paddingTop, paddingTop2, a);
        }
        int paddingLeft = a ? getPaddingLeft() : (i3 - i) - getPaddingRight();
        ActionMenuView actionMenuView = this.f305686f;
        if (actionMenuView != null) {
            mo144299d(actionMenuView, paddingLeft, paddingTop, paddingTop2, !a);
        }
    }

    public void onMeasure(int i, int i2) {
        int i3 = 1073741824;
        if (View.MeasureSpec.getMode(i) != 1073741824) {
            throw new IllegalStateException(getClass().getSimpleName() + " can only be used " + "with android:layout_width=\"match_parent\" (or fill_parent)");
        } else if (View.MeasureSpec.getMode(i2) != 0) {
            int size = View.MeasureSpec.getSize(i);
            int i4 = this.f305688h;
            if (i4 <= 0) {
                i4 = View.MeasureSpec.getSize(i2);
            }
            int paddingTop = getPaddingTop() + getPaddingBottom();
            int paddingLeft = (size - getPaddingLeft()) - getPaddingRight();
            int i5 = i4 - paddingTop;
            int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i5, Integer.MIN_VALUE);
            View view = this.f305337q;
            if (view != null) {
                int c = mo144298c(view, paddingLeft, makeMeasureSpec, 0);
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f305337q.getLayoutParams();
                paddingLeft = c - (marginLayoutParams.leftMargin + marginLayoutParams.rightMargin);
            }
            ActionMenuView actionMenuView = this.f305686f;
            if (actionMenuView != null && actionMenuView.getParent() == this) {
                paddingLeft = mo144298c(this.f305686f, paddingLeft, makeMeasureSpec, 0);
            }
            LinearLayout linearLayout = this.f305339s;
            if (linearLayout != null && this.f305338r == null) {
                if (this.f305344x) {
                    this.f305339s.measure(View.MeasureSpec.makeMeasureSpec(0, 0), makeMeasureSpec);
                    int measuredWidth = this.f305339s.getMeasuredWidth();
                    boolean z = measuredWidth <= paddingLeft;
                    if (z) {
                        paddingLeft -= measuredWidth;
                    }
                    this.f305339s.setVisibility(z ? 0 : 8);
                } else {
                    paddingLeft = mo144298c(linearLayout, paddingLeft, makeMeasureSpec, 0);
                }
            }
            View view2 = this.f305338r;
            if (view2 != null) {
                ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
                int i6 = layoutParams.width;
                int i7 = i6 != -2 ? 1073741824 : Integer.MIN_VALUE;
                if (i6 >= 0) {
                    paddingLeft = Math.min(i6, paddingLeft);
                }
                int i8 = layoutParams.height;
                if (i8 == -2) {
                    i3 = Integer.MIN_VALUE;
                }
                if (i8 >= 0) {
                    i5 = Math.min(i8, i5);
                }
                this.f305338r.measure(View.MeasureSpec.makeMeasureSpec(paddingLeft, i7), View.MeasureSpec.makeMeasureSpec(i5, i3));
            }
            if (this.f305688h <= 0) {
                int childCount = getChildCount();
                int i9 = 0;
                for (int i15 = 0; i15 < childCount; i15++) {
                    int measuredHeight = getChildAt(i15).getMeasuredHeight() + paddingTop;
                    if (measuredHeight > i9) {
                        i9 = measuredHeight;
                    }
                }
                setMeasuredDimension(size, i9);
                return;
            }
            setMeasuredDimension(size, i4);
        } else {
            throw new IllegalStateException(getClass().getSimpleName() + " can only be used " + "with android:layout_height=\"wrap_content\"");
        }
    }

    public void setContentHeight(int i) {
        this.f305688h = i;
    }

    public void setCustomView(View view) {
        LinearLayout linearLayout;
        View view2 = this.f305338r;
        if (view2 != null) {
            removeView(view2);
        }
        this.f305338r = view;
        if (!(view == null || (linearLayout = this.f305339s) == null)) {
            removeView(linearLayout);
            this.f305339s = null;
        }
        if (view != null) {
            addView(view);
        }
        requestLayout();
    }

    public void setSubtitle(CharSequence charSequence) {
        this.f305336p = charSequence;
        mo143734g();
    }

    public void setTitle(CharSequence charSequence) {
        this.f305335o = charSequence;
        mo143734g();
    }

    public void setTitleOptional(boolean z) {
        if (z != this.f305344x) {
            requestLayout();
        }
        this.f305344x = z;
    }

    public /* bridge */ /* synthetic */ void setVisibility(int i) {
        super.setVisibility(i);
    }

    public boolean shouldDelayChildPressedState() {
        return false;
    }

    public ActionBarContextView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Drawable drawable;
        int resourceId;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C107593a.f321904d, i, 0);
        if (!obtainStyledAttributes.hasValue(0) || (resourceId = obtainStyledAttributes.getResourceId(0, 0)) == 0) {
            drawable = obtainStyledAttributes.getDrawable(0);
        } else {
            drawable = C107922a.m146228b(context, resourceId);
        }
        WeakHashMap<View, C107168a0> weakHashMap = C107207u.f320808a;
        C107207u.C107208b.m145189q(this, drawable);
        this.f305342v = obtainStyledAttributes.getResourceId(5, 0);
        this.f305343w = obtainStyledAttributes.getResourceId(4, 0);
        this.f305688h = obtainStyledAttributes.getLayoutDimension(3, 0);
        this.f305345y = obtainStyledAttributes.getResourceId(2, C0966R.C0971layout.f6274ac);
        obtainStyledAttributes.recycle();
    }
}

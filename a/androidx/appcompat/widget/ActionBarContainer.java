package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.tencent.p014mm.C0966R;
import java.util.WeakHashMap;
import p433g.C107593a;
import p849e3.C107168a0;
import p849e3.C107207u;

public class ActionBarContainer extends FrameLayout {

    /* renamed from: d */
    public boolean f305325d;

    /* renamed from: e */
    public View f305326e;

    /* renamed from: f */
    public View f305327f;

    /* renamed from: g */
    public View f305328g;

    /* renamed from: h */
    public Drawable f305329h;

    /* renamed from: i */
    public Drawable f305330i;

    /* renamed from: j */
    public Drawable f305331j;

    /* renamed from: n */
    public boolean f305332n;

    /* renamed from: o */
    public boolean f305333o;

    /* renamed from: p */
    public int f305334p;

    public ActionBarContainer(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C103519b bVar = new C103519b(this);
        WeakHashMap<View, C107168a0> weakHashMap = C107207u.f320808a;
        C107207u.C107208b.m145189q(this, bVar);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C107593a.f321901a);
        boolean z = false;
        this.f305329h = obtainStyledAttributes.getDrawable(0);
        this.f305330i = obtainStyledAttributes.getDrawable(2);
        this.f305334p = obtainStyledAttributes.getDimensionPixelSize(13, -1);
        if (getId() == C0966R.C0970id.jzm) {
            this.f305332n = true;
            this.f305331j = obtainStyledAttributes.getDrawable(1);
        }
        obtainStyledAttributes.recycle();
        if (!this.f305332n ? this.f305329h == null && this.f305330i == null : this.f305331j == null) {
            z = true;
        }
        setWillNotDraw(z);
    }

    /* renamed from: a */
    public final int mo143714a(View view) {
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) view.getLayoutParams();
        return view.getMeasuredHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
    }

    public void drawableStateChanged() {
        super.drawableStateChanged();
        Drawable drawable = this.f305329h;
        if (drawable != null && drawable.isStateful()) {
            this.f305329h.setState(getDrawableState());
        }
        Drawable drawable2 = this.f305330i;
        if (drawable2 != null && drawable2.isStateful()) {
            this.f305330i.setState(getDrawableState());
        }
        Drawable drawable3 = this.f305331j;
        if (drawable3 != null && drawable3.isStateful()) {
            this.f305331j.setState(getDrawableState());
        }
    }

    public View getTabContainer() {
        return this.f305326e;
    }

    public void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.f305329h;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
        Drawable drawable2 = this.f305330i;
        if (drawable2 != null) {
            drawable2.jumpToCurrentState();
        }
        Drawable drawable3 = this.f305331j;
        if (drawable3 != null) {
            drawable3.jumpToCurrentState();
        }
    }

    public void onFinishInflate() {
        super.onFinishInflate();
        this.f305327f = findViewById(C0966R.C0970id.f5380dl);
        this.f305328g = findViewById(C0966R.C0970id.f5400e4);
    }

    public boolean onHoverEvent(MotionEvent motionEvent) {
        super.onHoverEvent(motionEvent);
        return true;
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return this.f305325d || super.onInterceptTouchEvent(motionEvent);
    }

    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        Drawable drawable;
        super.onLayout(z, i, i2, i3, i4);
        View view = this.f305326e;
        boolean z2 = true;
        boolean z3 = false;
        boolean z4 = (view == null || view.getVisibility() == 8) ? false : true;
        if (!(view == null || view.getVisibility() == 8)) {
            int measuredHeight = getMeasuredHeight();
            int i5 = ((FrameLayout.LayoutParams) view.getLayoutParams()).bottomMargin;
            view.layout(i, (measuredHeight - view.getMeasuredHeight()) - i5, i3, measuredHeight - i5);
        }
        if (this.f305332n) {
            Drawable drawable2 = this.f305331j;
            if (drawable2 != null) {
                drawable2.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
            } else {
                z2 = false;
            }
        } else {
            if (this.f305329h != null) {
                if (this.f305327f.getVisibility() == 0) {
                    this.f305329h.setBounds(this.f305327f.getLeft(), this.f305327f.getTop(), this.f305327f.getRight(), this.f305327f.getBottom());
                } else {
                    View view2 = this.f305328g;
                    if (view2 == null || view2.getVisibility() != 0) {
                        this.f305329h.setBounds(0, 0, 0, 0);
                    } else {
                        this.f305329h.setBounds(this.f305328g.getLeft(), this.f305328g.getTop(), this.f305328g.getRight(), this.f305328g.getBottom());
                    }
                }
                z3 = true;
            }
            this.f305333o = z4;
            if (!z4 || (drawable = this.f305330i) == null) {
                z2 = z3;
            } else {
                drawable.setBounds(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
            }
        }
        if (z2) {
            invalidate();
        }
    }

    public void onMeasure(int i, int i2) {
        int i3;
        if (this.f305327f == null && View.MeasureSpec.getMode(i2) == Integer.MIN_VALUE && (i3 = this.f305334p) >= 0) {
            i2 = View.MeasureSpec.makeMeasureSpec(Math.min(i3, View.MeasureSpec.getSize(i2)), Integer.MIN_VALUE);
        }
        super.onMeasure(i, i2);
        if (this.f305327f != null) {
            int mode = View.MeasureSpec.getMode(i2);
            View view = this.f305326e;
            if (view != null && view.getVisibility() != 8 && mode != 1073741824) {
                View view2 = this.f305327f;
                boolean z = true;
                int i4 = 0;
                if (!(view2 == null || view2.getVisibility() == 8 || view2.getMeasuredHeight() == 0)) {
                    i4 = mo143714a(this.f305327f);
                } else {
                    View view3 = this.f305328g;
                    if (!(view3 == null || view3.getVisibility() == 8 || view3.getMeasuredHeight() == 0)) {
                        z = false;
                    }
                    if (!z) {
                        i4 = mo143714a(this.f305328g);
                    }
                }
                setMeasuredDimension(getMeasuredWidth(), Math.min(i4 + mo143714a(this.f305326e), mode == Integer.MIN_VALUE ? View.MeasureSpec.getSize(i2) : Integer.MAX_VALUE));
            }
        }
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        super.onTouchEvent(motionEvent);
        return true;
    }

    public void setPrimaryBackground(Drawable drawable) {
        Drawable drawable2 = this.f305329h;
        if (drawable2 != null) {
            drawable2.setCallback((Drawable.Callback) null);
            unscheduleDrawable(this.f305329h);
        }
        this.f305329h = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
            View view = this.f305327f;
            if (view != null) {
                this.f305329h.setBounds(view.getLeft(), this.f305327f.getTop(), this.f305327f.getRight(), this.f305327f.getBottom());
            }
        }
        boolean z = true;
        if (!this.f305332n ? !(this.f305329h == null && this.f305330i == null) : this.f305331j != null) {
            z = false;
        }
        setWillNotDraw(z);
        invalidate();
    }

    public void setSplitBackground(Drawable drawable) {
        Drawable drawable2;
        Drawable drawable3 = this.f305331j;
        if (drawable3 != null) {
            drawable3.setCallback((Drawable.Callback) null);
            unscheduleDrawable(this.f305331j);
        }
        this.f305331j = drawable;
        boolean z = false;
        if (drawable != null) {
            drawable.setCallback(this);
            if (this.f305332n && (drawable2 = this.f305331j) != null) {
                drawable2.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
            }
        }
        if (!this.f305332n ? this.f305329h == null && this.f305330i == null : this.f305331j == null) {
            z = true;
        }
        setWillNotDraw(z);
        invalidate();
    }

    public void setStackedBackground(Drawable drawable) {
        Drawable drawable2;
        Drawable drawable3 = this.f305330i;
        if (drawable3 != null) {
            drawable3.setCallback((Drawable.Callback) null);
            unscheduleDrawable(this.f305330i);
        }
        this.f305330i = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
            if (this.f305333o && (drawable2 = this.f305330i) != null) {
                drawable2.setBounds(this.f305326e.getLeft(), this.f305326e.getTop(), this.f305326e.getRight(), this.f305326e.getBottom());
            }
        }
        boolean z = true;
        if (!this.f305332n ? !(this.f305329h == null && this.f305330i == null) : this.f305331j != null) {
            z = false;
        }
        setWillNotDraw(z);
        invalidate();
    }

    public void setTabContainer(C103569y yVar) {
        View view = this.f305326e;
        if (view != null) {
            removeView(view);
        }
        this.f305326e = yVar;
        if (yVar != null) {
            addView(yVar);
            ViewGroup.LayoutParams layoutParams = yVar.getLayoutParams();
            layoutParams.width = -1;
            layoutParams.height = -2;
            yVar.setAllowCollapse(false);
        }
    }

    public void setTransitioning(boolean z) {
        this.f305325d = z;
        setDescendantFocusability(z ? 393216 : 262144);
    }

    public void setVisibility(int i) {
        super.setVisibility(i);
        boolean z = i == 0;
        Drawable drawable = this.f305329h;
        if (drawable != null) {
            drawable.setVisible(z, false);
        }
        Drawable drawable2 = this.f305330i;
        if (drawable2 != null) {
            drawable2.setVisible(z, false);
        }
        Drawable drawable3 = this.f305331j;
        if (drawable3 != null) {
            drawable3.setVisible(z, false);
        }
    }

    public ActionMode startActionModeForChild(View view, ActionMode.Callback callback) {
        return null;
    }

    public ActionMode startActionModeForChild(View view, ActionMode.Callback callback, int i) {
        if (i != 0) {
            return super.startActionModeForChild(view, callback, i);
        }
        return null;
    }

    public boolean verifyDrawable(Drawable drawable) {
        return (drawable == this.f305329h && !this.f305332n) || (drawable == this.f305330i && this.f305333o) || ((drawable == this.f305331j && this.f305332n) || super.verifyDrawable(drawable));
    }
}

package androidx.fragment.app;

import android.animation.LayoutTransition;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import android.widget.FrameLayout;
import com.google.android.gms.common.server.response.FastJsonResponse;
import java.util.ArrayList;
import p1199l3.C117444a;

public final class FragmentContainerView extends FrameLayout {

    /* renamed from: d */
    public ArrayList<View> f337952d;

    /* renamed from: e */
    public ArrayList<View> f337953e;

    /* renamed from: f */
    public boolean f337954f;

    public FragmentContainerView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* renamed from: a */
    public final void mo165002a(View view) {
        ArrayList<View> arrayList = this.f337953e;
        if (arrayList != null && arrayList.contains(view)) {
            if (this.f337952d == null) {
                this.f337952d = new ArrayList<>();
            }
            this.f337952d.add(view);
        }
    }

    public void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        if (FragmentManager.getViewFragment(view) != null) {
            super.addView(view, i, layoutParams);
            return;
        }
        throw new IllegalStateException("Views added to a FragmentContainerView must be associated with a Fragment. View " + view + " is not associated with a Fragment.");
    }

    public boolean addViewInLayout(View view, int i, ViewGroup.LayoutParams layoutParams, boolean z) {
        if (FragmentManager.getViewFragment(view) != null) {
            return super.addViewInLayout(view, i, layoutParams, z);
        }
        throw new IllegalStateException("Views added to a FragmentContainerView must be associated with a Fragment. View " + view + " is not associated with a Fragment.");
    }

    public void dispatchDraw(Canvas canvas) {
        if (this.f337954f && this.f337952d != null) {
            for (int i = 0; i < this.f337952d.size(); i++) {
                super.drawChild(canvas, this.f337952d.get(i), getDrawingTime());
            }
        }
        super.dispatchDraw(canvas);
    }

    public boolean drawChild(Canvas canvas, View view, long j) {
        ArrayList<View> arrayList;
        if (!this.f337954f || (arrayList = this.f337952d) == null || arrayList.size() <= 0 || !this.f337952d.contains(view)) {
            return super.drawChild(canvas, view, j);
        }
        return false;
    }

    public void endViewTransition(View view) {
        ArrayList<View> arrayList = this.f337953e;
        if (arrayList != null) {
            arrayList.remove(view);
            ArrayList<View> arrayList2 = this.f337952d;
            if (arrayList2 != null && arrayList2.remove(view)) {
                this.f337954f = true;
            }
        }
        super.endViewTransition(view);
    }

    public WindowInsets onApplyWindowInsets(WindowInsets windowInsets) {
        for (int i = 0; i < getChildCount(); i++) {
            getChildAt(i).dispatchApplyWindowInsets(new WindowInsets(windowInsets));
        }
        return windowInsets;
    }

    public void removeAllViewsInLayout() {
        for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
            mo165002a(getChildAt(childCount));
        }
        super.removeAllViewsInLayout();
    }

    public void removeDetachedView(View view, boolean z) {
        if (z) {
            mo165002a(view);
        }
        super.removeDetachedView(view, z);
    }

    public void removeView(View view) {
        mo165002a(view);
        super.removeView(view);
    }

    public void removeViewAt(int i) {
        mo165002a(getChildAt(i));
        super.removeViewAt(i);
    }

    public void removeViewInLayout(View view) {
        mo165002a(view);
        super.removeViewInLayout(view);
    }

    public void removeViews(int i, int i2) {
        for (int i3 = i; i3 < i + i2; i3++) {
            mo165002a(getChildAt(i3));
        }
        super.removeViews(i, i2);
    }

    public void removeViewsInLayout(int i, int i2) {
        for (int i3 = i; i3 < i + i2; i3++) {
            mo165002a(getChildAt(i3));
        }
        super.removeViewsInLayout(i, i2);
    }

    public void setDrawDisappearingViewsLast(boolean z) {
        this.f337954f = z;
    }

    public void setLayoutTransition(LayoutTransition layoutTransition) {
        throw new UnsupportedOperationException("FragmentContainerView does not support Layout Transitions or animateLayoutChanges=\"true\".");
    }

    public void startViewTransition(View view) {
        if (view.getParent() == this) {
            if (this.f337953e == null) {
                this.f337953e = new ArrayList<>();
            }
            this.f337953e.add(view);
        }
        super.startViewTransition(view);
    }

    public FragmentContainerView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        String str;
        this.f337954f = true;
        if (attributeSet != null) {
            String classAttribute = attributeSet.getClassAttribute();
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C117444a.f351510b);
            if (classAttribute == null) {
                classAttribute = obtainStyledAttributes.getString(0);
                str = "android:name";
            } else {
                str = "class";
            }
            obtainStyledAttributes.recycle();
            if (classAttribute != null && !isInEditMode()) {
                throw new UnsupportedOperationException("FragmentContainerView must be within a FragmentActivity to use " + str + "=\"" + classAttribute + FastJsonResponse.QUOTE);
            }
        }
    }

    public FragmentContainerView(Context context, AttributeSet attributeSet, FragmentManager fragmentManager) {
        super(context, attributeSet);
        String str;
        this.f337954f = true;
        String classAttribute = attributeSet.getClassAttribute();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C117444a.f351510b);
        classAttribute = classAttribute == null ? obtainStyledAttributes.getString(0) : classAttribute;
        String string = obtainStyledAttributes.getString(1);
        obtainStyledAttributes.recycle();
        int id = getId();
        Fragment findFragmentById = fragmentManager.findFragmentById(id);
        if (classAttribute != null && findFragmentById == null) {
            if (id <= 0) {
                if (string != null) {
                    str = " with tag " + string;
                } else {
                    str = "";
                }
                throw new IllegalStateException("FragmentContainerView must have an android:id to add Fragment " + classAttribute + str);
            }
            Fragment a = fragmentManager.getFragmentFactory().mo165135a(context.getClassLoader(), classAttribute);
            a.onInflate(context, attributeSet, (Bundle) null);
            C112919c0 beginTransaction = fragmentManager.beginTransaction();
            beginTransaction.f338041p = true;
            a.mContainer = this;
            beginTransaction.mo165167i(getId(), a, string, 1);
            beginTransaction.mo165165g();
        }
        fragmentManager.onContainerAvailable(this);
    }
}

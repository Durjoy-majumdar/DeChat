package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import j20.C117292a;
import java.lang.ref.WeakReference;
import k20.C60958c;
import k20.C9556a;
import p433g.C107593a;

public final class ViewStubCompat extends View {

    /* renamed from: d */
    public int f192662d;

    /* renamed from: e */
    public int f192663e;

    /* renamed from: f */
    public WeakReference<View> f192664f;

    /* renamed from: g */
    public LayoutInflater f192665g;

    /* renamed from: androidx.appcompat.widget.ViewStubCompat$a */
    public interface C67083a {
        /* renamed from: a */
        void mo91154a(ViewStubCompat viewStubCompat, View view);
    }

    public ViewStubCompat(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* renamed from: a */
    public View mo91142a() {
        ViewParent parent = getParent();
        if (parent == null || !(parent instanceof ViewGroup)) {
            throw new IllegalStateException("ViewStub must have a non-null ViewGroup viewParent");
        } else if (this.f192662d != 0) {
            ViewGroup viewGroup = (ViewGroup) parent;
            LayoutInflater layoutInflater = this.f192665g;
            if (layoutInflater == null) {
                layoutInflater = LayoutInflater.from(getContext());
            }
            View inflate = layoutInflater.inflate(this.f192662d, viewGroup, false);
            int i = this.f192663e;
            if (i != -1) {
                inflate.setId(i);
            }
            int indexOfChild = viewGroup.indexOfChild(this);
            viewGroup.removeViewInLayout(this);
            ViewGroup.LayoutParams layoutParams = getLayoutParams();
            if (layoutParams != null) {
                viewGroup.addView(inflate, indexOfChild, layoutParams);
            } else {
                viewGroup.addView(inflate, indexOfChild);
            }
            this.f192664f = new WeakReference<>(inflate);
            return inflate;
        } else {
            throw new IllegalArgumentException("ViewStub must have a valid layoutResource");
        }
    }

    public void dispatchDraw(Canvas canvas) {
    }

    public void draw(Canvas canvas) {
    }

    public int getInflatedId() {
        return this.f192663e;
    }

    public LayoutInflater getLayoutInflater() {
        return this.f192665g;
    }

    public int getLayoutResource() {
        return this.f192662d;
    }

    public void onMeasure(int i, int i2) {
        setMeasuredDimension(0, 0);
    }

    public void setInflatedId(int i) {
        this.f192663e = i;
    }

    public void setLayoutInflater(LayoutInflater layoutInflater) {
        this.f192665g = layoutInflater;
    }

    public void setLayoutResource(int i) {
        this.f192662d = i;
    }

    public void setOnInflateListener(C67083a aVar) {
    }

    public void setVisibility(int i) {
        WeakReference<View> weakReference = this.f192664f;
        if (weakReference != null) {
            View view = weakReference.get();
            if (view != null) {
                C9556a aVar = new C9556a();
                ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                aVar.mo10233c(Integer.valueOf(i));
                View view2 = view;
                C117292a.m165358d(view2, aVar.mo10232b(), "androidx/appcompat/widget/ViewStubCompat", "setVisibility", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
                C117292a.m165359e(view2, "androidx/appcompat/widget/ViewStubCompat", "setVisibility", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                return;
            }
            throw new IllegalStateException("setVisibility called on un-referenced view");
        }
        super.setVisibility(i);
        if (i == 0 || i == 4) {
            mo91142a();
        }
    }

    public ViewStubCompat(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f192662d = 0;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C107593a.f321900F, i, 0);
        this.f192663e = obtainStyledAttributes.getResourceId(2, -1);
        this.f192662d = obtainStyledAttributes.getResourceId(1, 0);
        setId(obtainStyledAttributes.getResourceId(0, -1));
        obtainStyledAttributes.recycle();
        setVisibility(8);
        setWillNotDraw(true);
    }
}

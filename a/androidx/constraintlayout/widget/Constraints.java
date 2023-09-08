package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.C16569a;
import androidx.constraintlayout.widget.ConstraintLayout;

public class Constraints extends ViewGroup {

    /* renamed from: d */
    public C16569a f44473d;

    public Constraints(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        super.setVisibility(8);
    }

    public ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new LayoutParams(-2, -2);
    }

    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new LayoutParams(getContext(), attributeSet);
    }

    public C16569a getConstraintSet() {
        if (this.f44473d == null) {
            this.f44473d = new C16569a();
        }
        C16569a aVar = this.f44473d;
        aVar.getClass();
        int childCount = getChildCount();
        aVar.f44488a.clear();
        int i = 0;
        while (i < childCount) {
            View childAt = getChildAt(i);
            LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
            int id = childAt.getId();
            if (id != -1) {
                if (!aVar.f44488a.containsKey(Integer.valueOf(id))) {
                    aVar.f44488a.put(Integer.valueOf(id), new C16569a.C16570a());
                }
                C16569a.C16570a aVar2 = aVar.f44488a.get(Integer.valueOf(id));
                if (childAt instanceof ConstraintHelper) {
                    ConstraintHelper constraintHelper = (ConstraintHelper) childAt;
                    aVar2.mo16727c(id, layoutParams);
                    if (constraintHelper instanceof Barrier) {
                        aVar2.f44554t0 = 1;
                        Barrier barrier = (Barrier) constraintHelper;
                        aVar2.f44552s0 = barrier.getType();
                        aVar2.f44556u0 = barrier.getReferencedIds();
                    }
                }
                aVar2.mo16727c(id, layoutParams);
                i++;
            } else {
                throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
            }
        }
        return this.f44473d;
    }

    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
    }

    public ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new ConstraintLayout.LayoutParams(layoutParams);
    }

    public Constraints(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        super.setVisibility(8);
    }

    public static class LayoutParams extends ConstraintLayout.LayoutParams {

        /* renamed from: l0 */
        public float f44474l0;

        /* renamed from: m0 */
        public boolean f44475m0;

        /* renamed from: n0 */
        public float f44476n0;

        /* renamed from: o0 */
        public float f44477o0;

        /* renamed from: p0 */
        public float f44478p0;

        /* renamed from: q0 */
        public float f44479q0;

        /* renamed from: r0 */
        public float f44480r0;

        /* renamed from: s0 */
        public float f44481s0;

        /* renamed from: t0 */
        public float f44482t0;

        /* renamed from: u0 */
        public float f44483u0;

        /* renamed from: v0 */
        public float f44484v0;

        /* renamed from: w0 */
        public float f44485w0;

        public LayoutParams(int i, int i2) {
            super(i, i2);
            this.f44474l0 = 1.0f;
            this.f44475m0 = false;
            this.f44476n0 = 0.0f;
            this.f44477o0 = 0.0f;
            this.f44478p0 = 0.0f;
            this.f44479q0 = 0.0f;
            this.f44480r0 = 1.0f;
            this.f44481s0 = 1.0f;
            this.f44482t0 = 0.0f;
            this.f44483u0 = 0.0f;
            this.f44484v0 = 0.0f;
            this.f44485w0 = 0.0f;
        }

        public LayoutParams(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f44474l0 = 1.0f;
            this.f44475m0 = false;
            this.f44476n0 = 0.0f;
            this.f44477o0 = 0.0f;
            this.f44478p0 = 0.0f;
            this.f44479q0 = 0.0f;
            this.f44480r0 = 1.0f;
            this.f44481s0 = 1.0f;
            this.f44482t0 = 0.0f;
            this.f44483u0 = 0.0f;
            this.f44484v0 = 0.0f;
            this.f44485w0 = 0.0f;
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.ConstraintSet);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = obtainStyledAttributes.getIndex(i);
                if (index == R$styleable.ConstraintSet_android_alpha) {
                    this.f44474l0 = obtainStyledAttributes.getFloat(index, this.f44474l0);
                } else if (index == R$styleable.ConstraintSet_android_elevation) {
                    this.f44476n0 = obtainStyledAttributes.getFloat(index, this.f44476n0);
                    this.f44475m0 = true;
                } else if (index == R$styleable.ConstraintSet_android_rotationX) {
                    this.f44478p0 = obtainStyledAttributes.getFloat(index, this.f44478p0);
                } else if (index == R$styleable.ConstraintSet_android_rotationY) {
                    this.f44479q0 = obtainStyledAttributes.getFloat(index, this.f44479q0);
                } else if (index == R$styleable.ConstraintSet_android_rotation) {
                    this.f44477o0 = obtainStyledAttributes.getFloat(index, this.f44477o0);
                } else if (index == R$styleable.ConstraintSet_android_scaleX) {
                    this.f44480r0 = obtainStyledAttributes.getFloat(index, this.f44480r0);
                } else if (index == R$styleable.ConstraintSet_android_scaleY) {
                    this.f44481s0 = obtainStyledAttributes.getFloat(index, this.f44481s0);
                } else if (index == R$styleable.ConstraintSet_android_transformPivotX) {
                    this.f44482t0 = obtainStyledAttributes.getFloat(index, this.f44482t0);
                } else if (index == R$styleable.ConstraintSet_android_transformPivotY) {
                    this.f44483u0 = obtainStyledAttributes.getFloat(index, this.f44483u0);
                } else if (index == R$styleable.ConstraintSet_android_translationX) {
                    this.f44484v0 = obtainStyledAttributes.getFloat(index, this.f44484v0);
                } else if (index == R$styleable.ConstraintSet_android_translationY) {
                    this.f44485w0 = obtainStyledAttributes.getFloat(index, this.f44485w0);
                } else if (index == R$styleable.ConstraintSet_android_translationZ) {
                    this.f44484v0 = obtainStyledAttributes.getFloat(index, 0.0f);
                }
            }
        }
    }
}

package com.tencent.p014mm.live.core.core.trtc.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.CompoundButton;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import j20.C117292a;
import java.util.ArrayList;
import wq3.C111847h;

/* renamed from: com.tencent.mm.live.core.core.trtc.widget.MultiLineRadioGroup */
public class MultiLineRadioGroup extends LinearLayout implements C111847h {

    /* renamed from: d */
    public int f310685d = -1;

    /* renamed from: e */
    public CompoundButton.OnCheckedChangeListener f310686e;

    /* renamed from: f */
    public boolean f310687f = false;

    /* renamed from: g */
    public C104638e f310688g;

    /* renamed from: com.tencent.mm.live.core.core.trtc.widget.MultiLineRadioGroup$LayoutParams */
    public static class LayoutParams extends LinearLayout.LayoutParams {
        public LayoutParams(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public void setBaseAttributes(TypedArray typedArray, int i, int i2) {
            if (typedArray.hasValue(i)) {
                this.width = typedArray.getLayoutDimension(i, "layout_width");
            } else {
                this.width = -2;
            }
            if (typedArray.hasValue(i2)) {
                this.height = typedArray.getLayoutDimension(i2, "layout_height");
            } else {
                this.height = -2;
            }
        }

        public LayoutParams(int i, int i2) {
            super(i, i2);
        }
    }

    /* renamed from: com.tencent.mm.live.core.core.trtc.widget.MultiLineRadioGroup$a */
    public class C104634a implements View.OnTouchListener {

        /* renamed from: d */
        public final /* synthetic */ View f310689d;

        public C104634a(View view) {
            this.f310689d = view;
        }

        public boolean onTouch(View view, MotionEvent motionEvent) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            arrayList.add(motionEvent);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/live/core/core/trtc/widget/MultiLineRadioGroup$1", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", this, array);
            ((RadioButton) this.f310689d).setChecked(true);
            MultiLineRadioGroup.m140243a(MultiLineRadioGroup.this, (RadioButton) this.f310689d);
            MultiLineRadioGroup.this.getClass();
            C117292a.m165362h(true, this, "com/tencent/mm/live/core/core/trtc/widget/MultiLineRadioGroup$1", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
            return true;
        }
    }

    /* renamed from: com.tencent.mm.live.core.core.trtc.widget.MultiLineRadioGroup$b */
    public class C104635b implements View.OnTouchListener {

        /* renamed from: d */
        public final /* synthetic */ RadioButton f310691d;

        public C104635b(RadioButton radioButton) {
            this.f310691d = radioButton;
        }

        public boolean onTouch(View view, MotionEvent motionEvent) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            arrayList.add(motionEvent);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/live/core/core/trtc/widget/MultiLineRadioGroup$2", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", this, array);
            this.f310691d.setChecked(true);
            MultiLineRadioGroup.m140243a(MultiLineRadioGroup.this, this.f310691d);
            MultiLineRadioGroup.this.getClass();
            C117292a.m165362h(true, this, "com/tencent/mm/live/core/core/trtc/widget/MultiLineRadioGroup$2", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
            return true;
        }
    }

    /* renamed from: com.tencent.mm.live.core.core.trtc.widget.MultiLineRadioGroup$c */
    public class C104636c implements CompoundButton.OnCheckedChangeListener {
        public C104636c(C104634a aVar) {
        }

        public void onCheckedChanged(CompoundButton compoundButton, boolean z) {
            View findViewById;
            MultiLineRadioGroup multiLineRadioGroup = MultiLineRadioGroup.this;
            if (!multiLineRadioGroup.f310687f) {
                multiLineRadioGroup.f310687f = true;
                int i = multiLineRadioGroup.f310685d;
                if (!(i == -1 || (findViewById = multiLineRadioGroup.findViewById(i)) == null || !(findViewById instanceof RadioButton))) {
                    ((RadioButton) findViewById).setChecked(false);
                }
                MultiLineRadioGroup.this.f310687f = false;
                MultiLineRadioGroup.this.setCheckedId(compoundButton.getId());
            }
        }
    }

    /* renamed from: com.tencent.mm.live.core.core.trtc.widget.MultiLineRadioGroup$d */
    public interface C104637d {
        /* renamed from: a */
        void mo148252a(MultiLineRadioGroup multiLineRadioGroup, int i);
    }

    /* renamed from: com.tencent.mm.live.core.core.trtc.widget.MultiLineRadioGroup$e */
    public class C104638e implements ViewGroup.OnHierarchyChangeListener {

        /* renamed from: d */
        public ViewGroup.OnHierarchyChangeListener f310694d;

        public C104638e(C104634a aVar) {
        }

        public void onChildViewAdded(View view, View view2) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            arrayList.add(view2);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/live/core/core/trtc/widget/MultiLineRadioGroup$PassThroughHierarchyChangeListener", "android/view/ViewGroup$OnHierarchyChangeListener", "onChildViewAdded", "(Landroid/view/View;Landroid/view/View;)V", this, array);
            if (view == MultiLineRadioGroup.this && (view2 instanceof RadioButton)) {
                if (view2.getId() == -1) {
                    view2.setId(view2.hashCode());
                }
                ((RadioButton) view2).setOnCheckedChangeListener(MultiLineRadioGroup.this.f310686e);
            }
            ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener = this.f310694d;
            if (onHierarchyChangeListener != null) {
                onHierarchyChangeListener.onChildViewAdded(view, view2);
            }
            C117292a.m165361g(this, "com/tencent/mm/live/core/core/trtc/widget/MultiLineRadioGroup$PassThroughHierarchyChangeListener", "android/view/ViewGroup$OnHierarchyChangeListener", "onChildViewAdded", "(Landroid/view/View;Landroid/view/View;)V");
        }

        public void onChildViewRemoved(View view, View view2) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            arrayList.add(view2);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/live/core/core/trtc/widget/MultiLineRadioGroup$PassThroughHierarchyChangeListener", "android/view/ViewGroup$OnHierarchyChangeListener", "onChildViewRemoved", "(Landroid/view/View;Landroid/view/View;)V", this, array);
            if (view == MultiLineRadioGroup.this && (view2 instanceof RadioButton)) {
                ((RadioButton) view2).setOnCheckedChangeListener((CompoundButton.OnCheckedChangeListener) null);
            }
            ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener = this.f310694d;
            if (onHierarchyChangeListener != null) {
                onHierarchyChangeListener.onChildViewRemoved(view, view2);
            }
            C117292a.m165361g(this, "com/tencent/mm/live/core/core/trtc/widget/MultiLineRadioGroup$PassThroughHierarchyChangeListener", "android/view/ViewGroup$OnHierarchyChangeListener", "onChildViewRemoved", "(Landroid/view/View;Landroid/view/View;)V");
        }
    }

    public MultiLineRadioGroup(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setOrientation(1);
        this.f310686e = new C104636c((C104634a) null);
        C104638e eVar = new C104638e((C104634a) null);
        this.f310688g = eVar;
        super.setOnHierarchyChangeListener(eVar);
    }

    /* renamed from: a */
    public static void m140243a(MultiLineRadioGroup multiLineRadioGroup, RadioButton radioButton) {
        RadioButton radioButton2;
        int childCount = multiLineRadioGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = multiLineRadioGroup.getChildAt(i);
            if (childAt instanceof RadioButton) {
                if (childAt != radioButton) {
                    ((RadioButton) childAt).setChecked(false);
                }
            } else if (childAt instanceof LinearLayout) {
                LinearLayout linearLayout = (LinearLayout) childAt;
                int childCount2 = linearLayout.getChildCount();
                for (int i2 = 0; i2 < childCount2; i2++) {
                    View childAt2 = linearLayout.getChildAt(i2);
                    if ((childAt2 instanceof RadioButton) && (radioButton2 = (RadioButton) childAt2) != radioButton) {
                        radioButton2.setChecked(false);
                    }
                }
            }
        }
    }

    /* access modifiers changed from: private */
    public void setCheckedId(int i) {
        this.f310685d = i;
    }

    public void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        if (view instanceof RadioButton) {
            view.setOnTouchListener(new C104634a(view));
        } else if (view instanceof LinearLayout) {
            LinearLayout linearLayout = (LinearLayout) view;
            int childCount = linearLayout.getChildCount();
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = linearLayout.getChildAt(i2);
                if (childAt instanceof RadioButton) {
                    RadioButton radioButton = (RadioButton) childAt;
                    radioButton.setOnTouchListener(new C104635b(radioButton));
                }
            }
        }
        super.addView(view, i, layoutParams);
    }

    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof LayoutParams;
    }

    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new LayoutParams(getContext(), attributeSet);
    }

    public int getCheckedRadioButtonId() {
        return this.f310685d;
    }

    public void onFinishInflate() {
        super.onFinishInflate();
        int i = this.f310685d;
        if (i != -1) {
            this.f310687f = true;
            View findViewById = findViewById(i);
            if (findViewById != null && (findViewById instanceof RadioButton)) {
                ((RadioButton) findViewById).setChecked(true);
            }
            this.f310687f = false;
            setCheckedId(this.f310685d);
        }
    }

    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName(MultiLineRadioGroup.class.getName());
    }

    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(MultiLineRadioGroup.class.getName());
    }

    public void setOnCheckedChangeListener(C104637d dVar) {
    }

    public void setOnHierarchyChangeListener(ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener) {
        this.f310688g.f310694d = onHierarchyChangeListener;
    }

    public LinearLayout.LayoutParams generateDefaultLayoutParams() {
        return new LayoutParams(-2, -2);
    }

    /* renamed from: generateLayoutParams  reason: collision with other method in class */
    public LinearLayout.LayoutParams m168897generateLayoutParams(AttributeSet attributeSet) {
        return new LayoutParams(getContext(), attributeSet);
    }
}

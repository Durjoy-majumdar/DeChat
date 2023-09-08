package com.tencent.p014mm.p136ui.base;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.tencent.p014mm.p136ui.base.MMRadioImageButton;
import j20.C117292a;
import java.util.ArrayList;
import wq3.C111847h;

/* renamed from: com.tencent.mm.ui.base.MMRadioGroupView */
public class MMRadioGroupView extends LinearLayout implements C111847h {

    /* renamed from: d */
    public int f55820d = -1;

    /* renamed from: e */
    public int f55821e = -1;

    /* renamed from: f */
    public MMRadioImageButton.C19685a f55822f = new C19681b();

    /* renamed from: g */
    public MMRadioImageButton f55823g;

    /* renamed from: com.tencent.mm.ui.base.MMRadioGroupView$b */
    public class C19681b implements MMRadioImageButton.C19685a {
        public C19681b() {
        }
    }

    /* renamed from: com.tencent.mm.ui.base.MMRadioGroupView$c */
    public interface C19682c {
        /* renamed from: a */
        void mo25992a(MMRadioGroupView mMRadioGroupView, int i);

        /* renamed from: b */
        void mo25993b(MMRadioGroupView mMRadioGroupView, int i);
    }

    /* renamed from: com.tencent.mm.ui.base.MMRadioGroupView$d */
    public class C19683d implements ViewGroup.OnHierarchyChangeListener {
        public C19683d(C19680a aVar) {
        }

        public void onChildViewAdded(View view, View view2) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            arrayList.add(view2);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/ui/base/MMRadioGroupView$PassThroughHierarchyChangeListener", "android/view/ViewGroup$OnHierarchyChangeListener", "onChildViewAdded", "(Landroid/view/View;Landroid/view/View;)V", this, array);
            if (view == MMRadioGroupView.this && (view2 instanceof MMRadioImageButton)) {
                if (view2.getId() == -1) {
                    int hashCode = view2.hashCode();
                    if (hashCode <= -1) {
                        hashCode &= Integer.MAX_VALUE;
                    }
                    view2.setId(hashCode);
                }
                ((MMRadioImageButton) view2).setOnOtherMMRadioButtonCheckedChangeListener(MMRadioGroupView.this.f55822f);
            }
            C117292a.m165361g(this, "com/tencent/mm/ui/base/MMRadioGroupView$PassThroughHierarchyChangeListener", "android/view/ViewGroup$OnHierarchyChangeListener", "onChildViewAdded", "(Landroid/view/View;Landroid/view/View;)V");
        }

        public void onChildViewRemoved(View view, View view2) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            arrayList.add(view2);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/ui/base/MMRadioGroupView$PassThroughHierarchyChangeListener", "android/view/ViewGroup$OnHierarchyChangeListener", "onChildViewRemoved", "(Landroid/view/View;Landroid/view/View;)V", this, array);
            if (view == MMRadioGroupView.this && (view2 instanceof MMRadioImageButton)) {
                ((MMRadioImageButton) view2).setOnOtherMMRadioButtonCheckedChangeListener((MMRadioImageButton.C19685a) null);
            }
            C117292a.m165361g(this, "com/tencent/mm/ui/base/MMRadioGroupView$PassThroughHierarchyChangeListener", "android/view/ViewGroup$OnHierarchyChangeListener", "onChildViewRemoved", "(Landroid/view/View;Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.ui.base.MMRadioGroupView$e */
    public interface C19684e {
        /* renamed from: a */
        void mo25996a(int i, int i2, int i3, int i4);
    }

    public MMRadioGroupView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        super.setOnHierarchyChangeListener(new C19683d((C19680a) null));
    }

    /* access modifiers changed from: private */
    public void setCheckedButton(MMRadioImageButton mMRadioImageButton) {
        this.f55823g = mMRadioImageButton;
    }

    /* access modifiers changed from: private */
    public void setCheckedId(int i) {
        this.f55820d = i;
    }

    /* access modifiers changed from: private */
    public void setClickedId(int i) {
        this.f55821e = i;
    }

    public void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        View findViewById;
        if (view instanceof MMRadioImageButton) {
            MMRadioImageButton mMRadioImageButton = (MMRadioImageButton) view;
            if (mMRadioImageButton.isChecked()) {
                int i2 = this.f55820d;
                if (!(i2 == -1 || (findViewById = findViewById(i2)) == null || !(findViewById instanceof MMRadioImageButton))) {
                    ((MMRadioImageButton) findViewById).setChecked(false);
                }
                setCheckedId(mMRadioImageButton.getId());
                setCheckedButton(mMRadioImageButton);
            }
        }
        super.addView(view, i, layoutParams);
    }

    public MMRadioImageButton getCheckedRadioButton() {
        return this.f55823g;
    }

    public int getCheckedRadioButtonId() {
        return this.f55820d;
    }

    public int getClickedRadioButtonId() {
        return this.f55821e;
    }

    public void onFinishInflate() {
        super.onFinishInflate();
        int i = this.f55820d;
        if (i != -1) {
            View findViewById = findViewById(i);
            if (findViewById != null && (findViewById instanceof MMRadioImageButton)) {
                ((MMRadioImageButton) findViewById).setChecked(true);
            }
            setCheckedId(this.f55820d);
        }
    }

    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
    }

    public void setOnMMRadioGroupCheckedChangeListener(C19682c cVar) {
    }

    public void setOnSizeChangeObserver(C19684e eVar) {
    }
}

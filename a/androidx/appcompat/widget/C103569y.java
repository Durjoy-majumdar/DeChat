package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.animation.DecelerateInterpolator;
import android.widget.AdapterView;
import android.widget.HorizontalScrollView;
import android.widget.LinearLayout;
import androidx.appcompat.app.ActionBar;
import com.tencent.p014mm.C0966R;
import p433g.C107593a;

/* renamed from: androidx.appcompat.widget.y */
public class C103569y extends HorizontalScrollView implements AdapterView.OnItemSelectedListener {

    /* renamed from: androidx.appcompat.widget.y$a */
    public class C103570a extends LinearLayout {
        public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
            super.onInitializeAccessibilityEvent(accessibilityEvent);
            accessibilityEvent.setClassName(ActionBar.C0110b.class.getName());
        }

        public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
            super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
            accessibilityNodeInfo.setClassName(ActionBar.C0110b.class.getName());
        }

        public void onMeasure(int i, int i2) {
            super.onMeasure(i, i2);
            throw null;
        }

        public void setSelected(boolean z) {
            boolean z2 = isSelected() != z;
            super.setSelected(z);
            if (z2 && z) {
                sendAccessibilityEvent(4);
            }
        }
    }

    static {
        new DecelerateInterpolator();
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
    }

    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        Context context = getContext();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes((AttributeSet) null, C107593a.f321901a, C0966R.attr.f2627a2, 0);
        int layoutDimension = obtainStyledAttributes.getLayoutDimension(13, 0);
        Resources resources = context.getResources();
        if (!context.getResources().getBoolean(C0966R.bool.f2921a)) {
            layoutDimension = Math.min(layoutDimension, resources.getDimensionPixelSize(C0966R.dimen.f4002nd));
        }
        obtainStyledAttributes.recycle();
        setContentHeight(layoutDimension);
        context.getResources().getDimensionPixelSize(C0966R.dimen.f4003ne);
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
    }

    public void onItemSelected(AdapterView<?> adapterView, View view, int i, long j) {
        ((C103570a) view).getClass();
        throw null;
    }

    public void onMeasure(int i, int i2) {
        setFillViewport(View.MeasureSpec.getMode(i) == 1073741824);
        throw null;
    }

    public void onNothingSelected(AdapterView<?> adapterView) {
    }

    public void setAllowCollapse(boolean z) {
    }

    public void setContentHeight(int i) {
        requestLayout();
    }

    public void setTabSelected(int i) {
        throw null;
    }
}

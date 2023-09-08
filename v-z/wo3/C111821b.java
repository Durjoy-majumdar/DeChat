package wo3;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;

/* renamed from: wo3.b */
public class C111821b extends ViewGroup {

    /* renamed from: d */
    public int f334825d = 48;

    public C111821b(Context context) {
        super(context);
        setLayoutParams(new AbsListView.LayoutParams(-1, -2));
    }

    public int getGravity() {
        return this.f334825d;
    }

    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        View childAt = getChildAt(0);
        if (childAt != null) {
            if (this.f334825d == 48) {
                childAt.layout(0, 0, getMeasuredWidth(), childAt.getMeasuredHeight());
            } else {
                childAt.layout(0, getMeasuredHeight() - childAt.getMeasuredHeight(), getMeasuredWidth(), getMeasuredHeight());
            }
        }
    }

    public void onMeasure(int i, int i2) {
        int size = View.MeasureSpec.getSize(i2);
        int size2 = View.MeasureSpec.getSize(i);
        int mode = View.MeasureSpec.getMode(i2);
        View childAt = getChildAt(0);
        if (childAt == null) {
            setMeasuredDimension(0, size2);
            return;
        }
        if (childAt.isLayoutRequested()) {
            measureChild(childAt, i, View.MeasureSpec.makeMeasureSpec(0, 0));
        }
        if (mode == 0 && (size = getLayoutParams().height) <= 0) {
            size = childAt.getMeasuredHeight();
        }
        setMeasuredDimension(size2, size);
    }

    public void setGravity(int i) {
        this.f334825d = i;
    }
}

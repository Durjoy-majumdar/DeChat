package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import com.tencent.p014mm.C0966R;
import j20.C117292a;
import java.util.WeakHashMap;
import k20.C60958c;
import k20.C9556a;
import p433g.C107593a;
import p849e3.C107168a0;
import p849e3.C107207u;

public class ButtonBarLayout extends LinearLayout {

    /* renamed from: d */
    public boolean f106383d;

    /* renamed from: e */
    public int f106384e = -1;

    public ButtonBarLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C107593a.f321915o);
        this.f106383d = obtainStyledAttributes.getBoolean(0, true);
        obtainStyledAttributes.recycle();
    }

    private void setStacked(boolean z) {
        setOrientation(z ? 1 : 0);
        setGravity(z ? 5 : 80);
        View findViewById = findViewById(C0966R.C0970id.f359279jz0);
        if (findViewById != null) {
            int i = z ? 8 : 4;
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(Integer.valueOf(i));
            View view = findViewById;
            C117292a.m165358d(view, aVar.mo10232b(), "androidx/appcompat/widget/ButtonBarLayout", "setStacked", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(view, "androidx/appcompat/widget/ButtonBarLayout", "setStacked", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        for (int childCount = getChildCount() - 2; childCount >= 0; childCount--) {
            bringChildToFront(getChildAt(childCount));
        }
    }

    public int getMinimumHeight() {
        return Math.max(0, super.getMinimumHeight());
    }

    public void onMeasure(int i, int i2) {
        boolean z;
        int i3;
        int i4;
        int size = View.MeasureSpec.getSize(i);
        int i5 = 0;
        if (this.f106383d) {
            if (size > this.f106384e) {
                if (getOrientation() == 1) {
                    setStacked(false);
                }
            }
            this.f106384e = size;
        }
        if ((getOrientation() == 1) || View.MeasureSpec.getMode(i) != 1073741824) {
            i3 = i;
            z = false;
        } else {
            i3 = View.MeasureSpec.makeMeasureSpec(size, Integer.MIN_VALUE);
            z = true;
        }
        super.onMeasure(i3, i2);
        if (this.f106383d) {
            if (!(getOrientation() == 1)) {
                if ((getMeasuredWidthAndState() & -16777216) == 16777216) {
                    setStacked(true);
                    z = true;
                }
            }
        }
        if (z) {
            super.onMeasure(i, i2);
        }
        int childCount = getChildCount();
        int i6 = 0;
        while (true) {
            i4 = -1;
            if (i6 >= childCount) {
                i6 = -1;
                break;
            } else if (getChildAt(i6).getVisibility() == 0) {
                break;
            } else {
                i6++;
            }
        }
        if (i6 >= 0) {
            View childAt = getChildAt(i6);
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) childAt.getLayoutParams();
            int paddingTop = getPaddingTop() + childAt.getMeasuredHeight() + layoutParams.topMargin + layoutParams.bottomMargin + 0;
            if (getOrientation() == 1) {
                i5 = 1;
            }
            if (i5 != 0) {
                int i7 = i6 + 1;
                int childCount2 = getChildCount();
                while (true) {
                    if (i7 >= childCount2) {
                        break;
                    } else if (getChildAt(i7).getVisibility() == 0) {
                        i4 = i7;
                        break;
                    } else {
                        i7++;
                    }
                }
                if (i4 >= 0) {
                    paddingTop += getChildAt(i4).getPaddingTop() + ((int) (getResources().getDisplayMetrics().density * 16.0f));
                }
                i5 = paddingTop;
            } else {
                i5 = paddingTop + getPaddingBottom();
            }
        }
        WeakHashMap<View, C107168a0> weakHashMap = C107207u.f320808a;
        if (C107207u.C107208b.m145176d(this) != i5) {
            setMinimumHeight(i5);
        }
    }

    public void setAllowStacking(boolean z) {
        if (this.f106383d != z) {
            this.f106383d = z;
            if (!z && getOrientation() == 1) {
                setStacked(false);
            }
            requestLayout();
        }
    }
}

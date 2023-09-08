package cu0;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: cu0.a */
public final class C75304a {
    /* renamed from: a */
    public static final void m90323a(ViewGroup viewGroup) {
        if (viewGroup != null) {
            int i = 0;
            int childCount = viewGroup.getChildCount();
            if (childCount >= 0) {
                while (true) {
                    View childAt = viewGroup.getChildAt(i);
                    if (childAt instanceof ViewGroup) {
                        m90323a((ViewGroup) childAt);
                    } else if (childAt instanceof RecyclerView) {
                        childAt.setAccessibilityDelegate((View.AccessibilityDelegate) null);
                    }
                    if (i != childCount) {
                        i++;
                    } else {
                        return;
                    }
                }
            }
        }
    }
}

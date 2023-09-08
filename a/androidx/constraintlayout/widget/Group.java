package androidx.constraintlayout.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import j20.C117292a;
import k20.C60958c;
import k20.C9556a;

public class Group extends ConstraintHelper {
    public Group(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    /* renamed from: b */
    public void mo16666b(AttributeSet attributeSet) {
        super.mo16666b(attributeSet);
    }

    /* renamed from: c */
    public void mo16671c(ConstraintLayout constraintLayout) {
        ConstraintLayout.LayoutParams layoutParams = (ConstraintLayout.LayoutParams) getLayoutParams();
        layoutParams.f44456k0.mo34033D(0);
        layoutParams.f44456k0.mo34057z(0);
    }

    /* renamed from: d */
    public void mo16672d(ConstraintLayout constraintLayout) {
        int visibility = getVisibility();
        float elevation = getElevation();
        for (int i = 0; i < this.f44390e; i++) {
            View view = constraintLayout.f44394d.get(this.f44389d[i]);
            if (view != null) {
                C9556a aVar = new C9556a();
                ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                aVar.mo10233c(Integer.valueOf(visibility));
                C117292a.m165358d(view, aVar.mo10232b(), "androidx/constraintlayout/widget/Group", "updatePreLayout", "(Landroidx/constraintlayout/widget/ConstraintLayout;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
                C117292a.m165359e(view, "androidx/constraintlayout/widget/Group", "updatePreLayout", "(Landroidx/constraintlayout/widget/ConstraintLayout;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                if (elevation > 0.0f) {
                    view.setElevation(elevation);
                }
            }
        }
    }

    public Group(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}

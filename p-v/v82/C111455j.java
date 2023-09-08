package v82;

import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.Transformation;
import android.widget.RelativeLayout;
import com.tencent.p014mm.plugin.multitalk.p078ui.widget.CollapseView;

/* renamed from: v82.j */
public class C111455j extends Animation {

    /* renamed from: d */
    public final /* synthetic */ View f333688d;

    /* renamed from: e */
    public final /* synthetic */ int f333689e;

    /* renamed from: f */
    public final /* synthetic */ CollapseView f333690f;

    public C111455j(CollapseView collapseView, View view, int i) {
        this.f333690f = collapseView;
        this.f333688d = view;
        this.f333689e = i;
    }

    public void applyTransformation(float f, Transformation transformation) {
        int i;
        int i2 = (f > 1.0f ? 1 : (f == 1.0f ? 0 : -1));
        this.f333690f.f314976y = i2 == 0;
        int i3 = -2;
        this.f333688d.getLayoutParams().height = i2 == 0 ? -2 : C111418b0.f333550k + ((int) (((float) this.f333689e) * f));
        ViewGroup.LayoutParams layoutParams = this.f333688d.getLayoutParams();
        if (i2 != 0) {
            i3 = C111418b0.f333550k + ((int) (((float) this.f333689e) * f));
        }
        layoutParams.width = i3;
        RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) this.f333688d.getLayoutParams();
        if (i2 == 0) {
            i = C111418b0.f333547h;
        } else {
            int i4 = C111418b0.f333546g;
            i = i4 + ((int) (((float) (C111418b0.f333547h - i4)) * f));
        }
        layoutParams2.bottomMargin = i;
        ((RelativeLayout.LayoutParams) this.f333688d.getLayoutParams()).topMargin = (int) (((float) C111418b0.f333546g) * (1.0f - f));
        this.f333688d.requestLayout();
    }

    public boolean willChangeBounds() {
        return true;
    }
}

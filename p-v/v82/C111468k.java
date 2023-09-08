package v82;

import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.Transformation;
import android.widget.RelativeLayout;
import com.tencent.p014mm.plugin.multitalk.p078ui.widget.CollapseView;

/* renamed from: v82.k */
public class C111468k extends Animation {

    /* renamed from: d */
    public final /* synthetic */ View f333726d;

    /* renamed from: e */
    public final /* synthetic */ int f333727e;

    /* renamed from: f */
    public final /* synthetic */ CollapseView f333728f;

    public C111468k(CollapseView collapseView, View view, int i) {
        this.f333728f = collapseView;
        this.f333726d = view;
        this.f333727e = i;
    }

    public void applyTransformation(float f, Transformation transformation) {
        int i = (f > 1.0f ? 1 : (f == 1.0f ? 0 : -1));
        this.f333728f.f314976y = i == 0;
        if (this.f333726d.getLayoutParams().height != C111418b0.f333550k && i != 0) {
            ViewGroup.LayoutParams layoutParams = this.f333726d.getLayoutParams();
            int i2 = C111418b0.f333554o;
            layoutParams.height = i2 - ((int) (((float) this.f333727e) * f));
            this.f333726d.getLayoutParams().width = i2 - ((int) (((float) this.f333727e) * f));
            int i3 = C111418b0.f333547h;
            int i4 = C111418b0.f333546g;
            ((RelativeLayout.LayoutParams) this.f333726d.getLayoutParams()).bottomMargin = i3 - ((int) (((float) (i3 - i4)) * f));
            ((RelativeLayout.LayoutParams) this.f333726d.getLayoutParams()).topMargin = (int) (((float) i4) * f);
            this.f333726d.requestLayout();
        }
    }

    public boolean willChangeBounds() {
        return true;
    }
}

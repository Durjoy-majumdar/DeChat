package dt0;

import android.animation.Animator;
import com.tencent.p014mm.plugin.appbrand.widget.desktop.DragFeatureView;

/* renamed from: dt0.m */
public class C75454m implements Animator.AnimatorListener {

    /* renamed from: d */
    public final /* synthetic */ DragFeatureView f221774d;

    public C75454m(DragFeatureView dragFeatureView) {
        this.f221774d = dragFeatureView;
    }

    public void onAnimationCancel(Animator animator) {
    }

    public void onAnimationEnd(Animator animator) {
        DragFeatureView dragFeatureView = this.f221774d;
        dragFeatureView.removeView(dragFeatureView.f197301o);
        this.f221774d.mo94443i();
        this.f221774d.setRubbishViewVisible(8);
    }

    public void onAnimationRepeat(Animator animator) {
    }

    public void onAnimationStart(Animator animator) {
    }
}

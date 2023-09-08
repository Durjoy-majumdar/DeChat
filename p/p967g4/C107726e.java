package p967g4;

import android.view.animation.Animation;
import android.view.animation.Transformation;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;

/* renamed from: g4.e */
public class C107726e extends Animation {

    /* renamed from: d */
    public final /* synthetic */ SwipeRefreshLayout f322350d;

    public C107726e(SwipeRefreshLayout swipeRefreshLayout) {
        this.f322350d = swipeRefreshLayout;
    }

    public void applyTransformation(float f, Transformation transformation) {
        this.f322350d.setAnimationProgress(f);
    }
}

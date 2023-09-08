package p967g4;

import android.view.animation.Animation;
import android.view.animation.Transformation;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;

/* renamed from: g4.f */
public class C107727f extends Animation {

    /* renamed from: d */
    public final /* synthetic */ SwipeRefreshLayout f322351d;

    public C107727f(SwipeRefreshLayout swipeRefreshLayout) {
        this.f322351d = swipeRefreshLayout;
    }

    public void applyTransformation(float f, Transformation transformation) {
        this.f322351d.setAnimationProgress(1.0f - f);
    }
}

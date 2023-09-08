package p967g4;

import android.view.animation.Animation;
import android.view.animation.Transformation;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;

/* renamed from: g4.g */
public class C107728g extends Animation {

    /* renamed from: d */
    public final /* synthetic */ int f322352d;

    /* renamed from: e */
    public final /* synthetic */ int f322353e;

    /* renamed from: f */
    public final /* synthetic */ SwipeRefreshLayout f322354f;

    public C107728g(SwipeRefreshLayout swipeRefreshLayout, int i, int i2) {
        this.f322354f = swipeRefreshLayout;
        this.f322352d = i;
        this.f322353e = i2;
    }

    public void applyTransformation(float f, Transformation transformation) {
        C107724d dVar = this.f322354f.f306596D;
        int i = this.f322352d;
        dVar.setAlpha((int) (((float) i) + (((float) (this.f322353e - i)) * f)));
    }
}

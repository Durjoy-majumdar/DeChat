package nl3;

import android.animation.ValueAnimator;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import androidx.appcompat.app.C103422m;
import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C45983e0;
import gy3.C87412m;
import java.lang.ref.WeakReference;

/* renamed from: nl3.e */
public final class C47282e {

    /* renamed from: a */
    public final WeakReference<C103422m> f126920a;

    /* renamed from: b */
    public float f126921b;

    /* renamed from: c */
    public float f126922c;

    /* renamed from: d */
    public float f126923d;

    public C47282e(WeakReference<C103422m> weakReference) {
        C87412m.m108594g(weakReference, "halfScreenWebView");
        this.f126920a = weakReference;
    }

    /* renamed from: a */
    public static void m52580a(C47282e eVar, View view, View view2, int i, float f, View view3, int i2, Object obj) {
        float f2 = (i2 & 8) != 0 ? 1.0f : f;
        if ((i2 & 16) != 0) {
            view3 = null;
        }
        View view4 = view3;
        eVar.getClass();
        if (view != null && view2 != null) {
            view.setOnTouchListener(new C47281d(view4, eVar, new C45983e0(), f2, view, view2, i));
        }
    }

    /* renamed from: b */
    public final void mo72316b(View view, int i) {
        if (view != null) {
            float f = this.f126923d;
            if (f > ((float) i)) {
                C103422m mVar = this.f126920a.get();
                if (mVar != null) {
                    mVar.cancel();
                    return;
                }
                return;
            }
            if (!(f == 0.0f)) {
                Log.m105927v("MicroMsg.HalfScreenDialogDragHelper", "animateDialogVerticalTranslation from: %f, to: %f", Float.valueOf(f), Float.valueOf(0.0f));
                if (f == 0.0f) {
                    Log.m105928w("MicroMsg.HalfScreenDialogDragHelper", "animateDialogVerticalTranslation start equals end and ignore");
                    return;
                }
                ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{f, 0.0f});
                ofFloat.setInterpolator(new DecelerateInterpolator());
                ofFloat.setDuration(350);
                ofFloat.addUpdateListener(new C11220b(view));
                ofFloat.addListener(new C47280c(this, 0.0f));
                ofFloat.start();
            }
        }
    }
}

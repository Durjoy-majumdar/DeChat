package gt0;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import com.tencent.p014mm.plugin.appbrand.widget.dialog.C84926a;

/* renamed from: gt0.r */
public class C87380r extends AnimatorListenerAdapter {

    /* renamed from: d */
    public final /* synthetic */ C84926a f253229d;

    public C87380r(C84926a aVar) {
        this.f253229d = aVar;
    }

    public void onAnimationStart(Animator animator) {
        this.f253229d.f247541l.setAlpha(0.0f);
        this.f253229d.f247541l.setVisibility(0);
    }
}

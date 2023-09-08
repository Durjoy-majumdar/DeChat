package gt0;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import com.tencent.p014mm.plugin.appbrand.widget.dialog.C84926a;

/* renamed from: gt0.s */
public class C87382s extends AnimatorListenerAdapter {

    /* renamed from: d */
    public final /* synthetic */ C84926a f253230d;

    public C87382s(C84926a aVar) {
        this.f253230d = aVar;
    }

    public void onAnimationStart(Animator animator) {
        this.f253230d.f247543n.setAlpha(0.0f);
        this.f253230d.f247543n.setVisibility(0);
    }
}

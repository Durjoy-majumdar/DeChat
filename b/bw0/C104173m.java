package bw0;

import android.animation.ValueAnimator;
import android.graphics.Point;
import android.view.View;
import android.widget.FrameLayout;
import com.tencent.p014mm.plugin.ball.view.FloatBallView;
import com.tencent.p014mm.sdk.platformtools.Log;

/* renamed from: bw0.m */
public class C104173m implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: d */
    public final /* synthetic */ FrameLayout.LayoutParams f308410d;

    /* renamed from: e */
    public final /* synthetic */ Point f308411e;

    /* renamed from: f */
    public final /* synthetic */ Point f308412f;

    /* renamed from: g */
    public final /* synthetic */ View f308413g;

    /* renamed from: h */
    public final /* synthetic */ FloatBallView f308414h;

    /* renamed from: bw0.m$a */
    public class C104174a implements Runnable {
        public C104174a() {
        }

        public void run() {
            C104173m mVar = C104173m.this;
            mVar.f308413g.setLayoutParams(mVar.f308410d);
        }
    }

    public C104173m(FloatBallView floatBallView, FrameLayout.LayoutParams layoutParams, Point point, Point point2, View view) {
        this.f308414h = floatBallView;
        this.f308410d = layoutParams;
        this.f308411e = point;
        this.f308412f = point2;
        this.f308413g = view;
    }

    public void onAnimationUpdate(ValueAnimator valueAnimator) {
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        FrameLayout.LayoutParams layoutParams = this.f308410d;
        Point point = this.f308411e;
        int i = point.x;
        Point point2 = this.f308412f;
        layoutParams.width = (int) (((float) i) + (((float) (point2.x - i)) * floatValue));
        int i2 = point.y;
        layoutParams.height = (int) (((float) i2) + (((float) (point2.y - i2)) * floatValue));
        Log.m105927v("MicroMsg.FloatBallView", "alvinluo animateVoipSwitch onAnimationUpdate value: %f, width: %d, height: %d", Float.valueOf(floatValue), Integer.valueOf(this.f308410d.width), Integer.valueOf(this.f308410d.height));
        this.f308414h.f311984p1.post(new C104174a());
    }
}

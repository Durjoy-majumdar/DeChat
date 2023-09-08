package s32;

import android.animation.ValueAnimator;
import android.view.View;
import com.tencent.p014mm.plugin.luckymoney.f2f.p072ui.ShuffleView;
import java.util.ArrayList;

/* renamed from: s32.l */
public class C22298l implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: d */
    public final /* synthetic */ ShuffleView f63209d;

    public C22298l(ShuffleView shuffleView) {
        this.f63209d = shuffleView;
    }

    public void onAnimationUpdate(ValueAnimator valueAnimator) {
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        int i = 0;
        if (floatValue == 0.0f) {
            this.f63209d.f53100y.clear();
            this.f63209d.f53101z.clear();
            while (true) {
                ShuffleView shuffleView = this.f63209d;
                if (i < shuffleView.f53097v) {
                    shuffleView.f53100y.add(Float.valueOf(((View) ((ArrayList) shuffleView.f53082d).get(i)).getTranslationX()));
                    ShuffleView shuffleView2 = this.f63209d;
                    shuffleView2.f53101z.add(Float.valueOf(((View) ((ArrayList) shuffleView2.f53082d).get(i)).getTranslationY()));
                    i++;
                } else {
                    return;
                }
            }
        } else {
            float f = 1.0f - floatValue;
            ((View) ((ArrayList) this.f63209d.f53082d).get(0)).setTranslationX((this.f63209d.f53100y.get(0).floatValue() * f) + (this.f63209d.mo23918g(0) * floatValue));
            ((View) ((ArrayList) this.f63209d.f53082d).get(0)).setTranslationY((this.f63209d.f53101z.get(0).floatValue() * f) + (this.f63209d.mo23921h(0) * floatValue));
            int i2 = 1;
            while (true) {
                ShuffleView shuffleView3 = this.f63209d;
                if (i2 < shuffleView3.f53097v) {
                    ((View) ((ArrayList) shuffleView3.f53082d).get(i2)).setTranslationX((this.f63209d.f53100y.get(i2).floatValue() * f) + (this.f63209d.mo23918g(i2) * floatValue));
                    ((View) ((ArrayList) this.f63209d.f53082d).get(i2)).setTranslationY((this.f63209d.f53101z.get(i2).floatValue() * f) + (this.f63209d.mo23921h(i2) * floatValue));
                    i2++;
                } else {
                    return;
                }
            }
        }
    }
}

package s32;

import android.animation.ValueAnimator;
import android.view.View;
import com.tencent.p014mm.plugin.luckymoney.f2f.p072ui.ShuffleView;
import java.util.ArrayList;

/* renamed from: s32.k */
public class C22297k implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: d */
    public final /* synthetic */ int f63206d;

    /* renamed from: e */
    public final /* synthetic */ int f63207e;

    /* renamed from: f */
    public final /* synthetic */ ShuffleView f63208f;

    public C22297k(ShuffleView shuffleView, int i, int i2) {
        this.f63208f = shuffleView;
        this.f63206d = i;
        this.f63207e = i2;
    }

    public void onAnimationUpdate(ValueAnimator valueAnimator) {
        ShuffleView shuffleView;
        int i;
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        int i2 = 0;
        if (floatValue == 0.0f) {
            this.f63208f.f53100y.clear();
            this.f63208f.f53101z.clear();
            while (true) {
                ShuffleView shuffleView2 = this.f63208f;
                if (i2 < shuffleView2.f53097v) {
                    shuffleView2.f53100y.add(Float.valueOf(((View) ((ArrayList) shuffleView2.f53082d).get(i2)).getTranslationX()));
                    ShuffleView shuffleView3 = this.f63208f;
                    shuffleView3.f53101z.add(Float.valueOf(((View) ((ArrayList) shuffleView3.f53082d).get(i2)).getTranslationY()));
                    i2++;
                } else {
                    return;
                }
            }
        } else {
            if (this.f63206d <= 0) {
                while (true) {
                    ShuffleView shuffleView4 = this.f63208f;
                    if (i2 >= shuffleView4.f53096u) {
                        break;
                    }
                    float f = 1.0f - floatValue;
                    ((View) ((ArrayList) shuffleView4.f53082d).get(i2)).setTranslationX((this.f63208f.f53100y.get(i2).floatValue() * f) + (this.f63208f.mo23918g(i2) * floatValue));
                    ((View) ((ArrayList) this.f63208f.f53082d).get(i2)).setTranslationY((this.f63208f.f53101z.get(i2).floatValue() * f) + (this.f63208f.mo23921h(i2) * floatValue));
                    i2++;
                }
            } else {
                while (true) {
                    shuffleView = this.f63208f;
                    i = shuffleView.f53096u;
                    if (i2 >= i - 1) {
                        break;
                    }
                    float f2 = 1.0f - floatValue;
                    int i3 = i2 + 1;
                    ((View) ((ArrayList) shuffleView.f53082d).get(i2)).setTranslationX((this.f63208f.f53100y.get(i2).floatValue() * f2) + ((this.f63208f.mo23918g(i2) - (((float) i3) * this.f63208f.getTouchScaleTranslationX())) * floatValue));
                    ((View) ((ArrayList) this.f63208f.f53082d).get(i2)).setTranslationY((this.f63208f.f53101z.get(i2).floatValue() * f2) + (this.f63208f.mo23921h(i2) * floatValue));
                    i2 = i3;
                }
                ArrayList arrayList = (ArrayList) shuffleView.f53082d;
                ShuffleView shuffleView5 = this.f63208f;
                float floatValue2 = shuffleView5.f53100y.get(shuffleView5.f53096u - 1).floatValue() * (1.0f - floatValue);
                ShuffleView shuffleView6 = this.f63208f;
                ((View) arrayList.get(i - 1)).setTranslationX(floatValue2 + ((shuffleView6.mo23918g(shuffleView6.f53096u - 1) - ((this.f63208f.getTouchScaleTranslationX() * ((float) this.f63206d)) / 2.0f)) * floatValue));
            }
            if (this.f63207e > 0) {
                ShuffleView shuffleView7 = this.f63208f;
                View view = shuffleView7.f53095t;
                float f3 = 1.0f - floatValue;
                ShuffleView shuffleView8 = this.f63208f;
                view.setTranslationX((shuffleView7.f53100y.get(shuffleView7.f53096u).floatValue() * f3) + ((shuffleView8.mo23918g(shuffleView8.f53096u) + ((this.f63208f.getTouchScaleTranslationX() * ((float) this.f63207e)) / 2.0f)) * floatValue));
                ShuffleView shuffleView9 = this.f63208f;
                View view2 = shuffleView9.f53095t;
                ShuffleView shuffleView10 = this.f63208f;
                view2.setTranslationY((shuffleView9.f53101z.get(shuffleView9.f53096u).floatValue() * f3) + (shuffleView10.mo23921h(shuffleView10.f53096u) * floatValue));
                int i4 = this.f63208f.f53096u;
                while (true) {
                    i4++;
                    ShuffleView shuffleView11 = this.f63208f;
                    if (i4 < shuffleView11.f53097v) {
                        float g = this.f63208f.mo23918g(i4);
                        ShuffleView shuffleView12 = this.f63208f;
                        ((View) ((ArrayList) shuffleView11.f53082d).get(i4)).setTranslationX((this.f63208f.f53100y.get(i4).floatValue() * f3) + ((g + (((float) (shuffleView12.f53097v - i4)) * shuffleView12.getTouchScaleTranslationX())) * floatValue));
                        ((View) ((ArrayList) this.f63208f.f53082d).get(i4)).setTranslationY((this.f63208f.f53101z.get(i4).floatValue() * f3) + (this.f63208f.mo23921h(i4) * floatValue));
                    } else {
                        return;
                    }
                }
            } else {
                int i5 = this.f63208f.f53096u;
                while (true) {
                    ShuffleView shuffleView13 = this.f63208f;
                    if (i5 < shuffleView13.f53097v) {
                        float f4 = 1.0f - floatValue;
                        ((View) ((ArrayList) shuffleView13.f53082d).get(i5)).setTranslationX((this.f63208f.f53100y.get(i5).floatValue() * f4) + (this.f63208f.mo23918g(i5) * floatValue));
                        ((View) ((ArrayList) this.f63208f.f53082d).get(i5)).setTranslationY((this.f63208f.f53101z.get(i5).floatValue() * f4) + (this.f63208f.mo23921h(i5) * floatValue));
                        i5++;
                    } else {
                        return;
                    }
                }
            }
        }
    }
}

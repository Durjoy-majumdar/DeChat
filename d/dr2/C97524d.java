package dr2;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.Rect;
import android.view.animation.LinearInterpolator;
import com.tencent.p014mm.plugin.sns.p104ad.widget.gllib.GLViewContainer;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import cr2.C97358b;
import rq2.C101430p;
import zq2.C103063b;

/* renamed from: dr2.d */
public class C97524d extends C97521a {
    public C97524d(Context context, GLViewContainer gLViewContainer, C97358b.C97359a aVar) {
        super(context, gLViewContainer, aVar);
    }

    /* renamed from: d */
    public Rect mo136630d() {
        boolean z;
        SnsMethodCalculate.markStartTimeMs("genSpritePosition", "com.tencent.mm.plugin.sns.ad.widget.longTouchAd.gl.LeftToRightGLScene");
        Rect rect = new Rect();
        int i = 0;
        do {
            C97358b.C97359a aVar = this.f285836a;
            int a = (int) C101430p.m133117a((float) aVar.f285842b, (float) aVar.f285843c);
            int i2 = a / 2;
            int i3 = this.f285836a.f285843c;
            mo136631e(rect, (int) C101430p.m133117a((float) (-i3), (float) (-i3)), (int) C101430p.m133117a((float) i2, (float) (this.f285836a.f285846f - i2)), a);
            int i4 = 0;
            while (true) {
                if (i4 >= this.f285840e.size()) {
                    z = false;
                    break;
                } else if (Rect.intersects(this.f285840e.get(i4), rect)) {
                    z = true;
                    break;
                } else {
                    i4++;
                }
            }
            if (!z) {
                SnsMethodCalculate.markEndTimeMs("genSpritePosition", "com.tencent.mm.plugin.sns.ad.widget.longTouchAd.gl.LeftToRightGLScene");
                return rect;
            }
            i++;
        } while (i <= 30);
        SnsMethodCalculate.markEndTimeMs("genSpritePosition", "com.tencent.mm.plugin.sns.ad.widget.longTouchAd.gl.LeftToRightGLScene");
        return rect;
    }

    /* renamed from: f */
    public void mo136796f(C103063b bVar, int i, int i2, int i3, int i4) {
        SnsMethodCalculate.markStartTimeMs("startSpriteAnim", "com.tencent.mm.plugin.sns.ad.widget.longTouchAd.gl.LeftToRightGLScene");
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(bVar, "alpha", new float[]{1.0f, 1.0f});
        int a = (int) C101430p.m133117a(0.0f, (float) this.f285836a.f285844d);
        ofFloat.setDuration((long) a);
        int i5 = this.f285836a.f285844d - a;
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(bVar, "translationX", new float[]{0.0f, (float) ((int) (((float) (((int) C101430p.m133117a((float) this.f285837b, (float) this.f285838c)) * i5)) / 1000.0f))});
        ofFloat2.setInterpolator(new LinearInterpolator());
        ofFloat2.setDuration((long) (i5 + 100));
        ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(bVar, "alpha", new float[]{1.0f, 0.0f});
        ofFloat3.setStartDelay((long) (i5 - 300));
        ofFloat3.setDuration((long) 300);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.play(ofFloat2).with(ofFloat3).after(ofFloat);
        animatorSet.start();
        SnsMethodCalculate.markEndTimeMs("startSpriteAnim", "com.tencent.mm.plugin.sns.ad.widget.longTouchAd.gl.LeftToRightGLScene");
    }
}

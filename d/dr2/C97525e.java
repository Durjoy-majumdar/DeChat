package dr2;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.Rect;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.LinearInterpolator;
import com.tencent.p014mm.plugin.sns.p104ad.widget.gllib.GLViewContainer;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import cr2.C97358b;
import rq2.C101430p;
import zq2.C103063b;

/* renamed from: dr2.e */
public class C97525e extends C97521a {
    public C97525e(Context context, GLViewContainer gLViewContainer, C97358b.C97359a aVar) {
        super(context, gLViewContainer, aVar);
    }

    /* renamed from: d */
    public Rect mo136630d() {
        boolean z;
        SnsMethodCalculate.markStartTimeMs("genSpritePosition", "com.tencent.mm.plugin.sns.ad.widget.longTouchAd.gl.RoateGLScene");
        Rect rect = new Rect();
        int i = 0;
        do {
            C97358b.C97359a aVar = this.f285836a;
            int a = (int) C101430p.m133117a((float) aVar.f285842b, (float) aVar.f285843c);
            int i2 = a / 2;
            float f = (float) i2;
            mo136631e(rect, (int) C101430p.m133117a(f, (float) (this.f285836a.f285845e - i2)), (int) C101430p.m133117a(f, (float) (this.f285836a.f285846f - i2)), a);
            int i3 = 0;
            while (true) {
                if (i3 >= this.f285840e.size()) {
                    z = false;
                    break;
                } else if (Rect.intersects(this.f285840e.get(i3), rect)) {
                    z = true;
                    break;
                } else {
                    i3++;
                }
            }
            if (!z) {
                SnsMethodCalculate.markEndTimeMs("genSpritePosition", "com.tencent.mm.plugin.sns.ad.widget.longTouchAd.gl.RoateGLScene");
                return rect;
            }
            i++;
        } while (i <= 30);
        SnsMethodCalculate.markEndTimeMs("genSpritePosition", "com.tencent.mm.plugin.sns.ad.widget.longTouchAd.gl.RoateGLScene");
        return rect;
    }

    /* renamed from: f */
    public void mo136796f(C103063b bVar, int i, int i2, int i3, int i4) {
        C103063b bVar2 = bVar;
        SnsMethodCalculate.markStartTimeMs("startSpriteAnim", "com.tencent.mm.plugin.sns.ad.widget.longTouchAd.gl.RoateGLScene");
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(bVar2, "alpha", new float[]{0.0f, 0.0f});
        int a = (int) C101430p.m133117a(0.0f, 2000.0f);
        ofFloat.setInterpolator(new AccelerateInterpolator());
        ofFloat.setDuration((long) a);
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(bVar2, "rotation", new float[]{0.0f, 360.0f});
        ofFloat2.setInterpolator(new LinearInterpolator());
        ofFloat2.setDuration(3000);
        ofFloat2.start();
        ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(bVar2, "scaleX", new float[]{0.0f, 1.0f});
        ofFloat3.setDuration(500);
        ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(bVar2, "scaleY", new float[]{0.0f, 1.0f});
        ofFloat4.setDuration(500);
        ObjectAnimator ofFloat5 = ObjectAnimator.ofFloat(bVar2, "alpha", new float[]{0.0f, 1.0f});
        ofFloat5.setInterpolator(new LinearInterpolator());
        ofFloat5.setDuration(500);
        ObjectAnimator ofFloat6 = ObjectAnimator.ofFloat(bVar2, "scaleX", new float[]{1.0f, 0.0f});
        ofFloat6.setDuration(500);
        ofFloat6.setStartDelay(2600);
        ObjectAnimator ofFloat7 = ObjectAnimator.ofFloat(bVar2, "scaleY", new float[]{1.0f, 0.0f});
        ofFloat7.setStartDelay(2600);
        ofFloat7.setDuration(500);
        ObjectAnimator ofFloat8 = ObjectAnimator.ofFloat(bVar2, "alpha", new float[]{1.0f, 0.0f});
        ofFloat8.setInterpolator(new LinearInterpolator());
        ofFloat8.setDuration(500);
        int i5 = this.f285836a.f285844d;
        if ((i5 - 3000) - a > 0) {
            ofFloat8.setStartDelay(2500);
        } else {
            int i6 = (i5 - a) - 500;
            if (i6 < 0) {
                i6 = 0;
            }
            ofFloat8.setStartDelay((long) i6);
        }
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.play(ofFloat3).with(ofFloat4).with(ofFloat5).with(ofFloat2).with(ofFloat6).with(ofFloat7).with(ofFloat8).after(ofFloat);
        animatorSet.start();
        SnsMethodCalculate.markEndTimeMs("startSpriteAnim", "com.tencent.mm.plugin.sns.ad.widget.longTouchAd.gl.RoateGLScene");
    }
}

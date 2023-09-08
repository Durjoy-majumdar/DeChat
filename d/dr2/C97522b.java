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

/* renamed from: dr2.b */
public class C97522b extends C97521a {
    public C97522b(Context context, GLViewContainer gLViewContainer, C97358b.C97359a aVar) {
        super(context, gLViewContainer, aVar);
    }

    /* renamed from: d */
    public Rect mo136630d() {
        boolean z;
        SnsMethodCalculate.markStartTimeMs("genSpritePosition", "com.tencent.mm.plugin.sns.ad.widget.longTouchAd.gl.FallDownGLScene");
        Rect rect = new Rect();
        int i = 0;
        do {
            C97358b.C97359a aVar = this.f285836a;
            int a = (int) C101430p.m133117a((float) aVar.f285842b, (float) aVar.f285843c);
            C97358b.C97359a aVar2 = this.f285836a;
            int i2 = a / 2;
            mo136631e(rect, (int) C101430p.m133117a((float) i2, (float) (this.f285836a.f285845e - i2)), (int) C101430p.m133117a((float) (aVar2.f285846f / 2), (float) ((-aVar2.f285843c) * 4)), a);
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
                SnsMethodCalculate.markEndTimeMs("genSpritePosition", "com.tencent.mm.plugin.sns.ad.widget.longTouchAd.gl.FallDownGLScene");
                return rect;
            }
            i++;
        } while (i <= 30);
        SnsMethodCalculate.markEndTimeMs("genSpritePosition", "com.tencent.mm.plugin.sns.ad.widget.longTouchAd.gl.FallDownGLScene");
        return rect;
    }

    /* renamed from: f */
    public void mo136796f(C103063b bVar, int i, int i2, int i3, int i4) {
        C103063b bVar2 = bVar;
        SnsMethodCalculate.markStartTimeMs("startSpriteAnim", "com.tencent.mm.plugin.sns.ad.widget.longTouchAd.gl.FallDownGLScene");
        int a = (int) C101430p.m133117a((float) this.f285837b, (float) this.f285838c);
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(bVar2, "alpha", new float[]{0.0f, 0.0f});
        int a2 = (int) C101430p.m133117a(0.0f, 2000.0f);
        ofFloat.setDuration((long) a2);
        int i5 = this.f285836a.f285844d - a2;
        int i6 = 0;
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(bVar2, "translationY", new float[]{0.0f, (float) ((int) (((float) (a * i5)) / 1000.0f))});
        ofFloat2.setInterpolator(new LinearInterpolator());
        ofFloat2.setDuration((long) (i5 + 100));
        if (i2 < 0) {
            i6 = (Math.abs(i2 + (i4 / 2)) * 1000) / a;
        }
        ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(bVar2, "alpha", new float[]{0.0f, 1.0f});
        ofFloat3.setInterpolator(new AccelerateInterpolator());
        ofFloat3.setDuration(400);
        if (i6 > 0) {
            ofFloat3.setStartDelay((long) i6);
        }
        ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(bVar2, "alpha", new float[]{1.0f, 0.0f});
        ofFloat4.setStartDelay((long) (i5 - 300));
        ofFloat4.setDuration((long) 300);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.play(ofFloat2).with(ofFloat3).with(ofFloat4).after(ofFloat);
        animatorSet.start();
        SnsMethodCalculate.markEndTimeMs("startSpriteAnim", "com.tencent.mm.plugin.sns.ad.widget.longTouchAd.gl.FallDownGLScene");
    }
}

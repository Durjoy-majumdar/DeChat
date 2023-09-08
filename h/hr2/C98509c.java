package hr2;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import com.tencent.p014mm.plugin.sns.p104ad.widget.twistad.GLTwistRoateCardsView;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import zq2.C103063b;

/* renamed from: hr2.c */
public class C98509c implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ GLTwistRoateCardsView f288909d;

    public C98509c(GLTwistRoateCardsView gLTwistRoateCardsView) {
        this.f288909d = gLTwistRoateCardsView;
    }

    public void run() {
        SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.ad.widget.twistad.GLTwistRoateCardsView$1");
        GLTwistRoateCardsView gLTwistRoateCardsView = this.f288909d;
        int i = GLTwistRoateCardsView.f274526L;
        SnsMethodCalculate.markStartTimeMs("access$000", "com.tencent.mm.plugin.sns.ad.widget.twistad.GLTwistRoateCardsView");
        gLTwistRoateCardsView.getClass();
        SnsMethodCalculate.markStartTimeMs("doAnim", "com.tencent.mm.plugin.sns.ad.widget.twistad.GLTwistRoateCardsView");
        float f = gLTwistRoateCardsView.f274529C ? -180.0f : 180.0f;
        char c = 0;
        int i2 = 0;
        while (i2 < 12) {
            C103063b bVar = (C103063b) gLTwistRoateCardsView.mo130530e(i2);
            SnsMethodCalculate.markStartTimeMs("getInitCardAnim", "com.tencent.mm.plugin.sns.ad.widget.twistad.GLTwistRoateCardsView");
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(bVar, "alpha", new float[]{0.0f, 1.0f});
            String str = "getInitCardAnim";
            ofFloat.setDuration(500);
            float[] fArr = new float[2];
            fArr[c] = f;
            fArr[1] = 0.0f;
            ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(bVar, "rotation", fArr);
            int i3 = i2;
            long j = (long) 1500;
            ofFloat2.setDuration(j);
            ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(bVar, "scaleX", new float[]{0.3f, 1.0f});
            ofFloat3.setDuration(j);
            ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(bVar, "scaleY", new float[]{0.3f, 1.0f});
            ofFloat4.setDuration(j);
            AnimatorSet animatorSet = new AnimatorSet();
            animatorSet.playTogether(new Animator[]{ofFloat, ofFloat3, ofFloat4, ofFloat2});
            if (i3 == 0) {
                ofFloat2.addListener(new C98511e(gLTwistRoateCardsView));
                ofFloat2.addUpdateListener(new C98512f(gLTwistRoateCardsView));
            }
            SnsMethodCalculate.markEndTimeMs(str, "com.tencent.mm.plugin.sns.ad.widget.twistad.GLTwistRoateCardsView");
            animatorSet.start();
            i2 = i3 + 1;
            c = 0;
        }
        ValueAnimator ofFloat5 = ValueAnimator.ofFloat(new float[]{0.3f, 1.0f});
        ofFloat5.setDuration(1500);
        ofFloat5.addUpdateListener(new C98510d(gLTwistRoateCardsView));
        ofFloat5.start();
        SnsMethodCalculate.markEndTimeMs("doAnim", "com.tencent.mm.plugin.sns.ad.widget.twistad.GLTwistRoateCardsView");
        SnsMethodCalculate.markEndTimeMs("access$000", "com.tencent.mm.plugin.sns.ad.widget.twistad.GLTwistRoateCardsView");
        SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.ad.widget.twistad.GLTwistRoateCardsView$1");
    }
}

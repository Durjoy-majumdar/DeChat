package lo2;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.view.View;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;

/* renamed from: lo2.n0 */
public class C99557n0 {

    /* renamed from: a */
    public View f291833a;

    /* renamed from: b */
    public Object f291834b;

    /* renamed from: c */
    public AnimatorSet f291835c;

    /* renamed from: d */
    public AnimatorSet f291836d;

    /* renamed from: e */
    public boolean f291837e;

    /* renamed from: f */
    public boolean f291838f = false;

    /* renamed from: g */
    public Context f291839g;

    /* renamed from: h */
    public boolean f291840h;

    /* renamed from: i */
    public int f291841i;

    public C99557n0(View view, Object obj, Context context, boolean z, int i, int i2) {
        Object obj2;
        ObjectAnimator objectAnimator;
        this.f291833a = view;
        this.f291834b = obj;
        this.f291839g = context;
        this.f291840h = z;
        this.f291841i = i2;
        SnsMethodCalculate.markStartTimeMs("initAnimators", "com.tencent.mm.plugin.sns.ad.helper.FlipCardAnimHelper");
        SnsMethodCalculate.markStartTimeMs("getRoateInAnim", "com.tencent.mm.plugin.sns.ad.helper.FlipCardAnimHelper");
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat((Object) null, "alpha", new float[]{1.0f, 0.0f});
        ofFloat.setDuration(0);
        ObjectAnimator ofFloat2 = this.f291840h ? ObjectAnimator.ofFloat((Object) null, "rotationY", new float[]{-180.0f, 10.0f}) : ObjectAnimator.ofFloat((Object) null, "rotationY", new float[]{180.0f, -10.0f});
        long j = (long) 500;
        ofFloat2.setDuration(j);
        ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat((Object) null, "alpha", new float[]{0.0f, 1.0f});
        ofFloat3.setDuration(0);
        long j2 = (long) 250;
        ofFloat3.setStartDelay(j2);
        ObjectAnimator ofFloat4 = this.f291840h ? ObjectAnimator.ofFloat((Object) null, "rotationY", new float[]{10.0f, 0.0f}) : ObjectAnimator.ofFloat((Object) null, "rotationY", new float[]{-10.0f, 0.0f});
        ofFloat4.setDuration(j);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.play(ofFloat).with(ofFloat2).with(ofFloat3);
        animatorSet.play(ofFloat4).after(ofFloat2);
        SnsMethodCalculate.markEndTimeMs("getRoateInAnim", "com.tencent.mm.plugin.sns.ad.helper.FlipCardAnimHelper");
        this.f291835c = animatorSet;
        SnsMethodCalculate.markStartTimeMs("getRoateOutAnim", "com.tencent.mm.plugin.sns.ad.helper.FlipCardAnimHelper");
        if (this.f291840h) {
            obj2 = null;
            objectAnimator = ObjectAnimator.ofFloat((Object) null, "rotationY", new float[]{0.0f, 190.0f});
        } else {
            obj2 = null;
            objectAnimator = ObjectAnimator.ofFloat((Object) null, "rotationY", new float[]{0.0f, -190.0f});
        }
        objectAnimator.setDuration(j);
        ObjectAnimator ofFloat5 = ObjectAnimator.ofFloat(obj2, "alpha", new float[]{1.0f, 0.0f});
        ofFloat5.setDuration(0);
        ofFloat5.setStartDelay(j2);
        AnimatorSet animatorSet2 = new AnimatorSet();
        animatorSet2.play(objectAnimator).with(ofFloat5);
        SnsMethodCalculate.markEndTimeMs("getRoateOutAnim", "com.tencent.mm.plugin.sns.ad.helper.FlipCardAnimHelper");
        this.f291836d = animatorSet2;
        this.f291835c.addListener(new C99553l0(this));
        this.f291836d.addListener(new C99555m0(this));
        SnsMethodCalculate.markEndTimeMs("initAnimators", "com.tencent.mm.plugin.sns.ad.helper.FlipCardAnimHelper");
        SnsMethodCalculate.markStartTimeMs("setCameraDistance", "com.tencent.mm.plugin.sns.ad.helper.FlipCardAnimHelper");
        float f = this.f291833a.getContext().getResources().getDisplayMetrics().density * ((float) this.f291841i);
        this.f291833a.setCameraDistance(f);
        Object obj3 = this.f291834b;
        if (obj3 instanceof View) {
            ((View) obj3).setCameraDistance(f);
        }
        SnsMethodCalculate.markEndTimeMs("setCameraDistance", "com.tencent.mm.plugin.sns.ad.helper.FlipCardAnimHelper");
    }

    /* renamed from: a */
    public void mo138936a() {
        SnsMethodCalculate.markStartTimeMs("startFlip", "com.tencent.mm.plugin.sns.ad.helper.FlipCardAnimHelper");
        if (!this.f291838f) {
            SnsMethodCalculate.markStartTimeMs("flipCard", "com.tencent.mm.plugin.sns.ad.helper.FlipCardAnimHelper");
            if (!this.f291837e) {
                this.f291835c.setTarget(this.f291833a);
                this.f291836d.setTarget(this.f291834b);
                this.f291835c.start();
                this.f291836d.start();
                this.f291837e = true;
            } else {
                this.f291835c.setTarget(this.f291834b);
                this.f291836d.setTarget(this.f291833a);
                this.f291835c.start();
                this.f291836d.start();
                this.f291837e = false;
            }
            SnsMethodCalculate.markEndTimeMs("flipCard", "com.tencent.mm.plugin.sns.ad.helper.FlipCardAnimHelper");
        }
        SnsMethodCalculate.markEndTimeMs("startFlip", "com.tencent.mm.plugin.sns.ad.helper.FlipCardAnimHelper");
    }
}

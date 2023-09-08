package ju2;

import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.ScaleAnimation;
import android.view.animation.TranslateAnimation;
import android.widget.LinearLayout;
import android.widget.PopupWindow;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.widget.imageview.WeImageView;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C87412m;
import o40.C61926c;

/* renamed from: ju2.e */
public final class C99045e {

    /* renamed from: a */
    public static final C99045e f290344a = new C99045e();

    /* renamed from: b */
    public static TranslateAnimation f290345b;

    /* renamed from: c */
    public static TranslateAnimation f290346c;

    /* renamed from: d */
    public static PopupWindow f290347d;

    /* renamed from: e */
    public static int f290348e;

    /* renamed from: f */
    public static int f290349f;

    /* renamed from: ju2.e$a */
    public static final class C99046a implements Animation.AnimationListener {

        /* renamed from: a */
        public final /* synthetic */ WeImageView f290350a;

        /* renamed from: b */
        public final /* synthetic */ ScaleAnimation f290351b;

        public C99046a(WeImageView weImageView, ScaleAnimation scaleAnimation) {
            this.f290350a = weImageView;
            this.f290351b = scaleAnimation;
        }

        public void onAnimationEnd(Animation animation) {
            SnsMethodCalculate.markStartTimeMs("onAnimationEnd", "com.tencent.mm.plugin.sns.ui.improve.util.ImproveInteractionUtil$doWhileSendLiked$1");
            C87412m.m108594g(animation, "animation");
            this.f290350a.startAnimation(this.f290351b);
            SnsMethodCalculate.markEndTimeMs("onAnimationEnd", "com.tencent.mm.plugin.sns.ui.improve.util.ImproveInteractionUtil$doWhileSendLiked$1");
        }

        public void onAnimationRepeat(Animation animation) {
            SnsMethodCalculate.markStartTimeMs("onAnimationRepeat", "com.tencent.mm.plugin.sns.ui.improve.util.ImproveInteractionUtil$doWhileSendLiked$1");
            C87412m.m108594g(animation, "animation");
            SnsMethodCalculate.markEndTimeMs("onAnimationRepeat", "com.tencent.mm.plugin.sns.ui.improve.util.ImproveInteractionUtil$doWhileSendLiked$1");
        }

        public void onAnimationStart(Animation animation) {
            SnsMethodCalculate.markStartTimeMs("onAnimationStart", "com.tencent.mm.plugin.sns.ui.improve.util.ImproveInteractionUtil$doWhileSendLiked$1");
            C87412m.m108594g(animation, "animation");
            SnsMethodCalculate.markEndTimeMs("onAnimationStart", "com.tencent.mm.plugin.sns.ui.improve.util.ImproveInteractionUtil$doWhileSendLiked$1");
        }
    }

    /* renamed from: ju2.e$b */
    public static final class C99047b implements Animation.AnimationListener {

        /* renamed from: a */
        public final /* synthetic */ LinearLayout f290352a;

        public C99047b(LinearLayout linearLayout) {
            this.f290352a = linearLayout;
        }

        public void onAnimationEnd(Animation animation) {
            SnsMethodCalculate.markStartTimeMs("onAnimationEnd", "com.tencent.mm.plugin.sns.ui.improve.util.ImproveInteractionUtil$doWhileSendLiked$2");
            C87412m.m108594g(animation, "animation");
            this.f290352a.setPressed(false);
            SnsMethodCalculate.markStartTimeMs("dismissCommentWindow", "com.tencent.mm.plugin.sns.ui.improve.util.ImproveInteractionUtil");
            C61926c.m72668M(new C99044d(true));
            SnsMethodCalculate.markEndTimeMs("dismissCommentWindow", "com.tencent.mm.plugin.sns.ui.improve.util.ImproveInteractionUtil");
            SnsMethodCalculate.markEndTimeMs("onAnimationEnd", "com.tencent.mm.plugin.sns.ui.improve.util.ImproveInteractionUtil$doWhileSendLiked$2");
        }

        public void onAnimationRepeat(Animation animation) {
            SnsMethodCalculate.markStartTimeMs("onAnimationRepeat", "com.tencent.mm.plugin.sns.ui.improve.util.ImproveInteractionUtil$doWhileSendLiked$2");
            C87412m.m108594g(animation, "animation");
            SnsMethodCalculate.markEndTimeMs("onAnimationRepeat", "com.tencent.mm.plugin.sns.ui.improve.util.ImproveInteractionUtil$doWhileSendLiked$2");
        }

        public void onAnimationStart(Animation animation) {
            SnsMethodCalculate.markStartTimeMs("onAnimationStart", "com.tencent.mm.plugin.sns.ui.improve.util.ImproveInteractionUtil$doWhileSendLiked$2");
            C87412m.m108594g(animation, "animation");
            SnsMethodCalculate.markEndTimeMs("onAnimationStart", "com.tencent.mm.plugin.sns.ui.improve.util.ImproveInteractionUtil$doWhileSendLiked$2");
        }
    }

    /* renamed from: a */
    public final void mo138387a(LinearLayout linearLayout) {
        LinearLayout linearLayout2 = linearLayout;
        SnsMethodCalculate.markStartTimeMs("doWhileSendLiked", "com.tencent.mm.plugin.sns.ui.improve.util.ImproveInteractionUtil");
        View findViewById = linearLayout2.findViewById(C0966R.C0970id.f5730n2);
        C87412m.m108592e(findViewById, "null cannot be cast to non-null type com.tencent.mm.ui.widget.imageview.WeImageView");
        WeImageView weImageView = (WeImageView) findViewById;
        ScaleAnimation scaleAnimation = new ScaleAnimation(1.0f, 1.5f, 1.0f, 1.5f, 1, 0.5f, 1, 0.5f);
        ScaleAnimation scaleAnimation2 = new ScaleAnimation(1.5f, 1.0f, 1.5f, 1.0f, 1, 0.5f, 1, 0.5f);
        scaleAnimation.setDuration(100);
        scaleAnimation.setRepeatCount(0);
        scaleAnimation.setFillAfter(true);
        scaleAnimation2.setDuration(100);
        scaleAnimation2.setRepeatCount(0);
        scaleAnimation2.setFillAfter(true);
        weImageView.clearAnimation();
        weImageView.startAnimation(scaleAnimation);
        scaleAnimation.setAnimationListener(new C99046a(weImageView, scaleAnimation2));
        scaleAnimation2.setAnimationListener(new C99047b(linearLayout2));
        SnsMethodCalculate.markEndTimeMs("doWhileSendLiked", "com.tencent.mm.plugin.sns.ui.improve.util.ImproveInteractionUtil");
    }

    /* renamed from: b */
    public final void mo138388b(View view, int i, int i2) {
        SnsMethodCalculate.markStartTimeMs("updateViewWH", "com.tencent.mm.plugin.sns.ui.improve.util.ImproveInteractionUtil");
        if (view != null) {
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            layoutParams.width = i;
            layoutParams.height = i2;
            view.setLayoutParams(layoutParams);
            Log.m105918d("MicroMsg.ImproveInteractionUtil", "updateViewWH: view:" + view + ", w:" + i + ", h:" + i2);
        }
        SnsMethodCalculate.markEndTimeMs("updateViewWH", "com.tencent.mm.plugin.sns.ui.improve.util.ImproveInteractionUtil");
    }
}

package nw2;

import android.animation.ValueAnimator;
import android.view.ViewGroup;
import com.tencent.p014mm.plugin.story.p108ui.view.CommentItemView;
import gy3.C87412m;

/* renamed from: nw2.b */
public final class C76966b implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: d */
    public final /* synthetic */ CommentItemView f224894d;

    public C76966b(CommentItemView commentItemView) {
        this.f224894d = commentItemView;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        Object animatedValue = valueAnimator.getAnimatedValue();
        C87412m.m108592e(animatedValue, "null cannot be cast to non-null type kotlin.Float");
        float floatValue = ((Float) animatedValue).floatValue();
        ViewGroup.LayoutParams layoutParams = this.f224894d.getLayoutParams();
        CommentItemView commentItemView = this.f224894d;
        int i = commentItemView.f206294n;
        layoutParams.width = ((int) (((float) (commentItemView.f206296p - i)) * floatValue)) + i;
        layoutParams.height = i + ((int) (((float) (commentItemView.f206295o - i)) * floatValue));
        commentItemView.setLayoutParams(layoutParams);
    }
}
